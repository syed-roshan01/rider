package n6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import z5.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new n(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f12238c;

    public b(int i10, int i11, Intent intent) {
        this.f12236a = i10;
        this.f12237b = i11;
        this.f12238c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f12236a);
        y3.e.f1(parcel, 2, 4);
        parcel.writeInt(this.f12237b);
        y3.e.R0(parcel, 3, this.f12238c, i10);
        y3.e.d1(iY0, parcel);
    }
}
