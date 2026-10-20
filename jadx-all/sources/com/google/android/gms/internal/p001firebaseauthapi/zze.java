package com.google.android.gms.internal.p001firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
final class zze extends zzb {
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzb
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }

    private zze() {
    }
}
