package a2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l2.q f960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l2.g f962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l2.r f965i;

    public p(int i10, int i11, long j10, l2.q qVar, r rVar, l2.g gVar, int i12, int i13, l2.r rVar2) {
        this.f957a = i10;
        this.f958b = i11;
        this.f959c = j10;
        this.f960d = qVar;
        this.f961e = rVar;
        this.f962f = gVar;
        this.f963g = i12;
        this.f964h = i13;
        this.f965i = rVar2;
        if (m2.n.a(j10, m2.n.f11820c) || m2.n.c(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + m2.n.c(j10) + ')').toString());
    }

    public final p a(p pVar) {
        return pVar == null ? this : q.a(this, pVar.f957a, pVar.f958b, pVar.f959c, pVar.f960d, pVar.f961e, pVar.f962f, pVar.f963g, pVar.f964h, pVar.f965i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l2.i.a(this.f957a, pVar.f957a) && l2.k.a(this.f958b, pVar.f958b) && m2.n.a(this.f959c, pVar.f959c) && d7.a.d(this.f960d, pVar.f960d) && d7.a.d(this.f961e, pVar.f961e) && d7.a.d(this.f962f, pVar.f962f) && this.f963g == pVar.f963g && l2.d.a(this.f964h, pVar.f964h) && d7.a.d(this.f965i, pVar.f965i);
    }

    public final int hashCode() {
        int iU = a7.a.u(this.f958b, Integer.hashCode(this.f957a) * 31, 31);
        m2.o[] oVarArr = m2.n.f11819b;
        int iB = l.q.b(this.f959c, iU, 31);
        l2.q qVar = this.f960d;
        int iHashCode = (iB + (qVar != null ? qVar.hashCode() : 0)) * 31;
        r rVar = this.f961e;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        l2.g gVar = this.f962f;
        int iU2 = a7.a.u(this.f964h, a7.a.u(this.f963g, (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        l2.r rVar2 = this.f965i;
        return iU2 + (rVar2 != null ? rVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) l2.i.b(this.f957a)) + ", textDirection=" + ((Object) l2.k.b(this.f958b)) + ", lineHeight=" + ((Object) m2.n.d(this.f959c)) + ", textIndent=" + this.f960d + ", platformStyle=" + this.f961e + ", lineHeightStyle=" + this.f962f + ", lineBreak=" + ((Object) l2.e.a(this.f963g)) + ", hyphens=" + ((Object) l2.d.b(this.f964h)) + ", textMotion=" + this.f965i + ')';
    }
}
