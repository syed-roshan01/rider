package r0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import m9.e0;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f13315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13317f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13318n;

    public g(f fVar, s[] sVarArr) {
        super(fVar.f13311c, sVarArr);
        this.f13315d = fVar;
        this.f13318n = fVar.f13313e;
    }

    public final void c(int i10, r rVar, Object obj, int i11) {
        int i12 = i11 * 5;
        s[] sVarArr = this.f13306a;
        if (i12 <= 30) {
            int iB = 1 << e0.B(i10, i12);
            if (rVar.h(iB)) {
                sVarArr[i11].a(Integer.bitCount(rVar.f13329a) * 2, rVar.f(iB), rVar.f13332d);
                this.f13307b = i11;
                return;
            }
            int iT = rVar.t(iB);
            r rVarS = rVar.s(iT);
            sVarArr[i11].a(Integer.bitCount(rVar.f13329a) * 2, iT, rVar.f13332d);
            c(i10, rVarS, obj, i11 + 1);
            return;
        }
        s sVar = sVarArr[i11];
        Object[] objArr = rVar.f13332d;
        sVar.a(objArr.length, 0, objArr);
        while (true) {
            s sVar2 = sVarArr[i11];
            if (d7.a.d(sVar2.f13333a[sVar2.f13335c], obj)) {
                this.f13307b = i11;
                return;
            } else {
                sVarArr[i11].f13335c += 2;
            }
        }
    }

    @Override // r0.e, java.util.Iterator
    public final Object next() {
        if (this.f13315d.f13313e != this.f13318n) {
            throw new ConcurrentModificationException();
        }
        if (!this.f13308c) {
            throw new NoSuchElementException();
        }
        s sVar = this.f13306a[this.f13307b];
        this.f13316e = sVar.f13333a[sVar.f13335c];
        this.f13317f = true;
        return super.next();
    }

    @Override // r0.e, java.util.Iterator
    public final void remove() {
        if (!this.f13317f) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f13308c;
        f fVar = this.f13315d;
        if (!z10) {
            Object obj = this.f13316e;
            z6.a.d(fVar);
            fVar.remove(obj);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            s sVar = this.f13306a[this.f13307b];
            Object obj2 = sVar.f13333a[sVar.f13335c];
            Object obj3 = this.f13316e;
            z6.a.d(fVar);
            fVar.remove(obj3);
            c(obj2 != null ? obj2.hashCode() : 0, fVar.f13311c, obj2, 0);
        }
        this.f13316e = null;
        this.f13317f = false;
        this.f13318n = fVar.f13313e;
    }
}
