package a4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new d.a(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1185c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1183a);
        parcel.writeInt(this.f1184b);
        parcel.writeInt(this.f1185c ? 1 : 0);
    }
}
