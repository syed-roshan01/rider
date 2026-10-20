package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import z5.n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new n(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12240b;

    public f(String str, ArrayList arrayList) {
        this.f12239a = arrayList;
        this.f12240b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.U0(parcel, 1, this.f12239a);
        y3.e.T0(parcel, 2, this.f12240b);
        y3.e.d1(iY0, parcel);
    }
}
