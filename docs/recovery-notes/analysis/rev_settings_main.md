# Ride Accepter — Main Settings Screen: Row-by-Model Map

Target: `com.auto.accept.ui.MainActivity` → Settings tab → `Ld5/o1;->k(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V`
(`decoded-apktool\smali\d5\o1.smali` lines **19394–21753**).
Goal: everything a native UI needs to reproduce the screen 1:1 — row order, string-table keys, control types, state/pref sources with exact key names + defaults, and the exact click/change handlers (lambda class, constructor, verbatim dispatch-int expression, resulting switch case).

Encoding note: all smali was read with UTF-8 (`read`/`grep` tools and `[System.IO.File]::ReadAllLines(path, UTF8)`).

---

## 0. Composition model (how the screen is built)

`o1.k` renders, in order: **5 "sections"**. Each section = one **section header** (composable `Ld5/o1;->j(ILm0/m;Ljava/lang/String;)V` — icon + localized title, reached through the bridge `Lz7/۟۟ۨۢۢ;->ۣ۟۟ۢ۟(ILjava/lang/Object;Ljava/lang/Object;)V`) followed by one **NeonCard** (bridge `Lf0/ۣۦۦ۠;->ۣۤۡۤ(7×Object;II)V` → `Lf6/a;->a(Ly0/o;Le1/l0;Lk0/g0;Lk0/h0;Lu/w;Lc9/f;Lm0/m;II)V`) whose content is a merged lambda class (`Ld5/k1;`, `Ld5/k;`, `Ls/k;`, `Ld5/u;` — all `implements Lc9/f;`, `super Ld9/j;`).

All UI text resolves via **`Lg5/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;`** (bridge `Li/ۣۢۦ۠;->۟۠ۦۣ(key, langCode)`) with the current language code from the **`app_language`** state (see §5). Keys are either XOR-decrypted (`…;->ۧۨۧۧ([SIII)Ljava/lang/String;`) or returned by tiny accessor classes (e.g. `Lx8/ۢۨۥۨ;->ۥ۟۟ۦ() = "accept_timer_title"`).

Shared multi-dispatch lambda classes (behavior selected by an `I` computed at the construction site):

| class | role | dispatch switch in |
|---|---|---|
| `Lz/p;` (`z\p.smali`) | click `c9/a` (`invoke()V`) | `invoke()V`, `packed-switch 0x3` → values 3/4/5/6, **anything else = default** |
| `Lh1/b;` (`h1\b.smali`) | onCheckedChange `c9/c` (`invoke(Object)`) | `invoke(Object)`, `packed-switch 0x1` (values 1–18) |
| `Lb/g;` (`b\g.smali`) | onCheckedChange + misc | `invoke(Object)` `packed-switch 0x0` (0–23) → `f(Z)` `packed-switch 0x14` (value 20 only) |
| `Lc5/j;` (`c5\j.smali`) | click `c9/a` | `invoke()V` `packed-switch 0x0` (0–15), default ≥16 |
| `Lk4/p;` (`k4\p.smali`) | click `c9/a` (intents / URLs) | `invoke()V` `packed-switch 0x2` (2–9), default otherwise |
| `Ld5/t;` (`d5\t.smali`) | button label+content (`a(Ly/v;Lm0/m;I)V`/`b(...)`) | own `a:I` |
| `Ls/k;`, `Ld5/k1;`, `Ld5/k;`, `Ld5/u;` | card content `c9/f` | each `e()`/`a()` branches on own field `a:I` (hard-coded per constructor) |

**`Lz/p;->invoke()V` case table** (`.packed-switch 0x3`):

| value | label | behavior |
|---|---|---|
| 3 | `:pswitch_3` | Compose internals (lookaside detach) |
| 4 | `:pswitch_2` | Compose internals (remove OnAttachStateChangeListener) |
| 5 | `:pswitch_1` | uninstall: `Intent(ACTION_DELETE, "package:"+pkg)`; clears `MainViewModel.T` state to `""` |
| **6** | **`:pswitch_0`** | **SAVE LANGUAGE** (see §2) |
| other | default | **"Hide Developer Settings"** Shizuku shell handler (see §4) |

**`Lh1/b;->invoke(Object)` case table** (`.packed-switch 0x1`, entries values 1..18 → `:pswitch_11…:pswitch_1`):
value 13 → **`:pswitch_6`** = the `ride_alert_enabled` writer (see §6). Others are Compose/coroutine plumbing.

**`Lk4/p;->invoke()V` case table** (`.packed-switch 0x2`):

| value | behavior |
|---|---|
| 2 | `Intent(ACTION_VIEW, Uri.parse(getString(0x7f0e0095)))` — **`url_website`** = `https://rider-theta.vercel.app/` |
| 3 | `Intent(ACTION_VIEW, getString(0x7f0e0094))` — **`url_telegram`** = `https://t.me/rideaccepter` |
| 4 | `Intent(ACTION_VIEW, getString(0x7f0e0096))` — **`url_whatsapp`** = `https://whatsapp.com/channel/0029VbDa51y7j6gA9aiXbK0n` |
| 5 / 9 | `Intent("android.settings.ACCESSIBILITY_SETTINGS")` |
| 6 | `Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:"+getPackageName()))` |
| 7 | `Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", "package:"+pkg)` |
| 8 | `Intent("android.settings.ACCESSIBILITY_SETTINGS")` + extra flags |
| default | `Intent(action, "package:"+getPackageName())` app-details style |

**`Lc5/j;->invoke()V` case table** (`.packed-switch 0x0`, 16 entries 0..15, default ≥16):

| value | behavior |
|---|---|
| default(≥16), 14, 10, 7, 6 | `MainViewModel.s()V` — stop service (see §7) |
| 15, 13 | flip `MainViewModel.A` Boolean state (dialog visibility) |
| 12 | reset stats: `putInt` `accepted_count`/`skipped_count`/`today_earnings`/`last_detected_fare` = 0 |
| 11, 3 | clear ride history: remove `history_json` (`z4/g` prefs), `E0` state ← empty list |
| 9 / 8 | launch coroutine `Lf5/x;` / `Lf5/v;` in viewModelScope |
| 5, 4 | `MainViewModel.I0` = false |
| 2 | `MainViewModel.G0` = false |
| 1 | `MainViewModel.V` = false |
| 0 | `MainViewModel.G` = false |

