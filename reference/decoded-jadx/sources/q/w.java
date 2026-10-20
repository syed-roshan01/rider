package q;

import android.view.Choreographer;
import b0.h0;
import b0.q0;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import e1.c0;
import e1.d0;
import e1.i0;
import e1.l0;
import f0.a2;
import java.util.List;
import java.util.concurrent.CancellationException;
import m0.e0;
import m0.g2;
import m0.k1;
import m0.l1;
import m0.l3;
import m0.n0;
import m0.n1;
import m0.o0;
import m9.f1;
import m9.p1;
import o7.i2;
import r1.a1;
import s.m0;
import t.u1;
import u.p2;
import u.v0;
import u.x0;
import v.e2;
import z.g0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, int i10) {
        super(1);
        this.f13036a = i10;
        this.f13037b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x013c A[PHI: r16
  0x013c: PHI (r16v5 int) = (r16v3 int), (r16v6 int) binds: [B:62:0x013a, B:57:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    public final Float a(float f10) {
        boolean z10;
        boolean z11;
        float f11;
        float fM;
        a1 a1Var;
        int i10;
        boolean z12;
        int i11;
        float fD = f10;
        q8.l lVar = q8.l.f13235a;
        int i12 = this.f13036a;
        Object obj = this.f13037b;
        switch (i12) {
            case 8:
                float f12 = fD;
                p2 p2Var = (p2) obj;
                float fD2 = p2Var.f14884a.d() + f12 + p2Var.f14888e;
                float fQ = z6.a.q(fD2, 0.0f, p2Var.f14887d.d());
                if (fD2 == fQ) {
                    z10 = true;
                    z11 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                boolean z13 = z10 ^ z11;
                l1 l1Var = p2Var.f14884a;
                float fD3 = fQ - l1Var.d();
                int iP0 = d7.t.p0(fD3);
                l1Var.f(l1Var.d() + iP0);
                p2Var.f14888e = fD3 - iP0;
                if (z13) {
                    f12 = fD3;
                }
                return Float.valueOf(f12);
            case Code.UNAVAILABLE /* 14 */:
                g0 g0Var = (g0) obj;
                float f13 = -f10;
                if ((f13 < 0.0f && !g0Var.d()) || (f13 > 0.0f && !g0Var.a())) {
                    f11 = 0.0f;
                } else {
                    if (Math.abs(g0Var.f17050f) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + g0Var.f17050f).toString());
                    }
                    float f14 = g0Var.f17050f + f13;
                    g0Var.f17050f = f14;
                    if (Math.abs(f14) > 0.5f) {
                        n1 n1Var = g0Var.f17048d;
                        z.w wVar = (z.w) n1Var.getValue();
                        float f15 = g0Var.f17050f;
                        int iP1 = d7.t.p0(f15);
                        z.w wVar2 = g0Var.f17046b;
                        boolean zC = wVar.c(iP1, !g0Var.f17045a);
                        if (zC && wVar2 != null) {
                            zC = wVar2.c(iP1, true);
                        }
                        if (zC) {
                            g0Var.f(wVar, g0Var.f17045a, true);
                            g0Var.f17066v.setValue(lVar);
                            g0Var.g(f15 - g0Var.f17050f, wVar);
                        } else {
                            a1 a1Var2 = g0Var.f17057m;
                            if (a1Var2 != null) {
                                ((androidx.compose.ui.node.a) a1Var2).j();
                            }
                            g0Var.g(f15 - g0Var.f17050f, (z.u) n1Var.getValue());
                        }
                    }
                    if (Math.abs(g0Var.f17050f) > 0.5f) {
                        f13 -= g0Var.f17050f;
                        g0Var.f17050f = 0.0f;
                    }
                    f11 = f13;
                }
                return Float.valueOf(-f11);
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                h0 h0Var = (h0) obj;
                b0.a0 a0Var = h0Var.f2397e;
                float fD4 = a0Var.f2318b.d();
                k1 k1Var = a0Var.f2319c;
                float fD5 = k1Var.d() + fD4;
                h0 h0Var2 = a0Var.f2317a;
                float fP0 = d7.t.p0(fD5 * h0Var2.m());
                float f16 = fP0 + fD + h0Var.f2401i;
                float fQ2 = z6.a.q(f16, 0.0f, h0Var.f2400h);
                boolean z14 = !(f16 == fQ2);
                float f17 = fQ2 - fP0;
                h0Var.f2402j = f17;
                if (Math.abs(f17) != 0.0f) {
                    h0Var.f2396d.setValue(Boolean.valueOf(f17 > 0.0f));
                }
                int iP2 = d7.t.p0(f17);
                b0.x xVar = (b0.x) h0Var.f2408p.getValue();
                int i13 = -iP2;
                int i14 = xVar.f2494b + xVar.f2495c;
                if (xVar.f2506n) {
                    if (h0Var2.m() == 0) {
                        fM = 0.0f;
                    } else {
                        fM = iP2 / h0Var2.m();
                    }
                    k1Var.f(k1Var.d() + fM);
                    a1Var = (a1) h0Var.f2416x.getValue();
                    if (a1Var != null) {
                        ((androidx.compose.ui.node.a) a1Var).j();
                    }
                } else {
                    List list = xVar.f2493a;
                    if (list.isEmpty() || xVar.f2501i == null || (i10 = xVar.f2504l - i13) < 0 || i10 >= i14) {
                        if (h0Var2.m() == 0) {
                            fM = 0.0f;
                        } else {
                            fM = iP2 / h0Var2.m();
                        }
                        k1Var.f(k1Var.d() + fM);
                        a1Var = (a1) h0Var.f2416x.getValue();
                        if (a1Var != null) {
                            ((androidx.compose.ui.node.a) a1Var).j();
                        }
                    } else {
                        float f18 = i14 != 0 ? i13 / i14 : 0.0f;
                        float f19 = xVar.f2503k - f18;
                        if (xVar.f2502j == null || f19 >= 0.5f || f19 <= -0.5f) {
                            if (h0Var2.m() == 0) {
                                fM = 0.0f;
                            } else {
                                fM = iP2 / h0Var2.m();
                            }
                            k1Var.f(k1Var.d() + fM);
                            a1Var = (a1) h0Var.f2416x.getValue();
                            if (a1Var != null) {
                                ((androidx.compose.ui.node.a) a1Var).j();
                            }
                        } else {
                            b0.g gVar = (b0.g) r8.p.F0(list);
                            b0.g gVar2 = (b0.g) r8.p.L0(list);
                            int i15 = xVar.f2499g;
                            int i16 = xVar.f2498f;
                            if (i13 >= 0 ? Math.min(i16 - gVar.f2387m, i15 - gVar2.f2387m) <= i13 : Math.min((gVar.f2387m + i14) - i16, (gVar2.f2387m + i14) - i15) <= (-i13)) {
                                if (h0Var2.m() == 0) {
                                    fM = 0.0f;
                                } else {
                                    fM = iP2 / h0Var2.m();
                                }
                                k1Var.f(k1Var.d() + fM);
                                a1Var = (a1) h0Var.f2416x.getValue();
                                if (a1Var != null) {
                                    ((androidx.compose.ui.node.a) a1Var).j();
                                }
                            } else {
                                xVar.f2503k -= f18;
                                xVar.f2504l -= i13;
                                int size = list.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    b0.g gVar3 = (b0.g) list.get(i17);
                                    gVar3.f2387m += i13;
                                    int[] iArr = gVar3.f2386l;
                                    int length = iArr.length;
                                    int i18 = 0;
                                    while (i18 < length) {
                                        boolean z15 = gVar3.f2384j;
                                        if (z15) {
                                            i11 = size;
                                            if (i18 % 2 == 1) {
                                                iArr[i18] = iArr[i18] + i13;
                                            }
                                            i18++;
                                            size = i11;
                                        } else {
                                            i11 = size;
                                        }
                                        if (!z15 && i18 % 2 == 0) {
                                            iArr[i18] = iArr[i18] + i13;
                                        }
                                        i18++;
                                        size = i11;
                                    }
                                }
                                if (xVar.f2505m || i13 <= 0) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                    xVar.f2505m = true;
                                }
                                h0Var.h(xVar, z12);
                                h0Var.B.setValue(lVar);
                            }
                        }
                    }
                }
                h0Var.f2401i = f17 - iP2;
                if (!z14) {
                    f17 = f10;
                }
                return Float.valueOf(f17);
            default:
                a2 a2Var = (a2) obj;
                float fD6 = a2Var.f5600a.d() + fD;
                k1 k1Var2 = a2Var.f5601b;
                float fD7 = k1Var2.d();
                k1 k1Var3 = a2Var.f5600a;
                if (fD6 > fD7) {
                    fD = k1Var2.d() - k1Var3.d();
                } else if (fD6 < 0.0f) {
                    fD = -k1Var3.d();
                }
                k1Var3.f(k1Var3.d() + fD);
                return Float.valueOf(fD);
        }
    }

    public final n0 b(o0 o0Var) {
        int i10 = this.f13036a;
        Object obj = this.f13037b;
        switch (i10) {
            case 4:
                return new b.c((u1) obj, 2);
            case 15:
                return new b.c((a0.p) obj, 3);
            default:
                return new b.c((a0.z) obj, 4);
        }
    }

    public final void d(Object obj) {
        switch (this.f13036a) {
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                ((m0.x) ((e0) this.f13037b)).d(obj);
                return;
            case 26:
                if (obj instanceof w0.h0) {
                    ((w0.h0) obj).c(4);
                }
                ((t) this.f13037b).c(obj);
                return;
            default:
                w0.a0 a0Var = (w0.a0) this.f13037b;
                if (a0Var.f16029h) {
                    return;
                }
                synchronized (a0Var.f16027f) {
                    w0.z zVar = a0Var.f16030i;
                    d7.a.j(zVar);
                    Object obj2 = zVar.f16134b;
                    d7.a.j(obj2);
                    int i10 = zVar.f16136d;
                    r rVar = zVar.f16135c;
                    if (rVar == null) {
                        rVar = new r();
                        zVar.f16135c = rVar;
                        zVar.f16138f.l(obj2, rVar);
                    }
                    zVar.c(obj, i10, obj2, rVar);
                }
                return;
        }
    }

    public final void f(Throwable th) {
        switch (this.f13036a) {
            case 23:
                m0.h0.f11551a.removeFrameCallback((Choreographer.FrameCallback) this.f13037b);
                return;
            default:
                CancellationException cancellationExceptionA = d7.a.a("Recomposer effect job completed", th);
                g2 g2Var = (g2) this.f13037b;
                synchronized (g2Var.f11520b) {
                    try {
                        f1 f1Var = g2Var.f11521c;
                        if (f1Var != null) {
                            g2Var.f11536r.i(m0.a2.f11448b);
                            f1Var.a(cancellationExceptionA);
                            g2Var.f11533o = null;
                            ((p1) f1Var).U(false, true, new u.s(17, g2Var, th));
                        } else {
                            g2Var.f11522d = cancellationExceptionA;
                            g2Var.f11536r.i(m0.a2.f11447a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public final void h(o1.u uVar) {
        int i10 = this.f13036a;
        Object obj = this.f13037b;
        switch (i10) {
            case 9:
                ((c9.e) obj).invoke(uVar, new d1.c(m9.e0.I(uVar, false)));
                uVar.a();
                break;
            default:
                if (((h0.l) obj).b(uVar.f12416c)) {
                    uVar.a();
                }
                break;
        }
    }

    public final void i(r1.s sVar) {
        int i10 = this.f13036a;
        Object obj = this.f13037b;
        switch (i10) {
            case 7:
                x0 x0Var = (x0) obj;
                if (x0Var.f16742t) {
                    x0Var.f14976u.invoke(sVar);
                    c9.c cVar = x0Var.f16742t ? (c9.c) x0Var.g(v0.f14964a) : null;
                    if (cVar != null) {
                        cVar.invoke(sVar);
                    }
                }
                break;
            default:
                ((e2) obj).H.A = sVar;
                break;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f13036a;
        float fCeil = 1.0f;
        Object obj2 = this.f13037b;
        switch (i10) {
            case 0:
                return obj == ((x) obj2) ? "(this)" : String.valueOf(obj);
            case 1:
                return Boolean.valueOf(d7.a.d(obj, obj2));
            case 2:
                l3 l3Var = (l3) ((s.w) obj2).f13883d.get(obj);
                return new m2.k(l3Var != null ? ((m2.k) l3Var.getValue()).f11814a : 0L);
            case 3:
                t.s sVar = (t.s) obj;
                return new e1.r(e1.r.a(androidx.compose.ui.graphics.a.a(z6.a.q(sVar.f14307b, 0.0f, 1.0f), z6.a.q(sVar.f14308c, -0.5f, 0.5f), z6.a.q(sVar.f14309d, -0.5f, 0.5f), z6.a.q(sVar.f14306a, 0.0f, 1.0f), f1.e.f6047t), (f1.d) obj2));
            case 4:
                return b((o0) obj);
            case 5:
                b1.d dVar = (b1.d) obj;
                u.v vVar = (u.v) obj2;
                if (dVar.c() * vVar.f14961x < 0.0f || d1.f.c(dVar.f2512a.e()) <= 0.0f) {
                    return dVar.a(u.r.f14910b);
                }
                if (!m2.e.a(vVar.f14961x, 0.0f)) {
                    fCeil = (float) Math.ceil(dVar.c() * vVar.f14961x);
                }
                float f10 = 2;
                float fMin = Math.min(fCeil, (float) Math.ceil(d1.f.c(dVar.f2512a.e()) / f10));
                float f11 = fMin / f10;
                long jF = d9.i.f(f11, f11);
                long j10 = d7.t.j(d1.f.d(dVar.f2512a.e()) - fMin, d1.f.b(dVar.f2512a.e()) - fMin);
                int i11 = 1;
                boolean z10 = f10 * fMin > d1.f.c(dVar.f2512a.e());
                e1.g0 g0VarD = vVar.f14963z.d(dVar.f2512a.e(), dVar.f2512a.getLayoutDirection(), dVar);
                if (!(g0VarD instanceof c0)) {
                    if (!(g0VarD instanceof e1.b0)) {
                        throw new androidx.fragment.app.a0();
                    }
                    e1.n nVar = vVar.f14962y;
                    if (z10) {
                        jF = d1.c.f4326b;
                    }
                    long j11 = jF;
                    if (z10) {
                        j10 = dVar.f2512a.e();
                    }
                    return dVar.a(new m0(nVar, j11, j10, z10 ? g1.j.f6502a : new g1.k(fMin, 0.0f, 0, 0, 30), 1));
                }
                e1.n nVar2 = vVar.f14962y;
                c0 c0Var = (c0) g0VarD;
                boolean Z = f6.a.Z(c0Var.f4992e);
                d1.e eVar = c0Var.f4992e;
                if (Z) {
                    return dVar.a(new u.u(z10, nVar2, eVar.f4340e, f11, fMin, jF, j10, new g1.k(fMin, 0.0f, 0, 0, 30)));
                }
                if (vVar.f14960w == null) {
                    vVar.f14960w = new u.q();
                }
                u.q qVar = vVar.f14960w;
                d7.a.j(qVar);
                d0 d0VarG = qVar.f14895d;
                if (d0VarG == null) {
                    d0VarG = androidx.compose.ui.graphics.a.g();
                    qVar.f14895d = d0VarG;
                }
                e1.i iVar = (e1.i) d0VarG;
                iVar.f5014a.reset();
                iVar.a(eVar);
                if (!z10) {
                    e1.i iVarG = androidx.compose.ui.graphics.a.g();
                    iVarG.a(new d1.e(fMin, fMin, eVar.b() - fMin, eVar.a() - fMin, androidx.compose.foundation.a.m(fMin, eVar.f4340e), androidx.compose.foundation.a.m(fMin, eVar.f4341f), androidx.compose.foundation.a.m(fMin, eVar.f4342g), androidx.compose.foundation.a.m(fMin, eVar.f4343h)));
                    iVar.b(iVar, iVarG, 0);
                }
                return dVar.a(new u.s(i11, iVar, nVar2));
            case 6:
                long j12 = ((d1.c) obj).f4330a;
                u.e0 e0Var = (u.e0) obj2;
                if (e0Var.f14757w) {
                    e0Var.f14759y.invoke();
                }
                return lVar;
            case 7:
                i((r1.s) obj);
                return lVar;
            case 8:
                return a(((Number) obj).floatValue());
            case 9:
                h((o1.u) obj);
                return lVar;
            case 10:
                i((r1.s) obj);
                return lVar;
            case 11:
            case 13:
            case 22:
            default:
                e1.m0 m0Var = (e1.m0) obj2;
                i0 i0Var = (i0) ((e1.w) obj);
                i0Var.b(m0Var.f5046u);
                i0Var.d(m0Var.f5047v);
                i0Var.a(m0Var.f5048w);
                float f12 = m0Var.f5049x;
                if (i0Var.f5021e != f12) {
                    i0Var.f5017a |= 8;
                    i0Var.f5021e = f12;
                }
                float f13 = m0Var.f5050y;
                if (i0Var.f5022f != f13) {
                    i0Var.f5017a |= 16;
                    i0Var.f5022f = f13;
                }
                float f14 = m0Var.f5051z;
                if (i0Var.f5023n != f14) {
                    i0Var.f5017a |= 32;
                    i0Var.f5023n = f14;
                }
                float f15 = m0Var.A;
                if (i0Var.f5026q != f15) {
                    i0Var.f5017a |= 256;
                    i0Var.f5026q = f15;
                }
                float f16 = m0Var.B;
                if (i0Var.f5027r != f16) {
                    i0Var.f5017a |= 512;
                    i0Var.f5027r = f16;
                }
                float f17 = m0Var.C;
                if (i0Var.f5028s != f17) {
                    i0Var.f5017a |= 1024;
                    i0Var.f5028s = f17;
                }
                float f18 = m0Var.D;
                if (i0Var.f5029t != f18) {
                    i0Var.f5017a |= 2048;
                    i0Var.f5029t = f18;
                }
                i0Var.f(m0Var.E);
                l0 l0Var = m0Var.F;
                if (!d7.a.d(i0Var.f5031v, l0Var)) {
                    i0Var.f5017a |= 8192;
                    i0Var.f5031v = l0Var;
                }
                boolean z11 = m0Var.G;
                if (i0Var.f5032w != z11) {
                    i0Var.f5017a |= 16384;
                    i0Var.f5032w = z11;
                }
                if (!d7.a.d(null, null)) {
                    i0Var.f5017a |= 131072;
                }
                long j13 = m0Var.H;
                if (!e1.r.c(i0Var.f5024o, j13)) {
                    i0Var.f5017a |= 64;
                    i0Var.f5024o = j13;
                }
                long j14 = m0Var.I;
                if (!e1.r.c(i0Var.f5025p, j14)) {
                    i0Var.f5017a |= 128;
                    i0Var.f5025p = j14;
                }
                int i12 = m0Var.J;
                if (!e1.g0.c(i0Var.f5033x, i12)) {
                    i0Var.f5017a |= 32768;
                    i0Var.f5033x = i12;
                }
                return lVar;
            case 12:
                a7.a.w(obj);
                switch (i10) {
                    case 12:
                        throw null;
                    default:
                        throw null;
                }
            case Code.UNAVAILABLE /* 14 */:
                return a(((Number) obj).floatValue());
            case 15:
                return b((o0) obj);
            case Code.UNAUTHENTICATED /* 16 */:
                return b((o0) obj);
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return a(((Number) obj).floatValue());
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((q0) obj2).f2462b.f2394b.f(((Number) obj).floatValue());
                return lVar;
            case 19:
                j9.f[] fVarArr = y1.t.f16843a;
                y1.u uVar = y1.r.B;
                j9.f fVar = y1.t.f16843a[20];
                uVar.a((y1.v) obj, (z1.a) obj2);
                return lVar;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                r1.s sVar2 = (r1.s) obj2;
                androidx.compose.ui.layout.a.d(sVar2).x(sVar2, ((e1.a0) obj).f4989a);
                return lVar;
            case 21:
                return a(((Number) obj).floatValue());
            case 23:
                f((Throwable) obj);
                return lVar;
            case 24:
                f((Throwable) obj);
                return lVar;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                d(obj);
                return lVar;
            case 26:
                d(obj);
                return lVar;
            case 27:
                d(obj);
                return lVar;
            case 28:
                ((a1.e) obj).I0((a1.a) obj2);
                return Boolean.TRUE;
        }
    }
}
