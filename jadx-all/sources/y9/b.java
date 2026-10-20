package y9;

import d7.t;
import ea.c;
import fa.l;
import ja.g;
import ja.g0;
import ja.j;
import ja.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import l9.d;
import l9.i;
import q8.k;
import r8.p;
import x9.b0;
import x9.c0;
import x9.q;
import x9.s;
import x9.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f17000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f17001b = k.k(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f17002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f17003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f17004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f17005f;

    static {
        byte[] bArr = new byte[0];
        f17000a = bArr;
        g gVar = new g();
        gVar.f0(bArr, 0, 0);
        long j10 = 0;
        f17002c = new c0(j10, (u) null, gVar);
        if ((j10 | j10) < 0 || j10 > j10 || j10 - j10 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        j jVar = j.f8539d;
        j[] jVarArr = {l.g("efbbbf"), l.g("feff"), l.g("fffe"), l.g("0000ffff"), l.g("ffff0000")};
        ArrayList arrayList = new ArrayList(new r8.k(jVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i10 = 0; i10 < 5; i10++) {
            j jVar2 = jVarArr[i10];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList arrayListF0 = t.f0(Arrays.copyOf(numArr, numArr.length));
        int i11 = 0;
        int i12 = 0;
        while (i11 < 5) {
            arrayListF0.set(t.F(arrayList, jVarArr[i11]), Integer.valueOf(i12));
            i11++;
            i12++;
        }
        if (((j) arrayList.get(0)).d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            j jVar3 = (j) arrayList.get(i13);
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 < arrayList.size()) {
                j jVar4 = (j) arrayList.get(i15);
                if (!jVar4.o(jVar3)) {
                    break;
                }
                if (jVar4.d() == jVar3.d()) {
                    throw new IllegalArgumentException(("duplicate option: " + jVar4).toString());
                }
                if (((Number) arrayListF0.get(i15)).intValue() > ((Number) arrayListF0.get(i13)).intValue()) {
                    arrayList.remove(i15);
                    arrayListF0.remove(i15);
                } else {
                    i15++;
                }
            }
            i13 = i14;
        }
        g gVar2 = new g();
        l.e(0L, gVar2, 0, arrayList, 0, arrayList.size(), arrayListF0);
        int[] iArr = new int[(int) (gVar2.f8534b / ((long) 4))];
        int i16 = 0;
        while (!gVar2.B()) {
            iArr[i16] = gVar2.readInt();
            i16++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(jVarArr, 5);
        d7.a.l(objArrCopyOf, "copyOf(this, size)");
        new w((j[]) objArrCopyOf);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        d7.a.j(timeZone);
        f17003d = timeZone;
        f17004e = new d("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String strA1 = i.a1("okhttp3.", x9.w.class.getName());
        if (i.I0(strA1, "Client")) {
            strA1 = strA1.substring(0, strA1.length() - "Client".length());
            d7.a.l(strA1, "substring(...)");
        }
        f17005f = strA1;
    }

    public static final boolean a(s sVar, s sVar2) {
        d7.a.m(sVar, "<this>");
        d7.a.m(sVar2, "other");
        return d7.a.d(sVar.f16458d, sVar2.f16458d) && sVar.f16459e == sVar2.f16459e && d7.a.d(sVar.f16455a, sVar2.f16455a);
    }

    public static final void b(Closeable closeable) {
        d7.a.m(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e10) {
            if (!d7.a.d(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(String str, char c10, int i10, int i11) {
        d7.a.m(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int e(String str, int i10, int i11, String str2) {
        d7.a.m(str, "<this>");
        while (i10 < i11) {
            if (i.G0(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean f(g0 g0Var, TimeUnit timeUnit) {
        d7.a.m(g0Var, "<this>");
        d7.a.m(timeUnit, "timeUnit");
        try {
            return r(g0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String str, Object... objArr) {
        d7.a.m(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        d7.a.l(str2, "format(locale, format, *args)");
        return str2;
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        d7.a.m(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                o0.b bVar = new o0.b(strArr2);
                while (bVar.hasNext()) {
                    if (comparator.compare(str, (String) bVar.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long i(b0 b0Var) {
        String strE = b0Var.f16349f.e("Content-Length");
        if (strE == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List j(Object... objArr) {
        d7.a.m(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(t.e0(Arrays.copyOf(objArr2, objArr2.length)));
        d7.a.l(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (d7.a.o(cCharAt, 31) <= 0 || d7.a.o(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int l(int i10, int i11, String str) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int m(int i10, int i11, String str) {
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator comparator) {
        d7.a.m(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean o(String str) {
        d7.a.m(str, "name");
        return i.K0(str, "Authorization") || i.K0(str, "Cookie") || i.K0(str, "Proxy-Authorization") || i.K0(str, "Set-Cookie");
    }

    public static final int p(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final int q(ja.i iVar) {
        d7.a.m(iVar, "<this>");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final boolean r(g0 g0Var, int i10, TimeUnit timeUnit) {
        d7.a.m(g0Var, "<this>");
        d7.a.m(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = g0Var.c().e() ? g0Var.c().c() - jNanoTime : Long.MAX_VALUE;
        g0Var.c().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            g gVar = new g();
            while (g0Var.I(gVar, 8192L) != -1) {
                gVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                g0Var.c().a();
            } else {
                g0Var.c().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                g0Var.c().a();
            } else {
                g0Var.c().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                g0Var.c().a();
            } else {
                g0Var.c().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final q s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            String strT = cVar.f5445a.t();
            String strT2 = cVar.f5446b.t();
            arrayList.add(strT);
            arrayList.add(i.o1(strT2).toString());
        }
        return new q((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(s sVar, boolean z10) {
        int i10;
        d7.a.m(sVar, "<this>");
        String str = sVar.f16458d;
        if (i.F0(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i11 = sVar.f16459e;
        if (!z10) {
            String str2 = sVar.f16455a;
            d7.a.m(str2, "scheme");
            if (d7.a.d(str2, "http")) {
                i10 = 80;
            } else {
                i10 = d7.a.d(str2, "https") ? 443 : -1;
            }
            if (i11 == i10) {
                return str;
            }
        }
        return str + ':' + i11;
    }

    public static final List u(List list) {
        d7.a.m(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(p.Y0(list));
        d7.a.l(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int v(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final String w(int i10, int i11, String str) {
        int iL = l(i10, i11, str);
        String strSubstring = str.substring(iL, m(iL, i11, str));
        d7.a.l(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
