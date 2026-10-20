package ga;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l {
    @Override // ga.l
    public final boolean a(SSLSocket sSLSocket) {
        return fa.d.f6397d.C() && (sSLSocket instanceof BCSSLSocket);
    }

    @Override // ga.l
    public final n b(SSLSocket sSLSocket) {
        return new h();
    }
}
