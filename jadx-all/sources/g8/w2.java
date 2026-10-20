package g8;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends z6.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f7192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Serializable f7193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7194v;

    public w2(l3 l3Var, Throwable th) {
        this.f7191s = 0;
        this.f7194v = l3Var;
        this.f7193u = th;
        e8.c2 c2VarF = e8.c2.f5223l.g("Panic! This is a bug!").f(th);
        e8.v0 v0Var = e8.v0.f5378e;
        y3.e.G("drop status shouldn't be OK", !c2VarF.e());
        this.f7192t = new e8.v0(null, null, c2VarF, true);
    }

    @Override // z6.a
    public final e8.v0 Y(j4 j4Var) {
        switch (this.f7191s) {
            case 0:
                return (e8.v0) this.f7192t;
            default:
                if (((AtomicBoolean) this.f7193u).compareAndSet(false, true)) {
                    ((h4) this.f7194v).f6831c.l().execute(new t0(this, 8));
                }
                return e8.v0.f5378e;
        }
    }

    public final String toString() {
        switch (this.f7191s) {
            case 0:
                q6.g gVar = new q6.g(w2.class.getSimpleName());
                gVar.a((e8.v0) this.f7192t, "panicPickResult");
                return gVar.toString();
            default:
                return super.toString();
        }
    }

    public w2(h4 h4Var, e8.x0 x0Var) {
        this.f7191s = 1;
        this.f7194v = h4Var;
        this.f7193u = new AtomicBoolean(false);
        y3.e.J(x0Var, "subchannel");
        this.f7192t = x0Var;
    }
}
