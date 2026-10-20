package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.w, androidx.lifecycle.g1, androidx.lifecycle.l, b4.g {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    z mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.b1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    x0 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    m0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.y mLifecycleRegistry;
    d0 mParentFragment;
    boolean mPerformedCreateView;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    b4.f mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    d0 mTarget;
    int mTargetRequestCode;
    View mView;
    p1 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    x0 mChildFragmentManager = new y0();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new s(this, 0);
    androidx.lifecycle.q mMaxState = androidx.lifecycle.q.f2173e;
    androidx.lifecycle.e0 mViewLifecycleOwnerLiveData = new androidx.lifecycle.e0();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<b0> mOnPreAttachedListeners = new ArrayList<>();
    private final b0 mSavedStateAttachListener = new t(this);

    public d0() {
        g();
    }

    @Deprecated
    public static d0 instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        x0 x0Var;
        z zVar = this.mAnimationInfo;
        if (zVar != null) {
            zVar.f2097s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (x0Var = this.mFragmentManager) == null) {
            return;
        }
        t1 t1VarG = t1.g(viewGroup, x0Var);
        t1VarG.h();
        if (z10) {
            this.mHost.f1973c.post(new j(1, this, t1VarG));
        } else {
            t1VarG.c();
        }
    }

    public j0 createFragmentContainer() {
        return new u(this);
    }

    public final z d() {
        if (this.mAnimationInfo == null) {
            z zVar = new z();
            zVar.f2087i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            zVar.f2088j = obj;
            zVar.f2089k = null;
            zVar.f2090l = obj;
            zVar.f2091m = null;
            zVar.f2092n = obj;
            zVar.f2095q = 1.0f;
            zVar.f2096r = null;
            this.mAnimationInfo = zVar;
        }
        return this.mAnimationInfo;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        d0 d0VarF = f(false);
        if (d0VarF != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(d0VarF);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            r3.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.q(l.q.j(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final int e() {
        androidx.lifecycle.q qVar = this.mMaxState;
        return (qVar == androidx.lifecycle.q.f2170b || this.mParentFragment == null) ? qVar.ordinal() : Math.min(qVar.ordinal(), this.mParentFragment.e());
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final d0 f(boolean z10) {
        String str;
        if (z10) {
            n3.b bVar = n3.c.f12142a;
            n3.f fVar = new n3.f(this, 1);
            n3.c.c(fVar);
            n3.b bVarA = n3.c.a(this);
            if (bVarA.f12140a.contains(n3.a.f12136n) && n3.c.e(bVarA, getClass(), n3.f.class)) {
                n3.c.b(bVarA, fVar);
            }
        }
        d0 d0Var = this.mTarget;
        if (d0Var != null) {
            return d0Var;
        }
        x0 x0Var = this.mFragmentManager;
        if (x0Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return x0Var.f2050c.b(str);
    }

    public d0 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f2050c.c(str);
    }

    public final void g() {
        this.mLifecycleRegistry = new androidx.lifecycle.y(this);
        this.mSavedStateRegistryController = x9.v.l(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        b0 b0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            b0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(b0Var);
        }
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    /* JADX INFO: renamed from: getActivity, reason: merged with bridge method [inline-methods] */
    public final g0 c() {
        m0 m0Var = this.mHost;
        if (m0Var == null) {
            return null;
        }
        return (g0) m0Var.f1971a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        z zVar = this.mAnimationInfo;
        if (zVar == null || (bool = zVar.f2094p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        z zVar = this.mAnimationInfo;
        if (zVar == null || (bool = zVar.f2093o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        zVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final x0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a7.a.m("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        m0 m0Var = this.mHost;
        if (m0Var == null) {
            return null;
        }
        return m0Var.f1972b;
    }

    @Override // androidx.lifecycle.l
    public q3.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        q3.d dVar = new q3.d();
        LinkedHashMap linkedHashMap = dVar.f13125a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.z0.f2212a, application);
        }
        linkedHashMap.put(androidx.lifecycle.s0.f2178a, this);
        linkedHashMap.put(androidx.lifecycle.s0.f2179b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.s0.f2180c, getArguments());
        }
        return dVar;
    }

    public androidx.lifecycle.b1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.v0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return 0;
        }
        return zVar.f2080b;
    }

    public Object getEnterTransition() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        return zVar.f2087i;
    }

    public q2.r0 getEnterTransitionCallback() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        zVar.getClass();
        return null;
    }

    public int getExitAnim() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return 0;
        }
        return zVar.f2081c;
    }

    public Object getExitTransition() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        return zVar.f2089k;
    }

    public q2.r0 getExitTransitionCallback() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        zVar.getClass();
        return null;
    }

    public View getFocusedView() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        return zVar.f2096r;
    }

    @Deprecated
    public final x0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        m0 m0Var = this.mHost;
        if (m0Var == null) {
            return null;
        }
        return ((f0) m0Var).f1906e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        m0 m0Var = this.mHost;
        if (m0Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        g0 g0Var = ((f0) m0Var).f1906e;
        LayoutInflater layoutInflaterCloneInContext = g0Var.getLayoutInflater().cloneInContext(g0Var);
        layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f2053f);
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.lifecycle.w
    public androidx.lifecycle.r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public r3.a getLoaderManager() {
        return r3.a.a(this);
    }

    public int getNextTransition() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return 0;
        }
        return zVar.f2084f;
    }

    public final d0 getParentFragment() {
        return this.mParentFragment;
    }

    public final x0 getParentFragmentManager() {
        x0 x0Var = this.mFragmentManager;
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException(a7.a.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return false;
        }
        return zVar.f2079a;
    }

    public int getPopEnterAnim() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return 0;
        }
        return zVar.f2082d;
    }

    public int getPopExitAnim() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return 0;
        }
        return zVar.f2083e;
    }

    public float getPostOnViewCreatedAlpha() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return 1.0f;
        }
        return zVar.f2095q;
    }

    public Object getReenterTransition() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        Object obj = zVar.f2090l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        n3.b bVar = n3.c.f12142a;
        n3.e eVar = new n3.e(this, 0);
        n3.c.c(eVar);
        n3.b bVarA = n3.c.a(this);
        if (bVarA.f12140a.contains(n3.a.f12134e) && n3.c.e(bVarA, getClass(), n3.e.class)) {
            n3.c.b(bVarA, eVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        Object obj = zVar.f2088j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // b4.g
    public final b4.e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f2708b;
    }

    public Object getSharedElementEnterTransition() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        return zVar.f2091m;
    }

    public Object getSharedElementReturnTransition() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return null;
        }
        Object obj = zVar.f2092n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        z zVar = this.mAnimationInfo;
        return (zVar == null || (arrayList = zVar.f2085g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        z zVar = this.mAnimationInfo;
        return (zVar == null || (arrayList = zVar.f2086h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final d0 getTargetFragment() {
        return f(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        n3.b bVar = n3.c.f12142a;
        n3.f fVar = new n3.f(this, 0);
        n3.c.c(fVar);
        n3.b bVarA = n3.c.a(this);
        if (bVarA.f12140a.contains(n3.a.f12136n) && n3.c.e(bVarA, getClass(), n3.f.class)) {
            n3.c.b(bVarA, fVar);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.w getViewLifecycleOwner() {
        p1 p1Var = this.mViewLifecycleOwner;
        if (p1Var != null) {
            return p1Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public androidx.lifecycle.c0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.g1
    public androidx.lifecycle.f1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (e() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.L.f1868c;
        androidx.lifecycle.f1 f1Var = (androidx.lifecycle.f1) map.get(this.mWho);
        if (f1Var != null) {
            return f1Var;
        }
        androidx.lifecycle.f1 f1Var2 = new androidx.lifecycle.f1();
        map.put(this.mWho, f1Var2);
        return f1Var2;
    }

    public final d.f h(e.b bVar, o.a aVar, d.c cVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(a7.a.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        y yVar = new y(this, aVar, atomicReference, bVar, cVar);
        if (this.mState >= 0) {
            yVar.a();
        } else {
            this.mOnPreAttachedListeners.add(yVar);
        }
        return new d.f(this, atomicReference, bVar, 2);
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        g();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new y0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            x0 x0Var = this.mFragmentManager;
            if (x0Var != null) {
                d0 d0Var = this.mParentFragment;
                x0Var.getClass();
                if (d0Var != null && d0Var.isHidden()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        d0 d0Var;
        return this.mMenuVisible && (this.mFragmentManager == null || (d0Var = this.mParentFragment) == null || d0Var.isMenuVisible());
    }

    public boolean isPostponed() {
        z zVar = this.mAnimationInfo;
        if (zVar == null) {
            return false;
        }
        return zVar.f2097s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        x0 x0Var = this.mFragmentManager;
        if (x0Var == null) {
            return false;
        }
        return x0Var.E || x0Var.F;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.F();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onAttachFragment(d0 d0Var) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        x0 x0Var = this.mChildFragmentManager;
        if (x0Var.f2066s >= 1) {
            return;
        }
        x0Var.E = false;
        x0Var.F = false;
        x0Var.L.f1871f = false;
        x0Var.p(1);
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.F();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
        x0 x0Var = this.mChildFragmentManager;
        x0Var.E = false;
        x0Var.F = false;
        x0Var.L.f1871f = false;
        x0Var.p(4);
    }

    public void performAttach() {
        Iterator<b0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f1972b);
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it2 = this.mFragmentManager.f2060m.iterator();
        while (it2.hasNext()) {
            ((c1) it2.next()).a(this);
        }
        x0 x0Var = this.mChildFragmentManager;
        x0Var.E = false;
        x0Var.F = false;
        x0Var.L.f1871f = false;
        x0Var.p(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        for (d0 d0Var : this.mChildFragmentManager.f2050c.f()) {
            if (d0Var != null) {
                d0Var.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.h(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.F();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new v(this));
        this.mSavedStateRegistryController.b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.p.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.i(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.F();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new p1(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f1992c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.b();
            o1.s.i0(this.mView, this.mViewLifecycleOwner);
            i1.b.F(this.mView, this.mViewLifecycleOwner);
            y3.e.C0(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.d(this.mViewLifecycleOwner);
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.j();
        this.mLifecycleRegistry.f(androidx.lifecycle.p.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.p(1);
        if (this.mView != null) {
            p1 p1Var = this.mViewLifecycleOwner;
            p1Var.b();
            if (p1Var.f1992c.f2198c.compareTo(androidx.lifecycle.q.f2171c) >= 0) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.p.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        q.a0 a0Var = r3.a.a(this).f13446b.f13444a;
        if (a0Var.f12977c <= 0) {
            this.mPerformedCreateView = false;
        } else {
            a7.a.w(a0Var.f12976b[0]);
            throw null;
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        x0 x0Var = this.mChildFragmentManager;
        if (x0Var.G) {
            return;
        }
        x0Var.j();
        this.mChildFragmentManager = new y0();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        for (d0 d0Var : this.mChildFragmentManager.f2050c.f()) {
            if (d0Var != null) {
                d0Var.performLowMemory();
            }
        }
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
        for (d0 d0Var : this.mChildFragmentManager.f2050c.f()) {
            if (d0Var != null) {
                d0Var.performMultiWindowModeChanged(z10);
            }
        }
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.l(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.p(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.p.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.p.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
        for (d0 d0Var : this.mChildFragmentManager.f2050c.f()) {
            if (d0Var != null) {
                d0Var.performPictureInPictureModeChanged(z10);
            }
        }
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.o(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zD = x0.D(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zD) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zD);
            onPrimaryNavigationFragmentChanged(zD);
            x0 x0Var = this.mChildFragmentManager;
            x0Var.S();
            x0Var.n(x0Var.f2070w);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.F();
        this.mChildFragmentManager.t(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.y yVar = this.mLifecycleRegistry;
        androidx.lifecycle.p pVar = androidx.lifecycle.p.ON_RESUME;
        yVar.f(pVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f1992c.f(pVar);
        }
        x0 x0Var = this.mChildFragmentManager;
        x0Var.E = false;
        x0Var.F = false;
        x0Var.L.f1871f = false;
        x0Var.p(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.L());
    }

    public void performStart() {
        this.mChildFragmentManager.F();
        this.mChildFragmentManager.t(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.y yVar = this.mLifecycleRegistry;
        androidx.lifecycle.p pVar = androidx.lifecycle.p.ON_START;
        yVar.f(pVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f1992c.f(pVar);
        }
        x0 x0Var = this.mChildFragmentManager;
        x0Var.E = false;
        x0Var.F = false;
        x0Var.L.f1871f = false;
        x0Var.p(5);
    }

    public void performStop() {
        x0 x0Var = this.mChildFragmentManager;
        x0Var.F = true;
        x0Var.L.f1871f = true;
        x0Var.p(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.p.ON_STOP);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.p.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.p(2);
    }

    public void postponeEnterTransition() {
        d().f2097s = true;
    }

    public final <I, O> d.d registerForActivityResult(e.b bVar, d.c cVar) {
        return h(bVar, new w(this), cVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost == null) {
            throw new IllegalStateException(a7.a.m("Fragment ", this, " not attached to Activity"));
        }
        x0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.B == null) {
            parentFragmentManager.f2067t.getClass();
            return;
        }
        parentFragmentManager.C.addLast(new u0(this.mWho, i10));
        parentFragmentManager.B.a(strArr);
    }

    public final g0 requireActivity() {
        g0 g0VarC = c();
        if (g0VarC != null) {
            return g0VarC;
        }
        throw new IllegalStateException(a7.a.m("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a7.a.m("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a7.a.m("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final x0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a7.a.m("Fragment ", this, " not attached to a host."));
    }

    public final d0 requireParentFragment() {
        d0 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(a7.a.m("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a7.a.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.K(parcelable);
        x0 x0Var = this.mChildFragmentManager;
        x0Var.E = false;
        x0Var.F = false;
        x0Var.L.f1871f = false;
        x0Var.p(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            p1 p1Var = this.mViewLifecycleOwner;
            p1Var.f1993d.b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new u1(a7.a.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.p.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        d().f2094p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        d().f2093o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        d().f2080b = i10;
        d().f2081c = i11;
        d().f2082d = i12;
        d().f2083e = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(q2.r0 r0Var) {
        d().getClass();
    }

    public void setEnterTransition(Object obj) {
        d().f2087i = obj;
    }

    public void setExitSharedElementCallback(q2.r0 r0Var) {
        d().getClass();
    }

    public void setExitTransition(Object obj) {
        d().f2089k = obj;
    }

    public void setFocusedView(View view) {
        d().f2096r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((f0) this.mHost).f1906e.invalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(c0 c0Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c0Var == null || (bundle = c0Var.f1874a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((f0) this.mHost).f1906e.invalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        d();
        this.mAnimationInfo.f2084f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        d().f2079a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        d().f2095q = f10;
    }

    public void setReenterTransition(Object obj) {
        d().f2090l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        n3.b bVar = n3.c.f12142a;
        n3.e eVar = new n3.e(this, 1);
        n3.c.c(eVar);
        n3.b bVarA = n3.c.a(this);
        if (bVarA.f12140a.contains(n3.a.f12134e) && n3.c.e(bVarA, getClass(), n3.e.class)) {
            n3.c.b(bVarA, eVar);
        }
        this.mRetainInstance = z10;
        x0 x0Var = this.mFragmentManager;
        if (x0Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            x0Var.L.b(this);
        } else {
            x0Var.L.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        d().f2088j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        d().f2091m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        d();
        z zVar = this.mAnimationInfo;
        zVar.f2085g = arrayList;
        zVar.f2086h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        d().f2092n = obj;
    }

    @Deprecated
    public void setTargetFragment(d0 d0Var, int i10) {
        if (d0Var != null) {
            n3.b bVar = n3.c.f12142a;
            n3.h hVar = new n3.h(1, this, "Attempting to set target fragment " + d0Var + " with request code " + i10 + " for fragment " + this);
            n3.c.c(hVar);
            n3.b bVarA = n3.c.a(this);
            if (bVarA.f12140a.contains(n3.a.f12136n) && n3.c.e(bVarA, getClass(), n3.h.class)) {
                n3.c.b(bVarA, hVar);
            }
        }
        x0 x0Var = this.mFragmentManager;
        x0 x0Var2 = d0Var != null ? d0Var.mFragmentManager : null;
        if (x0Var != null && x0Var2 != null && x0Var != x0Var2) {
            throw new IllegalArgumentException(a7.a.m("Fragment ", d0Var, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (d0 d0VarF = d0Var; d0VarF != null; d0VarF = d0VarF.f(false)) {
            if (d0VarF.equals(this)) {
                throw new IllegalArgumentException("Setting " + d0Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (d0Var == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || d0Var.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = d0Var;
        } else {
            this.mTargetWho = d0Var.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        n3.b bVar = n3.c.f12142a;
        n3.i iVar = new n3.i(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this);
        n3.c.c(iVar);
        n3.b bVarA = n3.c.a(this);
        if (bVarA.f12140a.contains(n3.a.f12135f) && n3.c.e(bVarA, getClass(), n3.i.class)) {
            n3.c.b(bVarA, iVar);
        }
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            x0 x0Var = this.mFragmentManager;
            e1 e1VarF = x0Var.f(this);
            d0 d0Var = e1VarF.f1899c;
            if (d0Var.mDeferStart) {
                if (x0Var.f2049b) {
                    x0Var.H = true;
                } else {
                    d0Var.mDeferStart = false;
                    e1VarF.j();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        m0 m0Var = this.mHost;
        if (m0Var == null) {
            return false;
        }
        f0 f0Var = (f0) m0Var;
        f0Var.getClass();
        int i10 = q2.h.f13081a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        g0 g0Var = f0Var.f1906e;
        if (i11 >= 32) {
            return q2.e.a(g0Var, str);
        }
        return i11 == 31 ? q2.d.b(g0Var, str) : q2.c.c(g0Var, str);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        m0 m0Var = this.mHost;
        if (m0Var == null) {
            throw new IllegalStateException(a7.a.m("Fragment ", this, " not attached to Activity"));
        }
        r2.k.startActivity(m0Var.f1972b, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(a7.a.m("Fragment ", this, " not attached to Activity"));
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        x0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.A == null) {
            m0 m0Var = parentFragmentManager.f2067t;
            if (i10 != -1) {
                m0Var.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            Activity activity = m0Var.f1971a;
            int i14 = q2.h.f13081a;
            q2.a.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        d7.a.m(intentSender, "intentSender");
        d.k kVar = new d.k(intentSender, intent2, i11, i12);
        parentFragmentManager.C.addLast(new u0(this.mWho, i10));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.A.a(kVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !d().f2097s) {
            return;
        }
        if (this.mHost == null) {
            d().f2097s = false;
        } else if (Looper.myLooper() != this.mHost.f1973c.getLooper()) {
            this.mHost.f1973c.postAtFrontOfQueue(new s(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static d0 instantiate(Context context, String str, Bundle bundle) {
        try {
            d0 d0Var = (d0) s0.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(d0Var.getClass().getClassLoader());
                d0Var.setArguments(bundle);
            }
            return d0Var;
        } catch (IllegalAccessException e4) {
            throw new a0(l.q.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e10) {
            throw new a0(l.q.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new a0(l.q.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new a0(l.q.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        m0 m0Var = this.mHost;
        Activity activity = m0Var == null ? null : m0Var.f1971a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        m0 m0Var = this.mHost;
        Activity activity = m0Var == null ? null : m0Var.f1971a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        d().f2097s = true;
        x0 x0Var = this.mFragmentManager;
        Handler handler = x0Var != null ? x0Var.f2067t.f1973c : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> d.d registerForActivityResult(e.b bVar, d.i iVar, d.c cVar) {
        return h(bVar, new x(this, iVar), cVar);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(a7.a.m("Fragment ", this, " not attached to Activity"));
        }
        x0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f2073z == null) {
            m0 m0Var = parentFragmentManager.f2067t;
            if (i10 == -1) {
                r2.k.startActivity(m0Var.f1972b, intent, bundle);
                return;
            } else {
                m0Var.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        parentFragmentManager.C.addLast(new u0(this.mWho, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        parentFragmentManager.f2073z.a(intent);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }
}
