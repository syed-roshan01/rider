package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3368d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f3369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile zzi f3370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d6.a f3371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f3373i;

    public p0(Context context, Looper looper) {
        y5.j jVar = new y5.j(this);
        this.f3369e = context.getApplicationContext();
        this.f3370f = new zzi(looper, jVar);
        this.f3371g = d6.a.b();
        this.f3372h = 5000L;
        this.f3373i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.l
    public final boolean c(n0 n0Var, j0 j0Var, String str, Executor executor) {
        boolean z10;
        synchronized (this.f3368d) {
            try {
                o0 o0Var = (o0) this.f3368d.get(n0Var);
                if (o0Var == null) {
                    o0Var = new o0(this, n0Var);
                    o0Var.f3352a.put(j0Var, j0Var);
                    o0Var.a(str, executor);
                    this.f3368d.put(n0Var, o0Var);
                } else {
                    this.f3370f.removeMessages(0, n0Var);
                    if (o0Var.f3352a.containsKey(j0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(n0Var.toString()));
                    }
                    o0Var.f3352a.put(j0Var, j0Var);
                    int i10 = o0Var.f3353b;
                    if (i10 == 1) {
                        j0Var.onServiceConnected(o0Var.f3357f, o0Var.f3355d);
                    } else if (i10 == 2) {
                        o0Var.a(str, executor);
                    }
                }
                z10 = o0Var.f3354c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
