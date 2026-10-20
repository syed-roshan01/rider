package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class y implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f3639a = new y();

    @Override // com.google.crypto.tink.shaded.protobuf.w0
    public final v0 a(Class cls) {
        if (!b0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (v0) b0.k(cls.asSubclass(b0.class)).j(3);
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w0
    public final boolean b(Class cls) {
        return b0.class.isAssignableFrom(cls);
    }
}
