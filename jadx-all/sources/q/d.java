package q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12983b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f12985d;

    public d(f fVar) {
        this.f12985d = fVar;
        this.f12982a = fVar.f13045c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f12984c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f12983b;
        f fVar = this.f12985d;
        return d7.a.d(key, fVar.f(i10)) && d7.a.d(entry.getValue(), fVar.j(this.f12983b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f12984c) {
            return this.f12985d.f(this.f12983b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f12984c) {
            return this.f12985d.j(this.f12983b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12983b < this.f12982a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f12984c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f12983b;
        f fVar = this.f12985d;
        Object objF = fVar.f(i10);
        Object objJ = fVar.j(this.f12983b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12983b++;
        this.f12984c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12984c) {
            throw new IllegalStateException();
        }
        this.f12985d.h(this.f12983b);
        this.f12983b--;
        this.f12982a--;
        this.f12984c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f12984c) {
            return this.f12985d.i(this.f12983b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
