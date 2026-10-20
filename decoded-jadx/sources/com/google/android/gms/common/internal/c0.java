package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f3291a;

    public c0(IBinder iBinder) {
        this.f3291a = iBinder;
    }

    public final void a(i0 i0Var, j jVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(i0Var.asBinder());
            parcelObtain.writeInt(1);
            d.a.a(jVar, parcelObtain, 0);
            this.f3291a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3291a;
    }
}
