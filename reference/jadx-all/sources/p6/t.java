package p6;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends i implements u {
    @Override // p6.i
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) j.a(parcel, Bundle.CREATOR);
        j.b(parcel);
        b(bundle);
        return true;
    }
}
