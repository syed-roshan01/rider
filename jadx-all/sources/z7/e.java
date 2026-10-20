package z7;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f17333a = Charset.defaultCharset();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f17334b = Charset.forName("SJIS");

    static {
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused) {
        }
        Charset charsetForName = Charset.forName("EUC_JP");
        Charset charset = f17334b;
        Charset charset2 = f17333a;
        if (charset.equals(charset2)) {
            return;
        }
        charsetForName.equals(charset2);
    }
}
