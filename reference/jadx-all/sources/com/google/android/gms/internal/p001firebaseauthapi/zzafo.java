package com.google.android.gms.internal.p001firebaseauthapi;

import android.util.Base64;
import f6.a;
import java.io.UnsupportedEncodingException;
import java.util.List;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzafo {
    public static long zza(String str) {
        zzafn zzafnVarZzb = zzb(str);
        return zzafnVarZzb.zza().longValue() - zzafnVarZzb.zzb().longValue();
    }

    private static zzafn zzb(String str) {
        a.u(str);
        List<String> listZza = zzac.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(q.x("Invalid idToken ", str));
        }
        String str2 = listZza.get(1);
        try {
            return zzafn.zza(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("Unable to decode token", e4);
        }
    }
}
