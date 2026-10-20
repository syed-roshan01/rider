package v0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9.e f15840a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c9.e eVar) {
        super(2);
        this.f15840a = eVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        l lVar;
        d dVar = (d) obj;
        List list = (List) this.f15840a.invoke(dVar, obj2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj3 = list.get(i10);
            if (obj3 != null && (lVar = dVar.f15849b) != null && !lVar.a(obj3)) {
                throw new IllegalArgumentException("item can't be saved".toString());
            }
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            return new ArrayList(list2);
        }
        return null;
    }
}
