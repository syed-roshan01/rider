package v0;

import java.util.LinkedHashMap;
import java.util.Map;
import r8.v;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f15855b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f15856c = new f(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15857a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(2);
        this.f15857a = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15857a) {
            case 0:
                j jVar = (j) obj2;
                LinkedHashMap linkedHashMapI0 = v.I0(jVar.f15866a);
                for (i iVar : jVar.f15867b.values()) {
                    if (iVar.f15863b) {
                        Map mapB = iVar.f15864c.b();
                        boolean zIsEmpty = mapB.isEmpty();
                        Object obj3 = iVar.f15862a;
                        if (zIsEmpty) {
                            linkedHashMapI0.remove(obj3);
                        } else {
                            linkedHashMapI0.put(obj3, mapB);
                        }
                    }
                }
                if (linkedHashMapI0.isEmpty()) {
                    return null;
                }
                return linkedHashMapI0;
            default:
                return obj2;
        }
    }
}
