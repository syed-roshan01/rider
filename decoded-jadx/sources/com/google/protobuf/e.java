package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f4098b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f4097a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f4098b = cls2 != null;
    }

    public static boolean a() {
        return (f4097a == null || f4098b) ? false : true;
    }
}
