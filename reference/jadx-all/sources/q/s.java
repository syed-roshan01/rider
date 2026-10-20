package q;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f13027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f13029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13032f;

    public s(int i10) {
        this.f13027a = v.f13035a;
        Object[] objArr = r.a.f13297c;
        this.f13028b = objArr;
        this.f13029c = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        h(v.d(i10));
    }

    public final void a() {
        this.f13031e = 0;
        long[] jArr = this.f13027a;
        if (jArr != v.f13035a) {
            b9.b.P(jArr);
            long[] jArr2 = this.f13027a;
            int i10 = this.f13030d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        b9.b.O(0, this.f13030d, this.f13029c);
        b9.b.O(0, this.f13030d, this.f13028b);
        this.f13032f = v.a(this.f13030d) - this.f13031e;
    }

    public final boolean b(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f13030d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f13027a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (d7.a.d(this.f13028b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros >= 0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (sVar.f13031e != this.f13031e) {
            return false;
        }
        Object[] objArr = this.f13028b;
        Object[] objArr2 = this.f13029c;
        long[] jArr = this.f13027a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            Object obj3 = objArr2[i13];
                            if (obj3 == null) {
                                if (sVar.f(obj2) != null || !sVar.b(obj2)) {
                                    return false;
                                }
                            } else if (!d7.a.d(obj3, sVar.f(obj2))) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final int d(int i10) {
        int i11 = this.f13030d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f13027a;
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

    public final int e(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f13030d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f13027a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (d7.a.d(this.f13028b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iD = d(i11);
                if (this.f13032f == 0 && ((this.f13027a[iD >> 3] >> ((iD & 7) << 3)) & 255) != 254) {
                    int i19 = this.f13030d;
                    if (i19 <= 8 || Long.compareUnsigned(((long) this.f13031e) * 32, ((long) i19) * 25) > 0) {
                        k(v.b(this.f13030d));
                    } else {
                        k(v.b(this.f13030d));
                    }
                    iD = d(i11);
                }
                this.f13031e++;
                int i20 = this.f13032f;
                long[] jArr2 = this.f13027a;
                int i21 = iD >> 3;
                long j14 = jArr2[i21];
                int i22 = (iD & 7) << 3;
                this.f13032f = i20 - (((j14 >> i22) & 255) == 128 ? 1 : 0);
                jArr2[i21] = (j14 & (~(255 << i22))) | (j11 << i22);
                int i23 = this.f13030d;
                int i24 = ((iD - 7) & i23) + (i23 & 7);
                int i25 = i24 >> 3;
                int i26 = (i24 & 7) << 3;
                jArr2[i25] = ((~(255 << i26)) & jArr2[i25]) | (j11 << i26);
                return ~iD;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final Object f(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f13030d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f13027a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (d7.a.d(this.f13028b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f13029c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object[] objArr = this.f13028b;
        Object[] objArr2 = this.f13029c;
        long[] jArr = this.f13027a;
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
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void h(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, v.c(i10)) : 0;
        this.f13030d = iMax;
        if (iMax == 0) {
            jArr = v.f13035a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            b9.b.P(jArr);
        }
        this.f13027a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f13032f = v.a(this.f13030d) - this.f13031e;
        this.f13028b = new Object[iMax];
        this.f13029c = new Object[iMax];
    }

    public final void i(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f13030d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f13027a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (d7.a.d(this.f13028b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i10 += 8;
                i14 = i15 + i10;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            j(iNumberOfTrailingZeros);
        }
    }

    public final Object j(int i10) {
        this.f13031e--;
        long[] jArr = this.f13027a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f13030d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f13028b[i10] = null;
        Object[] objArr = this.f13029c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void k(int i10) {
        int i11;
        long[] jArr = this.f13027a;
        Object[] objArr = this.f13028b;
        Object[] objArr2 = this.f13029c;
        int i12 = this.f13030d;
        h(i10);
        Object[] objArr3 = this.f13028b;
        Object[] objArr4 = this.f13029c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iD = d(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.f13027a;
                int i15 = iD >> 3;
                int i16 = (iD & 7) << 3;
                i11 = i13;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this.f13030d;
                int i18 = ((iD - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr2[i19] = (jArr2[i19] & (~(255 << i20))) | (j10 << i20);
                objArr3[iD] = obj;
                objArr4[iD] = objArr2[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    public final void l(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            iE = ~iE;
        }
        this.f13028b[iE] = obj;
        this.f13029c[iE] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070 A[DONT_INVERT, PHI: r8
  0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[LOOP:0: B:9:0x001e->B:27:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[EDGE_INSN: B:31:0x0075->B:28:0x0075 BREAK  A[LOOP:0: B:9:0x001e->B:27:0x0072], SYNTHETIC] */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f13031e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f13028b;
        Object[] objArr2 = this.f13029c;
        long[] jArr = this.f13027a;
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
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i11++;
                            if (i11 < this.f13031e) {
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

    public /* synthetic */ s() {
        this(6);
    }
}
