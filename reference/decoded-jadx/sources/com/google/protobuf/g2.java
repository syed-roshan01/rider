package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6.u f4114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f4115b = b();

    public g2(h2 h2Var) {
        this.f4114a = new k6.u(h2Var, 0);
    }

    @Override // com.google.protobuf.i
    public final byte a() {
        i iVar = this.f4115b;
        if (iVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = iVar.a();
        if (!this.f4115b.hasNext()) {
            this.f4115b = b();
        }
        return bA;
    }

    public final h b() {
        k6.u uVar = this.f4114a;
        if (!uVar.hasNext()) {
            return null;
        }
        l lVarB = uVar.b();
        lVarB.getClass();
        return new h(lVarB);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4115b != null;
    }
}
