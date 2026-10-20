package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f3240b;

    public q0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f3240b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final void a(Status status) {
        this.f3240b.trySetException(new com.google.android.gms.common.api.g(status));
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final void b(RuntimeException runtimeException) {
        this.f3240b.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final void c(d0 d0Var) throws DeadObjectException {
        try {
            h(d0Var);
        } catch (DeadObjectException e4) {
            a(t0.e(e4));
            throw e4;
        } catch (RemoteException e10) {
            a(t0.e(e10));
        } catch (RuntimeException e11) {
            this.f3240b.trySetException(e11);
        }
    }

    public abstract void h(d0 d0Var);
}
