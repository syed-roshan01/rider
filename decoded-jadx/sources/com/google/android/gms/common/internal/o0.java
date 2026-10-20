package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3352a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3353b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f3355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f3356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f3357f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p0 f3358n;

    public o0(p0 p0Var, n0 n0Var) {
        this.f3358n = p0Var;
        this.f3356e = n0Var;
    }

    public final void a(String str, Executor executor) {
        this.f3353b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            p0 p0Var = this.f3358n;
            d6.a aVar = p0Var.f3371g;
            Context context = p0Var.f3369e;
            boolean zD = aVar.d(context, str, this.f3356e.a(context), this, this.f3356e.f3347c, executor);
            this.f3354c = zD;
            if (zD) {
                this.f3358n.f3370f.sendMessageDelayed(this.f3358n.f3370f.obtainMessage(1, this.f3356e), this.f3358n.f3373i);
            } else {
                this.f3353b = 2;
                try {
                    p0 p0Var2 = this.f3358n;
                    p0Var2.f3371g.c(p0Var2.f3369e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3358n.f3368d) {
            try {
                this.f3358n.f3370f.removeMessages(1, this.f3356e);
                this.f3355d = iBinder;
                this.f3357f = componentName;
                Iterator it = this.f3352a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f3353b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3358n.f3368d) {
            try {
                this.f3358n.f3370f.removeMessages(1, this.f3356e);
                this.f3355d = null;
                this.f3357f = componentName;
                Iterator it = this.f3352a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f3353b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
