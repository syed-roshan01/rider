package f0;

import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.iid.internal.C0168;
import j9.C0330;
import java.util.List;
import s0.C0411;
import u1.C0432;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements r1.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f5811a = new l0();

    @Override // r1.j0
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        String str = "۠ۡۡ";
        r1.k0 k0VarM8048 = null;
        j jVarM6363 = null;
        r8.s sVarM2452 = null;
        int iM8451 = 0;
        int iM3212 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747712:
                    iM3212 = C0168.m3212(j10);
                    str = "ۣۧۢ";
                    break;
                case 1748892:
                    sVarM2452 = C0127.m2452();
                    str = "ۧۢۡ";
                    break;
                case 1751616:
                    jVarM6363 = C0330.m6363();
                    str = "ۣۡۨ";
                    break;
                case 1754470:
                    k0VarM8048 = C0411.m8048(l0Var, iM3212, iM8451, sVarM2452, jVarM6363);
                    str = "ۨۡ۠";
                    break;
                case 1755399:
                    return k0VarM8048;
                default:
                    iM8451 = C0432.m8451(j10);
                    str = "ۣۤ۟";
                    break;
            }
        }
    }
}
