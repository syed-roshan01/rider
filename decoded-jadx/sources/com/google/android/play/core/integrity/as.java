package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class as extends aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f3447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f3448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f3449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ax f3451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(ax axVar, TaskCompletionSource taskCompletionSource, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f3451e = axVar;
        this.f3447a = str;
        this.f3448b = j10;
        this.f3449c = j11;
        this.f3450d = taskCompletionSource2;
    }

    @Override // p6.w
    public final void b() {
        if (ax.g(this.f3451e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            ax axVar = this.f3451e;
            p6.n nVar = (p6.n) axVar.f3457a.f12807n;
            Bundle bundleA = ax.a(axVar, this.f3447a, this.f3448b, this.f3449c);
            au auVar = new au(this.f3451e, this.f3450d);
            p6.l lVar = (p6.l) nVar;
            lVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(lVar.f12789b);
            int i10 = p6.j.f12814a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(auVar);
            lVar.a(3, parcelObtain);
        } catch (RemoteException e4) {
            this.f3451e.f3458b.a(e4, "requestExpressIntegrityToken(%s, %s)", this.f3447a, Long.valueOf(this.f3448b));
            this.f3450d.trySetException(new StandardIntegrityException(-100, e4));
        }
    }
}
