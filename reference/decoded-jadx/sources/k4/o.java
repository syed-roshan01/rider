package k4;

import java.io.Closeable;
import o7.d0;
import x9.c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Closeable {
    public abstract d0 a();

    public abstract ja.i b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        y9.b.b(((c0) this).f16375c);
    }
}
