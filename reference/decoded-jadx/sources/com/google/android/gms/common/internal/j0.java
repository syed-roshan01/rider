package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3333b;

    public j0(f fVar, int i10) {
        this.f3333b = fVar;
        this.f3332a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f3333b;
        if (iBinder == null) {
            f.zzk(fVar, 16);
            return;
        }
        synchronized (fVar.zzq) {
            try {
                f fVar2 = this.f3333b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new c0(iBinder) : (n) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3333b.zzl(0, null, this.f3332a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3333b.zzq) {
            this.f3333b.zzr = null;
        }
        Handler handler = this.f3333b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f3332a, 1));
    }
}
