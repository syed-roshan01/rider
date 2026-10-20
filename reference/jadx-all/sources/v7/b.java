package v7;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f15952p = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String[] f15953q = new String[128];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f15954r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f15955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15960f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15962o;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f15953q[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f15953q;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f15954r = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f15956b = iArr;
        this.f15957c = 0;
        if (iArr.length == 0) {
            this.f15956b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f15956b;
        int i10 = this.f15957c;
        this.f15957c = i10 + 1;
        iArr2[i10] = 6;
        this.f15958d = ":";
        this.f15962o = true;
        Objects.requireNonNull(writer, "out == null");
        this.f15955a = writer;
    }

    public b M() throws IOException {
        if (this.f15961n != null) {
            if (!this.f15962o) {
                this.f15961n = null;
                return this;
            }
            g0();
        }
        a();
        this.f15955a.write("null");
        return this;
    }

    public final int O() {
        int i10 = this.f15957c;
        if (i10 != 0) {
            return this.f15956b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void P(String str) throws IOException {
        String str2;
        String[] strArr = this.f15960f ? f15954r : f15953q;
        Writer writer = this.f15955a;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void Q(double d10) throws IOException {
        g0();
        if (this.f15959e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            a();
            this.f15955a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void T(long j10) throws IOException {
        g0();
        a();
        this.f15955a.write(Long.toString(j10));
    }

    public final void a() throws IOException {
        int iO = O();
        if (iO == 1) {
            this.f15956b[this.f15957c - 1] = 2;
            u();
            return;
        }
        Writer writer = this.f15955a;
        if (iO == 2) {
            writer.append(',');
            u();
        } else {
            if (iO == 4) {
                writer.append((CharSequence) this.f15958d);
                this.f15956b[this.f15957c - 1] = 5;
                return;
            }
            if (iO != 6) {
                if (iO != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f15959e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f15956b[this.f15957c - 1] = 7;
        }
    }

    public void b() throws IOException {
        g0();
        a();
        int i10 = this.f15957c;
        int[] iArr = this.f15956b;
        if (i10 == iArr.length) {
            this.f15956b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f15956b;
        int i11 = this.f15957c;
        this.f15957c = i11 + 1;
        iArr2[i11] = 1;
        this.f15955a.write(91);
    }

    public void c0(Boolean bool) throws IOException {
        if (bool == null) {
            M();
            return;
        }
        g0();
        a();
        this.f15955a.write(bool.booleanValue() ? "true" : "false");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15955a.close();
        int i10 = this.f15957c;
        if (i10 > 1 || (i10 == 1 && this.f15956b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f15957c = 0;
    }

    public void d0(Number number) throws IOException {
        if (number == null) {
            M();
            return;
        }
        g0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f15952p.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f15959e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        a();
        this.f15955a.append((CharSequence) string);
    }

    public void e() throws IOException {
        g0();
        a();
        int i10 = this.f15957c;
        int[] iArr = this.f15956b;
        if (i10 == iArr.length) {
            this.f15956b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f15956b;
        int i11 = this.f15957c;
        this.f15957c = i11 + 1;
        iArr2[i11] = 3;
        this.f15955a.write(123);
    }

    public void e0(String str) throws IOException {
        if (str == null) {
            M();
            return;
        }
        g0();
        a();
        P(str);
    }

    public final void f(int i10, int i11, char c10) throws IOException {
        int iO = O();
        if (iO != i11 && iO != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f15961n != null) {
            throw new IllegalStateException("Dangling name: " + this.f15961n);
        }
        this.f15957c--;
        if (iO == i11) {
            u();
        }
        this.f15955a.write(c10);
    }

    public void f0(boolean z10) throws IOException {
        g0();
        a();
        this.f15955a.write(z10 ? "true" : "false");
    }

    public void flush() throws IOException {
        if (this.f15957c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f15955a.flush();
    }

    public void g() throws IOException {
        f(1, 2, ']');
    }

    public final void g0() throws IOException {
        if (this.f15961n != null) {
            int iO = O();
            if (iO == 5) {
                this.f15955a.write(44);
            } else if (iO != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            u();
            this.f15956b[this.f15957c - 1] = 4;
            P(this.f15961n);
            this.f15961n = null;
        }
    }

    public void p() throws IOException {
        f(3, 5, '}');
    }

    public void q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f15961n != null) {
            throw new IllegalStateException();
        }
        if (this.f15957c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f15961n = str;
    }

    public final void u() {
    }
}
