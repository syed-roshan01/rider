package a5;

import a0.C0003;
import a3.C0006;
import aa.C0011;
import aa.C0012;
import android.os.C0013;
import androidx.annotation.C0019;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.node.C0037;
import c3.C0062;
import com.auto.accept.service.C0072;
import com.google.android.datatransport.cct.C0078;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.iid.C0169;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.gson.internal.bind.C0207;
import d1.C0213;
import d9.C0225;
import dagger.hilt.android.internal.modules.C0235;
import e2.C0264;
import f0.C0273;
import fa.C0282;
import g0.C0286;
import g2.C0288;
import g5.C0292;
import g7.C0293;
import h0.C0300;
import h3.C0302;
import h3.C0304;
import i6.C0321;
import ia.C0323;
import j2.C0325;
import j4.C0327;
import j9.C0330;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import k1.C0333;
import k2.C0334;
import k3.C0336;
import k7.C0338;
import l0.C0341;
import o7.i2;
import okhttp3.internal.publicsuffix.C0373;
import org.json.JSONObject;
import q0.C0383;
import r2.C0398;
import r4.C0399;
import r6.C0402;
import r7.C0404;
import s7.C0416;
import t2.C0422;
import t2.C0424;
import u.C0430;
import v.C0440;
import v0.C0441;
import v0.C0442;
import v5.C0445;
import v6.C0448;
import v9.C0453;
import w6.C0465;
import y.C0476;
import z8.C0492;
import z8.C0493;

