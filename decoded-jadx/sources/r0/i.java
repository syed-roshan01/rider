package r0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f13320a;

    public i(f fVar) {
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new v(this);
        }
        this.f13320a = new g(fVar, sVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13320a.f13308c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.f13320a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f13320a.remove();
    }
}
