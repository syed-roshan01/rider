package ca;

import fa.l;
import ja.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l9.i;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import r8.r;
import x9.b0;
import x9.k;
import x9.q;
import x9.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        j jVar = j.f8539d;
        l.h("\"\\");
        l.h("\t ,=");
    }

    public static final boolean a(b0 b0Var) {
        if (d7.a.d((String) b0Var.f16344a.f10911c, "HEAD")) {
            return false;
        }
        int i10 = b0Var.f16347d;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && y9.b.i(b0Var) == -1 && !i.K0("chunked", b0.b(b0Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v2 */
    public static final void b(k kVar, s sVar, q qVar) {
        List list;
        long j10;
        String str;
        int i10;
        String str2;
        x9.j jVar;
        d7.a.m(kVar, "<this>");
        d7.a.m(sVar, "url");
        d7.a.m(qVar, "headers");
        if (kVar == k.f16433b) {
            return;
        }
        Pattern pattern = x9.j.f16420j;
        int size = qVar.size();
        int i11 = 0;
        ArrayList arrayList = null;
        for (int i12 = 0; i12 < size; i12++) {
            if (i.K0("Set-Cookie", qVar.i(i12))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(qVar.n(i12));
            }
        }
        List listUnmodifiableList = r.f13661a;
        if (arrayList != null) {
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            d7.a.l(listUnmodifiableList2, "{\n      Collections.unmodifiableList(result)\n    }");
            list = listUnmodifiableList2;
        } else {
            list = listUnmodifiableList;
        }
        int size2 = list.size();
        int i13 = 0;
        ArrayList arrayList2 = null;
        while (i13 < size2) {
            String str3 = (String) list.get(i13);
            d7.a.m(str3, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = y9.b.f17000a;
            char c10 = ';';
            int iD = y9.b.d(str3, ';', i11, str3.length());
            char c11 = '=';
            int iD2 = y9.b.d(str3, '=', i11, iD);
            if (iD2 == iD) {
                i10 = i11;
                jVar = null;
                break;
            }
            String strW = y9.b.w(i11, iD2, str3);
            if (strW.length() == 0 || y9.b.k(strW) != -1) {
                i10 = i11;
                jVar = null;
                break;
            }
            String strW2 = y9.b.w(iD2 + 1, iD, str3);
            if (y9.b.k(strW2) == -1) {
                int i14 = iD + 1;
                int length = str3.length();
                int i15 = i11;
                boolean z10 = i15 == true ? 1 : 0;
                boolean z11 = z10 ? 1 : 0;
                long j11 = -1;
                long jM = 253402300799999L;
                String str4 = null;
                boolean z12 = true;
                String str5 = null;
                boolean z13 = i15;
                while (true) {
                    if (i14 >= length) {
                        if (j11 == Long.MIN_VALUE) {
                            j10 = Long.MIN_VALUE;
                        } else if (j11 != -1) {
                            long j12 = jCurrentTimeMillis + (j11 <= 9223372036854775L ? j11 * ((long) 1000) : Long.MAX_VALUE);
                            j10 = (j12 < jCurrentTimeMillis || j12 > 253402300799999L) ? 253402300799999L : j12;
                        } else {
                            j10 = jM;
                        }
                        String str6 = sVar.f16458d;
                        if (str4 == null) {
                            str = str6;
                        } else if (d7.a.d(str6, str4) || (i.H0(str6, str4, false) && str6.charAt((str6.length() - str4.length()) - 1) == '.' && !y9.b.f17004e.a(str6))) {
                            str = str4;
                        } else {
                            i10 = 0;
                        }
                        if (str6.length() != str.length() && PublicSuffixDatabase.f12726g.a(str) == null) {
                            jVar = null;
                            i10 = 0;
                            break;
                        }
                        String strSubstring = "/";
                        String str7 = str5;
                        i10 = 0;
                        if (str7 == null || !i.h1(str7, "/", false)) {
                            String strB = sVar.b();
                            int iS0 = i.S0(strB, '/', 0, 6);
                            if (iS0 != 0) {
                                strSubstring = strB.substring(0, iS0);
                                d7.a.l(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            str2 = strSubstring;
                        } else {
                            str2 = str7;
                        }
                        jVar = new x9.j(strW, strW2, j10, str, str2, z13, z10, z11, z12);
                        break;
                    }
                    int iD3 = y9.b.d(str3, c10, i14, length);
                    int iD4 = y9.b.d(str3, c11, i14, iD3);
                    String strW3 = y9.b.w(i14, iD4, str3);
                    String strW4 = iD4 < iD3 ? y9.b.w(iD4 + 1, iD3, str3) : "";
                    if (i.K0(strW3, "expires")) {
                        try {
                            jM = q8.k.m(strW4.length(), strW4);
                            z11 = true;
                        } catch (NumberFormatException | IllegalArgumentException unused) {
                        }
                    } else if (i.K0(strW3, "max-age")) {
                        try {
                            long j13 = Long.parseLong(strW4);
                            j11 = j13 > 0 ? j13 : Long.MIN_VALUE;
                        } catch (NumberFormatException e4) {
                            Pattern patternCompile = Pattern.compile("-?\\d+");
                            d7.a.l(patternCompile, "compile(...)");
                            if (!patternCompile.matcher(strW4).matches()) {
                                throw e4;
                            }
                            j11 = i.h1(strW4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                        }
                        z11 = true;
                    } else if (i.K0(strW3, "domain")) {
                        if (!(!i.H0(strW4, ".", false))) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        String strX0 = h6.g.x0(i.a1(".", strW4));
                        if (strX0 == null) {
                            throw new IllegalArgumentException();
                        }
                        str4 = strX0;
                        z12 = false;
                    } else if (i.K0(strW3, "path")) {
                        str5 = strW4;
                    } else if (i.K0(strW3, "secure")) {
                        z13 = 1;
                    } else if (i.K0(strW3, "httponly")) {
                        z10 = true;
                    }
                    i14 = iD3 + 1;
                    c10 = ';';
                    c11 = '=';
                    z13 = z13;
                }
            } else {
                i10 = i11;
            }
            jVar = null;
            break;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i13++;
            i11 = i10;
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            d7.a.l(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        listUnmodifiableList.isEmpty();
    }
}
