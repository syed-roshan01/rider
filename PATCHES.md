# Smali patches applied to `decoded-apktool/`

The decoded smali tree is gitignored (it is a reverse-engineering artifact and is
large), so the edits made to it are recorded here. Every patch is a hand edit to a
file under `decoded-apktool/smali/`. The originals are kept next to each file as
`<name>.smali.orig` (and `.patched` where an intermediate state was kept).

Build with `.\build.ps1 all` (dex -> build -> sign -> verify -> install).

**Two trees, do not confuse them:**

* `decoded-jadx/` - pristine decompile of `Ride Accepter-v6.apk`, read-only reference.
* `decoded-apktool/` - the build tree, hand-patched below.
* `orig-decode/` - pristine `apktool d` of the original APK; used to recover method
  bodies that had no `.orig` backup. Reference only.

---

## A. Licence / sign-in / payment removal

### A1. Remove Firebase sign-in - `smali/a5/j.smali`

`a5/j` is `AuthManager`. `b()Z` is "is signed in"; `a()Ljava/lang/String;` is the
current user id.

| method | becomes |
|---|---|
| `b()Z` | `.locals 1 / const/4 v0, 0x1 / return v0` |
| `a()Ljava/lang/String;` | `.locals 1 / const-string v0, "rideaccepter-local" / return-object v0` |

Effect: the sign-in / sign-up screens are never shown.

> Returning `Settings.Secure.ANDROID_ID` here crashed with `NoSuchFieldError: No field
> f1276a`, because jadx's field names are not the smali field names. A constant string
> is the safe substitute.

### A2. Bypass the plan-expiry comparison - `smali/com/auto/accept/ui/viewmodel/MainViewModel.smali`

One `cmp-long` + `if-lez` pair compared plan expiry against "now" and branched to the
paywall. Replaced with an unconditional `goto` of the same target:

```
cmp-long v0, v2, v4
if-lez v0, :cond_4        ->        goto :cond_4
```

Verified present by diffing the working file against `MainViewModel.smali.orig`
(only the working copy contains `goto :cond_4`).

### A3. Never-expiring plan mirror - `smali/z4/d.smali`

`z4/d` is `EncryptedPreferencesManager`. Its constructor mirrors the vendor's
`plan_expiry` key into `sec_plan_expiry_ms` (encrypted prefs), but only when > 0 and
only on first migration. Two edits:

1. `if-eqz v12, :cond_0` + `goto/16 :goto_6` -> `goto :cond_0`, so the read path is
   taken even on an already-migrated install.
2. Immediately after `move-result-wide v11` (`getLong("plan_expiry", 0L)`), insert
   `const-wide v11, 0x7fffffffffffffffL`, so `sec_plan_expiry_ms` = `Long.MAX_VALUE`.

### A4. Go straight to Dashboard after activation - `smali/c5/o.smali`  **(this is what removed the payment flow)**

`c5/o.g(...)` is the screen dispatcher. Line 321 chose between the home screen and the
subscription/payment screen with a single test:

```
if-eqz v11, :cond_a        ; truthy -> d5/o1.f() (Dashboard) / falsy -> y3/e.y() (payment)
        |
        v
nop                         ; always fall through to Dashboard
```

The payment screen `y3/e.y(...)` builds `d5/k2`, where every subscription string is
decoded ("CHOOSE YOUR PLAN", plan names). Unreachable, not deleted.

---

## B. Sever the vendor's cloud control plane

The original build phoned home to the vendor's Firebase project (`autoacccept`) and
could be remotely re-configured and force-updated. All app-side cloud traffic now
belongs to our own Supabase licence API.

### B1. Kill the push channel - `smali/com/auto/accept/service/MyFirebaseService.smali`

| method | becomes |
|---|---|
| `onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V` | `.locals 0 / return-void` |
| `onNewToken(Ljava/lang/String;)V` | `.locals 0 / return-void` |

Effect: no vendor push commands, no FCM token upload. Both return `void`, so this is a
contract-safe no-op.

### B2. Kill the remote APK installer - `smali/o7/d0.smali`

