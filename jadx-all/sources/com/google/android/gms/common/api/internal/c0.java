package com.google.android.gms.common.api.internal;

import g8.x3;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3172c;

    public /* synthetic */ c0(Object obj, int i10, int i11) {
        this.f3170a = i11;
        this.f3172c = obj;
        this.f3171b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3170a;
        int i11 = this.f3171b;
        Object obj = this.f3172c;
        switch (i10) {
            case 0:
                ((d0) obj).h(i11);
                break;
            case 1:
                z2 z2Var = (z2) obj;
                if (!((x3) z2Var.f10985d).q()) {
                    try {
                        ((x3) ((z2) obj).f10985d).a(i11);
                    } catch (Throwable th) {
                        ((g8.k) z2Var.f10984c).b(th);
                        ((x3) z2Var.f10985d).close();
                        return;
                    }
                    break;
                }
                break;
            case 2:
                ((g8.k) obj).f6894b.d(i11);
                break;
            default:
                ((g8.v0) obj).f7166f.request(i11);
                break;
        }
    }
}
