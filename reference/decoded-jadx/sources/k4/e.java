package k4;

import d7.t;
import m9.d1;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f9750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.n f9751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9.f f9752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f9753d;

    public e(o oVar, s4.n nVar, u9.i iVar, k kVar) {
        this.f9750a = oVar;
        this.f9751b = nVar;
        this.f9752c = iVar;
        this.f9753d = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(u8.e eVar) throws Throwable {
        d dVar;
        u9.f fVar;
        int andDecrement;
        int i10;
        e eVar2;
        u9.f fVar2;
        Throwable th;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i11 = dVar.f9749e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f9749e = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, eVar);
            }
        } else {
            dVar = new d(this, eVar);
        }
        Object obj = dVar.f9747c;
        v8.a aVar = v8.a.f15963a;
        int i12 = dVar.f9749e;
        try {
            if (i12 == 0) {
                t.v0(obj);
                dVar.f9745a = this;
                fVar = this.f9752c;
                dVar.f9746b = fVar;
                dVar.f9749e = 1;
                u9.i iVar = (u9.i) fVar;
                iVar.getClass();
                do {
                    andDecrement = u9.i.f15455g.getAndDecrement(iVar);
                    i10 = iVar.f15456a;
                } while (andDecrement > i10);
                Object obj2 = q8.l.f13235a;
                if (andDecrement <= 0) {
                    m9.l lVarW = d7.a.w(t.b0(dVar));
                    try {
                        if (!iVar.a(lVarW)) {
                            while (true) {
                                int andDecrement2 = u9.i.f15455g.getAndDecrement(iVar);
                                if (andDecrement2 <= i10) {
                                    if (andDecrement2 > 0) {
                                        lVarW.o(iVar.f15457b, obj2);
                                        break;
                                    }
                                    if (iVar.a(lVarW)) {
                                        break;
                                    }
                                }
                            }
                        }
                        Object objS = lVarW.s();
                        if (objS != aVar) {
                            objS = obj2;
                        }
                        if (objS == aVar) {
                            obj2 = objS;
                        }
                    } catch (Throwable th2) {
                        lVarW.C();
                        throw th2;
                    }
                }
                if (obj2 == aVar) {
                    return aVar;
                }
                eVar2 = this;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar2 = (u9.f) dVar.f9745a;
                    try {
                        t.v0(obj);
                        g gVar = (g) obj;
                        ((u9.i) fVar2).b();
                        return gVar;
                    } catch (Throwable th3) {
                        th = th3;
                        ((u9.i) fVar2).b();
                        throw th;
                    }
                }
                u9.f fVar3 = dVar.f9746b;
                eVar2 = (e) dVar.f9745a;
                t.v0(obj);
                fVar = fVar3;
            }
            z0 z0Var = new z0(eVar2, 9);
            dVar.f9745a = fVar;
            dVar.f9746b = null;
            dVar.f9749e = 2;
            Object objU0 = z6.a.u0(u8.k.f15438a, new d1(z0Var, null), dVar);
            if (objU0 == aVar) {
                return aVar;
            }
            fVar2 = fVar;
            obj = objU0;
            g gVar2 = (g) obj;
            ((u9.i) fVar2).b();
            return gVar2;
        } catch (Throwable th4) {
            fVar2 = fVar;
            th = th4;
            ((u9.i) fVar2).b();
            throw th;
        }
    }
}
