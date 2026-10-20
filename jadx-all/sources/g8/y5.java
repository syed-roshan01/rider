package g8;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d0[] f7292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7293b = new AtomicBoolean(false);

    static {
        new y5(new o7.d0[0]);
    }

    public y5(o7.d0[] d0VarArr) {
        this.f7292a = d0VarArr;
    }

    public final void a(long j10) {
        for (o7.d0 d0Var : this.f7292a) {
            d0Var.L(j10);
        }
    }
}
