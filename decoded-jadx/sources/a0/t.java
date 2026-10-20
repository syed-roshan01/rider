package a0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import r1.j1;
import r1.k1;

/* JADX INFO: loaded from: classes.dex */
public final class t implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f861b = new LinkedHashMap();

    public t(q qVar) {
        this.f860a = qVar;
    }

    @Override // r1.k1
    public final boolean a(Object obj, Object obj2) {
        q qVar = this.f860a;
        return d7.a.d(qVar.b(obj), qVar.b(obj2));
    }

    @Override // r1.k1
    public final void b(j1 j1Var) {
        LinkedHashMap linkedHashMap = this.f861b;
        linkedHashMap.clear();
        Iterator it = j1Var.f13390a.iterator();
        while (it.hasNext()) {
            Object objB = this.f860a.b(it.next());
            Integer num = (Integer) linkedHashMap.get(objB);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(objB, Integer.valueOf(iIntValue + 1));
            }
        }
    }
}
