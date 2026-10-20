package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ar extends aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f3444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f3446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ax axVar, TaskCompletionSource taskCompletionSource, long j10, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f3446c = axVar;
        this.f3444a = j10;
        this.f3445b = taskCompletionSource2;
    }

    @Override // p6.w
    public final void b() {
        if (ax.g(this.f3446c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            ax axVar = this.f3446c;
            p6.n nVar = (p6.n) axVar.f3457a.f12807n;
            Bundle bundleB = ax.b(axVar, this.f3444a);
            av avVar = new av(this.f3446c, this.f3445b);
            p6.l lVar = (p6.l) nVar;
            lVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(lVar.f12789b);
            int i10 = p6.j.f12814a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(avVar);
            lVar.a(2, parcelObtain);
        } catch (RemoteException e4) {
            this.f3446c.f3458b.a(e4, "warmUpIntegrityToken(%s)", Long.valueOf(this.f3444a));
            this.f3445b.trySetException(new StandardIntegrityException(-100, e4));
        }
    }
}
