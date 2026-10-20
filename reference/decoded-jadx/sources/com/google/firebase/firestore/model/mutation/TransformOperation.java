package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public interface TransformOperation {
    i2 applyToLocalView(i2 i2Var, Timestamp timestamp);

    i2 applyToRemoteDocument(i2 i2Var, i2 i2Var2);

    i2 computeBaseValue(i2 i2Var);
}
