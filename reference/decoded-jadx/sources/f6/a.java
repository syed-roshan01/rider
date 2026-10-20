package f6;

import a0.a0;
import a0.f0;
import a0.j0;
import a0.m0;
import a0.o0;
import a0.s;
import a0.v;
import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EdgeEffect;
import b.g;
import b0.q;
import b0.x;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.base.zaq;
import d5.u;
import d7.t;
import e1.l0;
import e1.n0;
import e1.p;
import e1.r;
import e1.y;
import g1.c;
import i1.e;
import i1.f;
import i1.h0;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import k0.g0;
import k0.i0;
import k0.p3;
import k0.r2;
import k0.t0;
import k6.d4;
import k6.f4;
import l0.h;
import m0.d0;
import m0.g1;
import m0.l1;
import m0.l3;
import m0.m;
import m0.m2;
import m0.m3;
import m0.n1;
import m0.o3;
import m0.p0;
import m0.r1;
import m0.v1;
import m0.x1;
import m0.z;
import m9.e0;
import q6.i;
import r1.k0;
import r1.v0;
import t.c0;
import t.k;
import u.l2;
import u.n;
import u.s1;
import u.w;
import u.y0;
import v.f2;
import v.h1;
import v.o1;
import v.q1;
import y0.l;
import y0.o;
import z.d;
import z5.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f6352a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f6353b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f6354c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f6355d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static y f6356e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p f6357f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c f6358g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static f f6359h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static f f6360i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static f f6361j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static f f6362k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static f f6363l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static f f6364m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static f f6365n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static f f6366o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static f f6367p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static f f6368q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static f f6369r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static f f6370s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static f f6371t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static f f6372u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static f f6373v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static f f6374w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f6375x = 9;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6376y = 0;

    public static EdgeEffect C(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? n.f14854a.a(context, null) : new y0(context);
    }

    public static final boolean D(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean E(int i10, int i11) {
        return i10 == i11;
    }

    public static final int F(s sVar, Object obj, int i10) {
        int iB;
        return (obj == null || sVar.c() == 0 || (i10 < sVar.c() && d7.a.d(obj, sVar.a(i10))) || (iB = sVar.b(obj)) == -1) ? i10 : iB;
    }

    public static final int G(int i10, String str) {
        int length = str.length();
        while (i10 < length) {
            if (str.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final int H(int i10, String str) {
        while (i10 > 0) {
            if (str.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static final int J(Bitmap bitmap) {
        int i10 = 1;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config != Bitmap.Config.ALPHA_8) {
                    i10 = 2;
                    if (config != Bitmap.Config.RGB_565 && config != Bitmap.Config.ARGB_4444) {
                        i10 = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
                    }
                }
                return height * i10;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final f K() {
        f fVar = f6362k;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(19.0f, 6.41f);
        fVar2.B(17.59f, 5.0f);
        fVar2.B(12.0f, 10.59f);
        fVar2.B(6.41f, 5.0f);
        fVar2.B(5.0f, 6.41f);
        fVar2.B(10.59f, 12.0f);
        fVar2.B(5.0f, 17.59f);
        fVar2.B(6.41f, 19.0f);
        fVar2.B(12.0f, 13.41f);
        fVar2.B(17.59f, 19.0f);
        fVar2.B(19.0f, 17.59f);
        fVar2.B(13.41f, 12.0f);
        fVar2.p();
        e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        f fVarB = eVar.b();
        f6362k = fVarB;
        return fVarB;
    }

    public static float L(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return n.f14854a.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void M(Future future) {
        y3.e.M(future, "Future was expected to be done: %s", future.isDone());
        boolean z10 = false;
        while (true) {
            try {
                future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static final f N() {
        f fVar = f6364m;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Error", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVarC = k.c(7, 12.0f, 2.0f);
        fVarC.u(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVarC.H(4.48f, 10.0f, 10.0f, 10.0f);
        fVarC.H(10.0f, -4.48f, 10.0f, -10.0f);
        fVarC.G(17.52f, 2.0f, 12.0f, 2.0f);
        fVarC.p();
        fVarC.D(13.0f, 17.0f);
        fVarC.A(-2.0f);
        fVarC.K(-2.0f);
        fVarC.A(2.0f);
        fVarC.K(2.0f);
        fVarC.p();
        fVarC.D(13.0f, 13.0f);
        fVarC.A(-2.0f);
        fVarC.B(11.0f, 7.0f);
        fVarC.A(2.0f);
        fVarC.K(6.0f);
        fVarC.p();
        e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        f fVarB = eVar.b();
        f6364m = fVarB;
        return fVarB;
    }

    public static final f O() {
        f fVar = f6365n;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVarC = k.c(7, 13.0f, 3.0f);
        fVarC.v(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        fVarC.B(1.0f, 12.0f);
        fVarC.C(3.89f, 3.89f);
        fVarC.C(0.07f, 0.14f);
        fVarC.B(9.0f, 12.0f);
        fVarC.B(6.0f, 12.0f);
        fVarC.v(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        fVarC.H(7.0f, 3.13f, 7.0f, 7.0f);
        fVarC.H(-3.13f, 7.0f, -7.0f, 7.0f);
        fVarC.v(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
        fVarC.C(-1.42f, 1.42f);
        fVarC.u(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        fVarC.v(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        fVarC.H(-4.03f, -9.0f, -9.0f, -9.0f);
        fVarC.p();
        fVarC.D(12.0f, 8.0f);
        fVarC.K(5.0f);
        fVarC.C(4.28f, 2.54f);
        fVarC.C(0.72f, -1.21f);
        fVarC.C(-3.5f, -2.08f);
        fVarC.B(13.5f, 8.0f);
        fVarC.B(12.0f, 8.0f);
        fVarC.p();
        e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        f fVarB = eVar.b();
        f6365n = fVarB;
        return fVarB;
    }

    public static final f P() {
        f fVar = f6366o;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(7.41f, 15.41f);
        fVar2.B(12.0f, 10.83f);
        fVar2.C(4.59f, 4.58f);
        fVar2.B(18.0f, 14.0f);
        fVar2.C(-6.0f, -6.0f);
        fVar2.C(-6.0f, 6.0f);
        fVar2.p();
        e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        f fVarB = eVar.b();
        f6366o = fVarB;
        return fVarB;
    }

    public static final int Q(q qVar) {
        long jE;
        x xVar = (x) qVar;
        if (xVar.f2497e == h1.f15593a) {
            k0 k0Var = xVar.f2507o;
            jE = o1.s.e(k0Var.b(), k0Var.a()) & 4294967295L;
        } else {
            k0 k0Var2 = xVar.f2507o;
            jE = o1.s.e(k0Var2.b(), k0Var2.a()) >> 32;
        }
        return (int) jE;
    }

    public static final f R() {
        f fVar = f6369r;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVarC = k.c(7, 12.0f, 12.0f);
        fVarC.v(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        fVarC.H(-1.79f, -4.0f, -4.0f, -4.0f);
        fVarC.H(-4.0f, 1.79f, -4.0f, 4.0f);
        fVarC.H(1.79f, 4.0f, 4.0f, 4.0f);
        fVarC.p();
        fVarC.D(12.0f, 14.0f);
        fVarC.v(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        fVarC.K(2.0f);
        fVarC.A(16.0f);
        fVarC.K(-2.0f);
        fVarC.v(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        fVarC.p();
        e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        f fVarB = eVar.b();
        f6369r = fVarB;
        return fVarB;
    }

    public static final f S() {
        f fVar = f6370s;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVarC = k.c(7, 17.65f, 6.35f);
        fVarC.u(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        fVarC.v(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        fVarC.H(3.57f, 8.0f, 7.99f, 8.0f);
        fVarC.v(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        fVarC.A(-2.08f);
        fVarC.v(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        fVarC.v(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        fVarC.H(2.69f, -6.0f, 6.0f, -6.0f);
        fVarC.v(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        fVarC.B(13.0f, 11.0f);
        fVarC.A(7.0f);
        fVarC.J(4.0f);
        fVarC.C(-2.35f, 2.35f);
        fVarC.p();
        e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        f fVarB = eVar.b();
        f6370s = fVarB;
        return fVarB;
    }

    public static final String T(int i10, m mVar) {
        m0.q qVar = (m0.q) mVar;
        qVar.m(u1.y0.f15376a);
        return ((Context) qVar.m(u1.y0.f15377b)).getResources().getString(i10);
    }

    public static final f U() {
        f fVar = f6373v;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.VisibilityOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVarC = k.c(7, 12.0f, 7.0f);
        fVarC.v(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        fVarC.v(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f);
        fVarC.C(2.92f, 2.92f);
        fVarC.v(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f);
        fVarC.v(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        fVarC.v(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f);
        fVarC.C(2.16f, 2.16f);
        fVarC.u(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f);
        fVarC.p();
        fVarC.D(2.0f, 4.27f);
        fVarC.C(2.28f, 2.28f);
        fVarC.C(0.46f, 0.46f);
        fVarC.u(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f);
        fVarC.v(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        fVarC.v(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f);
        fVarC.C(0.42f, 0.42f);
        fVarC.B(19.73f, 22.0f);
        fVarC.B(21.0f, 20.73f);
        fVarC.B(3.27f, 3.0f);
        fVarC.B(2.0f, 4.27f);
        fVarC.p();
        fVarC.D(7.53f, 9.8f);
        fVarC.C(1.55f, 1.55f);
        fVarC.v(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        fVarC.v(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        fVarC.v(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        fVarC.C(1.55f, 1.55f);
        fVarC.v(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f);
        fVarC.v(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        fVarC.v(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f);
        fVarC.p();
        fVarC.D(11.84f, 9.02f);
        fVarC.C(3.15f, 3.15f);
        fVarC.C(0.02f, -0.16f);
        fVarC.v(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        fVarC.C(-0.17f, 0.01f);
        fVarC.p();
        e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        f fVarB = eVar.b();
        f6373v = fVarB;
        return fVarB;
    }

    public static boolean V() {
        try {
            if (f6355d == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f6355d == null) {
                f6354c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f6355d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f6355d.invoke(null, Long.valueOf(f6354c))).booleanValue();
        } catch (Exception e4) {
            if (!(e4 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e4);
                return false;
            }
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean W(Context context, int i10) {
        if (!k0(i10, context, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            z5.k kVarA = z5.k.a(context);
            kVarA.getClass();
            if (packageInfo == null) {
                return false;
            }
            if (!z5.k.f(packageInfo, false)) {
                if (!z5.k.f(packageInfo, true)) {
                    return false;
                }
                if (!j.a((Context) kVarA.f17260a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    public static synchronized boolean X(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f6352a;
        if (context2 != null && (bool = f6353b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f6353b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f6353b = boolValueOf;
        f6352a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static boolean Y(String str) {
        int i10 = i.f13209a;
        return str == null || str.isEmpty();
    }

    public static final boolean Z(d1.e eVar) {
        float fB = d1.a.b(eVar.f4340e);
        long j10 = eVar.f4340e;
        if (fB == d1.a.c(j10)) {
            float fB2 = d1.a.b(j10);
            long j11 = eVar.f4341f;
            if (fB2 == d1.a.b(j11) && d1.a.b(j10) == d1.a.c(j11)) {
                float fB3 = d1.a.b(j10);
                long j12 = eVar.f4342g;
                if (fB3 == d1.a.b(j12) && d1.a.b(j10) == d1.a.c(j12)) {
                    float fB4 = d1.a.b(j10);
                    long j13 = eVar.f4343h;
                    if (fB4 == d1.a.b(j13) && d1.a.b(j10) == d1.a.c(j13)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x0167  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1 A[PHI: r1 r2 r3 r4 r8
  0x00f1: PHI (r1v6 y0.o) = (r1v3 y0.o), (r1v10 y0.o) binds: [B:104:0x0140, B:87:0x00ee] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r2v11 e1.l0) = (r2v6 e1.l0), (r2v12 e1.l0) binds: [B:104:0x0140, B:87:0x00ee] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r3v29 int) = (r3v16 int), (r3v32 int) binds: [B:104:0x0140, B:87:0x00ee] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r4v13 k0.g0) = (r4v5 k0.g0), (r4v14 k0.g0) binds: [B:104:0x0140, B:87:0x00ee] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r8v11 k0.h0) = (r8v3 k0.h0), (r8v2 k0.h0) binds: [B:104:0x0140, B:87:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0119  */
    public static final void a(o oVar, l0 l0Var, g0 g0Var, k0.h0 h0Var, w wVar, c9.f fVar, m mVar, int i10, int i11) {
        o oVar2;
        int i12;
        l0 l0Var2;
        g0 g0Var2;
        k0.h0 h0VarE;
        w wVar2;
        int i13;
        o oVar3;
        l0 l0VarA;
        g0 g0VarH;
        w wVar3;
        k0.h0 h0Var2;
        k0.y0 y0Var;
        Object objP;
        g0 g0Var3;
        k0.h0 h0Var3;
        x1 x1VarX;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(1179621553);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 6) == 0) {
            oVar2 = oVar;
            i12 = (qVar.g(oVar2) ? 4 : 2) | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                l0Var2 = l0Var;
                int i15 = qVar.g(l0Var2) ? 32 : 16;
                i12 |= i15;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i15;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                g0Var2 = g0Var;
                int i16 = qVar.g(g0Var2) ? 256 : 128;
                i12 |= i16;
            } else {
                g0Var2 = g0Var;
            }
            i12 |= i16;
        } else {
            g0Var2 = g0Var;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                h0VarE = h0Var;
                int i17 = qVar.g(h0VarE) ? 2048 : 1024;
                i12 |= i17;
            } else {
                h0VarE = h0Var;
            }
            i12 |= i17;
        } else {
            h0VarE = h0Var;
        }
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((i10 & 24576) == 0) {
                wVar2 = wVar;
                i12 |= qVar.g(wVar2) ? 16384 : 8192;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (qVar.i(fVar)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i12 |= i13;
            }
            if ((74899 & i12) == 74898 || !qVar.G()) {
                qVar.W();
                if ((i10 & 1) != 0 || qVar.E()) {
                    if (i14 != 0) {
                        oVar3 = l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if ((i11 & 2) != 0) {
                        qVar.Z(1266660211);
                        l0VarA = r2.a(h.f11057b, qVar);
                        qVar.t(false);
                        i12 &= -113;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        qVar.Z(-1876034303);
                        g0VarH = t0.h((i0) qVar.m(k0.k0.f9091a));
                        qVar.t(false);
                        i12 &= -897;
                    } else {
                        g0VarH = g0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        h0VarE = t0.e(0.0f, qVar, 63);
                    }
                    if (i18 != 0) {
                        wVar3 = null;
                    }
                    h0Var2 = h0VarE;
                    int i19 = i12;
                    qVar.u();
                    long j10 = g0VarH.f8936a;
                    long j11 = g0VarH.f8937b;
                    float f10 = h0Var2.f8963a;
                    qVar.Z(-1763481333);
                    qVar.Z(-1409178619);
                    y0Var = m0.l.f11578a;
                    qVar.Z(-1409178567);
                    objP = qVar.P();
                    if (objP == y0Var) {
                        objP = t.g0(new m2.e(h0Var2.f8963a), o3.f11621a);
                        qVar.l0(objP);
                    }
                    qVar.t(false);
                    qVar.t(false);
                    qVar.t(false);
                    p3.a(oVar3, l0VarA, j10, j11, f10, ((m2.e) ((g1) objP).getValue()).f11798a, wVar3, t.K(qVar, 664103990, new k0.r(fVar, 1)), qVar, (i19 & 14) | 12582912 | (i19 & 112) | ((i19 << 6) & 3670016), 0);
                    g0Var3 = g0VarH;
                    h0Var3 = h0Var2;
                } else {
                    qVar.U();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    oVar3 = oVar2;
                    l0VarA = l0Var2;
                    g0VarH = g0Var2;
                }
                wVar3 = wVar2;
                h0Var2 = h0VarE;
                int i110 = i12;
                qVar.u();
                long j12 = g0VarH.f8936a;
                long j13 = g0VarH.f8937b;
                float f11 = h0Var2.f8963a;
                qVar.Z(-1763481333);
                qVar.Z(-1409178619);
                y0Var = m0.l.f11578a;
                qVar.Z(-1409178567);
                objP = qVar.P();
                if (objP == y0Var) {
                    objP = t.g0(new m2.e(h0Var2.f8963a), o3.f11621a);
                    qVar.l0(objP);
                }
                qVar.t(false);
                qVar.t(false);
                qVar.t(false);
                p3.a(oVar3, l0VarA, j12, j13, f11, ((m2.e) ((g1) objP).getValue()).f11798a, wVar3, t.K(qVar, 664103990, new k0.r(fVar, 1)), qVar, (i110 & 14) | 12582912 | (i110 & 112) | ((i110 << 6) & 3670016), 0);
                g0Var3 = g0VarH;
                h0Var3 = h0Var2;
            } else {
                qVar.U();
                oVar3 = oVar2;
                l0VarA = l0Var2;
                g0Var3 = g0Var2;
                h0Var3 = h0VarE;
                wVar3 = wVar2;
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new s.m(oVar3, l0VarA, g0Var3, h0Var3, wVar3, fVar, i10, i11);
            }
        }
        i12 |= 24576;
        wVar2 = wVar;
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (qVar.i(fVar)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
        }
        if ((74899 & i12) == 74898) {
            qVar.W();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if ((i11 & 2) != 0) {
                    qVar.Z(1266660211);
                    l0VarA = r2.a(h.f11057b, qVar);
                    qVar.t(false);
                    i12 &= -113;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 4) != 0) {
                    qVar.Z(-1876034303);
                    g0VarH = t0.h((i0) qVar.m(k0.k0.f9091a));
                    qVar.t(false);
                    i12 &= -897;
                } else {
                    g0VarH = g0Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    h0VarE = t0.e(0.0f, qVar, 63);
                }
                if (i18 != 0) {
                    wVar3 = null;
                } else {
                    wVar3 = wVar2;
                }
            } else {
                if (i14 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if ((i11 & 2) != 0) {
                    qVar.Z(1266660211);
                    l0VarA = r2.a(h.f11057b, qVar);
                    qVar.t(false);
                    i12 &= -113;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 4) != 0) {
                    qVar.Z(-1876034303);
                    g0VarH = t0.h((i0) qVar.m(k0.k0.f9091a));
                    qVar.t(false);
                    i12 &= -897;
                } else {
                    g0VarH = g0Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    h0VarE = t0.e(0.0f, qVar, 63);
                }
                if (i18 != 0) {
                    wVar3 = null;
                } else {
                    wVar3 = wVar2;
                }
            }
            h0Var2 = h0VarE;
            int i111 = i12;
            qVar.u();
            long j14 = g0VarH.f8936a;
            long j15 = g0VarH.f8937b;
            float f12 = h0Var2.f8963a;
            qVar.Z(-1763481333);
            qVar.Z(-1409178619);
            y0Var = m0.l.f11578a;
            qVar.Z(-1409178567);
            objP = qVar.P();
            if (objP == y0Var) {
                objP = t.g0(new m2.e(h0Var2.f8963a), o3.f11621a);
                qVar.l0(objP);
            }
            qVar.t(false);
            qVar.t(false);
            qVar.t(false);
            p3.a(oVar3, l0VarA, j14, j15, f12, ((m2.e) ((g1) objP).getValue()).f11798a, wVar3, t.K(qVar, 664103990, new k0.r(fVar, 1)), qVar, (i111 & 14) | 12582912 | (i111 & 112) | ((i111 << 6) & 3670016), 0);
            g0Var3 = g0VarH;
            h0Var3 = h0Var2;
        } else {
            qVar.W();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if ((i11 & 2) != 0) {
                    qVar.Z(1266660211);
                    l0VarA = r2.a(h.f11057b, qVar);
                    qVar.t(false);
                    i12 &= -113;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 4) != 0) {
                    qVar.Z(-1876034303);
                    g0VarH = t0.h((i0) qVar.m(k0.k0.f9091a));
                    qVar.t(false);
                    i12 &= -897;
                } else {
                    g0VarH = g0Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    h0VarE = t0.e(0.0f, qVar, 63);
                }
                if (i18 != 0) {
                    wVar3 = null;
                } else {
                    wVar3 = wVar2;
                }
            } else {
                if (i14 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if ((i11 & 2) != 0) {
                    qVar.Z(1266660211);
                    l0VarA = r2.a(h.f11057b, qVar);
                    qVar.t(false);
                    i12 &= -113;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 4) != 0) {
                    qVar.Z(-1876034303);
                    g0VarH = t0.h((i0) qVar.m(k0.k0.f9091a));
                    qVar.t(false);
                    i12 &= -897;
                } else {
                    g0VarH = g0Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    h0VarE = t0.e(0.0f, qVar, 63);
                }
                if (i18 != 0) {
                    wVar3 = null;
                } else {
                    wVar3 = wVar2;
                }
            }
            h0Var2 = h0VarE;
            int i112 = i12;
            qVar.u();
            long j16 = g0VarH.f8936a;
            long j17 = g0VarH.f8937b;
            float f13 = h0Var2.f8963a;
            qVar.Z(-1763481333);
            qVar.Z(-1409178619);
            y0Var = m0.l.f11578a;
            qVar.Z(-1409178567);
            objP = qVar.P();
            if (objP == y0Var) {
                objP = t.g0(new m2.e(h0Var2.f8963a), o3.f11621a);
                qVar.l0(objP);
            }
            qVar.t(false);
            qVar.t(false);
            qVar.t(false);
            p3.a(oVar3, l0VarA, j16, j17, f13, ((m2.e) ((g1) objP).getValue()).f11798a, wVar3, t.K(qVar, 664103990, new k0.r(fVar, 1)), qVar, (i112 & 14) | 12582912 | (i112 & 112) | ((i112 << 6) & 3670016), 0);
            g0Var3 = g0VarH;
            h0Var3 = h0Var2;
        }
        x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new s.m(oVar3, l0VarA, g0Var3, h0Var3, wVar3, fVar, i10, i11);
        }
    }

    public static final o a0(o oVar, a0.n nVar, a0.j jVar, boolean z10, m2.l lVar, h1 h1Var, boolean z11, m mVar) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(1331498025);
        if (z11) {
            Object[] objArr = {nVar, jVar, Boolean.valueOf(z10), lVar, h1Var};
            qVar.Z(-568225417);
            boolean zG = false;
            for (int i10 = 0; i10 < 5; i10++) {
                zG |= qVar.g(objArr[i10]);
            }
            Object objP = qVar.P();
            if (zG || objP == m0.l.f11578a) {
                objP = new a0.m(nVar, jVar, z10, lVar, h1Var);
                qVar.l0(objP);
            }
            qVar.t(false);
            oVar = oVar.j((o) objP);
        }
        qVar.t(false);
        return oVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(v1 v1Var, c9.e eVar, m mVar, int i10) {
        l3 l3Var;
        r1 eVar2;
        boolean z10;
        r1 r1Var;
        x1 x1VarX;
        r1 r1Var2;
        u0.e eVar3;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-1350970552);
        r1 r1VarP = qVar.p();
        qVar.X(201, m0.s.f11694b);
        Object objP = qVar.P();
        if (d7.a.d(objP, m0.l.f11578a)) {
            l3Var = null;
        } else {
            d7.a.k(objP, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>");
            l3Var = (l3) objP;
        }
        z zVar = v1Var.f11716a;
        d7.a.k(zVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        l3 l3VarA = zVar.a(l3Var, v1Var.f11717b);
        boolean z11 = !d7.a.d(l3VarA, l3Var);
        if (z11) {
            qVar.l0(l3VarA);
        }
        if (!qVar.O) {
            m2 m2Var = qVar.F;
            Object objB = m2Var.b(m2Var.f11584b, m2Var.f11589g);
            d7.a.k(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            r1 r1Var3 = (r1) objB;
            if ((!qVar.G() || z11) && (v1Var.f11718c || !r1VarP.containsKey(zVar))) {
                u0.e eVar4 = (u0.e) r1VarP;
                eVar4.getClass();
                r0.q qVarU = eVar4.f13304a.u(zVar, zVar.hashCode(), 0, l3VarA);
                eVar2 = eVar4;
                if (qVarU != null) {
                    eVar2 = new u0.e(qVarU.f13326a, eVar4.f13305b + qVarU.f13327b);
                }
            } else {
                eVar2 = r1Var3;
            }
            r1Var2 = eVar2;
            if (qVar.f11653x || r1Var3 != eVar2) {
                z10 = true;
                r1Var = eVar2;
            }
            if (z10 && !qVar.O) {
                qVar.N(r1Var);
            }
            boolean z12 = qVar.f11651v;
            m0.t0 t0Var = qVar.f11652w;
            t0Var.b(z12 ? 1 : 0);
            qVar.f11651v = z10;
            qVar.J = r1Var;
            qVar.V(m0.s.f11695c, 202, 0, r1Var);
            l.q.q((i10 >> 3) & 14, eVar, qVar, false, false);
            qVar.f11651v = t0Var.a() != 0;
            qVar.J = null;
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new u.x(v1Var, eVar, i10, 5);
            }
        }
        u0.e eVar5 = (u0.e) r1VarP;
        eVar5.getClass();
        r0.q qVarU2 = eVar5.f13304a.u(zVar, zVar.hashCode(), 0, l3VarA);
        if (qVarU2 != null) {
            eVar3 = eVar5;
            eVar3 = new u0.e(qVarU2.f13326a, eVar5.f13305b + qVarU2.f13327b);
        }
        eVar3 = eVar5;
        qVar.I = true;
        r1Var2 = eVar3;
        z10 = false;
        r1Var = r1Var2;
        if (z10) {
            qVar.N(r1Var);
        }
        boolean z13 = qVar.f11651v;
        m0.t0 t0Var2 = qVar.f11652w;
        t0Var2.b(z13 ? 1 : 0);
        qVar.f11651v = z10;
        qVar.J = r1Var;
        qVar.V(m0.s.f11695c, 202, 0, r1Var);
        l.q.q((i10 >> 3) & 14, eVar, qVar, false, false);
        qVar.f11651v = t0Var2.a() != 0;
        qVar.J = null;
        x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new u.x(v1Var, eVar, i10, 5);
        }
    }

    public static final o b0(o oVar, j9.e eVar, a0.h0 h0Var, h1 h1Var, boolean z10, boolean z11, m mVar) {
        y1.b bVar;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(1070136913);
        qVar.Z(773894976);
        qVar.Z(-492369756);
        Object objP = qVar.P();
        k0.y0 y0Var = m0.l.f11578a;
        if (objP == y0Var) {
            d0 d0Var = new d0(m0.s.h(qVar));
            qVar.l0(d0Var);
            objP = d0Var;
        }
        int i10 = 0;
        qVar.t(false);
        m9.d0 d0Var2 = ((d0) objP).f11474a;
        qVar.t(false);
        Object[] objArr = {eVar, h0Var, h1Var, Boolean.valueOf(z10)};
        qVar.Z(-568225417);
        boolean zG = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zG |= qVar.g(objArr[i11]);
        }
        Object objP2 = qVar.P();
        if (zG || objP2 == y0Var) {
            int i12 = 1;
            boolean z12 = h1Var == h1.f15593a;
            j0 j0Var = new j0(eVar, i10);
            y1.h hVar = new y1.h(new a0.i0(h0Var, i10), new a0.i0(h0Var, i12), z11);
            l2 l2Var = z10 ? new l2(z12, d0Var2, h0Var) : null;
            g gVar = z10 ? new g(eVar, d0Var2, h0Var, 10) : null;
            d dVar = (d) h0Var;
            int i13 = dVar.f17028a;
            boolean z13 = dVar.f17029b;
            switch (i13) {
                case 0:
                    bVar = z13 ? new y1.b(-1, 1) : new y1.b(1, -1);
                    break;
                default:
                    f2 f2Var = dVar.f17030c;
                    bVar = z13 ? new y1.b(((b0.h0) f2Var).k(), 1) : new y1.b(1, ((b0.h0) f2Var).k());
                    break;
            }
            objP2 = y1.l.a(l.f16729b, false, new u.y(j0Var, z12, hVar, l2Var, gVar, bVar, 1));
            qVar.l0(objP2);
        }
        qVar.t(false);
        o oVarJ = oVar.j((o) objP2);
        qVar.t(false);
        return oVarJ;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(v1[] v1VarArr, c9.e eVar, m mVar, int i10) {
        r1 r1VarK0;
        boolean z10;
        x1 x1VarX;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-1390796515);
        r1 r1VarP = qVar.p();
        qVar.X(201, m0.s.f11694b);
        if (qVar.O) {
            r1VarK0 = qVar.k0(r1VarP, t.x0(v1VarArr, r1VarP, u0.e.f15008d));
            qVar.I = true;
        } else {
            m2 m2Var = qVar.F;
            Object objG = m2Var.g(m2Var.f11589g, 0);
            d7.a.k(objG, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            r1 r1Var = (r1) objG;
            m2 m2Var2 = qVar.F;
            Object objG2 = m2Var2.g(m2Var2.f11589g, 1);
            d7.a.k(objG2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            r1 r1Var2 = (r1) objG2;
            u0.e eVarX0 = t.x0(v1VarArr, r1VarP, r1Var2);
            if (!qVar.G() || qVar.f11653x || !d7.a.d(r1Var2, eVarX0)) {
                r1VarK0 = qVar.k0(r1VarP, eVarX0);
                if (qVar.f11653x || !d7.a.d(r1VarK0, r1Var)) {
                    z10 = true;
                }
                if (z10 && !qVar.O) {
                    qVar.N(r1VarK0);
                }
                boolean z11 = qVar.f11651v;
                m0.t0 t0Var = qVar.f11652w;
                t0Var.b(z11 ? 1 : 0);
                qVar.f11651v = z10;
                qVar.J = r1VarK0;
                qVar.V(m0.s.f11695c, 202, 0, r1VarK0);
                l.q.q((i10 >> 3) & 14, eVar, qVar, false, false);
                qVar.f11651v = t0Var.a() != 0;
                qVar.J = null;
                x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new u.x(v1VarArr, eVar, i10, 4);
                }
            }
            qVar.f11641l = qVar.F.l() + qVar.f11641l;
            r1VarK0 = r1Var;
        }
        z10 = false;
        if (z10) {
            qVar.N(r1VarK0);
        }
        boolean z12 = qVar.f11651v;
        m0.t0 t0Var2 = qVar.f11652w;
        t0Var2.b(z12 ? 1 : 0);
        qVar.f11651v = z10;
        qVar.J = r1VarK0;
        qVar.V(m0.s.f11695c, 202, 0, r1VarK0);
        l.q.q((i10 >> 3) & 14, eVar, qVar, false, false);
        qVar.f11651v = t0Var2.a() != 0;
        qVar.J = null;
        x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new u.x(v1VarArr, eVar, i10, 4);
        }
    }

    public static String c0(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e4) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e4);
                    StringBuilder sbR = a7.a.r("<", str2, " threw ");
                    sbR.append(e4.getClass().getName());
                    sbR.append(">");
                    string = sbR.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb.append((CharSequence) strValueOf, i12, iIndexOf);
            sb.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb.append((CharSequence) strValueOf, i12, strValueOf.length());
        if (i10 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final long d(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = d1.a.f4321b;
        return jFloatToRawIntBits;
    }

    public static String d0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public static final void e(MainViewModel mainViewModel, String str, m mVar, int i10) {
        d7.a.m(mainViewModel, "viewModel");
        d7.a.m(str, "email");
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-1297677441);
        g1 g1VarI = t.I(mainViewModel.D, qVar);
        y3.e.f(t.K(qVar, 479912567, new u(str, t.e.f(t.e.q("email_pulse", qVar, 0), 1.0f, 1.1f, t.e.p(t.e.s(1200, 0, c0.f14096b, 2), 2, 4), "scale", qVar, 29112, 0), t.I(mainViewModel.F, qVar), mainViewModel, g1VarI)), qVar, 6);
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new u.x(mainViewModel, str, i10, 9);
        }
    }

    public static void e0(EdgeEffect edgeEffect, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            n.f14854a.c(edgeEffect, f10, 0.0f);
        } else {
            edgeEffect.onPull(f10, 0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void f(c9.a aVar, o oVar, a0.d0 d0Var, c9.e eVar, m mVar, int i10, int i11) {
        int i12;
        o oVar2;
        int i13;
        a0.d0 d0Var2;
        int i14;
        int i15;
        o oVar3;
        a0.d0 d0Var3;
        x1 x1VarX;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (qVar.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 112) == 0) {
                oVar2 = oVar;
                i12 |= qVar.g(oVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    d0Var2 = d0Var;
                    if (qVar.g(d0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    if ((i10 & 7168) == 0) {
                        if (qVar.i(eVar)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 5851) == 1170 || !qVar.G()) {
                        if (i16 != 0) {
                            oVar3 = l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            d0Var3 = null;
                        } else {
                            d0Var3 = d0Var2;
                        }
                        i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
                    } else {
                        qVar.U();
                        oVar3 = oVar2;
                        d0Var3 = d0Var2;
                    }
                    x1VarX = qVar.x();
                    if (x1VarX != null) {
                        x1VarX.f11756d = new v(aVar, oVar3, d0Var3, eVar, i10, i11, 0);
                    }
                }
                i12 |= 3072;
                if ((i12 & 5851) == 1170) {
                    if (i16 != 0) {
                        oVar3 = l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        d0Var3 = null;
                    } else {
                        d0Var3 = d0Var2;
                    }
                    i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
                } else {
                    if (i16 != 0) {
                        oVar3 = l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        d0Var3 = null;
                    } else {
                        d0Var3 = d0Var2;
                    }
                    i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
                }
                x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new v(aVar, oVar3, d0Var3, eVar, i10, i11, 0);
                }
            }
            i12 |= 384;
            d0Var2 = d0Var;
            if ((i11 & 8) != 0) {
                if ((i10 & 7168) == 0) {
                    if (qVar.i(eVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) == 1170) {
                    if (i16 != 0) {
                        oVar3 = l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        d0Var3 = null;
                    } else {
                        d0Var3 = d0Var2;
                    }
                    i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
                } else {
                    if (i16 != 0) {
                        oVar3 = l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        d0Var3 = null;
                    } else {
                        d0Var3 = d0Var2;
                    }
                    i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
                }
                x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new v(aVar, oVar3, d0Var3, eVar, i10, i11, 0);
                }
            }
            i12 |= 3072;
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
            } else {
                if (i16 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new v(aVar, oVar3, d0Var3, eVar, i10, i11, 0);
            }
        }
        i12 |= 48;
        oVar2 = oVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                d0Var2 = d0Var;
                if (qVar.g(d0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 7168) == 0) {
                    if (qVar.i(eVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) == 1170) {
                    if (i16 != 0) {
                        oVar3 = l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        d0Var3 = null;
                    } else {
                        d0Var3 = d0Var2;
                    }
                    i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
                } else {
                    if (i16 != 0) {
                        oVar3 = l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        d0Var3 = null;
                    } else {
                        d0Var3 = d0Var2;
                    }
                    i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
                }
                x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new v(aVar, oVar3, d0Var3, eVar, i10, i11, 0);
                }
            }
            i12 |= 3072;
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
            } else {
                if (i16 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new v(aVar, oVar3, d0Var3, eVar, i10, i11, 0);
            }
        }
        i12 |= 384;
        d0Var2 = d0Var;
        if ((i11 & 8) != 0) {
            if ((i10 & 7168) == 0) {
                if (qVar.i(eVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
            } else {
                if (i16 != 0) {
                    oVar3 = l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new v(aVar, oVar3, d0Var3, eVar, i10, i11, 0);
            }
        }
        i12 |= 3072;
        if ((i12 & 5851) == 1170) {
            if (i16 != 0) {
                oVar3 = l.f16729b;
            } else {
                oVar3 = oVar2;
            }
            if (i13 != 0) {
                d0Var3 = null;
            } else {
                d0Var3 = d0Var2;
            }
            i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
        } else {
            if (i16 != 0) {
                oVar3 = l.f16729b;
            } else {
                oVar3 = oVar2;
            }
            if (i13 != 0) {
                d0Var3 = null;
            } else {
                d0Var3 = d0Var2;
            }
            i(t.K(qVar, -1488997347, new s.k(d0Var3, oVar3, eVar, t.m0(aVar, qVar), 1)), qVar, 6);
        }
        x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new v(aVar, oVar3, d0Var3, eVar, i10, i11, 0);
        }
    }

    public static final void f0(n0.i0 i0Var, int i10, int i11) {
        int i12 = 1 << i10;
        int i13 = i0Var.f12081g;
        if ((i13 & i12) == 0) {
            i0Var.f12081g = i12 | i13;
            i0Var.f12077c[(i0Var.f12078d - i0Var.f().f12067a) + i10] = i11;
        } else {
            throw new IllegalStateException(("Already pushed argument " + i0Var.f().b(i10)).toString());
        }
    }

    public static final void g(Object obj, int i10, a0 a0Var, c9.e eVar, m mVar, int i11) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-2079116560);
        qVar.Z(511388516);
        boolean zG = qVar.g(obj) | qVar.g(a0Var);
        Object objP = qVar.P();
        k0.y0 y0Var = m0.l.f11578a;
        if (zG || objP == y0Var) {
            objP = new a0.z(obj, a0Var);
            qVar.l0(objP);
        }
        qVar.t(false);
        a0.z zVar = (a0.z) objP;
        l1 l1Var = zVar.f877c;
        n1 n1Var = zVar.f879e;
        n1 n1Var2 = zVar.f880f;
        l1Var.f(i10);
        p0 p0Var = v0.f13415a;
        a0.z zVar2 = (a0.z) qVar.m(p0Var);
        w0.i iVarC = k0.y0.c();
        try {
            w0.i iVarJ = iVarC.j();
            try {
                if (zVar2 != ((a0.z) n1Var2.getValue())) {
                    n1Var2.setValue(zVar2);
                    if (zVar.f878d.d() > 0) {
                        a0.z zVar3 = (a0.z) n1Var.getValue();
                        if (zVar3 != null) {
                            zVar3.b();
                        }
                        if (zVar2 != null) {
                            zVar2.a();
                        } else {
                            zVar2 = null;
                        }
                        n1Var.setValue(zVar2);
                    }
                }
                w0.i.p(iVarJ);
                iVarC.c();
                qVar.Z(1161125085);
                boolean zG2 = qVar.g(zVar);
                Object objP2 = qVar.P();
                if (zG2 || objP2 == y0Var) {
                    objP2 = new q.w(zVar, 16);
                    qVar.l0(objP2);
                }
                qVar.t(false);
                m0.s.a(zVar, (c9.c) objP2, qVar);
                b(p0Var.b(zVar), eVar, qVar, (i11 >> 6) & 112);
                x1 x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new a0.r(obj, i10, a0Var, eVar, i11);
                }
            } catch (Throwable th) {
                w0.i.p(iVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            iVarC.c();
            throw th2;
        }
    }

    public static final void g0(n0.i0 i0Var, int i10, Object obj) {
        int i11 = 1 << i10;
        int i12 = i0Var.f12082h;
        if ((i12 & i11) == 0) {
            i0Var.f12082h = i11 | i12;
            i0Var.f12079e[(i0Var.f12080f - i0Var.f().f12068b) + i10] = obj;
        } else {
            throw new IllegalStateException(("Already pushed argument " + i0Var.f().c(i10)).toString());
        }
    }

    public static final void h(a0.d0 d0Var, a0.q qVar, r1.h1 h1Var, m mVar, int i10) {
        m0.q qVar2 = (m0.q) mVar;
        qVar2.a0(1113453182);
        View view = (View) qVar2.m(u1.y0.f15381f);
        qVar2.Z(1618982084);
        boolean zG = qVar2.g(h1Var) | qVar2.g(d0Var) | qVar2.g(view);
        Object objP = qVar2.P();
        if (zG || objP == m0.l.f11578a) {
            qVar2.l0(new f0(d0Var, h1Var, qVar, view));
        }
        qVar2.t(false);
        x1 x1VarX = qVar2.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new a0.g0(i10, 0, d0Var, qVar, h1Var);
        }
    }

    public static int h0(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final void i(c9.f fVar, m mVar, int i10) {
        int i11;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(674185128);
        if ((i10 & 14) == 0) {
            i11 = (qVar.i(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && qVar.G()) {
            qVar.U();
        } else {
            m3 m3Var = v0.o.f15878a;
            v0.l lVar = (v0.l) qVar.m(m3Var);
            a0.n0 n0Var = a0.n0.f833a;
            m0 m0Var = new m0(lVar, 1);
            v0.p pVar = v0.q.f15881a;
            o0 o0Var = (o0) x3.c.d(new Object[]{lVar}, new v0.p(n0Var, m0Var), new t.l0(lVar, 7), qVar, 4);
            b(m3Var.b(o0Var), t.K(qVar, 1863926504, new v.n0(3, o0Var, fVar)), qVar, 56);
        }
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new a0.p0(fVar, i10, 0);
        }
    }

    public static String i0(int i10) {
        if (D(i10, 1)) {
            return "Text";
        }
        if (D(i10, 2)) {
            return "Ascii";
        }
        if (D(i10, 3)) {
            return "Number";
        }
        if (D(i10, 4)) {
            return "Phone";
        }
        if (D(i10, 5)) {
            return "Uri";
        }
        if (D(i10, 6)) {
            return "Email";
        }
        if (D(i10, 7)) {
            return "Password";
        }
        if (D(i10, 8)) {
            return "NumberPassword";
        }
        return D(i10, 9) ? "Decimal" : "Invalid";
    }

    public static final void j(o oVar, c9.e eVar, m mVar, int i10, int i11) {
        int i12;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-2105228848);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (qVar.g(oVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= qVar.i(eVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && qVar.G()) {
            qVar.U();
        } else {
            if (i13 != 0) {
                oVar = l.f16729b;
            }
            h0.o0 o0Var = h0.o0.f7435a;
            qVar.Z(-1323940314);
            int i14 = qVar.P;
            r1 r1VarP = qVar.p();
            t1.l.f14477k.getClass();
            t1.j jVar = t1.k.f14458b;
            u0.b bVarI = androidx.compose.ui.layout.a.i(oVar);
            int i15 = (((((i12 << 3) & 112) | (((i12 >> 3) & 14) | 384)) << 9) & 7168) | 6;
            if (!(qVar.f11630a instanceof m0.d)) {
                e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            t.s0(qVar, o0Var, t1.k.f14461e);
            t.s0(qVar, r1VarP, t1.k.f14460d);
            t1.i iVar = t1.k.f14462f;
            if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i14))) {
                l.q.r(i14, qVar, i14, iVar);
            }
            l.q.s((i15 >> 3) & 112, bVarI, new m0.l2(qVar), qVar, 2058660585);
            l.q.q((i15 >> 9) & 14, eVar, qVar, false, true);
            qVar.t(false);
        }
        o oVar2 = oVar;
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new h0.p0(oVar2, eVar, i10, i11, 0);
        }
    }

    public static q6.g j0(Object obj) {
        return new q6.g(obj.getClass().getSimpleName());
    }

    public static final void k(s sVar, Object obj, int i10, Object obj2, m mVar, int i11) {
        int i12;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(1439843069);
        if ((i11 & 14) == 0) {
            i12 = (qVar.g(sVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= qVar.g(obj) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= qVar.e(i10) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= qVar.g(obj2) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && qVar.G()) {
            qVar.U();
        } else {
            ((v0.e) obj).f(obj2, t.K(qVar, 980966366, new u.x(sVar, i10, obj2, 1)), qVar, 568);
        }
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new a0.r(sVar, obj, i10, obj2, i11, 0);
        }
    }

    public static boolean k0(int i10, Context context, String str) {
        j.a aVarA = b.a(context);
        aVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) aVarA.f8194a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static final int l(int i10, o0.i iVar) {
        int i11 = iVar.f12343c - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = iVar.f12341a;
            int i14 = ((a0.e) objArr[i13]).f782a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((a0.e) objArr[i12]).f782a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    public static HashSet l0(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(f2 f2Var, float f10, t.n nVar, u8.e eVar) {
        o1 o1Var;
        d9.r rVar;
        if (eVar instanceof o1) {
            o1Var = (o1) eVar;
            int i10 = o1Var.f15727c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o1Var.f15727c = i10 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(eVar);
            }
        } else {
            o1Var = new o1(eVar);
        }
        Object obj = o1Var.f15726b;
        Object obj2 = v8.a.f15963a;
        int i11 = o1Var.f15727c;
        if (i11 == 0) {
            t.v0(obj);
            d9.r rVar2 = new d9.r();
            c9.e q1Var = new q1(f10, nVar, rVar2, null);
            o1Var.f15725a = rVar2;
            o1Var.f15727c = 1;
            if (f2Var.c(s1.f14928a, q1Var, o1Var) == obj2) {
                return obj2;
            }
            rVar = rVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = o1Var.f15725a;
            t.v0(obj);
        }
        return new Float(rVar.f4949a);
    }

    public static void m0(d4 d4Var, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        f4 f4Var = d4Var.f9967i;
        if (!readable) {
            f4Var.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            f4Var.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            f4Var.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        f4Var.b("Failed to turn on database write permission for owner");
    }

    public static void n0(d4 d4Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        f4 f4Var = d4Var.f9967i;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
                if (!zMoveToFirst) {
                    sQLiteDatabase.execSQL(str2);
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            f4Var.d("Error querying for table", str, e4);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        try {
            HashSet hashSetL0 = l0(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!hashSetL0.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                    if (!hashSetL0.remove(strArr[i10])) {
                        sQLiteDatabase.execSQL(strArr[i10 + 1]);
                    }
                }
            }
            if (hashSetL0.isEmpty()) {
                return;
            }
            f4Var.d("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSetL0));
        } catch (SQLiteException e10) {
            d4Var.f9964f.c("Failed to verify columns on table that was just created", str);
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object o(androidx.lifecycle.r rVar, u8.e eVar) throws Throwable {
        w4.b bVar;
        androidx.lifecycle.r rVar2;
        d9.u uVar;
        Throwable th;
        androidx.lifecycle.v vVar;
        androidx.lifecycle.v vVar2;
        if (eVar instanceof w4.b) {
            bVar = (w4.b) eVar;
            int i10 = bVar.f16160d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16160d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new w4.b(eVar);
            }
        } else {
            bVar = new w4.b(eVar);
        }
        Object obj = bVar.f16159c;
        v8.a aVar = v8.a.f15963a;
        int i11 = bVar.f16160d;
        q8.l lVar = q8.l.f13235a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = bVar.f16158b;
            rVar2 = bVar.f16157a;
            try {
                t.v0(obj);
                vVar2 = (androidx.lifecycle.v) uVar.f4952a;
                if (vVar2 != null) {
                    rVar2.c(vVar2);
                }
                return lVar;
            } catch (Throwable th2) {
                th = th2;
                vVar = (androidx.lifecycle.v) uVar.f4952a;
                if (vVar != null) {
                    rVar2.c(vVar);
                }
                throw th;
            }
        }
        t.v0(obj);
        if (rVar.b().compareTo(androidx.lifecycle.q.f2172d) >= 0) {
            return lVar;
        }
        d9.u uVar2 = new d9.u();
        try {
            bVar.f16157a = rVar;
            bVar.f16158b = uVar2;
            bVar.f16160d = 1;
            m9.l lVar2 = new m9.l(1, t.b0(bVar));
            lVar2.t();
            w4.c cVar = new w4.c(lVar2);
            uVar2.f4952a = cVar;
            rVar.a(cVar);
            if (lVar2.s() == aVar) {
                return aVar;
            }
            rVar2 = rVar;
            uVar = uVar2;
            vVar2 = (androidx.lifecycle.v) uVar.f4952a;
            if (vVar2 != null) {
                rVar2.c(vVar2);
            }
            return lVar;
        } catch (Throwable th3) {
            rVar2 = rVar;
            uVar = uVar2;
            th = th3;
            vVar = (androidx.lifecycle.v) uVar.f4952a;
            if (vVar != null) {
                rVar2.c(vVar);
            }
            throw th;
        }
    }

    public static /* synthetic */ boolean o0(String str, String str2) {
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    public static final List p(s sVar, a0 a0Var, a0.j jVar) {
        i9.g gVar;
        if (!jVar.f813a.l() && a0Var.f775a.isEmpty()) {
            return r8.r.f13661a;
        }
        ArrayList arrayList = new ArrayList();
        o0.i iVar = jVar.f813a;
        if (!iVar.l()) {
            gVar = i9.g.f8190d;
        } else {
            if (iVar.k()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = iVar.f12341a;
            int i10 = ((a0.i) objArr[0]).f809a;
            int i11 = iVar.f12343c;
            if (i11 > 0) {
                int i12 = 0;
                do {
                    int i13 = ((a0.i) objArr[i12]).f809a;
                    if (i13 < i10) {
                        i10 = i13;
                    }
                    i12++;
                } while (i12 < i11);
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("negative minIndex".toString());
            }
            if (iVar.k()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = iVar.f12341a;
            int i14 = ((a0.i) objArr2[0]).f810b;
            int i15 = iVar.f12343c;
            if (i15 > 0) {
                int i16 = 0;
                do {
                    int i17 = ((a0.i) objArr2[i16]).f810b;
                    if (i17 > i14) {
                        i14 = i17;
                    }
                    i16++;
                } while (i16 < i15);
            }
            gVar = new i9.g(i10, Math.min(i14, sVar.c() - 1), 1);
        }
        int size = a0Var.f775a.size();
        for (int i18 = 0; i18 < size; i18++) {
            a0.z zVar = (a0.z) a0Var.get(i18);
            int iF = F(sVar, zVar.f875a, zVar.f877c.d());
            int i19 = gVar.f8183a;
            if ((iF > gVar.f8184b || i19 > iF) && iF >= 0 && iF < sVar.c()) {
                arrayList.add(Integer.valueOf(iF));
            }
        }
        int i20 = gVar.f8183a;
        int i21 = gVar.f8184b;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ boolean p0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void q(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static /* synthetic */ boolean q0(String str, Object obj) {
        if (str != obj) {
            return str != null && str.equals(obj);
        }
        return true;
    }

    public static void r(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void s(zaq zaqVar) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != zaqVar.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + zaqVar.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void t(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void u(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void v(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void w(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void x(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void y(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void z(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public abstract List A(String str, List list);

    public abstract boolean B(s1.c cVar);

    public abstract Object I(s1.i iVar);
}
