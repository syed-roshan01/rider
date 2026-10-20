package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import c9.e;
import d7.t;
import m9.d0;
import q8.l;
import r8.p;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzbl extends i implements e {
    final /* synthetic */ zzbm zza;
    final /* synthetic */ zzpd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzbm zzbmVar, zzpd zzpdVar, u8.e eVar) {
        super(2, eVar);
        this.zza = zzbmVar;
        this.zzb = zzpdVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzbl(this.zza, this.zzb, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        t.v0(obj);
        zzbm zzbmVar = this.zza;
        zzpd zzpdVar = this.zzb;
        synchronized (zzbh.class) {
            try {
                if (zzbmVar.zze != null) {
                    byte[] bArrZzd = zzpdVar.zzd();
                    zzba zzbaVar = new zzba(zzfy.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzaz zzazVar = zzbmVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzbaVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzbaVar.zzb()));
                    zzazVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzbmVar.zze.zzb() - 500;
                    if (iZzb > 0) {
                        zzbmVar.zze.zza(p.S0(zzbmVar.zze.zzd(), iZzb));
                    }
                    if (zzbmVar.zze.zzb() >= 20) {
                        zzbmVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l.f13235a;
    }
}
