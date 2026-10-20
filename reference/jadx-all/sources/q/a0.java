package q;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f12975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f12976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f12977c;

    public a0() {
        this(0);
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f12977c;
        if (i11 != 0 && i10 <= this.f12975a[i11 - 1]) {
            d(i10, obj);
            return;
        }
        if (i11 >= this.f12975a.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f12975a, i15);
            d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f12975a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12976b, i15);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            this.f12976b = objArrCopyOf;
        }
        this.f12975a[i11] = i10;
        this.f12976b[i11] = obj;
        this.f12977c = i11 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        d7.a.k(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        a0 a0Var = (a0) objClone;
        a0Var.f12975a = (int[]) this.f12975a.clone();
        a0Var.f12976b = (Object[]) this.f12976b.clone();
        return a0Var;
    }

    public final Object c(int i10) {
        Object obj;
        Object obj2 = b0.f12980a;
        int iA = r.a.a(this.f12977c, i10, this.f12975a);
        if (iA < 0 || (obj = this.f12976b[iA]) == b0.f12980a) {
            return null;
        }
        return obj;
    }

    public final void d(int i10, Object obj) {
        int iA = r.a.a(this.f12977c, i10, this.f12975a);
        if (iA >= 0) {
            this.f12976b[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f12977c;
        if (i11 < i12) {
            Object[] objArr = this.f12976b;
            if (objArr[i11] == b0.f12980a) {
                this.f12975a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f12975a.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f12975a, i16);
            d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f12975a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12976b, i16);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            this.f12976b = objArrCopyOf;
        }
        int i17 = this.f12977c;
        if (i17 - i11 != 0) {
            int[] iArr = this.f12975a;
            int i18 = i11 + 1;
            b9.b.G(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.f12976b;
            b9.b.H(i18, i11, this.f12977c, objArr2, objArr2);
        }
        this.f12975a[i11] = i10;
        this.f12976b[i11] = obj;
        this.f12977c++;
    }

    public final String toString() {
        int i10 = this.f12977c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        int i11 = this.f12977c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            sb.append(this.f12975a[i12]);
            sb.append('=');
            Object obj = this.f12976b[i12];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        d7.a.l(string, "buffer.toString()");
        return string;
    }

    public a0(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f12975a = new int[i14];
        this.f12976b = new Object[i14];
    }
}
