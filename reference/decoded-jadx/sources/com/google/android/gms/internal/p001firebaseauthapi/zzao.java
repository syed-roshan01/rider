package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class zzao<E> extends zzan<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzao(int i10) {
        zzaj.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzao<E> zza(E e4) {
        zzz.zza(e4);
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        if (objArr.length < i10) {
            this.zza = Arrays.copyOf(objArr, zzan.zza(objArr.length, i10));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        objArr2[i11] = e4;
        return this;
    }
}
