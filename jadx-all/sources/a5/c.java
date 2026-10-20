package a5;

import a.C0002;
import a0.C0003;
import a3.C0006;
import a6.C0007;
import a7.C0008;
import aa.C0012;
import android.support.v4.app.C0014;
import androidx.annotation.C0018;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.semantics.C0039;
import androidx.core.content.C0041;
import androidx.preference.C0044;
import androidx.profileinstaller.C0046;
import b.C0049;
import b3.C0051;
import b4.C0052;
import c3.C0062;
import com.auto.accept.data.model.CouponData;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0169;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.bind.C0207;
import d1.C0213;
import d2.C0216;
import d3.C0217;
import d7.C0221;
import d9.C0225;
import d9.C0226;
import dagger.hilt.android.C0241;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e2.C0261;
import e2.C0263;
import fa.C0281;
import g.C0283;
import g.C0284;
import g3.C0289;
import g7.C0293;
import h0.C0300;
import h3.C0302;
import h3.C0304;
import h4.C0305;
import h5.C0307;
import i6.C0321;
import ia.C0323;
import j2.C0325;
import j9.C0330;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import k2.C0334;
import k3.C0336;
import l6.C0344;
import m7.C0358;
import n.C0362;
import n8.C0366;
import o4.C0370;
import o7.i2;
import okhttp3.internal.publicsuffix.C0373;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.C0378;
import q7.C0390;
import r2.C0396;
import r7.C0405;
import r9.C0406;
import rikka.shizuku.C0407;
import s7.C0416;
import t2.C0421;
import t2.C0423;
import t2.C0424;
import t3.C0425;
import t8.C0427;
import u.C0430;
import u0.C0431;
import v.C0440;
import v5.C0446;
import v9.C0453;
import x7.C0473;
import y.C0475;
import z.C0482;
import z0.C0483;
import z3.C0487;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f10short = {867, 882, 882, 878, 875, 865, 867, 886, 875, 877, 876, 813, 872, 881, 877, 876, 519, 523, 512, 513, 3058, 3054, 3054, 3050, 3049, 2976, 2997, 2997, 3048, 3059, 3070, 3071, 3067, 3065, 3065, 3071, 3050, 3054, 3071, 3048, 2996, 3059, 3060, 2997, 3067, 3050, 3059, 2997, 3065, 3061, 3055, 3050, 3061, 3060, 3013, 3052, 3067, 3062, 3059, 3070, 3067, 3054, 3071, 2996, 3050, 3058, 3050, 735, 708, 766, 731, 731, 718, 729, 744, 714, 728, 718, 643, 645, 645, 645, 642, 2419, 2415, 2402, 2413, 2391, 2426, 2419, 2406, 2487, 2475, 2470, 694, 684, 665, 694, 685, 684, 683, 651, 694, 690, 698, 655, 682, 685, 700, 695, 702, 684, 698, 1491, 1480, 1489, 1489, 1437, 1502, 1500, 1491, 1491, 1490, 1481, 1437, 1503, 1496, 1437, 1502, 1500, 1486, 1481, 1437, 1481, 1490, 1437, 1491, 1490, 1491, 1424, 1491, 1480, 1489, 1489, 1437, 1481, 1476, 1485, 1496, 1437, 1495, 1500, 1483, 1500, 1427, 1491, 1496, 1481, 1427, 1525, 1481, 1481, 1485, 1512, 1519, 1521, 1534, 1490, 1491, 1491, 1496, 1502, 1481, 1492, 1490, 1491, 3158, 3145, 3157, 3154, 3102, 3122, 3123, 3113, 3128, 3123, 3113, 3184, 3081, 3108, 3117, 3128, 1505, 1475, 1475, 1477, 1488, 1492, 1341, 1318, 1306, 1341, 1339, 1312, 1319, 1326, 1377, 1383, 1383, 1383, 1376, 926, 924, 909, 955, 896, 909, 924, 906, 977, 983, 983, 983, 976, 555, 557, 571, 571, 573, 555, 555, 924, 907, 907, 918, 907, 2324, 2355, 2347, 2364, 2353, 2356, 2361, 2429, 2366, 2354, 2344, 2349, 2354, 2355, 2007, 2011, 1985, 1988, 2011, 2010, 1507, 1532, 1528, 1503, 1528, 1534, 1509, 1506, 1515, 1444, 1442, 1442, 1442, 1445, 2768, 2781, 2759, 2775, 2779, 2753, 2778, 2752, 2788, 2769, 2758, 2775, 2769, 2778, 2752, 487, 490, 496, 480, 492, 502, 493, 503, 453, 490, 507, 486, 487, 2463, 2451, 2442, 2471, 2433, 2455, 2433, 2583, 2561, 2566, 2566, 2577, 2586, 2560, 2593, 2567, 2577, 2567, 877, 892, 892, 864, 869, 879, 877, 878, 864, 873, 860, 864, 877, 866, 895, 621, 608, 608, 466, 463, 455, 478, 453, 466, 452, 502, 451, 1279, 1253, 1239, 1269, 1250, 1279, 1248, 1267, 1119, 1093, 1136, 1119, 1092, 1093, 1090, 1122, 1119, 1115, 1107, 1145, 1112, 1114, 1103, 3282, 3317, 3325, 3320, 3313, 3312, 3252, 3296, 3323, 3252, 3298, 3317, 3320, 3325, 3312, 3317, 3296, 3313, 3252, 3319, 3323, 3297, 3300, 3323, 3322, 3246, 3252};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.q f1230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a4.q qVar, String str, String str2, String str3, boolean z10, u8.e eVar) {
        super(C0406.f676 ^ 82, eVar);
        this.f1230a = qVar;
        this.f1231b = str;
        this.f1232c = str2;
        this.f1233d = str3;
        this.f1234e = z10;
        int iM945 = C0049.m945();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM945 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0002.m55("kvN9cgLa0e83wI")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m126() {
        int iM7172 = C0366.m7172();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7172 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f10short;
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
        boolean zM4979 = false;
        String str = "ۡۧۧ";
        a4.q qVarM7944 = null;
        String strM9248 = null;
        String strM8815 = null;
        String strM7976 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56450:
                    zM4979 = C0261.m4979(this);
                    str = "ۧۤۢ";
                    break;
                case 1748865:
                    qVarM7944 = C0405.m7944(this);
                    str = "ۧۡۤ";
                    break;
                case 1753603:
                    strM8815 = C0453.m8815(this);
                    str = "ۤۦ";
                    break;
                case 1753670:
                    return this;
                case 1754533:
                    str = "ۦۧۧ";
                    this = new c(qVarM7944, strM9248, strM7976, strM8815, zM4979, eVar);
                    break;
                case 1755620:
                    strM7976 = C0407.m7976(this);
                    str = "ۦۥۢ";
                    break;
                default:
                    strM9248 = C0475.m9248(this);
                    str = "ۨۨۤ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "۠ۢۧ";
        m9.d0 d0Var = null;
        u8.e eVarM949 = null;
        u8.e eVar = null;
        Object objM800 = obj;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56444:
                    str = "ۣ۠ۧ";
                    this = (c) eVarM949;
                    break;
                case 1747749:
                    str = "ۧۡۧ";
                    d0Var = (m9.d0) objM800;
                    break;
                case 1747780:
                    str = "ۡۡ";
                    lVarM238 = C0012.m238();
                    break;
                case 1747838:
                    eVarM949 = C0049.m949(this, d0Var, eVar);
                    str = "ۤ۠";
                    break;
                case 1750786:
                    return objM800;
                case 1754445:
                    str = "۠ۥۣ";
                    eVar = (u8.e) obj2;
                    break;
                default:
                    objM800 = C0041.m800(this, lVarM238);
                    str = "ۣۧۦ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x02fb. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM3728;
        InputStream inputStreamM3166;
        List listM6195;
        String strM2908 = C0151.m2908(m126(), 0, C0307.f454 ^ (-366), 770);
        String strM8682 = C0446.m8682(m126(), 16, C0128.f154 ^ (-173), 612);
        a4.q qVarM7944 = C0405.m7944(this);
        C0300.m5766();
        C0330.m6365(obj);
        try {
            C0014.m280(qVarM7944);
            URL url = new URL(C0018.m360(m126(), 20, C0482.f755 ^ (-520), 2970));
            JSONObject jSONObject = new JSONObject();
            String strM9248 = C0475.m9248(this);
            String strM7976 = C0407.m7976(this);
            String strM8815 = C0453.m8815(this);
            boolean zM4979 = C0261.m4979(this);
            String strM4331 = C0226.m4331(strM9248, C0300.m5765());
            C0336.m6501(strM4331, C0390.m7631(m126(), 67, C0305.f452 ^ 2, 683));
            C0238.m4576(jSONObject, strM8682, C0201.m3852(C0284.m5474(strM4331)));
            C0238.m4576(jSONObject, C0283.m5456(m126(), 83, C0039.f59 ^ 830, 2307), strM7976);
            C0238.m4576(jSONObject, C0206.m3946(m126(), 91, C0362.f632 ^ 34, 2498), strM8815);
            C0035.m691(jSONObject, C0046.m889(m126(), 94, C0217.f240 ^ (-901), 735), zM4979);
            URLConnection uRLConnectionM2216 = C0114.m2216(url);
            C0302.m5795(uRLConnectionM2216, C0473.m9207(m126(), 113, C0421.f691 ^ 266, 1469));
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionM2216;
            C0235.m4509(httpURLConnection, C0104.m2036(m126(), 176, C0129.f155 ^ 756, 3078));
            int i10 = C0198.f222 ^ 9787;
            C0334.m6475(httpURLConnection, i10);
            C0062.m1177(httpURLConnection, i10);
            C0424.m8299(httpURLConnection, C0344.m6742(m126(), 180, C0116.f142 ^ 224, 3165), strM2908);
            C0424.m8299(httpURLConnection, C0151.m2908(m126(), 192, C0007.f27 ^ (-423), 1440), strM2908);
            C0323.m6245(httpURLConnection, true);
            OutputStream outputStreamM5841 = C0304.m5841(httpURLConnection);
            try {
                String strM5554 = C0289.m5554(jSONObject);
                C0336.m6501(strM5554, C0089.m1913(m126(), 198, C0191.f215 ^ (-461), 1353));
                byte[] bArrM3241 = C0169.m3241(strM5554, C0453.m8816());
                C0336.m6501(bArrM3241, C0252.m4804(m126(), 211, C0105.f131 ^ 476, 1017));
                C0492.m9559(outputStreamM5841, bArrM3241);
                C0430.m8414(outputStreamM5841, null);
                int iM7261 = C0370.m7261(httpURLConnection);
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i11 = 200 <= iM7261 ? 1709 : 1678;
                            break;
                        case 204:
                            int i12 = 1740;
                            while (true) {
                                i12 ^= 1757;
                                switch (i12) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i12 = iM7261 < 300 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        inputStreamM3166 = C0165.m3166(httpURLConnection);
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        inputStreamM3166 = C0003.m59(httpURLConnection);
                                        int i13 = 1864;
                                        while (true) {
                                            i13 ^= 1881;
                                            switch (i13) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i13 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            inputStreamM3166 = C0165.m3166(httpURLConnection);
                            break;
                        default:
                            break;
                    }
                }
                String strM3468 = C0181.m3468(qVarM7944, inputStreamM3166);
                C0321.m6209(httpURLConnection);
                JSONObject jSONObject2 = new JSONObject(strM3468);
                boolean zM3949 = C0207.m3949(jSONObject2, C0281.m5427(m126(), 224, C0416.f686 ^ 778, 600), false);
                int i14 = 48891;
                while (true) {
                    i14 ^= 48908;
                    switch (i14) {
                        case 22:
                            break;
                        case 53:
                            JSONObject jSONObjectM7302 = C0373.m7302(jSONObject2, C0193.m3702(m126(), 250, C0100.f126 ^ (-576), 1972));
                            String strM4327 = C0225.m4327(jSONObjectM7302, strM8682, C0440.m8581());
                            C0336.m6501(strM4327, C0091.m1946(m126(), 256, C0082.f116 ^ 375, 1420));
                            int iM2557 = C0133.m2557(jSONObjectM7302, C0006.m114(m126(), 270, C0159.f183 ^ 29, 2740), 0);
                            int iM2558 = C0133.m2557(jSONObjectM7302, C0221.m4259(m126(), 285, C0121.f147 ^ 603, 387), 0);
                            int iM2559 = C0133.m2557(jSONObjectM7302, C0079.m1700(m126(), 298, C0263.f342 ^ 186, 2546), 0);
                            int iM25510 = C0133.m2557(jSONObjectM7302, C0431.m8432(m126(), 305, C0052.f72 ^ 938, 2676), 0);
                            JSONArray jSONArrayM9388 = C0483.m9388(jSONObjectM7302, C0150.m2874(m126(), 316, C0044.f64 ^ 49, 780));
                            int i15 = 49666;
                            while (true) {
                                i15 ^= 49683;
                                switch (i15) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = jSONArrayM9388 != null ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        i9.g gVarM8352 = C0427.m8352(0, C0423.m8287(jSONArrayM9388));
                                        listM6195 = new ArrayList(C0024.m479(gVarM8352));
                                        i9.f fVarM4830 = C0253.m4830(gVarM8352);
                                        while (true) {
                                            boolean zM4101 = C0216.m4101(fVarM4830);
                                            int i16 = 49790;
                                            while (true) {
                                                i16 ^= 49807;
                                                switch (i16) {
                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        C0358.m6998(listM6195, C0453.m8828(jSONArrayM9388, C0162.m3095(fVarM4830)));
                                                        int i17 = 49914;
                                                        while (true) {
                                                            i17 ^= 49931;
                                                            switch (i17) {
                                                                case 497:
                                                                    i17 = 50596;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 241:
                                                        i16 = zM4101 ? 49883 : 49852;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                int i18 = 50689;
                                                while (true) {
                                                    i18 ^= 50706;
                                                    switch (i18) {
                                                        case 19:
                                                            i18 = 50720;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 83:
                                        listM6195 = C0321.m6195(C0241.m4608(m126(), 331, C0378.f648 ^ 188, 556));
                                        break;
                                    default:
                                        break;
                                }
                            }
                            objM3728 = new CouponData(strM4327, iM2557, iM2558, iM2559, iM25510, listM6195, C0051.m1002(jSONObjectM7302, C0293.m5623(m126(), 334, C0088.f122 ^ 973, 439), 299 ^ ((long) C0198.f222)), C0207.m3949(jSONObjectM7302, C0178.m3395(m126(), 343, C0161.f185 ^ (-782), 1174), true), C0207.m3949(jSONObjectM7302, C0425.m8319(m126(), 351, C0006.f1064 ^ 225, 1078), false), 0L, 512, null);
                            int i19 = 50813;
                            while (true) {
                                i19 ^= 50830;
                                switch (i19) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return new q8.h(objM3728);
                                    case 243:
                                        i19 = 50844;
                                        break;
                                }
                            }
                            break;
                        case 503:
                            if (!zM3949) {
                                i14 = 49635;
                            }
                            break;
                        case 32495:
                            return new q8.h(C0195.m3728(new Exception(C0225.m4327(jSONObject2, C0487.m9476(m126(), 231, C0325.f472 ^ (-420), 1017), C0178.m3395(m126(), 236, C0008.f28 ^ (-10), 2397)))));
                        default:
                            continue;
                    }
                    i14 = 48953;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C0430.m8414(outputStreamM5841, th);
                    throw th2;
                }
            }
        } catch (Exception e4) {
            int i20 = 48767;
            while (true) {
                i20 ^= 48784;
                switch (i20) {
                    case Code.UNAVAILABLE /* 14 */:
                        objM3728 = C0195.m3728(new Exception(C0022.m442(C0031.m607(m126(), 366, C0396.f666 ^ 898, 3220), C0213.m4049(e4))));
                        break;
                    case 239:
                        i20 = 48798;
                        break;
                }
            }
        }
    }
}
