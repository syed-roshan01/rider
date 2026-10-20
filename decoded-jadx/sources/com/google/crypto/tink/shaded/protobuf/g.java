package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3536a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f3538c;

    public g(l lVar) {
        this.f3538c = lVar;
        this.f3537b = lVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3536a < this.f3537b;
    }
}
