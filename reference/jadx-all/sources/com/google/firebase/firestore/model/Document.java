package com.google.firebase.firestore.model;

import java.util.Comparator;
import m0.r;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public interface Document {
    public static final Comparator<Document> KEY_COMPARATOR = new r(4);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(Document document, Document document2) {
        return document.getKey().compareTo(document2.getKey());
    }

    ObjectValue getData();

    i2 getField(FieldPath fieldPath);

    DocumentKey getKey();

    SnapshotVersion getReadTime();

    SnapshotVersion getVersion();

    boolean hasCommittedMutations();

    boolean hasLocalMutations();

    boolean hasPendingWrites();

    boolean isFoundDocument();

    boolean isNoDocument();

    boolean isUnknownDocument();

    boolean isValidDocument();

    MutableDocument mutableCopy();
}
