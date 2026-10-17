# Ride Accepter — End-to-End Workflow

Derived from the fully decoded source (`decoded-jadx/`), the de-flattened control flow
(`analysis/app_flow.txt`) and the recovered literals (`analysis/xor_strings.txt`,
`analysis/decrypted_constants.txt`).

Legend: **[C]** = confirmed by recovered literal / preserved symbol · **[I]** = inferred from
structure + signatures.

---

## 0. One-line summary

An always-on AccessibilityService watches the screens of gig driver apps, extracts the fare and
distance from the on-screen text, compares them to the driver's filters, and injects a tap on the
"Accept" button (via accessibility, falling back to an ADB shell) — gated behind a paid
subscription that the developer controls remotely.

## 1. Moving parts

```
                    ┌──────────────────────────────────────────────┐
                    │  Developer's control plane                   │
                    │  Firebase project "autoacccept"              │
                    │   ├─ Auth        (email + password)          │
                    │   ├─ Firestore   collection "users"          │
                    │   ├─ Remote Cfg  kill-switch / limits        │
                    │   ├─ FCM         push commands               │
                    │   └─ Analytics / App Check / Integrity       │
                    │  https://rideaccepter.in/api/*.php  (coupons)│
                    │  Paytm order-status endpoint   (payments)    │
                    │  cleartext → 103.194.228.95                  │
                    └──────────────────────────────────────────────┘
                                     ▲  ▼
   ┌─────────────────────────────────┴──────────────────────────────────┐
   │  com.ride.accepter  (UI namespace com.auto.accept)                  │
   │                                                                     │
   │  AutoAcceptApp ──► Shizuku listener                                 │
   │  MainActivity / MainViewModel ── Compose UI, plans, settings        │
   │      │                                                              │
   │      ├─ a5/j  AuthManager        (FirebaseAuth)        [C]         │
   │      ├─ a5/z  FirestoreRepository(collection "users")  [C]         │
   │      ├─ a5/i0 RemoteConfigManager→AppConfig             [C]         │
   │      ├─ a5/d0 PaymentVerifier    (Paytm)               [C]         │
   │      ├─ a5/a,c Coupon redeem / validate                [C]         │
   │      └─ z4/d  EncryptedPreferencesManager              [C]         │
   │                                                                     │
   │  RideAcceptorService  ◄── THE ENGINE                                │
   │  OverlayService       ── floating HUD                               │
   │  KeepAliveService     ── sticky notification                        │
   │  MyFirebaseService    ── FCM                                         │
   │  BootReceiver         ── BOOT_COMPLETED                              │
   └─────────────────────────────────────────────────────────────────────┘
        ▲ Accessibility events / screen text      │ injected taps
        │                                         ▼
   Ola · Uber · Rapido · Namma Yatri · Porter · Swiggy · Zomato · Dunzo
   Blinkit · Zepto · Instamart  (driver / delivery apps)
```

## 2. Lifecycle & boot

1. **Install / device boot** — `BootReceiver.onReceive` fires on `android.intent.action.BOOT_COMPLETED`.
   Its own log: `"Boot completed - accessibility service restarts automatically"` **[C]** — i.e. the
   OS restarts the AccessibilityService, and `KeepAliveService` keeps a permanent notification
   ("Ride Accepter Active" / "Monitoring for ride requests...") so the process is not reclaimed. **[C]**
2. **`AutoAcceptApp.onCreate`** — initialises the **Shizuku** privileged-shell listener
   (`"Shizuku listener setup error:"`). **[C]**
3. **`MainActivity.onCreate/onResume`** — Compose Material-3 UI. `onResume` emits
   `"FREEZE_DEBUG" … "ms"` timing marks. **[C]**

## 3. Phase A — Onboarding & account

`MainViewModel` drives navigation through `onNavigateToSignup` / `onNavigateToLogin` screens. **[C]**

**Authentication is e-mail + password against Firebase Auth** **[C]** (all call names recovered):
`createUserWithEmailAndPassword`, `signInWithEmailAndPassword`, `sendPasswordResetEmail`,
`reauthenticate`, `verifyBeforeUpdateEmail`, `getCredential`.
Failure strings: `"Signup failed: user is null"`, `"Login failed: user is null"`,
`"No email found"`, `"No user logged in"`. **[C]**

On first sign-in `FirestoreRepository` (a5/z) creates **`users/{uid}`** **[C]**:

| Field | Meaning |
|---|---|
| `name`, `email` | profile |
| `createdAt` | signup time |
| `deviceId` (stored under obfuscated key `deviceIdXDIF\|QXM`) | **device fingerprint / binding** |
| `status` | `User` → `Pending Approval` → `Active` (or `blocked`) **[C]** |
| `approved`, `blocked` | moderation flags set by the seller |
| `planType`, `planOrderId`, `planActive`, `planExpiry` | subscription state |

