package x2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f16293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16294c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f16292a) {
                    return;
                }
                this.f16292a = true;
                this.f16294c = true;
                f fVar = this.f16293b;
                if (fVar != null) {
                    try {
                        fVar.c();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f16294c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.f16294c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(f fVar) {
        synchronized (this) {
            while (this.f16294c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f16293b == fVar) {
                return;
            }
            this.f16293b = fVar;
            if (this.f16292a) {
                fVar.c();
            }
        }
    }
}
