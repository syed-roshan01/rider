package m0;

/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f11580a;

    public /* synthetic */ l2(m mVar) {
        this.f11580a = mVar;
    }

    public static final /* synthetic */ l2 a(m mVar) {
        return new l2(mVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l2) {
            return d7.a.d(this.f11580a, ((l2) obj).f11580a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11580a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f11580a + ')';
    }
}
