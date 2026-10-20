package c7;

import android.content.Context;
import android.preference.PreferenceManager;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f3033b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4 f3034a;

    public b(a aVar) {
        Context context = aVar.f3026a;
        String str = aVar.f3027b;
        String str2 = aVar.f3028c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f3034a = aVar.f3032g;
    }
}
