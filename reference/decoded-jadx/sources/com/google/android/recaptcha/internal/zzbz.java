package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import java.util.List;
import m9.d0;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzbz extends i implements e {
    int zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ zzca zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbz(zzcj zzcjVar, zzca zzcaVar, String str, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzcjVar;
        this.zzc = zzcaVar;
        this.zzd = str;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzbz(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbz) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r1.zzg(r5, r3, r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1.zzh(r5, r2, r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return r0;
     */
    @Override // w8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        int i10 = this.zza;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    t.v0(obj);
                } else {
                    t.v0(obj);
                }
                return l.f13235a;
            }
            t.v0(obj);
            this.zzb.zza = new zzz();
            zzpf zzpfVarZza = this.zzc.zzd.zza(zzpn.zzg(zzfy.zzh().zzj(this.zzd)));
            zzca zzcaVar = this.zzc;
            List listZzi = zzpfVarZza.zzi();
            zzcj zzcjVar = this.zzb;
            this.zza = 1;
        } catch (Exception e4) {
            zzca zzcaVar2 = this.zzc;
            zzcj zzcjVar2 = this.zzb;
            this.zza = 2;
        }
        return l.f13235a;
    }
}
