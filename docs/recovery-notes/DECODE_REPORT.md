# Ride Accepter v6 — Complete Application Decode

Package `com.ride.accepter` / code namespace `com.auto.accept.*`
APK: `Ride Accepter-v6.apk` (6,535,168 bytes, 645 entries, single `classes.dex` 10.0 MB)

---

## 1. What this application is

A **commercial "auto ride acceptor" bot for Indian gig-economy drivers**. It runs as an
Android **AccessibilityService** that reads the screen of third-party driver/delivery apps,
parses the offered fare, and **automatically taps the Accept button** when the fare matches a
user-configured range — and can auto-reject otherwise. It is sold on a subscription basis and
protected with a commercial obfuscator.

Its own accessibility description states this plainly:

> "This service monitors ride-hailing and delivery apps to automatically detect and accept
> ride/order requests that match your configured fare range. It reads on-screen text to identify
> fare amounts and accept buttons."

## 2. Targeted third-party apps

From `AndroidManifest.xml <queries>` and `SupportedApp.<clinit>` (package keywords → accept-button keywords):

| App | Package keywords | Accept-button keywords |
|---|---|---|
| Ola | `ola`, `com.olacabs.oladriver`, `com.olacabs.customer`, `app.ola.driver` | `accept`, `confirm`, `match` |
| Uber | `uber`, `com.ubercab.driver`, `com.ubercab.partner`, `com.ubercab` | `go`, `reserve` |
| Rapido | `rr.android`, `captain`, `rapido`, `com.rapido.rider`, `com.rapido.passenger` | `take` |
| Namma Yatri | `yatri`, `juspay`, `namma`, `in.juspay.nammayatripartner`, `in.juspay.nammayatri` | `offer` |
| Zomato | `zomato`, `com.zomato.delivery` | `start` |
| Swiggy | `swiggy`, `in.swiggy.deliveryapp` | `pick` |
| Porter | `porter`, `com.theporter.driverapp` | — |
| Dunzo | `dunzo` | — |
| Blinkit | `blinkit`, `grofers` | — |
| Zepto | `zepto`, `bigbasket` | — |
| Instamart | `instamart` | — |

## 3. Component map

| Component | Class | Role |
|---|---|---|
| Application | `com.auto.accept.app.AutoAcceptApp` | Shizuku listener bootstrap |
| Launcher UI | `com.auto.accept.ui.MainActivity` | Jetpack Compose Material 3 UI |
| State | `com.auto.accept.ui.viewmodel.MainViewModel` | Config, auth, plans, service control |
| **Core engine** | `com.auto.accept.service.RideAcceptorService` | AccessibilityService: detect + auto-accept |
| Floating widget | `com.auto.accept.service.OverlayService` | SYSTEM_ALERT_WINDOW HUD ("Ride Accepter", `₹—`) |
| Persistence | `com.auto.accept.service.KeepAliveService` | Sticky foreground notification |
| Push | `com.auto.accept.service.MyFirebaseService` | FCM `onMessageReceived`, `sendRegistrationToServer` |
| Boot | `com.auto.accept.service.BootReceiver` | Restart on `BOOT_COMPLETED` |
| Data | `AppConfig`, `UserProfile`, `CouponData`, `TransactionData`, `RideDetectionResult`, `SupportedApp` | Firestore-backed models |

## 4. Core algorithm (fully reconstructed)

`RideAcceptorService` real method names were preserved by the obfuscator, so the pipeline reads:

