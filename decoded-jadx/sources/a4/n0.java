package a4;

import android.os.Parcel;
import android.os.Parcelable;
import l.j2;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends h3.b {
    public static final Parcelable.Creator<n0> CREATOR = new j2(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f1163c;

    public n0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1163c = parcel.readParcelable(classLoader == null ? e0.class.getClassLoader() : classLoader);
    }

    @Override // h3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7543a, i10);
        parcel.writeParcelable(this.f1163c, 0);
    }
}
