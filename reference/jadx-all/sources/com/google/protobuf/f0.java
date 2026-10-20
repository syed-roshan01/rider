package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f4105a = new f0();

    @Override // com.google.protobuf.r1
    public final q1 a(Class cls) {
        if (!l0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (q1) l0.getDefaultInstance(cls.asSubclass(l0.class)).buildMessageInfo();
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
        }
    }

    @Override // com.google.protobuf.r1
    public final boolean b(Class cls) {
        return l0.class.isAssignableFrom(cls);
    }
}
