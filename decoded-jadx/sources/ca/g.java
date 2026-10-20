package ca;

import a4.c0;
import ba.i;
import ba.k;
import ba.l;
import ba.m;
import ba.n;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import k4.o;
import l.r;
import r8.p;
import x9.a0;
import x9.b0;
import x9.d0;
import x9.s;
import x9.t;
import x9.w;
import x9.y;
import x9.z;

/* JADX INFO: loaded from: classes.dex */
public final class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f3072a;

    public g(w wVar) {
        d7.a.m(wVar, "client");
        this.f3072a = wVar;
    }

    public static int d(b0 b0Var, int i10) {
        String strB = b0.b(b0Var, "Retry-After");
        if (strB == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        d7.a.l(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strB).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        d7.a.l(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // x9.t
    public final b0 a(f fVar) {
        SSLSocketFactory sSLSocketFactory;
        ia.c cVar;
        x9.f fVar2;
        r rVar = fVar.f3067e;
        i iVar = fVar.f3063a;
        boolean z10 = true;
        Collection collectionQ0 = r8.r.f13661a;
        b0 b0Var = null;
        int i10 = 0;
        r rVarB = rVar;
        boolean z11 = true;
        while (true) {
            iVar.getClass();
            d7.a.m(rVarB, "request");
            if (iVar.f2801s != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (iVar) {
                try {
                    if (!(iVar.f2803u ^ z10)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                    if (!(iVar.f2802t ^ z10)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z11) {
                l lVar = iVar.f2793d;
                s sVar = (s) rVarB.f10910b;
                boolean z12 = sVar.f16464j;
                w wVar = iVar.f2790a;
                if (z12) {
                    SSLSocketFactory sSLSocketFactory2 = wVar.f16488v;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    ia.c cVar2 = wVar.f16492z;
                    fVar2 = wVar.A;
                    sSLSocketFactory = sSLSocketFactory2;
                    cVar = cVar2;
                } else {
                    sSLSocketFactory = null;
                    cVar = null;
                    fVar2 = null;
                }
                iVar.f2798p = new ba.e(lVar, new x9.a(sVar.f16458d, sVar.f16459e, wVar.f16484r, wVar.f16487u, sSLSocketFactory, cVar, fVar2, wVar.f16486t, wVar.f16491y, wVar.f16490x, wVar.f16485s), iVar, iVar.f2794e);
            }
            try {
                if (iVar.f2805w) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        b0 b0VarB = fVar.b(rVarB);
                        if (b0Var != null) {
                            a0 a0VarE = b0VarB.e();
                            a0 a0VarE2 = b0Var.e();
                            a0VarE2.f16336g = null;
                            b0 b0VarA = a0VarE2.a();
                            if (b0VarA.f16350n != null) {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                            a0VarE.f16339j = b0VarA;
                            b0VarB = a0VarE.a();
                        }
                        b0Var = b0VarB;
                        ba.d dVar = iVar.f2801s;
                        rVarB = b(b0Var, dVar);
                        if (rVarB == null) {
                            if (dVar != null && dVar.f2772e) {
                                if (!(!iVar.f2800r)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                iVar.f2800r = true;
                                iVar.f2795f.i();
                            }
                            iVar.e(false);
                            return b0Var;
                        }
                        o oVar = b0Var.f16350n;
                        if (oVar != null) {
                            y9.b.b(oVar);
                        }
                        i10++;
                        if (i10 > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i10);
                        }
                        iVar.e(true);
                        collectionQ0 = collectionQ0;
                        z11 = true;
                        z10 = true;
                    } catch (m e4) {
                        if (!c(e4.f2831b, iVar, rVarB, false)) {
                            IOException iOException = e4.f2830a;
                            d7.a.m(iOException, "<this>");
                            Iterator it = collectionQ0.iterator();
                            while (it.hasNext()) {
                                d7.a.c(iOException, (Exception) it.next());
                            }
                            throw iOException;
                        }
                        collectionQ0 = p.Q0(collectionQ0, e4.f2830a);
                        iVar.e(true);
                        z10 = true;
                        z11 = false;
                        i10 = i10;
                    }
                } catch (IOException e10) {
                    if (!c(e10, iVar, rVarB, !(e10 instanceof ea.a))) {
                        Iterator it2 = collectionQ0.iterator();
                        while (it2.hasNext()) {
                            d7.a.c(e10, (Exception) it2.next());
                        }
                        throw e10;
                    }
                    collectionQ0 = p.Q0(collectionQ0, e10);
                    iVar.e(true);
                    z10 = true;
                    i10 = i10;
                    z11 = false;
                }
            } catch (Throwable th2) {
                iVar.e(true);
                throw th2;
            }
        }
    }

    public final r b(b0 b0Var, ba.d dVar) throws ProtocolException {
        String strB;
        x9.r rVar;
        k kVar;
        d0 d0Var = (dVar == null || (kVar = dVar.f2774g) == null) ? null : kVar.f2809b;
        int i10 = b0Var.f16347d;
        String str = (String) b0Var.f16344a.f10911c;
        if (i10 != 307 && i10 != 308) {
            if (i10 == 401) {
                this.f3072a.f16480n.getClass();
                return null;
            }
            if (i10 == 421) {
                if (dVar == null || !(!d7.a.d(dVar.f2770c.f2776b.f16327i.f16458d, dVar.f2774g.f2809b.f16377a.f16327i.f16458d))) {
                    return null;
                }
                k kVar2 = dVar.f2774g;
                synchronized (kVar2) {
                    kVar2.f2818k = true;
                }
                return b0Var.f16344a;
            }
            if (i10 == 503) {
                b0 b0Var2 = b0Var.f16353q;
                if ((b0Var2 == null || b0Var2.f16347d != 503) && d(b0Var, Integer.MAX_VALUE) == 0) {
                    return b0Var.f16344a;
                }
                return null;
            }
            if (i10 == 407) {
                d7.a.j(d0Var);
                if (d0Var.f16378b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                this.f3072a.f16486t.getClass();
                return null;
            }
            if (i10 == 408) {
                if (!this.f3072a.f16479f) {
                    return null;
                }
                b0 b0Var3 = b0Var.f16353q;
                if ((b0Var3 == null || b0Var3.f16347d != 408) && d(b0Var, 0) <= 0) {
                    return b0Var.f16344a;
                }
                return null;
            }
            switch (i10) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        w wVar = this.f3072a;
        if (!wVar.f16481o || (strB = b0.b(b0Var, "Location")) == null) {
            return null;
        }
        r rVar2 = b0Var.f16344a;
        s sVar = (s) rVar2.f10910b;
        sVar.getClass();
        try {
            rVar = new x9.r();
            rVar.c(sVar, strB);
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        s sVarA = rVar != null ? rVar.a() : null;
        if (sVarA == null) {
            return null;
        }
        if (!d7.a.d(sVarA.f16455a, ((s) rVar2.f10910b).f16455a) && !wVar.f16482p) {
            return null;
        }
        y yVarH = rVar2.h();
        if (z6.a.X(str)) {
            boolean zD = d7.a.d(str, "PROPFIND");
            int i11 = b0Var.f16347d;
            boolean z10 = zD || i11 == 308 || i11 == 307;
            if (!(true ^ d7.a.d(str, "PROPFIND")) || i11 == 308 || i11 == 307) {
                yVarH.d(str, z10 ? (z) rVar2.f10913e : null);
            } else {
                yVarH.d("GET", null);
            }
            if (!z10) {
                yVarH.f16503c.d("Transfer-Encoding");
                yVarH.f16503c.d("Content-Length");
                yVarH.f16503c.d("Content-Type");
            }
        }
        if (!y9.b.a((s) rVar2.f10910b, sVarA)) {
            yVarH.f16503c.d("Authorization");
        }
        yVarH.f16501a = sVarA;
        return yVarH.a();
    }

    public final boolean c(IOException iOException, i iVar, r rVar, boolean z10) {
        n nVar;
        k kVar;
        if (!this.f3072a.f16479f) {
            return false;
        }
        if ((z10 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z10)) {
            return false;
        }
        ba.e eVar = iVar.f2798p;
        d7.a.j(eVar);
        int i10 = eVar.f2781g;
        if (i10 != 0 || eVar.f2782h != 0 || eVar.f2783i != 0) {
            if (eVar.f2784j == null) {
                d0 d0Var = null;
                if (i10 <= 1 && eVar.f2782h <= 1 && eVar.f2783i <= 0 && (kVar = eVar.f2777c.f2799q) != null) {
                    synchronized (kVar) {
                        if (kVar.f2819l == 0 && y9.b.a(kVar.f2809b.f16377a.f16327i, eVar.f2776b.f16327i)) {
                            d0Var = kVar.f2809b;
                        }
                    }
                }
                if (d0Var != null) {
                    eVar.f2784j = d0Var;
                } else {
                    c0 c0Var = eVar.f2779e;
                    if ((c0Var == null || !c0Var.j()) && (nVar = eVar.f2780f) != null && !nVar.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
