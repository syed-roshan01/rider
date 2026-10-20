package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class t2 {
    public static s2 a(Object obj) {
        l0 l0Var = (l0) obj;
        s2 s2Var = l0Var.unknownFields;
        if (s2Var != s2.f4234f) {
            return s2Var;
        }
        s2 s2Var2 = new s2();
        l0Var.unknownFields = s2Var2;
        return s2Var2;
    }

    public static void b(Object obj) {
        ((l0) obj).unknownFields.f4239e = false;
    }

    public static boolean c(Object obj, g2.m mVar) throws a1, com.google.crypto.tink.shaded.protobuf.g0 {
        int iC = mVar.c();
        int i10 = iC >>> 3;
        int i11 = iC & 7;
        if (i11 == 0) {
            ((s2) obj).f(i10 << 3, Long.valueOf(mVar.B()));
            return true;
        }
        if (i11 == 1) {
            ((s2) obj).f((i10 << 3) | 1, Long.valueOf(mVar.v()));
            return true;
        }
        if (i11 == 2) {
            ((s2) obj).f((i10 << 3) | 2, mVar.m());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw a1.d();
            }
            ((s2) obj).f((i10 << 3) | 5, Integer.valueOf(mVar.t()));
            return true;
        }
        s2 s2Var = new s2();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (mVar.b() != Integer.MAX_VALUE && c(s2Var, mVar)) {
        }
        if (i13 != mVar.c()) {
            throw a1.a();
        }
        s2Var.f4239e = false;
        ((s2) obj).f(i12 | 3, s2Var);
        return true;
    }
}
