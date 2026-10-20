package a2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f902d;

    public /* synthetic */ b(Object obj, int i10, int i11) {
        this(obj, i10, i11, "");
    }

    public final d a(int i10) {
        int i11 = this.f901c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first".toString());
        }
        return new d(this.f899a, this.f900b, i10, this.f902d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return d7.a.d(this.f899a, bVar.f899a) && this.f900b == bVar.f900b && this.f901c == bVar.f901c && d7.a.d(this.f902d, bVar.f902d);
    }

    public final int hashCode() {
        Object obj = this.f899a;
        return this.f902d.hashCode() + a7.a.u(this.f901c, a7.a.u(this.f900b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.f899a + ", start=" + this.f900b + ", end=" + this.f901c + ", tag=" + this.f902d + ')';
    }

    public b(Object obj, int i10, int i11, String str) {
        this.f899a = obj;
        this.f900b = i10;
        this.f901c = i11;
        this.f902d = str;
    }
}
