package a0;

import r1.f1;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f1 f787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f788d;

    public e0(int i10, long j10) {
        this.f785a = i10;
        this.f786b = j10;
    }

    @Override // a0.b0
    public final void cancel() {
        if (this.f788d) {
            return;
        }
        this.f788d = true;
        f1 f1Var = this.f787c;
        if (f1Var != null) {
            f1Var.a();
        }
        this.f787c = null;
    }
}
