package l9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11394a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i9.g f11397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f11399f;

    public b(c cVar) {
        this.f11399f = cVar;
        int iR = z6.a.r(cVar.f11401b, 0, cVar.f11400a.length());
        this.f11395b = iR;
        this.f11396c = iR;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void a() {
        q8.f fVar;
        int i10 = this.f11396c;
        if (i10 < 0) {
            this.f11394a = 0;
            this.f11397d = null;
            return;
        }
        c cVar = this.f11399f;
        int i11 = cVar.f11402c;
        if (i11 > 0) {
            int i12 = this.f11398e + 1;
            this.f11398e = i12;
            if (i12 >= i11) {
                this.f11397d = new i9.g(this.f11395b, i.L0(cVar.f11400a), 1);
                this.f11396c = -1;
            } else if (i10 > cVar.f11400a.length() && (fVar = (q8.f) cVar.f11403d.invoke(cVar.f11400a, Integer.valueOf(this.f11396c))) != null) {
                int iIntValue = ((Number) fVar.f13225a).intValue();
                int iIntValue2 = ((Number) fVar.f13226b).intValue();
                this.f11397d = z6.a.s0(this.f11395b, iIntValue);
                int i13 = iIntValue + iIntValue2;
                this.f11395b = i13;
                this.f11396c = i13 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f11397d = new i9.g(this.f11395b, i.L0(cVar.f11400a), 1);
                this.f11396c = -1;
            }
        } else if (i10 > cVar.f11400a.length()) {
            this.f11397d = new i9.g(this.f11395b, i.L0(cVar.f11400a), 1);
            this.f11396c = -1;
        } else {
            int iIntValue3 = ((Number) fVar.f13225a).intValue();
            int iIntValue4 = ((Number) fVar.f13226b).intValue();
            this.f11397d = z6.a.s0(this.f11395b, iIntValue3);
            int i14 = iIntValue3 + iIntValue4;
            this.f11395b = i14;
            this.f11396c = i14 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f11394a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11394a == -1) {
            a();
        }
        return this.f11394a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11394a == -1) {
            a();
        }
        if (this.f11394a == 0) {
            throw new NoSuchElementException();
        }
        i9.g gVar = this.f11397d;
        d7.a.k(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f11397d = null;
        this.f11394a = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
