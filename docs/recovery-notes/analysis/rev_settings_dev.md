# Ride Accepter — Settings: Developer-Options / Shizuku / Permissions section — 1:1 reverse map

Scope: the Settings-tab cards that implement **Hide Developer Options (anti-detection)**, the **Quick Setup & Permissions** guide, the **Shizuku status/action** UI, the **service-status card** ("Grant permissions first"), and all their click handlers, plus the Shizuku shell layer. All paths relative to workspace root. Line numbers refer to the UTF-8 smali as read with the `read`/`grep` tools.

---

## 0. Decoding legend (verified conventions)

| Obfuscated | Real meaning |
|---|---|
| `Lm0/l3;` | `androidx.compose.runtime.State` — single method `getValue()Ljava/lang/Object;` (read via wrapper `Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;`) |
| `Lm0/g1;` | `androidx.compose.runtime.MutableState` — `getValue()` + `setValue(Ljava/lang/Object;)V` (e.g. `c5/p.smali:602`) |
| `invoke-static {k, lang}, Li/ۣۢۦ۠;->۟۠ۦۣ(Object,Object)String` | `g5/b;->b(String key, String langCode)` — UI-text localization (`i\ۣۢۦ۠.smali:57`) |
| `Lg5/b;->a(Context,String)V` | apply-locale helper (called on language save, `z\p.smali:671`) |
| `Lg5/c;` | `enum` with 4 constants `a,b,c,d` (`g5\c.smali:1-14`) — **Shizuku state enum** (see §3.3) |
| `Ll6/ۥۦۣ۟;->ۧ۟ۥۥ(Lg5/c;)I` | enum → ordinal/int code (`d5\k1.smali:4823`) |
| `Ld7/a;->m(Object,String)V`, `Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Object,Object)V` | `Intrinsics.checkNotNullParameter(obj, "name")` |
| `Lq5/۟ۥۣۢۨ;->ۣۤۤۢ(Context,Intent)V` | `Context.startActivity(Intent)` |
| `Lm7/ۡۢۦۢ;->۟ۧۢۥۧ(Context,CharSequence,I)Landroid/widget/Toast;` + `Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۢۦۢ(Toast)V` | `Toast.makeText` + `Toast.show` |
| `La7/a;->t(String,String,String)V` | `Log.e(tag3, tag1+msg)`-style wrapper (used as `Log` on errors) |
| `Lc1/ۣۡۢۦ;->۟ۢۤۧۢ(composer, I key, Object fn)Lu0/b;` | `composableLambda(composer, key, fn)` — wraps a content composable before passing it to Button |
| `Lc0/ۦۢۦۥ;->ۧۧ۟ۥ(12 args + II)V` | the **Button** wrapper used by k1: `Button(onClick=arg1, modifier=arg2, enabled=arg3:Z, …, content=arg10)` |
| `Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۢۦۤۤ(25 args)…V` | the **Text** composable (text = arg1) used to render button labels/rows |
| `Lk1/ۨ۟ۧۡ;->۟ۦۨۡۦ(Object stepNo, Object title, Z done, Object icon, Object onClick, composer, I)V` | the **SetupStep row** composable (= `Ld5/o1;->l('stepNumber','title',done,'icon','onClick')`) |
| `new-instance a0 … Landroidx/fragment/app/a0;-><init>()V` + `throw` | **junk**: `Landroidx/fragment/app/a0;` is a Throwable created and thrown in dead trampoline blocks (e.g. `d5\k1.smali:4851-4855`, `d5\f0.smali:632-636`, `5304-5308`) — never a lambda |
| `const-string "XXXX"` + `Float/Integer/Double.valueOf` + `System.out.println` in ctors/branches | NP-Manager junk blocks — ignore |
| XOR strings | decrypted per method in `analysis\xor_strings.txt`, listed **in call order** (verified against call-site counts in every target file); accessor strings in `analysis\accessor_strings.json` |

---

## 1. Screen composition

`Ld5/o1;->k(MainViewModel,Composer,I)` is the Settings tab; it stacks cards, each an instance of a **NP-merged composable class** (one class = N original composables, discriminated by an `I` dispatch stored via `Ld9/j;-><init>(I)V` + a per-class field `a:I`):

| Class | Card | Bridge that calls it |
|---|---|---|
| `Ld5/u;` `a(Ly/v;Lm0/m;I)V` | **“Quick App Setup & Permissions”** setup guide (4 numbered steps + email row) | `s0\ۢۨۦ۟.smali:353` |
| `Ld5/k1;` `a(Ly/v;Lm0/m;I)V` | merged 2-way: **case 0 = “Hide Developer Options” (anti-detection) card**, **case 1 = Shizuku status card** | `f0\ۣۦۦ۠.smali:384` |
| `Ld5/b0;` `e(Object,Object,Object)` | **service-status card** (Home) incl. “Grant permissions first” | bridge `e` → internal `a(…)` |
| `Ld5/f0;` `a(Ly/a1;Lm0/m;I)V` | **button-label renderer** (Shizuku action button / Save Filter button) | `u\ۤ.smali:185` |
| `Ld5/t;` `b(Ly/a1;Lm0/m;I)V` | **button-label renderer** (“Hide”, “SAVE LANGUAGE”, …) | `com\google\firebase\annotations\ۣۢۢۦ.smali:35` |

`Ly/a1;` is a Compose **scope** interface (its only method returns `Ly0/o;` = Modifier), i.e. `t.b`/`f0.a` render only the *label*; the **onClick lambda is passed by the parent** as the first argument of the Button wrapper.

