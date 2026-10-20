package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3821b;

    public /* synthetic */ s(int i10, ArrayList arrayList) {
        this.f3820a = i10;
        this.f3821b = arrayList;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3820a;
        List list = this.f3821b;
        Cursor cursor = (Cursor) obj;
        switch (i10) {
            case 0:
                SQLiteIndexManager.lambda$getDocumentsMatchingTarget$7(list, cursor);
                break;
            case 1:
                SQLiteMutationQueue.lambda$loadNextBatchIdAcrossAllUsers$1(list, cursor);
                break;
            default:
                SQLiteMutationQueue.lambda$performConsistencyCheck$11(list, cursor);
                break;
        }
    }
}