Logs: `"User document created for: "`, `"User document not found"`, `"Failed to get user profile: "`. **[C]**

A new account sits at **`Pending Approval`** — the seller must approve it before it works.

## 4. Phase B — Subscription (the monetization loop)

`MainViewModel.k(planType)/l(planType)` map plan codes to durations/prices **[C]**:
`DAY` "1 Day Plan" · `WEEK` "1 Week Plan" · `HALF_MONTH` "15 Days Plan" · `MONTH` "1 Month Plan" · `YEAR` "1 Year Plan".

Payment path **[C]**:
1. Builds a UPI deep link: `upi://pay?pa=` + `paymentUpiId` + `&pn=Ride Accepter` + `&am=` + `&mam=` + `&tr=` + `&tn=` + `&cu=INR`
   (also renders a QR via `createBitmap`, `singletonMap`).
   Warning shown: `"⚠ Do not go back or close this page until payment is verified"`, `"100% Secure UPI Payment"`.
2. Writes a `TransactionData` (`orderId`, `planType`, `status`, `couponCode`, `amount`, `discountAmount`,
   `createdAt`, `updatedAt`) with status `PENDING`. **[C]**
3. **`PaymentVerifier` (a5/d0)** then polls **Paytm** `https://securegw.paytm.in/order/status`
   (base64-obfuscated), merchant ID `[REDACTED-PAYTM-MID]`, retrying:
   `"Verifying payment with Paytm gateway... (Attempt N)"`, `"(MID: …)"`, `", Amount: ₹"`. **[C]**
   - success → `"✅ Direct Paytm Payment SUCCESS verified for Order: …"` → status `SUCCESS` **[C]**
   - `TXN_FAILURE` → `"Transaction marked failed by bank"`; `CANCELLED` **[C]**
   - gives up → `"Payment verification timeout. If amount was deducted, please tap Verify again."` **[C]**
4. `FirestoreRepository.a(...)` activates it: `"Plan activated & user approved for "`,
   sets `planActive`, `planExpiry`, flips the user to `approved`/`Active`. **[C]**

**Coupons** (optional) hit the developer's PHP API over HTTPS POST `application/json` **[C]**:
- `https://rideaccepter.in/api/coupon_validate.php` → `code`, `uid`, `planType`, `isFirstTimePurchase`;
  response fields `discountPercent`, `discountFixed`, `maxUses`, `currentUses`, `expiresAt`, `isActive`, `applicablePlans` (`ALL`)
- `https://rideaccepter.in/api/coupon_redeem.php` → bumps `currentUses`
- errors: `"Invalid coupon"`, `"Failed to validate coupon: "`

## 5. Phase C — Permissions & Quick Setup

The **Quick Setup** tab (`quick_setup`) walks through required capabilities **[C]**, each with a status row:

| Item | Status text | Purpose |
|---|---|---|
| `Accessibility Service` | `Enabled` / "Required to detect rides" | read other apps' screens |
| `Overlay Permission` | `Granted` / "Required for floating widget" | HUD |
| `Shizuku Shell` | `Running` / "Tap to authorize Shizuku" | ADB-shell tap injection |
| `Battery Optimization` | `Unrestricted` / "Tap to exempt" | stay alive |

Plus `select_language` (English / `Kannada` / `Malayalam` … → `app_language`), `accept_timer_title`,
`anti_detection_title`, `shizuku_engine_status`, `driver_apps_status`. **[C]**

Shizuku is only required for **Ola and Uber** — `"Ola & Uber requires Shizuku to be running &
paired. Complete Shizuku setup in Settings tab first, or disable them in Apps tab."` **[C]**

Anti-detection (`"Anti-Detection (Stealth Mode)"`, `"Prevents ride apps from detecting Developer
Options or blocking auto-accept."`) manipulates `window_animation_scale` to hide developer-options
traces. **[C]**

## 6. Phase D — Service start

`MainViewModel.r(serviceEnabled)` is the gatekeeper and refuses to start unless **[C]**:
- internet available — `"No internet connection. Service requires internet."`
- **paid plan active** — `"No active subscription plan. Please subscribe first."`
- accessibility granted — `"Please grant accessibility permission first."`
- Shizuku paired (only if Ola/Uber enabled)
- at least one supported driver app installed — `"No supported driver apps (Ola, Uber, Rapido,
  Porter, etc.) found on your device. Service cannot be started."`

