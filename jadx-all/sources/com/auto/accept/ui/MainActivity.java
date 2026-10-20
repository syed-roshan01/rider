package com.auto.accept.ui;

import a.C0000;
import a.C0001;
import a3.C0006;
import a8.C0009;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.l0;
import androidx.activity.m0;
import androidx.activity.t;
import androidx.activity.v;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.draw.C0028;
import androidx.lifecycle.g1;
import androidx.lifecycle.w;
import androidx.lifecycle.y0;
import b.C0049;
import c1.C0059;
import c3.C0062;
import c5.e;
import c5.f;
import c5.g;
import c5.h;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import d2.C0216;
import d9.C0224;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.migration.C0240;
import f1.C0274;
import g0.C0286;
import g2.C0288;
import h0.C0300;
import h4.C0305;
import i.C0316;
import j6.C0329;
import k3.C0336;
import l0.C0341;
import l8.C0347;
import m7.C0358;
import n9.C0367;
import o5.C0371;
import o7.i2;
import okhttp3.internal.publicsuffix.C0373;
import p0.C0375;
import p7.C0379;
import q6.C0388;
import q6.C0389;
import r2.C0397;
import r6.C0402;
import r9.C0406;
import s2.C0412;
import t2.C0424;
import u.r0;
import u0.b;
import u1.r1;
import v.C0440;
import v0.C0441;
import v6.C0447;
import v8.C0451;
import w.C0454;
import x5.C0471;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
@AndroidEntryPoint
public final class MainActivity extends e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3077n = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f105short = {425, 439, 432, 442, 433, 425, 496, 442, 443, 445, 433, 428, 392, 439, 443, 425, 2812, 2787, 2799, 2813, 2724, 2808, 2799, 2809, 2789, 2815, 2808, 2793, 2799, 2809, 1090, 1116, 1115, 1105, 1114, 1090, 2302, 2282, 2301, 2301, 2274, 2301, 2279, 2300, 2301, 2298, 2285, 2303, 9732, -1030, 1493, 1434, 1435, 1447, 1424, 1414, 1408, 1432, 1424, 1493, 1446, 1441, 1460, 1447, 1441, 9963, -1259, 1338, 1401, 1394, 1407, 1401, 1393, 1354, 1407, 1384, 1399, 1395, 1385, 1385, 1395, 1397, 1396, 1385, 1338, 1390, 1397, 1397, 1393, 1338, 3279, 3281, 8772, -70, 405, 455, 464, 470, 477, 464, 470, 478, 499, 474, 455, 480, 453, 465, 468, 449, 464, 499, 455, 474, 472, 502, 468, 470, 477, 464, 405, 449, 474, 474, 478, 405, 10202, -1500, 1035, 1113, 1102, 1096, 1091, 1102, 1096, 1088, 1150, 1112, 1102, 1113, 1144, 1119, 1098, 1119, 1118, 1112, 1035, 1135, 1122, 1144, 1147, 1130, 1151, 1128, 1123, 1134, 1135, 1035, 1090, 1093, 1035, 8817, -113, 416, 495, 494, 466, 485, 499, 501, 493, 485, 416, 468, 463, 468, 449, 460, 442, 416};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f3078e = new y0(C0274.m5265(MainViewModel.class), new h(this, 1), new h(this, 0), new r0(C0486.f759 ^ 39, null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f3079f = new f(this);

    public MainActivity() {
        int iM4495 = C0234.m4495();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4495 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0288.m5524("X05nPYyefEXirpOA7Td9Gff")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m1569() {
        int iM8066 = C0412.m8066();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8066 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f105short;
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

    @Override // c5.e, androidx.activity.p, q2.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object tVar;
        r1 r1Var;
        int i10 = 1;
        super.onCreate(bundle);
        C0001.m36();
        C0305.m5874();
        l0 l0VarM110 = C0006.m110();
        m0 m0Var = new m0(0, 0, l0VarM110);
        m0 m0Var2 = new m0(C0001.m36(), C0049.m960(), l0VarM110);
        View viewM7403 = C0379.m7403(C0123.m2364(this));
        C0336.m6501(viewM7403, C0347.m6770(m1569(), 0, C0028.f48 ^ 363, 478));
        Resources resourcesM2706 = C0141.m2706(viewM7403);
        String strM2920 = C0152.m2920(m1569(), 16, C0375.f645 ^ (-776), 2698);
        C0336.m6501(resourcesM2706, strM2920);
        boolean zM14 = C0000.m14((Boolean) C0224.m4297(l0VarM110, resourcesM2706));
        Resources resourcesM2707 = C0141.m2706(viewM7403);
        C0336.m6501(resourcesM2707, strM2920);
        boolean zM15 = C0000.m14((Boolean) C0224.m4297(l0VarM110, resourcesM2707));
        int iM7181 = C0367.m7181();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = iM7181 >= 29 ? 1709 : 1678;
                    break;
                case 204:
                    tVar = new v();
                    break;
                case 239:
                    tVar = new t();
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = 48674;
                                continue;
                            case 47483:
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
        int i13 = 1740;
        while (true) {
            i13 ^= 1757;
            switch (i13) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i13 = 1771;
                    break;
                case 54:
                    Window windowM2364 = C0123.m2364(this);
                    C0336.m6501(windowM2364, C0127.m2451(m1569(), 30, C0080.f114 ^ (-602), 1077));
                    C0049.m950(tVar, m0Var, m0Var2, windowM2364, viewM7403, zM14, zM15);
                    try {
                        f fVarM1878 = C0088.m1878(this);
                        synchronized (C0009.m188()) {
                            C0358.m6998(C0316.m6104(), new la.f(fVarM1878));
                            break;
                        }
                        int i14 = 48767;
                        while (true) {
                            i14 ^= 48784;
                            switch (i14) {
                                case Code.UNAVAILABLE /* 14 */:
                                    b bVar = new b(1236655676 ^ C0216.f239, new g(this, i10), true);
                                    C0397.m7745();
                                    View viewM7316 = C0373.m7316((ViewGroup) C0189.m3598(C0379.m7403(C0123.m2364(this)), 16909234 ^ C0168.f192), 0);
                                    boolean z10 = viewM7316 instanceof r1;
                                    int i15 = 48891;
                                    while (true) {
                                        i15 ^= 48908;
                                        switch (i15) {
                                            case 22:
                                                break;
                                            case 53:
                                                r1Var = null;
                                                break;
                                            case 503:
                                                i15 = z10 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                r1Var = (r1) viewM7316;
                                                int i16 = 49666;
                                                while (true) {
                                                    i16 ^= 49683;
                                                    switch (i16) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i16 = 49697;
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
                                    int i17 = 49790;
                                    while (true) {
                                        i17 ^= 49807;
                                        switch (i17) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                r1 r1Var2 = new r1(this);
                                                C0112.m2161(r1Var2, null);
                                                C0389.m7615(r1Var2, bVar);
                                                View viewM7404 = C0379.m7403(C0123.m2364(this));
                                                w wVarM5495 = C0286.m5495(viewM7404);
                                                int i18 = 50689;
                                                while (true) {
                                                    i18 ^= 50706;
                                                    switch (i18) {
                                                        case 19:
                                                            i18 = wVarM5495 == null ? 50782 : 50751;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            C0274.m5276(viewM7404, this);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                g1 g1VarM8769 = C0451.m8769(viewM7404);
                                                int i19 = 50813;
                                                while (true) {
                                                    i19 ^= 50830;
                                                    switch (i19) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 243:
                                                            i19 = g1VarM8769 == null ? 51557 : 50875;
                                                            break;
                                                        case 4075:
                                                            C0454.m8850(viewM7404, this);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                b4.g gVarM8569 = C0440.m8569(viewM7404);
                                                int i20 = 51588;
                                                while (true) {
                                                    i20 ^= 51605;
                                                    switch (i20) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (gVarM8569 == null) {
                                                                i20 = 51681;
                                                            }
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            break;
                                                        case 116:
                                                            C0181.m3462(viewM7404, this);
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i20 = 51650;
                                                }
                                                C0152.m2922(this, r1Var2, C0397.m7745());
                                                return;
                                            case 84:
                                                C0112.m2161(r1Var, null);
                                                C0389.m7615(r1Var, bVar);
                                                int i21 = 49914;
                                                while (true) {
                                                    i21 ^= 49931;
                                                    switch (i21) {
                                                        case 497:
                                                            i21 = 50596;
                                                            break;
                                                        case 1711:
                                                            return;
                                                    }
                                                }
                                                break;
                                            case 241:
                                                if (r1Var != null) {
                                                    i17 = 49883;
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i17 = 49852;
                                    }
                                    break;
                                case 239:
                                    i14 = 48798;
                                    break;
                            }
                        }
                    } catch (Exception e4) {
                        int i22 = 51712;
                        while (true) {
                            i22 ^= 51729;
                            switch (i22) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i22 = 51743;
                                    break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    @Override // c5.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            f fVarM1878 = C0088.m1878(this);
            synchronized (C0009.m188()) {
                try {
                    C0388.m7581(C0316.m6104(), new b5.g(fVarM1878, 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        return;
                    case 49:
                        i10 = 1647;
                        break;
                }
            }
        } catch (Exception e4) {
            int i11 = 1740;
            while (true) {
                i11 ^= 1757;
                switch (i11) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i11 = 1771;
                        break;
                    case 54:
                        return;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        long jM7869 = C0402.m7869();
        C0424.m8301(m1569(), 36, C0083.f117 ^ (-773), 2232);
        C0471.m9159(m1569(), 48, C0447.f717 ^ (-61), 1525);
        y0 y0VarM310 = C0016.m310(this);
        C0015.m303((MainViewModel) C0059.m1138(y0VarM310));
        long jM78610 = C0402.m7869();
        StringBuilder sb = new StringBuilder(C0451.m8781(m1569(), 65, C0406.f676 ^ 73, 1306));
        C0341.m6676(sb, ((jM78610 - 29) - jM7869) + 29);
        String strM2577 = C0133.m2577(m1569(), 90, C0108.f134 ^ (-72), 3234);
        C0142.m2728(sb, strM2577);
        C0441.m8605(sb);
        long jM78611 = C0402.m7869();
        C0020.m413((MainViewModel) C0059.m1138(y0VarM310));
        long jM78612 = C0402.m7869();
        StringBuilder sb2 = new StringBuilder(C0300.m5767(m1569(), 92, C0240.f319 ^ 232, 437));
        C0341.m6676(sb2, ((jM78612 - 14) - jM78611) + 14);
        C0142.m2728(sb2, strM2577);
        C0441.m8605(sb2);
        long jM78613 = C0402.m7869();
        C0336.m6507((MainViewModel) C0059.m1138(y0VarM310));
        long jM78614 = C0402.m7869();
        StringBuilder sb3 = new StringBuilder(C0181.m3459(m1569(), 126, C0164.f188 ^ 446, 1067));
        C0341.m6676(sb3, ((jM78614 - 8) - jM78613) + 8);
        C0142.m2728(sb3, strM2577);
        C0441.m8605(sb3);
        long jM78615 = C0402.m7869();
        StringBuilder sb4 = new StringBuilder(C0014.m279(m1569(), 161, C0371.f641 ^ 777, 384));
        C0341.m6676(sb4, ((jM78615 + 5) - jM7869) - 5);
        C0142.m2728(sb4, strM2577);
        C0441.m8605(sb4);
        int iM6350 = C0329.m6350();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6350 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0062.m1201("Q13PFMbxSkXMv6Fylw7")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
