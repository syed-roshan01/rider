# Ride Accepter — SharedPreferences / state reverse-engineering report

Sources: `decoded-apktool\smali\z4\d.smali` (`z4/d`, the "preferences manager"), `z4\b.smali`, `z4\a.smali`, `z4\g.smali`, `c4\a|b|c|d.smali` (androidx.security.crypto clone), `o1\s.smali`, `com\auto\accept\ui\viewmodel\MainViewModel.smali`, `com\auto\accept\service\RideAcceptorService.smali`, `com\auto\accept\service\OverlayService.smali`, `b\d.smali`, `h1\b.smali`, `b5\f.smali`, `c5\j.smali`, `f5\y.smali`, plus `analysis\xor_strings.txt` / `analysis\all_literals.txt`.
Package (AndroidManifest): **`com.ride.accepter`**.

---

## 0. Prefs file inventory (names passed to `getSharedPreferences` / `EncryptedSharedPreferences.create`)

| File name | Encrypted? | Opened by | Notes |
|---|---|---|---|
| **`com.ride.accepter_preferences`** | **No** (plain XML, MODE_PRIVATE) | `z4/d.<init>` via `o1/s.D(Context)` = androidx `PreferenceManager.getDefaultSharedPreferences` (`getSharedPreferences(pkg + "_preferences", 0)` — `o1\s.smali:135-163`); `MainViewModel` (through `z4/d` field `c`); `RideAcceptorService.sharedPrefs` (same helper `h3/ۣ۟ۢۡۤ;->ۣ۟۠ۡ۠` → `o1/s.D`); `OverlayService` (same helper) | The **primary settings store**. `z4/d.c:Landroid/content/SharedPreferences;` is exactly this file. |
| **`encrypted_app_data`** | **Yes** — `EncryptedSharedPreferences.create` clone `c4/b.a(Context, MasterKey)` (`c4\b.smali:45-222`; literal file name `"encrypted_app_data"` at `c4\b.smali:48,106,161,216`). Tink **AES256_SIV** keyset (`__androidx_security_crypto_encrypted_prefs_key_keyset__`) + **AES256_GCM** value keyset (`__androidx_security_crypto_encrypted_prefs_value_keyset__`), master key alias `_androidx_security_master_key_` (URI `android-keystore://_androidx_security_master_key_`, built by `c4/c`) | `z4/b.a()` (field `d`, `Lq8/i` lazy → `z4/a` case 0); `RideAcceptorService.encryptedPrefs` (same `c4/b.a` in `onServiceConnected`, `RideAcceptorService.smali:34988-35003`) | Encrypted **values+keys**; XML on disk contains the two keyset entries + ciphertext entries. |
| **`encrypted_app_data_secure`** | **No** (plain fallback) | `z4\a.smali:89-93` (fallback when `EncryptedSharedPreferences` creation throws — log "EncryptedSharedPreferences creation failed, fallback to secure private prefs: "); `RideAcceptorService.onServiceConnected` fallback (log "Encrypted prefs unavailable, falling back to secure private prefs: ", `RideAcceptorService.smali:35044-35063`) | Only used if the encrypted store can't be created. If that also fails, `RideAcceptorService.encryptedPrefs = null`. |
| **`ride_history`** | No | `z4/g.<init>` (`z4\g.smali:19-23`) | Single key `history_json` (JSON array of rides). Used by `z4/g`, `RideAcceptorService.rideHistoryManager`, `MainViewModel.m()`, `c5/j`. |

Everything else (`com.google.*`, recaptcha, datatransport, …) is library-internal and irrelevant.

---

## 1. `z4/d` — `EncryptedPreferencesManager` (really a **dual-store preferences + StateFlow mirror**)

### 1.1 Constructor `<init>(Landroid/content/Context;Lz4/b;)V` (z4/d.smali:77-924)

Param names (from `d7/a.m` checks): `context`, `encryptedPreferencesManager` — so **`z4/b` is the encrypted-prefs manager**, `z4/d` is the wrapper that also owns the plain store and the observable state.

