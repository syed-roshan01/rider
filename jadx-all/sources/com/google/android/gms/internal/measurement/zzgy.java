package com.google.android.gms.internal.measurement;

import java.util.Collection;
import r6.m;
import r6.p;
import r6.u;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzgy {
    private final boolean zza;

    public zzgy(zzhb zzhbVar) {
        e.J(zzhbVar, "BuildInfo must be non-null");
        this.zza = !zzhbVar.zza();
    }

    public final boolean zza(String str) {
        e.J(str, "flagName must not be null");
        if (!this.zza) {
            return true;
        }
        m mVarListIterator = ((p) ((u) zzha.zza.get()).a().values()).listIterator(0);
        while (mVarListIterator.hasNext()) {
            if (((Collection) mVarListIterator.next()).contains(str)) {
                return true;
            }
        }
        return false;
    }
}
