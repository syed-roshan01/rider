package i8;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z2 f8140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z2 f8141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z2 f8142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z2 f8143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8144i;

    public g(z2 z2Var, z2 z2Var2, z2 z2Var3, z2 z2Var4, Provider provider, int i10) {
        super(provider);
        this.f8140e = z2Var;
        this.f8141f = z2Var2;
        this.f8142g = z2Var3;
        this.f8143h = z2Var4;
        this.f8144i = i10;
    }

    @Override // i8.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f8140e.F(sSLSocket, Boolean.TRUE);
            this.f8141f.F(sSLSocket, str);
        }
        z2 z2Var = this.f8143h;
        z2Var.getClass();
        if (z2Var.w(sSLSocket.getClass()) != null) {
            z2Var.G(sSLSocket, k.b(list));
        }
    }

    @Override // i8.k
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        z2 z2Var = this.f8142g;
        z2Var.getClass();
        if ((z2Var.w(sSLSocket.getClass()) != null) && (bArr = (byte[]) z2Var.G(sSLSocket, new Object[0])) != null) {
            return new String(bArr, n.f8173b);
        }
        return null;
    }

    @Override // i8.k
    public final int e() {
        return this.f8144i;
    }
}
