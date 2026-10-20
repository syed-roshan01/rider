package com.google.firebase.firestore;

import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.m;
import com.google.protobuf.n;

/* JADX INFO: loaded from: classes.dex */
public class Blob implements Comparable<Blob> {
    private final n bytes;

    private Blob(n nVar) {
        this.bytes = nVar;
    }

    public static Blob fromByteString(n nVar) {
        Preconditions.checkNotNull(nVar, "Provided ByteString must not be null.");
        return new Blob(nVar);
    }

    public static Blob fromBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr, "Provided bytes array must not be null.");
        m mVar = n.f4181b;
        return new Blob(n.o(bArr, 0, bArr.length));
    }

    public boolean equals(Object obj) {
        return (obj instanceof Blob) && this.bytes.equals(((Blob) obj).bytes);
    }

    public int hashCode() {
        return this.bytes.hashCode();
    }

    public n toByteString() {
        return this.bytes;
    }

    public byte[] toBytes() {
        return this.bytes.z();
    }

    public String toString() {
        return "Blob { bytes=" + Util.toDebugString(this.bytes) + " }";
    }

    @Override // java.lang.Comparable
    public int compareTo(Blob blob) {
        return Util.compareByteStrings(this.bytes, blob.bytes);
    }
}
