package b3;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f2658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f2659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f2660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f2662e;

    public p(View view) {
        this.f2660c = view;
    }

    public final boolean a(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentC;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f2661d || (viewParentC = c(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f2660c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f2662e == null) {
                this.f2662e = new int[2];
            }
            iArr3 = this.f2662e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        i1.b.y(viewParentC, this.f2660c, i10, i11, iArr3, i12);
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean b(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentC;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f2661d || (viewParentC = c(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f2660c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f2662e == null) {
                this.f2662e = new int[2];
            }
            int[] iArr4 = this.f2662e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        i1.b.z(viewParentC, this.f2660c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent c(int i10) {
        if (i10 == 0) {
            return this.f2658a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f2659b;
    }

    public final boolean d(int i10) {
        return c(i10) != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[SYNTHETIC] */
    public final boolean e(int i10, int i11) {
        boolean zF;
        if (d(i11)) {
            return true;
        }
        if (!this.f2661d) {
            return false;
        }
        View view = this.f2660c;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            boolean z10 = parent instanceof q;
            if (z10) {
                zF = ((q) parent).f(view2, view, i10, i11);
            } else {
                if (i11 == 0) {
                    try {
                        zF = v0.f(parent, view2, view, i10);
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                    }
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            if (zF) {
                if (i11 == 0) {
                    this.f2658a = parent;
                } else if (i11 == 1) {
                    this.f2659b = parent;
                }
                if (z10) {
                    ((q) parent).a(view2, view, i10, i11);
                } else if (i11 == 0) {
                    try {
                        v0.e(parent, view2, view, i10);
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                    }
                }
                return true;
            }
            if (parent instanceof View) {
                view2 = parent;
            }
        }
        return false;
    }

    public final void f(int i10) {
        ViewParent viewParentC = c(i10);
        if (viewParentC != null) {
            boolean z10 = viewParentC instanceof q;
            View view = this.f2660c;
            if (z10) {
                ((q) viewParentC).b(view, i10);
            } else if (i10 == 0) {
                try {
                    v0.g(viewParentC, view);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i10 == 0) {
                this.f2658a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f2659b = null;
            }
        }
    }
}
