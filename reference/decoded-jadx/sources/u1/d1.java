package u1;

import android.view.Choreographer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f15061a;

    public d1(e1 e1Var) {
        this.f15061a = e1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f15061a.f15075d.removeCallbacks(this);
        e1.f0(this.f15061a);
        e1 e1Var = this.f15061a;
        synchronized (e1Var.f15076e) {
            if (e1Var.f15081q) {
                e1Var.f15081q = false;
                List list = e1Var.f15078n;
                e1Var.f15078n = e1Var.f15079o;
                e1Var.f15079o = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) list.get(i10)).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        e1.f0(this.f15061a);
        e1 e1Var = this.f15061a;
        synchronized (e1Var.f15076e) {
            if (e1Var.f15078n.isEmpty()) {
                e1Var.f15074c.removeFrameCallback(this);
                e1Var.f15081q = false;
            }
        }
    }
}