`N(Landroid/content/Context;Ljava/io/File;)V` runs a `PackageInstaller` session (stream
name `"AutoAccept-update.apk"`, commit action `"com.auto.accept.INSTALL_COMPLETE"`).
Becomes `.locals 0 / return-void`.

**This closes a remote-code-execution path:** `update_download_url` -> download ->
`PackageInstaller` -> new APK running. Returns `void`, contract-safe.

### B3. Neutralize the remote-config applier - `smali/com/auto/accept/ui/viewmodel/MainViewModel.smali`

`p()V` is the method that *applies* `AppConfig` to app behaviour - `maintenance_mode`,
`version_blocked`, `getForceUpdateVersion() > 6`, `update_download_url`, the vendor
dialog/toast. Becomes `.locals 0 / return-void`.

Returns `void`, contract-safe. `AppConfig` keeps its local default
(`new AppConfig(false,false,0,0,0,null,...)`), which the app is written to tolerate.

### B4. Cut the remote-config fetch - `smali/j2/*.smali` (the `a5/i0.a()` bridge)

The bridge `...۟ۢۤۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;` forwards to
`a5/i0.a(Lu8/e;)Ljava/lang/Object;` (409 lines of control-flow flattening). Rather than
patch inside it, its dispatcher guard is inverted to always take the branch the code
already had:

```
if-ltz v0, :cond_0        ->        goto :cond_0
```

`:cond_0` sets `v0 = 0` and returns it, so the method returns `null` - a result shape
this method already produced on its original path. The fetch never runs.

### B5. Repoint the help URL - `res/values/strings.xml`

`url_website` `https://rideaccepter.in/` -> `https://rider-theta.vercel.app/`.

---

## C. Reverted (speculative edits that were disproved)

Recorded so they are not re-applied:

* `MainViewModel.n()Z` (isInternetAvailable) had been stubbed to `const/4 v0, 0x1 /
  return v0`. **Reverted** - restored the real `ConnectivityManager` /
  `NetworkCapabilities` body from `MainViewModel.smali.patched`.
* `MainViewModel.r(Z)V` had gained `const/16 p1, 0x1` at its head, forcing the boolean
  parameter. **Reverted** - `b/d.java` calls both `r(false)` and `r(true)`, so forcing it
  risked making the service impossible to stop.

## D. Restored (earlier experiment had emptied live code)

* `smali/s2/*.smali` `...ۣۣۨ۟(Object;Object;Object;Object;Object;I)V` was emptied to 5
  lines. It has **two live call sites** (`d5/h1.smali:265`, `d5/o1.smali:13265`) and its
  6-parameter signature matches `d5/o1.i(...)`. **Restored** from its `.orig` (5 -> 27
  lines).
* `d5/o1.i(MainViewModel;UserProfile;Lc9/a;Lc9/a;Lm0/m;I)V` was emptied to 5 lines and
  had **no `.orig` backup**. **Restored** from `orig-decode/smali/d5/o1.smali`
  (5 -> 2464 lines). Backup of the pre-restore state: `d5/o1.smali.o1backup`.
* `d5/o1.i(...)` currently has no `invoke` sites of its own, but its wrapper above does,
  so both are kept intact rather than left half-empty.

## Not the paywall (each was tried and disproved)

* `com/auto/accept/data/model/UserProfile.smali` - `planExpiry` accessor and the 5
  boolean accessors. Forcing these also faked "already activated", which made the licence
  screen disappear. Reverted.
* `y3/e.k(...)` - the *checkout* screen shown after tapping a plan. Emptying it produced
  a white screen on tap. Reverted.
* `d5/l.a(...)`, `a0/v`, `ktxtesting/...` - lambda/plan-row fragments. Emptying them did
  not remove the payment screen. Reverted.
* `d5/o1.i(...)`, `s2/...` - built a plan-row lambda and a render wrapper. Emptying them
  did not remove the payment screen. (Now restored - see D.)
* `MainViewModel.n()Z` and `MainViewModel.r(Z)V` - forced to "subscribed"; no effect on
  the routing decision. (Now reverted - see C.)

---

## Regenerating `classes2.dex`

The injected activation screen lives in `apk-src/` and is compiled to
`decoded-apktool/unknown/classes2.dex`. `build.ps1 dex` does `javac` -> `d8` and then
verifies the output is newer than the sources, so a stale dex cannot ship.

