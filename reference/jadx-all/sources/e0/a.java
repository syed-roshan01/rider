package e0;

import e1.b0;
import e1.c0;
import e1.g0;
import e1.l0;
import m2.l;
import m9.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f4985d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f4982a = bVar;
        this.f4983b = bVar2;
        this.f4984c = bVar3;
        this.f4985d = bVar4;
    }

    public static e a(a aVar, c cVar, c cVar2, c cVar3, int i10) {
        b bVar = cVar;
        if ((i10 & 1) != 0) {
            bVar = aVar.f4982a;
        }
        b bVar2 = (i10 & 2) != 0 ? aVar.f4983b : null;
        b bVar3 = cVar2;
        if ((i10 & 4) != 0) {
            bVar3 = aVar.f4984c;
        }
        b bVar4 = cVar3;
        if ((i10 & 8) != 0) {
            bVar4 = aVar.f4985d;
        }
        ((e) aVar).getClass();
        return new e(bVar, bVar2, bVar3, bVar4);
    }

    @Override // e1.l0
    public final g0 d(long j10, l lVar, m2.b bVar) {
        float fA = this.f4982a.a(j10, bVar);
        float fA2 = this.f4983b.a(j10, bVar);
        float fA3 = this.f4984c.a(j10, bVar);
        float fA4 = this.f4985d.a(j10, bVar);
        float fC = d1.f.c(j10);
        float f10 = fA + fA4;
        if (f10 > fC) {
            float f11 = fC / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fC) {
            float f13 = fC / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new b0(e0.h(d1.c.f4326b, j10));
        }
        d1.d dVarH = e0.h(d1.c.f4326b, j10);
        l lVar2 = l.f11815a;
        float f14 = lVar == lVar2 ? fA : fA2;
        long jD = f6.a.d(f14, f14);
        if (lVar == lVar2) {
            fA = fA2;
        }
        long jD2 = f6.a.d(fA, fA);
        float f15 = lVar == lVar2 ? fA3 : fA4;
        long jD3 = f6.a.d(f15, f15);
        if (lVar != lVar2) {
            fA4 = fA3;
        }
        return new c0(new d1.e(dVarH.f4332a, dVarH.f4333b, dVarH.f4334c, dVarH.f4335d, jD, jD2, jD3, f6.a.d(fA4, fA4)));
    }
}
