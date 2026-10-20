package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.p001firebaseauthapi.zzafq;
import com.google.android.gms.internal.p001firebaseauthapi.zzagq;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import f6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbk {
    public static MultiFactorInfo zza(zzafq zzafqVar) {
        if (zzafqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafqVar.zze())) {
            String strZzd = zzafqVar.zzd();
            String strZzc = zzafqVar.zzc();
            long jZza = zzafqVar.zza();
            String strZze = zzafqVar.zze();
            a.u(strZze);
            return new PhoneMultiFactorInfo(strZzd, strZzc, jZza, strZze);
        }
        if (zzafqVar.zzb() == null) {
            return null;
        }
        String strZzd2 = zzafqVar.zzd();
        String strZzc2 = zzafqVar.zzc();
        long jZza2 = zzafqVar.zza();
        zzagq zzagqVarZzb = zzafqVar.zzb();
        a.y(zzagqVarZzb, "totpInfo cannot be null.");
        return new TotpMultiFactorInfo(strZzd2, strZzc2, jZza2, zzagqVarZzb);
    }

    public static List<MultiFactorInfo> zza(List<zzafq> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzafq> it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfoZza = zza(it.next());
                if (multiFactorInfoZza != null) {
                    arrayList.add(multiFactorInfoZza);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
