package q0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f13065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f13067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13068f;

    public h(f fVar, int i10) {
        super(i10, fVar.e());
        this.f13065c = fVar;
        this.f13066d = fVar.o();
        this.f13068f = -1;
        b();
    }

    public final void a() {
        if (this.f13066d != this.f13065c.o()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // q0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f13046a;
        f fVar = this.f13065c;
        fVar.add(i10, obj);
        this.f13046a++;
        this.f13047b = fVar.e();
        this.f13066d = fVar.o();
        this.f13068f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f13065c;
        Object[] objArr = fVar.f13060f;
        if (objArr == null) {
            this.f13067e = null;
            return;
        }
        int i10 = (fVar.f13062o - 1) & (-32);
        int i11 = this.f13046a;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f13058d / 5) + 1;
        k kVar = this.f13067e;
        if (kVar == null) {
            this.f13067e = new k(objArr, i11, i10, i12);
            return;
        }
        kVar.f13046a = i11;
        kVar.f13047b = i10;
        kVar.f13072c = i12;
        if (kVar.f13073d.length < i12) {
            kVar.f13073d = new Object[i12];
        }
        kVar.f13073d[0] = objArr;
        ?? r10 = i11 == i10 ? 1 : 0;
        kVar.f13074e = r10;
        kVar.b(i11 - r10, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13046a;
        this.f13068f = i10;
        k kVar = this.f13067e;
        f fVar = this.f13065c;
        if (kVar == null) {
            Object[] objArr = fVar.f13061n;
            this.f13046a = i10 + 1;
            return objArr[i10];
        }
        if (kVar.hasNext()) {
            this.f13046a++;
            return kVar.next();
        }
        Object[] objArr2 = fVar.f13061n;
        int i11 = this.f13046a;
        this.f13046a = i11 + 1;
        return objArr2[i11 - kVar.f13047b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13046a;
        this.f13068f = i10 - 1;
        k kVar = this.f13067e;
        f fVar = this.f13065c;
        if (kVar == null) {
            Object[] objArr = fVar.f13061n;
            int i11 = i10 - 1;
            this.f13046a = i11;
            return objArr[i11];
        }
        int i12 = kVar.f13047b;
        if (i10 <= i12) {
            this.f13046a = i10 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = fVar.f13061n;
        int i13 = i10 - 1;
        this.f13046a = i13;
        return objArr2[i13 - i12];
    }

    @Override // q0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f13068f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f13065c;
        fVar.i(i10);
        int i11 = this.f13068f;
        if (i11 < this.f13046a) {
            this.f13046a = i11;
        }
        this.f13047b = fVar.e();
        this.f13066d = fVar.o();
        this.f13068f = -1;
        b();
    }

    @Override // q0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f13068f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f13065c;
        fVar.set(i10, obj);
        this.f13066d = fVar.o();
        b();
    }
}
