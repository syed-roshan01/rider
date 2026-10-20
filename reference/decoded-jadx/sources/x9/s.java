package x9;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f16454k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f16460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f16461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f16463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f16464j;

    public s(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f16455a = str;
        this.f16456b = str2;
        this.f16457c = str3;
        this.f16458d = str4;
        this.f16459e = i10;
        this.f16461g = arrayList2;
        this.f16462h = str5;
        this.f16463i = str6;
        this.f16464j = d7.a.d(str, "https");
    }

    public final String a() {
        if (this.f16457c.length() == 0) {
            return "";
        }
        int length = this.f16455a.length() + 3;
        String str = this.f16463i;
        String strSubstring = str.substring(l9.i.O0(str, ':', length, false, 4) + 1, l9.i.O0(str, '@', 0, false, 6));
        d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f16455a.length() + 3;
        String str = this.f16463i;
        int iO0 = l9.i.O0(str, '/', length, false, 4);
        String strSubstring = str.substring(iO0, y9.b.e(str, iO0, str.length(), "?#"));
        d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f16455a.length() + 3;
        String str = this.f16463i;
        int iO0 = l9.i.O0(str, '/', length, false, 4);
        int iE = y9.b.e(str, iO0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iO0 < iE) {
            int i10 = iO0 + 1;
            int iD = y9.b.d(str, '/', i10, iE);
            String strSubstring = str.substring(i10, iD);
            d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iO0 = iD;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f16461g == null) {
            return null;
        }
        String str = this.f16463i;
        int iO0 = l9.i.O0(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iO0, y9.b.d(str, '#', iO0, str.length()));
        d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f16456b.length() == 0) {
            return "";
        }
        int length = this.f16455a.length() + 3;
        String str = this.f16463i;
        String strSubstring = str.substring(length, y9.b.e(str, length, str.length(), ":@"));
        d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && d7.a.d(((s) obj).f16463i, this.f16463i);
    }

    public final String f() {
        r rVar;
        try {
            rVar = new r();
            rVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        d7.a.j(rVar);
        rVar.f16447b = q8.k.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        rVar.f16448c = q8.k.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return rVar.a().f16463i;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        r rVar = new r();
        String str = this.f16455a;
        rVar.f16446a = str;
        rVar.f16447b = e();
        rVar.f16448c = a();
        rVar.f16449d = this.f16458d;
        d7.a.m(str, "scheme");
        int i10 = d7.a.d(str, "http") ? 80 : d7.a.d(str, "https") ? 443 : -1;
        int i11 = this.f16459e;
        rVar.f16450e = i11 != i10 ? i11 : -1;
        ArrayList arrayList = rVar.f16451f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        rVar.f16452g = strD != null ? q8.k.o(q8.k.b(strD, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f16462h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f16463i;
            strSubstring = str2.substring(l9.i.O0(str2, '#', 0, false, 6) + 1);
            d7.a.l(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        rVar.f16453h = strSubstring;
        String str3 = rVar.f16449d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            d7.a.l(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            d7.a.l(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        rVar.f16449d = strReplaceAll;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.set(i12, q8.k.b((String) arrayList.get(i12), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = rVar.f16452g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String str4 = (String) arrayList2.get(i13);
                arrayList2.set(i13, str4 != null ? q8.k.b(str4, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str5 = rVar.f16453h;
        rVar.f16453h = str5 != null ? q8.k.b(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = rVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e4) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                d7.a.l(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                d7.a.l(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                d7.a.l(uriCreate, "{\n      // Unlikely edge\u2026Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final int hashCode() {
        return this.f16463i.hashCode();
    }

    public final String toString() {
        return this.f16463i;
    }
}
