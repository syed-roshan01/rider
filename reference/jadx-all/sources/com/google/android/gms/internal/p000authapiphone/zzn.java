package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import z5.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzn extends i {
    private static final e zza;
    private static final a zzb;
    private static final f zzc;

    static {
        e eVar = new e();
        zza = eVar;
        zzr zzrVar = new zzr();
        zzb = zzrVar;
        zzc = new f("SmsCodeAutofill.API", zzrVar, eVar);
    }

    public zzn(Context context) {
        super(context, null, zzc, null, h.f3156c);
    }

    public final Task<Integer> checkPermissionState() {
        s sVarA = t.a();
        sVarA.f3245d = new d[]{zzaa.zza};
        sVarA.f3244c = new q(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzp
            private final zzn zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) {
                ((zzj) ((zzv) obj).getService()).zza(new zzt(this.zza, (TaskCompletionSource) obj2));
            }
        };
        return doRead(sVarA.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        f6.a.x(str);
        f6.a.q("The package name cannot be empty.", !str.isEmpty());
        s sVarA = t.a();
        sVarA.f3245d = new d[]{zzaa.zza};
        sVarA.f3244c = new q(this, str) { // from class: com.google.android.gms.internal.auth-api-phone.zzo
            private final zzn zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) {
                zzn zznVar = this.zza;
                ((zzj) ((zzv) obj).getService()).zza(this.zzb, new zzs(zznVar, (TaskCompletionSource) obj2));
            }
        };
        return doRead(sVarA.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        s sVarA = t.a();
        sVarA.f3245d = new d[]{zzaa.zza};
        sVarA.f3244c = new q(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            private final zzn zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) {
                ((zzj) ((zzv) obj).getService()).zza(new zzq(this.zza, (TaskCompletionSource) obj2));
            }
        };
        return doWrite(sVarA.a());
    }

    public zzn(Activity activity) {
        super(activity, activity, zzc, null, h.f3156c);
    }
}
