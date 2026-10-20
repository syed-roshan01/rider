package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3564f;

    public j(byte[] bArr, int i10, int i11) {
        super(bArr);
        l.g(i10, i10 + i11, bArr.length);
        this.f3563e = i10;
        this.f3564f = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k, com.google.crypto.tink.shaded.protobuf.l
    public final byte e(int i10) {
        int i11 = this.f3564f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f3566d[this.f3563e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(l.q.g("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(l.q.i("Index > length: ", i10, ", ", i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k, com.google.crypto.tink.shaded.protobuf.l
    public final void k(byte[] bArr, int i10) {
        System.arraycopy(this.f3566d, this.f3563e, bArr, 0, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k, com.google.crypto.tink.shaded.protobuf.l
    public final byte n(int i10) {
        return this.f3566d[this.f3563e + i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k
    public final int p() {
        return this.f3563e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k, com.google.crypto.tink.shaded.protobuf.l
    public final int size() {
        return this.f3564f;
    }
}