### 1.1 `Ld5/k1;` fields/ctors (`d5\k1.smali`)
* fields: `a:I`, `b:Lm0/l3;`, `c:Lm0/g1;`, `d:Landroid/content/Context;`
* ctor #1 `<init>(Lm0/g1;Lm0/g1;Landroid/content/Context;)V` (line 320): `a=0`, `c=p1` (g1), `b=p2` (g1 read as l3), `d=p3`; super dispatch `sget Lz8/۟ۧۡۥۥ;->ۦ۠ۤ۟:I xor-int/lit16 -0x344` (333-337).
* ctor #2 `<init>(Lm0/g1;Lm0/g1;Landroid/content/Context;I)V` (line 392): `a=1`, `b=p1`, `c=p2`, `d=p3`; **p4 is ignored**; super dispatch `sget Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۡۥۤۡ:I xor-int/lit8 -0x4d` (405-409).
* `a(...)` reads at 556-578: `v29`=Context (field d), `v30`=`Lm0/g1;` (field c), `v32`=lang `Lm0/l3;` (field b), `v4`=field `a` → `packed-switch` at 596 selects merged case (0/1). Casts confirm the case split: case 0 casts `v30.getValue()` to **`Ljava/lang/Boolean;`** (2376-2382), case 1 casts it to **`Lg5/c;`** (4817-4823).

---

## 2. Row inventory (1:1)

### 2.1 `Ld5/k1;->a` **case 0 — “Hide Developer Options” (anti-detection) card**
Strings in call order: `$this$Card`, `Filled.Security`, `anti_detection_title`, `anti_detection_desc`, `enable_shizuku_first`, `\u26a0 `, (junk) …

| UI element | Key | English text | State source | Handler |
|---|---|---|---|---|
| Card header icon | `Filled.Security` (k1.smali:592) | shield icon | — | — |
| Card title | `anti_detection_title` (:2192) | **“Hide Developer Options”** (the literal lives in `u\ۣۤۧ۠.smali:400` accessor `ۣۤ۟ۢ()` and is the *value* of this key — pair at `g5\b.smali:885-893`) | — | — |
| Card description | `anti_detection_desc` (:2274) | “Prevents ride apps from detecting Developer Options or blocking auto-accept.” | — | — |
| **“Hide” button** | label `hide_btn` (:6450 in `d5\t.smali`) = “Hide” | see §3.1 | enabled/checked arg `v17` = `v30.getValue() as Boolean` (:2376-2384) = the **Shizuku-ready flag** handed down from the parent | **`Lz/p;` default case** (constructed k1:2416-2428) |
| Warning chip | `\u26a0 ` + `enable_shizuku_first` (:2549-2575) | “⚠ Enable Shizuku first to use this feature” | shown when `v30.getValue() as Boolean == false` (test at :2480-2502) | — |

The Button is assembled at `d5\k1.smali:2436-2468`:
```
2416 new-instance v15, Lz/p;
2418     sget v5, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۡۤ۠:I
2420     xor-int/lit16 v5, v5, -0x2e8            ; dispatch (value ∉ {3,4,5,6} → default “Hide” case)
2428     invoke-direct {v15, v29, v30, v32, v5}, Lz/p;-><init>(Landroid/content/Context;Ljava/lang/Object;Lm0/l3;I)V
2430 new-instance v5, Ld5/t;
2406     sget v4, Lo8/۟ۢۧۢۤ;->ۤۡۢۥ:I
2408     xor-int/lit16 v4, v4, -0x3b0            ; t.b label dispatch → 'hide_btn' body
2434     invoke-direct {v5, v32, v4}, Ld5/t;-><init>(Lm0/l3;I)V
2452     invoke-static {v25, key, v5}, Lc1/ۣۡۢۦ;->۟ۢۤۧۢ(...)Lu0/b;    ; composableLambda(label)
2468     invoke-static/range {v15 .. v27}, Lc0/ۦۢۦۥ;->ۧۧ۟ۥ(...)V      ; Button(onClick=v15, content=v24)
```

### 2.2 `Ld5/k1;->a` **case 1 — Shizuku status card**
Strings: `shizuku_active_title`, `shizuku_permission_title`, `shizuku_stopped_title`, `shizuku_not_installed_title`, `shizuku_active_desc`, `shizuku_permission_desc`, `shizuku_stopped_desc`, `shizuku_not_installed_desc`.

A **4-way status display** selected by `v5 = Ll6/ۥۦۣ۟;->ۧ۟ۥۥ(v30.getValue() as Lg5/c;)I` (enum code, read at :4817-4823 for titles and :5260-5264 for descs). Test chain (titles :4708-4765, descs :5244-5421): `if-ne code,3 → active`, then 2, 1, fall-through 0 (the `if-ne v?,3` head at :5245-5247 and :1072-1074 in f0 confirms code 3 = active):

| code | title key (decrypt site) | desc key (decrypt site) | English (accessor_strings.json values) |
|---|---|---|---|
| 3 | `shizuku_active_title` (:4792) | `shizuku_active_desc` (:5278) | “Shizuku Service Active ✓” / (desc value `Landroidx/compose/ui/input/key/ۣۢۥۢ;->۠ۡۡۦ` key; value string = “Shizuku Service is Active & Ready ✓”-family) |
| 2 | `shizuku_permission_title` (:4878) | `shizuku_permission_desc` (:5329) | “Shizuku Permission Required ⚠” / permission desc |
| 1 | `shizuku_stopped_title` (:4923) | `shizuku_stopped_desc` (:5372) | “Service Stopped” family / “Shizuku app is installed but service is stopped. Open Shizuku to start it.” |
| 0 | `shizuku_not_installed_title` (:4968) | `shizuku_not_installed_desc` (:5415) | “Shizuku Not Installed ✗” / “Shizuku app is not installed. Required for Ola & Uber.” |

All 8 strings resolved as `Li/ۣۢۦ۠;->۟۠ۦۣ(key, lang)` with `lang = v32.getValue() as String`.

