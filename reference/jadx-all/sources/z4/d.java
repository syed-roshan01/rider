package z4;

import android.content.Context;
import android.content.SharedPreferences;
import com.auto.accept.data.model.SupportedApp;
import com.google.firebase.messaging.ServiceStarter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l9.h;
import l9.i;
import o1.s;
import p7.n;
import p9.d0;
import p9.q0;
import p9.z;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final q0 A;
    public final q0 B;
    public final z C;
    public final q0 D;
    public final z E;
    public final q0 F;
    public final z G;
    public final q0 H;
    public final z I;
    public final q0 J;
    public final z K;
    public final String L;
    public final q0 M;
    public final z N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f17208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f17209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f17210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f17211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f17212f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q0 f17213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z f17214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q0 f17215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f17216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q0 f17217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f17218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q0 f17219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z f17220u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q0 f17221v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f17222w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q0 f17223x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z f17224y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q0 f17225z;

    public d(Context context, b bVar) {
        d7.a.m(context, "context");
        d7.a.m(bVar, "encryptedPreferencesManager");
        this.f17207a = context;
        this.f17208b = bVar;
        SharedPreferences sharedPreferencesD = s.D(context);
        d7.a.l(sharedPreferencesD, "getDefaultSharedPreferences(...)");
        this.f17209c = sharedPreferencesD;
        n nVar = new n();
        this.f17210d = nVar;
        sharedPreferencesD.getBoolean("migrated_to_encrypted_v1", false);
        try {
            sharedPreferencesD.getLong("plan_expiry", 0L);
            if (Long.MAX_VALUE > 0) {
                bVar.a().edit().putLong("sec_plan_expiry_ms", Long.MAX_VALUE).apply();
            }
            if (sharedPreferencesD.contains("distance_filter_enabled")) {
                bVar.a().edit().putBoolean("sec_distance_filter_enabled", sharedPreferencesD.getBoolean("distance_filter_enabled", false)).commit();
            }
            if (sharedPreferencesD.contains("min_pickup_km")) {
                bVar.a().edit().putFloat("sec_min_pickup_km", sharedPreferencesD.getFloat("min_pickup_km", 0.0f)).commit();
            }
            if (sharedPreferencesD.contains("max_pickup_km")) {
                bVar.a().edit().putFloat("sec_max_pickup_km", sharedPreferencesD.getFloat("max_pickup_km", 50.0f)).commit();
            }
            if (sharedPreferencesD.contains("min_drop_km")) {
                bVar.a().edit().putFloat("sec_min_drop_km", sharedPreferencesD.getFloat("min_drop_km", 0.0f)).commit();
            }
            if (sharedPreferencesD.contains("max_drop_km")) {
                bVar.a().edit().putFloat("sec_max_drop_km", sharedPreferencesD.getFloat("max_drop_km", 100.0f)).commit();
            }
            if (sharedPreferencesD.contains("location_filter_enabled")) {
                bVar.a().edit().putBoolean("sec_location_filter_enabled", sharedPreferencesD.getBoolean("location_filter_enabled", false)).commit();
            }
            String string = sharedPreferencesD.getString("location_filters", null);
            if (string != null && string.length() != 0) {
                bVar.b(string);
            }
            String string2 = sharedPreferencesD.getString("per_app_settings", null);
            if (string2 != null && string2.length() != 0) {
                Map map = (Map) nVar.b(string2, new c().f15426b);
                map = map == null ? r8.s.f13662a : map;
                SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    editorEdit.putBoolean("app_enabled_" + str, ((Boolean) entry.getValue()).booleanValue());
                }
                editorEdit.apply();
            }
        } catch (Exception unused) {
        } finally {
            sharedPreferencesD.edit().putBoolean("migrated_to_encrypted_v1", true).apply();
        }
        String string3 = this.f17209c.getString("min_fare", "50");
        Integer numD0 = h.D0(string3 != null ? string3 : "50");
        q0 q0VarA = d0.a(Integer.valueOf(numD0 != null ? numD0.intValue() : 50));
        this.f17211e = q0VarA;
        this.f17212f = new z(q0VarA);
        String string4 = this.f17209c.getString("max_fare", "500");
        Integer numD1 = h.D0(string4 != null ? string4 : "500");
        q0 q0VarA2 = d0.a(Integer.valueOf(numD1 != null ? numD1.intValue() : ServiceStarter.ERROR_UNKNOWN));
        this.f17213n = q0VarA2;
        this.f17214o = new z(q0VarA2);
        q0 q0VarA3 = d0.a(Boolean.valueOf(this.f17209c.getBoolean("service_enabled", false)));
        this.f17215p = q0VarA3;
        this.f17216q = new z(q0VarA3);
        q0 q0VarA4 = d0.a(Integer.valueOf(this.f17209c.getInt("accepted_count", 0)));
        this.f17217r = q0VarA4;
        this.f17218s = new z(q0VarA4);
        q0 q0VarA5 = d0.a(Integer.valueOf(this.f17209c.getInt("skipped_count", 0)));
        this.f17219t = q0VarA5;
        this.f17220u = new z(q0VarA5);
        q0 q0VarA6 = d0.a(Integer.valueOf(this.f17209c.getInt("last_detected_fare", 0)));
        this.f17221v = q0VarA6;
        this.f17222w = new z(q0VarA6);
        q0 q0VarA7 = d0.a(Integer.valueOf(this.f17209c.getInt("today_earnings", 0)));
        this.f17223x = q0VarA7;
        this.f17224y = new z(q0VarA7);
        this.f17225z = d0.a(Boolean.valueOf(this.f17209c.getBoolean("super_fast_mode", false)));
        this.A = d0.a(Boolean.valueOf(this.f17209c.getBoolean("advanced_mode", false)));
        q0 q0VarA8 = d0.a(Boolean.valueOf(this.f17208b.a().getBoolean("sec_distance_filter_enabled", false)));
        this.B = q0VarA8;
        this.C = new z(q0VarA8);
        q0 q0VarA9 = d0.a(Boolean.valueOf(this.f17208b.a().getBoolean("sec_location_filter_enabled", false)));
        this.D = q0VarA9;
        this.E = new z(q0VarA9);
        q0 q0VarA10 = d0.a(a());
        this.F = q0VarA10;
        this.G = new z(q0VarA10);
        q0 q0VarA11 = d0.a(Boolean.valueOf(this.f17209c.getBoolean("ride_alert_enabled", true)));
        this.H = q0VarA11;
        this.I = new z(q0VarA11);
        q0 q0VarA12 = d0.a(b());
        this.J = q0VarA12;
        this.K = new z(q0VarA12);
        this.f17209c.registerOnSharedPreferenceChangeListener(this);
        this.L = "app_language";
        String string5 = this.f17209c.getString("app_language", "en");
        q0 q0VarA13 = d0.a(string5 != null ? string5 : "en");
        this.M = q0VarA13;
        this.N = new z(q0VarA13);
    }

    public final List a() {
        String string = this.f17208b.a().getString("sec_location_filters", null);
        r rVar = r.f13661a;
        if (string == null) {
            return rVar;
        }
        try {
            List list = (List) this.f17210d.b(string, new c().f15426b);
            return list == null ? rVar : list;
        } catch (Exception unused) {
            return rVar;
        }
    }

    public final LinkedHashMap b() {
        LinkedHashMap linkedHashMapB0orig = b0orig();
        if (linkedHashMapB0orig == null) {
            linkedHashMapB0orig = new LinkedHashMap();
        }
        linkedHashMapB0orig.put("sec_plan_expiry_ms", Long.MAX_VALUE);
        return linkedHashMapB0orig;
    }

    public final LinkedHashMap b0orig() {
        List<SupportedApp> all_apps = SupportedApp.Companion.getALL_APPS();
        int iT = z6.a.T(f9.a.y0(all_apps));
        if (iT < 16) {
            iT = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
        for (SupportedApp supportedApp : all_apps) {
            String name = supportedApp.getName();
            String name2 = supportedApp.getName();
            d7.a.m(name2, "appName");
            linkedHashMap.put(name, Boolean.valueOf(this.f17209c.getBoolean("app_enabled_".concat(name2), true)));
        }
        return linkedHashMap;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null && i.h1(str, "app_enabled_", false)) {
            this.J.i(b());
            return;
        }
        boolean zD = d7.a.d(str, "min_fare");
        SharedPreferences sharedPreferences2 = this.f17209c;
        if (zD) {
            String string = sharedPreferences2.getString("min_fare", "50");
            Integer numD0 = h.D0(string != null ? string : "50");
            this.f17211e.i(Integer.valueOf(numD0 != null ? numD0.intValue() : 50));
            return;
        }
        if (d7.a.d(str, "max_fare")) {
            String string2 = sharedPreferences2.getString("max_fare", "500");
            Integer numD1 = h.D0(string2 != null ? string2 : "500");
            this.f17213n.i(Integer.valueOf(numD1 != null ? numD1.intValue() : ServiceStarter.ERROR_UNKNOWN));
            return;
        }
        if (d7.a.d(str, "service_enabled")) {
            this.f17215p.i(Boolean.valueOf(sharedPreferences2.getBoolean("service_enabled", false)));
            return;
        }
        if (d7.a.d(str, "accepted_count")) {
            this.f17217r.i(Integer.valueOf(sharedPreferences2.getInt("accepted_count", 0)));
            return;
        }
        if (d7.a.d(str, "skipped_count")) {
            this.f17219t.i(Integer.valueOf(sharedPreferences2.getInt("skipped_count", 0)));
            return;
        }
        if (d7.a.d(str, "last_detected_fare")) {
            this.f17221v.i(Integer.valueOf(sharedPreferences2.getInt("last_detected_fare", 0)));
            return;
        }
        if (d7.a.d(str, "today_earnings")) {
            this.f17223x.i(Integer.valueOf(sharedPreferences2.getInt("today_earnings", 0)));
            return;
        }
        if (d7.a.d(str, "super_fast_mode")) {
            this.f17225z.i(Boolean.valueOf(sharedPreferences2.getBoolean("super_fast_mode", false)));
            return;
        }
        if (d7.a.d(str, "advanced_mode")) {
            this.A.i(Boolean.valueOf(sharedPreferences2.getBoolean("advanced_mode", false)));
            return;
        }
        if (d7.a.d(str, "ride_alert_enabled")) {
            this.H.i(Boolean.valueOf(sharedPreferences2.getBoolean("ride_alert_enabled", true)));
            return;
        }
        String str2 = this.L;
        if (d7.a.d(str, str2)) {
            String string3 = sharedPreferences2.getString(str2, "en");
            this.M.i(string3 != null ? string3 : "en");
        }
    }
}
