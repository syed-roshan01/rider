package u1;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ride.accepter.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f15013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f15014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x3 f15015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m0.u f15016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z.p f15017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15018f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15020o;

    public /* synthetic */ a(Context context) {
        this(context, null, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(m0.u uVar) {
        if (this.f15016d != uVar) {
            this.f15016d = uVar;
            if (uVar != null) {
                this.f15013a = null;
            }
            x3 x3Var = this.f15015c;
            if (x3Var != null) {
                x3Var.a();
                this.f15015c = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f15014b != iBinder) {
            this.f15014b = iBinder;
            this.f15013a = null;
        }
    }

    public abstract void a(m0.m mVar, int i10);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f15019n) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f15015c == null) {
            try {
                this.f15019n = true;
                this.f15015c = z3.a(this, f(), new u0.b(-656146368, new s.i(this, 10), true));
            } finally {
                this.f15019n = false;
            }
        }
    }

    public void d(int i10, int i11, int i12, int i13, boolean z10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void e(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m0.u] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m0.u] */
    /* JADX WARN: Type inference failed for: r0v18, types: [m0.g2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [m0.u] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v41 */
    public final m0.u f() {
        u8.j jVar;
        m0.p1 p1Var;
        m0.u uVar;
        ?? B = this.f15016d;
        if (B == 0) {
            B = u3.b(this);
            if (B == 0) {
                ViewParent parent = getParent();
                while (true) {
                    if (B != 0 || !(parent instanceof View)) {
                        B = B;
                        break;
                    }
                    B = B;
                    m0.u uVarB = u3.b((View) parent);
                    parent = parent.getParent();
                    B = uVarB;
                }
            }
            if (B != 0) {
                ?? r10 = (!(B instanceof m0.g2) || ((m0.a2) ((m0.g2) B).f11536r.getValue()).compareTo(m0.a2.f11448b) > 0) ? B : 0;
                if (r10 != 0) {
                    this.f15013a = new WeakReference(r10);
                }
            } else {
                B = 0;
            }
            if (B == 0) {
                WeakReference weakReference = this.f15013a;
                if (weakReference == null || (uVar = (m0.u) weakReference.get()) == null || ((uVar instanceof m0.g2) && ((m0.a2) ((m0.g2) uVar).f11536r.getValue()).compareTo(m0.a2.f11448b) <= 0)) {
                    B = uVar;
                    B = uVar;
                    B = 0;
                }
                if (B == 0) {
                    if (!isAttachedToWindow()) {
                        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    m0.u uVarB2 = u3.b(view);
                    if (uVarB2 == null) {
                        ((i3) ((j3) l3.f15159a.get())).getClass();
                        u8.j jVar2 = u8.k.f15438a;
                        q8.i iVar = e1.f15072t;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            jVar = (u8.j) e1.f15072t.getValue();
                        } else {
                            jVar = (u8.j) e1.f15073u.get();
                            if (jVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                            }
                        }
                        u8.j jVarO = jVar.O(jVar2);
                        m0.a1 a1Var = (m0.a1) jVarO.f(m0.l.f11579b);
                        if (a1Var != null) {
                            p1Var = new m0.p1(a1Var);
                            m0.x0 x0Var = p1Var.f11626b;
                            synchronized (x0Var.f11749a) {
                                x0Var.f11752d = false;
                            }
                        } else {
                            p1Var = null;
                        }
                        d9.u uVar2 = new d9.u();
                        u8.j h2Var = (y0.p) jVarO.f(y0.a.f16718r);
                        if (h2Var == null) {
                            h2Var = new h2();
                            uVar2.f4952a = h2Var;
                        }
                        if (p1Var != null) {
                            jVar2 = p1Var;
                        }
                        u8.j jVarO2 = jVarO.O(jVar2).O(h2Var);
                        m0.g2 g2Var = new m0.g2(jVarO2);
                        synchronized (g2Var.f11520b) {
                            g2Var.f11535q = true;
                        }
                        r9.e eVarB = d7.a.b(jVarO2);
                        androidx.lifecycle.w wVarA = o1.s.A(view);
                        androidx.lifecycle.r lifecycle = wVarA != null ? wVarA.getLifecycle() : null;
                        if (lifecycle == null) {
                            throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
                        }
                        view.addOnAttachStateChangeListener(new m3(view, g2Var));
                        lifecycle.a(new r3(eVarB, p1Var, g2Var, uVar2, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, g2Var);
                        m9.z0 z0Var = m9.z0.f12025a;
                        Handler handler = view.getHandler();
                        int i10 = n9.f.f12324a;
                        view.addOnAttachStateChangeListener(new k.d(z6.a.Q(z0Var, new n9.d(handler, "windowRecomposer cleanup", false).f12323f, 0, new k3(g2Var, view, null), 2), 4));
                        B = g2Var;
                    } else {
                        if (!(uVarB2 instanceof m0.g2)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                        }
                        B = (m0.g2) uVarB2;
                    }
                    ?? r11 = ((m0.a2) B.f11536r.getValue()).compareTo(m0.a2.f11448b) > 0 ? B : 0;
                    if (r11 != 0) {
                        this.f15013a = new WeakReference(r11);
                    }
                }
            }
        }
        return B;
    }

    public final boolean getHasComposition() {
        return this.f15015c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f15018f;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f15020o || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        d(i10, i11, i12, i13, z10);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        c();
        e(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(m0.u uVar) {
        setParentContext(uVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f15018f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((w) ((t1.l1) childAt)).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f15020o = true;
    }

    public final void setViewCompositionStrategy(x2 x2Var) {
        z.p pVar = this.f15017e;
        if (pVar != null) {
            pVar.invoke();
        }
        ((x1) x2Var).getClass();
        k.d dVar = new k.d(this, 3);
        addOnAttachStateChangeListener(dVar);
        b.b bVar = new b.b(this, 1);
        h6.g.l0(this).f6612a.add(bVar);
        this.f15017e = new z.p(this, dVar, bVar, 4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        k.d dVar = new k.d(this, 3);
        addOnAttachStateChangeListener(dVar);
        b.b bVar = new b.b(this, 1);
        h6.g.l0(this).f6612a.add(bVar);
        this.f15017e = new z.p(this, dVar, bVar, 4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }
}