Then `RideAcceptorService.onServiceConnected()` **[C]**:
1. opens `EncryptedSharedPreferences` (`encrypted_app_data_secure`), with a plain fallback
   (`"Encrypted prefs unavailable, falling back to secure private prefs: "`) and a migration flag
   `migrated_to_encrypted_v1`
2. `updatePreferences()` loads the whole settings schema (below) and logs a summary:
   `"✅ ENABLED=… | RANGE=₹50-₹500 | Apps=…"` **[C]**
3. acquires `PowerManager.WakeLock` tagged `RideAcceptor::WakeLock` **[C]**
4. broadcasts `com.auto.accept.SERVICE_STATUS {is_active}` → the HUD shows live **[C]**

Also started: `OverlayService` (floating widget) and `KeepAliveService` (sticky notification).
`MyFirebaseService.sendRegistrationToServer(token)` uploads the FCM token. **[C]**

## 7. Phase E — The ride-acceptance loop (core)

```
onAccessibilityEvent(e)                      [C]  catch → "Event error: "
   │   listens for typeWindowStateChanged | typeNotificationStateChanged | typeWindowContentChanged
   ▼
handleEvent(e)                               [C]
   │  packageName → findTrackedApp(pkg)      [C]  matches SupportedApp.packageKeywords
   │  (unknown package? drop the event)
   ▼
routeToScanner(rootNode, supportedApp)       [C]
   ├─ scanNodeForOla(node)      [C]  dedicated heuristics
   ├─ scanNodeForUber(node)     [C]  incl. "uber_blind_" mode, "exclusive" handling
   ├─ scanNodeForRapido(node)   [C]
   └─ (other apps) generic keyword path
   │
   │   fetchIterableNodes(node, out)         [C]  flatten the AccessibilityNodeInfo tree
   │   extractAllNumbers(fareText)           [C]  regex  (\d+\.?\d*)      [C]
   │   extractDistance(text)  → pickup km / drop km     [C]
   │   findClickableAncestor(node)           [C]
   │   findRejectButton(nodes, bounds)       [C]  auto-decline path
   ▼
processRideDecision(minFare, maxFare, pickupKm, dropKm,
                    nodes, acceptBtn, rejectBtn, appName)   [C]
   │
   │  FILTERS (all from EncryptedPrefs / Remote Config)     [C]
   │   ├─ fare window        min_fare … max_fare      (default ₹50 … ₹500)
   │   ├─ remote clamp       min_allowed_fare … max_allowed_fare
   │   ├─ pickup distance    sec_min_pickup_km … sec_max_pickup_km
   │   ├─ drop distance      sec_min_drop_km … sec_max_drop_km
   │   ├─ location filters   sec_location_filters (allow/deny list)
   │   ├─ per-app switch     app_enabled_<package>
   │   └─ subscription clock sec_plan_expiry_ms
   │
   ├─ MATCH  ──► executeAccept(...)          [C]
   └─ NO MATCH ─► findRejectButton → auto-decline    [I]
   ▼
executeAccept(node, min, max, pickupKm, dropKm, appName, fareText, …)   [C]
   │  1. AccessibilityNodeInfo.performAction(ACTION_CLICK) via findClickableAncestor  [C]
   │  2. if that fails → Shizuku shell  `input tap <x> <y>`
   │       callbacks executeAccept$lambda$24(x, y, this)
   │              and executeAccept$lambda$25(x, y, appName, timestamp)   [C]
   │       reason: "⚠️ Ola ride detected but Shizuku is not available — cannot tap
   │                (accessibility click is blocked by Ola)"               [C]
   │  3. ToneGenerator beep when ride_alert_enabled                        [C]
   │     toast "✅ …" / " (+₹…"  ; failures "Accessibility click fallback exception: "
   ▼
broadcastFareDetected(fareAmount, accepted)  [C]
   │  Intent "com.auto.accept.FARE_DETECTED"  {fare_amount, accepted}     [C]
   ▼
OverlayService.registerReceivers()           [C]
   │  updates the floating HUD: "Ride Accepter", fare text "₹—"           [C]
   ▼
logHistoryIfNew(app, fareText, fare, accepted, windowType)   [C]
      writes local stats: accepted_count · skipped_count · today_earnings
                          last_detected_fare · ride_history · today_stats  [C]
```

Per-app accept-button keywords **[C]** (from `SupportedApp.<clinit>`):
Ola `accept/confirm/match` · Uber `go/reserve` · Rapido `take` · Namma Yatri `offer` ·
Zomato `start` · Swiggy `pick`.

## 8. Phase F — Feedback surfaces

