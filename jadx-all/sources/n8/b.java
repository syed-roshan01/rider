package n8;

import e8.h2;
import e8.j0;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends j0 {
    @Override // e8.j0
    public final e8.i i() {
        return s().i();
    }

    @Override // e8.j0
    public final ScheduledExecutorService j() {
        return s().j();
    }

    @Override // e8.j0
    public final h2 l() {
        return s().l();
    }

    @Override // e8.j0
    public final void o() {
        s().o();
    }

    public abstract j0 s();

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(s(), "delegate");
        return gVarJ0.toString();
    }
}
