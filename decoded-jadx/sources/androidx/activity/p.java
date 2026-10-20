package androidx.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r0;
import androidx.lifecycle.b1;
import androidx.lifecycle.f1;
import androidx.lifecycle.g1;
import androidx.lifecycle.n0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.z0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ride.accepter.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import q2.o0;
import q2.p0;
import q2.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends q2.m implements g1, androidx.lifecycle.l, b4.g, k0, d.j, r2.n, r2.o, o0, p0, b3.i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final d.i mActivityResultRegistry;
    private int mContentLayoutId;
    private b1 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final x mFullyDrawnReporter;
    private final b3.m mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private i0 mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<a3.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<a3.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<a3.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<a3.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<a3.a> mOnTrimMemoryListeners;
    final n mReportFullyDrawnExecutor;
    final b4.f mSavedStateRegistryController;
    private f1 mViewModelStore;
    final c.a mContextAwareHelper = new c.a();
    private final androidx.lifecycle.y mLifecycleRegistry = new androidx.lifecycle.y(this);

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.activity.e] */
    public p() {
        int i10 = 0;
        this.mMenuHostHelper = new b3.m(new d(this, i10));
        b4.f fVarL = x9.v.l(this);
        this.mSavedStateRegistryController = fVarL;
        this.mOnBackPressedDispatcher = null;
        o oVar = new o(this);
        this.mReportFullyDrawnExecutor = oVar;
        this.mFullyDrawnReporter = new x(oVar, new c9.a() { // from class: androidx.activity.e
            @Override // c9.a
            public final Object invoke() {
                this.f1376a.reportFullyDrawn();
                return null;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new i(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new j(this, 1));
        getLifecycle().a(new j(this, i10));
        getLifecycle().a(new j(this, 2));
        fVarL.a();
        s0.c(this);
        getSavedStateRegistry().d(ACTIVITY_RESULT_TAG, new f(this, 0));
        addOnContextAvailableListener(new g(this, 0));
    }

    public static Bundle a(p pVar) {
        pVar.getClass();
        Bundle bundle = new Bundle();
        d.i iVar = pVar.mActivityResultRegistry;
        iVar.getClass();
        HashMap map = iVar.f4308b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f4310d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) iVar.f4313g.clone());
        return bundle;
    }

    public static void b(p pVar) {
        Bundle bundleA = pVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            d.i iVar = pVar.mActivityResultRegistry;
            iVar.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            iVar.f4310d = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = iVar.f4313g;
            bundle2.putAll(bundle);
            for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                String str = stringArrayList.get(i10);
                HashMap map = iVar.f4308b;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = iVar.f4307a;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                int iIntValue = integerArrayList.get(i10).intValue();
                String str2 = stringArrayList.get(i10);
                map2.put(Integer.valueOf(iIntValue), str2);
                map.put(str2, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.q(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // b3.i
    public void addMenuProvider(b3.o oVar) {
        b3.m mVar = this.mMenuHostHelper;
        mVar.f2645b.add(oVar);
        mVar.f2644a.run();
    }

    @Override // r2.n
    public final void addOnConfigurationChangedListener(a3.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(c.b bVar) {
        c.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        d7.a.m(bVar, "listener");
        Context context = aVar.f2841b;
        if (context != null) {
            bVar.a(context);
        }
        aVar.f2840a.add(bVar);
    }

    @Override // q2.o0
    public final void addOnMultiWindowModeChangedListener(a3.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(a3.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // q2.p0
    public final void addOnPictureInPictureModeChangedListener(a3.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // r2.o
    public final void addOnTrimMemoryListener(a3.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            m mVar = (m) getLastNonConfigurationInstance();
            if (mVar != null) {
                this.mViewModelStore = mVar.f1411b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new f1();
            }
        }
    }

    @Override // d.j
    public final d.i getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.l
    public q3.c getDefaultViewModelCreationExtras() {
        q3.d dVar = new q3.d();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f13125a;
        if (application != null) {
            linkedHashMap.put(z0.f2212a, getApplication());
        }
        linkedHashMap.put(s0.f2178a, this);
        linkedHashMap.put(s0.f2179b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(s0.f2180c, getIntent().getExtras());
        }
        return dVar;
    }

    public b1 getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new v0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public x getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        m mVar = (m) getLastNonConfigurationInstance();
        if (mVar != null) {
            return mVar.f1410a;
        }
        return null;
    }

    @Override // androidx.lifecycle.w
    public androidx.lifecycle.r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.k0
    public final i0 getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new i0(new k(this));
            getLifecycle().a(new j(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // b4.g
    public final b4.e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f2708b;
    }

    @Override // androidx.lifecycle.g1
    public f1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        o1.s.i0(getWindow().getDecorView(), this);
        i1.b.F(getWindow().getDecorView(), this);
        y3.e.C0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        d7.a.m(decorView, "<this>");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView2 = getWindow().getDecorView();
        d7.a.m(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<a3.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // q2.m, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        c.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        aVar.f2841b = this;
        Iterator it = aVar.f2840a.iterator();
        while (it.hasNext()) {
            ((c.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = n0.f2158b;
        x9.v.y(this);
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        b3.m mVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = mVar.f2645b.iterator();
        while (it.hasNext()) {
            ((r0) ((b3.o) it.next())).f2015a.i(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<a3.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new q2.o(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<a3.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator it = this.mMenuHostHelper.f2645b.iterator();
        while (it.hasNext()) {
            ((r0) ((b3.o) it.next())).f2015a.m(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<a3.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new q0(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = this.mMenuHostHelper.f2645b.iterator();
        while (it.hasNext()) {
            ((r0) ((b3.o) it.next())).f2015a.o(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        m mVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        f1 f1Var = this.mViewModelStore;
        if (f1Var == null && (mVar = (m) getLastNonConfigurationInstance()) != null) {
            f1Var = mVar.f1411b;
        }
        if (f1Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        m mVar2 = new m();
        mVar2.f1410a = objOnRetainCustomNonConfigurationInstance;
        mVar2.f1411b = f1Var;
        return mVar2;
    }

    @Override // q2.m, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.r lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) lifecycle).h();
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<a3.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f2841b;
    }

    public final <I, O> d.d registerForActivityResult(e.b bVar, d.i iVar, d.c cVar) {
        return iVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, bVar, cVar);
    }

    @Override // b3.i
    public void removeMenuProvider(b3.o oVar) {
        this.mMenuHostHelper.b(oVar);
    }

    @Override // r2.n
    public final void removeOnConfigurationChangedListener(a3.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(c.b bVar) {
        c.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        d7.a.m(bVar, "listener");
        aVar.f2840a.remove(bVar);
    }

    @Override // q2.o0
    public final void removeOnMultiWindowModeChangedListener(a3.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(a3.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // q2.p0
    public final void removeOnPictureInPictureModeChangedListener(a3.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // r2.o
    public final void removeOnTrimMemoryListener(a3.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (f6.a.V()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            x xVar = this.mFullyDrawnReporter;
            synchronized (xVar.f1425b) {
                try {
                    xVar.f1426c = true;
                    Iterator it = xVar.f1427d.iterator();
                    while (it.hasNext()) {
                        ((c9.a) it.next()).invoke();
                    }
                    xVar.f1427d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.q(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<a3.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new q2.o(z10, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<a3.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new q0(z10, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public void addMenuProvider(final b3.o oVar, androidx.lifecycle.w wVar) {
        final b3.m mVar = this.mMenuHostHelper;
        mVar.f2645b.add(oVar);
        mVar.f2644a.run();
        androidx.lifecycle.r lifecycle = wVar.getLifecycle();
        HashMap map = mVar.f2646c;
        b3.l lVar = (b3.l) map.remove(oVar);
        if (lVar != null) {
            lVar.f2640a.c(lVar.f2641b);
            lVar.f2641b = null;
        }
        map.put(oVar, new b3.l(lifecycle, new androidx.lifecycle.u() { // from class: b3.j
            @Override // androidx.lifecycle.u
            public final void onStateChanged(androidx.lifecycle.w wVar2, androidx.lifecycle.p pVar) {
                androidx.lifecycle.p pVar2 = androidx.lifecycle.p.ON_DESTROY;
                m mVar2 = mVar;
                if (pVar == pVar2) {
                    mVar2.b(oVar);
                } else {
                    mVar2.getClass();
                }
            }
        }));
    }

    public final <I, O> d.d registerForActivityResult(e.b bVar, d.c cVar) {
        return registerForActivityResult(bVar, this.mActivityResultRegistry, cVar);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.q(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.q(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final b3.o oVar, androidx.lifecycle.w wVar, final androidx.lifecycle.q qVar) {
        final b3.m mVar = this.mMenuHostHelper;
        mVar.getClass();
        androidx.lifecycle.r lifecycle = wVar.getLifecycle();
        HashMap map = mVar.f2646c;
        b3.l lVar = (b3.l) map.remove(oVar);
        if (lVar != null) {
            lVar.f2640a.c(lVar.f2641b);
            lVar.f2641b = null;
        }
        map.put(oVar, new b3.l(lifecycle, new androidx.lifecycle.u() { // from class: b3.k
            @Override // androidx.lifecycle.u
            public final void onStateChanged(androidx.lifecycle.w wVar2, androidx.lifecycle.p pVar) {
                androidx.lifecycle.p pVar2;
                m mVar2 = mVar;
                mVar2.getClass();
                androidx.lifecycle.p.Companion.getClass();
                androidx.lifecycle.q qVar2 = qVar;
                d7.a.m(qVar2, RemoteConfigConstants.ResponseFieldKey.STATE);
                int iOrdinal = qVar2.ordinal();
                if (iOrdinal == 2) {
                    pVar2 = androidx.lifecycle.p.ON_CREATE;
                } else if (iOrdinal != 3) {
                    pVar2 = iOrdinal != 4 ? null : androidx.lifecycle.p.ON_RESUME;
                } else {
                    pVar2 = androidx.lifecycle.p.ON_START;
                }
                Runnable runnable = mVar2.f2644a;
                CopyOnWriteArrayList copyOnWriteArrayList = mVar2.f2645b;
                o oVar2 = oVar;
                if (pVar == pVar2) {
                    copyOnWriteArrayList.add(oVar2);
                    runnable.run();
                } else if (pVar == androidx.lifecycle.p.ON_DESTROY) {
                    mVar2.b(oVar2);
                } else if (pVar == androidx.lifecycle.n.a(qVar2)) {
                    copyOnWriteArrayList.remove(oVar2);
                    runnable.run();
                }
            }
        }));
    }
}
