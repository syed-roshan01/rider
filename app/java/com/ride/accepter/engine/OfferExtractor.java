package com.ride.accepter.engine;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * OfferExtractor - pulls the offer card fields the filters need.
 *
 * Ground-truth card (Rapido Captain request card):
 *
 *     Rs70        <- price row                -> fare = 70
 *     1km         <- pickup location row      -> pickupKm = 1.0
 *     area name   <- location name            -> dropText (Go-To/avoid matching)
 *     7km         <- drop location row        -> dropKm = 7.0
 *
 * Rules that fix the old "first two distance hits" bug:
 *   1. distances keep their UNIT (the old parser read "75m" as 75.0 km and the
 *      filters then saw impossible pickups like 45-168 km);
 *   2. slots are assigned in VISUAL ORDER (pickup row above drop row), with a
 *      label override when a row contains "pickup"/"drop";
 *   3. unknown stays 0.0 and never blocks (engine convention).
 *
 * Results land in static fields so the smali bridge can sget them without any
 * object interop. Only Extraction state is kept here; no taps, no engine calls.
 */
public final class OfferExtractor {

    private OfferExtractor() {}

    // ---- results (read by the smali bridge after extract()) ------------------
    /** Parsed fare in whole currency units; 0 = not detected. */
    public static volatile double fare = 0;
    /** Pickup distance in km; 0 = unknown. */
    public static volatile double pickupKm = 0;
    /** Drop distance in km; 0 = unknown. */
    public static volatile double dropKm = 0;
    /** ETA in minutes when the card shows one; 0 = unknown (never a distance). */
    public static volatile double etaMin = 0;
    /** Location name text(s) for the Go-To/avoid keyword matcher. */
    public static volatile String dropText = "";
    /** Every candidate name, '|' separated (the engine's text list contract). */
    public static volatile String nameList = "";

    // ---- patterns -----------------------------------------------------------
    // "Rs70", "Rs 70", "Rs70.5" - the price row. Deliberately does NOT touch
    // bare numbers: only currency-bearing text is ever a fare.
    private static final Pattern FARE = Pattern.compile("[\\u20b9$\\u20ac]\\s*([\\d,]+(?:\\.\\d{1,2})?)");
    // "1km", "1.2 km", "75m", "75 m" - strict unit, word boundary after the unit
    // so "3min" can never parse as "3 m".
    private static final Pattern DIST = Pattern.compile(
            "(\\d+(?:[.,]\\d+)?)\\s*(km|kilomet(?:er|re)?s?|m|met(?:er|re)?s?)\\b",
            Pattern.CASE_INSENSITIVE);
    // "3min", "3 min" - ETA only; excluded from distance slots by unit mismatch.
    private static final Pattern ETA = Pattern.compile("(\\d+(?:[.,]\\d+)?)\\s*min\\b", Pattern.CASE_INSENSITIVE);

    private static final String NAME_STOPWORDS =
            " reject pass skip decline cancel close later ignore accept confirm take start pick grab" +
            " claim order book approve receive continue proceed offer location address detail km kg min" +
            " call chat more pickup drop ";

    /**
     * Walk the popup tree in visual order and fill the result statics.
     * Safe to call on every window event; O(nodes).
     */
    public static void extract(AccessibilityNodeInfo root) {
        double f = 0, pk = 0, dk = 0, em = 0;
        boolean pkSet = false, dkSet = false;
        List<String> names = new ArrayList<String>();

        List<CharSequence> texts = new ArrayList<CharSequence>();
        collect(root, texts, 0);

        for (CharSequence raw : texts) {
            if (raw == null) continue;
            String text = raw.toString().trim();
            if (text.isEmpty()) continue;
            String low = text.toLowerCase(Locale.US);

            // 1) fare: max currency-bearing number (the price row)
            Matcher fm = FARE.matcher(text);
            while (fm.find()) {
                double v = num(fm.group(1));
                if (v > f) f = v;
            }

            // 2) eta: never a distance, recorded only for the audit echo
            Matcher em2 = ETA.matcher(text);
            if (em2.find()) {
                double v = num(em2.group(1));
                if (v > em) em = v;
            }

            // 3) distances: first two hits in visual order = pickup, drop;
            //    a "pickup"/"drop" label in the same row overrides the order.
            if (text.length() <= 16) { // short chips only: "1km", "75m"
                Matcher dm = DIST.matcher(text);
                if (dm.find() && !ETA.matcher(text).find()) {
                    double km = num(dm.group(1)) * (isKm(dm.group(2)) ? 1.0 : 0.001);
                    if (low.contains("drop")) {
                        dk = km; dkSet = true;
                    } else if (low.contains("pickup") || low.contains("pick up")) {
                        pk = km; pkSet = true;
                    } else if (!pkSet) {
                        pk = km; pkSet = true;
                    } else if (!dkSet) {
                        dk = km; dkSet = true;
                    }
                }
            }

            // 4) names: 2..48 chars, words-ish, not a stopword-only label
            if (text.length() >= 2 && text.length() <= 48 && !text.matches(".*[\\d]{3,}.*")
                    && !FARE.matcher(text).find() && !DIST.matcher(text).find()
                    && !isStopLabel(low) && looksLikeName(text)) {
                names.add(text);
            }
        }

        fare = f;
        pickupKm = pk;
        dropKm = dk;
        etaMin = em;
        StringBuilder sb = new StringBuilder();
        for (String n : names) {
            if (sb.length() > 0) sb.append(" | ");
            sb.append(n);
        }
        nameList = sb.toString();
        // The engine's zone matcher keyword-contains()s this text: feed it every
        // candidate name so either side's area name can hit a Go-To rule.
        dropText = nameList;
    }

    // ---- helpers ------------------------------------------------------------
    private static void collect(AccessibilityNodeInfo node, List<CharSequence> out, int depth) {
        if (node == null || depth > 25) return;
        CharSequence t = node.getText();
        if (t != null && t.length() > 0) out.add(t);
        CharSequence d = node.getContentDescription();
        if (d != null && d.length() > 0) out.add(d);
        for (int i = 0; i < node.getChildCount(); i++) {
            AccessibilityNodeInfo c = node.getChild(i);
            try {
                collect(c, out, depth + 1);
            } finally {
                if (c != null) c.recycle();
            }
        }
    }

    private static double num(String s) {
        try {
            return Double.parseDouble(s.replace(",", "").replace(',', '.'));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static boolean isKm(String unit) {
        char c = Character.toLowerCase(unit.charAt(0));
        return c == 'k';
    }

    private static boolean isStopLabel(String low) {
        return NAME_STOPWORDS.contains(" " + low + " ");
    }

    private static boolean looksLikeName(String text) {
        int letters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) letters++;
        }
        return letters >= 2;
    }

    /** Bounds helper shared with the tap ladder. */
    public static Rect boundsOf(AccessibilityNodeInfo node) {
        Rect r = new Rect();
        if (node != null) node.getBoundsInScreen(r);
        return r;
    }
}
