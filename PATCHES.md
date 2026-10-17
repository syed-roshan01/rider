# Smali patches applied to `decoded-apktool/`

The decoded smali tree is gitignored (it is a reverse-engineering artifact and is
large), so the edits made to it are recorded here. Every patch is a hand edit to a
file under `decoded-apktool/smali/`. The originals are kept next to each file as
`<name>.smali.orig`.

Build with `.\build.ps1 all` (dex -> build -> sign -> verify).

## 1. Remove Firebase sign-in - `smali/a5/j.smali`

`a5/j` is `AuthManager`. `b()Z` is "is signed in"; `a()Ljava/lang/String;` is the
current user id.

| method | becomes |
|---|---|
| `b()Z` | `.locals 1 / const/4 v0, 0x1 / return v0` |
| `a()Ljava/lang/String;` | `.locals 1 / const-string v0, "rideaccepter-local" / return-object v0` |

Effect: the sign-in / sign-up screens are never shown.

> Note: returning `Settings.Secure.ANDROID_ID` here crashed with
> `NoSuchFieldError: No field f1276a`, because jadx's field names are not the
> smali field names. A constant string is the safe substitute.

## 2. Bypass the plan-expiry comparison - `smali/com/auto/accept/ui/viewmodel/MainViewModel.smali`

One `cmp-long` + `if-lez` pair compared the plan expiry against "now" and branched
to the paywall. Replaced with an unconditional `goto` of the same target.

```
cmp-long v0, v2, v4
if-lez v0, :cond_4
        |
        v
goto :cond_4
```

Matched with a register-agnostic regex (the obfuscator renames registers):

```
cmp-long\s+(\w+),\s*(\w+),\s*(\w+)\s*\r?\n[ \t]*if-lez\s+\1,\s*(:[\w$]+)   ->   goto $4
```

Exactly one site matched.

## 3. Never-expiring plan mirror - `smali/z4/d.smali`

`z4/d` is `EncryptedPreferencesManager`. Its constructor mirrors the vendor's
`plan_expiry` key (default `SharedPreferences`) into `sec_plan_expiry_ms`
(encrypted prefs), but only when the value is > 0 and only on first migration.

Two edits:

1. `if-eqz v12, :cond_0` + `goto/16 :goto_6` -> `goto :cond_0`, so the read path is
   taken even on an already-migrated install.
2. Immediately after `move-result-wide v11` (the `getLong("plan_expiry", 0L)` result),
   insert `const-wide v11, 0x7fffffffffffffffL`, so `sec_plan_expiry_ms` is recorded
   as `Long.MAX_VALUE`.

## 4. Go straight to Dashboard after activation - `smali/c5/o.smali`  **(this is the one that removed the payment flow)**

`c5/o.g(...)` is the screen dispatcher. It renders one composable per screen and
chooses between the home screen and the subscription/payment screen with a single
test. Line 321:

```
if-eqz v11, :cond_a        ; truthy -> d5/o1.f() (Dashboard)  / falsy -> y3/e.y() (payment)
        |
        v
nop                         ; always fall through to Dashboard
```

The payment screen is `y3/e.y(MainViewModel, boolean, Composer, int, int)`. It
constructs `d5/k2`, which is where every subscription string is decoded
("CHOOSE YOUR PLAN", "Select a subscription to get started", the plan names).
Making the payment branch unreachable leaves it as dead code - it is still
compiled but never drawn.

## Not the paywall (each was tried and disproved)

Recorded so they are not retried:

* `smali/com/auto/accept/data/model/UserProfile.smali` - `planExpiry` accessor and
  the 5 boolean accessors. Forcing these also faked "already activated", which made
  the licence screen disappear. Reverted.
* `y3/e.k(...)` - the *checkout* screen shown after tapping a plan. Emptying it
  produced a white screen on tap. Reverted.
* `d5/l.a(...)`, `a0/v`, `ktxtesting/...` - lambda/plan-row fragments. Emptying them
  did not remove the payment screen. Reverted.
* `d5/o1.i(...)`, `s2/...` - built a plan-row lambda and a render wrapper.
  Emptying them did not remove the payment screen. Reverted.
* `MainViewModel.n()Z` and `MainViewModel.r(Z)V` - forced to "subscribed"; no
  effect on the routing decision.

## Regenerating `classes2.dex`

The injected activation screen lives in `apk-src/` and is compiled to
`decoded-apktool/unknown/classes2.dex`. `build.ps1 dex` does `javac` -> `d8` and
then verifies the output is newer than the sources, so a stale dex cannot ship.
