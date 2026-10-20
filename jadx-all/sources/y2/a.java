package y2;

import android.app.job.JobParameters;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.m;
import androidx.fragment.app.n;
import androidx.fragment.app.s1;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import e8.c2;
import e8.d2;
import e8.g2;
import e8.h2;
import e8.l1;
import e8.n0;
import e8.x;
import e8.x1;
import g8.c3;
import g8.k4;
import g8.l;
import g8.l3;
import g8.p0;
import g8.u0;
import g8.v0;
import ja.a0;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k6.d4;
import k6.e7;
import k6.f4;
import k6.f5;
import k6.h5;
import k6.k;
import k6.p7;
import k6.q4;
import k6.r4;
import k6.r5;
import k6.r7;
import k6.s;
import k6.s6;
import k6.t4;
import k6.t5;
import k6.t7;
import k6.u;
import k6.u7;
import k6.v;
import k6.v6;
import k6.x7;
import k6.y3;
import k6.z4;
import n8.o;
import n8.p;
import o7.d0;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16850d;

    public /* synthetic */ a(Object obj, Object obj2, Parcelable parcelable, int i10) {
        this.f16847a = i10;
        this.f16848b = obj;
        this.f16849c = obj2;
        this.f16850d = parcelable;
    }

    private void a() {
        k.f fVar = (k.f) this.f16848b;
        Typeface typeface = (Typeface) this.f16849c;
        t2.b bVar = (t2.b) fVar.f8599b;
        if (bVar != null) {
            bVar.e(typeface);
        }
    }

    private void b() {
        Object objCall;
        try {
            objCall = ((Callable) this.f16848b).call();
        } catch (Exception unused) {
            objCall = null;
        }
        ((Handler) this.f16850d).post(new a(this, (a3.a) this.f16849c, objCall, 1));
    }

    private void c() {
        List list = (List) this.f16848b;
        s1 s1Var = (s1) this.f16849c;
        if (list.contains(s1Var)) {
            list.remove(s1Var);
            ((n) this.f16850d).getClass();
            n.j(s1Var);
        }
    }

    private void d() {
        ((m) this.f16848b).a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Transition for operation " + ((s1) this.f16849c) + "has completed");
        }
    }

    private final void e() {
        Object obj = this.f16850d;
        w0 w0Var = (w0) obj;
        int i10 = w0Var.f3263b;
        Object obj2 = this.f16848b;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
            Bundle bundle = w0Var.f3264c;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.f16849c) : null);
        }
        if (((w0) obj).f3263b >= 2) {
            ((LifecycleCallback) obj2).onStart();
        }
        if (((w0) obj).f3263b >= 3) {
            ((LifecycleCallback) obj2).onResume();
        }
        if (((w0) obj).f3263b >= 4) {
            ((LifecycleCallback) obj2).onStop();
        }
        if (((w0) obj).f3263b >= 5) {
            ((LifecycleCallback) obj2).onDestroy();
        }
    }

    private final void f() {
        Object obj = this.f16850d;
        x0 x0Var = (x0) obj;
        int i10 = x0Var.f3273b;
        Object obj2 = this.f16848b;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
            Bundle bundle = x0Var.f3274c;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.f16849c) : null);
        }
        if (((x0) obj).f3273b >= 2) {
            ((LifecycleCallback) obj2).onStart();
        }
        if (((x0) obj).f3273b >= 3) {
            ((LifecycleCallback) obj2).onResume();
        }
        if (((x0) obj).f3273b >= 4) {
            ((LifecycleCallback) obj2).onStop();
        }
        if (((x0) obj).f3273b >= 5) {
            ((LifecycleCallback) obj2).onDestroy();
        }
    }

    private final void g() {
        q4 q4Var = (q4) this.f16850d;
        r4 r4Var = q4Var.f10319b;
        String str = q4Var.f10318a;
        zzby zzbyVar = (zzby) this.f16848b;
        f5 f5Var = r4Var.f10340a;
        z4 z4Var = f5Var.f10033j;
        f5.d(z4Var);
        z4Var.l();
        d4 d4Var = f5Var.f10032i;
        if (zzbyVar != null) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            try {
                if (zzbyVar.zza(bundle) == null) {
                    f5.d(d4Var);
                    d4Var.f9964f.b("Install Referrer Service returned a null response");
                }
            } catch (Exception e4) {
                f5.d(d4Var);
                d4Var.f9964f.c("Exception occurred while retrieving the Install Referrer", e4.getMessage());
            }
        } else {
            f5.d(d4Var);
            d4Var.f9967i.b("Attempting to use Install Referrer Service while it is not initialized");
        }
        z4 z4Var2 = r4Var.f10340a.f10033j;
        f5.d(z4Var2);
        z4Var2.l();
        throw new IllegalStateException("Unexpected call on client side");
    }

    private final void h() {
        s sVar;
        h5 h5Var = (h5) this.f16848b;
        String str = (String) this.f16849c;
        Bundle bundle = (Bundle) this.f16850d;
        k kVar = h5Var.f10081a.f10288c;
        p7.o(kVar);
        kVar.l();
        kVar.p();
        f5 f5Var = (f5) kVar.f6226a;
        f6.a.u(str);
        f6.a.u("dep");
        TextUtils.isEmpty("");
        if (bundle == null || bundle.isEmpty()) {
            sVar = new s(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    d4 d4Var = f5Var.f10032i;
                    f5.d(d4Var);
                    d4Var.f9964f.b("Param name can't be null");
                    it.remove();
                } else {
                    u7 u7Var = f5Var.f10035l;
                    f5.c(u7Var);
                    Object objD0 = u7Var.d0(bundle2.get(next), next);
                    if (objD0 == null) {
                        d4 d4Var2 = f5Var.f10032i;
                        f5.d(d4Var2);
                        d4Var2.f9967i.c("Param value can't be null", f5Var.f10036m.f(next));
                        it.remove();
                    } else {
                        u7 u7Var2 = f5Var.f10035l;
                        f5.c(u7Var2);
                        u7Var2.D(bundle2, next, objD0);
                    }
                }
            }
            sVar = new s(bundle2);
        }
        r7 r7VarM = kVar.m();
        zzfi.zze.zza zzaVarZza = zzfi.zze.zze().zza(0L);
        u uVar = new u(sVar);
        while (uVar.hasNext()) {
            String str2 = (String) uVar.next();
            zzfi.zzg.zza zzaVarZza2 = zzfi.zzg.zze().zza(str2);
            Object obj = sVar.f10349a.get(str2);
            f6.a.x(obj);
            r7VarM.I(zzaVarZza2, obj);
            zzaVarZza.zza(zzaVarZza2);
        }
        byte[] bArrZzbv = ((zzfi.zze) ((zzix) zzaVarZza.zzab())).zzbv();
        d4 d4VarZzj = kVar.zzj();
        d4VarZzj.f9972n.d("Saving default event parameters, appId, data size", kVar.i().b(str), Integer.valueOf(bArrZzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzbv);
        try {
            if (kVar.s().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                kVar.zzj().f9964f.c("Failed to insert default event parameters (got -1). appId", d4.r(str));
            }
        } catch (SQLiteException e4) {
            d4 d4VarZzj2 = kVar.zzj();
            d4VarZzj2.f9964f.d("Error storing default event parameters. appId", d4.r(str), e4);
        }
    }

    private final void i() {
        Object obj = this.f16850d;
        ((h5) obj).f10081a.N();
        Object obj2 = this.f16848b;
        Object objE = ((k6.e) obj2).f9989c.e();
        Object obj3 = this.f16849c;
        if (objE == null) {
            ((h5) obj).f10081a.l((k6.e) obj2, (x7) obj3);
        } else {
            ((h5) obj).f10081a.y((k6.e) obj2, (x7) obj3);
        }
    }

    private final void j() {
        Object obj = this.f16850d;
        ((h5) obj).f10081a.N();
        ((h5) obj).f10081a.m((v) this.f16848b, (String) this.f16849c);
    }

    private final void k() {
        Object obj = this.f16848b;
        Object obj2 = this.f16849c;
        Object obj3 = this.f16850d;
        try {
            try {
                if (!((s6) obj3).j().u().f(r5.f10342c)) {
                    ((s6) obj3).zzj().f9969k.b("Analytics storage consent denied; will not get app instance id");
                    ((s6) obj3).o().z(null);
                    ((s6) obj3).j().f10173f.k(null);
                    ((s6) obj3).k().K(null, (zzcv) obj2);
                    return;
                }
                y3 y3Var = ((s6) obj3).f10358d;
                if (y3Var == null) {
                    ((s6) obj3).zzj().f9964f.b("Failed to get app instance id");
                    ((s6) obj3).k().K(null, (zzcv) obj2);
                    return;
                }
                f6.a.x((x7) obj);
                String strQ = y3Var.q((x7) obj);
                if (strQ != null) {
                    ((s6) obj3).o().z(strQ);
                    ((s6) obj3).j().f10173f.k(strQ);
                }
                ((s6) obj3).F();
                ((s6) obj3).k().K(strQ, (zzcv) obj2);
            } catch (RemoteException e4) {
                ((s6) obj3).zzj().f9964f.c("Failed to get app instance id", e4);
                ((s6) obj3).k().K(null, (zzcv) obj2);
            }
        } catch (Throwable th) {
            ((s6) obj3).k().K(null, (zzcv) obj2);
            throw th;
        }
    }

    private final void l() {
        synchronized (((AtomicReference) this.f16848b)) {
            try {
                try {
                    if (!((s6) this.f16850d).j().u().f(r5.f10342c)) {
                        ((s6) this.f16850d).zzj().f9969k.b("Analytics storage consent denied; will not get app instance id");
                        ((s6) this.f16850d).o().z(null);
                        ((s6) this.f16850d).j().f10173f.k(null);
                        ((AtomicReference) this.f16848b).set(null);
                        ((AtomicReference) this.f16848b).notify();
                        return;
                    }
                    Object obj = this.f16850d;
                    y3 y3Var = ((s6) obj).f10358d;
                    if (y3Var == null) {
                        ((s6) obj).zzj().f9964f.b("Failed to get app instance id");
                        ((AtomicReference) this.f16848b).notify();
                        return;
                    }
                    f6.a.x((x7) this.f16849c);
                    ((AtomicReference) this.f16848b).set(y3Var.q((x7) this.f16849c));
                    String str = (String) ((AtomicReference) this.f16848b).get();
                    if (str != null) {
                        ((s6) this.f16850d).o().z(str);
                        ((s6) this.f16850d).j().f10173f.k(str);
                    }
                    ((s6) this.f16850d).F();
                    ((AtomicReference) this.f16848b).notify();
                } catch (RemoteException e4) {
                    ((s6) this.f16850d).zzj().f9964f.c("Failed to get app instance id", e4);
                    ((AtomicReference) this.f16848b).notify();
                }
            } catch (Throwable th) {
                ((AtomicReference) this.f16848b).notify();
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfc.zzd zzdVar;
        s sVar;
        h8.n nVar;
        v6 v6Var;
        Socket socketH;
        char c10;
        int i10;
        r6.m mVar;
        r6.m mVar2;
        SSLSession session = null;
        switch (this.f16847a) {
            case 0:
                a();
                return;
            case 1:
                ((a3.a) this.f16848b).accept(this.f16849c);
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            case 4:
                d();
                return;
            case 5:
                e();
                return;
            case 6:
                f();
                return;
            case 7:
                g();
                throw null;
            case 8:
                h();
                return;
            case 9:
                i();
                return;
            case 10:
                j();
                return;
            case 11:
                h5 h5Var = (h5) this.f16850d;
                v vVar = (v) this.f16848b;
                h5Var.getClass();
                if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(vVar.f10431a) && (sVar = vVar.f10432b) != null) {
                    Bundle bundle = sVar.f10349a;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            h5Var.f10081a.zzj().f9970l.c("Event has been filtered ", vVar.toString());
                            vVar = new v("_cmpx", vVar.f10432b, vVar.f10433c, vVar.f10434d);
                        }
                    }
                }
                String str = vVar.f10431a;
                x7 x7Var = (x7) this.f16849c;
                p7 p7Var = h5Var.f10081a;
                t4 t4Var = p7Var.f10286a;
                r7 r7Var = p7Var.f10292g;
                p7.o(t4Var);
                String str2 = x7Var.f10543a;
                if (TextUtils.isEmpty(str2) || (zzdVar = (zzfc.zzd) t4Var.f10384h.get(str2)) == null || zzdVar.zza() == 0) {
                    h5Var.t(vVar, x7Var);
                    return;
                }
                f4 f4Var = p7Var.zzj().f9972n;
                String str3 = x7Var.f10543a;
                f4Var.c("EES config found for", str3);
                t4 t4Var2 = p7Var.f10286a;
                p7.o(t4Var2);
                zzb zzbVar = TextUtils.isEmpty(str3) ? null : (zzb) t4Var2.f10386j.get(str3);
                if (zzbVar == null) {
                    p7Var.zzj().f9972n.c("EES not loaded for", str3);
                    h5Var.t(vVar, x7Var);
                    return;
                }
                try {
                    p7.o(r7Var);
                    HashMap mapB = r7.B(vVar.f10432b.g(), true);
                    String strA1 = y3.e.a1(t5.f10393c, t5.f10391a, str);
                    if (strA1 == null) {
                        strA1 = str;
                    }
                    if (zzbVar.zza(new zzad(strA1, vVar.f10434d, mapB))) {
                        if (zzbVar.zzd()) {
                            p7Var.zzj().f9972n.c("EES edited event", str);
                            p7.o(r7Var);
                            h5Var.t(r7.D(zzbVar.zza().zzb()), x7Var);
                        } else {
                            h5Var.t(vVar, x7Var);
                        }
                        if (zzbVar.zzc()) {
                            for (zzad zzadVar : zzbVar.zza().zzc()) {
                                p7Var.zzj().f9972n.c("EES logging created event", zzadVar.zzb());
                                p7.o(r7Var);
                                h5Var.t(r7.D(zzadVar), x7Var);
                            }
                            return;
                        }
                        return;
                    }
                } catch (zzc unused) {
                    p7Var.zzj().f9964f.d("EES error. appId, eventName", x7Var.f10544b, str);
                }
                p7Var.zzj().f9972n.c("EES was not applied to event", str);
                h5Var.t(vVar, x7Var);
                return;
            case 12:
                h5 h5Var2 = (h5) this.f16850d;
                h5Var2.f10081a.N();
                t7 t7Var = (t7) this.f16848b;
                Object objE = t7Var.e();
                Object obj = this.f16849c;
                if (objE == null) {
                    h5Var2.f10081a.k(t7Var.f10404b, (x7) obj);
                    return;
                } else {
                    h5Var2.f10081a.p(t7Var, (x7) obj);
                    return;
                }
            case 13:
                k();
                return;
            case Code.UNAVAILABLE /* 14 */:
                l();
                return;
            case 15:
                Object obj2 = this.f16848b;
                s6 s6Var = (s6) this.f16850d;
                y3 y3Var = s6Var.f10358d;
                if (y3Var == null) {
                    s6Var.zzj().f9964f.b("Failed to send default event parameters to service");
                    return;
                }
                try {
                    f6.a.x((x7) obj2);
                    y3Var.mo6534c((Bundle) this.f16849c, (x7) obj2);
                    return;
                } catch (RemoteException e4) {
                    s6Var.zzj().f9964f.c("Failed to send default event parameters to service", e4);
                    return;
                }
            case Code.UNAUTHENTICATED /* 16 */:
                j.a aVar = (j.a) this.f16848b;
                d4 d4Var = (d4) this.f16849c;
                JobParameters jobParameters = (JobParameters) this.f16850d;
                aVar.getClass();
                d4Var.f9972n.b("AppMeasurementJobService processed last upload request.");
                ((e7) aVar.f8194a).b(jobParameters);
                return;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                ((h2) this.f16850d).execute((g2) this.f16848b);
                return;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((v0) this.f16850d).f7166f.start((e8.j) this.f16848b, (l1) this.f16849c);
                return;
            case 19:
                ((u0) this.f16850d).f7148a.onClose((c2) this.f16848b, (l1) this.f16849c);
                return;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                l3 l3Var = (l3) this.f16850d;
                z5.k kVar = l3Var.f6944r;
                Runnable runnable = (Runnable) this.f16848b;
                Executor executor = l3Var.f6934h;
                x xVar = (x) this.f16849c;
                kVar.getClass();
                y3.e.J(runnable, "callback");
                y3.e.J(executor, "executor");
                y3.e.J(xVar, "source");
                p0 p0Var = new p0(runnable, executor);
                if (((x) kVar.f17261b) != xVar) {
                    executor.execute(runnable);
                    return;
                } else {
                    ((ArrayList) kVar.f17260a).add(p0Var);
                    return;
                }
            case 21:
                c3 c3Var = (c3) this.f16850d;
                l3 l3Var2 = c3Var.f6689b;
                if (c3Var != l3Var2.f6949w) {
                    return;
                }
                z6.a aVar2 = (z6.a) this.f16848b;
                l3Var2.f6950x = aVar2;
                l3Var2.D.i(aVar2);
                x xVar2 = (x) this.f16849c;
                if (xVar2 != x.f5398e) {
                    c3Var.f6689b.N.b(2, "Entering {0} state with picker: {1}", xVar2, aVar2);
                    c3Var.f6689b.f6944r.c(xVar2);
                    return;
                }
                return;
            case 22:
                try {
                    ((CountDownLatch) this.f16848b).await();
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
                a0 a0VarC = r9.a.c(new h8.m());
                try {
                    try {
                        Object obj3 = this.f16850d;
                        if (((h8.n) obj3).Q == null) {
                            socketH = ((h8.n) obj3).A.createSocket(((h8.n) obj3).f7672a.getAddress(), ((h8.n) this.f16850d).f7672a.getPort());
                        } else {
                            if (!(((h8.n) obj3).Q.f5294a instanceof InetSocketAddress)) {
                                throw new d2(c2.f5223l.g("Unsupported SocketAddress implementation " + ((h8.n) this.f16850d).Q.f5294a.getClass()));
                            }
                            socketH = h8.n.h((h8.n) obj3, ((h8.n) obj3).Q.f5295b, (InetSocketAddress) ((h8.n) obj3).Q.f5294a, ((h8.n) obj3).Q.f5296c, ((h8.n) obj3).Q.f5297d);
                        }
                        Socket socket = socketH;
                        Object obj4 = this.f16850d;
                        Socket socket2 = socket;
                        if (((h8.n) obj4).B != null) {
                            SSLSocketFactory sSLSocketFactory = ((h8.n) obj4).B;
                            HostnameVerifier hostnameVerifier = ((h8.n) obj4).C;
                            String host = ((h8.n) obj4).f7673b;
                            URI uriA = g8.s1.a(host);
                            if (uriA.getHost() != null) {
                                host = uriA.getHost();
                            }
                            SSLSocket sSLSocketA = h8.s.a(sSLSocketFactory, hostnameVerifier, socket, host, ((h8.n) this.f16850d).l(), ((h8.n) this.f16850d).F);
                            session = sSLSocketA.getSession();
                            socket2 = sSLSocketA;
                        }
                        socket2.setTcpNoDelay(true);
                        a0 a0VarC2 = r9.a.c(r9.a.p(socket2));
                        ((h8.c) this.f16849c).a(r9.a.n(socket2), socket2);
                        Object obj5 = this.f16850d;
                        h8.n nVar2 = (h8.n) obj5;
                        e8.a aVarA = ((h8.n) obj5).f7692u.a();
                        aVarA.c(e8.i.f5280a, socket2.getRemoteSocketAddress());
                        aVarA.c(e8.i.f5281b, socket2.getLocalSocketAddress());
                        aVarA.c(e8.i.f5282c, session);
                        aVarA.c(l.f6910a, session == null ? x1.f5400a : x1.f5401b);
                        nVar2.f7692u = aVarA.a();
                        h8.n nVar3 = (h8.n) this.f16850d;
                        nVar3.f7691t = new v6(nVar3, ((j8.k) nVar3.f7678g).d(a0VarC2));
                        synchronized (((h8.n) this.f16850d).f7682k) {
                            ((h8.n) this.f16850d).getClass();
                            if (session != null) {
                                h8.n nVar4 = (h8.n) this.f16850d;
                                session.getCipherSuite();
                                Certificate[] localCertificates = session.getLocalCertificates();
                                if (localCertificates != null) {
                                    c10 = 0;
                                    Certificate certificate = localCertificates[0];
                                } else {
                                    c10 = 0;
                                }
                                try {
                                    Certificate[] peerCertificates = session.getPeerCertificates();
                                    if (peerCertificates != null) {
                                        Certificate certificate2 = peerCertificates[c10];
                                    }
                                } catch (SSLPeerUnverifiedException e10) {
                                    n0.f5318d.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", session.getPeerHost()), (Throwable) e10);
                                }
                                nVar4.getClass();
                            }
                            break;
                        }
                        return;
                    } catch (Throwable th) {
                        h8.n nVar5 = (h8.n) this.f16850d;
                        nVar5.f7691t = new v6(nVar5, ((j8.k) nVar5.f7678g).d(a0VarC));
                        throw th;
                    }
                } catch (d2 e11) {
                    h8.n nVar6 = (h8.n) this.f16850d;
                    j8.a aVar3 = j8.a.INTERNAL_ERROR;
                    c2 c2Var = e11.f5232a;
                    Map map = h8.n.S;
                    nVar6.s(0, aVar3, c2Var);
                    nVar = (h8.n) this.f16850d;
                    v6Var = new v6(nVar, ((j8.k) nVar.f7678g).d(a0VarC));
                    nVar.f7691t = v6Var;
                    return;
                } catch (Exception e12) {
                    ((h8.n) this.f16850d).p(e12);
                    nVar = (h8.n) this.f16850d;
                    v6Var = new v6(nVar, ((j8.k) nVar.f7678g).d(a0VarC));
                    nVar.f7691t = v6Var;
                    return;
                }
                break;
            default:
                p pVar = (p) this.f16850d;
                pVar.f12303i = Long.valueOf(((k4) pVar.f12300f).a());
                for (n8.g gVar : ((p) this.f16850d).f12297c.f12273a.values()) {
                    gVar.f12269c.n();
                    v6.d dVar = gVar.f12268b;
                    gVar.f12268b = gVar.f12269c;
                    gVar.f12269c = dVar;
                }
                n8.j jVar = (n8.j) this.f16848b;
                e8.i iVar = (e8.i) this.f16849c;
                r6.m mVar3 = r6.p.f13572b;
                Object[] objArrCopyOf = new Object[4];
                if (jVar.f12281e != null) {
                    n8.i iVar2 = new n8.i(jVar, iVar, 1);
                    int i11 = 0 + 1;
                    if (objArrCopyOf.length < i11) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, d0.w(objArrCopyOf.length, i11));
                    }
                    i10 = 0 + 1;
                    objArrCopyOf[0] = iVar2;
                } else {
                    i10 = 0;
                }
                if (jVar.f12282f != null) {
                    n8.i iVar3 = new n8.i(jVar, iVar, 0);
                    int i12 = i10 + 1;
                    if (objArrCopyOf.length < i12) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, d0.w(objArrCopyOf.length, i12));
                    }
                    objArrCopyOf[i10] = iVar3;
                    i10++;
                }
                r6.m mVarP = r6.p.o(i10, objArrCopyOf).listIterator(0);
                while (mVarP.hasNext()) {
                    o oVar = (o) mVarP.next();
                    p pVar2 = (p) this.f16850d;
                    n8.h hVar = pVar2.f12297c;
                    long jLongValue = pVar2.f12303i.longValue();
                    n8.i iVar4 = (n8.i) oVar;
                    int i13 = iVar4.f12274a;
                    e8.i iVar5 = iVar4.f12276c;
                    n8.j jVar2 = iVar4.f12275b;
                    switch (i13) {
                        case 0:
                            mVar = mVarP;
                            ArrayList<n8.g> arrayListH = p.h(hVar, jVar2.f12282f.f12734d.intValue());
                            int size = arrayListH.size();
                            p.a aVar4 = jVar2.f12282f;
                            if (size >= aVar4.f12733c.intValue() && arrayListH.size() != 0) {
                                for (n8.g gVar2 : arrayListH) {
                                    if (hVar.b() >= jVar2.f12280d.intValue()) {
                                    }
                                    if (gVar2.c() >= aVar4.f12734d.intValue()) {
                                        if (((AtomicLong) gVar2.f12269c.f15908c).get() / gVar2.c() > ((double) aVar4.f12731a.intValue()) / 100.0d) {
                                            iVar5.b(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", gVar2, Double.valueOf(((AtomicLong) gVar2.f12269c.f15908c).get() / gVar2.c()));
                                            if (new Random().nextInt(100) < aVar4.f12732b.intValue()) {
                                                gVar2.b(jLongValue);
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList arrayListH2 = p.h(hVar, jVar2.f12281e.f12734d.intValue());
                            int size2 = arrayListH2.size();
                            p.a aVar5 = jVar2.f12281e;
                            if (size2 >= aVar5.f12733c.intValue() && arrayListH2.size() != 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = arrayListH2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Double.valueOf(((n8.g) it.next()).f()));
                                }
                                Iterator it2 = arrayList.iterator();
                                double dDoubleValue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                                while (it2.hasNext()) {
                                    dDoubleValue = ((Double) it2.next()).doubleValue() + dDoubleValue;
                                }
                                double size3 = dDoubleValue / ((double) arrayList.size());
                                Iterator it3 = arrayList.iterator();
                                double d10 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                                while (it3.hasNext()) {
                                    double dDoubleValue2 = ((Double) it3.next()).doubleValue() - size3;
                                    d10 = (dDoubleValue2 * dDoubleValue2) + d10;
                                }
                                double dSqrt = Math.sqrt(d10 / ((double) arrayList.size()));
                                double dIntValue = size3 - (((double) (aVar5.f12731a.intValue() / 1000.0f)) * dSqrt);
                                Iterator it4 = arrayListH2.iterator();
                                while (it4.hasNext()) {
                                    n8.g gVar3 = (n8.g) it4.next();
                                    Iterator it5 = it4;
                                    if (hVar.b() < jVar2.f12280d.intValue()) {
                                        if (gVar3.f() < dIntValue) {
                                            mVar2 = mVarP;
                                            iVar5.b(1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", gVar3, Double.valueOf(gVar3.f()), Double.valueOf(size3), Double.valueOf(dSqrt), Double.valueOf(dIntValue));
                                            if (new Random().nextInt(100) < aVar5.f12732b.intValue()) {
                                                gVar3.b(jLongValue);
                                            }
                                        } else {
                                            mVar2 = mVarP;
                                        }
                                        mVarP = mVar2;
                                        it4 = it5;
                                    }
                                }
                            }
                            mVar = mVarP;
                            break;
                    }
                    mVarP = mVar;
                }
                p pVar3 = (p) this.f16850d;
                n8.h hVar2 = pVar3.f12297c;
                Long l10 = pVar3.f12303i;
                for (n8.g gVar4 : hVar2.f12273a.values()) {
                    if (!gVar4.e()) {
                        int i14 = gVar4.f12271e;
                        gVar4.f12271e = i14 == 0 ? 0 : i14 - 1;
                    }
                    if (gVar4.e()) {
                        if (l10.longValue() > Math.min(gVar4.f12267a.f12278b.longValue() * ((long) gVar4.f12271e), Math.max(gVar4.f12267a.f12278b.longValue(), gVar4.f12267a.f12279c.longValue())) + gVar4.f12270d.longValue()) {
                            gVar4.g();
                        }
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f16847a) {
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return ((Runnable) this.f16849c).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f16847a = i10;
        this.f16850d = obj;
        this.f16848b = obj2;
        this.f16849c = obj3;
    }
}
