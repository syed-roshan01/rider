package ka;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f10653a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(l9.a.f11393a);
        d7.a.l(bytes, "this as java.lang.String).getBytes(charset)");
        f10653a = bytes;
    }

    public static final String a(ja.g gVar, long j10) throws EOFException {
        d7.a.m(gVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (gVar.f(j11) == 13) {
                String strP = gVar.P(j11, l9.a.f11393a);
                gVar.l(2L);
                return strP;
            }
        }
        String strP2 = gVar.P(j10, l9.a.f11393a);
        gVar.l(1L);
        return strP2;
    }
}
