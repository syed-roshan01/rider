package com.google.firebase.firestore.index;

import com.google.firebase.firestore.model.FieldIndex;
import com.google.protobuf.n;

/* JADX INFO: loaded from: classes.dex */
public class IndexByteEncoder {
    private final OrderedCodeWriter orderedCode = new OrderedCodeWriter();
    private final AscendingIndexByteEncoder ascending = new AscendingIndexByteEncoder();
    private final DescendingIndexByteEncoder descending = new DescendingIndexByteEncoder();

    public class AscendingIndexByteEncoder extends DirectionalIndexByteEncoder {
        public AscendingIndexByteEncoder() {
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeBytes(n nVar) {
            IndexByteEncoder.this.orderedCode.writeBytesAscending(nVar);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeDouble(double d10) {
            IndexByteEncoder.this.orderedCode.writeDoubleAscending(d10);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeInfinity() {
            IndexByteEncoder.this.orderedCode.writeInfinityAscending();
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeLong(long j10) {
            IndexByteEncoder.this.orderedCode.writeSignedLongAscending(j10);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeString(String str) {
            IndexByteEncoder.this.orderedCode.writeUtf8Ascending(str);
        }
    }

    public class DescendingIndexByteEncoder extends DirectionalIndexByteEncoder {
        public DescendingIndexByteEncoder() {
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeBytes(n nVar) {
            IndexByteEncoder.this.orderedCode.writeBytesDescending(nVar);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeDouble(double d10) {
            IndexByteEncoder.this.orderedCode.writeDoubleDescending(d10);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeInfinity() {
            IndexByteEncoder.this.orderedCode.writeInfinityDescending();
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeLong(long j10) {
            IndexByteEncoder.this.orderedCode.writeSignedLongDescending(j10);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public void writeString(String str) {
            IndexByteEncoder.this.orderedCode.writeUtf8Descending(str);
        }
    }

    public DirectionalIndexByteEncoder forKind(FieldIndex.Segment.Kind kind) {
        return kind.equals(FieldIndex.Segment.Kind.DESCENDING) ? this.descending : this.ascending;
    }

    public byte[] getEncodedBytes() {
        return this.orderedCode.encodedBytes();
    }

    public void reset() {
        this.orderedCode.reset();
    }

    public void seed(byte[] bArr) {
        this.orderedCode.seed(bArr);
    }
}
