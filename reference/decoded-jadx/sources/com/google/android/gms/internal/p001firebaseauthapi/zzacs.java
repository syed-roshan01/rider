package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzacs extends zzadk implements zzaee {
    private zzacm zza;
    private zzacp zzb;
    private zzadp zzc;
    private final zzact zzd;
    private final FirebaseApp zze;
    private String zzf;
    private zzacv zzg;

    public zzacs(FirebaseApp firebaseApp, zzact zzactVar) {
        this(firebaseApp, zzactVar, null, null, null);
    }

    private final zzacv zzb() {
        if (this.zzg == null) {
            this.zzg = new zzacv(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzaej zzaejVar, zzadm<zzaem> zzadmVar) {
        a.x(zzaejVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/createAuthUri", this.zzf), zzaejVar, zzadmVar, zzaem.class, zzacmVar.zza);
    }

    private zzacs(FirebaseApp firebaseApp, zzact zzactVar, zzadp zzadpVar, zzacm zzacmVar, zzacp zzacpVar) {
        this.zze = firebaseApp;
        this.zzf = firebaseApp.getOptions().getApiKey();
        if (zzactVar == null) {
            throw new NullPointerException("null reference");
        }
        this.zzd = zzactVar;
        zza(null, null, null);
        zzaec.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzael zzaelVar, zzadm<Void> zzadmVar) {
        a.x(zzaelVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/deleteAccount", this.zzf), zzaelVar, zzadmVar, Void.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzaeo zzaeoVar, zzadm<zzaen> zzadmVar) {
        a.x(zzaeoVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/emailLinkSignin", this.zzf), zzaeoVar, zzadmVar, zzaen.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzaeq zzaeqVar, zzadm<zzaep> zzadmVar) {
        a.x(zzaeqVar);
        a.x(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzaeqVar, zzadmVar, zzaep.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzaes zzaesVar, zzadm<zzaer> zzadmVar) {
        a.x(zzaesVar);
        a.x(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzaesVar, zzadmVar, zzaer.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzafa zzafaVar, zzadm<zzafm> zzadmVar) {
        a.x(zzafaVar);
        a.x(zzadmVar);
        zzadp zzadpVar = this.zzc;
        zzadl.zza(zzadpVar.zza("/token", this.zzf), zzafaVar, zzadmVar, zzafm.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzaez zzaezVar, zzadm<zzafc> zzadmVar) {
        a.x(zzaezVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/getAccountInfo", this.zzf), zzaezVar, zzadmVar, zzafc.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzafd zzafdVar, zzadm<zzafg> zzadmVar) {
        a.x(zzafdVar);
        a.x(zzadmVar);
        if (zzafdVar.zzb() != null) {
            zzb().zzb(zzafdVar.zzb().zze());
        }
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/getOobConfirmationCode", this.zzf), zzafdVar, zzadmVar, zzafg.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzaff zzaffVar, zzadm<zzafi> zzadmVar) {
        a.x(zzaffVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/getRecaptchaParam", this.zzf), zzadmVar, zzafi.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzafk zzafkVar, zzadm<zzafj> zzadmVar) {
        a.x(zzafkVar);
        a.x(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzafkVar.zzb() + "&version=" + zzafkVar.zzc(), zzadmVar, zzafj.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaee
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzafw zzafwVar, zzadm<zzafv> zzadmVar) {
        a.x(zzafwVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/resetPassword", this.zzf), zzafwVar, zzadmVar, zzafv.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzafy zzafyVar, zzadm<zzaga> zzadmVar) {
        a.x(zzafyVar);
        a.x(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts:revokeToken", this.zzf), zzafyVar, zzadmVar, zzaga.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzafz zzafzVar, zzadm<zzagc> zzadmVar) {
        a.x(zzafzVar);
        a.x(zzadmVar);
        if (!TextUtils.isEmpty(zzafzVar.zzc())) {
            zzb().zzb(zzafzVar.zzc());
        }
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/sendVerificationCode", this.zzf), zzafzVar, zzadmVar, zzagc.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzagb zzagbVar, zzadm<zzage> zzadmVar) {
        a.x(zzagbVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/setAccountInfo", this.zzf), zzagbVar, zzadmVar, zzage.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(String str, zzadm<Void> zzadmVar) {
        a.x(zzadmVar);
        zzb().zza(str);
        zzadmVar.zza((Void) null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzagd zzagdVar, zzadm<zzagg> zzadmVar) {
        a.x(zzagdVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/signupNewUser", this.zzf), zzagdVar, zzadmVar, zzagg.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzagf zzagfVar, zzadm<zzagi> zzadmVar) {
        a.x(zzagfVar);
        a.x(zzadmVar);
        if (zzagfVar instanceof zzagj) {
            zzagj zzagjVar = (zzagj) zzagfVar;
            if (!TextUtils.isEmpty(zzagjVar.zzb())) {
                zzb().zzb(zzagjVar.zzb());
            }
        }
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzagfVar, zzadmVar, zzagi.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzagh zzaghVar, zzadm<zzagk> zzadmVar) {
        a.x(zzaghVar);
        a.x(zzadmVar);
        if (!TextUtils.isEmpty(zzaghVar.zzb())) {
            zzb().zzb(zzaghVar.zzb());
        }
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaghVar, zzadmVar, zzagk.class, zzacpVar.zza);
    }

    private final void zza(zzadp zzadpVar, zzacm zzacmVar, zzacp zzacpVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String strZza = zzadz.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzaec.zzd(this.zzf);
        } else {
            a7.a.t("Found hermetic configuration for secureToken URL: ", strZza, "LocalClient");
        }
        if (this.zzc == null) {
            this.zzc = new zzadp(strZza, zzb());
        }
        String strZza2 = zzadz.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzaec.zzb(this.zzf);
        } else {
            a7.a.t("Found hermetic configuration for identityToolkit URL: ", strZza2, "LocalClient");
        }
        if (this.zza == null) {
            this.zza = new zzacm(strZza2, zzb());
        }
        String strZza3 = zzadz.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzaec.zzc(this.zzf);
        } else {
            a7.a.t("Found hermetic configuration for identityToolkitV2 URL: ", strZza3, "LocalClient");
        }
        if (this.zzb == null) {
            this.zzb = new zzacp(strZza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzags zzagsVar, zzadm<zzagu> zzadmVar) {
        a.x(zzagsVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/verifyAssertion", this.zzf), zzagsVar, zzadmVar, zzagu.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzagt zzagtVar, zzadm<zzagw> zzadmVar) {
        a.x(zzagtVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/verifyCustomToken", this.zzf), zzagtVar, zzadmVar, zzagw.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzagv zzagvVar, zzadm<zzagy> zzadmVar) {
        a.x(zzagvVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/verifyPassword", this.zzf), zzagvVar, zzadmVar, zzagy.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzagx zzagxVar, zzadm<zzaha> zzadmVar) {
        a.x(zzagxVar);
        a.x(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/verifyPhoneNumber", this.zzf), zzagxVar, zzadmVar, zzaha.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final void zza(zzagz zzagzVar, zzadm<zzahc> zzadmVar) {
        a.x(zzagzVar);
        a.x(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzagzVar, zzadmVar, zzahc.class, zzacpVar.zza);
    }
}
