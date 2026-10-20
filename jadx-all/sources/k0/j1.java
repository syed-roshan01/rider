package k0;

import c4.C0066;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import g0.C0286;
import t2.C0421;
import u2.C0434;
import w2.C0458;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements y.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.n1 f9064a;

    public j1(y.i1 i1Var) {
        this.f9064a = C0173.m3305(i1Var, C0111.m2137());
        int iM8481 = C0434.m8481();
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
        String str = "ۤۥۢ";
        m0.n1 n1VarM5497 = null;
        Object objM8909 = null;
        y.i1 i1Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56505:
                    iM8261 = C0421.m8261(i1Var, bVar, lVar);
                    str = "ۣ۠ۢ";
                    break;
                case 1750565:
                    return iM8261;
                case 1751681:
                    str = "ۥۦۦ";
                    n1VarM5497 = C0286.m5497(this);
                    break;
                case 1752677:
                    objM8909 = C0458.m8909(n1VarM5497);
                    str = "ۤۥ۟";
                    break;
                default:
                    str = "ۦ۟";
                    i1Var = (y.i1) objM8909;
                    break;
            }
        }
    }

    @Override // y.i1
    public final int b(m2.b bVar) {
        int iM3559 = 0;
        String str = "ۢۦ";
        y.i1 i1Var = null;
        m0.n1 n1VarM5497 = null;
        Object objM8909 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56383:
                    iM3559 = C0186.m3559(i1Var, bVar);
                    str = "ۣ۟ۧ";
                    break;
                case 1746819:
                    return iM3559;
                case 1755437:
                    objM8909 = C0458.m8909(n1VarM5497);
                    str = "ۨۦۣ";
                    break;
                case 1755557:
                    i1Var = (y.i1) objM8909;
                    str = "ۢۡ";
                    break;
                default:
                    str = "ۨۢۧ";
                    n1VarM5497 = C0286.m5497(this);
                    break;
            }
        }
    }

    @Override // y.i1
    public final int c(m2.b bVar, m2.l lVar) {
        int iM3431 = 0;
        String str = "ۤۥ";
        m0.n1 n1VarM5497 = null;
        y.i1 i1Var = null;
        Object objM8909 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747870:
                    iM3431 = C0180.m3431(i1Var, bVar, lVar);
                    str = "ۤۤۨ";
                    break;
                case 1751619:
                    str = "۠ۦۤ";
                    i1Var = (y.i1) objM8909;
                    break;
                case 1751656:
                    return iM3431;
                case 1754632:
                    objM8909 = C0458.m8909(n1VarM5497);
                    str = "ۣۤۢ";
                    break;
                default:
                    str = "ۧۧۨ";
                    n1VarM5497 = C0286.m5497(this);
                    break;
            }
        }
    }

    @Override // y.i1
    public final int d(m2.b bVar) {
        int iM1286 = 0;
        String str = "ۤ۠ۥ";
        m0.n1 n1VarM5497 = null;
        Object objM8909 = null;
        y.i1 i1Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750695:
                    return iM1286;
                case 1751529:
                    str = "ۨۨۨ";
                    n1VarM5497 = C0286.m5497(this);
                    break;
                case 1751560:
                    str = "ۣۨۡ";
                    i1Var = (y.i1) objM8909;
                    break;
                case 1755624:
                    objM8909 = C0458.m8909(n1VarM5497);
                    str = "ۤۡۥ";
                    break;
                default:
                    iM1286 = C0066.m1286(i1Var, bVar);
                    str = "ۣۤۨ";
                    break;
            }
        }
    }
}
