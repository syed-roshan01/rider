package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zaq;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3258c;

    public /* synthetic */ v0(int i10, Object obj, Object obj2) {
        this.f3256a = i10;
        this.f3258c = obj;
        this.f3257b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.m mVar;
        Set set;
        com.google.android.gms.common.internal.m s0Var = null;
        switch (this.f3256a) {
            case 0:
                if (((x) this.f3258c).f3265a) {
                    z5.b bVar = ((u0) this.f3257b).f3254b;
                    if ((bVar.f17241b == 0 || bVar.f17242c == null) ? false : true) {
                        x xVar = (x) this.f3258c;
                        j jVar = xVar.mLifecycleFragment;
                        Activity activity = xVar.getActivity();
                        PendingIntent pendingIntent = bVar.f17242c;
                        f6.a.x(pendingIntent);
                        int i10 = ((u0) this.f3257b).f3253a;
                        int i11 = GoogleApiActivity.f3145b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i10);
                        intent.putExtra("notify_manager", false);
                        jVar.startActivityForResult(intent, 1);
                        return;
                    }
                    x xVar2 = (x) this.f3258c;
                    if (xVar2.f3268d.a(bVar.f17241b, xVar2.getActivity(), null) != null) {
                        x xVar3 = (x) this.f3258c;
                        z5.e eVar = xVar3.f3268d;
                        Activity activity2 = xVar3.getActivity();
                        x xVar4 = (x) this.f3258c;
                        eVar.h(activity2, xVar4.mLifecycleFragment, bVar.f17241b, xVar4);
                        return;
                    }
                    if (bVar.f17241b != 18) {
                        x xVar5 = (x) this.f3258c;
                        int i12 = ((u0) this.f3257b).f3253a;
                        xVar5.f3266b.set(null);
                        xVar5.f3270f.g(bVar, i12);
                        return;
                    }
                    x xVar6 = (x) this.f3258c;
                    z5.e eVar2 = xVar6.f3268d;
                    Activity activity3 = xVar6.getActivity();
                    x xVar7 = (x) this.f3258c;
                    eVar2.getClass();
                    ProgressBar progressBar = new ProgressBar(activity3, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
                    builder.setView(progressBar);
                    builder.setMessage(com.google.android.gms.common.internal.v.b(activity3, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    z5.e.f(activity3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", xVar7);
                    x xVar8 = (x) this.f3258c;
                    z5.e eVar3 = xVar8.f3268d;
                    Context applicationContext = xVar8.getActivity().getApplicationContext();
                    androidx.fragment.app.x xVar9 = new androidx.fragment.app.x(this, alertDialogCreate);
                    eVar3.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    h0 h0Var = new h0(xVar9);
                    applicationContext.registerReceiver(h0Var, intentFilter);
                    h0Var.f3213a = applicationContext;
                    if (z5.j.b(applicationContext)) {
                        return;
                    }
                    x xVar10 = (x) this.f3258c;
                    xVar10.f3266b.set(null);
                    zaq zaqVar = xVar10.f3270f.f3205n;
                    zaqVar.sendMessage(zaqVar.obtainMessage(3));
                    AlertDialog alertDialog = alertDialogCreate;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (h0Var) {
                        try {
                            Context context = h0Var.f3213a;
                            if (context != null) {
                                context.unregisterReceiver(h0Var);
                            }
                            h0Var.f3213a = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                Object obj = this.f3258c;
                f0 f0Var = (f0) obj;
                d0 d0Var = (d0) f0Var.f3212f.f3201j.get(f0Var.f3208b);
                if (d0Var == null) {
                    return;
                }
                z5.b bVar2 = (z5.b) this.f3257b;
                if (bVar2.f17241b != 0) {
                    d0Var.p(bVar2, null);
                    return;
                }
                f0Var.f3211e = true;
                if (f0Var.f3207a.requiresSignIn()) {
                    if (!f0Var.f3211e || (mVar = f0Var.f3209c) == null) {
                        return;
                    }
                    f0Var.f3207a.getRemoteService(mVar, f0Var.f3210d);
                    return;
                }
                try {
                    com.google.android.gms.common.api.d dVar = ((f0) obj).f3207a;
                    dVar.getRemoteService(null, dVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    f0Var.f3207a.disconnect("Failed to get service from broker.");
                    d0Var.p(new z5.b(10), null);
                    return;
                }
            default:
                o0 o0Var = (o0) this.f3258c;
                n6.h hVar = (n6.h) this.f3257b;
                w5.b bVar3 = o0.f3231h;
                z5.b bVar4 = hVar.f12244b;
                if (bVar4.f17241b == 0) {
                    com.google.android.gms.common.internal.a0 a0Var = hVar.f12245c;
                    f6.a.x(a0Var);
                    z5.b bVar5 = a0Var.f3282c;
                    if (bVar5.f17241b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar5)), new Exception());
                        o0Var.f3238g.a(bVar5);
                        o0Var.f3237f.disconnect();
                        return;
                    }
                    f0 f0Var2 = o0Var.f3238g;
                    IBinder iBinder = a0Var.f3281b;
                    if (iBinder != null) {
                        int i13 = com.google.android.gms.common.internal.a.f3279a;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        s0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.m ? (com.google.android.gms.common.internal.m) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.s0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    f0Var2.getClass();
                    if (s0Var == null || (set = o0Var.f3235d) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        f0Var2.a(new z5.b(4));
                    } else {
                        f0Var2.f3209c = s0Var;
                        f0Var2.f3210d = set;
                        if (f0Var2.f3211e) {
                            f0Var2.f3207a.getRemoteService(s0Var, set);
                        }
                    }
                } else {
                    o0Var.f3238g.a(bVar4);
                }
                o0Var.f3237f.disconnect();
                return;
        }
    }
}
