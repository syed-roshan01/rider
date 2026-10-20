package q;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f12999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f13000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f13001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f13002d;

    public l() {
        this((Object) null);
    }

    public final void a() {
        int i10 = this.f13002d;
        Object[] objArr = this.f13001c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f13002d = 0;
        this.f12999a = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        d7.a.k(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        l lVar = (l) objClone;
        lVar.f13000b = (long[]) this.f13000b.clone();
        lVar.f13001c = (Object[]) this.f13001c.clone();
        return lVar;
    }

    public final Object c(long j10) {
        Object obj;
        int iB = r.a.b(this.f13000b, this.f13002d, j10);
        if (iB < 0 || (obj = this.f13001c[iB]) == m.f13003a) {
            return null;
        }
        return obj;
    }

    public final int d(long j10) {
        if (this.f12999a) {
            int i10 = this.f13002d;
            long[] jArr = this.f13000b;
            Object[] objArr = this.f13001c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != m.f13003a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12999a = false;
            this.f13002d = i11;
        }
        return r.a.b(this.f13000b, this.f13002d, j10);
    }

    public final long e(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13002d)) {
            throw new IllegalArgumentException(l.q.g("Expected index to be within 0..size()-1, but was ", i10).toString());
        }
        if (this.f12999a) {
            long[] jArr = this.f13000b;
            Object[] objArr = this.f13001c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != m.f13003a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f12999a = false;
            this.f13002d = i12;
        }
        return this.f13000b[i10];
    }

    public final void f(Object obj, long j10) {
        int iB = r.a.b(this.f13000b, this.f13002d, j10);
        if (iB >= 0) {
            this.f13001c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f13002d;
        if (i10 < i11) {
            Object[] objArr = this.f13001c;
            if (objArr[i10] == m.f13003a) {
                this.f13000b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f12999a) {
            long[] jArr = this.f13000b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f13001c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr2[i13];
                    if (obj2 != m.f13003a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj2;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f12999a = false;
                this.f13002d = i12;
                i10 = ~r.a.b(this.f13000b, i12, j10);
            }
        }
        int i14 = this.f13002d;
        if (i14 >= this.f13000b.length) {
            int i15 = (i14 + 1) * 8;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f13000b, i18);
            d7.a.l(jArrCopyOf, "copyOf(this, newSize)");
            this.f13000b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13001c, i18);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            this.f13001c = objArrCopyOf;
        }
        int i19 = this.f13002d - i10;
        if (i19 != 0) {
            long[] jArr2 = this.f13000b;
            int i20 = i10 + 1;
            d7.a.m(jArr2, "<this>");
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.f13001c;
            b9.b.H(i20, i10, this.f13002d, objArr3, objArr3);
        }
        this.f13000b[i10] = j10;
        this.f13001c[i10] = obj;
        this.f13002d++;
    }

    public final int g() {
        if (this.f12999a) {
            int i10 = this.f13002d;
            long[] jArr = this.f13000b;
            Object[] objArr = this.f13001c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != m.f13003a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12999a = false;
            this.f13002d = i11;
        }
        return this.f13002d;
    }

    public final Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13002d)) {
            throw new IllegalArgumentException(l.q.g("Expected index to be within 0..size()-1, but was ", i10).toString());
        }
        if (this.f12999a) {
            long[] jArr = this.f13000b;
            Object[] objArr = this.f13001c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != m.f13003a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f12999a = false;
            this.f13002d = i12;
        }
        return this.f13001c[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f13002d * 28);
        sb.append('{');
        int i10 = this.f13002d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(e(i11));
            sb.append('=');
            Object objH = h(i11);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        d7.a.l(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public l(int i10) {
        if (i10 == 0) {
            this.f13000b = r.a.f13296b;
            this.f13001c = r.a.f13297c;
            return;
        }
        int i11 = i10 * 8;
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
        }
        int i14 = i11 / 8;
        this.f13000b = new long[i14];
        this.f13001c = new Object[i14];
    }

    public /* synthetic */ l(Object obj) {
        this(10);
    }
}
