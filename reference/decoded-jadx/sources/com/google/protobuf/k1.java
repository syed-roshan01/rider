package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r1[] f4167a;

    @Override // com.google.protobuf.r1
    public final q1 a(Class cls) {
        for (r1 r1Var : this.f4167a) {
            if (r1Var.b(cls)) {
                return r1Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.r1
    public final boolean b(Class cls) {
        for (r1 r1Var : this.f4167a) {
            if (r1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
