package n6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a0;
import z5.n;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new n(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5.b f12244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f12245c;

    public h(int i10, z5.b bVar, a0 a0Var) {
        this.f12243a = i10;
        this.f12244b = bVar;
        this.f12245c = a0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f12243a);
        y3.e.R0(parcel, 2, this.f12244b, i10);
        y3.e.R0(parcel, 3, this.f12245c, i10);
        y3.e.d1(iY0, parcel);
    }
}
