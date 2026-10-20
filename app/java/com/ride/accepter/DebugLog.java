package com.ride.accepter;

/** Dry-run decision echo for the accept engine. Called from
  * RideAcceptorService.executeAccept for every offer it weighs; logs the parsed
  * offer, the live settings and a would-tap / would-skip verdict with reason,
  * so the whole pipeline can be audited from logcat before real taps are
  * trusted. Tag: RideDecision. */
public final class DebugLog {
    private DebugLog() {}

    private static final String SVC = "com.auto.accept.service.RideAcceptorService";

    private static Object statik(String n) {
        try {
            java.lang.reflect.Field f = Class.forName(SVC).getDeclaredField(n);
            f.setAccessible(true);
            return f.get(null);
        } catch (Throwable t) { return null; }
    }

    private static Object instans(String n) {
        try {
            java.lang.reflect.Field t = Class.forName(SVC).getDeclaredField("overlayToggleTarget");
            t.setAccessible(true);
            Object svc = t.get(null);
            if (svc == null) return null;
            java.lang.reflect.Field f = Class.forName(SVC).getDeclaredField(n);
            f.setAccessible(true);
            return f.get(svc);
        } catch (Throwable t) { return null; }
    }

    private static double num(Object o, double fb) {
        return o instanceof Number ? ((Number) o).doubleValue() : fb;
    }

    private static boolean bool(Object o, boolean fb) {
        return o instanceof Boolean ? (Boolean) o : fb;
    }

    private static String km(double v) {
        return String.valueOf(Math.round(v * 10.0) / 10.0);
    }

    /** Mirrors the gates in RideAcceptorService.executeAccept and explains the
      * verdict. Safe in both modes: detect-only says WOULD TAP, live says TAPPING. */
    public static void decide(double pickupKm, double dropKm, int fare) {
        try {
            boolean detOnly = bool(statik("detectOnly"), false);
            boolean fareOn = bool(statik("fareFilterOn"), false);
            boolean distOn = bool(statik("distanceFilterOn"), false);
            double minF = num(statik("minFare"), 0);
            double maxF = num(statik("maxFare"), 100000);
            double maxP = num(statik("maxPickup"), 1000);
            double maxD = num(statik("maxDrop"), 1000);
            boolean goTo = bool(instans("locationFilterEnabled"), false);
            Object rules = instans("locationFilters");
            int ruleN = rules instanceof java.util.List ? ((java.util.List) rules).size() : 0;

            String why = null;
            if (distOn && pickupKm > maxP) why = "pickup " + km(pickupKm) + "km > cap " + km(maxP) + "km";
            else if (distOn && dropKm > maxD) why = "drop " + km(dropKm) + "km > cap " + km(maxD) + "km";
            else if (fareOn && fare < minF) why = "fare Rs" + fare + " < min Rs" + (int) minF;
            else if (fareOn && fare > maxF) why = "fare Rs" + fare + " > max Rs" + (int) maxF;

            String settings = "rules{fare "
                    + (fareOn ? "Rs" + (int) minF + "-Rs" + (int) maxF : "OFF") + " / dist "
                    + (distOn ? "pickup<" + km(maxP) + "km drop<" + km(maxD) + "km" : "OFF")
                    + " / Go-To " + (goTo ? "ON(" + ruleN + " words)" : "OFF") + "}";
            String offer = "offer{fare Rs" + fare + " pickup " + km(pickupKm)
                    + "km drop " + km(dropKm) + "km}";

            String line;
            if (why == null) {
                line = (detOnly ? "[DRY-RUN] WOULD TAP ACCEPT" : "[LIVE] TAPPING ACCEPT")
                        + " | " + offer + " | " + settings;
            } else {
                line = (detOnly ? "[DRY-RUN] WOULD SKIP" : "[LIVE] REJECTED")
                        + " (" + why + ") | " + offer + " | " + settings;
            }
            android.util.Log.d("RideDecision", line);
        } catch (Throwable t) {
            android.util.Log.d("RideDecision", "echo failed: " + t);
        }
    }
}
