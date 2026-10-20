# AcceptPro Admin Port — Integration Contract

Normative. Every workstream follows this document. Where it says "spec §n" it
refers to the zyqora-admin backend/API contract analysis (records, endpoints,
money math, lifecycle, checkout, side effects) delivered to the workstreams.

- **Design/UX source of truth (read-only):** `C:\Users\toros\OneDrive\Desktop\zyqora-admin`
- **Target repo:** this clone (`rider-admin/`), branch `zyqora-admin-suite`.
- **Do not commit** from workstreams; leave changes in the working tree.

## 0. Non-negotiables

1. NEVER touch, edit, or regenerate: `apk-src/**`, `build.ps1`,
   `supabase/functions/**`, `supabase/migrations/0001_*.sql`,
   `supabase/migrations/0002_*.sql`, `tools/**`, `LICENSE`, `NOTICE`.
   The Android app and its Edge Function contract stay byte-identical.
2. `license/src/core.ts` public behaviour is frozen (it is mirrored 1:1 in
   `supabase/functions/_shared/license.ts`; `tools/verify-supabase-core.mjs`
   and `tools/licence-vectors.mjs` must stay green).
3. Existing `/api/admin/*` endpoints and `license/src/server.ts` behaviour
   must keep working unchanged (additive extensions only). All pre-existing
   tests in `license/test/` must keep passing — ONE sanctioned exception: the
   three UI-cosmetic steps in `license/test/e2e.test.ts` ("dashboard HTML",
   "static assets", "REGRESSION: hidden attribute") were written against the
   old vanilla admin and have been rewritten by the integration owner to be
   static-export-aware; every API/security step in that file stays byte-frozen.
   Workstreams must NOT edit `license/test/e2e.test.ts`.
4. **No new runtime npm dependencies** in `api/` or `license/src/` — node:
   builtins only (this repo is zero-runtime-dep). UI build deps live only in
   `console/` (next/react/jspdf…).
5. `public/**` and `license/admin/**` remain **byte-identical mirrors**.

## 1. Branding (user decision: "exact copy with acceptpro name")

- Wordmark/product name **AcceptPro** replaces every user-visible
  "Zyqora"/"ZYQORA"/"Zyqora Admin". All other strings stay verbatim.
- localStorage keys: `acceptpro_admin_token`, `acceptpro_admin_user`.
- Checkout order id: `AP` + 24 hex UPPER; regex `^AP[A-F0-9]{24}$`.
- jsPDF invoice title `Invoice — AcceptPro`; key-email subject
  `Your AcceptPro <planName> license key`; Cashfree order note
  `AcceptPro <planName> (1 year)`.
- Console package name `acceptpro-admin`; HTML title `AcceptPro Admin`.

## 2. Key engine (user decision: **AcceptPro RA- keys**, zyqora UX wraps it)

- Every generated key is a real AcceptPro licence: `generateKey()` ("RA-…"),
  persisted hash-only (`hashKey`) + sealed (`sealKey`), minted via the engine
  (`createLicenses` in the JSON store; `create_license` rpc in SQL).
  ZYQ-HMAC keys do NOT exist anywhere.
- **"Machine ID" / "Android ID" fields = the app's Device ID** (the device code
  shown on the app login screen, `XXXXX-XXXXX-XXXXX`; normalize with
  `normalizeDeviceCode`, hash with `hashDeviceCode`).
  - `desktop` / `app` mode: `boundDeviceCodeHashes=[hashDeviceCode(code)]`,
    `machineId` = the code (display form), `maxDevices` = 1 (pre-bound key —
    the engine locks a pre-bound key to exactly the codes it was minted for).
  - `cloud` mode: `boundDeviceCodeHashes=[]`, `machineId=null`,
    `maxDevices` = deviceLimit (engine's own cap is 10 — clamp and surface the
    zyqora deviceLimit 1–255 in metadata; the engine field is capped at 10,
    which is the app-facing truth).