1. `c = o1/s.D(context)` → **default prefs `com.ride.accepter_preferences`** (literal check-string `"getDefaultSharedPreferences(...)"`).
2. `d = new p7/n()` (Gson instance).
3. **One-time migration** (guarded by flag `migrated_to_encrypted_v1`, then always sets it to `true`, z4/d.smali:480-503):
   * legacy plain `plan_expiry` (Long, def `0`) → writes **`sec_plan_expiry_ms`** (Long) to the **encrypted** store (`z4/b.a().edit().putLong(...).apply()`). NB: the flattened code overwrites the read value with `const-wide v11, 0x7fffffffffffffffL` before the write, so as-persisted it writes **`Long.MAX_VALUE`** (unlimited-plan marker) whenever the branch is taken.
   * `distance_filter_enabled` (Bool, def false) → **`sec_distance_filter_enabled`** (encrypted, `commit()`).
   * `min_pickup_km` (Float, def `0f`) → **`sec_min_pickup_km`** (encrypted).
   * `max_pickup_km` (Float, def `50f`) → **`sec_max_pickup_km`** (encrypted).
   * `min_drop_km` (Float, def `0f`) → **`sec_min_drop_km`** (encrypted).
   * `max_drop_km` (Float, def `100f`) → **`sec_max_drop_km`** (encrypted).
   * `location_filter_enabled` (Bool, def false) → **`sec_location_filter_enabled`** (encrypted).
   * `location_filters` (String JSON, def null) → `z4/b.b(json)` → writes **`sec_location_filters`** (encrypted, `commit()`).
   * `per_app_settings` (String JSON map `<appName,Boolean>`) → parsed with Gson (`z4/c` TypeToken), each entry written to **plain** prefs as **`app_enabled_<appName>`** = bool (`apply()`).
4. Builds the StateFlow mirror fields (see table below), reading initial values.
5. `c.registerOnSharedPreferenceChangeListener(this)` — listener registered **only on the plain default prefs** (sec_* changes are not mirrored).
6. `L = "app_language"` (exact literal, z4/d.smali:891-893) — the **language key**; `M/N` mirror `c.getString("app_language","en")`.

`z4/b` itself (`z4\b.smali`): fields `a:Context`, `b:String = "EncryptedPrefs"` (log tag), `c:Lq8/i;` lazy MasterKey (`c4/d`, `c4/c` builder, alias `_androidx_security_master_key_`), `d:Lq8/i;` lazy `SharedPreferences` = `c4/a` case 0 → `c4/b.a(context, masterKey)` = **EncryptedSharedPreferences file `encrypted_app_data`** (fallback `encrypted_app_data_secure`). `z4/b.a()` returns that `SharedPreferences`; `z4/b.b(json)` writes `sec_location_filters`. In its ctor it also *reads* `sec_app_language` (String, def `"en"`) and `sec_master_filter_enabled` (Bool, def `true`) — the created StateFlows are discarded (dead stores), but the two keys exist in the encrypted store.

### 1.2 String/constant fields

| Field | Literal value | Meaning |
|---|---|---|
| `L:Ljava/lang/String;` | **`"app_language"`** | language pref **key** (plain store) |
| `z4/b.b:Ljava/lang/String;` | `"EncryptedPrefs"` | log tag |
| ctor literals | `"context"`, `"encryptedPreferencesManager"`, `"getDefaultSharedPreferences(...)"`, `"appName"` | Kotlin intrinsic check-strings |
| migration keys | see §2 | |

There are **no other String key fields** in `z4/d`; every other key is an inline `const-string` (plain keys) or a `[S-table` decrypted literal (see xor_strings.txt).

### 1.3 StateFlow mirror fields (`p9/q0` = mutable, `p9/z` = read-only wrapper)

