package h8;

import g8.e4;
import g8.i2;
import g8.k4;
import g8.l0;
import g8.l1;
import g8.m0;
import g8.o0;
import g8.v5;
import g8.w5;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class h implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4 f7627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f7629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f7630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k4 f7631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SocketFactory f7632f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SSLSocketFactory f7633n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HostnameVerifier f7634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i8.b f7635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f7637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g8.n f7638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f7639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f7640u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f7641v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f7643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7644y;

    public h(l1 l1Var, l1 l1Var2, SSLSocketFactory sSLSocketFactory, i8.b bVar, boolean z10, long j10, long j11, int i10, int i11, k4 k4Var) {
        this.f7627a = l1Var;
        int i12 = l1Var.f6916a;
        Object objA = l1Var.f6917b;
        switch (i12) {
            case 0:
                break;
            default:
                objA = w5.a((v5) objA);
                break;
        }
        this.f7628b = (Executor) objA;
        this.f7629c = l1Var2;
        int i13 = l1Var2.f6916a;
        Object objA2 = l1Var2.f6917b;
        switch (i13) {
            case 0:
                break;
            default:
                objA2 = w5.a((v5) objA2);
                break;
        }
        this.f7630d = (ScheduledExecutorService) objA2;
        this.f7632f = null;
        this.f7633n = sSLSocketFactory;
        this.f7634o = null;
        this.f7635p = bVar;
        this.f7636q = 4194304;
        this.f7637r = z10;
        this.f7638s = new g8.n(j10);
        this.f7639t = j11;
        this.f7640u = i10;
        this.f7641v = false;
        this.f7642w = i11;
        this.f7643x = false;
        y3.e.J(k4Var, "transportTracerFactory");
        this.f7631e = k4Var;
    }

    @Override // g8.m0
    public final ScheduledExecutorService L() {
        return this.f7630d;
    }

    @Override // g8.m0
    public final o0 a0(SocketAddress socketAddress, l0 l0Var, i2 i2Var) {
        if (this.f7644y) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        g8.n nVar = this.f7638s;
        long j10 = nVar.f6969b.get();
        n nVar2 = new n(this, (InetSocketAddress) socketAddress, l0Var.f6912a, l0Var.f6914c, l0Var.f6913b, l0Var.f6915d, new l.h(19, this, new g8.m(nVar, j10)));
        if (this.f7637r) {
            nVar2.H = true;
            nVar2.I = j10;
            nVar2.J = this.f7639t;
            nVar2.K = this.f7641v;
        }
        return nVar2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7644y) {
        }
        this.f7644y = true;
        l1 l1Var = (l1) this.f7627a;
        switch (l1Var.f6916a) {
            case 0:
                break;
            default:
                w5.b((v5) l1Var.f6917b, this.f7628b);
                break;
        }
        l1 l1Var2 = (l1) this.f7629c;
        switch (l1Var2.f6916a) {
            case 0:
                break;
            default:
                w5.b((v5) l1Var2.f6917b, this.f7630d);
                break;
        }
    }
}
