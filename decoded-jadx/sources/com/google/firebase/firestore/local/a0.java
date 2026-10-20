package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteMutationQueue f3743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3744c;

    public /* synthetic */ a0(SQLiteMutationQueue sQLiteMutationQueue, ArrayList arrayList, int i10) {
        this.f3742a = i10;
        this.f3743b = sQLiteMutationQueue;
        this.f3744c = arrayList;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3742a;
        SQLiteMutationQueue sQLiteMutationQueue = this.f3743b;
        List list = this.f3744c;
        Cursor cursor = (Cursor) obj;
        switch (i10) {
            case 0:
                sQLiteMutationQueue.lambda$getAllMutationBatches$6(list, cursor);
                break;
            default:
                sQLiteMutationQueue.lambda$getAllMutationBatchesAffectingDocumentKey$7(list, cursor);
                break;
        }
    }
}
