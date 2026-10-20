package v;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements m2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2.b f15665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.d f15668d = new u9.d(false);

    public l1(m2.b bVar) {
        this.f15665a = bVar;
    }

    @Override // m2.b
    public final int E(long j10) {
        return this.f15665a.E(j10);
    }

    @Override // m2.b
    public final float F(long j10) {
        return this.f15665a.F(j10);
    }

    @Override // m2.b
    public final int J(float f10) {
        return this.f15665a.J(f10);
    }

    @Override // m2.b
    public final long S(long j10) {
        return this.f15665a.S(j10);
    }

    @Override // m2.b
    public final float Z(long j10) {
        return this.f15665a.Z(j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(u8.e eVar) {
        j1 j1Var;
        l1 l1Var;
        if (eVar instanceof j1) {
            j1Var = (j1) eVar;
            int i10 = j1Var.f15645d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j1Var.f15645d = i10 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, eVar);
            }
        } else {
            j1Var = new j1(this, eVar);
        }
        Object obj = j1Var.f15643b;
        v8.a aVar = v8.a.f15963a;
        int i11 = j1Var.f15645d;
        if (i11 == 0) {
            d7.t.v0(obj);
            j1Var.f15642a = this;
            j1Var.f15645d = 1;
            if (this.f15668d.c(null, j1Var) == aVar) {
                return aVar;
            }
            l1Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l1Var = j1Var.f15642a;
            d7.t.v0(obj);
        }
        l1Var.f15666b = false;
        l1Var.f15667c = false;
        return q8.l.f13235a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(u8.e eVar) {
        k1 k1Var;
        l1 l1Var;
        if (eVar instanceof k1) {
            k1Var = (k1) eVar;
            int i10 = k1Var.f15658d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k1Var.f15658d = i10 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, eVar);
            }
        } else {
            k1Var = new k1(this, eVar);
        }
        Object obj = k1Var.f15656b;
        v8.a aVar = v8.a.f15963a;
        int i11 = k1Var.f15658d;
        if (i11 == 0) {
            d7.t.v0(obj);
            if (this.f15666b || this.f15667c) {
                l1Var = this;
            } else {
                k1Var.f15655a = this;
                k1Var.f15658d = 1;
                if (this.f15668d.c(null, k1Var) == aVar) {
                    return aVar;
                }
                l1Var = this;
            }
            return Boolean.valueOf(l1Var.f15666b);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l1Var = k1Var.f15655a;
        d7.t.v0(obj);
        l1Var.f15668d.d(null);
        return Boolean.valueOf(l1Var.f15666b);
    }

    @Override // m2.b
    public final float c() {
        return this.f15665a.c();
    }

    @Override // m2.b
    public final long e0(float f10) {
        return this.f15665a.e0(f10);
    }

    @Override // m2.b
    public final float m() {
        return this.f15665a.m();
    }

    @Override // m2.b
    public final float o0(int i10) {
        return this.f15665a.o0(i10);
    }

    @Override // m2.b
    public final float q0(float f10) {
        return this.f15665a.q0(f10);
    }

    @Override // m2.b
    public final long t(float f10) {
        return this.f15665a.t(f10);
    }

    @Override // m2.b
    public final long u(long j10) {
        return this.f15665a.u(j10);
    }

    @Override // m2.b
    public final float v(float f10) {
        return this.f15665a.v(f10);
    }
}
