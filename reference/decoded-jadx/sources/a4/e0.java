package a4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f1100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f1101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1 f1102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1105g;

    public e0() {
        c0 c0Var = new c0(this, 0);
        c0 c0Var2 = new c0(this, 1);
        this.f1101c = new a1(c0Var);
        this.f1102d = new a1(c0Var2);
        this.f1103e = false;
    }

    public static int e(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i11, i12) : size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    public static void r(View view, Rect rect) {
        int[] iArr = RecyclerView.f2238p0;
        f0 f0Var = (f0) view.getLayoutParams();
        Rect rect2 = f0Var.f1108a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) f0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) f0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) f0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) f0Var).bottomMargin);
    }

    public static void w(View view) {
        ((f0) view.getLayoutParams()).getClass();
        throw null;
    }

    public static d0 x(Context context, AttributeSet attributeSet, int i10, int i11) {
        d0 d0Var = new d0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3.a.f17200a, i10, i11);
        d0Var.f1084a = typedArrayObtainStyledAttributes.getInt(0, 1);
        d0Var.f1085b = typedArrayObtainStyledAttributes.getInt(9, 1);
        d0Var.f1086c = typedArrayObtainStyledAttributes.getBoolean(8, false);
        d0Var.f1087d = typedArrayObtainStyledAttributes.getBoolean(10, false);
        typedArrayObtainStyledAttributes.recycle();
        return d0Var;
    }

    public abstract void A(RecyclerView recyclerView);

    public void B(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1100b;
        l0 l0Var = recyclerView.f2242a;
        o0 o0Var = recyclerView.f2253f0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1100b.canScrollVertically(-1) && !this.f1100b.canScrollHorizontally(-1) && !this.f1100b.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        this.f1100b.getClass();
    }

    public abstract void C(Parcelable parcelable);

    public abstract Parcelable D();

    public void E(int i10) {
    }

    public final void F() {
        int iP = p() - 1;
        if (iP < 0) {
            return;
        }
        RecyclerView.j(o(iP));
        throw null;
    }

    public final void G(l0 l0Var) {
        int size = l0Var.f1150a.size();
        int i10 = size - 1;
        ArrayList arrayList = l0Var.f1150a;
        if (i10 >= 0) {
            a7.a.w(arrayList.get(i10));
            throw null;
        }
        arrayList.clear();
        if (size > 0) {
            this.f1100b.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    public final boolean H(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iT = t();
        int iV = v();
        int iU = this.f1104f - u();
        int iS = this.f1105g - s();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iT;
        int iMin = Math.min(0, i10);
        int i11 = top - iV;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iU;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - iS);
        RecyclerView recyclerView2 = this.f1100b;
        Field field = b3.q0.f2670a;
        if (b3.c0.d(recyclerView2) != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iT2 = t();
                int iV2 = v();
                int iU2 = this.f1104f - u();
                int iS2 = this.f1105g - s();
                Rect rect2 = this.f1100b.f2260n;
                r(focusedChild, rect2);
                if (rect2.left - iMax < iU2 && rect2.right - iMax > iT2 && rect2.top - iMin2 < iS2 && rect2.bottom - iMin2 > iV2) {
                    if (iMax == 0) {
                    }
                    if (z10) {
                        recyclerView.scrollBy(iMax, iMin2);
                    } else {
                        recyclerView.t(iMax, iMin2);
                    }
                    return true;
                }
            }
        } else if (iMax == 0 || iMin2 != 0) {
            if (z10) {
                recyclerView.scrollBy(iMax, iMin2);
            } else {
                recyclerView.t(iMax, iMin2);
            }
            return true;
        }
        return false;
    }

    public final void I() {
        RecyclerView recyclerView = this.f1100b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void J(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1100b = null;
            this.f1099a = null;
            this.f1104f = 0;
            this.f1105g = 0;
            return;
        }
        this.f1100b = recyclerView;
        this.f1099a = recyclerView.f2248d;
        this.f1104f = recyclerView.getWidth();
        this.f1105g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(f0 f0Var) {
        return f0Var != null;
    }

    public abstract int f(o0 o0Var);

    public abstract void g(o0 o0Var);

    public abstract int h(o0 o0Var);

    public abstract int i(o0 o0Var);

    public abstract void j(o0 o0Var);

    public abstract int k(o0 o0Var);

    public abstract f0 l();

    public f0 m(Context context, AttributeSet attributeSet) {
        return new f0(context, attributeSet);
    }

    public f0 n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f0) {
            return new f0((f0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f0((ViewGroup.MarginLayoutParams) layoutParams) : new f0(layoutParams);
    }

    public final View o(int i10) {
        c cVar = this.f1099a;
        if (cVar != null) {
            return cVar.a(i10);
        }
        return null;
    }

    public final int p() {
        c cVar = this.f1099a;
        if (cVar != null) {
            return cVar.b();
        }
        return 0;
    }

    public int q(l0 l0Var, o0 o0Var) {
        RecyclerView recyclerView = this.f1100b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int s() {
        RecyclerView recyclerView = this.f1100b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f1100b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f1100b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int v() {
        RecyclerView recyclerView = this.f1100b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int y(l0 l0Var, o0 o0Var) {
        RecyclerView recyclerView = this.f1100b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean z();
}
