package o0;

import q.s;
import q.t;
import q.v;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f12344a;

    public j() {
        long[] jArr = v.f13035a;
        this.f12344a = new s();
    }

    public final void a(Object obj, Object obj2) {
        s sVar = this.f12344a;
        int iE = sVar.e(obj);
        boolean z10 = iE < 0;
        Object obj3 = z10 ? null : sVar.f13029c[iE];
        if (obj3 != null) {
            if (obj3 instanceof t) {
                ((t) obj3).c(obj2);
            } else if (obj3 != obj2) {
                t tVar = new t();
                tVar.c(obj3);
                tVar.c(obj2);
                obj2 = tVar;
            }
            obj2 = obj3;
        }
        if (!z10) {
            sVar.f13029c[iE] = obj2;
            return;
        }
        int i10 = ~iE;
        sVar.f13028b[i10] = obj;
        sVar.f13029c[i10] = obj2;
    }

    public final boolean b(Object obj, Object obj2) {
        t tVar;
        int iNumberOfTrailingZeros;
        s sVar = this.f12344a;
        Object objF = sVar.f(obj);
        if (objF == null) {
            return false;
        }
        int i10 = 1;
        if (!(objF instanceof t)) {
            if (!d7.a.d(objF, obj2)) {
                return false;
            }
            sVar.i(obj);
            return true;
        }
        t tVar2 = (t) objF;
        int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = tVar2.f13040c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = tVar2.f13038a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            t tVar3 = tVar2;
            long j10 = (((-i17) >> 63) & (jArr[i16 + i10] << (64 - i17))) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                tVar = tVar3;
                if (d7.a.d(tVar.f13039b[iNumberOfTrailingZeros], obj2)) {
                    break loop0;
                }
                j12 &= j12 - 1;
                tVar3 = tVar;
            }
            tVar = tVar3;
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            tVar2 = tVar;
            i10 = 1;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            tVar.h(iNumberOfTrailingZeros);
        }
        if (z10 && tVar.b()) {
            sVar.i(obj);
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cb A[PHI: r23 r25 r26 r27 r28
  0x00cb: PHI (r23v3 long) = (r23v2 long), (r23v6 long) binds: [B:37:0x00c9, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r25v6 long[]) = (r25v5 long[]), (r25v8 long[]) binds: [B:37:0x00c9, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r26v4 int) = (r26v3 int), (r26v6 int) binds: [B:37:0x00c9, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r27v4 int) = (r27v3 int), (r27v7 int) binds: [B:37:0x00c9, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r28v3 long) = (r28v2 long), (r28v6 long) binds: [B:37:0x00c9, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c(Object obj) {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        long j10;
        long j11;
        int i13;
        s sVar = this.f12344a;
        long[] jArr3 = sVar.f13027a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j12 = jArr3[i14];
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j12 & 255) < 128) {
                        int i18 = (i14 << 3) + i17;
                        Object obj2 = sVar.f13028b[i18];
                        Object obj3 = sVar.f13029c[i18];
                        if (obj3 instanceof t) {
                            d7.a.k(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                            t tVar = (t) obj3;
                            Object[] objArr = tVar.f13039b;
                            long[] jArr4 = tVar.f13038a;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            i11 = length;
                            if (length2 >= 0) {
                                int i19 = 0;
                                while (true) {
                                    long j14 = jArr4[i19];
                                    i12 = i14;
                                    j10 = j12;
                                    j11 = -9187201950435737472L;
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j14 & 255) < 128) {
                                                int i22 = (i19 << 3) + i21;
                                                if (objArr[i22] == obj) {
                                                    tVar.h(i22);
                                                }
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        }
                                    }
                                    if (i19 == length2) {
                                        break;
                                    }
                                    i19++;
                                    i14 = i12;
                                    j12 = j10;
                                }
                            } else {
                                i12 = i14;
                                j10 = j12;
                                j11 = -9187201950435737472L;
                            }
                            if (tVar.b()) {
                                sVar.j(i18);
                            }
                        } else {
                            jArr2 = jArr3;
                            i11 = length;
                            i12 = i14;
                            j10 = j12;
                            j11 = j13;
                            d7.a.k(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                            if (obj3 == obj) {
                                sVar.j(i18);
                            }
                        }
                        i13 = 8;
                    } else {
                        jArr2 = jArr3;
                        i11 = length;
                        i12 = i14;
                        j10 = j12;
                        j11 = j13;
                        i13 = i15;
                    }
                    j12 = j10 >> i13;
                    i17++;
                    i15 = i13;
                    j13 = j11;
                    jArr3 = jArr2;
                    length = i11;
                    i14 = i12;
                }
                jArr = jArr3;
                int i23 = length;
                int i24 = i14;
                if (i16 != i15) {
                    return;
                }
                length = i23;
                i10 = i24;
            } else {
                jArr = jArr3;
                i10 = i14;
            }
            if (i10 == length) {
                return;
            }
            i14 = i10 + 1;
            jArr3 = jArr;
        }
    }
}
