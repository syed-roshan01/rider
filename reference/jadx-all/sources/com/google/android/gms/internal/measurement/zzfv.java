package com.google.android.gms.internal.measurement;

import android.content.Context;
import q6.m;

/* JADX INFO: loaded from: classes.dex */
final class zzfv extends zzgu {
    private final Context zza;
    private final m zzb;

    public zzfv(Context context, m mVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = mVar;
    }

    public final boolean equals(Object obj) {
        m mVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgu) {
            zzgu zzguVar = (zzgu) obj;
            if (this.zza.equals(zzguVar.zza()) && ((mVar = this.zzb) != null ? mVar.equals(zzguVar.zzb()) : zzguVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        m mVar = this.zzb;
        return iHashCode ^ (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.zza) + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzgu
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzgu
    public final m zzb() {
        return this.zzb;
    }
}
