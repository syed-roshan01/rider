-- 0002_admin.sql -- support for the Vercel admin dashboard.
--
-- Adds the race-safe mint used by POST /api/admin/licenses and the uniqueness
-- guarantee for licenses.key_hash. Nothing here touches the device-facing
-- logic (0001_schema.sql / activate_license), and 0001 is left untouched.
--
-- key_hash format is CONTRACTUAL: it is the hex sha256 of the NORMALIZED key
-- body (the exact string normalizeKey() returns in
-- supabase/functions/_shared/license.ts), because that is what hashKey() gives
-- the Edge Function when it looks a licence up. digest(p_key,'sha256') is
-- therefore hex-encoded here to match the text column the rest of the system
-- reads (see tools/make-license.mjs and supabase/functions/_shared/db.ts).

create schema if not exists extensions;
create extension if not exists pgcrypto with schema extensions;

-- Enforce uniqueness of the lookup id; harmless if 0001 already constrains it.
create unique index if not exists licenses_key_hash_uniq
    on public.licenses (key_hash);

-- Race-safe mint. Called ONLY by the Vercel API (service role) via rpc:
-- the unique index above is the single authority that rejects a duplicate
-- under concurrency (the caller retries with a fresh key on 23505).
create or replace function public.create_license(
    p_key text,                        -- normalizeKey(key) output: preimage of key_hash
    p_key_sealed text,                 -- sealKey(MASTER_SEAL_KEY, key) from the API layer
    p_key_prefix text,
    p_plan_type text,
    p_duration_days integer,
    p_max_devices integer,
    p_bound_device_code_hashes text[], -- hashed device codes the key is bound to at mint
    p_note text,
    p_created_by text
) returns jsonb
language plpgsql
security definer
set search_path = public, extensions
as $$
declare
    v_key_hash text;
    v_row public.licenses%rowtype;
begin
    if p_key is null or length(p_key) = 0 then
        raise exception 'key required';
    end if;
    if p_plan_type not in ('DAY', 'WEEK', 'HALF_MONTH', 'MONTH', 'YEAR') then
        raise exception 'bad plan type';
    end if;

    v_key_hash := encode(digest(p_key, 'sha256'), 'hex');

    insert into public.licenses
        (key_hash, key_sealed, key_prefix, plan_type, duration_days, status,
         max_devices, bound_device_code_hashes, note, created_by)
    values
        (v_key_hash, p_key_sealed, p_key_prefix, p_plan_type,
         coalesce(p_duration_days, 30), 'unused',
         coalesce(p_max_devices, 1),
         coalesce(p_bound_device_code_hashes, array[]::text[]),
         coalesce(p_note, ''),
         coalesce(p_created_by, 'admin'))
    returning * into v_row;

    return to_jsonb(v_row);
end;
$$;

-- The browser must never reach this function: service role only.
revoke execute on function public.create_license(text, text, text, text, integer, integer, text[], text, text)
    from public, anon, authenticated;
grant execute on function public.create_license(text, text, text, text, integer, integer, text[], text, text)
    to service_role;
