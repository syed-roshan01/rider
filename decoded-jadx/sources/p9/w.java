package p9;

/* JADX INFO: loaded from: classes.dex */
public final class w extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f12968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f12969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f12970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h0 h0Var, f fVar, x xVar, Object obj, u8.e eVar) {
        super(2, eVar);
        this.f12968b = h0Var;
        this.f12969c = fVar;
        this.f12970d = xVar;
        this.f12971e = obj;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new w(this.f12968b, this.f12969c, this.f12970d, this.f12971e, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = v8.a.f15963a;
        int i10 = this.f12967a;
        Object obj3 = q8.l.f13235a;
        f fVar = this.f12969c;
        x xVar = this.f12970d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    d7.t.v0(obj);
                    this.f12967a = 3;
                    if (fVar.collect(xVar, this) == obj2) {
                        return obj2;
                    }
                } else if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            d7.t.v0(obj);
        } else {
            d7.t.v0(obj);
            i0 i0Var = g0.f12894a;
            h0 h0Var = this.f12968b;
            if (h0Var == i0Var) {
                this.f12967a = 1;
                if (fVar.collect(xVar, this) == obj2) {
                    return obj2;
                }
            } else if (h0Var == g0.f12895b) {
                q9.z zVarH = ((q9.b) xVar).h();
                u uVar = new u(2, null);
                this.f12967a = 2;
                if (h6.g.W(zVarH, uVar, this) == obj2) {
                    return obj2;
                }
                this.f12967a = 3;
                if (fVar.collect(xVar, this) == obj2) {
                    return obj2;
                }
            } else {
                f fVarQ = h6.g.Q(h0Var.a(((q9.b) xVar).h()));
                v vVar = new v(fVar, xVar, this.f12971e, null);
                this.f12967a = 4;
                int i11 = o.f12932a;
                n nVar = new n(vVar, null);
                u8.k kVar = u8.k.f15438a;
                o9.a aVar = o9.a.f12668a;
                Object objCollect = new q9.o(nVar, fVarQ, kVar, -2, aVar).b(kVar, 0, aVar).collect(q9.s.f13283a, this);
                if (objCollect != obj2) {
                    objCollect = obj3;
                }
                if (objCollect != obj2) {
                    objCollect = obj3;
                }
                if (objCollect == obj2) {
                    return obj2;
                }
            }
        }
        return obj3;
    }
}
