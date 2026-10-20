package la;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.auto.accept.app.AutoAcceptApp;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static IBinder f11416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w9.g f11417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f11418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f11419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f11420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f11421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayList f11422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ArrayList f11423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ArrayList f11424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Handler f11425j;

    static {
        e eVar = new e();
        eVar.attachInterface(eVar, "moe.shizuku.server.IShizukuApplication");
        f11420e = eVar;
        f11421f = new b();
        f11422g = new ArrayList();
        f11423h = new ArrayList();
        f11424i = new ArrayList();
        f11425j = new Handler(Looper.getMainLooper());
    }

    public static boolean a(IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            e eVar = f11420e;
            eVar.getClass();
            parcelObtain.writeStrongBinder(eVar);
            parcelObtain.writeString(str);
            boolean zTransact = iBinder.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static boolean b(IBinder iBinder, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", str);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            e eVar = f11420e;
            eVar.getClass();
            parcelObtain.writeStrongBinder(eVar);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            boolean zTransact = iBinder.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static int c() {
        if (f11418c) {
            return 0;
        }
        try {
            w9.g gVar = f11417b;
            if (gVar == null) {
                throw new IllegalStateException("binder haven't been received");
            }
            w9.e eVar = (w9.e) gVar;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                if (!eVar.f16262a.transact(16, parcelObtain, parcelObtain2, 0)) {
                    int i10 = w9.f.f16263a;
                }
                parcelObtain2.readException();
                boolean z10 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                f11418c = z10;
                return z10 ? 0 : -1;
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        } catch (RemoteException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static i d(String[] strArr, String[] strArr2, String str) {
        w9.c cVar;
        try {
            w9.g gVar = f11417b;
            if (gVar == null) {
                throw new IllegalStateException("binder haven't been received");
            }
            w9.e eVar = (w9.e) gVar;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                parcelObtain.writeStringArray(strArr);
                parcelObtain.writeStringArray(strArr2);
                parcelObtain.writeString(str);
                if (!eVar.f16262a.transact(8, parcelObtain, parcelObtain2, 0)) {
                    int i10 = w9.f.f16263a;
                }
                parcelObtain2.readException();
                IBinder strongBinder = parcelObtain2.readStrongBinder();
                int i11 = w9.b.f16261a;
                if (strongBinder == null) {
                    cVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("moe.shizuku.server.IRemoteProcess");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w9.c)) {
                        w9.a aVar = new w9.a();
                        aVar.f16260a = strongBinder;
                        cVar = aVar;
                    } else {
                        cVar = (w9.c) iInterfaceQueryLocalInterface;
                    }
                }
                parcelObtain2.recycle();
                parcelObtain.recycle();
                final i iVar = new i();
                iVar.f11428a = cVar;
                try {
                    cVar.asBinder().linkToDeath(new IBinder.DeathRecipient() { // from class: la.h
                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() {
                            i iVar2 = iVar;
                            iVar2.f11428a = null;
                            Log.v("ShizukuRemoteProcess", "remote process is dead");
                            i.f11427d.remove(iVar2);
                        }
                    }, 0);
                } catch (RemoteException e4) {
                    Log.e("ShizukuRemoteProcess", "linkToDeath", e4);
                }
                i.f11427d.add(iVar);
                return iVar;
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void e(IBinder iBinder, String str) {
        w9.g gVar;
        IBinder iBinder2 = f11416a;
        if (iBinder2 == iBinder) {
            return;
        }
        final int i10 = 1;
        final int i11 = 0;
        if (iBinder == null) {
            f11416a = null;
            f11417b = null;
            synchronized (f11422g) {
                try {
                    for (f fVar : f11423h) {
                        Handler handler = fVar.f11415b;
                        if (handler != null) {
                            final y4.a aVar = (y4.a) fVar.f11414a;
                            Objects.requireNonNull(aVar);
                            handler.post(new Runnable() { // from class: la.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = i11;
                                    y4.a aVar2 = aVar;
                                    switch (i12) {
                                        case 0:
                                            aVar2.getClass();
                                            int i13 = AutoAcceptApp.f3076c;
                                            Log.d("AutoAcceptApp", "Shizuku Binder Dead!");
                                            break;
                                        default:
                                            aVar2.getClass();
                                            int i14 = AutoAcceptApp.f3076c;
                                            Log.d("AutoAcceptApp", "Shizuku Binder Dead!");
                                            break;
                                    }
                                }
                            });
                        } else if (Looper.myLooper() == Looper.getMainLooper()) {
                            ((y4.a) fVar.f11414a).getClass();
                            int i12 = AutoAcceptApp.f3076c;
                            Log.d("AutoAcceptApp", "Shizuku Binder Dead!");
                        } else {
                            Handler handler2 = f11425j;
                            final y4.a aVar2 = (y4.a) fVar.f11414a;
                            Objects.requireNonNull(aVar2);
                            handler2.post(new Runnable() { // from class: la.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = i10;
                                    y4.a aVar3 = aVar2;
                                    switch (i13) {
                                        case 0:
                                            aVar3.getClass();
                                            int i14 = AutoAcceptApp.f3076c;
                                            Log.d("AutoAcceptApp", "Shizuku Binder Dead!");
                                            break;
                                        default:
                                            aVar3.getClass();
                                            int i15 = AutoAcceptApp.f3076c;
                                            Log.d("AutoAcceptApp", "Shizuku Binder Dead!");
                                            break;
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(f11421f, 0);
        }
        f11416a = iBinder;
        int i13 = w9.f.f16263a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("moe.shizuku.server.IShizukuService");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w9.g)) {
            w9.e eVar = new w9.e();
            eVar.f16262a = iBinder;
            gVar = eVar;
        } else {
            gVar = (w9.g) iInterfaceQueryLocalInterface;
        }
        f11417b = gVar;
        try {
            f11416a.linkToDeath(f11421f, 0);
        } catch (Throwable unused) {
            Log.i("ShizukuApplication", "attachApplication");
        }
        try {
            if (!b(f11416a, str) && !a(f11416a, str)) {
                f11419d = true;
            }
            Log.i("ShizukuApplication", "attachApplication");
        } catch (Throwable th2) {
            Log.w("ShizukuApplication", Log.getStackTraceString(th2));
        }
        if (f11419d) {
            h();
        }
    }

    public static boolean f() {
        IBinder iBinder = f11416a;
        return iBinder != null && iBinder.pingBinder();
    }

    public static void g(int i10) {
        try {
            w9.g gVar = f11417b;
            if (gVar == null) {
                throw new IllegalStateException("binder haven't been received");
            }
            w9.e eVar = (w9.e) gVar;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                parcelObtain.writeInt(i10);
                if (!eVar.f16262a.transact(15, parcelObtain, parcelObtain2, 0)) {
                    int i11 = w9.f.f16263a;
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

    public static void h() {
        ArrayList<f> arrayList = f11422g;
        synchronized (arrayList) {
            try {
                for (f fVar : arrayList) {
                    Handler handler = fVar.f11415b;
                    if (handler != null) {
                        final y4.a aVar = (y4.a) fVar.f11414a;
                        Objects.requireNonNull(aVar);
                        final int i10 = 0;
                        handler.post(new Runnable() { // from class: la.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i11 = i10;
                                y4.a aVar2 = aVar;
                                switch (i11) {
                                    case 0:
                                        aVar2.getClass();
                                        int i12 = AutoAcceptApp.f3076c;
                                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                                        break;
                                    case 1:
                                        aVar2.getClass();
                                        int i13 = AutoAcceptApp.f3076c;
                                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                                        break;
                                    case 2:
                                        aVar2.getClass();
                                        int i14 = AutoAcceptApp.f3076c;
                                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                                        break;
                                    default:
                                        aVar2.getClass();
                                        int i15 = AutoAcceptApp.f3076c;
                                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                                        break;
                                }
                            }
                        });
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((y4.a) fVar.f11414a).getClass();
                        int i11 = AutoAcceptApp.f3076c;
                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                    } else {
                        Handler handler2 = f11425j;
                        final y4.a aVar2 = (y4.a) fVar.f11414a;
                        Objects.requireNonNull(aVar2);
                        final int i12 = 1;
                        handler2.post(new Runnable() { // from class: la.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i13 = i12;
                                y4.a aVar3 = aVar2;
                                switch (i13) {
                                    case 0:
                                        aVar3.getClass();
                                        int i14 = AutoAcceptApp.f3076c;
                                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                                        break;
                                    case 1:
                                        aVar3.getClass();
                                        int i15 = AutoAcceptApp.f3076c;
                                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                                        break;
                                    case 2:
                                        aVar3.getClass();
                                        int i16 = AutoAcceptApp.f3076c;
                                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                                        break;
                                    default:
                                        aVar3.getClass();
                                        int i17 = AutoAcceptApp.f3076c;
                                        Log.d("AutoAcceptApp", "Shizuku Binder Received!");
                                        break;
                                }
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
