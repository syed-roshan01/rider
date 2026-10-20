package com.google.android.gms.internal.p001firebaseauthapi;

import a7.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzpb {
    private final Class<? extends zzow> zza;
    private final zzxr zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpb)) {
            return false;
        }
        zzpb zzpbVar = (zzpb) obj;
        return zzpbVar.zza.equals(this.zza) && zzpbVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return a.n(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzpb(Class<? extends zzow> cls, zzxr zzxrVar) {
        this.zza = cls;
        this.zzb = zzxrVar;
    }
}
