package z5;

import android.os.Parcel;
import android.os.Parcelable;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends a6.a {
    public static final Parcelable.Creator<w> CREATOR = new n(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17290d;

    public w(int i10, int i11, String str, boolean z10) {
        this.f17287a = z10;
        this.f17288b = str;
        this.f17289c = d0.n0(i10) - 1;
        this.f17290d = y3.e.X0(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f17287a ? 1 : 0);
        y3.e.T0(parcel, 2, this.f17288b);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(this.f17289c);
        y3.e.f1(parcel, 4, 4);
        parcel.writeInt(this.f17290d);
        y3.e.d1(iY0, parcel);
    }
}
