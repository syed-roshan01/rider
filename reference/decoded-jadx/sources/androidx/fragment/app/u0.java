package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new d.a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2040b;

    public u0(String str, int i10) {
        this.f2039a = str;
        this.f2040b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2039a);
        parcel.writeInt(this.f2040b);
    }
}
