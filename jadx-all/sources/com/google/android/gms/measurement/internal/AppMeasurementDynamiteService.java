package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzct;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import f6.a;
import g6.b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k.e;
import k6.b6;
import k6.c6;
import k6.d4;
import k6.d6;
import k6.f5;
import k6.i6;
import k6.m4;
import k6.n5;
import k6.p6;
import k6.q6;
import k6.u5;
import k6.u7;
import k6.v;
import k6.v5;
import k6.y5;
import k6.z4;
import k6.z5;
import l.h;
import l.t;
import q.f;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends zzct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f5 f3409a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3410b = new f(0);

    public final void a() {
        if (this.f3409a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void b(String str, zzcv zzcvVar) {
        a();
        u7 u7Var = this.f3409a.f10035l;
        f5.c(u7Var);
        u7Var.K(str, zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void beginAdUnitExposure(String str, long j10) {
        a();
        this.f3409a.i().u(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.B(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearMeasurementEnabled(long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.s();
        y5Var.zzl().u(new h(9, y5Var, (Object) null));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void endAdUnitExposure(String str, long j10) {
        a();
        this.f3409a.i().x(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void generateEventId(zzcv zzcvVar) {
        a();
        u7 u7Var = this.f3409a.f10035l;
        f5.c(u7Var);
        long jT0 = u7Var.t0();
        a();
        u7 u7Var2 = this.f3409a.f10035l;
        f5.c(u7Var2);
        u7Var2.F(zzcvVar, jT0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getAppInstanceId(zzcv zzcvVar) {
        a();
        z4 z4Var = this.f3409a.f10033j;
        f5.d(z4Var);
        z4Var.u(new n5(this, zzcvVar, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCachedAppInstanceId(zzcv zzcvVar) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        b((String) y5Var.f10572g.get(), zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getConditionalUserProperties(String str, String str2, zzcv zzcvVar) {
        a();
        z4 z4Var = this.f3409a.f10033j;
        f5.d(z4Var);
        z4Var.u(new e(this, zzcvVar, str, str2, 3));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenClass(zzcv zzcvVar) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        p6 p6Var = ((f5) y5Var.f6226a).f10038o;
        f5.b(p6Var);
        q6 q6Var = p6Var.f10276c;
        b(q6Var != null ? q6Var.f10325b : null, zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenName(zzcv zzcvVar) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        p6 p6Var = ((f5) y5Var.f6226a).f10038o;
        f5.b(p6Var);
        q6 q6Var = p6Var.f10276c;
        b(q6Var != null ? q6Var.f10324a : null, zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getGmpAppId(zzcv zzcvVar) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        Object obj = y5Var.f6226a;
        f5 f5Var = (f5) obj;
        String string = f5Var.f10025b;
        if (string == null) {
            string = null;
            try {
                Context contextZza = y5Var.zza();
                String strB = ((f5) obj).f10042s;
                a.x(contextZza);
                Resources resources = contextZza.getResources();
                if (TextUtils.isEmpty(strB)) {
                    strB = s.b(contextZza);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", strB);
                if (identifier != 0) {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e4) {
                d4 d4Var = f5Var.f10032i;
                f5.d(d4Var);
                d4Var.f9964f.c("getGoogleAppId failed with exception", e4);
            }
        }
        b(string, zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getMaxUserProperties(String str, zzcv zzcvVar) {
        a();
        f5.b(this.f3409a.f10039p);
        a.u(str);
        a();
        u7 u7Var = this.f3409a.f10035l;
        f5.c(u7Var);
        u7Var.E(zzcvVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getSessionId(zzcv zzcvVar) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.zzl().u(new h(8, y5Var, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getTestFlag(zzcv zzcvVar, int i10) {
        a();
        int i11 = 2;
        if (i10 == 0) {
            u7 u7Var = this.f3409a.f10035l;
            f5.c(u7Var);
            y5 y5Var = this.f3409a.f10039p;
            f5.b(y5Var);
            AtomicReference atomicReference = new AtomicReference();
            u7Var.K((String) y5Var.zzl().p(atomicReference, 15000L, "String test flag value", new z5(y5Var, atomicReference, i11)), zzcvVar);
            return;
        }
        int i12 = 4;
        int i13 = 1;
        if (i10 == 1) {
            u7 u7Var2 = this.f3409a.f10035l;
            f5.c(u7Var2);
            y5 y5Var2 = this.f3409a.f10039p;
            f5.b(y5Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            u7Var2.F(zzcvVar, ((Long) y5Var2.zzl().p(atomicReference2, 15000L, "long test flag value", new z5(y5Var2, atomicReference2, i12))).longValue());
            return;
        }
        if (i10 == 2) {
            u7 u7Var3 = this.f3409a.f10035l;
            f5.c(u7Var3);
            y5 y5Var3 = this.f3409a.f10039p;
            f5.b(y5Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) y5Var3.zzl().p(atomicReference3, 15000L, "double test flag value", new z5(y5Var3, atomicReference3, 5))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                zzcvVar.zza(bundle);
                return;
            } catch (RemoteException e4) {
                d4 d4Var = ((f5) u7Var3.f6226a).f10032i;
                f5.d(d4Var);
                d4Var.f9967i.c("Error returning double value to wrapper", e4);
                return;
            }
        }
        int i14 = 3;
        if (i10 == 3) {
            u7 u7Var4 = this.f3409a.f10035l;
            f5.c(u7Var4);
            y5 y5Var4 = this.f3409a.f10039p;
            f5.b(y5Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            u7Var4.E(zzcvVar, ((Integer) y5Var4.zzl().p(atomicReference4, 15000L, "int test flag value", new z5(y5Var4, atomicReference4, i14))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        u7 u7Var5 = this.f3409a.f10035l;
        f5.c(u7Var5);
        y5 y5Var5 = this.f3409a.f10039p;
        f5.b(y5Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        u7Var5.I(zzcvVar, ((Boolean) y5Var5.zzl().p(atomicReference5, 15000L, "boolean test flag value", new z5(y5Var5, atomicReference5, i13))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getUserProperties(String str, String str2, boolean z10, zzcv zzcvVar) {
        a();
        z4 z4Var = this.f3409a.f10033j;
        f5.d(z4Var);
        z4Var.u(new androidx.fragment.app.h(this, zzcvVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initForTests(Map map) {
        a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initialize(g6.a aVar, zzdd zzddVar, long j10) {
        f5 f5Var = this.f3409a;
        if (f5Var == null) {
            Context context = (Context) b.b(aVar);
            a.x(context);
            this.f3409a = f5.a(context, zzddVar, Long.valueOf(j10));
        } else {
            d4 d4Var = f5Var.f10032i;
            f5.d(d4Var);
            d4Var.f9967i.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void isDataCollectionEnabled(zzcv zzcvVar) {
        a();
        z4 z4Var = this.f3409a.f10033j;
        f5.d(z4Var);
        z4Var.u(new n5(this, zzcvVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.D(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j10) {
        a();
        a.u(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        v vVar = new v(str2, new k6.s(bundle), "app", j10);
        z4 z4Var = this.f3409a.f10033j;
        f5.d(z4Var);
        z4Var.u(new e(this, zzcvVar, vVar, str, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logHealthData(int i10, String str, g6.a aVar, g6.a aVar2, g6.a aVar3) {
        a();
        Object objB = aVar == null ? null : b.b(aVar);
        Object objB2 = aVar2 == null ? null : b.b(aVar2);
        Object objB3 = aVar3 != null ? b.b(aVar3) : null;
        d4 d4Var = this.f3409a.f10032i;
        f5.d(d4Var);
        d4Var.s(i10, true, false, str, objB, objB2, objB3);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityCreated(g6.a aVar, Bundle bundle, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        i6 i6Var = y5Var.f10568c;
        if (i6Var != null) {
            y5 y5Var2 = this.f3409a.f10039p;
            f5.b(y5Var2);
            y5Var2.N();
            i6Var.onActivityCreated((Activity) b.b(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityDestroyed(g6.a aVar, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        i6 i6Var = y5Var.f10568c;
        if (i6Var != null) {
            y5 y5Var2 = this.f3409a.f10039p;
            f5.b(y5Var2);
            y5Var2.N();
            i6Var.onActivityDestroyed((Activity) b.b(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityPaused(g6.a aVar, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        i6 i6Var = y5Var.f10568c;
        if (i6Var != null) {
            y5 y5Var2 = this.f3409a.f10039p;
            f5.b(y5Var2);
            y5Var2.N();
            i6Var.onActivityPaused((Activity) b.b(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityResumed(g6.a aVar, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        i6 i6Var = y5Var.f10568c;
        if (i6Var != null) {
            y5 y5Var2 = this.f3409a.f10039p;
            f5.b(y5Var2);
            y5Var2.N();
            i6Var.onActivityResumed((Activity) b.b(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivitySaveInstanceState(g6.a aVar, zzcv zzcvVar, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        i6 i6Var = y5Var.f10568c;
        Bundle bundle = new Bundle();
        if (i6Var != null) {
            y5 y5Var2 = this.f3409a.f10039p;
            f5.b(y5Var2);
            y5Var2.N();
            i6Var.onActivitySaveInstanceState((Activity) b.b(aVar), bundle);
        }
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e4) {
            d4 d4Var = this.f3409a.f10032i;
            f5.d(d4Var);
            d4Var.f9967i.c("Error returning bundle value to wrapper", e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStarted(g6.a aVar, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        if (y5Var.f10568c != null) {
            y5 y5Var2 = this.f3409a.f10039p;
            f5.b(y5Var2);
            y5Var2.N();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStopped(g6.a aVar, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        if (y5Var.f10568c != null) {
            y5 y5Var2 = this.f3409a.f10039p;
            f5.b(y5Var2);
            y5Var2.N();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void performAction(Bundle bundle, zzcv zzcvVar, long j10) {
        a();
        zzcvVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void registerOnMeasurementEventListener(zzda zzdaVar) {
        Object aVar;
        a();
        synchronized (this.f3410b) {
            try {
                aVar = (u5) this.f3410b.get(Integer.valueOf(zzdaVar.zza()));
                if (aVar == null) {
                    aVar = new k6.a(this, zzdaVar);
                    this.f3410b.put(Integer.valueOf(zzdaVar.zza()), aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.s();
        if (y5Var.f10570e.add(aVar)) {
            return;
        }
        y5Var.zzj().f9967i.b("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void resetAnalyticsData(long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.z(null);
        y5Var.zzl().u(new d6(y5Var, j10, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        a();
        if (bundle == null) {
            d4 d4Var = this.f3409a.f10032i;
            f5.d(d4Var);
            d4Var.f9964f.b("Conditional user property must not be null");
        } else {
            y5 y5Var = this.f3409a.f10039p;
            f5.b(y5Var);
            y5Var.x(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsent(Bundle bundle, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.zzl().v(new c6(y5Var, bundle, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsentThirdParty(Bundle bundle, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.w(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setCurrentScreen(g6.a aVar, String str, String str2, long j10) {
        a();
        p6 p6Var = this.f3409a.f10038o;
        f5.b(p6Var);
        Activity activity = (Activity) b.b(aVar);
        if (!p6Var.h().z()) {
            p6Var.zzj().f9969k.b("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        q6 q6Var = p6Var.f10276c;
        if (q6Var == null) {
            p6Var.zzj().f9969k.b("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (p6Var.f10279f.get(activity) == null) {
            p6Var.zzj().f9969k.b("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = p6Var.v(activity.getClass());
        }
        boolean zQ0 = a.q0(q6Var.f10325b, str2);
        boolean zQ1 = a.q0(q6Var.f10324a, str);
        if (zQ0 && zQ1) {
            p6Var.zzj().f9969k.b("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > p6Var.h().p(null))) {
            p6Var.zzj().f9969k.c("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > p6Var.h().p(null))) {
            p6Var.zzj().f9969k.c("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        p6Var.zzj().f9972n.d("Setting current screen to name, class", str == null ? "null" : str, str2);
        q6 q6Var2 = new q6(str, str2, p6Var.k().t0());
        p6Var.f10279f.put(activity, q6Var2);
        p6Var.y(activity, q6Var2, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDataCollectionEnabled(boolean z10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.s();
        y5Var.zzl().u(new m4(1, y5Var, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDefaultEventParameters(Bundle bundle) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.zzl().u(new b6(y5Var, bundle == null ? null : new Bundle(bundle), 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setEventInterceptor(zzda zzdaVar) {
        a();
        t tVar = new t(this, zzdaVar, 25);
        z4 z4Var = this.f3409a.f10033j;
        f5.d(z4Var);
        if (!z4Var.w()) {
            z4 z4Var2 = this.f3409a.f10033j;
            f5.d(z4Var2);
            z4Var2.u(new h(14, this, tVar));
            return;
        }
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.l();
        y5Var.s();
        v5 v5Var = y5Var.f10569d;
        if (tVar != v5Var) {
            a.z("EventInterceptor already set.", v5Var == null);
        }
        y5Var.f10569d = tVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setInstanceIdProvider(zzdb zzdbVar) {
        a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMeasurementEnabled(boolean z10, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        Boolean boolValueOf = Boolean.valueOf(z10);
        y5Var.s();
        y5Var.zzl().u(new h(9, y5Var, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMinimumSessionDuration(long j10) {
        a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setSessionTimeoutDuration(long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.zzl().u(new d6(y5Var, j10, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserId(String str, long j10) {
        a();
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        if (str == null || !TextUtils.isEmpty(str)) {
            y5Var.zzl().u(new h(y5Var, str, 7));
            y5Var.F(null, "_id", str, true, j10);
        } else {
            d4 d4Var = ((f5) y5Var.f6226a).f10032i;
            f5.d(d4Var);
            d4Var.f9967i.b("User ID must be non-empty or null");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserProperty(String str, String str2, g6.a aVar, boolean z10, long j10) {
        a();
        Object objB = b.b(aVar);
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.F(str, str2, objB, z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        Object aVar;
        a();
        synchronized (this.f3410b) {
            aVar = (u5) this.f3410b.remove(Integer.valueOf(zzdaVar.zza()));
        }
        if (aVar == null) {
            aVar = new k6.a(this, zzdaVar);
        }
        y5 y5Var = this.f3409a.f10039p;
        f5.b(y5Var);
        y5Var.s();
        if (y5Var.f10570e.remove(aVar)) {
            return;
        }
        y5Var.zzj().f9967i.b("OnEventListener had not been registered");
    }
}
