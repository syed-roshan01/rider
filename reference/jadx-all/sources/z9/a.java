package z9;

import ba.i;
import ca.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import k4.o;
import l.r;
import x9.a0;
import x9.b0;
import x9.n;
import x9.q;
import x9.t;
import x9.v;
import x9.x;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17336a = 0;

    @Override // x9.t
    public final b0 a(f fVar) {
        String str;
        q qVar;
        String str2;
        System.currentTimeMillis();
        r rVar = fVar.f3067e;
        d7.a.m(rVar, "request");
        b bVar = new b(rVar, null);
        if (rVar.d().f16369j) {
            bVar = new b(null, null);
        }
        i iVar = fVar.f3063a;
        i iVar2 = iVar instanceof i ? iVar : null;
        if (iVar2 != null) {
            n nVar = iVar2.f2794e;
        }
        r rVar2 = bVar.f17337a;
        b0 b0Var = bVar.f17338b;
        if (rVar2 == null && b0Var == null) {
            a0 a0Var = new a0();
            a0Var.f16330a = rVar;
            a0Var.f16331b = x.HTTP_1_1;
            a0Var.f16332c = 504;
            a0Var.f16333d = "Unsatisfiable Request (only-if-cached)";
            a0Var.f16336g = y9.b.f17002c;
            a0Var.f16340k = -1L;
            a0Var.f16341l = System.currentTimeMillis();
            b0 b0VarA = a0Var.a();
            d7.a.m(iVar, "call");
            return b0VarA;
        }
        if (rVar2 == null) {
            d7.a.j(b0Var);
            a0 a0VarE = b0Var.e();
            b0 b0VarG = v.g(b0Var);
            a0.b("cacheResponse", b0VarG);
            a0VarE.f16338i = b0VarG;
            b0 b0VarA2 = a0VarE.a();
            d7.a.m(iVar, "call");
            return b0VarA2;
        }
        if (b0Var != null) {
            d7.a.m(iVar, "call");
        }
        b0 b0VarB = fVar.b(rVar2);
        String str3 = "networkResponse";
        if (b0Var == null) {
            str = "networkResponse";
        } else {
            if (b0VarB.f16347d == 304) {
                a0 a0VarE2 = b0Var.e();
                ArrayList arrayList = new ArrayList(20);
                q qVar2 = b0Var.f16349f;
                int size = qVar2.size();
                int i10 = 0;
                while (true) {
                    qVar = b0VarB.f16349f;
                    if (i10 >= size) {
                        break;
                    }
                    String strI = qVar2.i(i10);
                    int i11 = size;
                    String strN = qVar2.n(i10);
                    q qVar3 = qVar2;
                    if (l9.i.K0("Warning", strI)) {
                        str2 = str3;
                        if (l9.i.h1(strN, "1", false)) {
                        }
                        i10++;
                        size = i11;
                        qVar2 = qVar3;
                        str3 = str2;
                    } else {
                        str2 = str3;
                    }
                    if (l9.i.K0("Content-Length", strI) || l9.i.K0("Content-Encoding", strI) || l9.i.K0("Content-Type", strI) || !v.A(strI) || qVar.e(strI) == null) {
                        d7.a.m(strI, "name");
                        d7.a.m(strN, FirebaseAnalytics.Param.VALUE);
                        arrayList.add(strI);
                        arrayList.add(l9.i.o1(strN).toString());
                    }
                    i10++;
                    size = i11;
                    qVar2 = qVar3;
                    str3 = str2;
                }
                String str4 = str3;
                int size2 = qVar.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    String strI2 = qVar.i(i12);
                    if (!l9.i.K0("Content-Length", strI2) && !l9.i.K0("Content-Encoding", strI2) && !l9.i.K0("Content-Type", strI2) && v.A(strI2)) {
                        String strN2 = qVar.n(i12);
                        d7.a.m(strI2, "name");
                        d7.a.m(strN2, FirebaseAnalytics.Param.VALUE);
                        arrayList.add(strI2);
                        arrayList.add(l9.i.o1(strN2).toString());
                    }
                }
                a0VarE2.f16335f = new q((String[]) arrayList.toArray(new String[0])).k();
                a0VarE2.f16340k = b0VarB.f16354r;
                a0VarE2.f16341l = b0VarB.f16355s;
                b0 b0VarG2 = v.g(b0Var);
                a0.b("cacheResponse", b0VarG2);
                a0VarE2.f16338i = b0VarG2;
                b0 b0VarG3 = v.g(b0VarB);
                a0.b(str4, b0VarG3);
                a0VarE2.f16337h = b0VarG3;
                a0VarE2.a();
                o oVar = b0VarB.f16350n;
                d7.a.j(oVar);
                oVar.close();
                d7.a.j(null);
                throw null;
            }
            str = "networkResponse";
            o oVar2 = b0Var.f16350n;
            if (oVar2 != null) {
                y9.b.b(oVar2);
            }
        }
        a0 a0VarE3 = b0VarB.e();
        b0 b0VarG4 = v.g(b0Var);
        a0.b("cacheResponse", b0VarG4);
        a0VarE3.f16338i = b0VarG4;
        b0 b0VarG5 = v.g(b0VarB);
        a0.b(str, b0VarG5);
        a0VarE3.f16337h = b0VarG5;
        return a0VarE3.a();
    }
}
