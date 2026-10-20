package ca;

import ba.i;
import ba.k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import k4.o;
import l.r;
import x9.a0;
import x9.b0;
import x9.c0;
import x9.n;
import x9.q;
import x9.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3059a;

    public b(boolean z10) {
        this.f3059a = z10;
    }

    @Override // x9.t
    public final b0 a(f fVar) throws IllegalAccessException, IOException, InvocationTargetException {
        IOException iOException;
        IOException iOException2;
        b0 b0VarA;
        ba.d dVar = fVar.f3066d;
        d7.a.j(dVar);
        d dVar2 = dVar.f2771d;
        n nVar = dVar.f2769b;
        i iVar = dVar.f2768a;
        k kVar = dVar.f2774g;
        r rVar = fVar.f3067e;
        Object obj = rVar.f10913e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                nVar.getClass();
                d7.a.m(iVar, "call");
                dVar2.f(rVar);
                z6.a.X((String) rVar.f10911c);
                iVar.g(dVar, true, false, null);
                try {
                    dVar2.c();
                    iOException = null;
                } catch (IOException e4) {
                    dVar.d(e4);
                    throw e4;
                }
            } catch (IOException e10) {
                nVar.getClass();
                d7.a.m(iVar, "call");
                dVar.d(e10);
                throw e10;
            }
        } catch (IOException e11) {
            if (e11 instanceof ea.a) {
                throw e11;
            }
            if (!dVar.f2773f) {
                throw e11;
            }
            iOException = e11;
        }
        try {
            a0 a0VarC = dVar.c(false);
            d7.a.j(a0VarC);
            nVar.getClass();
            d7.a.m(iVar, "call");
            a0VarC.f16330a = rVar;
            a0VarC.f16334e = kVar.f2812e;
            a0VarC.f16340k = jCurrentTimeMillis;
            iOException2 = iOException;
            try {
                a0VarC.f16341l = System.currentTimeMillis();
                b0 b0VarA2 = a0VarC.a();
                int i10 = b0VarA2.f16347d;
                if (i10 == 100 || (102 <= i10 && i10 < 200)) {
                    a0 a0VarC2 = dVar.c(false);
                    d7.a.j(a0VarC2);
                    a0VarC2.f16330a = rVar;
                    a0VarC2.f16334e = kVar.f2812e;
                    a0VarC2.f16340k = jCurrentTimeMillis;
                    a0VarC2.f16341l = System.currentTimeMillis();
                    b0VarA2 = a0VarC2.a();
                    i10 = b0VarA2.f16347d;
                }
                nVar.getClass();
                d7.a.m(iVar, "call");
                try {
                    if (this.f3059a && i10 == 101) {
                        a0 a0VarE = b0VarA2.e();
                        a0VarE.f16336g = y9.b.f17002c;
                        b0VarA = a0VarE.a();
                    } else {
                        a0 a0VarE2 = b0VarA2.e();
                        a0VarE2.f16336g = dVar.b(b0VarA2);
                        b0VarA = a0VarE2.a();
                    }
                    if (l9.i.K0("close", ((q) b0VarA.f16344a.f10912d).e("Connection")) || l9.i.K0("close", b0.b(b0VarA, "Connection"))) {
                        dVar2.h().k();
                    }
                    if (i10 == 204 || i10 == 205) {
                        o oVar = b0VarA.f16350n;
                        if ((oVar != null ? ((c0) oVar).f16374b : -1L) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i10);
                            sb.append(" had non-zero Content-Length: ");
                            o oVar2 = b0VarA.f16350n;
                            sb.append(oVar2 != null ? Long.valueOf(((c0) oVar2).f16374b) : null);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return b0VarA;
                } catch (IOException e12) {
                    e = e12;
                    if (iOException2 == null) {
                        throw e;
                    }
                    IOException iOException3 = iOException2;
                    d7.a.c(iOException3, e);
                    throw iOException3;
                }
            } catch (IOException e13) {
                e = e13;
            }
        } catch (IOException e14) {
            e = e14;
            iOException2 = iOException;
        }
    }
}
