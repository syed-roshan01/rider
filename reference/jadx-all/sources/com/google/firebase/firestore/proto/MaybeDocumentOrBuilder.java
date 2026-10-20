package com.google.firebase.firestore.proto;

import com.google.protobuf.t1;
import com.google.protobuf.u1;
import o7.s;

/* JADX INFO: loaded from: classes.dex */
public interface MaybeDocumentOrBuilder extends u1 {
    @Override // com.google.protobuf.u1
    /* synthetic */ t1 getDefaultInstanceForType();

    s getDocument();

    MaybeDocument.DocumentTypeCase getDocumentTypeCase();

    boolean getHasCommittedMutations();

    NoDocument getNoDocument();

    UnknownDocument getUnknownDocument();

    boolean hasDocument();

    boolean hasNoDocument();

    boolean hasUnknownDocument();

    @Override // com.google.protobuf.u1
    /* synthetic */ boolean isInitialized();
}
