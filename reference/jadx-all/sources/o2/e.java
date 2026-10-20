package o2;

import java.util.ArrayList;
import java.util.List;
import r1.i0;
import r1.j0;
import r1.k0;
import r1.l0;
import r1.x0;
import s.x;
import s.z;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f12463b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f12464c = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12465a;

    public /* synthetic */ e(int i10) {
        this.f12465a = i10;
    }

    @Override // r1.j0
    public final k0 e(l0 l0Var, List list, long j10) {
        Object obj;
        int iMax;
        r8.s sVar = r8.s.f13662a;
        int i10 = 0;
        int i11 = 1;
        switch (this.f12465a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(((i0) list.get(i12)).f(j10));
                }
                Object obj2 = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i13 = ((x0) obj).f13423a;
                    int iY = d7.t.Y(arrayList);
                    if (1 <= iY) {
                        int i14 = 1;
                        while (true) {
                            Object obj3 = arrayList.get(i14);
                            int i15 = ((x0) obj3).f13423a;
                            if (i13 < i15) {
                                obj = obj3;
                                i13 = i15;
                            }
                            if (i14 != iY) {
                                i14++;
                            }
                        }
                    }
                }
                x0 x0Var = (x0) obj;
                int iK = x0Var != null ? x0Var.f13423a : m2.a.k(j10);
                if (!arrayList.isEmpty()) {
                    Object obj4 = arrayList.get(0);
                    int i16 = ((x0) obj4).f13424b;
                    int iY2 = d7.t.Y(arrayList);
                    if (1 <= iY2) {
                        while (true) {
                            Object obj5 = arrayList.get(i11);
                            int i17 = ((x0) obj5).f13424b;
                            if (i16 < i17) {
                                obj4 = obj5;
                                i16 = i17;
                            }
                            if (i11 != iY2) {
                                i11++;
                            }
                        }
                    }
                    obj2 = obj4;
                }
                x0 x0Var2 = (x0) obj2;
                return l0Var.N(iK, x0Var2 != null ? x0Var2.f13424b : m2.a.j(j10), sVar, new x(4, arrayList));
            default:
                int size2 = list.size();
                if (size2 == 0) {
                    return l0Var.N(0, 0, sVar, b.f12454f);
                }
                if (size2 == 1) {
                    x0 x0VarF = ((i0) list.get(0)).f(j10);
                    return l0Var.N(x0VarF.f13423a, x0VarF.f13424b, sVar, new z(x0VarF, 10));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    arrayList2.add(((i0) list.get(i18)).f(j10));
                }
                int iY3 = d7.t.Y(arrayList2);
                if (iY3 >= 0) {
                    int iMax2 = 0;
                    iMax = 0;
                    while (true) {
                        x0 x0Var3 = (x0) arrayList2.get(i10);
                        iMax2 = Math.max(iMax2, x0Var3.f13423a);
                        iMax = Math.max(iMax, x0Var3.f13424b);
                        if (i10 != iY3) {
                            i10++;
                        } else {
                            i10 = iMax2;
                        }
                    }
                } else {
                    iMax = 0;
                }
                return l0Var.N(i10, iMax, sVar, new x(5, arrayList2));
        }
    }
}
