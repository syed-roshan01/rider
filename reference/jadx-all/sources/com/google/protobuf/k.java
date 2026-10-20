package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4158f;

    public k(byte[] bArr, int i10, int i11) {
        super(bArr);
        n.n(i10, i10 + i11, bArr.length);
        this.f4157e = i10;
        this.f4158f = i11;
    }

    @Override // com.google.protobuf.m
    public final int E() {
        return this.f4157e;
    }

    @Override // com.google.protobuf.m, com.google.protobuf.n
    public final byte i(int i10) {
        n.k(i10, this.f4158f);
        return this.f4177d[this.f4157e + i10];
    }

    @Override // com.google.protobuf.m, com.google.protobuf.n
    public final void p(int i10, byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f4177d, this.f4157e + i10, bArr, i11, i12);
    }

    @Override // com.google.protobuf.m, com.google.protobuf.n
    public final byte r(int i10) {
        return this.f4177d[this.f4157e + i10];
    }

    @Override // com.google.protobuf.m, com.google.protobuf.n
    public final int size() {
        return this.f4158f;
    }
}
