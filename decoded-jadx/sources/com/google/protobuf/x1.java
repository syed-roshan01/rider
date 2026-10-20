package com.google.protobuf;

import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f4272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f4274c;

    public x1(t2 t2Var, a0 a0Var, t1 t1Var) {
        this.f4273b = t2Var;
        a0Var.getClass();
        this.f4274c = a0Var;
        this.f4272a = t1Var;
    }

    @Override // com.google.protobuf.i2
    public final void a(Object obj, Object obj2) {
        j2.B(this.f4273b, obj, obj2);
    }

    @Override // com.google.protobuf.i2
    public final void b(Object obj) {
        this.f4273b.getClass();
        t2.b(obj);
        this.f4274c.getClass();
        a7.a.w(obj);
        throw null;
    }

    @Override // com.google.protobuf.i2
    public final boolean c(Object obj) {
        this.f4274c.getClass();
        a7.a.w(obj);
        throw null;
    }

    @Override // com.google.protobuf.i2
    public final boolean d(Object obj, Object obj2) {
        t2 t2Var = this.f4273b;
        t2Var.getClass();
        s2 s2Var = ((l0) obj).unknownFields;
        t2Var.getClass();
        return s2Var.equals(((l0) obj2).unknownFields);
    }

    @Override // com.google.protobuf.i2
    public final int e(Object obj) {
        this.f4273b.getClass();
        s2 s2Var = ((l0) obj).unknownFields;
        int i10 = s2Var.f4238d;
        if (i10 != -1) {
            return i10;
        }
        int iU = 0;
        for (int i11 = 0; i11 < s2Var.f4235a; i11++) {
            int i12 = s2Var.f4236b[i11] >>> 3;
            iU += v.U(3, (n) s2Var.f4237c[i11]) + v.l0(2, i12) + (v.k0(1) * 2);
        }
        s2Var.f4238d = iU;
        return iU;
    }

    @Override // com.google.protobuf.i2
    public final Object f() {
        t1 t1Var = this.f4272a;
        return t1Var instanceof l0 ? ((l0) t1Var).newMutableInstance() : t1Var.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.i2
    public final int g(Object obj) {
        this.f4273b.getClass();
        return ((l0) obj).unknownFields.hashCode();
    }

    @Override // com.google.protobuf.i2
    public final void h(Object obj, g2.m mVar, z zVar) {
        this.f4273b.getClass();
        t2.a(obj);
        this.f4274c.getClass();
        a7.a.w(obj);
        throw null;
    }

    @Override // com.google.protobuf.i2
    public final void i(Object obj, byte[] bArr, int i10, int i11, com.google.crypto.tink.shaded.protobuf.e eVar) {
        l0 l0Var = (l0) obj;
        if (l0Var.unknownFields == s2.f4234f) {
            l0Var.unknownFields = new s2();
        }
        a7.a.w(obj);
        throw null;
    }

    @Override // com.google.protobuf.i2
    public final void j(Object obj, w4 w4Var) {
        this.f4274c.getClass();
        a7.a.w(obj);
        throw null;
    }
}
