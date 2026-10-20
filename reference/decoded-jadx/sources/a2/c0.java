package a2;

import e1.k0;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f910d = new c0(0, 0, null, null, null, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f913c;

    public c0(x xVar, p pVar, t tVar) {
        this.f911a = xVar;
        this.f912b = pVar;
        this.f913c = tVar;
    }

    public static c0 a(int i10, int i11, long j10, long j11, long j12, long j13, t tVar, c0 c0Var, f2.m mVar, f2.l lVar, l2.g gVar) {
        l2.o cVar;
        long jD = (i11 & 1) != 0 ? c0Var.f911a.f1031a.d() : j10;
        long j14 = (i11 & 2) != 0 ? c0Var.f911a.f1032b : j11;
        f2.l lVar2 = (i11 & 4) != 0 ? c0Var.f911a.f1033c : lVar;
        f2.j jVar = (i11 & 8) != 0 ? c0Var.f911a.f1034d : null;
        f2.k kVar = (i11 & 16) != 0 ? c0Var.f911a.f1035e : null;
        f2.e eVar = (i11 & 32) != 0 ? c0Var.f911a.f1036f : mVar;
        String str = (i11 & 64) != 0 ? c0Var.f911a.f1037g : null;
        long j15 = (i11 & 128) != 0 ? c0Var.f911a.f1038h : j12;
        l2.a aVar = (i11 & 256) != 0 ? c0Var.f911a.f1039i : null;
        l2.p pVar = (i11 & 512) != 0 ? c0Var.f911a.f1040j : null;
        h2.d dVar = (i11 & 1024) != 0 ? c0Var.f911a.f1041k : null;
        long j16 = (i11 & 2048) != 0 ? c0Var.f911a.f1042l : 0L;
        l2.j jVar2 = (i11 & 4096) != 0 ? c0Var.f911a.f1043m : null;
        k0 k0Var = (i11 & 8192) != 0 ? c0Var.f911a.f1044n : null;
        g1.h hVar = (i11 & 16384) != 0 ? c0Var.f911a.f1046p : null;
        int i12 = (32768 & i11) != 0 ? c0Var.f912b.f957a : i10;
        int i13 = (65536 & i11) != 0 ? c0Var.f912b.f958b : 0;
        long j17 = (131072 & i11) != 0 ? c0Var.f912b.f959c : j13;
        l2.q qVar = (262144 & i11) != 0 ? c0Var.f912b.f960d : null;
        t tVar2 = (524288 & i11) != 0 ? c0Var.f913c : tVar;
        l2.g gVar2 = (i11 & 1048576) != 0 ? c0Var.f912b.f962f : gVar;
        int i14 = (2097152 & i11) != 0 ? c0Var.f912b.f963g : 0;
        int i15 = (4194304 & i11) != 0 ? c0Var.f912b.f964h : 0;
        l2.r rVar = (i11 & 8388608) != 0 ? c0Var.f912b.f965i : null;
        x xVar = c0Var.f911a;
        int i16 = i12;
        l2.q qVar2 = qVar;
        if (e1.r.c(jD, xVar.f1031a.d())) {
            cVar = xVar.f1031a;
        } else {
            cVar = jD != e1.r.f5065g ? new l2.c(jD) : l2.m.f11216a;
        }
        return new c0(new x(cVar, j14, lVar2, jVar, kVar, eVar, str, j15, aVar, pVar, dVar, j16, jVar2, k0Var, tVar2 != null ? tVar2.f972a : null, hVar), new p(i16, i13, j17, qVar2, tVar2 != 0 ? tVar2.f973b : null, gVar2, i14, i15, rVar), tVar2);
    }

    public static c0 e(int i10, int i11, long j10, long j11, long j12, long j13, c0 c0Var, f2.e eVar, f2.j jVar, f2.l lVar, l2.j jVar2) {
        long j14 = (i11 & 1) != 0 ? e1.r.f5065g : j10;
        long j15 = (i11 & 2) != 0 ? m2.n.f11820c : j11;
        f2.l lVar2 = (i11 & 4) != 0 ? null : lVar;
        f2.j jVar3 = (i11 & 8) != 0 ? null : jVar;
        f2.e eVar2 = (i11 & 32) != 0 ? null : eVar;
        long j16 = (i11 & 128) != 0 ? m2.n.f11820c : j12;
        long j17 = (i11 & 2048) != 0 ? e1.r.f5065g : 0L;
        l2.j jVar4 = (i11 & 4096) != 0 ? null : jVar2;
        int i12 = (32768 & i11) != 0 ? Integer.MIN_VALUE : i10;
        int i13 = (65536 & i11) != 0 ? Integer.MIN_VALUE : 0;
        long j18 = (131072 & i11) != 0 ? m2.n.f11820c : j13;
        int i14 = (i11 & 2097152) != 0 ? Integer.MIN_VALUE : 0;
        x xVarA = y.a(c0Var.f911a, j14, null, Float.NaN, j15, lVar2, jVar3, null, eVar2, null, j16, null, null, null, j17, jVar4, null, null, null);
        p pVarA = q.a(c0Var.f912b, i12, i13, j18, null, null, null, 0, i14, null);
        return (c0Var.f911a == xVarA && c0Var.f912b == pVarA) ? c0Var : new c0(xVarA, pVarA);
    }

    public final long b() {
        return this.f911a.f1031a.d();
    }

    public final boolean c(c0 c0Var) {
        if (this != c0Var) {
            if (!d7.a.d(this.f912b, c0Var.f912b) || !this.f911a.a(c0Var.f911a)) {
                return false;
            }
        }
        return true;
    }

    public final c0 d(c0 c0Var) {
        return (c0Var == null || d7.a.d(c0Var, f910d)) ? this : new c0(this.f911a.c(c0Var.f911a), this.f912b.a(c0Var.f912b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return d7.a.d(this.f911a, c0Var.f911a) && d7.a.d(this.f912b, c0Var.f912b) && d7.a.d(this.f913c, c0Var.f913c);
    }

    public final int hashCode() {
        int iHashCode = (this.f912b.hashCode() + (this.f911a.hashCode() * 31)) * 31;
        t tVar = this.f913c;
        return iHashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) e1.r.i(b()));
        sb.append(", brush=");
        x xVar = this.f911a;
        sb.append(xVar.f1031a.e());
        sb.append(", alpha=");
        sb.append(xVar.f1031a.c());
        sb.append(", fontSize=");
        sb.append((Object) m2.n.d(xVar.f1032b));
        sb.append(", fontWeight=");
        sb.append(xVar.f1033c);
        sb.append(", fontStyle=");
        sb.append(xVar.f1034d);
        sb.append(", fontSynthesis=");
        sb.append(xVar.f1035e);
        sb.append(", fontFamily=");
        sb.append(xVar.f1036f);
        sb.append(", fontFeatureSettings=");
        sb.append(xVar.f1037g);
        sb.append(", letterSpacing=");
        sb.append((Object) m2.n.d(xVar.f1038h));
        sb.append(", baselineShift=");
        sb.append(xVar.f1039i);
        sb.append(", textGeometricTransform=");
        sb.append(xVar.f1040j);
        sb.append(", localeList=");
        sb.append(xVar.f1041k);
        sb.append(", background=");
        k1.d(xVar.f1042l, sb, ", textDecoration=");
        sb.append(xVar.f1043m);
        sb.append(", shadow=");
        sb.append(xVar.f1044n);
        sb.append(", drawStyle=");
        sb.append(xVar.f1046p);
        sb.append(", textAlign=");
        p pVar = this.f912b;
        sb.append((Object) l2.i.b(pVar.f957a));
        sb.append(", textDirection=");
        sb.append((Object) l2.k.b(pVar.f958b));
        sb.append(", lineHeight=");
        sb.append((Object) m2.n.d(pVar.f959c));
        sb.append(", textIndent=");
        sb.append(pVar.f960d);
        sb.append(", platformStyle=");
        sb.append(this.f913c);
        sb.append(", lineHeightStyle=");
        sb.append(pVar.f962f);
        sb.append(", lineBreak=");
        sb.append((Object) l2.e.a(pVar.f963g));
        sb.append(", hyphens=");
        sb.append((Object) l2.d.b(pVar.f964h));
        sb.append(", textMotion=");
        sb.append(pVar.f965i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(x xVar, p pVar) {
        s sVar = xVar.f1045o;
        r rVar = pVar.f961e;
        this(xVar, pVar, (sVar == null && rVar == null) ? null : new t(sVar, rVar));
    }

    public c0(long j10, long j11, f2.l lVar, f2.m mVar, k0 k0Var, int i10) {
        this(new x((i10 & 1) != 0 ? e1.r.f5065g : j10, (i10 & 2) != 0 ? m2.n.f11820c : j11, (i10 & 4) != 0 ? null : lVar, (f2.j) null, (f2.k) null, (i10 & 32) != 0 ? null : mVar, (String) null, (i10 & 128) != 0 ? m2.n.f11820c : 0L, (l2.a) null, (l2.p) null, (h2.d) null, (i10 & 2048) != 0 ? e1.r.f5065g : 0L, (l2.j) null, (i10 & 8192) != 0 ? null : k0Var, (s) null, (g1.h) null), new p((32768 & i10) != 0 ? Integer.MIN_VALUE : 0, (65536 & i10) != 0 ? Integer.MIN_VALUE : 0, (131072 & i10) != 0 ? m2.n.f11820c : 0L, null, null, null, 0, (i10 & 4194304) != 0 ? Integer.MIN_VALUE : 0, null), null);
    }
}
