package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements t1 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        b.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(n nVar) {
        if (!nVar.t()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(i2 i2Var);

    public r2 newUninitializedMessageException() {
        return new r2();
    }

    @Override // com.google.protobuf.t1
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = v.f4248d;
            t tVar = new t(bArr, 0, serializedSize);
            writeTo(tVar);
            if (tVar.q0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(b("byte array"), e4);
        }
    }

    public n toByteString() {
        try {
            int serializedSize = getSerializedSize();
            m mVar = n.f4181b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = v.f4248d;
            t tVar = new t(bArr, 0, serializedSize);
            writeTo(tVar);
            if (tVar.q0() == 0) {
                return new m(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(b("ByteString"), e4);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM0 = v.m0(serializedSize) + serializedSize;
        if (iM0 > 4096) {
            iM0 = 4096;
        }
        u uVar = new u(outputStream, iM0);
        uVar.I0(serializedSize);
        writeTo(uVar);
        if (uVar.f4245h > 0) {
            uVar.Q0();
        }
    }

    @Override // com.google.protobuf.t1
    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = v.f4248d;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        u uVar = new u(outputStream, serializedSize);
        writeTo(uVar);
        if (uVar.f4245h > 0) {
            uVar.Q0();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        b.addAll((Iterable) iterable, (List) list);
    }
}
