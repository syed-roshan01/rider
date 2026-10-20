package a0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r1.i1;

/* JADX INFO: loaded from: classes.dex */
public final class x implements w, r1.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f872d = new HashMap();

    public x(q qVar, i1 i1Var) {
        this.f869a = qVar;
        this.f870b = i1Var;
        this.f871c = (s) qVar.f846b.invoke();
    }

    @Override // m2.b
    public final int E(long j10) {
        return this.f870b.E(j10);
    }

    @Override // m2.b
    public final float F(long j10) {
        return this.f870b.F(j10);
    }

    @Override // m2.b
    public final int J(float f10) {
        return this.f870b.J(f10);
    }

    @Override // r1.l0
    public final r1.k0 N(int i10, int i11, Map map, c9.c cVar) {
        return this.f870b.N(i10, i11, map, cVar);
    }

    @Override // m2.b
    public final long S(long j10) {
        return this.f870b.S(j10);
    }

    @Override // m2.b
    public final float Z(long j10) {
        return this.f870b.Z(j10);
    }

    public final List a(int i10, long j10) {
        HashMap map = this.f872d;
        List list = (List) map.get(Integer.valueOf(i10));
        if (list != null) {
            return list;
        }
        s sVar = this.f871c;
        Object objA = sVar.a(i10);
        List listH = this.f870b.H(objA, this.f869a.a(i10, objA, sVar.d(i10)));
        int size = listH.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((r1.i0) listH.get(i11)).f(j10));
        }
        map.put(Integer.valueOf(i10), arrayList);
        return arrayList;
    }

    @Override // m2.b
    public final float c() {
        return this.f870b.c();
    }

    @Override // m2.b
    public final long e0(float f10) {
        return this.f870b.e0(f10);
    }

    @Override // r1.q
    public final m2.l getLayoutDirection() {
        return this.f870b.getLayoutDirection();
    }

    @Override // m2.b
    public final float m() {
        return this.f870b.m();
    }

    @Override // m2.b
    public final float o0(int i10) {
        return this.f870b.o0(i10);
    }

    @Override // r1.q
    public final boolean q() {
        return this.f870b.q();
    }

    @Override // m2.b
    public final float q0(float f10) {
        return this.f870b.q0(f10);
    }

    @Override // m2.b
    public final long t(float f10) {
        return this.f870b.t(f10);
    }

    @Override // m2.b
    public final long u(long j10) {
        return this.f870b.u(j10);
    }

    @Override // m2.b
    public final float v(float f10) {
        return this.f870b.v(f10);
    }
}
