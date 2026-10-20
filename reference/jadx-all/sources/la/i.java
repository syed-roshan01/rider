package la;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.ArraySet;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Set;
import z5.n;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Process implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w9.c f11428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor.AutoCloseOutputStream f11429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ParcelFileDescriptor.AutoCloseInputStream f11430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f11427d = Collections.synchronizedSet(new ArraySet());
    public static final Parcelable.Creator<i> CREATOR = new n(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Process
    public final void destroy() {
        try {
            w9.a aVar = (w9.a) this.f11428a;
            aVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
                if (!aVar.f16260a.transact(6, parcelObtain, parcelObtain2, 0)) {
                    int i10 = w9.b.f16261a;
                }
                parcelObtain2.readException();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // java.lang.Process
    public final int exitValue() {
        try {
            w9.a aVar = (w9.a) this.f11428a;
            aVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
                if (!aVar.f16260a.transact(5, parcelObtain, parcelObtain2, 0)) {
                    int i10 = w9.b.f16261a;
                }
                parcelObtain2.readException();
                return parcelObtain2.readInt();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // java.lang.Process
    public final InputStream getErrorStream() {
        try {
            w9.a aVar = (w9.a) this.f11428a;
            aVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
                if (!aVar.f16260a.transact(3, parcelObtain, parcelObtain2, 0)) {
                    int i10 = w9.b.f16261a;
                }
                parcelObtain2.readException();
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null);
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // java.lang.Process
    public final InputStream getInputStream() {
        if (this.f11430c == null) {
            try {
                w9.a aVar = (w9.a) this.f11428a;
                aVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
                    if (!aVar.f16260a.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i10 = w9.b.f16261a;
                    }
                    parcelObtain2.readException();
                    ParcelFileDescriptor parcelFileDescriptor = parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    this.f11430c = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            } catch (RemoteException e4) {
                throw new RuntimeException(e4);
            }
        }
        return this.f11430c;
    }

    @Override // java.lang.Process
    public final OutputStream getOutputStream() {
        if (this.f11429b == null) {
            try {
                w9.a aVar = (w9.a) this.f11428a;
                aVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
                    if (!aVar.f16260a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i10 = w9.b.f16261a;
                    }
                    parcelObtain2.readException();
                    ParcelFileDescriptor parcelFileDescriptor = parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    this.f11429b = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            } catch (RemoteException e4) {
                throw new RuntimeException(e4);
            }
        }
        return this.f11429b;
    }

    @Override // java.lang.Process
    public final int waitFor() {
        try {
            w9.a aVar = (w9.a) this.f11428a;
            aVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
                if (!aVar.f16260a.transact(4, parcelObtain, parcelObtain2, 0)) {
                    int i10 = w9.b.f16261a;
                }
                parcelObtain2.readException();
                return parcelObtain2.readInt();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.f11428a.asBinder());
    }
}
