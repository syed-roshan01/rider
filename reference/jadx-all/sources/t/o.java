package t;

import m0.l3;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class o implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f14263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.n1 f14264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f14265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14268f;

    public /* synthetic */ o(x1 x1Var, Object obj, t tVar, int i10) {
        this(x1Var, obj, (i10 & 4) != 0 ? null : tVar, (i10 & 8) != 0 ? Long.MIN_VALUE : 0L, (i10 & 16) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    public final Object b() {
        return this.f14263a.f14352b.invoke(this.f14265c);
    }

    @Override // m0.l3
    public final Object getValue() {
        return this.f14264b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f14264b.getValue() + ", velocity=" + b() + ", isRunning=" + this.f14268f + ", lastFrameTimeNanos=" + this.f14266d + ", finishedTimeNanos=" + this.f14267e + ')';
    }

    public o(x1 x1Var, Object obj, t tVar, long j10, long j11, boolean z10) {
        t tVarJ;
        this.f14263a = x1Var;
        this.f14264b = d7.t.g0(obj, o3.f11621a);
        if (tVar != null) {
            tVarJ = e.j(tVar);
        } else {
            tVarJ = (t) x1Var.f14351a.invoke(obj);
            tVarJ.d();
        }
        this.f14265c = tVarJ;
        this.f14266d = j10;
        this.f14267e = j11;
        this.f14268f = z10;
    }
}
