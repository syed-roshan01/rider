package k6;

import aa.C0012;
import android.app.AlarmManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.C0013;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.input.pointer.C0034;
import c0.C0057;
import c7.C0068;
import com.google.android.datatransport.cct.C0078;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.C0128;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import d4.C0217;
import dagger.hilt.android.internal.C0235;
import e2.C0262;
import f4.C0276;
import fa.C0281;
import g.C0282;
import g2.C0287;
import h3.C0303;
import h5.C0308;
import h8.C0313;
import h8.C0314;
import k.C0331;
import l9.C0347;
import m0.C0349;
import n.C0361;
import n9.C0366;
import o8.C0371;
import r2.C0397;
import r6.C0402;
import s0.C0409;
import t7.C0425;
import t8.C0426;
import u.C0429;
import u7.C0437;
import v0.C0440;
import v5.C0445;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class j7 extends m7 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f555short = {737, 748, 737, 754, 749, 1379, 1391, 1389, 1326, 1383, 1391, 1391, 1383, 1388, 1381, 1326, 1377, 1390, 1380, 1394, 1391, 1385, 1380, 1326, 1383, 1389, 1395, 1326, 1389, 1381, 1377, 1395, 1397, 1394, 1381, 1389, 1381, 1390, 1396, 1326, 1345, 1392, 1392, 1357, 1381, 1377, 1395, 1397, 1394, 1381, 1389, 1381, 1390, 1396, 1362, 1381, 1379, 1381, 1385, 1398, 1381, 1394, 861, 849, 851, 784, 857, 849, 849, 857, 850, 859, 784, 863, 848, 858, 844, 849, 855, 858, 784, 857, 851, 845, 784, 851, 859, 863, 845, 843, 844, 859, 851, 859, 848, 842, 784, 875, 878, 882, 881, 895, 890, 689, 692, 697, 680, 696, 691, 702, 703, 686, 695, 702, 681, 2276, 2271, 2242, 2258, 2265, 2260, 2261, 2244, 2269, 2264, 2271, 2262, 2193, 2244, 2241, 2269, 2270, 2256, 2261, 2493, 2481, 2483, 2544, 2489, 2481, 2481, 2489, 2482, 2491, 2544, 2495, 2480, 2490, 2476, 2481, 2487, 2490, 2544, 2489, 2483, 2477, 2544, 2483, 2491, 2495, 2477, 2475, 2476, 2491, 2483, 2491, 2480, 2474, 2544, 2463, 2478, 2478, 2451, 2491, 2495, 2477, 2475, 2476, 2491, 2483, 2491, 2480, 2474, 2444, 2491, 2493, 2491, 2487, 2472, 2491, 2476, 1383, 1387, 1385, 1322, 1379, 1387, 1387, 1379, 1384, 1377, 1322, 1381, 1386, 1376, 1398, 1387, 1389, 1376, 1322, 1379, 1385, 1399, 1322, 1385, 1377, 1381, 1399, 1393, 1398, 1377, 1385, 1377, 1386, 1392, 1322, 1361, 1364, 1352, 1355, 1349, 1344, 2647, 2642, 2655, 2638, 2654, 2645, 2648, 2649, 2632, 2641, 2648, 2639, 2124, 2116, 2112, 2130, 2132, 2131, 2116, 2124, 2116, 2127, 2133};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f10132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f6 f10133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f10134f;

    public j7(p7 p7Var) {
        super(p7Var);
        this.f10132d = (AlarmManager) C0217.m4133(C0276.m5311(this), C0331.m6403(m6567(), 0, C0437.f708 ^ (-852), 640));
        int iM7897 = C0402.m7897();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7897 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0308.m5954("qit1cFS3l8B1SEpuY0e8Lrdt")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۦۥۥۣ, reason: contains not printable characters */
    public static short[] m6567() {
        int iM2776 = C0146.m2776();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2776 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f555short;
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

    @Override // k6.m7
    public final boolean r() {
        AlarmManager alarmManagerM4525 = C0235.m4525(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = alarmManagerM4525 != null ? 1709 : 1678;
                    break;
                case 204:
                    Context contextM5311 = C0276.m5311(this);
                    C0409.m8025(alarmManagerM4525, C0034.m674(contextM5311, 0, C0078.m1688(C0128.m2465(new Intent(), contextM5311, C0128.m2472(m6567(), 5, C0144.f170 ^ (-182), 1280)), C0282.m5456(m6567(), 62, C0314.f462 ^ 299, 830)), C0149.m2865()));
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        JobScheduler jobScheduler = (JobScheduler) C0217.m4133(C0276.m5311(this), C0483.m9406(m6567(), 103, C0116.f142 ^ 224, 731));
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (jobScheduler != null) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    C0426.m8364(jobScheduler, C0200.m3836(this));
                    break;
                default:
                    continue;
            }
            i11 = 1802;
        }
        return false;
    }

    public final void s() {
        C0068.m1329(this);
        C0135.m2604(C0136.m2634(C0029.m572(this)), C0117.m2265(m6567(), 115, C0013.f33 ^ 778, 2225));
        AlarmManager alarmManagerM4525 = C0235.m4525(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = alarmManagerM4525 != null ? 1709 : 1678;
                    break;
                case 204:
                    Context contextM5311 = C0276.m5311(this);
                    C0409.m8025(alarmManagerM4525, C0034.m674(contextM5311, 0, C0078.m1688(C0128.m2465(new Intent(), contextM5311, C0198.m3789(m6567(), 134, C0134.f160 ^ (-872), 2526)), C0281.m5440(m6567(), 191, C0425.f696 ^ (-378), 1284)), C0149.m2865()));
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        C0164.m3150(C0397.m7768(this));
        JobScheduler jobScheduler = (JobScheduler) C0217.m4133(C0276.m5311(this), C0361.m7077(m6567(), 232, C0349.f620 ^ 805, 2621));
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (jobScheduler != null) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    C0426.m8364(jobScheduler, C0200.m3836(this));
                    return;
                default:
                    continue;
            }
            i11 = 1802;
        }
    }

    public final int t() {
        Integer numM233 = C0012.m233(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (numM233 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    String strM8680 = C0445.m8680(C0276.m5311(this));
                    StringBuilder sb = new StringBuilder(C0347.m6790(m6567(), 244, C0303.f451 ^ (-599), 2081));
                    C0142.m2728(sb, strM8680);
                    this.f10134f = C0057.m1083(C0429.m8418(C0440.m8605(sb)));
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0366.m7190(C0012.m233(this));
    }

    public final n u() {
        f6 f6VarM5021 = C0262.m5021(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (f6VarM5021 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    this.f10133e = new f6(this, C0313.m6073(C0371.m7289(this)), C0287.f432 ^ (-543));
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0262.m5021(this);
    }
}
