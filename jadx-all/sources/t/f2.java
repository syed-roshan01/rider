package t;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f14155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f14156d;

    public f2(int i10, LinkedHashMap linkedHashMap) {
        this.f14153a = linkedHashMap;
        this.f14154b = i10;
    }

    @Override // t.z1
    public final t c(long j10, t tVar, t tVar2, t tVar3) {
        long jS = z6.a.s((j10 / 1000000) - ((long) 0), 0L, f());
        if (jS <= 0) {
            return tVar3;
        }
        t tVarD = d((jS - 1) * 1000000, tVar, tVar2, tVar3);
        t tVarD2 = d(jS * 1000000, tVar, tVar2, tVar3);
        if (this.f14155c == null) {
            t tVarC = tVar.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14155c = tVarC;
            t tVarC2 = tVar.c();
            d7.a.k(tVarC2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14156d = tVarC2;
        }
        int iB = tVarD.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t tVar4 = this.f14156d;
            if (tVar4 == null) {
                d7.a.D("velocityVector");
                throw null;
            }
            tVar4.e(i10, (tVarD.a(i10) - tVarD2.a(i10)) * 1000.0f);
        }
        t tVar5 = this.f14156d;
        if (tVar5 != null) {
            return tVar5;
        }
        d7.a.D("velocityVector");
        throw null;
    }

    @Override // t.z1
    public final t d(long j10, t tVar, t tVar2, t tVar3) {
        int iS = (int) z6.a.s((j10 / 1000000) - ((long) 0), 0L, f());
        Integer numValueOf = Integer.valueOf(iS);
        Map map = this.f14153a;
        if (map.containsKey(numValueOf)) {
            return (t) ((q8.f) r8.v.B0(Integer.valueOf(iS), map)).f13225a;
        }
        int i10 = this.f14154b;
        if (iS >= i10) {
            return tVar2;
        }
        if (iS <= 0) {
            return tVar;
        }
        a0 a0Var = d0.f14122c;
        t tVar4 = tVar;
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            q8.f fVar = (q8.f) entry.getValue();
            if (iS > iIntValue && iIntValue >= i11) {
                tVar4 = (t) fVar.f13225a;
                a0Var = (a0) fVar.f13226b;
                i11 = iIntValue;
            } else if (iS < iIntValue && iIntValue <= i10) {
                tVar2 = (t) fVar.f13225a;
                i10 = iIntValue;
            }
        }
        float fA = a0Var.a((iS - i11) / (i10 - i11));
        if (this.f14155c == null) {
            t tVarC = tVar.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14155c = tVarC;
            t tVarC2 = tVar.c();
            d7.a.k(tVarC2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14156d = tVarC2;
        }
        int iB = tVar4.b();
        for (int i12 = 0; i12 < iB; i12++) {
            t tVar5 = this.f14155c;
            if (tVar5 == null) {
                d7.a.D("valueVector");
                throw null;
            }
            float fA2 = tVar4.a(i12);
            float fA3 = tVar2.a(i12);
            x1 x1Var = y1.f14355a;
            tVar5.e(i12, (fA3 * fA) + ((1 - fA) * fA2));
        }
        t tVar6 = this.f14155c;
        if (tVar6 != null) {
            return tVar6;
        }
        d7.a.D("valueVector");
        throw null;
    }

    @Override // t.a2
    public final int e() {
        return 0;
    }

    @Override // t.a2
    public final int f() {
        return this.f14154b;
    }
}
