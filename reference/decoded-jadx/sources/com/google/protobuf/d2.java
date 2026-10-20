package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f4094c = new d2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4096b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f4095a = new l1();

    public final i2 a(Class cls) {
        i2 i2VarD;
        x1 x1Var;
        Class cls2;
        Charset charset = y0.f4276a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f4096b;
        i2 i2Var = (i2) concurrentHashMap.get(cls);
        if (i2Var != null) {
            return i2Var;
        }
        l1 l1Var = this.f4095a;
        l1Var.getClass();
        Class cls3 = j2.f4153a;
        if (!l0.class.isAssignableFrom(cls) && (cls2 = j2.f4153a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        q1 q1VarA = l1Var.f4176a.a(cls);
        f2 f2Var = (f2) q1VarA;
        if ((f2Var.f4110d & 2) == 2) {
            boolean zIsAssignableFrom = l0.class.isAssignableFrom(cls);
            t1 t1Var = f2Var.f4107a;
            if (zIsAssignableFrom) {
                x1Var = new x1(j2.f4156d, b0.f4061a, t1Var);
            } else {
                t2 t2Var = j2.f4154b;
                a0 a0Var = b0.f4062b;
                if (a0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x1Var = new x1(t2Var, a0Var, t1Var);
            }
            i2VarD = x1Var;
        } else if (l0.class.isAssignableFrom(cls)) {
            i2VarD = f2Var.d() == 1 ? w1.D(q1VarA, z1.f4283b, h1.f4121b, j2.f4156d, b0.f4061a, p1.f4213b) : w1.D(q1VarA, z1.f4283b, h1.f4121b, j2.f4156d, null, p1.f4213b);
        } else if (f2Var.d() == 1) {
            y1 y1Var = z1.f4282a;
            f1 f1Var = h1.f4120a;
            t2 t2Var2 = j2.f4154b;
            a0 a0Var2 = b0.f4062b;
            if (a0Var2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            i2VarD = w1.D(q1VarA, y1Var, f1Var, t2Var2, a0Var2, p1.f4212a);
        } else {
            i2VarD = w1.D(q1VarA, z1.f4282a, h1.f4120a, j2.f4155c, null, p1.f4212a);
        }
        i2 i2Var2 = (i2) concurrentHashMap.putIfAbsent(cls, i2VarD);
        return i2Var2 != null ? i2Var2 : i2VarD;
    }

    public final i2 b(Object obj) {
        return a(obj.getClass());
    }
}
