package z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.t0;
import com.google.android.gms.common.internal.u0;
import com.google.android.gms.common.internal.v0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends a6.a {
    public static final Parcelable.Creator<x> CREATOR = new n(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f17292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17294d;

    public x(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f17291a = str;
        r rVar = null;
        if (iBinder != null) {
            try {
                int i10 = u0.f3392a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                g6.a aVarZzd = (iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new t0(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = aVarZzd == null ? null : (byte[]) g6.b.b(aVarZzd);
                if (bArr != null) {
                    rVar = new r(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e4) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e4);
            }
        }
        this.f17292b = rVar;
        this.f17293c = z10;
        this.f17294d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.T0(parcel, 1, this.f17291a);
        q qVar = this.f17292b;
        if (qVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            qVar = null;
        }
        y3.e.M0(parcel, 2, qVar);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(this.f17293c ? 1 : 0);
        y3.e.f1(parcel, 4, 4);
        parcel.writeInt(this.f17294d ? 1 : 0);
        y3.e.d1(iY0, parcel);
    }

    public x(String str, q qVar, boolean z10, boolean z11) {
        this.f17291a = str;
        this.f17292b = qVar;
        this.f17293c = z10;
        this.f17294d = z11;
    }
}