```
onServiceConnected()      -> EncryptedSharedPreferences "encrypted_app_data_secure"
                             PowerManager.WakeLock "RideAcceptor::WakeLock"
                             broadcast SERVICE_STATUS {is_active}
    |
onAccessibilityEvent(e)   -> handleEvent(e)                    [catch: "Event error: "]
    |
handleEvent               -> findTrackedApp(packageName)       [matches SupportedApp.packageKeywords]
    |                        updatePreferences()
    +-> routeToScanner(node, app)
            |
            +-- scanNodeForOla(node)     -- walks AccessibilityNodeInfo tree
            +-- scanNodeForUber(node)    -- per-app heuristics ("uber_blind_", "exclusive")
            +-- scanNodeForRapido(node)
                    |  extractAllNumbers(fareText)   -> regex  (\d+\.?\d*)
                    |  extractDistance(text)         -> pickup / drop km
                    |  fetchIterableNodes / findClickableAncestor / findRejectButton
                    v
            processRideDecision(minFare, maxFare, pickupKm, dropKm, nodes, acceptBtn, rejectBtn, app)
                    |   applies filters (below)
                    v
            executeAccept(node, minFare, maxFare, pickupKm, dropKm, appName, fareText, ...)
                    |   1. AccessibilityNodeInfo.performAction(ACTION_CLICK) via findClickableAncestor
                    |   2. FALLBACK -> Shizuku shell `input tap x y`  (Ola blocks accessibility clicks)
                    |   3. ToneGenerator beep; "✅ " / " (+₹" notifications
                    v
            broadcastFareDetected(fareAmount, accepted)
                    -> Intent "com.auto.accept.FARE_DETECTED" {fare_amount, accepted}
                    -> OverlayService.registerReceivers() updates the floating HUD
            logHistoryIfNew(...)  -> local ride history / "today_stats"
```

### Decision filters (`updatePreferences()` → SharedPreferences)

| Key | Default | Purpose |
|---|---|---|
| `service_enabled` | – | master switch |
| `min_fare` / `max_fare` | `50` / `500` | **fare acceptance window (₹)** |
| `sec_distance_filter_enabled` | – | toggle |
| `sec_min_pickup_km`, `sec_max_pickup_km` | – | pickup-distance window |
| `sec_min_drop_km`, `sec_max_drop_km` | – | drop-distance window |
| `sec_location_filter_enabled`, `sec_location_filters` | – | location allow/deny list |
| `app_enabled_<pkg>` | – | per-app on/off |
| `alert_on_accept` | – | beep on accept |
| `sec_plan_expiry_ms` | – | subscription gate |
| `uber_blind_…` | – | Uber-specific blind mode |

Startup gates (`MainViewModel.r(Z)`):
- `"No internet connection. Service requires internet."`
- `"No active subscription plan. Please subscribe first."`
- `"Please grant accessibility permission first."`
- `"<App> & <App> requires Shizuku to be running & paired. …"`
- `"No supported driver apps (Ola, Uber, Rapido, Porter, etc.) found on your device."`

## 5. Permissions and privileged escalation

| Permission | Why it matters |
|---|---|
| AccessibilityService (`BIND_ACCESSIBILITY_SERVICE`) | `canRetrieveWindowContent=true`, `flagRetrieveInteractiveWindows`, `flagReportViewIds` — **reads all on-screen text of other apps** (fares, and anything else visible) |
| `canPerformGestures=true` | injects the Accept tap |
| `moe.shizuku.privileged.api.permission.MOE_SHIZUKU`, `moe.shizuku.manager.permission.API_V23` | **Shizuku (ADB/root shell)** — used for `input tap` when the target app blocks accessibility clicks |
| `SYSTEM_ALERT_WINDOW` | floating HUD |
| `REQUEST_INSTALL_PACKAGES` + `WRITE_EXTERNAL_STORAGE` | **self-update** via `update_download_url` / `update_page_url` |
| `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS`, `WAKE_LOCK`, `FOREGROUND_SERVICE(_SPECIAL_USE)`, `RECEIVE_BOOT_COMPLETED` | survive in background |
| `AD_ID`, `ACCESS_ADSERVICES_*` | Firebase Analytics |

## 6. Backend, payments and monetization

