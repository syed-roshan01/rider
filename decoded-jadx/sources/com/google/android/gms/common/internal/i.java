package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a6.a {
    public static final Parcelable.Creator<i> CREATOR = new d.a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f3311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f3313f;

    public i(r rVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f3308a = rVar;
        this.f3309b = z10;
        this.f3310c = z11;
        this.f3311d = iArr;
        this.f3312e = i10;
        this.f3313f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.R0(parcel, 1, this.f3308a, i10);
        y3.e.f1(parcel, 2, 4);
        parcel.writeInt(this.f3309b ? 1 : 0);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(this.f3310c ? 1 : 0);
        int[] iArr = this.f3311d;
        if (iArr != null) {
            int iY1 = y3.e.Y0(4, parcel);
            parcel.writeIntArray(iArr);
            y3.e.d1(iY1, parcel);
        }
        y3.e.f1(parcel, 5, 4);
        parcel.writeInt(this.f3312e);
        int[] iArr2 = this.f3313f;
        if (iArr2 != null) {
            int iY2 = y3.e.Y0(6, parcel);
            parcel.writeIntArray(iArr2);
            y3.e.d1(iY2, parcel);
        }
        y3.e.d1(iY0, parcel);
    }
}
