package i9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8180d;

    public b(char c10, char c11, int i10) {
        this.f8177a = i10;
        this.f8178b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? d7.a.o(c10, c11) < 0 : d7.a.o(c10, c11) > 0) {
            z10 = false;
        }
        this.f8179c = z10;
        this.f8180d = z10 ? c10 : c11;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        int i10 = this.f8180d;
        if (i10 != this.f8178b) {
            this.f8180d = this.f8177a + i10;
        } else {
            if (!this.f8179c) {
                throw new NoSuchElementException();
            }
            this.f8179c = false;
        }
        return Character.valueOf((char) i10);
    }

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8179c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
