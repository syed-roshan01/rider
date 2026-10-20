package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ab extends p6.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f3417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f3418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f3420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ad f3421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ad adVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f3421e = adVar;
        this.f3417a = bArr;
        this.f3418b = l10;
        this.f3419c = taskCompletionSource2;
        this.f3420d = integrityTokenRequest;
    }

    @Override // p6.w
    public final void a(Exception exc) {
        if (exc instanceof p6.d) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // p6.w
    public final void b() {
        try {
            ad adVar = this.f3421e;
            p6.s sVar = (p6.s) adVar.f3425a.f12807n;
            Bundle bundleA = ad.a(adVar, this.f3417a, this.f3418b, null);
            ac acVar = new ac(this.f3421e, this.f3419c);
            p6.q qVar = (p6.q) sVar;
            qVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(qVar.f12789b);
            int i10 = p6.j.f12814a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(acVar);
            qVar.a(2, parcelObtain);
        } catch (RemoteException e4) {
            this.f3421e.f3426b.a(e4, "requestIntegrityToken(%s)", this.f3420d);
            this.f3419c.trySetException(new IntegrityServiceException(-100, e4));
        }
    }
}
