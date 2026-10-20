package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzai implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ ActionCodeSettings zzb;
    private final /* synthetic */ FirebaseUser zzc;

    public zzai(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        this.zzc = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) {
        GetTokenResult result = task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(this.zzc.zza());
        String token = result.getToken();
        a.x(token);
        return firebaseAuth.zza(token, this.zza, this.zzb);
    }
}
