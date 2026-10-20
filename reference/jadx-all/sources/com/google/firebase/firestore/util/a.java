package com.google.firebase.firestore.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3865b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f3864a = i10;
        this.f3865b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3864a;
        Object obj = this.f3865b;
        switch (i10) {
            case 0:
                AsyncQueue.lambda$panic$3((Throwable) obj);
                break;
            case 1:
                ((AsyncQueue.DelayedTask) obj).handleDelayElapsed();
                break;
            default:
                Util.lambda$crashMainThread$1((RuntimeException) obj);
                break;
        }
    }
}
