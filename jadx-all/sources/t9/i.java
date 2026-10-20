package t9;

import m9.e0;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f14697c;

    public i(Runnable runnable, long j10, v vVar) {
        super(j10, vVar);
        this.f14697c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14697c.run();
        } finally {
            this.f14696b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f14697c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(e0.z(runnable));
        sb.append(", ");
        sb.append(this.f14695a);
        sb.append(", ");
        sb.append(this.f14696b);
        sb.append(']');
        return sb.toString();
    }
}
