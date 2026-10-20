package p6;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends i implements p {
    @Override // p6.i
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) j.a(parcel, Bundle.CREATOR);
            j.b(parcel);
            e(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) j.a(parcel, Bundle.CREATOR);
            j.b(parcel);
            c(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) j.a(parcel, Bundle.CREATOR);
            j.b(parcel);
            d(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) j.a(parcel, Bundle.CREATOR);
        j.b(parcel);
        b(bundle4);
        return true;
    }
}
