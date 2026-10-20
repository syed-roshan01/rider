package r0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s[] f13306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13308c = true;

    public e(r rVar, s[] sVarArr) {
        this.f13306a = sVarArr;
        sVarArr[0].a(Integer.bitCount(rVar.f13329a) * 2, 0, rVar.f13332d);
        this.f13307b = 0;
        a();
    }

    public final void a() {
        int i10 = this.f13307b;
        s[] sVarArr = this.f13306a;
        s sVar = sVarArr[i10];
        if (sVar.f13335c < sVar.f13334b) {
            return;
        }
        while (-1 < i10) {
            int iB = b(i10);
            if (iB == -1) {
                s sVar2 = sVarArr[i10];
                int i11 = sVar2.f13335c;
                Object[] objArr = sVar2.f13333a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    sVar2.f13335c = i11 + 1;
                    iB = b(i10);
                }
            }
            if (iB != -1) {
                this.f13307b = iB;
                return;
            }
            if (i10 > 0) {
                s sVar3 = sVarArr[i10 - 1];
                int i12 = sVar3.f13335c;
                int length2 = sVar3.f13333a.length;
                sVar3.f13335c = i12 + 1;
            }
            sVarArr[i10].a(0, 0, r.f13328e.f13332d);
            i10--;
        }
        this.f13308c = false;
    }

    public final int b(int i10) {
        s[] sVarArr = this.f13306a;
        s sVar = sVarArr[i10];
        int i11 = sVar.f13335c;
        if (i11 < sVar.f13334b) {
            return i10;
        }
        Object[] objArr = sVar.f13333a;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        d7.a.k(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        r rVar = (r) obj;
        if (i10 == 6) {
            s sVar2 = sVarArr[i10 + 1];
            Object[] objArr2 = rVar.f13332d;
            sVar2.a(objArr2.length, 0, objArr2);
        } else {
            sVarArr[i10 + 1].a(Integer.bitCount(rVar.f13329a) * 2, 0, rVar.f13332d);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13308c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f13308c) {
            throw new NoSuchElementException();
        }
        Object next = this.f13306a[this.f13307b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
