package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t extends a6.a {
    public static final Parcelable.Creator<t> CREATOR = new d.a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f3389b;

    public t(int i10, List list) {
        this.f3388a = i10;
        this.f3389b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f3388a);
        y3.e.W0(parcel, 2, this.f3389b);
        y3.e.d1(iY0, parcel);
    }
}
