package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f4061a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f4062b;

    static {
        a0 a0Var;
        try {
            a0Var = (a0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            a0Var = null;
        }
        f4062b = a0Var;
    }
}
