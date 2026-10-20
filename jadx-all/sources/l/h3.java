package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends h3.b {
    public static final Parcelable.Creator<h3> CREATOR = new j2(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10773d;

    public h3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10772c = parcel.readInt();
        this.f10773d = parcel.readInt() != 0;
    }

    @Override // h3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7543a, i10);
        parcel.writeInt(this.f10772c);
        parcel.writeInt(this.f10773d ? 1 : 0);
    }
}
