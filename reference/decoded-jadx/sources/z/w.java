package z;

import java.util.List;
import java.util.Map;
import r1.k0;

/* JADX INFO: loaded from: classes.dex */
public final class w implements u, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f17150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f17156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f17160k;

    public w(x xVar, int i10, boolean z10, float f10, k0 k0Var, float f11, boolean z11, List list, int i11, int i12, int i13, int i14) {
        this.f17150a = xVar;
        this.f17151b = i10;
        this.f17152c = z10;
        this.f17153d = f10;
        this.f17154e = f11;
        this.f17155f = z11;
        this.f17156g = list;
        this.f17157h = i11;
        this.f17158i = i12;
        this.f17159j = i13;
        this.f17160k = k0Var;
    }

    @Override // r1.k0
    public final int a() {
        return this.f17160k.a();
    }

    @Override // r1.k0
    public final int b() {
        return this.f17160k.b();
    }

    public final boolean c(int i10, boolean z10) {
        x xVar;
        int i11;
        if (this.f17155f) {
            return false;
        }
        List list = this.f17156g;
        if (list.isEmpty() || (xVar = this.f17150a) == null || (i11 = this.f17151b - i10) < 0 || i11 >= xVar.f17175o) {
            return false;
        }
        x xVar2 = (x) r8.p.F0(list);
        x xVar3 = (x) r8.p.L0(list);
        if (xVar2.f17177q || xVar3.f17177q) {
            return false;
        }
        int i12 = this.f17158i;
        int i13 = this.f17157h;
        if (i10 < 0) {
            if (Math.min((xVar2.f17173m + xVar2.f17175o) - i13, (xVar3.f17173m + xVar3.f17175o) - i12) <= (-i10)) {
                return false;
            }
        } else if (Math.min(i13 - xVar2.f17173m, i12 - xVar3.f17173m) <= i10) {
            return false;
        }
        this.f17151b -= i10;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            x xVar4 = (x) list.get(i14);
            if (!xVar4.f17177q) {
                xVar4.f17173m += i10;
                int[] iArr = xVar4.f17179s;
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    boolean z11 = xVar4.f17163c;
                    if ((z11 && i15 % 2 == 1) || (!z11 && i15 % 2 == 0)) {
                        iArr[i15] = iArr[i15] + i10;
                    }
                }
                if (z10) {
                    int size2 = xVar4.f17162b.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                    }
                }
            }
        }
        this.f17153d = i10;
        if (!this.f17152c && i10 > 0) {
            this.f17152c = true;
        }
        return true;
    }

    @Override // r1.k0
    public final Map d() {
        return this.f17160k.d();
    }

    @Override // r1.k0
    public final void e() {
        this.f17160k.e();
    }
}