**`Lb/g;->f(Z)V`** (onCheckedChange target) `.packed-switch 0x14` (single entry 20):
* value **20** (`:pswitch_0`) = per-app toggle: `d`(g1).setValue(Z); `z4/d.c.edit().putBoolean("app_enabled_"+appName, Z).commit()`; refresh `z4/d.J` map state.
* **anything else (incl. 21) = default = "Zero Animation Mode"** (accept-timer, see §3).

### Page-level side effects in `o1.k` preamble (reimplement exactly)

1. `Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f)` (key decrypted at 19706) → Boolean `= (scale == 0.0f)` wrapped in `remember { mutableStateOf }` (**register v15**) — this is the accept-timer checked state.
2. Shizuku probes: `Lj4/ۣۧۤ;->ۧۦۡ()Z` (Shizuku alive?), `PackageManager.getPackageInfo("moe.shizuku.privileged.api")` + `queryIntentServices` (key decrypted at 19968) → two Boolean `mutableStateOf`s (**v13**, **v19**) — v19 is fed by a `LaunchedEffect` (`Ld5/j1;-><init>(Landroid/content/Context;Lm0/g1;Lm0/g1;Lu8/e;)V` at 20329, launched via `Lr9/۟ۢۢۤۨ;->۟ۤۨۦۢ`) which re-polls Shizuku installed/running and writes the states.
3. Language state: `MainViewModel` → `Lp9/z` (read-only delegate of `z4/d.N`, the `app_language` state) at 20599 (`Lf0/ۣۦۦ۠;->ۥۦۦ۠`) → observed `String` langCode (**v11**), passed to every card and used in every `g5.b.b(key, lang)`.
4. Card glow colors are animated (`Lc6/۟ۧۧ۠ۤ;->۟ۤۧۡۦ(J…;I)Lk0/g0;`, `Lt1/ۧۦۤۧ;->ۣ۟ۡۢ(F)Le0/e;`) before each card; card `f6/a.a` call constants seen: `v9 = 0x30006` (all cards), `v10` changed-flags 0x8/0x18.

---

## 1. Section 1 — `shizuku_engine_status` (Shizuku engine status card)

Header call: `Lz7/۟۟ۨۢۢ;->ۣ۟۟ۢ۟(I, composer, "shizuku_engine_status")` at **o1.k:20637** (string decrypted at 20629 `La8/ۡۦۨۡ;->ۧۡۥ([SIII)`).

Card content lambda — construction at **o1.k:20915–20919**:

```smali
new-instance v7, Ld5/k1;
move-object/from16 v0, v19                    # shizuku-active Boolean state (g1)
invoke-direct {v7, v0, v11, v12}, Ld5/k1;-><init>(Lm0/g1;Lm0/g1;Landroid/content/Context;)V
```

* `Ld5/k1;` fields: `a:I`, `b:Lm0/l3;`, `c:Lm0/g1;`, `d:Landroid/content/Context;`.
  3-arg ctor (`d5\k1.smali:320`) hard-sets **`a:I = 0`** (`const/4 v0, 0x0; iput v0, p0, Ld5/k1;->a:I`) and maps `p1→c`, `p2→b`, `p3→d`. The content method `a(Ly/v;Lm0/m;I)V` (line 535) is reached through the `c9.f` bridge `e(...)` (line 6618).
* Row model (branch `a:I==0`): title **`shizuku_engine_status`** (accessor `Lz/۟ۥۣۣ۠;->ۡۧۨۨ()`), dynamic status/description from the g5/b keys `shizuku_not_installed`, `shizuku_not_installed_desc`, `shizuku_service_off`, `shizuku_service_off_desc`, `shizuku_permission_needed`, `shizuku_permission_needed_desc`, `shizuku_active`, `shizuku_active_desc`, and action buttons labeled `install_shizuku_btn` (accessor `Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->ۣۨۨ۟()`), `shizuku_open_btn`, `shizuku_grant_btn`, `shizuku_active_btn`, plus status chip `working_perfectly_for` (accessor `ۦۦۧ;->ۧۢۡۤ()`).
  Buttons are `Lc0/ۦۢۦۥ;->ۧۧ۟ۥ(…;II)V` (Button wrapper) — a second button render exists at `d5\k1.smali:5695`.
* Control type: **text status row + action button(s)** (install → Play Store, open → launch `moe.shizuku.privileged.api`, grant → Shizuku pair/authorize).
* State: `b` = Shizuku state `m0/l3` (Boolean, from `o1.k` v19, updated by the `d5/j1` polling coroutine); `c` = lang state; `d` = Context.
* Handlers: Shizuku buttons use intent/launch lambdas (install/open/pair); the class also holds the §4 hide-dev button (shared method, branch `a:I==1` — see §4).
* Side effects at construction site: none beyond passing the three captured values (no writes at build time).

## 2. Section 2 — `select_language` (language picker card)

Header at **o1.k:20985** (string decrypted 20977 `Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟ۨۧۤ`).

Card content lambda — **o1.k:21003–21007**:

```smali
new-instance v7, Ld5/k;
invoke-direct {v7, v0, v11, v12}, Ld5/k;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/g1;Landroid/content/Context;)V
```

* `Ld5/k;` fields (`d5\k.smali:1–21`): `a:I`, `b:Lcom/auto/accept/ui/viewmodel/MainViewModel;`, `c:Lm0/l3;` (= lang state v11), `d:Ljava/lang/Object;` (= Context). Implements `c9/f`; content `e(...)` branches on `a:I`.
* Row model (`d5/k.e`, strings from `analysis\xor_strings.txt`):
  * title **`select_language`**, subtitle **`select_language_sub`**, current value rendered as `"<LanguageName> (<code>)"` (literals `' ('` and `')'` concatenated around the current selection).
  * account-status banner (when profile is pending): literals **`AWAITING APPROVAL`** / **`Your account is pending review.`**.
  * a SAVE button (`Lc0/ۦۢۦۥ;->ۧۧ۟ۥ` render at `d5\k.smali:4022`) whose label comes from `Ld5/t;-><init>(Lm0/l3;I)V` (see below) — the picker itself shows the list of languages (g5/b supports at least `en`/`hi`; the list itself is drawn from `Lg5/b;->a:Ljava/util/List;` — read `g5\b.smali` `<clinit>` for the full language list when building the native picker).
