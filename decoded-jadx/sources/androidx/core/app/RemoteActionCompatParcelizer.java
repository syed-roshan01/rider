package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import h4.a;
import h4.b;
import h4.c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f1791a;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f1791a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f1792b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f7548e);
        }
        remoteActionCompat.f1792b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1793c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f7548e);
        }
        remoteActionCompat.f1793c = charSequence2;
        remoteActionCompat.f1794d = (PendingIntent) aVar.f(remoteActionCompat.f1794d, 4);
        boolean z10 = remoteActionCompat.f1795e;
        if (aVar.e(5)) {
            z10 = ((b) aVar).f7548e.readInt() != 0;
        }
        remoteActionCompat.f1795e = z10;
        boolean z11 = remoteActionCompat.f1796f;
        if (aVar.e(6)) {
            z11 = ((b) aVar).f7548e.readInt() != 0;
        }
        remoteActionCompat.f1796f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1791a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1792b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f7548e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1793c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1794d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z10 = remoteActionCompat.f1795e;
        aVar.h(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f1796f;
        aVar.h(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
