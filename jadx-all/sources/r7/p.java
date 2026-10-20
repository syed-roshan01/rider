package r7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t1.p f13631p = new t1.p(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f13632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f13634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f13637f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f13638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f13639o;

    public p(boolean z10) {
        t1.p pVar = f13631p;
        this.f13635d = 0;
        this.f13636e = 0;
        this.f13632a = pVar;
        this.f13633b = z10;
        this.f13637f = new o(z10);
    }

    public final o a(Object obj, boolean z10) {
        int iCompareTo;
        o oVar;
        o oVar2 = this.f13634c;
        t1.p pVar = f13631p;
        Comparator comparator = this.f13632a;
        if (oVar2 != null) {
            Comparable comparable = comparator == pVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = oVar2.f13627f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return oVar2;
                }
                o oVar3 = iCompareTo < 0 ? oVar2.f13623b : oVar2.f13624c;
                if (oVar3 == null) {
                    break;
                }
                oVar2 = oVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        o oVar4 = this.f13637f;
        if (oVar2 != null) {
            oVar = new o(this.f13633b, oVar2, obj, oVar4, oVar4.f13626e);
            if (iCompareTo < 0) {
                oVar2.f13623b = oVar;
            } else {
                oVar2.f13624c = oVar;
            }
            b(oVar2, true);
        } else {
            if (comparator == pVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            oVar = new o(this.f13633b, oVar2, obj, oVar4, oVar4.f13626e);
            this.f13634c = oVar;
        }
        this.f13635d++;
        this.f13636e++;
        return oVar;
    }

    public final void b(o oVar, boolean z10) {
        while (oVar != null) {
            o oVar2 = oVar.f13623b;
            o oVar3 = oVar.f13624c;
            int i10 = oVar2 != null ? oVar2.f13630p : 0;
            int i11 = oVar3 != null ? oVar3.f13630p : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                o oVar4 = oVar3.f13623b;
                o oVar5 = oVar3.f13624c;
                int i13 = (oVar4 != null ? oVar4.f13630p : 0) - (oVar5 != null ? oVar5.f13630p : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(oVar);
                } else {
                    f(oVar3);
                    e(oVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                o oVar6 = oVar2.f13623b;
                o oVar7 = oVar2.f13624c;
                int i14 = (oVar6 != null ? oVar6.f13630p : 0) - (oVar7 != null ? oVar7.f13630p : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(oVar);
                } else {
                    e(oVar2);
                    f(oVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                oVar.f13630p = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                oVar.f13630p = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            oVar = oVar.f13622a;
        }
    }

    public final void c(o oVar, boolean z10) {
        o oVar2;
        o oVar3;
        int i10;
        if (z10) {
            o oVar4 = oVar.f13626e;
            oVar4.f13625d = oVar.f13625d;
            oVar.f13625d.f13626e = oVar4;
        }
        o oVar5 = oVar.f13623b;
        o oVar6 = oVar.f13624c;
        o oVar7 = oVar.f13622a;
        int i11 = 0;
        if (oVar5 == null || oVar6 == null) {
            if (oVar5 != null) {
                d(oVar, oVar5);
                oVar.f13623b = null;
            } else if (oVar6 != null) {
                d(oVar, oVar6);
                oVar.f13624c = null;
            } else {
                d(oVar, null);
            }
            b(oVar7, false);
            this.f13635d--;
            this.f13636e++;
            return;
        }
        if (oVar5.f13630p > oVar6.f13630p) {
            o oVar8 = oVar5.f13624c;
            while (true) {
                o oVar9 = oVar8;
                oVar3 = oVar5;
                oVar5 = oVar9;
                if (oVar5 == null) {
                    break;
                } else {
                    oVar8 = oVar5.f13624c;
                }
            }
        } else {
            o oVar10 = oVar6.f13623b;
            while (true) {
                oVar2 = oVar6;
                oVar6 = oVar10;
                if (oVar6 == null) {
                    break;
                } else {
                    oVar10 = oVar6.f13623b;
                }
            }
            oVar3 = oVar2;
        }
        c(oVar3, false);
        o oVar11 = oVar.f13623b;
        if (oVar11 != null) {
            i10 = oVar11.f13630p;
            oVar3.f13623b = oVar11;
            oVar11.f13622a = oVar3;
            oVar.f13623b = null;
        } else {
            i10 = 0;
        }
        o oVar12 = oVar.f13624c;
        if (oVar12 != null) {
            i11 = oVar12.f13630p;
            oVar3.f13624c = oVar12;
            oVar12.f13622a = oVar3;
            oVar.f13624c = null;
        }
        oVar3.f13630p = Math.max(i10, i11) + 1;
        d(oVar, oVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f13634c = null;
        this.f13635d = 0;
        this.f13636e++;
        o oVar = this.f13637f;
        oVar.f13626e = oVar;
        oVar.f13625d = oVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        o oVarA = null;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return oVarA != null;
    }

    public final void d(o oVar, o oVar2) {
        o oVar3 = oVar.f13622a;
        oVar.f13622a = null;
        if (oVar2 != null) {
            oVar2.f13622a = oVar3;
        }
        if (oVar3 == null) {
            this.f13634c = oVar2;
        } else if (oVar3.f13623b == oVar) {
            oVar3.f13623b = oVar2;
        } else {
            oVar3.f13624c = oVar2;
        }
    }

    public final void e(o oVar) {
        o oVar2 = oVar.f13623b;
        o oVar3 = oVar.f13624c;
        o oVar4 = oVar3.f13623b;
        o oVar5 = oVar3.f13624c;
        oVar.f13624c = oVar4;
        if (oVar4 != null) {
            oVar4.f13622a = oVar;
        }
        d(oVar, oVar3);
        oVar3.f13623b = oVar;
        oVar.f13622a = oVar3;
        int iMax = Math.max(oVar2 != null ? oVar2.f13630p : 0, oVar4 != null ? oVar4.f13630p : 0) + 1;
        oVar.f13630p = iMax;
        oVar3.f13630p = Math.max(iMax, oVar5 != null ? oVar5.f13630p : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m mVar = this.f13638n;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 0);
        this.f13638n = mVar2;
        return mVar2;
    }

    public final void f(o oVar) {
        o oVar2 = oVar.f13623b;
        o oVar3 = oVar.f13624c;
        o oVar4 = oVar2.f13623b;
        o oVar5 = oVar2.f13624c;
        oVar.f13623b = oVar5;
        if (oVar5 != null) {
            oVar5.f13622a = oVar;
        }
        d(oVar, oVar2);
        oVar2.f13624c = oVar;
        oVar.f13622a = oVar2;
        int iMax = Math.max(oVar3 != null ? oVar3.f13630p : 0, oVar5 != null ? oVar5.f13630p : 0) + 1;
        oVar.f13630p = iMax;
        oVar2.f13630p = Math.max(iMax, oVar4 != null ? oVar4.f13630p : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        o oVarA;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
                oVarA = null;
            }
        } else {
            oVarA = null;
        }
        if (oVarA != null) {
            return oVarA.f13629o;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m mVar = this.f13639o;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 1);
        this.f13639o = mVar2;
        return mVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f13633b) {
            throw new NullPointerException("value == null");
        }
        o oVarA = a(obj, true);
        Object obj3 = oVarA.f13629o;
        oVarA.f13629o = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o oVarA;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
                oVarA = null;
            }
        } else {
            oVarA = null;
        }
        if (oVarA != null) {
            c(oVarA, true);
        }
        if (oVarA != null) {
            return oVarA.f13629o;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13635d;
    }
}
