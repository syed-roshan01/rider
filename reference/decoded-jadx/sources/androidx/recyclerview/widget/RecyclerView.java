package androidx.recyclerview.widget;

import a4.a0;
import a4.a1;
import a4.b;
import a4.c;
import a4.e;
import a4.e0;
import a4.f0;
import a4.g0;
import a4.h0;
import a4.i0;
import a4.j;
import a4.k;
import a4.k0;
import a4.l0;
import a4.m;
import a4.m0;
import a4.n0;
import a4.o0;
import a4.p0;
import a4.q0;
import a4.s0;
import a4.u;
import a4.v;
import a4.w;
import a4.x;
import a4.y;
import a4.z;
import a4.z0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b3.b0;
import b3.c0;
import b3.j0;
import b3.p;
import b3.r0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import x2.q;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int[] f2238p0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f2239q0 = {R.attr.clipToPadding};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Class[] f2240r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final v f2241s0;
    public int A;
    public final AccessibilityManager B;
    public boolean C;
    public boolean D;
    public int E;
    public final int F;
    public z G;
    public EdgeEffect H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public a0 L;
    public int M;
    public int N;
    public VelocityTracker O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final int V;
    public final float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f2242a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final float f2243a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n0 f2244b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f2245b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2246c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final q0 f2247c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2248d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public m f2249d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f2250e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final k f2251e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2252f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final o0 f2253f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ArrayList f2254g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final w f2255h0;
    public s0 i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public p f2256j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int[] f2257k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final int[] f2258l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final int[] f2259m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f2260n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ArrayList f2261n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f2262o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final u f2263o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e0 f2264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f2265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f2266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f2267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2269u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2273y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2274z;

    static {
        Class cls = Integer.TYPE;
        f2240r0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2241s0 = new v();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        int i10;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, 0);
        this.f2242a = new l0(this);
        this.f2250e = new a1(0);
        this.f2260n = new Rect();
        this.f2262o = new Rect();
        new RectF();
        this.f2265q = new ArrayList();
        this.f2266r = new ArrayList();
        this.f2271w = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = new z();
        e eVar = new e();
        eVar.f1066a = null;
        eVar.f1067b = new ArrayList();
        eVar.f1068c = 250L;
        eVar.f1069d = 250L;
        eVar.f1088e = new ArrayList();
        eVar.f1089f = new ArrayList();
        eVar.f1090g = new ArrayList();
        eVar.f1091h = new ArrayList();
        eVar.f1092i = new ArrayList();
        eVar.f1093j = new ArrayList();
        eVar.f1094k = new ArrayList();
        eVar.f1095l = new ArrayList();
        eVar.f1096m = new ArrayList();
        eVar.f1097n = new ArrayList();
        eVar.f1098o = new ArrayList();
        this.L = eVar;
        this.M = 0;
        this.N = -1;
        this.W = Float.MIN_VALUE;
        this.f2243a0 = Float.MIN_VALUE;
        boolean z10 = true;
        this.f2245b0 = true;
        this.f2247c0 = new q0(this);
        this.f2251e0 = new k(0);
        o0 o0Var = new o0();
        o0Var.f1166a = 0;
        o0Var.f1167b = 0;
        o0Var.f1168c = false;
        o0Var.f1169d = false;
        o0Var.f1170e = false;
        o0Var.f1171f = false;
        this.f2253f0 = o0Var;
        w wVar = new w(this, 0);
        this.f2255h0 = wVar;
        this.f2257k0 = new int[2];
        this.f2258l0 = new int[2];
        this.f2259m0 = new int[2];
        this.f2261n0 = new ArrayList();
        this.f2263o0 = new u(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2239q0, 0, 0);
            this.f2252f = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f2252f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.T = viewConfiguration.getScaledTouchSlop();
        this.W = r0.a(viewConfiguration);
        this.f2243a0 = r0.b(viewConfiguration);
        this.U = viewConfiguration.getScaledMinimumFlingVelocity();
        this.V = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.L.f1066a = wVar;
        this.f2246c = new b(new w(this, 0));
        this.f2248d = new c(new w(this, 0));
        Field field = b3.q0.f2670a;
        if (j0.c(this) == 0) {
            j0.m(this, 8);
        }
        if (b0.c(this) == 0) {
            b0.s(this, 1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new s0(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f17200a, 0, 0);
            String string = typedArrayObtainStyledAttributes2.getString(7);
            if (typedArrayObtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(5);
                Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                i10 = 4;
                new j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.ride.accepter.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.ride.accepter.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.ride.accepter.R.dimen.fastscroll_margin));
            } else {
                i10 = 4;
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (string != null) {
                String strTrim = string.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.charAt(0) == '.') {
                        strTrim = context.getPackageName() + strTrim;
                    } else if (!strTrim.contains(".")) {
                        strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                    }
                    try {
                        Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(strTrim).asSubclass(e0.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(f2240r0);
                            Object[] objArr2 = new Object[i10];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[2] = 0;
                            objArr2[3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e4) {
                            try {
                                constructor = clsAsSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e10) {
                                e10.initCause(e4);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e10);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((e0) constructor.newInstance(objArr));
                    } catch (ClassCastException e11) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e11);
                    } catch (ClassNotFoundException e12) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e12);
                    } catch (IllegalAccessException e13) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e13);
                    } catch (InstantiationException e14) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e14);
                    } catch (InvocationTargetException e15) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e15);
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2238p0, 0, 0);
            z10 = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z10);
    }

    private p getScrollingChildHelper() {
        if (this.f2256j0 == null) {
            this.f2256j0 = new p(this);
        }
        return this.f2256j0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((f0) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        e0 e0Var = this.f2264p;
        if (e0Var != null) {
            e0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b(String str) {
        if (this.E > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.H.onRelease();
            zIsFinished = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.J.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.I.onRelease();
            zIsFinished |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        if (zIsFinished) {
            Field field = b3.q0.f2670a;
            b0.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f0) && this.f2264p.d((f0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        e0 e0Var = this.f2264p;
        if (e0Var != null && e0Var.b()) {
            return this.f2264p.f(this.f2253f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        e0 e0Var = this.f2264p;
        if (e0Var != null && e0Var.b()) {
            this.f2264p.g(this.f2253f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        e0 e0Var = this.f2264p;
        if (e0Var != null && e0Var.b()) {
            return this.f2264p.h(this.f2253f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        e0 e0Var = this.f2264p;
        if (e0Var != null && e0Var.c()) {
            return this.f2264p.i(this.f2253f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        e0 e0Var = this.f2264p;
        if (e0Var != null && e0Var.c()) {
            this.f2264p.j(this.f2253f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        e0 e0Var = this.f2264p;
        if (e0Var != null && e0Var.c()) {
            return this.f2264p.k(this.f2253f0);
        }
        return 0;
    }

    public final void d() {
        if (!this.f2270v || this.C) {
            int i10 = q.f16301a;
            x2.p.a("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            x2.p.b();
            return;
        }
        if (this.f2246c.f1074b.size() > 0) {
            this.f2246c.getClass();
            if (this.f2246c.f1074b.size() > 0) {
                int i11 = q.f16301a;
                x2.p.a("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                x2.p.b();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        ViewParent viewParentC;
        p scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.f2661d || (viewParentC = scrollingChildHelper.c(0)) == null) {
            return false;
        }
        return i1.b.w(viewParentC, scrollingChildHelper.f2660c, f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        ViewParent viewParentC;
        p scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.f2661d || (viewParentC = scrollingChildHelper.c(0)) == null) {
            return false;
        }
        return i1.b.x(viewParentC, scrollingChildHelper.f2660c, f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().b(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList arrayList = this.f2265q;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) ((a4.b0) arrayList.get(i10));
            if (jVar.f1127l != jVar.f1129n.getWidth() || jVar.f1128m != jVar.f1129n.getHeight()) {
                jVar.f1127l = jVar.f1129n.getWidth();
                jVar.f1128m = jVar.f1129n.getHeight();
                jVar.e(0);
            } else if (jVar.f1137v != 0) {
                if (jVar.f1130o) {
                    int i11 = jVar.f1127l;
                    int i12 = jVar.f1119d;
                    int i13 = i11 - i12;
                    jVar.getClass();
                    jVar.getClass();
                    int i14 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = jVar.f1117b;
                    stateListDrawable.setBounds(0, 0, i12, 0);
                    int i15 = jVar.f1128m;
                    Drawable drawable = jVar.f1118c;
                    drawable.setBounds(0, 0, jVar.f1120e, i15);
                    RecyclerView recyclerView = jVar.f1129n;
                    Field field = b3.q0.f2670a;
                    if (c0.d(recyclerView) == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i12, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i12, -i14);
                    } else {
                        canvas.translate(i13, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i13, -i14);
                    }
                }
                if (jVar.f1131p) {
                    int i16 = jVar.f1128m;
                    int i17 = jVar.f1123h;
                    int i18 = i16 - i17;
                    jVar.getClass();
                    jVar.getClass();
                    int i19 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable2 = jVar.f1121f;
                    stateListDrawable2.setBounds(0, 0, 0, i17);
                    int i20 = jVar.f1127l;
                    Drawable drawable2 = jVar.f1122g;
                    drawable2.setBounds(0, 0, i20, jVar.f1124i);
                    canvas.translate(0.0f, i18);
                    drawable2.draw(canvas);
                    canvas.translate(i19, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i19, -i18);
                }
            }
        }
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2252f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.H;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2252f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2252f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.J;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2252f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.L == null || arrayList.size() <= 0 || !this.L.b()) && !z10) {
            return;
        }
        Field field2 = b3.q0.f2670a;
        b0.k(this);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = b3.q0.f2670a;
        setMeasuredDimension(e0.e(i10, paddingRight, b0.e(this)), e0.e(i11, getPaddingBottom() + getPaddingTop(), b0.d(this)));
    }

    public final boolean f(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i10, i11, i12, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        int i11;
        this.f2264p.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (viewFindNextFocus != null && !viewFindNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            q(viewFindNextFocus, null);
            return view;
        }
        if (viewFindNextFocus != null && viewFindNextFocus != this && i(viewFindNextFocus) != null) {
            if (view == null || i(view) == null) {
                return viewFindNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f2260n;
            byte b10 = 0;
            rect.set(0, 0, width, height);
            int width2 = viewFindNextFocus.getWidth();
            int height2 = viewFindNextFocus.getHeight();
            Rect rect2 = this.f2262o;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect2);
            RecyclerView recyclerView = this.f2264p.f1100b;
            Field field = b3.q0.f2670a;
            int i12 = c0.d(recyclerView) == 1 ? -1 : 1;
            int i13 = rect.left;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b10 = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                if ((i19 > i20 || i17 >= i20) && i17 > i18) {
                    b10 = -1;
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 != 33) {
                            if (i10 != 66) {
                                if (i10 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i10 + h());
                                }
                                if (b10 > 0) {
                                    return viewFindNextFocus;
                                }
                            } else if (i11 > 0) {
                                return viewFindNextFocus;
                            }
                        } else if (b10 < 0) {
                            return viewFindNextFocus;
                        }
                    } else if (i11 < 0) {
                        return viewFindNextFocus;
                    }
                } else {
                    if (b10 > 0) {
                        return viewFindNextFocus;
                    }
                    if (b10 == 0 && i11 * i12 >= 0) {
                        return viewFindNextFocus;
                    }
                }
            } else {
                if (b10 < 0) {
                    return viewFindNextFocus;
                }
                if (b10 == 0 && i11 * i12 <= 0) {
                    return viewFindNextFocus;
                }
            }
        }
        return super.focusSearch(view, i10);
    }

    public final boolean g(int i10, int[] iArr) {
        return getScrollingChildHelper().b(0, 0, 0, 0, iArr, i10, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e0 e0Var = this.f2264p;
        if (e0Var != null) {
            return e0Var.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        e0 e0Var = this.f2264p;
        if (e0Var != null) {
            return e0Var.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public x getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        e0 e0Var = this.f2264p;
        if (e0Var == null) {
            return super.getBaseline();
        }
        e0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2252f;
    }

    public s0 getCompatAccessibilityDelegate() {
        return this.i0;
    }

    public z getEdgeEffectFactory() {
        return this.G;
    }

    public a0 getItemAnimator() {
        return this.L;
    }

    public int getItemDecorationCount() {
        return this.f2265q.size();
    }

    public e0 getLayoutManager() {
        return this.f2264p;
    }

    public int getMaxFlingVelocity() {
        return this.V;
    }

    public int getMinFlingVelocity() {
        return this.U;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public g0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2245b0;
    }

    public k0 getRecycledViewPool() {
        l0 l0Var = this.f2242a;
        if (l0Var.f1155f == null) {
            k0 k0Var = new k0();
            k0Var.f1143a = new SparseArray();
            k0Var.f1144b = 0;
            l0Var.f1155f = k0Var;
        }
        return l0Var.f1155f;
    }

    public int getScrollState() {
        return this.M;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f2264p + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().d(0);
    }

    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2268t;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2661d;
    }

    public final boolean k() {
        return getScrollingChildHelper().d(1);
    }

    public final boolean l() {
        return !this.f2270v || this.C || this.f2246c.f1074b.size() > 0;
    }

    public final void m() {
        int iE = this.f2248d.e();
        for (int i10 = 0; i10 < iE; i10++) {
            ((f0) this.f2248d.d(i10).getLayoutParams()).f1109b = true;
        }
        ArrayList arrayList = this.f2242a.f1151b;
        if (arrayList.size() <= 0) {
            return;
        }
        a7.a.w(arrayList.get(0));
        throw null;
    }

    public final void n() {
        this.E++;
    }

    public final void o(boolean z10) {
        AccessibilityManager accessibilityManager;
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 < 1) {
            this.E = 0;
            if (z10) {
                int i11 = this.A;
                this.A = 0;
                if (i11 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    c3.b.b(accessibilityEventObtain, i11);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f2261n0;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    arrayList.clear();
                } else {
                    a7.a.w(arrayList.get(size));
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        boolean z10 = false;
        this.E = 0;
        this.f2268t = true;
        if (this.f2270v && !isLayoutRequested()) {
            z10 = true;
        }
        this.f2270v = z10;
        e0 e0Var = this.f2264p;
        if (e0Var != null) {
            e0Var.f1103e = true;
        }
        ThreadLocal threadLocal = m.f1157e;
        m mVar = (m) threadLocal.get();
        this.f2249d0 = mVar;
        if (mVar == null) {
            m mVar2 = new m();
            mVar2.f1159a = new ArrayList();
            mVar2.f1162d = new ArrayList();
            this.f2249d0 = mVar2;
            Field field = b3.q0.f2670a;
            Display displayB = c0.b(this);
            if (isInEditMode() || displayB == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = displayB.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            m mVar3 = this.f2249d0;
            mVar3.f1161c = (long) (1.0E9f / refreshRate);
            threadLocal.set(mVar3);
        }
        this.f2249d0.f1159a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a0 a0Var = this.L;
        if (a0Var != null) {
            a0Var.a();
        }
        setScrollState(0);
        q0 q0Var = this.f2247c0;
        q0Var.f1182n.removeCallbacks(q0Var);
        q0Var.f1178c.abortAnimation();
        this.f2268t = false;
        e0 e0Var = this.f2264p;
        if (e0Var != null) {
            e0Var.f1103e = false;
            e0Var.A(this);
        }
        this.f2261n0.clear();
        removeCallbacks(this.f2263o0);
        this.f2250e.getClass();
        while (z0.f1216a.d() != null) {
        }
        m mVar = this.f2249d0;
        if (mVar != null) {
            mVar.f1159a.remove(this);
            this.f2249d0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2265q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a4.b0) arrayList.get(i10)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f2264p != null && !this.f2273y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f2264p.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f2264p.b() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f2264p.c()) {
                    f10 = -axisValue2;
                } else if (this.f2264p.b()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                s((int) (axisValue * this.W), (int) (f10 * this.f2243a0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f2273y) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2267s = null;
        }
        ArrayList arrayList = this.f2266r;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) ((h0) arrayList.get(i10));
            if (jVar.c(motionEvent) && action != 3) {
                this.f2267s = jVar;
                r();
                setScrollState(0);
                return true;
            }
        }
        e0 e0Var = this.f2264p;
        if (e0Var == null) {
            return false;
        }
        boolean zB = e0Var.b();
        boolean zC = this.f2264p.c();
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2274z) {
                this.f2274z = false;
            }
            this.N = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.R = x10;
            this.P = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.S = y10;
            this.Q = y10;
            if (this.M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f2259m0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i11 = zB;
            if (zC) {
                i11 = (zB ? 1 : 0) | 2;
            }
            getScrollingChildHelper().e(i11, 0);
        } else if (actionMasked == 1) {
            this.O.clear();
            w(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.N);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.M != 1) {
                int i12 = x11 - this.P;
                int i13 = y11 - this.Q;
                if (!zB || Math.abs(i12) <= this.T) {
                    z10 = false;
                } else {
                    this.R = x11;
                    z10 = true;
                }
                if (zC && Math.abs(i13) > this.T) {
                    this.S = y11;
                } else if (z10) {
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            r();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.N = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.R = x12;
            this.P = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.S = y12;
            this.Q = y12;
        } else if (actionMasked == 6) {
            p(motionEvent);
        }
        return this.M == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = q.f16301a;
        x2.p.a("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        x2.p.b();
        this.f2270v = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        e0 e0Var = this.f2264p;
        if (e0Var == null) {
            e(i10, i11);
            return;
        }
        if (e0Var.z()) {
            View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getMode(i11);
            this.f2264p.f1100b.e(i10, i11);
        } else {
            if (this.f2269u) {
                this.f2264p.f1100b.e(i10, i11);
                return;
            }
            o0 o0Var = this.f2253f0;
            if (o0Var.f1171f) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            o0Var.getClass();
            u();
            this.f2264p.f1100b.e(i10, i11);
            v(false);
            o0Var.f1169d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (this.E > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof n0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n0 n0Var = (n0) parcelable;
        this.f2244b = n0Var;
        super.onRestoreInstanceState(n0Var.f7543a);
        e0 e0Var = this.f2264p;
        if (e0Var == null || (parcelable2 = this.f2244b.f1163c) == null) {
            return;
        }
        e0Var.C(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n0 n0Var = new n0(super.onSaveInstanceState());
        n0 n0Var2 = this.f2244b;
        if (n0Var2 != null) {
            n0Var.f1163c = n0Var2.f1163c;
        } else {
            e0 e0Var = this.f2264p;
            if (e0Var != null) {
                n0Var.f1163c = e0Var.D();
            } else {
                n0Var.f1163c = null;
            }
        }
        return n0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.K = null;
        this.I = null;
        this.J = null;
        this.H = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0238  */
    /* JADX WARN: Code duplicated, block: B:101:0x023a  */
    /* JADX WARN: Code duplicated, block: B:103:0x023d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0240  */
    /* JADX WARN: Code duplicated, block: B:107:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x024a  */
    /* JADX WARN: Code duplicated, block: B:109:0x024d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0252  */
    /* JADX WARN: Code duplicated, block: B:115:0x025b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0267  */
    /* JADX WARN: Code duplicated, block: B:118:0x0269  */
    /* JADX WARN: Code duplicated, block: B:120:0x026c  */
    /* JADX WARN: Code duplicated, block: B:126:0x027d  */
    /* JADX WARN: Code duplicated, block: B:128:0x028e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0298  */
    /* JADX WARN: Code duplicated, block: B:131:0x029b  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02de  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:169:0x033c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0358  */
    /* JADX WARN: Code duplicated, block: B:178:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b A[LOOP:0: B:57:0x0132->B:63:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:81:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x0198  */
    /* JADX WARN: Code duplicated, block: B:85:0x019d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:93:0x0208  */
    /* JADX WARN: Code duplicated, block: B:96:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x022e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01c9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        boolean zB;
        boolean zC;
        MotionEvent motionEventObtain;
        int actionMasked;
        int actionIndex;
        int[] iArr;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        e0 e0Var2;
        boolean zB2;
        boolean zC2;
        float f12;
        float f13;
        boolean z10;
        int i14;
        int iFindPointerIndex;
        int x10;
        int y10;
        int i15;
        int i16;
        boolean zF;
        int[] iArr2;
        int i17;
        int i18;
        m mVar;
        boolean z11;
        int iAbs;
        int i19;
        int iAbs2;
        int i20;
        ArrayList arrayList;
        int size;
        int i21;
        j jVar;
        if (this.f2273y || this.f2274z) {
            return false;
        }
        int action = motionEvent.getAction();
        j jVar2 = this.f2267s;
        if (jVar2 == null) {
            if (action != 0) {
                arrayList = this.f2266r;
                size = arrayList.size();
                for (i21 = 0; i21 < size; i21++) {
                    jVar = (j) ((h0) arrayList.get(i21));
                    if (jVar.c(motionEvent)) {
                        this.f2267s = jVar;
                    }
                }
            }
            e0Var = this.f2264p;
            if (e0Var == null) {
                return false;
            }
            zB = e0Var.b();
            zC = this.f2264p.c();
            if (this.O == null) {
                this.O = VelocityTracker.obtain();
            }
            motionEventObtain = MotionEvent.obtain(motionEvent);
            actionMasked = motionEvent.getActionMasked();
            actionIndex = motionEvent.getActionIndex();
            iArr = this.f2259m0;
            if (actionMasked == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            motionEventObtain.offsetLocation(iArr[0], iArr[1]);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    this.O.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker = this.O;
                    i11 = this.V;
                    velocityTracker.computeCurrentVelocity(1000, i11);
                    if (zB) {
                        f10 = -this.O.getXVelocity(this.N);
                    } else {
                        f10 = 0.0f;
                    }
                    if (zC) {
                        f11 = -this.O.getYVelocity(this.N);
                    } else {
                        f11 = 0.0f;
                    }
                    if (f10 == 0.0f || f11 != 0.0f) {
                        i12 = (int) f10;
                        i13 = (int) f11;
                        e0Var2 = this.f2264p;
                        if (e0Var2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2273y) {
                            zB2 = e0Var2.b();
                            zC2 = this.f2264p.c();
                            int i22 = this.U;
                            if (zB2 || Math.abs(i12) < i22) {
                                i12 = 0;
                            }
                            if (zC2 || Math.abs(i13) < i22) {
                                i13 = 0;
                            }
                            if (i12 == 0 || i13 != 0) {
                                f12 = i12;
                                f13 = i13;
                                if (!dispatchNestedPreFling(f12, f13)) {
                                    if (!zB2 || zC2) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    dispatchNestedFling(f12, f13, z10);
                                    i14 = zB2;
                                    if (z10) {
                                        if (zC2) {
                                            i14 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().e(i14, 1);
                                        int i23 = -i11;
                                        int iMax = Math.max(i23, Math.min(i12, i11));
                                        int iMax2 = Math.max(i23, Math.min(i13, i11));
                                        q0 q0Var = this.f2247c0;
                                        q0Var.f1182n.setScrollState(2);
                                        q0Var.f1177b = 0;
                                        q0Var.f1176a = 0;
                                        q0Var.f1178c.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        q0Var.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    } else {
                        setScrollState(0);
                    }
                    r();
                } else if (actionMasked != 2) {
                    iFindPointerIndex = motionEvent.findPointerIndex(this.N);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    i15 = this.R - x10;
                    i16 = this.S - y10;
                    zF = f(i15, i16, 0, this.f2258l0, this.f2257k0);
                    iArr2 = this.f2257k0;
                    if (zF) {
                        int[] iArr3 = this.f2258l0;
                        i15 -= iArr3[0];
                        i16 -= iArr3[1];
                        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                        iArr[0] = iArr[0] + iArr2[0];
                        iArr[1] = iArr[1] + iArr2[1];
                    }
                    if (this.M != 1) {
                        if (zB) {
                            iAbs2 = Math.abs(i15);
                            i20 = this.T;
                            if (iAbs2 > i20) {
                                if (i15 > 0) {
                                    i15 -= i20;
                                } else {
                                    i15 += i20;
                                }
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                        if (zC) {
                            iAbs = Math.abs(i16);
                            i19 = this.T;
                            if (iAbs > i19) {
                                if (i16 > 0) {
                                    i16 -= i19;
                                } else {
                                    i16 += i19;
                                }
                                z11 = true;
                            }
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                    i17 = i16;
                    if (this.M == 1) {
                        this.R = x10 - iArr2[0];
                        this.S = y10 - iArr2[1];
                        if (zB) {
                            i18 = i15;
                        } else {
                            i18 = 0;
                        }
                        s(i18, zC ? i17 : 0, motionEventObtain);
                        mVar = this.f2249d0;
                        if (mVar != null && (i15 != 0 || i17 != 0)) {
                            mVar.a(this, i15, i17);
                        }
                    }
                } else if (actionMasked != 3) {
                    r();
                    setScrollState(0);
                } else if (actionMasked != 5) {
                    this.N = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.R = x11;
                    this.P = x11;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.S = y11;
                    this.Q = y11;
                } else if (actionMasked == 6) {
                    p(motionEvent);
                }
                motionEventObtain.recycle();
                return true;
            }
            this.N = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.R = x12;
            this.P = x12;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.S = y12;
            this.Q = y12;
            if (zC) {
                i10 = zB;
                i10 = (zB ? 1 : 0) | 2;
            }
            i10 = zB;
            getScrollingChildHelper().e(i10, 0);
            this.O.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return true;
        }
        if (action == 0) {
            this.f2267s = null;
            if (action != 0) {
                arrayList = this.f2266r;
                size = arrayList.size();
                while (i21 < size) {
                    jVar = (j) ((h0) arrayList.get(i21));
                    if (jVar.c(motionEvent)) {
                        this.f2267s = jVar;
                    }
                }
            }
            e0Var = this.f2264p;
            if (e0Var == null) {
                return false;
            }
            zB = e0Var.b();
            zC = this.f2264p.c();
            if (this.O == null) {
                this.O = VelocityTracker.obtain();
            }
            motionEventObtain = MotionEvent.obtain(motionEvent);
            actionMasked = motionEvent.getActionMasked();
            actionIndex = motionEvent.getActionIndex();
            iArr = this.f2259m0;
            if (actionMasked == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            motionEventObtain.offsetLocation(iArr[0], iArr[1]);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    this.O.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker2 = this.O;
                    i11 = this.V;
                    velocityTracker2.computeCurrentVelocity(1000, i11);
                    if (zB) {
                        f10 = -this.O.getXVelocity(this.N);
                    } else {
                        f10 = 0.0f;
                    }
                    if (zC) {
                        f11 = -this.O.getYVelocity(this.N);
                    } else {
                        f11 = 0.0f;
                    }
                    if (f10 == 0.0f) {
                        i12 = (int) f10;
                        i13 = (int) f11;
                        e0Var2 = this.f2264p;
                        if (e0Var2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2273y) {
                            zB2 = e0Var2.b();
                            zC2 = this.f2264p.c();
                            int i24 = this.U;
                            if (zB2) {
                                i12 = 0;
                            } else {
                                i12 = 0;
                            }
                            if (zC2) {
                                i13 = 0;
                            } else {
                                i13 = 0;
                            }
                            if (i12 == 0) {
                                f12 = i12;
                                f13 = i13;
                                if (!dispatchNestedPreFling(f12, f13)) {
                                    if (zB2) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    dispatchNestedFling(f12, f13, z10);
                                    i14 = zB2;
                                    if (z10) {
                                        if (zC2) {
                                            i14 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().e(i14, 1);
                                        int i25 = -i11;
                                        int iMax3 = Math.max(i25, Math.min(i12, i11));
                                        int iMax4 = Math.max(i25, Math.min(i13, i11));
                                        q0 q0Var2 = this.f2247c0;
                                        q0Var2.f1182n.setScrollState(2);
                                        q0Var2.f1177b = 0;
                                        q0Var2.f1176a = 0;
                                        q0Var2.f1178c.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        q0Var2.a();
                                    }
                                }
                            } else {
                                f12 = i12;
                                f13 = i13;
                                if (!dispatchNestedPreFling(f12, f13)) {
                                    if (zB2) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    dispatchNestedFling(f12, f13, z10);
                                    i14 = zB2;
                                    if (z10) {
                                        if (zC2) {
                                            i14 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().e(i14, 1);
                                        int i26 = -i11;
                                        int iMax5 = Math.max(i26, Math.min(i12, i11));
                                        int iMax6 = Math.max(i26, Math.min(i13, i11));
                                        q0 q0Var3 = this.f2247c0;
                                        q0Var3.f1182n.setScrollState(2);
                                        q0Var3.f1177b = 0;
                                        q0Var3.f1176a = 0;
                                        q0Var3.f1178c.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        q0Var3.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    } else {
                        i12 = (int) f10;
                        i13 = (int) f11;
                        e0Var2 = this.f2264p;
                        if (e0Var2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2273y) {
                            zB2 = e0Var2.b();
                            zC2 = this.f2264p.c();
                            int i27 = this.U;
                            if (zB2) {
                                i12 = 0;
                            } else {
                                i12 = 0;
                            }
                            if (zC2) {
                                i13 = 0;
                            } else {
                                i13 = 0;
                            }
                            if (i12 == 0) {
                                f12 = i12;
                                f13 = i13;
                                if (!dispatchNestedPreFling(f12, f13)) {
                                    if (zB2) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    dispatchNestedFling(f12, f13, z10);
                                    i14 = zB2;
                                    if (z10) {
                                        if (zC2) {
                                            i14 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().e(i14, 1);
                                        int i28 = -i11;
                                        int iMax7 = Math.max(i28, Math.min(i12, i11));
                                        int iMax8 = Math.max(i28, Math.min(i13, i11));
                                        q0 q0Var4 = this.f2247c0;
                                        q0Var4.f1182n.setScrollState(2);
                                        q0Var4.f1177b = 0;
                                        q0Var4.f1176a = 0;
                                        q0Var4.f1178c.fling(0, 0, iMax7, iMax8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        q0Var4.a();
                                    }
                                }
                            } else {
                                f12 = i12;
                                f13 = i13;
                                if (!dispatchNestedPreFling(f12, f13)) {
                                    if (zB2) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    dispatchNestedFling(f12, f13, z10);
                                    i14 = zB2;
                                    if (z10) {
                                        if (zC2) {
                                            i14 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().e(i14, 1);
                                        int i29 = -i11;
                                        int iMax9 = Math.max(i29, Math.min(i12, i11));
                                        int iMax10 = Math.max(i29, Math.min(i13, i11));
                                        q0 q0Var5 = this.f2247c0;
                                        q0Var5.f1182n.setScrollState(2);
                                        q0Var5.f1177b = 0;
                                        q0Var5.f1176a = 0;
                                        q0Var5.f1178c.fling(0, 0, iMax9, iMax10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        q0Var5.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    }
                    r();
                } else if (actionMasked != 2) {
                    iFindPointerIndex = motionEvent.findPointerIndex(this.N);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    i15 = this.R - x10;
                    i16 = this.S - y10;
                    zF = f(i15, i16, 0, this.f2258l0, this.f2257k0);
                    iArr2 = this.f2257k0;
                    if (zF) {
                        int[] iArr4 = this.f2258l0;
                        i15 -= iArr4[0];
                        i16 -= iArr4[1];
                        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                        iArr[0] = iArr[0] + iArr2[0];
                        iArr[1] = iArr[1] + iArr2[1];
                    }
                    if (this.M != 1) {
                        if (zB) {
                            iAbs2 = Math.abs(i15);
                            i20 = this.T;
                            if (iAbs2 > i20) {
                                if (i15 > 0) {
                                    i15 -= i20;
                                } else {
                                    i15 += i20;
                                }
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                        if (zC) {
                            iAbs = Math.abs(i16);
                            i19 = this.T;
                            if (iAbs > i19) {
                                if (i16 > 0) {
                                    i16 -= i19;
                                } else {
                                    i16 += i19;
                                }
                                z11 = true;
                            }
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                    i17 = i16;
                    if (this.M == 1) {
                        this.R = x10 - iArr2[0];
                        this.S = y10 - iArr2[1];
                        if (zB) {
                            i18 = i15;
                        } else {
                            i18 = 0;
                        }
                        s(i18, zC ? i17 : 0, motionEventObtain);
                        mVar = this.f2249d0;
                        if (mVar != null) {
                            mVar.a(this, i15, i17);
                        }
                    }
                } else if (actionMasked != 3) {
                    r();
                    setScrollState(0);
                } else if (actionMasked != 5) {
                    this.N = motionEvent.getPointerId(actionIndex);
                    int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.R = x13;
                    this.P = x13;
                    int y13 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.S = y13;
                    this.Q = y13;
                } else if (actionMasked == 6) {
                    p(motionEvent);
                }
                motionEventObtain.recycle();
                return true;
            }
            this.N = motionEvent.getPointerId(0);
            int x14 = (int) (motionEvent.getX() + 0.5f);
            this.R = x14;
            this.P = x14;
            int y14 = (int) (motionEvent.getY() + 0.5f);
            this.S = y14;
            this.Q = y14;
            if (zC) {
                i10 = zB;
                i10 = (zB ? 1 : 0) | 2;
            }
            i10 = zB;
            getScrollingChildHelper().e(i10, 0);
            this.O.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return true;
        }
        if (jVar2.f1132q != 0) {
            if (motionEvent.getAction() == 0) {
                boolean zB3 = jVar2.b(motionEvent.getX(), motionEvent.getY());
                boolean zA = jVar2.a(motionEvent.getX(), motionEvent.getY());
                if (zB3 || zA) {
                    if (zA) {
                        jVar2.f1133r = 1;
                        jVar2.f1126k = (int) motionEvent.getX();
                    } else if (zB3) {
                        jVar2.f1133r = 2;
                        jVar2.f1125j = (int) motionEvent.getY();
                    }
                    jVar2.e(2);
                }
            } else if (motionEvent.getAction() == 1 && jVar2.f1132q == 2) {
                jVar2.f1125j = 0.0f;
                jVar2.f1126k = 0.0f;
                jVar2.e(1);
                jVar2.f1133r = 0;
            } else if (motionEvent.getAction() == 2 && jVar2.f1132q == 2) {
                jVar2.f();
                int i30 = jVar2.f1133r;
                int i31 = jVar2.f1116a;
                if (i30 == 1) {
                    float x15 = motionEvent.getX();
                    int[] iArr5 = jVar2.f1135t;
                    iArr5[0] = i31;
                    int i32 = jVar2.f1127l - i31;
                    iArr5[1] = i32;
                    float fMax = Math.max(i31, Math.min(i32, x15));
                    jVar2.getClass();
                    if (Math.abs(0 - fMax) >= 2.0f) {
                        int iD = j.d(jVar2.f1126k, fMax, iArr5, jVar2.f1129n.computeHorizontalScrollRange(), jVar2.f1129n.computeHorizontalScrollOffset(), jVar2.f1127l);
                        if (iD != 0) {
                            jVar2.f1129n.scrollBy(iD, 0);
                        }
                        jVar2.f1126k = fMax;
                    }
                }
                if (jVar2.f1133r == 2) {
                    float y15 = motionEvent.getY();
                    int[] iArr6 = jVar2.f1134s;
                    iArr6[0] = i31;
                    int i33 = jVar2.f1128m - i31;
                    iArr6[1] = i33;
                    float fMax2 = Math.max(i31, Math.min(i33, y15));
                    jVar2.getClass();
                    if (Math.abs(0 - fMax2) >= 2.0f) {
                        int iD2 = j.d(jVar2.f1125j, fMax2, iArr6, jVar2.f1129n.computeVerticalScrollRange(), jVar2.f1129n.computeVerticalScrollOffset(), jVar2.f1128m);
                        if (iD2 != 0) {
                            jVar2.f1129n.scrollBy(0, iD2);
                        }
                        jVar2.f1125j = fMax2;
                    }
                }
            }
        }
        if (action == 3 || action == 1) {
            this.f2267s = null;
        }
        r();
        setScrollState(0);
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.N = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.R = x10;
            this.P = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.S = y10;
            this.Q = y10;
        }
    }

    public final void q(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2260n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof f0) {
            f0 f0Var = (f0) layoutParams;
            if (!f0Var.f1109b) {
                int i10 = rect.left;
                Rect rect2 = f0Var.f1108a;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2264p.H(this, view, this.f2260n, !this.f2270v, view2 == null);
    }

    public final void r() {
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        w(0);
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        if (zIsFinished) {
            Field field = b3.q0.f2670a;
            b0.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f2264p.getClass();
        if (this.E <= 0 && view2 != null) {
            q(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2264p.H(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.f2266r;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h0) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2271w != 0 || this.f2273y) {
            this.f2272x = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:45:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x017a  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cc  */
    public final void s(int i10, int i11, MotionEvent motionEvent) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        d();
        if (!this.f2265q.isEmpty()) {
            invalidate();
        }
        boolean z10 = false;
        int[] iArr = this.f2257k0;
        if (g(0, iArr)) {
            int i12 = this.R;
            int i13 = iArr[0];
            this.R = i12 - i13;
            int i14 = this.S;
            int i15 = iArr[1];
            this.S = i14 - i15;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i13, i15);
            }
            int[] iArr2 = this.f2259m0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f10 = 0;
                float y10 = motionEvent.getY();
                if (f10 < 0.0f) {
                    if (this.H == null) {
                        this.G.getClass();
                        EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                        this.H = edgeEffect3;
                        if (this.f2252f) {
                            edgeEffect3.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect3.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    e3.b.a(this.H, (-f10) / getWidth(), 1.0f - (y10 / getHeight()));
                } else if (f10 <= 0.0f) {
                    if (f10 < 0.0f) {
                        if (this.I == null) {
                            this.G.getClass();
                            edgeEffect2 = new EdgeEffect(getContext());
                            this.I = edgeEffect2;
                            if (this.f2252f) {
                                edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        e3.b.a(this.I, (-f10) / getHeight(), x10 / getWidth());
                    } else if (f10 > 0.0f) {
                        if (this.K == null) {
                            this.G.getClass();
                            edgeEffect = new EdgeEffect(getContext());
                            this.K = edgeEffect;
                            if (this.f2252f) {
                                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        e3.b.a(this.K, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                    } else if (!z10 || f10 != 0.0f || f10 != 0.0f) {
                    }
                    Field field = b3.q0.f2670a;
                    b0.k(this);
                } else {
                    if (this.J == null) {
                        this.G.getClass();
                        EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                        this.J = edgeEffect4;
                        if (this.f2252f) {
                            edgeEffect4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect4.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    e3.b.a(this.J, f10 / getWidth(), y10 / getHeight());
                }
                z10 = true;
                if (f10 < 0.0f) {
                    if (this.I == null) {
                        this.G.getClass();
                        edgeEffect2 = new EdgeEffect(getContext());
                        this.I = edgeEffect2;
                        if (this.f2252f) {
                            edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    e3.b.a(this.I, (-f10) / getHeight(), x10 / getWidth());
                } else if (f10 > 0.0f) {
                    if (this.K == null) {
                        this.G.getClass();
                        edgeEffect = new EdgeEffect(getContext());
                        this.K = edgeEffect;
                        if (this.f2252f) {
                            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    e3.b.a(this.K, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                } else if (!z10) {
                }
                Field field2 = b3.q0.f2670a;
                b0.k(this);
            }
            c(i10, i11);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        e0 e0Var = this.f2264p;
        if (e0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2273y) {
            return;
        }
        boolean zB = e0Var.b();
        boolean zC = this.f2264p.c();
        if (zB || zC) {
            if (!zB) {
                i10 = 0;
            }
            if (!zC) {
                i11 = 0;
            }
            s(i10, i11, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.E <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iA = accessibilityEvent != null ? c3.b.a(accessibilityEvent) : 0;
            this.A |= iA != 0 ? iA : 0;
        }
    }

    public void setAccessibilityDelegateCompat(s0 s0Var) {
        this.i0 = s0Var;
        b3.q0.d(this, s0Var);
    }

    public void setAdapter(x xVar) {
        setLayoutFrozen(false);
        a0 a0Var = this.L;
        if (a0Var != null) {
            a0Var.a();
        }
        e0 e0Var = this.f2264p;
        l0 l0Var = this.f2242a;
        if (e0Var != null) {
            e0Var.F();
            this.f2264p.G(l0Var);
        }
        l0Var.f1150a.clear();
        ArrayList arrayList = l0Var.f1151b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            a7.a.w(arrayList.get(size));
            throw null;
        }
        arrayList.clear();
        k kVar = l0Var.f1156g.f2251e0;
        int[] iArr = kVar.f1142d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        kVar.f1141c = 0;
        b bVar = this.f2246c;
        bVar.c(bVar.f1074b);
        bVar.c(bVar.f1075c);
        l0Var.f1150a.clear();
        ArrayList arrayList2 = l0Var.f1151b;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            a7.a.w(arrayList2.get(size2));
            throw null;
        }
        arrayList2.clear();
        RecyclerView recyclerView = l0Var.f1156g;
        k kVar2 = recyclerView.f2251e0;
        int[] iArr2 = kVar2.f1142d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        kVar2.f1141c = 0;
        if (l0Var.f1155f == null) {
            k0 k0Var = new k0();
            k0Var.f1143a = new SparseArray();
            k0Var.f1144b = 0;
            l0Var.f1155f = k0Var;
        }
        k0 k0Var2 = l0Var.f1155f;
        if (k0Var2.f1144b == 0) {
            SparseArray sparseArray = k0Var2.f1143a;
            if (sparseArray.size() > 0) {
                ((a4.j0) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f2253f0.f1168c = true;
        this.D = this.D;
        this.C = true;
        int iE = this.f2248d.e();
        for (int i10 = 0; i10 < iE; i10++) {
            j(this.f2248d.d(i10));
        }
        m();
        int size3 = arrayList2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            a7.a.w(arrayList2.get(i11));
        }
        recyclerView.getClass();
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            a7.a.w(arrayList2.get(size4));
            throw null;
        }
        arrayList2.clear();
        k kVar3 = recyclerView.f2251e0;
        int[] iArr3 = kVar3.f1142d;
        if (iArr3 != null) {
            Arrays.fill(iArr3, -1);
        }
        kVar3.f1141c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(y yVar) {
        if (yVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2252f) {
            this.K = null;
            this.I = null;
            this.J = null;
            this.H = null;
        }
        this.f2252f = z10;
        super.setClipToPadding(z10);
        if (this.f2270v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(z zVar) {
        zVar.getClass();
        this.G = zVar;
        this.K = null;
        this.I = null;
        this.J = null;
        this.H = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f2269u = z10;
    }

    public void setItemAnimator(a0 a0Var) {
        a0 a0Var2 = this.L;
        if (a0Var2 != null) {
            a0Var2.a();
            this.L.f1066a = null;
        }
        this.L = a0Var;
        if (a0Var != null) {
            a0Var.f1066a = this.f2255h0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        l0 l0Var = this.f2242a;
        l0Var.f1153d = i10;
        l0Var.c();
    }

    public void setLayoutFrozen(boolean z10) {
        if (z10 != this.f2273y) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z10) {
                this.f2273y = false;
                this.f2272x = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2273y = true;
            this.f2274z = true;
            setScrollState(0);
            q0 q0Var = this.f2247c0;
            q0Var.f1182n.removeCallbacks(q0Var);
            q0Var.f1178c.abortAnimation();
        }
    }

    public void setLayoutManager(e0 e0Var) {
        w wVar;
        if (e0Var == this.f2264p) {
            return;
        }
        setScrollState(0);
        q0 q0Var = this.f2247c0;
        q0Var.f1182n.removeCallbacks(q0Var);
        q0Var.f1178c.abortAnimation();
        e0 e0Var2 = this.f2264p;
        l0 l0Var = this.f2242a;
        if (e0Var2 != null) {
            a0 a0Var = this.L;
            if (a0Var != null) {
                a0Var.a();
            }
            this.f2264p.F();
            this.f2264p.G(l0Var);
            l0Var.f1150a.clear();
            ArrayList arrayList = l0Var.f1151b;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                a7.a.w(arrayList.get(size));
                throw null;
            }
            arrayList.clear();
            k kVar = l0Var.f1156g.f2251e0;
            int[] iArr = kVar.f1142d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            kVar.f1141c = 0;
            if (this.f2268t) {
                e0 e0Var3 = this.f2264p;
                e0Var3.f1103e = false;
                e0Var3.A(this);
            }
            this.f2264p.J(null);
            this.f2264p = null;
        } else {
            l0Var.f1150a.clear();
            ArrayList arrayList2 = l0Var.f1151b;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                a7.a.w(arrayList2.get(size2));
                throw null;
            }
            arrayList2.clear();
            k kVar2 = l0Var.f1156g.f2251e0;
            int[] iArr2 = kVar2.f1142d;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            kVar2.f1141c = 0;
        }
        c cVar = this.f2248d;
        cVar.f1077b.d();
        ArrayList arrayList3 = cVar.f1078c;
        int size3 = arrayList3.size() - 1;
        while (true) {
            wVar = cVar.f1076a;
            if (size3 < 0) {
                break;
            }
            View view = (View) arrayList3.get(size3);
            wVar.getClass();
            j(view);
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = wVar.f1205a;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2264p = e0Var;
        if (e0Var != null) {
            if (e0Var.f1100b != null) {
                throw new IllegalArgumentException("LayoutManager " + e0Var + " is already attached to a RecyclerView:" + e0Var.f1100b.h());
            }
            e0Var.J(this);
            if (this.f2268t) {
                this.f2264p.f1103e = true;
            }
        }
        l0Var.c();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2661d) {
            Field field = b3.q0.f2670a;
            b3.h0.z(scrollingChildHelper.f2660c);
        }
        scrollingChildHelper.f2661d = z10;
    }

    public void setOnFlingListener(g0 g0Var) {
    }

    @Deprecated
    public void setOnScrollListener(i0 i0Var) {
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2245b0 = z10;
    }

    public void setRecycledViewPool(k0 k0Var) {
        l0 l0Var = this.f2242a;
        k0 k0Var2 = l0Var.f1155f;
        if (k0Var2 != null) {
            k0Var2.f1144b--;
        }
        l0Var.f1155f = k0Var;
        if (k0Var != null) {
            l0Var.f1156g.getAdapter();
        }
    }

    public void setRecyclerListener(m0 m0Var) {
    }

    public void setScrollState(int i10) {
        if (i10 == this.M) {
            return;
        }
        this.M = i10;
        if (i10 != 2) {
            q0 q0Var = this.f2247c0;
            q0Var.f1182n.removeCallbacks(q0Var);
            q0Var.f1178c.abortAnimation();
        }
        e0 e0Var = this.f2264p;
        if (e0Var != null) {
            e0Var.E(i10);
        }
        ArrayList arrayList = this.f2254g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((i0) this.f2254g0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.T = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.T = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(p0 p0Var) {
        this.f2242a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().e(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().f(0);
    }

    public final void t(int i10, int i11) {
        int iRound;
        e0 e0Var = this.f2264p;
        if (e0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2273y) {
            return;
        }
        int i12 = !e0Var.b() ? 0 : i10;
        int i13 = !this.f2264p.c() ? 0 : i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        q0 q0Var = this.f2247c0;
        q0Var.getClass();
        int iAbs = Math.abs(i12);
        int iAbs2 = Math.abs(i13);
        boolean z10 = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt(0);
        int iSqrt2 = (int) Math.sqrt((i13 * i13) + (i12 * i12));
        RecyclerView recyclerView = q0Var.f1182n;
        int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i14 = width / 2;
        float f10 = width;
        float f11 = i14;
        float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z10) {
                iAbs = iAbs2;
            }
            iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
        }
        int iMin = Math.min(iRound, 2000);
        v vVar = f2241s0;
        if (q0Var.f1179d != vVar) {
            q0Var.f1179d = vVar;
            q0Var.f1178c = new OverScroller(recyclerView.getContext(), vVar);
        }
        recyclerView.setScrollState(2);
        q0Var.f1177b = 0;
        q0Var.f1176a = 0;
        q0Var.f1178c.startScroll(0, 0, i12, i13, iMin);
        q0Var.a();
    }

    public final void u() {
        int i10 = this.f2271w + 1;
        this.f2271w = i10;
        if (i10 != 1 || this.f2273y) {
            return;
        }
        this.f2272x = false;
    }

    public final void v(boolean z10) {
        if (this.f2271w < 1) {
            this.f2271w = 1;
        }
        if (!z10 && !this.f2273y) {
            this.f2272x = false;
        }
        int i10 = this.f2271w;
        if (i10 == 1) {
            if (z10) {
                boolean z11 = this.f2272x;
            }
            if (!this.f2273y) {
                this.f2272x = false;
            }
        }
        this.f2271w = i10 - 1;
    }

    public final void w(int i10) {
        getScrollingChildHelper().f(i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e0 e0Var = this.f2264p;
        if (e0Var != null) {
            return e0Var.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }
}
