package w0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class c extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f16035o = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.c f16036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c9.c f16037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o0.d f16039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f16040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f16041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f16042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16044n;

    public c(int i10, n nVar, c9.c cVar, c9.c cVar2) {
        super(i10, nVar);
        this.f16036f = cVar;
        this.f16037g = cVar2;
        this.f16041k = n.f16100e;
        this.f16042l = f16035o;
        this.f16043m = 1;
    }

    public c A(c9.c cVar, c9.c cVar2) {
        d dVar;
        if (!(!this.f16071c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        if (this.f16044n && this.f16072d < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
        y(d());
        Object obj = p.f16109b;
        synchronized (obj) {
            int i10 = p.f16111d;
            p.f16111d = i10 + 1;
            p.f16110c = p.f16110c.o(i10);
            n nVarE = e();
            r(nVarE.o(i10));
            dVar = new d(i10, p.d(d() + 1, i10, nVarE), p.j(cVar, this.f16036f, true), p.a(cVar2, this.f16037g), this);
        }
        if (!this.f16044n && !this.f16071c) {
            int iD = d();
            synchronized (obj) {
                int i11 = p.f16111d;
                p.f16111d = i11 + 1;
                q(i11);
                p.f16110c = p.f16110c.o(d());
            }
            r(p.d(iD + 1, d(), e()));
        }
        return dVar;
    }

    @Override // w0.i
    public final void b() {
        p.f16110c = p.f16110c.i(d()).e(this.f16041k);
    }

    @Override // w0.i
    public void c() {
        if (this.f16071c) {
            return;
        }
        this.f16071c = true;
        synchronized (p.f16109b) {
            int i10 = this.f16072d;
            if (i10 >= 0) {
                p.s(i10);
                this.f16072d = -1;
            }
        }
        l();
    }

    @Override // w0.i
    public final c9.c f() {
        return this.f16036f;
    }

    @Override // w0.i
    public boolean g() {
        return false;
    }

    @Override // w0.i
    public int h() {
        return this.f16038h;
    }

    @Override // w0.i
    public final c9.c i() {
        return this.f16037g;
    }

    @Override // w0.i
    public void k() {
        this.f16043m++;
    }

    @Override // w0.i
    public void l() {
        int i10 = this.f16043m;
        if (i10 <= 0) {
            throw new IllegalArgumentException("no pending nested snapshots".toString());
        }
        int i11 = i10 - 1;
        this.f16043m = i11;
        if (i11 != 0 || this.f16044n) {
            return;
        }
        o0.d dVarW = w();
        if (dVarW != null) {
            if (!(!this.f16044n)) {
                throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
            }
            z(null);
            int iD = d();
            Object[] objArr = dVarW.f12333b;
            int i12 = dVarW.f12332a;
            for (int i13 = 0; i13 < i12; i13++) {
                Object obj = objArr[i13];
                d7.a.k(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (i0 i0VarE = ((g0) obj).e(); i0VarE != null; i0VarE = i0VarE.f16074b) {
                    int i14 = i0VarE.f16073a;
                    if (i14 == iD || r8.p.D0(this.f16041k, Integer.valueOf(i14))) {
                        i0VarE.f16073a = 0;
                    }
                }
            }
        }
        a();
    }

    @Override // w0.i
    public void m() {
        if (this.f16044n || this.f16071c) {
            return;
        }
        u();
    }

    @Override // w0.i
    public void n(g0 g0Var) {
        o0.d dVarW = w();
        if (dVarW == null) {
            dVarW = new o0.d();
            z(dVarW);
        }
        dVarW.add(g0Var);
    }

    @Override // w0.i
    public final void o() {
        int length = this.f16042l.length;
        for (int i10 = 0; i10 < length; i10++) {
            p.s(this.f16042l[i10]);
        }
        int i11 = this.f16072d;
        if (i11 >= 0) {
            p.s(i11);
            this.f16072d = -1;
        }
    }

    @Override // w0.i
    public void s(int i10) {
        this.f16038h = i10;
    }

    @Override // w0.i
    public i t(c9.c cVar) {
        e eVar;
        if (!(!this.f16071c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        if (this.f16044n && this.f16072d < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
        int iD = d();
        y(d());
        Object obj = p.f16109b;
        synchronized (obj) {
            int i10 = p.f16111d;
            p.f16111d = i10 + 1;
            p.f16110c = p.f16110c.o(i10);
            eVar = new e(i10, p.d(iD + 1, i10, e()), cVar, this);
        }
        if (!this.f16044n && !this.f16071c) {
            int iD2 = d();
            synchronized (obj) {
                int i11 = p.f16111d;
                p.f16111d = i11 + 1;
                q(i11);
                p.f16110c = p.f16110c.o(d());
            }
            r(p.d(iD2 + 1, d(), e()));
        }
        return eVar;
    }

    public final void u() {
        y(d());
        if (this.f16044n || this.f16071c) {
            return;
        }
        int iD = d();
        synchronized (p.f16109b) {
            int i10 = p.f16111d;
            p.f16111d = i10 + 1;
            q(i10);
            p.f16110c = p.f16110c.o(d());
        }
        r(p.d(iD + 1, d(), e()));
    }

    public y.a0 v() {
        HashMap mapB;
        o0.d dVar;
        o0.d dVarW = w();
        if (dVarW != null) {
            AtomicReference atomicReference = p.f16116i;
            mapB = p.b((c) atomicReference.get(), this, p.f16110c.i(((b) atomicReference.get()).f16070b));
        } else {
            mapB = null;
        }
        List list = r8.r.f13661a;
        synchronized (p.f16109b) {
            try {
                p.c(this);
                if (dVarW == null || dVarW.f12332a == 0) {
                    b();
                    b bVar = (b) p.f16116i.get();
                    p.t(bVar, o.f16106c);
                    dVar = bVar.f16039i;
                    if (dVar == null || dVar.isEmpty()) {
                        dVar = null;
                    } else {
                        list = p.f16114g;
                    }
                } else {
                    b bVar2 = (b) p.f16116i.get();
                    y.a0 a0VarX = x(p.f16111d, mapB, p.f16110c.i(bVar2.f16070b));
                    if (!d7.a.d(a0VarX, k.f16077a)) {
                        return a0VarX;
                    }
                    b();
                    p.t(bVar2, o.f16106c);
                    dVar = bVar2.f16039i;
                    z(null);
                    bVar2.f16039i = null;
                    list = p.f16114g;
                }
                this.f16044n = true;
                if (dVar != null && !dVar.isEmpty()) {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((c9.e) list.get(i10)).invoke(dVar, this);
                    }
                }
                if (dVarW != null && !dVarW.isEmpty()) {
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((c9.e) list.get(i11)).invoke(dVarW, this);
                    }
                }
                synchronized (p.f16109b) {
                    try {
                        o();
                        p.f();
                        if (dVar != null) {
                            Object[] objArr = dVar.f12333b;
                            int i12 = dVar.f12332a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                Object obj = objArr[i13];
                                d7.a.k(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                p.o((g0) obj);
                            }
                        }
                        if (dVarW != null) {
                            Object[] objArr2 = dVarW.f12333b;
                            int i14 = dVarW.f12332a;
                            for (int i15 = 0; i15 < i14; i15++) {
                                Object obj2 = objArr2[i15];
                                d7.a.k(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                p.o((g0) obj2);
                            }
                        }
                        ArrayList arrayList = this.f16040j;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i16 = 0; i16 < size3; i16++) {
                                p.o((g0) arrayList.get(i16));
                            }
                        }
                        this.f16040j = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return k.f16077a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public o0.d w() {
        return this.f16039i;
    }

    public final y.a0 x(int i10, HashMap map, n nVar) {
        n nVar2;
        i0 i0VarQ;
        i0 i0VarI;
        n nVarN = e().o(d()).n(this.f16041k);
        o0.d dVarW = w();
        d7.a.j(dVarW);
        Object[] objArr = dVarW.f12333b;
        int i11 = dVarW.f12332a;
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList arrayListP0 = null;
        while (i12 < i11) {
            Object obj = objArr[i12];
            d7.a.k(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            g0 g0Var = (g0) obj;
            i0 i0VarE = g0Var.e();
            i0 i0VarQ2 = p.q(i0VarE, i10, nVar);
            if (i0VarQ2 == null || (i0VarQ = p.q(i0VarE, d(), nVarN)) == null || d7.a.d(i0VarQ2, i0VarQ)) {
                nVar2 = nVarN;
            } else {
                nVar2 = nVarN;
                i0 i0VarQ3 = p.q(i0VarE, d(), e());
                if (i0VarQ3 == null) {
                    p.p();
                    throw null;
                }
                if (map == null || (i0VarI = (i0) map.get(i0VarQ2)) == null) {
                    i0VarI = g0Var.i(i0VarQ, i0VarQ2, i0VarQ3);
                }
                if (i0VarI == null) {
                    return new j();
                }
                if (!d7.a.d(i0VarI, i0VarQ3)) {
                    if (d7.a.d(i0VarI, i0VarQ2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new q8.f(g0Var, i0VarQ2.b()));
                        if (arrayListP0 == null) {
                            arrayListP0 = new ArrayList();
                        }
                        arrayListP0.add(g0Var);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!d7.a.d(i0VarI, i0VarQ) ? new q8.f(g0Var, i0VarI) : new q8.f(g0Var, i0VarQ.b()));
                    }
                }
            }
            i12++;
            nVarN = nVar2;
        }
        if (arrayList != null) {
            u();
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                q8.f fVar = (q8.f) arrayList.get(i13);
                g0 g0Var2 = (g0) fVar.f13225a;
                i0 i0Var = (i0) fVar.f13226b;
                i0Var.f16073a = d();
                synchronized (p.f16109b) {
                    i0Var.f16074b = g0Var2.e();
                    g0Var2.k(i0Var);
                }
            }
        }
        if (arrayListP0 != null) {
            int size2 = arrayListP0.size();
            for (int i14 = 0; i14 < size2; i14++) {
                dVarW.remove((g0) arrayListP0.get(i14));
            }
            ArrayList arrayList2 = this.f16040j;
            if (arrayList2 != null) {
                arrayListP0 = r8.p.P0(arrayListP0, arrayList2);
            }
            this.f16040j = arrayListP0;
        }
        return k.f16077a;
    }

    public final void y(int i10) {
        synchronized (p.f16109b) {
            this.f16041k = this.f16041k.o(i10);
        }
    }

    public void z(o0.d dVar) {
        this.f16039i = dVar;
    }
}
