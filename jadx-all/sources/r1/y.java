package r1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y implements i1, l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f13428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f13429b;

    public y(f0 f0Var) {
        this.f13429b = f0Var;
        this.f13428a = f0Var.f13366o;
    }

    @Override // m2.b
    public final int E(long j10) {
        return this.f13428a.E(j10);
    }

    @Override // m2.b
    public final float F(long j10) {
        return this.f13428a.F(j10);
    }

    @Override // r1.i1
    public final List H(Object obj, c9.e eVar) {
        f0 f0Var = this.f13429b;
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) f0Var.f13365n.get(obj);
        List listL = aVar != null ? aVar.l() : null;
        if (listL != null) {
            return listL;
        }
        o0.i iVar = f0Var.f13371t;
        int i10 = iVar.f12343c;
        int i11 = f0Var.f13363e;
        if (i10 < i11) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
        }
        if (i10 == i11) {
            iVar.c(obj);
        } else {
            iVar.p(i11, obj);
        }
        f0Var.f13363e++;
        HashMap map = f0Var.f13368q;
        if (!map.containsKey(obj)) {
            f0Var.f13370s.put(obj, f0Var.g(obj, eVar));
            androidx.compose.ui.node.a aVar2 = f0Var.f13359a;
            if (aVar2.D.f14496c == 3) {
                aVar2.N(true);
            } else {
                androidx.compose.ui.node.a.O(aVar2, true, 2);
            }
        }
        androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) map.get(obj);
        if (aVar3 == null) {
            return r8.r.f13661a;
        }
        List listJ0 = aVar3.D.f14508o.j0();
        o0.f fVar = (o0.f) listJ0;
        int i12 = fVar.f12335a.f12343c;
        for (int i13 = 0; i13 < i12; i13++) {
            ((t1.l0) fVar.get(i13)).L.f14495b = true;
        }
        return listJ0;
    }

    @Override // m2.b
    public final int J(float f10) {
        return this.f13428a.J(f10);
    }

    @Override // r1.l0
    public final k0 N(int i10, int i11, Map map, c9.c cVar) {
        return this.f13428a.N(i10, i11, map, cVar);
    }

    @Override // m2.b
    public final long S(long j10) {
        return this.f13428a.S(j10);
    }

    @Override // m2.b
    public final float Z(long j10) {
        return this.f13428a.Z(j10);
    }

    @Override // m2.b
    public final float c() {
        return this.f13428a.f13339b;
    }

    @Override // m2.b
    public final long e0(float f10) {
        return this.f13428a.e0(f10);
    }

    @Override // r1.q
    public final m2.l getLayoutDirection() {
        return this.f13428a.f13338a;
    }

    @Override // m2.b
    public final float m() {
        return this.f13428a.f13340c;
    }

    @Override // m2.b
    public final float o0(int i10) {
        return this.f13428a.o0(i10);
    }

    @Override // r1.q
    public final boolean q() {
        return this.f13428a.q();
    }

    @Override // m2.b
    public final float q0(float f10) {
        return f10 / this.f13428a.c();
    }

    @Override // m2.b
    public final long t(float f10) {
        return this.f13428a.t(f10);
    }

    @Override // m2.b
    public final long u(long j10) {
        return this.f13428a.u(j10);
    }

    @Override // m2.b
    public final float v(float f10) {
        return this.f13428a.c() * f10;
    }
}
