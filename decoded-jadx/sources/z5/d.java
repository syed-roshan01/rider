package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new n(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17249c;

    public d(String str, long j10) {
        this.f17247a = str;
        this.f17249c = j10;
        this.f17248b = -1;
    }

    public final long e() {
        long j10 = this.f17249c;
        return j10 == -1 ? this.f17248b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f17247a;
            if (((str != null && str.equals(dVar.f17247a)) || (str == null && dVar.f17247a == null)) && e() == dVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17247a, Long.valueOf(e())});
    }

    public final String toString() {
        l.t tVar = new l.t(this);
        tVar.b(this.f17247a, "name");
        tVar.b(Long.valueOf(e()), "version");
        return tVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.T0(parcel, 1, this.f17247a);
        y3.e.f1(parcel, 2, 4);
        parcel.writeInt(this.f17248b);
        long jE = e();
        y3.e.f1(parcel, 3, 8);
        parcel.writeLong(jE);
        y3.e.d1(iY0, parcel);
    }

    public d(String str, long j10, int i10) {
        this.f17247a = str;
        this.f17248b = i10;
        this.f17249c = j10;
    }
}
