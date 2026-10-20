package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public static void a(Object obj) {
        a7.a.w(obj);
        throw null;
    }

    public static void b(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        a7.a.w(obj2);
        if (s0Var.isEmpty()) {
            return;
        }
        Iterator it = s0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static boolean c(Object obj) {
        return !((s0) obj).f3617a;
    }

    public static s0 d(Object obj, Object obj2) {
        s0 s0VarC = (s0) obj;
        s0 s0Var = (s0) obj2;
        if (!s0Var.isEmpty()) {
            if (!s0VarC.f3617a) {
                s0VarC = s0VarC.c();
            }
            s0VarC.b();
            if (!s0Var.isEmpty()) {
                s0VarC.putAll(s0Var);
            }
        }
        return s0VarC;
    }

    public static s0 e() {
        return s0.f3616b.c();
    }

    public static void f(Object obj) {
        ((s0) obj).f3617a = false;
    }
}
