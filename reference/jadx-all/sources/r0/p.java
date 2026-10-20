package r0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13325a;

    public p(d dVar) {
        this.f13325a = dVar;
    }

    @Override // r8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f13325a.containsValue(obj);
    }

    @Override // r8.a
    public final int e() {
        d dVar = this.f13325a;
        dVar.getClass();
        return dVar.f13305b;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        r rVar = this.f13325a.f13304a;
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new w();
        }
        return new n(rVar, sVarArr);
    }
}
