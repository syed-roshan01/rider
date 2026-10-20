package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends b {
    private final l0 defaultInstance;
    protected l0 instance;

    public g0(l0 l0Var) {
        this.defaultInstance = l0Var;
        if (l0Var.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = l0Var.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        l0 l0VarNewMutableInstance = this.defaultInstance.newMutableInstance();
        l0 l0Var = this.instance;
        d2 d2Var = d2.f4094c;
        d2Var.getClass();
        d2Var.a(l0VarNewMutableInstance.getClass()).a(l0VarNewMutableInstance, l0Var);
        this.instance = l0VarNewMutableInstance;
    }

    @Override // com.google.protobuf.u1
    public l0 getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.u1
    public final boolean isInitialized() {
        return l0.isInitialized(this.instance, false);
    }

    /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
    public final l0 m3997build() {
        l0 l0VarBuildPartial = buildPartial();
        if (l0VarBuildPartial.isInitialized()) {
            return l0VarBuildPartial;
        }
        throw b.newUninitializedMessageException(l0VarBuildPartial);
    }

    @Override // com.google.protobuf.s1
    public l0 buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final g0 m3998clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    @Override // com.google.protobuf.b
    public g0 internalMergeFrom(l0 l0Var) {
        return mergeFrom(l0Var);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g0 m4001clone() {
        g0 g0VarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        g0VarNewBuilderForType.instance = buildPartial();
        return g0VarNewBuilderForType;
    }

    public g0 mergeFrom(l0 l0Var) {
        if (getDefaultInstanceForType().equals(l0Var)) {
            return this;
        }
        copyOnWrite();
        l0 l0Var2 = this.instance;
        d2 d2Var = d2.f4094c;
        d2Var.getClass();
        d2Var.a(l0Var2.getClass()).a(l0Var2, l0Var);
        return this;
    }

    @Override // com.google.protobuf.b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public g0 m4004mergeFrom(byte[] bArr, int i10, int i11, z zVar) throws a1 {
        copyOnWrite();
        try {
            d2.f4094c.b(this.instance).i(this.instance, bArr, i10, i10 + i11, new com.google.crypto.tink.shaded.protobuf.e(zVar));
            return this;
        } catch (a1 e4) {
            throw e4;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw a1.h();
        }
    }

    @Override // com.google.protobuf.b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public g0 m4003mergeFrom(byte[] bArr, int i10, int i11) {
        return m4004mergeFrom(bArr, i10, i11, z.a());
    }

    @Override // com.google.protobuf.b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public g0 m4002mergeFrom(s sVar, z zVar) throws IOException {
        copyOnWrite();
        try {
            i2 i2VarB = d2.f4094c.b(this.instance);
            l0 l0Var = this.instance;
            g2.m mVar = sVar.f4233d;
            if (mVar == null) {
                mVar = new g2.m(sVar);
            }
            i2VarB.h(l0Var, mVar, zVar);
            return this;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof IOException) {
                throw ((IOException) e4.getCause());
            }
            throw e4;
        }
    }
}
