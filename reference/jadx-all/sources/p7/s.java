package p7;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.p f12845a = new r7.p(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof s) && ((s) obj).f12845a.equals(this.f12845a));
    }

    public final int hashCode() {
        return this.f12845a.hashCode();
    }
}
