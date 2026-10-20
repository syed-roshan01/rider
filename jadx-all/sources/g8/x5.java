package g8;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class x5 implements v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3 f7238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7239b;

    public x5(v1 v1Var) {
        this.f7238a = v1Var;
    }

    @Override // g8.v3
    public final void a(a6 a6Var) {
        if (!this.f7239b) {
            this.f7238a.a(a6Var);
        } else if (a6Var instanceof Closeable) {
            s1.b((Closeable) a6Var);
        }
    }

    @Override // g8.v3
    public final void b(Throwable th) {
        this.f7239b = true;
        this.f7238a.b(th);
    }

    @Override // g8.v3
    public final void c(boolean z10) {
        this.f7239b = true;
        this.f7238a.c(z10);
    }

    @Override // g8.v3
    public final void d(int i10) {
        this.f7238a.d(i10);
    }
}