**Action button row** (`d5\k1.smali:5600-5709`) — same Button wrapper as §2.1:
```
5641 new-instance v15, Lc5/p;
5643     const/4 v4, 0x2
5649     invoke-direct {v15, v29, v30, v4}, Lc5/p;-><init>(Landroid/content/Context;Lm0/g1;I)V     ; onClick, dispatch = literal 2
5651 new-instance v4, Ld5/f0;
5653     const/4 v5, 0x2
5659     invoke-direct {v4, v30, v32, v5}, Ld5/f0;-><init>(Lm0/g1;Lm0/l3;I)V                        ; label renderer, dispatch = literal 2
5679     invoke-static {v25, key, v4}, Lc1/ۣۡۢۦ;->۟ۢۤۧۢ(...)Lu0/b;
5695     invoke-static/range {v15 .. v27}, Lc0/ۦۢۦۥ;->ۧۧ۟ۥ(...)V   ; Button(onClick=Lc5/p#2, content=Lf0/f0#2)
```
The button **label** is picked by `Ld5/f0;->a` from the same `Lg5/c;` enum code (`f0\smali:1071-1255`, `v3` tests; `if-ne v3,3` → `shizuku_active_btn`, then 2 → `grant_shizuku_btn`, 1 → `open_shizuku_btn`, 0 → `install_shizuku_btn`):

| enum code | label key (decrypt in `d5\f0.smali`) | English value |
|---|---|---|
| 3 | `shizuku_active_btn` (:1107) | (value `Ls8/ۣۡۡ۠;->۟ۧۢۢۥ` key; EN string “Shizuku Service Active ✓”-family) |
| 2 | `grant_shizuku_btn` (:1159) | “Grant Shizuku Permission / Pair” |
| 1 | `open_shizuku_btn` (:1204) | “Open Shizuku App (Start Service)” |
| 0 | `install_shizuku_btn` (:1249) | “Install Shizuku App (Play Store)” |

The label text = `Li/ۣۢۦ۠;->۟۠ۦۣ(key, lang)` with `lang` = f0 field `c:Lm0/l3;` (`d5\f0.smali:345-347, 1089-1111`). f0 also has the **filter-screen case** (packed-switch at :369 on field `a`): label `save_filter_btn` (“Save Filter”, decrypt :325) + `filter_saved` toast key (:341) + icon `Filled.VpnKey` (:699); used by `d5\l0.smali:5200` and `d5\g0.smali:1852` (same ctor `(Lm0/g1;Lm0/l3;I)V`); its click saves the filter (`Ld5/e0;->invoke()V` — pref keys `keyword`, `isAccept`, `min_fare`, `max_fare`, JSON via `toJson`, then toast key `filter_saved` = “Filter Saved ✓” / “Filter saved! Please restart the service…”).

### 2.3 `Ld5/u;->a` — “Quick App Setup & Permissions” card (setup guide)
Class fields: `a:I`, `b:Lm0/l3;` (lang), `c:MainViewModel`, `d:Object` (Context for the setup case), `e:Lm0/l3;`, `f:Lm0/l3;`.
The setup card is built by ctor #1 `<init>(MainViewModel;Context;Lm0/g1;Lm0/g1;Lm0/g1;)V` (`d5\u.smali:415-430`): `a=2`, `c=p1` (ViewModel), `d=p2` (Context), `b=p3`, `e=p4`, `f=p5` (three `Lm0/g1;` states). Other ctors (:491, :567) belong to the merged email/verify-email composables.

Row renderer: `Lk1/ۨ۟ۧۡ;->۟ۦۨۡۦ(stepNumber, title, done:Z, icon, onClick, …)` at :1654, :2001, :2378, :2458.

| # | row | title key (decrypt site) | done-state source | icon | onClick (construction site) |
|---|---|---|---|---|---|
| header | `setup_guide` (:1235) = “Setup Guide”, desc `setup_guide_desc` (:1315) = “Follow these steps for full functionality” | | | | |
| 1 | `enable_accessibility` (:1616) = “Enable Accessibility Service” | `v6` (`Lm0/g1;` Boolean captured, :1624-1632) | `Lu/ۣۤۧ۠;->ۣۨۨۤ()Li1/f;` | **`Lk4/p;`** `<init>(Context,I)` at :1638-1648, dispatch = `sget Lq0/ۥۣۡۧ;->۟ۦ۟ۧ:I xor-int/lit16 0x324` → `k4/p` case **5/8/9 = `Intent("android.settings.ACCESSIBILITY_SETTINGS")` + `startActivity`** |
| 2 | `enable_dev_options` (:1708) = “Enable Developer Options” | **`Settings.Global.getInt(contentResolver, "development_settings_enabled", 0) == 1`** — read at :1483-1510 via `Lf4/ۦۣ۟ۦ;->ۣۤۤۦ(ContentResolver,String,I)I` = `Settings.Global.getInt`, wrapped in `try{…}catch(Exception)` (default = 0 = not enabled) | gear ImageVector (accessor `Lt2/۟ۦۢۡۧ;->۟ۢ۟()Li1/f;`, fallback build named `Filled.Wifi`, :1762-1958) | **`Lf0/d0;`** `<init>(ILjava/lang/Object;Ljava/lang/Object;Z)V` at :1979-1991, args `(dispatch = sget Ln1/۟۠۟ۤۤ;->۟۟۠۠۟:I xor-int/lit8 0x7c, Context=v29, langState=v79, Z=devEnabled)` — see §3.2 |
| 3 | `pair_shizuku` (:2047) = “Pair & Authorize Shizuku App” | `v30` Boolean state (:2055-2063) = Shizuku paired/active | `Lr/۠ۡ۠;->ۧۧۤۤ()Li1/f;`, fallback vector `Filled.SettingsEthernet` (:2111-2147) | **`Lc5/p;`** `<init>(Context,Lm0/g1;I)` at :2360-2372, dispatch = `sget Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۤۦۨ:I xor-int/lit8 0x6a` (state = v31) — see §3.3 |
| 4 | `grant_overlay` (:2428) = “Grant Display Over Other Apps” | **`Settings.canDrawOverlays(context)`** — `Ld1/۟ۡۨۧۢ;->ۦۨ۟ۦ(Context)Z` at :2392-2394 | `Landroidx/compose/ui/layout/ۢۡۤۤ;->۟ۤۦۣۣ()Li1/f;` | **`Lk4/p;`** `<init>(Context,I)` at :2440-2450, dispatch = `sget Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟۠۟ۨۡ:I xor-int/lit16 -0x188` → `k4/p` case **6/default = `Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:"+getPackageName()))` + `startActivity`** |
| extra | `Filled.Email` (:3519) + `Change Email` (:3782) — change-email row; button via `Ld5/d;-><init>(MainViewModel,g1,g1,I)` (:4604-4616) + `Ld5/t;` label (:4618-4626) | | | (out of Dev/Shizuku scope) |

