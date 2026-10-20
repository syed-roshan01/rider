package com.google.firebase.firestore;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3738c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f3736a = i10;
        this.f3737b = obj;
        this.f3738c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3736a;
        Object obj = this.f3738c;
        Object obj2 = this.f3737b;
        switch (i10) {
            case 0:
                ((LoadBundleTask.ManagedListener) obj2).lambda$invokeAsync$0((LoadBundleTaskProgress) obj);
                break;
            case 1:
                ((FirebaseFirestore) obj2).lambda$clearPersistence$2((TaskCompletionSource) obj);
                break;
            default:
                ((LoadBundleTask) obj2).lambda$addOnProgressListener$0((OnProgressListener) obj);
                break;
        }
    }
}
