-- 0003_admin_suite.sql -- additive storage for the AcceptPro admin suite
-- (zyqora-admin port, Vercel `api/` backend).
--
-- ADDITIVE ONLY: nothing in 0001/0002 is touched. The device-facing engine
-- tables (licenses / devices / audit_log / app_config) stay exactly as they
-- are; this migration only adds the panel's own tables. Licence crypto still
-- lives in supabase/functions/_shared/license.ts -- `create_license` (0002)
-- remains the single mint authority and licence_meta rows are keyed by the
-- SAME key_hash (hex sha256 of the normalized key body).
--
-- CONVENTIONS (mirror the wire contract of license/src/store.ts / ADMIN-PORT):
--   * SQL columns are snake_case; the API wire records are camelCase. Both
--     spellings are documented per column.
--   * ALL panel timestamps are BIGINT unix SECONDS (createdAt, issuedAt,
--     expiryTs, paidAt, ...). The engine tables keep their existing ms fields;
--     api/_lib converts at the boundary.
--   * Money columns are double precision so they round-trip exactly like the
--     JS numbers the money math (spec §4) works on.
--   * RLS: every table is enabled + service-role-only (the house pattern:
--     one permissive policy for service_role, all privileges revoked from
--     public/anon/authenticated). The browser can never reach these tables.
--
-- ===========================================================================
-- admin_users -- panel staff accounts (wire record: AdminUserRecord)
-- ===========================================================================
-- wire: id, username, passwordHash (never serialized), role ('super'|'admin'),
--       createdBy, createdByName, createdAt, active, sharePercent (absent when
--       null). Usernames must be unique across admin_users + affiliates +
--       whitelabels (one shared login endpoint); the cross-table uniqueness is
--       enforced in api/ exactly like the JSON store does -- the per-table
--       unique indexes below are the backstop.
create table public.admin_users (
    id               text primary key,             -- wire: id (uuid string)
    username         text not null,                -- wire: username (stored lowercase)
    password_hash    text not null,                -- wire: passwordHash -- scrypt$<salthex>$<hashhex>, never leaves the server
    role             text not null                 -- wire: role
                     check (role in ('super', 'admin')),
    created_by       text,                         -- wire: createdBy (null for the lazy-seeded super admin)
    created_by_name  text,                         -- wire: createdByName
    created_at       bigint not null,              -- wire: createdAt (unix seconds)
    active           boolean not null default true,-- wire: active
    share_percent    double precision              -- wire: sharePercent (JSON-omitted while null)
);

create unique index admin_users_username_uniq on public.admin_users (lower(username));
create index admin_users_created_at_idx on public.admin_users (created_at desc);

-- ===========================================================================
-- whitelabels -- reseller accounts (wire record: WhitelabelRecord)
-- ===========================================================================
-- wire: id, username, passwordHash (never serialized), name, phone, email,
--       businessName, businessCategory, website, notes, allowedModes[],
--       allowedPlans[], maxDevices, licenseLimit, partnershipStartTs,
--       partnershipMonths, partnershipEndTs, active, createdBy, createdByName,
--       createdAt, updatedBy/updatedByName/updatedAt (JSON-omitted while null).
create table public.whitelabels (
    id                   text primary key,          -- wire: id
    username             text not null,             -- wire: username (stored lowercase)
    name                 text not null default '',  -- wire: name (display name)
    password_hash        text not null,             -- wire: passwordHash -- never serialized
    phone                text not null default '',  -- wire: phone
    email                text not null default '',  -- wire: email
    business_name        text not null default '',  -- wire: businessName
    business_category    text not null default '',  -- wire: businessCategory
    website              text not null default '',  -- wire: website
    notes                text not null default '',  -- wire: notes
    allowed_modes        text[] not null default '{}', -- wire: allowedModes (subset of desktop|cloud|app)
    allowed_plans        text[] not null default '{}', -- wire: allowedPlans (subset of WL_PLANS)
    max_devices          integer not null default 255, -- wire: maxDevices (per-key device cap, 1..255)
    license_limit        integer not null default 0,   -- wire: licenseLimit (issue quota)
    partnership_start_ts bigint,                    -- wire: partnershipStartTs (unix s, null = no term)
    partnership_months   integer,                   -- wire: partnershipMonths (null = no term)
    partnership_end_ts   bigint,                    -- wire: partnershipEndTs (unix s, null = no term)
    active               boolean not null default true, -- wire: active
    created_by           text,                      -- wire: createdBy
    created_by_name      text,                      -- wire: createdByName
    created_at           bigint not null,           -- wire: createdAt (unix s)
    updated_at           bigint,                    -- wire: updatedAt (JSON-omitted while null)
    updated_by           text,                      -- wire: updatedBy (JSON-omitted while null)
    updated_by_name      text                       -- wire: updatedByName (JSON-omitted while null)
);

