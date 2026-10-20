package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Function, Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3806b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f3805a = i10;
        this.f3806b = obj;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        int i10 = this.f3805a;
        Object obj2 = this.f3806b;
        switch (i10) {
            case 0:
                return SQLiteBundleCache.lambda$getBundleMetadata$0((String) obj2, (Cursor) obj);
            case 1:
                return ((SQLiteMutationQueue) obj2).lambda$getNextMutationBatchAfterBatchId$4((Cursor) obj);
            default:
                return ((SQLiteDocumentOverlayCache) obj2).lambda$getOverlay$0((Cursor) obj);
        }
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public final Object get() {
        int i10 = this.f3805a;
        Object obj = this.f3806b;
        switch (i10) {
            case 2:
                return ((IndexBackfiller) obj).lambda$backfill$0();
            default:
                return ((LocalStore) obj).lambda$getFieldIndexes$14();
        }
    }
}
