package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzas implements Parcelable.Creator<PlayGamesAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final PlayGamesAuthCredential createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                e.E0(i10, parcel);
            } else {
                strV = e.V(i10, parcel);
            }
        }
        e.e0(iI0, parcel);
        return new PlayGamesAuthCredential(strV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlayGamesAuthCredential[] newArray(int i10) {
        return new PlayGamesAuthCredential[i10];
    }
}
