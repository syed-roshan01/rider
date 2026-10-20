package o1;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.i f12390a = new o0.i(new i[16]);

    public boolean a(q.l lVar, r1.s sVar, f fVar, boolean z10) {
        o0.i iVar = this.f12390a;
        int i10 = iVar.f12343c;
        if (i10 <= 0) {
            return false;
        }
        Object[] objArr = iVar.f12341a;
        int i11 = 0;
        boolean z11 = false;
        do {
            z11 = ((i) objArr[i11]).a(lVar, sVar, fVar, z10) || z11;
            i11++;
        } while (i11 < i10);
        return z11;
    }

    public void b(f fVar) {
        o0.i iVar = this.f12390a;
        int i10 = iVar.f12343c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (((i) iVar.f12341a[i10]).f12381c.f12743a == 0) {
                iVar.n(i10);
            }
        }
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            o0.i iVar = this.f12390a;
            if (i10 >= iVar.f12343c) {
                return;
            }
            i iVar2 = (i) iVar.f12341a[i10];
            if (iVar2.f12380b.f16742t) {
                i10++;
                iVar2.c();
            } else {
                iVar.n(i10);
                iVar2.d();
            }
        }
    }
}
