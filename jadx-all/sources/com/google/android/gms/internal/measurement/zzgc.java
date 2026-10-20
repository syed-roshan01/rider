package com.google.android.gms.internal.measurement;

import android.net.Uri;
import l.q;
import q.z;

/* JADX INFO: loaded from: classes.dex */
public final class zzgc implements zzgh {
    private final z zza;

    public zzgc(z zVar) {
        this.zza = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016 A[RETURN] */
    @Override // com.google.android.gms.internal.measurement.zzgh
    public final String zza(Uri uri, String str, String str2, String str3) {
        z zVar;
        if (uri == null) {
            if (str == null) {
                zVar = null;
            }
            if (zVar == null) {
                return null;
            }
            if (str2 != null) {
                str3 = q.j(str2, str3);
            }
            return (String) zVar.get(str3);
        }
        str = uri.toString();
        zVar = (z) this.zza.get(str);
        if (zVar == null) {
            return null;
        }
        if (str2 != null) {
            str3 = q.j(str2, str3);
        }
        return (String) zVar.get(str3);
    }
}
