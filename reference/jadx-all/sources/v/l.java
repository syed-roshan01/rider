package v;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.i f15664a = new o0.i(new p[16]);

    public final void a(CancellationException cancellationException) {
        o0.i iVar = this.f15664a;
        int i10 = iVar.f12343c;
        m9.k[] kVarArr = new m9.k[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            kVarArr[i11] = ((p) iVar.f12341a[i11]).f15732b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            kVarArr[i12].l(cancellationException);
        }
        if (!iVar.k()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }

    public final void b() {
        o0.i iVar = this.f15664a;
        int i10 = 0;
        int i11 = new i9.g(0, iVar.f12343c - 1, 1).f8184b;
        if (i11 >= 0) {
            while (true) {
                ((p) iVar.f12341a[i10]).f15732b.resumeWith(q8.l.f13235a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        iVar.g();
    }
}
