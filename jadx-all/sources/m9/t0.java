package m9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12003b = -1;

    public t0(long j10) {
        this.f12002a = j10;
    }

    @Override // m9.o0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                i3.u uVar = e0.f11925b;
                if (obj == uVar) {
                    return;
                }
                u0 u0Var = obj instanceof u0 ? (u0) obj : null;
                if (u0Var != null) {
                    synchronized (u0Var) {
                        if (b() != null) {
                            u0Var.b(this.f12003b);
                        }
                    }
                }
                this._heap = uVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r9.x b() {
        Object obj = this._heap;
        if (obj instanceof r9.x) {
            return (r9.x) obj;
        }
        return null;
    }

    public final int c(long j10, u0 u0Var, v0 v0Var) {
        synchronized (this) {
            if (this._heap == e0.f11925b) {
                return 2;
            }
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f13736a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v0.f12010n;
                    v0Var.getClass();
                    if (v0.f12012p.get(v0Var) != 0) {
                        return 1;
                    }
                    if (t0Var == null) {
                        u0Var.f12006c = j10;
                    } else {
                        long j11 = t0Var.f12002a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - u0Var.f12006c > 0) {
                            u0Var.f12006c = j10;
                        }
                    }
                    long j12 = this.f12002a;
                    long j13 = u0Var.f12006c;
                    if (j12 - j13 < 0) {
                        this.f12002a = j13;
                    }
                    u0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f12002a - ((t0) obj).f12002a;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    public final void e(u0 u0Var) {
        if (this._heap == e0.f11925b) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = u0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f12002a + ']';
    }
}
