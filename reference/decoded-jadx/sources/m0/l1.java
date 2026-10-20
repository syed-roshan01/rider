package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends u2 implements Parcelable {
    public static final Parcelable.Creator<l1> CREATOR = new d.a(4);

    public l1(int i10) {
        this.f11712b = new t2(i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(d());
    }
}
