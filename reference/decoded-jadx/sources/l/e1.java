package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f10724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d1 f10725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d1 f10726f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10727n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f10729p = new int[2];

    public e1(View view) {
        this.f10724d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f10721a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f10722b = tapTimeout;
        this.f10723c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        d1 d1Var = this.f10726f;
        View view = this.f10724d;
        if (d1Var != null) {
            view.removeCallbacks(d1Var);
        }
        d1 d1Var2 = this.f10725e;
        if (d1Var2 != null) {
            view.removeCallbacks(d1Var2);
        }
    }

    public abstract k.n b();

    public abstract boolean c();

    public boolean d() {
        k.n nVarB = b();
        if (nVarB == null || !nVarB.k()) {
            return true;
        }
        nVarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        b1 b1Var;
        boolean z11 = this.f10727n;
        View view2 = this.f10724d;
        if (z11) {
            k.n nVarB = b();
            if (nVarB != null && nVarB.k() && (b1Var = (b1) nVarB.g()) != null && b1Var.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f10729p;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                b1Var.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = b1Var.b(motionEventObtainNoHistory, this.f10728o);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z12) {
                    z10 = true;
                } else if (d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (d()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f10728o = motionEvent.getPointerId(0);
                    if (this.f10725e == null) {
                        this.f10725e = new d1(this, 0);
                    }
                    view2.postDelayed(this.f10725e, this.f10722b);
                    if (this.f10726f == null) {
                        this.f10726f = new d1(this, 1);
                    }
                    view2.postDelayed(this.f10726f, this.f10723c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f10728o);
                    if (iFindPointerIndex >= 0) {
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f10721a;
                        float f11 = -f10;
                        if (x10 < f11 || y10 < f11 || x10 >= (view2.getRight() - view2.getLeft()) + f10 || y10 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z10 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f10727n = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10727n = false;
        this.f10728o = -1;
        d1 d1Var = this.f10725e;
        if (d1Var != null) {
            this.f10724d.removeCallbacks(d1Var);
        }
    }
}
