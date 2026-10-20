package ga;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f7333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f7334b;

    public m(l lVar) {
        this.f7333a = lVar;
    }

    @Override // ga.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f7333a.a(sSLSocket);
    }

    @Override // ga.n
    public final String b(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.b(sSLSocket);
        }
        return null;
    }

    @Override // ga.n
    public final boolean c() {
        return true;
    }

    @Override // ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d7.a.m(list, "protocols");
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f7334b == null && this.f7333a.a(sSLSocket)) {
                this.f7334b = this.f7333a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7334b;
    }
}
