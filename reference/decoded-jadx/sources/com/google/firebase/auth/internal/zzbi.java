package com.google.firebase.auth.internal;

import c6.a;
import com.google.android.gms.internal.p001firebaseauthapi.zzxv;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbi {
    private static final a zza = new a("GetTokenResultFactory", new String[0]);

    public static GetTokenResult zza(String str) {
        Map map;
        try {
            map = zzbh.zza(str);
        } catch (zzxv e4) {
            zza.a(e4, "Error parsing token claims", new Object[0]);
            map = new HashMap();
        }
        return new GetTokenResult(str, map);
    }
}
