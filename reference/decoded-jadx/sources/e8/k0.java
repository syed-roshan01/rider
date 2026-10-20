package e8;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends SocketAddress {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5293e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SocketAddress f5294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InetSocketAddress f5295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5297d;

    public k0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        y3.e.J(socketAddress, "proxyAddress");
        y3.e.J(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            y3.e.M(socketAddress, "The proxy address %s is not resolved", !((InetSocketAddress) socketAddress).isUnresolved());
        }
        this.f5294a = socketAddress;
        this.f5295b = inetSocketAddress;
        this.f5296c = str;
        this.f5297d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return y3.e.f0(this.f5294a, k0Var.f5294a) && y3.e.f0(this.f5295b, k0Var.f5295b) && y3.e.f0(this.f5296c, k0Var.f5296c) && y3.e.f0(this.f5297d, k0Var.f5297d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5294a, this.f5295b, this.f5296c, this.f5297d});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f5294a, "proxyAddr");
        gVarJ0.a(this.f5295b, "targetAddr");
        gVarJ0.a(this.f5296c, "username");
        gVarJ0.c("hasPassword", this.f5297d != null);
        return gVarJ0.toString();
    }
}
