package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzhv {
    private final zzig zza;
    private final byte[] zzb;

    public final zzhm zza() {
        this.zza.zzb();
        return new zzhw(this.zzb);
    }

    public final zzig zzb() {
        return this.zza;
    }

    private zzhv(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzig.zzb(bArr);
    }
}
