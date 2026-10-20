package s6;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    public c(String str, String str2, Character ch) {
        this(new a(str, str2.toCharArray()), ch);
    }

    @Override // s6.e
    public final int b(byte[] bArr, CharSequence charSequence) throws d {
        CharSequence charSequenceF = f(charSequence);
        int length = charSequenceF.length();
        a aVar = this.f14058a;
        if (!aVar.f14055h[length % aVar.f14052e]) {
            throw new d("Invalid input length " + charSequenceF.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceF.length()) {
            int i12 = i10 + 2;
            int iA = (aVar.a(charSequenceF.charAt(i10 + 1)) << 12) | (aVar.a(charSequenceF.charAt(i10)) << 18);
            int i13 = i11 + 1;
            bArr[i11] = (byte) (iA >>> 16);
            if (i12 < charSequenceF.length()) {
                int i14 = i10 + 3;
                int iA2 = iA | (aVar.a(charSequenceF.charAt(i12)) << 6);
                int i15 = i11 + 2;
                bArr[i13] = (byte) ((iA2 >>> 8) & 255);
                if (i14 < charSequenceF.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iA2 | aVar.a(charSequenceF.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i11 = i13;
                i10 = i12;
            }
        }
        return i11;
    }

    @Override // s6.e
    public final void e(StringBuilder sb, byte[] bArr, int i10) {
        int i11 = 0;
        y3.e.L(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = i11 + 2;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
            i11 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            a aVar = this.f14058a;
            sb.append(aVar.f14049b[i15 >>> 18]);
            char[] cArr = aVar.f14049b;
            sb.append(cArr[(i15 >>> 12) & 63]);
            sb.append(cArr[(i15 >>> 6) & 63]);
            sb.append(cArr[i15 & 63]);
        }
        if (i11 < i10) {
            d(sb, bArr, i11, i10 - i11);
        }
    }

    public final e g(a aVar) {
        return new c(aVar, null);
    }

    public c(a aVar, Character ch) {
        super(aVar, ch);
        y3.e.H(aVar.f14049b.length == 64);
    }
}
