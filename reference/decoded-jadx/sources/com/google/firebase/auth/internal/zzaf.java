package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzafm;
import com.google.android.gms.internal.p001firebaseauthapi.zzafp;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import f6.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class zzaf extends FirebaseUser {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzae();
    private zzafm zza;
    private zzab zzb;
    private String zzc;
    private String zzd;
    private List<zzab> zze;
    private List<String> zzf;
    private String zzg;
    private Boolean zzh;
    private zzah zzi;
    private boolean zzj;
    private com.google.firebase.auth.zzd zzk;
    private zzbj zzl;
    private List<zzafp> zzm;

    public zzaf(FirebaseApp firebaseApp, List<? extends UserInfo> list) {
        a.x(firebaseApp);
        this.zzc = firebaseApp.getName();
        this.zzd = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.zzg = "2";
        zza(list);
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getDisplayName() {
        return this.zzb.getDisplayName();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getEmail() {
        return this.zzb.getEmail();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public FirebaseUserMetadata getMetadata() {
        return this.zzi;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public /* synthetic */ MultiFactor getMultiFactor() {
        return new zzaj(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getPhoneNumber() {
        return this.zzb.getPhoneNumber();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public Uri getPhotoUrl() {
        return this.zzb.getPhotoUrl();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public List<? extends UserInfo> getProviderData() {
        return this.zze;
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getProviderId() {
        return this.zzb.getProviderId();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public String getTenantId() {
        Map map;
        zzafm zzafmVar = this.zza;
        if (zzafmVar == null || zzafmVar.zzc() == null || (map = (Map) zzbi.zza(this.zza.zzc()).getClaims().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getUid() {
        return this.zzb.getUid();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public boolean isAnonymous() {
        GetTokenResult getTokenResultZza;
        Boolean bool = this.zzh;
        if (bool == null || bool.booleanValue()) {
            zzafm zzafmVar = this.zza;
            String signInProvider = "";
            if (zzafmVar != null && (getTokenResultZza = zzbi.zza(zzafmVar.zzc())) != null) {
                signInProvider = getTokenResultZza.getSignInProvider();
            }
            boolean z10 = true;
            if (getProviderData().size() > 1 || (signInProvider != null && signInProvider.equals("custom"))) {
                z10 = false;
            }
            this.zzh = Boolean.valueOf(z10);
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.firebase.auth.UserInfo
    public boolean isEmailVerified() {
        return this.zzb.isEmailVerified();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.R0(parcel, 1, zzc(), i10);
        e.R0(parcel, 2, this.zzb, i10);
        e.T0(parcel, 3, this.zzc);
        e.T0(parcel, 4, this.zzd);
        e.W0(parcel, 5, this.zze);
        e.U0(parcel, 6, zzf());
        e.T0(parcel, 7, this.zzg);
        Boolean boolValueOf = Boolean.valueOf(isAnonymous());
        if (boolValueOf != null) {
            e.f1(parcel, 8, 4);
            parcel.writeInt(boolValueOf.booleanValue() ? 1 : 0);
        }
        e.R0(parcel, 9, getMetadata(), i10);
        boolean z10 = this.zzj;
        e.f1(parcel, 10, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e.R0(parcel, 11, this.zzk, i10);
        e.R0(parcel, 12, this.zzl, i10);
        e.W0(parcel, 13, this.zzm);
        e.d1(iY0, parcel);
    }

    public final zzaf zza(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ FirebaseUser zzb() {
        this.zzh = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final zzafm zzc() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zzd() {
        return zzc().zzc();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zze() {
        return this.zza.zzf();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List<String> zzf() {
        return this.zzf;
    }

    public final com.google.firebase.auth.zzd zzg() {
        return this.zzk;
    }

    public final List<MultiFactorInfo> zzh() {
        zzbj zzbjVar = this.zzl;
        return zzbjVar != null ? zzbjVar.zza() : new ArrayList();
    }

    public final List<zzab> zzi() {
        return this.zze;
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final void zza(zzah zzahVar) {
        this.zzi = zzahVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zzb(List<MultiFactorInfo> list) {
        this.zzl = zzbj.zza(list);
    }

    public final void zzc(List<zzafp> list) {
        a.x(list);
        this.zzm = list;
    }

    public final void zza(com.google.firebase.auth.zzd zzdVar) {
        this.zzk = zzdVar;
    }

    public final void zza(boolean z10) {
        this.zzj = z10;
    }

    public zzaf(zzafm zzafmVar, zzab zzabVar, String str, String str2, List<zzab> list, List<String> list2, String str3, Boolean bool, zzah zzahVar, boolean z10, com.google.firebase.auth.zzd zzdVar, zzbj zzbjVar, List<zzafp> list3) {
        this.zza = zzafmVar;
        this.zzb = zzabVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = list;
        this.zzf = list2;
        this.zzg = str3;
        this.zzh = bool;
        this.zzi = zzahVar;
        this.zzj = z10;
        this.zzk = zzdVar;
        this.zzl = zzbjVar;
        this.zzm = list3;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zza(zzafm zzafmVar) {
        if (zzafmVar == null) {
            throw new NullPointerException("null reference");
        }
        this.zza = zzafmVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final FirebaseApp zza() {
        return FirebaseApp.getInstance(this.zzc);
    }

    public static FirebaseUser zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser) {
        zzaf zzafVar = new zzaf(firebaseApp, firebaseUser.getProviderData());
        if (firebaseUser instanceof zzaf) {
            zzaf zzafVar2 = (zzaf) firebaseUser;
            zzafVar.zzg = zzafVar2.zzg;
            zzafVar.zzd = zzafVar2.zzd;
            zzafVar.zzi = (zzah) zzafVar2.getMetadata();
        } else {
            zzafVar.zzi = null;
        }
        if (firebaseUser.zzc() != null) {
            zzafVar.zza(firebaseUser.zzc());
        }
        if (!firebaseUser.isAnonymous()) {
            zzafVar.zzb();
        }
        return zzafVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized FirebaseUser zza(List<? extends UserInfo> list) {
        try {
            a.x(list);
            this.zze = new ArrayList(list.size());
            this.zzf = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                UserInfo userInfo = list.get(i10);
                if (userInfo.getProviderId().equals("firebase")) {
                    this.zzb = (zzab) userInfo;
                } else {
                    this.zzf.add(userInfo.getProviderId());
                }
                this.zze.add((zzab) userInfo);
            }
            if (this.zzb == null) {
                this.zzb = this.zze.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}
