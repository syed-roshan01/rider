package ja;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p extends i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i0 f8561e;

    public p(i0 i0Var) {
        d7.a.m(i0Var, "delegate");
        this.f8561e = i0Var;
    }

    @Override // ja.i0
    public final i0 a() {
        return this.f8561e.a();
    }

    @Override // ja.i0
    public final i0 b() {
        return this.f8561e.b();
    }

    @Override // ja.i0
    public final long c() {
        return this.f8561e.c();
    }

    @Override // ja.i0
    public final i0 d(long j10) {
        return this.f8561e.d(j10);
    }

    @Override // ja.i0
    public final boolean e() {
        return this.f8561e.e();
    }

    @Override // ja.i0
    public final void f() throws InterruptedIOException {
        this.f8561e.f();
    }

    @Override // ja.i0
    public final i0 g(long j10, TimeUnit timeUnit) {
        d7.a.m(timeUnit, "unit");
        return this.f8561e.g(j10, timeUnit);
    }
}
