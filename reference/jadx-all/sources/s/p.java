package s;

import java.util.List;
import t1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class p implements r1.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f13850a;

    public p(w wVar) {
        this.f13850a = wVar;
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
        r1.x0 x0Var;
        r1.x0 x0Var2;
        int size = list.size();
        r1.x0[] x0VarArr = new r1.x0[size];
        int size2 = list.size();
        int i10 = 0;
        while (true) {
            x0Var = null;
            if (i10 >= size2) {
                break;
            }
            r1.i0 i0Var = (r1.i0) list.get(i10);
            Object objA = i0Var.a();
            s sVar = objA instanceof s ? (s) objA : null;
            if (sVar != null && sVar.f13862b) {
                x0VarArr[i10] = i0Var.f(j10);
            }
            i10++;
        }
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            r1.i0 i0Var2 = (r1.i0) list.get(i11);
            if (x0VarArr[i11] == null) {
                x0VarArr[i11] = i0Var2.f(j10);
            }
        }
        if (size == 0) {
            x0Var2 = null;
        } else {
            x0Var2 = x0VarArr[0];
            int i12 = size - 1;
            if (i12 != 0) {
                int i13 = x0Var2 != null ? x0Var2.f13423a : 0;
                i9.f it = new i9.g(1, i12, 1).iterator();
                while (it.f8188c) {
                    r1.x0 x0Var3 = x0VarArr[it.b()];
                    int i14 = x0Var3 != null ? x0Var3.f13423a : 0;
                    if (i13 < i14) {
                        x0Var2 = x0Var3;
                        i13 = i14;
                    }
                }
            }
        }
        int i15 = x0Var2 != null ? x0Var2.f13423a : 0;
        if (size != 0) {
            x0Var = x0VarArr[0];
            int i16 = size - 1;
            if (i16 != 0) {
                int i17 = x0Var != null ? x0Var.f13424b : 0;
                i9.f it2 = new i9.g(1, i16, 1).iterator();
                while (it2.f8188c) {
                    r1.x0 x0Var4 = x0VarArr[it2.b()];
                    int i18 = x0Var4 != null ? x0Var4.f13424b : 0;
                    if (i17 < i18) {
                        x0Var = x0Var4;
                        i17 = i18;
                    }
                }
            }
        }
        int i19 = x0Var != null ? x0Var.f13424b : 0;
        this.f13850a.f13882c.setValue(new m2.k(o1.s.e(i15, i19)));
        return l0Var.N(i15, i19, r8.s.f13662a, new o(x0VarArr, this, i15, i19));
    }
}
