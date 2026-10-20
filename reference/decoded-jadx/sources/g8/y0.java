package g8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements u3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f7246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e8.h2 f7247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f7248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0 f7249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f7250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t3 f7251h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e8.c2 f7253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z6.a f7254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7255l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.q0 f7244a = e8.q0.a(y0.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7245b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Collection f7252i = new LinkedHashSet();

    public y0(Executor executor, e8.h2 h2Var) {
        this.f7246c = executor;
        this.f7247d = h2Var;
    }

    @Override // e8.p0
    public final e8.q0 b() {
        return this.f7244a;
    }

    @Override // g8.u3
    public final void c(e8.c2 c2Var) {
        Collection<x0> collection;
        Runnable runnable;
        f(c2Var);
        synchronized (this.f7245b) {
            try {
                collection = this.f7252i;
                runnable = this.f7250g;
                this.f7250g = null;
                if (!collection.isEmpty()) {
                    this.f7252i = Collections.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (x0 x0Var : collection) {
                a1 a1VarU = x0Var.u(new j1(c2Var, i0.f6840b, x0Var.f7211l));
                if (a1VarU != null) {
                    a1VarU.run();
                }
            }
            this.f7247d.execute(runnable);
        }
    }

    @Override // g8.k0
    public final h0 d(e8.p1 p1Var, e8.l1 l1Var, e8.h hVar, e8.p[] pVarArr) {
        h0 j1Var;
        try {
            j4 j4Var = new j4(p1Var, l1Var, hVar);
            z6.a aVar = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f7245b) {
                    e8.c2 c2Var = this.f7253j;
                    if (c2Var == null) {
                        z6.a aVar2 = this.f7254k;
                        if (aVar2 != null) {
                            if (aVar != null && j10 == this.f7255l) {
                                j1Var = g(j4Var, pVarArr);
                                break;
                            }
                            j10 = this.f7255l;
                            k0 k0VarF = s1.f(aVar2.Y(j4Var), Boolean.TRUE.equals(hVar.f5274h));
                            if (k0VarF != null) {
                                j1Var = k0VarF.d(j4Var.f6892c, j4Var.f6891b, j4Var.f6890a, pVarArr);
                                break;
                            }
                            aVar = aVar2;
                        } else {
                            j1Var = g(j4Var, pVarArr);
                            break;
                        }
                    } else {
                        j1Var = new j1(c2Var, i0.f6839a, pVarArr);
                        break;
                    }
                }
            }
            this.f7247d.a();
            return j1Var;
        } catch (Throwable th) {
            this.f7247d.a();
            throw th;
        }
    }

    @Override // g8.u3
    public final Runnable e(t3 t3Var) {
        this.f7251h = t3Var;
        a3 a3Var = (a3) t3Var;
        this.f7248e = new w0(a3Var, 0);
        this.f7249f = new w0(a3Var, 1);
        this.f7250g = new w0(a3Var, 2);
        return null;
    }

    @Override // g8.u3
    public final void f(e8.c2 c2Var) {
        Runnable runnable;
        synchronized (this.f7245b) {
            try {
                if (this.f7253j != null) {
                    return;
                }
                this.f7253j = c2Var;
                this.f7247d.b(new x1(8, this, c2Var));
                if (!h() && (runnable = this.f7250g) != null) {
                    this.f7247d.b(runnable);
                    this.f7250g = null;
                }
                this.f7247d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final x0 g(j4 j4Var, e8.p[] pVarArr) {
        int size;
        x0 x0Var = new x0(this, j4Var, pVarArr);
        this.f7252i.add(x0Var);
        synchronized (this.f7245b) {
            size = this.f7252i.size();
        }
        if (size == 1) {
            this.f7247d.b(this.f7248e);
        }
        for (e8.p pVar : pVarArr) {
            pVar.o0();
        }
        return x0Var;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f7245b) {
            z10 = !this.f7252i.isEmpty();
        }
        return z10;
    }

    public final void i(z6.a aVar) {
        Runnable runnable;
        synchronized (this.f7245b) {
            this.f7254k = aVar;
            this.f7255l++;
            if (aVar != null && h()) {
                ArrayList<x0> arrayList = new ArrayList(this.f7252i);
                ArrayList arrayList2 = new ArrayList();
                for (x0 x0Var : arrayList) {
                    e8.v0 v0VarY = aVar.Y(x0Var.f7209j);
                    e8.h hVar = x0Var.f7209j.f6890a;
                    k0 k0VarF = s1.f(v0VarY, Boolean.TRUE.equals(hVar.f5274h));
                    if (k0VarF != null) {
                        Executor executor = this.f7246c;
                        Executor executor2 = hVar.f5268b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        e8.b0 b0Var = x0Var.f7210k;
                        e8.b0 b0VarA = b0Var.a();
                        try {
                            j4 j4Var = x0Var.f7209j;
                            h0 h0VarD = k0VarF.d(j4Var.f6892c, j4Var.f6891b, j4Var.f6890a, x0Var.f7211l);
                            b0Var.c(b0VarA);
                            a1 a1VarU = x0Var.u(h0VarD);
                            if (a1VarU != null) {
                                executor.execute(a1VarU);
                            }
                            arrayList2.add(x0Var);
                        } catch (Throwable th) {
                            b0Var.c(b0VarA);
                            throw th;
                        }
                    }
                }
                synchronized (this.f7245b) {
                    try {
                        if (h()) {
                            this.f7252i.removeAll(arrayList2);
                            if (this.f7252i.isEmpty()) {
                                this.f7252i = new LinkedHashSet();
                            }
                            if (!h()) {
                                this.f7247d.b(this.f7249f);
                                if (this.f7253j != null && (runnable = this.f7250g) != null) {
                                    this.f7247d.b(runnable);
                                    this.f7250g = null;
                                }
                            }
                            this.f7247d.a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
