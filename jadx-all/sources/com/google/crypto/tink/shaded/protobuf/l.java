package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f3571b = new k(f0.f3535b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f3572c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3573a;

    static {
        f3572c = d.a() ? new i(1, 0) : new i(0, 0);
    }

    public static int g(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(l.q.h("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(l.q.i("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(l.q.i("End index: ", i11, " >= ", i12));
    }

    public static k i(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        int i12 = i10 + i11;
        g(i10, i12, bArr.length);
        switch (f3572c.f3546a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i12);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new k(bArrCopyOfRange);
    }

    public abstract byte e(int i10);

    public final int hashCode() {
        int i10 = this.f3573a;
        if (i10 == 0) {
            int size = size();
            k kVar = (k) this;
            int iP = kVar.p();
            int i11 = size;
            for (int i12 = iP; i12 < iP + size; i12++) {
                i11 = (i11 * 31) + kVar.f3566d[i12];
            }
            i10 = i11 == 0 ? 1 : i11;
            this.f3573a = i10;
        }
        return i10;
    }

    public abstract void k(byte[] bArr, int i10);

    public abstract byte n(int i10);

    public final byte[] o() {
        int size = size();
        if (size == 0) {
            return f0.f3535b;
        }
        byte[] bArr = new byte[size];
        k(bArr, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        k jVar;
        String string;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            string = h6.g.U(this);
        } else {
            StringBuilder sb = new StringBuilder();
            k kVar = (k) this;
            int iG = g(0, 47, kVar.size());
            if (iG == 0) {
                jVar = f3571b;
            } else {
                jVar = new j(kVar.f3566d, kVar.p(), iG);
            }
            sb.append(h6.g.U(jVar));
            sb.append("...");
            string = sb.toString();
        }
        objArr[2] = string;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
