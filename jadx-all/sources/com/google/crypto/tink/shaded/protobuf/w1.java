package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f3631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f3632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v1 f3633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f3635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f3636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f3637g;

    static {
        Unsafe unsafeM = m();
        f3631a = unsafeM;
        f3632b = d.f3526a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        char c10 = 1;
        int i10 = 0;
        v1 u1Var = null;
        if (unsafeM != null) {
            if (!d.a()) {
                u1Var = new u1(unsafeM);
            } else if (zF) {
                u1Var = new t1(unsafeM, c10 == true ? 1 : 0);
            } else if (zF2) {
                u1Var = new t1(unsafeM, i10);
            }
        }
        f3633c = u1Var;
        f3634d = u1Var == null ? false : u1Var.s();
        f3635e = u1Var == null ? false : u1Var.r();
        f3636f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && u1Var != null) {
            u1Var.j(fieldE);
        }
        f3637g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(w1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f3631a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int c(Class cls) {
        if (f3635e) {
            return f3633c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f3635e) {
            f3633c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f3632b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j10) {
        return f3633c.d(bArr, f3636f + j10);
    }

    public static byte h(Object obj, long j10) {
        return (byte) ((f3633c.g(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j10) {
        return (byte) ((f3633c.g(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static int j(Object obj, long j10) {
        return f3633c.g(obj, j10);
    }

    public static long k(Object obj, long j10) {
        return f3633c.h(obj, j10);
    }

    public static Object l(Object obj, long j10) {
        return f3633c.i(obj, j10);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j10, boolean z10) {
        f3633c.k(obj, j10, z10);
    }

    public static void o(byte[] bArr, long j10, byte b10) {
        f3633c.l(bArr, f3636f + j10, b10);
    }

    public static void p(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iG = f3633c.g(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        t(j11, obj, ((255 & b10) << i10) | (iG & (~(255 << i10))));
    }

    public static void q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        t(j11, obj, ((255 & b10) << i10) | (f3633c.g(obj, j11) & (~(255 << i10))));
    }

    public static void r(Object obj, long j10, double d10) {
        f3633c.m(obj, j10, d10);
    }

    public static void s(Object obj, long j10, float f10) {
        f3633c.n(obj, j10, f10);
    }

    public static void t(long j10, Object obj, int i10) {
        f3633c.o(j10, obj, i10);
    }

    public static void u(Object obj, long j10, long j11) {
        f3633c.p(obj, j10, j11);
    }

    public static void v(Object obj, long j10, Object obj2) {
        f3633c.q(obj, j10, obj2);
    }
}
