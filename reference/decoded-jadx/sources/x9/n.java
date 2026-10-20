package x9;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n implements b, k, m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f16439d = new n();

    public List a(String str) throws UnknownHostException {
        d7.a.m(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            d7.a.l(allByName, "getAllByName(hostname)");
            return b9.b.X(allByName);
        } catch (NullPointerException e4) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e4);
            throw unknownHostException;
        }
    }
}
