package a5;

import a0.C0003;
import a7.C0008;
import a8.C0009;
import aa.C0012;
import androidx.annotation.C0019;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.graphics.C0032;
import androidx.core.content.C0041;
import c1.C0058;
import c3.C0062;
import ca.C0070;
import com.auto.accept.service.C0072;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.play.core.integrity.model.C0109;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0169;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.C0192;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.gson.internal.bind.C0206;
import d1.C0212;
import d1.C0213;
import d8.C0221;
import d9.C0224;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.aliasof.C0247;
import f6.C0277;
import g3.C0288;
import h.C0297;
import h0.C0299;
import h3.C0301;
import h3.C0303;
import i6.C0320;
import ia.C0322;
import j5.C0327;
import j9.C0329;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import k2.C0333;
import k3.C0335;
import m7.C0358;
import n1.C0362;
import o4.C0369;
import o7.i2;
import org.json.JSONObject;
import p0.C0373;
import q1.C0383;
import q5.C0385;
import q6.C0387;
import r2.C0397;
import r6.C0401;
import t2.C0423;
import u.C0429;
import v.C0439;
import v0.C0440;
import v9.C0452;
import w.C0453;
import w4.C0459;
import x7.C0472;
import z0.C0482;
import z3.C0487;
import z7.C0490;
import z8.C0491;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class u extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f23short = {2827, 2852, 2879, 2856, 2878, 2873, 2850, 2879, 2856, 2847, 2856, 2877, 2850, 2878, 2852, 2873, 2850, 2879, 2868, 1234, 1216, 1239, 1220, 1269, 1235, 1216, 1231, 1234, 1216, 1218, 1237, 1224, 1230, 1231, 1153, 1235, 1220, 1234, 1233, 1230, 1231, 1234, 1220, 1153, 1161, 421, 439, 416, 435, 386, 420, 439, 440, 421, 439, 437, 418, 447, 441, 440, 492, 502, 1618, 1614, 1614, 1610, 1609, 1536, 1557, 1557, 1608, 1619, 1630, 1631, 1627, 1625, 1625, 1631, 1610, 1614, 1631, 1608, 1556, 1619, 1620, 1557, 1627, 1610, 1619, 1557, 1614, 1608, 1627, 1620, 1609, 1627, 1625, 1614, 1619, 1621, 1620, 1637, 1625, 1608, 1631, 1627, 1614, 1631, 1556, 1610, 1618, 1610, 931, 959, 946, 808, 821, 803, 802, 821, 782, 803, 1521, 1517, 1504, 1519, 1493, 1528, 1521, 1508, 2947, 2959, 2957, 2967, 2956, 2966, 3028, 3032, 3010, 3015, 3032, 3033, 3060, 3032, 3027, 3026, 1208, 1205, 1199, 1215, 1203, 1193, 1202, 1192, 1181, 1201, 1203, 1193, 1202, 1192, 1719, 1708, 1717, 1717, 1785, 1722, 1720, 1719, 1719, 1718, 1709, 1785, 1723, 1724, 1785, 1722, 1720, 1706, 1709, 1785, 1709, 1718, 1785, 1719, 1718, 1719, 1780, 1719, 1708, 1717, 1717, 1785, 1709, 1696, 1705, 1724, 1785, 1715, 1720, 1711, 1720, 1783, 1719, 1724, 1709, 1783, 1681, 1709, 1709, 1705, 1676, 1675, 1685, 1690, 1718, 1719, 1719, 1724, 1722, 1709, 1712, 1718, 1719, 1042, 1037, 1041, 1046, 1974, 1946, 1947, 1921, 1936, 1947, 1921, 2008, 1953, 1932, 1925, 1936, 709, 724, 724, 712, 717, 711, 709, 720, 717, 715, 714, 651, 718, 727, 715, 714, 1518, 1525, 1481, 1518, 1512, 1523, 1524, 1533, 1458, 1460, 1460, 1460, 1459, 834, 832, 849, 871, 860, 849, 832, 854, 781, 779, 779, 779, 780, 1511, 1509, 1524, 1481, 1518, 1520, 1525, 1524, 1491, 1524, 1522, 1509, 1505, 1517, 1448, 1454, 1454, 1454, 1449, 1661, 1646, 1652, 2085, 2103, 2080, 2099, 2050, 2084, 2103, 2104, 2085, 2103, 2101, 2082, 2111, 2105, 2104, 2166, 2099, 2084, 2084, 2105, 2084, 2156, 2166};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, String str2, String str3, int i10, String str4, int i11, u8.e eVar) {
        super(C0083.f117 ^ (-779), eVar);
        this.f1307a = str;
        this.f1308b = str2;
        this.f1309c = str3;
        this.f1310d = i10;
        this.f1311e = str4;
        this.f1312f = i11;
        int iM4316 = C0224.m4316();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4316 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0327.m6326("alsdjyRPcpGt6HqI"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m140() {
        int iM4380 = C0227.m4380();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4380 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f23short;
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
        String str = "\u06e4\u06e0\u06df";
        String strM1097 = null;
        String strM7772 = null;
        String strM7320 = null;
        String strM3667 = null;
        int iM514 = 0;
        int iM3942 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746844:
                    iM514 = C0026.m514(this);
                    str = "\u06e7\u06e0\u06e2";
                    break;
                case 1749632:
                    return this;
                case 1751523:
                    strM7772 = C0397.m7772(this);
                    str = "\u06e6\u06e6";
                    break;
                case 1751709:
                    iM3942 = C0206.m3942(this);
                    str = "\u06e7\u06e3\u06e1";
                    break;
                case 1751712:
                    strM3667 = C0192.m3667(this);
                    str = "\u06e4\u06e6\u06df";
                    break;
                case 1754409:
                    this = new u(strM7772, strM1097, strM3667, iM3942, strM7320, iM514, eVar);
                    str = "\u06e2\u06e1\u06df";
                    break;
                case 1754501:
                    strM7320 = C0373.m7320(this);
                    str = "\u06df\u06e4\u06e1";
                    break;
                default:
                    strM1097 = C0058.m1097(this);
                    str = "\u06e4\u06e6\u06e2";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e2\u06df\u06e8";
        u8.e eVarM7040 = null;
        Object objM1567 = obj;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748765:
                    str = "\u06e3\u06e4\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                case 1749725:
                    eVarM7040 = C0358.m7040(this, d0Var, eVar);
                    str = "\u06e5\u06e2\u06e3";
                    break;
                case 1750690:
                    objM1567 = C0072.m1567(this, lVarM238);
                    str = "\u06e4\u06e1\u06e8";
                    break;
                case 1751563:
                    return objM1567;
                case 1752550:
                    str = "\u06e1\u06e4\u06e0";
                    this = (u) eVarM7040;
                    break;
                case 1753693:
                    str = "\u06e2\u06e4\u06df";
                    eVar = (u8.e) obj2;
                    break;
                default:
                    str = "\u06e6\u06e8\u06df";
                    d0Var = (m9.d0) objM1567;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM3728;
        String strM8581;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        C0112.m2172(m140(), 0, C0104.f130 ^ 768, 2893);
        String strM5721 = C0297.m5721(m140(), 19, C0124.f150 ^ (-120), 1185);
        String strM1360 = C0070.m1360(m140(), 45, C0277.f422 ^ (-417), 470);
        C0299.m5766();
        C0329.m6365(obj);
        try {
            URL url = new URL(C0041.m814(m140(), 62, C0109.f135 ^ 113, 1594));
            JSONObject jSONObject = new JSONObject();
            String strM7772 = C0397.m7772(this);
            String strM1097 = C0058.m1097(this);
            String strM3667 = C0192.m3667(this);
            int iM3942 = C0206.m3942(this);
            String strM7320 = C0373.m7320(this);
            int iM514 = C0026.m514(this);
            C0237.m4576(jSONObject, C0487.m9485(m140(), 112, C0233.f313 ^ 317, 982), strM7772);
            C0237.m4576(jSONObject, C0230.m4437(m140(), 115, C0387.f658 ^ (-889), 839), strM1097);
            C0237.m4576(jSONObject, C0191.m3642(m140(), 122, C0482.f756 ^ 935, 1409), strM3667);
            C0459.m8954(jSONObject, C0490.m9556(m140(), 130, C0191.f215 ^ (-456), 3042), iM3942);
            C0237.m4576(jSONObject, C0221.m4271(m140(), 136, C0401.f672 ^ (-519), 2999), strM7320);
            C0459.m8954(jSONObject, C0117.m2265(m140(), 146, C0032.f52 ^ (-752), 1244), iM514);
            StringBuilder sb = new StringBuilder(strM1360);
            C0213.m4074(sb, jSONObject);
            C0440.m8605(sb);
            URLConnection uRLConnectionM2216 = C0114.m2216(url);
            C0301.m5795(uRLConnectionM2216, C0020.m406(m140(), 160, C0008.f28 ^ (-57), 1753));
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionM2216;
            C0234.m4509(httpURLConnection, C0104.m2036(m140(), 223, C0472.f743 ^ (-554), 1090));
            int i10 = C0362.f633 ^ 10094;
            C0333.m6475(httpURLConnection, i10);
            C0062.m1177(httpURLConnection, i10);
            C0423.m8299(httpURLConnection, C0087.m1850(m140(), 227, C0383.f654 ^ (-58), 2037), C0103.m2009(m140(), 239, C0087.f121 ^ 588, 676));
            C0322.m6245(httpURLConnection, true);
            OutputStream outputStreamM5841 = C0303.m5841(httpURLConnection);
            try {
                String strM5554 = C0288.m5554(jSONObject);
                C0335.m6501(strM5554, C0385.m7543(m140(), 255, C0197.f221 ^ 110, 1434));
                Charset charsetM8816 = C0452.m8816();
                byte[] bArrM3241 = C0169.m3241(strM5554, charsetM8816);
                C0335.m6501(bArrM3241, C0111.m2138(m140(), 268, C0227.f307 ^ (-899), 805));
                C0491.m9559(outputStreamM5841, bArrM3241);
                C0429.m8414(outputStreamM5841, null);
                int iM7261 = C0369.m7261(httpURLConnection);
                int i11 = C0113.f139 ^ (-8288);
                try {
                    InputStream inputStreamM59 = C0003.m59(httpURLConnection);
                    C0335.m6501(inputStreamM59, C0182.m3474(m140(), 281, C0492.f766 ^ (-829), 1408));
                    Reader inputStreamReader = new InputStreamReader(inputStreamM59, charsetM8816);
                    boolean z10 = inputStreamReader instanceof BufferedReader;
                    int i12 = 1616;
                    while (true) {
                        i12 ^= 1633;
                        switch (i12) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 49:
                                i12 = z10 ? 1709 : 1678;
                                break;
                            case 204:
                                bufferedReader2 = (BufferedReader) inputStreamReader;
                                int i13 = 1740;
                                while (true) {
                                    i13 ^= 1757;
                                    switch (i13) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 1771;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                bufferedReader2 = new BufferedReader(inputStreamReader, i11);
                                break;
                            default:
                                break;
                        }
                    }
                    strM8581 = C0019.m391(bufferedReader2);
                    int i14 = 1864;
                    while (true) {
                        i14 ^= 1881;
                        switch (i14) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = 48674;
                                continue;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        C0320.m6209(httpURLConnection);
                        StringBuilder sb2 = new StringBuilder(strM5721);
                        C0197.m3772(sb2, iM7261);
                        C0142.m2728(sb2, C0247.m4739(m140(), 300, C0453.f724 ^ 892, 1620));
                        C0142.m2728(sb2, strM8581);
                        C0440.m8605(sb2);
                        objM3728 = C0012.m238();
                        int i15 = 50689;
                        while (true) {
                            i15 ^= 50706;
                            switch (i15) {
                                case 19:
                                    i15 = 50720;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    return new q8.h(objM3728);
                            }
                        }
                    }
                } catch (Exception e4) {
                    InputStream inputStreamM3166 = C0165.m3166(httpURLConnection);
                    int i16 = 48767;
                    while (true) {
                        i16 ^= 48784;
                        switch (i16) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                strM8581 = C0439.m8581();
                                break;
                            case 76:
                                Reader inputStreamReader2 = new InputStreamReader(inputStreamM3166, C0452.m8816());
                                boolean z11 = inputStreamReader2 instanceof BufferedReader;
                                int i17 = 48891;
                                while (true) {
                                    i17 ^= 48908;
                                    switch (i17) {
                                        case 22:
                                            break;
                                        case 53:
                                            bufferedReader = new BufferedReader(inputStreamReader2, i11);
                                            break;
                                        case 503:
                                            i17 = z11 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            bufferedReader = (BufferedReader) inputStreamReader2;
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
                                strM8581 = C0019.m391(bufferedReader);
                                int i19 = 49914;
                                while (true) {
                                    i19 ^= 49931;
                                    switch (i19) {
                                        case 497:
                                            i19 = 50596;
                                            break;
                                        case 1711:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                if (inputStreamM3166 != null) {
                                    i16 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i16 = 48829;
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C0429.m8414(outputStreamM5841, th);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            int i20 = 49790;
            while (true) {
                i20 ^= 49807;
                switch (i20) {
                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        String strM4049 = C0212.m4049(e10);
                        StringBuilder sb3 = new StringBuilder(C0009.m179(m140(), 303, C0163.f187 ^ (-685), 2134));
                        C0142.m2728(sb3, strM4049);
                        C0440.m8605(sb3);
                        objM3728 = C0195.m3728(e10);
                        break;
                    case 241:
                        i20 = 49821;
                        break;
                }
            }
        }
    }
}
