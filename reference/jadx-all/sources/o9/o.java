package o9;

import androidx.fragment.app.a0;
import d9.v;
import java.lang.reflect.InvocationTargetException;
import m9.i2;

/* JADX INFO: loaded from: classes.dex */
public final class o extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f12718s;

    public o(int i10, a aVar, c9.c cVar) {
        super(i10, cVar);
        this.f12718s = aVar;
        if (aVar != a.f12668a) {
            if (i10 < 1) {
                throw new IllegalArgumentException(l.q.h("Buffered channel capacity must be at least 1, but ", i10, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + v.a(c.class).b() + " instead").toString());
        }
    }

    public final Object H(Object obj, boolean z10) throws IllegalAccessException, InvocationTargetException {
        k kVar;
        c9.c cVar;
        a0 a0VarG;
        a aVar = a.f12670c;
        q8.l lVar = q8.l.f13235a;
        if (this.f12718s == aVar) {
            Object objN = super.n(obj);
            if ((!(objN instanceof i)) || (objN instanceof h)) {
                return objN;
            }
            if (!z10 || (cVar = this.f12685b) == null || (a0VarG = d7.a.g(cVar, obj, null)) == null) {
                return lVar;
            }
            throw a0VarG;
        }
        Object obj2 = e.f12690d;
        k kVar2 = (k) c.f12679n.get(this);
        while (true) {
            long andIncrement = c.f12675c.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zW = w(andIncrement, false);
            int i10 = e.f12688b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            if (kVar2.f13728c != j12) {
                k kVarB = c.b(this, j12, kVar2);
                if (kVarB != null) {
                    kVar = kVarB;
                } else if (zW) {
                    return new h(t());
                }
            } else {
                kVar = kVar2;
            }
            int iE = c.e(this, kVar, i11, obj, j10, obj2, zW);
            if (iE == 0) {
                kVar.a();
                return lVar;
            }
            if (iE == 1) {
                return lVar;
            }
            if (iE == 2) {
                if (zW) {
                    kVar.h();
                    return new h(t());
                }
                i2 i2Var = obj2 instanceof i2 ? (i2) obj2 : null;
                if (i2Var != null) {
                    i2Var.a(kVar, i11 + i10);
                }
                l((kVar.f13728c * j11) + ((long) i11));
                return lVar;
            }
            if (iE == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iE == 4) {
                if (j10 < c.f12676d.get(this)) {
                    kVar.a();
                }
                return new h(t());
            }
            if (iE == 5) {
                kVar.a();
            }
            kVar2 = kVar;
        }
    }

    @Override // o9.c, o9.t
    public final Object h(Object obj, u8.e eVar) throws Throwable {
        a0 a0VarG;
        Object objH = H(obj, true);
        boolean z10 = objH instanceof h;
        if (!z10) {
            return q8.l.f13235a;
        }
        if (z10) {
        }
        c9.c cVar = this.f12685b;
        if (cVar == null || (a0VarG = d7.a.g(cVar, obj, null)) == null) {
            throw t();
        }
        d7.a.c(a0VarG, t());
        throw a0VarG;
    }

    @Override // o9.c, o9.t
    public final Object n(Object obj) {
        return H(obj, false);
    }

    @Override // o9.c
    public final boolean x() {
        return this.f12718s == a.f12669b;
    }
}
