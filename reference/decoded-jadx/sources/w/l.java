package w;

import d7.t;
import d9.r;
import t.n;
import t.o;
import t.y;
import v.r1;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f16018a = 400;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(r1 r1Var, float f10, o oVar, y yVar, c cVar, u8.e eVar) {
        i iVar;
        o oVar2;
        r rVar;
        float f11;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i10 = iVar.f16006e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f16006e = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object obj = iVar.f16005d;
        v8.a aVar = v8.a.f15963a;
        int i11 = iVar.f16006e;
        if (i11 == 0) {
            t.v0(obj);
            r rVar2 = new r();
            boolean z10 = ((Number) oVar.b()).floatValue() == 0.0f;
            j jVar = new j(f10, rVar2, r1Var, cVar, 0);
            iVar.f16003b = oVar;
            iVar.f16004c = rVar2;
            iVar.f16002a = f10;
            iVar.f16006e = 1;
            if (t.e.e(oVar, yVar, !z10, jVar, iVar) == aVar) {
                return aVar;
            }
            oVar2 = oVar;
            rVar = rVar2;
            f11 = f10;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f11 = iVar.f16002a;
            rVar = iVar.f16004c;
            oVar2 = iVar.f16003b;
            t.v0(obj);
        }
        return new a(new Float(f11 - rVar.f4949a), oVar2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object b(r1 r1Var, float f10, float f11, o oVar, n nVar, c cVar, u8.e eVar) {
        k kVar;
        o oVar2;
        float f12;
        r rVar;
        float f13 = f10;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i10 = kVar.f16017f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f16017f = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f16016e;
        v8.a aVar = v8.a.f15963a;
        int i11 = kVar2.f16017f;
        if (i11 == 0) {
            t.v0(obj);
            r rVar2 = new r();
            float fFloatValue = ((Number) oVar.b()).floatValue();
            Float f14 = new Float(f13);
            boolean z10 = ((Number) oVar.b()).floatValue() == 0.0f;
            j jVar = new j(f11, rVar2, r1Var, cVar, 1);
            oVar2 = oVar;
            kVar2.f16014c = oVar2;
            kVar2.f16015d = rVar2;
            kVar2.f16012a = f13;
            kVar2.f16013b = fFloatValue;
            kVar2.f16017f = 1;
            f12 = fFloatValue;
            if (t.e.g(oVar, f14, nVar, !z10, jVar, kVar2) == aVar) {
                return aVar;
            }
            rVar = rVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f15 = kVar2.f16013b;
            float f16 = kVar2.f16012a;
            rVar = kVar2.f16015d;
            o oVar3 = kVar2.f16014c;
            t.v0(obj);
            f12 = f15;
            f13 = f16;
            oVar2 = oVar3;
        }
        return new a(new Float(f13 - rVar.f4949a), t.e.k(oVar2, 0.0f, c(((Number) oVar2.b()).floatValue(), f12), 29));
    }

    public static final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? z6.a.o(f10, f11) : z6.a.m(f10, f11);
    }
}