- **Floating HUD** (`OverlayService`, `SYSTEM_ALERT_WINDOW`) — draggable (`createOverlayView$lambda$11`
  moves `$params`), shows `"Ride Accepter"` + live fare `₹—`, toggled by the `service_enabled`
  button (`createOverlayView$lambda$8$lambda$7`). Lifecycle logs `"Overlay view added"`,
  `"Failed to add overlay: "`, `"Overlay service destroyed"`, `"Cleanup error: "`. **[C]**
- **Sticky notification** (`KeepAliveService`) — `"Ride Accepter Active"`,
  `"Keeps Ride Accepter running in the background"`, `"Monitoring for ride requests..."` **[C]**
- **Push** (`MyFirebaseService.onMessageReceived`) — logs `"From: "`, `"Message Notification Body:"`;
  channel `DefaultChannelId`. Can carry server-side commands. **[C]**

## 9. Phase G — Remote control & telemetry (continuous)

`RemoteConfigManager.fetchAndActivate()` pulls a config blob decoded into `AppConfig` **[C]**:

| Key | Effect |
|---|---|
| `version_blocked` | kill specific app versions |
| `blocked_packages` | block features / targets |
| `maintenance_mode`, `maintenance_message` | global shutdown (`"App is under maintenance. Please try again later."`) |
| `force_update_version`, `update_download_url`, `update_page_url` | **forced self-update** |
| `min_allowed_fare`, `max_allowed_fare` | clamp the user's fare window |
| `app_enabled`, `accessibility_enabled`, `per_app_flags` | remotely enable/disable behaviour |
| `dialogMessage`, `dialogButtonText`, `toastMessage`, `changelog` | arbitrary server-driven UI |
| `IS_BETA`, `beta_*` | beta channel |

Telemetry / identity data sent to the developer: `name`, `email`, `deviceId` fingerprint,
installed target-app list (`installed_apps`, `installed_apps_desc`), FCM token, plan state,
ride counters — plus Firebase Analytics / App Check / Play Integrity. **[C]**

## 10. Phase H — Persistence & update

- All settings in `EncryptedSharedPreferences` (`encrypted_app_data_secure`) with one-time
  migration `migrated_to_encrypted_v1` and a plaintext fallback. **[C]**
- Full preference schema **[C]**: `service_enabled`, `app_enabled`, `app_enabled_<pkg>`,
  `per_app_settings`, `per_app_flags`, `min_fare`, `max_fare`, `min/max_allowed_fare`,
  `distance_filter_enabled`, `sec_distance_filter_enabled`, `min/max_pickup_km`, `min/max_drop_km`,
  `sec_min/max_pickup_km`, `sec_min/max_drop_km`, `location_filter_enabled`, `location_filters`,
  `sec_location_filter_enabled`, `sec_location_filters`, `app_language`, `advanced_mode`,
  `super_fast_mode`, `IS_BETA`, `ride_alert_enabled`, `accepted_count`, `skipped_count`,
  `today_earnings`, `last_detected_fare`, `plan_expiry`, `sec_plan_expiry_ms`,
  `migrated_to_encrypted_v1`
- `REQUEST_INSTALL_PACKAGES` + `file_paths.xml` (`Download/`) lets it download and install a new
  APK from `update_download_url`. **[C]**

## 11. Complete loop at a glance

```
BOOT ─► AutoAcceptApp(Shizuku) ─► MainActivity
                                        │
                       login (email/pwd)│ Firebase Auth
                                        ▼
                              users/{uid} in Firestore
                              status = "Pending Approval"
                                        │  seller approves
                                        ▼
                              buy plan (UPI) ─► Paytm verify ─► planActive/planExpiry
                                        │  (+ coupon via rideaccepter.in/api)
                                        ▼
                              Quick Setup: Accessibility · Overlay · Shizuku · Battery
                                        │
                                        ▼
              RideAcceptorService.onServiceConnected ─► prefs + WakeLock + STATUS broadcast
                                        │
     ┌──────────────────────────────────┘
     ▼  (loop, thousands of times/day)
 accessibility event ─► handleEvent ─► findTrackedApp ─► routeToScanner
                                                    ─► scanNodeFor{Ola|Uber|Rapido}
                                                    ─► extractAllNumbers (\d+\.?\d*)
                                                    ─► extractDistance
                                                    ─► processRideDecision  ─ filters ─┐
                                                                                       │
              ┌─────────────────────────────────────────────────────────────────────────┤
              ▼ accept                                                       reject      ▼
   executeAccept: a11y click ─► Shizuku `input tap`                        findRejectButton
              │                                                                │
              └────► broadcast FARE_DETECTED ─► HUD + beep + history ◄──────────┘
                                        │
                                        ▼
        telemetry / Remote Config poll ─► kill-switch · forced update · fare clamps
```