create unique index whitelabels_username_uniq on public.whitelabels (lower(username));
create index whitelabels_created_at_idx on public.whitelabels (created_at desc);

-- ===========================================================================
-- affiliates -- referral partners (wire record: AffiliateRecord)
-- ===========================================================================
-- wire: id, username, passwordHash (never serialized), name, commission (%),
--       active, createdBy, createdByName, createdAt.
create table public.affiliates (
    id               text primary key,              -- wire: id
    username         text not null,                 -- wire: username (stored lowercase)
    name             text not null default '',      -- wire: name (display name)
    password_hash    text not null,                 -- wire: passwordHash -- never serialized
    commission       double precision not null default 0, -- wire: commission (0..100 percent)
    active           boolean not null default true, -- wire: active
    created_by       text,                          -- wire: createdBy
    created_by_name  text,                          -- wire: createdByName
    created_at       bigint not null                -- wire: createdAt (unix s)
);

create unique index affiliates_username_uniq on public.affiliates (lower(username));
create index affiliates_created_at_idx on public.affiliates (created_at desc);

-- ===========================================================================
-- affiliate_payments -- payouts to affiliates (wire record: PaymentRecord)
-- ===========================================================================
-- wire: id ('pay_<ms>_<rand>'), affiliateId, affiliateName, amount, note (<=200),
--       paidBy, paidByName, paidAt, updatedBy/updatedByName/updatedAt
--       (JSON-omitted while null).
create table public.affiliate_payments (
    id               text primary key,              -- wire: id (pay_...)
    affiliate_id     text not null,                 -- wire: affiliateId
    affiliate_name   text not null default '',      -- wire: affiliateName
    amount           double precision not null,     -- wire: amount
    note             text not null default '',      -- wire: note (max 200 chars)
    paid_by          text not null,                 -- wire: paidBy
    paid_by_name     text not null default '',      -- wire: paidByName
    paid_at          bigint not null,               -- wire: paidAt (unix s)
    updated_at       bigint,                        -- wire: updatedAt (JSON-omitted while null)
    updated_by       text,                          -- wire: updatedBy (JSON-omitted while null)
    updated_by_name  text                           -- wire: updatedByName (JSON-omitted while null)
);

create index affiliate_payments_affiliate_idx on public.affiliate_payments (affiliate_id, paid_at desc);
create index affiliate_payments_paid_at_idx on public.affiliate_payments (paid_at desc);

-- ===========================================================================
-- expenses -- internal bookkeeping (wire record: ExpenseRecord)
-- ===========================================================================
-- wire: id, title, amount, category, location, notes, spentBy, spentByName,
--       spentAt, createdAt, editedAt/editedBy/editedByName (null until first
--       edit), originalValues {title,amount,category,location,notes,spentAt}
--       (null until first edit).
create table public.expenses (
    id               text primary key,              -- wire: id (uuid string)
    title            text not null,                 -- wire: title
    amount           double precision not null,     -- wire: amount
    category         text not null default '',      -- wire: category
    location         text not null default '',      -- wire: location
    notes            text not null default '',      -- wire: notes
    spent_by         text not null,                 -- wire: spentBy
    spent_by_name    text not null default '',      -- wire: spentByName
    spent_at         bigint not null,               -- wire: spentAt (unix s)
    created_at       bigint not null,               -- wire: createdAt (unix s)
    edited_at        bigint,                        -- wire: editedAt (unix s, null until edited)
    edited_by        text,                          -- wire: editedBy
    edited_by_name   text,                          -- wire: editedByName
    original_values  jsonb                          -- wire: originalValues {title,amount,category,location,notes,spentAt}
);

create index expenses_spent_by_idx on public.expenses (spent_by, spent_at desc);
create index expenses_spent_at_idx on public.expenses (spent_at desc);

