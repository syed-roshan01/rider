package c0;

import d7.t;
import r1.s;
import u.r0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.i f2853a = new o0.i(new g[16]);

    /* JADX WARN: Code duplicated, block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r13 >= r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r6 != r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d1.d dVar, u8.e eVar) {
        e eVar2;
        int i10;
        d1.d dVar2;
        int i11;
        Object[] objArr;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i12 = eVar2.f2852n;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar2.f2852n = i12 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(this, eVar);
            }
        } else {
            eVar2 = new e(this, eVar);
        }
        Object obj = eVar2.f2850e;
        v8.a aVar = v8.a.f15963a;
        int i13 = eVar2.f2852n;
        q8.l lVar = q8.l.f13235a;
        if (i13 == 0) {
            t.v0(obj);
            o0.i iVar = this.f2853a;
            i10 = iVar.f12343c;
            if (i10 > 0) {
                Object[] objArr2 = iVar.f12341a;
                dVar2 = dVar;
                i11 = 0;
                objArr = objArr2;
                g gVar = (g) objArr[i11];
                eVar2.f2846a = dVar2;
                eVar2.f2847b = objArr;
                eVar2.f2848c = i10;
                eVar2.f2849d = i11;
                eVar2.f2852n = 1;
                gVar.getClass();
                d dVar3 = (d) gVar.g(c.f2845a);
                if (dVar3 == null) {
                    dVar3 = gVar.f2842u;
                }
                s sVarG0 = gVar.G0();
                if (sVarG0 != null && (r6 = dVar3.x(sVarG0, new r0(2, dVar2, gVar), eVar2)) == v8.a.f15963a) {
                    if (lVar == aVar) {
                        return aVar;
                    }
                } else if (lVar == aVar) {
                    return aVar;
                }
                i11++;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = eVar2.f2849d;
            i10 = eVar2.f2848c;
            objArr = eVar2.f2847b;
            d1.d dVar4 = eVar2.f2846a;
            t.v0(obj);
            dVar2 = dVar4;
            i11++;
        }
        return lVar;
    }
}
