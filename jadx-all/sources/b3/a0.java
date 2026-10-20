package b3;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f2594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2596d;

    public a0(int i10, Class cls, int i11, int i12) {
        this.f2593a = i10;
        this.f2594b = cls;
        this.f2596d = i11;
        this.f2595c = i12;
    }

    public final Object a(View view) {
        if (Build.VERSION.SDK_INT < this.f2595c) {
            Object tag = view.getTag(this.f2593a);
            if (this.f2594b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        int i10 = ((y) this).f2688e;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(l0.d(view));
                    default:
                        return Boolean.valueOf(l0.c(view));
                }
            case 1:
                switch (i10) {
                    case 1:
                        return l0.b(view);
                    default:
                        return n0.b(view);
                }
            case 2:
                switch (i10) {
                    case 1:
                        return l0.b(view);
                    default:
                        return n0.b(view);
                }
            default:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(l0.d(view));
                    default:
                        return Boolean.valueOf(l0.c(view));
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0065. Please report as an issue. */
    public final void b(View view, Object obj) {
        boolean zEquals;
        boolean z10;
        if (Build.VERSION.SDK_INT >= this.f2595c) {
            int i10 = ((y) this).f2688e;
            switch (i10) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i10) {
                        case 0:
                            l0.j(view, bool.booleanValue());
                            break;
                        default:
                            l0.g(view, bool.booleanValue());
                            break;
                    }
                    break;
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i10) {
                        case 1:
                            l0.h(view, charSequence);
                            break;
                        default:
                            n0.e(view, charSequence);
                            break;
                    }
                    break;
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i10) {
                        case 1:
                            l0.h(view, charSequence2);
                            break;
                        default:
                            n0.e(view, charSequence2);
                            break;
                    }
                    break;
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i10) {
                        case 0:
                            l0.j(view, bool2.booleanValue());
                            break;
                        default:
                            l0.g(view, bool2.booleanValue());
                            break;
                    }
                    break;
            }
        }
        Object objA = a(view);
        boolean z11 = false;
        int i11 = ((y) this).f2688e;
        switch (i11) {
            case 0:
                Boolean bool3 = (Boolean) objA;
                Boolean bool4 = (Boolean) obj;
                switch (i11) {
                    case 0:
                        if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                            z11 = true;
                        }
                        break;
                    default:
                        if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                            z11 = true;
                        }
                        break;
                }
                z10 = !z11;
                break;
            case 1:
                CharSequence charSequence3 = (CharSequence) objA;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i11) {
                    case 1:
                        zEquals = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        zEquals = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
                z10 = !zEquals;
                break;
            case 2:
                CharSequence charSequence5 = (CharSequence) objA;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i11) {
                    case 1:
                        zEquals = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        zEquals = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
                z10 = !zEquals;
                break;
            default:
                Boolean bool5 = (Boolean) objA;
                Boolean bool6 = (Boolean) obj;
                switch (i11) {
                    case 0:
                        if ((bool5 != null && bool5.booleanValue()) == (bool6 != null && bool6.booleanValue())) {
                            z11 = true;
                        }
                        break;
                    default:
                        if ((bool5 != null && bool5.booleanValue()) == (bool6 != null && bool6.booleanValue())) {
                            z11 = true;
                        }
                        break;
                }
                z10 = !z11;
                break;
        }
        if (z10) {
            View.AccessibilityDelegate accessibilityDelegateA = q0.a(view);
            c cVar = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof a ? ((a) accessibilityDelegateA).f2592a : new c(accessibilityDelegateA);
            if (cVar == null) {
                cVar = new c();
            }
            q0.d(view, cVar);
            view.setTag(this.f2593a, obj);
            q0.b(view, this.f2596d);
        }
    }
}
