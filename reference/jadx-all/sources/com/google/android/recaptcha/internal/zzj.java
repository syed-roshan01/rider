package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import m9.h0;
import m9.p1;

/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Task zza(h0 h0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        ((p1) h0Var).U(false, true, new zzi(taskCompletionSource, h0Var));
        return taskCompletionSource.getTask();
    }
}