* Control type: **clickable value row + picker dialog + SAVE button**.
* State read: `c` (`m0/l3` = `z4/d.N` / `z4/d.M` **`app_language`** state, default `"en"`).
* **Click/change handler (the specific question)** — the SAVE lambda, `d5\k.smali:3966–3976`:

```smali
new-instance v11, Lz/p;
sget v5, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->۟ۡ۠ۤۧ:I
xor-int/lit16 v5, v5, 0x1a4
move-object/from16 v0, v42          # MainViewModel (field b)
move-object/from16 v1, v37          # selected-language m0/g1 String state (created in the dialog)
invoke-direct {v11, v0, v4, v1, v5}, Lz/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
```

  * Constructor used: **`(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V`** (NOT the Context variant). Field mapping of that ctor (`z\p.smali:38–55`): `b=p1`(MainViewModel), `c=p2`(Context), `d=p3`(selected-lang `m0/g1`), `a=p4`.
  * Dispatch value: `Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->۟ۡ۠ۤۧ:I = 0x1a2` (static field initializer, `com\google\firebase\firestore\ktx\ۢ۠ۢۧ.smali:6`). `0x1a2 XOR 0x1a4 = 0x6` = **6** → `Lz/p;->invoke()V` `packed-switch 0x3` case **`:pswitch_0`** = SAVE LANGUAGE. ✔ (confirming the hypothesis in the task brief.)
  * `:pswitch_0` behavior (verbatim reading of `z\p.smali:620–703`):
    1. `v2 = d.getValue()` (the picked **langCode** String);
    2. `MainViewModel.b` (`z4/d`).**`M.setValue(v2)`**;
    3. `z4/d.c.edit().putString(z4/d.L, v2).apply()` — **`z4/d.L` = literal `"app_language"`**;
    4. `Lg5/b;->a(Context, v2)` (apply locale to app context);
    5. `Toast.makeText(context, g5.b.b("save_language", <current lang>), 0).show()` — note the toast resolves the key `save_language` ("भाषा सुरक्षित करें" / "Save Language") in the **already-active** language.
  * **Value format: language code, e.g. `en`, `hi`** (not display names) — stored in default SharedPreferences under `app_language`, default **`en`** (both `z4/d.<init>` `getString("app_language","en")` and `onSharedPreferenceChanged` re-read with default `"en"`). The encrypted twin is `z4/b` → key **`sec_app_language`**, default `en`.
* Button label lambda (`d5\k.smali:3978–3986`):

```smali
new-instance v4, Ld5/t;
sget v5, Ld/۟ۤ۠ۡۨ;->ۥۣۢۡ:I        # .field = 0x169  (d\۟ۤ۠ۡۨ.smali:6)
xor-int/lit16 v5, v5, 0x160        # -> 0x9
invoke-direct {v4, v0, v5}, Ld5/t;-><init>(Lm0/l3;I)V    # p0 = v41 = lang state
```
  → `Ld5/t;` label case **9** = `save_language` (label set of `d5/t.b`: `APPLY`, `Sign Out`, `SIGNOUT`, `VERIFYING PAYMENT...`, `VERIFY PAYMENT`, `hide_btn`, `save_language`, `Change Password`, `Send Verification Email`, `clear_all`, `add_filter`).
* Side effects at the construction site: reads lang state (`t0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ` getValue) twice (for `g5.b.b`), remembers the dialog selection state (`v37`), animates the card color (`z3/۟ۡ۠ۦۣ;->۟۠ۦۥۣ(JJ…)`, `t1/ۧۦۤۧ;->ۣ۟ۡۢ`).

## 3. Section 3 — `accept_timer_title` (Remove Ola accept timer)

Header at **o1.k:21067** (string decrypted 21059 `Lp4/ۣ۟۟ۢۥ;->ۦۣۨۤ`).

Card content lambda — **o1.k:21081–21087**:

```smali
new-instance v9, Ls/k;
const/4 v14, 0x4                       # dispatch I = 4
move-object v10, v15                   # v15 = zero-animation Boolean state (window_animation_scale==0f)
invoke-direct/range {v9 .. v14}, Ls/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
```

* `Ls/k;` fields (`s\k.smali:9–17`): `a:I`(=4), `b`,`c`,`d`,`e` Objects = (v15 anim-state, v11 lang, v12 Context, v13 shizuku-state — exact slot order: ctor args in order land in `b,c,d,e` via `iput`).
* `s/k.e()` branches: `packed-switch v5` (`a:I`) `.packed-switch 0x0` (values 0→`:pswitch_3`, 1→`:pswitch_2`, 2→`:pswitch_1`, 3→`:pswitch_0`); **dispatch 4 falls to the default body** (line 76 ff.) which is this row's content.
* Row model:
  * title **`accept_timer_title`** — Hindi table: "ओला एक्सेप्ट टाइमर हटाएं" ("Remove Ola accept timer"); accessor `Lx8/ۢۨۥۨ;->ۥ۟۟ۦ()` also returns this key.
  * description **`accept_timer_desc`** — "टाइमर एनीमेशन हटा दिया जाएगा और राइड तुरंत स्वीकार होगी। शिज़ुकु आवश्यक है।" ("The timer animation will be removed and the ride accepted instantly. Shizuku required.").
  * icon built as `ImageVector` (`Li1/e;-><init>(String;FFFFJIZI)V` — material icon path data) + `Le1/n0`(tint) + `k/f`(fill).
* Control type: **Switch row** (title + description + toggle).
* Checked state: `b.getValue()` = the **`window_animation_scale == 0.0f`** Boolean state created in `o1.k` (19690–19712). **No SharedPreferences for this row.**
* **Change handler (the specific question)** — `s\k.smali:976–984`:

```smali
new-instance v1, Lb/g;
const/16 v2, 0x15                    # dispatch = 21
invoke-direct {v1, v10, v8, v9, v2}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
```
  (ctor field map `b\g.smali:19–33`: `b=p1`(Context), `c=p2`(shizuku-active `m0/l3`), `d=p3`(anim `m0/g1`), `a=p4`.)
  * Dispatch **21** → `Lb/g;->invoke(Object)` `packed-switch 0x0` case **`:pswitch_3`** (value 21) → `check-cast it, Boolean` → `invoke-virtual {p0, z}, Lb/g;->f(Z)V` → `f` `packed-switch 0x14` (covers only 20) → **default = "Zero Animation Mode"** (`b\g.smali:570–800`):
    1. if `c.getValue()` (Shizuku active) is false → `Toast(context, "Enable Shizuku first to use this feature", 0)` (**literal English string**, not localized) and stop;
    2. else `d.setValue(checked)`;
    3. Shizuku shell via `Lo7/d0;->b0([String;)Process` (`ShellTapExecutor` reflection): **`settings put global window_animation_scale <0|1>`, `transition_animation_scale <0|1>`, `animator_duration_scale <0|1>`** (the `"0"`/`"1"` literal is picked from `checked`);
    4. `Log.d("ShellTapExecutor", "⚡ Zero Animation Mode set to scale=" + value)`.
