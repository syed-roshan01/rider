package r1;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r implements l0, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.l f13409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f13410b;

    public r(q qVar, m2.l lVar) {
        this.f13409a = lVar;
        this.f13410b = qVar;
    }

    @Override // m2.b
    public final int E(long j10) {
        return this.f13410b.E(j10);
    }

    @Override // m2.b
    public final float F(long j10) {
        return this.f13410b.F(j10);
    }

    @Override // m2.b
    public final int J(float f10) {
        return this.f13410b.J(f10);
    }

    @Override // r1.l0
    public final k0 N(int i10, int i11, Map map, c9.c cVar) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new z.h0(i10, i11, map);
        }
        throw new IllegalStateException(("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // m2.b
    public final long S(long j10) {
        return this.f13410b.S(j10);
    }

    @Override // m2.b
    public final float Z(long j10) {
        return this.f13410b.Z(j10);
    }

    @Override // m2.b
    public final float c() {
        return this.f13410b.c();
    }

    @Override // m2.b
    public final long e0(float f10) {
        return this.f13410b.e0(f10);
    }

    @Override // r1.q
    public final m2.l getLayoutDirection() {
        return this.f13409a;
    }

    @Override // m2.b
    public final float m() {
        return this.f13410b.m();
    }

    @Override // m2.b
    public final float o0(int i10) {
        return this.f13410b.o0(i10);
    }

    @Override // r1.q
    public final boolean q() {
        return this.f13410b.q();
    }

    @Override // m2.b
    public final float q0(float f10) {
        return this.f13410b.q0(f10);
    }

    @Override // m2.b
    public final long t(float f10) {
        return this.f13410b.t(f10);
    }

    @Override // m2.b
    public final long u(long j10) {
        return this.f13410b.u(j10);
    }

    @Override // m2.b
    public final float v(float f10) {
        return this.f13410b.v(f10);
    }
}
