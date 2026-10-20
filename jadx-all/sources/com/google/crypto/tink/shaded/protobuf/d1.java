package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f3528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f3529b;

    static {
        c1 c1Var;
        try {
            c1Var = (c1) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c1Var = null;
        }
        f3528a = c1Var;
        f3529b = new c1();
    }
}
