package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f3526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f3527b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f3526a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f3527b = cls2 != null;
    }

    public static boolean a() {
        return (f3526a == null || f3527b) ? false : true;
    }
}
