package x9;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16446a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16449d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f16452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16453h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16447b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16448c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16450e = -1;

    public r() {
        ArrayList arrayList = new ArrayList();
        this.f16451f = arrayList;
        arrayList.add("");
    }

    public final s a() {
        ArrayList arrayList;
        String str = this.f16446a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strN = q8.k.n(this.f16447b, 0, 0, false, 7);
        String strN2 = q8.k.n(this.f16448c, 0, 0, false, 7);
        String str2 = this.f16449d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.f16451f;
        ArrayList arrayList3 = new ArrayList(f9.a.y0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(q8.k.n((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f16452g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(f9.a.y0(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? q8.k.n(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f16453h;
        return new s(str, strN, strN2, str2, iB, arrayList3, arrayList, str4 != null ? q8.k.n(str4, 0, 0, false, 7) : null, toString());
    }

    public final int b() {
        int i10 = this.f16450e;
        if (i10 != -1) {
            return i10;
        }
        String str = this.f16446a;
        d7.a.j(str);
        if (d7.a.d(str, "http")) {
            return 80;
        }
        return d7.a.d(str, "https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0234 A[LOOP:4: B:102:0x0234->B:229:?, LOOP_START, PHI: r5
  0x0234: PHI (r5v12 int) = (r5v5 int), (r5v13 int) binds: [B:101:0x0232, B:229:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x0242  */
    /* JADX WARN: Code duplicated, block: B:114:0x0252  */
    /* JADX WARN: Code duplicated, block: B:123:0x0287  */
    /* JADX WARN: Code duplicated, block: B:126:0x028d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0293  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:195:0x0406  */
    /* JADX WARN: Code duplicated, block: B:223:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x023f A[EDGE_INSN: B:227:0x023f->B:106:0x023f BREAK  A[LOOP:4: B:102:0x0234->B:229:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x0023  */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0151  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final void c(s sVar, String str) {
        int i10;
        byte b10;
        byte b11;
        int i11;
        int iE;
        byte bCharAt;
        String str2;
        ArrayList arrayList;
        String str3;
        Object obj;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str4;
        int i18;
        int i19;
        int i20;
        char cCharAt;
        int i21;
        byte b12;
        boolean z10;
        char c10;
        ArrayList arrayList2;
        char cCharAt2;
        byte[] bArr = y9.b.f17000a;
        int iL = y9.b.l(0, str.length(), str);
        int iM = y9.b.m(iL, str.length(), str);
        byte b13 = -1;
        if (iM - iL >= 2) {
            char cCharAt3 = str.charAt(iL);
            if ((d7.a.o(cCharAt3, 97) >= 0 && d7.a.o(cCharAt3, 122) <= 0) || (d7.a.o(cCharAt3, 65) >= 0 && d7.a.o(cCharAt3, 90) <= 0)) {
                i10 = iL + 1;
                while (true) {
                    if (i10 < iM) {
                        char cCharAt4 = str.charAt(i10);
                        if (('a' > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                            if (cCharAt4 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i10++;
                    }
                    i10 = -1;
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
        } else {
            i10 = -1;
            break;
        }
        String str5 = "https";
        String str6 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
        if (i10 != -1) {
            if (l9.i.g1(iL, str, "https:", true)) {
                this.f16446a = "https";
                iL += 6;
            } else {
                if (!l9.i.g1(iL, str, "http:", true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = str.substring(0, i10);
                    d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f16446a = "http";
                iL += 5;
            }
        } else {
            if (sVar == null) {
                throw new IllegalArgumentException(l.q.x("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? l9.j.p1(6, str).concat("...") : str));
            }
            this.f16446a = sVar.f16455a;
        }
        int i22 = iL;
        int i23 = 0;
        while (true) {
            b10 = 47;
            b11 = 92;
            if (i22 >= iM || !((cCharAt2 = str.charAt(i22)) == '\\' || cCharAt2 == '/')) {
                break;
            }
            i23++;
            i22++;
        }
        ArrayList arrayList3 = this.f16451f;
        byte b14 = 63;
        Object obj2 = "http";
        byte b15 = 35;
        if (i23 >= 2 || sVar == null) {
            i11 = iL + i23;
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                iE = y9.b.e(str, i11, iM, "@/\\?#");
                if (iE != iM) {
                    bCharAt = str.charAt(iE);
                } else {
                    bCharAt = b13;
                }
                if (bCharAt == b13 || bCharAt == b15 || bCharAt == b10 || bCharAt == b11 || bCharAt == b14) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z11) {
                        i21 = iE;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f16448c);
                        sb2.append("%40");
                        b12 = b14;
                        sb2.append(q8.k.b(str, i11, i21, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240));
                        this.f16448c = sb2.toString();
                    } else {
                        int iD = y9.b.d(str, ':', i11, iE);
                        int i24 = i11;
                        byte b16 = b14;
                        i21 = iE;
                        String strB = q8.k.b(str, i24, iD, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        if (z12) {
                            strB = this.f16447b + "%40" + strB;
                        }
                        this.f16447b = strB;
                        if (iD != i21) {
                            this.f16448c = q8.k.b(str, iD + 1, i21, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        z11 = z10;
                        z12 = true;
                        b12 = b16;
                    }
                    i11 = i21 + 1;
                    b14 = b12;
                    arrayList3 = arrayList3;
                    str6 = str6;
                    str5 = str5;
                    obj2 = obj2;
                    b15 = 35;
                    b10 = 47;
                    b13 = -1;
                    b11 = 92;
                }
            }
            str2 = str6;
            arrayList = arrayList3;
            str3 = str5;
            obj = obj2;
            i12 = 1;
            i13 = i11;
            while (true) {
                if (i13 >= iE) {
                    i14 = iE;
                    break;
                }
                cCharAt = str.charAt(i13);
                if (cCharAt == '[') {
                    do {
                        i13++;
                        if (i13 < iE) {
                            break;
                        }
                    } while (str.charAt(i13) != ']');
                } else if (cCharAt == ':') {
                    i14 = i13;
                    break;
                }
                i13++;
            }
            i15 = i14 + 1;
            if (i15 < iE) {
                this.f16449d = h6.g.x0(q8.k.n(str, i11, i14, false, 4));
                i19 = i14;
                try {
                    i20 = Integer.parseInt(q8.k.b(str, i15, iE, "", false, false, false, false, 248));
                    if (1 <= i20 || i20 >= 65536) {
                        i20 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f16450e = i20;
                if (i20 != -1) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i15, iE);
                    d7.a.l(strSubstring2, str2);
                    sb3.append(strSubstring2);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                i16 = i19;
                i17 = 0;
            } else {
                i16 = i14;
                i17 = 0;
                this.f16449d = h6.g.x0(q8.k.n(str, i11, i16, false, 4));
                str4 = this.f16446a;
                d7.a.j(str4);
                if (d7.a.d(str4, obj)) {
                    i18 = 80;
                } else if (d7.a.d(str4, str3)) {
                    i18 = 443;
                } else {
                    i18 = -1;
                }
                this.f16450e = i18;
            }
            if (this.f16449d != null) {
                StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i11, i16);
                d7.a.l(strSubstring3, str2);
                sb4.append(strSubstring3);
                sb4.append('\"');
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            iL = iE;
        } else if (d7.a.d(sVar.f16455a, this.f16446a)) {
            this.f16447b = sVar.e();
            this.f16448c = sVar.a();
            this.f16449d = sVar.f16458d;
            this.f16450e = sVar.f16459e;
            arrayList3.clear();
            arrayList3.addAll(sVar.c());
            if (iL == iM || str.charAt(iL) == '#') {
                String strD = sVar.d();
                this.f16452g = strD != null ? q8.k.o(q8.k.b(strD, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
            }
            arrayList = arrayList3;
            i12 = 1;
            i17 = 0;
        } else {
            i11 = iL + i23;
            boolean z13 = false;
            boolean z14 = false;
            while (true) {
                iE = y9.b.e(str, i11, iM, "@/\\?#");
                if (iE != iM) {
                    bCharAt = str.charAt(iE);
                } else {
                    bCharAt = b13;
                }
                if (bCharAt == b13) {
                    break;
                } else {
                    break;
                }
            }
            str2 = str6;
            arrayList = arrayList3;
            str3 = str5;
            obj = obj2;
            i12 = 1;
            i13 = i11;
            while (true) {
                if (i13 >= iE) {
                    i14 = iE;
                    break;
                }
                cCharAt = str.charAt(i13);
                if (cCharAt == '[') {
                    do {
                        i13++;
                        if (i13 < iE) {
                            break;
                            break;
                        }
                    } while (str.charAt(i13) != ']');
                } else if (cCharAt == ':') {
                    i14 = i13;
                    break;
                }
                i13++;
            }
            i15 = i14 + 1;
            if (i15 < iE) {
                this.f16449d = h6.g.x0(q8.k.n(str, i11, i14, false, 4));
                i19 = i14;
                i20 = Integer.parseInt(q8.k.b(str, i15, iE, "", false, false, false, false, 248));
                if (1 <= i20) {
                    i20 = -1;
                } else {
                    i20 = -1;
                }
                this.f16450e = i20;
                if (i20 != -1) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring4 = str.substring(i15, iE);
                    d7.a.l(strSubstring4, str2);
                    sb5.append(strSubstring4);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                i16 = i19;
                i17 = 0;
            } else {
                i16 = i14;
                i17 = 0;
                this.f16449d = h6.g.x0(q8.k.n(str, i11, i16, false, 4));
                str4 = this.f16446a;
                d7.a.j(str4);
                if (d7.a.d(str4, obj)) {
                    i18 = 80;
                } else if (d7.a.d(str4, str3)) {
                    i18 = 443;
                } else {
                    i18 = -1;
                }
                this.f16450e = i18;
            }
            if (this.f16449d != null) {
                StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                String strSubstring5 = str.substring(i11, i16);
                d7.a.l(strSubstring5, str2);
                sb6.append(strSubstring5);
                sb6.append('\"');
                throw new IllegalArgumentException(sb6.toString().toString());
            }
            iL = iE;
        }
        int iE2 = y9.b.e(str, iL, iM, "?#");
        if (iL != iE2) {
            char cCharAt5 = str.charAt(iL);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList2 = arrayList;
                arrayList2.clear();
                arrayList2.add("");
                iL++;
            } else {
                arrayList2 = arrayList;
                arrayList2.set(arrayList.size() - i12, "");
            }
            while (iL < iE2) {
                int iE3 = y9.b.e(str, iL, iE2, "/\\");
                int i25 = iE3 < iE2 ? i12 : i17;
                arrayList2 = arrayList2;
                String strB2 = q8.k.b(str, iL, iE3, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                if (!d7.a.d(strB2, ".") && !l9.i.K0(strB2, "%2e")) {
                    if (!d7.a.d(strB2, "..") && !l9.i.K0(strB2, "%2e.") && !l9.i.K0(strB2, ".%2e") && !l9.i.K0(strB2, "%2e%2e")) {
                        if (((CharSequence) a7.a.k(arrayList2, i12)).length() == 0) {
                            arrayList2.set(arrayList2.size() - i12, strB2);
                        } else {
                            arrayList2.add(strB2);
                        }
                        if (i25 != 0) {
                            arrayList2.add("");
                        }
                    } else if (((String) arrayList2.remove(arrayList2.size() - i12)).length() != 0 || (arrayList2.isEmpty() ^ i12) == 0) {
                        arrayList2.add("");
                    } else {
                        arrayList2.set(arrayList2.size() - i12, "");
                    }
                }
                iL = i25 != 0 ? iE3 + 1 : iE3;
                i17 = 0;
            }
        }
        if (iE2 >= iM || str.charAt(iE2) != '?') {
            c10 = '#';
        } else {
            c10 = '#';
            int iD2 = y9.b.d(str, '#', iE2, iM);
            this.f16452g = q8.k.o(q8.k.b(str, iE2 + 1, iD2, " \"'<>#", true, false, true, false, 208));
            iE2 = iD2;
        }
        if (iE2 >= iM || str.charAt(iE2) != c10) {
            return;
        }
        this.f16453h = q8.k.b(str, iE2 + 1, iM, "", true, false, false, true, 176);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f16446a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f16447b.length() > 0 || this.f16448c.length() > 0) {
            sb.append(this.f16447b);
            if (this.f16448c.length() > 0) {
                sb.append(':');
                sb.append(this.f16448c);
            }
            sb.append('@');
        }
        String str2 = this.f16449d;
        if (str2 != null) {
            if (l9.i.G0(str2, ':')) {
                sb.append('[');
                sb.append(this.f16449d);
                sb.append(']');
            } else {
                sb.append(this.f16449d);
            }
        }
        int i10 = -1;
        if (this.f16450e != -1 || this.f16446a != null) {
            int iB = b();
            String str3 = this.f16446a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iB);
            } else {
                if (d7.a.d(str3, "http")) {
                    i10 = 80;
                } else if (d7.a.d(str3, "https")) {
                    i10 = 443;
                }
                if (iB != i10) {
                    sb.append(':');
                    sb.append(iB);
                }
            }
        }
        ArrayList arrayList = this.f16451f;
        d7.a.m(arrayList, "<this>");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb.append('/');
            sb.append((String) arrayList.get(i11));
        }
        if (this.f16452g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f16452g;
            d7.a.j(arrayList2);
            q8.k.p(arrayList2, sb);
        }
        if (this.f16453h != null) {
            sb.append('#');
            sb.append(this.f16453h);
        }
        String string = sb.toString();
        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
