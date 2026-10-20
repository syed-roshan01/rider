package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends w2 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR = new d.a(5);

    public m1(long j10) {
        this.f11729b = new v2(j10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(d());
    }
}
