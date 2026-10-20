package n6;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends zab implements d {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                h hVar = (h) zac.zaa(parcel, h.CREATOR);
                o0 o0Var = (o0) this;
                o0Var.f3233b.post(new v0(2, o0Var, hVar));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
