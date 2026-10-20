package g8;

/* JADX INFO: loaded from: classes.dex */
public final class q5 extends l {
    @Override // g8.l
    public final boolean v(r5 r5Var) {
        synchronized (r5Var) {
            try {
                if (r5Var.f7081c != 0) {
                    return false;
                }
                r5Var.f7081c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g8.l
    public final void w(r5 r5Var) {
        synchronized (r5Var) {
            r5Var.f7081c = 0;
        }
    }
}