**Firebase project `autoacccept`** (Auth, Firestore, Remote Config, FCM, Analytics, App Check, Integrity)
- `google_api_key` = `[REDACTED-FIREBASE-API-KEY]` (plaintext)
- `google_app_id` = `1:481031051375:android:9ed33b96dbfd83ab36159a`
- `gcm_defaultSenderId` = `481031051375`
- `google_storage_bucket` = `autoacccept.firebasestorage.app`

**Own web backend** — `https://rideaccepter.in/`
- `https://rideaccepter.in/api/coupon_validate.php` (POST, `application/json`, `Accept`)
- `https://rideaccepter.in/api/coupon_redeem.php`
- Coupon fields: `code`, `uid`, `discountPercent`, `discountFixed`, `maxUses`, `currentUses`,
  `expiresAt`, `isActive`, `isFirstTimePurchase`, `applicablePlans` (`ALL`)

**Payments**
- **UPI** intent builder: `upi://pay?pa=` + upiId + `&pn=Ride Accepter` + `&am=` + `&mam=` + `&tr=` + `&tn=` + `&cu=INR`
- AppConfig fields `paymentUpiId`, `merchantId` (remote-configurable)
- **Paytm** order-status verification (`PaymentVerifier`):
  - `https://securegw.paytm.in/order/status` (was base64 `aHR0cHM6Ly9zZWN1cmVndy5wYXl0bS5pbi9vcmRlci9zdGF0dXM=`)
  - Merchant ID `[REDACTED-PAYTM-MID]` (was base64 `QmZlVHVOMjQ2Njk3ODA1MTMzMzg=`)
  - `"✅ Direct Paytm Payment SUCCESS verified for Order: "`, `", Amount: ₹"`
  - `orderId`, `status`, `errorMessage`
- Plans: `DAY`/`WEEK`/`HALF_MONTH`/`MONTH`/`YEAR` → "1 Day Plan" … "1 Year Plan", statuses `PENDING`/`SUCCESS`/`EXPIRED`
- `UserProfile`: `name`, `email`, `status` (`User`/`Active`/`Pending Approval`/`blocked`), `approved`,
  `blocked`, `deviceId`, `planType`, `planOrderId`, `planActive`, `planExpiry`

**Remote kill-switch / control plane** (Firestore `AppConfig`, read via `remoteConfigManager`)
`version_blocked`, `blocked_packages`, `maintenance_mode`, `maintenance_message`,
`force_update_version`, `update_download_url`, `update_page_url`, `min_allowed_fare`,
`max_allowed_fare`, `app_enabled`, `accessibility_enabled`, `per_app_flags`,
`dialogMessage`, `dialogButtonText`, `toastMessage`, `changelog`
- `"App is under maintenance. Please try again later."`

**Contact / distribution**
- `https://rideaccepter.in/`, Telegram `https://t.me/rideaccepter`,
  WhatsApp channel `https://whatsapp.com/channel/0029VbDa51y7j6gA9aiXbK0n`

## 7. Hardcoded network endpoint

`res/xml/network_security_config.xml` permits **unencrypted cleartext HTTP** to a single
hardcoded IP — a plain-text channel that can be read or tampered with on the wire:

```xml
<domain-config cleartextTrafficPermitted="true">
    <domain includeSubdomains="false">103.194.228.95</domain>
</domain-config>
```

## 8. Anti-analysis / stealth features

- `"Anti-Detection (Stealth Mode)"` and `"Prevents ride apps from detecting Developer Options
  or blocking auto-accept."`
- `window_animation_scale` (Settings.Global) manipulation to hide developer-options traces
- `uber_blind_…` per-app blind mode
- Shizuku shell taps used specifically because *"accessibility click is blocked by Ola"*
- `"⚠️ Ola ride detected but Shizuku is not available — cannot tap (accessibility click is blocked by Ola)"`

## 9. Obfuscation layer (NP-Manager 3.1.43)

`assets/protected_by_np/ApkControlFlowConfusion_8.0_48c26a83bb2d4d41ba532aeef29b227d.txt`:

