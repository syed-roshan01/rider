package g8;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements m4 {
    public final void a(int i10) {
        if (j() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // g8.m4
    public void k() {
    }

    @Override // g8.m4
    public boolean markSupported() {
        return this instanceof o4;
    }

    @Override // g8.m4
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
