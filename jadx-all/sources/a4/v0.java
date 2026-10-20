package a4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Parcelable {
    public static final Parcelable.Creator<v0> CREATOR = new d.a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1200f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f1201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1204q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1195a);
        parcel.writeInt(this.f1196b);
        parcel.writeInt(this.f1197c);
        if (this.f1197c > 0) {
            parcel.writeIntArray(this.f1198d);
        }
        parcel.writeInt(this.f1199e);
        if (this.f1199e > 0) {
            parcel.writeIntArray(this.f1200f);
        }
        parcel.writeInt(this.f1202o ? 1 : 0);
        parcel.writeInt(this.f1203p ? 1 : 0);
        parcel.writeInt(this.f1204q ? 1 : 0);
        parcel.writeList(this.f1201n);
    }
}
