package com.google.firebase.auth.internal;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import f6.a;
import java.util.List;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzbw implements Continuation<zzafj, Task<RecaptchaTasksClient>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzbx zzb;

    public zzbw(zzbx zzbxVar, String str) {
        this.zza = str;
        this.zzb = zzbxVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzafj> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            a.x(exception);
            String message = exception.getMessage();
            a.x(message);
            return Tasks.forException(new zzbu(message));
        }
        zzafj result = task.getResult();
        String strZza = result.zza();
        if (com.google.android.gms.internal.p001firebaseauthapi.zzah.zzc(strZza)) {
            return Tasks.forException(new zzbu(q.x("No Recaptcha Enterprise siteKey configured for tenant/project ", this.zza)));
        }
        List<String> listZza = com.google.android.gms.internal.p001firebaseauthapi.zzac.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(q.x("Invalid siteKey format ", strZza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.zza);
        }
        this.zzb.zzd = result;
        zzbx zzbxVar = this.zzb;
        Task<RecaptchaTasksClient> taskZza = zzbxVar.zzc.zza((Application) zzbxVar.zzb.getApplicationContext(), str);
        this.zzb.zza.put(this.zza, taskZza);
        return taskZza;
    }
}
