package q9;

/* JADX INFO: loaded from: classes.dex */
public final class u extends w8.c implements p9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9.g f13285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8.j f13286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u8.j f13288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u8.e f13289e;

    public u(p9.g gVar, u8.j jVar) {
        super(r.f13282a, u8.k.f15438a);
        this.f13285a = gVar;
        this.f13286b = jVar;
        this.f13287c = ((Number) jVar.e(0, t.f13284a)).intValue();
    }

    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        try {
            Object objH = h(eVar, obj);
            return objH == v8.a.f15963a ? objH : q8.l.f13235a;
        } catch (Throwable th) {
            this.f13288d = new p(eVar.getContext(), th);
            throw th;
        }
    }

    @Override // w8.a, w8.d
    public final w8.d getCallerFrame() {
        u8.e eVar = this.f13289e;
        if (eVar instanceof w8.d) {
            return (w8.d) eVar;
        }
        return null;
    }

    @Override // w8.c, u8.e
    public final u8.j getContext() {
        u8.j jVar = this.f13288d;
        return jVar == null ? u8.k.f15438a : jVar;
    }

    @Override // w8.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object h(u8.e eVar, Object obj) {
        u8.j context = eVar.getContext();
        h6.g.S(context);
        u8.j jVar = this.f13288d;
        if (jVar != context) {
            if (jVar instanceof p) {
                throw new IllegalStateException(z6.a.q0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) jVar).f13280a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.e(0, new s.i(this, 13))).intValue() != this.f13287c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f13286b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f13288d = context;
        }
        this.f13289e = eVar;
        c9.f fVar = w.f13291a;
        p9.g gVar = this.f13285a;
        d7.a.k(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objE = fVar.e(gVar, obj, this);
        if (!d7.a.d(objE, v8.a.f15963a)) {
            this.f13289e = null;
        }
        return objE;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = q8.h.a(obj);
        if (thA != null) {
            this.f13288d = new p(getContext(), thA);
        }
        u8.e eVar = this.f13289e;
        if (eVar != null) {
            eVar.resumeWith(obj);
        }
        return v8.a.f15963a;
    }

    @Override // w8.c, w8.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
