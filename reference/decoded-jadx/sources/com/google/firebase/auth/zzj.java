package com.google.firebase.auth;

import a7.a;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes.dex */
final class zzj implements OnCompleteListener<com.google.firebase.auth.internal.zzj> {
    private final /* synthetic */ PhoneAuthOptions zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzj(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, String str) {
        this.zza = phoneAuthOptions;
        this.zzb = str;
        this.zzc = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<com.google.firebase.auth.internal.zzj> task) {
        String strZza;
        String str;
        if (task.isSuccessful()) {
            String strZzc = task.getResult().zzc();
            strZza = task.getResult().zza();
            str = strZzc;
        } else {
            Exception exception = task.getException();
            a.t("Error while validating application identity: ", exception != null ? exception.getMessage() : "", "FirebaseAuth");
            if (exception != null && com.google.firebase.auth.internal.zzb.zza(exception)) {
                FirebaseAuth.zza((FirebaseException) exception, this.zza, this.zzb);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str = null;
                strZza = null;
            }
        }
        this.zzc.zza(this.zza, str, strZza);
    }
}