| Key (store) | Type | Default | Mutable field | Readonly field |
|---|---|---|---|---|
| `min_fare` (plain) | String → Int (`toIntOrNull`, fallback 50) | `"50"` | `e:Lp9/q0;` | `f:Lp9/z;` |
| `max_fare` (plain) | String → Int (fallback 500) | `"500"` | `n:Lp9/q0;` | `o:Lp9/z;` |
| `service_enabled` (plain) | Boolean | `false` | `p:Lp9/q0;` | `q:Lp9/z;` |
| `accepted_count` (plain) | Int | `0` | `r:Lp9/q0;` | `s:Lp9/z;` |
| `skipped_count` (plain) | Int | `0` | `t:Lp9/q0;` | `u:Lp9/z;` |
| `last_detected_fare` (plain) | Int | `0` | `v:Lp9/q0;` | `w:Lp9/z;` |
| `today_earnings` (plain) | Int | `0` | `x:Lp9/q0;` | `y:Lp9/z;` |
| `super_fast_mode` (plain) | Boolean | `false` | `z:Lp9/q0;` | *(none)* |
| `advanced_mode` (plain) | Boolean | `false` | `A:Lp9/q0;` | *(none)* |
| `sec_distance_filter_enabled` (encrypted) | Boolean | `false` | `B:Lp9/q0;` | `C:Lp9/z;` |
| `sec_location_filter_enabled` (encrypted) | Boolean | `false` | `D:Lp9/q0;` | `E:Lp9/z;` |
| `sec_location_filters` (encrypted, via `a()`) | String JSON → `List` (Gson `z4/c` TypeToken; empty list default `r8/r`) | null | `F:Lp9/q0;` | `G:Lp9/z;` |
| `ride_alert_enabled` (plain) | Boolean | **`true`** | `H:Lp9/q0;` | `I:Lp9/z;` |
| per-app map (via `b()`) | `LinkedHashMap<String,Boolean>` | see §1.5 | `J:Lp9/q0;` | `K:Lp9/z;` |
| `app_language` (plain) | String | `"en"` | `M:Lp9/q0;` | `N:Lp9/z;` |
| — | — | — | `L:Ljava/lang/String;` = `"app_language"` | (key holder) |

Non-mirrored keys (read/write only in code): `migrated_to_encrypted_v1`, `plan_expiry` (legacy), `app_enabled_*` individually (they aggregate into the `J/K` map), `sec_min_pickup_km`, `sec_max_pickup_km`, `sec_min_drop_km`, `sec_max_drop_km`, `sec_plan_expiry_ms`, `sec_app_language`, `sec_master_filter_enabled`, `history_json`.

**There is NO accept-timer key in SharedPreferences.** `accept_timer_title` / `accept_timer_desc` are UI i18n strings only (g5/b etc.); the "accept timer" is runtime behavior (countdown animation before tapping, removed by `super_fast_mode`/Shizuku per the desc string "The accept timer countdown animation will be removed and popups will appear instantly. Requires Shizuku."). `MainViewModel.t(J)V` / `k(String)J` are **subscription-plan** expiry/duration, *not* the accept timer (see §3).

### 1.4 `onSharedPreferenceChanged(SharedPreferences, String)` (z4/d.smali:1066-1407) — per key behavior

Dispatch is a chain of `d7/a.d(key, literal)` equals-checks; each branch re-reads the value from `c` (plain prefs) and pushes it into the mirror StateFlow via `q0.i(value)` (= `setValue`):

| changed key | re-read (type, default) | updated flow |
|---|---|---|
| startsWith `"app_enabled_"` (`l9/i.h1(key,"app_enabled_",false)`) | rebuild `b()` map | `J.i(map)` |
| `"min_fare"` | `getString("min_fare","50")` → `toIntOrNull` ?: 50 | `e.i(Int)` |
| `"max_fare"` | `getString("max_fare","500")` → ?: 500 | `n.i(Int)` |
| `"service_enabled"` | `getBoolean(…, false)` | `p.i(Boolean)` |
| `"accepted_count"` | `getInt(…, 0)` | `r.i` |
| `"skipped_count"` | `getInt(…, 0)` | `t.i` |
| `"last_detected_fare"` | `getInt(…, 0)` | `v.i` |
| `"today_earnings"` | `getInt(…, 0)` | `x.i` |
| `"super_fast_mode"` | `getBoolean(…, false)` | `z.i` |
| `"advanced_mode"` | `getBoolean(…, false)` | `A.i` |
| **`"ride_alert_enabled"`** | `getBoolean("ride_alert_enabled", true)` (default **true**, z4/d.smali:1361-1363) | `H.i(Boolean)` |
| `L` = `"app_language"` | `getString("app_language","en")` | `M.i(String)` |
| anything else (incl. all `sec_*`) | — | nothing |

### 1.5 `a()Ljava/util/List;` and `b()/b0orig()Ljava/util/LinkedHashMap;`

