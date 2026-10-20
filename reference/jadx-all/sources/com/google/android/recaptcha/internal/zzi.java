package com.google.android.recaptcha.internal;

import c9.c;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.j;
import java.util.concurrent.CancellationException;
import m9.b1;
import m9.h0;
import m9.p1;
import m9.u;
import q8.l;

/* JADX INFO: loaded from: classes.dex */
final class zzi extends j implements c {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ h0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(TaskCompletionSource taskCompletionSource, h0 h0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = h0Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Object objN = ((p1) this.zzb).N();
            if (!(!(objN instanceof b1))) {
                throw new IllegalStateException("This job has not completed yet".toString());
            }
            u uVar = objN instanceof u ? (u) objN : null;
            Throwable th2 = uVar != null ? uVar.f12005a : null;
            if (th2 == null) {
                this.zza.setResult(this.zzb.g());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = th2 instanceof Exception ? (Exception) th2 : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(th2);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return l.f13235a;
    }
}
