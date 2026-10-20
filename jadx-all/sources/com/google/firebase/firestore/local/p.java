package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Supplier;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function, Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3809c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.f3807a = i10;
        this.f3808b = obj;
        this.f3809c = obj2;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        int i10 = this.f3807a;
        Object obj2 = this.f3809c;
        Object obj3 = this.f3808b;
        switch (i10) {
            case 0:
                return ((SQLiteBundleCache) obj3).lambda$getNamedQuery$1((String) obj2, (Cursor) obj);
            default:
                return SQLiteRemoteDocumentCache.lambda$getDocumentsMatchingQuery$3((Query) obj3, (Set) obj2, (MutableDocument) obj);
        }
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public final Object get() {
        int i10 = this.f3807a;
        Object obj = this.f3809c;
        LocalStore localStore = (LocalStore) this.f3808b;
        switch (i10) {
            case 2:
                return localStore.lambda$collectGarbage$18((LruGarbageCollector) obj);
            case 3:
                return localStore.lambda$acknowledgeBatch$3((MutationBatchResult) obj);
            case 4:
                return localStore.lambda$hasNewerBundle$9((BundleMetadata) obj);
            default:
                return localStore.lambda$getNamedQuery$13((String) obj);
        }
    }
}
