package l6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import h6.b;
import h6.e;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import z5.f;
import z5.g;
import z5.h;
import z5.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11380a = f.f17253b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11381b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f11382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f11383d;

    public static void a(Context context) {
        Context context2;
        Context contextCreatePackageContext;
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        f11380a.getClass();
        AtomicBoolean atomicBoolean = j.f17255a;
        f fVar = f.f17253b;
        int iC = fVar.c(context, 11925000);
        if (iC != 0) {
            Intent intentA = fVar.a(iC, context, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iC);
            if (intentA != null) {
                throw new h("Google Play Services not available");
            }
            throw new g();
        }
        synchronized (f11381b) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = e.c(context, e.f7565c, "com.google.android.gms.providerinstaller.dynamite").f7576a;
            } catch (b e4) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e4.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                try {
                    if (f11383d == null) {
                        Class<?> cls = Long.TYPE;
                        f11383d = contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                    }
                    f11383d.invoke(null, context, Long.valueOf(jElapsedRealtime), Long.valueOf(jElapsedRealtime2));
                } catch (Exception e10) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e10.getMessage())));
                }
            }
            if (contextCreatePackageContext != null) {
                b(contextCreatePackageContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new g();
            }
        }
    }

    public static void b(Context context, String str) throws g {
        try {
            if (f11382c == null) {
                f11382c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f11382c.invoke(null, context);
        } catch (Exception e4) {
            Throwable cause = e4.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e4.getMessage() : cause.getMessage())));
            }
            throw new g();
        }
    }
}
