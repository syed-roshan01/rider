package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p extends a6.a {
    public static final Parcelable.Creator<p> CREATOR = new d.a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3364f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3367p;

    public p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f3359a = i10;
        this.f3360b = i11;
        this.f3361c = i12;
        this.f3362d = j10;
        this.f3363e = j11;
        this.f3364f = str;
        this.f3365n = str2;
        this.f3366o = i13;
        this.f3367p = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f3359a);
        y3.e.f1(parcel, 2, 4);
        parcel.writeInt(this.f3360b);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(this.f3361c);
        y3.e.f1(parcel, 4, 8);
        parcel.writeLong(this.f3362d);
        y3.e.f1(parcel, 5, 8);
        parcel.writeLong(this.f3363e);
        y3.e.T0(parcel, 6, this.f3364f);
        y3.e.T0(parcel, 7, this.f3365n);
        y3.e.f1(parcel, 8, 4);
        parcel.writeInt(this.f3366o);
        y3.e.f1(parcel, 9, 4);
        parcel.writeInt(this.f3367p);
        y3.e.d1(iY0, parcel);
    }
}
