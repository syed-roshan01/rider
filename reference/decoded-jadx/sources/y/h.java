package y;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f16554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16555d;

    public h(float f10, boolean z10, j jVar) {
        this.f16552a = f10;
        this.f16553b = z10;
        this.f16554c = jVar;
        this.f16555d = f10;
    }

    @Override // y.g, y.i
    public final float a() {
        return this.f16555d;
    }

    @Override // y.g
    public final void b(m2.b bVar, int i10, int[] iArr, m2.l lVar, int[] iArr2) {
        int i11;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iJ = bVar.J(this.f16552a);
        boolean z10 = this.f16553b && lVar == m2.l.f11816b;
        d dVar = k.f16605a;
        if (z10) {
            i11 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i12 = iArr[length];
                int iMin2 = Math.min(i11, i10 - i12);
                iArr2[length] = iMin2;
                iMin = Math.min(iJ, (i10 - iMin2) - i12);
                i11 = iArr2[length] + i12 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i13 = 0;
            i11 = 0;
            iMin = 0;
            int i14 = 0;
            while (i13 < length2) {
                int i15 = iArr[i13];
                int iMin3 = Math.min(i11, i10 - i15);
                iArr2[i14] = iMin3;
                int iMin4 = Math.min(iJ, (i10 - iMin3) - i15);
                int i16 = iArr2[i14] + i15 + iMin4;
                i13++;
                i14++;
                iMin = iMin4;
                i11 = i16;
            }
        }
        int i17 = i11 - iMin;
        c9.e eVar = this.f16554c;
        if (eVar == null || i17 >= i10) {
            return;
        }
        int iIntValue = ((Number) eVar.invoke(Integer.valueOf(i10 - i17), lVar)).intValue();
        int length3 = iArr2.length;
        for (int i18 = 0; i18 < length3; i18++) {
            iArr2[i18] = iArr2[i18] + iIntValue;
        }
    }

    @Override // y.i
    public final void c(m2.b bVar, int i10, int[] iArr, int[] iArr2) {
        b(bVar, i10, iArr, m2.l.f11815a, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m2.e.a(this.f16552a, hVar.f16552a) && this.f16553b == hVar.f16553b && d7.a.d(this.f16554c, hVar.f16554c);
    }

    public final int hashCode() {
        int iC = l.q.c(this.f16553b, Float.hashCode(this.f16552a) * 31, 31);
        c9.e eVar = this.f16554c;
        return iC + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16553b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) m2.e.b(this.f16552a));
        sb.append(", ");
        sb.append(this.f16554c);
        sb.append(')');
        return sb.toString();
    }
}
