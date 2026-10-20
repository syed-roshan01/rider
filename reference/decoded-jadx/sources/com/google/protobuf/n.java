package com.google.protobuf;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f4181b = new m(y0.f4277b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f4182c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4183a = 0;

    static {
        f4182c = e.a() ? new j(1, 0) : new j(0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118 A[LOOP:0: B:44:0x010e->B:46:0x0118, LOOP_END] */
    public static n g(Iterator it, int i10) {
        w4 w4Var;
        n h2Var;
        h2 h2Var2;
        if (i10 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (n) it.next();
        }
        int i11 = i10 >>> 1;
        n nVarG = g(it, i11);
        n nVarG2 = g(it, i10 - i11);
        if (Integer.MAX_VALUE - nVarG.size() < nVarG2.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + nVarG.size() + "+" + nVarG2.size());
        }
        if (nVarG2.size() == 0) {
            return nVarG;
        }
        if (nVarG.size() == 0) {
            return nVarG2;
        }
        int size = nVarG2.size() + nVarG.size();
        if (size < 128) {
            int size2 = nVarG.size();
            int size3 = nVarG2.size();
            int i12 = size2 + size3;
            byte[] bArr = new byte[i12];
            n(0, size2, nVarG.size());
            n(0, size2, i12);
            if (size2 > 0) {
                nVarG.p(0, bArr, 0, size2);
            }
            n(0, size3, nVarG2.size());
            n(size2, i12, i12);
            if (size3 > 0) {
                nVarG2.p(0, bArr, size2, size3);
            }
            return new m(bArr);
        }
        if (nVarG instanceof h2) {
            h2 h2Var3 = (h2) nVarG;
            n nVar = h2Var3.f4125f;
            int size4 = nVarG2.size() + nVar.size();
            n nVar2 = h2Var3.f4124e;
            if (size4 < 128) {
                int size5 = nVar.size();
                int size6 = nVarG2.size();
                int i13 = size5 + size6;
                byte[] bArr2 = new byte[i13];
                n(0, size5, nVar.size());
                n(0, size5, i13);
                if (size5 > 0) {
                    nVar.p(0, bArr2, 0, size5);
                }
                n(0, size6, nVarG2.size());
                n(size5, i13, i13);
                if (size6 > 0) {
                    nVarG2.p(0, bArr2, size5, size6);
                }
                h2Var2 = new h2(nVar2, new m(bArr2));
            } else {
                if (nVar2.q() > nVar.q()) {
                    if (h2Var3.f4127o > nVarG2.q()) {
                        return new h2(nVar2, new h2(nVar, nVarG2));
                    }
                }
                if (size >= h2.D(Math.max(nVarG.q(), nVarG2.q()) + 1)) {
                    w4Var = new w4((Object) null);
                    w4Var.f(nVarG);
                    w4Var.f(nVarG2);
                    h2Var = (n) ((ArrayDeque) w4Var.f10455b).pop();
                    while (!((ArrayDeque) w4Var.f10455b).isEmpty()) {
                        h2Var = new h2((n) ((ArrayDeque) w4Var.f10455b).pop(), h2Var);
                    }
                    return h2Var;
                }
                h2Var2 = new h2(nVarG, nVarG2);
            }
        } else {
            if (size >= h2.D(Math.max(nVarG.q(), nVarG2.q()) + 1)) {
                w4Var = new w4((Object) null);
                w4Var.f(nVarG);
                w4Var.f(nVarG2);
                h2Var = (n) ((ArrayDeque) w4Var.f10455b).pop();
                while (!((ArrayDeque) w4Var.f10455b).isEmpty()) {
                    h2Var = new h2((n) ((ArrayDeque) w4Var.f10455b).pop(), h2Var);
                }
                return h2Var;
            }
            h2Var2 = new h2(nVarG, nVarG2);
        }
        return h2Var2;
    }

    public static void k(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(l.q.i("Index > length: ", i10, ", ", i11));
            }
            throw new ArrayIndexOutOfBoundsException(l.q.g("Index < 0: ", i10));
        }
    }

    public static int n(int i10, int i11, int i12) {
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

    public static m o(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        int i12 = i10 + i11;
        n(i10, i12, bArr.length);
        switch (f4182c.f4151a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i12);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new m(bArrCopyOfRange);
    }

    public abstract String A(Charset charset);

    public final String B() {
        return size() == 0 ? "" : A(y0.f4276a);
    }

    public abstract void C(n2 n2Var);

    public abstract ByteBuffer e();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iW = this.f4183a;
        if (iW == 0) {
            int size = size();
            iW = w(size, 0, size);
            if (iW == 0) {
                iW = 1;
            }
            this.f4183a = iW;
        }
        return iW;
    }

    public abstract byte i(int i10);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract void p(int i10, byte[] bArr, int i11, int i12);

    public abstract int q();

    public abstract byte r(int i10);

    public abstract boolean s();

    public abstract int size();

    public abstract boolean t();

    public final String toString() {
        String strN;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            strN = n2.N(this);
        } else {
            strN = n2.N(y(0, 47)) + "...";
        }
        objArr[2] = strN;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public i iterator() {
        return new h(this);
    }

    public abstract s v();

    public abstract int w(int i10, int i11, int i12);

    public abstract int x(int i10, int i11, int i12);

    public abstract n y(int i10, int i11);

    public final byte[] z() {
        int size = size();
        if (size == 0) {
            return y0.f4277b;
        }
        byte[] bArr = new byte[size];
        p(0, bArr, 0, size);
        return bArr;
    }
}
