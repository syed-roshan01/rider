package q;

/* JADX INFO: loaded from: classes.dex */
public final class t extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13033e;

    public t(int i10) {
        this.f13038a = v.f13035a;
        this.f13039b = r.a.f13297c;
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        g(v.d(i10));
    }

    public final void c(Object obj) {
        this.f13039b[e(obj)] = obj;
    }

    public final void d() {
        this.f13041d = 0;
        long[] jArr = this.f13038a;
        if (jArr != v.f13035a) {
            b9.b.P(jArr);
            long[] jArr2 = this.f13038a;
            int i10 = this.f13040c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        b9.b.O(0, this.f13040c, this.f13039b);
        this.f13033e = v.a(this.f13040c) - this.f13041d;
    }

    public final int e(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f13040c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f13038a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (d7.a.d(this.f13039b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iF = f(i11);
                if (this.f13033e == 0 && ((this.f13038a[iF >> 3] >> ((iF & 7) << 3)) & 255) != 254) {
                    int i19 = this.f13040c;
                    if (i19 <= 8 || Long.compareUnsigned(((long) this.f13041d) * 32, ((long) i19) * 25) > 0) {
                        i(v.b(this.f13040c));
                    } else {
                        i(v.b(this.f13040c));
                    }
                    iF = f(i11);
                }
                this.f13041d++;
                int i20 = this.f13033e;
                long[] jArr2 = this.f13038a;
                int i21 = iF >> 3;
                long j14 = jArr2[i21];
                int i22 = (iF & 7) << 3;
                this.f13033e = i20 - (((j14 >> i22) & 255) == 128 ? 1 : 0);
                jArr2[i21] = (j14 & (~(255 << i22))) | (j11 << i22);
                int i23 = this.f13040c;
                int i24 = ((iF - 7) & i23) + (i23 & 7);
                int i25 = i24 >> 3;
                int i26 = (i24 & 7) << 3;
                jArr2[i25] = ((~(255 << i26)) & jArr2[i25]) | (j11 << i26);
                return iF;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final int f(int i10) {
        int i11 = this.f13040c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f13038a;
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

    public final void g(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, v.c(i10)) : 0;
        this.f13040c = iMax;
        if (iMax == 0) {
            jArr = v.f13035a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            b9.b.P(jArr);
        }
        this.f13038a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f13033e = v.a(this.f13040c) - this.f13041d;
        this.f13039b = new Object[iMax];
    }

    public final void h(int i10) {
        this.f13041d--;
        long[] jArr = this.f13038a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f13040c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f13039b[i10] = null;
    }

    public final void i(int i10) {
        long[] jArr = this.f13038a;
        Object[] objArr = this.f13039b;
        int i11 = this.f13040c;
        g(i10);
        Object[] objArr2 = this.f13039b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i12];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int iF = f(i13 >>> 7);
                long j10 = i13 & 127;
                long[] jArr2 = this.f13038a;
                int i14 = iF >> 3;
                int i15 = (iF & 7) << 3;
                jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (j10 << i15);
                int i16 = this.f13040c;
                int i17 = ((iF - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (j10 << i19);
                objArr2[iF] = obj;
            }
        }
    }

    public /* synthetic */ t() {
        this(6);
    }
}
