package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f4279a;

    public y2(Unsafe unsafe) {
        this.f4279a = unsafe;
    }

    public final int a(Class cls) {
        return this.f4279a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f4279a.arrayIndexScale(cls);
    }

    public abstract void c(long j10, byte[] bArr, long j11, long j12);

    public abstract boolean d(Object obj, long j10);

    public abstract byte e(long j10);

    public abstract byte f(Object obj, long j10);

    public abstract double g(Object obj, long j10);

    public abstract float h(Object obj, long j10);

    public final int i(Object obj, long j10) {
        return this.f4279a.getInt(obj, j10);
    }

    public final long j(Object obj, long j10) {
        return this.f4279a.getLong(obj, j10);
    }

    public final Object k(Object obj, long j10) {
        return this.f4279a.getObject(obj, j10);
    }

    public final long l(Field field) {
        return this.f4279a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j10, boolean z10);

    public abstract void n(Object obj, long j10, byte b10);

    public abstract void o(Object obj, long j10, double d10);

    public abstract void p(Object obj, long j10, float f10);

    public final void q(long j10, Object obj, int i10) {
        this.f4279a.putInt(obj, j10, i10);
    }

    public final void r(Object obj, long j10, long j11) {
        this.f4279a.putLong(obj, j10, j11);
    }

    public final void s(Object obj, long j10, Object obj2) {
        this.f4279a.putObject(obj, j10, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f4279a;
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
            z2.a(th);
            return false;
        }
    }

    public abstract boolean u();
}
