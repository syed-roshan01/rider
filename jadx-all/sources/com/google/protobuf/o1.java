package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public static i3.a0 a(Object obj) {
        return ((m1) obj).f4178a;
    }

    public static n1 b(Object obj) {
        return (n1) obj;
    }

    public static int c(int i10, Object obj, Object obj2) {
        n1 n1Var = (n1) obj;
        m1 m1Var = (m1) obj2;
        int iX = 0;
        if (!n1Var.isEmpty()) {
            for (Map.Entry entry : n1Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                m1Var.getClass();
                int iK0 = v.k0(i10);
                int iA = m1.a(m1Var.f4178a, key, value);
                iX = a7.a.x(iA, iA, iK0, iX);
            }
        }
        return iX;
    }

    public static boolean d(Object obj) {
        return !((n1) obj).f4185a;
    }

    public static n1 e(Object obj, Object obj2) {
        n1 n1VarC = (n1) obj;
        n1 n1Var = (n1) obj2;
        if (!n1Var.isEmpty()) {
            if (!n1VarC.f4185a) {
                n1VarC = n1VarC.c();
            }
            n1VarC.b();
            if (!n1Var.isEmpty()) {
                n1VarC.putAll(n1Var);
            }
        }
        return n1VarC;
    }

    public static n1 f() {
        return n1.f4184b.c();
    }

    public static void g(Object obj) {
        ((n1) obj).f4185a = false;
    }
}
