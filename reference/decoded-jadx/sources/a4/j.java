package a4;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b0 implements h0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f1114x = {R.attr.state_pressed};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f1115y = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateListDrawable f1117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f1118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateListDrawable f1121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f1122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1126k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f1129n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ValueAnimator f1136u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1137v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f1138w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1127l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1128m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1130o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1131p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1132q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1133r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f1134s = new int[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f1135t = new int[2];

    public j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1136u = valueAnimatorOfFloat;
        this.f1137v = 0;
        f fVar = new f(this, 0);
        this.f1138w = fVar;
        g gVar = new g(this);
        this.f1117b = stateListDrawable;
        this.f1118c = drawable;
        this.f1121f = stateListDrawable2;
        this.f1122g = drawable2;
        this.f1119d = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f1120e = Math.max(i10, drawable.getIntrinsicWidth());
        this.f1123h = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f1124i = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f1116a = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new h(this));
        valueAnimatorOfFloat.addUpdateListener(new i(this));
        RecyclerView recyclerView2 = this.f1129n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e0 e0Var = recyclerView2.f2264p;
            if (e0Var != null) {
                e0Var.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2265q;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1129n;
            recyclerView3.f2266r.remove(this);
            if (recyclerView3.f2267s == this) {
                recyclerView3.f2267s = null;
            }
            ArrayList arrayList2 = this.f1129n.f2254g0;
            if (arrayList2 != null) {
                arrayList2.remove(gVar);
            }
            this.f1129n.removeCallbacks(fVar);
        }
        this.f1129n = recyclerView;
        if (recyclerView != null) {
            e0 e0Var2 = recyclerView.f2264p;
            if (e0Var2 != null) {
                e0Var2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f2265q;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f1129n.f2266r.add(this);
            RecyclerView recyclerView4 = this.f1129n;
            if (recyclerView4.f2254g0 == null) {
                recyclerView4.f2254g0 = new ArrayList();
            }
            recyclerView4.f2254g0.add(gVar);
        }
    }

    public static int d(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public final boolean a(float f10, float f11) {
        return f11 >= ((float) (this.f1128m - this.f1123h)) && f10 >= ((float) (0 - (0 / 2))) && f10 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f10, float f11) {
        RecyclerView recyclerView = this.f1129n;
        Field field = b3.q0.f2670a;
        boolean z10 = b3.c0.d(recyclerView) == 1;
        int i10 = this.f1119d;
        if (z10) {
            if (f10 > i10 / 2) {
                return false;
            }
        } else if (f10 < this.f1127l - i10) {
            return false;
        }
        int i11 = 0 / 2;
        return f11 >= ((float) (0 - i11)) && f11 <= ((float) (i11 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i10 = this.f1132q;
        if (i10 == 1) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zB && !zA) {
                return false;
            }
            if (zA) {
                this.f1133r = 1;
                this.f1126k = (int) motionEvent.getX();
            } else if (zB) {
                this.f1133r = 2;
                this.f1125j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i10) {
        f fVar = this.f1138w;
        StateListDrawable stateListDrawable = this.f1117b;
        if (i10 == 2 && this.f1132q != 2) {
            stateListDrawable.setState(f1114x);
            this.f1129n.removeCallbacks(fVar);
        }
        if (i10 == 0) {
            this.f1129n.invalidate();
        } else {
            f();
        }
        if (this.f1132q == 2 && i10 != 2) {
            stateListDrawable.setState(f1115y);
            this.f1129n.removeCallbacks(fVar);
            this.f1129n.postDelayed(fVar, 1200);
        } else if (i10 == 1) {
            this.f1129n.removeCallbacks(fVar);
            this.f1129n.postDelayed(fVar, 1500);
        }
        this.f1132q = i10;
    }

    public final void f() {
        int i10 = this.f1137v;
        ValueAnimator valueAnimator = this.f1136u;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f1137v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
