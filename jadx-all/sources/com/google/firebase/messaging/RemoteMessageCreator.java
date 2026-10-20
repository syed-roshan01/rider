package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    public static final int CONTENT_DESCRIPTION = 0;

    public static void writeToParcel(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.K0(parcel, 2, remoteMessage.bundle);
        y3.e.d1(iY0, parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage createFromParcel(Parcel parcel) {
        int iI0 = y3.e.I0(parcel);
        Bundle bundleS = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            if (((char) i10) != 2) {
                y3.e.E0(i10, parcel);
            } else {
                bundleS = y3.e.S(i10, parcel);
            }
        }
        y3.e.e0(iI0, parcel);
        return new RemoteMessage(bundleS);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
