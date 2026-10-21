package com.ride.accepter.util;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * RideHistory - single reader for the ENGINE's real history contract.
 *
 * The engine (logHistoryIfNew -> z4/e background thread) appends to:
 *   prefs "ride_history" / key "history_json"
 *     = JSON array of {app, fare, accepted, ts, loc}
 *
 * The engine's plain live counters live in a DIFFERENT file:
 *   prefs "com.ride.accepter_preferences"
 *     -> accepted_count / skipped_count / today_earnings (ints)
 *
 * The old dashboard read "entries"/"accepted_count"/"total_earnings" from
 * "ride_history" - keys NOTHING ever wrote - so the tiles stayed 0/0/0%/Rs0
 * and the feed said "No rides yet" forever. This class is the one place that
 * knows the real on-disk shape.
 */
public final class RideHistory {

    private RideHistory() {}

    public static final class Entry {
        public final String app;
        public final int fare;
        public final boolean accepted;
        public final long ts;
        public final String loc;

        Entry(String app, int fare, boolean accepted, long ts, String loc) {
            this.app = app;
            this.fare = fare;
            this.accepted = accepted;
            this.ts = ts;
            this.loc = loc;
        }
    }

    /** All history entries in file order (oldest first). Never null. */
    public static List<Entry> entries(Context c) {
        List<Entry> out = new ArrayList<Entry>();
        try {
            SharedPreferences sp = c.getSharedPreferences("ride_history", Context.MODE_PRIVATE);
            String raw = sp.getString("history_json", "");
            if (raw == null || raw.length() == 0) return out;
            JSONArray arr = new JSONArray(raw);
            for (int i = 0; i < arr.length(); i++) {
                JSONObject o = arr.optJSONObject(i);
                if (o == null) continue;
                out.add(new Entry(
                        o.optString("app", ""),
                        (int) Math.round(o.optDouble("fare", 0)),
                        o.optBoolean("accepted", false),
                        o.optLong("ts", 0L),
                        o.optString("loc", "")));
            }
        } catch (Throwable t) {
            android.util.Log.i("RideHistory", "history_json parse failed: " + t);
        }
        return out;
    }

    public static int acceptedCount(List<Entry> e) {
        int n = 0;
        for (Entry x : e) if (x.accepted) n++;
        return n;
    }

    public static int skippedCount(List<Entry> e) {
        int n = 0;
        for (Entry x : e) if (!x.accepted) n++;
        return n;
    }

    /** Today's earnings = fare sum of TODAY's accepted rides. */
    public static int todayEarnings(List<Entry> e) {
        long start = todayStart();
        int sum = 0;
        for (Entry x : e) if (x.accepted && x.ts >= start) sum += x.fare;
        return sum;
    }

    public static long todayStart() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis();
    }

    /**
     * Tile source of truth: [accepted, skipped, todayEarnings].
     * Computed from history_json when it has entries; otherwise fall back to
     * the engine's plain counters so a fresh install still shows something.
     */
    public static int[] tiles(Context c) {
        List<Entry> e = entries(c);
        int a = acceptedCount(e), s = skippedCount(e);
        if (a + s > 0) return new int[] { a, s, todayEarnings(e) };
        SharedPreferences p =
                c.getSharedPreferences("com.ride.accepter_preferences", Context.MODE_PRIVATE);
        return new int[] {
                p.getInt("accepted_count", 0),
                p.getInt("skipped_count", 0),
                p.getInt("today_earnings", 0)
        };
    }

    /** Legacy pipe lines "Rs70|ACCEPTED|14:05" for the existing row renderers. */
    public static String[] lines(Context c) {
        List<Entry> e = entries(c);
        String[] out = new String[e.size()];
        long start = todayStart();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm", Locale.getDefault());
        SimpleDateFormat day = new SimpleDateFormat("d MMM", Locale.getDefault());
        for (int i = 0; i < e.size(); i++) {
            Entry x = e.get(i);
            String when = "";
            if (x.ts > 0) {
                Date d = new Date(x.ts);
                when = (x.ts >= start ? time : day).format(d);
            }
            out[i] = "\u20b9" + x.fare + "|" + (x.accepted ? "ACCEPTED" : "SKIPPED") + "|" + when;
        }
        return out;
    }

    /** Reset: clear the engine's history_json + both counter stores. */
    public static void reset(Context c) {
        c.getSharedPreferences("ride_history", Context.MODE_PRIVATE)
                .edit().remove("history_json").apply();
        SharedPreferences.Editor ed =
                c.getSharedPreferences("com.ride.accepter_preferences", Context.MODE_PRIVATE).edit();
        ed.putInt("accepted_count", 0);
        ed.putInt("skipped_count", 0);
        ed.putInt("today_earnings", 0);
        ed.putInt("last_detected_fare", 0);
        ed.apply();
    }
}
