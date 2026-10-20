package h6;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class k extends zza {
    public final g6.a a(g6.b bVar, String str, int i10, g6.b bVar2) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        zzc.zzf(parcelZza, bVar2);
        Parcel parcelZzB = zzB(2, parcelZza);
        g6.a aVarA = g6.b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final g6.a b(g6.b bVar, String str, int i10, g6.b bVar2) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        zzc.zzf(parcelZza, bVar2);
        Parcel parcelZzB = zzB(3, parcelZza);
        g6.a aVarA = g6.b.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }
}
