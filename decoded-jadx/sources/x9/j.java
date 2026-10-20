package x9;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f16420j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f16421k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f16422l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f16423m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16432i;

    public j(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f16424a = str;
        this.f16425b = str2;
        this.f16426c = j10;
        this.f16427d = str3;
        this.f16428e = str4;
        this.f16429f = z10;
        this.f16430g = z11;
        this.f16431h = z12;
        this.f16432i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (d7.a.d(jVar.f16424a, this.f16424a) && d7.a.d(jVar.f16425b, this.f16425b) && jVar.f16426c == this.f16426c && d7.a.d(jVar.f16427d, this.f16427d) && d7.a.d(jVar.f16428e, this.f16428e) && jVar.f16429f == this.f16429f && jVar.f16430g == this.f16430g && jVar.f16431h == this.f16431h && jVar.f16432i == this.f16432i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16432i) + l.q.c(this.f16431h, l.q.c(this.f16430g, l.q.c(this.f16429f, a7.a.i(this.f16428e, a7.a.i(this.f16427d, l.q.b(this.f16426c, a7.a.i(this.f16425b, a7.a.i(this.f16424a, 527, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16424a);
        sb.append('=');
        sb.append(this.f16425b);
        if (this.f16431h) {
            long j10 = this.f16426c;
            if (j10 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) ca.c.f3060a.get()).format(new Date(j10));
                d7.a.l(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f16432i) {
            sb.append("; domain=");
            sb.append(this.f16427d);
        }
        sb.append("; path=");
        sb.append(this.f16428e);
        if (this.f16429f) {
            sb.append("; secure");
        }
        if (this.f16430g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        d7.a.l(string, "toString()");
        return string;
    }
}