## Build verification

`build.ps1` checks the output artifact is newer than the sources rather than trusting
`$LASTEXITCODE` (`apktool.bat` ends with `pause`, which resets `ERRORLEVEL` to 0), and
verifies all 1702 resource IDs survive the rebuild.

Latest: `classes.dex` 10,076,240 (original) -> 10,073,940 (patched); 1702/1702 resource
IDs identical.

## A5. Subscription/plan gate removed from Service Control (requested)

**Why:** entitlement is now enforced by our own cloud licence system (Supabase + Vercel admin panel,
Ed25519 device-bound tokens). The app's internal plan check was redundant and blocked service start.

**File:** `decoded-apktool/smali/com/auto/accept/ui/viewmodel/MainViewModel.smali` (method `r(Z)V`)
**Backup:** `MainViewModel.smali.orig2`

Control-flow-flattened gate, traced to one branch::

    :sswitch_2   check(...)Z -> v1          (the plan check)
    :sswitch_3   if-nez v1, :cond_1         false -> key 0x729 -> :sswitch_5 = message + return-void
                 :cond_1 / :sswitch_4       true  -> key 0x70a -> continue

**Patch (line 6367):** `if-nez v1, :cond_1`  ->  `goto :cond_1`

Result: the plan check can no longer divert to the message/abort path. Verified on device -
"No active subscription plan. Please subscribe first." no longer appears and the app is stable.

**Rejected approaches (do not re-try):**
- Redirecting `:sswitch_5`/`:sswitch_6` to `:sswitch_7` caused an **infinite dispatch loop -> ANR**
  ("Reason: executing service com.ride.accepter/...RideAcceptorService").
- `Get-Content`/`Set-Content` on these smali files **corrupts the Unicode method names**
  (apktool: "Error for input '�': Invalid text"). Always use `[System.IO.File]::ReadAllLines/WriteAllLines`
  with explicit UTF-8.
- `[Array]::IndexOf(, '    :sswitch_5')` matches the FIRST occurrence in the file, not the one in
  `r()`. Address these blocks by exact line number with an assertion before writing.

**Verification:** rebuilt, signed (ANDROIDD.SF/ANDROIDD.RSA), installed. 1702/1702 resource IDs unchanged.

## A6. Engine armed unconditionally (service toggle is dead in the UI)

**Finding:** the Service Control toggle does nothing - confirmed independently by the user tapping it
("it's just tapping, no change or no starting nothing") and by `dumpsys` showing `r()` is never invoked
(no `KeepAliveService` record ever appears). Not a coordinate/hit-target problem.

`MainViewModel.r(Z)V` turned out to be the **stop** path (its only prefs write is `service_enabled=false`).

**Real gate found** in `decoded-apktool/smali/com/auto/accept/service/RideAcceptorService.smali`::

    ۦۢ۠ۧ(Ljava/lang/Object;)Z          .method at L33338
      :sswitch_2   iget-boolean v0, p0, ...->serviceEnabled:Z
      :sswitch_3   return v0

`onAccessibilityEvent` calls it and drops events when false (same `if-nez v1, :cond_1` shape as `r()`).

**Patch (L33370):** `iget-boolean v0, p0, ...->serviceEnabled:Z`  ->  `const/4 v0, 0x1`
**Backup:** `RideAcceptorService.smali.orig`

**Effect:** the accessibility service (already bound with `capabilities=33`) now processes every window
event regardless of the dead UI toggle. Rebuilt, signed, installed.

**Consequence to remember:** the engine is now ALWAYS armed and will auto-accept when a fare matches the
filters. There is no working UI switch to turn it off - disable the accessibility service to stop it.

## D. Settings tab rendered natively; rows bound to the original handlers

**Goal:** the Settings tab of `DashboardActivity` (classes2.dex) renders the original Settings rows with
their original keys / titles / descriptions (g5/b localization table) but each row click calls the
**unmodified shipping handler** in classes.dex. No handler logic was reimplemented or edited.

**Bridges** appended to `decoded-apktool/smali/com/auto/accept/service/RideAcceptorService.smali`
(next to `setServiceEnabled`/`setDetectOnly`/`setAlertOnAccept`, block 1 + block 2, ASCII-only smali):

