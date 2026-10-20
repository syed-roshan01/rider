package com.google.protobuf;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public interface t1 extends u1 {
    b2 getParserForType();

    int getSerializedSize();

    s1 newBuilderForType();

    byte[] toByteArray();

    void writeTo(v vVar);

    void writeTo(OutputStream outputStream);
}