- Plan mapping (zyqora label → engine `planType`/`durationDays`):
  `trial1day`→DAY/1, `trial`→DAY/3, `weekly`→WEEK/7, `monthly`→MONTH/30,
  `3months`→MONTH/90, `6months`→MONTH/180, `yearly`→YEAR/365,
  `lifetime`→YEAR/36500 (`isLifetime:true`), `custom`→MONTH/customDays.
- Engine lifecycle is UNCHANGED (key `unused` until the app first activates it;
  engine `expiresAt` then runs from activation). `license_meta.expiryTs` =
  `issuedAt + durationDays*86400` (unix **seconds**; for lifetime use
  `253402300799` + `isLifetime:true`) and is what the UI displays exactly like
  zyqora ("Valid until …"). The license detail modal additionally shows an
  "AcceptPro binding" section: engine status, activation date, engine expiry,
  bound device code(s).
- `/api/licenses/validate` is a panel debugging/parity endpoint (uses
  `findByKey` + `evaluateEntitlement` semantics). The Android app is NOT routed
  through it — it keeps its Edge Function contract untouched.

### 2.1 Machine ID / Device ID value space (LOCKED — all workstreams)

The user's decision "'Machine ID' field = the app's Device ID" resolves the
zyqora 16-hex vs AcceptPro device-code ambiguity:

- Field LABELS stay zyqora-verbatim: `Machine ID`, `Android ID`,
  `Desktop License (Machine ID)`, `Cloud License (No Machine ID)`,
  `PC / Desktop / Bound to Machine ID`.
- The VALUE everywhere (generate, convert, buy/create-order, claim) is the
  AcceptPro app's **Device ID** — what the app's "Device activation" screen
  shows under "YOUR DEVICE ID": display form `XXXXX-XXXXX-XXXXX`, 15 Crockford
  chars (e.g. `7QK2M-3XW8H-PTD4R`).
- Validation: run `normalizeDeviceCode(input)` (shared module — strips
  separators, folds O→0/I,L→1), then require `^[0-9A-HJKMNP-TV-Z]{15}$` on the
  result. Generate keeps zyqora's weaker rule (required unless cloud, trimmed).
- Storage: `license_meta.machineId` = re-hyphenated display form
  (`norm.match(/.{1,5}/g).join('-')`); binding via `hashDeviceCode(input)`
  (normalizes internally). Checkout side keys `pending:{mode}:{machineId}` /
  `claim:{mode}:{machineId}` use the BARE normalized 15-char form so claim is
  hyphenation-insensitive.
- zyqora's `MACHINE_ID_RE = /^[A-F0-9]{16}$/` (lib/checkout.js) is NOT ported;
  its two call sites (create-order 400, claim `{found:false}`) use the check
  above with the same response shapes.

Sanctioned visible-string deviations — EXACTLY these seven, nothing else (all
other strings byte-exact; keep ₹, →, —, …, ✓, emoji):

1. `buy/page.jsx` hint → `'Open AcceptPro → Device activation screen → copy the 15-character Device ID. Your key works only on this device.'`
2. `buy/success/page.jsx` → `'Otherwise, paste this key on the activation screen and tap Activate.'`
3. create-order error → `'Enter your 15-character Device ID exactly as shown in the app'`
4. generate placeholder (desktop field) → `"Paste from AcceptPro app Device ID"`
5. generate placeholder (mobile field) → `'Paste from AcceptPro mobile app Device ID'` (the reviewAccess placeholder `'e.g. PLAYSTORE-REVIEWER (not actually checked)'` is unchanged)
6. generate hint (mobile) → `'Found in the AcceptPro Android app → Device activation screen — unique per device, so a new phone always needs a new key'` (arrows/em-dash/tail byte-exact; the DESKTOP hint gets brand-swap only)
7. (INTEGRATION ADDITION, approved) one shared validation string in each
   form's EXISTING error slot (buy `setError`, generate `setGenErr`, convert
   `setConvertErr`) → `'Machine ID must be the 15-character Device ID shown in the app'`.
   Loose client-side check only (normalize: strip non-alphanumerics + uppercase,
   require 15 chars; any hyphenation accepted); the server stays authoritative.
   Generate exempts the super-only Reviewer/Test Access toggle (preserves the
   "any placeholder text works" UX); convert validates only when non-empty.

