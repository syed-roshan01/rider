package h0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.view.ActionMode;
import f0.c2;
import f0.d2;
import f0.e2;
import f0.g2;
import f0.j1;
import java.util.ArrayList;
import java.util.List;
import m0.n1;
import m0.o3;
import u1.p1;
import u1.t1;
import u1.u2;
import u1.v2;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f7472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2.s f7473b = g2.f5710a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.c f7474c = g0.f7390d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f7475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f7476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g2.l0 f7477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p1 f7478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u2 f7479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k1.a f7480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c1.k f7481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n1 f7482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f7484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n1 f7486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n1 f7487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g2.a0 f7489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q0 f7490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s0 f7491t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u0 f7492u;

    public v0(e2 e2Var) {
        this.f7472a = e2Var;
        g2.a0 a0Var = new g2.a0((String) null, 0L, 7);
        o3 o3Var = o3.f11621a;
        this.f7476e = d7.t.g0(a0Var, o3Var);
        this.f7477f = g2.k0.f6576a;
        this.f7482k = d7.t.g0(Boolean.TRUE, o3Var);
        long j10 = d1.c.f4326b;
        this.f7483l = j10;
        this.f7485n = j10;
        this.f7486o = d7.t.g0(null, o3Var);
        this.f7487p = d7.t.g0(null, o3Var);
        this.f7488q = -1;
        this.f7489r = new g2.a0((String) null, 0L, 7);
        this.f7491t = new s0(this, 1);
        this.f7492u = new u0(this);
    }

    public static final void a(v0 v0Var, d1.c cVar) {
        v0Var.f7487p.setValue(cVar);
    }

    public static final void b(v0 v0Var, f0.n0 n0Var) {
        v0Var.f7486o.setValue(n0Var);
    }

    public static final long c(v0 v0Var, g2.a0 a0Var, long j10, boolean z10, boolean z11, s sVar, boolean z12) {
        d2 d2VarD;
        p pVar;
        k1.a aVar;
        int i10;
        c2 c2Var = v0Var.f7475d;
        if (c2Var == null || (d2VarD = c2Var.d()) == null) {
            return a2.b0.f903b;
        }
        g2.s sVar2 = v0Var.f7473b;
        long j11 = a0Var.f6510b;
        int i11 = a2.b0.f904c;
        int iB = sVar2.b((int) (j11 >> 32));
        g2.s sVar3 = v0Var.f7473b;
        long j12 = a0Var.f6510b;
        long jG = o1.s.g(iB, sVar3.b((int) (j12 & 4294967295L)));
        int iB2 = d2VarD.b(j10, false);
        int i12 = (z11 || z10) ? iB2 : (int) (jG >> 32);
        int i13 = (!z11 || z10) ? iB2 : (int) (jG & 4294967295L);
        q0 q0Var = v0Var.f7490s;
        int i14 = -1;
        if (!z10 && q0Var != null && (i10 = v0Var.f7488q) != -1) {
            i14 = i10;
        }
        a2.a0 a0Var2 = d2VarD.f5667a;
        if (z10) {
            pVar = null;
        } else {
            int i15 = (int) (jG >> 32);
            int i16 = (int) (jG & 4294967295L);
            pVar = new p(new o(m9.e0.A(a0Var2, i15), i15, 1L), new o(m9.e0.A(a0Var2, i16), i16, 1L), a2.b0.f(jG));
        }
        q0 q0Var2 = new q0(z11, pVar, new n(i12, i13, i14, a0Var2));
        if (pVar != null && q0Var != null && z11 == q0Var.f7447a) {
            n nVar = q0Var.f7449c;
            nVar.getClass();
            if (i12 == nVar.f7427a && i13 == nVar.f7428b) {
                return j12;
            }
        }
        v0Var.f7490s = q0Var2;
        v0Var.f7488q = iB2;
        p pVarC = ((b0.l0) sVar).c(q0Var2);
        long jG2 = o1.s.g(v0Var.f7473b.a(pVarC.f7436a.f7433b), v0Var.f7473b.a(pVarC.f7437b.f7433b));
        if (a2.b0.a(jG2, j12)) {
            return j12;
        }
        boolean z13 = a2.b0.f(jG2) != a2.b0.f(j12) && a2.b0.a(o1.s.g((int) (4294967295L & jG2), (int) (jG2 >> 32)), j12);
        boolean z14 = a2.b0.b(jG2) && a2.b0.b(j12);
        a2.e eVar = a0Var.f6509a;
        if (z12 && eVar.f918a.length() > 0 && !z13 && !z14 && (aVar = v0Var.f7480i) != null) {
            ((k1.c) aVar).a(f6.a.f6375x);
        }
        g2.a0 a0VarE = e(eVar, jG2);
        v0Var.f7474c.invoke(a0VarE);
        v0Var.n(a2.b0.b(a0VarE.f6510b) ? f0.o0.f5838c : f0.o0.f5837b);
        c2 c2Var2 = v0Var.f7475d;
        if (c2Var2 != null) {
            c2Var2.f5652q.setValue(Boolean.valueOf(z12));
        }
        c2 c2Var3 = v0Var.f7475d;
        if (c2Var3 != null) {
            c2Var3.f5648m.setValue(Boolean.valueOf(d7.t.c0(v0Var, true)));
        }
        c2 c2Var4 = v0Var.f7475d;
        if (c2Var4 != null) {
            c2Var4.f5649n.setValue(Boolean.valueOf(d7.t.c0(v0Var, false)));
        }
        return jG2;
    }

    public static g2.a0 e(a2.e eVar, long j10) {
        return new g2.a0(eVar, j10, (a2.b0) null);
    }

    public final void d(boolean z10) {
        if (a2.b0.b(k().f6510b)) {
            return;
        }
        p1 p1Var = this.f7478g;
        if (p1Var != null) {
            ((u1.l) p1Var).a(o1.s.L(k()));
        }
        if (z10) {
            int iD = a2.b0.d(k().f6510b);
            this.f7474c.invoke(e(k().f6509a, o1.s.g(iD, iD)));
            n(f0.o0.f5836a);
        }
    }

    public final void f() {
        if (a2.b0.b(k().f6510b)) {
            return;
        }
        p1 p1Var = this.f7478g;
        if (p1Var != null) {
            ((u1.l) p1Var).a(o1.s.L(k()));
        }
        a2.e eVarQ = o1.s.Q(k(), k().f6509a.f918a.length());
        a2.e eVarP = o1.s.P(k(), k().f6509a.f918a.length());
        a2.c cVar = new a2.c(eVarQ);
        cVar.b(eVarP);
        a2.e eVarC = cVar.c();
        int iE = a2.b0.e(k().f6510b);
        this.f7474c.invoke(e(eVarC, o1.s.g(iE, iE)));
        n(f0.o0.f5836a);
        e2 e2Var = this.f7472a;
        if (e2Var != null) {
            e2Var.f5692f = true;
        }
    }

    public final void g(d1.c cVar) {
        if (!a2.b0.b(k().f6510b)) {
            c2 c2Var = this.f7475d;
            d2 d2VarD = c2Var != null ? c2Var.d() : null;
            int iD = (cVar == null || d2VarD == null) ? a2.b0.d(k().f6510b) : this.f7473b.a(d2VarD.b(cVar.f4330a, true));
            this.f7474c.invoke(g2.a0.a(k(), null, o1.s.g(iD, iD), 5));
        }
        n((cVar == null || k().f6509a.f918a.length() <= 0) ? f0.o0.f5836a : f0.o0.f5838c);
        p(false);
    }

    public final void h(boolean z10) {
        c1.k kVar;
        c2 c2Var = this.f7475d;
        if (c2Var != null && !c2Var.b() && (kVar = this.f7481j) != null) {
            kVar.a();
        }
        this.f7489r = k();
        p(z10);
        n(f0.o0.f5837b);
    }

    public final d1.c i() {
        return (d1.c) this.f7487p.getValue();
    }

    public final long j(boolean z10) {
        d2 d2VarD;
        a2.a0 a0Var;
        long j10;
        j1 j1Var;
        c2 c2Var = this.f7475d;
        if (c2Var == null || (d2VarD = c2Var.d()) == null || (a0Var = d2VarD.f5667a) == null) {
            return d1.c.f4328d;
        }
        c2 c2Var2 = this.f7475d;
        a2.e eVar = (c2Var2 == null || (j1Var = c2Var2.f5636a) == null) ? null : j1Var.f5797a;
        if (eVar == null) {
            return d1.c.f4328d;
        }
        if (!d7.a.d(eVar.f918a, a0Var.f893a.f1052a.f918a)) {
            return d1.c.f4328d;
        }
        g2.a0 a0VarK = k();
        if (z10) {
            long j11 = a0VarK.f6510b;
            int i10 = a2.b0.f904c;
            j10 = j11 >> 32;
        } else {
            long j12 = a0VarK.f6510b;
            int i11 = a2.b0.f904c;
            j10 = j12 & 4294967295L;
        }
        int iB = this.f7473b.b((int) j10);
        boolean zF = a2.b0.f(k().f6510b);
        int iF = a0Var.f(iB);
        a2.i iVar = a0Var.f894b;
        if (iF >= iVar.f937f) {
            return d1.c.f4328d;
        }
        boolean z11 = a0Var.a(((!z10 || zF) && (z10 || !zF)) ? Math.max(iB + (-1), 0) : iB) == a0Var.m(iB);
        iVar.d(iB);
        int length = iVar.f932a.f942a.f918a.length();
        ArrayList arrayList = iVar.f939h;
        a2.m mVar = (a2.m) arrayList.get(iB == length ? d7.t.Y(arrayList) : o1.s.w(iB, arrayList));
        a2.l lVar = mVar.f947a;
        int iA = mVar.a(iB);
        b2.v vVar = ((a2.a) lVar).f889d;
        return d9.i.f(z11 ? vVar.g(iA, false) : vVar.h(iA, false), a0Var.d(iF));
    }

    public final g2.a0 k() {
        return (g2.a0) this.f7476e.getValue();
    }

    public final void l() {
        u2 u2Var = this.f7479h;
        if (u2Var == null || ((u1.a1) u2Var).f15024d != 1 || u2Var == null) {
            return;
        }
        u1.a1 a1Var = (u1.a1) u2Var;
        a1Var.f15024d = 2;
        ActionMode actionMode = a1Var.f15022b;
        if (actionMode != null) {
            actionMode.finish();
        }
        a1Var.f15022b = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [f2.l] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [f2.j] */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [f2.k] */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [l2.a] */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [l2.p] */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [l2.j] */
    /* JADX WARN: Type inference failed for: r37v10 */
    /* JADX WARN: Type inference failed for: r37v11 */
    /* JADX WARN: Type inference failed for: r37v12 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r37v7 */
    /* JADX WARN: Type inference failed for: r37v8 */
    /* JADX WARN: Type inference failed for: r37v9 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [e1.k0] */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11 */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r38v13 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    public final void m() {
        boolean z10;
        ?? pVar;
        ?? aVar;
        ?? kVar;
        ?? jVar;
        ?? lVar;
        ?? k0Var;
        ?? jVar2;
        p1 p1Var = this.f7478g;
        if (p1Var != null) {
            ClipData primaryClip = ((u1.l) p1Var).f15156a.getPrimaryClip();
            a2.e eVar = null;
            byte b10 = 1;
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                eVar = null;
            } else {
                boolean z11 = false;
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt != null ? itemAt.getText() : null;
                if (text != null) {
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        d7.a.m(annotationArr, "<this>");
                        int length = annotationArr.length - 1;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i10];
                                if (d7.a.d(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    t1 t1Var = new t1(annotation.getValue());
                                    ?? r25 = eVar;
                                    ?? r26 = r25;
                                    ?? r27 = r26;
                                    ?? string = r27;
                                    ?? r32 = string;
                                    ?? r33 = r32;
                                    ?? r37 = r33;
                                    ?? r38 = r37;
                                    long j10 = e1.r.f5065g;
                                    long j11 = j10;
                                    long jA = m2.n.f11820c;
                                    long jA2 = jA;
                                    while (true) {
                                        Parcel parcel = t1Var.f15301a;
                                        if (parcel.dataAvail() <= b10) {
                                            z10 = z11;
                                            break;
                                        }
                                        byte b11 = parcel.readByte();
                                        if (b11 == b10) {
                                            if (parcel.dataAvail() < 8) {
                                                z10 = false;
                                                break;
                                            }
                                            j10 = parcel.readLong();
                                            int i11 = e1.r.f5066h;
                                            string = string;
                                            z11 = false;
                                        } else if (b11 != 2) {
                                            byte b12 = 3;
                                            if (b11 == 3) {
                                                if (parcel.dataAvail() < 4) {
                                                    z10 = false;
                                                    break;
                                                }
                                                lVar = new f2.l(parcel.readInt());
                                                jVar = r26;
                                                kVar = r27;
                                                aVar = r32;
                                                pVar = r33;
                                                z11 = false;
                                                r25 = lVar;
                                                r26 = jVar;
                                                r27 = kVar;
                                                r32 = aVar;
                                                r33 = pVar;
                                                r37 = r37;
                                                r38 = r38;
                                            } else if (b11 == 4) {
                                                if (parcel.dataAvail() < b10) {
                                                    z10 = false;
                                                    break;
                                                }
                                                byte b13 = parcel.readByte();
                                                jVar = new f2.j((b13 != 0 && b13 == b10) ? b10 : (byte) 0);
                                                lVar = r25;
                                                kVar = r27;
                                                aVar = r32;
                                                pVar = r33;
                                                z11 = false;
                                                r25 = lVar;
                                                r26 = jVar;
                                                r27 = kVar;
                                                r32 = aVar;
                                                r33 = pVar;
                                                r37 = r37;
                                                r38 = r38;
                                            } else if (b11 == 5) {
                                                if (parcel.dataAvail() < b10) {
                                                    z10 = false;
                                                    break;
                                                }
                                                byte b14 = parcel.readByte();
                                                if (b14 == 0) {
                                                    b12 = 0;
                                                } else if (b14 == b10) {
                                                    b12 = b10;
                                                } else if (b14 != 3) {
                                                    b12 = 2;
                                                    if (b14 != 2) {
                                                        b12 = 0;
                                                    }
                                                }
                                                kVar = new f2.k(b12);
                                                lVar = r25;
                                                jVar = r26;
                                                aVar = r32;
                                                pVar = r33;
                                                z11 = false;
                                                r25 = lVar;
                                                r26 = jVar;
                                                r27 = kVar;
                                                r32 = aVar;
                                                r33 = pVar;
                                                r37 = r37;
                                                r38 = r38;
                                            } else if (b11 == 6) {
                                                string = parcel.readString();
                                                z11 = false;
                                            } else if (b11 == 7) {
                                                if (parcel.dataAvail() < 5) {
                                                    z10 = false;
                                                    break;
                                                }
                                                jA2 = t1Var.a();
                                                lVar = r25;
                                                jVar = r26;
                                                kVar = r27;
                                                aVar = r32;
                                                pVar = r33;
                                                z11 = false;
                                                r25 = lVar;
                                                r26 = jVar;
                                                r27 = kVar;
                                                r32 = aVar;
                                                r33 = pVar;
                                                r37 = r37;
                                                r38 = r38;
                                            } else if (b11 != 8) {
                                                if (b11 != 9) {
                                                    if (b11 != 10) {
                                                        if (b11 != 11) {
                                                            z10 = false;
                                                            if (b11 == 12) {
                                                                if (parcel.dataAvail() < 20) {
                                                                    jVar2 = r37;
                                                                    k0Var = r38;
                                                                    break;
                                                                }
                                                                jVar2 = r37;
                                                                k0Var = r38;
                                                                long j12 = parcel.readLong();
                                                                int i12 = e1.r.f5066h;
                                                                jVar2 = r37;
                                                                k0Var = new e1.k0(j12, d9.i.f(parcel.readFloat(), parcel.readFloat()), parcel.readFloat());
                                                            }
                                                        } else if (parcel.dataAvail() >= 4) {
                                                            int i13 = parcel.readInt();
                                                            byte b15 = (i13 & 2) != 0 ? b10 : (byte) 0;
                                                            byte b16 = (i13 & 1) != 0 ? b10 : (byte) 0;
                                                            l2.j jVar3 = l2.j.f11213d;
                                                            l2.j jVar4 = l2.j.f11212c;
                                                            if (b15 == 0 || b16 == 0) {
                                                                z10 = false;
                                                                if (b15 != 0) {
                                                                    jVar2 = jVar3;
                                                                    k0Var = r38;
                                                                } else if (b16 != 0) {
                                                                    jVar2 = jVar4;
                                                                    k0Var = r38;
                                                                } else {
                                                                    jVar2 = l2.j.f11211b;
                                                                    k0Var = r38;
                                                                }
                                                            } else {
                                                                List listE0 = d7.t.e0(jVar3, jVar4);
                                                                z10 = false;
                                                                Integer numValueOf = 0;
                                                                int size = listE0.size();
                                                                for (int i14 = 0; i14 < size; i14++) {
                                                                    numValueOf = Integer.valueOf(((l2.j) listE0.get(i14)).f11214a | numValueOf.intValue());
                                                                }
                                                                jVar2 = new l2.j(numValueOf.intValue());
                                                                k0Var = r38;
                                                            }
                                                        }
                                                        jVar2 = r37;
                                                        k0Var = r38;
                                                        z11 = z10;
                                                        b10 = 1;
                                                        r25 = r25;
                                                        r26 = r26;
                                                        r27 = r27;
                                                        r32 = r32;
                                                        r33 = r33;
                                                        r37 = jVar2;
                                                        r38 = k0Var;
                                                    } else if (parcel.dataAvail() >= 8) {
                                                        j11 = parcel.readLong();
                                                        int i15 = e1.r.f5066h;
                                                        lVar = r25;
                                                        jVar = r26;
                                                        kVar = r27;
                                                        aVar = r32;
                                                        pVar = r33;
                                                        z11 = false;
                                                        r25 = lVar;
                                                        r26 = jVar;
                                                        r27 = kVar;
                                                        r32 = aVar;
                                                        r33 = pVar;
                                                        r37 = r37;
                                                        r38 = r38;
                                                    }
                                                    z10 = false;
                                                    break;
                                                }
                                                if (parcel.dataAvail() < 8) {
                                                    z10 = false;
                                                    break;
                                                }
                                                pVar = new l2.p(parcel.readFloat(), parcel.readFloat());
                                                lVar = r25;
                                                jVar = r26;
                                                kVar = r27;
                                                aVar = r32;
                                                z11 = false;
                                                r25 = lVar;
                                                r26 = jVar;
                                                r27 = kVar;
                                                r32 = aVar;
                                                r33 = pVar;
                                                r37 = r37;
                                                r38 = r38;
                                            } else {
                                                if (parcel.dataAvail() < 4) {
                                                    z10 = false;
                                                    break;
                                                }
                                                aVar = new l2.a(parcel.readFloat());
                                                lVar = r25;
                                                jVar = r26;
                                                kVar = r27;
                                                pVar = r33;
                                                z11 = false;
                                                r25 = lVar;
                                                r26 = jVar;
                                                r27 = kVar;
                                                r32 = aVar;
                                                r33 = pVar;
                                                r37 = r37;
                                                r38 = r38;
                                            }
                                        } else {
                                            if (parcel.dataAvail() < 5) {
                                                z10 = false;
                                                break;
                                            }
                                            jA = t1Var.a();
                                            lVar = r25;
                                            jVar = r26;
                                            kVar = r27;
                                            aVar = r32;
                                            pVar = r33;
                                            z11 = false;
                                            r25 = lVar;
                                            r26 = jVar;
                                            r27 = kVar;
                                            r32 = aVar;
                                            r33 = pVar;
                                            r37 = r37;
                                            r38 = r38;
                                        }
                                    }
                                    arrayList.add(new a2.d(new a2.x(j10, jA, r25, r26, r27, null, string, jA2, r32, r33, null, j11, r37, r38, 49152), spanStart, spanEnd));
                                } else {
                                    z10 = z11;
                                }
                                if (i10 == length) {
                                    break;
                                }
                                i10++;
                                z11 = z10;
                                eVar = null;
                                b10 = 1;
                            }
                        }
                        eVar = new a2.e(text.toString(), arrayList, 4);
                    } else {
                        eVar = new a2.e(text.toString(), null, 6);
                    }
                }
            }
            if (eVar == null) {
                return;
            }
            a2.c cVar = new a2.c(o1.s.Q(k(), k().f6509a.f918a.length()));
            cVar.b(eVar);
            a2.e eVarC = cVar.c();
            a2.e eVarP = o1.s.P(k(), k().f6509a.f918a.length());
            a2.c cVar2 = new a2.c(eVarC);
            cVar2.b(eVarP);
            a2.e eVarC2 = cVar2.c();
            int length2 = eVar.f918a.length() + a2.b0.e(k().f6510b);
            this.f7474c.invoke(e(eVarC2, o1.s.g(length2, length2)));
            n(f0.o0.f5836a);
            e2 e2Var = this.f7472a;
            if (e2Var != null) {
                e2Var.f5692f = true;
            }
        }
    }

    public final void n(f0.o0 o0Var) {
        c2 c2Var = this.f7475d;
        if (c2Var != null) {
            if (c2Var.a() == o0Var) {
                c2Var = null;
            }
            if (c2Var != null) {
                c2Var.f5646k.setValue(o0Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x018e  */
    public final void o() {
        d1.d dVar;
        float fE;
        r1.s sVarC;
        a2.a0 a0Var;
        r1.s sVarC2;
        a2.a0 a0Var2;
        r1.s sVarC3;
        r1.s sVarC4;
        p1 p1Var;
        ClipDescription primaryClipDescription;
        c2 c2Var = this.f7475d;
        if (c2Var == null || ((Boolean) c2Var.f5652q.getValue()).booleanValue()) {
            boolean z10 = this.f7477f instanceof g2.u;
            f0.z zVar = (a2.b0.b(k().f6510b) || z10) ? null : new f0.z(this, 4);
            boolean zB = a2.b0.b(k().f6510b);
            n1 n1Var = this.f7482k;
            f0.z zVar2 = (zB || !((Boolean) n1Var.getValue()).booleanValue() || z10) ? null : new f0.z(this, 5);
            f0.z zVar3 = (!((Boolean) n1Var.getValue()).booleanValue() || (p1Var = this.f7478g) == null || (primaryClipDescription = ((u1.l) p1Var).f15156a.getPrimaryClipDescription()) == null || !primaryClipDescription.hasMimeType("text/*")) ? null : new f0.z(this, 6);
            f0.z zVar4 = a2.b0.c(k().f6510b) != k().f6509a.f918a.length() ? new f0.z(this, 7) : null;
            u2 u2Var = this.f7479h;
            if (u2Var != null) {
                c2 c2Var2 = this.f7475d;
                if (c2Var2 == null) {
                    zVar4 = zVar4;
                    dVar = d1.d.f4331e;
                } else {
                    c2 c2Var3 = c2Var2.f5651p ^ true ? c2Var2 : null;
                    if (c2Var3 != null) {
                        int iB = this.f7473b.b((int) (k().f6510b >> 32));
                        int iB2 = this.f7473b.b((int) (k().f6510b & 4294967295L));
                        c2 c2Var4 = this.f7475d;
                        long jP = (c2Var4 == null || (sVarC4 = c2Var4.c()) == null) ? d1.c.f4326b : sVarC4.P(j(true));
                        c2 c2Var5 = this.f7475d;
                        long jP2 = (c2Var5 == null || (sVarC3 = c2Var5.c()) == null) ? d1.c.f4326b : sVarC3.P(j(false));
                        c2 c2Var6 = this.f7475d;
                        float fE2 = 0.0f;
                        if (c2Var6 == null || (sVarC2 = c2Var6.c()) == null) {
                            zVar4 = zVar4;
                            fE = 0.0f;
                        } else {
                            d2 d2VarD = c2Var3.d();
                            fE = d1.c.e(sVarC2.P(d9.i.f(0.0f, (d2VarD == null || (a0Var2 = d2VarD.f5667a) == null) ? 0.0f : a0Var2.c(iB).f4333b)));
                        }
                        c2 c2Var7 = this.f7475d;
                        if (c2Var7 != null && (sVarC = c2Var7.c()) != null) {
                            d2 d2VarD2 = c2Var3.d();
                            fE2 = d1.c.e(sVarC.P(d9.i.f(0.0f, (d2VarD2 == null || (a0Var = d2VarD2.f5667a) == null) ? 0.0f : a0Var.c(iB2).f4333b)));
                        }
                        dVar = new d1.d(Math.min(d1.c.d(jP), d1.c.d(jP2)), Math.min(fE, fE2), Math.max(d1.c.d(jP), d1.c.d(jP2)), (c2Var3.f5636a.f5803g.c() * 25) + Math.max(d1.c.e(jP), d1.c.e(jP2)));
                    } else {
                        zVar4 = zVar4;
                        dVar = d1.d.f4331e;
                    }
                }
                u1.a1 a1Var = (u1.a1) u2Var;
                v1.b bVar = a1Var.f15023c;
                bVar.f15884b = dVar;
                bVar.f15885c = zVar;
                bVar.f15887e = zVar2;
                bVar.f15886d = zVar3;
                bVar.f15888f = zVar4;
                ActionMode actionMode = a1Var.f15022b;
                if (actionMode != null) {
                    actionMode.invalidate();
                } else {
                    a1Var.f15024d = 1;
                    a1Var.f15022b = v2.f15312a.b(a1Var.f15021a, new v1.a(bVar), 1);
                }
            }
        }
    }

    public final void p(boolean z10) {
        c2 c2Var = this.f7475d;
        if (c2Var != null) {
            c2Var.f5647l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            o();
        } else {
            l();
        }
    }
}
