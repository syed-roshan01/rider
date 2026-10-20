package l9;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f11393a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        d7.a.l(charsetForName, "forName(...)");
        f11393a = charsetForName;
        d7.a.l(Charset.forName("UTF-16"), "forName(...)");
        d7.a.l(Charset.forName("UTF-16BE"), "forName(...)");
        d7.a.l(Charset.forName("UTF-16LE"), "forName(...)");
        d7.a.l(Charset.forName("US-ASCII"), "forName(...)");
        d7.a.l(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
