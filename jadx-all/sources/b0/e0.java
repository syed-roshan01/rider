package b0;

import v.r1;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f2361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.f f2363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2364f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t.n f2365n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, int i10, a0.f fVar, int i11, t.n nVar, u8.e eVar) {
        super(2, eVar);
        this.f2361c = h0Var;
        this.f2362d = i10;
        this.f2363e = fVar;
        this.f2364f = i11;
        this.f2365n = nVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        e0 e0Var = new e0(this.f2361c, this.f2362d, this.f2363e, this.f2364f, this.f2365n, eVar);
        e0Var.f2360b = obj;
        return e0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((r1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r5 = r6;
     */
    @Override // w8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
