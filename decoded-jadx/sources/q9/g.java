package q9;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.j f13255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o9.a f13257c;

    public g(u8.j jVar, int i10, o9.a aVar) {
        this.f13255a = jVar;
        this.f13256b = i10;
        this.f13257c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // q9.q
    public final p9.f b(u8.j jVar, int i10, o9.a aVar) {
        u8.j jVar2 = this.f13255a;
        u8.j jVarO = jVar.O(jVar2);
        o9.a aVar2 = o9.a.f12668a;
        o9.a aVar3 = this.f13257c;
        int i11 = this.f13256b;
        if (aVar == aVar2) {
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (d7.a.d(jVarO, jVar2) && i10 == i11 && aVar == aVar3) ? this : d(jVarO, i10, aVar);
    }

    public abstract Object c(o9.r rVar, u8.e eVar);

    @Override // p9.f
    public Object collect(p9.g gVar, u8.e eVar) {
        Object objQ = d7.a.q(new e(null, gVar, this), eVar);
        return objQ == v8.a.f15963a ? objQ : q8.l.f13235a;
    }

    public abstract g d(u8.j jVar, int i10, o9.a aVar);

    public p9.f e() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        u8.k kVar = u8.k.f15438a;
        u8.j jVar = this.f13255a;
        if (jVar != kVar) {
            arrayList.add("context=" + jVar);
        }
        int i10 = this.f13256b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        o9.a aVar = o9.a.f12668a;
        o9.a aVar2 = this.f13257c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + r8.p.K0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
