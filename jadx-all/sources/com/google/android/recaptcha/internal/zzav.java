package com.google.android.recaptcha.internal;

import c9.e;
import com.google.android.recaptcha.RecaptchaAction;
import d7.t;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import m9.d0;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzav extends i implements e {
    final /* synthetic */ zzbd zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzog zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(zzbd zzbdVar, zzaw zzawVar, RecaptchaAction recaptchaAction, zzog zzogVar, u8.e eVar) {
        super(2, eVar);
        this.zza = zzbdVar;
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = zzogVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzav(this.zza, this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzav) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws zzp {
        a aVar = a.f15963a;
        t.v0(obj);
        zzbb zzbbVarZza = this.zza.zza(zzne.FETCH_TOKEN);
        zzbg zzbgVar = this.zzb.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        zzob zzobVarZzf = zzoc.zzf();
        zzaw zzawVar = this.zzb;
        zzobVarZzf.zzr(zzawVar.zzg());
        zzobVarZzf.zzd(this.zzc.getAction());
        zzobVarZzf.zzq(zzawVar.zzg.zzI());
        zzobVarZzf.zzp(zzawVar.zzg.zzH());
        zzog zzogVar = this.zzd;
        zzobVarZzf.zzt(zzogVar.zzH());
        zzobVarZzf.zze(zzogVar.zzj());
        zzobVarZzf.zzs(zzogVar.zzI());
        zzoc zzocVar = (zzoc) zzobVarZzf.zzj();
        try {
            URLConnection uRLConnectionOpenConnection = new URL(this.zzb.zzf.zzd()).openConnection();
            d7.a.k(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            try {
                httpURLConnection.connect();
                zzoi zzoiVarZzf = zzoj.zzf();
                zzoiVarZzf.zzd(zzocVar.zzi());
                zzoiVarZzf.zzq(zzocVar.zzk());
                zzoiVarZzf.zzt(zzocVar.zzI());
                zzoiVarZzf.zzp(zzocVar.zzH());
                zzoiVarZzf.zzr(zzocVar.zzJ());
                zzoiVarZzf.zzs(zzocVar.zzK());
                zzoiVarZzf.zze(zzocVar.zzj());
                httpURLConnection.getOutputStream().write(((zzoj) zzoiVarZzf.zzj()).zzd());
                if (httpURLConnection.getResponseCode() != 200) {
                    throw zzbr.zza(httpURLConnection.getResponseCode());
                }
                try {
                    zzol zzolVarZzg = zzol.zzg(httpURLConnection.getInputStream());
                    this.zzb.zzi.zza(zzbbVarZza);
                    return zzolVarZzg;
                } catch (Exception unused) {
                    throw new zzp(zzn.zzc, zzl.zzR, null);
                }
            } catch (Exception e4) {
                if (e4 instanceof zzp) {
                    throw ((zzp) e4);
                }
                throw new zzp(zzn.zze, zzl.zzQ, null);
            }
        } catch (Exception e10) {
            zzp zzpVar = e10 instanceof zzp ? (zzp) e10 : new zzp(zzn.zzc, zzl.zzam, null);
            this.zzb.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }
}
