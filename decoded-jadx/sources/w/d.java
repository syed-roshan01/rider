package w;

import b0.a0;
import b0.c0;
import b0.h0;
import b0.o0;
import b0.p;
import b0.x;
import d7.t;
import d9.r;
import m9.d0;
import t.d2;
import t.n;
import t.o;
import t.x1;
import t.y1;
import v.h1;
import v.r1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f15984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f15986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f15987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.c f15988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f15989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f10, r1 r1Var, h hVar, u8.e eVar, c9.c cVar) {
        super(2, eVar);
        this.f15986c = hVar;
        this.f15987d = f10;
        this.f15988e = cVar;
        this.f15989f = r1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h hVar = this.f15986c;
        return new d(this.f15987d, this.f15989f, hVar, eVar, this.f15988e);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        Object objB;
        char c10;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15985b;
        int i11 = 0;
        c9.c cVar = this.f15988e;
        h hVar = this.f15986c;
        if (i10 == 0) {
            t.v0(obj);
            p pVar = hVar.f15997a;
            h0 h0Var = pVar.f2454a;
            int iN = h0Var.n() + h0Var.l();
            x1 x1Var = y1.f14355a;
            d2 d2Var = new d2(pVar.f2456c.f14353a);
            t.p pVar2 = new t.p(0.0f);
            float f10 = this.f15987d;
            float f11 = ((t.p) d2Var.a(pVar2, new t.p(f10))).f14272a;
            int i12 = f10 < 0.0f ? h0Var.f2398f + 1 : h0Var.f2398f;
            int iR = z6.a.r(((int) (f11 / iN)) + i12, 0, h0Var.k());
            h0Var.l();
            h0Var.n();
            int i13 = ((c0) pVar.f2457d).f2343a;
            int iAbs = Math.abs((z6.a.r(z6.a.r(iR, i12 - i13, i13 + i12), 0, h0Var.k()) - i12) * iN) - iN;
            if (iAbs < 0) {
                iAbs = 0;
            }
            float fSignum = Math.signum(f10) * Math.abs(iAbs == 0 ? iAbs : iAbs * Math.signum(f10));
            rVar = new r();
            rVar.f4949a = fSignum;
            cVar.invoke(new Float(fSignum));
            h hVar2 = this.f15986c;
            r1 r1Var = this.f15989f;
            float f12 = rVar.f4949a;
            float f13 = this.f15987d;
            c cVar2 = new c(rVar, cVar, 1);
            this.f15984a = rVar;
            this.f15985b = 1;
            objB = h.b(hVar2, r1Var, f12, f13, cVar2, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.v0(obj);
                return obj;
            }
            r rVar2 = this.f15984a;
            t.v0(obj);
            rVar = rVar2;
            objB = obj;
        }
        o oVar = (o) objB;
        p pVar3 = hVar.f15997a;
        float fFloatValue = ((Number) oVar.b()).floatValue();
        h0 h0Var2 = pVar3.f2454a;
        int iN2 = h0Var2.n() + h0Var2.l();
        a0 a0Var = h0Var2.f2397e;
        int iD = a0Var.f2318b.d();
        int iM = d9.i.m(iN2, h0Var2);
        int size = ((x) h0Var2.j()).f2493a.size() / 2;
        int i14 = iD;
        int i15 = iM;
        float f14 = Float.POSITIVE_INFINITY;
        float f15 = Float.NEGATIVE_INFINITY;
        while (true) {
            int i16 = iD - size;
            if (i16 >= 0) {
                i11 = i16;
            }
            if (i14 < i11) {
                break;
            }
            f6.a.Q(h0Var2.j());
            int i17 = ((x) h0Var2.j()).f2498f;
            int i18 = ((x) h0Var2.j()).f2496d;
            int i19 = ((x) h0Var2.j()).f2494b;
            float f16 = o0.f2450a;
            v8.a aVar2 = aVar;
            float f17 = i15 - 0;
            if (f17 <= 0.0f && f17 > f15) {
                f15 = f17;
            }
            if (f17 >= 0.0f && f17 < f14) {
                f14 = f17;
            }
            i15 -= iN2;
            i14--;
            aVar = aVar2;
            i11 = 0;
        }
        v8.a aVar3 = aVar;
        int i20 = iD + 1;
        int i21 = iM + iN2;
        while (true) {
            int i22 = iD + size;
            int iK = h0Var2.k() - 1;
            if (i22 > iK) {
                i22 = iK;
            }
            if (i20 > i22) {
                break;
            }
            f6.a.Q(h0Var2.j());
            int i23 = ((x) h0Var2.j()).f2498f;
            int i24 = ((x) h0Var2.j()).f2496d;
            int i25 = ((x) h0Var2.j()).f2494b;
            float f18 = o0.f2450a;
            float f19 = i21 - 0;
            if (f19 >= 0.0f && f19 < f14) {
                f14 = f19;
            }
            if (f19 <= 0.0f && f19 > f15) {
                f15 = f19;
            }
            i21 += iN2;
            i20++;
        }
        if (f15 == Float.NEGATIVE_INFINITY) {
            f15 = f14;
        }
        if (f14 == Float.POSITIVE_INFINITY) {
            f14 = f15;
        }
        Float fValueOf = Float.valueOf(f15);
        Float fValueOf2 = Float.valueOf(f14);
        float fFloatValue2 = fValueOf.floatValue();
        float fFloatValue3 = fValueOf2.floatValue();
        h1 h1Var = ((x) h0Var2.j()).f2497e;
        h1 h1Var2 = h1.f15594b;
        boolean z10 = (h1Var == h1Var2 ? d1.c.d(h0Var2.o()) : d1.c.e(h0Var2.o())) < 0.0f;
        float fD = (((x) h0Var2.j()).f2497e == h1Var2 ? d1.c.d(h0Var2.o()) : d1.c.e(h0Var2.o())) / ((x) h0Var2.j()).f2494b;
        float f20 = fD - ((int) fD);
        if (Math.abs(fFloatValue) < h0Var2.f2409q.v(l.f16018a)) {
            c10 = 0;
        } else {
            c10 = fFloatValue > 0.0f ? (char) 1 : (char) 2;
        }
        if (c10 == 0) {
            fFloatValue2 = Math.abs(f20) > pVar3.f2455b ? fFloatValue3 : fFloatValue3;
        } else if (c10 != 1) {
            if (c10 != 2) {
                fFloatValue2 = 0.0f;
            }
        }
        float f21 = (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) ? 0.0f : fFloatValue2;
        rVar.f4949a = f21;
        r1 r1Var2 = this.f15989f;
        o oVarK = t.e.k(oVar, 0.0f, 0.0f, 30);
        n nVar = hVar.f16000d;
        c cVar3 = new c(rVar, cVar, 0);
        this.f15984a = null;
        this.f15985b = 2;
        Object objB2 = l.b(r1Var2, f21, f21, oVarK, nVar, cVar3, this);
        return objB2 == aVar3 ? aVar3 : objB2;
    }
}
