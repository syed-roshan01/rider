package com.google.android.gms.internal.measurement;

import a6.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzdd extends a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzdg();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdd(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        long j10 = this.zza;
        e.f1(parcel, 1, 8);
        parcel.writeLong(j10);
        long j11 = this.zzb;
        e.f1(parcel, 2, 8);
        parcel.writeLong(j11);
        boolean z10 = this.zzc;
        e.f1(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e.T0(parcel, 4, this.zzd);
        e.T0(parcel, 5, this.zze);
        e.T0(parcel, 6, this.zzf);
        e.K0(parcel, 7, this.zzg);
        e.T0(parcel, 8, this.zzh);
        e.d1(iY0, parcel);
    }
}
