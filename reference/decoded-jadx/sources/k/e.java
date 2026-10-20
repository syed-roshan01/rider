package k;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import b3.a1;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import e8.c2;
import e8.l1;
import g8.c1;
import g8.i0;
import g8.u5;
import g8.v5;
import g8.w5;
import g8.y2;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import k6.p7;
import k6.q7;
import k6.s6;
import k6.u7;
import k6.x7;
import k6.y3;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8597e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f8593a = i10;
        this.f8597e = obj;
        this.f8594b = obj2;
        this.f8595c = obj3;
        this.f8596d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrK = null;
        switch (this.f8593a) {
            case 0:
                g gVar = (g) this.f8594b;
                if (gVar != null) {
                    f fVar = (f) this.f8597e;
                    ((h) fVar.f8599b).H = true;
                    gVar.f8601b.c(false);
                    ((h) fVar.f8599b).H = false;
                }
                MenuItem menuItem = (MenuItem) this.f8595c;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((l) this.f8596d).p(menuItem, null, 4);
                    return;
                }
                return;
            case 1:
                s6 s6VarM = ((AppMeasurementDynamiteService) this.f8597e).f3409a.m();
                zzcv zzcvVar = (zzcv) this.f8594b;
                k6.v vVar = (k6.v) this.f8595c;
                String str = (String) this.f8596d;
                s6VarM.l();
                s6VarM.s();
                if (z5.f.f17253b.c(s6VarM.k().zza(), 12451000) == 0) {
                    s6VarM.v(new e(s6VarM, vVar, str, zzcvVar, 4));
                    return;
                } else {
                    s6VarM.zzj().f9967i.b("Not bundling data. Service unavailable or out of date");
                    s6VarM.k().J(zzcvVar, new byte[0]);
                    return;
                }
            case 2:
                synchronized (((AtomicReference) this.f8594b)) {
                    try {
                        try {
                            Object obj = this.f8597e;
                            y3 y3Var = ((s6) obj).f10358d;
                            if (y3Var == null) {
                                ((s6) obj).zzj().f9964f.b("Failed to get trigger URIs; not connected to service");
                                ((AtomicReference) this.f8594b).notify();
                                return;
                            }
                            f6.a.x((x7) this.f8595c);
                            ((AtomicReference) this.f8594b).set(y3Var.c((Bundle) this.f8596d, (x7) this.f8595c));
                            ((s6) this.f8597e).F();
                            ((AtomicReference) this.f8594b).notify();
                            return;
                        } catch (RemoteException e4) {
                            ((s6) this.f8597e).zzj().f9964f.c("Failed to get trigger URIs; remote exception", e4);
                            ((AtomicReference) this.f8594b).notify();
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.f8594b).notify();
                        throw th;
                    }
                }
                break;
            case 3:
                s6 s6VarM2 = ((AppMeasurementDynamiteService) this.f8597e).f3409a.m();
                zzcv zzcvVar2 = (zzcv) this.f8594b;
                String str2 = (String) this.f8595c;
                String str3 = (String) this.f8596d;
                s6VarM2.l();
                s6VarM2.s();
                s6VarM2.v(new a1(s6VarM2, str2, str3, s6VarM2.H(false), zzcvVar2, 2));
                return;
            case 4:
                Object obj2 = this.f8596d;
                Object obj3 = this.f8597e;
                try {
                    try {
                        y3 y3Var2 = ((s6) obj3).f10358d;
                        if (y3Var2 == null) {
                            ((s6) obj3).zzj().f9964f.b("Discarding data. Failed to send event to service to bundle");
                            u7 u7VarK = ((s6) obj3).k();
                            zzcv zzcvVar3 = (zzcv) obj2;
                            u7VarK.J(zzcvVar3, null);
                            obj2 = zzcvVar3;
                            obj3 = u7VarK;
                        } else {
                            bArrK = y3Var2.k((k6.v) this.f8594b, (String) this.f8595c);
                            ((s6) obj3).F();
                            u7 u7VarK2 = ((s6) obj3).k();
                            zzcv zzcvVar4 = (zzcv) obj2;
                            u7VarK2.J(zzcvVar4, bArrK);
                            obj2 = zzcvVar4;
                            obj3 = u7VarK2;
                        }
                        return;
                    } catch (RemoteException e10) {
                        ((s6) obj3).zzj().f9964f.c("Failed to send event to the service to bundle", e10);
                        ((s6) obj3).k().J((zzcv) obj2, bArrK);
                        return;
                    }
                } catch (Throwable th2) {
                    ((s6) obj3).k().J((zzcv) obj2, bArrK);
                    throw th2;
                }
            case 5:
                q7 q7Var = (q7) this.f8597e;
                u7 u7VarM = q7Var.f10330a.M();
                String str4 = (String) this.f8594b;
                String str5 = (String) this.f8595c;
                Bundle bundle = (Bundle) this.f8596d;
                ((e6.c) q7Var.f10330a.zzb()).getClass();
                k6.v vVarZ = u7VarM.z(str5, bundle, "auto", System.currentTimeMillis(), false);
                p7 p7Var = q7Var.f10330a;
                f6.a.x(vVarZ);
                p7Var.m(vVarZ, str4);
                return;
            case 6:
                ((g8.a) this.f8597e).f((c2) this.f8594b, (i0) this.f8595c, (l1) this.f8596d);
                return;
            case 7:
                ((c1) this.f8597e).f6682a.c((c2) this.f8594b, (i0) this.f8595c, (l1) this.f8596d);
                return;
            case 8:
                y2 y2Var = (y2) this.f8597e;
                y2Var.f7288z = true;
                y2Var.f7283u.c((c2) this.f8594b, (i0) this.f8595c, (l1) this.f8596d);
                return;
            default:
                synchronized (((w5) this.f8597e)) {
                    try {
                        if (((u5) this.f8594b).f7158b == 0) {
                            try {
                                v5 v5Var = (v5) this.f8595c;
                                Object obj4 = this.f8596d;
                                int i10 = ((r7.e) v5Var).f13598a;
                                switch (i10) {
                                    case 21:
                                        Executor executor = (Executor) obj4;
                                        switch (i10) {
                                            case 21:
                                                ((ExecutorService) executor).shutdown();
                                                break;
                                            default:
                                                ((ExecutorService) executor).shutdown();
                                                break;
                                        }
                                        break;
                                    case 22:
                                        ((ScheduledExecutorService) obj4).shutdown();
                                        break;
                                    default:
                                        Executor executor2 = (Executor) obj4;
                                        switch (i10) {
                                            case 21:
                                                ((ExecutorService) executor2).shutdown();
                                                break;
                                            default:
                                                ((ExecutorService) executor2).shutdown();
                                                break;
                                        }
                                        break;
                                }
                                ((w5) this.f8597e).f7203a.remove((v5) this.f8595c);
                                if (((w5) this.f8597e).f7203a.isEmpty()) {
                                    ((w5) this.f8597e).f7205c.shutdown();
                                    ((w5) this.f8597e).f7205c = null;
                                }
                            } catch (Throwable th3) {
                                ((w5) this.f8597e).f7203a.remove((v5) this.f8595c);
                                if (((w5) this.f8597e).f7203a.isEmpty()) {
                                    ((w5) this.f8597e).f7205c.shutdown();
                                    ((w5) this.f8597e).f7205c = null;
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
