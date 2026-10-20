package t;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends w0 {
    public final t0 a(int i10, Float f10) {
        t0 t0Var;
        int iNumberOfTrailingZeros;
        t0 t0Var2 = new t0(f10, d0.f14122c);
        q.p pVar = this.f14338b;
        pVar.getClass();
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = pVar.f13013d;
        int i15 = i12 & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = pVar.f13010a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = i16;
            long j10 = (((-i18) >> 63) & (jArr[i17 + 1] << (64 - i18))) | (jArr[i17] >>> i18);
            long j11 = i13;
            t0Var = t0Var2;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j13) >> 3)) & i14;
                if (pVar.f13011b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iB = pVar.b(i12);
                if (pVar.f13015f == 0 && ((pVar.f13010a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                    int i20 = pVar.f13013d;
                    if (i20 <= 8 || Long.compareUnsigned(((long) pVar.f13014e) * 32, ((long) i20) * 25) > 0) {
                        pVar.f(q.v.b(pVar.f13013d));
                    } else {
                        pVar.f(q.v.b(pVar.f13013d));
                    }
                    iB = pVar.b(i12);
                }
                iNumberOfTrailingZeros = iB;
                pVar.f13014e++;
                int i21 = pVar.f13015f;
                long[] jArr2 = pVar.f13010a;
                int i22 = iNumberOfTrailingZeros >> 3;
                long j14 = jArr2[i22];
                int i23 = (iNumberOfTrailingZeros & 7) << 3;
                pVar.f13015f = i21 - (((j14 >> i23) & 255) != 128 ? 0 : 1);
                jArr2[i22] = ((~(255 << i23)) & j14) | (j11 << i23);
                int i24 = pVar.f13013d;
                int i25 = ((iNumberOfTrailingZeros - 7) & i24) + (i24 & 7);
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                jArr2[i26] = ((~(255 << i27)) & jArr2[i26]) | (j11 << i27);
                break;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
            t0Var2 = t0Var;
        }
        pVar.f13011b[iNumberOfTrailingZeros] = i10;
        pVar.f13012c[iNumberOfTrailingZeros] = t0Var;
        return t0Var;
    }
}
