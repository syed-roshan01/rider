package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
final class zzn extends zzo {
    static final zzj zza = new zzn();

    private zzn() {
        super("CharMatcher.none()");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzj
    public final boolean zza(char c10) {
        return false;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzj
    public final int zza(CharSequence charSequence, int i10) {
        zzz.zza(i10, charSequence.length(), FirebaseAnalytics.Param.INDEX);
        return -1;
    }
}
