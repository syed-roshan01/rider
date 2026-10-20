package a2;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f953g;

    public m(a aVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f947a = aVar;
        this.f948b = i10;
        this.f949c = i11;
        this.f950d = i12;
        this.f951e = i13;
        this.f952f = f10;
        this.f953g = f11;
    }

    public final int a(int i10) {
        int i11 = this.f949c;
        int i12 = this.f948b;
        return z6.a.r(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return d7.a.d(this.f947a, mVar.f947a) && this.f948b == mVar.f948b && this.f949c == mVar.f949c && this.f950d == mVar.f950d && this.f951e == mVar.f951e && Float.compare(this.f952f, mVar.f952f) == 0 && Float.compare(this.f953g, mVar.f953g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f953g) + l.q.a(this.f952f, a7.a.u(this.f951e, a7.a.u(this.f950d, a7.a.u(this.f949c, a7.a.u(this.f948b, this.f947a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f947a);
        sb.append(", startIndex=");
        sb.append(this.f948b);
        sb.append(", endIndex=");
        sb.append(this.f949c);
        sb.append(", startLineIndex=");
        sb.append(this.f950d);
        sb.append(", endLineIndex=");
        sb.append(this.f951e);
        sb.append(", top=");
        sb.append(this.f952f);
        sb.append(", bottom=");
        return l.q.l(sb, this.f953g, ')');
    }
}
