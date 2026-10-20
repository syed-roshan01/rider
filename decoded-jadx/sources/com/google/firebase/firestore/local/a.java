package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3741a;

    public /* synthetic */ a(int i10) {
        this.f3741a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3741a) {
            case 0:
                return DocumentReference.lambda$static$0((DocumentReference) obj, (DocumentReference) obj2);
            case 1:
                return DocumentReference.lambda$static$1((DocumentReference) obj, (DocumentReference) obj2);
            case 2:
                return LruGarbageCollector.RollingSequenceNumberBuffer.lambda$static$0((Long) obj, (Long) obj2);
            case 3:
                return SQLiteIndexManager.lambda$new$0((FieldIndex) obj, (FieldIndex) obj2);
            default:
                return SQLiteMutationQueue.lambda$getAllMutationBatchesAffectingDocumentKeys$9((MutationBatch) obj, (MutationBatch) obj2);
        }
    }
}
