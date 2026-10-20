package w0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, e9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f16100e = new n(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f16104d;

    public n(long j10, long j11, int i10, int[] iArr) {
        this.f16101a = j10;
        this.f16102b = j11;
        this.f16103c = i10;
        this.f16104d = iArr;
    }

    public final n e(n nVar) {
        int[] iArr;
        n nVar2 = f16100e;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar2;
        }
        int i10 = nVar.f16103c;
        int i11 = this.f16103c;
        if (i10 == i11 && nVar.f16104d == (iArr = this.f16104d)) {
            return new n(this.f16101a & (~nVar.f16101a), (~nVar.f16102b) & this.f16102b, i11, iArr);
        }
        Iterator it = nVar.iterator();
        n nVarI = this;
        while (it.hasNext()) {
            nVarI = nVarI.i(((Number) it.next()).intValue());
        }
        return nVarI;
    }

    public final n i(int i10) {
        int[] iArr;
        int iK;
        int i11 = this.f16103c;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f16102b;
            if ((j11 & j10) != 0) {
                return new n(this.f16101a, j11 & (~j10), i11, this.f16104d);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f16101a;
            if ((j13 & j12) != 0) {
                return new n(j13 & (~j12), this.f16102b, i11, this.f16104d);
            }
        } else if (i12 < 0 && (iArr = this.f16104d) != null && (iK = o7.d0.k(iArr, i10)) >= 0) {
            int length = iArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                return new n(this.f16101a, this.f16102b, this.f16103c, null);
            }
            int[] iArr2 = new int[i13];
            if (iK > 0) {
                b9.b.G(0, 0, iK, iArr, iArr2);
            }
            if (iK < i13) {
                b9.b.G(iK, iK + 1, length, iArr, iArr2);
            }
            return new n(this.f16101a, this.f16102b, this.f16103c, iArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        m mVar = new m(this, null);
        k9.j jVar = new k9.j();
        jVar.f10648c = d7.t.M(jVar, jVar, mVar);
        return jVar;
    }

    public final boolean k(int i10) {
        int[] iArr;
        int i11 = i10 - this.f16103c;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f16102b) != 0;
        }
        if (i11 >= 64 && i11 < 128) {
            return ((1 << (i11 - 64)) & this.f16101a) != 0;
        }
        if (i11 <= 0 && (iArr = this.f16104d) != null) {
            return o7.d0.k(iArr, i10) >= 0;
        }
        return false;
    }

    public final n n(n nVar) {
        int[] iArr;
        n nVar2 = f16100e;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar;
        }
        int i10 = nVar.f16103c;
        int i11 = this.f16103c;
        if (i10 == i11 && nVar.f16104d == (iArr = this.f16104d)) {
            return new n(this.f16101a | nVar.f16101a, this.f16102b | nVar.f16102b, i11, iArr);
        }
        if (this.f16104d == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                nVar = nVar.o(((Number) it.next()).intValue());
            }
            return nVar;
        }
        Iterator it2 = nVar.iterator();
        n nVarO = this;
        while (it2.hasNext()) {
            nVarO = nVarO.o(((Number) it2.next()).intValue());
        }
        return nVarO;
    }

    public final n o(int i10) {
        long j10;
        int i11;
        int i12 = this.f16103c;
        int i13 = i10 - i12;
        long j11 = this.f16102b;
        if (i13 < 0 || i13 >= 64) {
            long j12 = this.f16101a;
            if (i13 < 64 || i13 >= 128) {
                int[] iArrV0 = this.f16104d;
                if (i13 < 128) {
                    if (iArrV0 == null) {
                        return new n(j12, j11, i12, new int[]{i10});
                    }
                    int iK = o7.d0.k(iArrV0, i10);
                    if (iK < 0) {
                        int i14 = -(iK + 1);
                        int length = iArrV0.length;
                        int[] iArr = new int[length + 1];
                        b9.b.G(0, 0, i14, iArrV0, iArr);
                        b9.b.G(i14 + 1, i14, length, iArrV0, iArr);
                        iArr[i14] = i10;
                        return new n(this.f16101a, this.f16102b, this.f16103c, iArr);
                    }
                } else if (!k(i10)) {
                    int i15 = ((i10 + 1) / 64) * 64;
                    int i16 = this.f16103c;
                    ArrayList arrayList = null;
                    long j13 = j12;
                    while (true) {
                        if (i16 >= i15) {
                            j10 = j11;
                            i11 = i16;
                            break;
                        }
                        if (j11 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrV0 != null) {
                                    for (int i17 : iArrV0) {
                                        arrayList.add(Integer.valueOf(i17));
                                    }
                                }
                            }
                            for (int i18 = 0; i18 < 64; i18++) {
                                if (((1 << i18) & j11) != 0) {
                                    arrayList.add(Integer.valueOf(i18 + i16));
                                }
                            }
                        }
                        if (j13 == 0) {
                            i11 = i15;
                            j10 = 0;
                            break;
                        }
                        i16 += 64;
                        j11 = j13;
                        j13 = 0;
                    }
                    if (arrayList != null) {
                        iArrV0 = r8.p.V0(arrayList);
                    }
                    return new n(j13, j10, i11, iArrV0).o(i10);
                }
            } else {
                long j14 = 1 << (i13 - 64);
                if ((j12 & j14) == 0) {
                    return new n(j12 | j14, j11, i12, this.f16104d);
                }
            }
        } else {
            long j15 = 1 << i13;
            if ((j11 & j15) == 0) {
                return new n(this.f16101a, j11 | j15, i12, this.f16104d);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(f9.a.y0(this));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
