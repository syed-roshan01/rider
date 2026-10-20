package y3;

import a4.q;
import a7.C0008;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.foundation.layout.C0023;
import androidx.concurrent.futures.o;
import c1.C0059;
import com.google.android.gms.common.util.C0085;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import d3.C0217;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.migration.C0240;
import e1.C0259;
import e2.C0261;
import e2.C0262;
import e9.C0267;
import g0.C0286;
import g5.C0291;
import h.C0297;
import h0.C0300;
import h4.C0305;
import h5.C0307;
import j2.C0325;
import ja.C0331;
import java.io.File;
import java.io.IOException;
import k3.C0335;
import l8.C0346;
import m7.C0359;
import m9.C0360;
import n9.C0367;
import o7.i2;
import s.C0408;
import t2.C0422;
import u.C0430;
import v5.C0446;
import z3.C0486;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f749short = {2347, 2400, 2405, 2416, 2405, 2347, 2409, 2413, 2423, 2407, 2347, 2420, 2422, 2411, 2402, 2413, 2408, 2401, 2423, 2347, 2422, 2401, 2402, 2347, 767, 765, 742, 738, 750, 765, 758, 673, 767, 765, 736, 745, 592, 539, 542, 523, 542, 592, 530, 534, 524, 540, 592, 527, 525, 528, 537, 534, 531, 538, 524, 592, 540, 522, 525, 592, 591, 592, 1229, 1231, 1236, 1232, 1244, 1231, 1220, 1171, 1229, 1231, 1234, 1243, 1738, 1736, 1749, 1756, 1747, 1750, 1759, 1779, 1748, 1737, 1742, 1755, 1750, 1750, 1759, 1758};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f16915a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f16916b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q f16917c = null;

    public static long a(Context context) {
        PackageManager packageManagerM8279 = C0422.m8279(C0023.m447(context));
        int iM7181 = C0367.m7181();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7181 >= 33) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0188.m3593(C0331.m6394(packageManagerM8279, context));
                case 239:
                    return C0188.m3593(C0291.m5588(packageManagerM8279, C0446.m8680(context), 0));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static q b() {
        String str = "ۦۨۧ";
        o oVarM8412 = null;
        q qVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750593:
                    C0228.m4377(oVarM8412, qVar);
                    str = "ۣۡ۠";
                    break;
                case 1750594:
                    str = "ۥۣۨ";
                    qVar = C0261.m4980();
                    break;
                case 1753448:
                    f16917c = qVar;
                    str = "ۧ۟ۤ";
                    break;
                case 1753701:
                    str = "ۦ۠ۢ";
                    qVar = new q();
                    break;
                case 1754380:
                    oVarM8412 = C0430.m8412();
                    str = "ۣۡ۟";
                    break;
                default:
                    return qVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:284:0x039b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:213:0x02fd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:220:0x0316. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x032c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:236:0x0346. Please report as an issue. */
    public static void c(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        j jVarM5082;
        int iM3675;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = !z10 ? 1709 : 1678;
                    break;
                case 204:
                    q qVarM4980 = C0261.m4980();
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = qVarM4980 != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        synchronized (C0335.m6484()) {
            int i16 = 1864;
            while (true) {
                i16 ^= 1881;
                switch (i16) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i16 = !z10 ? 48736 : 48705;
                        break;
                    case 47384:
                        break;
                    case 47417:
                        try {
                            q qVarM4981 = C0261.m4980();
                            int i17 = 48767;
                            while (true) {
                                i17 ^= 48784;
                                switch (i17) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        break;
                                    case 76:
                                        return;
                                    case 239:
                                        i17 = qVarM4981 != null ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } catch (Throwable th) {
                            int i18 = 48891;
                            while (true) {
                                i18 ^= 48908;
                                switch (i18) {
                                    case 22:
                                        throw th;
                                    case 503:
                                        i18 = 48922;
                                        break;
                                }
                            }
                        }
                        break;
                    case 47483:
                        break;
                    default:
                        break;
                }
            }
            int iM7181 = C0367.m7181();
            int i19 = 49666;
            while (true) {
                i19 ^= 49683;
                switch (i19) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i19 = iM7181 >= 28 ? 49759 : 49728;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        int i20 = 49790;
                        while (true) {
                            i20 ^= 49807;
                            switch (i20) {
                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 51:
                                    File file = new File(new File(C0008.m172(m9284(), 0, C0259.f338 ^ 764, 2308), C0446.m8680(context)), C0360.m7056(m9284(), 24, C0217.f240 ^ (-924), 655));
                                    long jM9458 = C0486.m9458(file);
                                    boolean zM5755 = C0300.m5755(file);
                                    int i21 = 50689;
                                    while (true) {
                                        i21 ^= 50706;
                                        switch (i21) {
                                            case 19:
                                                i21 = zM5755 ? 50782 : 50751;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                z11 = false;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                int i22 = 50813;
                                                while (true) {
                                                    i22 ^= 50830;
                                                    switch (i22) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 53:
                                                            z11 = false;
                                                            break;
                                                        case 243:
                                                            i22 = jM9458 > 0 ? 51557 : 50875;
                                                            break;
                                                        case 4075:
                                                            int i23 = 51588;
                                                            while (true) {
                                                                i23 ^= 51605;
                                                                switch (i23) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i23 = 51619;
                                                                        continue;
                                                                    case 54:
                                                                        z11 = true;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    File file2 = new File(new File(C0490.m9527(m9284(), 36, C0240.f319 ^ 208, 639), C0446.m8680(context)), C0166.m3169(m9284(), 62, C0307.f454 ^ (-370), 1213));
                                    long jM9459 = C0486.m9458(file2);
                                    boolean zM5756 = C0300.m5755(file2);
                                    int i24 = 51712;
                                    while (true) {
                                        i24 ^= 51729;
                                        switch (i24) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i24 = zM5756 ? 51805 : 51774;
                                                break;
                                            case 47:
                                                z12 = false;
                                                break;
                                            case 76:
                                                int i25 = 51836;
                                                while (true) {
                                                    i25 ^= 51853;
                                                    switch (i25) {
                                                        case 241:
                                                            i25 = jM9459 > 0 ? 52580 : 52549;
                                                            break;
                                                        case 1963:
                                                            break;
                                                        case 1992:
                                                            z12 = false;
                                                            break;
                                                        case 2025:
                                                            int i26 = 52611;
                                                            while (true) {
                                                                i26 ^= 52628;
                                                                switch (i26) {
                                                                    case 23:
                                                                        i26 = 52642;
                                                                        continue;
                                                                    case 54:
                                                                        z12 = true;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    try {
                                        long jM6274 = C0325.m6274(context);
                                        File file3 = new File(C0262.m4999(context), C0359.m7042(m9284(), 74, C0408.f678 ^ (-510), 1722));
                                        boolean zM5757 = C0300.m5755(file3);
                                        int i27 = 52735;
                                        while (true) {
                                            i27 ^= 52752;
                                            switch (i27) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    jVarM5082 = null;
                                                    break;
                                                case 1007:
                                                    i27 = zM5757 ? 53479 : 52797;
                                                    break;
                                                case 7927:
                                                    try {
                                                        jVarM5082 = C0267.m5082(file3);
                                                        int i28 = 53510;
                                                        while (true) {
                                                            i28 ^= 53527;
                                                            switch (i28) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i28 = 53541;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                    } catch (IOException e4) {
                                                        C0305.m5863();
                                                        int iM6759 = C0346.m6759();
                                                        int i29 = 53634;
                                                        while (true) {
                                                            i29 ^= 53651;
                                                            switch (i29) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (iM6759 >= 0) {
                                                                        i29 = 53727;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    System.out.println(Integer.valueOf(C0085.m1811("FWoZV5J")));
                                                                    return;
                                                                case 83:
                                                                    return;
                                                                default:
                                                                    continue;
                                                            }
                                                            i29 = 53696;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        int i30 = 53758;
                                        while (true) {
                                            i30 ^= 53775;
                                            switch (i30) {
                                                case 1009:
                                                    i30 = jVarM5082 != null ? 54502 : 54471;
                                                    break;
                                                case 1703:
                                                    break;
                                                case 1736:
                                                    i11 = 55680;
                                                    while (true) {
                                                        i11 ^= 55697;
                                                        switch (i11) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i11 = z11 ? 56424 : 56393;
                                                                break;
                                                            case 1467:
                                                                break;
                                                            case 1496:
                                                                i12 = 56579;
                                                                while (true) {
                                                                    i12 ^= 56596;
                                                                    switch (i12) {
                                                                        case 23:
                                                                            i12 = z12 ? 1507472 : 56641;
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 85:
                                                                            iM3675 = 0;
                                                                            break;
                                                                        case 1564036:
                                                                            iM3675 = 2;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 1529:
                                                                iM3675 = 1;
                                                                i13 = 56455;
                                                                while (true) {
                                                                    i13 ^= 56472;
                                                                    switch (i13) {
                                                                        case 31:
                                                                            i13 = 56486;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 62:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1769:
                                                    long jM1124 = C0059.m1124(jVarM5082);
                                                    int i31 = 54533;
                                                    while (true) {
                                                        i31 ^= 54550;
                                                        switch (i31) {
                                                            case 19:
                                                                i31 = jM1124 == jM6274 ? 54626 : 54595;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 85:
                                                                i11 = 55680;
                                                                while (true) {
                                                                    i11 ^= 55697;
                                                                    switch (i11) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (z11) {
                                                                            }
                                                                            break;
                                                                        case 1467:
                                                                            break;
                                                                        case 1496:
                                                                            i12 = 56579;
                                                                            while (true) {
                                                                                i12 ^= 56596;
                                                                                switch (i12) {
                                                                                    case 23:
                                                                                        if (z12) {
                                                                                        }
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    case 85:
                                                                                        iM3675 = 0;
                                                                                        break;
                                                                                    case 1564036:
                                                                                        iM3675 = 2;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1529:
                                                                            iM3675 = 1;
                                                                            i13 = 56455;
                                                                            while (true) {
                                                                                i13 ^= 56472;
                                                                                switch (i13) {
                                                                                    case 31:
                                                                                        i13 = 56486;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 62:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 116:
                                                                iM3675 = C0192.m3675(jVarM5082);
                                                                int i32 = 54657;
                                                                while (true) {
                                                                    i32 ^= 54674;
                                                                    switch (i32) {
                                                                        case 19:
                                                                            i32 = iM3675 == 2 ? 55401 : 54719;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            int i33 = 55556;
                                                                            while (true) {
                                                                                i33 ^= 55573;
                                                                                switch (i33) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i33 = 55587;
                                                                                        continue;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 3579:
                                                                            int i34 = 55432;
                                                                            while (true) {
                                                                                i34 ^= 55449;
                                                                                switch (i34) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i34 = 55463;
                                                                                        continue;
                                                                                    case 62:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i11 = 55680;
                                                                                while (true) {
                                                                                    i11 ^= 55697;
                                                                                    switch (i11) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (z11) {
                                                                                            }
                                                                                            break;
                                                                                        case 1467:
                                                                                            break;
                                                                                        case 1496:
                                                                                            i12 = 56579;
                                                                                            while (true) {
                                                                                                i12 ^= 56596;
                                                                                                switch (i12) {
                                                                                                    case 23:
                                                                                                        if (z12) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 54:
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        iM3675 = 0;
                                                                                                        break;
                                                                                                    case 1564036:
                                                                                                        iM3675 = 2;
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 1529:
                                                                                            iM3675 = 1;
                                                                                            i13 = 56455;
                                                                                            while (true) {
                                                                                                i13 ^= 56472;
                                                                                                switch (i13) {
                                                                                                    case 31:
                                                                                                        i13 = 56486;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 62:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                            int i35 = 1507503;
                                            while (true) {
                                                i35 ^= 1507520;
                                                switch (i35) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 111:
                                                        i35 = z10 ? 1507596 : 1507565;
                                                        break;
                                                    case 460:
                                                        int i36 = 1507627;
                                                        while (true) {
                                                            i36 ^= 1507644;
                                                            switch (i36) {
                                                                case 23:
                                                                    i36 = z12 ? 1507720 : 1507689;
                                                                    break;
                                                                case 85:
                                                                    break;
                                                                case 118:
                                                                    break;
                                                                case 180:
                                                                    int i37 = 1507751;
                                                                    while (true) {
                                                                        i37 ^= 1507768;
                                                                        switch (i37) {
                                                                            case 31:
                                                                                i37 = iM3675 != 1 ? 1508495 : 1508464;
                                                                                break;
                                                                            case 1335:
                                                                                iM3675 = 2;
                                                                                break;
                                                                            case 1480:
                                                                                break;
                                                                            case 1513:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i38 = 1508526;
                                            while (true) {
                                                i38 ^= 1508543;
                                                switch (i38) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i38 = jVarM5082 != null ? 1508619 : 1508588;
                                                        break;
                                                    case 83:
                                                        i10 = iM3675;
                                                        break;
                                                    case 114:
                                                        break;
                                                    case 436:
                                                        int iM3676 = C0192.m3675(jVarM5082);
                                                        int i39 = 1508650;
                                                        while (true) {
                                                            i39 ^= 1508667;
                                                            switch (i39) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i39 = iM3676 == 2 ? 1509394 : 1508712;
                                                                    break;
                                                                case 83:
                                                                    i10 = iM3675;
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 3369:
                                                                    int i40 = 1509425;
                                                                    while (true) {
                                                                        i40 ^= 1509442;
                                                                        switch (i40) {
                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                i10 = iM3675;
                                                                                break;
                                                                            case 115:
                                                                                i40 = iM3675 == 1 ? 1509518 : 1509487;
                                                                                break;
                                                                            case 204:
                                                                                long jM3225 = C0168.m3225(jVarM5082);
                                                                                int i41 = 1509549;
                                                                                while (true) {
                                                                                    i41 ^= 1509566;
                                                                                    switch (i41) {
                                                                                        case 19:
                                                                                            i41 = jM9458 < jM3225 ? 1509642 : 1509611;
                                                                                            break;
                                                                                        case 85:
                                                                                            i10 = iM3675;
                                                                                            break;
                                                                                        case 114:
                                                                                            break;
                                                                                        case 436:
                                                                                            i10 = 3;
                                                                                            int i42 = 1509673;
                                                                                            while (true) {
                                                                                                i42 ^= 1509690;
                                                                                                switch (i42) {
                                                                                                    case 19:
                                                                                                        i42 = 1510355;
                                                                                                        break;
                                                                                                    case 745:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            j jVar = new j(1, i10, jM6274, jM9459);
                                            int i43 = 1510448;
                                            while (true) {
                                                i43 ^= 1510465;
                                                switch (i43) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 47:
                                                        try {
                                                            C0286.m5502(jVar, file3);
                                                            break;
                                                        } catch (IOException e10) {
                                                            int i44 = 1511347;
                                                            while (true) {
                                                                i44 ^= 1511364;
                                                                switch (i44) {
                                                                    case 22:
                                                                        break;
                                                                    case 119:
                                                                        i44 = 1511378;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 113:
                                                        i43 = jVarM5082 != null ? 1510541 : 1510510;
                                                        break;
                                                    case 204:
                                                        boolean zM5696 = C0297.m5696(jVarM5082, jVar);
                                                        int i45 = 1510572;
                                                        while (true) {
                                                            i45 ^= 1510589;
                                                            switch (i45) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i45 = !zM5696 ? 1511316 : 1510634;
                                                                    break;
                                                                case 87:
                                                                    break;
                                                                case 118:
                                                                    break;
                                                                case 809:
                                                                    C0286.m5502(jVar, file3);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                C0305.m5863();
                                                return;
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException e11) {
                                        C0305.m5863();
                                        return;
                                    }
                                case 84:
                                    int i46 = 49914;
                                    while (true) {
                                        i46 ^= 49931;
                                        switch (i46) {
                                            case 497:
                                                i46 = 50596;
                                                continue;
                                            case 1711:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 241:
                                    i20 = iM7181 == 30 ? 49883 : 49852;
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 83:
                        break;
                    default:
                        break;
                }
            }
            C0305.m5863();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m9284() {
        int iM3841 = C0200.m3841();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3841 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f749short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
}
