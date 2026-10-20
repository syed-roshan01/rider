package k6;

import a3.C0006;
import a8.C0009;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import e1.C0259;
import g.C0285;
import h4.C0305;
import i.C0317;
import ja.C0331;
import o1.C0368;
import r1.C0394;
import r7.C0405;
import u1.C0432;
import u3.C0435;
import v6.C0448;

/* JADX INFO: loaded from: classes.dex */
public final class t6 extends n {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f588short = {3292, 3305, 3323, 3299, 3323, 3240, 3296, 3305, 3326, 3309, 3240, 3306, 3309, 3309, 3302, 3240, 3321, 3325, 3309, 3325, 3309, 3308, 3240, 3310, 3303, 3322, 3240, 3305, 3240, 3300, 3303, 3302, 3311, 3240, 3324, 3297, 3301, 3309, 1495, 1520, 1535, 1533, 1514, 1527, 1512, 1527, 1514, 1511, 1458, 1470, 1530, 1527, 1517, 1533, 1521, 1520, 1520, 1531, 1533, 1514, 1527, 1520, 1529, 1470, 1528, 1516, 1521, 1523, 1470, 1514, 1526, 1531, 1470, 1517, 1531, 1516, 1512, 1527, 1533, 1531};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s6 f10402f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(s6 s6Var, p5 p5Var, int i10) {
        super(p5Var);
        this.f10401e = i10;
        this.f10402f = s6Var;
        int iM5882 = C0305.m5882();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5882 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0178.m3386("xNrNLpUnUNBwcl7km808W")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6598() {
        int iM177 = C0009.m177();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM177 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f588short;
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
    public final void c() {
        int iM7941 = C0405.m7941(this);
        s6 s6VarM4941 = C0259.m4941(this);
        switch (iM7941) {
            case 0:
                C0040.m791(s6VarM4941);
                boolean zM8489 = C0435.m8489(s6VarM4941);
                int i10 = 1740;
                while (true) {
                    i10 ^= 1757;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (zM8489) {
                                i10 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            d4 d4VarM572 = C0029.m572(s6VarM4941);
                            C0135.m2604(C0136.m2634(d4VarM572), C0432.m8452(m6598(), 38, C0006.f1064 ^ 196, 1438));
                            C0368.m7202(s6VarM4941);
                            break;
                        default:
                            continue;
                    }
                    i10 = 1802;
                }
                break;
            default:
                d4 d4VarM573 = C0029.m572(s6VarM4941);
                C0135.m2604(C0331.m6385(d4VarM573), C0317.m6131(m6598(), 0, C0394.f664 ^ 307, 3208));
                int iM8732 = C0448.m8732();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM8732 >= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(C0285.m5478("6xiHYNGUSUFNqB"));
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
