package j8;

import ea.t;
import ja.a0;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f8458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object[] f8462i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(t tVar) {
        this(tVar, 4096);
        this.f8454a = 1;
    }

    public final void a() {
        switch (this.f8454a) {
            case 0:
                int i10 = this.f8456c;
                int i11 = this.f8461h;
                if (i10 < i11) {
                    if (i10 != 0) {
                        d(i11 - i10);
                    } else {
                        b();
                    }
                }
                break;
            default:
                int i12 = this.f8456c;
                int i13 = this.f8461h;
                if (i12 < i13) {
                    if (i12 != 0) {
                        d(i13 - i12);
                    } else {
                        b();
                    }
                }
                break;
        }
    }

    public final void b() {
        switch (this.f8454a) {
            case 0:
                Arrays.fill((c[]) this.f8462i, (Object) null);
                this.f8459f = ((c[]) this.f8462i).length - 1;
                this.f8460g = 0;
                this.f8461h = 0;
                break;
            default:
                b9.b.Q((ea.c[]) this.f8462i);
                this.f8459f = ((ea.c[]) this.f8462i).length - 1;
                this.f8460g = 0;
                this.f8461h = 0;
                break;
        }
    }

    public final int c(int i10) {
        switch (this.f8454a) {
            case 0:
                break;
        }
        return this.f8459f + 1 + i10;
    }

    public final int d(int i10) {
        int i11;
        int i12;
        int i13 = 0;
        switch (this.f8454a) {
            case 0:
                if (i10 > 0) {
                    int length = ((c[]) this.f8462i).length;
                    while (true) {
                        length--;
                        i11 = this.f8459f;
                        if (length >= i11 && i10 > 0) {
                            int i14 = ((c[]) this.f8462i)[length].f8453c;
                            i10 -= i14;
                            this.f8461h -= i14;
                            this.f8460g--;
                            i13++;
                        }
                    }
                    c[] cVarArr = (c[]) this.f8462i;
                    int i15 = i11 + 1;
                    System.arraycopy(cVarArr, i15, cVarArr, i15 + i13, this.f8460g);
                    this.f8459f += i13;
                }
                break;
            default:
                if (i10 > 0) {
                    int length2 = ((ea.c[]) this.f8462i).length;
                    while (true) {
                        length2--;
                        i12 = this.f8459f;
                        if (length2 >= i12 && i10 > 0) {
                            ea.c cVar = ((ea.c[]) this.f8462i)[length2];
                            d7.a.j(cVar);
                            int i16 = cVar.f5447c;
                            i10 -= i16;
                            this.f8461h -= i16;
                            this.f8460g--;
                            i13++;
                        }
                    }
                    ea.c[] cVarArr2 = (ea.c[]) this.f8462i;
                    int i17 = i12 + 1;
                    System.arraycopy(cVarArr2, i17, cVarArr2, i17 + i13, this.f8460g);
                    this.f8459f += i13;
                }
                break;
        }
        return i13;
    }

    public final ja.j e(int i10) throws IOException {
        switch (this.f8454a) {
            case 0:
                if (h(i10)) {
                    return f.f8474b[i10].f8451a;
                }
                int iC = c(i10 - f.f8474b.length);
                if (iC >= 0) {
                    c[] cVarArr = (c[]) this.f8462i;
                    if (iC < cVarArr.length) {
                        return cVarArr[iC].f8451a;
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            default:
                if (h(i10)) {
                    return ea.d.f5450a[i10].f5445a;
                }
                int iC2 = c(i10 - ea.d.f5450a.length);
                if (iC2 >= 0) {
                    ea.c[] cVarArr2 = (ea.c[]) this.f8462i;
                    if (iC2 < cVarArr2.length) {
                        ea.c cVar = cVarArr2[iC2];
                        d7.a.j(cVar);
                        return cVar.f5445a;
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
        }
    }

    public final void f(ea.c cVar) {
        this.f8457d.add(cVar);
        int i10 = this.f8456c;
        int i11 = cVar.f5447c;
        if (i11 > i10) {
            b();
            return;
        }
        d((this.f8461h + i11) - i10);
        int i12 = this.f8460g + 1;
        ea.c[] cVarArr = (ea.c[]) this.f8462i;
        if (i12 > cVarArr.length) {
            ea.c[] cVarArr2 = new ea.c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f8459f = ((ea.c[]) this.f8462i).length - 1;
            this.f8462i = cVarArr2;
        }
        int i13 = this.f8459f;
        this.f8459f = i13 - 1;
        ((ea.c[]) this.f8462i)[i13] = cVar;
        this.f8460g++;
        this.f8461h += i11;
    }

    public final void g(c cVar) {
        this.f8457d.add(cVar);
        int i10 = this.f8456c;
        int i11 = cVar.f8453c;
        if (i11 > i10) {
            b();
            return;
        }
        d((this.f8461h + i11) - i10);
        int i12 = this.f8460g + 1;
        c[] cVarArr = (c[]) this.f8462i;
        if (i12 > cVarArr.length) {
            c[] cVarArr2 = new c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f8459f = ((c[]) this.f8462i).length - 1;
            this.f8462i = cVarArr2;
        }
        int i13 = this.f8459f;
        this.f8459f = i13 - 1;
        ((c[]) this.f8462i)[i13] = cVar;
        this.f8460g++;
        this.f8461h += i11;
    }

    public final boolean h(int i10) {
        switch (this.f8454a) {
            case 0:
                return i10 >= 0 && i10 <= f.f8474b.length - 1;
            default:
                return i10 >= 0 && i10 <= ea.d.f5450a.length - 1;
        }
    }

    public final int i() {
        int i10 = this.f8454a;
        a0 a0Var = this.f8458e;
        switch (i10) {
            case 0:
                return a0Var.readByte() & 255;
            default:
                byte b10 = a0Var.readByte();
                byte[] bArr = y9.b.f17000a;
                return b10 & 255;
        }
    }

    public final ja.j j() throws EOFException {
        boolean z10;
        int i10 = this.f8454a;
        a0 a0Var = this.f8458e;
        int i11 = 0;
        switch (i10) {
            case 0:
                int i12 = i();
                z10 = (i12 & 128) == 128;
                int iM = m(i12, 127);
                if (!z10) {
                    return a0Var.i(iM);
                }
                l lVar = l.f8498d;
                long j10 = iM;
                a0Var.S(j10);
                byte[] bArrM = a0Var.f8502b.M(j10);
                lVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                k3.b bVar = lVar.f8499a;
                k3.b bVar2 = bVar;
                int i13 = 0;
                int i14 = 0;
                while (i11 < bArrM.length) {
                    i13 = (i13 << 8) | (bArrM[i11] & 255);
                    i14 += 8;
                    while (i14 >= 8) {
                        bVar2 = ((k3.b[]) bVar2.f9722d)[(i13 >>> (i14 - 8)) & 255];
                        if (((k3.b[]) bVar2.f9722d) == null) {
                            byteArrayOutputStream.write(bVar2.f9720b);
                            i14 -= bVar2.f9721c;
                            bVar2 = bVar;
                        } else {
                            i14 -= 8;
                        }
                    }
                    i11++;
                }
                while (i14 > 0) {
                    k3.b bVar3 = ((k3.b[]) bVar2.f9722d)[(i13 << (8 - i14)) & 255];
                    if (((k3.b[]) bVar3.f9722d) != null || bVar3.f9721c > i14) {
                        return ja.j.l(byteArrayOutputStream.toByteArray());
                    }
                    byteArrayOutputStream.write(bVar3.f9720b);
                    i14 -= bVar3.f9721c;
                    bVar2 = bVar;
                }
                return ja.j.l(byteArrayOutputStream.toByteArray());
            default:
                int i15 = i();
                z10 = (i15 & 128) == 128;
                long jM = m(i15, 127);
                if (!z10) {
                    return a0Var.i(jM);
                }
                ja.g gVar = new ja.g();
                int[] iArr = ea.a0.f5427a;
                d7.a.m(a0Var, "source");
                k3.b bVar4 = ea.a0.f5429c;
                k3.b bVar5 = bVar4;
                int i16 = 0;
                for (long j11 = 0; j11 < jM; j11++) {
                    byte b10 = a0Var.readByte();
                    byte[] bArr = y9.b.f17000a;
                    i11 = (i11 << 8) | (b10 & 255);
                    i16 += 8;
                    while (i16 >= 8) {
                        k3.b[] bVarArr = (k3.b[]) bVar5.f9722d;
                        d7.a.j(bVarArr);
                        bVar5 = bVarArr[(i11 >>> (i16 - 8)) & 255];
                        d7.a.j(bVar5);
                        if (((k3.b[]) bVar5.f9722d) == null) {
                            gVar.h0(bVar5.f9720b);
                            i16 -= bVar5.f9721c;
                            bVar5 = bVar4;
                        } else {
                            i16 -= 8;
                        }
                    }
                }
                while (i16 > 0) {
                    k3.b[] bVarArr2 = (k3.b[]) bVar5.f9722d;
                    d7.a.j(bVarArr2);
                    k3.b bVar6 = bVarArr2[(i11 << (8 - i16)) & 255];
                    d7.a.j(bVar6);
                    if (((k3.b[]) bVar6.f9722d) != null || bVar6.f9721c > i16) {
                        return gVar.i(gVar.f8534b);
                    }
                    gVar.h0(bVar6.f9720b);
                    i16 -= bVar6.f9721c;
                    bVar5 = bVar4;
                }
                return gVar.i(gVar.f8534b);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        int i10 = this.f8454a;
        a0 a0Var = this.f8458e;
        switch (i10) {
            case 0:
                while (!a0Var.B()) {
                    byte b10 = a0Var.readByte();
                    int i11 = b10 & 255;
                    if (i11 == 128) {
                        throw new IOException("index == 0");
                    }
                    if ((b10 & 128) == 128) {
                        l(m(i11, 127) - 1);
                    } else if (i11 == 64) {
                        o();
                    } else if ((b10 & 64) == 64) {
                        n(m(i11, 63) - 1);
                    } else if ((b10 & 32) == 32) {
                        int iM = m(i11, 31);
                        this.f8456c = iM;
                        if (iM < 0 || iM > this.f8455b) {
                            throw new IOException("Invalid dynamic table size update " + this.f8456c);
                        }
                        a();
                    } else if (i11 == 16 || i11 == 0) {
                        q();
                    } else {
                        p(m(i11, 15) - 1);
                    }
                }
                return;
            default:
                while (!a0Var.B()) {
                    byte b11 = a0Var.readByte();
                    byte[] bArr = y9.b.f17000a;
                    int i12 = b11 & 255;
                    if (i12 == 128) {
                        throw new IOException("index == 0");
                    }
                    if ((b11 & 128) == 128) {
                        l(m(i12, 127) - 1);
                    } else if (i12 == 64) {
                        o();
                    } else if ((b11 & 64) == 64) {
                        n(m(i12, 63) - 1);
                    } else if ((b11 & 32) == 32) {
                        int iM2 = m(i12, 31);
                        this.f8456c = iM2;
                        if (iM2 < 0 || iM2 > this.f8455b) {
                            throw new IOException("Invalid dynamic table size update " + this.f8456c);
                        }
                        a();
                    } else if (i12 == 16 || i12 == 0) {
                        q();
                    } else {
                        p(m(i12, 15) - 1);
                    }
                }
                return;
        }
    }

    public final void l(int i10) throws IOException {
        ArrayList arrayList = this.f8457d;
        switch (this.f8454a) {
            case 0:
                if (h(i10)) {
                    arrayList.add(f.f8474b[i10]);
                    return;
                }
                int iC = c(i10 - f.f8474b.length);
                if (iC >= 0) {
                    c[] cVarArr = (c[]) this.f8462i;
                    if (iC <= cVarArr.length - 1) {
                        arrayList.add(cVarArr[iC]);
                        return;
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            default:
                if (h(i10)) {
                    arrayList.add(ea.d.f5450a[i10]);
                    return;
                }
                int iC2 = c(i10 - ea.d.f5450a.length);
                if (iC2 >= 0) {
                    ea.c[] cVarArr2 = (ea.c[]) this.f8462i;
                    if (iC2 < cVarArr2.length) {
                        ea.c cVar = cVarArr2[iC2];
                        d7.a.j(cVar);
                        arrayList.add(cVar);
                        return;
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
        }
    }

    public final int m(int i10, int i11) {
        int i12 = 0;
        switch (this.f8454a) {
            case 0:
                int i13 = i10 & i11;
                if (i13 < i11) {
                    return i13;
                }
                while (true) {
                    int i14 = i();
                    if ((i14 & 128) == 0) {
                        return (i14 << i12) + i11;
                    }
                    i11 += (i14 & 127) << i12;
                    i12 += 7;
                }
                break;
            default:
                int i15 = i10 & i11;
                if (i15 < i11) {
                    return i15;
                }
                while (true) {
                    int i16 = i();
                    if ((i16 & 128) == 0) {
                        return (i16 << i12) + i11;
                    }
                    i11 += (i16 & 127) << i12;
                    i12 += 7;
                }
                break;
        }
    }

    public final void n(int i10) {
        switch (this.f8454a) {
            case 0:
                g(new c(e(i10), j()));
                break;
            default:
                f(new ea.c(e(i10), j()));
                break;
        }
    }

    public final void o() throws IOException {
        switch (this.f8454a) {
            case 0:
                ja.j jVarJ = j();
                f.a(jVarJ);
                g(new c(jVarJ, j()));
                break;
            default:
                ea.c[] cVarArr = ea.d.f5450a;
                ja.j jVarJ2 = j();
                ea.d.a(jVarJ2);
                f(new ea.c(jVarJ2, j()));
                break;
        }
    }

    public final void p(int i10) {
        ArrayList arrayList = this.f8457d;
        switch (this.f8454a) {
            case 0:
                arrayList.add(new c(e(i10), j()));
                break;
            default:
                arrayList.add(new ea.c(e(i10), j()));
                break;
        }
    }

    public final void q() throws IOException {
        ArrayList arrayList = this.f8457d;
        switch (this.f8454a) {
            case 0:
                ja.j jVarJ = j();
                f.a(jVarJ);
                arrayList.add(new c(jVarJ, j()));
                break;
            default:
                ea.c[] cVarArr = ea.d.f5450a;
                ja.j jVarJ2 = j();
                ea.d.a(jVarJ2);
                arrayList.add(new ea.c(jVarJ2, j()));
                break;
        }
    }

    public d(t tVar, int i10) {
        this.f8454a = 1;
        this.f8455b = 4096;
        this.f8456c = i10;
        this.f8457d = new ArrayList();
        this.f8458e = r9.a.c(tVar);
        this.f8462i = new ea.c[8];
        this.f8459f = 7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(g gVar, int i10) {
        this(gVar);
        this.f8454a = 0;
    }

    public d(g gVar) {
        this.f8454a = 0;
        this.f8457d = new ArrayList();
        this.f8462i = new c[8];
        this.f8459f = 7;
        this.f8460g = 0;
        this.f8461h = 0;
        this.f8455b = 4096;
        this.f8456c = 4096;
        this.f8458e = r9.a.c(gVar);
    }
}
