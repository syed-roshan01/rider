package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zze implements Parcelable.Creator<PhoneAuthProvider.ForceResendingToken> {
    @Override // android.os.Parcelable.Creator
    public final PhoneAuthProvider.ForceResendingToken createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        while (parcel.dataPosition() < iI0) {
            e.E0(parcel.readInt(), parcel);
        }
        e.e0(iI0, parcel);
        return new PhoneAuthProvider.ForceResendingToken();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneAuthProvider.ForceResendingToken[] newArray(int i10) {
        return new PhoneAuthProvider.ForceResendingToken[i10];
    }
}
