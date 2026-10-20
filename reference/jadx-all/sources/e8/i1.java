package e8;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BitSet f5283d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5286c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            bitSet.set(c10);
        }
        for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
            bitSet.set(c11);
        }
        f5283d = bitSet;
    }

    public i1(String str, boolean z10, Object obj) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        y3.e.J(lowerCase, "name");
        y3.e.G("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            l1.f5302c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i10 = 0; i10 < lowerCase.length(); i10++) {
            char cCharAt = lowerCase.charAt(i10);
            if ((!z10 || cCharAt != ':' || i10 != 0) && !f5283d.get(cCharAt)) {
                throw new IllegalArgumentException(f6.a.c0("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
        }
        this.f5284a = lowerCase;
        this.f5285b = lowerCase.getBytes(q6.d.f13203a);
        this.f5286c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Serializable serializable);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5284a.equals(((i1) obj).f5284a);
    }

    public final int hashCode() {
        return this.f5284a.hashCode();
    }

    public final String toString() {
        return a7.a.p(new StringBuilder("Key{name='"), this.f5284a, "'}");
    }
}
