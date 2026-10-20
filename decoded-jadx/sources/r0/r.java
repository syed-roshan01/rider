package r0;

import java.util.Arrays;
import m9.e0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f13328e = new r(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0.b f13331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f13332d;

    public r(int i10, int i11, Object[] objArr, t0.b bVar) {
        this.f13329a = i10;
        this.f13330b = i11;
        this.f13331c = bVar;
        this.f13332d = objArr;
    }

    public static r j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, t0.b bVar) {
        if (i12 > 30) {
            return new r(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iB = e0.B(i10, i12);
        int iB2 = e0.B(i11, i12);
        if (iB != iB2) {
            return new r((1 << iB) | (1 << iB2), 0, iB < iB2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new r(0, 1 << iB, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, t0.b bVar) {
        Object obj3 = this.f13332d[i10];
        r rVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f13332d;
        Object[] objArr2 = new Object[objArr.length - 1];
        b9.b.L(objArr, objArr2, 0, i10, 6);
        b9.b.H(i10, i10 + 2, i14, objArr, objArr2);
        objArr2[iT - 1] = rVarJ;
        b9.b.H(iT, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f13330b == 0) {
            return this.f13332d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f13329a);
        int length = this.f13332d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, this.f13332d.length), 2);
        int i10 = eVarJ0.f8183a;
        int i11 = eVarJ0.f8184b;
        int i12 = eVarJ0.f8185c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!d7.a.d(obj, this.f13332d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(Object obj, int i10, int i11) {
        int iB = 1 << e0.B(i10, i11);
        if (h(iB)) {
            return d7.a.d(obj, this.f13332d[f(iB)]);
        }
        if (!i(iB)) {
            return false;
        }
        r rVarS = s(t(iB));
        return i11 == 30 ? rVarS.c(obj) : rVarS.d(obj, i10, i11 + 5);
    }

    public final boolean e(r rVar) {
        if (this == rVar) {
            return true;
        }
        if (this.f13330b != rVar.f13330b || this.f13329a != rVar.f13329a) {
            return false;
        }
        int length = this.f13332d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f13332d[i10] != rVar.f13332d[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f13329a) * 2;
    }

    public final Object g(Object obj, int i10, int i11) {
        int iB = 1 << e0.B(i10, i11);
        if (h(iB)) {
            int iF = f(iB);
            if (d7.a.d(obj, this.f13332d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iB)) {
            return null;
        }
        r rVarS = s(t(iB));
        if (i11 != 30) {
            return rVarS.g(obj, i10, i11 + 5);
        }
        i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, rVarS.f13332d.length), 2);
        int i12 = eVarJ0.f8183a;
        int i13 = eVarJ0.f8184b;
        int i14 = eVarJ0.f8185c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!d7.a.d(obj, rVarS.f13332d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return rVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f13329a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f13330b) != 0;
    }

    public final r k(int i10, f fVar) {
        fVar.getClass();
        fVar.b(fVar.f13314f - 1);
        fVar.f13312d = x(i10);
        Object[] objArr = this.f13332d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f13331c != fVar.f13310b) {
            return new r(0, 0, e0.n(i10, objArr), fVar.f13310b);
        }
        this.f13332d = e0.n(i10, objArr);
        return this;
    }

    public final r l(int i10, Object obj, Object obj2, int i11, f fVar) {
        r rVarL;
        int iB = 1 << e0.B(i10, i11);
        boolean zH = h(iB);
        t0.b bVar = this.f13331c;
        if (zH) {
            int iF = f(iB);
            if (!d7.a.d(obj, this.f13332d[iF])) {
                fVar.getClass();
                fVar.b(fVar.f13314f + 1);
                t0.b bVar2 = fVar.f13310b;
                if (bVar != bVar2) {
                    return new r(this.f13329a ^ iB, this.f13330b | iB, a(iF, iB, i10, obj, obj2, i11, bVar2), bVar2);
                }
                this.f13332d = a(iF, iB, i10, obj, obj2, i11, bVar2);
                this.f13329a ^= iB;
                this.f13330b |= iB;
                return this;
            }
            fVar.f13312d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == fVar.f13310b) {
                this.f13332d[iF + 1] = obj2;
                return this;
            }
            fVar.f13313e++;
            Object[] objArr = this.f13332d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            d7.a.l(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iF + 1] = obj2;
            return new r(this.f13329a, this.f13330b, objArrCopyOf, fVar.f13310b);
        }
        if (!i(iB)) {
            fVar.getClass();
            fVar.b(fVar.f13314f + 1);
            t0.b bVar3 = fVar.f13310b;
            int iF2 = f(iB);
            if (bVar != bVar3) {
                return new r(this.f13329a | iB, this.f13330b, e0.l(iF2, obj, obj2, this.f13332d), bVar3);
            }
            this.f13332d = e0.l(iF2, obj, obj2, this.f13332d);
            this.f13329a |= iB;
            return this;
        }
        int iT = t(iB);
        r rVarS = s(iT);
        if (i11 == 30) {
            i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, rVarS.f13332d.length), 2);
            int i12 = eVarJ0.f8183a;
            int i13 = eVarJ0.f8184b;
            int i14 = eVarJ0.f8185c;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                fVar.getClass();
                fVar.b(fVar.f13314f + 1);
                rVarL = new r(0, 0, e0.l(0, obj, obj2, rVarS.f13332d), fVar.f13310b);
            } else {
                while (true) {
                    if (!d7.a.d(obj, rVarS.f13332d[i12])) {
                        if (i12 == i13) {
                            break;
                        }
                        i12 += i14;
                    } else {
                        fVar.f13312d = rVarS.x(i12);
                        if (rVarS.f13331c == fVar.f13310b) {
                            rVarS.f13332d[i12 + 1] = obj2;
                            rVarL = rVarS;
                        } else {
                            fVar.f13313e++;
                            Object[] objArr2 = rVarS.f13332d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            d7.a.l(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[i12 + 1] = obj2;
                            rVarL = new r(0, 0, objArrCopyOf2, fVar.f13310b);
                        }
                    }
                }
                fVar.getClass();
                fVar.b(fVar.f13314f + 1);
                rVarL = new r(0, 0, e0.l(0, obj, obj2, rVarS.f13332d), fVar.f13310b);
            }
        } else {
            rVarL = rVarS.l(i10, obj, obj2, i11 + 5, fVar);
        }
        return rVarS == rVarL ? this : r(iT, rVarL, fVar.f13310b);
    }

    public final r m(r rVar, int i10, t0.a aVar, f fVar) {
        r rVar2;
        Object[] objArr;
        int i11;
        int i12;
        r rVarJ;
        if (this == rVar) {
            aVar.f14366a += b();
            return this;
        }
        int i13 = 0;
        if (i10 > 30) {
            t0.b bVar = fVar.f13310b;
            Object[] objArr2 = this.f13332d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + rVar.f13332d.length);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            int length = this.f13332d.length;
            i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, rVar.f13332d.length), 2);
            int i14 = eVarJ0.f8183a;
            int i15 = eVarJ0.f8184b;
            int i16 = eVarJ0.f8185c;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                while (true) {
                    if (c(rVar.f13332d[i14])) {
                        aVar.f14366a++;
                    } else {
                        Object[] objArr3 = rVar.f13332d;
                        objArrCopyOf[length] = objArr3[i14];
                        objArrCopyOf[length + 1] = objArr3[i14 + 1];
                        length += 2;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14 += i16;
                }
            }
            if (length == this.f13332d.length) {
                return this;
            }
            if (length == rVar.f13332d.length) {
                return rVar;
            }
            if (length == objArrCopyOf.length) {
                return new r(0, 0, objArrCopyOf, bVar);
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
            d7.a.l(objArrCopyOf2, "copyOf(this, newSize)");
            return new r(0, 0, objArrCopyOf2, bVar);
        }
        int i17 = this.f13330b | rVar.f13330b;
        int i18 = this.f13329a;
        int i19 = rVar.f13329a;
        int i20 = (i18 ^ i19) & (~i17);
        int i21 = i18 & i19;
        int i22 = i20;
        while (i21 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i21);
            if (d7.a.d(this.f13332d[f(iLowestOneBit)], rVar.f13332d[rVar.f(iLowestOneBit)])) {
                i22 |= iLowestOneBit;
            } else {
                i17 |= iLowestOneBit;
            }
            i21 ^= iLowestOneBit;
        }
        if ((i17 & i22) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (d7.a.d(this.f13331c, fVar.f13310b) && this.f13329a == i22 && this.f13330b == i17) {
            rVar2 = this;
        } else {
            rVar2 = new r(i22, i17, new Object[Integer.bitCount(i17) + (Integer.bitCount(i22) * 2)], null);
        }
        int i23 = i17;
        int i24 = 0;
        while (i23 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i23);
            Object[] objArr4 = rVar2.f13332d;
            int length2 = (objArr4.length - 1) - i24;
            if (i(iLowestOneBit2)) {
                rVarJ = s(t(iLowestOneBit2));
                if (rVar.i(iLowestOneBit2)) {
                    rVarJ = rVarJ.m(rVar.s(rVar.t(iLowestOneBit2)), i10 + 5, aVar, fVar);
                } else if (rVar.h(iLowestOneBit2)) {
                    int iF = rVar.f(iLowestOneBit2);
                    Object obj = rVar.f13332d[iF];
                    Object objX = rVar.x(iF);
                    int i25 = fVar.f13314f;
                    objArr = objArr4;
                    i11 = i22;
                    i12 = iLowestOneBit2;
                    rVarJ = rVarJ.l(obj != null ? obj.hashCode() : i13, obj, objX, i10 + 5, fVar);
                    if (fVar.f13314f == i25) {
                        aVar.f14366a++;
                    }
                }
                objArr = objArr4;
                i11 = i22;
                i12 = iLowestOneBit2;
            } else {
                objArr = objArr4;
                i11 = i22;
                i12 = iLowestOneBit2;
                if (rVar.i(i12)) {
                    rVarJ = rVar.s(rVar.t(i12));
                    if (h(i12)) {
                        int iF2 = f(i12);
                        Object obj2 = this.f13332d[iF2];
                        int i26 = i10 + 5;
                        if (rVarJ.d(obj2, obj2 != null ? obj2.hashCode() : 0, i26)) {
                            aVar.f14366a++;
                        } else {
                            rVarJ = rVarJ.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i26, fVar);
                        }
                    }
                } else {
                    int iF3 = f(i12);
                    Object obj3 = this.f13332d[iF3];
                    Object objX2 = x(iF3);
                    int iF4 = rVar.f(i12);
                    Object obj4 = rVar.f13332d[iF4];
                    rVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, rVar.x(iF4), i10 + 5, fVar.f13310b);
                }
            }
            objArr[length2] = rVarJ;
            i24++;
            i23 ^= i12;
            i22 = i11;
            i13 = 0;
        }
        int i27 = 0;
        while (i22 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i22);
            int i28 = i27 * 2;
            if (rVar.h(iLowestOneBit3)) {
                int iF5 = rVar.f(iLowestOneBit3);
                Object[] objArr5 = rVar2.f13332d;
                objArr5[i28] = rVar.f13332d[iF5];
                objArr5[i28 + 1] = rVar.x(iF5);
                if (h(iLowestOneBit3)) {
                    aVar.f14366a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = rVar2.f13332d;
                objArr6[i28] = this.f13332d[iF6];
                objArr6[i28 + 1] = x(iF6);
            }
            i27++;
            i22 ^= iLowestOneBit3;
        }
        if (e(rVar2)) {
            return this;
        }
        return rVar.e(rVar2) ? rVar : rVar2;
    }

    public final r n(int i10, Object obj, int i11, f fVar) {
        r rVarN;
        int iB = 1 << e0.B(i10, i11);
        if (h(iB)) {
            int iF = f(iB);
            return d7.a.d(obj, this.f13332d[iF]) ? p(iF, iB, fVar) : this;
        }
        if (!i(iB)) {
            return this;
        }
        int iT = t(iB);
        r rVarS = s(iT);
        if (i11 == 30) {
            i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, rVarS.f13332d.length), 2);
            int i12 = eVarJ0.f8183a;
            int i13 = eVarJ0.f8184b;
            int i14 = eVarJ0.f8185c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!d7.a.d(obj, rVarS.f13332d[i12])) {
                        if (i12 == i13) {
                            rVarN = rVarS;
                            break;
                        }
                        i12 += i14;
                    } else {
                        rVarN = rVarS.k(i12, fVar);
                        break;
                    }
                }
            } else {
                rVarN = rVarS;
                break;
            }
        } else {
            rVarN = rVarS.n(i10, obj, i11 + 5, fVar);
        }
        return q(rVarS, rVarN, iT, iB, fVar.f13310b);
    }

    public final r o(int i10, Object obj, Object obj2, int i11, f fVar) {
        r rVarO;
        int iB = 1 << e0.B(i10, i11);
        if (h(iB)) {
            int iF = f(iB);
            return (d7.a.d(obj, this.f13332d[iF]) && d7.a.d(obj2, x(iF))) ? p(iF, iB, fVar) : this;
        }
        if (!i(iB)) {
            return this;
        }
        int iT = t(iB);
        r rVarS = s(iT);
        if (i11 == 30) {
            i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, rVarS.f13332d.length), 2);
            int i12 = eVarJ0.f8183a;
            int i13 = eVarJ0.f8184b;
            int i14 = eVarJ0.f8185c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!d7.a.d(obj, rVarS.f13332d[i12]) || !d7.a.d(obj2, rVarS.x(i12))) {
                        if (i12 == i13) {
                            rVarO = rVarS;
                            break;
                        }
                        i12 += i14;
                    } else {
                        rVarO = rVarS.k(i12, fVar);
                        break;
                    }
                }
            } else {
                rVarO = rVarS;
                break;
            }
        } else {
            rVarO = rVarS.o(i10, obj, obj2, i11 + 5, fVar);
        }
        return q(rVarS, rVarO, iT, iB, fVar.f13310b);
    }

    public final r p(int i10, int i11, f fVar) {
        fVar.getClass();
        fVar.b(fVar.f13314f - 1);
        fVar.f13312d = x(i10);
        Object[] objArr = this.f13332d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f13331c != fVar.f13310b) {
            return new r(i11 ^ this.f13329a, this.f13330b, e0.n(i10, objArr), fVar.f13310b);
        }
        this.f13332d = e0.n(i10, objArr);
        this.f13329a ^= i11;
        return this;
    }

    public final r q(r rVar, r rVar2, int i10, int i11, t0.b bVar) {
        t0.b bVar2 = this.f13331c;
        if (rVar2 == null) {
            Object[] objArr = this.f13332d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 != bVar) {
                return new r(this.f13329a, i11 ^ this.f13330b, e0.o(i10, objArr), bVar);
            }
            this.f13332d = e0.o(i10, objArr);
            this.f13330b ^= i11;
        } else if (bVar2 == bVar || rVar != rVar2) {
            return r(i10, rVar2, bVar);
        }
        return this;
    }

    public final r r(int i10, r rVar, t0.b bVar) {
        Object[] objArr = this.f13332d;
        if (objArr.length == 1 && rVar.f13332d.length == 2 && rVar.f13330b == 0) {
            rVar.f13329a = this.f13330b;
            return rVar;
        }
        if (this.f13331c == bVar) {
            objArr[i10] = rVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        d7.a.l(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = rVar;
        return new r(this.f13329a, this.f13330b, objArrCopyOf, bVar);
    }

    public final r s(int i10) {
        Object obj = this.f13332d[i10];
        d7.a.k(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (r) obj;
    }

    public final int t(int i10) {
        return (this.f13332d.length - 1) - Integer.bitCount((i10 - 1) & this.f13330b);
    }

    public final q u(Object obj, int i10, int i11, Object obj2) {
        q qVarU;
        int iB = 1 << e0.B(i10, i11);
        if (h(iB)) {
            int iF = f(iB);
            if (!d7.a.d(obj, this.f13332d[iF])) {
                return new q(new r(this.f13329a ^ iB, this.f13330b | iB, a(iF, iB, i10, obj, obj2, i11, null), null), 1);
            }
            if (x(iF) == obj2) {
                return null;
            }
            Object[] objArr = this.f13332d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            d7.a.l(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iF + 1] = obj2;
            return new q(new r(this.f13329a, this.f13330b, objArrCopyOf, null), 0);
        }
        if (!i(iB)) {
            return new q(new r(this.f13329a | iB, this.f13330b, e0.l(f(iB), obj, obj2, this.f13332d), null), 1);
        }
        int iT = t(iB);
        r rVarS = s(iT);
        if (i11 == 30) {
            i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, rVarS.f13332d.length), 2);
            int i12 = eVarJ0.f8183a;
            int i13 = eVarJ0.f8184b;
            int i14 = eVarJ0.f8185c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!d7.a.d(obj, rVarS.f13332d[i12])) {
                        if (i12 == i13) {
                            qVarU = new q(new r(0, 0, e0.l(0, obj, obj2, rVarS.f13332d), null), 1);
                            break;
                        }
                        i12 += i14;
                    } else {
                        if (obj2 != rVarS.x(i12)) {
                            Object[] objArr2 = rVarS.f13332d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            d7.a.l(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[i12 + 1] = obj2;
                            qVarU = new q(new r(0, 0, objArrCopyOf2, null), 0);
                            break;
                        }
                        qVarU = null;
                        break;
                    }
                }
            } else {
                qVarU = new q(new r(0, 0, e0.l(0, obj, obj2, rVarS.f13332d), null), 1);
                break;
            }
            if (qVarU == null) {
                return null;
            }
        } else {
            qVarU = rVarS.u(obj, i10, i11 + 5, obj2);
            if (qVarU == null) {
                return null;
            }
        }
        qVarU.f13326a = w(iT, iB, qVarU.f13326a);
        return qVarU;
    }

    public final r v(k.f fVar, int i10, int i11) {
        r rVarV;
        int iB = 1 << e0.B(i10, i11);
        if (h(iB)) {
            int iF = f(iB);
            if (!d7.a.d(fVar, this.f13332d[iF])) {
                return this;
            }
            Object[] objArr = this.f13332d;
            if (objArr.length == 2) {
                return null;
            }
            return new r(this.f13329a ^ iB, this.f13330b, e0.n(iF, objArr), null);
        }
        if (!i(iB)) {
            return this;
        }
        int iT = t(iB);
        r rVarS = s(iT);
        if (i11 == 30) {
            i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, rVarS.f13332d.length), 2);
            int i12 = eVarJ0.f8183a;
            int i13 = eVarJ0.f8184b;
            int i14 = eVarJ0.f8185c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!d7.a.d(fVar, rVarS.f13332d[i12])) {
                        if (i12 == i13) {
                            rVarV = rVarS;
                            break;
                        }
                        i12 += i14;
                    } else {
                        Object[] objArr2 = rVarS.f13332d;
                        if (objArr2.length != 2) {
                            rVarV = new r(0, 0, e0.n(i12, objArr2), null);
                            break;
                        }
                        rVarV = null;
                        break;
                    }
                }
            } else {
                rVarV = rVarS;
                break;
            }
        } else {
            rVarV = rVarS.v(fVar, i10, i11 + 5);
        }
        if (rVarV != null) {
            return rVarS != rVarV ? w(iT, iB, rVarV) : this;
        }
        Object[] objArr3 = this.f13332d;
        if (objArr3.length == 1) {
            return null;
        }
        return new r(this.f13329a, iB ^ this.f13330b, e0.o(iT, objArr3), null);
    }

    public final r w(int i10, int i11, r rVar) {
        Object[] objArr = rVar.f13332d;
        if (objArr.length != 2 || rVar.f13330b != 0) {
            Object[] objArr2 = this.f13332d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i10] = rVar;
            return new r(this.f13329a, this.f13330b, objArrCopyOf, null);
        }
        if (this.f13332d.length == 1) {
            rVar.f13329a = this.f13330b;
            return rVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f13332d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        d7.a.l(objArrCopyOf2, "copyOf(this, newSize)");
        b9.b.H(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        b9.b.H(iF + 2, iF, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new r(this.f13329a ^ i11, i11 ^ this.f13330b, objArrCopyOf2, null);
    }

    public final Object x(int i10) {
        return this.f13332d[i10 + 1];
    }
}
