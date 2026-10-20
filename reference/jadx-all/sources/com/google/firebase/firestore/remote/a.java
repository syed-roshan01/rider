package com.google.firebase.firestore.remote;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractStream f3842b;

    public /* synthetic */ a(AbstractStream abstractStream, int i10) {
        this.f3841a = i10;
        this.f3842b = abstractStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3841a;
        AbstractStream abstractStream = this.f3842b;
        switch (i10) {
            case 0:
                abstractStream.lambda$onOpen$0();
                break;
            default:
                abstractStream.lambda$performBackoff$1();
                break;
        }
    }
}
