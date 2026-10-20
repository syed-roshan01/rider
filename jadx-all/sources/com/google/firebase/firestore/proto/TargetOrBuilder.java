package com.google.firebase.firestore.proto;

import com.google.protobuf.n;
import com.google.protobuf.q2;
import com.google.protobuf.t1;
import com.google.protobuf.u1;
import o7.x1;
import o7.z1;

/* JADX INFO: loaded from: classes.dex */
public interface TargetOrBuilder extends u1 {
    @Override // com.google.protobuf.u1
    /* synthetic */ t1 getDefaultInstanceForType();

    x1 getDocuments();

    q2 getLastLimboFreeSnapshotVersion();

    long getLastListenSequenceNumber();

    z1 getQuery();

    n getResumeToken();

    q2 getSnapshotVersion();

    int getTargetId();

    Target.TargetTypeCase getTargetTypeCase();

    boolean hasDocuments();

    boolean hasLastLimboFreeSnapshotVersion();

    boolean hasQuery();

    boolean hasSnapshotVersion();

    @Override // com.google.protobuf.u1
    /* synthetic */ boolean isInitialized();
}
