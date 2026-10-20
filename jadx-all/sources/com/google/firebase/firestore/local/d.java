package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.util.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalStore f3755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3757d;

    public /* synthetic */ d(LocalStore localStore, Object obj, Object obj2, int i10) {
        this.f3754a = i10;
        this.f3755b = localStore;
        this.f3756c = obj;
        this.f3757d = obj2;
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public final Object get() {
        int i10 = this.f3754a;
        LocalStore localStore = this.f3755b;
        Object obj = this.f3757d;
        Object obj2 = this.f3756c;
        switch (i10) {
            case 0:
                return localStore.lambda$applyBundledDocuments$11((ImmutableSortedMap) obj2, (TargetData) obj);
            default:
                return localStore.lambda$applyRemoteEvent$6((RemoteEvent) obj2, (SnapshotVersion) obj);
        }
    }
}
