package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, AttributeSet attributeSet, x0 x0Var) {
        View view;
        super(context, attributeSet);
        d7.a.m(context, "context");
        d7.a.m(attributeSet, "attrs");
        d7.a.m(x0Var, "fm");
        this.f1953a = new ArrayList();
        this.f1954b = new ArrayList();
        this.f1956d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m3.a.f11827b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        d0 d0VarV = x0Var.v(id);
        if (classAttribute != null && d0VarV == null) {
            if (id == -1) {
                throw new IllegalStateException(l.q.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            s0 s0VarZ = x0Var.z();
            context.getClassLoader();
            d0 d0VarInstantiate = d0.instantiate(s0VarZ.f2022a.f2067t.f1972b, classAttribute, null);
            d7.a.l(d0VarInstantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            d0VarInstantiate.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(x0Var);
            aVar.f1846o = true;
            d0VarInstantiate.mContainer = this;
            aVar.e(getId(), d0VarInstantiate, string);
            if (aVar.f1838g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            x0 x0Var2 = aVar.f1847p;
            if (x0Var2.f2067t != null && !x0Var2.G) {
                x0Var2.s(true);
                aVar.a(x0Var2.I, x0Var2.J);
                x0Var2.f2049b = true;
                try {
                    x0Var2.J(x0Var2.I, x0Var2.J);
                    x0Var2.d();
                    x0Var2.S();
                    boolean z10 = x0Var2.H;
                    f1 f1Var = x0Var2.f2050c;
                    if (z10) {
                        x0Var2.H = false;
                        for (e1 e1Var : f1Var.d()) {
                            d0 d0Var = e1Var.f1899c;
                            if (d0Var.mDeferStart) {
                                if (x0Var2.f2049b) {
                                    x0Var2.H = true;
                                } else {
                                    d0Var.mDeferStart = false;
                                    e1Var.j();
                                }
                            }
                        }
                    }
                    f1Var.f1908b.values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    x0Var2.d();
                    throw th;
                }
            }
        }
        for (e1 e1Var2 : x0Var.f2050c.d()) {
            d0 d0Var2 = e1Var2.f1899c;
            if (d0Var2.mContainerId == getId() && (view = d0Var2.mView) != null && view.getParent() == null) {
                d0Var2.mContainer = this;
                e1Var2.a();
            }
        }
    }

    public final void a(View view) {
        if (this.f1954b.contains(view)) {
            this.f1953a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        d7.a.m(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof d0 ? (d0) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        b3.u1 u1VarC;
        d7.a.m(windowInsets, "insets");
        b3.u1 u1VarC2 = b3.u1.c(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1955c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            d7.a.l(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            u1VarC = b3.u1.c(null, windowInsetsOnApplyWindowInsets);
        } else {
            Field field = b3.q0.f2670a;
            WindowInsets windowInsetsB = u1VarC2.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsB2 = b3.f0.b(this, windowInsetsB);
                if (!windowInsetsB2.equals(windowInsetsB)) {
                    u1VarC2 = b3.u1.c(this, windowInsetsB2);
                }
            }
            u1VarC = u1VarC2;
        }
        if (!u1VarC.f2683a.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                Field field2 = b3.q0.f2670a;
                WindowInsets windowInsetsB3 = u1VarC.b();
                if (windowInsetsB3 != null) {
                    WindowInsets windowInsetsA = b3.f0.a(childAt, windowInsetsB3);
                    if (!windowInsetsA.equals(windowInsetsB3)) {
                        b3.u1.c(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d7.a.m(canvas, "canvas");
        if (this.f1956d) {
            Iterator it = this.f1953a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d7.a.m(canvas, "canvas");
        d7.a.m(view, "child");
        if (this.f1956d) {
            ArrayList arrayList = this.f1953a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        d7.a.m(view, "view");
        this.f1954b.remove(view);
        if (this.f1953a.remove(view)) {
            this.f1956d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends d0> F getFragment() {
        g0 g0Var;
        d0 d0Var;
        x0 supportFragmentManager;
        View view = this;
        while (true) {
            g0Var = null;
            if (view == null) {
                d0Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            d0Var = tag instanceof d0 ? (d0) tag : null;
            if (d0Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (d0Var == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof g0) {
                    g0Var = (g0) context;
                    break;
                }
            }
            if (g0Var == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = g0Var.getSupportFragmentManager();
        } else {
            if (!d0Var.isAdded()) {
                throw new IllegalStateException("The Fragment " + d0Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = d0Var.getChildFragmentManager();
        }
        return (F) supportFragmentManager.v(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d7.a.m(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                d7.a.l(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        d7.a.m(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        d7.a.l(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        d7.a.m(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            d7.a.l(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            d7.a.l(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f1956d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        d7.a.m(onApplyWindowInsetsListener, "listener");
        this.f1955c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        d7.a.m(view, "view");
        if (view.getParent() == this) {
            this.f1954b.add(view);
        }
        super.startViewTransition(view);
    }
}
