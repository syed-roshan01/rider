package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3336a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p0 f3337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f3338c;

    public static p0 a(Context context) {
        synchronized (f3336a) {
            try {
                if (f3337b == null) {
                    f3337b = new p0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3337b;
    }

    public final void b(String str, String str2, int i10, j0 j0Var, boolean z10) {
        n0 n0Var = new n0(i10, str, str2, z10);
        p0 p0Var = (p0) this;
        synchronized (p0Var.f3368d) {
            try {
                o0 o0Var = (o0) p0Var.f3368d.get(n0Var);
                if (o0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(n0Var.toString()));
                }
                if (!o0Var.f3352a.containsKey(j0Var)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(n0Var.toString()));
                }
                o0Var.f3352a.remove(j0Var);
                if (o0Var.f3352a.isEmpty()) {
                    p0Var.f3370f.sendMessageDelayed(p0Var.f3370f.obtainMessage(0, n0Var), p0Var.f3372h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean c(n0 n0Var, j0 j0Var, String str, Executor executor);
}
