package k0;

import c4.C0066;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import g0.C0285;
import t2.C0420;
import u2.C0433;
import w2.C0457;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements y.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.n1 f9064a;

    public j1(y.i1 i1Var) {
        this.f9064a = C0173.m3305(i1Var, C0111.m2137());
        int iM8481 = C0433.m8481();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8481 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0074.m1605("1n")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // y.i1
    public final int a(m2.b bVar, m2.l lVar) {
        int iM8261 = 0;
        String str = "\u06e4\u06e5\u06e2";
        m0.n1 n1VarM5497 = null;
        Object objM8909 = null;
        y.i1 i1Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56505:
                    iM8261 = C0420.m8261(i1Var, bVar, lVar);
                    str = "\u06e3\u06e0\u06e2";
                    break;
                case 1750565:
                    return iM8261;
                case 1751681:
                    str = "\u06e5\u06e6\u06e6";
                    n1VarM5497 = C0285.m5497(this);
                    break;
                case 1752677:
                    objM8909 = C0457.m8909(n1VarM5497);
                    str = "\u06e4\u06e5\u06df";
                    break;
                default:
                    str = "\u06e6\u06df";
                    i1Var = (y.i1) objM8909;
                    break;
            }
        }
    }

    @Override // y.i1
    public final int b(m2.b bVar) {
        int iM3559 = 0;
        String str = "\u06e2\u06e6";
        y.i1 i1Var = null;
        m0.n1 n1VarM5497 = null;
        Object objM8909 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56383:
                    iM3559 = C0186.m3559(i1Var, bVar);
                    str = "\u06df\u06e3\u06e7";
                    break;
                case 1746819:
                    return iM3559;
                case 1755437:
                    objM8909 = C0457.m8909(n1VarM5497);
                    str = "\u06e8\u06e6\u06e3";
                    break;
                case 1755557:
                    i1Var = (y.i1) objM8909;
                    str = "\u06e2\u06e1";
                    break;
                default:
                    str = "\u06e8\u06e2\u06e7";
                    n1VarM5497 = C0285.m5497(this);
                    break;
            }
        }
    }

    @Override // y.i1
    public final int c(m2.b bVar, m2.l lVar) {
        int iM3431 = 0;
        String str = "\u06e4\u06e5";
        m0.n1 n1VarM5497 = null;
        y.i1 i1Var = null;
        Object objM8909 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747870:
                    iM3431 = C0180.m3431(i1Var, bVar, lVar);
                    str = "\u06e4\u06e4\u06e8";
                    break;
                case 1751619:
                    str = "\u06e0\u06e6\u06e4";
                    i1Var = (y.i1) objM8909;
                    break;
                case 1751656:
                    return iM3431;
                case 1754632:
                    objM8909 = C0457.m8909(n1VarM5497);
                    str = "\u06e4\u06e3\u06e2";
                    break;
                default:
                    str = "\u06e7\u06e7\u06e8";
                    n1VarM5497 = C0285.m5497(this);
                    break;
            }
        }
    }

    @Override // y.i1
    public final int d(m2.b bVar) {
        int iM1286 = 0;
        String str = "\u06e4\u06e0\u06e5";
        m0.n1 n1VarM5497 = null;
        Object objM8909 = null;
        y.i1 i1Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750695:
                    return iM1286;
                case 1751529:
                    str = "\u06e8\u06e8\u06e8";
                    n1VarM5497 = C0285.m5497(this);
                    break;
                case 1751560:
                    str = "\u06e8\u06e1\u06e3";
                    i1Var = (y.i1) objM8909;
                    break;
                case 1755624:
                    objM8909 = C0457.m8909(n1VarM5497);
                    str = "\u06e4\u06e1\u06e5";
                    break;
                default:
                    iM1286 = C0066.m1286(i1Var, bVar);
                    str = "\u06e3\u06e4\u06e8";
                    break;
            }
        }
    }
}
