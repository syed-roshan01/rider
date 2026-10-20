package a0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.concurrent.TimeUnit;
import m0.i2;
import r1.f1;
import r1.h1;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements i2, c0, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static long f789r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f793d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f795f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f797o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f799q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0.i f794e = new o0.i(new e0[16]);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Choreographer f798p = Choreographer.getInstance();

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    public f0(d0 d0Var, h1 h1Var, q qVar, View view) {
        float refreshRate;
        this.f790a = d0Var;
        this.f791b = h1Var;
        this.f792c = qVar;
        this.f793d = view;
        if (f789r == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f789r = (long) (1000000000 / refreshRate);
        }
    }

    @Override // m0.i2
    public final void a() {
        this.f790a.f781a = this;
        this.f799q = true;
    }

    @Override // m0.i2
    public final void b() {
    }

    @Override // m0.i2
    public final void d() {
        this.f799q = false;
        this.f790a.f781a = null;
        this.f793d.removeCallbacks(this);
        this.f798p.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.f799q) {
            this.f793d.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0.i iVar = this.f794e;
        if (!iVar.k() && this.f797o && this.f799q) {
            View view = this.f793d;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()) + f789r;
                boolean z10 = System.nanoTime() > nanos;
                boolean z11 = false;
                while (iVar.l() && !z11) {
                    e0 e0Var = (e0) iVar.f12341a[0];
                    q qVar = this.f792c;
                    s sVar = (s) qVar.f846b.invoke();
                    if (!e0Var.f788d) {
                        int iC = sVar.c();
                        int i10 = e0Var.f785a;
                        if (i10 >= 0 && i10 < iC) {
                            if (e0Var.f787c == null) {
                                Trace.beginSection("compose:lazylist:prefetch:compose");
                                try {
                                    long jNanoTime = System.nanoTime();
                                    boolean z12 = z11;
                                    if (jNanoTime + this.f795f >= nanos && !z10) {
                                        z11 = true;
                                    } else {
                                        Object objA = sVar.a(i10);
                                        e0Var.f787c = this.f791b.a().g(objA, qVar.a(i10, objA, sVar.d(i10)));
                                        long jNanoTime2 = System.nanoTime() - jNanoTime;
                                        long j10 = this.f795f;
                                        if (j10 != 0) {
                                            long j11 = 4;
                                            jNanoTime2 = (jNanoTime2 / j11) + ((j10 / j11) * ((long) 3));
                                        }
                                        this.f795f = jNanoTime2;
                                        z10 = false;
                                        z11 = z12;
                                    }
                                    Trace.endSection();
                                } catch (Throwable th) {
                                    Trace.endSection();
                                    throw th;
                                }
                            } else {
                                boolean z13 = z11;
                                Trace.beginSection("compose:lazylist:prefetch:measure");
                                try {
                                    long jNanoTime3 = System.nanoTime();
                                    if (this.f796n + jNanoTime3 >= nanos && !z10) {
                                        z11 = true;
                                    } else {
                                        f1 f1Var = e0Var.f787c;
                                        d7.a.j(f1Var);
                                        int iB = f1Var.b();
                                        for (int i11 = 0; i11 < iB; i11++) {
                                            f1Var.c(i11, e0Var.f786b);
                                        }
                                        long jNanoTime4 = System.nanoTime() - jNanoTime3;
                                        long j12 = this.f796n;
                                        if (j12 != 0) {
                                            long j13 = 4;
                                            jNanoTime4 = (jNanoTime4 / j13) + ((j12 / j13) * ((long) 3));
                                        }
                                        this.f796n = jNanoTime4;
                                        iVar.n(0);
                                        z10 = false;
                                        z11 = z13;
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                    }
                    iVar.n(0);
                    z11 = z11;
                }
                if (z11) {
                    this.f798p.postFrameCallback(this);
                    return;
                } else {
                    this.f797o = false;
                    return;
                }
            }
        }
        this.f797o = false;
    }
}
