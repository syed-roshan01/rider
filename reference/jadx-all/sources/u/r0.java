package u;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.accessibility.AccessibilityNodeInfo;
import com.auto.accept.data.model.TransactionData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.remoteconfig.internal.Code;
import k0.t2;
import k0.x2;
import m0.l3;
import u1.s2;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i10, Object obj, Object obj2) {
        super(0);
        this.f14916a = i10;
        this.f14917b = obj;
        this.f14918c = obj2;
    }

    @Override // c9.a
    public final Object invoke() {
        long jF;
        long j10;
        f0.d2 d2VarD;
        f0.c2 c2Var;
        f0.j1 j1Var;
        a2.e eVar;
        f0.j1 j1Var2;
        q3.c cVar;
        q8.l lVar = q8.l.f13235a;
        a2.e eVar2 = null;
        int i10 = this.f14916a;
        Object obj = this.f14918c;
        Object obj2 = this.f14917b;
        switch (i10) {
            case 0:
                m8392invoke();
                return lVar;
            case 1:
                b0.r rVar = (b0.r) ((l3) obj2).getValue();
                b0.h0 h0Var = (b0.h0) obj;
                return new b0.t(h0Var, rVar, new a0.r0((i9.g) h0Var.f2397e.f2322f.getValue(), rVar));
            case 2:
                d1.d dVar = (d1.d) obj2;
                if (dVar != null) {
                    return dVar;
                }
                r1.s sVarG0 = ((c0.g) obj).G0();
                if (sVarG0 != null) {
                    return m9.e0.h(d1.c.f4326b, o1.s.m0(sVarG0.M()));
                }
                return null;
            case 3:
                m8392invoke();
                return lVar;
            case 4:
                ((f0.c2) obj2).f5656u.invoke(new g2.n(((g2.o) obj).f6588e));
                return Boolean.TRUE;
            case 5:
                h0.v0 v0Var = (h0.v0) obj2;
                long j11 = ((m2.k) ((m0.g1) obj).getValue()).f11814a;
                d1.c cVarI = v0Var.i();
                if (cVarI != null) {
                    f0.c2 c2Var2 = v0Var.f7475d;
                    if (c2Var2 != null && (j1Var2 = c2Var2.f5636a) != null) {
                        eVar2 = j1Var2.f5797a;
                    }
                    if (eVar2 == null || eVar2.f918a.length() == 0) {
                        jF = d1.c.f4328d;
                    } else {
                        f0.n0 n0Var = (f0.n0) v0Var.f7486o.getValue();
                        int i11 = n0Var == null ? -1 : h0.y0.f7511a[n0Var.ordinal()];
                        if (i11 != -1) {
                            if (i11 == 1 || i11 == 2) {
                                long j12 = v0Var.k().f6510b;
                                int i12 = a2.b0.f904c;
                                j10 = j12 >> 32;
                            } else {
                                if (i11 != 3) {
                                    throw new androidx.fragment.app.a0();
                                }
                                long j13 = v0Var.k().f6510b;
                                int i13 = a2.b0.f904c;
                                j10 = j13 & 4294967295L;
                            }
                            int i14 = (int) j10;
                            f0.c2 c2Var3 = v0Var.f7475d;
                            if (c2Var3 == null || (d2VarD = c2Var3.d()) == null || (c2Var = v0Var.f7475d) == null || (j1Var = c2Var.f5636a) == null || (eVar = j1Var.f5797a) == null) {
                                jF = d1.c.f4328d;
                            } else {
                                int iR = z6.a.r(v0Var.f7473b.b(i14), 0, eVar.f918a.length());
                                float fD = d1.c.d(d2VarD.d(cVarI.f4330a));
                                a2.a0 a0Var = d2VarD.f5667a;
                                int iF = a0Var.f(iR);
                                float fH = a0Var.h(iF);
                                float fI = a0Var.i(iF);
                                float fQ = z6.a.q(fD, Math.min(fH, fI), Math.max(fH, fI));
                                if (Math.abs(fD - fQ) > ((int) (j11 >> 32)) / 2) {
                                    jF = d1.c.f4328d;
                                } else {
                                    float fK = a0Var.k(iF);
                                    jF = d9.i.f(fQ, ((a0Var.d(iF) - fK) / 2) + fK);
                                }
                            }
                        } else {
                            jF = d1.c.f4328d;
                        }
                    }
                } else {
                    jF = d1.c.f4328d;
                }
                return new d1.c(jF);
            case 6:
                m8392invoke();
                return lVar;
            case 7:
                m8392invoke();
                return lVar;
            case 8:
                m8392invoke();
                return lVar;
            case 9:
                m8392invoke();
                return lVar;
            case 10:
                m8392invoke();
                return lVar;
            case 11:
            default:
                m8392invoke();
                return lVar;
            case 12:
                m8392invoke();
                return lVar;
            case 13:
                m8392invoke();
                return lVar;
            case Code.UNAVAILABLE /* 14 */:
                m8392invoke();
                return lVar;
            case 15:
                m8392invoke();
                return lVar;
            case Code.UNAUTHENTICATED /* 16 */:
                c9.a aVar = (c9.a) obj2;
                return (aVar == null || (cVar = (q3.c) aVar.invoke()) == null) ? ((androidx.activity.p) obj).getDefaultViewModelCreationExtras() : cVar;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                m8392invoke();
                return lVar;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                m8392invoke();
                return lVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.compose.ui.node.a aVar, d9.u uVar) {
        super(0);
        this.f14916a = 12;
        this.f14918c = aVar;
        this.f14917b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m8392invoke() {
        m0.x1 x1Var;
        m0.y1 y1Var;
        r1.w0 placementScope;
        y1.o oVar;
        androidx.compose.ui.node.a aVar;
        int i10 = this.f14916a;
        int i11 = 1;
        Object obj = this.f14918c;
        Object obj2 = this.f14917b;
        switch (i10) {
            case 0:
                ((d9.u) obj2).f4952a = t1.g.p((s0) obj, r1.v0.f13415a);
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 11:
            case Code.UNAUTHENTICATED /* 16 */:
            default:
                TransactionData transactionData = (TransactionData) obj;
                ((MainViewModel) obj2).v(transactionData.getAmount(), transactionData.getOrderId(), transactionData.getPlanType(), false);
                break;
            case 3:
                g2.a0 a0Var = (g2.a0) obj2;
                m0.g1 g1Var = (m0.g1) obj;
                if (a2.b0.a(a0Var.f6510b, ((g2.a0) g1Var.getValue()).f6510b)) {
                    if (d7.a.d(a0Var.f6511c, ((g2.a0) g1Var.getValue()).f6511c)) {
                    }
                }
                g1Var.setValue(a0Var);
                break;
            case 6:
                x2 x2Var = (x2) obj2;
                k0.a1 a1Var = (k0.a1) obj;
                if (!d7.a.d(x2Var, a1Var.f8711a)) {
                    r8.n.C0(a1Var.f8712b, new t2(x2Var, i11));
                    m0.w1 w1Var = a1Var.f8713c;
                    if (w1Var != null && (y1Var = (x1Var = (m0.x1) w1Var).f11754b) != null) {
                        y1Var.c(x1Var, null);
                        break;
                    }
                }
                break;
            case 7:
                m0.c1 c1Var = (m0.c1) obj;
                c1Var.getClass();
                c1Var.getClass();
                c1Var.getClass();
                m0.q.b((m0.q) obj2, null, null);
                break;
            case 8:
                o0.d dVar = (o0.d) obj2;
                m0.e0 e0Var = (m0.e0) obj;
                Object[] objArr = dVar.f12333b;
                int i12 = dVar.f12332a;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object obj3 = objArr[i13];
                    d7.a.k(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    ((m0.x) e0Var).z(obj3);
                }
                break;
            case 9:
                ((b1.c) obj2).f2511w.invoke((b1.d) obj);
                break;
            case 10:
                ((d9.u) obj2).f4952a = ((c1.p) obj).G0();
                break;
            case 12:
                t1.x0 x0Var = ((androidx.compose.ui.node.a) obj).C;
                d9.u uVar = (d9.u) obj2;
                if ((x0Var.f14579e.f16733d & 8) != 0) {
                    for (y0.n nVar = x0Var.f14578d; nVar != null; nVar = nVar.f16734e) {
                        if ((nVar.f16732c & 8) != 0) {
                            ?? F = nVar;
                            ?? iVar = 0;
                            while (F != 0) {
                                if (F instanceof t1.r1) {
                                    t1.r1 r1Var = (t1.r1) F;
                                    if (r1Var.c0()) {
                                        y1.j jVar = new y1.j();
                                        uVar.f4952a = jVar;
                                        jVar.f16788c = true;
                                    }
                                    if (r1Var.d0()) {
                                        ((y1.j) uVar.f4952a).f16787b = true;
                                    }
                                    r1Var.Q((y1.j) uVar.f4952a);
                                } else if ((F.f16732c & 8) != 0 && (F instanceof t1.o)) {
                                    y0.n nVar2 = ((t1.o) F).f14521v;
                                    int i14 = 0;
                                    while (nVar2 != null) {
                                        if ((nVar2.f16732c & 8) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                F = F;
                                                iVar = iVar;
                                                iVar = iVar;
                                                F = nVar2;
                                            } else {
                                                if (iVar == 0) {
                                                    iVar = new o0.i(new y0.n[16]);
                                                }
                                                if (F != 0) {
                                                    iVar.c(F);
                                                    F = 0;
                                                }
                                                iVar.c(nVar2);
                                            }
                                        } else {
                                            F = F;
                                            iVar = iVar;
                                        }
                                        nVar2 = nVar2.f16735f;
                                        F = F;
                                        iVar = iVar;
                                    }
                                    if (i14 == 1) {
                                        F = F;
                                        iVar = iVar;
                                    } else {
                                        F = F;
                                        iVar = iVar;
                                    }
                                }
                                F = t1.g.f(iVar);
                            }
                        }
                    }
                }
                break;
            case 13:
                t1.n0 n0Var = (t1.n0) obj2;
                t1.c1 c1Var2 = n0Var.a().f14397r;
                if (c1Var2 == null || (placementScope = c1Var2.f14533o) == null) {
                    placementScope = ((u1.w) t1.g.z(n0Var.f14494a)).getPlacementScope();
                }
                t1.l0 l0Var = (t1.l0) obj;
                c9.c cVar = l0Var.H;
                if (cVar == null) {
                    t1.c1 c1VarA = n0Var.a();
                    long j10 = l0Var.I;
                    float f10 = l0Var.J;
                    placementScope.getClass();
                    r1.w0.e(c1VarA, j10, f10);
                } else {
                    t1.c1 c1VarA2 = n0Var.a();
                    long j11 = l0Var.I;
                    float f11 = l0Var.J;
                    placementScope.getClass();
                    r1.w0.l(c1VarA2, j11, f11, cVar);
                }
                break;
            case Code.UNAVAILABLE /* 14 */:
                e1.i0 i0Var = t1.c1.I;
                ((t1.c1) obj2).E0((e1.p) obj);
                break;
            case 15:
                u1.r2 r2Var = (u1.r2) obj2;
                y1.h hVar = r2Var.f15254e;
                y1.h hVar2 = r2Var.f15255f;
                Float f12 = r2Var.f15252c;
                Float f13 = r2Var.f15253d;
                float fFloatValue = (hVar == null || f12 == null) ? 0.0f : ((Number) hVar.f16758a.invoke()).floatValue() - f12.floatValue();
                float fFloatValue2 = (hVar2 == null || f13 == null) ? 0.0f : ((Number) hVar2.f16758a.invoke()).floatValue() - f13.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    u1.p0 p0Var = (u1.p0) obj;
                    int[] iArr = u1.p0.X;
                    int iE = p0Var.E(r2Var.f15250a);
                    s2 s2Var = (s2) p0Var.r().get(Integer.valueOf(p0Var.f15204t));
                    if (s2Var != null) {
                        try {
                            AccessibilityNodeInfo accessibilityNodeInfo = p0Var.f15205u;
                            if (accessibilityNodeInfo != null) {
                                accessibilityNodeInfo.setBoundsInScreen(p0Var.j(s2Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    p0Var.f15195d.invalidate();
                    s2 s2Var2 = (s2) p0Var.r().get(Integer.valueOf(iE));
                    if (s2Var2 != null && (oVar = s2Var2.f15289a) != null && (aVar = oVar.f16797c) != null) {
                        if (hVar != null) {
                            p0Var.f15207w.put(Integer.valueOf(iE), hVar);
                        }
                        if (hVar2 != null) {
                            p0Var.f15208x.put(Integer.valueOf(iE), hVar2);
                        }
                        p0Var.A(aVar);
                    }
                }
                if (hVar != null) {
                    r2Var.f15252c = (Float) hVar.f16758a.invoke();
                }
                if (hVar2 != null) {
                    r2Var.f15253d = (Float) hVar2.f16758a.invoke();
                }
                break;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                ((Context) obj).startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) obj2)));
                break;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                z6.a.Q((m9.d0) obj2, null, 0, new d5.u0((b0.h0) obj, null), 3);
                break;
        }
    }
}
