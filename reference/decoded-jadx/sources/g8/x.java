package g8;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class x implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f7206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.f f7207b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f7208c;

    public x(h8.h hVar, b3 b3Var) {
        this.f7206a = hVar;
        this.f7208c = b3Var;
    }

    @Override // g8.m0
    public final ScheduledExecutorService L() {
        return this.f7206a.L();
    }

    @Override // g8.m0
    public final o0 a0(SocketAddress socketAddress, l0 l0Var, i2 i2Var) {
        return new w(this, this.f7206a.a0(socketAddress, l0Var, i2Var), l0Var.f6912a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7206a.close();
    }
}
