package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends v1 {
    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final boolean c(Object obj, long j10) {
        return this.f3625a.getBoolean(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final byte d(Object obj, long j10) {
        return this.f3625a.getByte(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final double e(Object obj, long j10) {
        return this.f3625a.getDouble(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final float f(Object obj, long j10) {
        return this.f3625a.getFloat(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void k(Object obj, long j10, boolean z10) {
        this.f3625a.putBoolean(obj, j10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void l(Object obj, long j10, byte b10) {
        this.f3625a.putByte(obj, j10, b10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void m(Object obj, long j10, double d10) {
        this.f3625a.putDouble(obj, j10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void n(Object obj, long j10, float f10) {
        this.f3625a.putFloat(obj, j10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f3625a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            w1.a(th);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final boolean s() {
        Unsafe unsafe = this.f3625a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (w1.e() != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        w1.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                w1.a(th2);
            }
        }
        return false;
    }
}
