package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3831c;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.f3829a = i10;
        this.f3830b = obj;
        this.f3831c = obj2;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3829a;
        Object obj2 = this.f3831c;
        Object obj3 = this.f3830b;
        switch (i10) {
            case 0:
                ((SQLiteIndexManager) obj3).lambda$start$2((Map) obj2, (Cursor) obj);
                break;
            case 1:
                ((SQLiteSchema) obj3).lambda$removeAcknowledgedMutations$1((String) obj2, (Cursor) obj);
                break;
            case 2:
                SQLiteSchema.lambda$createV8CollectionParentsIndex$10((MemoryIndexManager.MemoryCollectionParentIndex) obj3, (SQLiteStatement) obj2, (ResourcePath) obj);
                break;
            case 3:
                SQLiteSchema.lambda$ensurePathLength$14((boolean[]) obj3, (SQLiteStatement) obj2, (Cursor) obj);
                break;
            default:
                ((SQLiteTargetCache) obj3).lambda$forEachTarget$1((Consumer) obj2, (Cursor) obj);
                break;
        }
    }
}
