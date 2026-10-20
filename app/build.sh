#!/usr/bin/env bash
# Ride Accepter - build / sign / verify / install pipeline.
# macOS port of app/build.ps1. Keep the two in sync.
#
#   ./app/build.sh build     rebuild APK from the app tree
#   ./app/build.sh sign      zipalign + apksigner sign (creates keystore if needed)
#   ./app/build.sh verify    assert resource IDs survived the rebuild
#   ./app/build.sh install   adb install -r
#   ./app/build.sh all       build -> sign -> verify -> install
#
# Verified round-trip facts (do not break these):
#   * classes.dex is byte-identical through smali -> dex (10,076,240 bytes)
#   * 1702 resource IDs, id -> type/name mapping must stay identical, because
#     the dex inlines those IDs as constants.
#   * aapt2 re-derives res/ FILE paths from resource names, so the obfuscated
#     NP-Manager paths (res/zu.png) come back as canonical paths
#     (res/drawable-xhdpi/abc_*.png). Harmless - Android looks up by ID.
set -euo pipefail

TASK="${1:-all}"
SRC="app"
OUT="app/dist/RideAccepter-mod.apk"
KEYSTORE="tools/debug.keystore"
STOREPASS="android"
KEYPASS="android"
ALIAS="androiddebugkey"
ORIG_APK="app/original/Ride Accepter-v6.apk"

# All relative paths resolve from the repo root (parent of this script).
cd "$(dirname "$0")/.."

# --- toolchain ----------------------------------------------------------------
export JAVA_HOME="${JAVA_HOME:-/opt/homebrew/opt/openjdk@17}"
export PATH="$JAVA_HOME/bin:/opt/homebrew/bin:$PATH"
export ANDROID_HOME="${ANDROID_HOME:-/opt/homebrew/share/android-commandlinetools}"

# Auto-detect the newest installed build-tools / platform instead of pinning a
# version, so a brew/sdks bump cannot silently break the pipeline.
BT="$(ls -1d "$ANDROID_HOME"/build-tools/* 2>/dev/null | tail -1)"
ANDROID_JAR="$(ls -1d "$ANDROID_HOME"/platforms/*/android.jar 2>/dev/null | tail -1)"
ADB="$(command -v adb)"
KEYTOOL="$JAVA_HOME/bin/keytool"
APKTOOL="$(command -v apktool)"

say() { printf '==> %s\n' "$*"; }
die() { printf 'ERROR: %s\n' "$*" >&2; exit 1; }
step() { local n="$1"; shift; say "$n"; "$@" || die "$n failed"; }

[ -n "$BT" ]         || die "no build-tools under $ANDROID_HOME (sdkmanager \"build-tools;36.0.0\")"
[ -n "$ANDROID_JAR" ] || die "no android.jar under $ANDROID_HOME/platforms"
for tool in "$ADB" "$KEYTOOL" "$APKTOOL"; do
  [ -e "$tool" ] || die "missing tool: $tool"
done

# --- dex ----------------------------------------------------------------------
# Compiles app/java/**.java -> app/unknown/classes2.dex. This is the ONLY way
# the injected activation screen reaches the APK. There used to be no such step
# at all, so Java edits were silently dropped and stale dex shipped -- do not
# remove the freshness check below.
task_dex() {
  [ -d app/java ] || die "no 'app/java' directory"
  say 'compiling classes2.dex from app/java'
  local cls_out=app/dist/javac-out dex_out=app/dist/d8-out src_list=app/dist/sources.list
  rm -rf "$cls_out"
  mkdir -p "$cls_out" "$dex_out" app/dist

  find app/java -name '*.java' | sed 's/.*/"&"/' > "$src_list"
  [ -s "$src_list" ] || die 'no .java sources under app/java/'

  # javac writes harmless NOTEs to stderr, so capture to a log and judge the
  # exit code ourselves. -source/-target 8 because d8 rejects class major 69.
  javac -source 8 -target 8 -Xlint:-options -encoding UTF-8 \
        -cp "$ANDROID_JAR" -d "$cls_out" "@$src_list" > app/dist/javac.log 2>&1 \
    || { tail -20 app/dist/javac.log; die 'javac failed'; }

  # Zip the classes and hand d8 one archive argument - d8 accepts zip/jar
  # inputs, and it avoids any command-line length limit.
  rm -f app/dist/classes.jar
  ( cd "$cls_out" && "$JAVA_HOME/bin/jar" cf ../classes.jar . )
  d8 --min-api 26 --output "$dex_out" app/dist/classes.jar > app/dist/d8.log 2>&1 \
    || { tail -20 app/dist/d8.log; die 'd8 failed'; }

  # d8 names its single-dex output classes.dex; the multidex slot is classes2.dex
  [ -f "$dex_out/classes.dex" ] || die 'd8 produced no classes.dex'
  mv -f "$dex_out/classes.dex" "$dex_out/classes2.dex"
  mkdir -p app/unknown
  cp -f "$dex_out/classes2.dex" app/unknown/classes2.dex

  if [ -n "$(find app/java -name '*.java' -newer app/unknown/classes2.dex 2>/dev/null)" ]; then
    die 'classes2.dex is OLDER than the Java sources - stale dex, refusing to continue'
  fi
  say "    classes2.dex: $(stat -f%z app/unknown/classes2.dex) bytes (newer than sources)"
}

