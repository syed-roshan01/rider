package h1;

import d7.t;
import e1.f;
import e1.g0;
import e1.l;
import e1.y;
import g1.g;
import l.q;
import m2.i;
import m2.k;
import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f7520f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f7521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f7522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7523p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f7524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f7526s;

    public a(y yVar, long j10, long j11) {
        int i10;
        int i11;
        this.f7520f = yVar;
        this.f7521n = j10;
        this.f7522o = j11;
        int i12 = i.f11808c;
        if (((int) (j10 >> 32)) >= 0 && ((int) (j10 & 4294967295L)) >= 0 && (i10 = (int) (j11 >> 32)) >= 0 && (i11 = (int) (j11 & 4294967295L)) >= 0) {
            f fVar = (f) yVar;
            if (i10 <= fVar.f5003a.getWidth() && i11 <= fVar.f5003a.getHeight()) {
                this.f7524q = j11;
                this.f7525r = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // h1.c
    public final boolean c(float f10) {
        this.f7525r = f10;
        return true;
    }

    @Override // h1.c
    public final boolean e(l lVar) {
        this.f7526s = lVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d7.a.d(this.f7520f, aVar.f7520f) && i.a(this.f7521n, aVar.f7521n) && k.a(this.f7522o, aVar.f7522o) && g0.d(this.f7523p, aVar.f7523p);
    }

    @Override // h1.c
    public final long h() {
        return s.m0(this.f7524q);
    }

    public final int hashCode() {
        int iHashCode = this.f7520f.hashCode() * 31;
        int i10 = i.f11808c;
        return Integer.hashCode(this.f7523p) + q.b(this.f7522o, q.b(this.f7521n, iHashCode, 31), 31);
    }

    @Override // h1.c
    public final void i(g gVar) {
        g.C(gVar, this.f7520f, this.f7521n, this.f7522o, s.e(t.p0(d1.f.d(gVar.e())), t.p0(d1.f.b(gVar.e()))), this.f7525r, this.f7526s, this.f7523p, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f7520f);
        sb.append(", srcOffset=");
        sb.append((Object) i.b(this.f7521n));
        sb.append(", srcSize=");
        sb.append((Object) k.b(this.f7522o));
        sb.append(", filterQuality=");
        int i10 = this.f7523p;
        if (g0.d(i10, 0)) {
            str = "None";
        } else if (g0.d(i10, 1)) {
            str = "Low";
        } else if (g0.d(i10, 2)) {
            str = "Medium";
        } else {
            str = g0.d(i10, 3) ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
