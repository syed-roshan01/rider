package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f3334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f3335h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(f fVar, int i10, IBinder iBinder, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f3335h = fVar;
        this.f3334g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.b0
    public final void b(z5.b bVar) {
        f fVar = this.f3335h;
        if (fVar.zzx != null) {
            fVar.zzx.b(bVar);
        }
        fVar.onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.b0
    public final boolean c() {
        IBinder iBinder = this.f3334g;
        try {
            f6.a.x(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f3335h;
            if (!fVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + fVar.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = fVar.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(f.zzn(fVar, 2, 4, iInterfaceCreateServiceInterface) || f.zzn(fVar, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            fVar.zzB = null;
            Bundle connectionHint = fVar.getConnectionHint();
            if (fVar.zzw == null) {
                return true;
            }
            fVar.zzw.n(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
