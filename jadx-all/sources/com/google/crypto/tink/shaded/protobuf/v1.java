package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f3625a;

    public v1(Unsafe unsafe) {
        this.f3625a = unsafe;
    }

    public final int a(Class cls) {
        return this.f3625a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f3625a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j10);

    public abstract byte d(Object obj, long j10);

    public abstract double e(Object obj, long j10);

    public abstract float f(Object obj, long j10);

    public final int g(Object obj, long j10) {
        return this.f3625a.getInt(obj, j10);
    }

    public final long h(Object obj, long j10) {
        return this.f3625a.getLong(obj, j10);
    }

    public final Object i(Object obj, long j10) {
        return this.f3625a.getObject(obj, j10);
    }

    public final long j(Field field) {
        return this.f3625a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j10, boolean z10);

    public abstract void l(Object obj, long j10, byte b10);

    public abstract void m(Object obj, long j10, double d10);

    public abstract void n(Object obj, long j10, float f10);

    public final void o(long j10, Object obj, int i10) {
        this.f3625a.putInt(obj, j10, i10);
    }

    public final void p(Object obj, long j10, long j11) {
        this.f3625a.putLong(obj, j10, j11);
    }

    public final void q(Object obj, long j10, Object obj2) {
        this.f3625a.putObject(obj, j10, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f3625a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            w1.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
