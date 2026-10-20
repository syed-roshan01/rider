package androidx.compose.ui.layout;

import c9.f;
import d1.c;
import d1.d;
import d9.i;
import r1.d1;
import r1.i0;
import r1.s;
import r1.t;
import r1.u;
import s.h;
import t1.c1;
import t1.r0;
import t1.x;
import u0.b;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = d1.f13355b;
        return jFloatToRawIntBits;
    }

    public static final d b(x xVar) {
        s sVarJ = xVar.j();
        if (sVarJ != null) {
            return ((c1) sVarJ).b(xVar, true);
        }
        long j10 = xVar.f13425c;
        return new d(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final d c(s sVar) {
        s sVarD = d(sVar);
        d dVarB = d(sVar).b(sVar, true);
        float fM = (int) (sVarD.M() >> 32);
        float fM2 = (int) (sVarD.M() & 4294967295L);
        float fQ = z6.a.q(dVarB.f4332a, 0.0f, fM);
        float fQ2 = z6.a.q(dVarB.f4333b, 0.0f, fM2);
        float fQ3 = z6.a.q(dVarB.f4334c, 0.0f, fM);
        float fQ4 = z6.a.q(dVarB.f4335d, 0.0f, fM2);
        if (fQ == fQ3 || fQ2 == fQ4) {
            return d.f4331e;
        }
        long jI = sVarD.i(i.f(fQ, fQ2));
        long jI2 = sVarD.i(i.f(fQ3, fQ2));
        long jI3 = sVarD.i(i.f(fQ3, fQ4));
        long jI4 = sVarD.i(i.f(fQ, fQ4));
        float fD = c.d(jI);
        float[] fArr = {c.d(jI2), c.d(jI4), c.d(jI3)};
        for (int i10 = 0; i10 < 3; i10++) {
            fD = Math.min(fD, fArr[i10]);
        }
        float fE = c.e(jI);
        float[] fArr2 = {c.e(jI2), c.e(jI4), c.e(jI3)};
        for (int i11 = 0; i11 < 3; i11++) {
            fE = Math.min(fE, fArr2[i11]);
        }
        float fD2 = c.d(jI);
        float[] fArr3 = {c.d(jI2), c.d(jI4), c.d(jI3)};
        for (int i12 = 0; i12 < 3; i12++) {
            fD2 = Math.max(fD2, fArr3[i12]);
        }
        float fE2 = c.e(jI);
        float[] fArr4 = {c.e(jI2), c.e(jI4), c.e(jI3)};
        for (int i13 = 0; i13 < 3; i13++) {
            fE2 = Math.max(fE2, fArr4[i13]);
        }
        return new d(fD, fE, fD2, fE2);
    }

    public static final s d(s sVar) {
        s sVar2;
        s sVarJ = sVar.j();
        while (true) {
            s sVar3 = sVarJ;
            sVar2 = sVar;
            sVar = sVar3;
            if (sVar == null) {
                break;
            }
            sVarJ = sVar.j();
        }
        c1 c1Var = sVar2 instanceof c1 ? (c1) sVar2 : null;
        if (c1Var == null) {
            return sVar2;
        }
        c1 c1Var2 = c1Var.f14397r;
        while (true) {
            c1 c1Var3 = c1Var2;
            c1 c1Var4 = c1Var;
            c1Var = c1Var3;
            if (c1Var == null) {
                return c1Var4;
            }
            c1Var2 = c1Var.f14397r;
        }
    }

    public static final Object e(i0 i0Var) {
        Object objA = i0Var.a();
        u uVar = objA instanceof u ? (u) objA : null;
        if (uVar != null) {
            return ((t) uVar).f13412u;
        }
        return null;
    }

    public static final r0 f(r0 r0Var) {
        androidx.compose.ui.node.a aVar = r0Var.f14536p.f14395p;
        while (true) {
            androidx.compose.ui.node.a aVarQ = aVar.q();
            androidx.compose.ui.node.a aVar2 = null;
            if ((aVarQ != null ? aVarQ.f1738c : null) == null) {
                r0 r0VarI0 = aVar.C.f14577c.I0();
                d7.a.j(r0VarI0);
                return r0VarI0;
            }
            androidx.compose.ui.node.a aVarQ2 = aVar.q();
            if (aVarQ2 != null) {
                aVar2 = aVarQ2.f1738c;
            }
            d7.a.j(aVar2);
            androidx.compose.ui.node.a aVarQ3 = aVar.q();
            d7.a.j(aVarQ3);
            aVar = aVarQ3.f1738c;
            d7.a.j(aVar);
        }
    }

    public static final o g(o oVar, f fVar) {
        return oVar.j(new LayoutElement(fVar));
    }

    public static final o h(o oVar, String str) {
        return oVar.j(new LayoutIdElement(str));
    }

    public static final b i(o oVar) {
        return new b(-1586257396, new h(oVar, 7), true);
    }

    public static final o j(o oVar, c9.c cVar) {
        return oVar.j(new OnGloballyPositionedElement(cVar));
    }

    public static final long k(s sVar) {
        return sVar.P(c.f4326b);
    }

    public static final long l(long j10, long j11) {
        float fD = d1.f.d(j10);
        long j12 = d1.f13354a;
        if (j11 == j12) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * fD;
        float fB = d1.f.b(j10);
        if (j11 != j12) {
            return d7.t.j(fIntBitsToFloat, Float.intBitsToFloat((int) (j11 & 4294967295L)) * fB);
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}
