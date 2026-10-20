package r7;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f13618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f13619b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f13621d;

    public n(p pVar) {
        this.f13621d = pVar;
        this.f13618a = pVar.f13637f.f13625d;
        this.f13620c = pVar.f13636e;
    }

    public final o a() {
        o oVar = this.f13618a;
        p pVar = this.f13621d;
        if (oVar == pVar.f13637f) {
            throw new NoSuchElementException();
        }
        if (pVar.f13636e != this.f13620c) {
            throw new ConcurrentModificationException();
        }
        this.f13618a = oVar.f13625d;
        this.f13619b = oVar;
        return oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13618a != this.f13621d.f13637f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        o oVar = this.f13619b;
        if (oVar == null) {
            throw new IllegalStateException();
        }
        p pVar = this.f13621d;
        pVar.c(oVar, true);
        this.f13619b = null;
        this.f13620c = pVar.f13636e;
    }
}
