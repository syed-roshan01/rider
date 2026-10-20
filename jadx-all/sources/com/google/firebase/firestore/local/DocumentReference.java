package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Util;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class DocumentReference {
    static final Comparator<DocumentReference> BY_KEY = new a(0);
    static final Comparator<DocumentReference> BY_TARGET = new a(1);
    private final DocumentKey key;
    private final int targetOrBatchId;

    public DocumentReference(DocumentKey documentKey, int i10) {
        this.key = documentKey;
        this.targetOrBatchId = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(DocumentReference documentReference, DocumentReference documentReference2) {
        int iCompareTo = documentReference.key.compareTo(documentReference2.key);
        return iCompareTo != 0 ? iCompareTo : Util.compareIntegers(documentReference.targetOrBatchId, documentReference2.targetOrBatchId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(DocumentReference documentReference, DocumentReference documentReference2) {
        int iCompareIntegers = Util.compareIntegers(documentReference.targetOrBatchId, documentReference2.targetOrBatchId);
        return iCompareIntegers != 0 ? iCompareIntegers : documentReference.key.compareTo(documentReference2.key);
    }

    public int getId() {
        return this.targetOrBatchId;
    }

    public DocumentKey getKey() {
        return this.key;
    }
}
