package com.google.firebase.firestore.proto;

import com.google.protobuf.n;
import com.google.protobuf.t1;
import com.google.protobuf.u1;

/* JADX INFO: loaded from: classes.dex */
public interface MutationQueueOrBuilder extends u1 {
    @Override // com.google.protobuf.u1
    /* synthetic */ t1 getDefaultInstanceForType();

    int getLastAcknowledgedBatchId();

    n getLastStreamToken();

    @Override // com.google.protobuf.u1
    /* synthetic */ boolean isInitialized();
}
