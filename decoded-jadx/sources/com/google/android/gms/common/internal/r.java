package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r extends a6.a {
    public static final Parcelable.Creator<r> CREATOR = new d.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3382e;

    public r(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f3378a = i10;
        this.f3379b = z10;
        this.f3380c = z11;
        this.f3381d = i11;
        this.f3382e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f3378a);
        y3.e.f1(parcel, 2, 4);
        parcel.writeInt(this.f3379b ? 1 : 0);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(this.f3380c ? 1 : 0);
        y3.e.f1(parcel, 4, 4);
        parcel.writeInt(this.f3381d);
        y3.e.f1(parcel, 5, 4);
        parcel.writeInt(this.f3382e);
        y3.e.d1(iY0, parcel);
    }
}
