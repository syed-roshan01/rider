package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import l.t;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends a6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new d.a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f3152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z5.b f3153e;

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, z5.b bVar) {
        this.f3149a = i10;
        this.f3150b = i11;
        this.f3151c = str;
        this.f3152d = pendingIntent;
        this.f3153e = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f3149a == status.f3149a && this.f3150b == status.f3150b && y3.e.g0(this.f3151c, status.f3151c) && y3.e.g0(this.f3152d, status.f3152d) && y3.e.g0(this.f3153e, status.f3153e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3149a), Integer.valueOf(this.f3150b), this.f3151c, this.f3152d, this.f3153e});
    }

    public final String toString() {
        t tVar = new t(this);
        String strL0 = this.f3151c;
        if (strL0 == null) {
            strL0 = y3.e.l0(this.f3150b);
        }
        tVar.b(strL0, "statusCode");
        tVar.b(this.f3152d, "resolution");
        return tVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f3150b);
        y3.e.T0(parcel, 2, this.f3151c);
        y3.e.R0(parcel, 3, this.f3152d, i10);
        y3.e.R0(parcel, 4, this.f3153e, i10);
        y3.e.f1(parcel, 1000, 4);
        parcel.writeInt(this.f3149a);
        y3.e.d1(iY0, parcel);
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }
}
