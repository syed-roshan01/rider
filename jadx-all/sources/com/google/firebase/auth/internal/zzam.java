package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import f6.a;
import java.util.ArrayList;
import java.util.List;
import l.q;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzam extends MultiFactorSession {
    public static final Parcelable.Creator<zzam> CREATOR = new zzap();
    private String zza;
    private String zzb;
    private List<PhoneMultiFactorInfo> zzc;
    private List<TotpMultiFactorInfo> zzd;
    private zzaf zze;

    private zzam() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, this.zza);
        e.T0(parcel, 2, this.zzb);
        e.W0(parcel, 3, this.zzc);
        e.W0(parcel, 4, this.zzd);
        e.R0(parcel, 5, this.zze, i10);
        e.d1(iY0, parcel);
    }

    public final zzaf zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zza != null;
    }

    public zzam(String str, String str2, List<PhoneMultiFactorInfo> list, List<TotpMultiFactorInfo> list2, zzaf zzafVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list;
        this.zzd = list2;
        this.zze = zzafVar;
    }

    public static zzam zza(String str, zzaf zzafVar) {
        a.u(str);
        zzam zzamVar = new zzam();
        zzamVar.zza = str;
        zzamVar.zze = zzafVar;
        return zzamVar;
    }

    public static zzam zza(List<MultiFactorInfo> list, String str) {
        a.x(list);
        a.u(str);
        zzam zzamVar = new zzam();
        zzamVar.zzc = new ArrayList();
        zzamVar.zzd = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : list) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzamVar.zzc.add((PhoneMultiFactorInfo) multiFactorInfo);
            } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                zzamVar.zzd.add((TotpMultiFactorInfo) multiFactorInfo);
            } else {
                throw new IllegalArgumentException(q.x("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ", multiFactorInfo.getFactorId()));
            }
        }
        zzamVar.zzb = str;
        return zzamVar;
    }
}
