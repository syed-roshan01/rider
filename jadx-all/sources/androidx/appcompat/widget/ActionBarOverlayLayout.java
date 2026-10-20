package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import b3.b0;
import b3.f0;
import b3.h0;
import b3.i1;
import b3.j1;
import b3.k1;
import b3.l1;
import b3.q;
import b3.q0;
import b3.r;
import b3.r1;
import b3.s;
import b3.u1;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import l.e;
import l.j3;
import l.s0;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements q, r {
    public static final int[] F = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public ViewPropertyAnimator A;
    public final l.b B;
    public final l.c C;
    public final l.c D;
    public final s E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarContainer f1485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f1486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1488f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f1494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f1495t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f1496u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u1 f1497v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u1 f1498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u1 f1499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u1 f1500y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public OverScroller f1501z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1494s = new Rect();
        this.f1495t = new Rect();
        this.f1496u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        u1 u1Var = u1.f2682b;
        this.f1497v = u1Var;
        this.f1498w = u1Var;
        this.f1499x = u1Var;
        this.f1500y = u1Var;
        this.B = new l.b(this, 0);
        this.C = new l.c(this, 0);
        this.D = new l.c(this, 1);
        i(context);
        this.E = new s();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // b3.q
    public final void a(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // b3.q
    public final void b(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // b3.q
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // b3.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        e(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1487e == null || this.f1488f) {
            return;
        }
        if (this.f1485c.getVisibility() == 0) {
            translationY = (int) (this.f1485c.getTranslationY() + this.f1485c.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f1487e.setBounds(0, translationY, getWidth(), this.f1487e.getIntrinsicHeight() + translationY);
        this.f1487e.draw(canvas);
    }

    @Override // b3.q
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // b3.q
    public final boolean f(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1485c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.E;
        return sVar.f2677b | sVar.f2676a;
    }

    public CharSequence getTitle() {
        j();
        return ((j3) this.f1486d).f10788a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.f1483a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1487e = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1488f = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1501z = new OverScroller(context);
    }

    public final void j() {
        s0 wrapper;
        if (this.f1484b == null) {
            this.f1484b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1485c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof s0) {
                wrapper = (s0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1486d = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        u1 u1VarC = u1.c(this, windowInsets);
        r1 r1Var = u1VarC.f2683a;
        boolean zG = g(this.f1485c, new Rect(r1Var.k().f15395a, r1Var.k().f15396b, r1Var.k().f15397c, r1Var.k().f15398d), false);
        Field field = q0.f2670a;
        Rect rect = this.f1494s;
        h0.b(this, u1VarC, rect);
        u1 u1VarM = r1Var.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f1497v = u1VarM;
        if (!this.f1498w.equals(u1VarM)) {
            this.f1498w = this.f1497v;
            zG = true;
        }
        Rect rect2 = this.f1495t;
        if (rect2.equals(rect)) {
            if (zG) {
            }
            return r1Var.a().f2683a.c().f2683a.b().b();
        }
        rect2.set(rect);
        requestLayout();
        return r1Var.a().f2683a.c().f2683a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = q0.f2670a;
        f0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        l1 j1Var;
        j();
        measureChildWithMargins(this.f1485c, i10, 0, i11, 0);
        e eVar = (e) this.f1485c.getLayoutParams();
        int iMax = Math.max(0, this.f1485c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f1485c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1485c.getMeasuredState());
        Field field = q0.f2670a;
        boolean z10 = (b0.g(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f1483a;
            if (this.f1490o && this.f1485c.getTabContainer() != null) {
                measuredHeight += this.f1483a;
            }
        } else {
            measuredHeight = this.f1485c.getVisibility() != 8 ? this.f1485c.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1494s;
        Rect rect2 = this.f1496u;
        rect2.set(rect);
        u1 u1Var = this.f1497v;
        this.f1499x = u1Var;
        if (this.f1489n || z10) {
            u2.c cVarB = u2.c.b(u1Var.f2683a.k().f15395a, this.f1499x.f2683a.k().f15396b + measuredHeight, this.f1499x.f2683a.k().f15397c, this.f1499x.f2683a.k().f15398d);
            u1 u1Var2 = this.f1499x;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                j1Var = new k1(u1Var2);
            } else {
                j1Var = i12 >= 29 ? new j1(u1Var2) : new i1(u1Var2);
            }
            j1Var.g(cVarB);
            this.f1499x = j1Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f1499x = u1Var.f2683a.m(0, measuredHeight, 0, 0);
        }
        g(this.f1484b, rect2, true);
        if (!this.f1500y.equals(this.f1499x)) {
            u1 u1Var3 = this.f1499x;
            this.f1500y = u1Var3;
            ContentFrameLayout contentFrameLayout = this.f1484b;
            WindowInsets windowInsetsB = u1Var3.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsA = f0.a(contentFrameLayout, windowInsetsB);
                if (!windowInsetsA.equals(windowInsetsB)) {
                    u1.c(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.f1484b, i10, 0, i11, 0);
        e eVar2 = (e) this.f1484b.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1484b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1484b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1484b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1491p || !z10) {
            return false;
        }
        this.f1501z.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1501z.getFinalY() > this.f1485c.getHeight()) {
            h();
            this.D.run();
        } else {
            h();
            this.C.run();
        }
        this.f1492q = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1493r + i11;
        this.f1493r = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.E.f2676a = i10;
        this.f1493r = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1485c.getVisibility() != 0) {
            return false;
        }
        return this.f1491p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1491p || this.f1492q) {
            return;
        }
        if (this.f1493r <= this.f1485c.getHeight()) {
            h();
            postDelayed(this.C, 600L);
        } else {
            h();
            postDelayed(this.D, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setActionBarHideOffset(int i10) {
        h();
        this.f1485c.setTranslationY(-Math.max(0, Math.min(i10, this.f1485c.getHeight())));
    }

    public void setActionBarVisibilityCallback(l.d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1490o = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1491p) {
            this.f1491p = z10;
            if (z10) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        j();
        j3 j3Var = (j3) this.f1486d;
        j3Var.f10791d = i10 != 0 ? d0.C(j3Var.f10788a.getContext(), i10) : null;
        j3Var.c();
    }

    public void setLogo(int i10) {
        j();
        j3 j3Var = (j3) this.f1486d;
        j3Var.f10792e = i10 != 0 ? d0.C(j3Var.f10788a.getContext(), i10) : null;
        j3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.f1489n = z10;
        this.f1488f = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((j3) this.f1486d).f10798k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        j3 j3Var = (j3) this.f1486d;
        if (j3Var.f10794g) {
            return;
        }
        j3Var.f10795h = charSequence;
        if ((j3Var.f10789b & 8) != 0) {
            Toolbar toolbar = j3Var.f10788a;
            toolbar.setTitle(charSequence);
            if (j3Var.f10794g) {
                q0.e(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        j3 j3Var = (j3) this.f1486d;
        j3Var.f10791d = drawable;
        j3Var.c();
    }
}
