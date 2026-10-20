package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzafm;
import com.google.android.gms.internal.p001firebaseauthapi.zzafp;
import java.util.ArrayList;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzae implements Parcelable.Creator<zzaf> {
    @Override // android.os.Parcelable.Creator
    public final zzaf createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        boolean zP0 = false;
        zzafm zzafmVar = null;
        zzab zzabVar = null;
        String strV = null;
        String strV2 = null;
        ArrayList arrayListY = null;
        ArrayList arrayListW = null;
        String strV3 = null;
        Boolean boolValueOf = null;
        zzah zzahVar = null;
        com.google.firebase.auth.zzd zzdVar = null;
        zzbj zzbjVar = null;
        ArrayList arrayListY2 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    zzafmVar = (zzafm) e.U(parcel, i10, zzafm.CREATOR);
                    break;
                case 2:
                    zzabVar = (zzab) e.U(parcel, i10, zzab.CREATOR);
                    break;
                case 3:
                    strV = e.V(i10, parcel);
                    break;
                case 4:
                    strV2 = e.V(i10, parcel);
                    break;
                case 5:
                    arrayListY = e.Y(parcel, i10, zzab.CREATOR);
                    break;
                case 6:
                    arrayListW = e.W(i10, parcel);
                    break;
                case 7:
                    strV3 = e.V(i10, parcel);
                    break;
                case '\b':
                    int iZ0 = e.z0(i10, parcel);
                    if (iZ0 != 0) {
                        e.c1(parcel, iZ0, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case '\t':
                    zzahVar = (zzah) e.U(parcel, i10, zzah.CREATOR);
                    break;
                case '\n':
                    zP0 = e.p0(i10, parcel);
                    break;
                case 11:
                    zzdVar = (com.google.firebase.auth.zzd) e.U(parcel, i10, com.google.firebase.auth.zzd.CREATOR);
                    break;
                case '\f':
                    zzbjVar = (zzbj) e.U(parcel, i10, zzbj.CREATOR);
                    break;
                case '\r':
                    arrayListY2 = e.Y(parcel, i10, zzafp.CREATOR);
                    break;
                default:
                    e.E0(i10, parcel);
                    break;
            }
        }
        e.e0(iI0, parcel);
        return new zzaf(zzafmVar, zzabVar, strV, strV2, arrayListY, arrayListW, strV3, boolValueOf, zzahVar, zP0, zzdVar, zzbjVar, arrayListY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaf[] newArray(int i10) {
        return new zzaf[i10];
    }
}
