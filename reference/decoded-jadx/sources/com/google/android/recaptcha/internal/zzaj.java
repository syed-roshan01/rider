package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import c9.e;
import d7.t;
import h6.g;
import java.util.List;
import k9.j;
import k9.k;
import m9.a0;
import m9.d0;
import m9.f1;
import m9.o1;
import m9.p1;
import q8.h;
import q8.l;
import r8.o;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzaj extends i implements e {
    Object zza;
    int zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ zzab zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzbq zzf;
    final /* synthetic */ zzbd zzg;
    final /* synthetic */ zzbg zzh;
    final /* synthetic */ long zzi;
    final /* synthetic */ zzt zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(Application application, zzab zzabVar, String str, zzbq zzbqVar, zzbd zzbdVar, zzt zztVar, WebView webView, zzbg zzbgVar, long j10, u8.e eVar) {
        super(2, eVar);
        this.zzc = application;
        this.zzd = zzabVar;
        this.zze = str;
        this.zzf = zzbqVar;
        this.zzg = zzbdVar;
        this.zzj = zztVar;
        this.zzh = zzbgVar;
        this.zzi = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzaj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzj, null, this.zzh, this.zzi, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00da  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f2 A[LOOP:0: B:22:0x00ec->B:24:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0127  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objU0;
        zzoe zzoeVar;
        Object objZzb;
        Throwable th;
        zzoe zzoeVar2;
        zzt zztVar;
        Throwable thA;
        f1 f1Var;
        List listI0;
        j jVar;
        a aVar = a.f15963a;
        int i10 = this.zzb;
        if (i10 == 0) {
            t.v0(obj);
            zzam zzamVar = zzam.zza;
            Application application = this.zzc;
            zzab zzabVar = this.zzd;
            String str = this.zze;
            zzbq zzbqVar = this.zzf;
            zzbd zzbdVar = this.zzg;
            zzt zztVar2 = this.zzj;
            this.zzb = 1;
            objU0 = z6.a.u0(zztVar2.zza().q(), new zzal(application, str, zzbdVar, zzbqVar, zzabVar, null), this);
            if (objU0 != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            t.v0(obj);
            objU0 = obj;
        } else {
            if (i10 == 2) {
                zzoeVar = (zzoe) this.zza;
                t.v0(obj);
                objZzb = ((h) obj).f13229a;
                zzoeVar2 = zzoeVar;
                zztVar = this.zzj;
                thA = h.a(objZzb);
                if (thA == null) {
                    Application application2 = this.zzc;
                    zzam zzamVar2 = zzam.zza;
                    return new zzaw(application2, zzam.zze(), this.zze, this.zzj, this.zzd, zzoeVar2, this.zzg, this.zzh, new zzq(application2), new zzbs());
                }
                f1Var = (f1) zztVar.zzc().q().f(a0.f11902b);
                if (f1Var != null) {
                    o1 o1Var = new o1(null, (p1) f1Var);
                    jVar = new j();
                    jVar.f10648c = t.M(jVar, jVar, o1Var);
                    while (jVar.hasNext()) {
                        ((f1) jVar.next()).a(null);
                    }
                }
                listI0 = k.I0(new o(new o1(null, (p1) g.g0(zztVar.zzc().q())), 1));
                this.zza = thA;
                this.zzb = 3;
                if (d7.a.z(listI0, this) != aVar) {
                    th = thA;
                }
                return aVar;
            }
            th = (Throwable) this.zza;
            t.v0(obj);
        }
        zzam zzamVar3 = zzam.zza;
        zzam.zzf(new zzg(null, 1, null));
        throw th;
        zzoeVar = (zzoe) objU0;
        zzam.zze().zzd(new zzez(new WebView(this.zzc), this.zze, this.zzc, this.zzd, this.zzg, this.zzj, this.zzh, this.zzf));
        long j10 = this.zzi;
        zzg zzgVarZze = zzam.zze();
        this.zza = zzoeVar;
        this.zzb = 2;
        objZzb = zzgVarZze.zzb(j10, zzoeVar, this);
        if (objZzb != aVar) {
            zzoeVar2 = zzoeVar;
            zztVar = this.zzj;
            thA = h.a(objZzb);
            if (thA == null) {
                Application application3 = this.zzc;
                zzam zzamVar4 = zzam.zza;
                return new zzaw(application3, zzam.zze(), this.zze, this.zzj, this.zzd, zzoeVar2, this.zzg, this.zzh, new zzq(application3), new zzbs());
            }
            f1Var = (f1) zztVar.zzc().q().f(a0.f11902b);
            if (f1Var != null) {
                o1 o1Var2 = new o1(null, (p1) f1Var);
                jVar = new j();
                jVar.f10648c = t.M(jVar, jVar, o1Var2);
                while (jVar.hasNext()) {
                    ((f1) jVar.next()).a(null);
                }
            }
            listI0 = k.I0(new o(new o1(null, (p1) g.g0(zztVar.zzc().q())), 1));
            this.zza = thA;
            this.zzb = 3;
            if (d7.a.z(listI0, this) != aVar) {
                th = thA;
                zzam zzamVar5 = zzam.zza;
                zzam.zzf(new zzg(null, 1, null));
                throw th;
            }
        }
        return aVar;
    }
}
