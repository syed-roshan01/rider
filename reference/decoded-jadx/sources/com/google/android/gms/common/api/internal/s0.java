package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f3246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f3247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f3248d;

    public s0(int i10, t tVar, TaskCompletionSource taskCompletionSource, r rVar) {
        super(i10);
        this.f3247c = taskCompletionSource;
        this.f3246b = tVar;
        this.f3248d = rVar;
        if (i10 == 2 && tVar.f3250b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final void a(Status status) {
        this.f3247c.trySetException(this.f3248d.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final void b(RuntimeException runtimeException) {
        this.f3247c.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final void c(d0 d0Var) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f3247c;
        try {
            t tVar = this.f3246b;
            ((q) ((p0) tVar).f3239d.f3244c).accept(d0Var.f3174b, taskCompletionSource);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e10) {
            a(t0.e(e10));
        } catch (RuntimeException e11) {
            taskCompletionSource.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final void d(androidx.fragment.app.x xVar, boolean z10) {
        Map map = (Map) xVar.f2047b;
        Boolean boolValueOf = Boolean.valueOf(z10);
        TaskCompletionSource taskCompletionSource = this.f3247c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new w(xVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final boolean f(d0 d0Var) {
        return this.f3246b.f3250b;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final z5.d[] g(d0 d0Var) {
        return this.f3246b.f3249a;
    }
}
