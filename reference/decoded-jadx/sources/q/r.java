package q;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f13021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13026f;

    public r(int i10) {
        this.f13021a = v.f13035a;
        this.f13022b = r.a.f13297c;
        this.f13023c = j.f12997a;
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        f(v.d(i10));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x007d A[LOOP:0: B:14:0x0023->B:30:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0080 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f13025e != this.f13025e) {
            return false;
        }
        Object[] objArr = this.f13022b;
        int[] iArr = this.f13023c;
        long[] jArr = this.f13021a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            int iD = rVar.d(obj2);
                            if (iD < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (i14 != rVar.f13023c[iD]) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public final int b(int i10) {
        int i11 = this.f13024d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f13021a;
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

    public final int c(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f13024d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f13021a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (d7.a.d(this.f13022b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iB = b(i11);
                if (this.f13026f == 0 && ((this.f13021a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                    int i19 = this.f13024d;
                    if (i19 <= 8 || Long.compareUnsigned(((long) this.f13025e) * 32, ((long) i19) * 25) > 0) {
                        h(v.b(this.f13024d));
                    } else {
                        h(v.b(this.f13024d));
                    }
                    iB = b(i11);
                }
                this.f13025e++;
                int i20 = this.f13026f;
                long[] jArr2 = this.f13021a;
                int i21 = iB >> 3;
                long j14 = jArr2[i21];
                int i22 = (iB & 7) << 3;
                this.f13026f = i20 - (((j14 >> i22) & 255) == 128 ? 1 : 0);
                jArr2[i21] = (j14 & (~(255 << i22))) | (j11 << i22);
                int i23 = this.f13024d;
                int i24 = ((iB - 7) & i23) + (i23 & 7);
                int i25 = i24 >> 3;
                int i26 = (i24 & 7) << 3;
                jArr2[i25] = ((~(255 << i26)) & jArr2[i25]) | (j11 << i26);
                return ~iB;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final int d(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f13024d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f13021a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (d7.a.d(this.f13022b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object[] objArr = this.f13022b;
        int[] iArr = this.f13023c;
        long[] jArr = this.f13021a;
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
                            iHashCode += Integer.hashCode(iArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, v.c(i10)) : 0;
        this.f13024d = iMax;
        if (iMax == 0) {
            jArr = v.f13035a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            b9.b.P(jArr);
        }
        this.f13021a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f13026f = v.a(this.f13024d) - this.f13025e;
        this.f13022b = new Object[iMax];
        this.f13023c = new int[iMax];
    }

    public final void g(int i10) {
        this.f13025e--;
        long[] jArr = this.f13021a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f13024d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f13022b[i10] = null;
    }

    public final void h(int i10) {
        int i11;
        long[] jArr = this.f13021a;
        Object[] objArr = this.f13022b;
        int[] iArr = this.f13023c;
        int i12 = this.f13024d;
        f(i10);
        Object[] objArr2 = this.f13022b;
        int[] iArr2 = this.f13023c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iB = b(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.f13021a;
                int i15 = iB >> 3;
                int i16 = (iB & 7) << 3;
                i11 = i13;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this.f13024d;
                int i18 = ((iB - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr2[i19] = (jArr2[i19] & (~(255 << i20))) | (j10 << i20);
                objArr2[iB] = obj;
                iArr2[iB] = iArr[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f13025e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f13022b;
        int[] iArr = this.f13023c;
        long[] jArr = this.f13021a;
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
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i15);
                            i11++;
                            if (i11 < this.f13025e) {
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

    public /* synthetic */ r() {
        this(6);
    }
}
