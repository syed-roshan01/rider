package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f1986a;

    public o0(x0 x0Var) {
        this.f1986a = x0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        e1 e1VarF;
        boolean zEquals = k0.class.getName().equals(str);
        x0 x0Var = this.f1986a;
        if (zEquals) {
            return new k0(context, attributeSet, x0Var);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m3.a.f11826a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                if (d0.class.isAssignableFrom(s0.a(context.getClassLoader(), attributeValue))) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    d0 d0VarV = resourceId != -1 ? x0Var.v(resourceId) : null;
                    if (d0VarV == null && string != null) {
                        d0VarV = x0Var.w(string);
                    }
                    if (d0VarV == null && id != -1) {
                        d0VarV = x0Var.v(id);
                    }
                    if (d0VarV == null) {
                        s0 s0VarZ = x0Var.z();
                        context.getClassLoader();
                        d0VarV = d0.instantiate(s0VarZ.f2022a.f2067t.f1972b, attributeValue, null);
                        d0VarV.mFromLayout = true;
                        d0VarV.mFragmentId = resourceId != 0 ? resourceId : id;
                        d0VarV.mContainerId = id;
                        d0VarV.mTag = string;
                        d0VarV.mInLayout = true;
                        d0VarV.mFragmentManager = x0Var;
                        m0 m0Var = x0Var.f2067t;
                        d0VarV.mHost = m0Var;
                        d0VarV.onInflate(m0Var.f1972b, attributeSet, d0VarV.mSavedFragmentState);
                        e1VarF = x0Var.a(d0VarV);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Fragment " + d0VarV + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (d0VarV.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        d0VarV.mInLayout = true;
                        d0VarV.mFragmentManager = x0Var;
                        m0 m0Var2 = x0Var.f2067t;
                        d0VarV.mHost = m0Var2;
                        d0VarV.onInflate(m0Var2.f1972b, attributeSet, d0VarV.mSavedFragmentState);
                        e1VarF = x0Var.f(d0VarV);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Retained Fragment " + d0VarV + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    n3.b bVar = n3.c.f12142a;
                    n3.d dVar = new n3.d(d0VarV, viewGroup, 0);
                    n3.c.c(dVar);
                    n3.b bVarA = n3.c.a(d0VarV);
                    if (bVarA.f12140a.contains(n3.a.f12133d) && n3.c.e(bVarA, d0VarV.getClass(), n3.d.class)) {
                        n3.c.b(bVarA, dVar);
                    }
                    d0VarV.mContainer = viewGroup;
                    e1VarF.j();
                    e1VarF.i();
                    View view2 = d0VarV.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(l.q.k("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (d0VarV.mView.getTag() == null) {
                        d0VarV.mView.setTag(string);
                    }
                    d0VarV.mView.addOnAttachStateChangeListener(new n0(this, e1VarF));
                    return d0VarV.mView;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }
}
