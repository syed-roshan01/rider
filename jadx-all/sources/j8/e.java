package j8;

import com.google.firebase.messaging.Constants;
import ea.a0;
import g8.z3;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja.g f8465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object[] f8472j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ja.g gVar, int i10) {
        this(4096, 1, gVar, true);
        this.f8463a = 1;
    }

    public final void a() {
        switch (this.f8463a) {
            case 0:
                Arrays.fill((c[]) this.f8472j, (Object) null);
                this.f8470h = ((c[]) this.f8472j).length - 1;
                this.f8469g = 0;
                this.f8471i = 0;
                break;
            default:
                b9.b.Q((ea.c[]) this.f8472j);
                this.f8469g = ((ea.c[]) this.f8472j).length - 1;
                this.f8470h = 0;
                this.f8471i = 0;
                break;
        }
    }

    public final void b(int i10) {
        int i11;
        int i12;
        int i13 = 0;
        switch (this.f8463a) {
            case 0:
                if (i10 > 0) {
                    int length = ((c[]) this.f8472j).length;
                    while (true) {
                        length--;
                        i11 = this.f8470h;
                        if (length >= i11 && i10 > 0) {
                            int i14 = ((c[]) this.f8472j)[length].f8453c;
                            i10 -= i14;
                            this.f8471i -= i14;
                            this.f8469g--;
                            i13++;
                        }
                    }
                    c[] cVarArr = (c[]) this.f8472j;
                    int i15 = i11 + 1;
                    System.arraycopy(cVarArr, i15, cVarArr, i15 + i13, this.f8469g);
                    this.f8470h += i13;
                }
                break;
            default:
                if (i10 > 0) {
                    int length2 = ((ea.c[]) this.f8472j).length;
                    while (true) {
                        length2--;
                        i12 = this.f8469g;
                        if (length2 >= i12 && i10 > 0) {
                            ea.c cVar = ((ea.c[]) this.f8472j)[length2];
                            d7.a.j(cVar);
                            i10 -= cVar.f5447c;
                            int i16 = this.f8471i;
                            ea.c cVar2 = ((ea.c[]) this.f8472j)[length2];
                            d7.a.j(cVar2);
                            this.f8471i = i16 - cVar2.f5447c;
                            this.f8470h--;
                            i13++;
                        }
                    }
                    ea.c[] cVarArr2 = (ea.c[]) this.f8472j;
                    int i17 = i12 + 1;
                    System.arraycopy(cVarArr2, i17, cVarArr2, i17 + i13, this.f8470h);
                    ea.c[] cVarArr3 = (ea.c[]) this.f8472j;
                    int i18 = this.f8469g + 1;
                    Arrays.fill(cVarArr3, i18, i18 + i13, (Object) null);
                    this.f8469g += i13;
                }
                break;
        }
    }

    public final void c(ea.c cVar) {
        int i10 = this.f8468f;
        int i11 = cVar.f5447c;
        if (i11 > i10) {
            a();
            return;
        }
        b((this.f8471i + i11) - i10);
        int i12 = this.f8470h + 1;
        ea.c[] cVarArr = (ea.c[]) this.f8472j;
        if (i12 > cVarArr.length) {
            ea.c[] cVarArr2 = new ea.c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f8469g = ((ea.c[]) this.f8472j).length - 1;
            this.f8472j = cVarArr2;
        }
        int i13 = this.f8469g;
        this.f8469g = i13 - 1;
        ((ea.c[]) this.f8472j)[i13] = cVar;
        this.f8470h++;
        this.f8471i += i11;
    }

    public final void d(c cVar) {
        int i10 = this.f8468f;
        int i11 = cVar.f8453c;
        if (i11 > i10) {
            a();
            return;
        }
        b((this.f8471i + i11) - i10);
        int i12 = this.f8469g + 1;
        c[] cVarArr = (c[]) this.f8472j;
        if (i12 > cVarArr.length) {
            c[] cVarArr2 = new c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f8470h = ((c[]) this.f8472j).length - 1;
            this.f8472j = cVarArr2;
        }
        int i13 = this.f8470h;
        this.f8470h = i13 - 1;
        ((c[]) this.f8472j)[i13] = cVar;
        this.f8469g++;
        this.f8471i += i11;
    }

    public final void e(ja.j jVar) throws EOFException {
        int i10 = this.f8463a;
        int i11 = 0;
        ja.g gVar = this.f8465c;
        switch (i10) {
            case 0:
                if (this.f8464b) {
                    l lVar = l.f8498d;
                    byte[] bArrS = jVar.s();
                    lVar.getClass();
                    long j10 = 0;
                    for (byte b10 : bArrS) {
                        j10 += (long) l.f8497c[b10 & 255];
                    }
                    if (((int) ((j10 + 7) >> 3)) < jVar.d()) {
                        ja.g gVar2 = new ja.g();
                        l lVar2 = l.f8498d;
                        byte[] bArrS2 = jVar.s();
                        z3 z3Var = new z3(gVar2, 1);
                        lVar2.getClass();
                        int i12 = 0;
                        long j11 = 0;
                        while (i11 < bArrS2.length) {
                            int i13 = bArrS2[i11] & 255;
                            int i14 = l.f8496b[i13];
                            byte b11 = l.f8497c[i13];
                            ja.g gVar3 = gVar;
                            j11 = (j11 << b11) | ((long) i14);
                            i12 += b11;
                            while (i12 >= 8) {
                                i12 -= 8;
                                z3Var.write((int) (j11 >> i12));
                            }
                            i11++;
                            gVar = gVar3;
                        }
                        ja.g gVar4 = gVar;
                        if (i12 > 0) {
                            z3Var.write((int) (((long) (255 >>> i12)) | (j11 << (8 - i12))));
                        }
                        ja.j jVarI = gVar2.i(gVar2.f8534b);
                        g(jVarI.d(), 127, 128);
                        gVar4.e0(jVarI);
                    }
                }
                g(jVar.d(), 127, 0);
                gVar.e0(jVar);
                break;
            default:
                d7.a.m(jVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (this.f8464b) {
                    int[] iArr = a0.f5427a;
                    int iD = jVar.d();
                    long j12 = 0;
                    for (int i15 = 0; i15 < iD; i15++) {
                        byte bI = jVar.i(i15);
                        byte[] bArr = y9.b.f17000a;
                        j12 += (long) a0.f5428b[bI & 255];
                    }
                    if (((int) ((j12 + ((long) 7)) >> 3)) < jVar.d()) {
                        ja.g gVar5 = new ja.g();
                        int[] iArr2 = a0.f5427a;
                        int iD2 = jVar.d();
                        int i16 = 0;
                        long j13 = 0;
                        while (i11 < iD2) {
                            byte bI2 = jVar.i(i11);
                            byte[] bArr2 = y9.b.f17000a;
                            int i17 = bI2 & 255;
                            int i18 = a0.f5427a[i17];
                            byte b12 = a0.f5428b[i17];
                            j13 = (j13 << b12) | ((long) i18);
                            i16 += b12;
                            while (i16 >= 8) {
                                i16 -= 8;
                                gVar5.h0((int) (j13 >> i16));
                            }
                            i11++;
                        }
                        if (i16 > 0) {
                            gVar5.h0((int) ((j13 << (8 - i16)) | (255 >>> i16)));
                        }
                        ja.j jVarI2 = gVar5.i(gVar5.f8534b);
                        g(jVarI2.d(), 127, 128);
                        gVar.e0(jVarI2);
                    }
                }
                g(jVar.d(), 127, 0);
                gVar.e0(jVar);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    public final void f(List list) throws EOFException {
        int length;
        int length2;
        int length3;
        int length4;
        int i10;
        int length5;
        ea.c cVar;
        ea.c cVar2;
        int i11 = this.f8463a;
        ja.g gVar = this.f8465c;
        int i12 = 2;
        switch (i11) {
            case 0:
                if (this.f8467e) {
                    int i13 = this.f8466d;
                    if (i13 < this.f8468f) {
                        g(i13, 31, 32);
                    }
                    this.f8467e = false;
                    this.f8466d = Integer.MAX_VALUE;
                    g(this.f8468f, 31, 32);
                }
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    c cVar3 = (c) list.get(i14);
                    ja.j jVarR = cVar3.f8451a.r();
                    Integer num = (Integer) f.f8475c.get(jVarR);
                    ja.j jVar = cVar3.f8452b;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        length2 = iIntValue + 1;
                        if (length2 < 2 || length2 > 7) {
                            length = length2;
                            length2 = -1;
                        } else {
                            c[] cVarArr = f.f8474b;
                            if (cVarArr[iIntValue].f8452b.equals(jVar)) {
                                length = length2;
                            } else if (cVarArr[length2].f8452b.equals(jVar)) {
                                length2 = iIntValue + 2;
                                length = length2;
                            } else {
                                length = length2;
                                length2 = -1;
                            }
                        }
                    } else {
                        length = -1;
                        length2 = -1;
                    }
                    if (length2 == -1) {
                        int i15 = this.f8470h + 1;
                        while (true) {
                            c[] cVarArr2 = (c[]) this.f8472j;
                            if (i15 < cVarArr2.length) {
                                if (cVarArr2[i15].f8451a.equals(jVarR)) {
                                    if (((c[]) this.f8472j)[i15].f8452b.equals(jVar)) {
                                        length2 = f.f8474b.length + (i15 - this.f8470h);
                                    } else if (length == -1) {
                                        length = (i15 - this.f8470h) + f.f8474b.length;
                                    }
                                }
                                i15++;
                            }
                        }
                    }
                    if (length2 != -1) {
                        g(length2, 127, 128);
                    } else {
                        if (length == -1) {
                            gVar.h0(64);
                            e(jVarR);
                            e(jVar);
                            d(cVar3);
                        } else if (!jVarR.o(f.f8473a) || c.f8450h.equals(jVarR)) {
                            g(length, 63, 64);
                            e(jVar);
                            d(cVar3);
                        } else {
                            g(length, 15, 0);
                            e(jVar);
                        }
                    }
                }
                break;
            default:
                d7.a.m(list, "headerBlock");
                if (this.f8467e) {
                    int i16 = this.f8466d;
                    if (i16 < this.f8468f) {
                        g(i16, 31, 32);
                    }
                    this.f8467e = false;
                    this.f8466d = Integer.MAX_VALUE;
                    g(this.f8468f, 31, 32);
                }
                int size2 = list.size();
                int i17 = 0;
                while (i17 < size2) {
                    ea.c cVar4 = (ea.c) list.get(i17);
                    ja.j jVarR2 = cVar4.f5445a.r();
                    Integer num2 = (Integer) ea.d.f5451b.get(jVarR2);
                    ja.j jVar2 = cVar4.f5446b;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        length3 = iIntValue2 + 1;
                        if (i12 > length3 || length3 >= 8) {
                            length4 = length3;
                            length3 = -1;
                        } else {
                            ea.c[] cVarArr3 = ea.d.f5450a;
                            if (!d7.a.d(cVarArr3[iIntValue2].f5446b, jVar2)) {
                                if (d7.a.d(cVarArr3[length3].f5446b, jVar2)) {
                                    length4 = length3;
                                    length3 = iIntValue2 + 2;
                                } else {
                                    length4 = length3;
                                    length3 = -1;
                                }
                            }
                        }
                        if (length3 == -1) {
                            length5 = ((ea.c[]) this.f8472j).length;
                            for (i10 = this.f8469g + 1; i10 < length5; i10++) {
                                cVar = ((ea.c[]) this.f8472j)[i10];
                                d7.a.j(cVar);
                                if (d7.a.d(cVar.f5445a, jVarR2)) {
                                    cVar2 = ((ea.c[]) this.f8472j)[i10];
                                    d7.a.j(cVar2);
                                    if (d7.a.d(cVar2.f5446b, jVar2)) {
                                        length3 = ea.d.f5450a.length + (i10 - this.f8469g);
                                    } else if (length4 == -1) {
                                        length4 = (i10 - this.f8469g) + ea.d.f5450a.length;
                                    }
                                }
                            }
                        }
                        if (length3 != -1) {
                            g(length3, 127, 128);
                        } else if (length4 == -1) {
                            gVar.h0(64);
                            e(jVarR2);
                            e(jVar2);
                            c(cVar4);
                        } else if (jVarR2.o(ea.c.f5439d) || d7.a.d(ea.c.f5444i, jVarR2)) {
                            g(length4, 63, 64);
                            e(jVar2);
                            c(cVar4);
                        } else {
                            g(length4, 15, 0);
                            e(jVar2);
                        }
                        i17++;
                        i12 = 2;
                    } else {
                        length3 = -1;
                    }
                    length4 = length3;
                    if (length3 == -1) {
                        length5 = ((ea.c[]) this.f8472j).length;
                        while (i10 < length5) {
                            cVar = ((ea.c[]) this.f8472j)[i10];
                            d7.a.j(cVar);
                            if (d7.a.d(cVar.f5445a, jVarR2)) {
                                cVar2 = ((ea.c[]) this.f8472j)[i10];
                                d7.a.j(cVar2);
                                if (d7.a.d(cVar2.f5446b, jVar2)) {
                                    length3 = ea.d.f5450a.length + (i10 - this.f8469g);
                                } else if (length4 == -1) {
                                    length4 = (i10 - this.f8469g) + ea.d.f5450a.length;
                                }
                            }
                        }
                    }
                    if (length3 != -1) {
                        g(length3, 127, 128);
                    } else if (length4 == -1) {
                        gVar.h0(64);
                        e(jVarR2);
                        e(jVar2);
                        c(cVar4);
                    } else if (jVarR2.o(ea.c.f5439d)) {
                        g(length4, 63, 64);
                        e(jVar2);
                        c(cVar4);
                    } else {
                        g(length4, 63, 64);
                        e(jVar2);
                        c(cVar4);
                    }
                    i17++;
                    i12 = 2;
                }
                break;
        }
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f8463a;
        ja.g gVar = this.f8465c;
        switch (i13) {
            case 0:
                if (i10 >= i11) {
                    gVar.h0(i12 | i11);
                    int i14 = i10 - i11;
                    while (i14 >= 128) {
                        gVar.h0((i14 & 127) | 128);
                        i14 >>>= 7;
                    }
                    gVar.h0(i14);
                } else {
                    gVar.h0(i10 | i12);
                }
                break;
            default:
                if (i10 >= i11) {
                    gVar.h0(i12 | i11);
                    int i15 = i10 - i11;
                    while (i15 >= 128) {
                        gVar.h0((i15 & 127) | 128);
                        i15 >>>= 7;
                    }
                    gVar.h0(i15);
                } else {
                    gVar.h0(i10 | i12);
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(ja.g gVar) {
        this(4096, 0, gVar, false);
        this.f8463a = 0;
    }

    public e(int i10, int i11, ja.g gVar, boolean z10) {
        this.f8463a = i11;
        if (i11 != 1) {
            this.f8466d = Integer.MAX_VALUE;
            this.f8472j = new c[8];
            this.f8470h = 7;
            this.f8468f = i10;
            this.f8464b = z10;
            this.f8465c = gVar;
            return;
        }
        this.f8464b = z10;
        this.f8465c = gVar;
        this.f8466d = Integer.MAX_VALUE;
        this.f8468f = i10;
        this.f8472j = new ea.c[8];
        this.f8469g = 7;
    }
}
