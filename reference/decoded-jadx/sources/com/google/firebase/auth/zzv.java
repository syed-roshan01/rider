package com.google.firebase.auth;

import com.google.android.gms.internal.p001firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzv implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ FirebaseAuth zzb;

    public zzv(FirebaseAuth firebaseAuth, String str) {
        this.zza = str;
        this.zzb = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            a.x(exception);
            return Tasks.forException(exception);
        }
        zzaag zzaagVar = this.zzb.zze;
        String str = this.zza;
        String token = task.getResult().getToken();
        a.x(token);
        return zzaagVar.zza(str, token, "apple.com", this.zzb.zzk);
    }
}
