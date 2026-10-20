package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzahd;
import com.google.android.gms.internal.p001firebaseauthapi.zzahf;
import java.io.IOException;
import java.io.OutputStream;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzahd<MessageType extends zzahd<MessageType, BuilderType>, BuilderType extends zzahf<MessageType, BuilderType>> implements zzakk {
    protected int zza = 0;

    public int zza(zzalc zzalcVar) {
        int iZzh = zzh();
        if (iZzh != -1) {
            return iZzh;
        }
        int iZza = zzalcVar.zza(this);
        zzb(iZza);
        return iZza;
    }

    public void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    public int zzh() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final zzahm zzi() {
        try {
            zzahv zzahvVarZzc = zzahm.zzc(zzk());
            zza(zzahvVarZzc.zzb());
            return zzahvVarZzc.zza();
        } catch (IOException e4) {
            throw new RuntimeException(q.k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e4);
        }
    }

    public final byte[] zzj() {
        try {
            byte[] bArr = new byte[zzk()];
            zzaii zzaiiVarZzb = zzaii.zzb(bArr);
            zza(zzaiiVarZzb);
            zzaiiVarZzb.zzb();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(q.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e4);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzaii zzaiiVarZza = zzaii.zza(outputStream, zzaii.zzd(zzk()));
        zza(zzaiiVarZza);
        zzaiiVarZza.zzc();
    }
}
