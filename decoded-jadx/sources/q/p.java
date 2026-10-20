package q;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f13010a = v.f13035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f13011b = j.f12997a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f13012c = r.a.f13297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13015f;

    public p(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        e(v.d(i10));
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        int[] iArr;
        int i10;
        Object[] objArr;
        long[] jArr;
        int i11;
        int i12;
        int[] iArr2;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        int i14;
        long j10;
        int i15;
        if (obj == this) {
            return true;
        }
        int i16 = 0;
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.f13014e != this.f13014e) {
            return false;
        }
        int[] iArr3 = this.f13011b;
        Object[] objArr3 = this.f13012c;
        long[] jArr3 = this.f13010a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr3[i17];
            int i18 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i19 = 8;
                int i20 = 8 - ((~(i17 - length)) >>> 31);
                while (i16 < i20) {
                    if ((j11 & 255) < 128) {
                        int i21 = (i17 << 3) + i16;
                        int i22 = iArr3[i21];
                        Object obj2 = objArr3[i21];
                        if (obj2 != null) {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i13 = length;
                            i14 = i17;
                            j10 = -9187201950435737472L;
                            if (!d7.a.d(obj2, pVar.c(i22))) {
                                return false;
                            }
                        } else {
                            if (pVar.c(i22) != null) {
                                return false;
                            }
                            pVar.getClass();
                            int iHashCode = Integer.hashCode(i22) * (-862048943);
                            int i23 = iHashCode ^ (iHashCode << 16);
                            int i24 = i23 & 127;
                            int i25 = pVar.f13013d;
                            int i26 = (i23 >>> i18) & i25;
                            int i27 = 0;
                            while (true) {
                                long[] jArr4 = pVar.f13010a;
                                int i28 = i26 >> 3;
                                int i29 = (i26 & 7) << 3;
                                long j13 = jArr4[i28] >>> i29;
                                long j14 = jArr4[i28 + 1] << (64 - i29);
                                objArr2 = objArr3;
                                jArr2 = jArr3;
                                long j15 = j13 | (j14 & ((-i29) >> 63));
                                i13 = length;
                                i14 = i17;
                                long j16 = (((long) i24) * 72340172838076673L) ^ j15;
                                long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
                                while (j17 != 0) {
                                    int iNumberOfTrailingZeros = (i26 + (Long.numberOfTrailingZeros(j17) >> 3)) & i25;
                                    iArr2 = iArr3;
                                    if (pVar.f13011b[iNumberOfTrailingZeros] == i22) {
                                        if (iNumberOfTrailingZeros < 0) {
                                            return false;
                                        }
                                        j10 = -9187201950435737472L;
                                        break;
                                    }
                                    j17 &= j17 - 1;
                                    iArr3 = iArr2;
                                }
                                int[] iArr4 = iArr3;
                                if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                                    return false;
                                }
                                i27 += 8;
                                i26 = (i26 + i27) & i25;
                                length = i13;
                                objArr3 = objArr2;
                                jArr3 = jArr2;
                                i17 = i14;
                                iArr3 = iArr4;
                            }
                        }
                        i15 = 8;
                    } else {
                        iArr2 = iArr3;
                        objArr2 = objArr3;
                        jArr2 = jArr3;
                        i13 = length;
                        i14 = i17;
                        j10 = j12;
                        i15 = i19;
                    }
                    j11 >>= i15;
                    i16++;
                    i19 = i15;
                    j12 = j10;
                    objArr3 = objArr2;
                    jArr3 = jArr2;
                    i17 = i14;
                    iArr3 = iArr2;
                    i18 = 7;
                    length = i13;
                }
                iArr = iArr3;
                objArr = objArr3;
                jArr = jArr3;
                i11 = length;
                int i30 = i17;
                i10 = 0;
                if (i20 != i19) {
                    return true;
                }
                i12 = i30;
            } else {
                iArr = iArr3;
                i10 = i16;
                objArr = objArr3;
                jArr = jArr3;
                i11 = length;
                i12 = i17;
            }
            if (i12 == i11) {
                return true;
            }
            i17 = i12 + 1;
            length = i11;
            i16 = i10;
            objArr3 = objArr;
            jArr3 = jArr;
            iArr3 = iArr;
        }
    }

    public final int b(int i10) {
        int i11 = this.f13013d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f13010a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final Object c(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f13013d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f13010a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f13011b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f13012c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int[] iArr = this.f13011b;
        Object[] objArr = this.f13012c;
        long[] jArr = this.f13010a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            int i15 = iArr[i14];
                            Object obj = objArr[i14];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i15);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iHashCode;
                }
            }
        }
        return i10;
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, v.c(i10)) : 0;
        this.f13013d = iMax;
        if (iMax == 0) {
            jArr = v.f13035a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            b9.b.P(jArr);
        }
        this.f13010a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f13015f = v.a(this.f13013d) - this.f13014e;
        this.f13011b = new int[iMax];
        this.f13012c = new Object[iMax];
    }

    public final void f(int i10) {
        long[] jArr = this.f13010a;
        int[] iArr = this.f13011b;
        Object[] objArr = this.f13012c;
        int i11 = this.f13013d;
        e(i10);
        int[] iArr2 = this.f13011b;
        Object[] objArr2 = this.f13012c;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int iHashCode = Integer.hashCode(i13) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iB = b(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.f13010a;
                int i15 = iB >> 3;
                int i16 = (iB & 7) << 3;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this.f13013d;
                int i18 = ((iB - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr2[i19] = ((~(255 << i20)) & jArr2[i19]) | (j10 << i20);
                iArr2[iB] = i13;
                objArr2[iB] = objArr[i12];
            }
            i12++;
            jArr = jArr;
            iArr = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f13014e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f13011b;
        Object[] objArr = this.f13012c;
        long[] jArr = this.f13010a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            Object obj = objArr[i14];
                            sb.append(i15);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i11++;
                            if (i11 < this.f13014e) {
                                sb.append(", ");
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        d7.a.l(string, "s.append('}').toString()");
        return string;
    }
}
