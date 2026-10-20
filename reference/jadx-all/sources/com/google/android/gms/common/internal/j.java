package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new d.a(29);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Scope[] f3316v = new Scope[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z5.d[] f3317w = new z5.d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f3322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f3323f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f3324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Account f3325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z5.d[] f3326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z5.d[] f3327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f3331u;

    public j(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, z5.d[] dVarArr, z5.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f3316v : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        z5.d[] dVarArr3 = f3317w;
        z5.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f3318a = i10;
        this.f3319b = i11;
        this.f3320c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f3321d = "com.google.android.gms";
        } else {
            this.f3321d = str;
        }
        if (i10 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i14 = a.f3279a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                m s0Var = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new s0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                if (s0Var != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            s0 s0Var2 = (s0) s0Var;
                            Parcel parcelZzB = s0Var2.zzB(2, s0Var2.zza());
                            Account account3 = (Account) zzc.zza(parcelZzB, Account.CREATOR);
                            parcelZzB.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f3322e = iBinder;
            account2 = account;
        }
        this.f3325o = account2;
        this.f3323f = scopeArr2;
        this.f3324n = bundle2;
        this.f3326p = dVarArr4;
        this.f3327q = dVarArr3;
        this.f3328r = z10;
        this.f3329s = i13;
        this.f3330t = z11;
        this.f3331u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        d.a.a(this, parcel, i10);
    }
}
