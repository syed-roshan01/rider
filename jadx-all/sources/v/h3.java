package v;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d9.u f15600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15602f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f15603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m9.d0 f15604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c9.f f15605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c9.c f15606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c9.c f15607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c9.c f15608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1 f15609t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(m9.d0 d0Var, c9.f fVar, c9.c cVar, c9.c cVar2, c9.c cVar3, l1 l1Var, u8.e eVar) {
        super(eVar);
        this.f15604o = d0Var;
        this.f15605p = fVar;
        this.f15606q = cVar;
        this.f15607r = cVar2;
        this.f15608s = cVar3;
        this.f15609t = l1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h3 h3Var = new h3(this.f15604o, this.f15605p, this.f15606q, this.f15607r, this.f15608s, this.f15609t, eVar);
        h3Var.f15603n = obj;
        return h3Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h3) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[Catch: m -> 0x0074, TryCatch #1 {m -> 0x0074, blocks: (B:13:0x006d, B:33:0x00df, B:35:0x00e5, B:36:0x00ef), top: B:77:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef A[Catch: m -> 0x0074, TRY_LEAVE, TryCatch #1 {m -> 0x0074, blocks: (B:13:0x006d, B:33:0x00df, B:35:0x00e5, B:36:0x00ef), top: B:77:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0166 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0180  */
    /* JADX WARN: Code duplicated, block: B:60:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4, types: [n9.d, u8.e] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r7v0, types: [c9.f] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        ?? r10;
        o1.h0 h0Var;
        Object objB;
        o1.h0 h0Var2;
        o1.u uVar;
        long jD;
        d9.u uVar2;
        Object objH;
        d9.u uVar3;
        o1.h0 h0Var3;
        Object obj2;
        Object obj3;
        Object objI;
        d9.u uVar4;
        long j10;
        o1.h0 h0Var4;
        o1.u uVar5;
        Object objH2;
        v8.a aVar = v8.a.f15963a;
        o1.u uVar6 = this.f15602f;
        m9.d0 d0Var = this.f15604o;
        d9.u uVar7 = this.f15605p;
        c9.c cVar = this.f15608s;
        c9.c cVar2 = this.f15606q;
        l1 l1Var = this.f15609t;
        try {
            switch (uVar6) {
                case 0:
                    d7.t.v0(obj);
                    h0Var = (o1.h0) this.f15603n;
                    this.f15603n = h0Var;
                    this.f15602f = 1;
                    objB = k3.b(h0Var, (2 & 1) != 0, (2 & 2) != 0 ? o1.l.f12401b : null, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                    h0Var2 = h0Var;
                    uVar = (o1.u) objB;
                    uVar.a();
                    z6.a.Q(d0Var, null, 0, new w2(l1Var, null), 3);
                    if (uVar7 != k3.f15663a) {
                        z6.a.Q(d0Var, null, 0, new x2(uVar7, l1Var, uVar, null), 3);
                    }
                    if (cVar2 != null) {
                        jD = h0Var2.g().d();
                    } else {
                        jD = 4611686018427387903L;
                    }
                    uVar2 = new d9.u();
                    try {
                        y2 y2Var = new y2(null);
                        this.f15603n = h0Var2;
                        this.f15598b = uVar;
                        this.f15599c = uVar2;
                        this.f15600d = uVar2;
                        this.f15601e = jD;
                        this.f15602f = 2;
                        objH = h0Var2.h(jD, y2Var, this);
                        if (objH == aVar) {
                            return aVar;
                        }
                        uVar3 = uVar2;
                        uVar2.f4952a = objH;
                        obj2 = uVar3.f4952a;
                        if (obj2 == null) {
                            z6.a.Q(d0Var, null, 0, new z2(l1Var, null), 3);
                        } else {
                            ((o1.u) obj2).a();
                            z6.a.Q(d0Var, null, 0, new a3(l1Var, null), 3);
                        }
                        obj3 = uVar3.f4952a;
                        if (obj3 != null) {
                            if (this.f15607r == null) {
                                this.f15603n = h0Var2;
                                this.f15598b = uVar3;
                                this.f15599c = null;
                                this.f15600d = null;
                                this.f15601e = jD;
                                this.f15602f = 4;
                                p0 p0Var = k3.f15663a;
                                objI = h0Var2.i(h0Var2.g().b(), new n2((o1.u) obj3, null), this);
                                if (objI == aVar) {
                                    return aVar;
                                }
                                uVar4 = uVar3;
                                j10 = jD;
                                h0Var4 = h0Var2;
                                uVar5 = (o1.u) objI;
                                if (uVar5 != null) {
                                    z6.a.Q(d0Var, null, 0, new c3(l1Var, null), 3);
                                    if (uVar7 != k3.f15663a) {
                                        z6.a.Q(d0Var, null, 0, new d3(uVar7, l1Var, uVar5, null), 3);
                                    }
                                    g3 g3Var = new g3(this.f15604o, this.f15607r, this.f15608s, uVar4, this.f15609t, null);
                                    this.f15603n = h0Var4;
                                    this.f15598b = uVar4;
                                    this.f15599c = uVar5;
                                    this.f15602f = 5;
                                    objH2 = h0Var4.h(j10, g3Var, this);
                                    uVar6 = objH2;
                                    uVar7 = uVar4;
                                    if (objH2 == aVar) {
                                        return aVar;
                                    }
                                } else if (cVar != null) {
                                    cVar.invoke(new d1.c(((o1.u) uVar4.f4952a).f12416c));
                                }
                            } else if (cVar != null) {
                                cVar.invoke(new d1.c(((o1.u) obj3).f12416c));
                            }
                            break;
                        }
                        return q8.l.f13235a;
                    } catch (o1.m unused) {
                        h0Var3 = h0Var2;
                        if (cVar2 != null) {
                            cVar2.invoke(new d1.c(uVar.f12416c));
                        }
                        this.f15603n = h0Var3;
                        this.f15598b = uVar2;
                        this.f15599c = null;
                        this.f15600d = null;
                        this.f15601e = jD;
                        this.f15602f = 3;
                        if (k3.a(h0Var3, this) == aVar) {
                            return aVar;
                        }
                        z6.a.Q(d0Var, null, 0, new b3(l1Var, null), 3);
                        h0Var2 = h0Var3;
                        uVar3 = uVar2;
                    }
                    break;
                case 1:
                    h0Var = (o1.h0) this.f15603n;
                    d7.t.v0(obj);
                    objB = obj;
                    h0Var2 = h0Var;
                    uVar = (o1.u) objB;
                    uVar.a();
                    z6.a.Q(d0Var, null, 0, new w2(l1Var, null), 3);
                    if (uVar7 != k3.f15663a) {
                        z6.a.Q(d0Var, null, 0, new x2(uVar7, l1Var, uVar, null), 3);
                    }
                    if (cVar2 != null) {
                        jD = h0Var2.g().d();
                    } else {
                        jD = 4611686018427387903L;
                    }
                    uVar2 = new d9.u();
                    y2 y2Var2 = new y2(null);
                    this.f15603n = h0Var2;
                    this.f15598b = uVar;
                    this.f15599c = uVar2;
                    this.f15600d = uVar2;
                    this.f15601e = jD;
                    this.f15602f = 2;
                    objH = h0Var2.h(jD, y2Var2, this);
                    if (objH == aVar) {
                        return aVar;
                    }
                    uVar3 = uVar2;
                    uVar2.f4952a = objH;
                    obj2 = uVar3.f4952a;
                    if (obj2 == null) {
                        z6.a.Q(d0Var, null, 0, new z2(l1Var, null), 3);
                    } else {
                        ((o1.u) obj2).a();
                        z6.a.Q(d0Var, null, 0, new a3(l1Var, null), 3);
                    }
                    obj3 = uVar3.f4952a;
                    if (obj3 != null) {
                        if (this.f15607r == null) {
                            this.f15603n = h0Var2;
                            this.f15598b = uVar3;
                            this.f15599c = null;
                            this.f15600d = null;
                            this.f15601e = jD;
                            this.f15602f = 4;
                            p0 p0Var2 = k3.f15663a;
                            objI = h0Var2.i(h0Var2.g().b(), new n2((o1.u) obj3, null), this);
                            if (objI == aVar) {
                                return aVar;
                            }
                            uVar4 = uVar3;
                            j10 = jD;
                            h0Var4 = h0Var2;
                            uVar5 = (o1.u) objI;
                            if (uVar5 != null) {
                                z6.a.Q(d0Var, null, 0, new c3(l1Var, null), 3);
                                if (uVar7 != k3.f15663a) {
                                    z6.a.Q(d0Var, null, 0, new d3(uVar7, l1Var, uVar5, null), 3);
                                }
                                g3 g3Var2 = new g3(this.f15604o, this.f15607r, this.f15608s, uVar4, this.f15609t, null);
                                this.f15603n = h0Var4;
                                this.f15598b = uVar4;
                                this.f15599c = uVar5;
                                this.f15602f = 5;
                                objH2 = h0Var4.h(j10, g3Var2, this);
                                uVar6 = objH2;
                                uVar7 = uVar4;
                                if (objH2 == aVar) {
                                    return aVar;
                                }
                            } else if (cVar != null) {
                                cVar.invoke(new d1.c(((o1.u) uVar4.f4952a).f12416c));
                            }
                        } else if (cVar != null) {
                            cVar.invoke(new d1.c(((o1.u) obj3).f12416c));
                        }
                        break;
                    }
                    return q8.l.f13235a;
                case 2:
                    jD = this.f15601e;
                    uVar2 = this.f15600d;
                    uVar3 = (d9.u) this.f15599c;
                    uVar = (o1.u) this.f15598b;
                    h0Var2 = (o1.h0) this.f15603n;
                    try {
                        d7.t.v0(obj);
                        objH = obj;
                        uVar2.f4952a = objH;
                        obj2 = uVar3.f4952a;
                        if (obj2 == null) {
                            z6.a.Q(d0Var, null, 0, new z2(l1Var, null), 3);
                        } else {
                            ((o1.u) obj2).a();
                            z6.a.Q(d0Var, null, 0, new a3(l1Var, null), 3);
                        }
                    } catch (o1.m unused2) {
                        uVar2 = uVar3;
                        h0Var3 = h0Var2;
                        if (cVar2 != null) {
                            cVar2.invoke(new d1.c(uVar.f12416c));
                        }
                        this.f15603n = h0Var3;
                        this.f15598b = uVar2;
                        this.f15599c = null;
                        this.f15600d = null;
                        this.f15601e = jD;
                        this.f15602f = 3;
                        if (k3.a(h0Var3, this) == aVar) {
                            return aVar;
                        }
                        z6.a.Q(d0Var, null, 0, new b3(l1Var, null), 3);
                        h0Var2 = h0Var3;
                        uVar3 = uVar2;
                    }
                    obj3 = uVar3.f4952a;
                    if (obj3 != null) {
                        if (this.f15607r == null) {
                            this.f15603n = h0Var2;
                            this.f15598b = uVar3;
                            this.f15599c = null;
                            this.f15600d = null;
                            this.f15601e = jD;
                            this.f15602f = 4;
                            p0 p0Var3 = k3.f15663a;
                            objI = h0Var2.i(h0Var2.g().b(), new n2((o1.u) obj3, null), this);
                            if (objI == aVar) {
                                return aVar;
                            }
                            uVar4 = uVar3;
                            j10 = jD;
                            h0Var4 = h0Var2;
                            uVar5 = (o1.u) objI;
                            if (uVar5 != null) {
                                z6.a.Q(d0Var, null, 0, new c3(l1Var, null), 3);
                                if (uVar7 != k3.f15663a) {
                                    z6.a.Q(d0Var, null, 0, new d3(uVar7, l1Var, uVar5, null), 3);
                                }
                                g3 g3Var3 = new g3(this.f15604o, this.f15607r, this.f15608s, uVar4, this.f15609t, null);
                                this.f15603n = h0Var4;
                                this.f15598b = uVar4;
                                this.f15599c = uVar5;
                                this.f15602f = 5;
                                objH2 = h0Var4.h(j10, g3Var3, this);
                                uVar6 = objH2;
                                uVar7 = uVar4;
                                if (objH2 == aVar) {
                                    return aVar;
                                }
                            } else if (cVar != null) {
                                cVar.invoke(new d1.c(((o1.u) uVar4.f4952a).f12416c));
                            }
                        } else if (cVar != null) {
                            cVar.invoke(new d1.c(((o1.u) obj3).f12416c));
                        }
                        break;
                    }
                    return q8.l.f13235a;
                case 3:
                    jD = this.f15601e;
                    uVar2 = (d9.u) this.f15598b;
                    h0Var3 = (o1.h0) this.f15603n;
                    d7.t.v0(obj);
                    z6.a.Q(d0Var, null, 0, new b3(l1Var, null), 3);
                    h0Var2 = h0Var3;
                    uVar3 = uVar2;
                    obj3 = uVar3.f4952a;
                    if (obj3 != null) {
                        if (this.f15607r == null) {
                            this.f15603n = h0Var2;
                            this.f15598b = uVar3;
                            this.f15599c = null;
                            this.f15600d = null;
                            this.f15601e = jD;
                            this.f15602f = 4;
                            p0 p0Var4 = k3.f15663a;
                            objI = h0Var2.i(h0Var2.g().b(), new n2((o1.u) obj3, null), this);
                            if (objI == aVar) {
                                return aVar;
                            }
                            uVar4 = uVar3;
                            j10 = jD;
                            h0Var4 = h0Var2;
                            uVar5 = (o1.u) objI;
                            if (uVar5 != null) {
                                z6.a.Q(d0Var, null, 0, new c3(l1Var, null), 3);
                                if (uVar7 != k3.f15663a) {
                                    z6.a.Q(d0Var, null, 0, new d3(uVar7, l1Var, uVar5, null), 3);
                                }
                                g3 g3Var4 = new g3(this.f15604o, this.f15607r, this.f15608s, uVar4, this.f15609t, null);
                                this.f15603n = h0Var4;
                                this.f15598b = uVar4;
                                this.f15599c = uVar5;
                                this.f15602f = 5;
                                objH2 = h0Var4.h(j10, g3Var4, this);
                                uVar6 = objH2;
                                uVar7 = uVar4;
                                if (objH2 == aVar) {
                                    return aVar;
                                }
                            } else if (cVar != null) {
                                cVar.invoke(new d1.c(((o1.u) uVar4.f4952a).f12416c));
                            }
                        } else if (cVar != null) {
                            cVar.invoke(new d1.c(((o1.u) obj3).f12416c));
                        }
                        break;
                    }
                    return q8.l.f13235a;
                case 4:
                    long j11 = this.f15601e;
                    d9.u uVar8 = (d9.u) this.f15598b;
                    o1.h0 h0Var5 = (o1.h0) this.f15603n;
                    d7.t.v0(obj);
                    uVar4 = uVar8;
                    objI = obj;
                    h0Var4 = h0Var5;
                    j10 = j11;
                    uVar5 = (o1.u) objI;
                    if (uVar5 != null) {
                        z6.a.Q(d0Var, null, 0, new c3(l1Var, null), 3);
                        if (uVar7 != k3.f15663a) {
                            z6.a.Q(d0Var, null, 0, new d3(uVar7, l1Var, uVar5, null), 3);
                        }
                        g3 g3Var5 = new g3(this.f15604o, this.f15607r, this.f15608s, uVar4, this.f15609t, null);
                        this.f15603n = h0Var4;
                        this.f15598b = uVar4;
                        this.f15599c = uVar5;
                        this.f15602f = 5;
                        objH2 = h0Var4.h(j10, g3Var5, this);
                        uVar6 = objH2;
                        uVar7 = uVar4;
                        if (objH2 == aVar) {
                            return aVar;
                        }
                        break;
                    } else if (cVar != null) {
                        cVar.invoke(new d1.c(((o1.u) uVar4.f4952a).f12416c));
                    }
                    return q8.l.f13235a;
                case 5:
                    o1.u uVar9 = (o1.u) this.f15599c;
                    d9.u uVar10 = (d9.u) this.f15598b;
                    h0Var4 = (o1.h0) this.f15603n;
                    d7.t.v0(obj);
                    uVar6 = uVar9;
                    uVar7 = uVar10;
                    return q8.l.f13235a;
                case 6:
                    d7.t.v0(obj);
                    r10 = 0;
                    z6.a.Q(d0Var, r10, 0, new v2(l1Var, r10), 3);
                    return q8.l.f13235a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (o1.m unused3) {
            if (cVar != null) {
                cVar.invoke(new d1.c(((o1.u) uVar7.f4952a).f12416c));
            }
            if (cVar2 != null) {
                cVar2.invoke(new d1.c(uVar6.f12416c));
            }
            r10 = 0;
            this.f15603n = null;
            this.f15598b = null;
            this.f15599c = null;
            this.f15602f = 6;
            if (k3.a(h0Var4, this) == aVar) {
                return aVar;
            }
        }
    }
}