/* JADX INFO: loaded from: classes.dex */
public final class y extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f25short = {726, 721, 1533, 1530, 1501, 1501, 2453, 2453, 2627, 2651, 2626, 2650, 2631, 2654, 2639, 2652, 2650, 2561, 2632, 2625, 2652, 2627, 2563, 2634, 2639, 2650, 2639, 2581, 2574, 2636, 2625, 2651, 2624, 2634, 2639, 2652, 2647, 2579, 750, 750, 750, 750, 641, 684, 694, 685, 679, 674, 689, 698, 477, 449, 449, 453, 454, 399, 410, 410, 455, 476, 465, 464, 468, 470, 470, 464, 453, 449, 464, 455, 411, 476, 475, 410, 468, 453, 476, 410, 453, 477, 474, 449, 474, 490, 448, 453, 473, 474, 468, 465, 411, 453, 477, 453, 2921, 2930, 2923, 2923, 2855, 2916, 2918, 2921, 2921, 2920, 2931, 2855, 2917, 2914, 2855, 2916, 2918, 2932, 2931, 2855, 2931, 2920, 2855, 2921, 2920, 2921, 2858, 2921, 2930, 2923, 2923, 2855, 2931, 2942, 2935, 2914, 2855, 2925, 2918, 2929, 2918, 2857, 2921, 2914, 2931, 2857, 2895, 2931, 2931, 2935, 2898, 2901, 2891, 2884, 2920, 2921, 2921, 2914, 2916, 2931, 2926, 2920, 2921, 1619, 1612, 1616, 1623, 1359, 1379, 1378, 1400, 1385, 1378, 1400, 1313, 1368, 1397, 1404, 1385, 1926, 1962, 1963, 1969, 1952, 1963, 1969, 2024, 1921, 1964, 1974, 1973, 1962, 1974, 1964, 1969, 1964, 1962, 1963, 2047, 2021, 1955, 1962, 1975, 1960, 2024, 1953, 1956, 1969, 1956, 2046, 2021, 1963, 1956, 1960, 1952, 2040, 2023, 1968, 1964, 1953, 2023, 1992, 1999, 1992, 1999, 3184, 3164, 3165, 3143, 3158, 3165, 3143, 3102, 3191, 3162, 3136, 3139, 3164, 3136, 3162, 3143, 3162, 3164, 3165, 3081, 3091, 3157, 3164, 3137, 3166, 3102, 3159, 3154, 3143, 3154, 3080, 3091, 3165, 3154, 3166, 3158, 3086, 3089, 3139, 3163, 3164, 3143, 3164, 3089, 3080, 3091, 3157, 3162, 3167, 3158, 3165, 3154, 3166, 3158, 3086, 3089, 3139, 3163, 3164, 3143, 3164, 3101, 3161, 3139, 3156, 3089, 3134, 3129, 775, 811, 810, 816, 801, 810, 816, 873, 784, 829, 820, 801, 894, 868, 813, 809, 805, 803, 801, 875, 814, 820, 801, 803, 841, 846, 841, 846, 1555, 1555, 1587, 1588, 1664, 1666, 1683, 1710, 1673, 1687, 1682, 1683, 1716, 1683, 1685, 1666, 1670, 1674, 1743, 1737, 1737, 1737, 1742, 1182, 1176, 1166, 1166, 1160, 1182, 1182, 658, 650, 653, 662, 653, 695, 656, 654, 923, 908, 908, 913, 908, 2313, 2348, 2352, 2355, 2365, 2360, 2428, 2362, 2365, 2357, 2352, 2361, 2360, 1416, 1421, 1425, 1426, 1436, 1433, 1453, 1423, 1426, 1435, 1428, 1425, 1432, 1453, 1429, 1426, 1417, 1426, 1501, 1432, 1423, 1423, 1426, 1423, 1479, 1501, 2609, 2590, 2565, 2578, 2564, 2563, 2584, 2565, 2578, 2597, 2578, 2567, 2584, 2564, 2590, 2563, 2584, 2565, 2574};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, byte[] bArr, u8.e eVar) {
        super(C0325.f472 ^ (-421), eVar);
        this.f1321a = str;
        this.f1322b = bArr;
        int iM70 = C0003.m70();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM70 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0079.m1708("eHtAIr8irtDP4dB")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m142() {
        int iM7797 = C0399.m7797();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7797 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f25short;
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
        String str = "ۥۥ۟";
        String strM2520 = null;
        byte[] bArrM2269 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746815:
                    str = "ۧ۟۠";
                    bArrM2269 = C0118.m2269(this);
                    break;
                case 1748768:
                    return this;
                case 1752639:
                    strM2520 = C0131.m2520(this);
                    str = "ۣۣ۟";
                    break;
                default:
                    this = new y(strM2520, bArrM2269, eVar);
                    str = "ۣۡۤ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۣۣۦ";
        Object objM5246 = obj;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVarM3348 = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748741:
                    return objM5246;
                case 1748769:
                    str = "ۢۤۧ";
                    lVarM238 = C0012.m238();
                    break;
                case 1749733:
                    objM5246 = C0273.m5246(this, lVarM238);
                    str = "ۣۡۧ";
                    break;
                case 1750662:
                    str = "۠ۦ۟";
                    d0Var = (m9.d0) objM5246;
                    break;
                case 1752704:
                    eVarM3348 = C0175.m3348(this, d0Var, eVar);
                    str = "ۧۧ۠";
                    break;
                case 1754624:
                    str = "ۡۤۤ";
                    this = (y) eVarM3348;
                    break;
                default:
                    str = "ۥۧۢ";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x023f A[SYNTHETIC] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        Object objM3728;
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;
        String strM114 = C0006.m114(m142(), 0, C0445.f715 ^ (-854), 731);
        String strM2502 = C0130.m2502(m142(), 2, C0476.f746 ^ (-31), 1520);
        String strM732 = C0037.m732(m142(), 6, C0112.f138 ^ 570, 2488);
        String strM1966 = C0100.m1966(m142(), 8, C0126.f152 ^ (-210), 2606);
        String strM8167 = C0416.m8167(m142(), 38, C0282.f426 ^ 805, 707);
        C0300.m5766();
        C0330.m6365(obj);
        try {
            long jM7869 = C0402.m7869();
            StringBuilder sb = new StringBuilder(strM8167);
            C0341.m6676(sb, jM7869);
            String strM8605 = C0441.m8605(sb);
            URLConnection uRLConnectionM2216 = C0114.m2216(new URL(C0264.m5027(m142(), 50, C0327.f474 ^ (-828), 437)));
            C0302.m5795(uRLConnectionM2216, C0430.m8416(m142(), 94, C0286.f430 ^ (-857), 2823));
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionM2216;
            C0235.m4509(httpURLConnection, C0430.m8416(m142(), 157, C0333.f516 ^ 823, 1539));
            int i11 = C0138.f164 ^ (-30470);
            C0334.m6475(httpURLConnection, i11);
            C0062.m1177(httpURLConnection, i11);
            String strM7915 = C0404.m7915(m142(), 161, C0292.f439 ^ (-896), 1292);
            StringBuilder sb2 = new StringBuilder(strM1966);
            C0142.m2728(sb2, strM8605);
            C0424.m8299(httpURLConnection, strM7915, C0441.m8605(sb2));
            C0323.m6245(httpURLConnection, true);
            OutputStream outputStreamM5841 = C0304.m5841(httpURLConnection);
            String strM2520 = C0131.m2520(this);
            byte[] bArrM2269 = C0118.m2269(this);
            try {
                C0189.m3608(outputStreamM5841);
                Charset charsetM8816 = C0453.m8816();
                Writer outputStreamWriter = new OutputStreamWriter(outputStreamM5841, charsetM8816);
                boolean z10 = outputStreamWriter instanceof BufferedWriter;
                int i12 = C0203.f227 ^ (-8219);
                int i13 = 1616;
                while (true) {
                    i13 ^= 1633;
                    switch (i13) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i13 = z10 ? 1709 : 1678;
                            break;
                        case 204:
                            bufferedWriter = (BufferedWriter) outputStreamWriter;
                            int i14 = 1740;
                            while (true) {
                                i14 ^= 1757;
                                switch (i14) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i14 = 1771;
                                        continue;
                                    case 54:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            bufferedWriter = new BufferedWriter(outputStreamWriter, i12);
                            break;
                        default:
                            break;
                    }
                }
                StringBuilder sb3 = new StringBuilder(strM732);
                C0142.m2728(sb3, strM8605);
                C0142.m2728(sb3, strM114);
                C0288.m5541(bufferedWriter, C0441.m8605(sb3));
                C0288.m5541(bufferedWriter, C0465.m9053(m142(), 173, C0373.f643 ^ (-502), 1989));
                StringBuilder sb4 = new StringBuilder();
                C0142.m2728(sb4, strM2520);
                C0142.m2728(sb4, strM114);
                C0288.m5541(bufferedWriter, C0441.m8605(sb4));
                StringBuilder sb5 = new StringBuilder(strM732);
                C0142.m2728(sb5, strM8605);
                C0142.m2728(sb5, strM114);
                C0288.m5541(bufferedWriter, C0441.m8605(sb5));
                C0288.m5541(bufferedWriter, C0078.m1682(m142(), 219, C0398.f668 ^ 668, 3123));
                C0288.m5541(bufferedWriter, C0300.m5767(m142(), 287, C0493.f766 ^ (-820), 836));
                C0383.m7490(bufferedWriter);
                C0492.m9559(outputStreamM5841, bArrM2269);
                C0442.m8627(outputStreamM5841);
                StringBuilder sb6 = new StringBuilder(strM2502);
                C0142.m2728(sb6, strM8605);
                C0142.m2728(sb6, C0084.m1805(m142(), 315, C0493.f766 ^ (-812), 1598));
                C0288.m5541(bufferedWriter, C0441.m8605(sb6));
                C0383.m7490(bufferedWriter);
                C0430.m8414(outputStreamM5841, null);
                InputStream inputStreamM59 = C0003.m59(httpURLConnection);
                C0336.m6501(inputStreamM59, C0107.m2074(m142(), 319, C0147.f172 ^ 956, 1767));
                Reader inputStreamReader = new InputStreamReader(inputStreamM59, charsetM8816);
                boolean z11 = inputStreamReader instanceof BufferedReader;
                int i15 = 48767;
                while (true) {
                    i15 ^= 48784;
                    switch (i15) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            bufferedReader = new BufferedReader(inputStreamReader, i12);
                            break;
                        case 76:
                            bufferedReader = (BufferedReader) inputStreamReader;
                            int i16 = 48891;
                            while (true) {
                                i16 ^= 48908;
                                switch (i16) {
                                    case 22:
                                        break;
                                    case 503:
                                        i16 = 48922;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            i15 = z11 ? 48860 : 48829;
                            break;
                        default:
                            break;
                    }
                }
                String strM391 = C0019.m391(bufferedReader);
                C0321.m6209(httpURLConnection);
                JSONObject jSONObject = new JSONObject(strM391);
                boolean zM3949 = C0207.m3949(jSONObject, C0013.m257(m142(), 338, C0293.f440 ^ 40, 1261), false);
                int i17 = 49790;
                while (true) {
                    i17 ^= 49807;
                    switch (i17) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            objM3728 = C0195.m3728(new Exception(C0225.m4327(jSONObject, C0169.m3243(m142(), 353, C0288.f432 ^ (-538), 1022), C0448.m8719(m142(), 358, C0207.f231 ^ (-616), 2396))));
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
                            break;
                        case 84:
                            objM3728 = C0225.m4327(jSONObject, C0072.m1553(m142(), 345, C0422.f692 ^ (-279), 738), C0440.m8581());
                            int i19 = 49914;
                            while (true) {
                                i19 ^= 49931;
                                switch (i19) {
                                    case 497:
                                        i19 = 50596;
                                        continue;
                                    case 1711:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 241:
                            i17 = zM3949 ? 49883 : 49852;
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i20 = 1864;
                while (true) {
                    i20 ^= 1881;
                    switch (i20) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i20 = 48674;
                            continue;
                        case 47483:
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C0430.m8414(outputStreamM5841, th);
                                throw th2;
                            }
                        default:
                            continue;
                    }
                    i10 = 49666;
                    while (true) {
                        i10 ^= 49683;
                        switch (i10) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i10 = 49697;
                                continue;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                String strM4049 = C0213.m4049(e);
                                StringBuilder sb7 = new StringBuilder(C0011.m221(m142(), 371, C0025.f45 ^ 112, 1533));
                                C0142.m2728(sb7, strM4049);
                                C0441.m8605(sb7);
                                C0159.m3045(m142(), 397, C0338.f608 ^ 224, 2679);
                                objM3728 = C0195.m3728(e);
                                break;
                            default:
                                continue;
                                continue;
                        }
                        return new q8.h(objM3728);
                    }
                }
            }
        } catch (Exception e4) {
            i10 = 49666;
            while (true) {
                i10 ^= 49683;
                switch (i10) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i10 = 49697;
                        continue;
                        continue;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        String strM40410 = C0213.m4049(e4);
                        StringBuilder sb8 = new StringBuilder(C0011.m221(m142(), 371, C0025.f45 ^ 112, 1533));
                        C0142.m2728(sb8, strM40410);
                        C0441.m8605(sb8);
                        C0159.m3045(m142(), 397, C0338.f608 ^ 224, 2679);
                        objM3728 = C0195.m3728(e4);
                        break;
                    default:
                        continue;
                        continue;
                }
            }
        }
        return new q8.h(objM3728);
    }
}
