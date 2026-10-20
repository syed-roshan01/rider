package p9;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends w8.i implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ g f12919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f12920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f12921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, u8.e eVar) {
        super(3, eVar);
        this.f12921d = n0Var;
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        l0 l0Var = new l0(this.f12921d, (u8.e) obj3);
        l0Var.f12919b = (g) obj;
        l0Var.f12920c = iIntValue;
        return l0Var.invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[RETURN] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        g gVar;
        f0 f0Var;
        long j10;
        f0 f0Var2;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12918a;
        n0 n0Var = this.f12921d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    gVar = this.f12919b;
                    d7.t.v0(obj);
                    if (n0Var.f12931b > 0) {
                        f0Var = f0.f12891b;
                        this.f12919b = gVar;
                        this.f12918a = 3;
                        if (gVar.emit(f0Var, this) == aVar) {
                            return aVar;
                        }
                        j10 = n0Var.f12931b;
                        this.f12919b = gVar;
                        this.f12918a = 4;
                        if (d7.t.P(j10, this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i10 == 3) {
                    gVar = this.f12919b;
                    d7.t.v0(obj);
                    j10 = n0Var.f12931b;
                    this.f12919b = gVar;
                    this.f12918a = 4;
                    if (d7.t.P(j10, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 == 4) {
                    gVar = this.f12919b;
                    d7.t.v0(obj);
                } else if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f0Var2 = f0.f12892c;
                this.f12919b = null;
                this.f12918a = 5;
                if (gVar.emit(f0Var2, this) == aVar) {
                    return aVar;
                }
            }
            d7.t.v0(obj);
        } else {
            d7.t.v0(obj);
            gVar = this.f12919b;
            if (this.f12920c > 0) {
                f0 f0Var3 = f0.f12890a;
                this.f12918a = 1;
                if (gVar.emit(f0Var3, this) == aVar) {
                    return aVar;
                }
            } else {
                long j11 = n0Var.f12930a;
                this.f12919b = gVar;
                this.f12918a = 2;
                if (d7.t.P(j11, this) == aVar) {
                    return aVar;
                }
                if (n0Var.f12931b > 0) {
                    f0Var = f0.f12891b;
                    this.f12919b = gVar;
                    this.f12918a = 3;
                    if (gVar.emit(f0Var, this) == aVar) {
                        return aVar;
                    }
                    j10 = n0Var.f12931b;
                    this.f12919b = gVar;
                    this.f12918a = 4;
                    if (d7.t.P(j10, this) == aVar) {
                        return aVar;
                    }
                }
                f0Var2 = f0.f12892c;
                this.f12919b = null;
                this.f12918a = 5;
                if (gVar.emit(f0Var2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return q8.l.f13235a;
    }
}
