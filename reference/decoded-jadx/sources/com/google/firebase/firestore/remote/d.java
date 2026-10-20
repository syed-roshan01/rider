package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e8.p1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3850c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f3848a = i10;
        this.f3849b = obj;
        this.f3850c = obj2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f3848a;
        Object obj = this.f3850c;
        Object obj2 = this.f3849b;
        switch (i10) {
            case 0:
                return ((Datastore) obj2).lambda$runAggregateQuery$1((HashMap) obj, task);
            default:
                return ((GrpcCallProvider) obj2).lambda$createClientCall$0((p1) obj, task);
        }
    }
}
