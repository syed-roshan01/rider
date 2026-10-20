package s6;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f14057c = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f14059b;

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public e(a aVar, Character ch) {
        boolean z10;
        aVar.getClass();
        this.f14058a = aVar;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = aVar.f14054g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        y3.e.E(ch, "Padding character %s was already in alphabet", z10);
        this.f14059b = ch;
    }

    public final byte[] a(String str) {
        try {
            CharSequence charSequenceF = f(str);
            int length = (int) (((((long) this.f14058a.f14051d) * ((long) charSequenceF.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, charSequenceF);
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (d e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws d {
        int i10;
        int i11;
        CharSequence charSequenceF = f(charSequence);
        int length = charSequenceF.length();
        a aVar = this.f14058a;
        if (!aVar.f14055h[length % aVar.f14052e]) {
            throw new d("Invalid input length " + charSequenceF.length());
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < charSequenceF.length()) {
            long jA = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                i10 = aVar.f14051d;
                i11 = aVar.f14052e;
                if (i14 >= i11) {
                    break;
                }
                jA <<= i10;
                if (i12 + i14 < charSequenceF.length()) {
                    jA |= (long) aVar.a(charSequenceF.charAt(i15 + i12));
                    i15++;
                }
                i14++;
            }
            int i16 = aVar.f14053f;
            int i17 = (i16 * 8) - (i15 * i10);
            int i18 = (i16 - 1) * 8;
            while (i18 >= i17) {
                bArr[i13] = (byte) ((jA >>> i18) & 255);
                i18 -= 8;
                i13++;
            }
            i12 += i11;
        }
        return i13;
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        y3.e.L(0, length, bArr.length);
        a aVar = this.f14058a;
        StringBuilder sb = new StringBuilder(h6.g.R(length, aVar.f14053f, RoundingMode.CEILING) * aVar.f14052e);
        try {
            e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void d(StringBuilder sb, byte[] bArr, int i10, int i11) {
        y3.e.L(i10, i10 + i11, bArr.length);
        a aVar = this.f14058a;
        int i12 = 0;
        y3.e.H(i11 <= aVar.f14053f);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = aVar.f14051d;
        int i15 = ((i11 + 1) * 8) - i14;
        while (i12 < i11 * 8) {
            sb.append(aVar.f14049b[((int) (j10 >>> (i15 - i12))) & aVar.f14050c]);
            i12 += i14;
        }
        Character ch = this.f14059b;
        if (ch != null) {
            while (i12 < aVar.f14053f * 8) {
                sb.append(ch.charValue());
                i12 += i14;
            }
        }
    }

    public void e(StringBuilder sb, byte[] bArr, int i10) {
        int i11 = 0;
        y3.e.L(0, i10, bArr.length);
        while (i11 < i10) {
            a aVar = this.f14058a;
            d(sb, bArr, i11, Math.min(aVar.f14053f, i10 - i11));
            i11 += aVar.f14053f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14058a.equals(eVar.f14058a) && Objects.equals(this.f14059b, eVar.f14059b);
    }

    public final CharSequence f(CharSequence charSequence) {
        Character ch = this.f14059b;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return this.f14058a.hashCode() ^ Objects.hashCode(this.f14059b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        a aVar = this.f14058a;
        sb.append(aVar);
        if (8 % aVar.f14051d != 0) {
            Character ch = this.f14059b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public e(String str, String str2, Character ch) {
        this(new a(str, str2.toCharArray()), ch);
    }
}
