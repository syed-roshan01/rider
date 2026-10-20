package z5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f17256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f17257c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f17255a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f17258d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f17257c) {
                PackageInfo packageInfoD = f6.b.a(context).d(64, "com.google.android.gms");
                k.a(context);
                if (packageInfoD == null || k.f(packageInfoD, false) || !k.f(packageInfoD, true)) {
                    f17256b = false;
                } else {
                    f17256b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e4);
        } finally {
            f17257c = true;
        }
        return f17256b || !"user".equals(Build.TYPE);
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