Rationale (report to the user): these strings describe zyqora's app navigation
("License screen") and ID format ("16-character"), neither of which exists in
AcceptPro (the app shows "YOUR DEVICE ID" on its Device activation screen).
Everything visual stays pixel-identical.

## 3. Auth (wire contract verbatim from spec §1)

- Roles `super|admin|whitelabel|affiliate`; one login endpoint; lookup order
  admin → affiliate → whitelabel; `active` flag; error strings verbatim.
- Tokens: JWT HS256 implemented with `node:crypto` HMAC (no `jose`), payload
  `{sub, username, role, name?, iat, exp}` with `exp = iat + 8h`. Secret
  `JWT_SECRET`; if absent and `NODE_ENV==='production'` → throw (login 500
  `Server error`); dev fallback literal
  `fallback-dev-secret-change-in-production-123`. Verification fails closed.
- Password hashes: `scrypt$<salthex>$<hashhex>` (scryptSync, N=16384, 32-byte
  key, 16-byte salt), timing-safe compare. Format is shared verbatim between
  `api/_lib` and `license/src` so both stores interoperate.
- Lazy seed on login when admins list is empty: super admin,
  `username = (ADMIN_USERNAME||'admin').toLowerCase()`, `password =
  ADMIN_PASSWORD||'changeme123'`.
- Old `/api/admin/*` endpoints keep their existing auth AND additionally accept
  the new Bearer JWT for roles `super|admin` (so the console's extra pages can
  reuse them with one token).
- `GET /api/auth/me` exactly per spec (admin record, or whitelabel record +
  `usage` + `partnership`; 404 `Not found` otherwise).

## 4. Storage

SQL: additive migration `supabase/migrations/0003_admin_suite.sql` only.
JSON mirror in `license/src/store.ts` (camelCase records = the API wire shape).
All zyqora timestamps are **unix seconds** on the wire (engine records keep
their existing ms fields; convert at the boundary).

Tables / collections (SQL snake_case columns ⇄ wire camelCase):

| table | notes |
|---|---|
| `admin_users` | id, username, passwordHash, role('super'\|'admin'), createdBy, createdByName, createdAt, active, sharePercent |
| `whitelabels` | + name, phone, email, businessName, businessCategory, website, notes, allowedModes[], allowedPlans[], maxDevices, licenseLimit, partnershipStartTs, partnershipMonths, partnershipEndTs, updated* |
| `affiliates` | username, name, passwordHash, commission, active, created* |
| `affiliate_payments` | id `pay_…`, affiliateId, affiliateName, amount, note(≤200), paidBy, paidByName, paidAt, updated* |
| `expenses` | id, title, amount, category, location, notes, spentBy, spentByName, spentAt, createdAt, edited*, originalValues{title,amount,category,location,notes,spentAt} |
| `withdrawals` | id `wd_…`, adminId, adminUsername, amount, note(≤300), withdrawnAt, recordedBy, recordedByName, createdAt, updated* |
| `license_meta` | keyed by keyHash (also store `key` display prefix); ALL zyqora license fields: plan, planTier, deviceLimit, expiryTs, isLifetime, price, discountedPrice, discountAmount, licenseMode, machineId, clientName, clientPhone, clientEmail, businessCategory, website, notes, features{}, affiliateId, affiliateName, affiliateCommissionAmount, reviewAccess, validationException, exceptionBoundMachineId, whitelabelIssued, whitelabelName, issuedBy, issuedByName, issuedAt, activated, activatedAt, revoked, revokedBy, revokedByName, revokedAt, revokedReason, convertedFromKey, source, orderId, cfOrderId |
| `checkout_orders` | per spec §2 (`orderId` `AP…`, `license_key_hash` only — the plaintext key is NEVER persisted; TTL semantics for JSON store side keys `pending:`, `claim:`, `order:lock:`) |
| `panel_logs` | id, action, actorId, actorName, actorRole, ts, flag, meta{} (max 1000, GET returns 300) |
| `panel_settings` | `demo` row `{enabled, updatedAt, updatedBy}` |

