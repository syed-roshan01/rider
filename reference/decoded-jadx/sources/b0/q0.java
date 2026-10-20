package b0;

import v.h2;
import v.y0;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.h f2461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f2462b;

    public q0(w.h hVar, h0 h0Var) {
        this.f2461a = hVar;
        this.f2462b = h0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v.y0
    public final Object a(h2 h2Var, float f10, u8.e eVar) throws Throwable {
        p0 p0Var;
        if (eVar instanceof p0) {
            p0Var = (p0) eVar;
            int i10 = p0Var.f2460c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p0Var.f2460c = i10 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, eVar);
            }
        } else {
            p0Var = new p0(this, eVar);
        }
        Object objD = p0Var.f2458a;
        v8.a aVar = v8.a.f15963a;
        int i11 = p0Var.f2460c;
        if (i11 == 0) {
            d7.t.v0(objD);
            q.w wVar = new q.w(this, 18);
            p0Var.f2460c = 1;
            objD = this.f2461a.d(h2Var, f10, wVar, p0Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(objD);
        }
        return new Float(((Number) objD).floatValue());
    }
}
