package com.google.firebase.firestore.local;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalStore f3767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3768c;

    public /* synthetic */ f(LocalStore localStore, List list, int i10) {
        this.f3766a = i10;
        this.f3767b = localStore;
        this.f3768c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3766a;
        List list = this.f3768c;
        LocalStore localStore = this.f3767b;
        switch (i10) {
            case 0:
                localStore.lambda$notifyLocalViewChanges$7(list);
                break;
            default:
                localStore.lambda$configureFieldIndexes$15(list);
                break;
        }
    }
}
