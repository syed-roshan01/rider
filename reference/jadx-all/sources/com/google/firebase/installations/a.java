package com.google.firebase.installations;

import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3880c;

    public /* synthetic */ a(int i10, Object obj, boolean z10) {
        this.f3878a = i10;
        this.f3879b = obj;
        this.f3880c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3878a;
        boolean z10 = this.f3880c;
        Object obj = this.f3879b;
        switch (i10) {
            case 0:
                ((FirebaseInstallations) obj).lambda$doRegistrationOrRefresh$3(z10);
                break;
            case 1:
                ((FirebaseInstallations) obj).lambda$getToken$2(z10);
                break;
            default:
                ((FirestoreClient) obj).lambda$setIndexAutoCreationEnabled$22(z10);
                break;
        }
    }
}
