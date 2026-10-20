package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum a2 implements s0 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4059a;

    a2(int i10) {
        this.f4059a = i10;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f4059a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
