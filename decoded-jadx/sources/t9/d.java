package t9;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f14692d = new d(j.f14700c, j.f14701d, j.f14698a, j.f14702e);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // m9.z
    public final String toString() {
        return "Dispatchers.Default";
    }
}
