package com.google.firebase.firestore.proto;

import com.google.protobuf.q2;
import com.google.protobuf.t1;
import com.google.protobuf.u1;
import java.util.List;
import o7.l2;

/* JADX INFO: loaded from: classes.dex */
public interface WriteBatchOrBuilder extends u1 {
    l2 getBaseWrites(int i10);

    int getBaseWritesCount();

    List<l2> getBaseWritesList();

    int getBatchId();

    @Override // com.google.protobuf.u1
    /* synthetic */ t1 getDefaultInstanceForType();

    q2 getLocalWriteTime();

    l2 getWrites(int i10);

    int getWritesCount();

    List<l2> getWritesList();

    boolean hasLocalWriteTime();

    @Override // com.google.protobuf.u1
    /* synthetic */ boolean isInitialized();
}
