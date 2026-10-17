# Ride Accepter - licence admin dashboard (Vercel)

Vercel-hosted port of `license/admin/` + the admin half of `license/src/server.ts`,
backed by the existing Supabase database. The device-facing API stays in the
Supabase Edge Function (`supabase/functions/api`); this deployment serves only
the admin dashboard and `/api/admin/*`.

## Layout

- `public/` - the dashboard UI (byte-identical copy of `license/admin/`).
- `api/admin/*` - the admin REST API (Vercel Node functions, `@vercel/node` types).
- `api/_lib/server.ts` - session auth, Supabase REST client, shared helpers.
- `supabase/migrations/0002_admin.sql` - `create_license(...)` (race-safe mint).

## Environment variables

Set these in Vercel Project Settings -> Environment Variables (see
`.env.example`). Never use a `NEXT_PUBLIC_*` name for any of them.

| Name | Purpose |
| --- | --- |
| `ADMIN_PASSWORD` | Admin dashboard login password. |
| `ADMIN_SESSION_SECRET` | Random 32+ bytes; HMAC key for the `ra_admin` session token. |
| `MASTER_SEAL_KEY` | base64 32-byte AES-256-GCM key; seals keys for later re-reveal. |
| `SUPABASE_URL` | Supabase project URL. |
| `SUPABASE_SERVICE_ROLE_KEY` | Supabase service role key (read only inside `api/`). |

`LICENSE_SIGNING_PRIVATE` is NOT an env var here and must NOT be set in Vercel.
It belongs solely to the Supabase Edge Function secrets. The admin surface never
signs tokens; creating a licence only needs `MASTER_SEAL_KEY` (to seal the key).

## Deploy

1. Apply `supabase/migrations/0002_admin.sql` to the database (SQL editor or
   `supabase db push`) alongside your existing `0001_schema.sql`. It adds the
   `create_license(...)` function and a unique `licenses(key_hash)` index; it
   does not modify `0001_schema.sql`.
2. Set the five env vars above for Production (and Preview if you use it).
3. Deploy this repo root (`vercel` or Git integration). `public/` is served at
   `/`; `api/` becomes `/api/admin/*`.
4. Optional: `npm i -D @vercel/node` for editor/tsc types. The handlers import
   `@vercel/node` types only (type-only, erased at build) and the licence crypto
   is imported from `supabase/functions/_shared/license.ts` - there are no
   runtime npm dependencies.

## Security notes

- `SUPABASE_SERVICE_ROLE_KEY` and `MASTER_SEAL_KEY` exist only in Vercel env
  vars and are read only inside `api/`. They never appear in a response, a log
  line, or anything under `public/`.
- Session cookie `ra_admin` is `HttpOnly; Path=/; SameSite=Strict; Max-Age=12h`.
  Its token is an HMAC over the expiry keyed by `ADMIN_SESSION_SECRET`, so it
  cannot be forged; every admin route verifies it (401 otherwise). Sign-out
  clears the cookie; a stolen token simply ages out at its 12h expiry.
- `/api/admin/login` is rate limited per client IP (first hop of
  `x-forwarded-for`, else `x-real-ip`): 5 attempts per 15 minutes, then 429
  with `Retry-After`. The limiter is a module-level `Map`, so it resets whenever
  a serverless instance recycles - a distributed limiter (e.g. Upstash
  Ratelimit) is the production-grade follow-up for multi-instance traffic.
- `POST /api/admin/licenses` seals every key with
  `sealKey(Buffer.from(MASTER_SEAL_KEY, 'base64'), key)` into
  `licenses.key_sealed` and mints through the `create_license(...)` security
  definer SQL function (pgcrypto `digest(key,'sha256')` + unique `key_hash`),
  so concurrent creates cannot collide. Bound device codes are honoured at mint.
- `POST /api/admin/licenses/{k}/reveal` works because of that sealing. Keys
  minted by the standalone `tools/make-license.mjs` carry an empty
  `key_sealed`, so Reveal cannot work for those rows (it returns "key is not
  sealed"); create keys in the dashboard when you need re-reveal.
- Errors are generic (`internal error`) and logs carry error names only - no
  key material, secrets, or request payloads.
