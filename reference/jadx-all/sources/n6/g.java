package n6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z;
import z5.n;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new n(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f12242b;

    public g(int i10, z zVar) {
        this.f12241a = i10;
        this.f12242b = zVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f12241a);
        y3.e.R0(parcel, 2, this.f12242b, i10);
        y3.e.d1(iY0, parcel);
    }
}
