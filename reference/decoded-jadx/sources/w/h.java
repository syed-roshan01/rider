package w;

import a4.c0;
import b0.p;
import d7.t;
import t.d2;
import t.n;
import t.o;
import t.x1;
import t.y;
import t.y1;
import v.h2;
import v.r1;
import v.v1;
import v.y0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f15997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f15999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f16000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v1 f16001e = androidx.compose.foundation.gestures.a.f1635d;

    public h(p pVar, n nVar, y yVar, n nVar2) {
        this.f15997a = pVar;
        this.f15998b = nVar;
        this.f15999c = yVar;
        this.f16000d = nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object b(h hVar, r1 r1Var, float f10, float f11, c cVar, u8.e eVar) {
        g gVar;
        o oVarB;
        Object objE;
        hVar.getClass();
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i10 = gVar.f15996c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f15996c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(hVar, eVar);
            }
        } else {
            gVar = new g(hVar, eVar);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f15994a;
        v8.a aVar = v8.a.f15963a;
        int i11 = gVar2.f15996c;
        int i12 = 1;
        if (i11 == 0) {
            t.v0(obj);
            if (Math.abs(f10) == 0.0f || Math.abs(f11) == 0.0f) {
                oVarB = t.e.b(f10, f11);
            } else {
                gVar2.f15996c = 1;
                x1 x1Var = y1.f14355a;
                y yVar = hVar.f15999c;
                c0 c0Var = Math.abs(((t.p) new d2(yVar.f14353a).a(new t.p(0.0f), new t.p(f11))).f14272a) >= Math.abs(f10) ? new c0(yVar, 0) : new c0(hVar.f15998b, i12);
                float f12 = l.f16018a;
                Float f13 = new Float(f10);
                Float f14 = new Float(f11);
                switch (c0Var.f1079a) {
                    case 0:
                        objE = c0Var.e(r1Var, f13.floatValue(), f14.floatValue(), cVar, gVar2);
                        break;
                    default:
                        objE = c0Var.e(r1Var, f13.floatValue(), f14.floatValue(), cVar, gVar2);
                        break;
                }
                obj = objE;
                if (obj == aVar) {
                    return aVar;
                }
            }
            return oVarB;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.v0(obj);
        oVarB = ((a) obj).f15976b;
        return oVarB;
    }

    @Override // v.y0
    public final Object a(h2 h2Var, float f10, u8.e eVar) {
        return d(h2Var, f10, e.f15990a, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(h2 h2Var, float f10, c9.c cVar, u8.e eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f15980d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f15980d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        Object objU0 = bVar.f15978b;
        v8.a aVar = v8.a.f15963a;
        int i11 = bVar.f15980d;
        if (i11 == 0) {
            t.v0(objU0);
            v1 v1Var = this.f16001e;
            d dVar = new d(f10, h2Var, this, null, cVar);
            bVar.f15977a = cVar;
            bVar.f15980d = 1;
            objU0 = z6.a.u0(v1Var, dVar, bVar);
            if (objU0 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = bVar.f15977a;
            t.v0(objU0);
        }
        a aVar2 = (a) objU0;
        cVar.invoke(new Float(0.0f));
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(h2 h2Var, float f10, c9.c cVar, u8.e eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i10 = fVar.f15993c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f15993c = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, eVar);
            }
        } else {
            fVar = new f(this, eVar);
        }
        Object objC = fVar.f15991a;
        Object obj = v8.a.f15963a;
        int i11 = fVar.f15993c;
        if (i11 == 0) {
            t.v0(objC);
            fVar.f15993c = 1;
            objC = c(h2Var, f10, cVar, fVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(objC);
        }
        a aVar = (a) objC;
        return new Float(((Number) aVar.f15975a).floatValue() != 0.0f ? ((Number) aVar.f15976b.b()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return d7.a.d(hVar.f16000d, this.f16000d) && d7.a.d(hVar.f15999c, this.f15999c) && d7.a.d(hVar.f15998b, this.f15998b) && d7.a.d(hVar.f15997a, this.f15997a);
    }

    public final int hashCode() {
        return this.f15997a.hashCode() + ((this.f15998b.hashCode() + ((this.f15999c.hashCode() + (this.f16000d.hashCode() * 31)) * 31)) * 31);
    }
}
