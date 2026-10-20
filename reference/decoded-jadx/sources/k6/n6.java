package k6;

import a0.C0003;
import a8.C0010;
import aa.C0011;
import android.os.RemoteException;
import android.support.v4.app.C0015;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.input.key.C0033;
import androidx.core.content.C0041;
import androidx.fragment.app.C0042;
import b.C0049;
import b7.C0054;
import c0.C0057;
import c1.C0061;
import c3.C0062;
import c4.C0064;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.emulators.C0140;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.gson.internal.sql.C0208;
import d1.C0211;
import d2.C0215;
import d7.C0220;
import d9.C0225;
import dagger.hilt.C0255;
import dagger.hilt.android.C0240;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.processedrootsentinel.C0251;
import e1.C0257;
import e1.C0259;
import e2.C0260;
import f.C0270;
import f0.C0272;
import f4.C0275;
import f6.C0277;
import fa.C0281;
import h3.C0303;
import h7.C0310;
import h8.C0314;
import i6.C0320;
import ia.C0322;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k2.C0333;
import k3.C0335;
import l2.C0341;
import l3.C0342;
import l9.C0347;
import m7.C0357;
import o4.C0369;
import okhttp3.internal.publicsuffix.C0372;
import p3.C0375;
import r2.C0395;
import s0.C0409;
import s6.C0413;
import t1.C0419;
import t2.C0422;
import t2.C0423;
import v5.C0444;
import w0.C0454;
import w4.C0460;
import z.C0481;
import z7.C0488;
import z8.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class n6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f567short = {556, 616, 609, 611, 613, 615, 637, 557, 548, 578, 613, 621, 616, 609, 608, 548, 624, 619, 548, 611, 609, 624, 548, 615, 619, 618, 608, 621, 624, 621, 619, 618, 613, 616, 548, 628, 630, 619, 628, 609, 630, 624, 621, 609, 631, 575, 548, 618, 619, 624, 548, 615, 619, 618, 618, 609, 615, 624, 609, 608, 548, 624, 619, 548, 631, 609, 630, 626, 621, 615, 609, 2379, 2319, 2310, 2308, 2306, 2304, 2330, 2378, 2371, 2341, 2306, 2314, 2319, 2310, 2311, 2371, 2327, 2316, 2371, 2308, 2310, 2327, 2371, 2304, 2316, 2317, 2311, 2314, 2327, 2314, 2316, 2317, 2306, 2319, 2371, 2323, 2321, 2316, 2323, 2310, 2321, 2327, 2314, 2310, 2320, 2392, 2371, 2321, 2310, 2318, 2316, 2327, 2310, 2371, 2310, 2331, 2304, 2310, 2323, 2327, 2314, 2316, 2317, 2671, 2648, 2648, 2629, 2648, 2570, 2633, 2630, 2629, 2649, 2627, 2628, 2637, 2570, 2658, 2686, 2686, 2682, 2570, 2633, 2629, 2631, 2650, 2648, 2639, 2649, 2649, 2639, 2638, 2570, 2682, 2661, 2681, 2686, 2570, 2633, 2629, 2628, 2628, 2639, 2633, 2654, 2627, 2629, 2628, 2570, 2629, 2655, 2654, 2650, 2655, 2654, 2570, 2649, 2654, 2648, 2639, 2635, 2631, 2564, 2570, 2635, 2650, 2650, 2659, 2638, 2668, 2659, 2662, 2666, 2657, 2683, 2594, 2658, 2666, 2670, 2684, 2682, 2685, 2666, 2658, 2666, 2657, 2683, 3103, 3130, 3110, 3109, 3115, 3118, 3107, 3108, 3117, 3178, 3118, 3115, 3134, 3115, 3172, 3178, 3129, 3107, 3120, 3119, 3027, 3071, 3070, 3044, 3061, 3070, 3044, 3005, 3029, 3070, 3059, 3071, 3060, 3065, 3070, 3063, 1327, 1330, 1313, 1336, 1792, 1831, 1839, 1834, 1827, 1826, 1894, 1842, 1833, 1894, 1833, 1828, 1842, 1831, 1839, 1832, 1894, 1806, 1810, 1810, 1814, 1894, 1829, 1833, 1832, 1832, 1827, 1829, 1842, 1839, 1833, 1832, 1373, 1362, 1367, 1371, 1360, 1354, 1299, 1363, 1371, 1375, 1357, 1355, 1356, 1371, 1363, 1371, 1360, 1354, 1033, 1070, 1062, 1059, 1066, 1067, 1135, 1083, 1056, 1135, 1056, 1069, 1083, 1070, 1062, 1057, 1135, 1031, 1051, 1051, 1055, 1135, 1068, 1056, 1057, 1057, 1066, 1068, 1083, 1062, 1056, 1057};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f10230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f10231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10234f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f4.y f10235n;

    /* JADX WARN: Multi-variable type inference failed */
    public n6(j4 j4Var, String str, URL url, byte[] bArr, Map map, i4 i4Var) {
        this.f10229a = 1;
        this.f10235n = j4Var;
        C0281.m5438(str);
        this.f10230b = url;
        this.f10231c = bArr;
        this.f10234f = i4Var;
        this.f10232d = str;
        this.f10233e = map;
        int iM2386 = C0124.m2386();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2386 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0255.m4875("8nu8EHps9FnbLYYEabNpHB")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public n6(l6 l6Var, String str, URL url, g5 g5Var) {
        this.f10229a = 0;
        this.f10235n = l6Var;
        C0281.m5438(str);
        this.f10230b = url;
        this.f10231c = null;
        this.f10234f = g5Var;
        this.f10232d = str;
        this.f10233e = null;
        int iM8294 = C0422.m8294();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8294 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0444.m8663("ZsF1ibnjA0i")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public n6(s6 s6Var, AtomicReference atomicReference, String str, String str2, x7 x7Var) {
        this.f10229a = 2;
        this.f10235n = s6Var;
        this.f10230b = atomicReference;
        this.f10232d = null;
        this.f10231c = str;
        this.f10234f = str2;
        this.f10233e = x7Var;
        int iM8037 = C0409.m8037();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8037 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0275.m5304("7aR")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6579() {
        int iM3841 = C0200.m3841();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3841 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f567short;
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

    public final void a(int i10, IOException iOException, byte[] bArr, Map map) {
        String str = "\u06e0\u06e6\u06e6";
        f4.y yVarM828 = null;
        z4 z4VarM3979 = null;
        m6 m6Var = null;
        l6 l6Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56568:
                    m6Var.f10209b = i10;
                    str = "\u06e7\u06e2\u06df";
                    break;
                case 1746882:
                    str = "\u06e7\u06e1\u06e6";
                    l6Var = (l6) yVarM828;
                    break;
                case 1747872:
                    yVarM828 = C0042.m828(this);
                    str = "\u06df\u06e5\u06e8";
                    break;
                case 1749698:
                    return;
                case 1751617:
                    C0342.m6719(z4VarM3979, m6Var);
                    str = "\u06e2\u06e3\u06e3";
                    break;
                case 1754444:
                    str = "\u06e7\u06e7\u06e4";
                    z4VarM3979 = C0208.m3979(l6Var);
                    break;
                case 1754468:
                    m6Var.f10210c = iOException;
                    str = "\u06e8\u06e7\u06e4";
                    break;
                case 1754628:
                    str = "\u06e8\u06e2\u06e5";
                    m6Var = new m6();
                    break;
                case 1755589:
                    m6Var.f10211d = bArr;
                    str = "\u06e4\u06e3\u06e0";
                    break;
                default:
                    m6Var.f10208a = this;
                    str = "\u06e8\u06e0";
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:330:0x04c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x046f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x04d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x04d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x04e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x04c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x04d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x046a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x046a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x0270. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map mapM657;
        OutputStream outputStream;
        Map map;
        int i10;
        int i11;
        int i12;
        int i13;
        OutputStream outputStreamM5841;
        Map mapM658;
        Throwable th;
        int iM7261;
        int i14;
        int i15;
        int i16;
        int iM7262 = 0;
        IOException iOException = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (C0153.m2936(this)) {
            case 0:
                z4 z4VarM8666 = C0444.m8666((f5) C0163.m3121((l6) C0042.m828(this)));
                C0257.m4924(z4VarM8666);
                C0079.m1715(z4VarM8666);
                try {
                    URLConnection uRLConnectionM2316 = C0120.m2316(C0119.m2290(), (URL) C0180.m3443(this), C0395.m7741(m6579(), 290, C0064.f84 ^ (-945), 1342));
                    boolean z10 = uRLConnectionM2316 instanceof HttpURLConnection;
                    int i17 = 1509673;
                    while (true) {
                        i17 ^= 1509690;
                        switch (i17) {
                            case 19:
                                i17 = z10 ? 1510417 : 1510386;
                                break;
                            case 712:
                                throw new IOException(C0341.m6689(m6579(), 308, C0147.f172 ^ 911, 1103));
                            case 745:
                                break;
                            case 1323:
                                httpURLConnection = (HttpURLConnection) uRLConnectionM2316;
                                C0061.m1173(httpURLConnection, false);
                                C0333.m6475(httpURLConnection, 60000);
                                C0062.m1177(httpURLConnection, 61000);
                                C0259.m4957(httpURLConnection, false);
                                C0423.m8306(httpURLConnection, true);
                                try {
                                    iM7262 = C0369.m7261(httpURLConnection);
                                    mapM657 = C0033.m657(httpURLConnection);
                                    try {
                                        byte[] bArrM4813 = C0251.m4813(httpURLConnection);
                                        C0320.m6209(httpURLConnection);
                                        C0079.m1704(this, iM7262, null, bArrM4813, mapM657);
                                        int i18 = 1510448;
                                        while (true) {
                                            i18 ^= 1510465;
                                            switch (i18) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    return;
                                                case 113:
                                                    i18 = 1510479;
                                                    break;
                                            }
                                        }
                                    } catch (IOException e4) {
                                        e = e4;
                                        int i19 = 1511347;
                                        while (true) {
                                            i19 ^= 1511364;
                                            switch (i19) {
                                                case 22:
                                                    break;
                                                case 119:
                                                    i19 = 1511378;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                            int i20 = 1513393;
                                            while (true) {
                                                i20 ^= 1513410;
                                                switch (i20) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 115:
                                                        i20 = httpURLConnection != null ? 1513486 : 1513455;
                                                        break;
                                                    case 4044:
                                                        C0320.m6209(httpURLConnection);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0079.m1704(this, iM7262, e, null, mapM657);
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        int i21 = 1510572;
                                        while (true) {
                                            i21 ^= 1510589;
                                            switch (i21) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i21 = 1510603;
                                                    continue;
                                                case 118:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            int i22 = 1513269;
                                            while (true) {
                                                i22 ^= 1513286;
                                                switch (i22) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 115:
                                                        i22 = httpURLConnection != null ? 1513362 : 1513331;
                                                        break;
                                                    case 212:
                                                        C0320.m6209(httpURLConnection);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0079.m1704(this, iM7262, null, null, mapM657);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    int i23 = 1511595;
                                    while (true) {
                                        i23 ^= 1511612;
                                        switch (i23) {
                                            case 23:
                                                i23 = 1512277;
                                                continue;
                                            case 1001:
                                                mapM657 = null;
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    int i24 = 1511471;
                                    while (true) {
                                        i24 ^= 1511488;
                                        switch (i24) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                mapM657 = null;
                                                break;
                                            case 111:
                                                i24 = 1511502;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                    int i25 = 1512494;
                    while (true) {
                        i25 ^= 1512511;
                        switch (i25) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i25 = 1512525;
                                continue;
                            case 114:
                                httpURLConnection = null;
                                mapM657 = null;
                                break;
                            default:
                                continue;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    int i26 = 1512370;
                    while (true) {
                        i26 ^= 1512387;
                        switch (i26) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                httpURLConnection = null;
                                mapM657 = null;
                                break;
                            case 113:
                                i26 = 1512401;
                                continue;
                            default:
                                continue;
                        }
                    }
                }
                break;
            case 1:
                String strM521 = C0027.m521(this);
                String strM2617 = C0136.m2617(m6579(), 134, C0277.f422 ^ (-500), 2602);
                Serializable serializableM963 = C0049.m963(this);
                Object objM4518 = C0234.m4518(this);
                f4.y yVarM828 = C0042.m828(this);
                j4 j4Var = (j4) yVarM828;
                Object objM8666 = C0444.m8666((f5) C0163.m3121(j4Var));
                C0257.m4924(objM8666);
                C0079.m1715(objM8666);
                try {
                    try {
                        try {
                            URLConnection uRLConnectionM2317 = C0120.m2316(C0119.m2290(), (URL) C0180.m3443(this), C0011.m221(m6579(), 200, C0211.f235 ^ 568, 2575));
                            boolean z11 = uRLConnectionM2317 instanceof HttpURLConnection;
                            int i27 = 50813;
                            while (true) {
                                i27 ^= 50830;
                                switch (i27) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        throw new IOException(C0395.m7741(m6579(), 258, C0141.f167 ^ 130, 1862));
                                    case 243:
                                        i27 = z11 ? 51557 : 50875;
                                        break;
                                    case 4075:
                                        objM8666 = (HttpURLConnection) uRLConnectionM2317;
                                        C0061.m1173(objM8666, false);
                                        C0333.m6475(objM8666, 60000);
                                        C0062.m1177(objM8666, 61000);
                                        C0259.m4957(objM8666, false);
                                        C0423.m8306(objM8666, true);
                                        Object objM9377 = C0481.m9377(this);
                                        Map map2 = (Map) objM9377;
                                        int i28 = 51588;
                                        while (true) {
                                            i28 ^= 51605;
                                            switch (i28) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i28 = map2 != null ? 51681 : 51650;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    break;
                                                case 116:
                                                    Iterator itM5256 = C0272.m5256(C0347.m6792((Map) objM9377));
                                                    while (true) {
                                                        boolean zM3327 = C0174.m3327(itM5256);
                                                        int i29 = 51712;
                                                        while (true) {
                                                            i29 ^= 51729;
                                                            switch (i29) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i29 = zM3327 ? 51805 : 51774;
                                                                    break;
                                                                case 47:
                                                                    break;
                                                                case 76:
                                                                    Map.Entry entry = (Map.Entry) C0413.m8115(itM5256);
                                                                    C0251.m4809(objM8666, (String) C0314.m6097(entry), (String) C0240.m4610(entry));
                                                                    int i30 = 51836;
                                                                    while (true) {
                                                                        i30 ^= 51853;
                                                                        switch (i30) {
                                                                            case 241:
                                                                                i30 = 52518;
                                                                                break;
                                                                            case 1963:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        byte[] bArr = (byte[]) serializableM963;
                                        int i31 = 53510;
                                        while (true) {
                                            i31 ^= 53527;
                                            switch (i31) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i31 = bArr != null ? 53603 : 53572;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    break;
                                                case 116:
                                                    byte[] bArrM3632 = C0190.m3632(C0041.m810((j4) yVarM828), (byte[]) serializableM963);
                                                    C0419.m8245(C0136.m2634(C0029.m572((j4) yVarM828)), C0003.m65(m6579(), 218, C0054.f74 ^ 346, 3146), C0057.m1083(bArrM3632.length));
                                                    C0322.m6245(objM8666, true);
                                                    C0251.m4809(objM8666, C0372.m7300(m6579(), 238, C0488.f762 ^ (-348), 2960), C0166.m3169(m6579(), 254, C0375.f646 ^ (-125), 1352));
                                                    C0335.m6497(objM8666, bArrM3632.length);
                                                    C0196.m3760(objM8666);
                                                    outputStreamM5841 = C0303.m5841(objM8666);
                                                    try {
                                                        C0491.m9559(outputStreamM5841, bArrM3632);
                                                        C0220.m4253(outputStreamM5841);
                                                        int i32 = 53634;
                                                        while (true) {
                                                            i32 ^= 53651;
                                                            switch (i32) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i32 = 53665;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                    } catch (IOException e12) {
                                                        e = e12;
                                                        int i33 = 54533;
                                                        while (true) {
                                                            i33 ^= 54550;
                                                            switch (i33) {
                                                                case 19:
                                                                    i33 = 54564;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    outputStream = outputStreamM5841;
                                                                    map = null;
                                                                    i10 = 0;
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i11 = 1508650;
                                                            while (true) {
                                                                i11 ^= 1508667;
                                                                switch (i11) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i11 = outputStream != null ? 1509394 : 1508712;
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 3369:
                                                                        try {
                                                                            C0220.m4253(outputStream);
                                                                            i13 = 1509425;
                                                                            while (true) {
                                                                                i13 ^= 1509442;
                                                                                switch (i13) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 115:
                                                                                        i13 = 1509456;
                                                                                        continue;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                        } catch (IOException e13) {
                                                                            C0112.m2169(C0454.m8871(C0029.m572(j4Var)), strM2617, C0027.m535(strM521), e13);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i12 = 1509549;
                                                            while (true) {
                                                                i12 ^= 1509566;
                                                                switch (i12) {
                                                                    case 19:
                                                                        i12 = objM8666 != null ? 1509642 : 1509611;
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 436:
                                                                        C0320.m6209(objM8666);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0342.m6719(C0208.m3979(j4Var), new androidx.fragment.app.n1(C0027.m521(this), (i4) objM4518, i10, e, objArr3 == true ? 1 : 0, map));
                                                            return;
                                                        }
                                                    } catch (Throwable th5) {
                                                        int i34 = 53758;
                                                        while (true) {
                                                            i34 ^= 53775;
                                                            switch (i34) {
                                                                case 1009:
                                                                    i34 = 54440;
                                                                    continue;
                                                                case 1703:
                                                                    mapM658 = null;
                                                                    th = th5;
                                                                    iM7261 = 0;
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 1507627;
                                                            while (true) {
                                                                i14 ^= 1507644;
                                                                switch (i14) {
                                                                    case 23:
                                                                        i14 = outputStreamM5841 != null ? 1507720 : 1507689;
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 118:
                                                                        break;
                                                                    case 180:
                                                                        try {
                                                                            C0220.m4253(outputStreamM5841);
                                                                            i16 = 1507751;
                                                                            while (true) {
                                                                                i16 ^= 1507768;
                                                                                switch (i16) {
                                                                                    case 31:
                                                                                        i16 = 1508433;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 1513:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                        } catch (IOException e14) {
                                                                            C0112.m2169(C0454.m8871(C0029.m572(j4Var)), strM2617, C0027.m535(strM521), e14);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i15 = 1508526;
                                                            while (true) {
                                                                i15 ^= 1508543;
                                                                switch (i15) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i15 = objM8666 != null ? 1508619 : 1508588;
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 436:
                                                                        C0320.m6209(objM8666);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0342.m6719(C0208.m3979(j4Var), new androidx.fragment.app.n1(C0027.m521(this), (i4) objM4518, iM7261, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, mapM658));
                                                            throw th;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        iM7261 = C0369.m7261(objM8666);
                                        try {
                                            mapM658 = C0033.m657(objM8666);
                                            try {
                                                byte[] bArrM7014 = C0357.m7014(objM8666);
                                                C0320.m6209(objM8666);
                                                C0342.m6719(C0208.m3979(j4Var), new androidx.fragment.app.n1(C0027.m521(this), (i4) objM4518, iM7261, iOException, bArrM7014, mapM658));
                                                int i35 = 54657;
                                                while (true) {
                                                    i35 ^= 54674;
                                                    switch (i35) {
                                                        case 19:
                                                            i35 = 54688;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            return;
                                                    }
                                                }
                                            } catch (IOException e15) {
                                                e = e15;
                                                int i36 = 55556;
                                                while (true) {
                                                    i36 ^= 55573;
                                                    switch (i36) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i36 = 55587;
                                                            continue;
                                                        case 54:
                                                            outputStream = null;
                                                            map = mapM658;
                                                            e = e;
                                                            i10 = iM7261;
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i11 = 1508650;
                                                    while (true) {
                                                        i11 ^= 1508667;
                                                        switch (i11) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (outputStream != null) {
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 3369:
                                                                C0220.m4253(outputStream);
                                                                i13 = 1509425;
                                                                while (true) {
                                                                    i13 ^= 1509442;
                                                                    switch (i13) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 115:
                                                                            i13 = 1509456;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i12 = 1509549;
                                                    while (true) {
                                                        i12 ^= 1509566;
                                                        switch (i12) {
                                                            case 19:
                                                                if (objM8666 != null) {
                                                                }
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                C0320.m6209(objM8666);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0342.m6719(C0208.m3979(j4Var), new androidx.fragment.app.n1(C0027.m521(this), (i4) objM4518, i10, e, objArr3 == true ? 1 : 0, map));
                                                    return;
                                                }
                                            } catch (Throwable th6) {
                                                int i37 = 55432;
                                                while (true) {
                                                    i37 ^= 55449;
                                                    switch (i37) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i37 = 55463;
                                                            continue;
                                                        case 62:
                                                            outputStreamM5841 = null;
                                                            th = th6;
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i14 = 1507627;
                                                    while (true) {
                                                        i14 ^= 1507644;
                                                        switch (i14) {
                                                            case 23:
                                                                if (outputStreamM5841 != null) {
                                                                }
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 118:
                                                                break;
                                                            case 180:
                                                                C0220.m4253(outputStreamM5841);
                                                                i16 = 1507751;
                                                                while (true) {
                                                                    i16 ^= 1507768;
                                                                    switch (i16) {
                                                                        case 31:
                                                                            i16 = 1508433;
                                                                            continue;
                                                                            continue;
                                                                        case 1513:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i15 = 1508526;
                                                    while (true) {
                                                        i15 ^= 1508543;
                                                        switch (i15) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (objM8666 != null) {
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                C0320.m6209(objM8666);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0342.m6719(C0208.m3979(j4Var), new androidx.fragment.app.n1(C0027.m521(this), (i4) objM4518, iM7261, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, mapM658));
                                                    throw th;
                                                }
                                            }
                                        } catch (IOException e16) {
                                            e = e16;
                                            int i38 = 56455;
                                            while (true) {
                                                i38 ^= 56472;
                                                switch (i38) {
                                                    case 31:
                                                        i38 = 56486;
                                                        continue;
                                                    case 62:
                                                        mapM658 = null;
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            int i39 = 55680;
                                            while (true) {
                                                i39 ^= 55697;
                                                switch (i39) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i39 = 56362;
                                                        continue;
                                                    case 1467:
                                                        outputStreamM5841 = null;
                                                        mapM658 = null;
                                                        th = th7;
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } catch (Throwable th8) {
                            int i40 = 52611;
                            while (true) {
                                i40 ^= 52628;
                                switch (i40) {
                                    case 23:
                                        i40 = 52642;
                                        continue;
                                    case 54:
                                        outputStreamM5841 = null;
                                        mapM658 = null;
                                        th = th8;
                                        iM7261 = 0;
                                        break;
                                    default:
                                        continue;
                                }
                            }
                        }
                    } catch (IOException e17) {
                        e = e17;
                        int i41 = 1507503;
                        while (true) {
                            i41 ^= 1507520;
                            switch (i41) {
                                case Code.UNAVAILABLE /* 14 */:
                                    outputStream = null;
                                    objM8666 = null;
                                    map = null;
                                    i10 = 0;
                                    break;
                                case 111:
                                    i41 = 1507534;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    } catch (Throwable th9) {
                        int i42 = 56579;
                        while (true) {
                            i42 ^= 56596;
                            switch (i42) {
                                case 23:
                                    i42 = 56610;
                                    continue;
                                case 54:
                                    outputStreamM5841 = null;
                                    objM8666 = null;
                                    mapM658 = null;
                                    th = th9;
                                    iM7261 = 0;
                                    break;
                                default:
                                    continue;
                            }
                        }
                    }
                } catch (IOException e18) {
                    e = e18;
                    int i43 = 52735;
                    while (true) {
                        i43 ^= 52752;
                        switch (i43) {
                            case Code.UNAVAILABLE /* 14 */:
                                outputStream = null;
                                map = null;
                                i10 = 0;
                                break;
                            case 1007:
                                i43 = 52766;
                                continue;
                            default:
                                continue;
                        }
                    }
                }
                break;
            default:
                synchronized (((AtomicReference) C0180.m3443(this))) {
                    try {
                        try {
                            try {
                                f4.y yVarM829 = C0042.m828(this);
                                y3 y3VarM2387 = C0124.m2387((s6) yVarM829);
                                int i44 = 1616;
                                while (true) {
                                    i44 ^= 1633;
                                    switch (i44) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 49:
                                            if (y3VarM2387 == null) {
                                                i44 = 1709;
                                            }
                                            break;
                                        case 204:
                                            C0237.m4564(C0454.m8871(C0029.m572((s6) yVarM829)), C0460.m8963(m6579(), 0, C0215.f239 ^ (-863), 516), C0027.m535(C0027.m521(this)), (String) C0049.m963(this), (String) C0234.m4518(this));
                                            C0225.m4329((AtomicReference) C0180.m3443(this), C0160.m3062());
                                            C0123.m2376((AtomicReference) C0180.m3443(this));
                                            int i45 = 1740;
                                            while (true) {
                                                i45 ^= 1757;
                                                switch (i45) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i45 = 1771;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            boolean zM1883 = C0088.m1883(C0027.m521(this));
                                            int i46 = 49666;
                                            while (true) {
                                                i46 ^= 49683;
                                                switch (i46) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i46 = zM1883 ? 49759 : 49728;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0270.m5173((x7) C0481.m9377(this));
                                                        C0225.m4329((AtomicReference) C0180.m3443(this), C0015.m292(y3VarM2387, (String) C0049.m963(this), (String) C0234.m4518(this), (x7) C0481.m9377(this)));
                                                        int i47 = 49790;
                                                        while (true) {
                                                            i47 ^= 49807;
                                                            switch (i47) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 241:
                                                                    i47 = 49821;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        C0225.m4329((AtomicReference) C0180.m3443(this), C0140.m2701(y3VarM2387, C0027.m521(this), (String) C0049.m963(this), (String) C0234.m4518(this)));
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0310.m6011((s6) C0042.m828(this));
                                            C0123.m2376((AtomicReference) C0180.m3443(this));
                                            int i48 = 49914;
                                            while (true) {
                                                i48 ^= 49931;
                                                switch (i48) {
                                                    case 497:
                                                        i48 = 50596;
                                                        break;
                                                    case 1711:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i44 = 1678;
                                }
                            } catch (RemoteException e19) {
                                int i49 = 48891;
                                while (true) {
                                    i49 ^= 48908;
                                    switch (i49) {
                                        case 22:
                                            C0237.m4564(C0454.m8871(C0029.m572((s6) C0042.m828(this))), C0260.m4969(m6579(), 71, C0409.f680 ^ (-439), 2403), C0027.m535(C0027.m521(this)), (String) C0049.m963(this), e19);
                                            C0225.m4329((AtomicReference) C0180.m3443(this), C0160.m3062());
                                            C0123.m2376((AtomicReference) C0180.m3443(this));
                                            break;
                                        case 503:
                                            i49 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                            }
                        } catch (Throwable th10) {
                            int i50 = 48767;
                            while (true) {
                                i50 ^= 48784;
                                switch (i50) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        C0123.m2376((AtomicReference) C0180.m3443(this));
                                        throw th10;
                                    case 239:
                                        i50 = 48798;
                                        break;
                                }
                            }
                        }
                    } catch (Throwable th11) {
                        int i51 = 1864;
                        while (true) {
                            i51 ^= 1881;
                            switch (i51) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i51 = 48674;
                                    break;
                                case 47483:
                                    throw th11;
                            }
                        }
                    }
                }
                int iM1758 = C0082.m1758();
                int i52 = 50689;
                while (true) {
                    i52 ^= 50706;
                    switch (i52) {
                        case 19:
                            if (iM1758 <= 0) {
                                i52 = 50782;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            return;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            System.out.println(Long.parseLong(C0010.m204("hNYZGSGQq9pno")));
                            return;
                        default:
                            continue;
                    }
                    i52 = 50751;
                }
                break;
        }
    }
}
