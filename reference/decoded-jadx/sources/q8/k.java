package q8;

import b0.j0;
import d7.t;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import l.q;
import r8.r;
import x9.e0;
import x9.o;
import x9.s;
import x9.u;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f13234a = new k();

    public static final x9.g a(k kVar, String str) {
        x9.g gVar = new x9.g(str);
        x9.g.f16392d.put(str, gVar);
        return gVar;
    }

    public static String b(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12) {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z14 = (i12 & 8) != 0 ? false : z10;
        boolean z15 = (i12 & 16) != 0 ? false : z11;
        boolean z16 = (i12 & 32) != 0 ? false : z12;
        boolean z17 = (i12 & 64) == 0 ? z13 : false;
        d7.a.m(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 32;
            int i15 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z17) || l9.i.G0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z14 || (z15 && !j(iCharCount, length, str)))) || (iCodePointAt == 43 && z16)))) {
                ja.g gVar = new ja.g();
                gVar.m0(i13, iCharCount, str);
                ja.g gVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z14 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z16) {
                            gVar.n0(z14 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i14 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i15 && !z17) || l9.i.G0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z14 || (z15 && !j(iCharCount, length, str)))))) {
                            if (gVar2 == null) {
                                gVar2 = new ja.g();
                            }
                            gVar2.o0(iCodePointAt2);
                            while (!gVar2.B()) {
                                byte b10 = gVar2.readByte();
                                gVar.h0(37);
                                char[] cArr = s.f16454k;
                                gVar.h0(cArr[((b10 & 255) >> 4) & 15]);
                                gVar.h0(cArr[b10 & 15]);
                            }
                        } else {
                            gVar.o0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 32;
                    i15 = 128;
                }
                return gVar.Q();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static void c(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= '\u007f') {
                throw new IllegalArgumentException(y9.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
            }
        }
    }

    public static void d(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(q.i("fromIndex: ", i10, " > toIndex: ", i11));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static void e(String str, String str2) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= '\u007f')) {
                StringBuilder sb = new StringBuilder();
                sb.append(y9.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                sb.append(y9.b.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static int f(int i10, int i11, String str, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= '\u007f' || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static o h(SSLSession sSLSession) throws IOException {
        List listJ;
        List listJ2 = r.f13661a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        if (d7.a.d(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || d7.a.d(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        x9.g gVarG = x9.g.f16390b.g(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        if (d7.a.d("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        e0 e0VarQ = v.q(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listJ = peerCertificates != null ? y9.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listJ2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listJ2 = y9.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new o(e0VarQ, gVarG, listJ2, new j0(2, listJ));
    }

    public static u i(String str) {
        Matcher matcher = u.f16465b.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        d7.a.l(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        d7.a.l(locale, "US");
        d7.a.l(strGroup.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        d7.a.l(strGroup2, "typeSubtype.group(2)");
        d7.a.l(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = u.f16466c.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                d7.a.l(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (l9.i.h1(strGroup4, "'", false) && l9.i.H0(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    d7.a.l(strGroup4, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new u(str);
    }

    public static boolean j(int i10, int i11, String str) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && y9.b.p(str.charAt(i10 + 1)) != -1 && y9.b.p(str.charAt(i12)) != -1;
    }

    public static x9.q k(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr2[i11];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            strArr2[i11] = l9.i.o1(str).toString();
        }
        int iZ = t.Z(0, strArr2.length - 1, 2);
        if (iZ >= 0) {
            while (true) {
                String str2 = strArr2[i10];
                String str3 = strArr2[i10 + 1];
                c(str2);
                e(str3, str2);
                if (i10 == iZ) {
                    break;
                }
                i10 += 2;
            }
        }
        return new x9.q(strArr2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x006a A[EDGE_INSN: B:132:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    public static x9.c l(x9.q qVar) {
        int i10;
        int i11;
        int length;
        int length2;
        String string;
        String string2;
        x9.q qVar2 = qVar;
        d7.a.m(qVar2, "headers");
        int size = qVar.size();
        int i12 = 0;
        boolean z10 = true;
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        int iV = -1;
        int iV2 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int iV3 = -1;
        int iV4 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (i12 < size) {
            String strI = qVar2.i(i12);
            String strN = qVar2.n(i12);
            if (l9.i.K0(strI, "Cache-Control")) {
                if (str == null) {
                    str = strN;
                }
                i11 = 0;
                while (i11 < strN.length()) {
                    length = strN.length();
                    length2 = i11;
                    while (true) {
                        if (length2 < length) {
                            size = size;
                            length2 = strN.length();
                            break;
                        }
                        size = size;
                        if (l9.i.G0("=,;", strN.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = size;
                    }
                    String strSubstring = strN.substring(i11, length2);
                    d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    string = l9.i.o1(strSubstring).toString();
                    if (length2 != strN.length() || strN.charAt(length2) == ',' || strN.charAt(length2) == ';') {
                        i11 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = y9.b.f17000a;
                        int length4 = strN.length();
                        while (true) {
                            if (length3 >= length4) {
                                length3 = strN.length();
                                break;
                            }
                            char cCharAt = strN.charAt(length3);
                            int i13 = length4;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                            length3++;
                            length4 = i13;
                        }
                        if (length3 >= strN.length() || strN.charAt(length3) != '\"') {
                            int length5 = strN.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strN.length();
                                    break;
                                }
                                int i14 = length5;
                                if (l9.i.G0(",;", strN.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i14;
                            }
                            String strSubstring2 = strN.substring(length3, length6);
                            d7.a.l(strSubstring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                            string2 = l9.i.o1(strSubstring2).toString();
                            i11 = length6;
                        } else {
                            int i15 = length3 + 1;
                            int iO0 = l9.i.O0(strN, '\"', i15, false, 4);
                            string2 = strN.substring(i15, iO0);
                            d7.a.l(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                            i11 = iO0 + 1;
                        }
                    }
                    if (l9.i.K0("no-cache", string)) {
                        z11 = true;
                    } else if (l9.i.K0("no-store", string)) {
                        z12 = true;
                    } else if (l9.i.K0("max-age", string)) {
                        iV = y9.b.v(-1, string2);
                    } else if (l9.i.K0("s-maxage", string)) {
                        iV2 = y9.b.v(-1, string2);
                    } else if (l9.i.K0("private", string)) {
                        z13 = true;
                    } else if (l9.i.K0("public", string)) {
                        z14 = true;
                    } else if (l9.i.K0("must-revalidate", string)) {
                        z15 = true;
                    } else if (l9.i.K0("max-stale", string)) {
                        iV3 = y9.b.v(Integer.MAX_VALUE, string2);
                    } else if (l9.i.K0("min-fresh", string)) {
                        iV4 = y9.b.v(-1, string2);
                    } else if (l9.i.K0("only-if-cached", string)) {
                        z16 = true;
                    } else if (l9.i.K0("no-transform", string)) {
                        z17 = true;
                    } else if (l9.i.K0("immutable", string)) {
                        z18 = true;
                    }
                }
                i10 = size;
                i12++;
                qVar2 = qVar;
                size = i10;
            } else {
                if (!l9.i.K0(strI, "Pragma")) {
                    i10 = size;
                }
                i12++;
                qVar2 = qVar;
                size = i10;
            }
            z10 = false;
            i11 = 0;
            while (i11 < strN.length()) {
                length = strN.length();
                length2 = i11;
                while (true) {
                    if (length2 < length) {
                        size = size;
                        length2 = strN.length();
                        break;
                    }
                    size = size;
                    if (l9.i.G0("=,;", strN.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = size;
                }
                String strSubstring3 = strN.substring(i11, length2);
                d7.a.l(strSubstring3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                string = l9.i.o1(strSubstring3).toString();
                if (length2 != strN.length()) {
                    i11 = length2 + 1;
                    string2 = null;
                } else {
                    i11 = length2 + 1;
                    string2 = null;
                }
                if (l9.i.K0("no-cache", string)) {
                    z11 = true;
                } else if (l9.i.K0("no-store", string)) {
                    z12 = true;
                } else if (l9.i.K0("max-age", string)) {
                    iV = y9.b.v(-1, string2);
                } else if (l9.i.K0("s-maxage", string)) {
                    iV2 = y9.b.v(-1, string2);
                } else if (l9.i.K0("private", string)) {
                    z13 = true;
                } else if (l9.i.K0("public", string)) {
                    z14 = true;
                } else if (l9.i.K0("must-revalidate", string)) {
                    z15 = true;
                } else if (l9.i.K0("max-stale", string)) {
                    iV3 = y9.b.v(Integer.MAX_VALUE, string2);
                } else if (l9.i.K0("min-fresh", string)) {
                    iV4 = y9.b.v(-1, string2);
                } else if (l9.i.K0("only-if-cached", string)) {
                    z16 = true;
                } else if (l9.i.K0("no-transform", string)) {
                    z17 = true;
                } else if (l9.i.K0("immutable", string)) {
                    z18 = true;
                }
            }
            i10 = size;
            i12++;
            qVar2 = qVar;
            size = i10;
        }
        return new x9.c(z11, z12, iV, iV2, z13, z14, z15, iV3, iV4, z16, z17, z18, !z10 ? null : str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long m(int i10, String str) {
        int iF = f(0, i10, str, false);
        Matcher matcher = x9.j.f16423m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int iP0 = -1;
        int i14 = -1;
        int i15 = -1;
        while (iF < i10) {
            int iF2 = f(iF + 1, i10, str, true);
            matcher.region(iF, iF2);
            if (i12 == -1 && matcher.usePattern(x9.j.f16423m).matches()) {
                String strGroup = matcher.group(1);
                d7.a.l(strGroup, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                d7.a.l(strGroup2, "matcher.group(2)");
                i14 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                d7.a.l(strGroup3, "matcher.group(3)");
                i15 = Integer.parseInt(strGroup3);
            } else if (i13 == -1 && matcher.usePattern(x9.j.f16422l).matches()) {
                String strGroup4 = matcher.group(1);
                d7.a.l(strGroup4, "matcher.group(1)");
                i13 = Integer.parseInt(strGroup4);
            } else if (iP0 == -1) {
                Pattern pattern = x9.j.f16421k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    d7.a.l(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    d7.a.l(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    d7.a.l(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    d7.a.l(strPattern, "MONTH_PATTERN.pattern()");
                    iP0 = l9.i.P0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i11 != -1 && matcher.usePattern(x9.j.f16420j).matches()) {
                    String strGroup6 = matcher.group(1);
                    d7.a.l(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
            } else if (i11 != -1) {
            }
            iF = f(iF2 + 1, i10, str, false);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += 2000;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iP0 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (1 > i13 || i13 >= 32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i12 < 0 || i12 >= 24) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(y9.b.f17003d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i11);
        gregorianCalendar.set(2, iP0 - 1);
        gregorianCalendar.set(5, i13);
        gregorianCalendar.set(11, i12);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static String n(String str, int i10, int i11, boolean z10, int i12) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        d7.a.m(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                ja.g gVar = new ja.g();
                gVar.m0(i10, iCharCount, str);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iP = y9.b.p(str.charAt(iCharCount + 1));
                        int iP2 = y9.b.p(str.charAt(i13));
                        if (iP == -1 || iP2 == -1) {
                            gVar.o0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            gVar.h0((iP << 4) + iP2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z10) {
                        gVar.h0(32);
                        iCharCount++;
                    } else {
                        gVar.o0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return gVar.Q();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i10, i11);
        d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iO0 = l9.i.O0(str, '&', i10, false, 4);
            if (iO0 == -1) {
                iO0 = str.length();
            }
            int iO1 = l9.i.O0(str, '=', i10, false, 4);
            if (iO1 == -1 || iO1 > iO0) {
                String strSubstring = str.substring(i10, iO0);
                d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i10, iO1);
                d7.a.l(strSubstring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iO1 + 1, iO0);
                d7.a.l(strSubstring3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i10 = iO0 + 1;
        }
        return arrayList;
    }

    public static void p(List list, StringBuilder sb) {
        d7.a.m(list, "<this>");
        i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, list.size()), 2);
        int i10 = eVarJ0.f8183a;
        int i11 = eVarJ0.f8184b;
        int i12 = eVarJ0.f8185c;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i10);
            String str2 = (String) list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i10 == i11) {
                return;
            } else {
                i10 += i12;
            }
        }
    }

    public synchronized x9.g g(String str) {
        x9.g gVar;
        String strConcat;
        try {
            d7.a.m(str, "javaName");
            LinkedHashMap linkedHashMap = x9.g.f16392d;
            gVar = (x9.g) linkedHashMap.get(str);
            if (gVar == null) {
                if (l9.i.h1(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    d7.a.l(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (l9.i.h1(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    d7.a.l(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                gVar = (x9.g) linkedHashMap.get(strConcat);
                if (gVar == null) {
                    gVar = new x9.g(str);
                }
                linkedHashMap.put(str, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }
}
