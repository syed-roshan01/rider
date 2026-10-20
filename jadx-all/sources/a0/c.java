package a0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new d.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f778a;

    public c(int i10) {
        this.f778a = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f778a == ((c) obj).f778a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f778a);
    }

    public final String toString() {
        return a7.a.o(new StringBuilder("DefaultLazyKey(index="), this.f778a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f778a);
    }
}
