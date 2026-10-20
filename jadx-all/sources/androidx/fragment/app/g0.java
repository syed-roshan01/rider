package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends androidx.activity.p implements q2.f, q2.g {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final l0 mFragments = new l0(new f0(this));
    final androidx.lifecycle.y mFragmentLifecycleRegistry = new androidx.lifecycle.y(this);
    boolean mStopped = true;

    public g0() {
        final int i10 = 1;
        getSavedStateRegistry().d(LIFECYCLE_TAG, new androidx.activity.f(this, 2));
        final int i11 = 0;
        addOnConfigurationChangedListener(new a3.a(this) { // from class: androidx.fragment.app.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f1896b;

            {
                this.f1896b = this;
            }

            @Override // a3.a
            public final void accept(Object obj) {
                int i12 = i11;
                g0 g0Var = this.f1896b;
                switch (i12) {
                    case 0:
                        g0Var.mFragments.a();
                        break;
                    default:
                        g0Var.mFragments.a();
                        break;
                }
            }
        });
        addOnNewIntentListener(new a3.a(this) { // from class: androidx.fragment.app.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f1896b;

            {
                this.f1896b = this;
            }

            @Override // a3.a
            public final void accept(Object obj) {
                int i12 = i10;
                g0 g0Var = this.f1896b;
                switch (i12) {
                    case 0:
                        g0Var.mFragments.a();
                        break;
                    default:
                        g0Var.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new androidx.activity.g(this, 1));
    }

    public static void c(g0 g0Var) {
        m0 m0Var = g0Var.mFragments.f1966a;
        m0Var.f1974d.b(m0Var, m0Var, null);
    }

    public static /* synthetic */ Bundle d(g0 g0Var) {
        g0Var.markFragmentsCreated();
        g0Var.mFragmentLifecycleRegistry.f(androidx.lifecycle.p.ON_STOP);
        return new Bundle();
    }

    public static boolean e(x0 x0Var) {
        boolean zE = false;
        for (d0 d0Var : x0Var.f2050c.f()) {
            if (d0Var != null) {
                if (d0Var.getHost() != null) {
                    zE |= e(d0Var.getChildFragmentManager());
                }
                p1 p1Var = d0Var.mViewLifecycleOwner;
                androidx.lifecycle.q qVar = androidx.lifecycle.q.f2172d;
                if (p1Var != null) {
                    p1Var.b();
                    if (p1Var.f1992c.f2198c.compareTo(qVar) >= 0) {
                        d0Var.mViewLifecycleOwner.f1992c.h();
                        zE = true;
                    }
                }
                if (d0Var.mLifecycleRegistry.f2198c.compareTo(qVar) >= 0) {
                    d0Var.mLifecycleRegistry.h();
                    zE = true;
                }
            }
        }
        return zE;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f1966a.f1974d.f2053f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                r3.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f1966a.f1974d.q(str, fileDescriptor, printWriter, strArr);
        }
    }

    public x0 getSupportFragmentManager() {
        return this.mFragments.f1966a.f1974d;
    }

    @Deprecated
    public r3.a getSupportLoaderManager() {
        return r3.a.a(this);
    }

    public void markFragmentsCreated() {
        while (e(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(d0 d0Var) {
    }

    @Override // androidx.activity.p, q2.m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.p.ON_CREATE);
        y0 y0Var = this.mFragments.f1966a.f1974d;
        y0Var.E = false;
        y0Var.F = false;
        y0Var.L.f1871f = false;
        y0Var.p(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f1966a.f1974d.j();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.p.ON_DESTROY);
    }

    @Override // androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f1966a.f1974d.h(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f1966a.f1974d.p(5);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.p.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f1966a.f1974d.t(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.p.ON_RESUME);
        y0 y0Var = this.mFragments.f1966a.f1974d;
        y0Var.E = false;
        y0Var.F = false;
        y0Var.L.f1871f = false;
        y0Var.p(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            y0 y0Var = this.mFragments.f1966a.f1974d;
            y0Var.E = false;
            y0Var.F = false;
            y0Var.L.f1871f = false;
            y0Var.p(4);
        }
        this.mFragments.f1966a.f1974d.t(true);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.p.ON_START);
        y0 y0Var2 = this.mFragments.f1966a.f1974d;
        y0Var2.E = false;
        y0Var2.F = false;
        y0Var2.L.f1871f = false;
        y0Var2.p(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        y0 y0Var = this.mFragments.f1966a.f1974d;
        y0Var.F = true;
        y0Var.L.f1871f = true;
        y0Var.p(4);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.p.ON_STOP);
    }

    public void setEnterSharedElementCallback(q2.r0 r0Var) {
        int i10 = q2.h.f13081a;
        q2.b.c(this, null);
    }

    public void setExitSharedElementCallback(q2.r0 r0Var) {
        int i10 = q2.h.f13081a;
        q2.b.d(this, null);
    }

    public void startActivityFromFragment(d0 d0Var, Intent intent, int i10) {
        startActivityFromFragment(d0Var, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(d0 d0Var, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 != -1) {
            d0Var.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            int i14 = q2.h.f13081a;
            q2.a.c(this, intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i10 = q2.h.f13081a;
        q2.b.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i10 = q2.h.f13081a;
        q2.b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i10 = q2.h.f13081a;
        q2.b.e(this);
    }

    @Override // q2.g
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(d0 d0Var, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            d0Var.startActivityForResult(intent, i10, bundle);
        } else {
            int i11 = q2.h.f13081a;
            q2.a.b(this, intent, -1, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }
}