| Bridge | Delegates to (untouched) | Original construction site |
|---|---|---|
| `settingsHideDevOptions(Context)` | `Lz/p;->invoke()V` default case (dispatch 7) | `d5/k1.smali:2416` `(Context, g1{Boolean Shizuku-ready}, l3 lang, 7)` |
| `settingsSaveLanguage(Context,String)` | `Lz/p;->invoke()V` `:pswitch_0` (dispatch 6) | `d5/k.smali:3966` `(MainViewModel, Context, g1{String}, 6)` |
| `settingsAlertOnAccept(Z)` | `Lh1/b;->invoke(Object)` `:pswitch_6` (dispatch 13) | `d5/a.smali:2544` `(MainViewModel, 13)` |
| `settingsShizukuGrant(Context)` | `Lc5/p;->invoke()V` (dispatch 2) | `d5/k1.smali:5641` `(Context, g1{Lg5/c;}, 2)` |
| `settingsOpenUrl(Context,int)` | `Lk4/p;->invoke()V` (dispatch 2/3/4) | `y3/e.smali:55553/55575/55597` |
| `settingsAcceptTimer(Context,Z)` | `Lb/g;->invoke(Object)` `:pswitch_3` -> `f(Z)` (dispatch 21) | `s/k.smali:984` `(Context, g1{Boolean Shizuku-ready}, g1{checked}, 0x15)` |
| plumbing: `uiInit/uiZ4/uiVm/uiLang/uiLangs/uiText/uiBool/uiInt/uiString/uiZeroAnim` | `z4/d` store + `g5/b.a` table + `g5/b.b(key, lang)` + `Settings.Global` reads | read-only accessors |

`uiLangs()` flattens `g5/b.a` (`List<g5/a>`, `a`=ISO code, `b`=English name, `c`=native name) into
`[code, name, nativeName] * n`, so the Settings language picker lists all **9** shipping languages
(en, hi, ta, kn, te, ml, mr, bn, pa) with the original display names instead of the 5-entry UI
fallback. Verified on device: picker shows 9 entries; saving Bengali persisted `app_language=bn`,
re-rendered the whole page through `g5/b`, and restored to English cleanly.

Dispatch constants are the same XOR constants the shipping call sites recompute (dev 7, language 6,
alert 13; Shizuku 2 literal; URL 2/3/4 recomputed from `y3/e` XOR pairs: `0x2eb^0x2e9=2`,
`0x256^0x255=3`, `-0x212^-0x216=4`). The `Lm0/g1`/`Lm0/l3` states passed to the lambdas are built with
the same `Ld7/t;->g0`/`Lm0/n3;` factories the composables use; the Shizuku gate mirrors
`d5/o1.smali:19908` (`Shizuku.checkSelfPermission() == 0`, i.e. `la/g.c()I`).

**UI changes** (`apk-src/com/ride/accepter/ui/DashboardActivity.java`):
- `show()` case 4 now calls `buildSettings(page)` (no more launching `com.auto.accept.ui.MainActivity`;
  `openOriginalSettings()` removed).
- Rows use the original string keys via `uiText` (`shizuku_engine_status`, `shizuku_*_title/_desc`,
  `grant_shizuku_btn`, `select_language`, `select_language_sub`, `save_language`, `alert_on_accept`,
  `play_sound_on_accept`, `accept_timer_title/_desc`, `anti_detection_title/_desc`, `hide_btn`), with
  English fallbacks from `analysis/settings_strings.json`.
- State reads go through `uiBool`/`uiLang` on `z4/d`'s store (`com.ride.accepter_preferences`), the same
  SharedPreferences the engine reads. `ride_alert_enabled` default **true** (original), `app_language`
  default `en`.
