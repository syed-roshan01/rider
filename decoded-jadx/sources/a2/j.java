package a2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(0);
        this.f940a = i10;
        this.f941b = kVar;
    }

    public final Float a() {
        o oVar;
        o oVar2;
        int i10 = this.f940a;
        float fC = 0.0f;
        Object obj = null;
        k kVar = this.f941b;
        int i11 = 1;
        switch (i10) {
            case 0:
                ArrayList arrayList = kVar.f946e;
                if (!arrayList.isEmpty()) {
                    Object obj2 = arrayList.get(0);
                    float fC2 = ((n) obj2).f954a.c();
                    int iY = d7.t.Y(arrayList);
                    if (1 <= iY) {
                        while (true) {
                            Object obj3 = arrayList.get(i11);
                            float fC3 = ((n) obj3).f954a.c();
                            if (Float.compare(fC2, fC3) < 0) {
                                obj2 = obj3;
                                fC2 = fC3;
                            }
                            if (i11 != iY) {
                                i11++;
                            }
                        }
                    }
                    obj = obj2;
                }
                n nVar = (n) obj;
                if (nVar != null && (oVar = nVar.f954a) != null) {
                    fC = oVar.c();
                }
                return Float.valueOf(fC);
            default:
                ArrayList arrayList2 = kVar.f946e;
                if (!arrayList2.isEmpty()) {
                    Object obj4 = arrayList2.get(0);
                    float fA = ((n) obj4).f954a.a();
                    int iY2 = d7.t.Y(arrayList2);
                    if (1 <= iY2) {
                        while (true) {
                            Object obj5 = arrayList2.get(i11);
                            float fA2 = ((n) obj5).f954a.a();
                            if (Float.compare(fA, fA2) < 0) {
                                obj4 = obj5;
                                fA = fA2;
                            }
                            if (i11 != iY2) {
                                i11++;
                            }
                        }
                    }
                    obj = obj4;
                }
                n nVar2 = (n) obj;
                if (nVar2 != null && (oVar2 = nVar2.f954a) != null) {
                    fC = oVar2.a();
                }
                return Float.valueOf(fC);
        }
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f940a) {
            case 0:
                break;
        }
        return a();
    }
}