* **Answer:** the `accept_timer` row does **not** touch any SharedPreferences key. It controls the three `Settings.Global` animation scales (0 = "timer removed"); its checked state is `Settings.Global.window_animation_scale == 0` with default `1.0f`. (`MainViewModel.t(J)V`/`k(String)J` are **not** involved here — they belong to the subscription-plan logic, see §7.)
* Side effects at construction site: reads `b`, `e`, `d`, `c` field values (`iget-object` into locals), reads states via `t0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ` before the row; `Lm0/l2;-><init>(Lm0/m;)V` = Composer key bookkeeping.

## 4. Section 4 — `anti_detection_title` (Hide Developer Options)

Header at **o1.k:21147** (string decrypted 21139 `Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->۟ۡ۟ۨۧ`).

Card content lambda — **o1.k:21161–21165**:

```smali
new-instance v7, Ld5/k1;
const/4 v5, 0x0                      # ctor I parameter (dropped by the merged ctor)
invoke-direct {v7, v11, v13, v12, v5}, Ld5/k1;-><init>(Lm0/g1;Lm0/g1;Landroid/content/Context;I)V
```

* The 4-arg ctor (`d5\k1.smali:392–409`) hard-sets **`a:I = 1`** (`const/4 v0, 0x1; iput v0, p0, Ld5/k1;->a:I`; the `I` parameter is unused) and maps `p1→b`(=lang state v11), `p2→c`(=shizuku/anim Boolean state v13), `p3→d`(Context). Branch `a:I==1` of `a()` = this card.
* Row model (`Ld5/k1;->a` XOR strings): title **`anti_detection_title`** ("डेवलपर विकल्प छुपाएं" / "Hide Developer Options"), description **`anti_detection_desc`** ("राइड ऐप्स को डेवलपर विकल्प का पता लगाने से रोकता है।") + a filled **button**.
* Control type: **text row (title/desc) + button** (not a switch).
* State read: `v30` Boolean state (Shizuku-active, read at `d5\k1.smali:2376–2384`) gates the button.
* **Click handler (verbatim)** — `d5\k1.smali:2416–2428`:

