package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3832a;

    public /* synthetic */ w(int i10) {
        this.f3832a = i10;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f3832a) {
            case 0:
                return SQLiteLruReferenceDelegate.lambda$getSequenceNumberCount$0(cursor);
            case 1:
                return SQLiteMutationQueue.lambda$getHighestUnacknowledgedBatchId$5(cursor);
            case 2:
                return SQLiteSchema.lambda$ensureSequenceNumbers$7(cursor);
            case 3:
                return SQLitePersistence.lambda$getPageSize$0(cursor);
            default:
                return SQLitePersistence.lambda$getPageCount$1(cursor);
        }
    }
}
