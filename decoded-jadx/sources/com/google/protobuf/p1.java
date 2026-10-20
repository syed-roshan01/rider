package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f4212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f4213b;

    static {
        o1 o1Var;
        try {
            o1Var = (o1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o1Var = null;
        }
        f4212a = o1Var;
        f4213b = new o1();
    }
}
