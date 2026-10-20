package g8;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class o implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f7013a;

    public o(int i10) {
        if (i10 != 1) {
            this.f7013a = new AtomicLong();
        } else {
            this.f7013a = new AtomicLong();
        }
    }

    @Override // g8.s2
    public final void a() {
        this.f7013a.getAndAdd(1L);
    }
}
