package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class z extends a6.a {
    public static final Parcelable.Creator<z> CREATOR = new d.a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f3401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f3403d;

    public z(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f3400a = i10;
        this.f3401b = account;
        this.f3402c = i11;
        this.f3403d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f3400a);
        y3.e.R0(parcel, 2, this.f3401b, i10);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(this.f3402c);
        y3.e.R0(parcel, 4, this.f3403d, i10);
        y3.e.d1(iY0, parcel);
    }
}
