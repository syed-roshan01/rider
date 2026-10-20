package r0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends r8.j implements p0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13324a;

    public o(d dVar) {
        this.f13324a = dVar;
    }

    @Override // r8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f13324a.containsKey(obj);
    }

    @Override // r8.a
    public final int e() {
        d dVar = this.f13324a;
        dVar.getClass();
        return dVar.f13305b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        r rVar = this.f13324a.f13304a;
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new u();
        }
        return new n(rVar, sVarArr);
    }
}
