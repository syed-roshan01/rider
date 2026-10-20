package h0;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import m0.g1;
import u.f2;
import u.h2;
import u.r1;
import u1.x1;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2.b f7518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f7519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(m2.b bVar, g1 g1Var, int i10) {
        super(1);
        this.f7517a = i10;
        this.f7518b = bVar;
        this.f7519c = g1Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f7517a;
        g1 g1Var = this.f7519c;
        m2.b bVar = this.f7518b;
        switch (i10) {
            case 0:
                long j10 = ((m2.g) obj).f11805a;
                g1Var.setValue(new m2.k(o1.s.e(bVar.J(m2.g.b(j10)), bVar.J(m2.g.a(j10)))));
                return q8.l.f13235a;
            default:
                y0.l lVar = y0.l.f16729b;
                a0.j0 j0Var = new a0.j0((c9.a) obj, 1);
                z0 z0Var = new z0(bVar, g1Var, 0);
                if (!r1.a()) {
                    throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
                }
                return r1.a() ? new MagnifierElement(j0Var, null, z0Var, Float.NaN, true, m2.g.f11803c, Float.NaN, Float.NaN, true, Build.VERSION.SDK_INT == 28 ? f2.f14772a : h2.f14798a) : x1.q(lVar, lVar);
        }
    }
}