-- ===========================================================================
-- withdrawals -- owner draws (wire record: WithdrawalRecord)
-- ===========================================================================
-- wire: id ('wd_<ms>_<rand>'), adminId, adminUsername, amount, note (<=300),
--       withdrawnAt, recordedBy, recordedByName, createdAt,
--       updatedBy/updatedByName/updatedAt (JSON-omitted while null).
create table public.withdrawals (
    id                text primary key,             -- wire: id (wd_...)
    admin_id          text not null,                -- wire: adminId
    admin_username    text not null default '',     -- wire: adminUsername
    amount            double precision not null,    -- wire: amount
    note              text not null default '',     -- wire: note (max 300 chars)
    withdrawn_at      bigint not null,              -- wire: withdrawnAt (unix s)
    recorded_by       text not null,                -- wire: recordedBy
    recorded_by_name  text not null default '',     -- wire: recordedByName
    created_at        bigint not null,              -- wire: createdAt (unix s)
    updated_at        bigint,                       -- wire: updatedAt (JSON-omitted while null)
    updated_by        text,                         -- wire: updatedBy (JSON-omitted while null)
    updated_by_name   text                          -- wire: updatedByName (JSON-omitted while null)
);

create index withdrawals_admin_idx on public.withdrawals (admin_id, withdrawn_at desc);
create index withdrawals_withdrawn_at_idx on public.withdrawals (withdrawn_at desc);

-- ===========================================================================
-- license_meta -- commercial record of every panel-issued licence
-- (wire record: PanelLicense = the zyqora licence shape + AcceptPro binding)
-- ===========================================================================
-- One row per licence, keyed by key_hash -- the SAME lookup id the engine's
-- `licenses` table uses (hex sha256 of normalizeKey(key), see 0002_admin.sql).
-- The plaintext RA- key is NEVER stored here: it is unsealed on demand from
-- licenses.key_sealed (unsealKey) exactly like /api/admin/licenses/{key}/reveal.
--
-- wire: key (plaintext, unsealed on demand), plan, planTier, deviceLimit,
--       expiryTs, isLifetime, price, discountedPrice, discountAmount,
--       licenseMode, machineId, clientName, clientPhone, clientEmail,
--       businessCategory, website, notes, features{}, affiliateId, affiliateName,
--       affiliateCommissionAmount, reviewAccess, validationException,
--       exceptionBoundMachineId, whitelabelIssued, whitelabelName, issuedBy,
--       issuedByName, issuedAt, activated, activatedAt, revoked, revokedBy,
--       revokedByName, revokedAt, revokedReason, convertedFromKey, source,
--       orderId, cfOrderId.
-- Nullable "absent-in-JSON" columns (plan_tier, review_access,
-- validation_exception, exception_bound_machine_id, whitelabel_issued,
-- converted_from_key, source, order_id, cf_order_id) mirror zyqora records
-- that simply lack the key: the mapper omits them while NULL.
create table public.license_meta (
    key_hash                    text primary key,       -- wire: (lookup id; sha256 of the key body -- not serialized)
    key_prefix                  text not null default '',-- wire: key display prefix (RA-XXXXX), safe to log/show
    plan                        text not null default '',-- wire: plan (trial1day|trial|weekly|monthly|3months|6months|yearly|lifetime|custom|<catalog id>)
    plan_tier                   text,                   -- wire: planTier (checkout tier id starter|pro|business; absent when null)
    device_limit                integer not null default 1, -- wire: deviceLimit (zyqora 1..255 surface value)
    expiry_ts                   bigint not null default 0,  -- wire: expiryTs (unix s; issuedAt + durationDays*86400; lifetime = 253402300799)
    is_lifetime                 boolean not null default false, -- wire: isLifetime
    price                       double precision not null default 0, -- wire: price
    discounted_price            double precision,       -- wire: discountedPrice
    discount_amount             double precision not null default 0, -- wire: discountAmount
    license_mode                text not null default 'desktop',    -- wire: licenseMode (desktop|cloud|app)
    machine_id                  text,                   -- wire: machineId (device code display form; null for cloud)
    client_name                 text not null default '',-- wire: clientName
    client_phone                text not null default '',-- wire: clientPhone
    client_email                text not null default '',-- wire: clientEmail
    business_category           text not null default '',-- wire: businessCategory
    website                     text not null default 'No website', -- wire: website
    notes                       text not null default '',-- wire: notes
    features                    jsonb not null default '{}'::jsonb, -- wire: features {}
    affiliate_id                text,                   -- wire: affiliateId
    affiliate_name              text,                   -- wire: affiliateName
    affiliate_commission_amount double precision,       -- wire: affiliateCommissionAmount
    review_access               boolean,                -- wire: reviewAccess (absent when null -- convert() omits it exactly like the JSON store)
    validation_exception        boolean,                -- wire: validationException (absent until a super admin sets it)
    exception_bound_machine_id  text,                   -- wire: exceptionBoundMachineId (absent until an exception re-bind)
    whitelabel_issued           boolean,                -- wire: whitelabelIssued (true only for reseller-issued keys; absent otherwise)
    whitelabel_name             text,                   -- wire: whitelabelName
    issued_by                   text not null default '',-- wire: issuedBy (session sub, or 'system' for auto checkout)
    issued_by_name              text not null default '',-- wire: issuedByName
    issued_at                   bigint not null default 0, -- wire: issuedAt (unix s)
    activated                   boolean not null default false, -- wire: activated
    activated_at                bigint,                 -- wire: activatedAt (unix s)
    revoked                     boolean not null default false,  -- wire: revoked
    revoked_by                  text,                   -- wire: revokedBy
    revoked_by_name             text,                   -- wire: revokedByName
    revoked_at                  bigint,                 -- wire: revokedAt (unix s)
    revoked_reason              text,                   -- wire: revokedReason
    converted_from_key          text,                   -- wire: convertedFromKey (absent when null)
    source                      text,                   -- wire: source ('auto' = paid checkout; absent when null)
    order_id                    text,                   -- wire: orderId (checkout order AP...; absent when null)
    cf_order_id                 text                    -- wire: cfOrderId (Cashfree order id; absent when null)
);

