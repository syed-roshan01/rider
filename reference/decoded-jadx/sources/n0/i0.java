package n0;

import java.util.Arrays;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12076b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12078d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12082h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0[] f12075a = new g0[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f12077c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f12079e = new Object[16];

    public static final int a(i0 i0Var, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    public final void b() {
        this.f12076b = 0;
        this.f12078d = 0;
        b9.b.O(0, this.f12080f, this.f12079e);
        this.f12080f = 0;
    }

    public final void c(m0.d dVar, q2 q2Var, m0.w wVar) {
        i0 i0Var;
        int i10;
        if (e()) {
            h0 h0Var = new h0(this);
            do {
                i0Var = h0Var.f12073d;
                g0 g0Var = i0Var.f12075a[h0Var.f12070a];
                d7.a.j(g0Var);
                g0Var.a(h0Var, dVar, q2Var, wVar);
                int i11 = h0Var.f12070a;
                if (i11 >= i0Var.f12076b) {
                    break;
                }
                g0 g0Var2 = i0Var.f12075a[i11];
                d7.a.j(g0Var2);
                h0Var.f12071b += g0Var2.f12067a;
                h0Var.f12072c += g0Var2.f12068b;
                i10 = h0Var.f12070a + 1;
                h0Var.f12070a = i10;
            } while (i10 < i0Var.f12076b);
        }
        b();
    }

    public final boolean d() {
        return this.f12076b == 0;
    }

    public final boolean e() {
        return this.f12076b != 0;
    }

    public final g0 f() {
        g0 g0Var = this.f12075a[this.f12076b - 1];
        d7.a.j(g0Var);
        return g0Var;
    }

    public final void g(g0 g0Var) {
        int i10 = g0Var.f12067a;
        int i11 = g0Var.f12068b;
        if (i10 == 0 && i11 == 0) {
            h(g0Var);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + g0Var + " without arguments because it expects " + i10 + " ints and " + i11 + " objects.").toString());
    }

    public final void h(g0 g0Var) {
        this.f12081g = 0;
        this.f12082h = 0;
        int i10 = this.f12076b;
        g0[] g0VarArr = this.f12075a;
        if (i10 == g0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(g0VarArr, i10 + (i10 > 1024 ? 1024 : i10));
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            this.f12075a = (g0[]) objArrCopyOf;
        }
        int i11 = this.f12078d;
        int i12 = g0Var.f12067a;
        int i13 = i11 + i12;
        int[] iArr = this.f12077c;
        int length = iArr.length;
        if (i13 > length) {
            int i14 = length + (length > 1024 ? 1024 : length);
            if (i14 >= i13) {
                i13 = i14;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f12077c = iArrCopyOf;
        }
        int i15 = this.f12080f;
        int i16 = g0Var.f12068b;
        int i17 = i15 + i16;
        Object[] objArr = this.f12079e;
        int length2 = objArr.length;
        if (i17 > length2) {
            int i18 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i18 >= i17) {
                i17 = i18;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i17);
            d7.a.l(objArrCopyOf2, "copyOf(this, newSize)");
            this.f12079e = objArrCopyOf2;
        }
        g0[] g0VarArr2 = this.f12075a;
        int i19 = this.f12076b;
        this.f12076b = i19 + 1;
        g0VarArr2[i19] = g0Var;
        this.f12078d += i12;
        this.f12080f += i16;
    }

    public final String toString() {
        return super.toString();
    }
}
