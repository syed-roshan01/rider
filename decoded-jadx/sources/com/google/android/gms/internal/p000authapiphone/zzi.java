package com.google.android.gms.internal.p000authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends zzb implements zzj {
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzj
    public final void zza(zzl zzlVar) {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzlVar);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzj
    public final void zza(String str, zzl zzlVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzd.zza(parcelZza, zzlVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzj
    public final void zza(h hVar) {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, hVar);
        zza(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzj
    public final void zza(zzf zzfVar) {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzfVar);
        zza(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzj
    public final void zza(String str, zzh zzhVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzd.zza(parcelZza, zzhVar);
        zza(5, parcelZza);
    }
}
