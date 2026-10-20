package com.google.firebase.firestore.proto;

import com.google.protobuf.q2;
import com.google.protobuf.t1;
import com.google.protobuf.u1;

/* JADX INFO: loaded from: classes.dex */
public interface TargetGlobalOrBuilder extends u1 {
    @Override // com.google.protobuf.u1
    /* synthetic */ t1 getDefaultInstanceForType();

    long getHighestListenSequenceNumber();

    int getHighestTargetId();

    q2 getLastRemoteSnapshotVersion();

    int getTargetCount();

    boolean hasLastRemoteSnapshotVersion();

    @Override // com.google.protobuf.u1
    /* synthetic */ boolean isInitialized();
}
