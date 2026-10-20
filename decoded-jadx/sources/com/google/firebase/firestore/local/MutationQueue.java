package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface MutationQueue {
    void acknowledgeBatch(MutationBatch mutationBatch, com.google.protobuf.n nVar);

    MutationBatch addMutationBatch(Timestamp timestamp, List<Mutation> list, List<Mutation> list2);

    List<MutationBatch> getAllMutationBatches();

    List<MutationBatch> getAllMutationBatchesAffectingDocumentKey(DocumentKey documentKey);

    List<MutationBatch> getAllMutationBatchesAffectingDocumentKeys(Iterable<DocumentKey> iterable);

    List<MutationBatch> getAllMutationBatchesAffectingQuery(Query query);

    int getHighestUnacknowledgedBatchId();

    com.google.protobuf.n getLastStreamToken();

    MutationBatch getNextMutationBatchAfterBatchId(int i10);

    boolean isEmpty();

    MutationBatch lookupMutationBatch(int i10);

    void performConsistencyCheck();

    void removeMutationBatch(MutationBatch mutationBatch);

    void setLastStreamToken(com.google.protobuf.n nVar);

    void start();
}