* `a()` (z4/d:928-979): `z4/b.a().getString("sec_location_filters", null)` → Gson-parse to `List` (`z4/c` token) → on null/parse-error returns empty list (`r8/r`). Mirrors `sec_location_filters`.
* `b0orig()` (z4/d:981-1064): for every `SupportedApp.Companion.getALL_APPS()` entry, `map.put(app.getName(), c.getBoolean("app_enabled_" + app.getName(), true))` → `LinkedHashMap<String,Boolean>` (app display name → enabled, **default true**).
* `b()` (z4/d:1409-1434): `b0orig()` then **`map.put("sec_plan_expiry_ms", Long.valueOf(0x7fffffffffffffffL))`** — i.e. the UI map carries a hard-coded `sec_plan_expiry_ms = Long.MAX_VALUE` entry (the flattened code does not read the pref here). Used for the UI's per-app/plan state (`J/K`).

### 1.6 `p9/q0` and `p9/z` — what they are

* **`p9/q0` = `kotlinx.coroutines.flow.StateFlowImpl`** (the class implements `p9/y` (MutableStateFlow), `p9/f` (Flow), `q9/q` (SurrogateKt marker); has `volatile _state:Ljava/lang/Object;` + `AtomicReferenceFieldUpdater f` and the exact error string `"MutableStateFlow.resetReplayCache is not supported"`).
  * `i(Ljava/lang/Object;)V` = **`setValue(value)`** (null → internal `NULL` sentinel, then `j(null, value)` = updateState/compareAndSet loop).
  * `getValue()Ljava/lang/Object;` = read `_state` (sentinel → null).
  * `f(value)` = `tryEmit`, `emit(value, cont)` = `setValue`, `j(expect, update)` = `compareAndSet`, `a()` = `resetReplayCache` (throws).
  * Factory: `p9/d0.a(Object)` = `MutableStateFlow(initial)`.
* **`p9/z` = `kotlinx.coroutines.flow.ReadonlyStateFlow`** — wraps a `p9/q0` (`p9/o0` = StateFlow interface) and delegates `collect`/`getValue`; no setter. Pattern in `z4/d`: `q0 = MutableStateFlow(x); z = ReadonlyStateFlow(q0)` — UI collects `z`, manager writes `q0.i(...)`.

---

## 2. Complete key inventory (for the native Settings port)

**Store A = plain `com.ride.accepter_preferences`** (write Settings values here unless noted).

| key | type | default | mirrored flow | readers / writers |
|---|---|---|---|---|
| `service_enabled` | boolean | `false` | `p`/`q` | write: `MainViewModel.r` (param), `f5/y` (true), `s()` (false), `RideAcceptorService.setServiceEnabled` / `toggleFromUi`, `OverlayService` stop button (`createOverlayView$lambda$8$lambda$7`), `b5/f` (network-loss runnable); read: `z4/d`, `RideAcceptorService.handleEvent` + `updatePreferences`, `OverlayService` |
| `ride_alert_enabled` | boolean | **`true`** | `H`/`I` | write: `h1/b` pswitch_6 (Settings "Alert on Accept" toggle → `z4/d.c.edit().putBoolean(...).apply()`); read: **`RideAcceptorService.executeAccept`** (`sharedPrefs.getBoolean("ride_alert_enabled", true)` → ToneGenerator alert), `z4/d` ctor+listener |
| `min_fare` | **String** (parsed as Int) | `"50"` | `e`/`f` | `z4/d`; `RideAcceptorService.updatePreferences` (`getString("min_fare","50")`) |
| `max_fare` | **String** (parsed as Int) | `"500"` | `n`/`o` | `z4/d`; `RideAcceptorService.updatePreferences` (`"500"`) |
| `app_language` | String | `"en"` | `M`/`N` (key name in `L`) | `z4/d` ctor+listener; language picker |
| `app_enabled_<SupportedApp.name>` | boolean | `true` | `J`/`K` map | write: `z4/d` migration (from `per_app_settings`), `b/g.f(Z)` (Apps-tab toggles, key `"app_enabled_" + appName`); read: `z4/d.b0orig`, `RideAcceptorService.updatePreferences` |
| `super_fast_mode` | boolean | `false` | `z` (no readonly) | `z4/d` |
| `advanced_mode` | boolean | `false` | `A` (no readonly) | `z4/d` |
| `accepted_count` | int | `0` | `r`/`s` | `z4/d`; `c5/j` (reset-stats → 0) |
| `skipped_count` | int | `0` | `t`/`u` | same |
| `today_earnings` | int | `0` | `x`/`y` | same |
| `last_detected_fare` | int | `0` | `v`/`w` | same |
| `migrated_to_encrypted_v1` | boolean | `false` | — | `z4/d` ctor (set true) |
| `plan_expiry` | long (legacy) | `0` | — | `z4/d` ctor (migration input only) |
| `distance_filter_enabled` `location_filter_enabled` `min_pickup_km` `max_pickup_km` `min_drop_km` `max_drop_km` `location_filters` `per_app_settings` | legacy | — | — | `z4/d` ctor (migration inputs only) |

