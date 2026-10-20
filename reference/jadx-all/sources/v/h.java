package v;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d9.u f15574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9.u f15577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f15578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d9.u uVar, j jVar, u8.e eVar) {
        super(2, eVar);
        this.f15577d = uVar;
        this.f15578e = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h hVar = new h(this.f15577d, this.f15578e, eVar);
        hVar.f15576c = obj;
        return hVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((u0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0091 -> B:31:0x0095). Please report as a decompilation issue!!! */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u0 u0Var;
        h hVar;
        u0 u0Var2;
        d9.u uVar;
        Object objI;
        h hVar2;
        v8.a aVar;
        boolean z10;
        q8.l lVar;
        v8.a aVar2 = v8.a.f15963a;
        int i10 = this.f15575b;
        if (i10 == 0) {
            d7.t.v0(obj);
            u0Var = (u0) this.f15576c;
            hVar = this;
            Object obj2 = hVar.f15577d.f4952a;
            z10 = obj2 instanceof c0;
            lVar = q8.l.f13235a;
            if (!z10 || (obj2 instanceof z)) {
                return lVar;
            }
            if ((obj2 instanceof a0 ? (a0) obj2 : null) != null) {
                d7.a.k(obj2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta");
                hVar.f15576c = u0Var;
                hVar.f15574a = null;
                hVar.f15575b = 1;
                ((w0) hVar.f15578e).getClass();
                w0 w0Var = u0Var.f15794a;
                k0 k0Var = w0Var.M;
                h1 h1Var = w0Var.L;
                h1 h1Var2 = h1.f15593a;
                long j10 = ((a0) obj2).f15467b;
                k0Var.a(h1Var == h1Var2 ? d1.c.e(j10) : d1.c.d(j10));
                if (lVar == aVar2) {
                    return aVar2;
                }
            }
            u0Var2 = u0Var;
            o9.c cVar = hVar.f15578e.I;
            hVar.f15576c = u0Var2;
            uVar = hVar.f15577d;
            hVar.f15574a = uVar;
            hVar.f15575b = 2;
            objI = cVar.i(hVar);
            if (objI == aVar2) {
                return aVar2;
            }
            v8.a aVar3 = aVar2;
            hVar2 = hVar;
            obj = objI;
            aVar = aVar3;
        } else if (i10 == 1) {
            u0Var = (u0) this.f15576c;
            d7.t.v0(obj);
            hVar = this;
            u0Var2 = u0Var;
            o9.c cVar2 = hVar.f15578e.I;
            hVar.f15576c = u0Var2;
            uVar = hVar.f15577d;
            hVar.f15574a = uVar;
            hVar.f15575b = 2;
            objI = cVar2.i(hVar);
            if (objI == aVar2) {
                return aVar2;
            }
            v8.a aVar4 = aVar2;
            hVar2 = hVar;
            obj = objI;
            aVar = aVar4;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d9.u uVar2 = this.f15574a;
            u0Var2 = (u0) this.f15576c;
            d7.t.v0(obj);
            uVar = uVar2;
            aVar = aVar2;
            hVar2 = this;
        }
        uVar.f4952a = obj;
        hVar = hVar2;
        aVar2 = aVar;
        u0Var = u0Var2;
        Object obj3 = hVar.f15577d.f4952a;
        z10 = obj3 instanceof c0;
        lVar = q8.l.f13235a;
        if (z10) {
        }
        return lVar;
    }
}
