package g2;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f6594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6596d;

    public final int a() {
        m mVar = this.f6594b;
        if (mVar == null) {
            return this.f6593a.length();
        }
        return (mVar.f6578b - mVar.a()) + (this.f6593a.length() - (this.f6596d - this.f6595c));
    }

    public final void b(int i10, int i11, String str) {
        if (i10 > i11) {
            throw new IllegalArgumentException(l.q.i("start index must be less than or equal to end index: ", i10, " > ", i11).toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("start must be non-negative, but was ", i10).toString());
        }
        m mVar = this.f6594b;
        if (mVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(this.f6593a.length() - i11, 64);
            String str2 = this.f6593a;
            int i12 = i10 - iMin;
            d7.a.k(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = this.f6593a;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            d7.a.k(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            this.f6594b = new m(cArr, str.length() + iMin, i13);
            this.f6595c = i12;
            this.f6596d = i14;
            return;
        }
        int i15 = this.f6595c;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > mVar.f6578b - mVar.a()) {
            this.f6593a = toString();
            this.f6594b = null;
            this.f6595c = -1;
            this.f6596d = -1;
            b(i10, i11, str);
            return;
        }
        int length = str.length() - (i17 - i16);
        if (length > mVar.a()) {
            int iA = length - mVar.a();
            int i18 = mVar.f6578b;
            do {
                i18 *= 2;
            } while (i18 - mVar.f6578b < iA);
            char[] cArr2 = new char[i18];
            b9.b.J((char[]) mVar.f6581e, cArr2, 0, 0, mVar.f6579c);
            int i19 = mVar.f6578b;
            int i20 = mVar.f6580d;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            b9.b.J((char[]) mVar.f6581e, cArr2, i22, i20, i21 + i20);
            mVar.f6581e = cArr2;
            mVar.f6578b = i18;
            mVar.f6580d = i22;
        }
        int i23 = mVar.f6579c;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = (char[]) mVar.f6581e;
            b9.b.J(cArr3, cArr3, mVar.f6580d - i24, i17, i23);
            mVar.f6579c = i16;
            mVar.f6580d -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iA2 = mVar.a() + i16;
            int iA3 = mVar.a() + i17;
            int i25 = mVar.f6580d;
            char[] cArr4 = (char[]) mVar.f6581e;
            b9.b.J(cArr4, cArr4, mVar.f6579c, i25, iA2);
            mVar.f6579c += iA2 - i25;
            mVar.f6580d = iA3;
        } else {
            mVar.f6580d = mVar.a() + i17;
            mVar.f6579c = i16;
        }
        str.getChars(0, str.length(), (char[]) mVar.f6581e, mVar.f6579c);
        mVar.f6579c = str.length() + mVar.f6579c;
    }

    public final String toString() {
        m mVar = this.f6594b;
        if (mVar == null) {
            return this.f6593a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f6593a, 0, this.f6595c);
        sb.append((char[]) mVar.f6581e, 0, mVar.f6579c);
        char[] cArr = (char[]) mVar.f6581e;
        int i10 = mVar.f6580d;
        sb.append(cArr, i10, mVar.f6578b - i10);
        String str = this.f6593a;
        sb.append((CharSequence) str, this.f6596d, str.length());
        return sb.toString();
    }
}
