package androidx.lifecycle;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable, m9.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.j f2132a;

    public e(u8.j jVar) {
        this.f2132a = jVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m9.f1 f1Var = (m9.f1) this.f2132a.f(m9.a0.f11902b);
        if (f1Var != null) {
            f1Var.a(null);
        }
    }

    @Override // m9.d0
    public final u8.j q() {
        return this.f2132a;
    }
}
