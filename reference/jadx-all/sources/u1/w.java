package u1;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class w extends ViewGroup implements t1.l1, t1.q1, o1.b0, androidx.lifecycle.g {
    public static Class C0;
    public static Method D0;
    public c9.c A;
    public boolean A0;
    public final z0.a B;
    public final t B0;
    public boolean C;
    public final l D;
    public final k E;
    public final t1.n1 F;
    public boolean G;
    public j1 H;
    public z1 I;
    public m2.a J;
    public boolean K;
    public final t1.t0 L;
    public final i1 M;
    public long N;
    public final int[] O;
    public final float[] P;
    public final float[] Q;
    public final float[] R;
    public long S;
    public boolean T;
    public long U;
    public boolean V;
    public final m0.n1 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.j f15315a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final m0.j0 f15316a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15317b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public c9.c f15318b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15319c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final m f15320c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t1.i0 f15321d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final n f15322d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m2.d f15323e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final o f15324e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c1.f f15325f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final g2.e0 f15326f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final g2.b0 f15327g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final AtomicReference f15328h0;
    public final u1 i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final c2 f15329j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final m0.n1 f15330k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f15331l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final m0.n1 f15332m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y1 f15333n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final k1.c f15334n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h3 f15335o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final l1.c f15336o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k.f f15337p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final s1.e f15338p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.compose.ui.node.a f15339q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final a1 f15340q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f15341r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MotionEvent f15342r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y1.p f15343s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f15344s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0 f15345t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final f3 f15346t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0.f f15347u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final o0.i f15348u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f15349v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final h.a f15350v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f15351w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final androidx.activity.d f15352w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15353x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f15354x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o1.g f15355y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final u f15356y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o1.y f15357z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final l1 f15358z0;

    /* JADX WARN: Type inference failed for: r9v3, types: [u1.m] */
    /* JADX WARN: Type inference failed for: r9v4, types: [u1.n] */
    /* JADX WARN: Type inference failed for: r9v5, types: [u1.o] */
    public w(Context context, u8.j jVar) {
        super(context);
        this.f15315a = jVar;
        this.f15317b = d1.c.f4328d;
        int i10 = 1;
        this.f15319c = true;
        this.f15321d = new t1.i0();
        this.f15323e = o1.s.c(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.f1760b;
        this.f15325f = new c1.f(new r(this, i10));
        y1 y1Var = new y1();
        this.f15333n = y1Var;
        this.f15335o = new h3();
        y0.o oVarC = androidx.compose.ui.input.key.a.c(new r(this, 2));
        y0.o oVarA = androidx.compose.ui.input.rotary.a.a();
        this.f15337p = new k.f(6);
        int i11 = 0;
        int i12 = 3;
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(false, 3);
        aVar.W(r1.c1.f13351b);
        aVar.U(getDensity());
        aVar.X(emptySemanticsElement.j(oVarA).j(((c1.f) getFocusOwner()).f2884d).j(oVarC).j(y1Var.f15384c));
        this.f15339q = aVar;
        this.f15341r = this;
        this.f15343s = new y1.p(getRoot());
        p0 p0Var = new p0(this);
        this.f15345t = p0Var;
        this.f15347u = new z0.f();
        this.f15349v = new ArrayList();
        this.f15355y = new o1.g();
        this.f15357z = new o1.y(getRoot());
        this.A = s.f15261b;
        this.B = new z0.a(this, getAutofillTree());
        this.D = new l(context);
        this.E = new k(context);
        this.F = new t1.n1(new r(this, i12));
        this.L = new t1.t0(getRoot());
        this.M = new i1(ViewConfiguration.get(context));
        this.N = i1.b.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.O = new int[]{0, 0};
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.P = fArr;
        this.Q = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.R = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.S = -1L;
        this.U = d1.c.f4327c;
        this.V = true;
        m0.o3 o3Var = m0.o3.f11621a;
        this.W = d7.t.g0(null, o3Var);
        this.f15316a0 = d7.t.R(new u(this, i10));
        this.f15320c0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u1.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f15160a.D();
            }
        };
        this.f15322d0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: u1.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f15167a.D();
            }
        };
        this.f15324e0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: u1.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                l1.c cVar = this.f15172a.f15336o0;
                int i13 = z10 ? 1 : 2;
                cVar.getClass();
                cVar.f11193a.setValue(new l1.a(i13));
            }
        };
        g2.e0 e0Var = new g2.e0(getView(), this);
        this.f15326f0 = e0Var;
        this.f15327g0 = new g2.b0((g2.v) s.f15266n.invoke(e0Var));
        this.f15328h0 = new AtomicReference(null);
        this.i0 = new u1(getTextInputService());
        this.f15329j0 = new c2();
        this.f15330k0 = d7.t.g0(i1.b.l(context), m0.h2.f11553a);
        Configuration configuration = context.getResources().getConfiguration();
        int i13 = Build.VERSION.SDK_INT;
        this.f15331l0 = i13 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        m2.l lVar = m2.l.f11815a;
        if (layoutDirection != 0 && layoutDirection == 1) {
            lVar = m2.l.f11816b;
        }
        this.f15332m0 = d7.t.g0(lVar, o3Var);
        this.f15334n0 = new k1.c(this);
        this.f15336o0 = new l1.c(isInTouchMode() ? 1 : 2);
        this.f15338p0 = new s1.e(this);
        this.f15340q0 = new a1(this);
        this.f15346t0 = new f3();
        this.f15348u0 = new o0.i(new c9.a[16]);
        this.f15350v0 = new h.a(this, i12);
        this.f15352w0 = new androidx.activity.d(this, 5);
        this.f15356y0 = new u(this, i11);
        this.f15358z0 = i13 >= 29 ? new o1() : new m1(fArr);
        setWillNotDraw(false);
        setFocusable(true);
        v0.f15311a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        b3.q0.d(this, p0Var);
        setOnDragListener(y1Var);
        getRoot().d(this);
        if (i13 >= 29) {
            s0.f15270a.a(this);
        }
        this.B0 = new t(this);
    }

    public static void g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof w) {
                ((w) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                g((ViewGroup) childAt);
            }
        }
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q get_viewTreeOwners() {
        return (q) this.W.getValue();
    }

    public static long h(int i10) {
        long j10;
        long j11;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                j10 = ((long) 0) << 32;
                size = Integer.MAX_VALUE;
            } else {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j11 = size;
                j10 = j11 << 32;
            }
            return j10 | j11;
        }
        j10 = ((long) 0) << 32;
        j11 = size;
        return j10 | j11;
    }

    public static View i(View view, int i10) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (d7.a.d(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewI = i(viewGroup.getChildAt(i11), i10);
            if (viewI != null) {
                return viewI;
            }
        }
        return null;
    }

    public static void l(androidx.compose.ui.node.a aVar) {
        aVar.y();
        o0.i iVarT = aVar.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                l((androidx.compose.ui.node.a) objArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    public static boolean n(MotionEvent motionEvent) {
        boolean z10;
        float x10 = motionEvent.getX();
        if (Float.isInfinite(x10) || Float.isNaN(x10)) {
            z10 = true;
        } else {
            float y10 = motionEvent.getY();
            if (Float.isInfinite(y10) || Float.isNaN(y10)) {
                z10 = true;
            } else {
                float rawX = motionEvent.getRawX();
                if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
                    z10 = true;
                } else {
                    float rawY = motionEvent.getRawY();
                    if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                float x11 = motionEvent.getX(i10);
                if (Float.isInfinite(x11) || Float.isNaN(x11)) {
                    z10 = true;
                } else {
                    float y11 = motionEvent.getY(i10);
                    if (Float.isInfinite(y11) || Float.isNaN(y11) || (Build.VERSION.SDK_INT >= 29 && !i2.f15116a.a(motionEvent, i10))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private void setFontFamilyResolver(f2.d dVar) {
        this.f15330k0.setValue(dVar);
    }

    private void setLayoutDirection(m2.l lVar) {
        this.f15332m0.setValue(lVar);
    }

    private final void set_viewTreeOwners(q qVar) {
        this.W.setValue(qVar);
    }

    public final long A(long j10) {
        y();
        return e1.a0.a(this.R, d9.i.f(d1.c.d(j10) - d1.c.d(this.U), d1.c.e(j10) - d1.c.e(this.U)));
    }

    public final int B(MotionEvent motionEvent) {
        Object obj;
        int iA = 0;
        if (this.A0) {
            this.A0 = false;
            int metaState = motionEvent.getMetaState();
            this.f15335o.getClass();
            h3.f15110b.setValue(new o1.a0(metaState));
        }
        o1.g gVar = this.f15355y;
        o1.w wVarA = gVar.a(motionEvent, this);
        o1.y yVar = this.f15357z;
        if (wVarA != null) {
            List list = wVarA.f12430a;
            int size = list.size() - 1;
            if (size < 0) {
                obj = null;
                break;
            }
            while (true) {
                int i10 = size - 1;
                obj = list.get(size);
                if (((o1.x) obj).f12436e) {
                    break;
                }
                if (i10 < 0) {
                    obj = null;
                    break;
                }
                size = i10;
            }
            o1.x xVar = (o1.x) obj;
            if (xVar != null) {
                this.f15317b = xVar.f12435d;
            }
            iA = yVar.a(wVarA, this, o(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (iA & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                gVar.f12367c.delete(pointerId);
                gVar.f12366b.delete(pointerId);
            }
        } else {
            yVar.b();
        }
        return iA;
    }

    public final void C(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jQ = q(d9.i.f(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = d1.c.d(jQ);
            pointerCoords.y = d1.c.e(jQ);
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        o1.w wVarA = this.f15355y.a(motionEventObtain, this);
        d7.a.j(wVarA);
        this.f15357z.a(wVarA, this, true);
        motionEventObtain.recycle();
    }

    public final void D() {
        int[] iArr = this.O;
        getLocationOnScreen(iArr);
        long j10 = this.N;
        int i10 = m2.i.f11808c;
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        boolean z10 = false;
        int i13 = iArr[0];
        if (i11 != i13 || i12 != iArr[1]) {
            this.N = i1.b.c(i13, iArr[1]);
            if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
                getRoot().D.f14508o.s0();
                z10 = true;
            }
        }
        this.L.a(z10);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        z0.a aVar = this.B;
        if (aVar != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                z0.d dVar = z0.d.f17189a;
                if (dVar.d(autofillValue)) {
                    dVar.i(autofillValue).toString();
                    a7.a.w(aVar.f17186b.f17191a.get(Integer.valueOf(iKeyAt)));
                } else {
                    if (dVar.b(autofillValue)) {
                        throw new q8.e("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (dVar.c(autofillValue)) {
                        throw new q8.e("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (dVar.e(autofillValue)) {
                        throw new q8.e("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.g
    public final void b(androidx.lifecycle.w wVar) {
        setShowLayoutBounds(k1.b.a());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f15345t.l(i10, this.f15317b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f15345t.l(i10, this.f15317b, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            l(getRoot());
        }
        r(true);
        k0.y0.g();
        this.f15353x = true;
        k.f fVar = this.f15337p;
        e1.d dVar = (e1.d) fVar.f8599b;
        Canvas canvas2 = dVar.f4994a;
        dVar.f4994a = canvas;
        getRoot().i(dVar);
        ((e1.d) fVar.f8599b).f4994a = canvas2;
        ArrayList arrayList = this.f15349v;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t1.j1) arrayList.get(i10)).h();
            }
        }
        if (b3.A) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f15353x = false;
        ArrayList arrayList2 = this.f15351w;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0190  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:147:0x0202  */
    /* JADX WARN: Code duplicated, block: B:168:0x023f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0246  */
    /* JADX WARN: Code duplicated, block: B:236:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v13, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r14v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r14v11, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        q1.a aVar;
        ?? F;
        ?? iVar;
        ?? F2;
        ?? iVar2;
        int size;
        int i10;
        c9.c cVar;
        c9.c cVar2;
        c9.c cVar3;
        int size2;
        t1.x0 x0Var;
        ?? F3;
        t1.x0 x0Var2;
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f10 = -motionEvent.getAxisValue(26);
            getContext();
            float fB = b3.r0.b(viewConfiguration) * f10;
            getContext();
            q1.c cVar4 = new q1.c(fB, b3.r0.a(viewConfiguration) * f10, motionEvent.getEventTime(), motionEvent.getDeviceId());
            c1.p pVarF = androidx.compose.ui.focus.a.f(((c1.f) getFocusOwner()).f2881a);
            if (pVarF != null) {
                y0.n nVar = pVarF.f16730a;
                if (!nVar.f16742t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                y0.n nVar2 = nVar.f16734e;
                androidx.compose.ui.node.a aVarY = t1.g.y(pVarF);
                loop0: while (true) {
                    if (aVarY == null) {
                        F3 = 0;
                        break;
                    }
                    if ((aVarY.C.f14579e.f16733d & 16384) != 0) {
                        while (nVar2 != null) {
                            if ((nVar2.f16732c & 16384) != 0) {
                                ?? iVar3 = 0;
                                F3 = nVar2;
                                while (F3 != 0) {
                                    if (F3 instanceof q1.a) {
                                        break loop0;
                                    }
                                    if ((F3.f16732c & 16384) != 0 && (F3 instanceof t1.o)) {
                                        y0.n nVar3 = ((t1.o) F3).f14521v;
                                        int i11 = 0;
                                        while (nVar3 != null) {
                                            if ((nVar3.f16732c & 16384) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    F3 = F3;
                                                    iVar3 = iVar3;
                                                    iVar3 = iVar3;
                                                    F3 = nVar3;
                                                } else {
                                                    if (iVar3 == 0) {
                                                        iVar3 = new o0.i(new y0.n[16]);
                                                    }
                                                    if (F3 != 0) {
                                                        iVar3.c(F3);
                                                        F3 = 0;
                                                    }
                                                    iVar3.c(nVar3);
                                                }
                                            } else {
                                                F3 = F3;
                                                iVar3 = iVar3;
                                            }
                                            nVar3 = nVar3.f16735f;
                                            F3 = F3;
                                            iVar3 = iVar3;
                                        }
                                        if (i11 == 1) {
                                            F3 = F3;
                                            iVar3 = iVar3;
                                        } else {
                                            F3 = F3;
                                            iVar3 = iVar3;
                                        }
                                    }
                                    F3 = t1.g.f(iVar3);
                                }
                            }
                            nVar2 = nVar2.f16734e;
                        }
                    }
                    aVarY = aVarY.q();
                    nVar2 = (aVarY == null || (x0Var2 = aVarY.C) == null) ? null : x0Var2.f14578d;
                }
                aVar = (q1.a) F3;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            y0.n nVar4 = (y0.n) aVar;
            y0.n nVar5 = nVar4.f16730a;
            if (!nVar5.f16742t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            y0.n nVar6 = nVar5.f16734e;
            androidx.compose.ui.node.a aVarY2 = t1.g.y(aVar);
            ArrayList arrayList = null;
            while (aVarY2 != null) {
                if ((aVarY2.C.f14579e.f16733d & 16384) != 0) {
                    while (nVar6 != null) {
                        if ((nVar6.f16732c & 16384) != 0) {
                            y0.n nVarF = nVar6;
                            o0.i iVar4 = null;
                            while (nVarF != null) {
                                if (nVarF instanceof q1.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nVarF);
                                } else if ((nVarF.f16732c & 16384) != 0 && (nVarF instanceof t1.o)) {
                                    int i12 = 0;
                                    for (y0.n nVar7 = ((t1.o) nVarF).f14521v; nVar7 != null; nVar7 = nVar7.f16735f) {
                                        if ((nVar7.f16732c & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                nVarF = nVar7;
                                            } else {
                                                if (iVar4 == null) {
                                                    iVar4 = new o0.i(new y0.n[16]);
                                                }
                                                if (nVarF != null) {
                                                    iVar4.c(nVarF);
                                                    nVarF = null;
                                                }
                                                iVar4.c(nVar7);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                nVarF = t1.g.f(iVar4);
                            }
                        }
                        nVar6 = nVar6.f16734e;
                    }
                }
                aVarY2 = aVarY2.q();
                nVar6 = (aVarY2 == null || (x0Var = aVarY2.C) == null) ? null : x0Var.f14578d;
            }
            if (arrayList != null && (size2 = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i13 = size2 - 1;
                    c9.c cVar5 = ((q1.b) ((q1.a) arrayList.get(size2))).f13076v;
                    if (cVar5 == null || !((Boolean) cVar5.invoke(cVar4)).booleanValue()) {
                        if (i13 < 0) {
                            break;
                        }
                        size2 = i13;
                    }
                }
                F = nVar4.f16730a;
                iVar = 0;
                while (F != 0) {
                    if (F instanceof q1.a) {
                        cVar3 = ((q1.b) ((q1.a) F)).f13076v;
                        if (cVar3 != null) {
                        }
                    } else if ((F.f16732c & 16384) == 0) {
                    }
                    F = t1.g.f(iVar);
                }
                F2 = nVar4.f16730a;
                iVar2 = 0;
                while (F2 != 0) {
                    if (F2 instanceof q1.a) {
                        cVar2 = ((q1.b) ((q1.a) F2)).f13075u;
                        if (cVar2 != null) {
                        }
                    } else if ((F2.f16732c & 16384) == 0) {
                    }
                    F2 = t1.g.f(iVar2);
                }
                if (arrayList != null) {
                    return false;
                }
                size = arrayList.size();
                for (i10 = 0; i10 < size; i10++) {
                    cVar = ((q1.b) ((q1.a) arrayList.get(i10))).f13075u;
                    if (cVar != null) {
                    }
                }
                return false;
            }
            F = nVar4.f16730a;
            iVar = 0;
            while (F != 0) {
                if (F instanceof q1.a) {
                    cVar3 = ((q1.b) ((q1.a) F)).f13076v;
                    if (cVar3 != null && ((Boolean) cVar3.invoke(cVar4)).booleanValue()) {
                    }
                } else if ((F.f16732c & 16384) == 0 && (F instanceof t1.o)) {
                    y0.n nVar8 = ((t1.o) F).f14521v;
                    int i14 = 0;
                    while (nVar8 != null) {
                        if ((nVar8.f16732c & 16384) != 0) {
                            i14++;
                            if (i14 == 1) {
                                F = F;
                                iVar = iVar;
                                iVar = iVar;
                                F = nVar8;
                            } else {
                                if (iVar == 0) {
                                    iVar = new o0.i(new y0.n[16]);
                                }
                                if (F != 0) {
                                    iVar.c(F);
                                    F = 0;
                                }
                                iVar.c(nVar8);
                            }
                        } else {
                            F = F;
                            iVar = iVar;
                        }
                        nVar8 = nVar8.f16735f;
                        F = F;
                        iVar = iVar;
                    }
                    if (i14 == 1) {
                        F = F;
                        iVar = iVar;
                    } else {
                        F = F;
                        iVar = iVar;
                    }
                }
                F = t1.g.f(iVar);
            }
            F2 = nVar4.f16730a;
            iVar2 = 0;
            while (F2 != 0) {
                if (F2 instanceof q1.a) {
                    cVar2 = ((q1.b) ((q1.a) F2)).f13075u;
                    if (cVar2 != null && ((Boolean) cVar2.invoke(cVar4)).booleanValue()) {
                    }
                } else if ((F2.f16732c & 16384) == 0 && (F2 instanceof t1.o)) {
                    y0.n nVar9 = ((t1.o) F2).f14521v;
                    int i15 = 0;
                    while (nVar9 != null) {
                        if ((nVar9.f16732c & 16384) != 0) {
                            i15++;
                            if (i15 == 1) {
                                iVar2 = iVar2;
                                F2 = F2;
                                iVar2 = iVar2;
                                F2 = nVar9;
                            } else {
                                if (iVar2 == 0) {
                                    iVar2 = new o0.i(new y0.n[16]);
                                }
                                if (F2 != 0) {
                                    iVar2.c(F2);
                                    F2 = 0;
                                }
                                iVar2.c(nVar9);
                            }
                        } else {
                            iVar2 = iVar2;
                            F2 = F2;
                        }
                        nVar9 = nVar9.f16735f;
                        iVar2 = iVar2;
                        F2 = F2;
                    }
                    if (i15 == 1) {
                        iVar2 = iVar2;
                        F2 = F2;
                    } else {
                        iVar2 = iVar2;
                        F2 = F2;
                    }
                }
                F2 = t1.g.f(iVar2);
            }
            if (arrayList != null) {
                return false;
            }
            size = arrayList.size();
            while (i10 < size) {
                cVar = ((q1.b) ((q1.a) arrayList.get(i10))).f13075u;
                if (cVar != null || !((Boolean) cVar.invoke(cVar4)).booleanValue()) {
                }
            }
            return false;
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if ((k(motionEvent) & 1) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int iE;
        t1.x0 x0Var;
        boolean z10 = this.f15354x0;
        androidx.activity.d dVar = this.f15352w0;
        if (z10) {
            removeCallbacks(dVar);
            dVar.run();
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        p0 p0Var = this.f15345t;
        AccessibilityManager accessibilityManager = p0Var.f15198n;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            w wVar = p0Var.f15195d;
            if (action == 7 || action == 9) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                wVar.r(true);
                t1.v vVar = new t1.v();
                androidx.compose.ui.node.a root = wVar.getRoot();
                long jF = d9.i.f(x10, y10);
                t1.x0 x0Var2 = root.C;
                x0Var2.f14577c.N0(t1.c1.M, x0Var2.f14577c.H0(jF), vVar, true, true);
                y0.n nVar = (y0.n) r8.p.M0(vVar);
                androidx.compose.ui.node.a aVarY = nVar != null ? t1.g.y(nVar) : null;
                if (aVarY == null || (x0Var = aVarY.C) == null || !x0Var.d(8)) {
                    iE = Integer.MIN_VALUE;
                } else {
                    y1.o oVarF = o1.s.f(aVarY, false);
                    d1.d dVar2 = r0.f15247a;
                    t1.c1 c1VarC = oVarF.c();
                    if (c1VarC != null && c1VarC.Q0()) {
                        iE = Integer.MIN_VALUE;
                    } else if (oVarF.f16798d.f16786a.containsKey(y1.r.f16828m)) {
                        iE = Integer.MIN_VALUE;
                    } else {
                        a7.a.w(wVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(aVarY));
                        iE = p0Var.E(aVarY.f1737b);
                    }
                }
                wVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                int i10 = p0Var.f15196e;
                if (i10 != iE) {
                    p0Var.f15196e = iE;
                    p0.K(p0Var, iE, 128, null, 12);
                    p0.K(p0Var, i10, 256, null, 12);
                }
            } else if (action == 10) {
                int i11 = p0Var.f15196e;
                if (i11 == Integer.MIN_VALUE) {
                    wVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                } else if (i11 != Integer.MIN_VALUE) {
                    p0Var.f15196e = Integer.MIN_VALUE;
                    p0.K(p0Var, Integer.MIN_VALUE, 128, null, 12);
                    p0.K(p0Var, i11, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && o(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f15342r0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f15342r0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f15354x0 = true;
                post(dVar);
                return false;
            }
        } else if (!p(motionEvent)) {
            return false;
        }
        return (k(motionEvent) & 1) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:253:0x045e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0226  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v16, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v17, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v18, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v40 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z10;
        y0.n nVar;
        KeyEvent keyEvent2;
        int size;
        t1.x0 x0Var;
        ?? F;
        t1.x0 x0Var2;
        int iNumberOfTrailingZeros2;
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int metaState = keyEvent.getMetaState();
        this.f15335o.getClass();
        h3.f15110b.setValue(new o1.a0(metaState));
        c1.f fVar = (c1.f) getFocusOwner();
        fVar.getClass();
        long jA = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
        int iB = androidx.compose.ui.input.key.a.b(keyEvent);
        if (!z6.a.B(iB, 2)) {
            fVar = fVar;
            if (z6.a.B(iB, 1)) {
                q.q qVar = fVar.f2886f;
                if (qVar == null || !qVar.a(jA)) {
                    z10 = true;
                } else {
                    q.q qVar2 = fVar.f2886f;
                    if (qVar2 != null) {
                        int iHashCode = Long.hashCode(jA) * (-862048943);
                        int i10 = iHashCode ^ (iHashCode << 16);
                        int i11 = i10 & 127;
                        int i12 = qVar2.f13018c;
                        int i13 = (i10 >>> 7) & i12;
                        int i14 = 0;
                        loop17: while (true) {
                            long[] jArr = qVar2.f13016a;
                            int i15 = i13 >> 3;
                            int i16 = (i13 & 7) << 3;
                            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
                            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
                            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                                if (qVar2.f13017b[iNumberOfTrailingZeros] == jA) {
                                    break loop17;
                                }
                            }
                            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                                iNumberOfTrailingZeros = -1;
                                break;
                            }
                            i14 += 8;
                            i13 = (i13 + i14) & i12;
                        }
                        if (iNumberOfTrailingZeros >= 0) {
                            qVar2.f13019d--;
                            long[] jArr2 = qVar2.f13016a;
                            int i17 = iNumberOfTrailingZeros >> 3;
                            int i18 = (iNumberOfTrailingZeros & 7) << 3;
                            jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (254 << i18);
                            int i19 = qVar2.f13018c;
                            int i20 = ((iNumberOfTrailingZeros - 7) & i19) + (i19 & 7);
                            int i21 = i20 >> 3;
                            int i22 = (i20 & 7) << 3;
                            jArr2[i21] = (jArr2[i21] & (~(255 << i22))) | (254 << i22);
                        }
                    }
                }
                if (!super.dispatchKeyEvent(keyEvent)) {
                    return false;
                }
            }
            return z10;
        }
        q.q qVar3 = fVar.f2886f;
        if (qVar3 == null) {
            qVar3 = new q.q(3);
            fVar.f2886f = qVar3;
        }
        q.q qVar4 = qVar3;
        int iHashCode2 = Long.hashCode(jA) * (-862048943);
        int i23 = iHashCode2 ^ (iHashCode2 << 16);
        int i24 = i23 >>> 7;
        int i25 = i23 & 127;
        int i26 = qVar4.f13018c;
        int i27 = i24 & i26;
        int i28 = 0;
        loop0: while (true) {
            long[] jArr3 = qVar4.f13016a;
            int i29 = i27 >> 3;
            int i30 = (i27 & 7) << 3;
            long j13 = (jArr3[i29] >>> i30) | ((jArr3[i29 + 1] << (64 - i30)) & ((-i30) >> 63));
            long j14 = i25;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros2 = (i27 + (Long.numberOfTrailingZeros(j16) >> 3)) & i26;
                if (qVar4.f13017b[iNumberOfTrailingZeros2] == jA) {
                    break loop0;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iC = qVar4.c(i24);
                if (qVar4.f13020e == 0 && ((qVar4.f13016a[iC >> 3] >> ((iC & 7) << 3)) & 255) != 254) {
                    int i31 = qVar4.f13018c;
                    if (i31 <= 8 || Long.compareUnsigned(((long) qVar4.f13019d) * 32, ((long) i31) * 25) > 0) {
                        qVar4.f(q.v.b(qVar4.f13018c));
                    } else {
                        qVar4.f(q.v.b(qVar4.f13018c));
                    }
                    iC = qVar4.c(i24);
                }
                iNumberOfTrailingZeros2 = iC;
                qVar4.f13019d++;
                int i32 = qVar4.f13020e;
                long[] jArr4 = qVar4.f13016a;
                int i33 = iNumberOfTrailingZeros2 >> 3;
                long j17 = jArr4[i33];
                int i34 = (iNumberOfTrailingZeros2 & 7) << 3;
                qVar4.f13020e = i32 - (((j17 >> i34) & 255) == 128 ? 1 : 0);
                jArr4[i33] = ((~(255 << i34)) & j17) | (j14 << i34);
                int i35 = qVar4.f13018c;
                int i36 = ((iNumberOfTrailingZeros2 - 7) & i35) + (i35 & 7);
                int i37 = i36 >> 3;
                int i38 = (i36 & 7) << 3;
                jArr4[i37] = (jArr4[i37] & (~(255 << i38))) | (j14 << i38);
                break;
            }
            i28 += 8;
            i27 = (i27 + i28) & i26;
        }
        qVar4.f13017b[iNumberOfTrailingZeros2] = jA;
        c1.p pVarF = androidx.compose.ui.focus.a.f(fVar.f2881a);
        if (pVarF == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        y0.n nVar2 = pVarF.f16730a;
        if (!nVar2.f16742t) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        if ((nVar2.f16733d & 9216) != 0) {
            nVar = null;
            for (y0.n nVar3 = nVar2.f16735f; nVar3 != null; nVar3 = nVar3.f16735f) {
                int i39 = nVar3.f16732c;
                if ((i39 & 9216) != 0) {
                    if ((i39 & 1024) != 0) {
                        break;
                    }
                    nVar = nVar3;
                }
            }
        } else {
            nVar = null;
        }
        if (nVar == null) {
            y0.n nVar4 = pVarF.f16730a;
            if (!nVar4.f16742t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            y0.n nVar5 = nVar4.f16734e;
            androidx.compose.ui.node.a aVarY = t1.g.y(pVarF);
            loop3: while (true) {
                if (aVarY == null) {
                    F = 0;
                    break;
                }
                if ((aVarY.C.f14579e.f16733d & 8192) != 0) {
                    while (nVar5 != null) {
                        if ((nVar5.f16732c & 8192) != 0) {
                            F = nVar5;
                            ?? iVar = 0;
                            while (F != 0) {
                                if (F instanceof m1.c) {
                                    break loop3;
                                }
                                if ((F.f16732c & 8192) != 0 && (F instanceof t1.o)) {
                                    y0.n nVar6 = ((t1.o) F).f14521v;
                                    int i40 = 0;
                                    while (nVar6 != null) {
                                        if ((nVar6.f16732c & 8192) != 0) {
                                            i40++;
                                            if (i40 == 1) {
                                                F = F;
                                                iVar = iVar;
                                                iVar = iVar;
                                                F = nVar6;
                                            } else {
                                                if (iVar == 0) {
                                                    iVar = new o0.i(new y0.n[16]);
                                                }
                                                if (F != 0) {
                                                    iVar.c(F);
                                                    F = 0;
                                                }
                                                iVar.c(nVar6);
                                            }
                                        } else {
                                            F = F;
                                            iVar = iVar;
                                        }
                                        nVar6 = nVar6.f16735f;
                                        F = F;
                                        iVar = iVar;
                                    }
                                    F = F;
                                    iVar = iVar;
                                    if (i40 == 1) {
                                    }
                                }
                                F = t1.g.f(iVar);
                            }
                        }
                        nVar5 = nVar5.f16734e;
                    }
                }
                aVarY = aVarY.q();
                nVar5 = (aVarY == null || (x0Var2 = aVarY.C) == null) ? null : x0Var2.f14578d;
            }
            t1.n nVar7 = (m1.c) F;
            nVar = nVar7 != null ? ((y0.n) nVar7).f16730a : null;
        }
        if (nVar != null) {
            y0.n nVar8 = nVar.f16730a;
            if (!nVar8.f16742t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            y0.n nVar9 = nVar8.f16734e;
            androidx.compose.ui.node.a aVarY2 = t1.g.y(nVar);
            ArrayList arrayList = null;
            while (aVarY2 != null) {
                if ((aVarY2.C.f14579e.f16733d & 8192) != 0) {
                    while (nVar9 != null) {
                        if ((nVar9.f16732c & 8192) != 0) {
                            y0.n nVarF = nVar9;
                            o0.i iVar2 = null;
                            while (nVarF != null) {
                                if (nVarF instanceof m1.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nVarF);
                                } else if ((nVarF.f16732c & 8192) != 0 && (nVarF instanceof t1.o)) {
                                    int i41 = 0;
                                    for (y0.n nVar10 = ((t1.o) nVarF).f14521v; nVar10 != null; nVar10 = nVar10.f16735f) {
                                        if ((nVar10.f16732c & 8192) != 0) {
                                            i41++;
                                            if (i41 == 1) {
                                                nVarF = nVar10;
                                            } else {
                                                if (iVar2 == null) {
                                                    iVar2 = new o0.i(new y0.n[16]);
                                                }
                                                if (nVarF != null) {
                                                    iVar2.c(nVarF);
                                                    nVarF = null;
                                                }
                                                iVar2.c(nVar10);
                                            }
                                        }
                                    }
                                    if (i41 == 1) {
                                    }
                                }
                                nVarF = t1.g.f(iVar2);
                            }
                        }
                        nVar9 = nVar9.f16734e;
                    }
                }
                aVarY2 = aVarY2.q();
                nVar9 = (aVarY2 == null || (x0Var = aVarY2.C) == null) ? null : x0Var.f14578d;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i42 = size - 1;
                    keyEvent2 = keyEvent;
                    if (!((m1.c) arrayList.get(size)).l(keyEvent2)) {
                        if (i42 >= 0) {
                            size = i42;
                        }
                    }
                    z10 = true;
                    return z10;
                }
            }
            keyEvent2 = keyEvent;
            ?? F2 = nVar.f16730a;
            ?? iVar3 = 0;
            while (true) {
                if (F2 == 0) {
                    ?? F3 = nVar.f16730a;
                    ?? iVar4 = 0;
                    while (true) {
                        if (F3 != 0) {
                            if (F3 instanceof m1.c) {
                                if (((m1.c) F3).M(keyEvent2)) {
                                }
                            } else if ((F3.f16732c & 8192) != 0 && (F3 instanceof t1.o)) {
                                y0.n nVar11 = ((t1.o) F3).f14521v;
                                int i43 = 0;
                                while (nVar11 != null) {
                                    if ((nVar11.f16732c & 8192) != 0) {
                                        i43++;
                                        if (i43 == 1) {
                                            F3 = F3;
                                            iVar4 = iVar4;
                                            iVar4 = iVar4;
                                            F3 = nVar11;
                                        } else {
                                            if (iVar4 == 0) {
                                                iVar4 = new o0.i(new y0.n[16]);
                                            }
                                            if (F3 != 0) {
                                                iVar4.c(F3);
                                                F3 = 0;
                                            }
                                            iVar4.c(nVar11);
                                        }
                                    } else {
                                        F3 = F3;
                                        iVar4 = iVar4;
                                    }
                                    nVar11 = nVar11.f16735f;
                                    F3 = F3;
                                    iVar4 = iVar4;
                                }
                                F3 = F3;
                                iVar4 = iVar4;
                                if (i43 != 1) {
                                    F3 = t1.g.f(iVar4);
                                }
                            }
                            F3 = t1.g.f(iVar4);
                        } else {
                            z10 = true;
                            if (arrayList != null) {
                                int size2 = arrayList.size();
                                for (int i44 = 0; i44 < size2; i44++) {
                                    if (!((m1.c) arrayList.get(i44)).M(keyEvent2)) {
                                    }
                                }
                            }
                        }
                        return z10;
                    }
                }
                if (F2 instanceof m1.c) {
                    if (((m1.c) F2).l(keyEvent2)) {
                    }
                } else if ((F2.f16732c & 8192) != 0 && (F2 instanceof t1.o)) {
                    y0.n nVar12 = ((t1.o) F2).f14521v;
                    int i45 = 0;
                    while (nVar12 != null) {
                        if ((nVar12.f16732c & 8192) != 0) {
                            i45++;
                            if (i45 == 1) {
                                F2 = F2;
                                iVar3 = iVar3;
                                iVar3 = iVar3;
                                F2 = nVar12;
                            } else {
                                if (iVar3 == 0) {
                                    iVar3 = new o0.i(new y0.n[16]);
                                }
                                if (F2 != 0) {
                                    iVar3.c(F2);
                                    F2 = 0;
                                }
                                iVar3.c(nVar12);
                            }
                        } else {
                            F2 = F2;
                            iVar3 = iVar3;
                        }
                        nVar12 = nVar12.f16735f;
                        F2 = F2;
                        iVar3 = iVar3;
                    }
                    F2 = F2;
                    iVar3 = iVar3;
                    if (i45 == 1) {
                    }
                }
                F2 = t1.g.f(iVar3);
                z10 = true;
                return z10;
            }
        }
        z10 = true;
        if (!super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        c1.p pVarF;
        t1.x0 x0Var;
        if (isFocused() && (pVarF = androidx.compose.ui.focus.a.f(((c1.f) getFocusOwner()).f2881a)) != null) {
            y0.n nVar = pVarF.f16730a;
            if (!nVar.f16742t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            y0.n nVar2 = nVar.f16734e;
            androidx.compose.ui.node.a aVarY = t1.g.y(pVarF);
            while (aVarY != null) {
                if ((aVarY.C.f14579e.f16733d & 131072) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f16732c & 131072) != 0) {
                            y0.n nVarF = nVar2;
                            o0.i iVar = null;
                            while (nVarF != null) {
                                if ((nVarF.f16732c & 131072) != 0 && (nVarF instanceof t1.o)) {
                                    int i10 = 0;
                                    for (y0.n nVar3 = ((t1.o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                        if ((nVar3.f16732c & 131072) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVarF = nVar3;
                                            } else {
                                                if (iVar == null) {
                                                    iVar = new o0.i(new y0.n[16]);
                                                }
                                                if (nVarF != null) {
                                                    iVar.c(nVarF);
                                                    nVarF = null;
                                                }
                                                iVar.c(nVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nVarF = t1.g.f(iVar);
                            }
                        }
                        nVar2 = nVar2.f16734e;
                    }
                }
                aVarY = aVarY.q();
                nVar2 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15354x0) {
            androidx.activity.d dVar = this.f15352w0;
            removeCallbacks(dVar);
            MotionEvent motionEvent2 = this.f15342r0;
            d7.a.j(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f15354x0 = false;
            } else {
                dVar.run();
            }
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !p(motionEvent)) {
            return false;
        }
        int iK = k(motionEvent);
        if ((iK & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iK & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, InvocationTargetException {
        View viewI = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
                if (objInvoke instanceof View) {
                    viewI = (View) objInvoke;
                }
            } else {
                viewI = i(this, i10);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewI;
    }

    public k getAccessibilityManager() {
        return this.E;
    }

    public final j1 getAndroidViewsHandler$ui_release() {
        if (this.H == null) {
            j1 j1Var = new j1(getContext());
            this.H = j1Var;
            addView(j1Var);
        }
        j1 j1Var2 = this.H;
        d7.a.j(j1Var2);
        return j1Var2;
    }

    public z0.b getAutofill() {
        return this.B;
    }

    public z0.f getAutofillTree() {
        return this.f15347u;
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public l m8439getClipboardManager() {
        return this.D;
    }

    public final c9.c getConfigurationChangeObserver() {
        return this.A;
    }

    public u8.j getCoroutineContext() {
        return this.f15315a;
    }

    public m2.b getDensity() {
        return this.f15323e;
    }

    public a1.b getDragAndDropManager() {
        return this.f15333n;
    }

    public c1.e getFocusOwner() {
        return this.f15325f;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        c1.p pVarF = androidx.compose.ui.focus.a.f(((c1.f) getFocusOwner()).f2881a);
        q8.l lVar = null;
        d1.d dVarI = pVarF != null ? androidx.compose.ui.focus.a.i(pVarF) : null;
        if (dVarI != null) {
            rect.left = d7.t.p0(dVarI.f4332a);
            rect.top = d7.t.p0(dVarI.f4333b);
            rect.right = d7.t.p0(dVarI.f4334c);
            rect.bottom = d7.t.p0(dVarI.f4335d);
            lVar = q8.l.f13235a;
        }
        if (lVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public f2.d getFontFamilyResolver() {
        return (f2.d) this.f15330k0.getValue();
    }

    public f2.c getFontLoader() {
        return this.f15329j0;
    }

    public k1.a getHapticFeedBack() {
        return this.f15334n0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.L.f14547b.b();
    }

    public l1.b getInputModeManager() {
        return this.f15336o0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.S;
    }

    @Override // android.view.View, android.view.ViewParent
    public m2.l getLayoutDirection() {
        return (m2.l) this.f15332m0.getValue();
    }

    public long getMeasureIteration() {
        t1.t0 t0Var = this.L;
        if (t0Var.f14548c) {
            return t0Var.f14551f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public s1.e getModifierLocalManager() {
        return this.f15338p0;
    }

    public r1.w0 getPlacementScope() {
        int i10 = r1.z0.f13440b;
        return new r1.g0(this, 1);
    }

    public o1.r getPointerIconService() {
        return this.B0;
    }

    public androidx.compose.ui.node.a getRoot() {
        return this.f15339q;
    }

    public t1.q1 getRootForTest() {
        return this.f15341r;
    }

    public y1.p getSemanticsOwner() {
        return this.f15343s;
    }

    public t1.i0 getSharedDrawScope() {
        return this.f15321d;
    }

    public boolean getShowLayoutBounds() {
        return this.G;
    }

    public t1.n1 getSnapshotObserver() {
        return this.F;
    }

    public t2 getSoftwareKeyboardController() {
        return this.i0;
    }

    public g2.b0 getTextInputService() {
        return this.f15327g0;
    }

    public u2 getTextToolbar() {
        return this.f15340q0;
    }

    public View getView() {
        return this;
    }

    public y2 getViewConfiguration() {
        return this.M;
    }

    public final q getViewTreeOwners() {
        return (q) this.f15316a0.getValue();
    }

    public g3 getWindowInfo() {
        return this.f15335o;
    }

    public final void j(androidx.compose.ui.node.a aVar, boolean z10) {
        this.L.d(aVar, z10);
    }

    public final int k(MotionEvent motionEvent) {
        int actionMasked;
        float[] fArr = this.Q;
        removeCallbacks(this.f15350v0);
        try {
            this.S = AnimationUtils.currentAnimationTimeMillis();
            this.f15358z0.a(this, fArr);
            o1.s.U(fArr, this.R);
            long jA = e1.a0.a(fArr, d9.i.f(motionEvent.getX(), motionEvent.getY()));
            this.U = d9.i.f(motionEvent.getRawX() - d1.c.d(jA), motionEvent.getRawY() - d1.c.e(jA));
            boolean z10 = true;
            this.T = true;
            r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f15342r0;
                boolean z11 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && (motionEvent2.getSource() != motionEvent.getSource() || motionEvent2.getToolType(0) != motionEvent.getToolType(0))) {
                    if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        this.f15357z.b();
                    } else if (motionEvent2.getActionMasked() != 10 && z11) {
                        C(motionEvent2, 10, motionEvent2.getEventTime(), true);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z10 = false;
                }
                if (!z11 && z10 && actionMasked2 != 3 && actionMasked2 != 9 && o(motionEvent)) {
                    C(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f15342r0 = MotionEvent.obtainNoHistory(motionEvent);
                int iB = B(motionEvent);
                Trace.endSection();
                this.T = false;
                return iB;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            this.T = false;
            throw th2;
        }
    }

    public final void m(androidx.compose.ui.node.a aVar) {
        int i10 = 0;
        this.L.q(aVar, false);
        o0.i iVarT = aVar.t();
        int i11 = iVarT.f12343c;
        if (i11 > 0) {
            Object[] objArr = iVarT.f12341a;
            do {
                m((androidx.compose.ui.node.a) objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.w wVar;
        androidx.lifecycle.r lifecycle;
        androidx.lifecycle.w wVar2;
        super.onAttachedToWindow();
        m(getRoot());
        l(getRoot());
        w0.a0 a0Var = getSnapshotObserver().f14512a;
        a0Var.f16028g = k0.y0.f(a0Var.f16025d);
        z0.a aVar = this.B;
        if (aVar != null) {
            z0.e.f17190a.a(aVar);
        }
        androidx.lifecycle.w wVarA = o1.s.A(this);
        b4.g gVarJ0 = y3.e.j0(this);
        q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (wVarA != null && gVarJ0 != null && (wVarA != (wVar2 = viewTreeOwners.f15215a) || gVarJ0 != wVar2))) {
            if (wVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (gVarJ0 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (wVar = viewTreeOwners.f15215a) != null && (lifecycle = wVar.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            wVarA.getLifecycle().a(this);
            q qVar = new q(wVarA, gVarJ0);
            set_viewTreeOwners(qVar);
            c9.c cVar = this.f15318b0;
            if (cVar != null) {
                cVar.invoke(qVar);
            }
            this.f15318b0 = null;
        }
        int i10 = isInTouchMode() ? 1 : 2;
        l1.c cVar2 = this.f15336o0;
        cVar2.getClass();
        cVar2.f11193a.setValue(new l1.a(i10));
        q viewTreeOwners2 = getViewTreeOwners();
        d7.a.j(viewTreeOwners2);
        viewTreeOwners2.f15215a.getLifecycle().a(this);
        q viewTreeOwners3 = getViewTreeOwners();
        d7.a.j(viewTreeOwners3);
        viewTreeOwners3.f15215a.getLifecycle().a(this.f15345t);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f15320c0);
        getViewTreeObserver().addOnScrollChangedListener(this.f15322d0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f15324e0);
        if (Build.VERSION.SDK_INT >= 31) {
            t0.f15300a.b(this, new p());
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        a7.a.w(this.f15328h0.get());
        return this.f15326f0.f6547d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15323e = o1.s.c(getContext());
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f15331l0) {
            this.f15331l0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(i1.b.l(getContext()));
        }
        this.A.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        a7.a.w(this.f15328h0.get());
        g2.e0 e0Var = this.f15326f0;
        if (!e0Var.f6547d) {
            return null;
        }
        g2.o oVar = e0Var.f6551h;
        g2.a0 a0Var = e0Var.f6550g;
        int i10 = oVar.f6588e;
        boolean zA = g2.n.a(i10, 1);
        int i11 = 0;
        boolean z10 = oVar.f6584a;
        if (zA) {
            if (z10) {
                i11 = 6;
            }
        } else if (g2.n.a(i10, 0)) {
            i11 = 1;
        } else if (g2.n.a(i10, 2)) {
            i11 = 2;
        } else if (g2.n.a(i10, 6)) {
            i11 = 5;
        } else if (g2.n.a(i10, 5)) {
            i11 = 7;
        } else if (g2.n.a(i10, 3)) {
            i11 = 3;
        } else if (g2.n.a(i10, 4)) {
            i11 = 4;
        } else {
            if (!g2.n.a(i10, 7)) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            i11 = 6;
        }
        editorInfo.imeOptions = i11;
        int i12 = oVar.f6587d;
        if (f6.a.D(i12, 1)) {
            editorInfo.inputType = 1;
        } else if (f6.a.D(i12, 2)) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (f6.a.D(i12, 3)) {
            editorInfo.inputType = 2;
        } else if (f6.a.D(i12, 4)) {
            editorInfo.inputType = 3;
        } else if (f6.a.D(i12, 5)) {
            editorInfo.inputType = 17;
        } else if (f6.a.D(i12, 6)) {
            editorInfo.inputType = 33;
        } else if (f6.a.D(i12, 7)) {
            editorInfo.inputType = 129;
        } else if (f6.a.D(i12, 8)) {
            editorInfo.inputType = 18;
        } else {
            if (!f6.a.D(i12, 9)) {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            editorInfo.inputType = 8194;
        }
        if (!z10) {
            int i13 = editorInfo.inputType;
            if ((i13 & 1) == 1) {
                editorInfo.inputType = i13 | 131072;
                if (g2.n.a(oVar.f6588e, 1)) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int i14 = oVar.f6585b;
            if (z6.a.z(i14, 1)) {
                editorInfo.inputType |= 4096;
            } else if (z6.a.z(i14, 2)) {
                editorInfo.inputType |= 8192;
            } else if (z6.a.z(i14, 3)) {
                editorInfo.inputType |= 16384;
            }
            if (oVar.f6586c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j10 = a0Var.f6510b;
        int i15 = a2.b0.f904c;
        editorInfo.initialSelStart = (int) (j10 >> 32);
        editorInfo.initialSelEnd = (int) (j10 & 4294967295L);
        z6.a.e0(editorInfo, a0Var.f6509a.f918a);
        editorInfo.imeOptions |= 33554432;
        if (i3.l.c()) {
            i3.l lVarA = i3.l.a();
            if (lVarA.b() == 1) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                lVarA.f7974e.S(editorInfo);
            }
        }
        g2.w wVar = new g2.w(e0Var.f6550g, new g2.d0(e0Var), e0Var.f6551h.f6586c);
        e0Var.f6552i.add(new WeakReference(wVar));
        return wVar;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        p0 p0Var = this.f15345t;
        p0Var.getClass();
        j0.f15118a.b(p0Var, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.lifecycle.w wVar;
        androidx.lifecycle.r lifecycle;
        androidx.lifecycle.w wVar2;
        androidx.lifecycle.r lifecycle2;
        super.onDetachedFromWindow();
        w0.a0 a0Var = getSnapshotObserver().f14512a;
        w0.h hVar = a0Var.f16028g;
        if (hVar != null) {
            hVar.a();
        }
        a0Var.b();
        q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (wVar2 = viewTreeOwners.f15215a) != null && (lifecycle2 = wVar2.getLifecycle()) != null) {
            lifecycle2.c(this);
        }
        q viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (wVar = viewTreeOwners2.f15215a) != null && (lifecycle = wVar.getLifecycle()) != null) {
            lifecycle.c(this.f15345t);
        }
        z0.a aVar = this.B;
        if (aVar != null) {
            z0.e.f17190a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f15320c0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f15322d0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f15324e0);
        if (Build.VERSION.SDK_INT >= 31) {
            t0.f15300a.a(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        c1.q qVar = ((c1.f) getFocusOwner()).f2883c;
        qVar.f2915b.c(new b.f(this, z10));
        boolean z11 = qVar.f2916c;
        c1.o oVar = c1.o.f2907a;
        c1.o oVar2 = c1.o.f2909c;
        if (z11) {
            if (!z10) {
                androidx.compose.ui.focus.a.d(((c1.f) getFocusOwner()).f2881a, true, true);
                return;
            }
            c1.p pVar = ((c1.f) getFocusOwner()).f2881a;
            if (pVar.H0() == oVar2) {
                pVar.K0(oVar);
                return;
            }
            return;
        }
        try {
            qVar.f2916c = true;
            if (z10) {
                c1.p pVar2 = ((c1.f) getFocusOwner()).f2881a;
                if (pVar2.H0() == oVar2) {
                    pVar2.K0(oVar);
                }
            } else {
                androidx.compose.ui.focus.a.d(((c1.f) getFocusOwner()).f2881a, true, true);
            }
        } finally {
            c1.q.b(qVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.L.h(this.f15356y0);
        this.J = null;
        D();
        if (this.H != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        t1.t0 t0Var = this.L;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m(getRoot());
            }
            long jH = h(i10);
            long jH2 = h(i11);
            long jA = o1.s.a((int) (jH >>> 32), (int) (jH & 4294967295L), (int) (jH2 >>> 32), (int) (4294967295L & jH2));
            m2.a aVar = this.J;
            if (aVar == null) {
                this.J = new m2.a(jA);
                this.K = false;
            } else if (!m2.a.c(aVar.f11792a, jA)) {
                this.K = true;
            }
            t0Var.r(jA);
            t0Var.j();
            setMeasuredDimension(getRoot().D.f14508o.f13423a, getRoot().D.f14508o.f13424b);
            if (this.H != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().D.f14508o.f13423a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().D.f14508o.f13424b, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        z0.a aVar;
        if (viewStructure == null || (aVar = this.B) == null) {
            return;
        }
        z0.c cVar = z0.c.f17188a;
        z0.f fVar = aVar.f17186b;
        int iA = cVar.a(viewStructure, fVar.f17191a.size());
        for (Map.Entry entry : fVar.f17191a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            a7.a.w(entry.getValue());
            ViewStructure viewStructureB = cVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                z0.d dVar = z0.d.f17189a;
                AutofillId autofillIdA = dVar.a(viewStructure);
                d7.a.j(autofillIdA);
                dVar.g(viewStructureB, autofillIdA, iIntValue);
                cVar.d(viewStructureB, iIntValue, aVar.f17185a.getContext().getPackageName(), null, null);
                dVar.h(viewStructureB, 1);
                throw null;
            }
            iA++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f15319c) {
            m2.l lVar = m2.l.f11815a;
            if (i10 != 0 && i10 == 1) {
                lVar = m2.l.f11816b;
            }
            setLayoutDirection(lVar);
            ((c1.f) getFocusOwner()).f2885e = lVar;
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        p0 p0Var = this.f15345t;
        p0Var.getClass();
        j0.f15118a.c(p0Var, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean zA;
        this.f15335o.f15111a.setValue(Boolean.valueOf(z10));
        this.A0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (zA = k1.b.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        l(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f15342r0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long q(long j10) {
        y();
        long jA = e1.a0.a(this.Q, j10);
        return d9.i.f(d1.c.d(this.U) + d1.c.d(jA), d1.c.e(this.U) + d1.c.e(jA));
    }

    public final void r(boolean z10) {
        u uVar;
        t1.t0 t0Var = this.L;
        if (t0Var.f14547b.b() || t0Var.f14549d.f14449a.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    uVar = this.f15356y0;
                } finally {
                    Trace.endSection();
                }
            } else {
                uVar = null;
            }
            if (t0Var.h(uVar)) {
                requestLayout();
            }
            t0Var.a(false);
        }
    }

    public final void s(androidx.compose.ui.node.a aVar, long j10) {
        t1.t0 t0Var = this.L;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            t0Var.i(aVar, j10);
            if (!t0Var.f14547b.b()) {
                t0Var.a(false);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void setConfigurationChangeObserver(c9.c cVar) {
        this.A = cVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.S = j10;
    }

    public final void setOnViewTreeOwnersAvailable(c9.c cVar) {
        q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f15318b0 = cVar;
    }

    public void setShowLayoutBounds(boolean z10) {
        this.G = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(t1.j1 j1Var, boolean z10) {
        ArrayList arrayList = this.f15349v;
        if (!z10) {
            if (this.f15353x) {
                return;
            }
            arrayList.remove(j1Var);
            ArrayList arrayList2 = this.f15351w;
            if (arrayList2 != null) {
                arrayList2.remove(j1Var);
                return;
            }
            return;
        }
        if (!this.f15353x) {
            arrayList.add(j1Var);
            return;
        }
        ArrayList arrayList3 = this.f15351w;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f15351w = arrayList3;
        }
        arrayList3.add(j1Var);
    }

    public final void u() {
        if (this.C) {
            w0.a0 a0Var = getSnapshotObserver().f14512a;
            synchronized (a0Var.f16027f) {
                try {
                    o0.i iVar = a0Var.f16027f;
                    int i10 = iVar.f12343c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        w0.z zVar = (w0.z) iVar.f12341a[i12];
                        zVar.e();
                        if (!(zVar.f16138f.f13031e != 0)) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = iVar.f12341a;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    b9.b.O(i13, i10, iVar.f12341a);
                    iVar.f12343c = i13;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.C = false;
        }
        j1 j1Var = this.H;
        if (j1Var != null) {
            g(j1Var);
        }
        while (this.f15348u0.l()) {
            int i14 = this.f15348u0.f12343c;
            for (int i15 = 0; i15 < i14; i15++) {
                o0.i iVar2 = this.f15348u0;
                c9.a aVar = (c9.a) iVar2.f12341a[i15];
                iVar2.p(i15, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f15348u0.o(0, i14);
        }
    }

    public final void v(androidx.compose.ui.node.a aVar) {
        p0 p0Var = this.f15345t;
        p0Var.E = true;
        if (!p0Var.x()) {
            d1.d dVar = r0.f15247a;
            if (p0Var.F == null) {
                return;
            }
        }
        p0Var.A(aVar);
    }

    public final void w(androidx.compose.ui.node.a aVar, boolean z10, boolean z11, boolean z12) {
        t1.t0 t0Var = this.L;
        if (z10) {
            if (t0Var.o(aVar, z11) && z12) {
                z(aVar);
                return;
            }
            return;
        }
        if (t0Var.q(aVar, z11) && z12) {
            z(aVar);
        }
    }

    public final void x() {
        p0 p0Var = this.f15345t;
        p0Var.E = true;
        if (!p0Var.x()) {
            d1.d dVar = r0.f15247a;
            if (p0Var.F == null) {
                return;
            }
        }
        if (p0Var.S) {
            return;
        }
        p0Var.S = true;
        p0Var.f15202r.post(p0Var.T);
    }

    public final void y() {
        if (this.T) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.S) {
            this.S = jCurrentAnimationTimeMillis;
            l1 l1Var = this.f15358z0;
            float[] fArr = this.Q;
            l1Var.a(this, fArr);
            o1.s.U(fArr, this.R);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.O;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.U = d9.i.f(f10 - iArr[0], f11 - iArr[1]);
        }
    }

    public final void z(androidx.compose.ui.node.a aVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (aVar != null) {
            while (aVar != null && aVar.D.f14508o.f14483r == 1) {
                if (!this.K) {
                    androidx.compose.ui.node.a aVarQ = aVar.q();
                    if (aVarQ == null) {
                        break;
                    }
                    long j10 = aVarQ.C.f14576b.f13426d;
                    if (m2.a.g(j10) && m2.a.f(j10)) {
                        break;
                    }
                }
                aVar = aVar.q();
            }
            if (aVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }
}
