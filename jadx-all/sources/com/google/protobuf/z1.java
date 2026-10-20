package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f4282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y1 f4283b;

    static {
        y1 y1Var;
        try {
            y1Var = (y1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            y1Var = null;
        }
        f4282a = y1Var;
        f4283b = new y1();
    }
}
