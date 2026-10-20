package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f1897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f1898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f1899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1900d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1901e = -1;

    public e1(x xVar, f1 f1Var, d0 d0Var) {
        this.f1897a = xVar;
        this.f1898b = f1Var;
        this.f1899c = d0Var;
    }

    public final void a() {
        View view;
        View view2;
        f1 f1Var = this.f1898b;
        f1Var.getClass();
        d0 d0Var = this.f1899c;
        ViewGroup viewGroup = d0Var.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = f1Var.f1907a;
            int iIndexOf = arrayList.indexOf(d0Var);
            for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
                d0 d0Var2 = (d0) arrayList.get(i10);
                if (d0Var2.mContainer == viewGroup && (view2 = d0Var2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                d0 d0Var3 = (d0) arrayList.get(iIndexOf);
                if (d0Var3.mContainer == viewGroup && (view = d0Var3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        d0Var.mContainer.addView(d0Var.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        d0 d0Var = this.f1899c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + d0Var);
        }
        d0 d0Var2 = d0Var.mTarget;
        e1 e1Var = null;
        f1 f1Var = this.f1898b;
        if (d0Var2 != null) {
            e1 e1Var2 = (e1) f1Var.f1908b.get(d0Var2.mWho);
            if (e1Var2 == null) {
                throw new IllegalStateException("Fragment " + d0Var + " declared target fragment " + d0Var.mTarget + " that does not belong to this FragmentManager!");
            }
            d0Var.mTargetWho = d0Var.mTarget.mWho;
            d0Var.mTarget = null;
            e1Var = e1Var2;
        } else {
            String str = d0Var.mTargetWho;
            if (str != null && (e1Var = (e1) f1Var.f1908b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(d0Var);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(a7.a.p(sb, d0Var.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (e1Var != null) {
            e1Var.j();
        }
        x0 x0Var = d0Var.mFragmentManager;
        d0Var.mHost = x0Var.f2067t;
        d0Var.mParentFragment = x0Var.f2069v;
        x xVar = this.f1897a;
        xVar.g(false);
        d0Var.performAttach();
        xVar.b(false);
    }

    public final int c() {
        s1 s1Var;
        d0 d0Var = this.f1899c;
        if (d0Var.mFragmentManager == null) {
            return d0Var.mState;
        }
        int iMin = this.f1901e;
        int iOrdinal = d0Var.mMaxState.ordinal();
        int i10 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (d0Var.mFromLayout) {
            if (d0Var.mInLayout) {
                iMin = Math.max(this.f1901e, 2);
                View view = d0Var.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1901e < 4 ? Math.min(iMin, d0Var.mState) : Math.min(iMin, 1);
            }
        }
        if (!d0Var.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = d0Var.mContainer;
        if (viewGroup != null) {
            t1 t1VarG = t1.g(viewGroup, d0Var.getParentFragmentManager());
            t1VarG.getClass();
            s1 s1VarD = t1VarG.d(d0Var);
            i10 = s1VarD != null ? s1VarD.f2024b : 0;
            Iterator it = t1VarG.f2035c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    s1Var = null;
                    break;
                }
                s1Var = (s1) it.next();
                if (s1Var.f2025c.equals(d0Var) && !s1Var.f2028f) {
                    break;
                }
            }
            if (s1Var != null && (i10 == 0 || i10 == 1)) {
                i10 = s1Var.f2024b;
            }
        }
        if (i10 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i10 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (d0Var.mRemoving) {
            iMin = d0Var.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (d0Var.mDeferStart && d0Var.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + d0Var);
        }
        return iMin;
    }

    public final void d() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        d0 d0Var = this.f1899c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + d0Var);
        }
        if (d0Var.mIsCreated) {
            d0Var.restoreChildFragmentState(d0Var.mSavedFragmentState);
            d0Var.mState = 1;
        } else {
            x xVar = this.f1897a;
            xVar.h(false);
            d0Var.performCreate(d0Var.mSavedFragmentState);
            xVar.c(false);
        }
    }

    public final void e() {
        String resourceName;
        d0 d0Var = this.f1899c;
        if (d0Var.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + d0Var);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = d0Var.performGetLayoutInflater(d0Var.mSavedFragmentState);
        ViewGroup viewGroup = d0Var.mContainer;
        if (viewGroup == null) {
            int i10 = d0Var.mContainerId;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException(a7.a.m("Cannot create fragment ", d0Var, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) d0Var.mFragmentManager.f2068u.b(i10);
                if (viewGroup == null) {
                    if (!d0Var.mRestored) {
                        try {
                            resourceName = d0Var.getResources().getResourceName(d0Var.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(d0Var.mContainerId) + " (" + resourceName + ") for fragment " + d0Var);
                    }
                } else if (!(viewGroup instanceof k0)) {
                    n3.b bVar = n3.c.f12142a;
                    n3.d dVar = new n3.d(d0Var, viewGroup, 1);
                    n3.c.c(dVar);
                    n3.b bVarA = n3.c.a(d0Var);
                    if (bVarA.f12140a.contains(n3.a.f12137o) && n3.c.e(bVarA, d0Var.getClass(), n3.d.class)) {
                        n3.c.b(bVarA, dVar);
                    }
                }
            }
        }
        d0Var.mContainer = viewGroup;
        d0Var.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, d0Var.mSavedFragmentState);
        View view = d0Var.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            d0Var.mView.setTag(R.id.fragment_container_view_tag, d0Var);
            if (viewGroup != null) {
                a();
            }
            if (d0Var.mHidden) {
                d0Var.mView.setVisibility(8);
            }
            View view2 = d0Var.mView;
            Field field = b3.q0.f2670a;
            if (b3.e0.b(view2)) {
                b3.f0.c(d0Var.mView);
            } else {
                View view3 = d0Var.mView;
                view3.addOnAttachStateChangeListener(new n0(this, view3));
            }
            d0Var.performViewCreated();
            this.f1897a.m(false);
            int visibility = d0Var.mView.getVisibility();
            d0Var.setPostOnViewCreatedAlpha(d0Var.mView.getAlpha());
            if (d0Var.mContainer != null && visibility == 0) {
                View viewFindFocus = d0Var.mView.findFocus();
                if (viewFindFocus != null) {
                    d0Var.setFocusedView(viewFindFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + d0Var);
                    }
                }
                d0Var.mView.setAlpha(0.0f);
            }
        }
        d0Var.mState = 2;
    }

    public final void f() {
        d0 d0VarB;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        d0 d0Var = this.f1899c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + d0Var);
        }
        boolean zIsChangingConfigurations = true;
        boolean z10 = d0Var.mRemoving && !d0Var.isInBackStack();
        f1 f1Var = this.f1898b;
        if (z10 && !d0Var.mBeingSaved) {
        }
        if (!z10) {
            b1 b1Var = f1Var.f1910d;
            if (b1Var.f1866a.containsKey(d0Var.mWho) && b1Var.f1869d && !b1Var.f1870e) {
                String str = d0Var.mTargetWho;
                if (str != null && (d0VarB = f1Var.b(str)) != null && d0VarB.mRetainInstance) {
                    d0Var.mTarget = d0VarB;
                }
                d0Var.mState = 0;
                return;
            }
        }
        m0 m0Var = d0Var.mHost;
        if (m0Var instanceof androidx.lifecycle.g1) {
            zIsChangingConfigurations = f1Var.f1910d.f1870e;
        } else {
            Context context = m0Var.f1972b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z10 && !d0Var.mBeingSaved) || zIsChangingConfigurations) {
            f1Var.f1910d.c(d0Var);
        }
        d0Var.performDestroy();
        this.f1897a.d(false);
        for (e1 e1Var : f1Var.d()) {
            if (e1Var != null) {
                String str2 = d0Var.mWho;
                d0 d0Var2 = e1Var.f1899c;
                if (str2.equals(d0Var2.mTargetWho)) {
                    d0Var2.mTarget = d0Var;
                    d0Var2.mTargetWho = null;
                }
            }
        }
        String str3 = d0Var.mTargetWho;
        if (str3 != null) {
            d0Var.mTarget = f1Var.b(str3);
        }
        f1Var.h(this);
    }

    public final void g() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        d0 d0Var = this.f1899c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + d0Var);
        }
        ViewGroup viewGroup = d0Var.mContainer;
        if (viewGroup != null && (view = d0Var.mView) != null) {
            viewGroup.removeView(view);
        }
        d0Var.performDestroyView();
        this.f1897a.n(false);
        d0Var.mContainer = null;
        d0Var.mView = null;
        d0Var.mViewLifecycleOwner = null;
        d0Var.mViewLifecycleOwnerLiveData.d(null);
        d0Var.mInLayout = false;
    }

    public final void h() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        d0 d0Var = this.f1899c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + d0Var);
        }
        d0Var.performDetach();
        this.f1897a.e(false);
        d0Var.mState = -1;
        d0Var.mHost = null;
        d0Var.mParentFragment = null;
        d0Var.mFragmentManager = null;
        if (!d0Var.mRemoving || d0Var.isInBackStack()) {
            b1 b1Var = this.f1898b.f1910d;
            if (b1Var.f1866a.containsKey(d0Var.mWho) && b1Var.f1869d && !b1Var.f1870e) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + d0Var);
        }
        d0Var.initState();
    }

    public final void i() {
        d0 d0Var = this.f1899c;
        if (d0Var.mFromLayout && d0Var.mInLayout && !d0Var.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + d0Var);
            }
            d0Var.performCreateView(d0Var.performGetLayoutInflater(d0Var.mSavedFragmentState), null, d0Var.mSavedFragmentState);
            View view = d0Var.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                d0Var.mView.setTag(R.id.fragment_container_view_tag, d0Var);
                if (d0Var.mHidden) {
                    d0Var.mView.setVisibility(8);
                }
                d0Var.performViewCreated();
                this.f1897a.m(false);
                d0Var.mState = 2;
            }
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f1900d;
        d0 d0Var = this.f1899c;
        if (z10) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + d0Var);
                return;
            }
            return;
        }
        try {
            this.f1900d = true;
            boolean z11 = false;
            while (true) {
                int iC = c();
                int i10 = d0Var.mState;
                f1 f1Var = this.f1898b;
                if (iC == i10) {
                    if (!z11 && i10 == -1 && d0Var.mRemoving && !d0Var.isInBackStack() && !d0Var.mBeingSaved) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + d0Var);
                        }
                        f1Var.f1910d.c(d0Var);
                        f1Var.h(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + d0Var);
                        }
                        d0Var.initState();
                    }
                    if (d0Var.mHiddenChanged) {
                        if (d0Var.mView != null && (viewGroup = d0Var.mContainer) != null) {
                            t1 t1VarG = t1.g(viewGroup, d0Var.getParentFragmentManager());
                            if (d0Var.mHidden) {
                                t1VarG.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + d0Var);
                                }
                                t1VarG.a(3, 1, this);
                            } else {
                                t1VarG.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + d0Var);
                                }
                                t1VarG.a(2, 1, this);
                            }
                        }
                        x0 x0Var = d0Var.mFragmentManager;
                        if (x0Var != null && d0Var.mAdded && x0.C(d0Var)) {
                            x0Var.D = true;
                        }
                        d0Var.mHiddenChanged = false;
                        d0Var.onHiddenChanged(d0Var.mHidden);
                        d0Var.mChildFragmentManager.k();
                    }
                    return;
                }
                x xVar = this.f1897a;
                if (iC <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            if (d0Var.mBeingSaved) {
                                if (((d1) f1Var.f1909c.get(d0Var.mWho)) == null) {
                                    m();
                                }
                            }
                            f();
                            break;
                        case 1:
                            g();
                            d0Var.mState = 1;
                            break;
                        case 2:
                            d0Var.mInLayout = false;
                            d0Var.mState = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + d0Var);
                            }
                            if (d0Var.mBeingSaved) {
                                m();
                            } else if (d0Var.mView != null && d0Var.mSavedViewState == null) {
                                n();
                            }
                            if (d0Var.mView != null && (viewGroup2 = d0Var.mContainer) != null) {
                                t1 t1VarG2 = t1.g(viewGroup2, d0Var.getParentFragmentManager());
                                t1VarG2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + d0Var);
                                }
                                t1VarG2.a(1, 3, this);
                            }
                            d0Var.mState = 3;
                            break;
                        case 4:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + d0Var);
                            }
                            d0Var.performStop();
                            xVar.l(false);
                            break;
                        case 5:
                            d0Var.mState = 5;
                            break;
                        case 6:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + d0Var);
                            }
                            d0Var.performPause();
                            xVar.f(false);
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + d0Var);
                            }
                            d0Var.performActivityCreated(d0Var.mSavedFragmentState);
                            xVar.a(false);
                            break;
                        case 4:
                            if (d0Var.mView != null && (viewGroup3 = d0Var.mContainer) != null) {
                                t1 t1VarG3 = t1.g(viewGroup3, d0Var.getParentFragmentManager());
                                int iC2 = a7.a.c(d0Var.mView.getVisibility());
                                t1VarG3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + d0Var);
                                }
                                t1VarG3.a(iC2, 2, this);
                            }
                            d0Var.mState = 4;
                            break;
                        case 5:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + d0Var);
                            }
                            d0Var.performStart();
                            xVar.k(false);
                            break;
                        case 6:
                            d0Var.mState = 6;
                            break;
                        case 7:
                            l();
                            break;
                    }
                }
                z11 = true;
            }
        } finally {
            this.f1900d = false;
        }
    }

    public final void k(ClassLoader classLoader) {
        d0 d0Var = this.f1899c;
        Bundle bundle = d0Var.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        d0Var.mSavedViewState = d0Var.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        d0Var.mSavedViewRegistryState = d0Var.mSavedFragmentState.getBundle("android:view_registry_state");
        d0Var.mTargetWho = d0Var.mSavedFragmentState.getString("android:target_state");
        if (d0Var.mTargetWho != null) {
            d0Var.mTargetRequestCode = d0Var.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = d0Var.mSavedUserVisibleHint;
        if (bool != null) {
            d0Var.mUserVisibleHint = bool.booleanValue();
            d0Var.mSavedUserVisibleHint = null;
        } else {
            d0Var.mUserVisibleHint = d0Var.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (d0Var.mUserVisibleHint) {
            return;
        }
        d0Var.mDeferStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public final void l() {
        boolean zRequestFocus;
        String str;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        d0 d0Var = this.f1899c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + d0Var);
        }
        View focusedView = d0Var.getFocusedView();
        if (focusedView != null) {
            if (focusedView == d0Var.mView) {
                zRequestFocus = focusedView.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(d0Var);
                    sb.append(" resulting in focused view ");
                    sb.append(d0Var.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == d0Var.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                zRequestFocus = focusedView.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(d0Var);
                    sb2.append(" resulting in focused view ");
                    sb2.append(d0Var.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        d0Var.setFocusedView(null);
        d0Var.performResume();
        this.f1897a.i(false);
        d0Var.mSavedFragmentState = null;
        d0Var.mSavedViewState = null;
        d0Var.mSavedViewRegistryState = null;
    }

    public final void m() {
        d0 d0Var = this.f1899c;
        d1 d1Var = new d1(d0Var);
        if (d0Var.mState <= -1 || d1Var.f1892t != null) {
            d1Var.f1892t = d0Var.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            d0Var.performSaveInstanceState(bundle);
            this.f1897a.j(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (d0Var.mView != null) {
                n();
            }
            if (d0Var.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", d0Var.mSavedViewState);
            }
            if (d0Var.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", d0Var.mSavedViewRegistryState);
            }
            if (!d0Var.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", d0Var.mUserVisibleHint);
            }
            d1Var.f1892t = bundle;
            if (d0Var.mTargetWho != null) {
                if (bundle == null) {
                    d1Var.f1892t = new Bundle();
                }
                d1Var.f1892t.putString("android:target_state", d0Var.mTargetWho);
                int i10 = d0Var.mTargetRequestCode;
                if (i10 != 0) {
                    d1Var.f1892t.putInt("android:target_req_state", i10);
                }
            }
        }
    }

    public final void n() {
        d0 d0Var = this.f1899c;
        if (d0Var.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + d0Var + " with view " + d0Var.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        d0Var.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            d0Var.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        d0Var.mViewLifecycleOwner.f1993d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        d0Var.mSavedViewRegistryState = bundle;
    }

    public e1(x xVar, f1 f1Var, ClassLoader classLoader, s0 s0Var, d1 d1Var) {
        this.f1897a = xVar;
        this.f1898b = f1Var;
        d0 d0VarInstantiate = d0.instantiate(s0Var.f2022a.f2067t.f1972b, d1Var.f1880a, null);
        Bundle bundle = d1Var.f1889q;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        d0VarInstantiate.setArguments(bundle);
        d0VarInstantiate.mWho = d1Var.f1881b;
        d0VarInstantiate.mFromLayout = d1Var.f1882c;
        d0VarInstantiate.mRestored = true;
        d0VarInstantiate.mFragmentId = d1Var.f1883d;
        d0VarInstantiate.mContainerId = d1Var.f1884e;
        d0VarInstantiate.mTag = d1Var.f1885f;
        d0VarInstantiate.mRetainInstance = d1Var.f1886n;
        d0VarInstantiate.mRemoving = d1Var.f1887o;
        d0VarInstantiate.mDetached = d1Var.f1888p;
        d0VarInstantiate.mHidden = d1Var.f1890r;
        d0VarInstantiate.mMaxState = androidx.lifecycle.q.values()[d1Var.f1891s];
        Bundle bundle2 = d1Var.f1892t;
        if (bundle2 != null) {
            d0VarInstantiate.mSavedFragmentState = bundle2;
        } else {
            d0VarInstantiate.mSavedFragmentState = new Bundle();
        }
        this.f1899c = d0VarInstantiate;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + d0VarInstantiate);
        }
    }

    public e1(x xVar, f1 f1Var, d0 d0Var, d1 d1Var) {
        this.f1897a = xVar;
        this.f1898b = f1Var;
        this.f1899c = d0Var;
        d0Var.mSavedViewState = null;
        d0Var.mSavedViewRegistryState = null;
        d0Var.mBackStackNesting = 0;
        d0Var.mInLayout = false;
        d0Var.mAdded = false;
        d0 d0Var2 = d0Var.mTarget;
        d0Var.mTargetWho = d0Var2 != null ? d0Var2.mWho : null;
        d0Var.mTarget = null;
        Bundle bundle = d1Var.f1892t;
        if (bundle != null) {
            d0Var.mSavedFragmentState = bundle;
        } else {
            d0Var.mSavedFragmentState = new Bundle();
        }
    }
}
