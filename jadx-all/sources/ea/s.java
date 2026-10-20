package ea;

import com.google.firebase.analytics.FirebaseAnalytics;
import ja.e0;
import ja.g0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ca.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f5513g = y9.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f5514h = y9.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba.k f5515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ca.f f5516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f5517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile y f5518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x9.x f5519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f5520f;

    public s(x9.w wVar, ba.k kVar, ca.f fVar, r rVar) {
        d7.a.m(kVar, "connection");
        this.f5515a = kVar;
        this.f5516b = fVar;
        this.f5517c = rVar;
        x9.x xVar = x9.x.H2_PRIOR_KNOWLEDGE;
        this.f5519e = wVar.f16491y.contains(xVar) ? xVar : x9.x.HTTP_2;
    }

    @Override // ca.d
    public final long a(x9.b0 b0Var) {
        if (ca.e.a(b0Var)) {
            return y9.b.i(b0Var);
        }
        return 0L;
    }

    @Override // ca.d
    public final g0 b(x9.b0 b0Var) {
        y yVar = this.f5518d;
        d7.a.j(yVar);
        return yVar.f5552i;
    }

    @Override // ca.d
    public final void c() {
        y yVar = this.f5518d;
        d7.a.j(yVar);
        yVar.f().close();
    }

    @Override // ca.d
    public final void cancel() {
        this.f5520f = true;
        y yVar = this.f5518d;
        if (yVar != null) {
            yVar.e(b.CANCEL);
        }
    }

    @Override // ca.d
    public final void d() {
        this.f5517c.F.flush();
    }

    @Override // ca.d
    public final e0 e(l.r rVar, long j10) {
        y yVar = this.f5518d;
        d7.a.j(yVar);
        return yVar.f();
    }

    @Override // ca.d
    public final void f(l.r rVar) throws IOException {
        int i10;
        y yVar;
        if (this.f5518d != null) {
            return;
        }
        Object obj = rVar.f10913e;
        x9.q qVar = (x9.q) rVar.f10912d;
        ArrayList arrayList = new ArrayList(qVar.size() + 4);
        arrayList.add(new c(c.f5441f, (String) rVar.f10911c));
        ja.j jVar = c.f5442g;
        x9.s sVar = (x9.s) rVar.f10910b;
        d7.a.m(sVar, "url");
        String strB = sVar.b();
        String strD = sVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new c(jVar, strB));
        String strE = ((x9.q) rVar.f10912d).e("Host");
        if (strE != null) {
            arrayList.add(new c(c.f5444i, strE));
        }
        arrayList.add(new c(c.f5443h, ((x9.s) rVar.f10910b).f16455a));
        int size = qVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strI = qVar.i(i11);
            Locale locale = Locale.US;
            d7.a.l(locale, "US");
            String lowerCase = strI.toLowerCase(locale);
            d7.a.l(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f5513g.contains(lowerCase) || (d7.a.d(lowerCase, "te") && d7.a.d(qVar.n(i11), "trailers"))) {
                arrayList.add(new c(lowerCase, qVar.n(i11)));
            }
        }
        r rVar2 = this.f5517c;
        rVar2.getClass();
        boolean z10 = !false;
        synchronized (rVar2.F) {
            synchronized (rVar2) {
                try {
                    if (rVar2.f5499f > 1073741823) {
                        rVar2.g(b.REFUSED_STREAM);
                    }
                    if (rVar2.f5500n) {
                        throw new a();
                    }
                    i10 = rVar2.f5499f;
                    rVar2.f5499f = i10 + 2;
                    yVar = new y(i10, rVar2, z10, false, null);
                    if (yVar.h()) {
                        rVar2.f5496c.put(Integer.valueOf(i10), yVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z zVar = rVar2.F;
            synchronized (zVar) {
                if (zVar.f5563e) {
                    throw new IOException("closed");
                }
                zVar.f5564f.f(arrayList);
                long j10 = zVar.f5561c.f8534b;
                long jMin = Math.min(zVar.f5562d, j10);
                int i12 = j10 == jMin ? 4 : 0;
                if (z10) {
                    i12 |= 1;
                }
                zVar.b(i10, (int) jMin, 1, i12);
                zVar.f5559a.b0(zVar.f5561c, jMin);
                if (j10 > jMin) {
                    zVar.g(i10, j10 - jMin);
                }
            }
        }
        rVar2.F.flush();
        this.f5518d = yVar;
        if (this.f5520f) {
            y yVar2 = this.f5518d;
            d7.a.j(yVar2);
            yVar2.e(b.CANCEL);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f5518d;
        d7.a.j(yVar3);
        x xVar = yVar3.f5554k;
        long j11 = this.f5516b.f3069g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j11, timeUnit);
        y yVar4 = this.f5518d;
        d7.a.j(yVar4);
        yVar4.f5555l.g(this.f5516b.f3070h, timeUnit);
    }

    @Override // ca.d
    public final x9.a0 g(boolean z10) throws IOException {
        x9.q qVar;
        y yVar = this.f5518d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f5554k.h();
            while (yVar.f5550g.isEmpty() && yVar.f5556m == null) {
                try {
                    yVar.k();
                } catch (Throwable th) {
                    yVar.f5554k.l();
                    throw th;
                }
            }
            yVar.f5554k.l();
            if (!(!yVar.f5550g.isEmpty())) {
                IOException iOException = yVar.f5557n;
                if (iOException != null) {
                    throw iOException;
                }
                b bVar = yVar.f5556m;
                d7.a.j(bVar);
                throw new d0(bVar);
            }
            Object objRemoveFirst = yVar.f5550g.removeFirst();
            d7.a.l(objRemoveFirst, "headersQueue.removeFirst()");
            qVar = (x9.q) objRemoveFirst;
        }
        x9.x xVar = this.f5519e;
        d7.a.m(xVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = qVar.size();
        ca.h hVarF = null;
        for (int i10 = 0; i10 < size; i10++) {
            String strI = qVar.i(i10);
            String strN = qVar.n(i10);
            if (d7.a.d(strI, ":status")) {
                hVarF = x9.v.F("HTTP/1.1 " + strN);
            } else if (!f5514h.contains(strI)) {
                d7.a.m(strI, "name");
                d7.a.m(strN, FirebaseAnalytics.Param.VALUE);
                arrayList.add(strI);
                arrayList.add(l9.i.o1(strN).toString());
            }
        }
        if (hVarF == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        x9.a0 a0Var = new x9.a0();
        a0Var.f16331b = xVar;
        a0Var.f16332c = hVarF.f3074b;
        String str = hVarF.f3075c;
        d7.a.m(str, "message");
        a0Var.f16333d = str;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        x9.p pVar = new x9.p();
        ArrayList arrayList2 = pVar.f16444a;
        d7.a.m(arrayList2, "<this>");
        d7.a.m(strArr, "elements");
        arrayList2.addAll(b9.b.E(strArr));
        a0Var.f16335f = pVar;
        if (z10 && a0Var.f16332c == 100) {
            return null;
        }
        return a0Var;
    }

    @Override // ca.d
    public final ba.k h() {
        return this.f5515a;
    }
}
