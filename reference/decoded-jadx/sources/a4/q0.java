package a4;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OverScroller f1178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Interpolator f1179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1181f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1182n;

    public q0(RecyclerView recyclerView) {
        this.f1182n = recyclerView;
        v vVar = RecyclerView.f2241s0;
        this.f1179d = vVar;
        this.f1180e = false;
        this.f1181f = false;
        this.f1178c = new OverScroller(recyclerView.getContext(), vVar);
    }

    public final void a() {
        if (this.f1180e) {
            this.f1181f = true;
            return;
        }
        RecyclerView recyclerView = this.f1182n;
        recyclerView.removeCallbacks(this);
        Field field = b3.q0.f2670a;
        b3.b0.m(recyclerView, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f1182n;
        if (recyclerView.f2264p == null) {
            recyclerView.removeCallbacks(this);
            this.f1178c.abortAnimation();
            return;
        }
        this.f1181f = false;
        this.f1180e = true;
        recyclerView.d();
        OverScroller overScroller = this.f1178c;
        recyclerView.f2264p.getClass();
        if (overScroller.computeScrollOffset()) {
            int[] iArr = recyclerView.f2258l0;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i10 = currX - this.f1176a;
            int i11 = currY - this.f1177b;
            this.f1176a = currX;
            this.f1177b = currY;
            if (this.f1182n.f(i10, i11, 1, iArr, null)) {
                i10 -= iArr[0];
                i11 -= iArr[1];
            }
            if (!recyclerView.f2265q.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i10, i11);
            }
            recyclerView.g(1, null);
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z10 = (i10 == 0 && i11 == 0) || (i10 != 0 && recyclerView.f2264p.b() && i10 == 0) || (i11 != 0 && recyclerView.f2264p.c() && i11 == 0);
            if (overScroller.isFinished() || !(z10 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                k kVar = recyclerView.f2251e0;
                int[] iArr2 = kVar.f1142d;
                if (iArr2 != null) {
                    Arrays.fill(iArr2, -1);
                }
                kVar.f1141c = 0;
                recyclerView.w(1);
            } else {
                a();
                m mVar = recyclerView.f2249d0;
                if (mVar != null) {
                    mVar.a(recyclerView, i10, i11);
                }
            }
        }
        this.f1180e = false;
        if (this.f1181f) {
            a();
        }
    }
}
