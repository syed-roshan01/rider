package e8;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends d1 {
    @Override // e8.d1
    public final void b(TimeUnit timeUnit) {
        ((f8.c) this).f6386a.b(timeUnit);
    }

    @Override // e8.d1
    public final void c() {
        ((f8.c) this).f6386a.c();
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(((f8.c) this).f6386a, "delegate");
        return gVarJ0.toString();
    }
}
