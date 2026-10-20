package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends a6.a {
    public static final Parcelable.Creator<a0> CREATOR = new d.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f3281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z5.b f3282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3284e;

    public a0(int i10, IBinder iBinder, z5.b bVar, boolean z10, boolean z11) {
        this.f3280a = i10;
        this.f3281b = iBinder;
        this.f3282c = bVar;
        this.f3283d = z10;
        this.f3284e = z11;
    }

    public final boolean equals(Object obj) {
        Object s0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f3282c.equals(a0Var.f3282c)) {
            Object s0Var2 = null;
            IBinder iBinder = this.f3281b;
            if (iBinder == null) {
                s0Var = null;
            } else {
                int i10 = a.f3279a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                s0Var = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new s0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            IBinder iBinder2 = a0Var.f3281b;
            if (iBinder2 != null) {
                int i11 = a.f3279a;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                s0Var2 = iInterfaceQueryLocalInterface2 instanceof m ? (m) iInterfaceQueryLocalInterface2 : new s0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            if (y3.e.g0(s0Var, s0Var2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f3280a);
        y3.e.M0(parcel, 2, this.f3281b);
        y3.e.R0(parcel, 3, this.f3282c, i10);
        y3.e.f1(parcel, 4, 4);
        parcel.writeInt(this.f3283d ? 1 : 0);
        y3.e.f1(parcel, 5, 4);
        parcel.writeInt(this.f3284e ? 1 : 0);
        y3.e.d1(iY0, parcel);
    }
}
