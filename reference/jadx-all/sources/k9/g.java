package k9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10641b = -2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f10642c;

    public g(h hVar) {
        this.f10642c = hVar;
    }

    public final void a() {
        Object objInvoke;
        int i10 = this.f10641b;
        h hVar = this.f10642c;
        if (i10 == -2) {
            objInvoke = ((c9.a) hVar.f10645c).invoke();
        } else {
            c9.c cVar = hVar.f10644b;
            Object obj = this.f10640a;
            d7.a.j(obj);
            objInvoke = cVar.invoke(obj);
        }
        this.f10640a = objInvoke;
        this.f10641b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10641b < 0) {
            a();
        }
        return this.f10641b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10641b < 0) {
            a();
        }
        if (this.f10641b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f10640a;
        d7.a.k(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f10641b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
