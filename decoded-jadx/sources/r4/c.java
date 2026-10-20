package r4;

import android.graphics.Bitmap;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.r;
import q8.k;
import w4.n;
import x9.p;
import x9.q;
import x9.s;
import x9.y;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f13455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f13456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f13457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Date f13459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f13461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f13463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13465k;

    public c(r rVar, b bVar) {
        int i10;
        this.f13455a = rVar;
        this.f13456b = bVar;
        this.f13465k = -1;
        if (bVar != null) {
            this.f13462h = bVar.f13451c;
            this.f13463i = bVar.f13452d;
            q qVar = bVar.f13454f;
            int size = qVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String strI = qVar.i(i11);
                if (l9.i.K0(strI, "Date")) {
                    String strE = qVar.e("Date");
                    this.f13457c = strE != null ? ca.c.a(strE) : null;
                    this.f13458d = qVar.n(i11);
                } else if (l9.i.K0(strI, "Expires")) {
                    String strE2 = qVar.e("Expires");
                    this.f13461g = strE2 != null ? ca.c.a(strE2) : null;
                } else if (l9.i.K0(strI, "Last-Modified")) {
                    String strE3 = qVar.e("Last-Modified");
                    this.f13459e = strE3 != null ? ca.c.a(strE3) : null;
                    this.f13460f = qVar.n(i11);
                } else if (l9.i.K0(strI, "ETag")) {
                    this.f13464j = qVar.n(i11);
                } else if (l9.i.K0(strI, "Age")) {
                    String strN = qVar.n(i11);
                    Bitmap.Config[] configArr = w4.e.f16163a;
                    Long lE0 = l9.h.E0(strN);
                    if (lE0 != null) {
                        long jLongValue = lE0.longValue();
                        i10 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i10 = -1;
                    }
                    this.f13465k = i10;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    public final d a() {
        String string;
        long time;
        String str;
        int i10;
        r rVar = this.f13455a;
        b bVar = this.f13456b;
        if (bVar == null) {
            return new d(rVar, null);
        }
        if (((s) rVar.f10910b).f16464j && !bVar.f13453e) {
            return new d(rVar, null);
        }
        q8.c cVar = bVar.f13449a;
        x9.c cVar2 = (x9.c) cVar.getValue();
        if (rVar.d().f16361b || ((x9.c) cVar.getValue()).f16361b || d7.a.d(bVar.f13454f.e("Vary"), "*")) {
            return new d(rVar, null);
        }
        x9.c cVarD = rVar.d();
        if (cVarD.f16360a || ((q) rVar.f10912d).e("If-Modified-Since") != null || ((q) rVar.f10912d).e("If-None-Match") != null) {
            return new d(rVar, null);
        }
        long time2 = this.f13463i;
        Date date = this.f13457c;
        long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
        int i11 = this.f13465k;
        if (i11 != -1) {
            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i11));
        }
        long time3 = this.f13462h;
        long jLongValue = jMax + (time2 - time3) + (((Number) n.f16191a.invoke()).longValue() - time2);
        int i12 = ((x9.c) cVar.getValue()).f16362c;
        Date date2 = this.f13459e;
        if (i12 != -1) {
            time = TimeUnit.SECONDS.toMillis(i12);
        } else {
            Date date3 = this.f13461g;
            if (date3 != null) {
                if (date != null) {
                    time2 = date.getTime();
                }
                time = date3.getTime() - time2;
                if (time <= 0) {
                    time = 0;
                }
            } else if (date2 == null) {
                time = 0;
            } else {
                List list = ((s) rVar.f10910b).f16461g;
                if (list == null) {
                    string = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    k.p(list, sb);
                    string = sb.toString();
                }
                if (string != null) {
                    time = 0;
                } else {
                    if (date != null) {
                        time3 = date.getTime();
                    }
                    long time4 = time3 - date2.getTime();
                    if (time4 > 0) {
                        time = time4 / ((long) 10);
                    } else {
                        time = 0;
                    }
                }
            }
        }
        int i13 = cVarD.f16362c;
        if (i13 != -1) {
            time = Math.min(time, TimeUnit.SECONDS.toMillis(i13));
        }
        int i14 = cVarD.f16368i;
        long millis = i14 != -1 ? TimeUnit.SECONDS.toMillis(i14) : 0L;
        long millis2 = (cVar2.f16366g || (i10 = cVarD.f16367h) == -1) ? 0L : TimeUnit.SECONDS.toMillis(i10);
        if (!cVar2.f16360a && jLongValue + millis < time + millis2) {
            return new d(null, bVar);
        }
        String str2 = this.f13464j;
        if (str2 != null) {
            str = "If-None-Match";
        } else {
            if (date2 != null) {
                str2 = this.f13460f;
                d7.a.j(str2);
            } else {
                if (date == null) {
                    return new d(rVar, null);
                }
                str2 = this.f13458d;
                d7.a.j(str2);
            }
            str = "If-Modified-Since";
        }
        y yVarH = rVar.h();
        p pVar = yVarH.f16503c;
        pVar.getClass();
        k.c(str);
        k.e(str2, str);
        pVar.a(str, str2);
        return new d(yVarH.a(), bVar);
    }
}
