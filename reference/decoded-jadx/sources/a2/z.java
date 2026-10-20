package a2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f1053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m2.b f1058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m2.l f1059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f2.d f1060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f1061j;

    public z(e eVar, c0 c0Var, List list, int i10, boolean z10, int i11, m2.b bVar, m2.l lVar, f2.d dVar, long j10) {
        this.f1052a = eVar;
        this.f1053b = c0Var;
        this.f1054c = list;
        this.f1055d = i10;
        this.f1056e = z10;
        this.f1057f = i11;
        this.f1058g = bVar;
        this.f1059h = lVar;
        this.f1060i = dVar;
        this.f1061j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return d7.a.d(this.f1052a, zVar.f1052a) && d7.a.d(this.f1053b, zVar.f1053b) && d7.a.d(this.f1054c, zVar.f1054c) && this.f1055d == zVar.f1055d && this.f1056e == zVar.f1056e && h6.g.T(this.f1057f, zVar.f1057f) && d7.a.d(this.f1058g, zVar.f1058g) && this.f1059h == zVar.f1059h && d7.a.d(this.f1060i, zVar.f1060i) && m2.a.c(this.f1061j, zVar.f1061j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1061j) + ((this.f1060i.hashCode() + ((this.f1059h.hashCode() + ((this.f1058g.hashCode() + a7.a.u(this.f1057f, l.q.c(this.f1056e, (((this.f1054c.hashCode() + ((this.f1053b.hashCode() + (this.f1052a.hashCode() * 31)) * 31)) * 31) + this.f1055d) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f1052a) + ", style=" + this.f1053b + ", placeholders=" + this.f1054c + ", maxLines=" + this.f1055d + ", softWrap=" + this.f1056e + ", overflow=" + ((Object) h6.g.y0(this.f1057f)) + ", density=" + this.f1058g + ", layoutDirection=" + this.f1059h + ", fontFamilyResolver=" + this.f1060i + ", constraints=" + ((Object) m2.a.l(this.f1061j)) + ')';
    }
}
