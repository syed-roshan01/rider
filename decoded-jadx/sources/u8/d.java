package u8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f15435b;

    public d(h hVar, j jVar) {
        d7.a.m(jVar, "left");
        d7.a.m(hVar, "element");
        this.f15434a = jVar;
        this.f15435b = hVar;
    }

    @Override // u8.j
    public final j O(j jVar) {
        return d7.a.A(this, jVar);
    }

    @Override // u8.j
    public final Object e(Object obj, c9.e eVar) {
        return eVar.invoke(this.f15434a.e(obj, eVar), this.f15435b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                dVar.getClass();
                int i10 = 2;
                d dVar2 = dVar;
                int i11 = 2;
                while (true) {
                    j jVar = dVar2.f15434a;
                    dVar2 = jVar instanceof d ? (d) jVar : null;
                    if (dVar2 == null) {
                        break;
                    }
                    i11++;
                }
                d dVar3 = this;
                while (true) {
                    j jVar2 = dVar3.f15434a;
                    dVar3 = jVar2 instanceof d ? (d) jVar2 : null;
                    if (dVar3 == null) {
                        break;
                    }
                    i10++;
                }
                if (i11 == i10) {
                    d dVar4 = this;
                    while (true) {
                        h hVar = dVar4.f15435b;
                        if (!d7.a.d(dVar.f(hVar.getKey()), hVar)) {
                            break;
                        }
                        j jVar3 = dVar4.f15434a;
                        if (jVar3 instanceof d) {
                            dVar4 = (d) jVar3;
                        } else {
                            d7.a.k(jVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            h hVar2 = (h) jVar3;
                            if (d7.a.d(dVar.f(hVar2.getKey()), hVar2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // u8.j
    public final h f(i iVar) {
        d7.a.m(iVar, "key");
        d dVar = this;
        while (true) {
            h hVarF = dVar.f15435b.f(iVar);
            if (hVarF != null) {
                return hVarF;
            }
            j jVar = dVar.f15434a;
            if (!(jVar instanceof d)) {
                return jVar.f(iVar);
            }
            dVar = (d) jVar;
        }
    }

    public final int hashCode() {
        return this.f15435b.hashCode() + this.f15434a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) e("", c.f15431b)) + ']';
    }

    @Override // u8.j
    public final j u(i iVar) {
        d7.a.m(iVar, "key");
        h hVar = this.f15435b;
        h hVarF = hVar.f(iVar);
        j jVar = this.f15434a;
        if (hVarF != null) {
            return jVar;
        }
        j jVarU = jVar.u(iVar);
        if (jVarU == jVar) {
            return this;
        }
        return jVarU == k.f15438a ? hVar : new d(hVar, jVarU);
    }
}
