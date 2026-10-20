package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.ServerTimestamps;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public class ServerTimestampOperation implements TransformOperation {
    private static final ServerTimestampOperation SHARED_INSTANCE = new ServerTimestampOperation();

    private ServerTimestampOperation() {
    }

    public static ServerTimestampOperation getInstance() {
        return SHARED_INSTANCE;
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 applyToLocalView(i2 i2Var, Timestamp timestamp) {
        return ServerTimestamps.valueOf(timestamp, i2Var);
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 applyToRemoteDocument(i2 i2Var, i2 i2Var2) {
        return i2Var2;
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 computeBaseValue(i2 i2Var) {
        return null;
    }
}
