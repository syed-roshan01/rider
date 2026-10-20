package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class r extends d0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2008o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Dialog f2010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2013t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f2001a = new o(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f2002b = new p(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2003c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2004d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2005e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2006f = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2007n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f2009p = new w(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2014u = false;

    @Override // androidx.fragment.app.d0
    public final j0 createFragmentContainer() {
        return new q(this, super.createFragmentContainer());
    }

    public Dialog i() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.r(requireContext(), this.f2004d);
    }

    @Override // androidx.fragment.app.d0
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.d0
    public final void onAttach(Context context) {
        Object obj;
        super.onAttach(context);
        androidx.lifecycle.c0 viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.c0.a("observeForever");
        w wVar = this.f2009p;
        androidx.lifecycle.a0 a0Var = new androidx.lifecycle.a0(viewLifecycleOwnerLiveData, wVar);
        n.g gVar = viewLifecycleOwnerLiveData.f2119b;
        n.c cVarE = gVar.e(wVar);
        if (cVarE != null) {
            obj = cVarE.f12030b;
        } else {
            n.c cVar = new n.c(wVar, a0Var);
            gVar.f12041d++;
            n.c cVar2 = gVar.f12039b;
            if (cVar2 == null) {
                gVar.f12038a = cVar;
                gVar.f12039b = cVar;
            } else {
                cVar2.f12031c = cVar;
                cVar.f12032d = cVar2;
                gVar.f12039b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.b0) obj) == null) {
            a0Var.a(true);
        }
        if (this.f2013t) {
            return;
        }
        this.f2012s = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.d0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler();
        this.f2006f = this.mContainerId == 0;
        if (bundle != null) {
            this.f2003c = bundle.getInt("android:style", 0);
            this.f2004d = bundle.getInt("android:theme", 0);
            this.f2005e = bundle.getBoolean("android:cancelable", true);
            this.f2006f = bundle.getBoolean("android:showsDialog", this.f2006f);
            this.f2007n = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f2010q;
        if (dialog != null) {
            this.f2011r = true;
            dialog.setOnDismissListener(null);
            this.f2010q.dismiss();
            if (!this.f2012s) {
                onDismiss(this.f2010q);
            }
            this.f2010q = null;
            this.f2014u = false;
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onDetach() {
        super.onDetach();
        if (!this.f2013t && !this.f2012s) {
            this.f2012s = true;
        }
        androidx.lifecycle.c0 viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.c0.a("removeObserver");
        androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) viewLifecycleOwnerLiveData.f2119b.g(this.f2009p);
        if (b0Var == null) {
            return;
        }
        b0Var.a(false);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f2011r) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f2012s) {
            return;
        }
        this.f2012s = true;
        this.f2013t = false;
        Dialog dialog = this.f2010q;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2010q.dismiss();
        }
        this.f2011r = true;
        if (this.f2007n >= 0) {
            x0 parentFragmentManager = getParentFragmentManager();
            int i10 = this.f2007n;
            parentFragmentManager.getClass();
            if (i10 < 0) {
                throw new IllegalArgumentException(l.q.g("Bad id: ", i10));
            }
            parentFragmentManager.r(new w0(parentFragmentManager, i10), true);
            this.f2007n = -1;
            return;
        }
        x0 parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        a aVar = new a(parentFragmentManager2);
        aVar.f1846o = true;
        x0 x0Var = this.mFragmentManager;
        if (x0Var == null || x0Var == aVar.f1847p) {
            aVar.b(new g1(this, 3));
            aVar.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.d0
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z10 = this.f2006f;
        if (!z10 || this.f2008o) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f2006f) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return layoutInflaterOnGetLayoutInflater;
        }
        if (z10 && !this.f2014u) {
            try {
                this.f2008o = true;
                Dialog dialogI = i();
                this.f2010q = dialogI;
                if (this.f2006f) {
                    int i10 = this.f2003c;
                    if (i10 == 1 || i10 == 2) {
                        dialogI.requestWindowFeature(1);
                    } else if (i10 == 3) {
                        Window window = dialogI.getWindow();
                        if (window != null) {
                            window.addFlags(24);
                        }
                        dialogI.requestWindowFeature(1);
                    }
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f2010q.setOwnerActivity((Activity) context);
                    }
                    this.f2010q.setCancelable(this.f2005e);
                    this.f2010q.setOnCancelListener(this.f2001a);
                    this.f2010q.setOnDismissListener(this.f2002b);
                    this.f2014u = true;
                } else {
                    this.f2010q = null;
                }
                this.f2008o = false;
            } catch (Throwable th) {
                this.f2008o = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f2010q;
        return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.d0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f2010q;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f2003c;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2004d;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2005e;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2006f;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2007n;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f2010q;
        if (dialog != null) {
            this.f2011r = false;
            dialog.show();
            View decorView = this.f2010q.getWindow().getDecorView();
            o1.s.i0(decorView, this);
            i1.b.F(decorView, this);
            y3.e.C0(decorView, this);
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.f2010q;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f2010q == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2010q.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.d0
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f2010q == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2010q.onRestoreInstanceState(bundle2);
    }
}
