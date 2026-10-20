package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;
import com.google.android.recaptcha.internal.zzaw;
import d7.t;
import u8.e;
import v8.a;

/* JADX INFO: loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m2118getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 10000;
        }
        return recaptcha.m2119getClientBWLJW6A(application, str, j10, eVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzam.zzd(application, str, 10000L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    public final Object m2119getClientBWLJW6A(Application application, String str, long j10, e eVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (eVar instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) eVar;
            int i10 = recaptcha$getClient$1.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i10 - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, eVar);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, eVar);
        }
        Recaptcha$getClient$1 recaptcha$getClient$2 = recaptcha$getClient$1;
        Object objZzc = recaptcha$getClient$2.zza;
        a aVar = a.f15963a;
        int i11 = recaptcha$getClient$2.zzc;
        try {
            if (i11 == 0) {
                t.v0(objZzc);
                zzam zzamVar = zzam.zza;
                recaptcha$getClient$2.zzc = 1;
                objZzc = zzam.zzc(application, str, j10, null, recaptcha$getClient$2);
                if (objZzc == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.v0(objZzc);
            }
            return (zzaw) objZzc;
        } catch (Throwable th) {
            return t.N(th);
        }
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j10) {
        return zzam.zzd(application, str, j10);
    }
}