### 2.4 `Ld5/t;->b` — button-label renderer
Fields: `a:I` (label dispatch), `b:Lm0/l3;` (lang). Ctor `<init>(Lm0/l3;I)V` (`d5\t.smali:322-327`: `a=p2`, `b=p1`).
Labels (decrypt sites in `b()`, all resolved via `Li/ۣۢۦ۠;->۟۠ۦۣ`): `APPLY`(:5553), `Sign Out`(:5738)+`SIGNOUT`(:5784) (TextButton variant), `VERIFYING PAYMENT...`(:6094)+`VERIFY PAYMENT`(:6233), **`hide_btn`(:6450) = “Hide”**, **`save_language`(:6679) = “SAVE LANGUAGE”**, `Change Password`(:6972), `Send Verification Email`(:7261), `clear_all`(:7446), `add_filter`(:7613). Selection = `packed-switch v2` (:5293) on field `a` (merged label variants).

* **`hide_btn`** is *not* a dialog button — it is the **“Hide” action button of the “Hide Developer Options” card** (§2.1), i.e. the button whose onClick is `Lz/p;` hide-handler. Its construction site is `d5\k1.smali:2430-2434` (dispatch `sget Lo8/۟ۢۧۢۤ;->ۤۡۢۥ:I xor-int/lit16 -0x3b0`).
* **`save_language`** is the **SAVE LANGUAGE button of the language picker** (`d5\k.smali`): constructed at `d5\k.smali:3978-3986` (dispatch `sget Ld/۟ۤ۠ۡۨ;->ۥۣۢۡ:I xor-int/lit16 0x160`) with onClick `Lz/p;` `<init>(Object,Object,Object,I)V` at :3966-3976 (dispatch `sget Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->۟ۡ۠ۤۧ:I xor-int/lit16 0x1a4` → `z/p` **packed value 6 = `:pswitch_0`** = save-language handler, §3.5).

### 2.5 `Ld5/b0;->e` — service-status card (Home) with “Grant permissions first”
Ctor `<init>(ZZZLm0/g1;Ljava/util/ArrayList;Ljava/util/Map;Landroid/content/Context;Lc9/a;Lcom/auto/accept/ui/viewmodel/MainViewModel;)V` (`d5\b0.smali:156`) → fields `a:Z, b:Z, c:Z, d:Lm0/l3;` (lang), `e:List, f:Map, n:Context, o:Lc9/a` (start-service callback), `p:MainViewModel`.

| element | key | English | shown when |
|---|---|---|---|
| title | `service_active` (:1898) / `service_stopped` (:1965) | “Service Active” / “Service Stopped” | flag test at :1866-1877 (`if-eqz v27`) — service running flag from ctor Z/ViewModel |
| desc | `monitoring_ride_apps` (:2124) | “Monitoring ride apps” | always |
| button | `tap_to_start` (:2262) | “Tap to start” | when the captured `Lc9/a` exists / permission flags pass (:2217-2287 tests field getters `ۥ۠ۧۢ`,`۟ۤۤۢۡ`) |
| fallback label | `grant_permissions_first` (:2468) | “Grant permissions first” | the *else* branch (:sswitch_86, :2439-2536) |

* **`tap_to_start` click** = `Lb/d;-><init>(v28,v29,v30,v31,v32, I)V` at :2333-2339 (dispatch `sget Ld7/ۢۧۧۢ;->۟ۢۧۤۦ:I xor-int/lit8 -0x80`), passed as `onClick` to the Button wrapper `Lc4/۟ۢۨۥۡ;->۟ۥۧ۟ۤ(Z, onClick, …)` at :2399 — it starts the acceptor service via the captured `MainViewModel`/`Lc9/a`.
* **`grant_permissions_first` is rendered as plain `Text(...)`** (`ۦۤۤ` call :2528) with **no Button/onClick wrapper** — a static prompt telling the user to grant permissions first (the permissions themselves are granted through the setup-guide rows of §2.3 and the Shizuku button of §2.2). No dialog is involved.

---

## 3. Handler specifications

### 3.1 `Lz/p;->invoke()V` DEFAULT case — “Hide Developer Settings” (`z\p.smali:403-618`)
Class fields (`z\p.smali:9-15`): `a:I` dispatch, `b/c/d:Object`. Ctor used by k1 — `<init>(Landroid/content/Context;Ljava/lang/Object;Lm0/l3;I)V` (:19-36): `a=p4`, `c=p1`(Context), `d=p2`(`Lm0/g1;` Boolean), `b=p3`(lang `Lm0/l3;`).
Packed table (:1052-1058) `.packed-switch 0x3` → values **3,4,5,6** = `:pswitch_3,:pswitch_2,:pswitch_1,:pswitch_0` (two Compose-internal lambdas, an `ACTION_DELETE` uninstall lambda, and the save-language lambda §3.5). **Any other dispatch value = default = this hide handler.**

Logic (exact):
1. `shizukuReady = ((Lm0/g1;) d).getValue() as Boolean` (:422-433). If `false` → `Toast.makeText(ctx= (Context) c, g5/b;->b("enable_shizuku_first", lang=(b).getValue()), 0).show()` (:437-462) and return. (`"enable_shizuku_first"` is a plain `const-string` at :451.)
2. `if (!Lo7/d0;->P()Z) return;` silently (:478-484).
3. try (:489-572):
   * `p1 = Lo7/d0;->b0(["settings","put","global","development_settings_enabled","0"])` (:487-511; argv constants `settings`/`put`/`global`/`0` = const-strings at :467-475, name at :500). If `p1 != null` → `p1.waitFor()` (:516).
   * `p2 = Lo7/d0;->b0(["settings","put","global","adb_enabled","0"])` (:527-543; name at :535). If `p2 != null` → `p2.waitFor()` (:549).
   * `Log.d("ShellTapExecutor", "🔒 Hide Developer Settings executed via Shizuku")` (:552-555).
   * **only if** `p1 != null && p1.exitValue()==0 && p2 != null && p2.exitValue()==0` (:557-574) → `Toast.makeText(ctx, g5/b;->b("dev_options_hidden", lang), 0).show()` (:576-601; `"dev_options_hidden"` const-string :590 = “Developer Options Hidden ✓”).
