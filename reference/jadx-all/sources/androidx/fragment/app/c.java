package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new d.a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1873b;

    public c(Parcel parcel) {
        this.f1872a = parcel.createStringArrayList();
        this.f1873b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1872a);
        parcel.writeTypedList(this.f1873b);
    }
}
