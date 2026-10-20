package okhttp3.internal.publicsuffix;

import d7.a;
import d7.t;
import fa.l;
import fa.m;
import h6.g;
import ja.a0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.b;
import k9.c;
import l.q;
import l9.i;
import r8.o;
import r8.p;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f12724e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f12725f = t.d0("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f12726g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f12727a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f12728b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f12729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f12730d;

    public static List c(String str) {
        List listF1 = i.f1(str, new char[]{'.'});
        if (!a.d(p.L0(listF1), "")) {
            return listF1;
        }
        List list = listF1;
        int size = listF1.size() - 1;
        return p.S0(list, size >= 0 ? size : 0);
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List listF1;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        a.l(unicode, "unicodeDomain");
        List listC = c(unicode);
        int i10 = 0;
        if (this.f12727a.get() || !this.f12727a.compareAndSet(false, true)) {
            try {
                this.f12728b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z10 = true;
                    } catch (IOException e4) {
                        m mVar = m.f6417a;
                        m.f6417a.getClass();
                        m.i(5, "Failed to read public suffix list", e4);
                        if (z10) {
                        }
                    }
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f12729c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i11 = 0; i11 < size3; i11++) {
            String str2 = (String) listC.get(i11);
            Charset charset = StandardCharsets.UTF_8;
            a.l(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            a.l(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i11] = bytes;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                strA = null;
                break;
            }
            byte[] bArr2 = this.f12729c;
            if (bArr2 == null) {
                a.D("publicSuffixListBytes");
                throw null;
            }
            strA = l.a(bArr2, bArr, i12);
            if (strA != null) {
                break;
            }
            i12++;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                strA2 = null;
                break;
            }
            bArr3[i13] = f12724e;
            byte[] bArr4 = this.f12729c;
            if (bArr4 == null) {
                a.D("publicSuffixListBytes");
                throw null;
            }
            strA2 = l.a(bArr4, bArr3, i13);
            if (strA2 != null) {
                break;
            }
            i13++;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i14 = size3 - 1;
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                strA3 = null;
                break;
            }
            byte[] bArr5 = this.f12730d;
            if (bArr5 == null) {
                a.D("publicSuffixExceptionListBytes");
                throw null;
            }
            strA3 = l.a(bArr5, bArr, i15);
            if (strA3 != null) {
                break;
            }
            i15++;
        }
        if (strA3 != null) {
            listF1 = i.f1("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listF1 = f12725f;
        } else {
            List listF2 = r.f13661a;
            List listF3 = strA != null ? i.f1(strA, new char[]{'.'}) : listF2;
            if (strA2 != null) {
                listF2 = i.f1(strA2, new char[]{'.'});
            }
            listF1 = listF3.size() > listF2.size() ? listF3 : listF2;
        }
        if (listC.size() == listF1.size() && ((String) listF1.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listF1.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listF1.size();
        } else {
            size = listC.size();
            size2 = listF1.size() + 1;
        }
        int i16 = size - size2;
        k9.i oVar = new o(c(str), 0);
        if (i16 < 0) {
            throw new IllegalArgumentException(q.h("Requested element count ", i16, " is less than zero.").toString());
        }
        if (i16 != 0) {
            oVar = oVar instanceof c ? ((c) oVar).a(i16) : new b(oVar, i16);
        }
        a.m(oVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : oVar) {
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) ".");
            }
            z6.a.b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        a.l(string, "toString(...)");
        return string;
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                this.f12728b.countDown();
                return;
            }
            a0 a0VarC = r9.a.c(new ja.q(r9.a.o(resourceAsStream)));
            try {
                long j10 = a0VarC.readInt();
                a0VarC.S(j10);
                byte[] bArrM = a0VarC.f8502b.M(j10);
                long j11 = a0VarC.readInt();
                a0VarC.S(j11);
                byte[] bArrM2 = a0VarC.f8502b.M(j11);
                g.e(a0VarC, null);
                synchronized (this) {
                    this.f12729c = bArrM;
                    this.f12730d = bArrM2;
                }
                this.f12728b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    g.e(a0VarC, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.f12728b.countDown();
            throw th3;
        }
    }
}
