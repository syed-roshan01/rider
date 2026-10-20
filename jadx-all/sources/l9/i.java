package l9;

import d7.t;
import f5.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k9.k;
import k9.m;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends h {
    public static boolean F0(CharSequence charSequence, String str, boolean z10) {
        d7.a.m(charSequence, "<this>");
        return P0(charSequence, str, 0, z10, 2) >= 0;
    }

    public static boolean G0(CharSequence charSequence, char c10) {
        d7.a.m(charSequence, "<this>");
        return O0(charSequence, c10, 0, false, 2) >= 0;
    }

    public static boolean H0(String str, String str2, boolean z10) {
        d7.a.m(str, "<this>");
        return !z10 ? str.endsWith(str2) : Y0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean I0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? H0((String) charSequence, str, false) : Z0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean J0(String str, char c10) {
        return str.length() > 0 && d7.a.u(str.charAt(L0(str)), c10, false);
    }

    public static boolean K0(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final int L0(CharSequence charSequence) {
        d7.a.m(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int M0(int i10, CharSequence charSequence, String str, boolean z10) {
        d7.a.m(charSequence, "<this>");
        d7.a.m(str, "string");
        return (z10 || !(charSequence instanceof String)) ? N0(charSequence, str, i10, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i10);
    }

    public static final int N0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        i9.e eVar;
        if (z11) {
            int iL0 = L0(charSequence);
            if (i10 > iL0) {
                i10 = iL0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            eVar = new i9.e(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            eVar = new i9.g(i10, i11, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = eVar.f8185c;
        int i13 = eVar.f8184b;
        int i14 = eVar.f8183a;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (!Y0(0, i14, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i14 != i13) {
                        i14 += i12;
                    }
                }
                return i14;
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            while (!Z0(charSequence2, 0, charSequence, i14, charSequence2.length(), z10)) {
                if (i14 != i13) {
                    i14 += i12;
                }
            }
            return i14;
        }
        return -1;
    }

    public static int O0(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        d7.a.m(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? Q0(i10, charSequence, z10, new char[]{c10}) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ int P0(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return M0(i10, charSequence, str, z10);
    }

    public static final int Q0(int i10, CharSequence charSequence, boolean z10, char[] cArr) {
        d7.a.m(charSequence, "<this>");
        d7.a.m(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(b9.b.V(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        i9.f it = new i9.g(i10, L0(charSequence), 1).iterator();
        while (it.f8188c) {
            int iB = it.b();
            char cCharAt = charSequence.charAt(iB);
            for (char c10 : cArr) {
                if (d7.a.u(c10, cCharAt, z10)) {
                    return iB;
                }
            }
        }
        return -1;
    }

    public static boolean R0(CharSequence charSequence) {
        d7.a.m(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable gVar = new i9.g(0, charSequence.length() - 1, 1);
        if ((gVar instanceof Collection) && ((Collection) gVar).isEmpty()) {
            return true;
        }
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            if (!d7.a.y(charSequence.charAt(((i9.f) it).b()))) {
                return false;
            }
        }
        return true;
    }

    public static int S0(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = L0(charSequence);
        }
        d7.a.m(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(b9.b.V(cArr), i10);
        }
        int iL0 = L0(charSequence);
        if (i10 > iL0) {
            i10 = iL0;
        }
        while (-1 < i10) {
            if (d7.a.u(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static int T0(String str, String str2, int i10) {
        int iL0 = (i10 & 2) != 0 ? L0(str) : 0;
        d7.a.m(str, "<this>");
        d7.a.m(str2, "string");
        return str.lastIndexOf(str2, iL0);
    }

    public static final List U0(CharSequence charSequence) {
        d7.a.m(charSequence, "<this>");
        return k.I0(new k9.h(X0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new h1.b(charSequence, 16)));
    }

    public static String V0(String str, int i10) {
        CharSequence charSequenceSubSequence;
        d7.a.m(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(q.h("Desired length ", i10, " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            sb.append((CharSequence) str);
            i9.f it = new i9.g(1, i10 - str.length(), 1).iterator();
            while (it.f8188c) {
                it.b();
                sb.append(' ');
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String W0(String str) {
        CharSequence charSequenceSubSequence;
        d7.a.m(str, "<this>");
        if (2 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(2);
            i9.f it = new i9.g(1, 2 - str.length(), 1).iterator();
            while (it.f8188c) {
                it.b();
                sb.append('0');
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static c X0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        d1(i10);
        return new c(charSequence, 0, i10, new f0(2, b9.b.E(strArr), z10));
    }

    public static final boolean Y0(int i10, int i11, int i12, String str, String str2, boolean z10) {
        d7.a.m(str, "<this>");
        d7.a.m(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final boolean Z0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        d7.a.m(charSequence, "<this>");
        d7.a.m(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!d7.a.u(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String a1(String str, String str2) {
        if (!h1(str2, str, false)) {
            return str2;
        }
        String strSubstring = str2.substring(str.length());
        d7.a.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String b1(int i10, String str) {
        d7.a.m(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i10);
        i9.f it = new i9.g(1, i10, 1).iterator();
        while (it.f8188c) {
            it.b();
            sb.append((CharSequence) str);
        }
        String string = sb.toString();
        d7.a.j(string);
        return string;
    }

    public static String c1(String str, String str2, String str3) {
        d7.a.m(str, "<this>");
        int iM0 = M0(0, str, str2, false);
        if (iM0 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb.append((CharSequence) str, i11, iM0);
            sb.append(str3);
            i11 = iM0 + length;
            if (iM0 >= str.length()) {
                break;
            }
            iM0 = M0(iM0 + i10, str, str2, false);
        } while (iM0 > 0);
        sb.append((CharSequence) str, i11, str.length());
        String string = sb.toString();
        d7.a.l(string, "toString(...)");
        return string;
    }

    public static final void d1(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(q.g("Limit must be non-negative, but was ", i10).toString());
        }
    }

    public static final List e1(int i10, CharSequence charSequence, String str, boolean z10) {
        d1(i10);
        int length = 0;
        int iM0 = M0(0, charSequence, str, z10);
        if (iM0 == -1 || i10 == 1) {
            return t.d0(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i11 = 10;
        if (z11 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        do {
            arrayList.add(charSequence.subSequence(length, iM0).toString());
            length = str.length() + iM0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iM0 = M0(length, charSequence, str, z10);
        } while (iM0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List f1(CharSequence charSequence, char[] cArr) {
        d7.a.m(charSequence, "<this>");
        boolean z10 = false;
        int i10 = 1;
        if (cArr.length == 1) {
            return e1(0, charSequence, String.valueOf(cArr[0]), false);
        }
        d1(0);
        c cVar = new c(charSequence, 0, 0, new f0(i10, cArr, z10));
        ArrayList arrayList = new ArrayList(f9.a.y0(new m(cVar)));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(i1(charSequence, (i9.g) it.next()));
        }
        return arrayList;
    }

    public static boolean g1(int i10, String str, String str2, boolean z10) {
        d7.a.m(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : Y0(i10, 0, str2.length(), str, str2, z10);
    }

    public static boolean h1(String str, String str2, boolean z10) {
        d7.a.m(str, "<this>");
        d7.a.m(str2, "prefix");
        return !z10 ? str.startsWith(str2) : Y0(0, 0, str2.length(), str, str2, z10);
    }

    public static final String i1(CharSequence charSequence, i9.g gVar) {
        d7.a.m(charSequence, "<this>");
        d7.a.m(gVar, "range");
        return charSequence.subSequence(Integer.valueOf(gVar.f8183a).intValue(), Integer.valueOf(gVar.f8184b).intValue() + 1).toString();
    }

    public static String j1(String str, String str2) {
        d7.a.m(str2, "delimiter");
        int iP0 = P0(str, str2, 0, false, 6);
        if (iP0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iP0, str.length());
        d7.a.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String k1(String str, char c10, String str2) {
        d7.a.m(str, "<this>");
        d7.a.m(str2, "missingDelimiterValue");
        int iS0 = S0(str, c10, 0, 6);
        if (iS0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iS0 + 1, str.length());
        d7.a.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String l1(String str, char c10) {
        int iO0 = O0(str, c10, 0, false, 6);
        if (iO0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iO0);
        d7.a.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String m1(String str, String str2) {
        d7.a.m(str, "<this>");
        d7.a.m(str, "missingDelimiterValue");
        int iP0 = P0(str, str2, 0, false, 6);
        if (iP0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iP0);
        d7.a.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String n1(String str, char c10) {
        d7.a.m(str, "<this>");
        d7.a.m(str, "missingDelimiterValue");
        int iS0 = S0(str, c10, 0, 6);
        if (iS0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iS0);
        d7.a.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence o1(CharSequence charSequence) {
        d7.a.m(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zY = d7.a.y(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zY) {
                    break;
                }
                length--;
            } else if (zY) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
