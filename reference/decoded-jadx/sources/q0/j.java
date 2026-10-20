package q0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c implements p0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f13070b = new j(new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f13071a;

    public j(Object[] objArr) {
        this.f13071a = objArr;
    }

    @Override // java.util.List, p0.d
    public final p0.d add(int i10, Object obj) {
        Object[] objArr = this.f13071a;
        z6.a.k(i10, objArr.length);
        if (i10 == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            b9.b.L(objArr, objArr2, 0, i10, 6);
            b9.b.H(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = obj;
            return new j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        d7.a.l(objArrCopyOf, "copyOf(this, size)");
        b9.b.H(i10 + 1, i10, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArr.length + 1, 0, objArrCopyOf, objArr3);
    }

    @Override // q0.c, java.util.Collection, java.util.List, p0.d
    public final p0.d addAll(Collection collection) {
        Object[] objArr = this.f13071a;
        if (collection.size() + objArr.length > 32) {
            f fVarBuilder = builder();
            fVarBuilder.addAll(collection);
            return fVarBuilder.k();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new j(objArrCopyOf);
    }

    @Override // p0.d
    public final f builder() {
        return new f(this, null, this.f13071a, 0);
    }

    @Override // r8.a
    public final int e() {
        return this.f13071a.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z6.a.h(i10, e());
        return this.f13071a[i10];
    }

    @Override // p0.d
    public final p0.d h(b bVar) {
        Object[] objArr = this.f13071a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    d7.a.l(objArrCopyOf, "copyOf(this, size)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f13070b : new j(b9.b.N(0, length, objArrCopyOf));
    }

    @Override // r8.d, java.util.List
    public final int indexOf(Object obj) {
        return b9.b.T(obj, this.f13071a);
    }

    @Override // r8.d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f13071a;
        d7.a.m(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i11 = length2 - 1;
                if (d7.a.d(obj, objArr[length2])) {
                    return length2;
                }
                if (i11 < 0) {
                    return -1;
                }
                length2 = i11;
            }
        }
    }

    @Override // r8.d, java.util.List
    public final ListIterator listIterator(int i10) {
        z6.a.k(i10, e());
        return new d(this.f13071a, i10, e());
    }

    @Override // p0.d
    public final p0.d m(int i10) {
        Object[] objArr = this.f13071a;
        z6.a.h(i10, objArr.length);
        if (objArr.length == 1) {
            return f13070b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
        b9.b.H(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new j(objArrCopyOf);
    }

    @Override // r8.d, java.util.List, p0.d
    public final p0.d set(int i10, Object obj) {
        z6.a.h(i10, e());
        Object[] objArr = this.f13071a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        d7.a.l(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = obj;
        return new j(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, p0.d
    public final p0.d add(Object obj) {
        Object[] objArr = this.f13071a;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[objArr.length] = obj;
            return new j(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e(objArr.length + 1, 0, objArr, objArr2);
    }
}
