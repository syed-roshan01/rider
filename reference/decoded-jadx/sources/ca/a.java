package ca;

import k4.o;
import l.r;
import l9.i;
import x9.a0;
import x9.b0;
import x9.c0;
import x9.k;
import x9.n;
import x9.p;
import x9.q;
import x9.s;
import x9.t;
import x9.y;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f3058a;

    public a(n nVar) {
        d7.a.m(nVar, "cookieJar");
        this.f3058a = nVar;
    }

    @Override // x9.t
    public final b0 a(f fVar) {
        o oVar;
        r rVar = fVar.f3067e;
        y yVarH = rVar.h();
        Object obj = rVar.f10913e;
        boolean z10 = false;
        if (((q) rVar.f10912d).e("Host") == null) {
            yVarH.c("Host", y9.b.t((s) rVar.f10910b, false));
        }
        if (((q) rVar.f10912d).e("Connection") == null) {
            yVarH.c("Connection", "Keep-Alive");
        }
        if (((q) rVar.f10912d).e("Accept-Encoding") == null && ((q) rVar.f10912d).e("Range") == null) {
            yVarH.c("Accept-Encoding", "gzip");
            z10 = true;
        }
        s sVar = (s) rVar.f10910b;
        k kVar = this.f3058a;
        ((n) kVar).getClass();
        d7.a.m(sVar, "url");
        if (((q) rVar.f10912d).e("User-Agent") == null) {
            yVarH.c("User-Agent", "okhttp/4.12.0");
        }
        b0 b0VarB = fVar.b(yVarH.a());
        s sVar2 = (s) rVar.f10910b;
        q qVar = b0VarB.f16349f;
        e.b(kVar, sVar2, qVar);
        a0 a0VarE = b0VarB.e();
        a0VarE.f16330a = rVar;
        if (z10 && i.K0("gzip", b0.b(b0VarB, "Content-Encoding")) && e.a(b0VarB) && (oVar = b0VarB.f16350n) != null) {
            ja.q qVar2 = new ja.q(((c0) oVar).f16375c);
            p pVarK = qVar.k();
            pVarK.d("Content-Encoding");
            pVarK.d("Content-Length");
            a0VarE.f16335f = pVarK.c().k();
            a0VarE.f16336g = new c0(b0.b(b0VarB, "Content-Type"), -1L, r9.a.c(qVar2));
        }
        return a0VarE.a();
    }
}
