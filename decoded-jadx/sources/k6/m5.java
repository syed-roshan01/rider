package k6;

import a2.C0004;
import a2.C0005;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v4.app.C0014;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0031;
import androidx.profileinstaller.C0045;
import b1.C0050;
import c0.C0057;
import c1.C0059;
import c3.C0063;
import c4.C0065;
import c7.C0068;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.abt.C0112;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfiginterop.C0202;
import d1.C0212;
import d9.C0223;
import d9.C0224;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.components.C0243;
import dagger.hilt.migration.C0254;
import f.C0269;
import f4.C0275;
import f4.C0276;
import f6.C0278;
import fa.C0281;
import g0.C0285;
import g5.C0290;
import h.C0296;
import h1.C0300;
import h4.C0304;
import h7.C0312;
import h8.C0313;
import i6.C0320;
import j4.C0326;
import j5.C0327;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import k8.C0338;
import l3.C0342;
import m5.C0354;
import m7.C0357;
import n8.C0365;
import o2.C0368;
import okhttp3.internal.publicsuffix.C0372;
import p0.C0373;
import p8.C0379;
import q7.C0390;
import r1.C0393;
import r7.C0403;
import t2.C0423;
import u8.C0438;
import v.C0439;
import v0.C0440;
import w0.C0454;
import x4.C0469;
import x8.C0473;
import z3.C0485;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class m5 implements Callable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f563short = {1642, 1645, 1654, 1612, 1648, 1642, 1645, 1660, 1658, 1644, 1301, 1298, 1289, 1332, 1289, 1293, 1285, 1299, 1300, 1281, 1293, 1296, 1299, 620, 618, 625, 639, 639, 637, 618, 583, 621, 618, 625, 619, 2337, 2352, 2352, 2335, 2345, 2340, 2429, 2431, 2400, 2337, 2350, 2340, 2400, 2355, 2351, 2357, 2354, 2339, 2341, 2429, 2431, 2400, 2337, 2350, 2340, 2400, 2356, 2345, 2349, 2341, 2355, 2356, 2337, 2349, 2352, 2335, 2349, 2345, 2348, 2348, 2345, 2355, 2428, 2429, 2431, 3325, 3295, 3288, 3267, 3272, 3273, 3213, 2245, 2193, 2199, 2188, 2178, 2178, 2176, 2199, 2245, 2224, 2231, 2220, 2198, 2251, 2245, 2180, 2197, 2197, 2220, 2177, 2249, 2245, 2198, 2186, 2192, 2199, 2182, 2176, 2249, 2245, 2193, 2188, 2184, 2176, 2198, 2193, 2180, 2184, 2197, 1236, 1251, 1251, 1278, 1251, 1201, 1249, 1251, 1252, 1279, 1272, 1279, 1270, 1201, 1253, 1251, 1272, 1270, 1270, 1268, 1251, 1201, 1220, 1219, 1240, 1250, 1215, 1201, 1264, 1249, 1249, 1240, 1269, 565, 530, 521, 576, 531, 527, 533, 530, 515, 517, 531, 576, 513, 526, 516, 576, 532, 521, 525, 517, 531, 532, 513, 525, 528, 531, 576, 516, 527, 576, 526, 527, 532, 576, 525, 513, 532, 515, 520, 2175, 2169, 2146, 2156, 2156, 2158, 2169, 2132, 2174, 2169, 2146, 2168, 1529, 1535, 1508, 1514, 1514, 1512, 1535, 1490, 1528, 1535, 1508, 3000, 2981, 2977, 2985, 3007, 3000, 2989, 2977, 3004, 2963, 2977, 2981, 2976, 2976, 2981, 3007, 2126, 2130, 2120, 2127, 2142, 2136, 3015, 3030, 3030, 3065, 3023, 3010, 2971, 2969, 1630, 1603, 1627, 1605, 1608, 1632, 1623, 1623, 1610, 1623, 1541, 1620, 1616, 1600, 1623, 1628, 1612, 1611, 1602, 1541, 1617, 1623, 1612, 1602, 1602, 1600, 1623, 1541, 1616, 1623, 1612, 1622, 1547, 1541, 1604, 1621, 1621, 1644, 1601, 2697, 2738, 2745, 2724, 2732, 2745, 2751, 2728, 2745, 2744, 2812, 2751, 2749, 2736, 2736, 2812, 2739, 2738, 2812, 2751, 2736, 2741, 2745, 2738, 2728, 2812, 2735, 2741, 2744, 2745};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5 f10205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.a f10206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10207d;

    public /* synthetic */ m5(h5 h5Var, a6.a aVar, Object obj, int i10) {
        this.f10204a = i10;
        this.f10205b = h5Var;
        this.f10206c = aVar;
        this.f10207d = obj;
        int iM3691 = C0193.m3691();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3691 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0243.m4679("Qb1CinOfGA33f1Z43ALq6Ub"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6575() {
        int iM6200 = C0320.m6200();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6200 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f563short;
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

    /* JADX WARN: Code duplicated, block: B:306:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x032a A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x03b0 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:135:0x034f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x011d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x01c4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.Bundle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        int i10;
        List listM3062;
        int i11;
        int i12;
        int iM8862 = C0454.m8862(this);
        h5 h5VarM497 = C0025.m497(this);
        switch (iM8862) {
            case 0:
                C0338.m6647(C0269.m5151(h5VarM497));
                o6 o6VarM612 = C0031.m612(C0269.m5151(h5VarM497));
                C0173.m3298(o6VarM612);
                C0223.m4302(o6VarM612);
                C0014.m280((f5) C0163.m3121(o6VarM612));
                throw new IllegalStateException(C0354.m6950(m6575(), 290, C0379.f650 ^ 288, 2780));
            default:
                C0338.m6647(C0269.m5151(h5VarM497));
                x7 x7Var = (x7) C0403.m7916(this);
                ?? M9227 = (Bundle) C0275.m5300(this);
                p7 p7VarM5151 = C0269.m5151(h5VarM497);
                C0063.m1219(C0485.m9461(p7VarM5151));
                boolean zM1131 = C0059.m1131();
                int i13 = 1616;
                while (true) {
                    i13 ^= 1633;
                    switch (i13) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (zM1131) {
                                i13 = 1709;
                            }
                            break;
                        case 204:
                            boolean zM3575 = C0187.m3575(C0086.m1839(p7VarM5151), C0074.m1624(x7Var), C0224.m4320());
                            int i14 = 1740;
                            while (true) {
                                i14 ^= 1757;
                                switch (i14) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (zM3575) {
                                            i14 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        String strM1624 = C0074.m1624(x7Var);
                                        int i15 = 1864;
                                        while (true) {
                                            i15 ^= 1881;
                                            switch (i15) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (strM1624 == null) {
                                                        i15 = 48736;
                                                    }
                                                    break;
                                                case 47384:
                                                    int i16 = 48891;
                                                    while (true) {
                                                        i16 ^= 48908;
                                                        switch (i16) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 503:
                                                                i16 = M9227 != 0 ? 49635 : 48953;
                                                                break;
                                                            case 32495:
                                                                int[] iArrM5867 = C0304.m5867(M9227, C0312.m6034(m6575(), 0, C0372.f643 ^ (-466), 1567));
                                                                long[] jArrM1460 = C0071.m1460(M9227, C0112.m2172(m6575(), 10, C0278.f423 ^ (-121), 1376));
                                                                int i17 = 49666;
                                                                while (true) {
                                                                    M9227 = 49683;
                                                                    i17 ^= 49683;
                                                                    switch (i17) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i17 = iArrM5867 != null ? 49759 : 49728;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 76:
                                                                            int i18 = 49790;
                                                                            while (true) {
                                                                                i18 ^= 49807;
                                                                                switch (i18) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 51:
                                                                                        d4 d4VarM6333 = C0327.m6333(p7VarM5151);
                                                                                        M9227 = C0473.m9227(m6575(), 159, C0004.f1062 ^ (-249), 608);
                                                                                        C0135.m2604(C0454.m8871(d4VarM6333), M9227);
                                                                                        break;
                                                                                    case 84:
                                                                                        int length = jArrM1460.length;
                                                                                        int length2 = iArrM5867.length;
                                                                                        int i19 = 49914;
                                                                                        while (true) {
                                                                                            i19 ^= 49931;
                                                                                            switch (i19) {
                                                                                                case 497:
                                                                                                    i19 = length != length2 ? 50658 : 50627;
                                                                                                    break;
                                                                                                case 1711:
                                                                                                    break;
                                                                                                case 1736:
                                                                                                    int i20 = 0;
                                                                                                    while (true) {
                                                                                                        int length3 = iArrM5867.length;
                                                                                                        M9227 = 50813;
                                                                                                        while (true) {
                                                                                                            M9227 ^= 50830;
                                                                                                            switch (M9227) {
                                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                    break;
                                                                                                                case 243:
                                                                                                                    M9227 = i20 < length3 ? 51557 : 50875;
                                                                                                                    break;
                                                                                                                case 4075:
                                                                                                                    k kVarM4068 = C0212.m4068(p7VarM5151);
                                                                                                                    C0173.m3298(kVarM4068);
                                                                                                                    int i21 = iArrM5867[i20];
                                                                                                                    long j10 = jArrM1460[i20];
                                                                                                                    C0281.m5438(strM1624);
                                                                                                                    C0223.m4302(kVarM4068);
                                                                                                                    C0068.m1329(kVarM4068);
                                                                                                                    try {
                                                                                                                        int iM4375 = C0227.m4375(C0050.m964(kVarM4068), C0150.m2874(m6575(), 23, C0313.f461 ^ 564, 536), C0296.m5708(m6575(), 35, C0192.f216 ^ (-781), 2368), new String[]{strM1624, C0276.m5318(i21), C0024.m477(j10)});
                                                                                                                        f4 f4VarM2634 = C0136.m2634(C0029.m572(kVarM4068));
                                                                                                                        StringBuilder sb = new StringBuilder(C0005.m102(m6575(), 80, C0469.f740 ^ 204, 3245));
                                                                                                                        C0197.m3772(sb, iM4375);
                                                                                                                        C0142.m2728(sb, C0178.m3395(m6575(), 87, C0423.f694 ^ 769, 2277));
                                                                                                                        C0237.m4564(f4VarM2634, C0440.m8605(sb), strM1624, C0057.m1083(i21), C0438.m8554(j10));
                                                                                                                        int i22 = 51588;
                                                                                                                        while (true) {
                                                                                                                            i22 ^= 51605;
                                                                                                                            switch (i22) {
                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                    i22 = 51619;
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            i20 += C0089.f123 ^ 395;
                                                                                                                            int i23 = 51712;
                                                                                                                            while (true) {
                                                                                                                                i23 ^= 51729;
                                                                                                                                switch (i23) {
                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                        i23 = 51743;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e4) {
                                                                                                                        C0112.m2169(C0454.m8871(C0029.m572(kVarM4068)), C0342.m6715(m6575(), 126, C0163.f187 ^ (-667), 1169), C0027.m535(strM1624), e4);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 1769:
                                                                                                    int i24 = 50689;
                                                                                                    while (true) {
                                                                                                        i24 ^= 50706;
                                                                                                        switch (i24) {
                                                                                                            case 19:
                                                                                                                i24 = 50720;
                                                                                                                continue;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                        d4 d4VarM6334 = C0327.m6333(p7VarM5151);
                                                                                                        M9227 = C0473.m9227(m6575(), 159, C0004.f1062 ^ (-249), 608);
                                                                                                        C0135.m2604(C0454.m8871(d4VarM6334), M9227);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 241:
                                                                                        i18 = jArrM1460 != null ? 49883 : 49852;
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
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    k kVarM4069 = C0212.m4068(p7VarM5151);
                                                    C0173.m3298(kVarM4069);
                                                    C0281.m5438(strM1624);
                                                    C0223.m4302(kVarM4069);
                                                    C0068.m1329(kVarM4069);
                                                    ArrayList arrayList = new ArrayList();
                                                    try {
                                                        try {
                                                            try {
                                                                SQLiteDatabase sQLiteDatabaseM964 = C0050.m964(kVarM4069);
                                                                String strM5777 = C0300.m5777(m6575(), 198, C0365.f636 ^ (-184), 2059);
                                                                String strM883 = C0045.m883(m6575(), 210, C0290.f438 ^ (-343), 1421);
                                                                String strM7334 = C0373.m7334(m6575(), 221, C0326.f474 ^ (-776), 3020);
                                                                String strM3574 = C0187.m3574(m6575(), 237, C0368.f639 ^ (-230), 2109);
                                                                String strM1259 = C0065.m1259(m6575(), 243, C0202.f226 ^ (-429), 2982);
                                                                String[] strArr = new String[1];
                                                                strArr[C0285.f430 ^ (-872)] = strM1624;
                                                                Cursor cursorM4442 = C0231.m4442(sQLiteDatabaseM964, strM5777, new String[]{strM883, strM7334, strM3574}, strM1259, strArr, null, null, C0174.m3324(m6575(), 251, C0492.f766 ^ (-811), 1580), null);
                                                                boolean zM6068 = C0313.m6068(cursorM4442);
                                                                int i25 = 51836;
                                                                while (true) {
                                                                    i25 ^= 51853;
                                                                    switch (i25) {
                                                                        case 241:
                                                                            if (!zM6068) {
                                                                                i25 = 52580;
                                                                            }
                                                                            break;
                                                                        case 1963:
                                                                            break;
                                                                        case 1992:
                                                                            while (true) {
                                                                                String strM1262 = C0065.m1262(cursorM4442, 0);
                                                                                int i26 = 52735;
                                                                                while (true) {
                                                                                    i26 ^= 52752;
                                                                                    switch (i26) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            break;
                                                                                        case 1007:
                                                                                            i26 = strM1262 == null ? 53479 : 52797;
                                                                                            break;
                                                                                        case 7927:
                                                                                            strM1262 = C0439.m8581();
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                int i27 = 53510;
                                                                                while (true) {
                                                                                    i27 ^= 53527;
                                                                                    switch (i27) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i27 = 53541;
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            C0357.m6998(arrayList, new i7(strM1262, C0393.m7701(cursorM4442, 1), C0390.m7639(cursorM4442, C0276.f392 ^ (-124))));
                                                                                            boolean zM2531 = C0131.m2531(cursorM4442);
                                                                                            int i28 = 54533;
                                                                                            while (true) {
                                                                                                i28 ^= 54550;
                                                                                                switch (i28) {
                                                                                                    case 19:
                                                                                                        i28 = !zM2531 ? 54626 : 54595;
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        break;
                                                                                                    case 116:
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                                C0227.m4391(cursorM4442);
                                                                                                int i29 = 54657;
                                                                                                while (true) {
                                                                                                    i29 ^= 54674;
                                                                                                    switch (i29) {
                                                                                                        case 19:
                                                                                                            i29 = 54688;
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            return arrayList;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 2025:
                                                                            C0227.m4391(cursorM4442);
                                                                            int i30 = 52611;
                                                                            while (true) {
                                                                                i30 ^= 52628;
                                                                                switch (i30) {
                                                                                    case 23:
                                                                                        i30 = 52642;
                                                                                        break;
                                                                                    case 54:
                                                                                        return arrayList;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i25 = 52549;
                                                                }
                                                            } catch (SQLiteException e10) {
                                                                e = e10;
                                                                i10 = 53758;
                                                                while (true) {
                                                                    i10 ^= 53775;
                                                                    switch (i10) {
                                                                        case 1009:
                                                                            i10 = 54440;
                                                                            break;
                                                                        case 1703:
                                                                            C0112.m2169(C0454.m8871(C0029.m572(kVarM4069)), C0254.m4870(m6575(), 256, C0109.f135 ^ 97, 1573), C0027.m535(strM1624), e);
                                                                            listM3062 = C0160.m3062();
                                                                            i11 = 55432;
                                                                            while (true) {
                                                                                i11 ^= 55449;
                                                                                switch (i11) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (M9227 != 0) {
                                                                                            i11 = 55525;
                                                                                        }
                                                                                        break;
                                                                                    case 62:
                                                                                        break;
                                                                                    case 95:
                                                                                        return listM3062;
                                                                                    case 124:
                                                                                        C0227.m4391(M9227);
                                                                                        i12 = 55556;
                                                                                        while (true) {
                                                                                            i12 ^= 55573;
                                                                                            switch (i12) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i12 = 55587;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    return listM3062;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                                i11 = 55494;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        } catch (SQLiteException e11) {
                                                            e = e11;
                                                            M9227 = 0;
                                                            i10 = 53758;
                                                            while (true) {
                                                                i10 ^= 53775;
                                                                switch (i10) {
                                                                    case 1009:
                                                                        i10 = 54440;
                                                                        break;
                                                                    case 1703:
                                                                        C0112.m2169(C0454.m8871(C0029.m572(kVarM4069)), C0254.m4870(m6575(), 256, C0109.f135 ^ 97, 1573), C0027.m535(strM1624), e);
                                                                        listM3062 = C0160.m3062();
                                                                        i11 = 55432;
                                                                        while (true) {
                                                                            i11 ^= 55449;
                                                                            switch (i11) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (M9227 != 0) {
                                                                                        i11 = 55525;
                                                                                    }
                                                                                    break;
                                                                                case 62:
                                                                                    break;
                                                                                case 95:
                                                                                    return listM3062;
                                                                                case 124:
                                                                                    C0227.m4391(M9227);
                                                                                    i12 = 55556;
                                                                                    while (true) {
                                                                                        i12 ^= 55573;
                                                                                        switch (i12) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i12 = 55587;
                                                                                                break;
                                                                                            case 54:
                                                                                                return listM3062;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            i11 = 55494;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            M9227 = 0;
                                                            int i31 = 53634;
                                                            while (true) {
                                                                i31 ^= 53651;
                                                                switch (i31) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i31 = 53665;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        int i32 = 55680;
                                                                        while (true) {
                                                                            i32 ^= 55697;
                                                                            switch (i32) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i32 = M9227 != 0 ? 56424 : 56393;
                                                                                    break;
                                                                                case 1467:
                                                                                    break;
                                                                                case 1496:
                                                                                    break;
                                                                                case 1529:
                                                                                    C0227.m4391(M9227);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        throw th;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                    break;
                                                case 47417:
                                                    int i33 = 48767;
                                                    while (true) {
                                                        i33 ^= 48784;
                                                        switch (i33) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 239:
                                                                i33 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i15 = 48705;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i14 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i13 = 1678;
                }
                return new ArrayList();
        }
    }
}
