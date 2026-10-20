package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class x extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f3265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f3266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zaq f3267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z5.e f3268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q.g f3269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f3270f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(j jVar, f fVar) {
        super(jVar);
        z5.e eVar = z5.e.f17251d;
        this.f3266b = new AtomicReference(null);
        this.f3267c = new zaq(Looper.getMainLooper());
        this.f3268d = eVar;
        this.f3269e = new q.g(0);
        this.f3270f = fVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onCancel(DialogInterface dialogInterface) {
        z5.b bVar = new z5.b(13, null);
        AtomicReference atomicReference = this.f3266b;
        u0 u0Var = (u0) atomicReference.get();
        int i10 = u0Var == null ? -1 : u0Var.f3253a;
        atomicReference.set(null);
        this.f3270f.g(bVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        AtomicReference atomicReference = this.f3266b;
        u0 u0Var = (u0) atomicReference.get();
        f fVar = this.f3270f;
        if (i10 != 1) {
            if (i10 == 2) {
                int iC = this.f3268d.c(getActivity(), z5.f.f17252a);
                if (iC == 0) {
                    atomicReference.set(null);
                    zaq zaqVar = fVar.f3205n;
                    zaqVar.sendMessage(zaqVar.obtainMessage(3));
                    return;
                } else {
                    if (u0Var == null) {
                        return;
                    }
                    if (u0Var.f3254b.f17241b == 18 && iC == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            atomicReference.set(null);
            zaq zaqVar2 = fVar.f3205n;
            zaqVar2.sendMessage(zaqVar2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (u0Var == null) {
                return;
            }
            z5.b bVar = new z5.b(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, u0Var.f3254b.toString());
            atomicReference.set(null);
            fVar.g(bVar, u0Var.f3253a);
            return;
        }
        if (u0Var != null) {
            atomicReference.set(null);
            fVar.g(u0Var.f3254b, u0Var.f3253a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3266b.set(bundle.getBoolean("resolving_error", false) ? new u0(new z5.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.f3269e.isEmpty()) {
            return;
        }
        this.f3270f.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u0 u0Var = (u0) this.f3266b.get();
        if (u0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", u0Var.f3253a);
        z5.b bVar = u0Var.f3254b;
        bundle.putInt("failed_status", bVar.f17241b);
        bundle.putParcelable("failed_resolution", bVar.f17242c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        this.f3265a = true;
        if (this.f3269e.isEmpty()) {
            return;
        }
        this.f3270f.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.f3265a = false;
        f fVar = this.f3270f;
        fVar.getClass();
        synchronized (f.f3190r) {
            try {
                if (fVar.f3202k == this) {
                    fVar.f3202k = null;
                    fVar.f3203l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
