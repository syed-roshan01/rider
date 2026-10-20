package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f10719b;

    public /* synthetic */ d1(e1 e1Var, int i10) {
        this.f10718a = i10;
        this.f10719b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10718a;
        e1 e1Var = this.f10719b;
        switch (i10) {
            case 0:
                ViewParent parent = e1Var.f10724d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                e1Var.a();
                View view = e1Var.f10724d;
                if (view.isEnabled() && !view.isLongClickable() && e1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    e1Var.f10727n = true;
                    break;
                }
                break;
        }
    }
}
