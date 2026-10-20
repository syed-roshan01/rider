package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends h3.b {
    public static final Parcelable.Creator<k2> CREATOR = new j2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10820c;

    public k2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10820c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f10820c + "}";
    }

    @Override // h3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7543a, i10);
        parcel.writeValue(Boolean.valueOf(this.f10820c));
    }
}
