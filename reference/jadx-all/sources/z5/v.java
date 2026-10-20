package z5;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v extends a6.a {
    public static final Parcelable.Creator<v> CREATOR = new n(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f17285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17286e;

    public v(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f17282a = str;
        this.f17283b = z10;
        this.f17284c = z11;
        this.f17285d = (Context) g6.b.b(g6.b.a(iBinder));
        this.f17286e = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.T0(parcel, 1, this.f17282a);
        y3.e.f1(parcel, 2, 4);
        parcel.writeInt(this.f17283b ? 1 : 0);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(this.f17284c ? 1 : 0);
        y3.e.M0(parcel, 4, new g6.b(this.f17285d));
        y3.e.f1(parcel, 5, 4);
        parcel.writeInt(this.f17286e ? 1 : 0);
        y3.e.d1(iY0, parcel);
    }
}