- **Ola accept timer remover** (`accept_timer_title` / `accept_timer_desc`) switch is bound to the
  original `Lb/g;` lambda ("Zero Animation Mode"): `invoke(Boolean)` packed-switch key `0x15` ->
  `:pswitch_3` -> `f(Z)` default body (`f(Z)` key `0x14` is the per-app toggle; anything else is
  zero-animation). Gate = captured Shizuku-ready state (`la/g.c()I == 0`, toast literal
  "Enable Shizuku first to use this feature" when false), then `settings put global
  window_animation_scale|transition_animation_scale|animator_duration_scale <0|1>` via Shizuku and
  `Log.d "ShellTapExecutor"` `"⚡ Zero Animation Mode set to scale=<z>"`. Checked state mirrors
  `Settings.Global.window_animation_scale == 0f` (`uiZeroAnim`) - the original keeps **no pref** for
  this row.

**Unchanged:** all handler bytecode in classes.dex (`Lz/p;`, `Lh1/b;`, `Lc5/p;`, `Lk4/p;`, `z4/d`,
`g5/b`), pref keys (`app_language`, `ride_alert_enabled` on `com.ride.accepter_preferences`), and the
existing A1-A6 / B1-B6 patches.

## E. Universal platform scanner (all 12 supported apps auto-accept)

**Goal:** make auto-accept work for every `SupportedApp.ALL_APPS` platform, not only the ones whose
accept button is labelled "accept"/"confirm".

**The gap (decoded):** `routeToScanner` dispatches on the name only for `Ola`/`Uber`; **everything
else** falls to `scanNodeForRapido`, whose button matcher only knows the needles `accept`/`confirm`
(fused `StringsKt.contains(text, needle, ignoreCase)`). Buttons labelled `Start`/`Take`/`Pick`/
`Grab`/Hindi were never matched. (`SupportedApp.acceptKeywords` is dead metadata in this build -
nothing outside the model reads it.)

**The fix** - `scanNodeAllApps(Node, SupportedApp)`, appended to
`decoded-apktool/smali/com/auto/accept/service/RideAcceptorService.smali` (block 4, ASCII-only;
Devanagari via `\u` escapes), hooked at `routeToScanner`'s fallback branch (the `۟ۤۨۤ` wrapper
invoke -> now `invoke-direct {p0, p1, p2}, scanNodeAllApps(...)`). Behaviour:

1. Runs the proven `scanNodeForRapido` first - **byte-identical behaviour preserved** for every
   popup the original handles.
2. Extra pass over `fetchIterableNodes` output (text = `getText()` + `getContentDescription()`):
   - **overlap guard**: any text containing `accept`/`confirm` -> return early (the original owns
     that popup) - zero double-fire by construction.
   - **extended accept labels**: `start take pick grab claim order book approve receive continue
     proceed offer` + Hindi `\u0938\u094d\u0935\u0940\u0915\u093e\u0930` (swikar), `\u092a\u0941\u0937\u094d\u091f\u093f` (pushti),
     `\u0936\u0941\u0930\u0942` (shuru), `\u0938\u094d\u0935\u0940\u0915\u0943\u0924`, `\u092c\u0941\u0915` (book).
   - **exclusions** (labels/rejects, never a button): `reject pass skip decline cancel close later
     ignore location address detail km kg min ₹ call chat more` + 40-char size gate.
   - accept node via the existing `findClickableAncestor`.
   - fare = max number inside currency-bearing texts (`₹/$/€`) via the existing `extractAllNumbers`;
     distance slots via the existing `extractDistance` (first two hits = pickup/drop).
3. Decides through the **existing** `processRideDecision` bridge (`۟ۤۤۡ۠`, name bytes copied from the
   shipping call sites, never retyped) with the decoded contract:
   `(service, fare, bonus=0, pickupKm, dropKm, [texts], acceptNode, rejectNode=null, app.getName())`.
   The engine's `0.0 = unknown` convention is preserved (Uber itself passes `0,0` for the km pair);
   every filter (min/max fare, km windows, Go-To/avoid areas) and the tap (`executeAccept`:
   accessibility click + Shizuku retry) are the untouched shipping code.

**Constraints hit while assembling:** 35c invoke lists only reach `v15` (param regs sit above with
`.locals 24` -> everything moved into `v0..v13` first), and long backward jumps need `goto/16`.

**Verification:** `apktool b` + `build.ps1 sign` + install OK (install-time ART verifier accepted the
method); `dexdump` shows the hook and all five reuse calls assembled; on device the service runs
(`Service is running`) with zero crashes. End-to-end acceptance needs a live offer popup from one of
the 12 apps - watch logcat `RideAcceptor` for `✅ <App> ACCEPTED: ...` / ` Skip: ...` lines.

