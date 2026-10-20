package b0;

import r1.a1;
import v.p1;
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
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        v8.a aVar = v8.a.f15963a;
        int i11 = this.f2359a;
        if (i11 == 0) {
            d7.t.v0(obj);
            r1 r1Var = (r1) this.f2360b;
            h0 h0Var = this.f2361c;
            int i12 = this.f2362d;
            h0Var.f2411s.f(h0Var.i(i12));
            s sVar = (s) this.f2363e;
            h0 h0Var2 = sVar.f2464a;
            boolean z10 = i12 > h0Var2.f2398f;
            int i13 = ((g) ((h) r8.p.L0(((x) h0Var2.j()).f2493a))).f2375a;
            h0 h0Var3 = sVar.f2464a;
            int i14 = (i13 - h0Var3.f2398f) + 1;
            if (((z10 && i12 > ((g) ((h) r8.p.L0(((x) h0Var3.j()).f2493a))).f2375a) || (!z10 && i12 < sVar.f2464a.f2398f)) && Math.abs(i12 - sVar.f2464a.f2398f) >= 3) {
                if (z10) {
                }
                h0 h0Var4 = sVar.f2464a;
                float fM = 0 / h0Var4.m();
                a0 a0Var = h0Var4.f2397e;
                a0Var.f2318b.f(i10);
                a0Var.f2322f.b(i10);
                if (Math.abs(fM) == 0.0f) {
                    fM = 0.0f;
                }
                a0Var.f2319c.f(fM);
                a0Var.f2321e = null;
                a1 a1Var = (a1) h0Var4.f2416x.getValue();
                if (a1Var != null) {
                    ((androidx.compose.ui.node.a) a1Var).j();
                }
            }
            h0 h0Var5 = sVar.f2464a;
            int iN = h0Var5.n() + h0Var5.l();
            a0 a0Var2 = h0Var.f2397e;
            float fD = (((i12 * iN) - (a0Var2.f2318b.d() * iN)) + this.f2364f) - (a0Var2.f2319c.d() * iN);
            p1 p1Var = new p1(new d9.r(), r1Var, 1);
            this.f2359a = 1;
            if (t.e.d(fD, this.f2365n, p1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
