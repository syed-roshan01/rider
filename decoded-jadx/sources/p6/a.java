package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f12788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12789b;

    public a(IBinder iBinder, String str) {
        this.f12788a = iBinder;
        this.f12789b = str;
    }

    public final void a(int i10, Parcel parcel) {
        try {
            this.f12788a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12788a;
    }
}
