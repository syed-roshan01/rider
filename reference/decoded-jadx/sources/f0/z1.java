package f0;

import a8.C0009;
import androidx.profileinstaller.C0046;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0217;
import l0.C0339;
import n7.C0363;
import r9.C0405;
import t8.C0426;
import w2.C0457;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f6017a = new z1(C0081.f115 ^ 186);

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        a2 a2Var = (a2) obj2;
        Float fM4139 = C0217.m4139(C0046.m887(C0426.m8369(a2Var)));
        v.h1 h1Var = (v.h1) C0457.m8909(C0363.m7128(a2Var));
        v.h1 h1VarM6671 = C0339.m6671();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (h1Var == h1VarM6671) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    z10 = true;
                    break;
                case 239:
                    z10 = false;
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0405.m7965(new Object[]{fM4139, C0009.m192(z10)});
    }
}
