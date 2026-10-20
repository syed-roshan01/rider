package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: loaded from: classes.dex */
public final class PersistentCacheIndexManager {
    private FirestoreClient client;

    public PersistentCacheIndexManager(FirestoreClient firestoreClient) {
        this.client = firestoreClient;
    }

    public void deleteAllIndexes() {
        this.client.deleteAllFieldIndexes();
    }

    public void disableIndexAutoCreation() {
        this.client.setIndexAutoCreationEnabled(false);
    }

    public void enableIndexAutoCreation() {
        this.client.setIndexAutoCreationEnabled(true);
    }
}
