package ja;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface e0 extends Closeable, Flushable {
    void b0(g gVar, long j10);

    i0 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