## F. AcceptPro rebrand + logo

- **Logo**: `AcceptPro Neon Speedmark Logo.png` (1254×1254) resized to 512×512 and written over
  `res/drawable/logo.png` (original backed up to `analysis/smali-backups/logo.png.orig`). The
  launcher foreground `logo_launcher_foreground.xml` = `<inset android:drawable="@drawable/logo">`,
  so the adaptive icon updates automatically. `ic_launcher_background.xml` recolored to the
  logo's near-black (`#00070F` / `#000A14`) so the icon frame blends seamlessly with the logo.
- **Name**: `res/values/strings.xml` `app_name` → `AcceptPro` (launcher label); manifest
  accessibility-service label → `AcceptPro Service`.
- **Engine strings** (classes.dex, `const-string` swaps only - no logic touched):
  `d3/ۡۨۢۦ.smali` ("Ride Accepter Pro"→"AcceptPro"), `o2/f.smali` (update dialog title),
  `o7/d0.smali` (update prompt), `u/l1.smali` (about text).
- **UI** (`DashboardActivity`): hero header now shows the logo
  (`getIdentifier("logo","drawable",…)` ImageView) + "AcceptPro"; all in-app copy renamed
  (permissions explainer, Shizuku toast, footer).
- Package `com.ride.accepter` and all engine class names kept (the a11y binding and every
  reflection bridge depend on them) - only user-visible branding changed.

## G. Logo-theme UI + dark/light theme switch

- **Palette extracted from the logo** (`AcceptPro Neon Speedmark Logo.png`): neon mint
  `#03FFB1`, lime `#9CFF95`, cyan `#02FFFF` on near-black `#00070F` (hue histogram of the
  512px source). Dark theme = those exact tones; light theme keeps the clean original look.