**Store B = encrypted `encrypted_app_data`** (EncryptedSharedPreferences; fallback plain `encrypted_app_data_secure`).

| key | type | default | mirrored flow | readers / writers |
|---|---|---|---|---|
| `sec_plan_expiry_ms` | long | (ctor writes `0x7FFF…`; `b()` map hardcodes MAX) | embedded constant in `J`/`K` map | write: `z4/d` ctor (migration), **`MainViewModel.t(J)V`**; read: `RideAcceptorService.handleEvent` (`encryptedPrefs.getLong`, cached in `cachedPlanExpiry`, gates accepting) |
| `sec_distance_filter_enabled` | boolean | `false` | `B`/`C` | `z4/d` (migrate+read); `RideAcceptorService.updatePreferences` |
| `sec_location_filter_enabled` | boolean | `false` | `D`/`E` | same |
| `sec_min_pickup_km` | float | `0f` | — (raw read `MainViewModel.j()F`) | `z4/d` migrate; `RideAcceptorService.updatePreferences` |
| `sec_max_pickup_km` | float | `50f` | — (raw read `MainViewModel.h()F`) | same |
| `sec_min_drop_km` | float | `0f` | — (raw read `MainViewModel.i()F`) | same |
| `sec_max_drop_km` | float | `100f` | — (raw read `MainViewModel.g()F`) | same |
| `sec_location_filters` | String (JSON list) | `null` | `F`/`G` (via `a()`) | write `z4/b.b(json)`; read `z4/d.a`, `RideAcceptorService.updatePreferences` |
| `sec_app_language` | String | `"en"` | (read in `z4/b` ctor, flow discarded) | `z4/b` ctor |
| `sec_master_filter_enabled` | boolean | `true` | (read in `z4/b` ctor, discarded) | `z4/b` ctor |

*(g/h/i/j ↔ sec-key assignment inferred from the shared `[S`-table offsets (0x11c/0x12b/0x13c/0x14b ⇒ string lengths 15/17/15/17) combined with the read defaults 100f/50f/0f/0f: `g()=sec_max_drop_km`, `h()=sec_max_pickup_km`, `i()=sec_min_drop_km`, `j()=sec_min_pickup_km`. The two zero-default "min" getters could in principle be swapped; the maxes are certain.)*

**Store C = plain `ride_history`**: `history_json` (String, JSON array; entries `{app,fare,accepted,ts,loc}`) — `z4/g.a()` reads; `z4/e` (runnable built in `RideAcceptorService.logHistoryIfNew`) appends; `c5/j` `remove()`s it on stats reset; `MainViewModel.m()` parses it.

---

## 3. `MainViewModel` method summaries (`com\auto\accept\ui\viewmodel\MainViewModel.smali`)

Note: all prefs access goes through obfuscated accessor stubs (verified bodies): `com/google/firebase/remoteconfiginterop/۟ۤۢۧ;->۟ۧۢ۠ۧ` = `((Lz4/d;)o).c` (**plain store**), `r1/۟ۤۤۡ۠;->۟ۡۤۦ۠` = `((Lz4/d;)o).b` (z4/b), `t2/۟ۦۣۡۤ;->ۣ۟ۡ۟ۨ` = `((Lz4/b;)o).a()` (**encrypted store**), `com/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ` = `edit()`, `z0/ۣ۟۠ۤ۟;->۟ۤۤۨ` = `putBoolean`, `q6/ۡۨۧۨ;->ۦۦۢۡ` = `putLong`, `com/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟۟ۨۦۣ` = **`Context.stopService`**, `g7/۠ۤۧ;->۟ۧۤۨۤ` = **`Context.startService`** (returns ComponentName). Strings in parentheses are from `analysis\xor_strings.txt`.

