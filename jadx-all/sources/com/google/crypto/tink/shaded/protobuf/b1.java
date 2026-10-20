package com.google.crypto.tink.shaded.protobuf;

import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f3523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f3524c;

    public b1(p1 p1Var, u uVar, b bVar) {
        this.f3523b = p1Var;
        uVar.getClass();
        this.f3524c = uVar;
        this.f3522a = bVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void a(Object obj, Object obj2) {
        k1.B(this.f3523b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void b(Object obj) {
        this.f3523b.getClass();
        p1.b(obj);
        this.f3524c.getClass();
        a7.a.w(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final boolean c(Object obj) {
        this.f3524c.getClass();
        a7.a.w(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final boolean d(Object obj, Object obj2) {
        p1 p1Var = this.f3523b;
        p1Var.getClass();
        o1 o1Var = ((b0) obj).unknownFields;
        p1Var.getClass();
        return o1Var.equals(((b0) obj2).unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final int e(Object obj) {
        this.f3523b.getClass();
        o1 o1Var = ((b0) obj).unknownFields;
        int i10 = o1Var.f3606d;
        if (i10 != -1) {
            return i10;
        }
        int iS0 = 0;
        for (int i11 = 0; i11 < o1Var.f3603a; i11++) {
            int i12 = o1Var.f3604b[i11] >>> 3;
            iS0 += p.s0(3, (l) o1Var.f3605c[i11]) + p.J0(2, i12) + (p.I0(1) * 2);
        }
        o1Var.f3606d = iS0;
        return iS0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final Object f() {
        b bVar = this.f3522a;
        return bVar instanceof b0 ? ((b0) bVar).r() : bVar.c().buildPartial();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final int g(Object obj) {
        this.f3523b.getClass();
        return ((b0) obj).unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void h(Object obj, byte[] bArr, int i10, int i11, e eVar) {
        b0 b0Var = (b0) obj;
        if (b0Var.unknownFields == o1.f3602f) {
            b0Var.unknownFields = o1.c();
        }
        a7.a.w(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void i(Object obj, w4 w4Var) {
        this.f3524c.getClass();
        a7.a.w(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void j(Object obj, g2.m mVar, t tVar) {
        this.f3523b.getClass();
        p1.a(obj);
        this.f3524c.getClass();
        a7.a.w(obj);
        throw null;
    }
}
