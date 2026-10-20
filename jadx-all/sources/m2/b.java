package m2;

import d7.t;
import o1.s;
import q.a0;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    default int E(long j10) {
        return t.p0(Z(j10));
    }

    default float F(long j10) {
        float fC;
        float fM;
        if (!o.a(n.b(j10), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        a0 a0Var = n2.b.f12125a;
        if (m() < n2.b.f12127c || ((Boolean) h.f11806a.getValue()).booleanValue()) {
            fC = n.c(j10);
            fM = m();
        } else {
            n2.a aVarA = n2.b.a(m());
            fC = n.c(j10);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fM = m();
        }
        return fM * fC;
    }

    default int J(float f10) {
        float fV = v(f10);
        if (Float.isInfinite(fV)) {
            return Integer.MAX_VALUE;
        }
        return t.p0(fV);
    }

    default long S(long j10) {
        return j10 != g.f11803c ? t.j(v(g.b(j10)), v(g.a(j10))) : d1.f.f4345c;
    }

    default float Z(long j10) {
        if (o.a(n.b(j10), 4294967296L)) {
            return v(F(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    float c();

    default long e0(float f10) {
        return t(q0(f10));
    }

    float m();

    default float o0(int i10) {
        return i10 / c();
    }

    default float q0(float f10) {
        return f10 / c();
    }

    default long t(float f10) {
        a0 a0Var = n2.b.f12125a;
        if (!(m() >= n2.b.f12127c) || ((Boolean) h.f11806a.getValue()).booleanValue()) {
            return s.c0(f10 / m(), 4294967296L);
        }
        n2.a aVarA = n2.b.a(m());
        return s.c0(aVarA != null ? aVarA.a(f10) : f10 / m(), 4294967296L);
    }

    default long u(long j10) {
        int i10 = d1.f.f4346d;
        if (j10 != d1.f.f4345c) {
            return i1.b.b(q0(d1.f.d(j10)), q0(d1.f.b(j10)));
        }
        int i11 = g.f11804d;
        return g.f11803c;
    }

    default float v(float f10) {
        return c() * f10;
    }
}