| Method | Behavior |
|---|---|
| `e()V` | Permission/status refresh. Reads Settings.Secure `accessibility_enabled` + `enabled_accessibility_services` and checks whether `ComponentName(context, RideAcceptorService.class)` (`flattenToString`/`flattenToShortString`) is enabled; checks Shizuku alive and `PowerManager.isIgnoringBatteryOptimizations(pkg)`; publishes 3-4 Boolean StateFlows (accessibility / overlay-ish / Shizuku / battery). No prefs writes, no services, no Toast. |
| `f()V` | Launches coroutine `f5/o` on viewModelScope (background data refresh — Firestore/auth status). No prefs/services/Toast. |
| `g()F` | Reads `z4/b.a().getFloat(key, 100f)` → **`sec_max_drop_km`** (def 100f). Read-only. |
| `h()F` | Same store, def 50f → **`sec_max_pickup_km`**. |
| `i()F` | Same store, def 0f → **`sec_min_drop_km`**. |
| `j()F` | Same store, def 0f → **`sec_min_pickup_km`**. |
| `k(String)J` | **Plan-type → duration ms** (`'planType'`; `'DAY'`,`'WEEK'`,`'HALF_MONTH'`,`'MONTH'`,`'YEAR'`). Subscription plans, *not* the accept timer. No prefs. |
| `l(String)I` | Plan-type → price (₹) for the same 5 codes. No prefs. |
| `m()Lq8/f;` | `q8/f` = **Kotlin `Pair`**. Computes *today's* stats from `ride_history` prefs `history_json` (`z4/g`): filters entries with `accepted==true && ts >= today-start`, returns `Pair(acceptedCount, fareSum)`. Read-only. |
| `n()Z` | Internet connectivity check: `ConnectivityManager.activeNetwork` + `getNetworkCapabilities` capability flag (masked const `…^0x255`). No prefs. |
| `o()V` | If `authManager` uid != null, launches coroutine `f5/q(uid)` (load payment/subscription status from Firestore). No prefs/services. |
| `p()V` | **Empty no-op** (`return-void` only). |
| `q()V` | If the payment-state flow holds `f5/f` or `f5/d`, launches coroutine `f5/u(uid)` (payment verification). No prefs. |
| `r(Z)V` | **The master "start/stop service" toggle.** `true` path: preflight checks — each failure shows a **Toast**: `'No internet connection. Service requires internet.'`, `'No active subscription plan. Please subscribe first.'`, `'Please grant accessibility permission first.'`, `'<App> & <App> requires Shizuku to be running & paired. …'` (Ola/Uber packages `com.olacabs.oladriver`, `com.ubercab.driver`, `app.ola.driver`, …), `'No supported driver apps (Ola, Uber, Rapido, Porter, etc.) found on your device. Service cannot be started.'` — then writes **`service_enabled` = true** (plain store) and launches coroutine `f5/y(uid)` which writes `service_enabled=true` again and **`startService(Intent(ctx, KeepAliveService))`** (`f5\y.smali:867-877`). `false` path: writes **`service_enabled` = false** and **`stopService(KeepAliveService)`**. |
| `s()V` | **Full stop.** Cancels+clears the `Job` field `i`, writes **`service_enabled` = false** (plain store), **`stopService(KeepAliveService)`** and **`stopService(OverlayService)`** (`MainViewModel.smali:8706-8720`), resets UI flows ("Service Stopped" state, countdown cleared). Called by `c5/j` (reset) and the stop paths. |
| `t(J)V` | **Writes `sec_plan_expiry_ms` = J (putLong + commit) to the ENCRYPTED store** (`z4/b.a()`), and mirrors J into a StateFlow. This is the **subscription plan expiry**, not an accept timer. |
| `u(String,String)V` | `requireNotNull` on `'code'`, `'planType'`; if uid != null launches coroutine `f5/e0(uid, code, planType)` — creates/updates the payment request in Firestore. No prefs/services. |
| `v(I,String,String,Z)V` | `requireNotNull` on `'orderId'`, `'planType'`; if uid != null launches coroutine `f5/g0(...)` recording the payment/order result. No prefs/services. |
| `c(vm,String,String,cont)` | Static suspend body behind `u()`: Firestore payment-doc lookup/create; compares status literals `'PENDING'` / `'EXPIRED'` and updates the payment-state flows. No prefs writes, no services, no Toast. |
| `d(vm,String)V` | Cancels the `Job` field `i`, launches coroutine `f5/t(uid, s, true)` (payment-verification polling) and stores it in `i`. No prefs writes. |

