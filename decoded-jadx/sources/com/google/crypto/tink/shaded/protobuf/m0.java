package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends n0 {
    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void a(Object obj, long j10) {
        ((c) ((e0) w1.f3633c.i(obj, j10))).f3525a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void b(Object obj, long j10, Object obj2) {
        v1 v1Var = w1.f3633c;
        e0 e0VarA = (e0) v1Var.i(obj, j10);
        e0 e0Var = (e0) v1Var.i(obj2, j10);
        int size = e0VarA.size();
        int size2 = e0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((c) e0VarA).f3525a) {
                e0VarA = e0VarA.a(size2 + size);
            }
            e0VarA.addAll(e0Var);
        }
        if (size > 0) {
            e0Var = e0VarA;
        }
        w1.v(obj, j10, e0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final List c(Object obj, long j10) {
        e0 e0Var = (e0) w1.f3633c.i(obj, j10);
        if (((c) e0Var).f3525a) {
            return e0Var;
        }
        int size = e0Var.size();
        e0 e0VarA = e0Var.a(size == 0 ? 10 : size * 2);
        w1.v(obj, j10, e0VarA);
        return e0VarA;
    }
}
