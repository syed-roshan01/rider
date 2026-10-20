package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import w5.a;
import z5.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzu extends a {
    public zzu(Context context) {
        super(context);
    }

    public final Task<Void> startSmsRetriever() {
        s sVarA = t.a();
        sVarA.f3244c = new q(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            private final zzu zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) {
                ((zzj) ((zzv) obj).getService()).zza(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        };
        sVarA.f3245d = new d[]{zzaa.zzb};
        return doWrite(sVarA.a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        s sVarA = t.a();
        sVarA.f3244c = new q(this, str) { // from class: com.google.android.gms.internal.auth-api-phone.zzw
            private final zzu zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) {
                zzu zzuVar = this.zza;
                ((zzj) ((zzv) obj).getService()).zza(this.zzb, new zzy(zzuVar, (TaskCompletionSource) obj2));
            }
        };
        sVarA.f3245d = new d[]{zzaa.zzc};
        return doWrite(sVarA.a());
    }

    public zzu(Activity activity) {
        super(activity);
    }
}
