package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zzd;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzyt implements zzadm<zzafc> {
    private final /* synthetic */ zzadj zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ zzd zze;
    private final /* synthetic */ zzacf zzf;
    private final /* synthetic */ zzafm zzg;

    public zzyt(zzyl zzylVar, zzadj zzadjVar, String str, String str2, Boolean bool, zzd zzdVar, zzacf zzacfVar, zzafm zzafmVar) {
        this.zza = zzadjVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zzdVar;
        this.zzf = zzacfVar;
        this.zzg = zzafmVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafc zzafcVar) {
        List<zzafb> listZza = zzafcVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzafb zzafbVar = listZza.get(0);
        zzafu zzafuVarZzf = zzafbVar.zzf();
        List<zzafr> listZza2 = zzafuVarZzf != null ? zzafuVarZzf.zza() : null;
        if (listZza2 != null && !listZza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                listZza2.get(0).zza(this.zzc);
            } else {
                for (int i10 = 0; i10 < listZza2.size(); i10++) {
                    if (listZza2.get(i10).zzf().equals(this.zzb)) {
                        listZza2.get(i10).zza(this.zzc);
                        break;
                    }
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzafbVar.zza(bool.booleanValue());
        } else {
            zzafbVar.zza(zzafbVar.zzb() - zzafbVar.zza() < 1000);
        }
        zzafbVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzafbVar);
    }
}
