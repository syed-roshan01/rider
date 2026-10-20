package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends h1 {
    @Override // com.google.protobuf.h1
    public final void a(Object obj, long j10) {
        ((d) ((x0) z2.f4286c.k(obj, j10))).f4087a = false;
    }

    @Override // com.google.protobuf.h1
    public final void b(Object obj, long j10, Object obj2) {
        y2 y2Var = z2.f4286c;
        x0 x0VarA = (x0) y2Var.k(obj, j10);
        x0 x0Var = (x0) y2Var.k(obj2, j10);
        int size = x0VarA.size();
        int size2 = x0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((d) x0VarA).f4087a) {
                x0VarA = x0VarA.a(size2 + size);
            }
            x0VarA.addAll(x0Var);
        }
        if (size > 0) {
            x0Var = x0VarA;
        }
        z2.v(obj, j10, x0Var);
    }

    @Override // com.google.protobuf.h1
    public final List c(Object obj, long j10) {
        x0 x0Var = (x0) z2.f4286c.k(obj, j10);
        if (((d) x0Var).f4087a) {
            return x0Var;
        }
        int size = x0Var.size();
        x0 x0VarA = x0Var.a(size == 0 ? 10 : size * 2);
        z2.v(obj, j10, x0VarA);
        return x0VarA;
    }
}
