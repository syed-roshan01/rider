package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f4284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f4285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2 f4286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f4287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f4288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f4289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f4290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f4291h;

    static {
        Unsafe unsafeM = m();
        f4284a = unsafeM;
        f4285b = e.f4097a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        char c10 = 1;
        int i10 = 0;
        y2 x2Var = null;
        if (unsafeM != null) {
            if (!e.a()) {
                x2Var = new x2(unsafeM);
            } else if (zF) {
                x2Var = new w2(unsafeM, c10 == true ? 1 : 0);
            } else if (zF2) {
                x2Var = new w2(unsafeM, i10);
            }
        }
        f4286c = x2Var;
        f4287d = x2Var == null ? false : x2Var.u();
        f4288e = x2Var == null ? false : x2Var.t();
        f4289f = c(byte[].class);
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
        f4290g = (fieldE == null || x2Var == null) ? -1L : x2Var.l(fieldE);
        f4291h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(z2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f4284a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int c(Class cls) {
        if (f4288e) {
            return f4286c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f4288e) {
            f4286c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (e.a()) {
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
        if (!e.a()) {
            return false;
        }
        try {
            Class cls2 = f4285b;
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
        return f4286c.f(bArr, f4289f + j10);
    }

    public static byte h(Object obj, long j10) {
        return (byte) ((f4286c.i(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j10) {
        return (byte) ((f4286c.i(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static int j(Object obj, long j10) {
        return f4286c.i(obj, j10);
    }

    public static long k(Object obj, long j10) {
        return f4286c.j(obj, j10);
    }

    public static Object l(Object obj, long j10) {
        return f4286c.k(obj, j10);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new v2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j10, boolean z10) {
        f4286c.m(obj, j10, z10);
    }

    public static void o(byte[] bArr, long j10, byte b10) {
        f4286c.n(bArr, f4289f + j10, b10);
    }

    public static void p(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = f4286c.i(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        t(j11, obj, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        t(j11, obj, ((255 & b10) << i10) | (f4286c.i(obj, j11) & (~(255 << i10))));
    }

    public static void r(Object obj, long j10, double d10) {
        f4286c.o(obj, j10, d10);
    }

    public static void s(Object obj, long j10, float f10) {
        f4286c.p(obj, j10, f10);
    }

    public static void t(long j10, Object obj, int i10) {
        f4286c.q(j10, obj, i10);
    }

    public static void u(Object obj, long j10, long j11) {
        f4286c.r(obj, j10, j11);
    }

    public static void v(Object obj, long j10, Object obj2) {
        f4286c.s(obj, j10, obj2);
    }
}
