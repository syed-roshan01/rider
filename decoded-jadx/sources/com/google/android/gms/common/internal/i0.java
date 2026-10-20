package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f3314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3315b;

    public i0(f fVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f3314a = fVar;
        this.f3315b = i10;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12 = this.f3315b;
        if (i10 == 1) {
            int i13 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            f6.a.y(this.f3314a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f3314a.onPostInitHandler(i13, strongBinder, bundle, i12);
            this.f3314a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            m0 m0Var = (m0) zzc.zza(parcel, m0.CREATOR);
            zzc.zzb(parcel);
            f fVar = this.f3314a;
            f6.a.y(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            f6.a.x(m0Var);
            f.zzj(fVar, m0Var);
            Bundle bundle2 = m0Var.f3340a;
            f6.a.y(this.f3314a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f3314a.onPostInitHandler(i14, strongBinder2, bundle2, i12);
            this.f3314a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
