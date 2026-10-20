package a5;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.input.pointer.C0034;
import androidx.profileinstaller.C0045;
import c3.C0062;
import c4.C0064;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0169;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d.C0210;
import d9.C0225;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import e0.C0256;
import g.C0283;
import g3.C0288;
import h0.C0299;
import h3.C0301;
import h3.C0303;
import h7.C0310;
import i6.C0320;
import ia.C0322;
import j9.C0329;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import k2.C0333;
import k3.C0335;
import l6.C0343;
import l8.C0345;
import l8.C0346;
import o4.C0369;
import o7.i2;
import org.json.JSONObject;
import r2.C0396;
import r6.C0402;
import t2.C0423;
import u.C0429;
import v9.C0452;
import w5.C0463;
import x2.C0467;
import x7.C0471;
import z8.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class a extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f7short = {2261, 2249, 2249, 2253, 2254, 2183, 2194, 2194, 2255, 2260, 2265, 2264, 2268, 2270, 2270, 2264, 2253, 2249, 2264, 2255, 2195, 2260, 2259, 2194, 2268, 2253, 2260, 2194, 2270, 2258, 2248, 2253, 2258, 2259, 2274, 2255, 2264, 2265, 2264, 2264, 2256, 2195, 2253, 2261, 2253, 1617, 1629, 1622, 1623, 833, 858, 864, 837, 837, 848, 839, 886, 852, 838, 848, 797, 795, 795, 795, 796, 1867, 1872, 1865, 1865, 1797, 1862, 1860, 1867, 1867, 1866, 1873, 1797, 1863, 1856, 1797, 1862, 1860, 1878, 1873, 1797, 1873, 1866, 1797, 1867, 1866, 1867, 1800, 1867, 1872, 1865, 1865, 1797, 1873, 1884, 1877, 1856, 1797, 1871, 1860, 1875, 1860, 1803, 1867, 1856, 1873, 1803, 1901, 1873, 1873, 1877, 1904, 1911, 1897, 1894, 1866, 1867, 1867, 1856, 1862, 1873, 1868, 1866, 1867, 1737, 1750, 1738, 1741, 2063, 2083, 2082, 2104, 2089, 2082, 2104, 2145, 2072, 2101, 2108, 2089, 3141, 3156, 3156, 3144, 3149, 3143, 3141, 3152, 3149, 3147, 3146, 3083, 3150, 3159, 3147, 3146, 882, 873, 853, 882, 884, 879, 872, 865, 814, 808, 808, 808, 815, 2925, 2927, 2942, 2888, 2931, 2942, 2927, 2937, 2850, 2852, 2852, 2852, 2851};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.q f1217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a4.q qVar, String str, u8.e eVar) {
        super(C0045.f65 ^ 71, eVar);
        this.f1217a = qVar;
        this.f1218b = str;
        int iM4901 = C0256.m4901();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4901 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0333.m6482("IWKnGN3zk5pDFzWkxhITYdQ1cwE")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m123() {
        int iM7897 = C0402.m7897();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7897 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f7short;
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
        String str = "\u06e0\u06e6";
        String strM6769 = null;
        a4.q qVarM665 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56326:
                    str = "\u06e1\u06e2\u06e4";
                    qVarM665 = C0034.m665(this);
                    break;
                case 1748707:
                    strM6769 = C0346.m6769(this);
                    str = "\u06e4\u06e8\u06e5";
                    break;
                case 1751777:
                    this = new a(qVarM665, strM6769, eVar);
                    str = "\u06e5\u06e1\u06e6";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e4\u06e8\u06e6";
        u8.e eVar = null;
        q8.l lVarM238 = null;
        Object objM3613 = obj;
        u8.e eVarM9109 = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56328:
                    eVarM9109 = C0467.m9109(this, d0Var, eVar);
                    str = "\u06e8\u06e3\u06e5";
                    break;
                case 1747684:
                    objM3613 = C0189.m3613(this, lVarM238);
                    str = "\u06e5\u06e0\u06e1";
                    break;
                case 1750819:
                    str = "\u06e0\u06e8";
                    eVar = (u8.e) obj2;
                    break;
                case 1751778:
                    str = "\u06e3\u06e8\u06e8";
                    d0Var = (m9.d0) objM3613;
                    break;
                case 1752486:
                    return lVarM238;
                case 1753452:
                    str = "\u06e0\u06e0\u06e4";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    str = "\u06e6\u06e0\u06e6";
                    this = (a) eVarM9109;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        C0299.m5766();
        C0329.m6365(obj);
        try {
            C0014.m280(C0034.m665(this));
            URL url = new URL(C0161.m3082(m123(), 0, C0111.f137 ^ (-814), 2237));
            JSONObject jSONObject = new JSONObject();
            String strM6769 = C0346.m6769(this);
            String strM6764 = C0345.m6764(m123(), 45, C0024.f44 ^ 531, 1586);
            String strM4331 = C0225.m4331(strM6769, C0299.m5765());
            C0335.m6501(strM4331, C0064.m1234(m123(), 49, C0210.f234 ^ 377, 821));
            C0237.m4576(jSONObject, strM6764, C0201.m3852(C0283.m5474(strM4331)));
            URLConnection uRLConnectionM2216 = C0114.m2216(url);
            C0301.m5795(uRLConnectionM2216, C0121.m2327(m123(), 65, C0310.f458 ^ (-132), 1829));
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionM2216;
            C0234.m4509(httpURLConnection, C0020.m406(m123(), 128, C0062.f82 ^ 326, 1689));
            int i10 = C0153.f178 ^ (-10174);
            C0333.m6475(httpURLConnection, i10);
            C0062.m1177(httpURLConnection, i10);
            C0423.m8299(httpURLConnection, C0157.m2993(m123(), 132, C0343.f614 ^ 403, 2124), C0471.m9178(m123(), 144, C0233.f313 ^ 302, 3108));
            C0322.m6245(httpURLConnection, true);
            OutputStream outputStreamM5841 = C0303.m5841(httpURLConnection);
            try {
                String strM5554 = C0288.m5554(jSONObject);
                C0335.m6501(strM5554, C0463.m9022(m123(), 160, C0014.f34 ^ 975, 774));
                byte[] bArrM3241 = C0169.m3241(strM5554, C0452.m8816());
                C0335.m6501(bArrM3241, C0396.m7757(m123(), 173, C0174.f198 ^ (-166), 2826));
                C0491.m9559(outputStreamM5841, bArrM3241);
                C0429.m8414(outputStreamM5841, null);
                C0369.m7261(httpURLConnection);
                C0320.m6209(httpURLConnection);
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            return C0012.m238();
                        case 49:
                            i11 = 1647;
                            break;
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
        } catch (Exception e4) {
            int i12 = 1740;
            while (true) {
                i12 ^= 1757;
                switch (i12) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = 1771;
                        break;
                    case 54:
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
