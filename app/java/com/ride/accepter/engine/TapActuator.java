package com.ride.accepter.engine;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;

/**
 * TapActuator - makes the accept tap actually land.
 *
 * Why this exists: the old path tapped the CLICKABLE ANCESTOR of the "Take"
 * label - often the whole popup card - so the gesture hit the card centre,
 * between the buttons, and nothing happened (500+ logged taps, zero accepts).
 * This ladder targets the LABEL NODE'S OWN BOUNDS and verifies each step:
 *
 *   1. ACTION_CLICK on the clickable ancestor (cheap, sometimes works)
 *   2. dispatchGesture DOWN/UP (60 ms) at the label node's bounds centre -
 *      a real touch; works on Rapido with no Shizuku (Shizuku stays the
 *      Ola/Uber fallback where apps block synthetic clicks)
 *   3. success check after 700 ms: the popup took it or it did not; bounded
 *      retries (3 per offer) and a per-offer dedupe replace the old spam.
 *
 * Every step echoes to logcat tag "RideDecision" with node bounds + method +
 * outcome so any future failure is self-explaining.
 */
public final class TapActuator {

    private TapActuator() {}

    private static final String TAG = "RideDecision";
    private static final int MAX_ATTEMPTS = 3;
    private static final long DEDUPE_WINDOW_MS = 1200;

    private static volatile String lastKey = "";
    private static volatile long lastAt = 0;

    private static final Handler MAIN = new Handler(Looper.getMainLooper());

    /**
     * Run the accept ladder for one detected offer.
     *
     * @param svc     the accessibility service (dispatchGesture source)
     * @param label   the "Take"-label node - the tap targets ITS bounds
     * @param ancestor its clickable ancestor (or null)
     * @param offerKey dedupe identity: fare|pickup|drop|names
     * @return true when an accept attempt was fired (not a guarantee of landing)
     */
    public static boolean accept(final AccessibilityService svc, final AccessibilityNodeInfo label,
                                 AccessibilityNodeInfo ancestor, String offerKey) {
        if (svc == null || label == null) return false;

        long now = System.currentTimeMillis();
        if (offerKey != null && offerKey.equals(lastKey) && now - lastAt < DEDUPE_WINDOW_MS) {
            return true; // same popup re-firing on every content event
        }
        lastKey = offerKey == null ? "" : offerKey;
        lastAt = now;

        final Rect b = OfferExtractor.boundsOf(label);
        if (b.width() == 0 && b.height() == 0) {
            Log.d(TAG, "TAP: label has empty bounds - cannot target");
            return false;
        }
        attempt(svc, label, ancestor, b, 1);
        return true;
    }

    private static void attempt(final AccessibilityService svc, final AccessibilityNodeInfo label,
                                final AccessibilityNodeInfo ancestor, final Rect b, final int n) {
        // Step 1: plain accessibility click on the clickable container
        boolean clicked = false;
        if (ancestor != null && ancestor.isClickable()) {
            clicked = ancestor.performAction(AccessibilityNodeInfo.ACTION_CLICK);
            Log.d(TAG, "TAP: ACTION_CLICK on clickable ancestor -> " + clicked
                    + " bounds=" + b.toShortString() + " attempt=" + n);
        }

        // Step 2: real touch at the LABEL's centre (the fix)
        Path p = new Path();
        float x = b.exactCenterX();
        float y = b.exactCenterY();
        p.moveTo(x, y);
        GestureDescription.StrokeDescription stroke =
                new GestureDescription.StrokeDescription(p, 0, 60);
        GestureDescription.Builder gb = new GestureDescription.Builder();
        gb.addStroke(stroke);
        boolean dispatched = svc.dispatchGesture(gb.build(), new AccessibilityService.GestureResultCallback() {
            @Override public void onCompleted(GestureDescription d) {
                Log.d(TAG, "TAP: gesture completed at (" + (int) b.exactCenterX() + ","
                        + (int) b.exactCenterY() + ") attempt=" + n);
                verify(svc, label, b, n);
            }
            @Override public void onCancelled(GestureDescription d) {
                Log.d(TAG, "TAP: gesture cancelled attempt=" + n);
                retry(svc, label, ancestor, b, n);
            }
        }, null);
        Log.d(TAG, "TAP: dispatchGesture dispatched=" + dispatched
                + (clicked ? " (after click)" : "") + " target='" + textOf(label) + "'");
        if (!dispatched) retry(svc, label, ancestor, b, n);
    }

    private static void retry(final AccessibilityService svc, final AccessibilityNodeInfo label,
                              final AccessibilityNodeInfo ancestor, final Rect b, final int n) {
        if (n >= MAX_ATTEMPTS) {
            Log.d(TAG, "TAP: gave up after " + n + " attempts - popup did not consume the tap");
            return;
        }
        MAIN.postDelayed(new Runnable() {
            @Override public void run() {
                attempt(svc, label, ancestor, b, n + 1);
            }
        }, 300);
    }

    /** Success = the accept affordance is gone / the popup left. */
    private static void verify(final AccessibilityService svc, final AccessibilityNodeInfo label,
                               final Rect b, final int n) {
        MAIN.postDelayed(new Runnable() {
            @Override public void run() {
                try {
                    AccessibilityNodeInfo root = svc.getRootInActiveWindow();
                    boolean stillThere = root != null && findAcceptish(root, 0) != null;
                    if (root != null) root.recycle();
                    if (stillThere) {
                        Log.d(TAG, "TAP: not consumed (accept label still on screen) attempt=" + n);
                        retry(svc, label, null, b, n);
                    } else {
                        Log.d(TAG, "ACCEPTED: offer taken - accept label gone from screen");
                    }
                } catch (Throwable t) {
                    Log.d(TAG, "TAP: verify failed: " + t);
                }
            }
        }, 700);
    }

    private static AccessibilityNodeInfo findAcceptish(AccessibilityNodeInfo node, int depth) {
        if (node == null || depth > 25) return null;
        CharSequence t = node.getText();
        if (t != null) {
            String low = t.toString().toLowerCase(LocaleHolder.US);
            if (low.contains("take") || low.contains("accept") || low.contains("confirm")) {
                return node;
            }
        }
        for (int i = 0; i < node.getChildCount(); i++) {
            AccessibilityNodeInfo r = findAcceptish(node.getChild(i), depth + 1);
            if (r != null) return r;
        }
        return null;
    }

    private static String textOf(AccessibilityNodeInfo n) {
        CharSequence t = n.getText();
        return t == null ? "" : t.toString();
    }

    /** Tiny holder so this file keeps compiling under -source 8 without imports fuss. */
    private static final class LocaleHolder {
        static final java.util.Locale US = java.util.Locale.US;
    }

    /** Kept for bridge symmetry with the engine's event path. */
    public static void note(AccessibilityEvent event) {
        // no-op: the engine owns event flow; the actuator only acts on demand
    }
}
