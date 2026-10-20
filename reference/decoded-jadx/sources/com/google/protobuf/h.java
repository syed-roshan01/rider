package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4116a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f4118c;

    public h(n nVar) {
        this.f4118c = nVar;
        this.f4117b = nVar.size();
    }

    @Override // com.google.protobuf.i
    public final byte a() {
        int i10 = this.f4116a;
        if (i10 >= this.f4117b) {
            throw new NoSuchElementException();
        }
        this.f4116a = i10 + 1;
        return this.f4118c.r(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4116a < this.f4117b;
    }
}
