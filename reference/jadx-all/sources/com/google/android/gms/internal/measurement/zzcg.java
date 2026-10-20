package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
final class zzcg extends zzcd {
    @Override // com.google.android.gms.internal.measurement.zzcd
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }

    private zzcg() {
    }
}
