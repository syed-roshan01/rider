package y5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new d.a(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f16948a;

    public a(Intent intent) {
        this.f16948a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.R0(parcel, 1, this.f16948a, i10);
        y3.e.d1(iY0, parcel);
    }
}