4. catch(Exception) → `La7/a;->t("hideDevSettings failed: " + e.getMessage(), "ShellTapExecutor")` (:606-614).

There is **no `dev_enabled 1` write anywhere in the APK** — see Q1.

### 3.2 `Lf0/d0;->invoke()V` DEFAULT case — “open Developer Options” (`f0\d0.smali:639-877`)
Class fields (:13-19): `a:I` dispatch, `b:Z`, `c:Object`, `d:Object`. Ctor `<init>(ILjava/lang/Object;Ljava/lang/Object;Z)V` (:181-190): `a=p1`, `b=p4`, `c=p2`, `d=p3` (verified by invoke() reads: `ۣۧۨ۠`→a, `۠ۢۥ۠`→c, `ۨۢۢ`→d, `۟۠ۤۨۨ`→b).
Packed table (:1002-1005): value **1** = `:pswitch_0` (a different merged lambda — `checkNotNullParameter(v3,"key")` + helper calls; unrelated to Dev options); **anything else = this handler**.

From the u.a construction (:1991): `d` = Context, `c` = lang `Lm0/l3;` (String), `b` = **devOptionsEnabled** (`Settings.Global…==1`).
Logic (exact):
* `devEnabled = b` (:654-656).
* **`devEnabled == true`** → try `ctx.startActivity(new Intent(decrypt#4 = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS"))` (:815-842) catch(Exception) → `ctx.startActivity(new Intent(v5 = "android.settings.SETTINGS"))` (:866-875). (`v5` = decrypt#1 :660-672.)
* **`devEnabled == false`** → first `Toast.makeText(ctx, localize(decrypt#2 = "dev_options_disabled_toast", lang), 1).show()` (:698-739) = “Developer options disabled! Tap 'Build Number' 7 times in About Phone.”, then try `ctx.startActivity(new Intent(decrypt#3 = "android.settings.DEVICE_INFO_SETTINGS"))` (:741-768) catch(Exception) → fallback `Intent("android.settings.SETTINGS")` (:786-796).
* Junk noise calls (`Li5/ۢۤۡ;->ۣۡۥۧ()Ljava/util/List;`, `System.out.println`) are inert.

**No shell command is run here — it never toggles `development_settings_enabled`.**

### 3.3 `Lc5/p;->invoke()V` — Shizuku app action (install / open / grant) (`c5\p.smali:84-615`)
Fields (:9-13): `a:I` dispatch, `b:Context`, `c:Lm0/g1;` (**holds the `Lg5/c;` Shizuku-state enum**). Ctor `<init>(Landroid/content/Context;Lm0/g1;I)V` (:17-31). Packed table (:609-614) `.packed-switch 0x0`; k1 uses **dispatch = 2**.
The Shizuku-action case reads `((Lm0/l3;) c).getValue()` → `Enum.ordinal()` (:119-151, :235-242) and switches:
* **installed & service ready (active)** → `Toast "Shizuku Service is Active & Ready ✓"` (:259-266).
* **installed but stopped** → `Toast "Opening Shizuku app..."` (:316-323) + `pm.getLaunchIntentForPackage("moe.shizuku.privileged.api")` → `startActivity` (:283-294/:300-311), fallback `Intent("android.intent.action.VIEW", Uri.parse("package:moe.shizuku.privileged.api"))` (:332-338).
* **not installed** → `Intent(VIEW, Uri.parse("market://details?id=moe.shizuku.privileged.api"))` (:218-224), fallback `Intent(VIEW, "https://play.google.com/store/apps/details?id=moe.shizuku.privileged.api")` (:349-357); APK-sideload path: `pm.canRequestPackageInstalls()` check (:380-384) else `Toast "Please enable 'Install unknown apps' for this app, then tap Install again."` + `Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:"+getPackageName())).addFlags(...)` (:392-434); then `Lo7/d0;->N(Context, File)` PackageInstaller install (:447, log tag `ForceUpdateScreen` :441), catch → `Log "PackageInstaller failed, falling back: "` + `FileProvider.getUriForFile(ctx, pkg+".fileprovider", apk)` → `Intent(VIEW).setDataAndType(uri,"application/vnd.android.package-archive").addFlags(...)` (:457-514), catch → `Log "FileProvider install error: "` + `Toast "Install failed. Please install manually from Downloads."` (:524-549).
* **permission needed** → `Lla/g;->g(I)V` (:190 and :275) = **`Shizuku.requestPermission(requestCode)`** (binder transact `writeInt(requestCode)`, `la\g.smali:746-830`).
Merged sibling cases in the same class: clipboard “Transaction ID” copy (`ClipData.newPlainText`, :127-137) and a connectivity check writing `Boolean` into the captured `Lm0/g1;->setValue` (:558-602).

Supporting singletons `Ld5/h0;` (`d5\h0.smali`): two static instances `b`,`c` created in `<clinit>` (:21-46, `<init>(I)V`); `invoke()V` (:273-414) = `try { requestPermission wrapper } catch { Log("ShellTapExecutor", "Failed to request Shizuku permission: " + msg) }` (decrypts :370/:386, Log wrapper `Lg5/ۣۡۦۣ;->۟ۡۧۥ۠` :390) — these are the `OnRequestPermissionResultListener`-style callbacks handed to the Shizuku client (`f\ۣ۟ۤۤ.smali:496`, `com\google\firebase\firestore\core\ۧۤۡۧ.smali:70-79`, consumed at `y3\e.smali:40885`).

### 3.4 `Lk4/p;->invoke()V` — raw Settings-Intents lambda (`k4\p.smali:160-383`)
Fields: `a:I` dispatch, `b:Context`; ctor `<init>(Landroid/content/Context;I)V` (:15-24). Packed table (:372-382) `.packed-switch 0x2`:

| dispatch | behavior (all end in `ctx.startActivity(intent)`) |
|---|---|
| 2 → `:pswitch_7` | `Intent(VIEW, Uri.parse(getString(0x7f0e0095)))` (resource URL) |
| 3 → `:pswitch_6` | `Intent(VIEW, Uri.parse(getString(0x7f0e0094)))` |
| 4 → `:pswitch_5` | `Intent(VIEW, Uri.parse(getString(0x7f0e0096)))` |
| 5 → `:pswitch_4` | `Intent("android.settings.ACCESSIBILITY_SETTINGS")` |
| 6 → `:pswitch_3` | `Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:"+getPackageName()))` |
| 7 → `:pswitch_2` | try{`Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS").setData(package:pkg)`}catch(Exception){} |
| 8 → `:pswitch_1` | `Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(0x10000000)` (NEW_TASK) |
| 9 → `:pswitch_0` | `Intent("android.settings.ACCESSIBILITY_SETTINGS")` |
| default | `Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:"+getPackageName()))` |

### 3.5 `Lz/p;->invoke()V` `:pswitch_0` (packed value **6**) — save-language (`z\p.smali:620-701`)
Ctor `<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V` (:38-55): `a=p4`, `b=p1`, `c=p2`, `d=p3` → (MainViewModel, Context, `Lm0/g1;` langCode state).
1. `langCode = (d).getValue() as String`; `checkNotNullParameter(langCode,"langCode")` (:635-638).
2. `MainViewModel.b:Lz4/d` — `M:Lp9/q0;->i(langCode)` (MutableStateFlow set) and `SharedPreferences.edit().putString(L /*pref key field*/, langCode).apply()` (:641-663).
3. try `g5/b;->a(context, langCode)` (apply locale) (:666-673).
4. `Toast.makeText(ctx, g5/b;->b("save_language", langCode), 0).show()` (:676-699) — key `"save_language"` const-string :688 → “SAVE LANGUAGE”.
(:pswitch_1 = uninstall lambda `Intent(ACTION_DELETE, "package:"+pkg)` + `MainViewModel.T` flow set `""`; :pswitch_2/:pswitch_3 = Compose internals.)

### 3.6 Shizuku shell layer
* **`Lo7/d0;->P()Z`** (`o7\d0.smali:1081-1109`):
  ```
  try {
      if (!Lla/g;->f()Z) return false;      // la/g.f(): cached IBinder.pingBinder() (la\g.smali:722-744)
      v1 = Lla/g;->c()I;                     // la/g.c(): binder transact → readInt() = checkSelfPermission (0 = granted)
      return v1 == 0;
  } catch (java.lang.Exception) { return false; }   // incl. RuntimeException("binder haven't been received")
  ```
* **`Lo7/d0;->b0([Ljava/lang/String;)Ljava/lang/Process;`** (`o7\d0.smali:4407-4502`):
  * Lazily caches `Lo7/d0;->g:Ljava/lang/reflect/Method;` = `Lla/g;->getDeclaredMethod("d", [String[].class, String[].class, String.class])`, `setAccessible(true)` (:4414-4447).
  * Invokes **statically** `method.invoke(null, {argv, null, null})` (:4458-4468) → `Lla/g;->d([String,[String,String)Lla/i;` (`la\g.smali:315-479`) = `moe.shizuku.server.IShizukuService` transact `newProcess(cmd, env, dir)` returning `Lla/i;` (a `Ljava/lang/Process;` subclass wrapping `moe.shizuku.server.IRemoteProcess`).
  * Returns the object only `instanceof Process`, else **null**; on any `Exception` logs `La7/a;->t("Shizuku reflection error: " + msg, "ShellTapExecutor")` and returns **null** (:4488-4501).
  * argv convention: raw argv works (z/p passes `["settings","put","global",…]`); shell form used by taps: `["sh","-c",cmd]` (`u(III)V` :6776-6870 — builds `"input swipe x y x y dur"`, logs `Log.e("ShellTapExecutor","newShizukuProcess returned null for: "+cmd)` when b0 returns null; `v(II)V` similar with `"input tap x y"`).
* `Lla/g;` is the **vendored Shizuku API client** (direct `IBinder.transact` on `moe.shizuku.server.IShizukuService`): `f()=pingBinder`, `c()=checkSelfPermission`, `d()=newProcess`, `g(I)=requestPermission(requestCode)`; binder death logs `AutoAcceptApp` “Shizuku Binder Dead!”.

---

## 4. String-key accessors (the 4 named in the task)

All four are called **only inside `g5/b;-><clinit>()V`**, where they supply the **key** of a `(key, EnglishValue)` pair (`Lr2/ۧۧۢۢ;->ۦۡۧۡ`/`Lz6/a;->n0` = `Pair`) that seeds the per-language dictionaries; runtime lookups then go through `g5/b;->b(key, lang)`:

| accessor | string | paired English value | pair site |
|---|---|---|---|
| `Lia/۟۠ۡۦ۟;->ۣۧۤۢ()` | `dev_options_guide` | “Enable Developer Options” (`Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۣ۟ۡ۠ۧ`) | `g5\b.smali:425-433` |
| `Landroidx/fragment/app/ۣۣۣۨ;->ۤۢۤ۟()` | `open_dev_options` | “Open Developer Settings” (`Lm7/ۧۢ۟;->ۣ۟ۧ۟۟`) | `g5\b.smali:437-445` |
| `Lw4/ۥۤ۟۠;->۟ۢۢۡ۟()` | `enable_dev_options` | “Enable Developer Options” | `g5\b.smali:921-929` |
| `Lu/ۣۤۧ۠;->ۣۤ۟ۢ()` | **“Hide Developer Options”** | it is the *value* of key `anti_detection_title` (`Lh6/ۧۧۤ۟;->ۣۧۨۢ`) | `g5\b.smali:885-893` |

Consequences: `anti_detection_title` **displays “Hide Developer Options”** in the k1 card. The keys `dev_options_guide` and `open_dev_options` are registered in the dictionaries but **no code path resolves them in this build** (their strings appear nowhere else — see Q1 methodology); the live row uses the key `enable_dev_options` instead (u.a step 2).

---

## 5. Answers to the specific questions

### Q1 — Developer Options area: one toggle or two rows?
**Two separate rows/cards; there is NO toggle and NO restore path in this build.**

1. **“Enable Developer Options” row** — `d5\u.smali` setup guide step 2 (`Lk1/ۨ۟ۧۡ;->۟ۦۨۡۦ` call :2001).
   * Title key `enable_dev_options` = “Enable Developer Options”.
   * **Checked/done state = `Settings.Global.getInt(contentResolver, "development_settings_enabled", 0) == 1`** read inline each composition (`d5\u.smali:1483-1567`, wrapper `Lf4/ۦۣ۟ۦ;->ۣۤۤۦ`, try/catch default 0). Not a pref.
   * Click handler = **`Lf0/d0;`** (§3.2): `b=true` → opens `android.settings.APPLICATION_DEVELOPMENT_SETTINGS` (fallback `android.settings.SETTINGS`); `b=false` → toast **`dev_options_disabled_toast`** (“Developer options disabled! Tap 'Build Number' 7 times in About Phone.”) and opens `android.settings.DEVICE_INFO_SETTINGS` (fallback `SETTINGS`). **Runs no shell command.**
   * Construction: `d5\u.smali:1979-1991`, ctor `<init>(ILjava/lang/Object;Ljava/lang/Object;Z)V` with `(dispatch = sget Ln1/۟۠۟ۤۤ;->۟۟۠۠۟:I xor-int/lit8 0x7c, Context, langL3, devEnabledZ)`; dispatch value must be ∉{1} to select the handler body (value 1 selects the unrelated merged lambda).

2. **“Hide Developer Options” card** — `d5\k1.smali` merged case 0 (§2.1).
   * Title `anti_detection_title` (“Hide Developer Options”), desc `anti_detection_desc`, one button **`hide_btn` (“Hide”)** — checked-state source is *not* `development_settings_enabled`; the button’s `enabled` argument and the warning chip are driven by the captured `Lm0/g1;` **Boolean “Shizuku-ready” state** (`d5\k1.smali:2376-2384, 2480-2502`).
   * Handler = **`Lz/p;` default case** (§3.1): gates on the Boolean (toast `enable_shizuku_first` if false) and `Lo7/d0;->P()` (silent return if false), then runs via Shizuku:
     `settings put global development_settings_enabled 0` **and** `settings put global adb_enabled 0`,
     logs `Log.d("ShellTapExecutor","🔒 Hide Developer Settings executed via Shizuku")`, and toasts `dev_options_hidden` (“Developer Options Hidden ✓”) **only when both `Process.exitValue()==0`**.
   * Construction: `d5\k1.smali:2416-2428`, ctor `(Landroid/content/Context;Ljava/lang/Object;Lm0/l3;I)V`, dispatch `sget Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۡۤ۠:I xor-int/lit16 -0x2e8` (any value ∉ {3,4,5,6} selects the hide body).

**Where does `dev_options_restored` fire? Nowhere in this build.** Methodology: the key exists only in the localization tables (`g5\b.smali:1397/2789/4329`, value “Developer Options Restored ✓”), together with `restore_btn` (“Restore”, :1413/2805/4345) and `dev_hidden_status` (“Developer options are currently hidden from ride apps.”, :1421/2813/4353). Exhaustive searches over `decoded-apktool\smali` find **no other occurrence** of those three strings (neither `const-string` nor decrypted); the per-method XOR digest was verified complete (decrypt-call counts match in every target method). Likewise **no code path ever runs `settings put global development_settings_enabled 1`** (the only `development_settings_enabled` const-string in the tree is `z\p.smali:500`, used with `"0"`). So the “restore” side is a **dormant localization entry** (presumably a removed/pending toggle); a static bridge can only reproduce the **hide** direction.

### Q2 — When/where does `dev_options_disabled_toast` appear?
Exactly one site: **`Lf0/d0;->invoke()V` default case** (`f0\d0.smali:698-739`), reached from the **setup-guide step-2 row** (`d5\u.smali:1979`). Condition: the captured `b:Z` (= `Settings.Global.getInt(resolver,"development_settings_enabled",0) == 1`) is **false**, i.e. **Developer Options is currently disabled**. It is a `Toast` of `g5/b;->b("dev_options_disabled_toast", lang)` — “Developer options disabled! Tap 'Build Number' 7 times in About Phone.” — fired immediately before opening `android.settings.DEVICE_INFO_SETTINGS` so the user can tap Build Number. It is *not* about Shizuku and *not* about “already off” in the hide flow.

### Q3 — `grant_overlay`, `grant_permissions_first`, `grant_shizuku_btn`
* **`grant_overlay`** = title key of **setup-guide step 4** (“Grant Display Over Other Apps”, `d5\u.smali:2428`). Checked state = `Settings.canDrawOverlays(context)` (`d5\u.smali:2392`). Click = **`Lk4/p;`** `<init>(Context,I)` (:2440-2450, dispatch `sget Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟۠۟ۨۡ:I xor-int/lit16 -0x188`) which starts
  `Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:"+getPackageName()))` (k4/p case 6 or default; note the non-standard action string is literal in the binary, `k4\p.smali:165`).
* **`grant_permissions_first`** = fallback **text** (not a button) on the Home service-status card (`d5\b0.smali:2439-2536`), English “Grant permissions first”, shown instead of the “Tap to start” button when the permission/start-callback flags captured in the ctor fail (`:2217-2287`). Its “buttons”: none inline — the user grants via the setup-guide rows (accessibility → `ACCESSIBILITY_SETTINGS`, overlay → `MANAGE_OVERLAY_PERMISSION`) and the Shizuku button below.
* **`grant_shizuku_btn`** = button label (“Grant Shizuku Permission / Pair”) chosen by `Ld5/f0;->a` when the Shizuku enum state = 2 (permission required). The button’s onClick is **`Lc5/p;` dispatch 2** (constructed `d5\k1.smali:5641-5649` with `(Context, Lm0/g1{Lg5/c; state}, 2)`); in that state c5/p calls **`Lla/g;->g(I)V` = `Shizuku.requestPermission(requestCode)`** (binder transact with `writeInt`, `la\g.smali:746`), with `Ld5/h0;` singletons as result listeners and error toast/log “Failed to request Shizuku permission: ” (`d5\h0.smali:273-414`). It does **not** merely open the Shizuku app (that is `open_shizuku_btn`/stopped state) — although when Shizuku is merely stopped the same button re-labels to `open_shizuku_btn` and c5/p launches `moe.shizuku.privileged.api` (launch intent, fallback `package:` VIEW intent). `install_shizuku_btn` (state 0) → Play Store `market://details?id=moe.shizuku.privileged.api`, fallback web URL / APK sideload via `Lo7/d0;->N` + FileProvider.

### Q4 — Static-bridge recipes (1:1)
State shapes: `Lm0/g1;` = MutableState (`getValue()Object` / `setValue(Object)V`); `Lm0/l3;` = State (`getValue()Object`). Lang states hold `String` codes (`en`,`hi`,…); Shizuku-state `Lm0/g1;` holds the **`Lg5/c;` enum**; gate booleans are `Boolean` in `Lm0/g1;`.

| handler | construct exactly | dispatch value |
|---|---|---|
| Hide Dev Settings (`Lz/p` default) | `new Lz/p(Context, Object(Lm0/g1; Boolean "Shizuku-ready"), Lm0/l3; lang, I)` (ctor `(Landroid/content/Context;Ljava/lang/Object;Lm0/l3;I)V`) | recompute `Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۡۤ۠:I ^ -0x2e8` (or any int ∉ {3,4,5,6}) |
| Save language (`Lz/p:pswitch_0`) | `new Lz/p(Object(MainViewModel), Object(Context), Object(Lm0/g1; langCode), I)` (ctor `(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V`) | `Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->۟ۡ۠ۤۧ:I ^ 0x1a4` (must equal **6**) |
| Open Dev Options (`Lf0/d0` default) | `new Lf0/d0(I, Object(Context), Object(Lm0/l3; lang), Z devEnabled)` | `Ln1/۟۠۟ۤۤ;->۟۟۠۠۟:I ^ 0x7c` (any value ≠ 1) |
| Shizuku action (`Lc5/p`) | `new Lc5/p(Context, Lm0/g1; /* Lg5/c; enum state */, I)` | k1: literal **2**; u.a step 3: `Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۤۦۨ:I ^ 0x6a` |
| Accessibility / overlay (`Lk4/p`) | `new Lk4/p(Context, I)` | accessibility: `Lq0/ۥۣۡۧ;->۟ۦ۟ۧ:I ^ 0x324`; overlay: `Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟۠۟ۨۡ:I ^ -0x188` (case 6 or default) |
| “Hide” button label (`Ld5/t`) | `new Ld5/t(Lm0/l3; lang, I)` then wrap with `Lc1/ۣۡۢۦ;->۟ۢۤۧۢ(composer, key, t)` and pass as Button content | `Lo8/۟ۢۧۢۤ;->ۤۡۢۥ:I ^ -0x3b0` |
| Shizuku button label (`Ld5/f0`) | `new Ld5/f0(Lm0/g1; /* Lg5/c; */, Lm0/l3; lang, I)` wrapped likewise | k1: literal **2** |
| Tap-to-start (`Lb/d`) | `new Lb/d(v28..v32 = (Context, MainViewModel, Lm0/g1;, Lc9/a, …), I)` (`d5\b0.smali:2333-2339`) | `Ld7/ۢۧۧۢ;->۟ۢۧۤۦ:I ^ -0x80` |
| Shell hide commands | `Lo7/d0;->b0(new String[]{"settings","put","global","development_settings_enabled","0"})` then `…{"…","adb_enabled","0"}`; `waitFor()` each; toast only when both `exitValue()==0` | — |
| Shizuku availability | `Lo7/d0;->P()Z` (pingBinder + checkSelfPermission==0, false on Exception) | — |
| Permission request | `Lla/g;->g(requestCode)` (Shizuku.requestPermission) | — |

Compose plumbing for a row/button: `Lk1/ۨ۟ۧۡ;->۟ۦۨۡۦ(stepNo, title, done:Z, icon, onClick, composer, flags)` for setup steps; `Lc0/ۦۢۦۥ;->ۧۧ۟ۥ(onClick, modifier, enabled:Z, …, contentLambda, …, keyI, keyI)` for the k1 buttons (content lambda must be wrapped via `Lc1/ۣۡۢۦ;->۟ۢۤۧۢ`).

---

## 6. Residual uncertainties (explicit)
* Exact packed-switch **value→label** tables of `Ld5/t;->b` and `Ld5/f0;->a` were not transcribed numerically (the tables sit in dense data sections); the dispatch **expressions** to select `hide_btn`, `save_language`, and the Shizuku labels are given above, and the enum-code mapping (3/2/1/0 = active/permission/stopped/not-installed) is inferred from the identical `if-ne code,3` test heads in `d5\k1.smali:5245` and `d5\f0.smali:1072` plus block order.
* In `Ld5/b0;->e` the precise semantic of the three ctor `Z` flags (a/b/c) is: service-running / has-permissions / (startable) — the exact getter→field assignment lives in obfuscated accessor wrappers (`Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۥ۠ۧۢ`, `Lr9/۟ۢۢۤۨ;->۟ۤۤۢۡ`) and was not expanded field-by-field.
* Shizuku-status English values for `shizuku_active_desc` / `shizuku_permission_desc` / `shizuku_active_btn` were mapped by accessor names in `analysis\accessor_strings.json` but their exact pair partners sit in later language-table groups of `g5\b.smali` not fully transcribed.
* `Ld5/j1;->invokeSuspend` (strings `moe.shizuku.privileged.api`, `context`) is the status-refresh coroutine that populates the `Lg5/c;` state; not itemized here.
