package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import b3.e0;
import b3.q0;
import b3.y;
import e3.r;
import i3.l;
import java.lang.reflect.Field;
import l.g0;
import l.o2;
import l.o3;
import l.p2;
import l.q2;
import l.r2;
import l.u;
import l.v0;
import l.z2;
import o7.d0;
import r2.k;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final o2 f1538b0 = new o2(Float.class, "thumbPos", 0);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int[] f1539c0 = {R.attr.state_checked};
    public int A;
    public final int B;
    public float C;
    public float D;
    public final VelocityTracker E;
    public final int F;
    public float G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public final TextPaint P;
    public final ColorStateList Q;
    public StaticLayout R;
    public StaticLayout S;
    public final i.a T;
    public ObjectAnimator U;
    public u V;
    public q2 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f1540a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Rect f1541a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1546f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f1547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f1548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f1555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f1556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f1557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f1558y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1559z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.ride.accepter.R.attr.switchStyle);
        this.f1542b = null;
        this.f1543c = null;
        this.f1544d = false;
        this.f1545e = false;
        this.f1547n = null;
        this.f1548o = null;
        this.f1549p = false;
        this.f1550q = false;
        this.E = VelocityTracker.obtain();
        this.O = true;
        this.f1541a0 = new Rect();
        r2.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.P = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = f.a.f5582r;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.ride.accepter.R.attr.switchStyle, 0);
        z2 z2Var = new z2(0, context, typedArrayObtainStyledAttributes);
        q0.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.ride.accepter.R.attr.switchStyle);
        Drawable drawableT = z2Var.t(2);
        this.f1540a = drawableT;
        if (drawableT != null) {
            drawableT.setCallback(this);
        }
        Drawable drawableT2 = z2Var.t(11);
        this.f1546f = drawableT2;
        if (drawableT2 != null) {
            drawableT2.setCallback(this);
        }
        setTextOnInternal(z2Var.C(0));
        setTextOffInternal(z2Var.C(1));
        this.f1559z = z2Var.p(3, true);
        this.f1551r = z2Var.s(8, 0);
        this.f1552s = z2Var.s(5, 0);
        this.f1553t = z2Var.s(6, 0);
        this.f1554u = z2Var.p(4, false);
        ColorStateList colorStateListQ = z2Var.q(9);
        if (colorStateListQ != null) {
            this.f1542b = colorStateListQ;
            this.f1544d = true;
        }
        PorterDuff.Mode modeC = v0.c(z2Var.v(10, -1), null);
        if (this.f1543c != modeC) {
            this.f1543c = modeC;
            this.f1545e = true;
        }
        if (this.f1544d || this.f1545e) {
            a();
        }
        ColorStateList colorStateListQ2 = z2Var.q(12);
        if (colorStateListQ2 != null) {
            this.f1547n = colorStateListQ2;
            this.f1549p = true;
        }
        PorterDuff.Mode modeC2 = v0.c(z2Var.v(13, -1), null);
        if (this.f1548o != modeC2) {
            this.f1548o = modeC2;
            this.f1550q = true;
        }
        if (this.f1549p || this.f1550q) {
            b();
        }
        int iZ = z2Var.z(7, 0);
        if (iZ != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iZ, f.a.f5583s);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = k.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.Q = colorStateList;
            } else {
                this.Q = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i10 = typedArrayObtainStyledAttributes2.getInt(1, -1);
            int i11 = typedArrayObtainStyledAttributes2.getInt(2, -1);
            if (i10 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i10 != 2) {
                typeface = i10 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i11 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typeface, i11);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                i.a aVar = new i.a();
                aVar.f7722a = context2.getResources().getConfiguration().locale;
                this.T = aVar;
            } else {
                this.T = null;
            }
            setTextOnInternal(this.f1555v);
            setTextOffInternal(this.f1557x);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new g0(this).d(attributeSet, com.ride.accepter.R.attr.switchStyle);
        z2Var.K();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.B = viewConfiguration.getScaledTouchSlop();
        this.F = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, com.ride.accepter.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private u getEmojiTextViewHelper() {
        if (this.V == null) {
            this.V = new u(this);
        }
        return this.V;
    }

    private boolean getTargetCheckedState() {
        return this.G > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((o3.a(this) ? 1.0f - this.G : this.G) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1546f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1541a0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1540a;
        Rect rectB = drawable2 != null ? v0.b(drawable2) : v0.f10951c;
        return ((((this.H - this.J) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1557x = charSequence;
        u emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodK = ((v) emojiTextViewHelper.f10945b.f8599b).K(this.T);
        if (transformationMethodK != null) {
            charSequence = transformationMethodK.getTransformation(charSequence, this);
        }
        this.f1558y = charSequence;
        this.S = null;
        if (this.f1559z) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1555v = charSequence;
        u emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodK = ((v) emojiTextViewHelper.f10945b.f8599b).K(this.T);
        if (transformationMethodK != null) {
            charSequence = transformationMethodK.getTransformation(charSequence, this);
        }
        this.f1556w = charSequence;
        this.R = null;
        if (this.f1559z) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f1540a;
        if (drawable != null) {
            if (this.f1544d || this.f1545e) {
                Drawable drawableMutate = drawable.mutate();
                this.f1540a = drawableMutate;
                if (this.f1544d) {
                    v2.b.h(drawableMutate, this.f1542b);
                }
                if (this.f1545e) {
                    v2.b.i(this.f1540a, this.f1543c);
                }
                if (this.f1540a.isStateful()) {
                    this.f1540a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1546f;
        if (drawable != null) {
            if (this.f1549p || this.f1550q) {
                Drawable drawableMutate = drawable.mutate();
                this.f1546f = drawableMutate;
                if (this.f1549p) {
                    v2.b.h(drawableMutate, this.f1547n);
                }
                if (this.f1550q) {
                    v2.b.i(this.f1546f, this.f1548o);
                }
                if (this.f1546f.isStateful()) {
                    this.f1546f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f1555v);
        setTextOffInternal(this.f1557x);
        requestLayout();
    }

    public final void d() {
        if (this.W == null && ((v) this.V.f10945b.f8599b).z() && l.c()) {
            l lVarA = l.a();
            int iB = lVarA.b();
            if (iB == 3 || iB == 0) {
                q2 q2Var = new q2(this);
                this.W = q2Var;
                lVarA.h(q2Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.K;
        int i13 = this.L;
        int i14 = this.M;
        int i15 = this.N;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1540a;
        Rect rectB = drawable != null ? v0.b(drawable) : v0.f10951c;
        Drawable drawable2 = this.f1546f;
        Rect rect = this.f1541a0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectB != null) {
                int i17 = rectB.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectB.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectB.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectB.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f1546f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1546f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1540a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.J + rect.right;
            this.f1540a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                v2.b.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1540a;
        if (drawable != null) {
            v2.b.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1546f;
        if (drawable2 != null) {
            v2.b.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1540a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1546f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!o3.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.H;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1553t : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (o3.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.H;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1553t : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof r ? ((r) customSelectionActionModeCallback).f5119a : customSelectionActionModeCallback;
    }

    public boolean getShowText() {
        return this.f1559z;
    }

    public boolean getSplitTrack() {
        return this.f1554u;
    }

    public int getSwitchMinWidth() {
        return this.f1552s;
    }

    public int getSwitchPadding() {
        return this.f1553t;
    }

    public CharSequence getTextOff() {
        return this.f1557x;
    }

    public CharSequence getTextOn() {
        return this.f1555v;
    }

    public Drawable getThumbDrawable() {
        return this.f1540a;
    }

    public final float getThumbPosition() {
        return this.G;
    }

    public int getThumbTextPadding() {
        return this.f1551r;
    }

    public ColorStateList getThumbTintList() {
        return this.f1542b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1543c;
    }

    public Drawable getTrackDrawable() {
        return this.f1546f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1547n;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1548o;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1540a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1546f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.U;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.U.end();
        this.U = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1539c0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1546f;
        Rect rect = this.f1541a0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.L;
        int i11 = this.N;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1540a;
        if (drawable != null) {
            if (!this.f1554u || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = v0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.R : this.S;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.Q;
            TextPaint textPaint = this.P;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1555v : this.f1557x;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f1540a != null) {
            Drawable drawable = this.f1546f;
            Rect rect = this.f1541a0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = v0.b(this.f1540a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (o3.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.H + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.H) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.I;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.I + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.I;
        }
        this.K = paddingLeft;
        this.L = paddingTop;
        this.N = height;
        this.M = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f1559z) {
            StaticLayout staticLayout = this.R;
            TextPaint textPaint = this.P;
            if (staticLayout == null) {
                CharSequence charSequence = this.f1556w;
                this.R = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.S == null) {
                CharSequence charSequence2 = this.f1558y;
                this.S = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f1540a;
        Rect rect = this.f1541a0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1540a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1540a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f1559z) {
            iMax = (this.f1551r * 2) + Math.max(this.R.getWidth(), this.S.getWidth());
        } else {
            iMax = 0;
        }
        this.J = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f1546f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1546f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f1540a;
        if (drawable3 != null) {
            Rect rectB = v0.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.O ? Math.max(this.f1552s, (this.J * 2) + iMax2 + iMax3) : this.f1552s;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.H = iMax4;
        this.I = iMax5;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1555v : this.f1557x;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f10;
        VelocityTracker velocityTracker = this.E;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.B;
        if (actionMasked != 0) {
            float f11 = 0.0f;
            if (actionMasked == 1) {
                if (this.A == 2) {
                    this.A = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.F) {
                            targetCheckedState = o3.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.A = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i11 = this.A;
                if (i11 == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (Math.abs(x10 - this.C) > i10 || Math.abs(y10 - this.D) > i10) {
                        this.A = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.C = x10;
                        this.D = y10;
                        return true;
                    }
                } else if (i11 == 2) {
                    float x11 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f12 = x11 - this.C;
                    if (thumbScrollRange != 0) {
                        f10 = f12 / thumbScrollRange;
                    } else {
                        f10 = f12 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (o3.a(this)) {
                        f10 = -f10;
                    }
                    float f13 = this.G;
                    float f14 = f10 + f13;
                    if (f14 >= 0.0f) {
                        f11 = f14 > 1.0f ? 1.0f : f14;
                    }
                    if (f11 != f13) {
                        this.C = x11;
                        setThumbPosition(f11);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.A == 2) {
                    this.A = 0;
                    if (motionEvent.getAction() == 1) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.F) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (o3.a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.A = 0;
                velocityTracker.clear();
            }
        } else {
            float x12 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled() && this.f1540a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1540a;
                Rect rect = this.f1541a0;
                drawable.getPadding(rect);
                int i12 = this.L - i10;
                int i13 = (this.K + thumbOffset) - i10;
                int i14 = this.J + i13 + rect.left + rect.right + i10;
                int i15 = this.N + i10;
                if (x12 > i13 && x12 < i14 && y11 > i12 && y11 < i15) {
                    this.A = 1;
                    this.C = x12;
                    this.D = y11;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        ((v) getEmojiTextViewHelper().f10945b.f8599b).H(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f1555v;
                if (string == null) {
                    string = getResources().getString(com.ride.accepter.R.string.abc_capital_on);
                }
                Field field = q0.f2670a;
                new y(com.ride.accepter.R.id.tag_state_description, 64, 30, 2).b(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f1557x;
            if (string2 == null) {
                string2 = getResources().getString(com.ride.accepter.R.string.abc_capital_off);
            }
            Field field2 = q0.f2670a;
            new y(com.ride.accepter.R.id.tag_state_description, 64, 30, 2).b(this, string2);
        }
        if (getWindowToken() != null) {
            Field field3 = q0.f2670a;
            if (e0.c(this)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1538b0, zIsChecked ? 1.0f : 0.0f);
                this.U = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                p2.a(this.U, true);
                this.U.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.U;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i1.b.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((v) getEmojiTextViewHelper().f10945b.f8599b).I(z10);
        setTextOnInternal(this.f1555v);
        setTextOffInternal(this.f1557x);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.O = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((v) getEmojiTextViewHelper().f10945b.f8599b).s(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1559z != z10) {
            this.f1559z = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1554u = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1552s = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1553t = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.P;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f1557x;
        if (string == null) {
            string = getResources().getString(com.ride.accepter.R.string.abc_capital_off);
        }
        Field field = q0.f2670a;
        new y(com.ride.accepter.R.id.tag_state_description, 64, 30, 2).b(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f1555v;
        if (string == null) {
            string = getResources().getString(com.ride.accepter.R.string.abc_capital_on);
        }
        Field field = q0.f2670a;
        new y(com.ride.accepter.R.id.tag_state_description, 64, 30, 2).b(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1540a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1540a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.G = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(d0.C(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1551r = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1542b = colorStateList;
        this.f1544d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1543c = mode;
        this.f1545e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1546f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1546f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(d0.C(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1547n = colorStateList;
        this.f1549p = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1548o = mode;
        this.f1550q = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1540a || drawable == this.f1546f;
    }
}
