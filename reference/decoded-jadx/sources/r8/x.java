package r8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class x extends d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f13669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13672d;

    public x(Object[] objArr, int i10) {
        this.f13669a = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("ring buffer filled size should not be negative but it is ", i10).toString());
        }
        if (i10 <= objArr.length) {
            this.f13670b = objArr.length;
            this.f13672d = i10;
        } else {
            StringBuilder sbQ = a7.a.q("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
            sbQ.append(objArr.length);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
    }

    @Override // r8.a
    public final int e() {
        return this.f13672d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int iE = e();
        if (i10 < 0 || i10 >= iE) {
            throw new IndexOutOfBoundsException(l.q.i("index: ", i10, ", size: ", iE));
        }
        return this.f13669a[(this.f13671c + i10) % this.f13670b];
    }

    public final void i(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("n shouldn't be negative but it is ", i10).toString());
        }
        if (i10 > this.f13672d) {
            StringBuilder sbQ = a7.a.q("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            sbQ.append(this.f13672d);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        if (i10 > 0) {
            int i11 = this.f13671c;
            int i12 = this.f13670b;
            int i13 = (i11 + i10) % i12;
            Object[] objArr = this.f13669a;
            if (i11 > i13) {
                b9.b.O(i11, i12, objArr);
                b9.b.O(0, i13, objArr);
            } else {
                b9.b.O(i11, i13, objArr);
            }
            this.f13671c = i13;
            this.f13672d -= i10;
        }
    }

    @Override // r8.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new w(this);
    }

    @Override // r8.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    @Override // r8.a, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        d7.a.m(objArr, "array");
        int length = objArr.length;
        int i10 = this.f13672d;
        if (length < i10) {
            objArr = Arrays.copyOf(objArr, i10);
            d7.a.l(objArr, "copyOf(...)");
        }
        int i11 = this.f13672d;
        int i12 = this.f13671c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr2 = this.f13669a;
            if (i14 >= i11 || i12 >= this.f13670b) {
                break;
            }
            objArr[i14] = objArr2[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            objArr[i14] = objArr2[i13];
            i14++;
            i13++;
        }
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }
}
