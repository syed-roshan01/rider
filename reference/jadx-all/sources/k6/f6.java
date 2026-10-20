package k6;

import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import b3.C0051;
import b7.C0054;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.protobuf.C0209;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import e1.C0259;
import ea.C0269;
import g2.C0287;
import h7.C0313;
import j2.C0324;
import java.net.MalformedURLException;
import m0.C0350;
import o8.C0372;
import t2.C0424;
import u.C0430;
import w4.C0462;

/* JADX INFO: loaded from: classes.dex */
public final class f6 extends n {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f543short = {926, 953, 940, 959, 953, 932, 931, 938, 1005, 952, 957, 929, 930, 940, 937, 1005, 939, 959, 930, 928, 1005, 905, 936, 929, 940, 948, 936, 937, 927, 952, 931, 931, 940, 943, 929, 936};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10051f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(Object obj, f5 f5Var, int i10) {
        super(f5Var);
        this.f10050e = i10;
        this.f10051f = obj;
        int iM6259 = C0324.m6259();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6259 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0430.m8423("aS")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static short[] m6555() {
        int iM6046 = C0313.m6046();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6046 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f543short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // k6.n
    public final void c() throws MalformedURLException {
        int iM3425 = C0180.m3425(this);
        Object objM5121 = C0269.m5121(this);
        switch (iM3425) {
            case 0:
                y5 y5Var = (y5) objM5121;
                boolean zM3163 = C0165.m3163((f5) C0163.m3121(y5Var));
                int i10 = 1740;
                while (true) {
                    i10 ^= 1757;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (zM3163) {
                                i10 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            C0259.m4929(C0209.m4019(y5Var), 1135 ^ ((long) C0117.f143));
                            break;
                        default:
                            continue;
                    }
                    i10 = 1802;
                }
                break;
            case 1:
                h7 h7Var = (h7) objM5121;
                C0040.m791(C0015.m304(h7Var));
                d7 d7VarM304 = C0015.m304(h7Var);
                C0014.m280((e6.c) C0166.m3176(d7VarM304));
                C0462.m8994(h7Var, false, false, C0199.m3820());
                q qVarM2294 = C0119.m2294((f5) C0163.m3121(d7VarM304));
                C0014.m280((e6.c) C0166.m3176(d7VarM304));
                C0424.m8305(qVarM2294, C0199.m3820());
                break;
            default:
                j7 j7Var = (j7) objM5121;
                C0350.m6853(j7Var);
                d4 d4VarM572 = C0029.m572(j7Var);
                C0135.m2604(C0136.m2634(d4VarM572), C0054.m1043(m6555(), 0, C0231.f310 ^ (-809), 973));
                C0287.m5519(C0372.m7289(j7Var));
                int iM3841 = C0200.m3841();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM3841 >= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Long.parseLong(C0051.m989("xkVcVKOlD3X1yDtft7qu0IZem")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                break;
        }
    }
}
