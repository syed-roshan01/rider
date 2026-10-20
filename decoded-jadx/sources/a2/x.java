package a2;

import e1.k0;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2.o f1031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2.l f1033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2.j f1034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2.k f1035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2.e f1036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l2.a f1039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l2.p f1040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h2.d f1041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l2.j f1043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k0 f1044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f1045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1.h f1046p;

    public x(l2.o oVar, long j10, f2.l lVar, f2.j jVar, f2.k kVar, f2.e eVar, String str, long j11, l2.a aVar, l2.p pVar, h2.d dVar, long j12, l2.j jVar2, k0 k0Var, s sVar, g1.h hVar) {
        this.f1031a = oVar;
        this.f1032b = j10;
        this.f1033c = lVar;
        this.f1034d = jVar;
        this.f1035e = kVar;
        this.f1036f = eVar;
        this.f1037g = str;
        this.f1038h = j11;
        this.f1039i = aVar;
        this.f1040j = pVar;
        this.f1041k = dVar;
        this.f1042l = j12;
        this.f1043m = jVar2;
        this.f1044n = k0Var;
        this.f1045o = sVar;
        this.f1046p = hVar;
    }

    public final boolean a(x xVar) {
        if (this == xVar) {
            return true;
        }
        return m2.n.a(this.f1032b, xVar.f1032b) && d7.a.d(this.f1033c, xVar.f1033c) && d7.a.d(this.f1034d, xVar.f1034d) && d7.a.d(this.f1035e, xVar.f1035e) && d7.a.d(this.f1036f, xVar.f1036f) && d7.a.d(this.f1037g, xVar.f1037g) && m2.n.a(this.f1038h, xVar.f1038h) && d7.a.d(this.f1039i, xVar.f1039i) && d7.a.d(this.f1040j, xVar.f1040j) && d7.a.d(this.f1041k, xVar.f1041k) && e1.r.c(this.f1042l, xVar.f1042l) && d7.a.d(this.f1045o, xVar.f1045o);
    }

    public final boolean b(x xVar) {
        return d7.a.d(this.f1031a, xVar.f1031a) && d7.a.d(this.f1043m, xVar.f1043m) && d7.a.d(this.f1044n, xVar.f1044n) && d7.a.d(this.f1046p, xVar.f1046p);
    }

    public final x c(x xVar) {
        if (xVar == null) {
            return this;
        }
        l2.o oVar = xVar.f1031a;
        return y.a(this, oVar.d(), oVar.e(), oVar.c(), xVar.f1032b, xVar.f1033c, xVar.f1034d, xVar.f1035e, xVar.f1036f, xVar.f1037g, xVar.f1038h, xVar.f1039i, xVar.f1040j, xVar.f1041k, xVar.f1042l, xVar.f1043m, xVar.f1044n, xVar.f1045o, xVar.f1046p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return a(xVar) && b(xVar);
    }

    public final int hashCode() {
        l2.o oVar = this.f1031a;
        long jD = oVar.d();
        int i10 = e1.r.f5066h;
        int iHashCode = Long.hashCode(jD) * 31;
        e1.n nVarE = oVar.e();
        int iHashCode2 = (Float.hashCode(oVar.c()) + ((iHashCode + (nVarE != null ? nVarE.hashCode() : 0)) * 31)) * 31;
        m2.o[] oVarArr = m2.n.f11819b;
        int iB = l.q.b(this.f1032b, iHashCode2, 31);
        f2.l lVar = this.f1033c;
        int i11 = (iB + (lVar != null ? lVar.f6122a : 0)) * 31;
        f2.j jVar = this.f1034d;
        int iHashCode3 = (i11 + (jVar != null ? Integer.hashCode(jVar.f6112a) : 0)) * 31;
        f2.k kVar = this.f1035e;
        int iHashCode4 = (iHashCode3 + (kVar != null ? Integer.hashCode(kVar.f6113a) : 0)) * 31;
        f2.e eVar = this.f1036f;
        int iHashCode5 = (iHashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str = this.f1037g;
        int iB2 = l.q.b(this.f1038h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        l2.a aVar = this.f1039i;
        int iHashCode6 = (iB2 + (aVar != null ? Float.hashCode(aVar.f11194a) : 0)) * 31;
        l2.p pVar = this.f1040j;
        int iHashCode7 = (iHashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        h2.d dVar = this.f1041k;
        int iB3 = l.q.b(this.f1042l, (iHashCode7 + (dVar != null ? dVar.f7539a.hashCode() : 0)) * 31, 31);
        l2.j jVar2 = this.f1043m;
        int i12 = (iB3 + (jVar2 != null ? jVar2.f11214a : 0)) * 31;
        k0 k0Var = this.f1044n;
        int iHashCode8 = (i12 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        s sVar = this.f1045o;
        int iHashCode9 = (iHashCode8 + (sVar != null ? sVar.hashCode() : 0)) * 31;
        g1.h hVar = this.f1046p;
        return iHashCode9 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        l2.o oVar = this.f1031a;
        sb.append((Object) e1.r.i(oVar.d()));
        sb.append(", brush=");
        sb.append(oVar.e());
        sb.append(", alpha=");
        sb.append(oVar.c());
        sb.append(", fontSize=");
        sb.append((Object) m2.n.d(this.f1032b));
        sb.append(", fontWeight=");
        sb.append(this.f1033c);
        sb.append(", fontStyle=");
        sb.append(this.f1034d);
        sb.append(", fontSynthesis=");
        sb.append(this.f1035e);
        sb.append(", fontFamily=");
        sb.append(this.f1036f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f1037g);
        sb.append(", letterSpacing=");
        sb.append((Object) m2.n.d(this.f1038h));
        sb.append(", baselineShift=");
        sb.append(this.f1039i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f1040j);
        sb.append(", localeList=");
        sb.append(this.f1041k);
        sb.append(", background=");
        k1.d(this.f1042l, sb, ", textDecoration=");
        sb.append(this.f1043m);
        sb.append(", shadow=");
        sb.append(this.f1044n);
        sb.append(", platformStyle=");
        sb.append(this.f1045o);
        sb.append(", drawStyle=");
        sb.append(this.f1046p);
        sb.append(')');
        return sb.toString();
    }

    public x(long j10, long j11, f2.l lVar, f2.j jVar, f2.k kVar, f2.e eVar, String str, long j12, l2.a aVar, l2.p pVar, h2.d dVar, long j13, l2.j jVar2, k0 k0Var, int i10) {
        this((i10 & 1) != 0 ? e1.r.f5065g : j10, (i10 & 2) != 0 ? m2.n.f11820c : j11, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : jVar, (i10 & 16) != 0 ? null : kVar, (i10 & 32) != 0 ? null : eVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? m2.n.f11820c : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & 1024) != 0 ? null : dVar, (i10 & 2048) != 0 ? e1.r.f5065g : j13, (i10 & 4096) != 0 ? null : jVar2, (i10 & 8192) != 0 ? null : k0Var, (s) null, (g1.h) null);
    }

    public x(long j10, long j11, f2.l lVar, f2.j jVar, f2.k kVar, f2.e eVar, String str, long j12, l2.a aVar, l2.p pVar, h2.d dVar, long j13, l2.j jVar2, k0 k0Var, s sVar, g1.h hVar) {
        this(j10 != e1.r.f5065g ? new l2.c(j10) : l2.m.f11216a, j11, lVar, jVar, kVar, eVar, str, j12, aVar, pVar, dVar, j13, jVar2, k0Var, sVar, hVar);
    }
}
