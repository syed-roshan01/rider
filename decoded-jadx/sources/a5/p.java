package a5;

import a0.C0003;
import a2.C0004;
import aa.C0012;
import androidx.annotation.C0019;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.relocation.C0024;
import b3.C0051;
import b8.C0055;
import c3.C0062;
import ca.C0070;
import com.auto.accept.data.model.TransactionData;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import d1.C0212;
import d2.C0215;
import d7.C0220;
import d9.C0222;
import d9.C0224;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.migration.C0238;
import dagger.hilt.internal.C0252;
import e9.C0266;
import fa.C0279;
import g2.C0287;
import ga.C0295;
import h.C0296;
import h0.C0299;
import h3.C0301;
import h5.C0308;
import i6.C0319;
import i6.C0320;
import j2.C0324;
import j9.C0329;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import k2.C0333;
import k3.C0335;
import l9.C0347;
import m0.C0349;
import m7.C0357;
import o7.i2;
import okhttp3.internal.publicsuffix.C0372;
import org.json.JSONArray;
import org.json.JSONObject;
import s7.C0414;
import t2.C0422;
import t2.C0423;
import t7.C0425;
import t8.C0426;
import u1.C0431;
import v.C0439;
import v0.C0440;
import v6.C0447;
import v7.C0449;
import v9.C0452;
import x2.C0467;
import x7.C0472;
import z1.C0483;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class p extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f20short = {824, 807, 803, 772, 803, 805, 830, 825, 816, 895, 889, 889, 889, 894, 1558, 1546, 1546, 1550, 1549, 1604, 1617, 1617, 1548, 1559, 1562, 1563, 1567, 1565, 1565, 1563, 1550, 1546, 1563, 1548, 1616, 1559, 1552, 1617, 1567, 1550, 1559, 1617, 1546, 1548, 1567, 1552, 1549, 1567, 1565, 1546, 1559, 1553, 1552, 1569, 1561, 1563, 1546, 1616, 1550, 1558, 1550, 1601, 1547, 1559, 1562, 1603, 590, 597, 588, 588, 512, 579, 577, 590, 590, 591, 596, 512, 578, 581, 512, 579, 577, 595, 596, 512, 596, 591, 512, 590, 591, 590, 525, 590, 597, 588, 588, 512, 596, 601, 592, 581, 512, 586, 577, 598, 577, 526, 590, 581, 596, 526, 616, 596, 596, 592, 629, 626, 620, 611, 591, 590, 590, 581, 579, 596, 585, 591, 590, 2067, 2065, 2048, 1906, 1872, 1872, 1878, 1859, 1863, 312, 297, 297, 309, 304, 314, 312, 301, 304, 310, 311, 374, 307, 298, 310, 311, 518, 516, 533, 552, 527, 529, 532, 533, 562, 533, 531, 516, 512, 524, 585, 591, 591, 591, 584, 2517, 2515, 2501, 2501, 2499, 2517, 2517, 3095, 3120, 3128, 3133, 3124, 3125, 3185, 3109, 3134, 3185, 3127, 3124, 3109, 3122, 3129, 3185, 3109, 3107, 3120, 3135, 3106, 3120, 3122, 3109, 3128, 3134, 3135, 3106, 1091, 1093, 1110, 1113, 1092, 1110, 1108, 1091, 1118, 1112, 1113, 1092, 563, 558, 568, 569, 558, 533, 568, 1231, 1235, 1246, 1233, 1259, 1222, 1231, 1242, 2771, 2783, 2781, 2759, 2780, 2758, 2253, 2250, 2271, 2250, 2251, 2253, 2954, 2950, 2972, 2969, 2950, 2951, 2986, 2950, 2957, 2956, 2732, 2721, 2747, 2731, 2727, 2749, 2726, 2748, 2697, 2725, 2727, 2749, 2726, 2748, 640, 657, 646, 642, 663, 646, 647, 674, 663, 2067, 2070, 2050, 2055, 2066, 2051, 2050, 2087, 2066, 2307, 2305, 2320, 2352, 2326, 2309, 2314, 2327, 2309, 2311, 2320, 2317, 2315, 2314, 2327, 2372, 2305, 2326, 2326, 2315, 2326, 2398, 2372, 3143, 3176, 3187, 3172, 3186, 3189, 3182, 3187, 3172, 3155, 3172, 3185, 3182, 3186, 3176, 3189, 3182, 3187, 3192};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1293a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, u8.e eVar) {
        super(C0467.f738 ^ (-414), eVar);
        this.f1293a = str;
        int iM5709 = C0296.m5709();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5709 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0062.m1201("kL7D1gSDO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m137() {
        int iM5529 = C0287.m5529();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5529 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f20short;
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
        String strM5680 = null;
        String str = "\u06e4\u06e7\u06e7";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751748:
                    strM5680 = C0295.m5680(this);
                    str = "\u06e7\u06e2\u06e2";
                    break;
                case 1754471:
                    this = new p(strM5680, eVar);
                    str = "\u06e8\u06e5\u06df";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e3\u06e0\u06e8";
        q8.l lVarM238 = null;
        Object objM1676 = obj;
        m9.d0 d0Var = null;
        u8.e eVarM2271 = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56387:
                    str = "\u06e2\u06df\u06e5";
                    eVar = (u8.e) obj2;
                    break;
                case 1749576:
                    eVarM2271 = C0118.m2271(this, d0Var, eVar);
                    str = "\u06df\u06e5\u06e0";
                    break;
                case 1750571:
                    str = "\u06e2\u06e5";
                    d0Var = (m9.d0) objM1676;
                    break;
                case 1750748:
                    return objM1676;
                case 1752492:
                    str = "\u06e5\u06e7\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                case 1752705:
                    objM1676 = C0077.m1676(this, lVarM238);
                    str = "\u06e3\u06e6\u06df";
                    break;
                default:
                    str = "\u06e5\u06e0\u06e7";
                    this = (p) eVarM2271;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0177. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM3728;
        BufferedReader bufferedReader;
        String strM4371 = C0226.m4371(m137(), 0, C0004.f1062 ^ (-210), 855);
        String strM8581 = C0439.m8581();
        String strM2094 = C0108.m2094(m137(), 14, C0090.f124 ^ 878, 1662);
        C0299.m5766();
        C0329.m6365(obj);
        try {
            try {
                String strM5680 = C0295.m5680(this);
                StringBuilder sb = new StringBuilder(strM2094);
                C0142.m2728(sb, strM5680);
                URLConnection uRLConnectionM2216 = C0114.m2216(new URL(C0440.m8605(sb)));
                C0301.m5795(uRLConnectionM2216, C0205.m3930(m137(), 66, C0452.f723 ^ (-895), 544));
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionM2216;
                C0234.m4509(httpURLConnection, C0055.m1064(m137(), 129, C0472.f743 ^ (-559), 2132));
                int i10 = C0026.f46 ^ (-9769);
                C0333.m6475(httpURLConnection, i10);
                C0062.m1177(httpURLConnection, i10);
                C0423.m8299(httpURLConnection, C0234.m4516(m137(), 132, C0238.f318 ^ (-769), 1843), C0449.m8757(m137(), 138, C0308.f456 ^ (-254), 345));
                InputStream inputStreamM59 = C0003.m59(httpURLConnection);
                C0335.m6501(inputStreamM59, C0431.m8452(m137(), 154, C0157.f181 ^ (-337), 609));
                Reader inputStreamReader = new InputStreamReader(inputStreamM59, C0452.m8816());
                boolean z10 = inputStreamReader instanceof BufferedReader;
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (z10) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            bufferedReader = (BufferedReader) inputStreamReader;
                            int i12 = 1740;
                            while (true) {
                                i12 ^= 1757;
                                switch (i12) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i12 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            bufferedReader = new BufferedReader(inputStreamReader, C0233.f313 ^ 8510);
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                String strM391 = C0019.m391(bufferedReader);
                C0320.m6209(httpURLConnection);
                JSONObject jSONObject = new JSONObject(strM391);
                boolean zM3949 = C0207.m3949(jSONObject, C0070.m1360(m137(), 173, C0347.f618 ^ 391, 2470), false);
                int i13 = 48767;
                while (true) {
                    i13 ^= 48784;
                    switch (i13) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            JSONArray jSONArrayM2304 = C0119.m2304(jSONObject, C0231.m4443(m137(), 208, C0156.f180 ^ 390, 1079));
                            i9.g gVarM8352 = C0426.m8352(0, C0422.m8287(jSONArrayM2304));
                            objM3728 = new ArrayList(C0024.m479(gVarM8352));
                            i9.f fVarM4830 = C0252.m4830(gVarM8352);
                            while (true) {
                                boolean zM4101 = C0215.m4101(fVarM4830);
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i14 = zM4101 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            break;
                                        default:
                                            break;
                                    }
                                    int i15 = 49790;
                                    while (true) {
                                        i15 ^= 49807;
                                        switch (i15) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 241:
                                                i15 = 49821;
                                                continue;
                                            default:
                                                continue;
                                        }
                                        return new q8.h(objM3728);
                                    }
                                }
                                JSONObject jSONObjectM9516 = C0488.m9516(jSONArrayM2304, C0162.m3095(fVarM4830));
                                String strM4327 = C0224.m4327(jSONObjectM9516, C0324.m6275(m137(), 220, C0425.f696 ^ (-344), 604), strM8581);
                                C0335.m6501(strM4327, strM4371);
                                String strM4328 = C0224.m4327(jSONObjectM9516, C0266.m5096(m137(), 227, C0472.f743 ^ (-550), 1215), strM8581);
                                C0335.m6501(strM4328, strM4371);
                                int iM2557 = C0133.m2557(jSONObjectM9516, C0173.m3297(m137(), 235, C0447.f718 ^ (-192), 2738), 0);
                                String strM4329 = C0224.m4327(jSONObjectM9516, C0279.m5414(m137(), 241, C0220.f300 ^ (-123), 2238), strM8581);
                                C0335.m6501(strM4329, strM4371);
                                String strM43210 = C0224.m4327(jSONObjectM9516, C0151.m2908(m137(), 247, C0425.f696 ^ (-347), 3049), strM8581);
                                C0335.m6501(strM43210, strM4371);
                                int iM2558 = C0133.m2557(jSONObjectM9516, C0088.m1884(m137(), 257, C0024.f44 ^ 537, 2760), 0);
                                String strM8127 = C0414.m8127(m137(), 271, C0024.f44 ^ 542, 739);
                                long j10 = 204 ^ ((long) C0319.f467);
                                C0357.m6998(objM3728, new TransactionData(strM4327, strM4328, iM2557, strM4329, strM43210, iM2558, C0051.m1002(jSONObjectM9516, strM8127, j10), C0051.m1002(jSONObjectM9516, C0372.m7300(m137(), 280, C0228.f308 ^ (-563), 2150), j10)));
                                int i16 = 49666;
                                while (true) {
                                    i16 ^= 49683;
                                    switch (i16) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = 49697;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                    }
                                }
                            }
                            break;
                        case 76:
                            return new q8.h(C0195.m3728(new Exception(C0414.m8127(m137(), 180, C0137.f163 ^ 126, 3153))));
                        case 239:
                            i13 = !zM3949 ? 48860 : 48829;
                            break;
                        default:
                            break;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                int i17 = 1864;
                while (true) {
                    i17 ^= 1881;
                    switch (i17) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i17 = 48674;
                            continue;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    String strM4049 = C0212.m4049(e);
                    StringBuilder sb2 = new StringBuilder(C0349.m6842(m137(), 289, C0222.f302 ^ 467, 2404));
                    C0142.m2728(sb2, strM4049);
                    C0440.m8605(sb2);
                    C0483.m9406(m137(), 312, C0126.f152 ^ (-221), 3073);
                    objM3728 = C0195.m3728(e);
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
    }
}