Wire `key` field: the plaintext RA- key, unsealed server-side on demand
(`unsealKey`) — the same privilege `/api/admin/licenses/[key]/reveal` already
grants; UI masks it as `key.slice(0,18) + '…'` exactly like zyqora.

Persisted-key doctrine (RULED at integration, applies to BOTH mirrors): zyqora
embeds the FULL plaintext key in audit-log `meta.key` and in convert's
`revokedReason` template. We do NOT: `license/src/store.ts` ("we never persist a
plaintext key, only keyHash + keySealed") is repo law and those are persisted
artifacts. So `meta.key` and the `revokedReason` `(key: …)` suffix carry the
**display prefix** (`keyPrefixOf` → `RA-XXXXX`); templates stay byte-verbatim
(`Converted to ${plan} plan (key: ${prefix})`). Console consumers were checked
line-by-line and never extract the key from either string (licenses page uses
only `revokedReason?.startsWith('Converted to')`; both render verbatim; logs
search is substring). Accepted nuance: pasting a full key into the Logs search
does not match a prefix-carrying `meta.key`; searching by prefix does.

Same doctrine for checkout orders (RULED at integration): `checkout_orders`
rows persist `license_key_hash` only. The wire `licenseKey` is resolved on read
via `unsealKey` and degrades to `null` once the engine record is gone, so
fulfilment idempotency ("already fulfilled" ⇔ key resolvable) holds in both
mirrors without ever writing a plaintext key to a persisted artifact.

## 5. API surface — implement spec §3 VERBATIM

Paths, status codes, response shapes and error strings exactly as in the spec:
`/api/auth/{login,me}` · `/api/admins/{create,list,[id]/{change-password,licenses,toggle,update-share}}`
· `/api/affiliates/{create,list,stats,payments/list,payments/[id],[id]/{change-password,delete,pay,payments,toggle,update-commission}}`
· `/api/licenses/{generate,list,update,revoke,delete,convert,validate}`
· `/api/expenses` (GET/POST/PATCH) · `/api/withdrawals` (GET/POST) +
`/api/withdrawals/[id]` (PUT) · `/api/sales` · `/api/stats` · `/api/logs`
(GET/DELETE) · `/api/settings/demo` (GET/POST) · `/api/checkout/{plans,create-order,status,claim,webhook}`
· `/api/whitelabel/{create,list,[id]/{change-password,delete,licenses,toggle,update}}`.

Money math (spec §4) verbatim: price/discount clamp, affiliate commission
`(revenue * commission/100).toFixed(2)` parse-back, affiliate stats
formulas, global stats `totalRevenueBasis = totalRevenue − totalExpenses −
affilCommission`, `moneyLeft = totalRevenueBasis − allWithdrawn`.
Whitelabel quota = issued licenses excluding revoked-with-reason
`Converted to…`; convert quota neutrality exactly per spec §5.
Audit log actions/meta exactly per spec §7 (`LICENSE_GENERATED`,
`LICENSE_REVOKED`, `LICENSE_CONVERTED`, `LICENSE_DELETED`, `WHITELABEL_DELETED`,
`CHECKOUT_MISMATCH`).

Rate limits per spec §7 (claim 120/h, create-order 15/h, status 120/10min —
fail-open, bucket keys `rl:{bucket}`).

## 6. Checkout (spec §6 verbatim, branded)

- Plans catalog (copy zyqora `lib/plans.js` exactly, name strings verbatim).
- Cashfree PG create-order / webhook HMAC verify (constant-time) / status /
  claim / `fulfilOrder` idempotent lock exactly per spec; fulfilment mints an
  RA- key through the engine (mode `desktop`/`app` → bound to the submitted
  device code; `plan` per the plan catalog `durationPlan` mapping in §2) with
  `issuedBy:'system'`, `issuedByName:'Auto checkout'`, `source:'auto'`.
- Email sender (`RESEND_API_KEY`, `EMAIL_FROM`) per spec §7, branded
  AcceptPro, errors swallowed, never blocks delivery.

## 7. Console (workstream UI)

`rider-admin/console/` = Next 14 app-router static-export port of
`zyqora-admin/{app,components,lib}`:

- Keep every page verbatim (dashboard, licenses, sales, expenses, admins,
  whitelabel, affiliates, affiliate-dashboard, payments, withdrawals, logs,
  login, buy, buy/success) with all specs' strings/state/endpoints.
- Drop `app/api/**` and server-only libs (`kv`, `auth`, `rateLimit`, `cashfree`
  server bits) — the API lives in `api/` + `license/src/server.ts`.
- `next.config.mjs`: `{ output:'export', trailingSlash:true,
  images:{unoptimized:true} }`. Wrap `useSearchParams` uses in `<Suspense>`.
- **Fonts:** if `next/font/google` is used, vendor the woff2 files from
  `zyqora-admin/.next/static/media/` into `console/public/fonts/` and use
  `@font-face` (builds must work offline).
- `build-console.ps1` at repo root: build in `%TEMP%` (copy `console/` +
  `zyqora-admin/node_modules` into a temp build dir — **never** `npm install`
  or write `node_modules` inside the workspace), then copy `out/` into BOTH
  `public/` and `license/admin/` (mirroring them byte-identically).
- Extra pages (lower priority than the replica itself): **Devices** and
  **App Config** in the same theme (super/admin nav), consuming the existing
  `/api/admin/devices`, `/api/admin/config` shapes (read `api/admin/*.ts`),
  and Licenses row-menu extras Extend / Reveal key / Unrevoke / Set max
  devices calling `/api/admin/licenses/[key]/[action]`.
- Nav = zyqora's exactly (role gating super-only items) + the two extras.

## 8. Environment variables (update `.env.example` at integration)

Existing (unchanged): `ADMIN_PASSWORD`, `ADMIN_SESSION_SECRET`, `MASTER_SEAL_KEY`,
`SUPABASE_URL`, `SUPABASE_SERVICE_ROLE_KEY`. New with this port:
`JWT_SECRET` (panel JWT HS256 secret; dev fallback applies when absent),
`ADMIN_USERNAME` (seed super-admin username, default `admin`),
`CASHFREE_CLIENT_ID`, `CASHFREE_CLIENT_SECRET`, `CASHFREE_BASE_URL` (optional
override), `RESEND_API_KEY`, `EMAIL_FROM`, `CHECKOUT_FAKE_GATEWAY` (dev/test
only: 1 = local fake gateway, never set in production).

## 9. Verification (integration owner does the final pass)

1. `node --test license/test/` — all suites green, including the new
   `license/test/admin-suite.test.ts` (login/seed, generate+meta, whitelabel
   quota, convert neutrality, money math, affiliate stats, revoke/delete logs).
2. `node tools/verify-supabase-core.mjs` and `node tools/licence-vectors.mjs` green.
3. Console build succeeds; `public/` ≡ `license/admin/` (`fc /b` or hash walk).
4. Smoke: `node smoke-suite.mjs` (repo root) — boots `node license/src/server.ts`
   on port 8791 with a throwaway DB and exercises every endpoint family
   (auth, admins, whitelabel+quota, affiliates+money, licenses+convert,
   expenses, withdrawals, sales, stats, logs, settings, checkout, legacy
   `/api/admin/*` contract, role walls). Exit 0 required.
5. Commit on `zyqora-admin-suite` (no push).
