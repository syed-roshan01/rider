package g8;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class z extends e8.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f7294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c6 f7295e;

    public z(b0 b0Var, c6 c6Var) {
        this.f7294d = b0Var;
        y3.e.J(c6Var, "time");
        this.f7295e = c6Var;
    }

    public static Level g(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 != 1) {
            return (i11 == 2 || i11 == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }

    @Override // e8.i
    public final void a(int i10, String str) {
        e8.l0 l0Var;
        b0 b0Var = this.f7294d;
        e8.q0 q0Var = b0Var.f6656b;
        Level levelG = g(i10);
        if (b0.f6654c.isLoggable(levelG)) {
            b0.a(q0Var, levelG, str);
        }
        if (!f(i10) || i10 == 1) {
            return;
        }
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 != 2) {
            l0Var = i11 != 3 ? e8.l0.f5298a : e8.l0.f5300c;
        } else {
            l0Var = e8.l0.f5299b;
        }
        e8.l0 l0Var2 = l0Var;
        Long lValueOf = Long.valueOf(((k4) this.f7295e).a());
        y3.e.J(str, "description");
        y3.e.J(lValueOf, "timestampNanos");
        new e8.m0(str, l0Var2, lValueOf.longValue(), null, null);
        synchronized (b0Var.f6655a) {
            b0Var.getClass();
        }
    }

    @Override // e8.i
    public final void b(int i10, String str, Object... objArr) {
        a(i10, (f(i10) || b0.f6654c.isLoggable(g(i10))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean f(int i10) {
        if (i10 != 1) {
            b0 b0Var = this.f7294d;
            synchronized (b0Var.f6655a) {
                b0Var.getClass();
            }
        }
        return false;
    }
}
