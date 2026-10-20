package s;

import java.util.ArrayList;
import java.util.List;
import t1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class y implements r1.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f13890a;

    public y(f0 f0Var) {
        this.f13890a = f0Var;
    }

    @Override // r1.j0
    public final int a(c1 c1Var, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r1.p) list.get(0)).g(i10));
            int iY = d7.t.Y(list);
            int i11 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r1.p) list.get(i11)).g(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iY) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // r1.j0
    public final int b(c1 c1Var, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r1.p) list.get(0)).V(i10));
            int iY = d7.t.Y(list);
            int i11 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r1.p) list.get(i11)).V(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iY) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // r1.j0
    public final int c(c1 c1Var, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r1.p) list.get(0)).X(i10));
            int iY = d7.t.Y(list);
            int i11 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r1.p) list.get(i11)).X(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iY) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // r1.j0
    public final int d(c1 c1Var, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r1.p) list.get(0)).Q(i10));
            int iY = d7.t.Y(list);
            int i11 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r1.p) list.get(i11)).Q(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iY) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // r1.j0
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((r1.i0) list.get(i10)).f(j10));
        }
        int i11 = 1;
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i12 = ((r1.x0) obj).f13423a;
            int iY = d7.t.Y(arrayList);
            if (1 <= iY) {
                int i13 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i13);
                    int i14 = ((r1.x0) obj3).f13423a;
                    if (i12 < i14) {
                        obj = obj3;
                        i12 = i14;
                    }
                    if (i13 == iY) {
                        break;
                    }
                    i13++;
                }
            }
        } else {
            obj = null;
        }
        r1.x0 x0Var = (r1.x0) obj;
        int i15 = x0Var != null ? x0Var.f13423a : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i16 = ((r1.x0) obj2).f13424b;
            int iY2 = d7.t.Y(arrayList);
            if (1 <= iY2) {
                while (true) {
                    Object obj4 = arrayList.get(i11);
                    int i17 = ((r1.x0) obj4).f13424b;
                    if (i16 < i17) {
                        obj2 = obj4;
                        i16 = i17;
                    }
                    if (i11 == iY2) {
                        break;
                    }
                    i11++;
                }
            }
        }
        r1.x0 x0Var2 = (r1.x0) obj2;
        int i18 = x0Var2 != null ? x0Var2.f13424b : 0;
        this.f13890a.f13779a.setValue(new m2.k(o1.s.e(i15, i18)));
        return l0Var.N(i15, i18, r8.s.f13662a, new x(0, arrayList));
    }
}
