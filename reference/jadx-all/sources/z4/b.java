package z4;

import android.content.Context;
import android.content.SharedPreferences;
import p9.d0;
import q8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f17205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f17206d;

    public b(Context context) {
        d7.a.m(context, "context");
        this.f17203a = context;
        this.f17204b = "EncryptedPrefs";
        this.f17205c = new i(new a(this, 1));
        this.f17206d = new i(new a(this, 0));
        String string = a().getString("sec_app_language", "en");
        d0.a(string != null ? string : "en");
        d0.a(Boolean.valueOf(a().getBoolean("sec_master_filter_enabled", true)));
    }

    public final SharedPreferences a() {
        Object value = this.f17206d.getValue();
        d7.a.l(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final void b(String str) {
        d7.a.m(str, "json");
        a().edit().putString("sec_location_filters", str).commit();
    }
}
