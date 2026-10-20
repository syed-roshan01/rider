package g8;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends r7.h implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Closeable f6838e;

    public i(l.z2 z2Var, x1 x1Var, g gVar) {
        super(z2Var, x1Var, 0);
        this.f6838e = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6838e.close();
    }
}
