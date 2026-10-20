package a2;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f968c = new r(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f970b;

    public r() {
        this.f969a = false;
        this.f970b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f969a == rVar.f969a && this.f970b == rVar.f970b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f970b) + (Boolean.hashCode(this.f969a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f969a + ", emojiSupportMatch=" + ((Object) h.a(this.f970b)) + ')';
    }

    public r(int i10, boolean z10) {
        this.f969a = z10;
        this.f970b = i10;
    }
}
