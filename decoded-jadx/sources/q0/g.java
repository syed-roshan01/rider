package q0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f13063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f13064d;

    public g(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11);
        this.f13063c = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f13064d = new k(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f13064d;
        if (kVar.hasNext()) {
            this.f13046a++;
            return kVar.next();
        }
        int i10 = this.f13046a;
        this.f13046a = i10 + 1;
        return this.f13063c[i10 - kVar.f13047b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13046a;
        k kVar = this.f13064d;
        int i11 = kVar.f13047b;
        if (i10 <= i11) {
            this.f13046a = i10 - 1;
            return kVar.previous();
        }
        int i12 = i10 - 1;
        this.f13046a = i12;
        return this.f13063c[i12 - i11];
    }
}
