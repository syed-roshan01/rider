package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public class r extends Dialog implements androidx.lifecycle.w, k0, b4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.y f1419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.f f1420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f1421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10) {
        super(context, i10);
        d7.a.m(context, "context");
        this.f1420b = x9.v.l(this);
        this.f1421c = new i0(new d(this, 2));
    }

    public static void a(r rVar) {
        d7.a.m(rVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d7.a.m(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.y b() {
        androidx.lifecycle.y yVar = this.f1419a;
        if (yVar != null) {
            return yVar;
        }
        androidx.lifecycle.y yVar2 = new androidx.lifecycle.y(this);
        this.f1419a = yVar2;
        return yVar2;
    }

    public final void c() {
        Window window = getWindow();
        d7.a.j(window);
        View decorView = window.getDecorView();
        d7.a.l(decorView, "window!!.decorView");
        o1.s.i0(decorView, this);
        Window window2 = getWindow();
        d7.a.j(window2);
        View decorView2 = window2.getDecorView();
        d7.a.l(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        d7.a.j(window3);
        View decorView3 = window3.getDecorView();
        d7.a.l(decorView3, "window!!.decorView");
        y3.e.C0(decorView3, this);
    }

    @Override // androidx.lifecycle.w
    public final androidx.lifecycle.r getLifecycle() {
        return b();
    }

    @Override // androidx.activity.k0
    public final i0 getOnBackPressedDispatcher() {
        return this.f1421c;
    }

    @Override // b4.g
    public final b4.e getSavedStateRegistry() {
        return this.f1420b.f2708b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1421c.b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            d7.a.l(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            i0 i0Var = this.f1421c;
            i0Var.getClass();
            i0Var.f1398e = onBackInvokedDispatcher;
            i0Var.c(i0Var.f1400g);
        }
        this.f1420b.b(bundle);
        b().f(androidx.lifecycle.p.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        d7.a.l(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f1420b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().f(androidx.lifecycle.p.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        b().f(androidx.lifecycle.p.ON_DESTROY);
        this.f1419a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        d7.a.m(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d7.a.m(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
