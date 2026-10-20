package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b3.b0;
import b3.q0;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import l.z1;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f1463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f1465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1467f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1470p;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.a aVar = new l.a(this);
        Field field = q0.f2670a;
        b0.q(this, aVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5565a);
        boolean z10 = false;
        this.f1465d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1466e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1470p = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1468n = true;
            this.f1467f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1468n ? !(this.f1465d != null || this.f1466e != null) : this.f1467f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1465d;
        if (drawable != null && drawable.isStateful()) {
            this.f1465d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1466e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1466e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1467f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1467f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1465d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1466e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1467f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1463b = findViewById(R.id.action_bar);
        this.f1464c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1462a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f1468n) {
            Drawable drawable = this.f1467f;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f1465d != null) {
                if (this.f1463b.getVisibility() == 0) {
                    this.f1465d.setBounds(this.f1463b.getLeft(), this.f1463b.getTop(), this.f1463b.getRight(), this.f1463b.getBottom());
                } else {
                    View view = this.f1464c;
                    if (view == null || view.getVisibility() != 0) {
                        this.f1465d.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1465d.setBounds(this.f1464c.getLeft(), this.f1464c.getTop(), this.f1464c.getRight(), this.f1464c.getBottom());
                    }
                }
                z11 = true;
            } else {
                z11 = false;
            }
            this.f1469o = false;
            if (!z11) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f1463b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f1470p) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f1463b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1465d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1465d);
        }
        this.f1465d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1463b;
            if (view != null) {
                this.f1465d.setBounds(view.getLeft(), this.f1463b.getTop(), this.f1463b.getRight(), this.f1463b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f1468n ? !(this.f1465d != null || this.f1466e != null) : this.f1467f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1467f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1467f);
        }
        this.f1467f = drawable;
        boolean z10 = this.f1468n;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f1467f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f1465d != null || this.f1466e != null) : this.f1467f == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1466e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1466e);
        }
        this.f1466e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1469o && this.f1466e != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f1468n ? !(this.f1465d != null || this.f1466e != null) : this.f1467f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(z1 z1Var) {
    }

    public void setTransitioning(boolean z10) {
        this.f1462a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1465d;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1466e;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1467f;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1465d;
        boolean z10 = this.f1468n;
        return (drawable == drawable2 && !z10) || (drawable == this.f1466e && this.f1469o) || ((drawable == this.f1467f && z10) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
