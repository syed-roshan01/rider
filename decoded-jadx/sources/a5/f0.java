package a5;

import a0.C0003;
import a2.C0004;
import a2.C0005;
import a8.C0010;
import aa.C0012;
import androidx.annotation.C0018;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.app.C0040;
import androidx.preference.C0044;
import c1.C0058;
import c1.C0060;
import c3.C0062;
import ca.C0070;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.ktx.C0199;
import d1.C0212;
import d1.C0213;
import d4.C0217;
import d7.C0220;
import d9.C0224;
import dagger.hilt.C0255;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.migration.C0254;
import f0.C0272;
import f6.C0277;
import g.C0283;
import g3.C0288;
import g4.C0289;
import g7.C0292;
import h0.C0299;
import h3.C0301;
import h6.C0309;
import h8.C0314;
import i6.C0320;
import i9.C0321;
import j9.C0329;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import k2.C0333;
import k3.C0335;
import k4.C0336;
import l2.C0341;
import l3.C0342;
import l6.C0344;
import m7.C0357;
import o4.C0369;
import o7.i2;
import org.json.JSONObject;
import p5.C0377;
import r2.C0396;
import r6.C0402;
import s2.C0411;
import s8.C0416;
import t2.C0420;
import t2.C0423;
import t3.C0424;
import u8.C0438;
import v.C0439;
import v0.C0440;
import v5.C0445;
import v6.C0446;
import w1.C0455;
import w2.C0457;
import x4.C0469;
import y.C0474;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f14short = {2891, 2902, 2880, 2881, 2902, 2893, 2880, 1297, 1312, 1336, 1333, 1324, 1377, 1285, 1320, 1331, 1316, 1314, 1333, 1377, 1280, 1297, 1288, 1377, 1284, 1337, 1314, 1316, 1329, 1333, 1320, 1326, 1327, 1403, 1377, 1841, 1814, 1795, 1814, 1815, 1809, 1880, 1858, 1626, 1660, 1641, 1656, 1642, 1660, 1636, 1597, 1621, 1609, 1609, 1613, 1597, 1656, 1647, 1647, 1650, 1647, 1597, 1455, 1451, 1446, 2166, 2157, 2129, 2166, 2160, 2155, 2156, 2149, 2090, 2092, 2092, 2092, 2091, 2492, 2493, 2479, 2500, 2513, 1981, 1992, 2033, 2029, 2028, 1990, 2019, 2038, 2019, 1983, 1334, 1325, 1332, 1332, 1400, 1339, 1337, 1334, 1334, 1335, 1324, 1400, 1338, 1341, 1400, 1339, 1337, 1323, 1324, 1400, 1324, 1335, 1400, 1334, 1335, 1334, 1397, 1334, 1325, 1332, 1332, 1400, 1324, 1313, 1320, 1341, 1400, 1330, 1337, 1326, 1337, 1312, 1398, 1334, 1341, 1324, 1398, 1323, 1323, 1332, 1398, 1296, 1324, 1324, 1320, 1323, 1293, 1290, 1300, 1307, 1335, 1334, 1334, 1341, 1339, 1324, 1329, 1335, 1334, 2312, 2314, 2331, 1813, 1843, 1829, 1842, 1901, 1793, 1831, 1829, 1838, 1844, 3063, 3029, 3008, 3027, 3030, 3030, 3035, 2965, 2959, 2964, 2954, 2970, 2962, 3067, 3028, 3038, 3016, 3029, 3027, 3038, 2945, 2970, 3063, 3029, 3032, 3027, 3030, 3039, 2945, 2970, 3016, 3020, 2944, 2955, 2954, 2947, 2964, 2954, 2963, 1431, 1461, 1461, 1459, 1446, 1442, 2440, 2457, 2457, 2437, 2432, 2442, 2440, 2461, 2432, 2438, 2439, 2502, 2435, 2458, 2438, 2439, 2790, 2756, 2758, 2765, 2752, 2696, 2790, 2762, 2763, 2769, 2775, 2762, 2761, 787, 786, 848, 798, 796, 798, 789, 792, 898, 938, 951, 947, 958, 999, 919, 934, 958, 947, 938, 999, 949, 930, 948, 951, 936, 937, 948, 930, 2668, 2667, 2686, 2667, 2666, 2668, 723, 724, 705, 724, 725, 723, 3280, 3292, 3274, 3269, 3273, 3275, 3281, 3274, 3280, 1286, 1290, 1308, 1299, 1311, 1309, 1287, 1308, 1286, 1831, 1425, 1420, 1434, 1435, 1420, 1441, 1431, 1434, 1851, 1847, 1825, 1840, 1852, 1850, 1836, 1836, 1834, 1852, 1852, 583, 591, 546, 543, 535, 514, 516, 531, 514, 515, 605, 583, 8926, 3193, 3189, 3090, 3130, 3105, 3183, 3189, 11500, 2728, 2596, 2581, 2573, 2585, 2577, 2586, 2560, 2594, 2577, 2566, 2589, 2578, 2589, 2577, 2566, 1661, 1612, 1620, 1625, 1600, 1549, 1642, 1612, 1625, 1608, 1626, 1612, 1620, 1549, 1646, 1602, 1603, 1603, 1608, 1614, 1625, 1604, 1602, 1603, 1549, 1640, 1631, 1631, 1602, 1631};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int i10, String str, String str2, u8.e eVar) {
        super(C0040.f60 ^ (-83), eVar);
        this.f1253a = i10;
        this.f1254b = str;
        this.f1255c = str2;
        int iM4732 = C0247.m4732();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4732 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0455.m8884("Yq5T7xJt1zj1jssmNjlXD")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۦۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m130() {
        int iM3323 = C0174.m3323();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3323 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f14short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        int iM4514 = 0;
        String str = "\u06df\u06e8\u06e0";
        String strM5981 = null;
        String strM9490 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746814:
                    return this;
                case 1746967:
                    strM5981 = C0309.m5981(this);
                    str = "\u06e1\u06e5\u06e6";
                    break;
                case 1748802:
                    str = "\u06e6\u06e1\u06e8";
                    strM9490 = C0487.m9490(this);
                    break;
                case 1753485:
                    str = "\u06e7\u06e5\u06e7";
                    iM4514 = C0234.m4514(this);
                    break;
                default:
                    this = new f0(iM4514, strM5981, strM9490, eVar);
                    str = "\u06df\u06e3\u06e2";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06df\u06e1\u06e6";
        m9.d0 d0Var = null;
        Object objM4863 = obj;
        u8.e eVarM8264 = null;
        q8.l lVarM238 = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56541:
                    objM4863 = C0254.m4863(this, lVarM238);
                    str = "\u06e7\u06e4\u06e4";
                    break;
                case 1746756:
                    str = "\u06e6\u06e8\u06e2";
                    d0Var = (m9.d0) objM4863;
                    break;
                case 1750788:
                    str = "\u06e7\u06e4";
                    lVarM238 = C0012.m238();
                    break;
                case 1753696:
                    str = "\u06e5\u06e8\u06e2";
                    eVar = (u8.e) obj2;
                    break;
                case 1754535:
                    return objM4863;
                case 1755344:
                    str = "\u06e3\u06e7\u06e8";
                    this = (f0) eVarM8264;
                    break;
                default:
                    eVarM8264 = C0420.m8264(this, d0Var, eVar);
                    str = "\u06e8\u06df\u06e7";
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0494 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x041e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0416 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:148:0x0472. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0188. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01ad: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:16:0x01ad */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        HttpsURLConnection httpsURLConnection;
        int i10;
        Object obj3;
        b0 b0Var;
        int i11;
        double dM2157;
        boolean z10;
        boolean z11;
        String strM7004 = C0357.m7004(m130(), 0, C0044.f64 ^ 57, 2820);
        String strM5981 = C0309.m5981(this);
        String strM8581 = C0439.m8581();
        String strM7757 = C0396.m7757(m130(), 7, C0132.f158 ^ (-203), 1345);
        String strM6715 = C0342.m6715(m130(), 35, C0105.f131 ^ 473, 1890);
        String strM6750 = C0344.m6750(m130(), 43, C0445.f716 ^ 558, 1565);
        C0299.m5766();
        C0329.m6365(obj);
        int i12 = C0342.f613 ^ 55;
        try {
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    C0237.m4576(jSONObject, C0177.m3376(m130(), 62, C0474.f745 ^ (-611), 1506), C0487.m9490(this));
                    C0237.m4576(jSONObject, strM7004, strM5981);
                    String strM5554 = C0288.m5554(jSONObject);
                    C0335.m6501(strM5554, C0341.m6689(m130(), 65, C0199.f223 ^ (-59), 2050));
                    String strM5245 = C0272.m5245(strM5554, C0289.m5565(m130(), 78, C0446.f717 ^ (-41), 2537));
                    String str = (String) C0469.m9132(C0034.m673());
                    StringBuilder sb = new StringBuilder();
                    C0142.m2728(sb, str);
                    C0142.m2728(sb, C0245.m4713(m130(), 83, C0195.f219 ^ (-958), 1922));
                    C0142.m2728(sb, strM5245);
                    URLConnection uRLConnectionM2216 = C0114.m2216(new URL(C0440.m8605(sb)));
                    C0301.m5795(uRLConnectionM2216, C0018.m360(m130(), 93, C0329.f477 ^ 770, 1368));
                    httpsURLConnection = (HttpsURLConnection) uRLConnectionM2216;
                    C0234.m4509(httpsURLConnection, C0272.m5240(m130(), 162, C0123.f149 ^ (-416), 2383));
                    int i13 = C0217.f241 ^ 9410;
                    C0333.m6475(httpsURLConnection, i13);
                    C0062.m1177(httpsURLConnection, i13);
                    C0423.m8299(httpsURLConnection, C0082.m1753(m130(), 165, C0411.f682 ^ 47, 1856), C0487.m9485(m130(), 175, C0085.f119 ^ 190, 3002));
                    C0423.m8299(httpsURLConnection, C0402.m7894(m130(), 214, C0070.f90 ^ 763, 1494), C0455.m8879(m130(), 220, C0377.f648 ^ 175, 2537));
                    C0423.m8299(httpsURLConnection, C0034.m660(m130(), 236, C0004.f1062 ^ (-211), 2725), C0314.m6078(m130(), 249, C0003.f881 ^ (-853), 893));
                    C0058.m1104(httpsURLConnection, false);
                    C0423.m8306(httpsURLConnection, true);
                    try {
                        C0255.m4873(httpsURLConnection, new e0());
                        C0196.m3760(httpsURLConnection);
                        int iM7261 = C0369.m7261(httpsURLConnection);
                        int i14 = 1616;
                        while (true) {
                            i14 ^= 1633;
                            switch (i14) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 49:
                                    i14 = iM7261 != 200 ? 1709 : 1678;
                                    break;
                                case 204:
                                    StringBuilder sb2 = new StringBuilder(strM6750);
                                    C0197.m3772(sb2, iM7261);
                                    b0Var = new b0(null, C0440.m8605(sb2), i12);
                                    try {
                                        C0320.m6209(httpsURLConnection);
                                        break;
                                    } catch (Exception e4) {
                                        int i15 = 55556;
                                        while (true) {
                                            i15 ^= 55573;
                                            switch (i15) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i15 = 55587;
                                                    break;
                                                case 54:
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 239:
                                    String strM4070 = C0213.m4070(C0003.m59(httpsURLConnection));
                                    boolean zM3470 = C0181.m3470(strM4070);
                                    int i16 = 48767;
                                    while (true) {
                                        i16 ^= 48784;
                                        switch (i16) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                JSONObject jSONObject2 = new JSONObject(C0201.m3852(C0283.m5474(strM4070)));
                                                String strM4327 = C0224.m4327(jSONObject2, C0277.m5371(m130(), 277, C0060.f80 ^ (-890), 2623), C0224.m4327(jSONObject2, C0236.m4552(m130(), 283, C0236.f316 ^ (-772), 672), strM8581));
                                                String strM4328 = C0224.m4327(jSONObject2, C0024.m469(m130(), 289, C0230.f310 ^ (-774), 3204), C0224.m4327(jSONObject2, C0487.m9485(m130(), 298, C0487.f761 ^ (-277), 1394), C0336.m6514(m130(), 307, 1, 1815)));
                                                C0189.m3608(strM4328);
                                                Double dM3140 = C0164.m3140(strM4328);
                                                int i17 = 48891;
                                                while (true) {
                                                    i17 ^= 48908;
                                                    switch (i17) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            dM2157 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                                                            break;
                                                        case 503:
                                                            i17 = dM3140 != null ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            dM2157 = C0112.m2157(dM3140);
                                                            int i18 = 49666;
                                                            while (true) {
                                                                i18 ^= 49683;
                                                                switch (i18) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i18 = 49697;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                String strM4329 = C0224.m4327(jSONObject2, strM7004, C0224.m4327(jSONObject2, C0292.m5623(m130(), 308, C0377.f648 ^ 183, 1534), strM8581));
                                                boolean zM3213 = C0168.m3213(strM4327, C0247.m4739(m130(), 316, C0105.f131 ^ 474, 1903));
                                                int i19 = (int) dM2157;
                                                int iM4514 = C0234.m4514(this);
                                                int i20 = 49790;
                                                while (true) {
                                                    i20 ^= 49807;
                                                    switch (i20) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            z10 = true;
                                                            break;
                                                        case 84:
                                                            int i21 = 49914;
                                                            while (true) {
                                                                i21 ^= 49931;
                                                                switch (i21) {
                                                                    case 497:
                                                                        i21 = iM4514 == 0 ? 50658 : 50627;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                    case 1736:
                                                                        z10 = false;
                                                                        int i22 = 50813;
                                                                        while (true) {
                                                                            i22 ^= 50830;
                                                                            switch (i22) {
                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 243:
                                                                                    i22 = 50844;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1769:
                                                                        int i23 = 50689;
                                                                        while (true) {
                                                                            i23 ^= 50706;
                                                                            switch (i23) {
                                                                                case 19:
                                                                                    i23 = 50720;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            z10 = true;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 241:
                                                            i20 = i19 != iM4514 ? 49883 : 49852;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i24 = 51588;
                                                while (true) {
                                                    i24 ^= 51605;
                                                    switch (i24) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i24 = zM3213 ? 51681 : 51650;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            z11 = false;
                                                            break;
                                                        case 116:
                                                            int i25 = 51712;
                                                            while (true) {
                                                                i25 ^= 51729;
                                                                switch (i25) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i25 = z10 ? 51805 : 51774;
                                                                        break;
                                                                    case 47:
                                                                        z11 = false;
                                                                        break;
                                                                    case 76:
                                                                        z11 = true;
                                                                        int i26 = 51836;
                                                                        while (true) {
                                                                            i26 ^= 51853;
                                                                            switch (i26) {
                                                                                case 241:
                                                                                    i26 = 52518;
                                                                                    continue;
                                                                                case 1963:
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
                                                C0189.m3608(strM4329);
                                                int iM8181 = C0416.m8181(strM4329);
                                                int i27 = 52611;
                                                while (true) {
                                                    i27 ^= 52628;
                                                    switch (i27) {
                                                        case 23:
                                                            i27 = iM8181 > 0 ? 52704 : 52673;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            strM4329 = strM5981;
                                                            break;
                                                        case 116:
                                                            int i28 = 52735;
                                                            while (true) {
                                                                i28 ^= 52752;
                                                                switch (i28) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 1007:
                                                                        i28 = 52766;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0189.m3608(strM4329);
                                                C0189.m3608(strM4327);
                                                int i29 = 53510;
                                                while (true) {
                                                    i29 ^= 53527;
                                                    switch (i29) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i29 = !z11 ? 53603 : 53572;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            break;
                                                        case 116:
                                                            StringBuilder sb3 = new StringBuilder(strM6715);
                                                            C0142.m2728(sb3, strM4327);
                                                            C0142.m2728(sb3, C0321.m6216(m130(), 327, C0201.f225 ^ 49, 615));
                                                            C0197.m3772(sb3, iM4514);
                                                            C0142.m2728(sb3, C0005.m102(m130(), 340, C0220.f300 ^ (-117), 3157));
                                                            C0457.m8912(sb3, dM2157);
                                                            C0142.m2728(sb3, C0172.m3283(m130(), 348, 1, 2689));
                                                            strM8581 = C0440.m8605(sb3);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                b0Var = new b0(z11, strM4329, strM4327, dM2157, strM8581);
                                                break;
                                            case 76:
                                                b0Var = new b0(null, C0237.m4582(m130(), 257, C0438.f709 ^ 658, 967), i12);
                                                try {
                                                    C0320.m6209(httpsURLConnection);
                                                    break;
                                                } catch (Exception e10) {
                                                    int i30 = 55680;
                                                    while (true) {
                                                        i30 ^= 55697;
                                                        switch (i30) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i30 = 56362;
                                                                break;
                                                            case 1467:
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i16 = zM3470 ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                            return b0Var;
                        }
                        while (true) {
                            i11 ^= 53651;
                            switch (i11) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = 53665;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    return b0Var;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        int i31 = 1864;
                        while (true) {
                            i31 ^= 1881;
                            switch (i31) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i31 = 48674;
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                            C0010.m206(m130(), 349, C0424.f695 ^ 520, 2676);
                            String strM4049 = C0212.m4049(e);
                            StringBuilder sb4 = new StringBuilder(strM7757);
                            C0142.m2728(sb4, strM4049);
                            C0440.m8605(sb4);
                            b0Var = new b0(null, C0144.m2760(m130(), 364, C0229.f309 ^ (-239), 1581), i12);
                            int i32 = 54533;
                            while (true) {
                                i32 ^= 54550;
                                switch (i32) {
                                    case 19:
                                        i32 = httpsURLConnection != null ? 54626 : 54595;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 85:
                                        break;
                                    case 116:
                                        int i33 = 54657;
                                        while (true) {
                                            i33 ^= 54674;
                                            switch (i33) {
                                                case 19:
                                                    i33 = 54688;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0320.m6209(httpsURLConnection);
                            i11 = 53634;
                            while (true) {
                                i11 ^= 53651;
                                switch (i11) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = 53665;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    obj2 = obj3;
                    int i34 = 1740;
                    while (true) {
                        i34 ^= 1757;
                        switch (i34) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i34 = 1771;
                                continue;
                            case 54:
                                th = th;
                                break;
                            default:
                                continue;
                        }
                        i10 = 55432;
                        while (true) {
                            i10 ^= 55449;
                            switch (i10) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (obj2 != null) {
                                        i10 = 55525;
                                    }
                                    break;
                                case 62:
                                    break;
                                case 95:
                                    throw th;
                                case 124:
                                    try {
                                        C0320.m6209(obj2);
                                        throw th;
                                    } catch (Exception e12) {
                                        int i35 = 56579;
                                        while (true) {
                                            i35 ^= 56596;
                                            switch (i35) {
                                                case 23:
                                                    i35 = 56610;
                                                    break;
                                                case 54:
                                                    throw th;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                                    continue;
                            }
                            i10 = 55494;
                        }
                    }
                }
            } catch (Exception e13) {
                e = e13;
                httpsURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                int i36 = 53758;
                while (true) {
                    i36 ^= 53775;
                    switch (i36) {
                        case 1009:
                            i36 = 54440;
                            continue;
                        case 1703:
                            obj2 = null;
                            break;
                        default:
                            continue;
                    }
                    i10 = 55432;
                    while (true) {
                        i10 ^= 55449;
                        switch (i10) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (obj2 != null) {
                                    i10 = 55525;
                                }
                                break;
                            case 62:
                                break;
                            case 95:
                                throw th;
                            case 124:
                                C0320.m6209(obj2);
                                throw th;
                            default:
                                continue;
                                continue;
                        }
                        i10 = 55494;
                    }
                }
            }
            C0320.m6209(httpsURLConnection);
            i11 = 53634;
        } catch (Exception e14) {
            int i37 = 56455;
            while (true) {
                i37 ^= 56472;
                switch (i37) {
                    case 31:
                        i37 = 56486;
                        break;
                    case 62:
                        break;
                }
            }
        }
    }
}
