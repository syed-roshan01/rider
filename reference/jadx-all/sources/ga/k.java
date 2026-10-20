package ga;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fa.l f7331a = new fa.l(6, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f7332b = new j();

    @Override // ga.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // ga.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // ga.n
    public final boolean c() {
        boolean z10 = fa.g.f6401d;
        return fa.g.f6401d;
    }

    @Override // ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d7.a.m(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            fa.m mVar = fa.m.f6417a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) fa.l.c(list).toArray(new String[0]));
        }
    }
}
