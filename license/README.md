# Ride Accepter — License & Entitlement System

Cloud-based license management with an admin dashboard. The app only runs when the
cloud says it may, and a licence cannot be forged, shared or kept alive for free.

```bash
ADMIN_PASSWORD='your-strong-password' node license/src/server.ts
# then open http://localhost:8787/
```

---

## Why bypass is hard

The whole design exists to make "patch the APK / share the key / run it forever" fail.
Each measure kills a specific attack:

| Attack | Defence |
|---|---|
| Patch out the licence check | Tokens are **Ed25519-signed**; the app embeds only the **public** key, so it can verify but never mint. Removing the check means removing the entitlement itself. |
| Forge a token | Requires the private key, which exists **only on the server** (`license/keys/signing.private.b64`). |
| Share one key with friends | **HWID device binding** + `maxDevices` (default 1). A token is bound to `sha256(device markers)` and is useless on any other device. |
| Use one token forever | Tokens are **short-lived (72 h)** and roll on every `/api/v1/refresh`. Offline use is bounded by the TTL. |
| Roll the system clock back | `iat`/`exp` are checked against server time on every refresh, with a fixed ±5 min skew allowance and no more. |
| Keep using after non-payment | **`revoke`** flips one field; the very next validate/refresh fails even though the user still holds a previously valid token. |
| Re-activate an expired key to get a free window | `activate()` refuses `EXPIRED`. Only an admin `extend` opens a new window. |
| Leak the database | Keys are stored as `sha256(key)` for lookup plus an **AES-256-GCM sealed** copy. A raw dump yields no usable keys. |
| Re-distribute a patched build | `/api/v1/config` carries `versionBlocked` + `forceUpdateVersion` + `updateDownloadUrl`. |
| Tamper with the request path | Body size capped (413), path traversal blocked, session cookies `HttpOnly; SameSite=Strict`. |

Everything above is covered by tests — see `test/core.test.ts` (35 checks, including
exhaustive typo/transposition detection on keys) and `test/e2e.test.ts` (29 live-server
checks, 8 of them explicit `BYPASS:` scenarios).

> The tests are not decoration here: they found two real bugs during development —
> a checksum that could not see changes in the leading characters of a key, and an
> `activate()` path that silently handed expired keys a fresh window.

---

## Architecture

```
license/
  src/
    core.ts      pure logic: key format, HWID, Ed25519 issue/verify, entitlement rule
    store.ts     persistence (JSON today, 1:1 mappable to Firestore)
    server.ts    HTTP API + serves the admin dashboard
  admin/         dashboard (vanilla JS, no build step)
  test/
    core.test.ts unit tests for the anti-bypass core
    e2e.test.ts  drives a real running server
  data/db.json   runtime store (created on first run)
  keys/          master secret + Ed25519 signing pair (created on first run)
```

### The entitlement rule (one place, `core.ts::evaluateEntitlement`)

```
revoked?            -> REVOKED
never activated?    -> NOT_ACTIVATED
past expiry (+5min) -> EXPIRED
new device and no slot left? -> DEVICE_LIMIT
token bound to a different device? -> DEVICE_MISMATCH
token older than its TTL (+5min)?  -> TOKEN_EXPIRED
otherwise           -> ok, with remainingMs
```

Both the server (on every refresh) and the app (offline, from the verified token)
apply this same rule.

---

## API

### Device-facing — called by the APK

| Method | Path | Body | Result |
|---|---|---|---|
| `POST` | `/api/v1/activate` | `{ key, device{…}, appVersion, model, brand, integrity }` | `{ ok, token, expiresAt, license, publicKey }` |
| `POST` | `/api/v1/validate` | `{ key, token }` | `{ ok, token, expiresAt, remainingMs }` |
| `POST` | `/api/v1/refresh` | `{ key, token }` | same as validate (rolling token) |
| `POST` | `/api/v1/config` | `{ appVersion }` | maintenance / forced update / fare clamps |
| `GET`  | `/api/v1/public-key` | — | `{ algorithm: 'ed25519', publicKey }` |

`device` is a map of stable markers (e.g. `androidId`, `buildFingerprint`, `model`,
`brand`). They are canonicalised and hashed on the server; raw identifiers are never stored.

### Admin — the dashboard

`/api/admin/login` (session cookie) then `stats`, `licenses` (GET/POST),
`licenses/{keyHash}/{extend|revoke|unrevoke|maxDevices|reveal|delete}`,
`devices` (GET/DELETE), `config` (GET/POST), `audit`.

### Data model

```
licenses/{keyHash}   keySealed, keyPrefix, planType, durationDays, status,
                     createdAt, activatedAt, expiresAt, maxDevices, note, createdBy
devices/{hwidHash}   keyHash, activatedAt, lastSeenAt, appVersion, model, brand, integrity
audit[]              at, actor, action, detail
config               maintenanceMode, maintenanceMessage, forceUpdateVersion,
                     updateDownloadUrl, updatePageUrl, minAllowedFare, maxAllowedFare,
                     versionBlocked[], dialogMessage, dialogButtonText
```

---

## Security notes

* `license/keys/*.key` and `signing.private.b64` are the **root of trust**. In production put
  them in a secret manager (or move issuance into a Cloud Function) — never in the APK.
* The default dev password is `admin@123`. Set `ADMIN_PASSWORD` before deploying.
* Passwords are compared in constant time (`scrypt` + `timingSafeEqual`).
* The dashboard shows a key exactly once at creation; `reveal` re-opens the sealed copy and
  every reveal is audited.
* `evaluateEntitlement` and `verifyToken` are pure and exhaustively tested — treat changes to
  them as security-relevant and require the suites to stay green.

## Run the tests

```bash
node license/test/core.test.ts                                   # unit
node license/src/server.ts &                                      # server
node license/test/e2e.test.ts                                     # end-to-end
```

(`node --test` is not usable in this sandbox — it spawns child processes — so the files are
run directly and use `node:test` in-process.)

## Client integration — DONE

The Android client is wired in (`apk-src/com/ride/accepter/licence/`, documented in
`PATCHES.md` §K): the login screen (which is the launcher) shows this machine's device code,
calls `/api/v1/activate` with a key minted for that code, caches the signed token, verifies it
**offline on every entry** (Ed25519 signature + `hw` machine binding + the entitlement rule)
and calls `/api/v1/refresh` opportunistically (rolling token). The server's verdict on
revocation / expiry / device binding is final: a refusal clears the grant and stops the
auto-accept engine, whose event gate runs the same check.
