package fa;

import com.google.firebase.remoteconfig.internal.Code;
import ja.x;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o7.d0;
import o7.i2;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6416a;

    public /* synthetic */ l(int i10) {
        this.f6416a = i10;
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        byte[] bArr3 = PublicSuffixDatabase.f12724e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    byte b10 = bArr2[i19][i20];
                    byte[] bArr4 = y9.b.f17000a;
                    int i22 = b10 & 255;
                    z10 = z11;
                    i12 = i22;
                }
                byte b11 = bArr[i16 + i21];
                byte[] bArr5 = y9.b.f17000a;
                i13 = i12 - (b11 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length != i20) {
                    z11 = z10;
                } else {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z11 = true;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset charset = StandardCharsets.UTF_8;
                            d7.a.l(charset, "UTF_8");
                            return new String(bArr, i16, i18, charset);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }

    public static final boolean b(x xVar) {
        x xVar2 = ka.f.f10665e;
        xVar.getClass();
        ja.j jVar = ka.c.f10655a;
        ja.j jVarQ = xVar.f8578a;
        int iK = ja.j.k(jVarQ, jVar);
        if (iK == -1) {
            iK = ja.j.k(jVarQ, ka.c.f10656b);
        }
        if (iK != -1) {
            jVarQ = ja.j.q(jVarQ, iK + 1, 0, 2);
        } else if (xVar.g() != null && jVarQ.d() == 2) {
            jVarQ = ja.j.f8539d;
        }
        return !l9.i.H0(jVarQ.t(), ".class", true);
    }

    public static ArrayList c(List list) {
        d7.a.m(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((x9.x) obj) != x9.x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(f9.a.y0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x9.x) it.next()).f16500a);
        }
        return arrayList2;
    }

    public static ja.d d() throws InterruptedException {
        ja.d dVar = ja.d.f8524l;
        d7.a.j(dVar);
        ja.d dVar2 = dVar.f8526f;
        if (dVar2 == null) {
            long jNanoTime = System.nanoTime();
            ja.d.f8521i.await(ja.d.f8522j, TimeUnit.MILLISECONDS);
            ja.d dVar3 = ja.d.f8524l;
            d7.a.j(dVar3);
            if (dVar3.f8526f != null || System.nanoTime() - jNanoTime < ja.d.f8523k) {
                return null;
            }
            return ja.d.f8524l;
        }
        long jNanoTime2 = dVar2.f8527g - System.nanoTime();
        if (jNanoTime2 > 0) {
            ja.d.f8521i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        ja.d dVar4 = ja.d.f8524l;
        d7.a.j(dVar4);
        dVar4.f8526f = dVar2.f8526f;
        dVar2.f8526f = null;
        return dVar2;
    }

    public static void e(long j10, ja.g gVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        if (i11 >= i12) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i17 = i11; i17 < i12; i17++) {
            if (((ja.j) arrayList.get(i17)).d() < i16) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        ja.j jVar = (ja.j) arrayList.get(i11);
        ja.j jVar2 = (ja.j) arrayList.get(i12 - 1);
        int i18 = -1;
        if (i16 == jVar.d()) {
            int iIntValue = ((Number) arrayList2.get(i11)).intValue();
            int i19 = i11 + 1;
            ja.j jVar3 = (ja.j) arrayList.get(i19);
            i13 = i19;
            i14 = iIntValue;
            jVar = jVar3;
        } else {
            i13 = i11;
            i14 = -1;
        }
        if (jVar.i(i16) == jVar2.i(i16)) {
            int iMin = Math.min(jVar.d(), jVar2.d());
            int i20 = 0;
            for (int i21 = i16; i21 < iMin && jVar.i(i21) == jVar2.i(i21); i21++) {
                i20++;
            }
            long j11 = 4;
            long j12 = (gVar.f8534b / j11) + j10 + ((long) 2) + ((long) i20) + 1;
            gVar.k0(-i20);
            gVar.k0(i14);
            int i22 = i20 + i16;
            while (i16 < i22) {
                gVar.k0(jVar.i(i16) & 255);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i22 != ((ja.j) arrayList.get(i13)).d()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                gVar.k0(((Number) arrayList2.get(i13)).intValue());
                return;
            } else {
                ja.g gVar2 = new ja.g();
                gVar.k0(((int) ((gVar2.f8534b / j11) + j12)) * (-1));
                e(j12, gVar2, i22, arrayList, i13, i12, arrayList2);
                gVar.g0(gVar2);
                return;
            }
        }
        int i23 = 1;
        for (int i24 = i13 + 1; i24 < i12; i24++) {
            if (((ja.j) arrayList.get(i24 - 1)).i(i16) != ((ja.j) arrayList.get(i24)).i(i16)) {
                i23++;
            }
        }
        long j13 = 4;
        long j14 = (gVar.f8534b / j13) + j10 + ((long) 2) + ((long) (i23 * 2));
        gVar.k0(i23);
        gVar.k0(i14);
        for (int i25 = i13; i25 < i12; i25++) {
            int i26 = ((ja.j) arrayList.get(i25)).i(i16);
            if (i25 == i13 || i26 != ((ja.j) arrayList.get(i25 - 1)).i(i16)) {
                gVar.k0(i26 & 255);
            }
        }
        ja.g gVar3 = new ja.g();
        int i27 = i13;
        while (i27 < i12) {
            byte bI = ((ja.j) arrayList.get(i27)).i(i16);
            int i28 = i27 + 1;
            int i29 = i28;
            while (true) {
                if (i29 >= i12) {
                    i15 = i12;
                    break;
                } else {
                    if (bI != ((ja.j) arrayList.get(i29)).i(i16)) {
                        i15 = i29;
                        break;
                    }
                    i29++;
                }
            }
            if (i28 == i15 && i16 + 1 == ((ja.j) arrayList.get(i27)).d()) {
                gVar.k0(((Number) arrayList2.get(i27)).intValue());
            } else {
                gVar.k0(((int) ((gVar3.f8534b / j13) + j14)) * i18);
                e(j14, gVar3, i16 + 1, arrayList, i27, i15, arrayList2);
            }
            gVar3 = gVar3;
            i27 = i15;
            i18 = -1;
        }
        gVar.g0(gVar3);
    }

    public static byte[] f(List list) {
        d7.a.m(list, "protocols");
        ja.g gVar = new ja.g();
        for (String str : c(list)) {
            gVar.h0(str.length());
            gVar.n0(str);
        }
        return gVar.M(gVar.f8534b);
    }

    public static ja.j g(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (ka.b.a(str.charAt(i11 + 1)) + (ka.b.a(str.charAt(i11)) << 4));
        }
        return new ja.j(bArr);
    }

    public static ja.j h(String str) {
        d7.a.m(str, "<this>");
        byte[] bytes = str.getBytes(l9.a.f11393a);
        d7.a.l(bytes, "this as java.lang.String).getBytes(charset)");
        ja.j jVar = new ja.j(bytes);
        jVar.f8542c = str;
        return jVar;
    }

    public static x i(String str, boolean z10) {
        d7.a.m(str, "<this>");
        ja.j jVar = ka.c.f10655a;
        ja.g gVar = new ja.g();
        gVar.n0(str);
        return ka.c.d(gVar, z10);
    }

    public static x j(File file) {
        String str = x.f8577b;
        d7.a.m(file, "<this>");
        String string = file.toString();
        d7.a.l(string, "toString(...)");
        return i(string, false);
    }

    public static ja.j k(byte[] bArr) {
        ja.j jVar = ja.j.f8539d;
        int length = bArr.length;
        d0.m(bArr.length, 0, length);
        return new ja.j(b9.b.M(bArr, 0, length));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        this(0);
        this.f6416a = i10;
        switch (i10) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case Code.UNAVAILABLE /* 14 */:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                this(16);
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                this(17);
                break;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                this(18);
                break;
            case 19:
                this(19);
                break;
            default:
                break;
        }
    }
}
