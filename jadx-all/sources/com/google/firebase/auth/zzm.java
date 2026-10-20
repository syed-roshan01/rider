package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzaag;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import f6.a;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzm implements OnCompleteListener<com.google.firebase.auth.internal.zzj> {
    private final /* synthetic */ PhoneAuthOptions zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzm(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, String str) {
        this.zza = phoneAuthOptions;
        this.zzb = str;
        this.zzc = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<com.google.firebase.auth.internal.zzj> task) {
        String strZzc;
        String strZza;
        if (task.isSuccessful()) {
            strZzc = task.getResult().zzc();
            strZza = task.getResult().zza();
        } else {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", exception != null ? q.x("Error while validating application identity: ", exception.getMessage()) : "Error while validating application identity: ");
            if (exception != null && com.google.firebase.auth.internal.zzb.zza(exception)) {
                FirebaseAuth.zza((FirebaseException) exception, this.zza, this.zzb);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                strZzc = null;
                strZza = null;
            }
        }
        long jLongValue = this.zza.zzg().longValue();
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZza = this.zzc.zza(this.zza.zzh(), this.zza.zze());
        if (TextUtils.isEmpty(strZzc)) {
            onVerificationStateChangedCallbacksZza = this.zzc.zza(this.zza, onVerificationStateChangedCallbacksZza);
        }
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks = onVerificationStateChangedCallbacksZza;
        MultiFactorSession multiFactorSessionZzc = this.zza.zzc();
        a.x(multiFactorSessionZzc);
        com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) multiFactorSessionZzc;
        if (zzamVar.zzd()) {
            zzaag zzaagVar = this.zzc.zze;
            String strZzh = this.zza.zzh();
            a.x(strZzh);
            zzaagVar.zza(zzamVar, strZzh, this.zzc.zzi, jLongValue, this.zza.zzd() != null, this.zza.zzk(), strZzc, strZza, this.zzc.zzi(), onVerificationStateChangedCallbacks, this.zza.zzi(), this.zza.zza());
            return;
        }
        zzaag zzaagVar2 = this.zzc.zze;
        PhoneMultiFactorInfo phoneMultiFactorInfoZzf = this.zza.zzf();
        a.x(phoneMultiFactorInfoZzf);
        zzaagVar2.zza(zzamVar, phoneMultiFactorInfoZzf, this.zzc.zzi, jLongValue, this.zza.zzd() != null, this.zza.zzk(), strZzc, strZza, this.zzc.zzi(), onVerificationStateChangedCallbacks, this.zza.zzi(), this.zza.zza());
    }
}
