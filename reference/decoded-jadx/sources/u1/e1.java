package u1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends m9.z {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q8.i f15072t = new q8.i(q0.f15225q);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c1 f15073u = new c1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f15074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f15075d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15081q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g1 f15083s;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15076e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r8.l f15077f = new r8.l();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f15078n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f15079o = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d1 f15082r = new d1(this);

    public e1(Choreographer choreographer, Handler handler) {
        this.f15074c = choreographer;
        this.f15075d = handler;
        this.f15083s = new g1(choreographer, this);
    }

    public static final void f0(e1 e1Var) {
        Runnable runnable;
        boolean z10;
        do {
            synchronized (e1Var.f15076e) {
                r8.l lVar = e1Var.f15077f;
                runnable = (Runnable) (lVar.isEmpty() ? null : lVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (e1Var.f15076e) {
                    r8.l lVar2 = e1Var.f15077f;
                    runnable = (Runnable) (lVar2.isEmpty() ? null : lVar2.removeFirst());
                }
            }
            synchronized (e1Var.f15076e) {
                if (e1Var.f15077f.isEmpty()) {
                    z10 = false;
                    e1Var.f15080p = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // m9.z
    public final void c0(u8.j jVar, Runnable runnable) {
        synchronized (this.f15076e) {
            this.f15077f.addLast(runnable);
            if (!this.f15080p) {
                this.f15080p = true;
                this.f15075d.post(this.f15082r);
                if (!this.f15081q) {
                    this.f15081q = true;
                    this.f15074c.postFrameCallback(this.f15082r);
                }
            }
        }
    }
}
