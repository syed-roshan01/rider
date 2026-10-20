package o0;

import d7.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class i implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f12342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12343c = 0;

    public i(Object[] objArr) {
        this.f12341a = objArr;
    }

    public final void b(int i10, Object obj) {
        i(this.f12343c + 1);
        Object[] objArr = this.f12341a;
        int i11 = this.f12343c;
        if (i10 != i11) {
            b9.b.H(i10 + 1, i10, i11, objArr, objArr);
        }
        objArr[i10] = obj;
        this.f12343c++;
    }

    public final void c(Object obj) {
        i(this.f12343c + 1);
        Object[] objArr = this.f12341a;
        int i10 = this.f12343c;
        objArr[i10] = obj;
        this.f12343c = i10 + 1;
    }

    public final void d(int i10, i iVar) {
        if (iVar.k()) {
            return;
        }
        i(this.f12343c + iVar.f12343c);
        Object[] objArr = this.f12341a;
        int i11 = this.f12343c;
        if (i10 != i11) {
            b9.b.H(iVar.f12343c + i10, i10, i11, objArr, objArr);
        }
        b9.b.H(i10, 0, iVar.f12343c, iVar.f12341a, objArr);
        this.f12343c += iVar.f12343c;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        i(collection.size() + this.f12343c);
        Object[] objArr = this.f12341a;
        if (i10 != this.f12343c) {
            b9.b.H(collection.size() + i10, i10, this.f12343c, objArr, objArr);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                t.u0();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i12;
        }
        this.f12343c = collection.size() + this.f12343c;
        return true;
    }

    public final List f() {
        f fVar = this.f12342b;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.f12342b = fVar2;
        return fVar2;
    }

    public final void g() {
        Object[] objArr = this.f12341a;
        int i10 = this.f12343c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                this.f12343c = 0;
                return;
            }
            objArr[i10] = null;
        }
    }

    public final boolean h(Object obj) {
        int i10 = this.f12343c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !d7.a.d(this.f12341a[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final void i(int i10) {
        Object[] objArr = this.f12341a;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            this.f12341a = objArrCopyOf;
        }
    }

    public final int j(Object obj) {
        int i10 = this.f12343c;
        if (i10 <= 0) {
            return -1;
        }
        Object[] objArr = this.f12341a;
        int i11 = 0;
        while (!d7.a.d(obj, objArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean k() {
        return this.f12343c == 0;
    }

    public final boolean l() {
        return this.f12343c != 0;
    }

    public final boolean m(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        n(iJ);
        return true;
    }

    public final Object n(int i10) {
        Object[] objArr = this.f12341a;
        Object obj = objArr[i10];
        int i11 = this.f12343c;
        if (i10 != i11 - 1) {
            b9.b.H(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f12343c - 1;
        this.f12343c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void o(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f12343c;
            if (i11 < i12) {
                Object[] objArr = this.f12341a;
                b9.b.H(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f12343c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f12341a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f12343c = i14;
        }
    }

    public final Object p(int i10, Object obj) {
        Object[] objArr = this.f12341a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
