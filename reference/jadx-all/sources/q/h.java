package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12995c;

    public h(int i10) {
        this.f12993a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12994b < this.f12993a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12994b;
        b bVar = (b) this;
        int i11 = bVar.f12978d;
        Object obj = bVar.f12979e;
        switch (i11) {
            case 0:
                objF = ((f) obj).f(i10);
                break;
            case 1:
                objF = ((f) obj).j(i10);
                break;
            default:
                objF = ((g) obj).f12991b[i10];
                break;
        }
        this.f12994b++;
        this.f12995c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12995c) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i10 = this.f12994b - 1;
        this.f12994b = i10;
        b bVar = (b) this;
        int i11 = bVar.f12978d;
        Object obj = bVar.f12979e;
        switch (i11) {
            case 0:
                ((f) obj).h(i10);
                break;
            case 1:
                ((f) obj).h(i10);
                break;
            default:
                ((g) obj).e(i10);
                break;
        }
        this.f12993a--;
        this.f12995c = false;
    }
}
