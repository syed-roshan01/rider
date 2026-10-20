package m9;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 extends z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f12016f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r8.l f12019e;

    public final void f0(boolean z10) {
        long j10 = this.f12017c - (z10 ? 4294967296L : 1L);
        this.f12017c = j10;
        if (j10 <= 0 && this.f12018d) {
            shutdown();
        }
    }

    public final void g0(l0 l0Var) {
        r8.l lVar = this.f12019e;
        if (lVar == null) {
            lVar = new r8.l();
            this.f12019e = lVar;
        }
        lVar.addLast(l0Var);
    }

    public abstract Thread h0();

    public final void i0(boolean z10) {
        this.f12017c = (z10 ? 4294967296L : 1L) + this.f12017c;
        if (z10) {
            return;
        }
        this.f12018d = true;
    }

    public final boolean j0() {
        return this.f12017c >= 4294967296L;
    }

    public abstract long k0();

    public final boolean l0() throws IllegalAccessException, InvocationTargetException {
        r8.l lVar = this.f12019e;
        if (lVar == null) {
            return false;
        }
        l0 l0Var = (l0) (lVar.isEmpty() ? null : lVar.removeFirst());
        if (l0Var == null) {
            return false;
        }
        l0Var.run();
        return true;
    }

    public void m0(long j10, t0 t0Var) {
        f0.f11940q.q0(j10, t0Var);
    }

    public abstract void shutdown();
}
