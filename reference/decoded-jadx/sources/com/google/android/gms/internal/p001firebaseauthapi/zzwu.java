package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzwu<JcePrimitiveT> implements zzxa<JcePrimitiveT> {
    private final zzwz<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzxa
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzwr.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e4) {
                if (exc == null) {
                    exc = e4;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzwu(zzwz<JcePrimitiveT> zzwzVar) {
        this.zza = zzwzVar;
    }
}
