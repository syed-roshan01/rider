package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import d.a;
import h4.b;
import h4.c;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2287a;

    public ParcelImpl(Parcel parcel) {
        this.f2287a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).i(this.f2287a);
    }
}
