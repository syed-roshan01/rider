package w9;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            bundle.getInt("shizuku:attach-reply-uid", -1);
            IBinder iBinder = la.g.f11416a;
            bundle.getInt("shizuku:attach-reply-version", -1);
            bundle.getInt("shizuku:attach-reply-patch-version", -1);
            bundle.getString("shizuku:attach-reply-secontext");
            la.g.f11418c = bundle.getBoolean("shizuku:attach-reply-permission-granted", false);
            bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false);
            la.g.h();
            return true;
        }
        if (i10 != 3) {
            if (i10 != 10001) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("moe.shizuku.server.IShizukuApplication");
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            parcel.readInt();
            parcel.readInt();
            parcel.readString();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
        int i12 = parcel.readInt();
        int i13 = (parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null).getBoolean("shizuku:request-permission-reply-allowed", false) ? 0 : -1;
        synchronized (la.g.f11422g) {
            try {
                for (la.f fVar : la.g.f11424i) {
                    Handler handler = fVar.f11415b;
                    if (handler != null) {
                        handler.post(new la.d(fVar, i12, i13, 0));
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((c5.f) fVar.f11414a).a(i13);
                    } else {
                        la.g.f11425j.post(new la.d(fVar, i12, i13, 1));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
