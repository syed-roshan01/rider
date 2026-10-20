package a0;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.i f848a = new o0.i(new e[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f850c;

    public final void a(int i10, o oVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("size should be >=0, but was ", i10).toString());
        }
        if (i10 == 0) {
            return;
        }
        e eVar = new e(oVar, this.f849b, i10);
        this.f849b += i10;
        this.f848a.c(eVar);
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f849b) {
            StringBuilder sbQ = a7.a.q("Index ", i10, ", size ");
            sbQ.append(this.f849b);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public final e c(int i10) {
        b(i10);
        e eVar = this.f850c;
        if (eVar != null) {
            int i11 = eVar.f783b;
            int i12 = eVar.f782a;
            if (i10 < i11 + i12 && i12 <= i10) {
                return eVar;
            }
        }
        o0.i iVar = this.f848a;
        e eVar2 = (e) iVar.f12341a[f6.a.l(i10, iVar)];
        this.f850c = eVar2;
        return eVar2;
    }
}
