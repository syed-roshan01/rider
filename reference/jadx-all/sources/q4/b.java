package q4;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f13127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13129c;

    public b(Context context) {
        Bitmap.Config[] configArr = w4.e.f16163a;
        double d10 = 0.2d;
        try {
            Object systemService = r2.k.getSystemService(context, ActivityManager.class);
            d7.a.j(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d10 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f13127a = d10;
        this.f13128b = true;
        this.f13129c = true;
    }
}