create index license_meta_issued_by_idx on public.license_meta (issued_by, issued_at desc);
create index license_meta_affiliate_idx on public.license_meta (affiliate_id, issued_at desc);
create index license_meta_issued_at_idx on public.license_meta (issued_at desc);

-- ===========================================================================
-- checkout_orders -- automatic Cashfree checkout (wire record: CheckoutOrder)
-- ===========================================================================
-- wire: orderId ('AP' + 24 hex UPPER), planId, mode, machineId, amount,
--       status ('created'|'paid'|'amount_mismatch'), customer {name,phone,
--       email}, createdAt, paidAt, licenseKey (plaintext resolved on read).
--
-- The JSON store kept three TTL side keys around the order record
-- (`pending:{mode}:{machineId}` 24h, `claim:{mode}:{machineId}` 90d,
-- `order:lock:{orderId}` 30s). They live in panel_settings (below) with the
-- SAME TTL semantics, lazily expired via expires_at.
-- The order record itself carried a 90-day TTL too -- expires_at reproduces it
-- (expired rows read as "unknown order", exactly like the TTL'd KV key).
create table public.checkout_orders (
    order_id        text primary key,               -- wire: orderId (AP[A-F0-9]{24})
    plan_id         text not null,                  -- wire: planId (starter|pro|business)
    mode            text not null default 'desktop',-- wire: mode (desktop|app)
    machine_id      text not null default '',       -- wire: machineId (device code display form)
    amount          double precision not null default 0, -- wire: amount
    status          text not null default 'created',-- wire: status (created|paid|amount_mismatch)
    customer        jsonb not null default '{}'::jsonb, -- wire: customer { name, phone, email }
    created_at      bigint not null,                -- wire: createdAt (unix s)
    paid_at         bigint,                         -- wire: paidAt (unix s)
    license_key_hash text,                          -- resolved to wire licenseKey via licenses.key_sealed (plaintext NEVER stored)
    expires_at      bigint not null                 -- order TTL (90d from last save) -- expired rows read as missing
);

create index checkout_orders_device_idx on public.checkout_orders (mode, machine_id, created_at desc);
create index checkout_orders_key_idx on public.checkout_orders (license_key_hash);

-- ===========================================================================
-- panel_logs -- admin activity log (wire record: PanelLog)
-- ===========================================================================
-- wire: id, action, actorId, actorName, actorRole, ts, flag, meta{}.
-- Max 1000 most-recent rows retained (trimmed in api/_lib after each save,
-- mirroring the KV list's ltrim); GET returns the 300 newest-first.
create table public.panel_logs (
    id          text primary key,                   -- wire: id (uuid string)
    action      text not null,                      -- wire: action (LICENSE_GENERATED | LICENSE_REVOKED | ...)
    actor_id    text not null default '',           -- wire: actorId
    actor_name  text not null default '',           -- wire: actorName
    actor_role  text not null default '',           -- wire: actorRole
    ts          bigint not null,                    -- wire: ts (unix s)
    flag        text,                               -- wire: flag ('warning' | null)
    meta        jsonb not null default '{}'::jsonb  -- wire: meta {} (action-specific shape)
);

create index panel_logs_ts_idx on public.panel_logs (ts desc);

-- ===========================================================================
-- panel_settings -- tiny KV: demo row + checkout TTL side keys
-- (wire: { enabled, updatedAt, updatedBy } for k = 'demo')
-- ===========================================================================
-- k = 'demo'                                  -> v {enabled, updatedAt, updatedBy} (never expires)
-- k = 'pending:{mode}:{machineId}'            -> v {orderId}, TTL 24h
-- k = 'claim:{mode}:{machineId}'              -> v {orderId}, TTL 90d
-- k = 'order:lock:{orderId}'                  -> v {t}, TTL 30s (fulfil lock)
-- Rows past expires_at are treated as absent and swept lazily, reproducing the
-- KV `ex` semantics. The order:lock row doubles as the SET-NX-EX fulfil lock:
-- acquisition is a conditional insert (PK conflict = already locked).
create table public.panel_settings (
    k          text primary key,                   -- wire: (settings key)
    v          jsonb not null default '{}'::jsonb, -- wire: (settings value)
    expires_at bigint,                             -- TTL (unix s); null = never expires
    updated_at bigint not null default 0           -- bookkeeping (unix s)
);

-- ===========================================================================
-- RLS: service-role-only, mirroring the house pattern. The service key is the
-- only credential that may touch these tables; anon/authenticated keep zero
-- privileges (RLS enabled with no policy for them = hard deny).
-- ===========================================================================
alter table public.admin_users        enable row level security;
alter table public.whitelabels        enable row level security;
alter table public.affiliates         enable row level security;
alter table public.affiliate_payments enable row level security;
alter table public.expenses           enable row level security;
alter table public.withdrawals        enable row level security;
alter table public.license_meta       enable row level security;
alter table public.checkout_orders    enable row level security;
alter table public.panel_logs         enable row level security;
alter table public.panel_settings     enable row level security;

create policy admin_users_service_role        on public.admin_users        for all to service_role using (true) with check (true);
create policy whitelabels_service_role        on public.whitelabels        for all to service_role using (true) with check (true);
create policy affiliates_service_role         on public.affiliates         for all to service_role using (true) with check (true);
create policy affiliate_payments_service_role on public.affiliate_payments for all to service_role using (true) with check (true);
create policy expenses_service_role           on public.expenses           for all to service_role using (true) with check (true);
create policy withdrawals_service_role        on public.withdrawals        for all to service_role using (true) with check (true);
create policy license_meta_service_role       on public.license_meta       for all to service_role using (true) with check (true);
create policy checkout_orders_service_role    on public.checkout_orders    for all to service_role using (true) with check (true);
create policy panel_logs_service_role         on public.panel_logs         for all to service_role using (true) with check (true);
create policy panel_settings_service_role     on public.panel_settings     for all to service_role using (true) with check (true);

revoke all on table public.admin_users        from public, anon, authenticated;
revoke all on table public.whitelabels        from public, anon, authenticated;
revoke all on table public.affiliates         from public, anon, authenticated;
revoke all on table public.affiliate_payments from public, anon, authenticated;
revoke all on table public.expenses           from public, anon, authenticated;
revoke all on table public.withdrawals        from public, anon, authenticated;
revoke all on table public.license_meta       from public, anon, authenticated;
revoke all on table public.checkout_orders    from public, anon, authenticated;
revoke all on table public.panel_logs         from public, anon, authenticated;
revoke all on table public.panel_settings     from public, anon, authenticated;

grant all on table public.admin_users        to service_role;
grant all on table public.whitelabels        to service_role;
grant all on table public.affiliates         to service_role;
grant all on table public.affiliate_payments to service_role;
grant all on table public.expenses           to service_role;
grant all on table public.withdrawals        to service_role;
grant all on table public.license_meta       to service_role;
grant all on table public.checkout_orders    to service_role;
grant all on table public.panel_logs         to service_role;
grant all on table public.panel_settings     to service_role;
