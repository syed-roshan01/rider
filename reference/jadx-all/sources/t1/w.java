package t1;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w extends r0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14567v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f14568w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 c0Var) {
        super(c0Var);
        this.f14568w = c0Var;
    }

    @Override // r1.p
    public final int Q(int i10) {
        switch (this.f14567v) {
            case 0:
                y yVar = this.f14536p.f14395p.f1751w;
                r1.j0 j0VarA = yVar.a();
                androidx.compose.ui.node.a aVar = yVar.f14583a;
                return j0VarA.d(aVar.C.f14577c, aVar.k(), i10);
            default:
                c0 c0Var = (c0) this.f14568w;
                b0 b0Var = c0Var.N;
                c1 c1Var = c0Var.f14396q;
                d7.a.j(c1Var);
                r0 r0VarI0 = c1Var.I0();
                d7.a.j(r0VarI0);
                return b0Var.d(this, r0VarI0, i10);
        }
    }

    @Override // r1.p
    public final int V(int i10) {
        switch (this.f14567v) {
            case 0:
                y yVar = this.f14536p.f14395p.f1751w;
                r1.j0 j0VarA = yVar.a();
                androidx.compose.ui.node.a aVar = yVar.f14583a;
                return j0VarA.b(aVar.C.f14577c, aVar.k(), i10);
            default:
                c0 c0Var = (c0) this.f14568w;
                b0 b0Var = c0Var.N;
                c1 c1Var = c0Var.f14396q;
                d7.a.j(c1Var);
                r0 r0VarI0 = c1Var.I0();
                d7.a.j(r0VarI0);
                return b0Var.b(this, r0VarI0, i10);
        }
    }

    @Override // r1.p
    public final int X(int i10) {
        switch (this.f14567v) {
            case 0:
                y yVar = this.f14536p.f14395p.f1751w;
                r1.j0 j0VarA = yVar.a();
                androidx.compose.ui.node.a aVar = yVar.f14583a;
                return j0VarA.c(aVar.C.f14577c, aVar.k(), i10);
            default:
                c0 c0Var = (c0) this.f14568w;
                b0 b0Var = c0Var.N;
                c1 c1Var = c0Var.f14396q;
                d7.a.j(c1Var);
                r0 r0VarI0 = c1Var.I0();
                d7.a.j(r0VarI0);
                return b0Var.h(this, r0VarI0, i10);
        }
    }

    @Override // r1.i0
    public final r1.x0 f(long j10) {
        switch (this.f14567v) {
            case 0:
                h0(j10);
                c1 c1Var = this.f14536p;
                o0.i iVarT = c1Var.f14395p.t();
                int i10 = iVarT.f12343c;
                if (i10 > 0) {
                    Object[] objArr = iVarT.f12341a;
                    int i11 = 0;
                    do {
                        k0 k0Var = ((androidx.compose.ui.node.a) objArr[i11]).D.f14509p;
                        d7.a.j(k0Var);
                        k0Var.f14466p = 3;
                        i11++;
                    } while (i11 < i10);
                }
                androidx.compose.ui.node.a aVar = c1Var.f14395p;
                r0.y0(this, aVar.f1750v.e(this, aVar.k(), j10));
                break;
            default:
                c0 c0Var = (c0) this.f14568w;
                h0(j10);
                c0Var.getClass();
                b0 b0Var = c0Var.N;
                c1 c1Var2 = c0Var.f14396q;
                d7.a.j(c1Var2);
                r0 r0VarI0 = c1Var2.I0();
                d7.a.j(r0VarI0);
                r0.y0(this, b0Var.f(this, r0VarI0, j10));
                break;
        }
        return this;
    }

    @Override // r1.p
    public final int g(int i10) {
        switch (this.f14567v) {
            case 0:
                y yVar = this.f14536p.f14395p.f1751w;
                r1.j0 j0VarA = yVar.a();
                androidx.compose.ui.node.a aVar = yVar.f14583a;
                return j0VarA.a(aVar.C.f14577c, aVar.k(), i10);
            default:
                c0 c0Var = (c0) this.f14568w;
                b0 b0Var = c0Var.N;
                c1 c1Var = c0Var.f14396q;
                d7.a.j(c1Var);
                r0 r0VarI0 = c1Var.I0();
                d7.a.j(r0VarI0);
                return b0Var.a(this, r0VarI0, i10);
        }
    }

    @Override // t1.q0
    public final int j0(r1.a aVar) {
        LinkedHashMap linkedHashMap = this.f14541u;
        switch (this.f14567v) {
            case 0:
                k0 k0Var = this.f14536p.f14395p.D.f14509p;
                d7.a.j(k0Var);
                boolean z10 = k0Var.f14467q;
                o0 o0Var = k0Var.f14473w;
                if (!z10) {
                    n0 n0Var = k0Var.D;
                    if (n0Var.f14496c == 2) {
                        o0Var.f14373f = true;
                        if (o0Var.f14369b) {
                            n0Var.f14501h = true;
                            n0Var.f14502i = true;
                        }
                    } else {
                        o0Var.f14374g = true;
                    }
                }
                r0 r0Var = k0Var.l().O;
                if (r0Var != null) {
                    r0Var.f14532n = true;
                }
                k0Var.B();
                r0 r0Var2 = k0Var.l().O;
                if (r0Var2 != null) {
                    r0Var2.f14532n = false;
                }
                Integer num = (Integer) o0Var.f14376i.get(aVar);
                int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
                linkedHashMap.put(aVar, Integer.valueOf(iIntValue));
                return iIntValue;
            default:
                int iC = g.c(this, aVar);
                linkedHashMap.put(aVar, Integer.valueOf(iC));
                return iC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super(xVar);
        this.f14568w = xVar;
    }
}