```
ProtectTime: 2026-07-26 18:56:54
Function: 控制流混淆8.0        (Control-Flow Obfuscation 8.0)
Version: 3.1.43
Attention: 仅用于个人代码保护，禁止用于非法用途！
```

Techniques present in the dex and defeated by `tools/deobf.py`:

1. **Package flattening + name scrambling** — all libraries collapsed into `a`…`z9`, class names
   mixed ASCII + Arabic-Indic lookalikes (`ۣ۟ۥۤ۟`). ~440 helper classes are hidden *inside*
   unrelated library packages.
2. **Control-flow flattening**, two dispatcher styles, both reconstructed:
   - `int` state machine: `xor-int/lit16 s, s, MASK` + `sparse-switch s` (257 app methods)
   - `hash` token: `sparse-switch` on `String.hashCode()` of a short Unicode token (34 app methods)
   - plus opaque predicates calling `...->()I` accessors.
3. **String literal scattering** — real literals returned by zero-arg accessors spread across
   unrelated classes (558 recovered).
4. **`([SIII)String` XOR string encryption** over per-class `short[]` blobs (3,189 recovered).
   Length is fed from an obfuscator-generated opaque static `int`; exact lengths recovered from
   the fact that the strings sit contiguously in the blob (length = next offset − this offset).
5. **Bogus dead code** — fake "decryptors" built on `Math.random()` with an intentionally
   infinite `:cond_3` loop, and junk calls like `Integer.decode(...) + System.out.println`.
   These are decoys, not reachable logic.

Resource names are also scrambled (`dB.9.png`, `Af.9.png`), though app-level resource entry
names such as `ACTION_FARE_DETECTED` survive in the dex.

**Note on recovered literals:** a few values keep a short trailing over-read (e.g. `toString(...)`)
where no neighbouring offset was discoverable; the meaningful prefix is exact.

## 10. Output artefacts

| Path | Contents |
|---|---|
| `reference/decoded-jadx/sources/` | **Full decompiled Java source** (9,000 files, 77 MB) |
| `reference/decoded-jadx/resources/` | jadx resource view |
| `app/` | apktool decode: `AndroidManifest.xml`, `res/`, `smali/` (10,148 files), `apktool.yml` |
| `reference/apk-raw/` | raw zip extraction (assets, `resources.arsc`, `classes.dex`, protos) |
| `docs/recovery-notes/analysis/app_flow.txt` | **reconstructed control flow** of all 20 `com.auto.accept` classes |
| `docs/recovery-notes/analysis/decrypted_constants.txt` | decrypted static `String` fields with their owners |
| `docs/recovery-notes/analysis/xor_strings.txt` | all 3,189 decrypted `([SIII)` literals with call-site attribution |
| `docs/recovery-notes/analysis/accessor_strings.json` | 558 scattered plaintext accessor literals |
| `docs/recovery-notes/analysis/all_literals.txt` | every visible `const-string` with its method |
| `tools/deobf.py` | the NP-Manager deobfuscator used to produce `docs/recovery-notes/analysis/` |
| `tools/probe.py` | smali structure probe used during analysis |

## 11. Summary of notable findings

1. Automates acceptance of paid work on Ola / Uber / Rapido / Porter / Namma Yatri / Swiggy /
   Zomato and other platforms — behaviour those platforms explicitly prohibit, and the app
   ships specific evasion for their bot detection.
2. Reads **all on-screen text** of other apps through an accessibility service (not just fares).
3. Escalates to an **ADB/root shell (Shizuku)** to inject taps that the target apps block.
4. Exfiltrates/records identity and device data (`deviceId`, `email`, `name`, install list) to
   the developer's Firebase project and web backend.
5. Ships a **remote kill-switch / forced-update / maintenance** control plane, and can download
   and install a new APK (`REQUEST_INSTALL_PACKAGES`).
6. Talks to a **hardcoded IP over cleartext HTTP**.
7. Payment flow embeds a **Paytm merchant ID** and verifies orders against Paytm's public
   order-status endpoint from the client side.