# --- build --------------------------------------------------------------------
task_build() {
  [ -d "$SRC" ] || die "source tree '$SRC' not found"
  mkdir -p "$(dirname "$OUT")"
  say "rebuilding from $SRC"
  # Trust the output's freshness rather than apktool's exit code -- that is what
  # actually catches a "Could not smali file" abort leaving a stale APK in place.
  apktool b "$SRC" -o "$OUT" -f || true
  [ -f "$OUT" ] || die 'apktool produced no output'
  local stale
  stale="$(find "$SRC" -type f -newer "$OUT" 2>/dev/null | head -1)"
  [ -z "$stale" ] || die "apktool FAILED SILENTLY: $OUT is older than $stale (a stale APK was about to be signed)"
  say "    built: $(stat -f%z "$OUT") bytes"
}

# --- sign ---------------------------------------------------------------------
task_sign() {
  [ -f "$OUT" ] || die 'nothing to sign - run build first'
  if [ ! -f "$KEYSTORE" ]; then
    say "generating keystore $KEYSTORE"
    mkdir -p "$(dirname "$KEYSTORE")"
    "$KEYTOOL" -genkeypair -v -keystore "$KEYSTORE" -storepass "$STOREPASS" \
      -keypass "$KEYPASS" -alias "$ALIAS" -keyalg RSA -keysize 2048 \
      -validity 10000 -dname 'CN=Android Debug,O=Android,C=US' >/dev/null 2>&1 \
      || die 'keytool failed'
  fi

  local aligned="${OUT%.apk}.aligned.apk"
  step 'zipalign (4-byte)' "$BT/zipalign" -f -p 4 "$OUT" "$aligned"
  step "signing as $ALIAS" "$BT/apksigner" sign \
    --ks "$KEYSTORE" --ks-key-alias "$ALIAS" \
    --ks-pass "pass:$STOREPASS" --key-pass "pass:$KEYPASS" \
    --out "$OUT" "$aligned"
  rm -f "$aligned"
  step 'signature check' "$BT/apksigner" verify --print-certs "$OUT"
}

# --- verify -------------------------------------------------------------------
resource_map() {
  "$BT/aapt2" dump resources "$1" 2>/dev/null \
    | grep -E '^[[:space:]]+resource 0x' \
    | sed -E 's/^[[:space:]]+//; s/[[:space:]]+$//; s/[[:space:]]+(PUBLIC|PRIVATE)$//' \
    | sort -u
}

task_verify() {
  [ -f "$OUT" ] || die 'nothing to verify - run build first'
  [ -f "$ORIG_APK" ] || die "missing reference APK: $ORIG_APK"
  say 'verifying resource IDs survived the rebuild'

  local a b na nb
  a="$(resource_map "$ORIG_APK")"
  b="$(resource_map "$OUT")"
  na=$(printf '%s\n' "$a" | grep -c . || true)
  nb=$(printf '%s\n' "$b" | grep -c . || true)
  say "    original: $na IDs   rebuilt: $nb IDs"

  [ "$na" -eq "$nb" ] || die "resource ID count changed ($na -> $nb); dex-inlined IDs would break"
  if ! diff <(printf '%s\n' "$a") <(printf '%s\n' "$b") > /tmp/ra-res-diff.txt; then
    head -20 /tmp/ra-res-diff.txt
    die "resource id -> name mapping changed; dex-inlined IDs would break"
  fi
  say 'OK: resource IDs identical (id -> type/name)'

  # dex must round-trip byte-identical through smali
  local da db
  da=$(unzip -l "$ORIG_APK" | awk '$NF == "classes.dex" {print $1}')
  db=$(unzip -l "$OUT"      | awk '$NF == "classes.dex" {print $1}')
  say "    classes.dex: original=$da  rebuilt=$db"
  if [ "$da" != "$db" ]; then
    say "NOTE: classes.dex size changed ($da -> $db)."
    say "      Expected ONLY when app/smali is intentionally patched (currently: the"
    say "      licence engine gate). An UNMODIFIED smali tree round-trips"
    say "      byte-identical -- verified against reference/orig-decode with this"
    say "      toolchain (both 10,076,240 bytes, all dex id tables equal)."
  else
    say 'OK: classes.dex byte-identical'
  fi
}

# --- install ------------------------------------------------------------------
task_install() {
  [ -f "$OUT" ] || die 'nothing to install - run build first'
  say 'checking for a connected device'
  "$ADB" start-server >/dev/null 2>&1
  local devs
  devs="$("$ADB" devices | grep -E '[[:space:]]device$' || true)"
  [ -n "$devs" ] || die 'no device/emulator connected (adb devices)'
  printf '    %s\n' "$devs"
  # Several adb transports can enumerate the same handset (Wi-Fi debugging +
  # mDNS); a bare 'adb install' then dies with "more than one device". Pin one.
  local target="${ANDROID_SERIAL:-$(printf '%s\n' "$devs" | awk '{print $1}' | head -1)}"
  say "    target: $target"
  step "installing $OUT" "$ADB" -s "$target" install -r -d "$OUT"
}

case "$TASK" in
  dex)     task_dex ;;
  build)   task_build ;;
  sign)    task_sign ;;
  verify)  task_verify ;;
  install) task_install ;;
  clean)   say 'removing app/dist/'; rm -rf app/dist ;;
  all)
    task_dex
    task_build
    task_sign
    task_verify
    task_install || say 'skipping install (no device)'
    ;;
  *) die "unknown task '$TASK' (dex|build|sign|verify|install|all|clean)" ;;
esac

say 'done'
