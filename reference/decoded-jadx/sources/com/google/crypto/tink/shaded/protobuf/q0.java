package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0[] f3609a;

    @Override // com.google.crypto.tink.shaded.protobuf.w0
    public final v0 a(Class cls) {
        for (w0 w0Var : this.f3609a) {
            if (w0Var.b(cls)) {
                return w0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w0
    public final boolean b(Class cls) {
        for (w0 w0Var : this.f3609a) {
            if (w0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