---

## 4. GOAL 3 answers

### 4.1 `b/d` — what it is and what it does

`b/d` is an obfuscator-merged **`Function1`-style lambda class** (`Ld9/j`/`Lc9/c`; `a:I` selects one of several captured-lambda bodies — two `a(Lm0/o0;)` compose-layout cases, one Compose graphics case, and the default case). The relevant instance (constructed in the Dashboard **"Service Control"** composable `d5/o1.c`, cf. i18n keys `'service_control'`) captures: installed-apps `List`, per-app-settings `Map`, `Context`, an `onNavigateToApps` callback (`c9/a`) and the `MainViewModel`.

`invoke(Object)` default case = **the service toggle switch handler** (`Function1<Boolean, Unit>`):
* boolean `true` → `MainViewModel.r(true)` (start engine);
* boolean `false` → `MainViewModel.r(false)` (stop engine);
* before starting it validates: at least one supported app installed and at least one `app_enabled_*` true (else **Toast** `'Turn on at least one app in the Apps tab first.'`) and Shizuku running for Ola/Uber selections (else **Toast** `'Ola/Uber need Shizuku running. Review your app selection in the Apps tab.'`), then invokes the navigate-to-Apps callback.

Caveat: the flattened dispatch in this class is mangled (the `packed-switch` was folded into a `nop` + unconditional `goto :cond_4` at `b\d.smali:172-182`), so in the shipped bytecode the validation block (lines 184-275) is unreachable and every invocation falls through to `r(true)`; `r(false)` sits at `:cond_5`. Treat the validation strings as the intended UX, the `r(true)/r(false)` calls as the actual effect.

### 4.2 Where the engine reads `ride_alert_enabled`

* **`RideAcceptorService.executeAccept(...)`** (strings at `analysis\xor_strings.txt:418`): reads it **directly from prefs, not via z4/d state** — `RideAcceptorService.smali:3952-4005`:
  `sharedPrefs` field (`ۣۣۣۧ` accessor = `iget sharedPrefs`) → decrypt `'ride_alert_enabled'` → `getBoolean("ride_alert_enabled", true)` (accessor `com/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ` = `SharedPreferences.getBoolean`, default arg `1`=true) → if true plays the accept alert (ToneGenerator lambdas `executeAccept$lambda$27*`).
  `RideAcceptorService.sharedPrefs` is initialized in `onServiceConnected` via `h3/ۣ۟ۢۡۤ;->ۣ۟۠ۡ۠` = `o1/s.D(context)` → **`com.ride.accepter_preferences`** (plain).
* `z4/d.onSharedPreferenceChanged` mirrors the same key (plain store, default **true**) into flow `H`/`I` for the UI.
* The Settings "Alert on Accept" toggle (`h1/b` pswitch_6, `h1\b.smali:213-238`) writes **`putBoolean("ride_alert_enabled", checked)` + `apply()`** to `MainViewModel.b (z4/d).c` — i.e. the **plain default prefs**.

**⇒ The Settings toggle must write boolean key `ride_alert_enabled` (missing = enabled, default `true`) into the plain `com.ride.accepter_preferences` file.** Writing it to `encrypted_app_data` would be invisible to the engine. (The service also has an in-memory `static volatile alertOnAccept:Z = true` with `setAlertOnAccept(Z)` — runtime-only, not persisted.)

### 4.3 Prefs files of `RideAcceptorService` and `OverlayService` — same files as `z4/d`?

**Yes, exactly the same files.**

