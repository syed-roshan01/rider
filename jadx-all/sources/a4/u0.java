package a4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new d.a(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f1193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1194d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1191a + ", mGapDir=" + this.f1192b + ", mHasUnwantedGapAfter=" + this.f1194d + ", mGapPerSpan=" + Arrays.toString(this.f1193c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1191a);
        parcel.writeInt(this.f1192b);
        parcel.writeInt(this.f1194d ? 1 : 0);
        int[] iArr = this.f1193c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1193c);
        }
    }
}
