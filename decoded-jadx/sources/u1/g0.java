package u1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.o f15093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.j f15094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f15095c = new LinkedHashSet();

    public g0(y1.o oVar, Map map) {
        this.f15093a = oVar;
        this.f15094b = oVar.f16798d;
        List listG = oVar.g(false, true);
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1.o oVar2 = (y1.o) listG.get(i10);
            if (map.containsKey(Integer.valueOf(oVar2.f16801g))) {
                this.f15095c.add(Integer.valueOf(oVar2.f16801g));
            }
        }
    }
}
