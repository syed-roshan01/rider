package g2;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6564b;

    public h(int i10, int i11) {
        this.f6563a = i10;
        this.f6564b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // g2.i
    public final void a(k kVar) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f6563a; i11++) {
            int i12 = i10 + 1;
            int i13 = kVar.f6572b;
            if (i13 > i12) {
                char cB = kVar.b((i13 - i12) - 1);
                char cB2 = kVar.b(kVar.f6572b - i12);
                if (Character.isHighSurrogate(cB) && Character.isLowSurrogate(cB2)) {
                    i10 += 2;
                } else {
                    i10 = i12;
                }
            } else {
                i10 = i12;
            }
            if (i10 == kVar.f6572b) {
                break;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f6564b; i15++) {
            int i16 = i14 + 1;
            int i17 = kVar.f6573c + i16;
            t tVar = kVar.f6571a;
            if (i17 < tVar.a()) {
                char cB3 = kVar.b((kVar.f6573c + i16) - 1);
                char cB4 = kVar.b(kVar.f6573c + i16);
                if (Character.isHighSurrogate(cB3) && Character.isLowSurrogate(cB4)) {
                    i14 += 2;
                } else {
                    i14 = i16;
                }
            } else {
                i14 = i16;
            }
            if (kVar.f6573c + i14 == tVar.a()) {
                break;
            }
        }
        int i18 = kVar.f6573c;
        kVar.a(i18, i14 + i18);
        int i19 = kVar.f6572b;
        kVar.a(i19 - i10, i19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6563a == hVar.f6563a && this.f6564b == hVar.f6564b;
    }

    public final int hashCode() {
        return (this.f6563a * 31) + this.f6564b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f6563a);
        sb.append(", lengthAfterCursor=");
        return a7.a.o(sb, this.f6564b, ')');
    }
}
