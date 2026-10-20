package g8;

import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class k implements v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f6893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3 f6894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f6895c = new ArrayDeque();

    public k(v3 v3Var, v1 v1Var) {
        this.f6894b = v3Var;
        this.f6893a = v1Var;
    }

    @Override // g8.v3
    public final void a(a6 a6Var) {
        while (true) {
            InputStream next = a6Var.next();
            if (next == null) {
                return;
            } else {
                this.f6895c.add(next);
            }
        }
    }

    @Override // g8.v3
    public final void b(Throwable th) {
        ((h8.k) this.f6893a).o(new x1(this, th, 2));
    }

    @Override // g8.v3
    public final void c(boolean z10) {
        ((h8.k) this.f6893a).o(new k6.m4(2, this, z10));
    }

    @Override // g8.v3
    public final void d(int i10) {
        ((h8.k) this.f6893a).o(new com.google.android.gms.common.api.internal.c0(this, i10, 2));
    }
}
