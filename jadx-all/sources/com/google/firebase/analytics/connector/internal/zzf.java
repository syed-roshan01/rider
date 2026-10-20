package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import k6.u5;

/* JADX INFO: loaded from: classes.dex */
final class zzf implements u5 {
    private final /* synthetic */ zzg zza;

    public zzf(zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // k6.u5
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !zzb.zze(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        this.zza.zza.onMessageTriggered(3, bundle2);
    }
}
