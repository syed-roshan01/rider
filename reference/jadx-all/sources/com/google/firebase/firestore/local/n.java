package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3804b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f3803a = i10;
        this.f3804b = obj;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3803a;
        Object obj2 = this.f3804b;
        switch (i10) {
            case 0:
                MemoryLruReferenceDelegate.lambda$getSequenceNumberCount$0((long[]) obj2, (Long) obj);
                break;
            case 1:
                SQLiteIndexManager.lambda$getCollectionParents$3((ArrayList) obj2, (Cursor) obj);
                break;
            case 2:
                SQLiteIndexManager.lambda$start$1((Map) obj2, (Cursor) obj);
                break;
            case 3:
                ((SQLiteTargetCache) obj2).lambda$start$0((Cursor) obj);
                break;
            case 4:
                SQLiteTargetCache.lambda$getMatchingKeysForTargetId$4((SQLiteTargetCache.DocumentKeysHolder) obj2, (Cursor) obj);
                break;
            case 5:
                SQLiteOverlayMigrationManager.lambda$hasPendingOverlayMigration$2((Boolean[]) obj2, (Cursor) obj);
                break;
            default:
                SQLiteOverlayMigrationManager.lambda$getAllUserIds$1((Set) obj2, (Cursor) obj);
                break;
        }
    }
}
