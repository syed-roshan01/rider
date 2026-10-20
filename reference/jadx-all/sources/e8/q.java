package e8;

import g8.n4;
import g8.y3;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class q implements s {
    @Override // e8.s
    public final OutputStream a(y3 y3Var) {
        return new GZIPOutputStream(y3Var);
    }

    @Override // e8.s
    public final InputStream b(n4 n4Var) {
        return new GZIPInputStream(n4Var);
    }

    @Override // e8.s
    public final String c() {
        return "gzip";
    }
}
