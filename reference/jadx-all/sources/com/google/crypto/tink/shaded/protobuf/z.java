package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f3640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f3641b;

    public z(b0 b0Var) {
        this.f3640a = b0Var;
        if (b0Var.o()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f3641b = b0Var.r();
    }

    public static void f(b0 b0Var, Object obj) {
        g1 g1Var = g1.f3539c;
        g1Var.getClass();
        g1Var.a(b0Var.getClass()).a(b0Var, obj);
    }

    public final b0 a() {
        b0 b0VarBuildPartial = buildPartial();
        b0VarBuildPartial.getClass();
        if (b0.n(b0VarBuildPartial, true)) {
            return b0VarBuildPartial;
        }
        throw new n1();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b0 buildPartial() {
        if (!this.f3641b.o()) {
            return this.f3641b;
        }
        b0 b0Var = this.f3641b;
        b0Var.getClass();
        g1 g1Var = g1.f3539c;
        g1Var.getClass();
        g1Var.a(b0Var.getClass()).b(b0Var);
        b0Var.p();
        return this.f3641b;
    }

    public final z c() {
        z zVarC = this.f3640a.c();
        zVarC.f3641b = buildPartial();
        return zVarC;
    }

    public final void d() {
        if (this.f3641b.o()) {
            return;
        }
        b0 b0VarR = this.f3640a.r();
        f(b0VarR, this.f3641b);
        this.f3641b = b0VarR;
    }

    public final void e(b0 b0Var) {
        if (this.f3640a.equals(b0Var)) {
            return;
        }
        d();
        f(this.f3641b, b0Var);
    }
}
