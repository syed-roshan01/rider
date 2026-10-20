package g8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends e8.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e8.l f7160j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f7161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.b0 f7163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f7164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e8.j f7165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e8.k f7166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e8.c2 f7167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f7168h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u0 f7169i;

    static {
        Logger.getLogger(v0.class.getName());
        f7160j = new e8.l();
    }

    public v0(Executor executor, j3 j3Var, e8.c0 c0Var) {
        ScheduledFuture<?> scheduledFutureSchedule;
        y3.e.J(executor, "callExecutor");
        this.f7162b = executor;
        y3.e.J(j3Var, "scheduler");
        e8.b0 b0VarB = e8.b0.b();
        this.f7163c = b0VarB;
        b0VarB.getClass();
        if (c0Var == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jC = c0Var.c(timeUnit);
            long jAbs = Math.abs(jC);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jC) % timeUnit2.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (jC < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = j3Var.f6889a.schedule(new x1(3, this, sb), jC, timeUnit);
        }
        this.f7161a = scheduledFutureSchedule;
    }

    public final void a(e8.c2 c2Var, boolean z10) {
        e8.j jVar;
        synchronized (this) {
            try {
                e8.k kVar = this.f7166f;
                boolean z11 = true;
                if (kVar == null) {
                    e8.l lVar = f7160j;
                    if (kVar != null) {
                        z11 = false;
                    }
                    y3.e.M(kVar, "realCall already set to %s", z11);
                    ScheduledFuture scheduledFuture = this.f7161a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f7166f = lVar;
                    jVar = this.f7165e;
                    this.f7167g = c2Var;
                    z11 = false;
                } else if (z10) {
                    return;
                } else {
                    jVar = null;
                }
                if (z11) {
                    b(new x1(4, this, c2Var));
                } else {
                    if (jVar != null) {
                        this.f7162b.execute(new d0(this, jVar, c2Var));
                    }
                    c();
                }
                h3 h3Var = (h3) this;
                h3Var.f6830n.f6853d.f6939m.execute(new t0(h3Var, 6));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f7164d) {
                    runnable.run();
                } else {
                    this.f7168h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        u0 u0Var;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f7168h.isEmpty()) {
                    break;
                }
                list = this.f7168h;
                this.f7168h = arrayList;
            }
            if (u0Var != null) {
                this.f7162b.execute(new c0(this, u0Var));
            }
            list.clear();
            arrayList = list;
        }
        this.f7168h = null;
        this.f7164d = true;
        u0Var = this.f7169i;
        if (u0Var != null) {
            this.f7162b.execute(new c0(this, u0Var));
        }
    }

    @Override // e8.k
    public final void cancel(String str, Throwable th) {
        e8.c2 c2Var = e8.c2.f5217f;
        e8.c2 c2VarG = str != null ? c2Var.g(str) : c2Var.g("Call cancelled without message");
        if (th != null) {
            c2VarG = c2VarG.f(th);
        }
        a(c2VarG, false);
    }

    @Override // e8.k
    public final e8.c getAttributes() {
        e8.k kVar;
        synchronized (this) {
            kVar = this.f7166f;
        }
        return kVar != null ? kVar.getAttributes() : e8.c.f5206b;
    }

    @Override // e8.k
    public final void halfClose() {
        b(new t0(this, 0));
    }

    @Override // e8.k
    public final boolean isReady() {
        if (this.f7164d) {
            return this.f7166f.isReady();
        }
        return false;
    }

    @Override // e8.k
    public final void request(int i10) {
        if (this.f7164d) {
            this.f7166f.request(i10);
        } else {
            b(new com.google.android.gms.common.api.internal.c0(this, i10, 3));
        }
    }

    @Override // e8.k
    public final void sendMessage(Object obj) {
        if (this.f7164d) {
            this.f7166f.sendMessage(obj);
        } else {
            b(new x1(5, this, obj));
        }
    }

    @Override // e8.k
    public final void setMessageCompression(boolean z10) {
        if (this.f7164d) {
            this.f7166f.setMessageCompression(z10);
        } else {
            b(new k6.m4(3, this, z10));
        }
    }

    @Override // e8.k
    public final void start(e8.j jVar, e8.l1 l1Var) {
        e8.c2 c2Var;
        boolean z10;
        y3.e.N("already started", this.f7165e == null);
        synchronized (this) {
            try {
                y3.e.J(jVar, "listener");
                this.f7165e = jVar;
                c2Var = this.f7167g;
                z10 = this.f7164d;
                if (!z10) {
                    u0 u0Var = new u0(jVar);
                    this.f7169i = u0Var;
                    jVar = u0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2Var != null) {
            this.f7162b.execute(new d0(this, jVar, c2Var));
        } else if (z10) {
            this.f7166f.start(jVar, l1Var);
        } else {
            b(new y2.a(this, jVar, l1Var, 18));
        }
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f7166f, "realCall");
        return gVarJ0.toString();
    }
}
