package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzi;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3307a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f fVar, Looper looper) {
        super(looper);
        this.f3307a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.f3307a.zzd.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                b0 b0Var = (b0) message.obj;
                b0Var.getClass();
                b0Var.d();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || ((i11 == 4 && !this.f3307a.enableLocalFallback()) || message.what == 5)) && !this.f3307a.isConnecting()) {
            b0 b0Var2 = (b0) message.obj;
            b0Var2.getClass();
            b0Var2.d();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            this.f3307a.zzB = new z5.b(message.arg2);
            if (f.zzo(this.f3307a)) {
                f fVar = this.f3307a;
                if (!fVar.zzC) {
                    fVar.c(3, null);
                    return;
                }
            }
            f fVar2 = this.f3307a;
            z5.b bVar = fVar2.zzB != null ? fVar2.zzB : new z5.b(8);
            this.f3307a.zzc.j(bVar);
            this.f3307a.onConnectionFailed(bVar);
            return;
        }
        if (i12 == 5) {
            f fVar3 = this.f3307a;
            z5.b bVar2 = fVar3.zzB != null ? fVar3.zzB : new z5.b(8);
            this.f3307a.zzc.j(bVar2);
            this.f3307a.onConnectionFailed(bVar2);
            return;
        }
        if (i12 == 3) {
            Object obj2 = message.obj;
            z5.b bVar3 = new z5.b(message.arg2, obj2 instanceof PendingIntent ? (PendingIntent) obj2 : null);
            this.f3307a.zzc.j(bVar3);
            this.f3307a.onConnectionFailed(bVar3);
            return;
        }
        if (i12 == 6) {
            this.f3307a.c(5, null);
            f fVar4 = this.f3307a;
            if (fVar4.zzw != null) {
                fVar4.zzw.a(message.arg2);
            }
            this.f3307a.onConnectionSuspended(message.arg2);
            f.zzn(this.f3307a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f3307a.isConnected()) {
            b0 b0Var3 = (b0) message.obj;
            b0Var3.getClass();
            b0Var3.d();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + i13, new Exception());
            return;
        }
        b0 b0Var4 = (b0) message.obj;
        synchronized (b0Var4) {
            try {
                obj = b0Var4.f3285a;
                if (b0Var4.f3286b) {
                    Log.w("GmsClient", "Callback proxy " + b0Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            b0Var4.a();
        }
        synchronized (b0Var4) {
            b0Var4.f3286b = true;
        }
        b0Var4.d();
    }
}
