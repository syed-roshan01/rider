package m9;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends t9.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11963c;

    public l0(int i10) {
        super(0L, t9.j.f14704g);
        this.f11963c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract u8.e e();

    public Throwable f(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f12005a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            d7.a.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        d7.a.j(th);
        h6.g.n0(e().getContext(), new q8.e("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objN = q8.l.f13235a;
        x9.v vVar = this.f14696b;
        try {
            u8.e eVarE = e();
            d7.a.k(eVarE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            r9.h hVar = (r9.h) eVarE;
            u8.e eVar = hVar.f13703e;
            Object obj = hVar.f13705n;
            u8.j context = eVar.getContext();
            Object objT = r9.a.t(context, obj);
            g2 g2VarT0 = objT != r9.a.f13693f ? z6.a.t0(eVar, context, objT) : null;
            try {
                u8.j context2 = eVar.getContext();
                Object objI = i();
                Throwable thF = f(objI);
                f1 f1Var = (thF == null && z6.a.O(this.f11963c)) ? (f1) context2.f(a0.f11902b) : null;
                if (f1Var != null && !f1Var.b()) {
                    CancellationException cancellationExceptionH = ((p1) f1Var).H();
                    c(objI, cancellationExceptionH);
                    eVar.resumeWith(d7.t.N(cancellationExceptionH));
                } else if (thF != null) {
                    eVar.resumeWith(d7.t.N(thF));
                } else {
                    eVar.resumeWith(g(objI));
                }
                if (g2VarT0 == null || g2VarT0.l0()) {
                    r9.a.k(context, objT);
                }
                try {
                    vVar.getClass();
                } catch (Throwable th) {
                    objN = d7.t.N(th);
                }
                h(null, q8.h.a(objN));
            } catch (Throwable th2) {
                if (g2VarT0 == null || g2VarT0.l0()) {
                    r9.a.k(context, objT);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                vVar.getClass();
            } catch (Throwable th4) {
                objN = d7.t.N(th4);
            }
            h(th3, q8.h.a(objN));
        }
    }
}
