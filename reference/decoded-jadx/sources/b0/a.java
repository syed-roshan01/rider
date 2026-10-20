package b0;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.CancellationException;
import v.h1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f2315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f2316b;

    public a(h0 h0Var) {
        h1 h1Var = h1.f15594b;
        this.f2315a = h0Var;
        this.f2316b = h1Var;
    }

    @Override // n1.a
    public final Object L(long j10, long j11, u8.e eVar) {
        return new m2.p(this.f2316b == h1.f15593a ? m2.p.a(j11, 0.0f, 0.0f, 2) : m2.p.a(j11, 0.0f, 0.0f, 1));
    }

    @Override // n1.a
    public final long V(long j10, long j11, int i10) {
        if (i10 != 2 || d1.c.b(j11, d1.c.f4326b)) {
            return d1.c.f4326b;
        }
        throw new CancellationException();
    }

    @Override // n1.a
    public final long g0(int i10, long j10) {
        if (i10 == 1) {
            h0 h0Var = this.f2315a;
            if (Math.abs(h0Var.f2397e.f2319c.d()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                a0 a0Var = h0Var.f2397e;
                float fD = a0Var.f2319c.d() * h0Var.l();
                float f10 = ((((x) h0Var.j()).f2494b + ((x) h0Var.j()).f2495c) * (-Math.signum(a0Var.f2319c.d()))) + fD;
                if (a0Var.f2319c.d() > 0.0f) {
                    f10 = fD;
                    fD = f10;
                }
                h1 h1Var = h1.f15594b;
                h1 h1Var2 = this.f2316b;
                float fE = -h0Var.f2403k.e(-z6.a.q(h1Var2 == h1Var ? d1.c.d(j10) : d1.c.e(j10), fD, f10));
                float fD2 = h1Var2 == h1Var ? fE : d1.c.d(j10);
                if (h1Var2 != h1.f15593a) {
                    fE = d1.c.e(j10);
                }
                return d9.i.f(fD2, fE);
            }
        }
        return d1.c.f4326b;
    }
}
