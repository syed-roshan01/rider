package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f1416b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f1418d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1415a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1417c = false;

    public o(p pVar) {
        this.f1418d = pVar;
    }

    public final void a() {
        p pVar = this.f1418d;
        pVar.getWindow().getDecorView().removeCallbacks(this);
        pVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1416b = runnable;
        View decorView = this.f1418d.getWindow().getDecorView();
        if (!this.f1417c) {
            decorView.postOnAnimation(new d(this, 1));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f1416b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1415a) {
                this.f1417c = false;
                this.f1418d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1416b = null;
        x xVar = this.f1418d.mFullyDrawnReporter;
        synchronized (xVar.f1425b) {
            z10 = xVar.f1426c;
        }
        if (z10) {
            this.f1417c = false;
            this.f1418d.getWindow().getDecorView().post(this);
        }
    }

    @Override // androidx.activity.n
    public final void q(View view) {
        if (this.f1417c) {
            return;
        }
        this.f1417c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1418d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
