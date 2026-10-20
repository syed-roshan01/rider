package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import c9.e;
import d7.t;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import m9.d0;
import q8.l;
import u.k1;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzal extends i implements e {
    final /* synthetic */ Application zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbd zzc;
    final /* synthetic */ zzbq zzd;
    final /* synthetic */ zzab zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(Application application, String str, zzbd zzbdVar, zzbq zzbqVar, zzab zzabVar, u8.e eVar) {
        super(2, eVar);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbdVar;
        this.zzd = zzbqVar;
        this.zze = zzabVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        a aVar = a.f15963a;
        t.v0(obj);
        zzaf zzafVar = zzaf.zza;
        zzbd zzbdVar = this.zzc;
        Application application = this.zza;
        String strZza = zzaf.zza(application);
        String packageName = application.getPackageName();
        String strZzd = zzbdVar.zzd();
        zzq zzqVar = new zzq(application);
        int i10 = Build.VERSION.SDK_INT;
        String strZza2 = zzqVar.zza("_GRECAPTCHA_KC");
        if (strZza2 == null) {
            strZza2 = "";
        }
        String strEncode = URLEncoder.encode(this.zzb, "UTF-8");
        String strEncode2 = URLEncoder.encode(packageName, "UTF-8");
        String strEncode3 = URLEncoder.encode(strZza, "UTF-8");
        String strEncode4 = URLEncoder.encode("18.4.0", "UTF-8");
        String strEncode5 = URLEncoder.encode(strZzd, "UTF-8");
        StringBuilder sbC = k1.c("k=", strEncode, "&pk=", strEncode2, "&mst=");
        sbC.append(strEncode3);
        sbC.append("&msv=");
        sbC.append(strEncode4);
        sbC.append("&msi=");
        sbC.append(strEncode5);
        sbC.append("&mov=");
        sbC.append(i10);
        sbC.append("&mkc=");
        sbC.append(strZza2);
        byte[] bytes = sbC.toString().getBytes(Charset.forName("UTF-8"));
        zzbq zzbqVar = this.zzd;
        zzab zzabVar = this.zze;
        return zzbqVar.zza(zzabVar.zzb(), bytes, this.zzc);
    }
}
