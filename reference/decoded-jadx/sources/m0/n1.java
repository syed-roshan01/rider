package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends y2 implements Parcelable {
    public static final Parcelable.Creator<n1> CREATOR = new l.j2(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        h1 h1Var = h1.f11552a;
        z2 z2Var = this.f11765b;
        if (d7.a.d(z2Var, h1Var)) {
            i11 = 0;
        } else if (d7.a.d(z2Var, o3.f11621a)) {
            i11 = 1;
        } else {
            if (!d7.a.d(z2Var, h2.f11553a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
