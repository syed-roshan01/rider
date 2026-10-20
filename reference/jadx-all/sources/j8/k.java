package j8;

import ja.a0;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f8494a = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ja.j f8495b;

    static {
        ja.j jVar = ja.j.f8539d;
        f8495b = fa.l.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(ja.i iVar) {
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static int b(int i10, byte b10, short s9) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s9 <= i10) {
            return (short) (i10 - s9);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s9), Integer.valueOf(i10));
        throw null;
    }

    public static void c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public final i d(a0 a0Var) {
        return new i(a0Var);
    }
}
