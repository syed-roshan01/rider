package f0;

import com.auto.accept.ui.viewmodel.C0073;
import com.google.firebase.annotations.concurrent.C0124;
import dagger.hilt.internal.C0254;
import f6.C0278;
import g2.C0288;
import s8.C0417;
import y.C0476;

/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f5710a = new f2(C0476.m9271(), 0, 0);

    public static final g2.i0 a(g2.l0 l0Var, a2.e eVar) {
        String str = "۠ۤ۟";
        f2 f2Var = null;
        a2.e eVarM1585 = null;
        g2.s sVarM4852 = null;
        g2.i0 i0VarM5532 = null;
        String strM5369 = null;
        int iM8181 = 0;
        int iM8182 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56355:
                    eVar = C0073.m1585(i0VarM5532);
                    str = "ۨۧۧ";
                    break;
                case 1746905:
                    iM8182 = C0417.m8181(strM5369);
                    str = "۠ۧۧ";
                    break;
                case 1746936:
                    strM5369 = C0278.m5369(eVar);
                    str = "۠ۢ۟";
                    break;
                case 1747741:
                    iM8181 = C0417.m8181(strM5369);
                    str = "ۡۤ";
                    break;
                case 1747904:
                    sVarM4852 = C0254.m4852(i0VarM5532);
                    str = "ۤ۟ۡ";
                    break;
                case 1747928:
                    eVarM1585 = C0073.m1585(i0VarM5532);
                    str = "۟ۧ۠";
                    break;
                case 1749699:
                    i0VarM5532 = new g2.i0(eVarM1585, f2Var);
                    str = "ۤۡۦ";
                    break;
                case 1751494:
                    f2Var = new f2(sVarM4852, iM8181, iM8182);
                    str = "ۣۢۤ";
                    break;
                case 1751561:
                    return i0VarM5532;
                case 1755592:
                    strM5369 = C0278.m5369(eVar);
                    str = "۟ۦ۠";
                    break;
                default:
                    i0VarM5532 = C0288.m5532(l0Var, eVar);
                    str = "۠ۨ۠";
                    break;
            }
        }
    }
}
