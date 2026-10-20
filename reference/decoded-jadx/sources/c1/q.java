package c1;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2914a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.i f2915b = new o0.i(new c9.a[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2916c;

    public static final void a(q qVar) {
        o0.i iVar = qVar.f2915b;
        int i10 = iVar.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVar.f12341a;
            int i11 = 0;
            do {
                ((c9.a) objArr[i11]).invoke();
                i11++;
            } while (i11 < i10);
        }
        iVar.g();
        qVar.f2914a.clear();
        qVar.f2916c = false;
    }

    public static final void b(q qVar) {
        LinkedHashMap linkedHashMap = qVar.f2914a;
        for (p pVar : linkedHashMap.keySet()) {
            pVar.getClass();
            o oVar = (o) androidx.compose.ui.focus.a.E(pVar).f2914a.get(pVar);
            if (oVar == null) {
                throw new IllegalStateException("committing a node that was not updated in the current transaction".toString());
            }
            pVar.f2913w = oVar;
        }
        linkedHashMap.clear();
        qVar.f2916c = false;
    }
}
