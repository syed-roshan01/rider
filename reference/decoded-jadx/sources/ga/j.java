package ga;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l {
    @Override // ga.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z10 = fa.g.f6401d;
        return fa.e.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // ga.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
