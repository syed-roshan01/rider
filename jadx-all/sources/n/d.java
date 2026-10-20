package n;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f12033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12034b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f12035c;

    public d(g gVar) {
        this.f12035c = gVar;
    }

    @Override // n.f
    public final void a(c cVar) {
        c cVar2 = this.f12033a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f12032d;
            this.f12033a = cVar3;
            this.f12034b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12034b) {
            return this.f12035c.f12038a != null;
        }
        c cVar = this.f12033a;
        return (cVar == null || cVar.f12031c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12034b) {
            this.f12034b = false;
            this.f12033a = this.f12035c.f12038a;
        } else {
            c cVar = this.f12033a;
            this.f12033a = cVar != null ? cVar.f12031c : null;
        }
        return this.f12033a;
    }
}
