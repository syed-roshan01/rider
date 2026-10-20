package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3828d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i10) {
        this.f3825a = i10;
        this.f3826b = obj;
        this.f3827c = obj2;
        this.f3828d = obj3;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3825a;
        Object obj2 = this.f3828d;
        Object obj3 = this.f3827c;
        Object obj4 = this.f3826b;
        switch (i10) {
            case 0:
                SQLiteIndexManager.lambda$getExistingIndexEntries$6((SortedSet) obj4, (FieldIndex) obj3, (DocumentKey) obj2, (Cursor) obj);
                break;
            case 1:
                ((SQLiteMutationQueue) obj4).lambda$getAllMutationBatchesAffectingDocumentKeys$8((Set) obj3, (List) obj2, (Cursor) obj);
                break;
            case 2:
                ((SQLiteRemoteDocumentCache) obj4).lambda$getAll$0((BackgroundQueue) obj3, (Map) obj2, (Cursor) obj);
                break;
            case 3:
                ((SQLiteTargetCache) obj4).lambda$getTargetData$3((Target) obj3, (SQLiteTargetCache.TargetDataHolder) obj2, (Cursor) obj);
                break;
            default:
                ((SQLiteTargetCache) obj4).lambda$removeQueries$2((SparseArray) obj3, (int[]) obj2, (Cursor) obj);
                break;
        }
    }
}
