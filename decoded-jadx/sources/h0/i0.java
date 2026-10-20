package h0;

import java.util.List;
import m0.l3;
import t.w1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements p9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7408c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.f7406a = i10;
        this.f7408c = obj;
        this.f7407b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i10, u8.e eVar) {
        p9.j0 j0Var;
        if (eVar instanceof p9.j0) {
            j0Var = (p9.j0) eVar;
            int i11 = j0Var.f12907c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j0Var.f12907c = i11 - Integer.MIN_VALUE;
            } else {
                j0Var = new p9.j0(this, eVar);
            }
        } else {
            j0Var = new p9.j0(this, eVar);
        }
        Object obj = j0Var.f12905a;
        v8.a aVar = v8.a.f15963a;
        int i12 = j0Var.f12907c;
        q8.l lVar = q8.l.f13235a;
        if (i12 == 0) {
            d7.t.v0(obj);
            if (i10 > 0) {
                Object obj2 = this.f7408c;
                if (!((d9.q) obj2).f4948a) {
                    ((d9.q) obj2).f4948a = true;
                    p9.g gVar = (p9.g) this.f7407b;
                    p9.f0 f0Var = p9.f0.f12890a;
                    j0Var.f12907c = 1;
                    if (gVar.emit(f0Var, j0Var) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return lVar;
    }

    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        float f10;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f7406a;
        Object obj2 = this.f7408c;
        Object obj3 = this.f7407b;
        switch (i10) {
            case 0:
                long j10 = ((d1.c) obj).f4330a;
                t.d dVar = (t.d) obj2;
                if (d9.i.u(((d1.c) dVar.d()).f4330a) && d9.i.u(j10) && d1.c.e(((d1.c) dVar.d()).f4330a) != d1.c.e(j10)) {
                    z6.a.Q((m9.d0) obj3, null, 0, new h0(dVar, j10, null), 3);
                    return lVar;
                }
                Object objE = dVar.e(new d1.c(j10), eVar);
                return objE == v8.a.f15963a ? objE : lVar;
            case 1:
                x.k kVar = (x.k) obj;
                if (kVar instanceof x.o) {
                    ((j0.u) obj2).e((x.o) kVar, (m9.d0) obj3);
                } else if (kVar instanceof x.p) {
                    ((j0.u) obj2).g(((x.p) kVar).f16280a);
                } else if (kVar instanceof x.n) {
                    ((j0.u) obj2).g(((x.n) kVar).f16278a);
                } else {
                    m9.d0 d0Var = (m9.d0) obj3;
                    j0.b0 b0Var = ((j0.u) obj2).f8318a;
                    b0Var.getClass();
                    boolean z10 = kVar instanceof x.h;
                    if (z10) {
                        ((List) b0Var.f8251d).add(kVar);
                    } else if (kVar instanceof x.i) {
                        ((List) b0Var.f8251d).remove(((x.i) kVar).f16273a);
                    } else if (kVar instanceof x.d) {
                        ((List) b0Var.f8251d).add(kVar);
                    } else if (kVar instanceof x.e) {
                        ((List) b0Var.f8251d).remove(((x.e) kVar).f16266a);
                    } else if (kVar instanceof x.b) {
                        ((List) b0Var.f8251d).add(kVar);
                    } else if (kVar instanceof x.c) {
                        ((List) b0Var.f8251d).remove(((x.c) kVar).f16265a);
                    } else if (kVar instanceof x.a) {
                        ((List) b0Var.f8251d).remove(((x.a) kVar).f16264a);
                    }
                    x.k kVar2 = (x.k) r8.p.M0((List) b0Var.f8251d);
                    if (!d7.a.d((x.k) b0Var.f8252e, kVar2)) {
                        if (kVar2 != null) {
                            if (z10) {
                                f10 = ((j0.h) ((l3) b0Var.f8249b).getValue()).f8273c;
                            } else if (kVar instanceof x.d) {
                                f10 = ((j0.h) ((l3) b0Var.f8249b).getValue()).f8272b;
                            } else {
                                f10 = kVar instanceof x.b ? ((j0.h) ((l3) b0Var.f8249b).getValue()).f8271a : 0.0f;
                            }
                            w1 w1Var = j0.v.f8319a;
                            boolean z11 = kVar2 instanceof x.h;
                            w1 w1Var2 = j0.v.f8319a;
                            if (!z11 && ((kVar2 instanceof x.d) || (kVar2 instanceof x.b))) {
                                w1Var2 = new w1(45, t.d0.f14122c, 2);
                            }
                            z6.a.Q(d0Var, null, 0, new j0.z(b0Var, f10, w1Var2, null), 3);
                        } else {
                            x.k kVar3 = (x.k) b0Var.f8252e;
                            w1 w1Var3 = j0.v.f8319a;
                            boolean z12 = kVar3 instanceof x.h;
                            w1 w1Var4 = j0.v.f8319a;
                            if (!z12 && !(kVar3 instanceof x.d) && (kVar3 instanceof x.b)) {
                                w1Var4 = new w1(150, t.d0.f14122c, 2);
                            }
                            z6.a.Q(d0Var, null, 0, new j0.a0(b0Var, w1Var4, null), 3);
                        }
                        b0Var.f8252e = kVar2;
                    }
                }
                return lVar;
            default:
                return b(((Number) obj).intValue(), eVar);
        }
    }
}