- **Two-theme system**: all former `static final` palette constants became instance fields
  filled by `applyTheme()` from pref `ui_dark` (default `true` = the logo's neon dark).
  `setTheme()` persists + re-tints chrome (root, nav, status bar, nav bar; light theme flips
  `SYSTEM_UI_FLAG_LIGHT_STATUS_BAR`) + rebuilds the page.
- **Screens re-themed** via palette fields: hero (navy gradient + neon `GREEN→CYAN` speedmark
  rail + mint status text), cards/rows, stat tiles, warn/quick cards, bottom nav (selected
  pill `NAV_SEL_BG`), buttons (`bigButton` gradient fill + `onColor()` auto ink; `smallButton`
  tint stronger on dark), dialogs (picker selection = `SEL_BG`/`SEL_INK`, input + buttons).
- **Switch UI**: Settings > Appearance with "Neon Dark"/"Light" pills (`themePill`), plus a
  quick `DARK`/`LIGHT` pill in the hero header that flips the theme in one tap.

## H. UI/UX upgrade: real toggles + matching brand header

- **`ToggleSwitch`** custom widget (Canvas: rounded track + sliding knob, 46×26dp) replaces
  every text `On`/`Off`/`Watching`/`Paused` affordance: dashboard engine + detect rows
  (`switchRow`), Settings feature toggles (`toggleRow`), engine-bound toggles
  (`boundToggleRow`), and per-app rows (`appRow`). Track fills with the row accent when on
  (mint/cyan/etc.), theme-aware off-track + knob (`SW_OFF`/`SW_KNOB`). Pixel-probe verified:
  OFF = knob-left + `#22384F` track, ON = accent track + knob-right.
- **Home header rebuilt as a fixed brand plate** — the logo's dark navy (`#0A2438→#030D1A`)
  with neon hairline, IDENTICAL in both themes (theme no longer recolors it - fixes the
  mismatched look): logo chip (36dp logo in rounded mint-stroked container) + wordmark +
  tagline, theme pill top-right, `GREEN→CYAN` speedmark rail, `● Online/○ Standby` status
  pill (tinted chip), mint status headline. New fixed constants `NEON/PLATE_*`.
- **Section chrome**: `head()`/`title()` get neon gradient kicker bars; rows standardised on
  accent rails; buttons keep gradient fill + auto-contrast ink.
- **Theme persistence fix**: `setTheme` writes `ui_dark` with `commit()` (sync) - `apply()`
  could be lost to `force-stop` before the async write flushed.

## I. Launcher fix + Apps tab (all 12 platforms, engine-bound)

- **Launcher bug**: `com.ride.accepter.activation.ActivationActivity` held the
  `MAIN/LAUNCHER` intent-filter, so tapping the icon opened the old screen. The filter moved
  to `DashboardActivity`; `cmd package resolve-activity` now reports
  `com.ride.accepter/.ui.DashboardActivity` (verified on a fresh uninstall/install).
- **Apps tab**: segmented switch on top - `Installed` (default) / `All apps` - with all 12
  `SupportedApp.ALL_APPS` platforms (Ola, Uber, Rapido, Namma Yatri, Swiggy, Zomato, Zepto,
  Blinkit, BigBasket, Dunzo, Porter, Instamart - in that spec order) with per-app
  `ToggleSwitch`es and `Installed / Not installed` status lines. `Installed` lists only the
  rider apps present on the device; `All apps` lists everything. Default toggle state:
  installed rider apps ON, everything else OFF (seeded once into `app_enabled_<name>`, never
  overriding user changes). Layout gotcha: `spacer()` is MATCH_PARENT-width (for vertical
  stacks) and squeezes weighted children to 0dp inside horizontal rows - the segment gap
  needs an explicit `dp(10)` width.
  - **Toggle binding (decoded)**: the engine reads `app_enabled_<SupportedApp.name>`
    (default `true`) from the plain `com.ride.accepter_preferences` store
    (`updatePreferences` -> `sharedPrefs`; original Apps-tab writer `b/g.f(Z)`:
    `"app_enabled_".concat(name)` -> `putBoolean` -> `commit()`). The UI mirrors that exact
    write and calls the new **`setAppEnabled(String,boolean)`** bridge which repeats the write
    through the service's own `sharedPrefs` and invokes the engine's own private
    `updatePreferences()` for a live reload (same pattern as `setServiceEnabled` via the
    `overlayToggleTarget` instance field). No engine logic reimplemented.
  - **Installed detection targets RIDER apps, not user apps**: a package counts only when it
    matches the platform's brand keyword AND a rider-side marker (`driver|partner|captain|
    rider|delivery|courier`) - so `com.rapido.rider` counts as Rapido while
    `com.olacabs.customer`, `com.ubercab`, `com.grofers.customerapp`, `com.zeptoconsumerapp`
    and `com.rapido.passenger` are correctly ignored. Verified 12/12 against `pm list
    packages -3 --user 0` ground truth. `QUERY_ALL_PACKAGES` added so the scan sees all
    packages on Android 11+.
  - **Logos (official brand marks, app-icon style)**: each row shows a 44dp rounded-square
    white tile (dp(11) radius, outline-clipped) with the platform's official logo -
    sourced as real app-store icons where available (Ola Driver, Uber Driver, Rapido Rider,
    Zomato Delivery, Swiggy Delivery, Zepto, BigBasket, Instamart Rider, 512px) and brand
    marks otherwise (Namma Yatri, Dunzo, Blinkit, Porter), normalized to 256x256 PNGs at
    `res/drawable/ic_logo_*.png`. Verified per-tile by pixel probes (brand colors match).
- **Verified**: fresh install -> launcher icon opens the new UI (0 activation texts); Apps tab
  shows 12 rows with status tags; tapping Rapido pixel-proved the switch flip
  (mint track + knob-right -> knob-left + `#22384F`) = handler ran = pref written + bridge
  poked `updatePreferences()`.

## J. Filters: Go-To drop zones (map search + exact area / radius)

Requested: "location when enabled / if anyone drop location is that I should be the one to
get it first within an instance / through map search / exact area or nearby radius of 1km
or any / simple / 100% work with no errors".

**Engine contract (decoded, unchanged logic).** The engine already ships a Go-To/avoid
location gate inside `processRideDecision`:

| Item | Value |
|---|---|
| enable flag | `sec_location_filter_enabled` (boolean, encrypted store) |
| rules | `sec_location_filters` = Gson `List<Map<String,Object>>` |
| rule schema | `{"keyword": "<needle>", "isAccept": true}` (true = Go-To, false = avoided) |
| save path (original) | `d5/e0` builds `mapOf(Pair("keyword",s), Pair("isAccept",Boolean))` -> `toJson` -> `z4/b.b()` |
| load path | `updatePreferences()` -> `Gson.fromJson(json, new z4/c().getType())` -> `locationFilters` |
| matcher | `StringsKt.contains(dropText, keyword, ignoreCase)` (text-only) |
| verdicts | Go-To match -> accept; no Go-To match -> ` Skip: location doesn't match any Go-To area`; avoid match -> `location matches avoided area '<k>'` |

So a zone's "exact area / radius" is expanded at save time into keyword needles (area
names, streets, pincodes from Android `Geocoder` sampling: centre + 12 ring points for
radius zones) and written as Go-To rules. Matching drops hit the engine's accept path
first (detect-only logs `would have accepted`); non-matching drops are skipped.

