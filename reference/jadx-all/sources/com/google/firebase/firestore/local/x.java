package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f3834b;

    public /* synthetic */ x(Consumer consumer, int i10) {
        this.f3833a = i10;
        this.f3834b = consumer;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3833a;
        Consumer consumer = this.f3834b;
        Cursor cursor = (Cursor) obj;
        switch (i10) {
            case 0:
                SQLiteLruReferenceDelegate.lambda$forEachOrphanedDocumentSequenceNumber$1(consumer, cursor);
                break;
            case 1:
                SQLiteSchema.lambda$createV8CollectionParentsIndex$11(consumer, cursor);
                break;
            default:
                SQLiteSchema.lambda$createV8CollectionParentsIndex$12(consumer, cursor);
                break;
        }
    }
}
