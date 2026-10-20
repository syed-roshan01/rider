package i6;

import android.os.Bundle;
import android.os.SystemClock;
import b3.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k6.d4;
import k6.f5;
import k6.g6;
import k6.h;
import k6.p6;
import k6.q;
import k6.q6;
import k6.t7;
import k6.u7;
import k6.y5;
import k6.z4;
import q.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5 f8070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y5 f8071b;

    public b(f5 f5Var) {
        f6.a.x(f5Var);
        this.f8070a = f5Var;
        y5 y5Var = f5Var.f10039p;
        f5.b(y5Var);
        this.f8071b = y5Var;
    }

    @Override // k6.k6
    public final int zza(String str) {
        f6.a.u(str);
        return 25;
    }

    @Override // k6.k6
    public final void zzb(String str) {
        f5 f5Var = this.f8070a;
        q qVarI = f5Var.i();
        f5Var.f10037n.getClass();
        qVarI.u(str, SystemClock.elapsedRealtime());
    }

    @Override // k6.k6
    public final void zzc(String str) {
        f5 f5Var = this.f8070a;
        q qVarI = f5Var.i();
        f5Var.f10037n.getClass();
        qVarI.x(str, SystemClock.elapsedRealtime());
    }

    @Override // k6.k6
    public final String zzf() {
        return (String) this.f8071b.f10572g.get();
    }

    @Override // k6.k6
    public final String zzg() {
        p6 p6Var = ((f5) this.f8071b.f6226a).f10038o;
        f5.b(p6Var);
        q6 q6Var = p6Var.f10276c;
        if (q6Var != null) {
            return q6Var.f10325b;
        }
        return null;
    }

    @Override // k6.k6
    public final String zzh() {
        p6 p6Var = ((f5) this.f8071b.f6226a).f10038o;
        f5.b(p6Var);
        q6 q6Var = p6Var.f10276c;
        if (q6Var != null) {
            return q6Var.f10324a;
        }
        return null;
    }

    @Override // k6.k6
    public final String zzi() {
        return (String) this.f8071b.f10572g.get();
    }

    @Override // k6.k6
    public final List zza(String str, String str2) {
        y5 y5Var = this.f8071b;
        if (y5Var.zzl().w()) {
            y5Var.zzj().f9964f.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (h.b()) {
            y5Var.zzj().f9964f.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        z4 z4Var = ((f5) y5Var.f6226a).f10033j;
        f5.d(z4Var);
        z4Var.p(atomicReference, 5000L, "get conditional user properties", new a1(y5Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return u7.e0(list);
        }
        y5Var.zzj().f9964f.c("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // k6.k6
    public final void zzb(String str, String str2, Bundle bundle) {
        y5 y5Var = this.f8071b;
        ((e6.c) y5Var.zzb()).getClass();
        y5Var.D(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // k6.k6
    public final void zza(String str, String str2, Bundle bundle) {
        y5 y5Var = this.f8070a.f10039p;
        f5.b(y5Var);
        y5Var.B(str, str2, bundle);
    }

    @Override // k6.k6
    public final long zza() {
        u7 u7Var = this.f8070a.f10035l;
        f5.c(u7Var);
        return u7Var.t0();
    }

    @Override // k6.k6
    public final Map zza(String str, String str2, boolean z10) {
        y5 y5Var = this.f8071b;
        if (y5Var.zzl().w()) {
            y5Var.zzj().f9964f.b("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (h.b()) {
            y5Var.zzj().f9964f.b("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        z4 z4Var = ((f5) y5Var.f6226a).f10033j;
        f5.d(z4Var);
        z4Var.p(atomicReference, 5000L, "get user properties", new g6(y5Var, atomicReference, str, str2, z10));
        List<t7> list = (List) atomicReference.get();
        if (list == null) {
            d4 d4VarZzj = y5Var.zzj();
            d4VarZzj.f9964f.c("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        f fVar = new f(list.size());
        for (t7 t7Var : list) {
            Object objE = t7Var.e();
            if (objE != null) {
                fVar.put(t7Var.f10404b, objE);
            }
        }
        return fVar;
    }

    @Override // k6.k6
    public final void zza(Bundle bundle) {
        y5 y5Var = this.f8071b;
        ((e6.c) y5Var.zzb()).getClass();
        y5Var.x(bundle, System.currentTimeMillis());
    }
}
