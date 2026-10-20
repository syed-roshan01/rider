package da;

import ba.k;
import ja.e0;
import ja.g0;
import ja.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import l.r;
import x9.a0;
import x9.b0;
import x9.q;
import x9.s;
import x9.v;
import x9.w;
import x9.x;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ca.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f4972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f4973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f4974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ja.h f4975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f4977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f4978g;

    public h(w wVar, k kVar, i iVar, ja.h hVar) {
        d7.a.m(kVar, "connection");
        this.f4972a = wVar;
        this.f4973b = kVar;
        this.f4974c = iVar;
        this.f4975d = hVar;
        this.f4977f = new a(iVar);
    }

    @Override // ca.d
    public final long a(b0 b0Var) {
        if (!ca.e.a(b0Var)) {
            return 0L;
        }
        if (l9.i.K0("chunked", b0.b(b0Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return y9.b.i(b0Var);
    }

    @Override // ca.d
    public final g0 b(b0 b0Var) {
        if (!ca.e.a(b0Var)) {
            return i(0L);
        }
        if (l9.i.K0("chunked", b0.b(b0Var, "Transfer-Encoding"))) {
            s sVar = (s) b0Var.f16344a.f10910b;
            if (this.f4976e == 4) {
                this.f4976e = 5;
                return new d(this, sVar);
            }
            throw new IllegalStateException(("state: " + this.f4976e).toString());
        }
        long jI = y9.b.i(b0Var);
        if (jI != -1) {
            return i(jI);
        }
        if (this.f4976e == 4) {
            this.f4976e = 5;
            this.f4973b.k();
            return new g(this);
        }
        throw new IllegalStateException(("state: " + this.f4976e).toString());
    }

    @Override // ca.d
    public final void c() {
        this.f4975d.flush();
    }

    @Override // ca.d
    public final void cancel() {
        Socket socket = this.f4973b.f2810c;
        if (socket != null) {
            y9.b.c(socket);
        }
    }

    @Override // ca.d
    public final void d() {
        this.f4975d.flush();
    }

    @Override // ca.d
    public final e0 e(r rVar, long j10) {
        Object obj = rVar.f10913e;
        if (l9.i.K0("chunked", ((q) rVar.f10912d).e("Transfer-Encoding"))) {
            if (this.f4976e == 1) {
                this.f4976e = 2;
                return new c(this);
            }
            throw new IllegalStateException(("state: " + this.f4976e).toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f4976e == 1) {
            this.f4976e = 2;
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f4976e).toString());
    }

    @Override // ca.d
    public final void f(r rVar) {
        Proxy.Type type = this.f4973b.f2809b.f16378b.type();
        d7.a.l(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) rVar.f10911c);
        sb.append(' ');
        Object obj = rVar.f10910b;
        if (((s) obj).f16464j || type != Proxy.Type.HTTP) {
            s sVar = (s) obj;
            d7.a.m(sVar, "url");
            String strB = sVar.b();
            String strD = sVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append((s) obj);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
        j((q) rVar.f10912d, string);
    }

    @Override // ca.d
    public final a0 g(boolean z10) {
        a aVar = this.f4977f;
        int i10 = this.f4976e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f4976e).toString());
        }
        try {
            String strK = aVar.f4954a.K(aVar.f4955b);
            aVar.f4955b -= (long) strK.length();
            ca.h hVarF = v.F(strK);
            int i11 = hVarF.f3074b;
            a0 a0Var = new a0();
            x xVar = hVarF.f3073a;
            d7.a.m(xVar, "protocol");
            a0Var.f16331b = xVar;
            a0Var.f16332c = i11;
            String str = hVarF.f3075c;
            d7.a.m(str, "message");
            a0Var.f16333d = str;
            a0Var.f16335f = aVar.a().k();
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f4976e = 3;
                return a0Var;
            }
            if (102 > i11 || i11 >= 200) {
                this.f4976e = 4;
                return a0Var;
            }
            this.f4976e = 3;
            return a0Var;
        } catch (EOFException e4) {
            throw new IOException(l.q.x("unexpected end of stream on ", this.f4973b.f2809b.f16377a.f16327i.f()), e4);
        }
    }

    @Override // ca.d
    public final k h() {
        return this.f4973b;
    }

    public final e i(long j10) {
        if (this.f4976e == 4) {
            this.f4976e = 5;
            return new e(this, j10);
        }
        throw new IllegalStateException(("state: " + this.f4976e).toString());
    }

    public final void j(q qVar, String str) {
        d7.a.m(qVar, "headers");
        d7.a.m(str, "requestLine");
        if (this.f4976e != 0) {
            throw new IllegalStateException(("state: " + this.f4976e).toString());
        }
        ja.h hVar = this.f4975d;
        hVar.V(str).V("\r\n");
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            hVar.V(qVar.i(i10)).V(": ").V(qVar.n(i10)).V("\r\n");
        }
        hVar.V("\r\n");
        this.f4976e = 1;
    }
}
