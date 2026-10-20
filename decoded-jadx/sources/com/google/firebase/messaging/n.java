package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3913b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f3912a = i10;
        this.f3913b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3912a;
        Object obj = this.f3913b;
        switch (i10) {
            case 0:
                ((SharedPreferencesQueue) obj).syncState();
                break;
            default:
                ((WithinAppServiceConnection.BindRequest) obj).lambda$arrangeTimeout$0();
                break;
        }
    }
}
