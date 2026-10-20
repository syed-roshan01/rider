package f4;

import android.content.Context;
import java.util.Set;
import k6.c4;
import k6.d4;
import k6.f5;
import k6.l4;
import k6.p5;
import k6.u7;
import k6.z4;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6226a;

    public y(f5 f5Var) {
        f6.a.x(f5Var);
        this.f6226a = f5Var;
    }

    public abstract com.google.crypto.tink.shaded.protobuf.b0 b(com.google.crypto.tink.shaded.protobuf.b bVar);

    public abstract void c();

    public abstract void d();

    public abstract com.google.crypto.tink.shaded.protobuf.b0 e(com.google.crypto.tink.shaded.protobuf.l lVar);

    public final void f(Object obj, boolean z10) {
        Set set = (Set) this.f6226a;
        int size = set.size();
        if (z10) {
            set.add(obj);
            if (size == 0) {
                c();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            d();
        }
    }

    public abstract void g(com.google.crypto.tink.shaded.protobuf.b bVar);

    public final k6.f h() {
        return ((f5) this.f6226a).f10030g;
    }

    public final c4 i() {
        return ((f5) this.f6226a).f10036m;
    }

    public final l4 j() {
        l4 l4Var = ((f5) this.f6226a).f10031h;
        f5.c(l4Var);
        return l4Var;
    }

    public final u7 k() {
        u7 u7Var = ((f5) this.f6226a).f10035l;
        f5.c(u7Var);
        return u7Var;
    }

    public void l() {
        z4 z4Var = ((f5) this.f6226a).f10033j;
        f5.d(z4Var);
        z4Var.l();
    }

    @Override // k6.p5
    public final Context zza() {
        return ((f5) this.f6226a).f10024a;
    }

    @Override // k6.p5
    public final e6.b zzb() {
        return ((f5) this.f6226a).f10037n;
    }

    @Override // k6.p5
    public final k6.h zzd() {
        return ((f5) this.f6226a).f10029f;
    }

    @Override // k6.p5
    public final d4 zzj() {
        d4 d4Var = ((f5) this.f6226a).f10032i;
        f5.d(d4Var);
        return d4Var;
    }

    @Override // k6.p5
    public final z4 zzl() {
        z4 z4Var = ((f5) this.f6226a).f10033j;
        f5.d(z4Var);
        return z4Var;
    }
}
