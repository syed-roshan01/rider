package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends zza implements v0 {
    @Override // com.google.android.gms.common.internal.v0
    public final int zzc() {
        Parcel parcelZzB = zzB(2, zza());
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    @Override // com.google.android.gms.common.internal.v0
    public final g6.a zzd() {
        Parcel parcelZzB = zzB(1, zza());
        g6.a aVarA = g6.b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }
}
