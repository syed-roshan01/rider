package a0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f781a;

    public final b0 a(int i10, long j10) {
        c0 c0Var = this.f781a;
        if (c0Var == null) {
            return d.f779a;
        }
        f0 f0Var = (f0) c0Var;
        e0 e0Var = new e0(i10, j10);
        f0Var.f794e.c(e0Var);
        if (f0Var.f797o) {
            return e0Var;
        }
        f0Var.f797o = true;
        f0Var.f793d.post(f0Var);
        return e0Var;
    }
}