* `RideAcceptorService` has **two** prefs fields (`RideAcceptorService.smali:52,135`):
  * `sharedPrefs` ← `o1/s.D(context)` (helper `h3/ۣ۟ۢۡۤ;->ۣ۟۠ۡ۠`, `RideAcceptorService.smali:34952-34956`) = **`com.ride.accepter_preferences`** = `z4/d.c`. Used for `service_enabled`, `min_fare`, `max_fare`, **`ride_alert_enabled`** (`updatePreferences`, `handleEvent`, `executeAccept`, `setServiceEnabled`, `toggleFromUi` — the last two even use direct `edit()/putBoolean("service_enabled",…)/apply()`).
  * `encryptedPrefs` ← `c4/b.a(ctx, masterKey)` = EncryptedSharedPreferences **`encrypted_app_data`** (`onServiceConnected`, `RideAcceptorService.smali:34988-35003`), fallback `getSharedPreferences("encrypted_app_data_secure", 0)` (:35044-35063), else `null`. Used for `sec_plan_expiry_ms` (`handleEvent` → `cachedPlanExpiry`), and `updatePreferences`' `sec_distance_filter_enabled`, `sec_min_pickup_km`, `sec_max_pickup_km`, `sec_min_drop_km`, `sec_max_drop_km`, `sec_location_filter_enabled`, `sec_location_filters`, `app_enabled_*` — identical to `z4/b`'s store.
  * plus `rideHistoryManager = new z4/g(this)` → `ride_history` file.
* `OverlayService` has **no** prefs field; every access goes through the same helper `h3/ۣ۟ۢۡۤ;->ۣ۟۠ۡ۠` (`onCreate`, `onStartCommand`, overlay stop button) = **`com.ride.accepter_preferences`** — same file as `z4/d.c`. Its stop button writes `service_enabled` (putBoolean) there; `b5/f` (network callback runnable built from `r4/h`) shows `'⚠ No Internet'` and rewrites `service_enabled` in the same file, then `updateStatusDisplay`.

### 4.4 `getSharedPreferences` name literals (app-relevant; grep over `decoded-apktool\smali`)

| literal | site |
|---|---|
| `"encrypted_app_data"` | `c4\b.smali:48,106,161` + `getSharedPreferences(v0,0)` at `:216` (EncryptedSharedPreferences clone `create()`) |
| `"encrypted_app_data_secure"` | `z4\a.smali:89-93` (z4/b fallback), `RideAcceptorService.onServiceConnected` (fallback) |
| `"ride_history"` | `z4\g.smali:19-23` |
| `"_preferences"` (suffix; result = `getPackageName() + "_preferences"` = `com.ride.accepter_preferences`) | `o1\s.smali:135-163` (`o1/s.D` = `PreferenceManager.getDefaultSharedPreferences`) — used by `z4/d.c`, `RideAcceptorService.sharedPrefs`, `OverlayService`, `b5/f` |
| (no direct `getSharedPreferences` under `com\auto\` — all via the accessors above) | |

Other `getSharedPreferences` hits (`com/google/firebase/*`, recaptcha, `x5/a`, `c7/a|b`, `v5/ۧۥۢۡ`, …) are SDK-internal.

---

## 5. Porting checklist (exact contract for the native Settings UI)

1. **Plain store `com.ride.accepter_preferences`** (MODE_PRIVATE): `service_enabled`(bool,false), `ride_alert_enabled`(**bool,true**), `min_fare`(**string** "50"), `max_fare`(**string** "500"), `app_language`(string "en"), `app_enabled_<appName>`(bool,true), `super_fast_mode`(bool,false), `advanced_mode`(bool,false), `accepted_count`/`skipped_count`/`today_earnings`/`last_detected_fare`(int,0). `min_fare`/`max_fare` MUST be stored as **strings** (the engine `getString`s them).
2. **Encrypted store `encrypted_app_data`** (`EncryptedSharedPreferences.create(ctx, "encrypted_app_data", masterKey)`; if your port can't do Tink, at minimum keep the same file name and key names): `sec_plan_expiry_ms`(long), `sec_distance_filter_enabled`(bool,false), `sec_location_filter_enabled`(bool,false), `sec_min_pickup_km`(float,0), `sec_max_pickup_km`(float,50), `sec_min_drop_km`(float,0), `sec_max_drop_km`(float,100), `sec_location_filters`(JSON string), `sec_app_language`(string "en"), `sec_master_filter_enabled`(bool,true).
3. `ride_history` file: `history_json`.
4. Start/stop semantics: start = `service_enabled=true` + `startService(KeepAliveService)` (accessibility `RideAcceptorService` is enabled via system settings, never started by intent); stop = `service_enabled=false` + `stopService(KeepAliveService[, OverlayService])`.
5. `ride_alert_enabled` gate for the engine: plain store, default **true**.
