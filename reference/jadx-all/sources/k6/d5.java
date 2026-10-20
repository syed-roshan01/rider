package k6;

import a2.C0004;
import android.support.v4.app.C0015;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.draw.C0029;
import b7.C0053;
import c4.C0064;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import d7.C0220;
import dagger.hilt.android.lifecycle.C0237;
import fa.C0282;
import h.C0298;
import h7.C0312;
import j5.C0328;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import k.C0332;
import k1.C0333;
import k3.C0336;
import k4.C0337;
import m7.C0358;
import q6.C0387;
import r4.C0399;
import t1.C0420;
import u.C0429;
import u7.C0438;
import u8.C0439;
import w0.C0455;
import w2.C0457;
import y9.C0480;

/* JADX INFO: loaded from: classes.dex */
public final class d5 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f535short = {1510, 1491, 1473, 1497, 1473, 1426, 1499, 1500, 1494, 1495, 1482, 1426, 1501, 1476, 1495, 1472, 1492, 1502, 1501, 1477, 1124, 1105, 1091, 1115, 1040, 1109, 1096, 1107, 1109, 1088, 1092, 1113, 1119, 1118, 1040, 1119, 1118, 1040, 1095, 1119, 1090, 1115, 1109, 1090, 1040, 1092, 1112, 1090, 1109, 1105, 1108, 1025, 1076, 1062, 1086, 1062, 1141, 1084, 1083, 1073, 1072, 1069, 1141, 1082, 1059, 1072, 1063, 1075, 1081, 1082, 1058, 836, 871, 895, 816, 868, 881, 867, 891, 867, 816, 867, 888, 881, 866, 885, 816, 868, 888, 885, 816, 867, 881, 893, 885, 816, 889, 894, 884, 885, 872, 830, 816, 889, 894, 884, 885, 872};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z4 f9976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(z4 z4Var, Runnable runnable, boolean z10, String str) {
        super(C0202.m3873(C0312.m6030(), runnable), null);
        this.f9976d = z4Var;
        long jM6521 = C0337.m6521(C0457.m8894());
        this.f9973a = jM6521;
        this.f9975c = str;
        this.f9974b = z10;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = jM6521 == Long.MAX_VALUE ? 1709 : 1678;
                    break;
                case 204:
                    C0135.m2604(C0455.m8871(C0029.m572(z4Var)), C0053.m1023(m6547(), 0, C0358.f628 ^ 792, 1458));
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        int iM7797 = C0399.m7797();
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM7797 >= 0) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Long.valueOf(C0022.m426("w0xVNiPSAsOulfNeQe")));
                    return;
                default:
                    continue;
            }
            i11 = 1802;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(z4 z4Var, Callable callable, boolean z10) {
        super(C0004.m74(C0312.m6030(), callable));
        this.f9976d = z4Var;
        long jM6521 = C0337.m6521(C0457.m8894());
        this.f9973a = jM6521;
        this.f9975c = C0220.m4233(m6547(), 20, C0333.f516 ^ 812, 1072);
        this.f9974b = z10;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = jM6521 == Long.MAX_VALUE ? 1709 : 1678;
                    break;
                case 204:
                    C0135.m2604(C0455.m8871(C0029.m572(z4Var)), C0387.m7577(m6547(), 51, C0015.f35 ^ 743, 1109));
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        int iM8543 = C0438.m8543();
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM8543 <= 0) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Long.valueOf(C0237.m4554("UPEsekLsy2LTa9kKUm9szIdFL5i3")));
                    return;
                default:
                    continue;
            }
            i11 = 1802;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6547() {
        int iM5443 = C0282.m5443();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5443 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f535short;
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

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d5 d5Var = (d5) obj;
        boolean zM1228 = C0064.m1228(d5Var);
        int i10 = C0298.f445 ^ 489;
        boolean zM1229 = C0064.m1228(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM1229 != zM1228) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM1229) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return 1;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return i10;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    long jM8401 = C0429.m8401(this);
                    long jM8402 = C0429.m8401(d5Var);
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (jM8401 < jM8402) {
                                    i13 = 48736;
                                }
                                break;
                            case 47384:
                                int i14 = 48767;
                                while (true) {
                                    i14 ^= 48784;
                                    switch (i14) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            d4 d4VarM572 = C0029.m572(C0328.m6328(this));
                                            C0420.m8245(C0336.m6498(d4VarM572), C0480.m9345(m6547(), 71, C0332.f479 ^ 290, 784), C0439.m8554(jM8401));
                                            return 0;
                                        case 76:
                                            return 1;
                                        case 239:
                                            if (jM8401 > jM8402) {
                                                i14 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i14 = 48829;
                                }
                                break;
                            case 47417:
                                return i10;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i13 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        String str = "ۦۦۧ";
        f4 f4VarM8871 = null;
        d4 d4VarM572 = null;
        z4 z4VarM6328 = null;
        String strM3586 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748735:
                    f4VarM8871 = C0455.m8871(d4VarM572);
                    str = "ۨۡ۠";
                    break;
                case 1748804:
                    str = "ۣ۠ۨ";
                    d4VarM572 = C0029.m572(z4VarM6328);
                    break;
                case 1750659:
                    return;
                case 1753416:
                    super.setException(th);
                    str = "ۣۣۣ";
                    break;
                case 1753639:
                    str = "ۡۥۨ";
                    z4VarM6328 = C0328.m6328(this);
                    break;
                case 1755399:
                    C0420.m8245(f4VarM8871, strM3586, th);
                    str = "ۦ۟ۡ";
                    break;
                default:
                    str = "ۣۡۡ";
                    strM3586 = C0188.m3586(this);
                    break;
            }
        }
    }
}
