package o1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.s f12354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12355b = new j();

    public e(t1.x xVar) {
        this.f12354a = xVar;
    }

    public final void a(long j10, t1.v vVar) {
        Object obj;
        j jVar = this.f12355b;
        int i10 = vVar.f14564d;
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            y0.n nVar = (y0.n) vVar.get(i11);
            if (z10) {
                o0.i iVar = jVar.f12390a;
                int i12 = iVar.f12343c;
                if (i12 <= 0) {
                    obj = null;
                    break;
                }
                Object[] objArr = iVar.f12341a;
                int i13 = 0;
                while (true) {
                    obj = objArr[i13];
                    if (d7.a.d(((i) obj).f12380b, nVar)) {
                        break;
                    }
                    i13++;
                    if (i13 >= i12) {
                        obj = null;
                        break;
                    }
                }
                i iVar2 = (i) obj;
                if (iVar2 != null) {
                    iVar2.f12386h = true;
                    iVar2.f12381c.a(j10);
                    jVar = iVar2;
                } else {
                    z10 = false;
                    i iVar3 = new i(nVar);
                    iVar3.f12381c.a(j10);
                    jVar.f12390a.c(iVar3);
                    jVar = iVar3;
                }
            } else {
                i iVar4 = new i(nVar);
                iVar4.f12381c.a(j10);
                jVar.f12390a.c(iVar4);
                jVar = iVar4;
            }
        }
    }

    public final boolean b(f fVar, boolean z10) {
        boolean z11;
        boolean z12;
        j jVar = this.f12355b;
        if (!jVar.a(fVar.f12360a, this.f12354a, fVar, z10)) {
            return false;
        }
        o0.i iVar = jVar.f12390a;
        int i10 = iVar.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVar.f12341a;
            int i11 = 0;
            z11 = false;
            do {
                z11 = ((i) objArr[i11]).f(fVar, z10) || z11;
                i11++;
            } while (i11 < i10);
        } else {
            z11 = false;
        }
        int i12 = iVar.f12343c;
        if (i12 > 0) {
            Object[] objArr2 = iVar.f12341a;
            int i13 = 0;
            z12 = false;
            do {
                z12 = ((i) objArr2[i13]).e(fVar) || z12;
                i13++;
            } while (i13 < i12);
        } else {
            z12 = false;
        }
        jVar.b(fVar);
        return z12 || z11;
    }
}
