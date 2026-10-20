package k9;

import d7.t;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, u8.e, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u8.e f10648c;

    public final RuntimeException a() {
        int i10 = this.f10646a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f10646a);
    }

    public final void c(Object obj, u8.e eVar) {
        this.f10647b = obj;
        this.f10646a = 3;
        this.f10648c = eVar;
        v8.a aVar = v8.a.f15963a;
        d7.a.m(eVar, "frame");
    }

    @Override // u8.e
    public final u8.j getContext() {
        return u8.k.f15438a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f10646a;
            if (i10 != 0) {
                break;
            }
            this.f10646a = 5;
            u8.e eVar = this.f10648c;
            d7.a.j(eVar);
            this.f10648c = null;
            eVar.resumeWith(q8.l.f13235a);
        }
        if (i10 == 1) {
            d7.a.j(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f10646a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f10646a = 1;
            d7.a.j(null);
            throw null;
        }
        if (i10 != 3) {
            throw a();
        }
        this.f10646a = 0;
        Object obj = this.f10647b;
        this.f10647b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // u8.e
    public final void resumeWith(Object obj) {
        t.v0(obj);
        this.f10646a = 4;
    }
}
