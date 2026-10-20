package h3;

import android.os.Parcel;
import android.os.Parcelable;
import l.j2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f7543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7542b = new a();
    public static final Parcelable.Creator<b> CREATOR = new j2(3);

    public b() {
        this.f7543a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7543a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f7543a = parcelable == f7542b ? null : parcelable;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f7543a = parcelable == null ? f7542b : parcelable;
    }
}
