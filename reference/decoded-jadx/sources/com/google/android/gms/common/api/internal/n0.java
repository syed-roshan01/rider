package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3230b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.f3229a = i10;
        this.f3230b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3229a;
        Object obj = this.f3230b;
        switch (i10) {
            case 0:
                ((o0) obj).f3238g.a(new z5.b(4));
                break;
            case 1:
                ((d0) obj).g();
                break;
            default:
                com.google.android.gms.common.api.d dVar = ((d0) ((z) obj).f3277a).f3174b;
                dVar.disconnect(dVar.getClass().getName().concat(" disconnecting because it was signed out."));
                break;
        }
    }
}
