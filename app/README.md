# app/ — the AcceptPro Android app

| path | what it is |
|---|---|
| `smali/` | app core (accessibility service, view models, models, settings) — the tree `apktool b` compiles |
| `java/` | dashboard / activation / overlay / device-identity sources → `unknown/classes2.dex` |
| `res/`, `assets/`, `AndroidManifest.xml`, `apktool.yml` | app resources, manifest, apktool project metadata |
| `design/` | design source art: `acceptpro-logo.png`, `brandlogos/` (not packed into the APK) |
| `unknown/` | output slot for the compiled `classes2.dex` |
| `original/` | baseline v6 build + its original manifest/META-INF (used by `verify`) |
| `patch-fragments/` | smali fragments used while editing the core |
| `dist/` | build outputs; deliverable: `RideAccepter-mod.apk` (signed, tracked). Rest is regenerable |
| `build/` | apktool build cache (regenerable, gitignored) |
| `build.ps1` | build pipeline (Windows) |

Before editing smali, read [`../docs/recovery-notes/PATCHES.md`](../docs/recovery-notes/PATCHES.md)
— it documents the edits already applied and the invariants that must not break.

## Build / install (Windows)

Requirements: JDK (`javac`, `keytool`), Android SDK **build-tools 36.0.0** plus a
`platforms\*` `android.jar`, `apktool` on `PATH`, `adb`. Paths resolve from the repo
root regardless of where the script is invoked.

```powershell
.\app\build.ps1 dex      # app\java\*.java -> javac -> d8 -> app\unknown\classes2.dex
.\app\build.ps1 build    # apktool b app -> app\dist\RideAccepter-mod.apk
.\app\build.ps1 sign     # zipalign + apksigner (tools\debug.keystore, auto-created)
.\app\build.ps1 verify   # resource-ID + dex round-trip check vs app\original\Ride Accepter-v6.apk
.\app\build.ps1 install  # adb install -r
.\app\build.ps1 all      # everything above
.\app\build.ps1 clean    # remove app\dist
```

The script refuses to continue on stale outputs (apktool can "succeed" while aborting
mid-smali) and on a `classes2.dex` older than the Java sources. Those guards each
caught a real broken build — keep them.

Two invariants the `verify` step enforces:

1. **1702 resource IDs, id → type/name mapping identical** to the baseline build —
   the dex inlines those IDs as constants.
2. **`classes.dex` round-trips byte-identical** through smali → dex.

> macOS/Linux: same steps work with `javac`/`d8`/`apktool`/`zipalign`/`apksigner` from
> Android build-tools; the pipeline script is PowerShell (a bash port is not written yet).

## Install a prebuilt APK

```bash
adb install -r app/dist/RideAccepter-mod.apk
adb shell monkey -p com.ride.accepter -c android.intent.category.LAUNCHER 1
```

Debug keystore: `tools/debug.keystore` (alias `androiddebugkey`, store/key pass `android`).
If the device has a build signed with a different key, uninstall first (app data is lost).

Runtime setup on the phone: enable the AccessibilityService, install/grant **Shizuku**
(or use the ADB fallback) for tap injection, and activate with a valid licence key —
activation talks to the Supabase Edge Function (see `supabase/functions/api`).
