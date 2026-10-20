#!/usr/bin/env bash
# Auto-push to the device: watch app/java + app/smali and rebuild + reinstall on
# every change, so edits show up on the phone without running anything.
#
#   ./app/watch.sh          rebuild + install on every save
#   ./app/watch.sh once     single build + install, then exit
#
# Uses fswatch when installed (event driven); otherwise falls back to a 2s poll.
set -uo pipefail

cd "$(dirname "$0")/.."
MARK="$(mktemp -t ra-watch)"
WATCH="app/java app/smali"
touch "$MARK"

# The wireless-debugging port rotates every time it is re-enabled, so rediscover
# the handset via mDNS before each build instead of pinning a stale port.
reconnect() {
  command -v adb >/dev/null 2>&1 || return 0
  adb mdns services 2>/dev/null | awk '/_adb-tls-connect/ {print $3}' | while read -r hp; do
    adb connect "$hp" >/dev/null 2>&1
  done
}

rebuild() {
  touch "$MARK"
  reconnect
  echo "==> rebuilding..."
  ./app/build.sh all 2>&1 | grep -E "==>|ERROR|error:|adb:" | tail -10
  # bring the change up on screen too, so the phone reflects every save
  T="$(adb devices 2>/dev/null | awk '/[0-9]+\.[0-9.]+:[0-9]+[[:space:]]+device$/ {print $1}' | head -1)"
  if [ -n "${T:-}" ]; then
    adb -s "$T" shell am force-stop com.ride.accepter >/dev/null 2>&1
    adb -s "$T" shell monkey -p com.ride.accepter -c android.intent.category.LAUNCHER 1 >/dev/null 2>&1
    echo "==> relaunched on $T"
  fi
  echo "==> done $(date '+%H:%M:%S')  (waiting for changes)"
}

if [ "${1:-}" = "once" ]; then
  rebuild
  exit 0
fi

echo "==> watching $WATCH - rebuild + install on save (ctrl-c to stop)"
# marker line used as the readiness signal for the terminal session
echo "==> ready and watching"

if command -v fswatch >/dev/null 2>&1; then
  fswatch -0 $WATCH | while read -d '' _; do
    sleep 0.3            # let the editor finish writing
    rebuild
  done
else
  while true; do
    if [ -n "$(find $WATCH -type f \( -name '*.java' -o -name '*.smali' \) -newer "$MARK" 2>/dev/null | head -1)" ]; then
      sleep 0.3
      rebuild
    fi
    sleep 2
  done
fi
