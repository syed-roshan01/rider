package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import b3.b0;
import b3.h0;
import b3.p;
import b3.q0;
import b3.r;
import b3.s;
import e3.c;
import e3.g;
import e3.h;
import e3.i;
import e3.j;
import i1.b;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements r {
    public static final float H = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final g I = new g();
    public static final int[] J = {R.attr.fillViewport};
    public final int[] A;
    public int B;
    public int C;
    public j D;
    public final s E;
    public final p F;
    public float G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f1815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f1816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f1817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1818f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f1822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f1824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1830y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f1831z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ride.accepter.R.attr.nestedScrollViewStyle);
        this.f1815c = new Rect();
        this.f1820o = true;
        this.f1821p = false;
        this.f1822q = null;
        this.f1823r = false;
        this.f1826u = true;
        this.f1830y = -1;
        this.f1831z = new int[2];
        this.A = new int[2];
        int i10 = Build.VERSION.SDK_INT;
        this.f1817e = i10 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f1818f = i10 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f1813a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1816d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1827v = viewConfiguration.getScaledTouchSlop();
        this.f1828w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1829x = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, com.ride.accepter.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.E = new s();
        this.F = new p(this);
        setNestedScrollingEnabled(true);
        q0.d(this, I);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.G = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.G;
    }

    public static boolean k(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, view2);
    }

    @Override // b3.q
    public final void a(View view, View view2, int i10, int i11) {
        s sVar = this.E;
        if (i11 == 1) {
            sVar.f2677b = i10;
        } else {
            sVar.f2676a = i10;
        }
        u(2, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // b3.q
    public final void b(View view, int i10) {
        s sVar = this.E;
        if (i10 == 1) {
            sVar.f2677b = 0;
        } else {
            sVar.f2676a = 0;
        }
        w(i10);
    }

    @Override // b3.q
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        this.F.a(i10, i11, i12, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int overScrollMode;
        if (this.f1816d.isFinished()) {
            return;
        }
        this.f1816d.computeScrollOffset();
        int currY = this.f1816d.getCurrY();
        int i11 = currY - this.C;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1818f;
        EdgeEffect edgeEffect2 = this.f1817e;
        if (i11 <= 0 || b.r(edgeEffect2) == 0.0f) {
            if (i11 < 0 && b.r(edgeEffect) != 0.0f) {
                float f10 = height;
                iRound = Math.round(b.A(edgeEffect, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i11) {
                    edgeEffect.finish();
                }
            }
            this.C = currY;
            iArr = this.A;
            iArr[1] = 0;
            this.F.a(0, i11, 1, iArr, null);
            i10 = i11 - iArr[1];
            scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                o(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i10 - scrollY2;
                iArr[1] = 0;
                this.F.b(0, scrollY2, 0, i12, this.f1831z, 1, iArr);
                i10 = i12 - iArr[1];
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1816d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1816d.getCurrVelocity());
                    }
                }
                this.f1816d.abortAnimation();
                w(1);
            }
            if (!this.f1816d.isFinished()) {
                w(1);
            } else {
                Field field = q0.f2670a;
                b0.k(this);
            }
        }
        iRound = Math.round(b.A(edgeEffect2, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect2.finish();
        }
        i11 -= iRound;
        this.C = currY;
        iArr = this.A;
        iArr[1] = 0;
        this.F.a(0, i11, 1, iArr, null);
        i10 = i11 - iArr[1];
        scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            o(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i13 = i10 - scrollY4;
            iArr[1] = 0;
            this.F.b(0, scrollY4, 0, i13, this.f1831z, 1, iArr);
            i10 = i13 - iArr[1];
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f1816d.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f1816d.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f1816d.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f1816d.getCurrVelocity());
            }
            this.f1816d.abortAnimation();
            w(1);
        }
        if (!this.f1816d.isFinished()) {
            w(1);
        } else {
            Field field2 = q0.f2670a;
            b0.k(this);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // b3.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m(i13, i14, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zJ;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f1815c.setEmpty();
            if (getChildCount() <= 0) {
                return !isFocused() ? false : false;
            }
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    zJ = keyEvent.isAltPressed() ? j(33) : g(33);
                } else if (keyCode == 20) {
                    zJ = keyEvent.isAltPressed() ? j(130) : g(130);
                } else {
                    if (keyCode == 62) {
                        p(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        zJ = j(33);
                    } else {
                        if (keyCode != 93) {
                            if (keyCode == 122) {
                                p(33);
                                return false;
                            }
                            if (keyCode != 123) {
                                return false;
                            }
                            p(130);
                            return false;
                        }
                        zJ = j(130);
                    }
                }
                if (!zJ) {
                    return false;
                }
            } else if (!isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        ViewParent viewParentC;
        p pVar = this.F;
        if (!pVar.f2661d || (viewParentC = pVar.c(0)) == null) {
            return false;
        }
        return b.w(viewParentC, pVar.f2660c, f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        ViewParent viewParentC;
        p pVar = this.F;
        if (!pVar.f2661d || (viewParentC = pVar.c(0)) == null) {
            return false;
        }
        return b.x(viewParentC, pVar.f2660c, f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.F.a(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.F.b(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1817e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (h.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (h.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                Field field = q0.f2670a;
                b0.k(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1818f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (h.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (h.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            Field field2 = q0.f2670a;
            b0.k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // b3.q
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        m(i13, i14, null);
    }

    @Override // b3.q
    public final boolean f(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final boolean g(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(true, maxScrollAmount, 0, 1);
        } else {
            Rect rect = this.f1815c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            r(true, h(rect), 0, 1);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!l(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.E;
        return sVar.f2677b | sVar.f2676a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.F.d(0);
    }

    public final void i(int i10) {
        if (getChildCount() > 0) {
            this.f1816d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.C = getScrollY();
            Field field = q0.f2670a;
            b0.k(this);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.F.f2661d;
    }

    public final boolean j(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1815c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return q(i10, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i10, int i11) {
        Rect rect = this.f1815c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    public final void m(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.F.b(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1830y) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1819n = (int) motionEvent.getY(i10);
            this.f1830y = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1824s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i14 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            z10 = false;
        } else {
            i11 = 0;
            z10 = true;
        }
        if (i14 > i13) {
            z11 = true;
        } else if (i14 < 0) {
            i13 = 0;
            z11 = true;
        } else {
            i13 = i14;
            z11 = false;
        }
        if (z11 && !this.F.d(1)) {
            this.f1816d.springBack(i11, i13, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i11, i13, z10, z11);
        return z10 || z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1821p = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f1823r) {
            if ((motionEvent.getSource() & 2) == 2) {
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
            } else {
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                r((motionEvent.getSource() & 8194) == 8194, -((int) (axisValue * getVerticalScrollFactorCompat())), width, 1);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f1823r) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x10 < childAt.getLeft() || x10 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f1816d.isFinished()) {
                        z10 = false;
                    }
                    this.f1823r = z10;
                    velocityTracker = this.f1824s;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1824s = null;
                    }
                } else {
                    this.f1819n = y10;
                    this.f1830y = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f1824s;
                    if (velocityTracker3 == null) {
                        this.f1824s = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f1824s.addMovement(motionEvent);
                    this.f1816d.computeScrollOffset();
                    if (!v(motionEvent) && this.f1816d.isFinished()) {
                        z10 = false;
                    }
                    this.f1823r = z10;
                    u(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z10 = false;
                }
                this.f1823r = z10;
                velocityTracker = this.f1824s;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f1824s = null;
                }
            }
        } else if (i10 == 1) {
            this.f1823r = false;
            this.f1830y = -1;
            velocityTracker2 = this.f1824s;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f1824s = null;
            }
            if (this.f1816d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                Field field = q0.f2670a;
                b0.k(this);
            }
            w(0);
        } else if (i10 == 2) {
            int i11 = this.f1830y;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f1819n) > this.f1827v && (2 & getNestedScrollAxes()) == 0) {
                        this.f1823r = true;
                        this.f1819n = y11;
                        if (this.f1824s == null) {
                            this.f1824s = VelocityTracker.obtain();
                        }
                        this.f1824s.addMovement(motionEvent);
                        this.B = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f1823r = false;
            this.f1830y = -1;
            velocityTracker2 = this.f1824s;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f1824s = null;
            }
            if (this.f1816d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                Field field2 = q0.f2670a;
                b0.k(this);
            }
            w(0);
        } else if (i10 == 6) {
            n(motionEvent);
        }
        return this.f1823r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f1820o = false;
        View view = this.f1822q;
        if (view != null && k(view, this)) {
            View view2 = this.f1822q;
            Rect rect = this.f1815c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f1822q = null;
        if (!this.f1821p) {
            if (this.D != null) {
                scrollTo(getScrollX(), this.D.f5118a);
                this.D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1821p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1825t && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        i((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.F.a(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || (true ^ l(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.D = jVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f5118a = getScrollY();
        return jVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !l(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f1815c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f1826u) {
                t(false, 0, iH);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1824s == null) {
            this.f1824s = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.B);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1818f;
            EdgeEffect edgeEffect2 = this.f1817e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1824s;
                velocityTracker.computeCurrentVelocity(1000, this.f1829x);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1830y);
                if (Math.abs(yVelocity) >= this.f1828w) {
                    if (b.r(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (b.r(edgeEffect) != 0.0f) {
                        int i10 = -yVelocity;
                        if (s(edgeEffect, i10)) {
                            edgeEffect.onAbsorb(i10);
                        } else {
                            i(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f11 = i11;
                        if (!dispatchNestedPreFling(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            i(i11);
                        }
                    }
                } else if (this.f1816d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    Field field = q0.f2670a;
                    b0.k(this);
                }
                this.f1830y = -1;
                this.f1823r = false;
                VelocityTracker velocityTracker2 = this.f1824s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1824s = null;
                }
                w(0);
                this.f1817e.onRelease();
                this.f1818f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1830y);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1830y + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i12 = this.f1819n - y10;
                    float x10 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (b.r(edgeEffect2) != 0.0f) {
                        float f12 = -b.A(edgeEffect2, -height, x10);
                        if (b.r(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f10 = f12;
                    } else if (b.r(edgeEffect) != 0.0f) {
                        float fA = b.A(edgeEffect, height, 1.0f - x10);
                        if (b.r(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f10 = fA;
                    }
                    int iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i13 = i12 - iRound;
                    if (!this.f1823r && Math.abs(i13) > this.f1827v) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1823r = true;
                        i13 = i13 > 0 ? i13 - this.f1827v : i13 + this.f1827v;
                    }
                    if (this.f1823r) {
                        int iR = r(false, i13, (int) motionEvent.getX(iFindPointerIndex), 0);
                        this.f1819n = y10 - iR;
                        this.B += iR;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1823r && getChildCount() > 0 && this.f1816d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    Field field2 = q0.f2670a;
                    b0.k(this);
                }
                this.f1830y = -1;
                this.f1823r = false;
                VelocityTracker velocityTracker3 = this.f1824s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1824s = null;
                }
                w(0);
                this.f1817e.onRelease();
                this.f1818f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1819n = (int) motionEvent.getY(actionIndex);
                this.f1830y = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f1819n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1830y));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1823r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1816d.isFinished()) {
                this.f1816d.abortAnimation();
                w(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1819n = y11;
            this.f1830y = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1824s;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1815c;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        q(i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean q(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            r(true, z11 ? i11 - scrollY : i12 - i13, 0, 1);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    public final int r(boolean z10, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (i12 == 1) {
            u(2, i12);
        }
        boolean zA = this.F.a(0, i10, i12, this.A, this.f1831z);
        int[] iArr = this.A;
        int[] iArr2 = this.f1831z;
        if (zA) {
            i13 = i10 - iArr[1];
            i14 = iArr2[1];
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z12 = o(i13, 0, scrollY, scrollRange) && !this.F.d(i12);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.F.b(0, scrollY2, 0, i13 - scrollY2, this.f1831z, i12, iArr);
        int i15 = i14 + iArr2[1];
        int i16 = i13 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f1818f;
        EdgeEffect edgeEffect2 = this.f1817e;
        if (i17 < 0) {
            if (z11) {
                b.A(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z11) {
            b.A(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            Field field = q0.f2670a;
            b0.k(this);
        } else if (z12 && i12 == 0) {
            this.f1824s.clear();
        }
        if (i12 == 1) {
            w(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1820o) {
            this.f1822q = view2;
        } else {
            Rect rect = this.f1815c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z11 = iH != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iH);
            } else {
                t(false, 0, iH);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f1824s) != null) {
            velocityTracker.recycle();
            this.f1824s = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1820o = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fR = b.r(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f1813a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = H;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fR;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1825t) {
            this.f1825t = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        p pVar = this.F;
        if (pVar.f2661d) {
            Field field = q0.f2670a;
            h0.z(pVar.f2660c);
        }
        pVar.f2661d = z10;
    }

    public void setOnScrollChangeListener(i iVar) {
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1826u = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.F.e(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(boolean z10, int i10, int i11) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1814b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1816d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z10) {
                u(2, 1);
            } else {
                w(1);
            }
            this.C = getScrollY();
            Field field = q0.f2670a;
            b0.k(this);
        } else {
            if (!this.f1816d.isFinished()) {
                this.f1816d.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.f1814b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i10, int i11) {
        this.F.e(2, i11);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1817e;
        if (b.r(edgeEffect) != 0.0f) {
            b.A(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f1818f;
        if (b.r(edgeEffect2) == 0.0f) {
            return z10;
        }
        b.A(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i10) {
        this.F.f(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
