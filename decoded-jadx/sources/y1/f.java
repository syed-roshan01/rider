package y1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f16753d = new f(0.0f, new i9.d(0.0f, 0.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i9.d f16755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16756c = 0;

    public f(float f10, i9.d dVar) {
        this.f16754a = f10;
        this.f16755b = dVar;
        if (!(!Float.isNaN(f10))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16754a == fVar.f16754a && d7.a.d(this.f16755b, fVar.f16755b) && this.f16756c == fVar.f16756c;
    }

    public final int hashCode() {
        return ((this.f16755b.hashCode() + (Float.hashCode(this.f16754a) * 31)) * 31) + this.f16756c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f16754a);
        sb.append(", range=");
        sb.append(this.f16755b);
        sb.append(", steps=");
        return a7.a.o(sb, this.f16756c, ')');
    }
}
