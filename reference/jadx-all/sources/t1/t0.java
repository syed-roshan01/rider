package t1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f14546a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14548c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m2.a f14553h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f14547b = new r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f14549d = new i1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0.i f14550e = new o0.i(new k1[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14551f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0.i f14552g = new o0.i(new s0[16]);

    public t0(androidx.compose.ui.node.a aVar) {
        this.f14546a = aVar;
    }

    public static boolean f(androidx.compose.ui.node.a aVar) {
        return aVar.D.f14497d && g(aVar);
    }

    public static boolean g(androidx.compose.ui.node.a aVar) {
        l0 l0Var = aVar.D.f14508o;
        return l0Var.f14483r == 1 || l0Var.A.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10) {
        androidx.compose.ui.node.a[] aVarArr;
        i1 i1Var = this.f14549d;
        if (z10) {
            o0.i iVar = i1Var.f14449a;
            iVar.g();
            androidx.compose.ui.node.a aVar = this.f14546a;
            iVar.c(aVar);
            aVar.I = true;
        }
        h1 h1Var = h1.f14441a;
        o0.i iVar2 = i1Var.f14449a;
        Object[] objArr = iVar2.f12341a;
        int i10 = iVar2.f12343c;
        d7.a.m(objArr, "<this>");
        Arrays.sort(objArr, 0, i10, h1Var);
        int i11 = iVar2.f12343c;
        androidx.compose.ui.node.a[] aVarArr2 = i1Var.f14450b;
        if (aVarArr2 == null || aVarArr2.length < i11) {
            aVarArr = aVarArr2;
            aVarArr = new androidx.compose.ui.node.a[Math.max(16, i11)];
        }
        aVarArr = aVarArr2;
        i1Var.f14450b = null;
        for (int i12 = 0; i12 < i11; i12++) {
            aVarArr[i12] = iVar2.f12341a[i12];
        }
        iVar2.g();
        for (int i13 = i11 - 1; -1 < i13; i13--) {
            androidx.compose.ui.node.a aVar2 = aVarArr[i13];
            d7.a.j(aVar2);
            if (aVar2.I) {
                i1.a(aVar2);
            }
        }
        i1Var.f14450b = aVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final boolean b(androidx.compose.ui.node.a aVar, m2.a aVar2) {
        boolean zW0;
        androidx.compose.ui.node.a aVar3 = aVar.f1738c;
        if (aVar3 == null) {
            return false;
        }
        n0 n0Var = aVar.D;
        if (aVar2 == null) {
            k0 k0Var = n0Var.f14509p;
            m2.a aVar4 = k0Var != null ? k0Var.f14470t : null;
            if (aVar4 == null || aVar3 == null) {
                zW0 = false;
            } else {
                d7.a.j(k0Var);
                zW0 = k0Var.w0(aVar4.f11792a);
            }
        } else if (aVar3 != null) {
            k0 k0Var2 = n0Var.f14509p;
            d7.a.j(k0Var2);
            zW0 = k0Var2.w0(aVar2.f11792a);
        } else {
            zW0 = false;
        }
        androidx.compose.ui.node.a aVarQ = aVar.q();
        if (zW0 && aVarQ != null) {
            if (aVarQ.f1738c == null) {
                q(aVarQ, false);
            } else if (aVar.p() == 1) {
                o(aVarQ, false);
            } else if (aVar.p() == 2) {
                n(aVarQ, false);
            }
        }
        return zW0;
    }

    public final boolean c(androidx.compose.ui.node.a aVar, m2.a aVar2) {
        boolean zY0;
        if (aVar2 != null) {
            if (aVar.K == 3) {
                aVar.e();
            }
            zY0 = aVar.D.f14508o.y0(aVar2.f11792a);
        } else {
            l0 l0Var = aVar.D.f14508o;
            m2.a aVar3 = l0Var.f14481p ? new m2.a(l0Var.f13426d) : null;
            if (aVar3 != null) {
                if (aVar.K == 3) {
                    aVar.e();
                }
                zY0 = aVar.D.f14508o.y0(aVar3.f11792a);
            } else {
                zY0 = false;
            }
        }
        androidx.compose.ui.node.a aVarQ = aVar.q();
        if (zY0 && aVarQ != null) {
            int i10 = aVar.D.f14508o.f14483r;
            if (i10 == 1) {
                q(aVarQ, false);
            } else if (i10 == 2) {
                p(aVarQ, false);
            }
        }
        return zY0;
    }

    public final void d(androidx.compose.ui.node.a aVar, boolean z10) {
        r rVar = this.f14547b;
        if ((z10 ? rVar.f14534a : rVar.f14535b).f14530c.isEmpty()) {
            return;
        }
        if (!this.f14548c) {
            throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass".toString());
        }
        if (!(!(z10 ? aVar.D.f14500g : aVar.D.f14497d))) {
            throw new IllegalArgumentException("node not yet measured".toString());
        }
        e(aVar, z10);
    }

    public final void e(androidx.compose.ui.node.a aVar, boolean z10) {
        k0 k0Var;
        o0 o0Var;
        o0.i iVarT = aVar.t();
        int i10 = iVarT.f12343c;
        r rVar = this.f14547b;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if ((!z10 && g(aVar2)) || (z10 && (aVar2.p() == 1 || ((k0Var = aVar2.D.f14509p) != null && (o0Var = k0Var.f14473w) != null && o0Var.f())))) {
                    boolean zV = g.v(aVar2);
                    n0 n0Var = aVar2.D;
                    if (zV && !z10) {
                        if (n0Var.f14500g && rVar.f14534a.b(aVar2)) {
                            k(aVar2, true, false);
                        } else {
                            d(aVar2, true);
                        }
                    }
                    if (z10 ? n0Var.f14500g : n0Var.f14497d) {
                        boolean zB = rVar.f14534a.b(aVar2);
                        if (!z10 ? zB || rVar.f14535b.b(aVar2) : zB) {
                            k(aVar2, z10, false);
                        }
                    }
                    if (!(z10 ? n0Var.f14500g : n0Var.f14497d)) {
                        e(aVar2, z10);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
        n0 n0Var2 = aVar.D;
        if (z10 ? n0Var2.f14500g : n0Var2.f14497d) {
            boolean zB2 = rVar.f14534a.b(aVar);
            if (z10) {
                if (!zB2) {
                    return;
                }
            } else if (!zB2 && !rVar.f14535b.b(aVar)) {
                return;
            }
            k(aVar, z10, false);
        }
    }

    public final boolean h(u1.u uVar) {
        boolean z10;
        androidx.compose.ui.node.a aVar;
        r rVar = this.f14547b;
        androidx.compose.ui.node.a aVar2 = this.f14546a;
        if (!aVar2.C()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (!aVar2.D()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        if (!(!this.f14548c)) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
        }
        int i10 = 0;
        if (this.f14553h != null) {
            this.f14548c = true;
            try {
                if (rVar.b()) {
                    z10 = false;
                    while (true) {
                        boolean zB = rVar.b();
                        q qVar = rVar.f14534a;
                        if (!zB) {
                            break;
                        }
                        boolean z11 = !qVar.f14530c.isEmpty();
                        if (z11) {
                            aVar = (androidx.compose.ui.node.a) qVar.f14530c.first();
                        } else {
                            qVar = rVar.f14535b;
                            aVar = (androidx.compose.ui.node.a) qVar.f14530c.first();
                        }
                        qVar.c(aVar);
                        boolean zK = k(aVar, z11, true);
                        if (aVar == aVar2 && zK) {
                            z10 = true;
                        }
                    }
                    if (uVar != null) {
                        uVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f14548c = false;
            } catch (Throwable th) {
                this.f14548c = false;
                throw th;
            }
        } else {
            z10 = false;
        }
        o0.i iVar = this.f14550e;
        int i11 = iVar.f12343c;
        if (i11 > 0) {
            Object[] objArr = iVar.f12341a;
            do {
                ((androidx.compose.ui.node.a) ((k1) objArr[i10])).I();
                i10++;
            } while (i10 < i11);
        }
        iVar.g();
        return z10;
    }

    public final void i(androidx.compose.ui.node.a aVar, long j10) {
        if (aVar.J) {
            return;
        }
        androidx.compose.ui.node.a aVar2 = this.f14546a;
        if (!(!d7.a.d(aVar, aVar2))) {
            throw new IllegalArgumentException("measureAndLayout called on root".toString());
        }
        if (!aVar2.C()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (!aVar2.D()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        if (!(!this.f14548c)) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
        }
        int i10 = 0;
        if (this.f14553h != null) {
            this.f14548c = true;
            try {
                r rVar = this.f14547b;
                rVar.f14534a.c(aVar);
                rVar.f14535b.c(aVar);
                boolean zB = b(aVar, new m2.a(j10));
                c(aVar, new m2.a(j10));
                n0 n0Var = aVar.D;
                if ((zB || n0Var.f14501h) && d7.a.d(aVar.E(), Boolean.TRUE)) {
                    aVar.F();
                }
                if (n0Var.f14498e && aVar.D()) {
                    aVar.M();
                    this.f14549d.f14449a.c(aVar);
                    aVar.I = true;
                }
                this.f14548c = false;
            } catch (Throwable th) {
                this.f14548c = false;
                throw th;
            }
        }
        o0.i iVar = this.f14550e;
        int i11 = iVar.f12343c;
        if (i11 > 0) {
            Object[] objArr = iVar.f12341a;
            do {
                ((androidx.compose.ui.node.a) ((k1) objArr[i10])).I();
                i10++;
            } while (i10 < i11);
        }
        iVar.g();
    }

    public final void j() {
        r rVar = this.f14547b;
        if (rVar.b()) {
            androidx.compose.ui.node.a aVar = this.f14546a;
            if (!aVar.C()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
            }
            if (!aVar.D()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            if (!(!this.f14548c)) {
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            if (this.f14553h != null) {
                this.f14548c = true;
                try {
                    if (!rVar.f14534a.f14530c.isEmpty()) {
                        if (aVar.f1738c != null) {
                            m(aVar, true);
                        } else {
                            l(aVar);
                        }
                    }
                    m(aVar, false);
                } finally {
                    this.f14548c = false;
                }
            }
        }
    }

    public final boolean k(androidx.compose.ui.node.a aVar, boolean z10, boolean z11) {
        m2.a aVar2;
        boolean zB;
        boolean zC;
        r1.w0 placementScope;
        x xVar;
        androidx.compose.ui.node.a aVarQ;
        k0 k0Var;
        o0 o0Var;
        k0 k0Var2;
        o0 o0Var2;
        int i10 = 0;
        if (aVar.J) {
            return false;
        }
        boolean zD = aVar.D();
        n0 n0Var = aVar.D;
        if (!zD && !n0Var.f14508o.f14491z && !f(aVar) && !d7.a.d(aVar.E(), Boolean.TRUE) && ((!n0Var.f14500g || (aVar.p() != 1 && ((k0Var2 = n0Var.f14509p) == null || (o0Var2 = k0Var2.f14473w) == null || !o0Var2.f()))) && !n0Var.f14508o.A.f() && ((k0Var = n0Var.f14509p) == null || (o0Var = k0Var.f14473w) == null || !o0Var.f()))) {
            return false;
        }
        boolean z12 = n0Var.f14500g;
        androidx.compose.ui.node.a aVar3 = this.f14546a;
        if (z12 || n0Var.f14497d) {
            if (aVar == aVar3) {
                aVar2 = this.f14553h;
                d7.a.j(aVar2);
            } else {
                aVar2 = null;
            }
            zB = (n0Var.f14500g && z10) ? b(aVar, aVar2) : false;
            zC = c(aVar, aVar2);
        } else {
            zC = false;
            zB = false;
        }
        if (z11) {
            if ((zB || n0Var.f14501h) && d7.a.d(aVar.E(), Boolean.TRUE) && z10) {
                aVar.F();
            }
            if (n0Var.f14498e && (aVar == aVar3 || ((aVarQ = aVar.q()) != null && aVarQ.D() && n0Var.f14508o.f14491z))) {
                if (aVar == aVar3) {
                    if (aVar.K == 3) {
                        aVar.f();
                    }
                    androidx.compose.ui.node.a aVarQ2 = aVar.q();
                    if (aVarQ2 == null || (xVar = aVarQ2.C.f14576b) == null || (placementScope = xVar.f14533o) == null) {
                        placementScope = ((u1.w) g.z(aVar)).getPlacementScope();
                    }
                    r1.w0.g(placementScope, n0Var.f14508o, 0, 0);
                } else {
                    aVar.M();
                }
                this.f14549d.f14449a.c(aVar);
                aVar.I = true;
            }
        }
        o0.i iVar = this.f14552g;
        if (iVar.l()) {
            int i11 = iVar.f12343c;
            if (i11 > 0) {
                Object[] objArr = iVar.f12341a;
                do {
                    s0 s0Var = (s0) objArr[i10];
                    if (s0Var.f14542a.C()) {
                        boolean z13 = s0Var.f14543b;
                        boolean z14 = s0Var.f14544c;
                        androidx.compose.ui.node.a aVar4 = s0Var.f14542a;
                        if (z13) {
                            o(aVar4, z14);
                        } else {
                            q(aVar4, z14);
                        }
                    }
                    i10++;
                } while (i10 < i11);
            }
            iVar.g();
        }
        return zC;
    }

    public final void l(androidx.compose.ui.node.a aVar) {
        o0.i iVarT = aVar.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (g(aVar2)) {
                    if (g.v(aVar2)) {
                        m(aVar2, true);
                    } else {
                        l(aVar2);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void m(androidx.compose.ui.node.a aVar, boolean z10) {
        m2.a aVar2;
        if (aVar == this.f14546a) {
            aVar2 = this.f14553h;
            d7.a.j(aVar2);
        } else {
            aVar2 = null;
        }
        if (z10) {
            b(aVar, aVar2);
        } else {
            c(aVar, aVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x002b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public final boolean n(androidx.compose.ui.node.a aVar, boolean z10) {
        n0 n0Var;
        boolean zD;
        r rVar;
        int iE = t.k.e(aVar.D.f14496c);
        if (iE == 0) {
            n0Var = aVar.D;
            if ((n0Var.f14500g && !n0Var.f14501h) || z10) {
                n0Var.f14501h = true;
                n0Var.f14502i = true;
                n0Var.f14498e = true;
                n0Var.f14499f = true;
                if (!aVar.J) {
                    androidx.compose.ui.node.a aVarQ = aVar.q();
                    zD = d7.a.d(aVar.E(), Boolean.TRUE);
                    rVar = this.f14547b;
                    if (!zD && ((aVarQ == null || !aVarQ.D.f14500g) && (aVarQ == null || !aVarQ.D.f14501h))) {
                        rVar.a(aVar, true);
                    } else if (aVar.D() && ((aVarQ == null || !aVarQ.D.f14498e) && (aVarQ == null || !aVarQ.D.f14497d))) {
                        rVar.a(aVar, false);
                    }
                    if (!this.f14548c) {
                        return true;
                    }
                }
            }
        } else if (iE != 1) {
            if (iE == 2) {
                n0Var = aVar.D;
                if (n0Var.f14500g) {
                    n0Var.f14501h = true;
                    n0Var.f14502i = true;
                    n0Var.f14498e = true;
                    n0Var.f14499f = true;
                    if (!aVar.J) {
                        androidx.compose.ui.node.a aVarQ2 = aVar.q();
                        zD = d7.a.d(aVar.E(), Boolean.TRUE);
                        rVar = this.f14547b;
                        if (!zD) {
                            if (aVar.D()) {
                                rVar.a(aVar, false);
                            }
                        } else if (aVar.D()) {
                            rVar.a(aVar, false);
                        }
                        if (!this.f14548c) {
                            return true;
                        }
                    }
                } else {
                    n0Var.f14501h = true;
                    n0Var.f14502i = true;
                    n0Var.f14498e = true;
                    n0Var.f14499f = true;
                    if (!aVar.J) {
                        androidx.compose.ui.node.a aVarQ3 = aVar.q();
                        zD = d7.a.d(aVar.E(), Boolean.TRUE);
                        rVar = this.f14547b;
                        if (!zD) {
                            if (aVar.D()) {
                                rVar.a(aVar, false);
                            }
                        } else if (aVar.D()) {
                            rVar.a(aVar, false);
                        }
                        if (!this.f14548c) {
                            return true;
                        }
                    }
                }
            } else if (iE != 3) {
                if (iE != 4) {
                    throw new androidx.fragment.app.a0();
                }
                n0Var = aVar.D;
                if (n0Var.f14500g) {
                    n0Var.f14501h = true;
                    n0Var.f14502i = true;
                    n0Var.f14498e = true;
                    n0Var.f14499f = true;
                    if (!aVar.J) {
                        androidx.compose.ui.node.a aVarQ4 = aVar.q();
                        zD = d7.a.d(aVar.E(), Boolean.TRUE);
                        rVar = this.f14547b;
                        if (!zD) {
                            if (aVar.D()) {
                                rVar.a(aVar, false);
                            }
                        } else if (aVar.D()) {
                            rVar.a(aVar, false);
                        }
                        if (!this.f14548c) {
                            return true;
                        }
                    }
                } else {
                    n0Var.f14501h = true;
                    n0Var.f14502i = true;
                    n0Var.f14498e = true;
                    n0Var.f14499f = true;
                    if (!aVar.J) {
                        androidx.compose.ui.node.a aVarQ5 = aVar.q();
                        zD = d7.a.d(aVar.E(), Boolean.TRUE);
                        rVar = this.f14547b;
                        if (!zD) {
                            if (aVar.D()) {
                                rVar.a(aVar, false);
                            }
                        } else if (aVar.D()) {
                            rVar.a(aVar, false);
                        }
                        if (!this.f14548c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    public final boolean o(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a aVarQ;
        androidx.compose.ui.node.a aVarQ2;
        k0 k0Var;
        o0 o0Var;
        if (aVar.f1738c == null) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope".toString());
        }
        n0 n0Var = aVar.D;
        int iE = t.k.e(n0Var.f14496c);
        if (iE == 0) {
            this.f14552g.c(new s0(aVar, true, z10));
        } else if (iE != 1) {
            if (iE == 2 || iE == 3) {
                this.f14552g.c(new s0(aVar, true, z10));
            } else {
                if (iE != 4) {
                    throw new androidx.fragment.app.a0();
                }
                if (!n0Var.f14500g || z10) {
                    n0Var.f14500g = true;
                    n0Var.f14497d = true;
                    if (!aVar.J) {
                        boolean zD = d7.a.d(aVar.E(), Boolean.TRUE);
                        r rVar = this.f14547b;
                        if ((zD || (n0Var.f14500g && (aVar.p() == 1 || !((k0Var = n0Var.f14509p) == null || (o0Var = k0Var.f14473w) == null || !o0Var.f())))) && ((aVarQ = aVar.q()) == null || !aVarQ.D.f14500g)) {
                            rVar.a(aVar, true);
                        } else if ((aVar.D() || f(aVar)) && ((aVarQ2 = aVar.q()) == null || !aVarQ2.D.f14497d)) {
                            rVar.a(aVar, false);
                        }
                        if (!this.f14548c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean p(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a aVarQ;
        int iE = t.k.e(aVar.D.f14496c);
        if (iE == 0 || iE == 1 || iE == 2 || iE == 3) {
            return false;
        }
        if (iE != 4) {
            throw new androidx.fragment.app.a0();
        }
        n0 n0Var = aVar.D;
        if (!z10 && aVar.D() == n0Var.f14508o.f14491z && (n0Var.f14497d || n0Var.f14498e)) {
            return false;
        }
        n0Var.f14498e = true;
        n0Var.f14499f = true;
        if (aVar.J) {
            return false;
        }
        if (n0Var.f14508o.f14491z && (((aVarQ = aVar.q()) == null || !aVarQ.D.f14498e) && (aVarQ == null || !aVarQ.D.f14497d))) {
            this.f14547b.a(aVar, false);
        }
        return !this.f14548c;
    }

    public final boolean q(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a aVarQ;
        int iE = t.k.e(aVar.D.f14496c);
        if (iE == 0 || iE == 1) {
            return false;
        }
        if (iE == 2 || iE == 3) {
            this.f14552g.c(new s0(aVar, false, z10));
            return false;
        }
        if (iE != 4) {
            throw new androidx.fragment.app.a0();
        }
        n0 n0Var = aVar.D;
        if (n0Var.f14497d && !z10) {
            return false;
        }
        n0Var.f14497d = true;
        if (aVar.J) {
            return false;
        }
        if ((aVar.D() || f(aVar)) && ((aVarQ = aVar.q()) == null || !aVarQ.D.f14497d)) {
            this.f14547b.a(aVar, false);
        }
        return !this.f14548c;
    }

    public final void r(long j10) {
        m2.a aVar = this.f14553h;
        if (aVar != null && m2.a.c(aVar.f11792a, j10)) {
            return;
        }
        if (!(!this.f14548c)) {
            throw new IllegalArgumentException("updateRootConstraints called while measuring".toString());
        }
        this.f14553h = new m2.a(j10);
        androidx.compose.ui.node.a aVar2 = this.f14546a;
        androidx.compose.ui.node.a aVar3 = aVar2.f1738c;
        n0 n0Var = aVar2.D;
        if (aVar3 != null) {
            n0Var.f14500g = true;
        }
        n0Var.f14497d = true;
        this.f14547b.a(aVar2, aVar3 != null);
    }
}
