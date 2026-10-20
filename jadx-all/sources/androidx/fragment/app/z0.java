package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Parcelable {
    public static final Parcelable.Creator<z0> CREATOR = new d.a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f2098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f2099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f2100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f2103f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f2104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f2105o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2098a);
        parcel.writeStringList(this.f2099b);
        parcel.writeTypedArray(this.f2100c, i10);
        parcel.writeInt(this.f2101d);
        parcel.writeString(this.f2102e);
        parcel.writeStringList(this.f2103f);
        parcel.writeTypedList(this.f2104n);
        parcel.writeTypedList(this.f2105o);
    }
}