```smali
new-instance v15, Lz/p;
sget v5, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۡۤ۠:I
xor-int/lit16 v5, v5, -0x2e8
move-object/from16 v0, v29            # Context
move-object/from16 v1, v30            # Object = shizuku-active Boolean state (m0/g1)
move-object/from16 v2, v32            # m0/l3 = lang state
invoke-direct {v15, v0, v1, v2, v5}, Lz/p;-><init>(Landroid/content/Context;Ljava/lang/Object;Lm0/l3;I)V
```

  * Constructor used: **`(Landroid/content/Context;Ljava/lang/Object;Lm0/l3;I)V`** — field map (`z\p.smali:19–36`): `c=p1`(Context), `d=p2`(Boolean state), `b=p3`(lang `l3`).
  * Dispatch value: `Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۡۤ۠:I = **-0x2e1**` (static field initializer `androidx\versionedparcelable\۟ۦۦ۟ۧ.smali:6`). `(-0x2e1) XOR (-0x2e8) = 0x7` = **7** → outside 3..6 → **default case** of `Lz/p;->invoke()V` = the "Hide Developer Settings" Shizuku handler (the other agent's case): if `d.getValue()` false → Toast `g5.b.b("enable_shizuku_first", lang)`; else `Lo7/d0.P()` then two Shizuku shell execs `settings put global development_settings_enabled 0` and `settings put global adb_enabled 0`, `Log.d("ShellTapExecutor","🔒 Hide Developer Settings executed via Shizuku")`, Toast `g5.b.b("dev_options_hidden", lang)`; on failure Toast `"hideDevSettings failed: "+e`.
* Button label lambda (`d5\k1.smali:2430–2434`):

```smali
new-instance v5, Ld5/t;
sget v4, Lo8/۟ۢۧۢۤ;->ۤۡۢۥ:I          # .field = -0x3a6  (o8\۟ۢۧۢۤ.smali:6)
xor-int/lit16 v4, v4, -0x3b0          # -> 0xA = 10
invoke-direct {v5, v0, v4}, Ld5/t;-><init>(Lm0/l3;I)V    # p0 = v32 = lang state
```
  → `d5/t` label case **10** (`hide_btn` in the label set).
* Side effects at construction site: color animation (`z3/۟ۡ۠ۦۣ;->۟۠ۦۥۣ` with `sget v6, Ld7/۟ۢۧۧ۠;->ۣ۟۠ۢۡ:I`, `xor-long` of `0x102`), corner radius (`Lo8/۟ۢۧۢۤ;->ۤۡۢۥ XOR -0x3b0` → `Dp`), a `remember` wrapper `Lc1/ۣۡۢۦ;->۟ۢۤۧۢ(composer, key=0x278b6e9e⊟…, label-lambda)`.

## 5. Section 5 — `quick_setup` (Setup Guide card)

Header at **o1.k:21225** (string decrypted 21217 `Lw2/۟ۧۥۦۨ;->ۨۤۤ`).

Card content lambda — **o1.k:21239–21249**:

```smali
new-instance v14, Ld5/u;
move-object/from16 v15, p0       # MainViewModel
...
invoke-direct/range {v14 .. v19}, Ld5/u;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Landroid/content/Context;Lm0/g1;Lm0/g1;Lm0/g1;)V
# args: MainViewModel, Context(v12), lang state(v11), state v13, shizuku state v19
```

* `Ld5/u;` fields (`d5\u.smali:13–23`): `a:I`, `b:Lm0/l3;`, `c:MainViewModel;`, `d:Object;`, `e:Lm0/l3;`, `f:Lm0/l3;`. Implements `c9/f`; `e()` dispatches to content method **`a(Ly/v;Lm0/m;I)V`** (line 714) for this constructor variant (the `e()` body's "Verify Email" branch belongs to the third ctor variant `<init>(Lm0/g1;Lm0/g1;Lm0/g1;Lm0/l3;Lcom/auto/accept/ui/viewmodel/MainViewModel;)V` used by the verify-email screen in `d5\g1.smali:2509`).
* **Child rows of the `quick_setup` section** (from `Ld5/u;->a` string table + render calls, in order):

| # | key(s) | control | handler | notes |
|---|---|---|---|---|
| header | `setup_guide` + `setup_guide_desc` | section text | — | decrypted in `a()` |
| step 1 | stepNo literal `'1'`, **`enable_accessibility`** ("Enable accessibility service") | setup-step card (`Lk1/ۨ۟ۧۡ;->۟ۦۨۡۦ` = `Ld5/o1;->l(stepNumber,title,checked,icon,onClick)`, render at 1654) | **`Lk4/p;-><init>(Landroid/content/Context;I)V`** at 1638–1648, dispatch `sget v4, Lq0/ۥۣۡۧ;->۟ۦ۟ۧ:I` + `xor-int/lit16 v4, v4, 0x324` → `k4/p` case **5/9 = `Intent(android.settings.ACCESSIBILITY_SETTINGS)`** | checked flag from a Boolean state (`v22`, = accessibility granted, kept fresh by `MainViewModel.e()`) |
| step 2 | `'2'`, **`enable_dev_options`** ("Enable developer options") | step card (render 2001) | lambda `Lf0/d0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V` at 1979–1991 → runs Shizuku shell `settings put global development_settings_enabled 1` (literals `'settings'`,`'put'`,`'global'`,`'development_settings_enabled'`,`'1'`), plus `'hidden_api_policy'` / `'hidden_api_blacklist_exemptions'` reflection (`launchIntentForPackage`/`systemService`/`getService`/`ref.invoke`) | needs Shizuku (`enable_shizuku_first` toast otherwise) |
| step 3 | `'3'`, **`pair_shizuku`** ("Pair and authorize Shizuku") | step card (render 2378) | lambda `Lc5/p;-><init>(Landroid/content/Context;Lm0/g1;I)V` at 2360–2372 → `launchIntentForPackage("moe.shizuku.privileged.api")` (opens Shizuku app) | |
| step 4 | `'4'`, **`grant_overlay`** ("Grant display over other apps") | step card (render 2458) | **`Lk4/p;-><init>(Landroid/content/Context;I)V`** at 2440–2450, dispatch `sget v4, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟۠۟ۨۡ:I` + `xor-int/lit16 v4, v4, -0x188` → `k4/p` case **6 = overlay permission intent** | |
| trailing | button (label via `Ld5/t;-><init>(Lm0/l3;I)V`, dispatch `sget v9, Lg2/ۢۥۥۡ;->۟ۧۥۦۤ:I` + `xor-int/lit16 v9, v9, -0x21c`) | filled button (render 4664) | onClick `Ld5/d;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/g1;Lm0/g1;I)V` at 4604–4616, dispatch `sget v5, Lg5/ۣۡۦۣ;->ۥۥۨۡ:I` + `xor-int/lit16 v5, v5, -0x372` | string set also includes `Change Email` / `Filled.Email` |

* Step-card signature for the native model: `o1.l(stepNumber:String, title:String, checked:Boolean, icon:ImageVector, onClick:Function0)`.
* The exact `k4/p` dispatch values at steps 1/4 must be the accessibility (5) and overlay (6) cases to match behavior; the expressions are given verbatim above (field values not resolved — see §9).

> Note: the `quick_setup` section of the Settings page is the **Setup Guide** above. A second, differently-worded "Quick Setup" card exists on the Home screen — `Ld5/o1;->c(...)` (see §6) with rows `service_control`, `driver_apps_status`, `driving_language_notice`, `fare_filter`, `alert_on_accept` and a Permissions card. Both are reported because the task's service/ride-alert questions live in that one.

---

## 6. Rows outside `o1.k` that the brief asks about

### 6a. `ride_alert_enabled` row — `Ld5/a;` "Alert on Accept" card

`Ld5/a;->e(...)` string set: **`alert_on_accept`** ("स्वीकार करने पर अलर्ट" / "Alert on accept"), **`play_sound_on_accept`** ("राइड स्वीकार होने पर ध्वनि बजाएं" / "Play sound when ride accepted"), icon `Filled.NotificationsActive`, plus the suspended-account banner `ACCESS DENIED` / `Your account has been suspended.` (`Filled.Block`).

* Constructed at **`d5\o1.smali:7137`** — i.e. **inside `Ld5/o1;->c(...)`** (the Home-screen Quick Setup card, §6b): `invoke-direct {v4, v0, v8}, Ld5/a;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/g1;)V` (second variant `<init>(Lt/k0;Lcom/auto/accept/ui/viewmodel/MainViewModel;)V` at `y3\e.smali:22290`).
* **Toggle handler (verbatim)** — `d5\a.smali:2544–2552`:

```smali
new-instance v2, Lh1/b;
sget v3, La/ۥۦۥۡ;->۟۠ۤۡۥ:I          # .field = -0x3d2  (a\ۥۦۥۡ.smali:6)
xor-int/lit16 v3, v3, -0x3dd          # (-0x3d2) ^ (-0x3dd) = 0xD = 13
move-object/from16 v0, v31            # MainViewModel
invoke-direct {v2, v0, v3}, Lh1/b;-><init>(Ljava/lang/Object;I)V
```

  → `Lh1/b;->invoke(Object)` `packed-switch 0x1` value **13 → `:pswitch_6`** (`h1\b.smali:533–567`): `it` = Boolean; writes

```smali
iget-object v0, v1, Lcom/auto/accept/ui/viewmodel/MainViewModel;->b:Lz4/d;
iget-object v0, v0, Lz4/d;->c:Landroid/content/SharedPreferences;
invoke-interface {v0}, ...->edit()Landroid/content/SharedPreferences$Editor;
const-string v1, "ride_alert_enabled"
invoke-interface {v2, v1, v3}, ...->putBoolean(Ljava/lang/String;Z)...
invoke-interface {v2}, ...->apply()V
```

  * **Pref key written: `ride_alert_enabled`** (default SharedPreferences via `z4/d.c`), value = the new toggle value. **Default when read: `true`** (`z4/d.<init>`: `getBoolean("ride_alert_enabled", v15)` with `const/4 v15, 0x1`). Mirrored in Compose state `z4/d.H:Lp9/q0;` (+ read delegate `I`) and kept in sync by `z4/d.onSharedPreferenceChanged` (re-read `getBoolean(key, TRUE)`).
* The second line `play_sound_on_accept` is rendered by the same card content; the only switch-writing handler in `d5/a.e` is the `h1/b` above — treat `play_sound_on_accept` as the row's second text line (or a second switch sharing the same pref); verify against `Lcom/google/firebase/iid/ۥۣۣۡ;->ۦۤ۟ۦ` call sites in `d5/a.e` when rebuilding.
* Dismiss button at the end of the card: `Lc5/j;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;I)V` (`d5\a.smali:3824–3832`), dispatch `sget v2, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->۟ۢۢۤۦ:I` (=-0x14c) `xor-int/lit16 v2, v2, -0x14e` → **2** → `c5/j` case `:pswitch_d` = `MainViewModel.G0 = false` (hides the banner/dialog).

### 6b. `Ld5/o1;->c(...)` — Home-screen "Quick Setup" card (contains the Service toggle & permission rows)

Signature: `c(MainViewModel;ZZZZIILjava/lang/String;JLjava/util/Map;Lc9/a;Lm0/m;II)V` (`d5\o1.smali:4337–8947`), hosted via the bridge `Ld2/۟ۦۡ۟ۦ;->۟ۧۡۡۤ(…)V` (called from `d5\i0.smali:263` / `d5\v0.smali:794`; `d5/v0` is constructed in the Home screen `d5\w0.smali:829` with 13 state params). NOT called from `o1.k`.

Child rows (keys from `analysis\xor_strings.txt` + render calls):

| row | key(s) | control | state | handler |
|---|---|---|---|---|
| Service toggle | **`service_control`** (+ `service_on`/`service_off` values) | Switch (`Ld5/o1;->g` bridge `Lv8/۟ۧۢ۟ۢ;->۟۠۟ۨ۟`, calls at 7324/7447/7620/8263) | `z4/d.p` (`service_enabled`, default **false**) | `Lc5/j;` / `Lh1/b;`-style lambda → `MainViewModel.r(Z)V` on enable, `MainViewModel.s()V` on disable (see §7) |
| Driver apps status | **`driver_apps_status`** + pkg list (`com.olacabs.customer`, `com.olacabs.oladriver`, `app.ola.driver`, `com.ubercab`, `com.ubercab.driver`, `com.ubercab.partner`, `com.rapido.rider`, `com.rapido.passenger`, `com.theporter.driverapp`, `in.juspay.nammayatripartner`, `in.juspay.nammayatri`, `in.swiggy.deliveryapp`, `com.zomato.delivery`; display names `Ola`,`Uber`,`Rapido`,`Porter`,`Namma Yatri`,`Swiggy`,`Zomato`) | status row (`o1.h`/`o1.m`-style) | installed-apps map `z4/d.J` (`per_app_settings` / `app_enabled_<pkg>`, default **true**) | opens Apps tab (`onNavigateToApps` `c9/a` param) |
| Driving language notice | **`driving_language_notice`** | text row | lang state | — |
| Fare filter | **`fare_filter`** (+ `min_fare`/`max_fare` values) | row → Filters screen | `z4/d.e`(`min_fare`, default `"50"`→50) & `z4/d.n`(`max_fare`, default `"500"`→500) | navigation |
| Alert card | `alert_on_accept` / `play_sound_on_accept` | §6a (`Ld5/a;` content) | `z4/d.H` | `Lh1/b;` dispatch **13** |
| **Permissions card** | `Permissions` header; items `Accessibility Service` (`Enabled`/`Required to detect rides`), `Overlay Permission` (`Granted`/`Required for floating widget`), `Shizuku Shell` (`Running`/`Tap to authorize Shizuku`), `Battery Optimization` (`Unrestricted`/`Tap to exempt`) | status/action rows | accessibility state refreshed by **`MainViewModel.e()V`** (reads `Settings.Secure` **`accessibility_enabled`** + **`enabled_accessibility_services`**, matches `ComponentName.flattenToString()/flattenToShortString()` against the app's service); overlay = `Settings.canDrawOverlays`; Shizuku = §1 states | `Lk4/p;` sites at `d5\o1.smali:7308/7425/8241` → `k4/p` cases 5 (accessibility settings), 6 (overlay permission), 7 (battery optimization exemption) |
| planType chip | `planType` (`HALF_MONTH`/`MONTH`/`YEAR`/`WEEK`/`DAY`), `Working perfectly for`, `with_filter`(“ (with filter: min ₹”), `without_filter`(“ (no filter)”) | `o1.b(value,label,color)` chips | `MainViewModel.k(String)J` / `l(String)I` compute plan duration from `planType` | — |

### 6c. URL link rows (`url_website` / `url_telegram` / `url_whatsapp`)

* The three URLs exist only as **resource strings** `res/values/strings.xml`: `url_telegram` (0x7f0e0094) `https://t.me/rideaccepter`, `url_website` (0x7f0e0095) `https://rider-theta.vercel.app/`, `url_whatsapp` (0x7f0e0096) `https://whatsapp.com/channel/0029VbDa51y7j6gA9aiXbK0n`.
* The **only** class reading these IDs is `k4\p.smali` (`invoke()V` cases 2/3/4 → `Intent(ACTION_VIEW, Uri.parse(getString(id)))`, see §0 table).
* They are **not** on the Settings page (`o1.k`). The three link-row construction sites are **`y3\e.smali:55553, :55575, :55597`** — three consecutive `Lk4/p;-><init>(Landroid/content/Context;I)V` builds in the Home/Dashboard composable (`y3/e`), one per channel (dispatches 2/3/4 — expressions `invoke-direct {v2, v0, v3}, Lk4/p;-><init>(Landroid/content/Context;I)V` with `v3` computed just above each site). One more `k4/p` site exists at `u\l1.smali:1461` (another screen).
* Control type: **link rows** (tap → external browser/app via ACTION_VIEW).

---

## 7. `MainViewModel` + `z4/d` — state/pref model

### `z4/d` (SharedPreferences accessor) field map (`z4\d.smali`)

Store `c` = **default SharedPreferences** (`PreferenceManager.getDefaultSharedPreferences`, listener `onSharedPreferenceChanged`); store `b`(`z4/b`) = **EncryptedSharedPreferences** (`encrypted_app_data_secure`, keyset prefs `__androidx_security_crypto_encrypted_prefs_*_keyset__`).

| field (state) | read-only | pref key (literal) | store | type | default |
|---|---|---|---|---|---|
| `e` | `f` | `min_fare` | c | String→Int | `"50"` → 50 |
| `n` | `o` | `max_fare` | c | String→Int | `"500"` → 500 |
| `p` | `q` | **`service_enabled`** | c | Boolean | **false** |
| `r` | `s` | `accepted_count` | c | Int | 0 |
| `t` | `u` | `skipped_count` | c | Int | 0 |
| `v` | `w` | `last_detected_fare` | c | Int | 0 |
| `x` | `y` | `today_earnings` | c | Int | 0 |
| `z` | — | `super_fast_mode` | c | Boolean | false |
| `A` | — | `advanced_mode` | c | Boolean | false |
| `B` | `C` | `sec_distance_filter_enabled` | b (encrypted) | Boolean | false |
| `D` | `E` | `sec_location_filter_enabled` | b (encrypted) | Boolean | false |
| `F` | `G` | `sec_location_filters` | b (encrypted) | JSON list | empty |
| `H` | `I` | **`ride_alert_enabled`** | c | Boolean | **true** |
| `J` | `K` | `app_enabled_<appName>` (prefix literal `app_enabled_`) | c | Boolean per app | true |
| **`L`** | — | (key name constant **`app_language`**) | — | String | — |
| **`M`** | `N` | **`app_language`** | c | String (code: `en`,`hi`,…) | **`en`** |
| `a/b/c/d` | — | Context / `z4/b` / default SharedPreferences / Gson | | | |

Other literals in `<init>`: migration flag `migrated_to_encrypted_v1`, legacy `distance_filter_enabled`, `location_filter_enabled`, `min_pickup_km`, `max_pickup_km`, `min_drop_km`, `max_drop_km`, `plan_expiry` → migrated to `sec_plan_expiry_ms`, `location_filters`, `per_app_settings`, `history_json` (`z4/g`, file prefs `ride_history`). `z4/b`: `sec_app_language` (default `en`), `sec_master_filter_enabled`, `sec_location_filters`, `sec_plan_expiry_ms`. `b()` also force-puts `sec_plan_expiry_ms = 0x7fffffffffffffffL` into the per-app map.

`onSharedPreferenceChanged` mirrors `min_fare→e`, `max_fare→n`, `service_enabled→p`, `accepted_count→r`, `skipped_count→t`, `last_detected_fare→v`, `today_earnings→x`, `super_fast_mode→z`, `advanced_mode→A`, `ride_alert_enabled→H` (re-read default **true**), `app_enabled_*→J`, `app_language→M` (re-read default `en`).

### `MainViewModel` method map (for the rows)

| method | behavior |
|---|---|
| `e()V` | **Refresh accessibility state**: `Settings.Secure.getInt(resolver,"accessibility_enabled")` + `getString(resolver,"enabled_accessibility_services")`, builds `ComponentName(context, <service class>)`, compares `flattenToString()`/`flattenToShortString()` → writes the accessibility-granted Boolean states; also folds in `Lj4/ۣۧۤ;->ۧۦۡ()Z` (Shizuku alive). Feeds the `accessibility_enabled`/`service_enabled` permission rows and the `r(Z)` guard. (`La5/i0`/RemoteConfig also carries an `accessibility_enabled` config key.) |
| `r(Z)V` | **Service toggle (ON intent Z=true / OFF)**: guards — internet (`NetworkCapabilities`), active subscription (`No active subscription plan. Please subscribe first.`), accessibility (`Please grant accessibility permission first.`), at least one supported driver app installed (`com.ubercab.driver`, `com.ubercab.partner`, `com.olacabs.oladriver`, `app.ola.driver`, `com.rapido.rider`, `com.rapido.passenger`, `com.theporter.driverapp`, `in.juspay.nammayatripartner`, `in.juspay.nammayatri`, `in.swiggy.deliveryapp`, `com.zomato.delivery`), and Shizuku running&paired for Ola/Uber (`… requires Shizuku to be running & paired. Complete Shizuku setup in Settings tab first, or disable them in Apps tab.`). On success: `z4/d.c.edit().putBoolean("service_enabled", Z)`, starts **two services** (`RideAcceptorService` + `OverlayService` — two `Intent(context, Class)` `startService` calls) and updates `z4/d.p`; errors surface as toasts (`No internet connection. Service requires internet.`, `No supported driver apps (Ola, Uber, Rapido, Porter, etc.) found on your device. Service cannot be started.`). |
| `s()V` | **Stop service**: cancels the running job, `putBoolean("service_enabled", false)` + apply, `stopService` on both service Intents, updates auth/firestore presence (`Ld9/ۧۧۨۥ;->۠ۤۧۦ`), resets states (Boolean flags ← false, last-fare string ← `""`), then a `(J)V` bridge call with `0x50` (`ۦۣۤ۠;->ۨۦۥۥ`) and `Lm9/w;->ۥۨ۠۠()` cleanup. |
| `t(J)V` | Write **`sec_plan_expiry_ms`** (`putLong`) through `z4/b.a()` (encrypted prefs) + update the corresponding state. (Subscription plan expiry — used by `MainViewModel.k()/l()` plan helpers; **not** the accept-timer.) |
| `k(String)J` | planType (`DAY`/`WEEK`/`HALF_MONTH`/`MONTH`/`YEAR`) → duration ms. |
| `l(String)I` | planType → int form (months/ordinal). |
| `u(String,String)V` | launches coroutine `f5/e0` in viewModelScope via `La5/j` authManager (profile/firestore update). |
| `v(int,String,String,Z)V` | launches coroutine `f5/g0` (analytics/ride-event logging). |
| `g()F / h()F / i()F / j()F` | Float getters used by the distance-filter UI (min/max pickup/drop km sliders; plain reads — filter values live in `sec_min_pickup_km` etc.). |

---

## 8. Answers to the specific questions (direct)

1. **`accept_timer` row** = "Remove Ola accept timer" (`accept_timer_title`/`accept_timer_desc`). Checked state = `Settings.Global.window_animation_scale == 0f` (default `1.0f` → unchecked). Handler = `Lb/g;-><init>(Context, shizukuState, animState, 21)` (`s\k.smali:984`, `const/16 v2, 0x15`) → `invoke()`:pswitch_3 → `f(Z)` default = **"Zero Animation Mode"**: Shizuku shell `settings put global window_animation_scale|transition_animation_scale|animator_duration_scale <0|1>`, local state update, toast `Enable Shizuku first to use this feature` when Shizuku is down. **No pref key is written.** `MainViewModel.t(J)V` / `k(String)J` are plan-expiry helpers and are **not** part of this row.
2. **`ride_alert_enabled` row** (`alert_on_accept`, second line `play_sound_on_accept`, in the `Ld5/a;` card hosted by `o1.c`): onCheckedChange = `Lh1/b;-><init>(MainViewModel, I)` with
   `sget v3, La/ۥۦۥۡ;->۟۠ۤۡۥ:I` (= −0x3d2) `xor-int/lit16 v3, v3, -0x3dd` → **13** → `invoke():pswitch_6` → `MainViewModel.b.c.edit().putBoolean("ride_alert_enabled", newValue).apply()`. Pref key **`ride_alert_enabled`**, default **`true`** (state `z4/d.H`).
3. **Language picker** writes pref key **`app_language`** (`z4/d.L` holds that literal; state `z4/d.M`, default `en`) in **code format (`en`, `hi`, …)** — also `z4/d.M.setValue`, `g5.b.a(context, code)` locale switch, toast `g5.b.b("save_language", …)`. Click lambda **is** `Lz/p;` case **`:pswitch_0`** of `invoke()V`, constructed with the **`(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V`** constructor at `d5\k.smali:3976` with dispatch `sget v5, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->۟ۡ۠ۤۧ:I` (=0x1a2) + `xor-int/lit16 v5, v5, 0x1a4` → **6**. ✔
4. **`accessibility_enabled` / `service_enabled` rows (Service toggle)**: the toggle is `service_control` in `o1.c`; its change path calls `MainViewModel.r(Z)V` (start: validates internet/subscription/accessibility/installed driver apps/Shizuku, writes **`service_enabled`**=Z to default prefs, `startService` on `RideAcceptorService` + `OverlayService`) and `MainViewModel.s()V` (stop: `service_enabled`=false, `stopService` both). The `accessibility_enabled` status row reads the system `Settings.Secure` keys `accessibility_enabled` / `enabled_accessibility_services` through `MainViewModel.e()V` (no pref of its own).
5. **`quick_setup` section children** (Settings page, `d5/u.a`): header `setup_guide`+`setup_guide_desc`; step 1 `enable_accessibility` (click `k4/p` → accessibility settings); step 2 `enable_dev_options` (click → Shizuku shell `settings put global development_settings_enabled 1` + hidden-API exemptions); step 3 `pair_shizuku` (click → launch `moe.shizuku.privileged.api`); step 4 `grant_overlay` (click `k4/p` → overlay permission); trailing action button (`Ld5/d;` click + `Ld5/t;` label). (The Home screen's separate QuickSetup card `o1.c` lists `service_control`, `driver_apps_status`, `driving_language_notice`, `fare_filter`, `alert_on_accept` + the `Permissions` checklist — §6b.)
6. **URL rows**: `url_website` / `url_telegram` / `url_whatsapp` do **not** appear in `o1.k`. They are `k4/p` dispatch cases 2/3/4 (ACTION_VIEW + `getString(0x7f0e0095/94/96)`); the three link-row construction sites are `y3\e.smali:55553/55575/55597` (Home/Dashboard screen), handler class `Lk4/p;-><init>(Landroid/content/Context;I)V` → `invoke()V` `packed-switch 0x2`.

---

## 9. Residual items / verification notes

* Unresolved static int fields (expressions are verbatim in-place above): `Lq0/ۥۣۡۧ;->۟ۦ۟ۧ:I` (step-1 `k4/p` dispatch ⊕ 0x324), `Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟۠۟ۨۡ:I` (step-4 `k4/p` ⊕ −0x188), `Lg5/ۣۡۦۣ;->ۥۥۨۡ:I` (quick_setup trailing button `d5/d` ⊕ −0x372), `Lg2/ۢۥۥۡ;->۟ۧۥۦۤ:I` (its `d5/t` label ⊕ −0x21c), `Lq6/ۣ۟ۢ۟ۤ;->ۡ۠ۢۦ:I` (was for `l2/i`, which turned out to be a Text-alignment wrapper, not a handler). Their `<clinit>`s follow the same pattern (`.field … :I = <hex>` initializers, as with all fields resolved in §2/§4/§6a).
* `d5/k.e`'s language list contents (display names + codes offered in the picker) are in `g5\b.smali` `<clinit>` (the giant key→{language→text} map) and `Lg5/b;->a:Ljava/util/List;`; read those two for the exact picker entries.
* Whether `play_sound_on_accept` is a description line or a second switch (and, if a switch, its write target) could not be pinned 1:1 — the only preference-writing handler in `Ld5/a;->e` is the `h1/b` above. There is no `play_sound` SharedPreferences key in `z4/d`; if it is a switch it must persist elsewhere (e.g. `a5/i0` remote config) or be UI-local.
* `MainViewModel.s()` calls a `(J)V` bridge with `0x50` (`ۦۣۤ۠;->ۨۦۥۥ`); its target wrapper file (`com\google\firebase\analytics\ktxtesting\ۦۣۤ۠.smali`) exists but was not opened; if it bridges `t(J)V` that would write `sec_plan_expiry_ms=80` on service stop (suspect — likely a different helper; verify before porting).
* The exact `o1.j` header widget (icon source per section) and `o1.g/l/h/m/b` widget internals were mapped from their bridges/param names, not line-by-line renders: `o1.g(title,description,checked,icon,onCheckedChange)` = switch row; `o1.l(stepNumber,title,checked,icon,onClick)` = numbered setup-step row; `o1.h(label,value)` = label/value row; `o1.m(icon,label,value,color,trailing)` = icon row; `o1.b(value,label,color)` = stat chip; `o1.j(icon,title)` = section header.
* `d5\o1.smali.o1backup` is a backup copy of `o1.smali` (identical line numbers for the cited sites).
