package com.google.firebase.auth;

import com.google.android.gms.internal.p001firebaseauthapi.zzagi;
import com.google.android.gms.internal.p001firebaseauthapi.zzago;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.zzcd;
import f6.a;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzw implements Continuation<zzagi, Task<TotpSecret>> {
    private final /* synthetic */ FirebaseAuth zza;

    public zzw(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<TotpSecret> then(Task<zzagi> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            a.x(exception);
            return Tasks.forException(exception);
        }
        zzagi result = task.getResult();
        if (!(result instanceof zzago)) {
            throw new IllegalArgumentException(q.k("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", result.getClass().getName(), "."));
        }
        zzago zzagoVar = (zzago) result;
        String strZzf = zzagoVar.zzf();
        a.u(strZzf);
        String strZze = zzagoVar.zze();
        a.u(strZze);
        int iZzc = zzagoVar.zzc();
        int iZzb = zzagoVar.zzb();
        long jZzd = zzagoVar.zzd();
        String strZza = zzagoVar.zza();
        a.u(strZza);
        return Tasks.forResult(new zzcd(strZzf, strZze, iZzc, iZzb, jZzd, strZza, this.zza));
    }
}
