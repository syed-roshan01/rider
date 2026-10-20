package q4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<c> CREATOR = new d.a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13131b;

    public c(String str, Map map) {
        this.f13130a = str;
        this.f13131b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (d7.a.d(this.f13130a, cVar.f13130a) && d7.a.d(this.f13131b, cVar.f13131b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13131b.hashCode() + (this.f13130a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f13130a + ", extras=" + this.f13131b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13130a);
        Map map = this.f13131b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
