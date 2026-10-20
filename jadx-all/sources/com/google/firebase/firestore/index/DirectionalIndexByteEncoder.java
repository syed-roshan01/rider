package com.google.firebase.firestore.index;

import com.google.protobuf.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class DirectionalIndexByteEncoder {
    public abstract void writeBytes(n nVar);

    public abstract void writeDouble(double d10);

    public abstract void writeInfinity();

    public abstract void writeLong(long j10);

    public abstract void writeString(String str);
}
