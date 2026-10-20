package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b3.b0;
import b3.q0;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import l.o3;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f1474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f1475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f1476f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f1477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f1478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f1479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1482s;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5568d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : d0.C(context, resourceId);
        Field field = q0.f2670a;
        b0.q(this, drawable);
        this.f1480q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1481r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1471a = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f1477n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1477n = linearLayout;
            this.f1478o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1479p = (TextView) this.f1477n.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f1480q;
            if (i10 != 0) {
                this.f1478o.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f1481r;
            if (i11 != 0) {
                this.f1479p.setTextAppearance(getContext(), i11);
            }
        }
        this.f1478o.setText(this.f1474d);
        this.f1479p.setText(this.f1475e);
        boolean z10 = !TextUtils.isEmpty(this.f1474d);
        boolean z11 = !TextUtils.isEmpty(this.f1475e);
        this.f1479p.setVisibility(z11 ? 0 : 8);
        this.f1477n.setVisibility((z10 || z11) ? 0 : 8);
        if (this.f1477n.getParent() == null) {
            addView(this.f1477n);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, f.a.f5565a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1473c = false;
        }
        if (!this.f1473c) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1473c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1473c = false;
        }
        return true;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1472b = false;
        }
        if (!this.f1472b) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1472b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1472b = false;
        }
        return true;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            super.setVisibility(i10);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1471a;
    }

    public CharSequence getSubtitle() {
        return this.f1475e;
    }

    public CharSequence getTitle() {
        return this.f1474d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zA = o3.a(this);
        int paddingRight = zA ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f1477n;
        if (linearLayout != null && this.f1476f == null && linearLayout.getVisibility() != 8) {
            paddingRight += e(this.f1477n, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view = this.f1476f;
        if (view != null) {
            e(view, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (zA) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1471a;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f1477n;
        if (linearLayout != null && this.f1476f == null) {
            if (this.f1482s) {
                this.f1477n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1477n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f1477n.setVisibility(z10 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f1476f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f1476f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1471a > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    public void setContentHeight(int i10) {
        this.f1471a = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1476f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1476f = view;
        if (view != null && (linearLayout = this.f1477n) != null) {
            removeView(linearLayout);
            this.f1477n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1475e = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1474d = charSequence;
        a();
        q0.e(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1482s) {
            requestLayout();
        }
        this.f1482s = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
