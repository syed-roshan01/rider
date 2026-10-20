package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new d.a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3148b;

    public Scope(int i10, String str) {
        f6.a.v("scopeUri must not be null or empty", str);
        this.f3147a = i10;
        this.f3148b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3148b.equals(((Scope) obj).f3148b);
    }

    public final int hashCode() {
        return this.f3148b.hashCode();
    }

    public final String toString() {
        return this.f3148b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f3147a);
        y3.e.T0(parcel, 2, this.f3148b);
        y3.e.d1(iY0, parcel);
    }
}
