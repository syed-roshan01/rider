package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f3539c = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3541b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f3540a = new r0();

    public final j1 a(Class cls) {
        j1 j1VarC;
        b1 b1Var;
        Class cls2;
        Charset charset = f0.f3534a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f3541b;
        j1 j1Var = (j1) concurrentHashMap.get(cls);
        if (j1Var != null) {
            return j1Var;
        }
        r0 r0Var = this.f3540a;
        r0Var.getClass();
        Class cls3 = k1.f3567a;
        if (!b0.class.isAssignableFrom(cls) && (cls2 = k1.f3567a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        v0 v0VarA = r0Var.f3613a.a(cls);
        i1 i1Var = (i1) v0VarA;
        if ((i1Var.f3562d & 2) == 2) {
            boolean zIsAssignableFrom = b0.class.isAssignableFrom(cls);
            b bVar = i1Var.f3559a;
            if (zIsAssignableFrom) {
                b1Var = new b1(k1.f3570d, v.f3623a, bVar);
            } else {
                p1 p1Var = k1.f3568b;
                u uVar = v.f3624b;
                if (uVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                b1Var = new b1(p1Var, uVar, bVar);
            }
            j1VarC = b1Var;
        } else if (b0.class.isAssignableFrom(cls)) {
            j1VarC = i1Var.d() == 1 ? a1.C(v0VarA, d1.f3529b, n0.f3597b, k1.f3570d, v.f3623a, u0.f3622b) : a1.C(v0VarA, d1.f3529b, n0.f3597b, k1.f3570d, null, u0.f3622b);
        } else if (i1Var.d() == 1) {
            c1 c1Var = d1.f3528a;
            l0 l0Var = n0.f3596a;
            p1 p1Var2 = k1.f3568b;
            u uVar2 = v.f3624b;
            if (uVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            j1VarC = a1.C(v0VarA, c1Var, l0Var, p1Var2, uVar2, u0.f3621a);
        } else {
            j1VarC = a1.C(v0VarA, d1.f3528a, n0.f3596a, k1.f3569c, null, u0.f3621a);
        }
        j1 j1Var2 = (j1) concurrentHashMap.putIfAbsent(cls, j1VarC);
        return j1Var2 != null ? j1Var2 : j1VarC;
    }
}
