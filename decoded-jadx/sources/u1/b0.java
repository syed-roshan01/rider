package u1;

import android.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final void a(c3.k kVar, y1.o oVar) {
        if (r0.a(oVar)) {
            y1.u uVar = y1.i.f16782v;
            y1.j jVar = oVar.f16798d;
            y1.a aVar = (y1.a) o1.s.J(jVar, uVar);
            if (aVar != null) {
                kVar.b(new c3.e(null, R.id.accessibilityActionPageUp, aVar.f16745a, null));
            }
            y1.u uVar2 = y1.i.f16784x;
            LinkedHashMap linkedHashMap = jVar.f16786a;
            Object obj = linkedHashMap.get(uVar2);
            if (obj == null) {
                obj = null;
            }
            y1.a aVar2 = (y1.a) obj;
            if (aVar2 != null) {
                kVar.b(new c3.e(null, R.id.accessibilityActionPageDown, aVar2.f16745a, null));
            }
            Object obj2 = linkedHashMap.get(y1.i.f16783w);
            if (obj2 == null) {
                obj2 = null;
            }
            y1.a aVar3 = (y1.a) obj2;
            if (aVar3 != null) {
                kVar.b(new c3.e(null, R.id.accessibilityActionPageLeft, aVar3.f16745a, null));
            }
            Object obj3 = linkedHashMap.get(y1.i.f16785y);
            if (obj3 == null) {
                obj3 = null;
            }
            y1.a aVar4 = (y1.a) obj3;
            if (aVar4 != null) {
                kVar.b(new c3.e(null, R.id.accessibilityActionPageRight, aVar4.f16745a, null));
            }
        }
    }
}
