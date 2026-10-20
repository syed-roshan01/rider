package r6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f13536d;

    public f(i iVar) {
        this.f13536d = iVar;
        this.f13533a = iVar.f13559e;
        this.f13534b = iVar.isEmpty() ? -1 : 0;
        this.f13535c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13534b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object gVar;
        i iVar = this.f13536d;
        if (iVar.f13559e != this.f13533a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13534b;
        this.f13535c = i10;
        d dVar = (d) this;
        int i11 = dVar.f13524e;
        i iVar2 = dVar.f13525f;
        switch (i11) {
            case 0:
                gVar = iVar2.j()[i10];
                break;
            case 1:
                gVar = new g(iVar2, i10);
                break;
            default:
                gVar = iVar2.k()[i10];
                break;
        }
        int i12 = this.f13534b + 1;
        if (i12 >= iVar.f13560f) {
            i12 = -1;
        }
        this.f13534b = i12;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        i iVar = this.f13536d;
        if (iVar.f13559e != this.f13533a) {
            throw new ConcurrentModificationException();
        }
        y3.e.N("no calls to next() since the last call to remove()", this.f13535c >= 0);
        this.f13533a += 32;
        iVar.remove(iVar.j()[this.f13535c]);
        this.f13534b--;
        this.f13535c = -1;
    }
}
