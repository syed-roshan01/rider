package o1;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f12443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.f f12445c = new k.f(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t1.v f12446d = new t1.v();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12447e;

    public y(androidx.compose.ui.node.a aVar) {
        this.f12443a = aVar;
        this.f12444b = new e(aVar.C.f14576b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(w wVar, b0 b0Var, boolean z10) {
        int i10;
        Object[] objArr;
        e eVar;
        int i11;
        t1.v vVar = this.f12446d;
        if (this.f12447e) {
            return 0;
        }
        try {
            this.f12447e = true;
            f fVarE = this.f12445c.E(wVar, b0Var);
            q.l lVar = fVarE.f12360a;
            int iG = lVar.g();
            while (true) {
                if (i10 >= iG) {
                    objArr = true;
                    break;
                }
                u uVar = (u) lVar.h(i10);
                i10 = (uVar.f12417d || uVar.f12421h) ? 0 : i10 + 1;
                objArr = false;
                break;
            }
            int iG2 = lVar.g();
            int i12 = 0;
            while (true) {
                eVar = this.f12444b;
                if (i12 >= iG2) {
                    break;
                }
                u uVar2 = (u) lVar.h(i12);
                if (objArr != false || m9.e0.r(uVar2)) {
                    this.f12443a.u(uVar2.f12416c, this.f12446d, s.u(uVar2.f12422i, 1), true);
                    if (!vVar.isEmpty()) {
                        eVar.a(uVar2.f12414a, vVar);
                        vVar.clear();
                    }
                }
                i12++;
            }
            eVar.f12355b.c();
            boolean zB = eVar.b(fVarE, z10);
            int iG3 = lVar.g();
            for (int i13 = 0; i13 < iG3; i13++) {
                u uVar3 = (u) lVar.h(i13);
                if ((!d1.c.b(m9.e0.I(uVar3, true), d1.c.f4326b)) && uVar3.b()) {
                    i11 = 2;
                    return (zB ? 1 : 0) | i11;
                }
            }
            i11 = 0;
            return (zB ? 1 : 0) | i11;
        } finally {
            this.f12447e = false;
        }
    }

    public final void b() {
        if (this.f12447e) {
            return;
        }
        ((q.l) this.f12445c.f8599b).a();
        j jVar = this.f12444b.f12355b;
        o0.i iVar = jVar.f12390a;
        int i10 = iVar.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVar.f12341a;
            int i11 = 0;
            do {
                ((i) objArr[i11]).d();
                i11++;
            } while (i11 < i10);
        }
        jVar.f12390a.g();
    }
}
