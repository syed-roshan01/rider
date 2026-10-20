package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends a6.a {
    public static final Parcelable.Creator<m0> CREATOR = new d.a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f3340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z5.d[] f3341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f3343d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.K0(parcel, 1, this.f3340a);
        y3.e.V0(parcel, 2, this.f3341b, i10);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(this.f3342c);
        y3.e.R0(parcel, 4, this.f3343d, i10);
        y3.e.d1(iY0, parcel);
    }
}
