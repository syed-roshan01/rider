package i9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8189d;

    public f(int i10, int i11, int i12) {
        this.f8186a = i12;
        this.f8187b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f8188c = z10;
        this.f8189d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public final int b() {
        int i10 = this.f8189d;
        if (i10 != this.f8187b) {
            this.f8189d = this.f8186a + i10;
        } else {
            if (!this.f8188c) {
                throw new NoSuchElementException();
            }
            this.f8188c = false;
        }
        return i10;
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8188c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
