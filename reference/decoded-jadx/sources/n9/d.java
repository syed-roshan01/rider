package n9;

import android.os.Handler;
import android.os.Looper;
import d5.i1;
import java.util.concurrent.CancellationException;
import l.h;
import l.q;
import m9.a0;
import m9.f1;
import m9.l;
import m9.m0;
import m9.o0;
import m9.s1;
import m9.u1;
import r9.o;
import u8.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    private volatile d _immediate;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f12320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f12323f;

    public d(Handler handler, String str, boolean z10) {
        this.f12320c = handler;
        this.f12321d = str;
        this.f12322e = z10;
        this._immediate = z10 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f12323f = dVar;
    }

    @Override // m9.j0
    public final void M(long j10, l lVar) {
        h hVar = new h(lVar, this, 21);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f12320c.postDelayed(hVar, j10)) {
            lVar.v(new i1(2, this, hVar));
        } else {
            f0(lVar.f11962e, hVar);
        }
    }

    @Override // m9.j0
    public final o0 Q(long j10, final Runnable runnable, j jVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f12320c.postDelayed(runnable, j10)) {
            return new o0() { // from class: n9.c
                @Override // m9.o0
                public final void a() {
                    this.f12318a.f12320c.removeCallbacks(runnable);
                }
            };
        }
        f0(jVar, runnable);
        return u1.f12007a;
    }

    @Override // m9.z
    public final void c0(j jVar, Runnable runnable) {
        if (this.f12320c.post(runnable)) {
            return;
        }
        f0(jVar, runnable);
    }

    @Override // m9.z
    public final boolean d0() {
        return (this.f12322e && d7.a.d(Looper.myLooper(), this.f12320c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f12320c == this.f12320c;
    }

    public final void f0(j jVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        f1 f1Var = (f1) jVar.f(a0.f11902b);
        if (f1Var != null) {
            f1Var.a(cancellationException);
        }
        m0.f11970b.c0(jVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f12320c);
    }

    @Override // m9.z
    public final String toString() {
        d dVar;
        String str;
        t9.d dVar2 = m0.f11969a;
        s1 s1Var = o.f13724a;
        if (this == s1Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = ((d) s1Var).f12323f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f12321d;
        if (string == null) {
            string = this.f12320c.toString();
        }
        return this.f12322e ? q.j(string, ".immediate") : string;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