**UI (DashboardActivity `buildZones`, Filters tab).** Master switch "Go-To areas"
(persist `ra_state.location_filter`), zone list (name + mode chip `Exact area` or
`N km radius` + match-word count + delete), **Add area on map** (Leaflet map with centre
pin + `Geocoder` search for place names and pincodes + result picker + "Use this point"),
zone setup (name auto-filled by reverse geocode, `Exact area`/`Nearby radius` pills,
500 m/1/2/5/10 km chips + custom km), and a **Test** tool (types a drop address -> UI
verdict + real engine verdict via `testZoneEngine`). Zone records persist in `ra_state`
(`ra_zones`); the engine push emits only `keyword`/`isAccept:true` rules.

**Bridges appended to RideAcceptorService.smali** (ASCII-only, delegate only):
- `settingsLocationFilters(String json, boolean on)` - `z4/b(Context).b(json)` (the
  engine's own writer) + `sec_location_filter_enabled` + `updatePreferences()` reload.
  Falls back to `uiCtx` when the a11y service is unbound so writes never silently drop.
- `testZoneEngine(String drop)` - saves `detectOnly`, sets it true, calls the real
  `processRideDecision(100.0, 0.0, 5.0, 5.0, [drop], null, null, "AcceptPro Test")` via
  `invoke-direct/range`, restores `detectOnly`. Diagnostic `AcceptPro-Test` log lines show
  TypeToken resolution, `loc-enabled`, `loc-filters` count.

**Root-cause fixes found while proving it end-to-end:**

1. **`z4/c` generic signature was stripped by R8** (43-byte class, no `Signature`
   annotation). Gson's `TypeToken` then threw `IllegalStateException` ("TypeToken must be
   created with a type argument...") and `updatePreferences`'s `.catch Exception` turned
   every load into an empty rule list - the Go-To gate was dead **in the original APK
   too**. Restored the annotation `Lu7/a<Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;>;`
   (+ a proper `<init>`) in `z4/c.smali`. Verified: `u7.a<java.util.List<...>>` in logcat
   and `loc-filters=91` loaded.
2. **Store mismatch**: UI `readBool()` delegates to engine `uiBool` while the master
   switch wrote `ra_state`; `sec_location_filter_enabled` therefore synced as `false`.
   All master-state reads/writes now use `prefs` (`ra_state`) directly.
3. **build.ps1 d8 invocation overflowed cmd's 8191-char limit** (~75 deep class paths);
   the classes are now zipped (`build\classes.jar`) and passed as one argument (d8 accepts
   zip/jar inputs; its `@argfile` cannot quote paths containing spaces).

**Verified on device** (`adb logcat -s AcceptPro-Test -s RideToggle`, a11y service bound):
zone saved from a pincode search (`600028` -> Chennai) as `1.0 km radius - 31 match words`;
negative probe `999999zz` -> engine decision done with **no accept** (Go-To gate rejected);
positive probe `600028` -> `DETECT-ONLY: would have accepted - no tap performed`.
Evidence: `build/shot_zones_card.png`, `build/shot_zone_test.png`, `build/shot_goto_zone.png`.
