package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.zzd;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzyl {
    private final zzadk zza;

    public zzyl(zzadk zzadkVar) {
        if (zzadkVar == null) {
            throw new NullPointerException("null reference");
        }
        this.zza = zzadkVar;
    }

    public final void zzb(String str, String str2, zzacf zzacfVar) {
        a.u(str);
        a.u(str2);
        a.x(zzacfVar);
        zza(str, new zzaad(this, str2, zzacfVar));
    }

    public final void zzc(String str, String str2, zzacf zzacfVar) {
        a.u(str);
        a.u(str2);
        a.x(zzacfVar);
        zza(str, new zzaac(this, str2, zzacfVar));
    }

    public final void zzd(String str, String str2, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        this.zza.zza(new zzafw(str, null, str2), new zzyu(this, zzacfVar));
    }

    public final void zze(String str, String str2, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        this.zza.zza(new zzaej(str, str2), new zzys(this, zzacfVar));
    }

    public final void zzf(String str, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        zza(str, new zzzh(this, zzacfVar));
    }

    public static void zza(zzyl zzylVar, zzagu zzaguVar, zzacf zzacfVar, zzadj zzadjVar) {
        Status statusZza;
        if (zzaguVar.zzo()) {
            zzd zzdVarZzb = zzaguVar.zzb();
            String strZzc = zzaguVar.zzc();
            String strZzj = zzaguVar.zzj();
            if (zzaguVar.zzm()) {
                statusZza = new Status(FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL, null);
            } else {
                statusZza = zzao.zza(zzaguVar.zzd());
            }
            zzacfVar.zza(new zzyj(statusZza, zzdVarZzb, strZzc, strZzj));
            return;
        }
        zzylVar.zza(new zzafm(zzaguVar.zzi(), zzaguVar.zze(), Long.valueOf(zzaguVar.zza()), "Bearer"), zzaguVar.zzh(), zzaguVar.zzg(), Boolean.valueOf(zzaguVar.zzn()), zzaguVar.zzb(), zzacfVar, zzadjVar);
    }

    public final void zzf(String str, String str2, zzacf zzacfVar) {
        a.u(str);
        a.u(str2);
        a.x(zzacfVar);
        zza(str2, new zzzg(this, str, zzacfVar));
    }

    public final void zzb(String str, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        this.zza.zza(new zzafa(str), new zzyk(this, zzacfVar));
    }

    public final void zzc(String str, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        zza(str, new zzzs(this, zzacfVar));
    }

    public final void zzd(String str, zzacf zzacfVar) {
        a.x(zzacfVar);
        this.zza.zza(str, new zzzw(this, zzacfVar));
    }

    public final void zze(String str, zzacf zzacfVar) {
        a.x(zzacfVar);
        this.zza.zza(new zzagd(str), new zzzy(this, zzacfVar));
    }

    private final void zzb(zzafd zzafdVar, zzacf zzacfVar) {
        a.x(zzafdVar);
        a.x(zzacfVar);
        this.zza.zza(zzafdVar, new zzzz(this, zzacfVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacf zzacfVar) {
        a.u(str);
        a.u(str2);
        a.x(zzacfVar);
        this.zza.zza(new zzagv(str, str2, str3, str4), new zzym(this, zzacfVar));
    }

    public final void zzb(String str, String str2, String str3, zzacf zzacfVar) {
        a.u(str);
        a.u(str2);
        a.x(zzacfVar);
        zza(str, new zzzi(this, str2, str3, zzacfVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzagd zzagdVar, zzadj zzadjVar) {
        a.x(zzacfVar);
        a.x(zzagdVar);
        a.x(zzadjVar);
        zzylVar.zza.zza(zzagdVar, new zzza(zzylVar, zzacfVar, zzadjVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzagb zzagbVar, zzadj zzadjVar) {
        a.x(zzacfVar);
        a.x(zzafmVar);
        a.x(zzagbVar);
        a.x(zzadjVar);
        zzylVar.zza.zza(new zzaez(zzafmVar.zzc()), new zzyr(zzylVar, zzadjVar, zzacfVar, zzafmVar, zzagbVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzafb zzafbVar, zzagb zzagbVar, zzadj zzadjVar) {
        a.x(zzacfVar);
        a.x(zzafmVar);
        a.x(zzafbVar);
        a.x(zzagbVar);
        a.x(zzadjVar);
        zzylVar.zza.zza(zzagbVar, new zzyq(zzylVar, zzagbVar, zzafbVar, zzacfVar, zzafmVar, zzadjVar));
    }

    public final void zza(String str, String str2, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        zzagb zzagbVar = new zzagb();
        zzagbVar.zze(str);
        zzagbVar.zzh(str2);
        this.zza.zza(zzagbVar, new zzaaf(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, zzacf zzacfVar) {
        a.u(str);
        a.u(str2);
        a.x(zzacfVar);
        this.zza.zza(new zzafw(str, str2, str3), new zzyw(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacf zzacfVar) {
        a.u(str);
        a.u(str2);
        a.x(zzacfVar);
        this.zza.zza(new zzagd(str, str2, null, str3, str4, null), new zzyn(this, zzacfVar));
    }

    public final void zza(String str, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        zza(str, new zzzu(this, zzacfVar));
    }

    private final void zza(String str, zzadm<zzafm> zzadmVar) {
        a.x(zzadmVar);
        a.u(str);
        zzafm zzafmVarZzb = zzafm.zzb(str);
        if (zzafmVarZzb.zzg()) {
            zzadmVar.zza(zzafmVarZzb);
        } else {
            this.zza.zza(new zzafa(zzafmVarZzb.zzd()), new zzaae(this, zzadmVar));
        }
    }

    public final void zza(zzaeq zzaeqVar, String str, zzacf zzacfVar) {
        a.x(zzaeqVar);
        a.x(zzacfVar);
        zza(str, new zzzm(this, zzaeqVar, zzacfVar));
    }

    public final void zza(zzaes zzaesVar, zzacf zzacfVar) {
        a.x(zzaesVar);
        a.x(zzacfVar);
        this.zza.zza(zzaesVar, new zzzo(this, zzacfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaeo zzaeoVar, zzacf zzacfVar) {
        a.x(zzaeoVar);
        a.x(zzacfVar);
        this.zza.zza(zzaeoVar, new zzyo(this, zzacfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafm zzafmVar, String str, String str2, Boolean bool, zzd zzdVar, zzacf zzacfVar, zzadj zzadjVar) {
        a.x(zzafmVar);
        a.x(zzadjVar);
        a.x(zzacfVar);
        this.zza.zza(new zzaez(zzafmVar.zzc()), new zzyt(this, zzadjVar, str2, str, bool, zzdVar, zzacfVar, zzafmVar));
    }

    public final void zza(zzaff zzaffVar, zzacf zzacfVar) {
        a.x(zzaffVar);
        a.x(zzacfVar);
        this.zza.zza(zzaffVar, new zzzt(this, zzacfVar));
    }

    public final void zza(zzafk zzafkVar, zzacf zzacfVar) {
        a.x(zzafkVar);
        a.x(zzacfVar);
        this.zza.zza(zzafkVar, new zzzq(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacf zzacfVar) {
        a.u(str);
        a.u(str2);
        a.u(str3);
        a.x(zzacfVar);
        zza(str3, new zzzb(this, str, str2, str4, str5, zzacfVar));
    }

    public final void zza(String str, zzags zzagsVar, zzacf zzacfVar) {
        a.u(str);
        a.x(zzagsVar);
        a.x(zzacfVar);
        zza(str, new zzzf(this, zzagsVar, zzacfVar));
    }

    public final void zza(String str, zzagx zzagxVar, zzacf zzacfVar) {
        a.u(str);
        a.x(zzagxVar);
        a.x(zzacfVar);
        zza(str, new zzzd(this, zzagxVar, zzacfVar));
    }

    public final void zza(zzafy zzafyVar, zzacf zzacfVar) {
        this.zza.zza(zzafyVar, new zzaab(this, zzacfVar));
    }

    public final void zza(String str, ActionCodeSettings actionCodeSettings, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        zzafd zzafdVar = new zzafd(4);
        zzafdVar.zzd(str);
        if (actionCodeSettings != null) {
            zzafdVar.zza(actionCodeSettings);
        }
        zzb(zzafdVar, zzacfVar);
    }

    public final void zza(String str, ActionCodeSettings actionCodeSettings, String str2, String str3, zzacf zzacfVar) {
        a.u(str);
        a.x(zzacfVar);
        zzafd zzafdVar = new zzafd(actionCodeSettings.zza());
        zzafdVar.zzb(str);
        zzafdVar.zza(actionCodeSettings);
        zzafdVar.zzc(str2);
        zzafdVar.zza(str3);
        this.zza.zza(zzafdVar, new zzyv(this, zzacfVar));
    }

    public final void zza(zzafz zzafzVar, zzacf zzacfVar) {
        a.u(zzafzVar.zzd());
        a.x(zzacfVar);
        this.zza.zza(zzafzVar, new zzyz(this, zzacfVar));
    }

    public final void zza(zzags zzagsVar, zzacf zzacfVar) {
        a.x(zzagsVar);
        a.x(zzacfVar);
        zzagsVar.zzb(true);
        this.zza.zza(zzagsVar, new zzzk(this, zzacfVar));
    }

    public final void zza(zzagt zzagtVar, zzacf zzacfVar) {
        a.x(zzagtVar);
        a.x(zzacfVar);
        this.zza.zza(zzagtVar, new zzyx(this, zzacfVar));
    }

    public final void zza(EmailAuthCredential emailAuthCredential, String str, zzacf zzacfVar) {
        a.x(emailAuthCredential);
        a.x(zzacfVar);
        if (emailAuthCredential.zzg()) {
            zza(emailAuthCredential.zzb(), new zzyp(this, emailAuthCredential, str, zzacfVar));
        } else {
            zza(new zzaeo(emailAuthCredential, null, str), zzacfVar);
        }
    }

    public final void zza(zzagx zzagxVar, zzacf zzacfVar) {
        a.x(zzagxVar);
        a.x(zzacfVar);
        this.zza.zza(zzagxVar, new zzyy(this, zzacfVar));
    }

    public final void zza(zzagf zzagfVar, zzacf zzacfVar) {
        a.x(zzagfVar);
        a.x(zzacfVar);
        this.zza.zza(zzagfVar, new zzzn(this, zzagfVar, zzacfVar));
    }

    public final void zza(zzagh zzaghVar, zzacf zzacfVar) {
        a.x(zzaghVar);
        a.x(zzacfVar);
        this.zza.zza(zzaghVar, new zzzr(this, zzacfVar));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzacf zzacfVar) {
        a.u(str);
        a.x(userProfileChangeRequest);
        a.x(zzacfVar);
        zza(str, new zzaaa(this, userProfileChangeRequest, zzacfVar));
    }

    public final void zza(zzafd zzafdVar, zzacf zzacfVar) {
        zzb(zzafdVar, zzacfVar);
    }
}
