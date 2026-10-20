package o1;

import java.util.ArrayList;
import java.util.List;
import m9.x1;
import t.y0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends y0.n implements d0, z, m2.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c9.e f12391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x1 f12392v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f12396z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f12393w = c0.f12350a;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0.i f12394x = new o0.i(new h0[16]);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0.i f12395y = new o0.i(new h0[16]);
    public long A = 0;

    public j0(c9.e eVar) {
        this.f12391u = eVar;
    }

    @Override // y0.n
    public final void A0() {
        I0();
    }

    public final Object G0(c9.e eVar, u8.e eVar2) {
        m9.l lVar = new m9.l(1, d7.t.b0(eVar2));
        lVar.t();
        h0 h0Var = new h0(this, lVar);
        synchronized (this.f12394x) {
            this.f12394x.c(h0Var);
            new u8.l(v8.a.f15963a, d7.t.b0(d7.t.M(h0Var, h0Var, eVar))).resumeWith(q8.l.f13235a);
        }
        lVar.v(new h1.b(h0Var, 2));
        return lVar.s();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003c A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    public final void H0(k kVar, l lVar) {
        o0.i iVar;
        int i10;
        Object[] objArr;
        int i11;
        h0 h0Var;
        m9.k kVar2;
        m9.k kVar3;
        synchronized (this.f12394x) {
            o0.i iVar2 = this.f12395y;
            iVar2.d(iVar2.f12343c, this.f12394x);
        }
        try {
            int iOrdinal = lVar.ordinal();
            if (iOrdinal == 0) {
                iVar = this.f12395y;
                i10 = iVar.f12343c;
                if (i10 > 0) {
                    objArr = iVar.f12341a;
                    i11 = 0;
                    do {
                        h0Var = (h0) objArr[i11];
                        if (lVar == h0Var.f12378d && (kVar2 = h0Var.f12377c) != null) {
                            h0Var.f12377c = null;
                            kVar2.resumeWith(kVar);
                        }
                        i11++;
                    } while (i11 < i10);
                }
            } else if (iOrdinal == 1) {
                o0.i iVar3 = this.f12395y;
                int i12 = iVar3.f12343c;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    Object[] objArr2 = iVar3.f12341a;
                    do {
                        h0 h0Var2 = (h0) objArr2[i13];
                        if (lVar == h0Var2.f12378d && (kVar3 = h0Var2.f12377c) != null) {
                            h0Var2.f12377c = null;
                            kVar3.resumeWith(kVar);
                        }
                        i13--;
                    } while (i13 >= 0);
                }
            } else if (iOrdinal == 2) {
                iVar = this.f12395y;
                i10 = iVar.f12343c;
                if (i10 > 0) {
                    objArr = iVar.f12341a;
                    i11 = 0;
                    do {
                        h0Var = (h0) objArr[i11];
                        if (lVar == h0Var.f12378d) {
                            h0Var.f12377c = null;
                            kVar2.resumeWith(kVar);
                        }
                        i11++;
                    } while (i11 < i10);
                }
            }
        } finally {
            this.f12395y.g();
        }
    }

    public final void I0() {
        x1 x1Var = this.f12392v;
        if (x1Var != null) {
            x1Var.a(new y0(4));
            this.f12392v = null;
        }
    }

    @Override // t1.p1
    public final void X() {
        I0();
    }

    @Override // t1.p1
    public final void b0() {
        k kVar = this.f12396z;
        if (kVar == null) {
            return;
        }
        List list = kVar.f12397a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(!((u) list.get(i10)).f12417d)) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    u uVar = (u) list.get(i11);
                    long j10 = uVar.f12414a;
                    long j11 = uVar.f12416c;
                    long j12 = uVar.f12415b;
                    float f10 = uVar.f12418e;
                    boolean z10 = uVar.f12417d;
                    arrayList.add(new u(j10, j12, j11, false, f10, j12, j11, z10, z10, 1, d1.c.f4326b));
                }
                k kVar2 = new k(arrayList, null);
                this.f12393w = kVar2;
                H0(kVar2, l.f12400a);
                H0(kVar2, l.f12401b);
                H0(kVar2, l.f12402c);
                this.f12396z = null;
                return;
            }
        }
    }

    @Override // m2.b
    public final float c() {
        return t1.g.y(this).f1752x.c();
    }

    @Override // t1.p1
    public final void k() {
        I0();
    }

    @Override // m2.b
    public final float m() {
        return t1.g.y(this).f1752x.m();
    }

    @Override // t1.p1
    public final void y(k kVar, l lVar, long j10) {
        this.A = j10;
        if (lVar == l.f12400a) {
            this.f12393w = kVar;
        }
        if (this.f12392v == null) {
            this.f12392v = z6.a.Q(v0(), null, 4, new i0(this, null), 1);
        }
        H0(kVar, lVar);
        List list = kVar.f12397a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!m9.e0.t((u) list.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (!(!z10)) {
            kVar = null;
        }
        this.f12396z = kVar;
    }
}
