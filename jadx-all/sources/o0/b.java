package o0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12330c;

    public /* synthetic */ b(Object obj, int i10) {
        this.f12328a = i10;
        this.f12330c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f12328a;
        Object obj = this.f12330c;
        switch (i10) {
            case 0:
                return this.f12329b < ((d) obj).f12332a;
            case 1:
                return this.f12329b < ((r8.d) obj).e();
            case 2:
                return this.f12329b < ((Object[]) obj).length;
        }
        while (this.f12329b > 0) {
            Iterator it = (Iterator) obj;
            if (!it.hasNext()) {
                return ((Iterator) obj).hasNext();
            }
            it.next();
            this.f12329b--;
        }
        return ((Iterator) obj).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f12328a;
        Object obj = this.f12330c;
        switch (i10) {
            case 0:
                Object[] objArr = ((d) obj).f12333b;
                int i11 = this.f12329b;
                this.f12329b = i11 + 1;
                Object obj2 = objArr[i11];
                d7.a.k(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                return obj2;
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.f12329b;
                this.f12329b = i12 + 1;
                return ((r8.d) obj).get(i12);
            case 2:
                try {
                    int i13 = this.f12329b;
                    this.f12329b = i13 + 1;
                    return ((Object[]) obj)[i13];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f12329b--;
                    throw new NoSuchElementException(e4.getMessage());
                }
        }
        while (this.f12329b > 0) {
            Iterator it = (Iterator) obj;
            if (!it.hasNext()) {
                return ((Iterator) obj).next();
            }
            it.next();
            this.f12329b--;
        }
        return ((Iterator) obj).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12328a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Object[] objArr) {
        this.f12328a = 2;
        d7.a.m(objArr, "array");
        this.f12330c = objArr;
    }

    public b(k9.b bVar) {
        this.f12328a = 3;
        this.f12330c = bVar.f10630a.iterator();
        this.f12329b = bVar.f10631b;
    }
}
