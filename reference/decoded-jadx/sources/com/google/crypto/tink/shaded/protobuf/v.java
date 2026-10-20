package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f3623a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f3624b;

    static {
        u uVar;
        try {
            uVar = (u) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            uVar = null;
        }
        f3624b = uVar;
    }
}
