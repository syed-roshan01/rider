package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {
    public static o1 a(Object obj) {
        b0 b0Var = (b0) obj;
        o1 o1Var = b0Var.unknownFields;
        if (o1Var != o1.f3602f) {
            return o1Var;
        }
        o1 o1VarC = o1.c();
        b0Var.unknownFields = o1VarC;
        return o1VarC;
    }

    public static void b(Object obj) {
        ((b0) obj).unknownFields.f3607e = false;
    }

    public static boolean c(Object obj, g2.m mVar) throws com.google.protobuf.z0, h0 {
        int iC = mVar.c();
        int i10 = iC >>> 3;
        int i11 = iC & 7;
        if (i11 == 0) {
            ((o1) obj).d(i10 << 3, Long.valueOf(mVar.B()));
            return true;
        }
        if (i11 == 1) {
            ((o1) obj).d((i10 << 3) | 1, Long.valueOf(mVar.v()));
            return true;
        }
        if (i11 == 2) {
            ((o1) obj).d((i10 << 3) | 2, mVar.l());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw h0.c();
            }
            ((o1) obj).d((i10 << 3) | 5, Integer.valueOf(mVar.t()));
            return true;
        }
        o1 o1VarC = o1.c();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (mVar.b() != Integer.MAX_VALUE && c(o1VarC, mVar)) {
        }
        if (i13 != mVar.c()) {
            throw new h0("Protocol message end-group tag did not match expected tag.");
        }
        o1VarC.f3607e = false;
        ((o1) obj).d(i12 | 3, o1VarC);
        return true;
    }
}
