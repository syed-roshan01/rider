package j0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import t.l0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f8311f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f8312n = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f8313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f8314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f8315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.activity.d f8316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c9.a f8317e;

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f8316d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f8315c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f8311f : f8312n;
            d0 d0Var = this.f8313a;
            if (d0Var != null) {
                d0Var.setState(iArr);
            }
        } else {
            androidx.activity.d dVar = new androidx.activity.d(this, 4);
            this.f8316d = dVar;
            postDelayed(dVar, 50L);
        }
        this.f8315c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(t tVar) {
        d0 d0Var = tVar.f8313a;
        if (d0Var != null) {
            d0Var.setState(f8312n);
        }
        tVar.f8316d = null;
    }

    public final void b(x.o oVar, boolean z10, long j10, int i10, long j11, float f10, l0 l0Var) {
        if (this.f8313a == null || !d7.a.d(Boolean.valueOf(z10), this.f8314b)) {
            d0 d0Var = new d0(z10);
            setBackground(d0Var);
            this.f8313a = d0Var;
            this.f8314b = Boolean.valueOf(z10);
        }
        d0 d0Var2 = this.f8313a;
        d7.a.j(d0Var2);
        this.f8317e = l0Var;
        e(j10, i10, j11, f10);
        if (z10) {
            d0Var2.setHotspot(d1.c.d(oVar.f16279a), d1.c.e(oVar.f16279a));
        } else {
            d0Var2.setHotspot(d0Var2.getBounds().centerX(), d0Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f8317e = null;
        androidx.activity.d dVar = this.f8316d;
        if (dVar != null) {
            removeCallbacks(dVar);
            androidx.activity.d dVar2 = this.f8316d;
            d7.a.j(dVar2);
            dVar2.run();
        } else {
            d0 d0Var = this.f8313a;
            if (d0Var != null) {
                d0Var.setState(f8312n);
            }
        }
        d0 d0Var2 = this.f8313a;
        if (d0Var2 == null) {
            return;
        }
        d0Var2.setVisible(false, false);
        unscheduleDrawable(d0Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j10, int i10, long j11, float f10) {
        d0 d0Var = this.f8313a;
        if (d0Var == null) {
            return;
        }
        Integer num = d0Var.f8262c;
        if (num == null || num.intValue() != i10) {
            d0Var.f8262c = Integer.valueOf(i10);
            c0.f8258a.a(d0Var, i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        long jB = e1.r.b(j11, z6.a.o(f10, 1.0f));
        e1.r rVar = d0Var.f8261b;
        if (rVar == null || !e1.r.c(rVar.f5067a, jB)) {
            d0Var.f8261b = new e1.r(jB);
            d0Var.setColor(ColorStateList.valueOf(androidx.compose.ui.graphics.a.s(jB)));
        }
        Rect rect = new Rect(0, 0, d7.t.p0(d1.f.d(j10)), d7.t.p0(d1.f.b(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        d0Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c9.a aVar = this.f8317e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
