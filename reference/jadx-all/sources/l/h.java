package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import k6.b4;
import k6.c7;
import k6.d4;
import k6.d7;
import k6.e5;
import k6.f4;
import k6.f5;
import k6.g5;
import k6.h5;
import k6.i7;
import k6.j7;
import k6.k4;
import k6.l4;
import k6.o6;
import k6.p4;
import k6.p5;
import k6.p7;
import k6.q6;
import k6.r4;
import k6.r5;
import k6.s5;
import k6.s6;
import k6.t4;
import k6.u7;
import k6.v5;
import k6.w5;
import k6.x7;
import k6.y3;
import k6.y5;
import k6.y7;
import k6.z3;
import k6.z4;
import k6.z6;
import k6.z7;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10769c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f10767a = i10;
        this.f10769c = obj;
        this.f10768b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0360  */
    /* JADX WARN: Code duplicated, block: B:274:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:276:0x082b  */
    /* JADX WARN: Code duplicated, block: B:278:0x0847  */
    /* JADX WARN: Code duplicated, block: B:279:0x0855  */
    /* JADX WARN: Code duplicated, block: B:282:0x0866  */
    /* JADX WARN: Code duplicated, block: B:302:0x0938  */
    /* JADX WARN: Code duplicated, block: B:314:0x095f  */
    /* JADX WARN: Code duplicated, block: B:391:0x0379 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, MalformedURLException, InvocationTargetException {
        k.j jVar;
        s5 s5Var;
        String strW;
        String string;
        String str;
        Boolean boolValueOf;
        boolean zE;
        SharedPreferences sharedPreferences;
        Boolean boolW;
        Bundle bundle;
        int i10;
        Long lValueOf;
        v5 v5Var;
        int i11 = 0;
        switch (this.f10767a) {
            case 0:
                k.l lVar = ((k) this.f10769c).f10803c;
                if (lVar != null && (jVar = lVar.f8632e) != null) {
                    jVar.m(lVar);
                }
                ActionMenuView actionMenuView = ((k) this.f10769c).f10807n;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    f fVar = (f) this.f10768b;
                    if (fVar.b()) {
                        ((k) this.f10769c).f10818y = (f) this.f10768b;
                    } else if (fVar.f8681f != null) {
                        fVar.d(0, 0, false, false);
                        ((k) this.f10769c).f10818y = (f) this.f10768b;
                    }
                }
                ((k) this.f10769c).A = null;
                return;
            case 1:
                y5.k kVar = (y5.k) this.f10768b;
                IBinder iBinder = (IBinder) this.f10769c;
                synchronized (kVar) {
                    if (iBinder == null) {
                        kVar.a(0, "Null service connection");
                    } else {
                        try {
                            kVar.f16972c = new t(iBinder);
                            kVar.f16970a = 2;
                            ((ScheduledExecutorService) kVar.f16975f.f16984c).execute(new y5.i(kVar, 0));
                        } catch (RemoteException e4) {
                            kVar.a(0, e4.getMessage());
                        }
                    }
                }
                return;
            case 2:
                y5.k kVar2 = (y5.k) this.f10768b;
                int i12 = ((y5.m) this.f10769c).f16977a;
                synchronized (kVar2) {
                    y5.m mVar = (y5.m) kVar2.f16974e.get(i12);
                    if (mVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i12);
                        kVar2.f16974e.remove(i12);
                        mVar.a(new y5.n("Timed out waiting for response", null));
                        kVar2.c();
                    }
                    break;
                }
                return;
            case 3:
                ((p5) this.f10768b).zzd();
                if (k6.h.b()) {
                    ((p5) this.f10768b).zzl().u(this);
                    return;
                }
                boolean z10 = ((k6.n) this.f10769c).f10216c != 0;
                ((k6.n) this.f10769c).f10216c = 0L;
                if (z10) {
                    ((k6.n) this.f10769c).c();
                    return;
                }
                return;
            case 4:
                f5 f5Var = (f5) this.f10769c;
                w5 w5Var = (w5) this.f10768b;
                z4 z4Var = f5Var.f10033j;
                f5.d(z4Var);
                z4Var.l();
                k6.r rVar = new k6.r(f5Var);
                rVar.n();
                f5Var.f10045v = rVar;
                long j10 = w5Var.f10461f;
                z3 z3Var = new z3(f5Var);
                z3Var.f10603o = 0L;
                z3Var.f10604p = null;
                z3Var.f10596h = j10;
                z3Var.t();
                f5Var.f10046w = z3Var;
                b4 b4Var = new b4(f5Var);
                b4Var.t();
                f5Var.f10043t = b4Var;
                s6 s6Var = new s6(f5Var);
                s6Var.t();
                f5Var.f10044u = s6Var;
                u7 u7Var = f5Var.f10035l;
                if (u7Var.f10258b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                u7Var.y0();
                ((f5) u7Var.f6226a).G.incrementAndGet();
                u7Var.f10258b = true;
                l4 l4Var = f5Var.f10031h;
                if (l4Var.f10258b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                l4Var.v();
                ((f5) l4Var.f6226a).G.incrementAndGet();
                l4Var.f10258b = true;
                z3 z3Var2 = f5Var.f10046w;
                if (z3Var2.f10269b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                z3Var2.y();
                ((f5) z3Var2.f6226a).G.incrementAndGet();
                z3Var2.f10269b = true;
                d4 d4Var = f5Var.f10032i;
                f5.d(d4Var);
                f4 f4Var = d4Var.f9970l;
                f4Var.c("App measurement initialized, version", 82001L);
                f5.d(d4Var);
                f4Var.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                String strV = z3Var.v();
                if (TextUtils.isEmpty(f5Var.f10025b)) {
                    if (!TextUtils.isEmpty(strV) && u7Var.h().n("debug.firebase.analytics.app").equals(strV)) {
                        f5.d(d4Var);
                        f4Var.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        f5.d(d4Var);
                        f4Var.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strV);
                    }
                }
                f5.d(d4Var);
                d4Var.f9971m.b("Debug-level message logging enabled");
                int i13 = f5Var.E;
                AtomicInteger atomicInteger = f5Var.G;
                if (i13 != atomicInteger.get()) {
                    f5.d(d4Var);
                    d4Var.f9964f.d("Not all components initialized", Integer.valueOf(f5Var.E), Integer.valueOf(atomicInteger.get()));
                }
                f5Var.f10047x = true;
                f5 f5Var2 = (f5) this.f10769c;
                zzdd zzddVar = ((w5) this.f10768b).f10462g;
                z4 z4Var2 = f5Var2.f10033j;
                f5.d(z4Var2);
                z4Var2.l();
                boolean zZza = zzpg.zza();
                u7 u7Var2 = f5Var2.f10035l;
                k6.f fVar2 = f5Var2.f10030g;
                if (zZza && fVar2.v(null, k6.x.D0)) {
                    f5.c(u7Var2);
                    u7Var2.l();
                    if (u7Var2.p0() == 1) {
                        u7Var2.l();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        r2.k.registerReceiver(u7Var2.zza(), new y7((f5) u7Var2.f6226a), intentFilter, 2);
                        u7Var2.zzj().f9971m.b("Registered app receiver");
                    }
                }
                l4 l4Var2 = f5Var2.f10031h;
                f5.c(l4Var2);
                s5 s5VarU = l4Var2.u();
                Boolean boolW2 = fVar2.w("google_analytics_default_allow_ad_storage");
                Boolean boolW3 = fVar2.w("google_analytics_default_allow_analytics_storage");
                long j11 = f5Var2.H;
                y5 y5Var = f5Var2.f10039p;
                if (!(boolW2 == null && boolW3 == null) && l4Var2.p(-10)) {
                    s5Var = new s5(boolW2, boolW3, -10);
                } else {
                    if (!TextUtils.isEmpty(f5Var2.k().w()) && ((i10 = s5VarU.f10356b) == 0 || i10 == 30 || i10 == 10 || i10 == 30 || i10 == 30 || i10 == 40)) {
                        f5.b(y5Var);
                        y5Var.J(new s5(null, null, -10), j11);
                    } else if (TextUtils.isEmpty(f5Var2.k().w()) && zzddVar != null && zzddVar.zzg != null && l4Var2.p(30)) {
                        s5Var = s5.b(30, zzddVar.zzg);
                        Iterator it = s5Var.f10355a.values().iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((Boolean) it.next()) == null);
                    }
                    s5Var = null;
                }
                if (s5Var != null) {
                    f5.b(y5Var);
                    y5Var.J(s5Var, j11);
                    s5VarU = s5Var;
                }
                f5.b(y5Var);
                y5Var.I(s5VarU);
                if (zznp.zza() && fVar2.v(null, k6.x.I0)) {
                    l4Var2.l();
                    int i14 = k6.o.b(l4Var2.s().getString("dma_consent_settings", null)).f10242a;
                    Boolean boolW4 = fVar2.w("google_analytics_default_allow_ad_user_data");
                    if (boolW4 != null && -10 <= i14) {
                        f5.b(y5Var);
                        y5Var.H(new k6.o(boolW4, -10, (Boolean) null, (String) null));
                    } else if (TextUtils.isEmpty(f5Var2.k().w()) || !(i14 == 0 || i14 == 30)) {
                        if (TextUtils.isEmpty(f5Var2.k().w()) && zzddVar != null && (bundle = zzddVar.zzg) != null && 30 <= i14) {
                            k6.o oVarA = k6.o.a(30, bundle);
                            Iterator it2 = oVarA.f10246e.values().iterator();
                            while (it2.hasNext()) {
                                if (((Boolean) it2.next()) != null) {
                                    f5.b(y5Var);
                                    y5Var.H(oVarA);
                                }
                            }
                        }
                        if (TextUtils.isEmpty(f5Var2.k().w()) && zzddVar != null && zzddVar.zzg != null && l4Var2.f10179l.j() == null) {
                            Bundle bundle2 = zzddVar.zzg;
                            Boolean boolG = bundle2 == null ? null : s5.g(bundle2.getString("ad_personalization"));
                            if (boolG != null) {
                                f5.b(y5Var);
                                y5Var.G(zzddVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolG.toString(), false);
                            }
                        }
                    } else {
                        f5.b(y5Var);
                        y5Var.H(new k6.o((Boolean) null, -10, (Boolean) null, (String) null));
                    }
                }
                p4 p4Var = l4Var2.f10172e;
                long jA = p4Var.a();
                d4 d4Var2 = f5Var2.f10032i;
                if (jA == 0) {
                    f5.d(d4Var2);
                    d4Var2.f9972n.c("Persisting first open", Long.valueOf(j11));
                    p4Var.b(j11);
                }
                f5.b(y5Var);
                g5 g5Var = y5Var.f10579n;
                if (g5Var.c() && g5Var.d()) {
                    l4 l4Var3 = g5Var.f10063a.f10031h;
                    f5.c(l4Var3);
                    l4Var3.f10189v.k(null);
                }
                if (f5Var2.f()) {
                    boolean zIsEmpty = TextUtils.isEmpty(f5Var2.k().w());
                    j0.b0 b0Var = l4Var2.f10173f;
                    if (zIsEmpty) {
                        z3 z3VarK = f5Var2.k();
                        z3VarK.s();
                        if (!TextUtils.isEmpty(z3VarK.f10601m)) {
                            f5Var2.n();
                            strW = f5Var2.k().w();
                            l4Var2.l();
                            string = l4Var2.s().getString("gmp_app_id", null);
                            z3 z3VarK2 = f5Var2.k();
                            z3VarK2.s();
                            str = z3VarK2.f10601m;
                            l4Var2.l();
                            if (u7.W(strW, string, str, l4Var2.s().getString("admob_app_id", null))) {
                                f5.d(d4Var2);
                                d4Var2.f9970l.b("Rechecking which service to use due to a GMP App Id change");
                                l4Var2.l();
                                l4Var2.l();
                                if (l4Var2.s().contains("measurement_enabled")) {
                                    boolValueOf = Boolean.valueOf(l4Var2.s().getBoolean("measurement_enabled", true));
                                } else {
                                    boolValueOf = null;
                                }
                                SharedPreferences.Editor editorEdit = l4Var2.s().edit();
                                editorEdit.clear();
                                editorEdit.apply();
                                if (boolValueOf != null) {
                                    l4Var2.l();
                                    SharedPreferences.Editor editorEdit2 = l4Var2.s().edit();
                                    editorEdit2.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                    editorEdit2.apply();
                                }
                                f5.b(f5Var2.f10043t);
                                f5Var2.f10043t.x();
                                f5Var2.f10044u.B();
                                f5Var2.f10044u.A();
                                p4Var.b(j11);
                                b0Var.k(null);
                            }
                            String strW2 = f5Var2.k().w();
                            l4Var2.l();
                            SharedPreferences.Editor editorEdit3 = l4Var2.s().edit();
                            editorEdit3.putString("gmp_app_id", strW2);
                            editorEdit3.apply();
                            z3 z3VarK3 = f5Var2.k();
                            z3VarK3.s();
                            String str2 = z3VarK3.f10601m;
                            l4Var2.l();
                            SharedPreferences.Editor editorEdit4 = l4Var2.s().edit();
                            editorEdit4.putString("admob_app_id", str2);
                            editorEdit4.apply();
                        }
                    } else {
                        f5Var2.n();
                        strW = f5Var2.k().w();
                        l4Var2.l();
                        string = l4Var2.s().getString("gmp_app_id", null);
                        z3 z3VarK4 = f5Var2.k();
                        z3VarK4.s();
                        str = z3VarK4.f10601m;
                        l4Var2.l();
                        if (u7.W(strW, string, str, l4Var2.s().getString("admob_app_id", null))) {
                            f5.d(d4Var2);
                            d4Var2.f9970l.b("Rechecking which service to use due to a GMP App Id change");
                            l4Var2.l();
                            l4Var2.l();
                            if (l4Var2.s().contains("measurement_enabled")) {
                                boolValueOf = Boolean.valueOf(l4Var2.s().getBoolean("measurement_enabled", true));
                            } else {
                                boolValueOf = null;
                            }
                            SharedPreferences.Editor editorEdit5 = l4Var2.s().edit();
                            editorEdit5.clear();
                            editorEdit5.apply();
                            if (boolValueOf != null) {
                                l4Var2.l();
                                SharedPreferences.Editor editorEdit6 = l4Var2.s().edit();
                                editorEdit6.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                editorEdit6.apply();
                            }
                            f5.b(f5Var2.f10043t);
                            f5Var2.f10043t.x();
                            f5Var2.f10044u.B();
                            f5Var2.f10044u.A();
                            p4Var.b(j11);
                            b0Var.k(null);
                        }
                        String strW3 = f5Var2.k().w();
                        l4Var2.l();
                        SharedPreferences.Editor editorEdit7 = l4Var2.s().edit();
                        editorEdit7.putString("gmp_app_id", strW3);
                        editorEdit7.apply();
                        z3 z3VarK5 = f5Var2.k();
                        z3VarK5.s();
                        String str3 = z3VarK5.f10601m;
                        l4Var2.l();
                        SharedPreferences.Editor editorEdit8 = l4Var2.s().edit();
                        editorEdit8.putString("admob_app_id", str3);
                        editorEdit8.apply();
                    }
                    if (!l4Var2.u().f(r5.f10342c)) {
                        b0Var.k(null);
                    }
                    f5.b(y5Var);
                    y5Var.z(b0Var.j());
                    if (zznv.zza() && fVar2.v(null, k6.x.f10494l0)) {
                        f5.c(u7Var2);
                        try {
                            u7Var2.zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        } catch (ClassNotFoundException unused) {
                            j0.b0 b0Var2 = l4Var2.f10188u;
                            if (!TextUtils.isEmpty(b0Var2.j())) {
                                f5.d(d4Var2);
                                d4Var2.f9967i.b("Remote config removed with active feature rollouts");
                                b0Var2.k(null);
                            }
                        }
                    }
                    if (TextUtils.isEmpty(f5Var2.k().w())) {
                        z3 z3VarK6 = f5Var2.k();
                        z3VarK6.s();
                        if (!TextUtils.isEmpty(z3VarK6.f10601m)) {
                            zE = f5Var2.e();
                            sharedPreferences = l4Var2.f10170c;
                            if ((sharedPreferences != null || !sharedPreferences.contains("deferred_analytics_collection")) && ((boolW = fVar2.w("firebase_analytics_collection_deactivated")) == null || !boolW.booleanValue())) {
                                l4Var2.r(!zE);
                            }
                            if (zE) {
                                f5.b(y5Var);
                                y5Var.M();
                            }
                            d7 d7Var = f5Var2.f10034k;
                            f5.b(d7Var);
                            d7Var.f9982e.W();
                            f5Var2.m().w(new AtomicReference());
                            s6 s6VarM = f5Var2.m();
                            Bundle bundleH = l4Var2.f10191x.h();
                            s6VarM.l();
                            s6VarM.s();
                            s6VarM.v(new y2.a((Object) s6VarM, (Object) s6VarM.H(false), (Object) bundleH, 15));
                        }
                    } else {
                        zE = f5Var2.e();
                        sharedPreferences = l4Var2.f10170c;
                        if (sharedPreferences != null) {
                            l4Var2.r(!zE);
                        } else {
                            l4Var2.r(!zE);
                        }
                        if (zE) {
                            f5.b(y5Var);
                            y5Var.M();
                        }
                        d7 d7Var2 = f5Var2.f10034k;
                        f5.b(d7Var2);
                        d7Var2.f9982e.W();
                        f5Var2.m().w(new AtomicReference());
                        s6 s6VarM2 = f5Var2.m();
                        Bundle bundleH2 = l4Var2.f10191x.h();
                        s6VarM2.l();
                        s6VarM2.s();
                        s6VarM2.v(new y2.a((Object) s6VarM2, (Object) s6VarM2.H(false), (Object) bundleH2, 15));
                    }
                    break;
                } else {
                    if (f5Var2.e()) {
                        f5.c(u7Var2);
                        if (!u7Var2.m0("android.permission.INTERNET")) {
                            f5.d(d4Var2);
                            d4Var2.f9964f.b("App is missing INTERNET permission");
                        }
                        if (!u7Var2.m0("android.permission.ACCESS_NETWORK_STATE")) {
                            f5.d(d4Var2);
                            d4Var2.f9964f.b("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        Context context = f5Var2.f10024a;
                        if (!f6.b.a(context).e() && !fVar2.A()) {
                            if (!u7.Q(context)) {
                                f5.d(d4Var2);
                                d4Var2.f9964f.b("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!u7.j0(context)) {
                                f5.d(d4Var2);
                                d4Var2.f9964f.b("AppMeasurementService not registered/enabled");
                            }
                        }
                        f5.d(d4Var2);
                        d4Var2.f9964f.b("Uploading is not possible. App measurement disabled");
                    }
                    u7Var2 = u7Var2;
                }
                if (zzpg.zza() && fVar2.v(null, k6.x.D0)) {
                    f5.c(u7Var2);
                    u7Var2.l();
                    if (u7Var2.p0() == 1) {
                        f5.b(y5Var);
                        new Thread(new e5(y5Var, 0)).start();
                    }
                }
                l4Var2.f10181n.a(true);
                return;
            case 5:
                ((h5) this.f10769c).f10081a.N();
                if (((k6.e) this.f10768b).f9989c.e() == null) {
                    p7 p7Var = ((h5) this.f10769c).f10081a;
                    k6.e eVar = (k6.e) this.f10768b;
                    p7Var.getClass();
                    String str4 = eVar.f9987a;
                    f6.a.x(str4);
                    x7 x7VarB = p7Var.B(str4);
                    if (x7VarB != null) {
                        p7Var.l(eVar, x7VarB);
                        return;
                    }
                    return;
                }
                p7 p7Var2 = ((h5) this.f10769c).f10081a;
                k6.e eVar2 = (k6.e) this.f10768b;
                p7Var2.getClass();
                String str5 = eVar2.f9987a;
                f6.a.x(str5);
                x7 x7VarB2 = p7Var2.B(str5);
                if (x7VarB2 != null) {
                    p7Var2.y(eVar2, x7VarB2);
                    return;
                }
                return;
            case 6:
                y5 y5Var2 = (y5) this.f10768b;
                List<i7> list = (List) this.f10769c;
                y5Var2.l();
                if (Build.VERSION.SDK_INT >= 30) {
                    SparseArray sparseArrayT = y5Var2.j().t();
                    for (i7 i7Var : list) {
                        if (!sparseArrayT.contains(i7Var.f10114c) || ((Long) sparseArrayT.get(i7Var.f10114c)).longValue() < i7Var.f10113b) {
                            y5Var2.Q().add(i7Var);
                        }
                    }
                    y5Var2.P();
                    return;
                }
                return;
            case 7:
                y5 y5Var3 = (y5) this.f10768b;
                String str6 = (String) this.f10769c;
                z3 z3VarM = y5Var3.m();
                String str7 = z3VarM.f10604p;
                boolean z11 = (str7 == null || str7.equals(str6)) ? false : true;
                z3VarM.f10604p = str6;
                if (z11) {
                    y5Var3.m().x();
                    return;
                }
                return;
            case 8:
                d7 d7VarR = ((y5) this.f10769c).r();
                if (zzpr.zza() && d7VarR.h().v(null, k6.x.f10514v0)) {
                    if (d7VarR.j().u().f(r5.f10342c)) {
                        l4 l4VarJ = d7VarR.j();
                        ((e6.c) d7VarR.zzb()).getClass();
                        if (!l4VarJ.q(System.currentTimeMillis()) && d7VarR.j().f10183p.a() != 0) {
                            lValueOf = Long.valueOf(d7VarR.j().f10183p.a());
                        }
                        if (lValueOf == null) {
                            u7 u7Var3 = ((f5) ((y5) this.f10769c).f6226a).f10035l;
                            f5.c(u7Var3);
                            u7Var3.F((zzcv) this.f10768b, lValueOf.longValue());
                            return;
                        } else {
                            try {
                                ((zzcv) this.f10768b).zza(null);
                                return;
                            } catch (RemoteException e10) {
                                d4 d4Var3 = ((f5) ((y5) this.f10769c).f6226a).f10032i;
                                f5.d(d4Var3);
                                d4Var3.f9964f.c("getSessionId failed with exception", e10);
                                return;
                            }
                        }
                    }
                    d7VarR.zzj().f9969k.b("Analytics storage consent denied; will not get session id");
                } else {
                    d7VarR.zzj().f9969k.b("getSessionId has been disabled.");
                }
                lValueOf = null;
                if (lValueOf == null) {
                    ((zzcv) this.f10768b).zza(null);
                    return;
                }
                u7 u7Var4 = ((f5) ((y5) this.f10769c).f6226a).f10035l;
                f5.c(u7Var4);
                u7Var4.F((zzcv) this.f10768b, lValueOf.longValue());
                return;
            case 9:
                ((y5) this.f10769c).y((Boolean) this.f10768b, true);
                return;
            case 10:
                l4 l4VarJ2 = ((y5) this.f10769c).j();
                k6.o oVar = (k6.o) this.f10768b;
                l4VarJ2.l();
                l4VarJ2.l();
                k6.o oVarB = k6.o.b(l4VarJ2.s().getString("dma_consent_settings", null));
                int i15 = oVar.f10242a;
                int i16 = oVarB.f10242a;
                s5 s5Var2 = s5.f10354c;
                if (i15 > i16) {
                    ((y5) this.f10769c).zzj().f9970l.c("Lower precedence consent source ignored, proposed source", Integer.valueOf(((k6.o) this.f10768b).f10242a));
                    return;
                }
                SharedPreferences.Editor editorEdit9 = l4VarJ2.s().edit();
                editorEdit9.putString("dma_consent_settings", oVar.f10243b);
                editorEdit9.apply();
                ((y5) this.f10769c).q().z(false);
                return;
            case 11:
                Object obj = this.f10769c;
                s6 s6Var2 = (s6) obj;
                y3 y3Var = s6Var2.f10358d;
                if (y3Var == null) {
                    s6Var2.zzj().f9964f.b("Failed to send current screen to service");
                    return;
                }
                try {
                    Object obj2 = this.f10768b;
                    if (((q6) obj2) == null) {
                        y3Var.h(null, null, 0L, ((s6) obj).zza().getPackageName());
                    } else {
                        y3Var.h(((q6) obj2).f10324a, ((q6) obj2).f10325b, ((q6) obj2).f10326c, ((s6) obj).zza().getPackageName());
                    }
                    ((s6) this.f10769c).F();
                    return;
                } catch (RemoteException e11) {
                    ((s6) this.f10769c).zzj().f9964f.c("Failed to send current screen to the service", e11);
                    return;
                }
            case 12:
                s6 s6Var3 = ((z6) this.f10769c).f10619c;
                ComponentName componentName = (ComponentName) this.f10768b;
                s6Var3.l();
                if (s6Var3.f10358d != null) {
                    s6Var3.f10358d = null;
                    s6Var3.zzj().f9972n.c("Disconnected from device MeasurementService", componentName);
                    s6Var3.l();
                    s6Var3.A();
                    return;
                }
                return;
            case 13:
                ((p7) this.f10768b).N();
                p7 p7Var3 = (p7) this.f10768b;
                Runnable runnable = (Runnable) this.f10769c;
                p7Var3.zzl().l();
                if (p7Var3.f10301p == null) {
                    p7Var3.f10301p = new ArrayList();
                }
                p7Var3.f10301p.add(runnable);
                ((p7) this.f10768b).P();
                return;
            case Code.UNAVAILABLE /* 14 */:
                y5 y5Var4 = ((AppMeasurementDynamiteService) this.f10769c).f3409a.f10039p;
                f5.b(y5Var4);
                t tVar = (t) this.f10768b;
                y5Var4.l();
                y5Var4.s();
                if (tVar != null && tVar != (v5Var = y5Var4.f10569d)) {
                    f6.a.z("EventInterceptor already set.", v5Var == null);
                }
                y5Var4.f10569d = tVar;
                return;
            case 15:
                p7 p7Var4 = (p7) this.f10769c;
                p7Var4.zzl().l();
                p7Var4.f10296k = new r4(p7Var4);
                k6.k kVar3 = new k6.k(p7Var4);
                kVar3.q();
                p7Var4.f10288c = kVar3;
                k6.f fVarH = p7Var4.H();
                t4 t4Var = p7Var4.f10286a;
                f6.a.x(t4Var);
                fVarH.f10014c = t4Var;
                c7 c7Var = new c7(p7Var4);
                c7Var.q();
                p7Var4.f10294i = c7Var;
                z7 z7Var = new z7(p7Var4);
                z7Var.q();
                p7Var4.f10291f = z7Var;
                o6 o6Var = new o6(p7Var4);
                o6Var.q();
                p7Var4.f10293h = o6Var;
                j7 j7Var = new j7(p7Var4);
                j7Var.q();
                p7Var4.f10290e = j7Var;
                p7Var4.f10289d = new k4(p7Var4);
                if (p7Var4.f10303r != p7Var4.f10304s) {
                    p7Var4.zzj().f9964f.d("Not all upload components initialized", Integer.valueOf(p7Var4.f10303r), Integer.valueOf(p7Var4.f10304s));
                }
                p7Var4.f10298m = true;
                p7 p7Var5 = (p7) this.f10769c;
                p7Var5.zzl().l();
                k6.k kVar4 = p7Var5.f10288c;
                p7.o(kVar4);
                kVar4.h0();
                if (p7Var5.f10294i.f9944g.a() == 0) {
                    p4 p4Var2 = p7Var5.f10294i.f9944g;
                    ((e6.c) p7Var5.zzb()).getClass();
                    p4Var2.b(System.currentTimeMillis());
                }
                p7Var5.v();
                return;
            case Code.UNAUTHENTICATED /* 16 */:
                try {
                    f6.a.M((Future) this.f10768b);
                    t tVar2 = (t) this.f10769c;
                    ((y5) tVar2.f10929c).l();
                    y5 y5Var5 = (y5) tVar2.f10929c;
                    y5Var5.f10574i = false;
                    y5Var5.P();
                    ((y5) tVar2.f10929c).zzj().f9971m.c("registerTriggerAsync ran. uri", ((i7) tVar2.f10928b).f10112a);
                    return;
                } catch (Error e12) {
                    e = e12;
                    ((t) this.f10769c).f(e);
                    return;
                } catch (RuntimeException e13) {
                    e = e13;
                    ((t) this.f10769c).f(e);
                    return;
                } catch (ExecutionException e14) {
                    ((t) this.f10769c).f(e14.getCause());
                    return;
                }
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                ((f8.b) this.f10769c).f6383c.unregisterNetworkCallback((r4.h) this.f10768b);
                return;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((f8.b) this.f10769c).f6382b.unregisterReceiver((f8.a) this.f10768b);
                return;
            case 19:
                g8.m mVar2 = (g8.m) this.f10768b;
                long j12 = mVar2.f6961a;
                long jMax = Math.max(2 * j12, j12);
                g8.n nVar = mVar2.f6962b;
                if (nVar.f6969b.compareAndSet(j12, jMax)) {
                    g8.n.f6967c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{nVar.f6968a, Long.valueOf(jMax)});
                    return;
                }
                return;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                ((m9.k) this.f10769c).d((m9.z) this.f10768b);
                return;
            case 21:
                ((m9.k) this.f10768b).d((n9.d) this.f10769c);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f10768b).run();
            } catch (Throwable th) {
                h6.g.n0(u8.k.f15438a, th);
            }
            r9.i iVar = (r9.i) this.f10769c;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r9.i.f13706o;
            Runnable runnableF0 = iVar.f0();
            if (runnableF0 == null) {
                return;
            }
            this.f10768b = runnableF0;
            i11++;
            if (i11 >= 16 && ((r9.i) this.f10769c).f13707c.d0()) {
                r9.i iVar2 = (r9.i) this.f10769c;
                iVar2.f13707c.c0(iVar2, this);
                return;
            }
        }
    }

    public final String toString() {
        switch (this.f10767a) {
            case Code.UNAUTHENTICATED /* 16 */:
                q6.g gVarJ0 = f6.a.j0(this);
                t tVar = (t) this.f10769c;
                z2 z2Var = new z2();
                gVarJ0.f13207c.f10985d = z2Var;
                gVarJ0.f13207c = z2Var;
                z2Var.f10984c = tVar;
                return gVarJ0.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f10767a = i10;
        this.f10768b = obj;
        this.f10769c = obj2;
    }

    public h(p7 p7Var, Runnable runnable) {
        this.f10767a = 13;
        this.f10768b = p7Var;
        this.f10769c = runnable;
    }
}
