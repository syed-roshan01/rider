package k9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f10633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10634b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f10636d;

    public e(f fVar) {
        this.f10636d = fVar;
        this.f10633a = fVar.f10637a.iterator();
    }

    public final void a() {
        Object next;
        f fVar;
        do {
            Iterator it = this.f10633a;
            if (!it.hasNext()) {
                this.f10634b = 0;
                return;
            } else {
                next = it.next();
                fVar = this.f10636d;
            }
        } while (((Boolean) fVar.f10639c.invoke(next)).booleanValue() != fVar.f10638b);
        this.f10635c = next;
        this.f10634b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10634b == -1) {
            a();
        }
        return this.f10634b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10634b == -1) {
            a();
        }
        if (this.f10634b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f10635c;
        this.f10635c = null;
        this.f10634b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
