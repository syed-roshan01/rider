package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzaik implements zzanb {
    private final zzaii zza;

    private zzaik(zzaii zzaiiVar) {
        zzaii zzaiiVar2 = (zzaii) zzajc.zza(zzaiiVar, "output");
        this.zza = zzaiiVar2;
        zzaiiVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final int zza() {
        return zzana.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZza = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZza += zzaii.zza(list.get(i12).doubleValue());
        }
        this.zza.zzl(iZza);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZza = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZza += zzaii.zza(list.get(i12).intValue());
        }
        this.zza.zzl(iZza);
        while (i11 < list.size()) {
            this.zza.zzj(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzg(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZzb = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzb += zzaii.zzb(list.get(i12).intValue());
        }
        this.zza.zzl(iZzb);
        while (i11 < list.size()) {
            this.zza.zzi(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZza = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZza += zzaii.zza(list.get(i12).longValue());
        }
        this.zza.zzl(iZza);
        while (i11 < list.size()) {
            this.zza.zzf(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZza = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZza += zzaii.zza(list.get(i12).floatValue());
        }
        this.zza.zzl(iZza);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZzc = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzc += zzaii.zzc(list.get(i12).intValue());
        }
        this.zza.zzl(iZzc);
        while (i11 < list.size()) {
            this.zza.zzj(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZzb = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzb += zzaii.zzb(list.get(i12).longValue());
        }
        this.zza.zzl(iZzb);
        while (i11 < list.size()) {
            this.zza.zzh(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzg(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZze = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZze += zzaii.zze(list.get(i12).intValue());
        }
        this.zza.zzl(iZze);
        while (i11 < list.size()) {
            this.zza.zzi(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZzc = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzc += zzaii.zzc(list.get(i12).longValue());
        }
        this.zza.zzl(iZzc);
        while (i11 < list.size()) {
            this.zza.zzf(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzi(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZzf = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzf += zzaii.zzf(list.get(i12).intValue());
        }
        this.zza.zzl(iZzf);
        while (i11 < list.size()) {
            this.zza.zzk(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzg(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZzd = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzd += zzaii.zzd(list.get(i12).longValue());
        }
        this.zza.zzl(iZzd);
        while (i11 < list.size()) {
            this.zza.zzg(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzk(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZzh = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzh += zzaii.zzh(list.get(i12).intValue());
        }
        this.zza.zzl(iZzh);
        while (i11 < list.size()) {
            this.zza.zzl(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int iZze = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZze += zzaii.zze(list.get(i12).longValue());
        }
        this.zza.zzl(iZze);
        while (i11 < list.size()) {
            this.zza.zzh(list.get(i11).longValue());
            i11++;
        }
    }

    public static zzaik zza(zzaii zzaiiVar) {
        zzaik zzaikVar = zzaiiVar.zza;
        return zzaikVar != null ? zzaikVar : new zzaik(zzaiiVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, boolean z10) {
        this.zza.zzb(i10, z10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzj(i10, 2);
            int iZza = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZza += zzaii.zza(list.get(i12).booleanValue());
            }
            this.zza.zzl(iZza);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzb(int i10, int i11) {
        this.zza.zzg(i10, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzd(int i10, int i11) {
        this.zza.zzg(i10, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zze(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzf(int i10, int i11) {
        this.zza.zzk(i10, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzb(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzd(int i10, long j10) {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zze(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzb(int i10, Object obj, zzalc zzalcVar) {
        this.zza.zzc(i10, (zzakk) obj, zzalcVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzc(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzb(int i10, List<?> list, zzalc zzalcVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzalcVar);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzc(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, zzahm zzahmVar) {
        this.zza.zzc(i10, zzahmVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, List<zzahm> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzj(i10, 3);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof zzajq) {
            zzajq zzajqVar = (zzajq) list;
            while (i11 < list.size()) {
                Object objZzb = zzajqVar.zzb(i11);
                if (objZzb instanceof String) {
                    this.zza.zzb(i10, (String) objZzb);
                } else {
                    this.zza.zzc(i10, (zzahm) objZzb);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    @Deprecated
    public final void zza(int i10) {
        this.zza.zzj(i10, 4);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, Object obj, zzalc zzalcVar) {
        zzaii zzaiiVar = this.zza;
        zzaiiVar.zzj(i10, 3);
        zzalcVar.zza((zzakk) obj, zzaiiVar.zza);
        zzaiiVar.zzj(i10, 4);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, List<?> list, zzalc zzalcVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzalcVar);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final <K, V> void zza(int i10, zzakf<K, V> zzakfVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i10, 2);
            this.zza.zzl(zzakc.zza(zzakfVar, entry.getKey(), entry.getValue()));
            zzakc.zza(this.zza, zzakfVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, Object obj) {
        if (obj instanceof zzahm) {
            this.zza.zzd(i10, (zzahm) obj);
        } else {
            this.zza.zzb(i10, (zzakk) obj);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzanb
    public final void zza(int i10, String str) {
        this.zza.zzb(i10, str);
    }
}
