package k0;

import a8.C0010;
import android.os.C0013;
import android.support.v4.app.C0014;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.semantics.C0039;
import androidx.lifecycle.C0043;
import androidx.startup.C0047;
import b.C0049;
import b7.C0053;
import b7.C0054;
import c0.C0057;
import c1.C0058;
import c1.C0060;
import c4.C0066;
import c7.C0069;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0171;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.gson.internal.sql.C0208;
import d1.C0212;
import d3.C0217;
import d4.C0218;
import d9.C0224;
import d9.C0227;
import dagger.hilt.android.components.C0230;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.android.migration.C0240;
import dagger.hilt.internal.aliasof.C0248;
import dagger.hilt.internal.generatesrootinput.C0251;
import e2.C0261;
import e2.C0262;
import e2.C0263;
import e2.C0264;
import e9.C0267;
import ea.C0269;
import f.C0270;
import fa.C0281;
import g.C0283;
import g.C0285;
import g2.C0287;
import g3.C0289;
import g4.C0290;
import g5.C0291;
import h0.C0300;
import h1.C0301;
import h3.C0303;
import h5.C0307;
import h5.C0309;
import h6.C0310;
import h7.C0312;
import h7.C0313;
import i6.C0321;
import j9.C0330;
import l2.C0342;
import l3.C0343;
import l6.C0344;
import l9.C0348;
import la.C0349;
import m3.C0353;
import m5.C0356;
import m7.C0359;
import m9.C0360;
import n.C0362;
import p0.C0374;
import p0.C0375;
import p7.C0379;
import q0.C0383;
import q2.C0385;
import q6.C0388;
import q6.C0389;
import r.C0393;
import r1.C0394;
import r4.C0399;
import s0.C0411;
import s2.C0412;
import s6.C0414;
import s7.C0416;
import t2.C0422;
import t7.C0426;
import u.C0429;
import u2.C0434;
import v.C0440;
import v0.C0443;
import v7.C0449;
import v7.C0450;
import w2.C0458;
import w4.C0460;
import w5.C0464;
import x5.C0471;
import x7.C0473;
import y.C0476;
import y9.C0479;
import z.C0482;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0.o f8733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f8735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f8736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t.w f8737f;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f485short = {1213, 1164, 1183, 1164, 1152, 1160, 1177, 1160, 1183, 1182, 1229, 1177, 1154, 1229, 1198, 1176, 1167, 1156, 1166, 1199, 1160, 1175, 1156, 1160, 1183, 1192, 1164, 1182, 1156, 1155, 1162, 1229, 1166, 1164, 1155, 1155, 1154, 1177, 1229, 1167, 1160, 1229, 1187, 1164, 1187, 1219, 1229, 1196, 1166, 1177, 1176, 1164, 1153, 1229, 1181, 1164, 1183, 1164, 1152, 1160, 1177, 1160, 1183, 1182, 1229, 1164, 1183, 1160, 1239, 1229, 1245, 1219, 1244, 1217, 1229, 1245, 1219, 1245, 1217, 1229, 1245, 1219, 1241, 1240, 1217, 1229, 1244, 1219, 1245, 1219, 2326, 2343, 2356, 2343, 2347, 2339, 2354, 2339, 2356, 2357, 2406, 2354, 2345, 2406, 2309, 2355, 2340, 2351, 2341, 2308, 2339, 2364, 2351, 2339, 2356, 2307, 2343, 2357, 2351, 2344, 2337, 2406, 2341, 2343, 2344, 2344, 2345, 2354, 2406, 2340, 2339, 2406, 2312, 2343, 2312, 2408, 2406, 2311, 2341, 2354, 2355, 2343, 2346, 2406, 2358, 2343, 2356, 2343, 2347, 2339, 2354, 2339, 2356, 2357, 2406, 2343, 2356, 2339, 2428, 2406, 2422, 2408, 2422, 2410, 2406, 2422, 2408, 2422, 2410, 2406, 2422, 2408, 2416, 2419, 2410, 2406, 2423, 2408, 2422, 2408, 1631, 1646, 1661, 1646, 1634, 1642, 1659, 1642, 1661, 1660, 1583, 1659, 1632, 1583, 1612, 1658, 1645, 1638, 1644, 1613, 1642, 1653, 1638, 1642, 1661, 1610, 1646, 1660, 1638, 1633, 1640, 1583, 1644, 1646, 1633, 1633, 1632, 1659, 1583, 1645, 1642, 1583, 1601, 1646, 1601, 1569, 1583, 1614, 1644, 1659, 1658, 1646, 1635, 1583, 1663, 1646, 1661, 1646, 1634, 1642, 1659, 1642, 1661, 1660, 1583, 1646, 1661, 1642, 1589, 1583, 1599, 1569, 1595, 1571, 1583, 1599, 1569, 1599, 1571, 1583, 1598, 1569, 1599, 1571, 1583, 1598, 1569, 1599, 1569, 2505, 2552, 2539, 2552, 2548, 2556, 2541, 2556, 2539, 2538, 2489, 2541, 2550, 2489, 2522, 2540, 2555, 2544, 2554, 2523, 2556, 2531, 2544, 2556, 2539, 2524, 2552, 2538, 2544, 2551, 2558, 2489, 2554, 2552, 2551, 2551, 2550, 2541, 2489, 2555, 2556, 2489, 2519, 2552, 2519, 2487, 2489, 2520, 2554, 2541, 2540, 2552, 2549, 2489, 2537, 2552, 2539, 2552, 2548, 2556, 2541, 2556, 2539, 2538, 2489, 2552, 2539, 2556, 2467, 2489, 2473, 2487, 2475, 2485, 2489, 2473, 2487, 2473, 2485, 2489, 2473, 2487, 2465, 2485, 2489, 2472, 2487, 2473, 2487};

    static {
        float f10 = C0200.f224 ^ 316;
        f8732a = f10;
        f8733b = C0013.m245(C0039.m758(C0208.m3975(C0227.m4370(), C0231.m4424()), true, C0264.m5031()), 0.0f, f10, 1);
        f8734c = C0151.f176 ^ (-834);
        f8735d = C0411.m8061();
        f8736e = ((C0301.m5778() - 24.0f) - (C0375.m7349() * (C0388.f658 ^ (-894)))) + 24.0f;
        boolean zM6045 = C0313.m6045(0.2f);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM6045 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM6046 = C0313.m6045(0.0f);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM6046 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM6047 = C0313.m6045(0.8f);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = !zM6047 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zM6048 = C0313.m6045(1.0f);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 76:
                                                        boolean zM6049 = C0313.m6045(0.4f);
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i14 = !zM6049 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    boolean zM60410 = C0313.m6045(0.0f);
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i15 = !zM60410 ? 49759 : 49728;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                boolean zM60411 = C0313.m6045(1.0f);
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 84:
                                                                                            boolean zM60412 = C0313.m6045(1.0f);
                                                                                            int i17 = 49914;
                                                                                            while (true) {
                                                                                                i17 ^= 49931;
                                                                                                switch (i17) {
                                                                                                    case 497:
                                                                                                        i17 = !zM60412 ? 50658 : 50627;
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        break;
                                                                                                    case 1769:
                                                                                                        boolean zM60413 = C0313.m6045(0.0f);
                                                                                                        int i18 = 50689;
                                                                                                        while (true) {
                                                                                                            i18 ^= 50706;
                                                                                                            switch (i18) {
                                                                                                                case 19:
                                                                                                                    i18 = !zM60413 ? 50782 : 50751;
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    boolean zM60414 = C0313.m6045(0.0f);
                                                                                                                    int i19 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i19 ^= 50830;
                                                                                                                        switch (i19) {
                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                                break;
                                                                                                                            case 243:
                                                                                                                                i19 = !zM60414 ? 51557 : 50875;
                                                                                                                                break;
                                                                                                                            case 4075:
                                                                                                                                boolean zM60415 = C0313.m6045(0.65f);
                                                                                                                                int i20 = 51588;
                                                                                                                                while (true) {
                                                                                                                                    i20 ^= 51605;
                                                                                                                                    switch (i20) {
                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i20 = !zM60415 ? 51681 : 51650;
                                                                                                                                            break;
                                                                                                                                        case 54:
                                                                                                                                            break;
                                                                                                                                        case 87:
                                                                                                                                            break;
                                                                                                                                        case 116:
                                                                                                                                            boolean zM60416 = C0313.m6045(1.0f);
                                                                                                                                            int i21 = 51712;
                                                                                                                                            while (true) {
                                                                                                                                                i21 ^= 51729;
                                                                                                                                                switch (i21) {
                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                        break;
                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                        i21 = !zM60416 ? 51805 : 51774;
                                                                                                                                                        break;
                                                                                                                                                    case 47:
                                                                                                                                                        break;
                                                                                                                                                    case 76:
                                                                                                                                                        boolean zM60417 = C0313.m6045(0.1f);
                                                                                                                                                        int i22 = 51836;
                                                                                                                                                        while (true) {
                                                                                                                                                            i22 ^= 51853;
                                                                                                                                                            switch (i22) {
                                                                                                                                                                case 241:
                                                                                                                                                                    i22 = !zM60417 ? 52580 : 52549;
                                                                                                                                                                    break;
                                                                                                                                                                case 1963:
                                                                                                                                                                    break;
                                                                                                                                                                case 1992:
                                                                                                                                                                    break;
                                                                                                                                                                case 2025:
                                                                                                                                                                    boolean zM60418 = C0313.m6045(0.0f);
                                                                                                                                                                    int i23 = 52611;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i23 ^= 52628;
                                                                                                                                                                        switch (i23) {
                                                                                                                                                                            case 23:
                                                                                                                                                                                i23 = !zM60418 ? 52704 : 52673;
                                                                                                                                                                                break;
                                                                                                                                                                            case 54:
                                                                                                                                                                                break;
                                                                                                                                                                            case 85:
                                                                                                                                                                                break;
                                                                                                                                                                            case 116:
                                                                                                                                                                                boolean zM60419 = C0313.m6045(0.45f);
                                                                                                                                                                                int i24 = 52735;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i24 ^= 52752;
                                                                                                                                                                                    switch (i24) {
                                                                                                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                            break;
                                                                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 1007:
                                                                                                                                                                                            i24 = !zM60419 ? 53479 : 52797;
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 7927:
                                                                                                                                                                                            boolean zM60420 = C0313.m6045(1.0f);
                                                                                                                                                                                            int i25 = 53510;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i25 ^= 53527;
                                                                                                                                                                                                switch (i25) {
                                                                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                                        i25 = !zM60420 ? 53603 : 53572;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 83:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 116:
                                                                                                                                                                                                        f8737f = new t.w(0.4f, 0.2f);
                                                                                                                                                                                                        return;
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
                                                                                                                                                        throw new IllegalArgumentException(C0201.m3852(C0049.m957(m6415(), 0, C0154.f179 ^ (-125), 1261)));
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
                                                                                                        throw new IllegalArgumentException(C0201.m3852(C0202.m3867(m6415(), 90, C0152.f177 ^ 312, 2374)));
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            i16 = !zM60411 ? 49883 : 49852;
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
                                                        throw new IllegalArgumentException(C0201.m3852(C0248.m4739(m6415(), 180, C0303.f450 ^ (-259), 1551)));
                                                    case 239:
                                                        i13 = !zM6048 ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
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
                case 239:
                    break;
                default:
                    break;
            }
        }
        throw new IllegalArgumentException(C0201.m3852(C0383.m7492(m6415(), 269, C0269.f348 ^ 679, 2457)));
    }

    /* JADX WARN: Code duplicated, block: B:468:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x021b A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x047b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x0313 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x047b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x048a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x04a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x047e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x049f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x04a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x04b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x04ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x04b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x04a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x04ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x04ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x053a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x06fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x052e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x054d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x054d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0563 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0567 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x0569 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x0563 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x057e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x05da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0585 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x058d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x05e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x05e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x05ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x05f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x060c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0610 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x061e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x060c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0604 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x062f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0633 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x062f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x0665 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x064d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x0661 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x0666 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x0659 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x0675 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:0x0680 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x0684 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x069d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x0680 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x067c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x066d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x0693 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x0699 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x069d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x0699 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x0695 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x068b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:760:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:0x0362 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:146:0x0205. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:159:0x0230. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:256:0x0464. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:311:0x055f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:346:0x0608. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:354:0x062b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:361:0x0642. Please report as an issue. */
    public static final void a(y0.o oVar, long j10, float f10, long j11, int i10, m0.m mVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j12;
        float f11;
        y0.o oVar2;
        int i18;
        long j13;
        float f12;
        int i19;
        int iM1284;
        g1.k kVar;
        t.k0 k0VarM6014;
        t.k0 k0VarM3291;
        t.k0 k0VarM3292;
        t.k0 k0VarM3293;
        y0.o oVarM2949;
        int i20;
        int i21;
        int i22;
        boolean z10;
        int i23;
        int i24;
        boolean z11;
        boolean z12;
        int i25;
        int i26;
        int i27;
        boolean z13;
        Object objM8078;
        int i28;
        Object obj;
        y0 y0VarM2417;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean zM4041;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean zM4042;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        boolean zM5148;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, 115870907 ^ C0321.f468);
        int i58 = i12 & (i12 ^ (-2));
        int i59 = 1616;
        while (true) {
            i59 ^= 1633;
            switch (i59) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i59 = i58 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i13 = (C0047.f67 ^ 969) | i11;
                    int i60 = 1740;
                    while (true) {
                        i60 ^= 1757;
                        switch (i60) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i60 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i61 = C0429.f699;
                    int i62 = 1864;
                    while (true) {
                        i62 ^= 1881;
                        switch (i62) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i62 = ((i61 ^ 193) & i11) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i13 = i11;
                                break;
                            case 47417:
                                boolean zM2013 = C0103.m2013(qVar, oVar);
                                int i63 = 48767;
                                while (true) {
                                    i63 ^= 48784;
                                    switch (i63) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i14 = 2;
                                            break;
                                        case 76:
                                            i14 = 4;
                                            int i64 = 48891;
                                            while (true) {
                                                i64 ^= 48908;
                                                switch (i64) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i64 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i63 = zM2013 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i13 = (i14 & i11) | (i14 ^ i11);
                                int i65 = 49666;
                                while (true) {
                                    i65 ^= 49683;
                                    switch (i65) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i65 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 47483:
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
        int i66 = C0482.f755;
        int i67 = 49790;
        while (true) {
            i67 ^= 49807;
            switch (i67) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    break;
                case 84:
                    int i68 = C0359.f629;
                    int i69 = 49914;
                    while (true) {
                        i69 ^= 49931;
                        switch (i69) {
                            case 497:
                                i69 = ((i68 ^ 528) & i12) == 0 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                i57 = 16;
                                break;
                            case 1769:
                                boolean zM4043 = C0212.m4041(qVar, j10);
                                int i70 = 50689;
                                while (true) {
                                    i70 ^= 50706;
                                    switch (i70) {
                                        case 19:
                                            i70 = zM4043 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i57 = 16;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            i57 = 32;
                                            int i71 = 50813;
                                            while (true) {
                                                i71 ^= 50830;
                                                switch (i71) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 243:
                                                        i71 = 50844;
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
                                break;
                            default:
                                break;
                        }
                    }
                    i13 = (i13 & i57) | (i13 ^ i57);
                    int i72 = 51588;
                    while (true) {
                        i72 ^= 51605;
                        switch (i72) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i72 = 51619;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i67 = ((i66 ^ (-537)) & i11) == 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i73 = i12 & (C0489.f762 ^ (-336));
        int i74 = 51712;
        while (true) {
            i74 ^= 51729;
            switch (i74) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i74 = i73 != 0 ? 51805 : 51774;
                    break;
                case 47:
                    int i75 = C0422.f692;
                    int i76 = 52611;
                    while (true) {
                        i76 ^= 52628;
                        switch (i76) {
                            case 23:
                                i76 = ((i75 ^ (-159)) & i11) == 0 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                i56 = 51836;
                                while (true) {
                                    i56 ^= 51853;
                                    switch (i56) {
                                        case 241:
                                            i56 = 52518;
                                            continue;
                                            continue;
                                        case 1963:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case 116:
                                boolean zM5919 = C0307.m5919(qVar, f10);
                                int i77 = 52735;
                                while (true) {
                                    i77 ^= 52752;
                                    switch (i77) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i15 = 128;
                                            break;
                                        case 1007:
                                            i77 = zM5919 ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            i15 = 256;
                                            int i78 = 53510;
                                            while (true) {
                                                i78 ^= 53527;
                                                switch (i78) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i78 = 53541;
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
                                i13 = (i13 & i15) | (i13 ^ i15);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 76:
                    i13 |= C0283.f427 ^ (-596);
                    i56 = 51836;
                    while (true) {
                        i56 ^= 51853;
                        switch (i56) {
                            case 241:
                                i56 = 52518;
                                continue;
                                continue;
                            case 1963:
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
            int i79 = C0267.f346;
            int i80 = 53634;
            while (true) {
                i80 ^= 53651;
                switch (i80) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i80 = ((i79 ^ (-3844)) & i11) == 0 ? 53727 : 53696;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        int i81 = C0104.f130;
                        int i82 = 53758;
                        while (true) {
                            i82 ^= 53775;
                            switch (i82) {
                                case 1009:
                                    i82 = ((i81 ^ 795) & i12) == 0 ? 54502 : 54471;
                                    break;
                                case 1703:
                                    break;
                                case 1736:
                                    i55 = 1024;
                                    break;
                                case 1769:
                                    boolean zM4044 = C0212.m4041(qVar, j11);
                                    int i83 = 54533;
                                    while (true) {
                                        i83 ^= 54550;
                                        switch (i83) {
                                            case 19:
                                                i83 = zM4044 ? 54626 : 54595;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 85:
                                                i55 = 1024;
                                                break;
                                            case 116:
                                                i55 = 2048;
                                                int i84 = 54657;
                                                while (true) {
                                                    i84 ^= 54674;
                                                    switch (i84) {
                                                        case 19:
                                                            i84 = 54688;
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
                                    break;
                                default:
                                    break;
                            }
                        }
                        i13 = (i13 & i55) | (i13 ^ i55);
                        int i85 = 55432;
                        while (true) {
                            i85 ^= 55449;
                            switch (i85) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i85 = 55463;
                                    continue;
                                case 62:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 83:
                        break;
                    default:
                        break;
                }
            }
            int i86 = i12 & (C0267.f346 ^ (-788));
            int i87 = 55556;
            while (true) {
                i87 ^= 55573;
                switch (i87) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i87 = i86 != 0 ? 55649 : 55618;
                        break;
                    case 54:
                        break;
                    case 87:
                        int i88 = C0060.f80;
                        int i89 = 56455;
                        while (true) {
                            i89 ^= 56472;
                            switch (i89) {
                                case 31:
                                    i89 = ((i88 ^ (-25472)) & i11) == 0 ? 56548 : 56517;
                                    break;
                                case 62:
                                    break;
                                case 93:
                                    i54 = 55680;
                                    while (true) {
                                        i54 ^= 55697;
                                        switch (i54) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i54 = 56362;
                                                break;
                                            case 1467:
                                                break;
                                        }
                                    }
                                    break;
                                case 124:
                                    boolean zM1859 = C0087.m1859(qVar, i10);
                                    int i90 = 56579;
                                    while (true) {
                                        i90 ^= 56596;
                                        switch (i90) {
                                            case 23:
                                                if (zM1859) {
                                                    i90 = 1507472;
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                i16 = 8192;
                                                break;
                                            case 1564036:
                                                i16 = 16384;
                                                int i91 = 1507503;
                                                while (true) {
                                                    i91 ^= 1507520;
                                                    switch (i91) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 111:
                                                            i91 = 1507534;
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i90 = 56641;
                                    }
                                    i13 = (i13 & i16) | (i13 ^ i16);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 116:
                        i13 |= C0185.f209 ^ 25360;
                        i54 = 55680;
                        while (true) {
                            i54 ^= 55697;
                            switch (i54) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i54 = 56362;
                                    break;
                                case 1467:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
                int i92 = C0307.f454;
                int i93 = 1507627;
                while (true) {
                    i93 ^= 1507644;
                    switch (i93) {
                        case 23:
                            i93 = ((i92 ^ (-9711)) & i13) == 9362 ? 1507720 : 1507689;
                            break;
                        case 85:
                            C0309.m5960(qVar);
                            i18 = 1509425;
                            while (true) {
                                i18 ^= 1509442;
                                switch (i18) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        i39 = 1511471;
                                        while (true) {
                                            i39 ^= 1511488;
                                            switch (i39) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 111:
                                                    i39 = i58 != 0 ? 1511564 : 1511533;
                                                    break;
                                                case 204:
                                                    oVar = C0227.m4370();
                                                    i46 = 1511595;
                                                    while (true) {
                                                        i46 ^= 1511612;
                                                        switch (i46) {
                                                            case 23:
                                                                i46 = 1512277;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            case 1001:
                                                                break;
                                                            default:
                                                                continue;
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
                                        i40 = C0157.f181;
                                        i41 = 1512370;
                                        while (true) {
                                            i41 ^= 1512387;
                                            switch (i41) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    break;
                                                case 113:
                                                    i41 = ((i40 ^ (-322)) & i12) != 0 ? 1512463 : 1512432;
                                                    break;
                                                case 1996:
                                                    C0443.m8633();
                                                    C0262.m4990(qVar, (-1803349197) ^ C0071.f98);
                                                    C0375.m7349();
                                                    j10 = C0235.m4507(C0414.f684 ^ (-935), qVar);
                                                    C0171.m3270(qVar, false);
                                                    i13 &= C0440.f710 ^ (-949);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i42 = 1512494;
                                        while (true) {
                                            i42 ^= 1512511;
                                            switch (i42) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i42 = i73 != 0 ? 1513238 : 1512556;
                                                    break;
                                                case 83:
                                                    break;
                                                case 114:
                                                    break;
                                                case 809:
                                                    f10 = C0443.m8633();
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i43 = C0476.f746;
                                        i44 = 1513269;
                                        while (true) {
                                            i44 ^= 1513286;
                                            switch (i44) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 53:
                                                    break;
                                                case 115:
                                                    i44 = ((i43 ^ (-19)) & i12) != 0 ? 1513362 : 1513331;
                                                    break;
                                                case 212:
                                                    C0443.m8633();
                                                    C0262.m4990(qVar, 404222143 ^ C0310.f457);
                                                    j11 = C0251.m4787();
                                                    C0171.m3270(qVar, false);
                                                    i13 &= C0066.f86 ^ 7385;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i45 = 1513393;
                                        while (true) {
                                            i45 ^= 1513410;
                                            switch (i45) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    j13 = j10;
                                                    i19 = i13;
                                                    iM1284 = i10;
                                                    f12 = f10;
                                                    break;
                                                case 115:
                                                    i45 = i86 != 0 ? 1513486 : 1513455;
                                                    break;
                                                case 4044:
                                                    j13 = j10;
                                                    i19 = i13;
                                                    iM1284 = C0066.m1284();
                                                    f12 = f10;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 115:
                                        i18 = ((i11 ^ (-2)) & i11) != 0 ? 1509518 : 1509487;
                                        break;
                                    case 204:
                                        zM5148 = C0270.m5148(qVar);
                                        i47 = 1509549;
                                        while (true) {
                                            i47 ^= 1509566;
                                            switch (i47) {
                                                case 19:
                                                    i47 = zM5148 ? 1509642 : 1509611;
                                                    break;
                                                case 85:
                                                    C0471.m9156(qVar);
                                                    i48 = C0285.f429;
                                                    i49 = 1510448;
                                                    while (true) {
                                                        i49 ^= 1510465;
                                                        switch (i49) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 47:
                                                                break;
                                                            case 113:
                                                                i49 = ((i48 ^ 986) & i12) != 0 ? 1510541 : 1510510;
                                                                break;
                                                            case 204:
                                                                i13 &= C0217.f240 ^ 999;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i50 = C0471.f741;
                                                    i51 = 1510572;
                                                    while (true) {
                                                        i51 ^= 1510589;
                                                        switch (i51) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i51 = ((i50 ^ 189) & i12) != 0 ? 1511316 : 1510634;
                                                                break;
                                                            case 87:
                                                                break;
                                                            case 118:
                                                                break;
                                                            case 809:
                                                                i13 &= C0073.f107 ^ 8082;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i52 = 1511347;
                                                    while (true) {
                                                        i52 ^= 1511364;
                                                        switch (i52) {
                                                            case 22:
                                                                j13 = j10;
                                                                i19 = i13;
                                                                iM1284 = i10;
                                                                f12 = f10;
                                                                break;
                                                            case 119:
                                                                i52 = 1511378;
                                                                continue;
                                                                continue;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 114:
                                                    break;
                                                case 436:
                                                    i53 = 1509673;
                                                    while (true) {
                                                        i53 ^= 1509690;
                                                        switch (i53) {
                                                            case 19:
                                                                i53 = 1510355;
                                                                continue;
                                                                continue;
                                                            case 745:
                                                                break;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                        i39 = 1511471;
                                                        while (true) {
                                                            i39 ^= 1511488;
                                                            switch (i39) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    break;
                                                                case 111:
                                                                    if (i58 != 0) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    oVar = C0227.m4370();
                                                                    i46 = 1511595;
                                                                    while (true) {
                                                                        i46 ^= 1511612;
                                                                        switch (i46) {
                                                                            case 23:
                                                                                i46 = 1512277;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 1001:
                                                                                break;
                                                                            default:
                                                                                continue;
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
                                                        i40 = C0157.f181;
                                                        i41 = 1512370;
                                                        while (true) {
                                                            i41 ^= 1512387;
                                                            switch (i41) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 113:
                                                                    if (((i40 ^ (-322)) & i12) != 0) {
                                                                    }
                                                                    break;
                                                                case 1996:
                                                                    C0443.m8633();
                                                                    C0262.m4990(qVar, (-1803349197) ^ C0071.f98);
                                                                    C0375.m7349();
                                                                    j10 = C0235.m4507(C0414.f684 ^ (-935), qVar);
                                                                    C0171.m3270(qVar, false);
                                                                    i13 &= C0440.f710 ^ (-949);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i42 = 1512494;
                                                        while (true) {
                                                            i42 ^= 1512511;
                                                            switch (i42) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (i73 != 0) {
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 809:
                                                                    f10 = C0443.m8633();
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i43 = C0476.f746;
                                                        i44 = 1513269;
                                                        while (true) {
                                                            i44 ^= 1513286;
                                                            switch (i44) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 115:
                                                                    if (((i43 ^ (-19)) & i12) != 0) {
                                                                    }
                                                                    break;
                                                                case 212:
                                                                    C0443.m8633();
                                                                    C0262.m4990(qVar, 404222143 ^ C0310.f457);
                                                                    j11 = C0251.m4787();
                                                                    C0171.m3270(qVar, false);
                                                                    i13 &= C0066.f86 ^ 7385;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i45 = 1513393;
                                                        while (true) {
                                                            i45 ^= 1513410;
                                                            switch (i45) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    j13 = j10;
                                                                    i19 = i13;
                                                                    iM1284 = i10;
                                                                    f12 = f10;
                                                                    break;
                                                                case 115:
                                                                    if (i86 != 0) {
                                                                    }
                                                                    break;
                                                                case 4044:
                                                                    j13 = j10;
                                                                    i19 = i13;
                                                                    iM1284 = C0066.m1284();
                                                                    f12 = f10;
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
                                C0103.m2025(qVar);
                                kVar = new g1.k(C0114.m2209((m2.b) C0476.m9256(qVar, C0479.m9327()), f12), 0.0f, iM1284, 0, 26);
                                t.p0 p0VarM5758 = C0300.m5758(null, qVar, 1);
                                Integer numM1083 = C0057.m1083(0);
                                Integer numM1084 = C0057.m1083(C0389.f659 ^ 533);
                                t.x1 x1VarM5579 = C0290.m5579();
                                t.b0 b0VarM2944 = C0153.m2944();
                                t.w1 w1VarM1033 = C0053.m1033(C0176.f200 ^ (-6437), 0, b0VarM2944, 2);
                                int i94 = C0102.f128 ^ 232;
                                k0VarM6014 = C0312.m6014(p0VarM5758, numM1083, numM1084, x1VarM5579, C0261.m4970(w1VarM1033, 0, i94), null, qVar, 16);
                                k0VarM3291 = C0172.m3291(p0VarM5758, 0.0f, 286.0f, C0261.m4970(C0053.m1033(1332, 0, b0VarM2944, C0348.f618 ^ 386), 0, i94), null, qVar, 4536, 8);
                                t tVarM3424 = C0179.m3424();
                                t.u0 u0Var = new t.u0();
                                C0464.m9044(tVarM3424, u0Var);
                                k0VarM3292 = C0172.m3291(p0VarM5758, 0.0f, 290.0f, C0261.m4970(new t.v0(u0Var), 0, C0026.f46 ^ (-319)), null, qVar, 4536, 8);
                                t tVarM8958 = C0460.m8958();
                                t.u0 u0Var2 = new t.u0();
                                C0464.m9044(tVarM8958, u0Var2);
                                k0VarM3293 = C0172.m3291(p0VarM5758, 0.0f, 290.0f, C0261.m4970(new t.v0(u0Var2), 0, C0349.f619 ^ 979), null, qVar, 4536, 8);
                                oVarM2949 = C0154.m2949(C0039.m758(oVar, true, C0171.m3268()), C0281.m5435());
                                C0262.m4990(qVar, 821870236 ^ C0263.f342);
                                i20 = C0434.f704;
                                i21 = C0312.f459;
                                i22 = 1513517;
                                while (true) {
                                    i22 ^= 1513534;
                                    switch (i22) {
                                        case 19:
                                            i22 = (((i20 ^ (-7695)) & i19) ^ (i21 ^ 3820)) > 2048 ? 1514261 : 1514230;
                                            break;
                                        case 712:
                                            i36 = C0108.f134;
                                            i37 = 1514416;
                                            while (true) {
                                                i37 ^= 1514433;
                                                switch (i37) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 47:
                                                        z10 = false;
                                                        break;
                                                    case 113:
                                                        i37 = ((i36 ^ (-3142)) & i19) == 2048 ? 1515160 : 1514478;
                                                        break;
                                                    case 1369:
                                                        z10 = true;
                                                        i35 = 1515191;
                                                        while (true) {
                                                            i35 ^= 1515208;
                                                            switch (i35) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                    break;
                                                                case 127:
                                                                    i35 = 1515222;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
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
                                        case 745:
                                            break;
                                        case 811:
                                            zM4042 = C0212.m4041(qVar, j11);
                                            i38 = 1514292;
                                            while (true) {
                                                i38 ^= 1514309;
                                                switch (i38) {
                                                    case 22:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                        z10 = true;
                                                        i35 = 1515191;
                                                        while (true) {
                                                            i35 ^= 1515208;
                                                            switch (i35) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                    break;
                                                                case 127:
                                                                    i35 = 1515222;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 113:
                                                        i38 = !zM4042 ? 1514385 : 1514354;
                                                        break;
                                                    case 212:
                                                        i36 = C0108.f134;
                                                        i37 = 1514416;
                                                        while (true) {
                                                            i37 ^= 1514433;
                                                            switch (i37) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    z10 = false;
                                                                    break;
                                                                case 113:
                                                                    if (((i36 ^ (-3142)) & i19) == 2048) {
                                                                    }
                                                                    break;
                                                                case 1369:
                                                                    z10 = true;
                                                                    i35 = 1515191;
                                                                    while (true) {
                                                                        i35 ^= 1515208;
                                                                        switch (i35) {
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                break;
                                                                            case 127:
                                                                                i35 = 1515222;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
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
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    boolean zM5551 = C0289.m5551(qVar, kVar);
                                    boolean z14 = (z10 & zM5551) | (z10 ^ zM5551);
                                    boolean zM2014 = C0103.m2013(qVar, k0VarM6014);
                                    boolean z15 = (z14 & zM2014) | (z14 ^ zM2014);
                                    boolean zM2015 = C0103.m2013(qVar, k0VarM3292);
                                    boolean z16 = (z15 & zM2015) | (z15 ^ zM2015);
                                    boolean zM2016 = C0103.m2013(qVar, k0VarM3293);
                                    boolean z17 = (z16 & zM2016) | (z16 ^ zM2016);
                                    boolean zM2017 = C0103.m2013(qVar, k0VarM3291);
                                    boolean z18 = (z17 ^ zM2017) | (z17 & zM2017);
                                    i23 = C0310.f457;
                                    i24 = 1515315;
                                    while (true) {
                                        i24 ^= 1515332;
                                        switch (i24) {
                                            case 22:
                                                break;
                                            case 53:
                                                z11 = false;
                                                break;
                                            case 119:
                                                i24 = ((i23 ^ (-538)) & i19) == 256 ? 1515408 : 1515377;
                                                break;
                                            case 212:
                                                z11 = true;
                                                i34 = 1515439;
                                                while (true) {
                                                    i34 ^= 1515456;
                                                    switch (i34) {
                                                        case 111:
                                                            i34 = 1516121;
                                                            continue;
                                                            continue;
                                                        case 15769:
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
                                    z12 = (z11 ^ z18) | (z11 & z18);
                                    i25 = C0342.f612;
                                    i26 = C0190.f214;
                                    i27 = 1516214;
                                    while (true) {
                                        i27 ^= 1516231;
                                        switch (i27) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                i31 = C0473.f743;
                                                i32 = 1537294;
                                                while (true) {
                                                    i32 ^= 1537311;
                                                    switch (i32) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i32 = ((i31 ^ (-542)) & i19) == 32 ? 1537387 : 1537356;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            z13 = false;
                                                            break;
                                                        case 116:
                                                            z13 = true;
                                                            i30 = 1537418;
                                                            while (true) {
                                                                i30 ^= 1537435;
                                                                switch (i30) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i30 = 1537449;
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
                                                break;
                                            case 113:
                                                i27 = (((i25 ^ (-643)) & i19) ^ (i26 ^ (-21))) > 32 ? 1516307 : 1516276;
                                                break;
                                            case 468:
                                                zM4041 = C0212.m4041(qVar, j13);
                                                i33 = 1516338;
                                                while (true) {
                                                    i33 ^= 1516355;
                                                    switch (i33) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            z13 = true;
                                                            i30 = 1537418;
                                                            while (true) {
                                                                i30 ^= 1537435;
                                                                switch (i30) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i30 = 1537449;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 113:
                                                            i33 = !zM4041 ? 1537263 : 1516400;
                                                            break;
                                                        case 22444:
                                                            i31 = C0473.f743;
                                                            i32 = 1537294;
                                                            while (true) {
                                                                i32 ^= 1537311;
                                                                switch (i32) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (((i31 ^ (-542)) & i19) == 32) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        z13 = false;
                                                                        break;
                                                                    case 116:
                                                                        z13 = true;
                                                                        i30 = 1537418;
                                                                        while (true) {
                                                                            i30 ^= 1537435;
                                                                            switch (i30) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i30 = 1537449;
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
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        objM8078 = C0412.m8078(qVar);
                                        i28 = 1537542;
                                        while (true) {
                                            i28 ^= 1537559;
                                            switch (i28) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i28 = !((z12 ^ z13) | (z12 & z13)) ? 1538286 : 1538255;
                                                    break;
                                                case 3751:
                                                    break;
                                                case 3800:
                                                    w1 w1Var = new w1(j11, kVar, k0VarM6014, k0VarM3292, k0VarM3293, k0VarM3291, f12, j13);
                                                    C0479.m9328(qVar, w1Var);
                                                    obj = w1Var;
                                                    break;
                                                case 3833:
                                                    y0VarM2417 = C0125.m2417();
                                                    i29 = 1538317;
                                                    while (true) {
                                                        i29 ^= 1538334;
                                                        switch (i29) {
                                                            case 19:
                                                                i29 = objM8078 == y0VarM2417 ? 1538410 : 1538379;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 85:
                                                                obj = objM8078;
                                                                break;
                                                            case 116:
                                                                w1 w1Var2 = new w1(j11, kVar, k0VarM6014, k0VarM3292, k0VarM3293, k0VarM3291, f12, j13);
                                                                C0479.m9328(qVar, w1Var2);
                                                                obj = w1Var2;
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
                                        C0171.m3270(qVar, false);
                                        C0227.m4350(oVarM2949, (c9.c) obj, qVar, 0);
                                        j10 = j13;
                                        i17 = iM1284;
                                        j12 = j11;
                                        f11 = f12;
                                        oVar2 = oVar;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 118:
                            break;
                        case 180:
                            boolean zM1625 = C0074.m1625(qVar);
                            int i95 = 1507751;
                            while (true) {
                                i95 ^= 1507768;
                                switch (i95) {
                                    case 31:
                                        i95 = !zM1625 ? 1508495 : 1508464;
                                        break;
                                    case 1335:
                                        int i96 = 1508526;
                                        while (true) {
                                            i96 ^= 1508543;
                                            switch (i96) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i96 = 1508557;
                                                    continue;
                                                case 114:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            C0309.m5960(qVar);
                                            i18 = 1509425;
                                            while (true) {
                                                i18 ^= 1509442;
                                                switch (i18) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        i39 = 1511471;
                                                        while (true) {
                                                            i39 ^= 1511488;
                                                            switch (i39) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    break;
                                                                case 111:
                                                                    if (i58 != 0) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    oVar = C0227.m4370();
                                                                    i46 = 1511595;
                                                                    while (true) {
                                                                        i46 ^= 1511612;
                                                                        switch (i46) {
                                                                            case 23:
                                                                                i46 = 1512277;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 1001:
                                                                                break;
                                                                            default:
                                                                                continue;
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
                                                        i40 = C0157.f181;
                                                        i41 = 1512370;
                                                        while (true) {
                                                            i41 ^= 1512387;
                                                            switch (i41) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 113:
                                                                    if (((i40 ^ (-322)) & i12) != 0) {
                                                                    }
                                                                    break;
                                                                case 1996:
                                                                    C0443.m8633();
                                                                    C0262.m4990(qVar, (-1803349197) ^ C0071.f98);
                                                                    C0375.m7349();
                                                                    j10 = C0235.m4507(C0414.f684 ^ (-935), qVar);
                                                                    C0171.m3270(qVar, false);
                                                                    i13 &= C0440.f710 ^ (-949);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i42 = 1512494;
                                                        while (true) {
                                                            i42 ^= 1512511;
                                                            switch (i42) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (i73 != 0) {
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 809:
                                                                    f10 = C0443.m8633();
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i43 = C0476.f746;
                                                        i44 = 1513269;
                                                        while (true) {
                                                            i44 ^= 1513286;
                                                            switch (i44) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 115:
                                                                    if (((i43 ^ (-19)) & i12) != 0) {
                                                                    }
                                                                    break;
                                                                case 212:
                                                                    C0443.m8633();
                                                                    C0262.m4990(qVar, 404222143 ^ C0310.f457);
                                                                    j11 = C0251.m4787();
                                                                    C0171.m3270(qVar, false);
                                                                    i13 &= C0066.f86 ^ 7385;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i45 = 1513393;
                                                        while (true) {
                                                            i45 ^= 1513410;
                                                            switch (i45) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    j13 = j10;
                                                                    i19 = i13;
                                                                    iM1284 = i10;
                                                                    f12 = f10;
                                                                    break;
                                                                case 115:
                                                                    if (i86 != 0) {
                                                                    }
                                                                    break;
                                                                case 4044:
                                                                    j13 = j10;
                                                                    i19 = i13;
                                                                    iM1284 = C0066.m1284();
                                                                    f12 = f10;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 115:
                                                        if (((i11 ^ (-2)) & i11) != 0) {
                                                        }
                                                        break;
                                                    case 204:
                                                        zM5148 = C0270.m5148(qVar);
                                                        i47 = 1509549;
                                                        while (true) {
                                                            i47 ^= 1509566;
                                                            switch (i47) {
                                                                case 19:
                                                                    if (zM5148) {
                                                                    }
                                                                    break;
                                                                case 85:
                                                                    C0471.m9156(qVar);
                                                                    i48 = C0285.f429;
                                                                    i49 = 1510448;
                                                                    while (true) {
                                                                        i49 ^= 1510465;
                                                                        switch (i49) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 47:
                                                                                break;
                                                                            case 113:
                                                                                if (((i48 ^ 986) & i12) != 0) {
                                                                                }
                                                                                break;
                                                                            case 204:
                                                                                i13 &= C0217.f240 ^ 999;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i50 = C0471.f741;
                                                                    i51 = 1510572;
                                                                    while (true) {
                                                                        i51 ^= 1510589;
                                                                        switch (i51) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (((i50 ^ 189) & i12) != 0) {
                                                                                }
                                                                                break;
                                                                            case 87:
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 809:
                                                                                i13 &= C0073.f107 ^ 8082;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i52 = 1511347;
                                                                    while (true) {
                                                                        i52 ^= 1511364;
                                                                        switch (i52) {
                                                                            case 22:
                                                                                j13 = j10;
                                                                                i19 = i13;
                                                                                iM1284 = i10;
                                                                                f12 = f10;
                                                                                break;
                                                                            case 119:
                                                                                i52 = 1511378;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    i53 = 1509673;
                                                                    while (true) {
                                                                        i53 ^= 1509690;
                                                                        switch (i53) {
                                                                            case 19:
                                                                                i53 = 1510355;
                                                                                continue;
                                                                                continue;
                                                                            case 745:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i39 = 1511471;
                                                                        while (true) {
                                                                            i39 ^= 1511488;
                                                                            switch (i39) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 111:
                                                                                    if (i58 != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 204:
                                                                                    oVar = C0227.m4370();
                                                                                    i46 = 1511595;
                                                                                    while (true) {
                                                                                        i46 ^= 1511612;
                                                                                        switch (i46) {
                                                                                            case 23:
                                                                                                i46 = 1512277;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case 1001:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
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
                                                                        i40 = C0157.f181;
                                                                        i41 = 1512370;
                                                                        while (true) {
                                                                            i41 ^= 1512387;
                                                                            switch (i41) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    break;
                                                                                case 113:
                                                                                    if (((i40 ^ (-322)) & i12) != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 1996:
                                                                                    C0443.m8633();
                                                                                    C0262.m4990(qVar, (-1803349197) ^ C0071.f98);
                                                                                    C0375.m7349();
                                                                                    j10 = C0235.m4507(C0414.f684 ^ (-935), qVar);
                                                                                    C0171.m3270(qVar, false);
                                                                                    i13 &= C0440.f710 ^ (-949);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i42 = 1512494;
                                                                        while (true) {
                                                                            i42 ^= 1512511;
                                                                            switch (i42) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (i73 != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 809:
                                                                                    f10 = C0443.m8633();
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i43 = C0476.f746;
                                                                        i44 = 1513269;
                                                                        while (true) {
                                                                            i44 ^= 1513286;
                                                                            switch (i44) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 53:
                                                                                    break;
                                                                                case 115:
                                                                                    if (((i43 ^ (-19)) & i12) != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 212:
                                                                                    C0443.m8633();
                                                                                    C0262.m4990(qVar, 404222143 ^ C0310.f457);
                                                                                    j11 = C0251.m4787();
                                                                                    C0171.m3270(qVar, false);
                                                                                    i13 &= C0066.f86 ^ 7385;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i45 = 1513393;
                                                                        while (true) {
                                                                            i45 ^= 1513410;
                                                                            switch (i45) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    j13 = j10;
                                                                                    i19 = i13;
                                                                                    iM1284 = i10;
                                                                                    f12 = f10;
                                                                                    break;
                                                                                case 115:
                                                                                    if (i86 != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 4044:
                                                                                    j13 = j10;
                                                                                    i19 = i13;
                                                                                    iM1284 = C0066.m1284();
                                                                                    f12 = f10;
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
                                                C0103.m2025(qVar);
                                                kVar = new g1.k(C0114.m2209((m2.b) C0476.m9256(qVar, C0479.m9327()), f12), 0.0f, iM1284, 0, 26);
                                                t.p0 p0VarM5759 = C0300.m5758(null, qVar, 1);
                                                Integer numM1085 = C0057.m1083(0);
                                                Integer numM1086 = C0057.m1083(C0389.f659 ^ 533);
                                                t.x1 x1VarM55710 = C0290.m5579();
                                                t.b0 b0VarM2945 = C0153.m2944();
                                                t.w1 w1VarM1034 = C0053.m1033(C0176.f200 ^ (-6437), 0, b0VarM2945, 2);
                                                int i97 = C0102.f128 ^ 232;
                                                k0VarM6014 = C0312.m6014(p0VarM5759, numM1085, numM1086, x1VarM55710, C0261.m4970(w1VarM1034, 0, i97), null, qVar, 16);
                                                k0VarM3291 = C0172.m3291(p0VarM5759, 0.0f, 286.0f, C0261.m4970(C0053.m1033(1332, 0, b0VarM2945, C0348.f618 ^ 386), 0, i97), null, qVar, 4536, 8);
                                                t tVarM3425 = C0179.m3424();
                                                t.u0 u0Var3 = new t.u0();
                                                C0464.m9044(tVarM3425, u0Var3);
                                                k0VarM3292 = C0172.m3291(p0VarM5759, 0.0f, 290.0f, C0261.m4970(new t.v0(u0Var3), 0, C0026.f46 ^ (-319)), null, qVar, 4536, 8);
                                                t tVarM8959 = C0460.m8958();
                                                t.u0 u0Var4 = new t.u0();
                                                C0464.m9044(tVarM8959, u0Var4);
                                                k0VarM3293 = C0172.m3291(p0VarM5759, 0.0f, 290.0f, C0261.m4970(new t.v0(u0Var4), 0, C0349.f619 ^ 979), null, qVar, 4536, 8);
                                                oVarM2949 = C0154.m2949(C0039.m758(oVar, true, C0171.m3268()), C0281.m5435());
                                                C0262.m4990(qVar, 821870236 ^ C0263.f342);
                                                i20 = C0434.f704;
                                                i21 = C0312.f459;
                                                i22 = 1513517;
                                                while (true) {
                                                    i22 ^= 1513534;
                                                    switch (i22) {
                                                        case 19:
                                                            if ((((i20 ^ (-7695)) & i19) ^ (i21 ^ 3820)) > 2048) {
                                                            }
                                                            break;
                                                        case 712:
                                                            i36 = C0108.f134;
                                                            i37 = 1514416;
                                                            while (true) {
                                                                i37 ^= 1514433;
                                                                switch (i37) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 47:
                                                                        z10 = false;
                                                                        break;
                                                                    case 113:
                                                                        if (((i36 ^ (-3142)) & i19) == 2048) {
                                                                        }
                                                                        break;
                                                                    case 1369:
                                                                        z10 = true;
                                                                        i35 = 1515191;
                                                                        while (true) {
                                                                            i35 ^= 1515208;
                                                                            switch (i35) {
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                    break;
                                                                                case 127:
                                                                                    i35 = 1515222;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
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
                                                        case 745:
                                                            break;
                                                        case 811:
                                                            zM4042 = C0212.m4041(qVar, j11);
                                                            i38 = 1514292;
                                                            while (true) {
                                                                i38 ^= 1514309;
                                                                switch (i38) {
                                                                    case 22:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                        z10 = true;
                                                                        i35 = 1515191;
                                                                        while (true) {
                                                                            i35 ^= 1515208;
                                                                            switch (i35) {
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                    break;
                                                                                case 127:
                                                                                    i35 = 1515222;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 113:
                                                                        if (!zM4042) {
                                                                        }
                                                                        break;
                                                                    case 212:
                                                                        i36 = C0108.f134;
                                                                        i37 = 1514416;
                                                                        while (true) {
                                                                            i37 ^= 1514433;
                                                                            switch (i37) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 47:
                                                                                    z10 = false;
                                                                                    break;
                                                                                case 113:
                                                                                    if (((i36 ^ (-3142)) & i19) == 2048) {
                                                                                    }
                                                                                    break;
                                                                                case 1369:
                                                                                    z10 = true;
                                                                                    i35 = 1515191;
                                                                                    while (true) {
                                                                                        i35 ^= 1515208;
                                                                                        switch (i35) {
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                break;
                                                                                            case 127:
                                                                                                i35 = 1515222;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
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
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    boolean zM5552 = C0289.m5551(qVar, kVar);
                                                    boolean z19 = (z10 & zM5552) | (z10 ^ zM5552);
                                                    boolean zM2018 = C0103.m2013(qVar, k0VarM6014);
                                                    boolean z110 = (z19 & zM2018) | (z19 ^ zM2018);
                                                    boolean zM2019 = C0103.m2013(qVar, k0VarM3292);
                                                    boolean z111 = (z110 & zM2019) | (z110 ^ zM2019);
                                                    boolean zM20110 = C0103.m2013(qVar, k0VarM3293);
                                                    boolean z112 = (z111 & zM20110) | (z111 ^ zM20110);
                                                    boolean zM20111 = C0103.m2013(qVar, k0VarM3291);
                                                    boolean z113 = (z112 ^ zM20111) | (z112 & zM20111);
                                                    i23 = C0310.f457;
                                                    i24 = 1515315;
                                                    while (true) {
                                                        i24 ^= 1515332;
                                                        switch (i24) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                z11 = false;
                                                                break;
                                                            case 119:
                                                                if (((i23 ^ (-538)) & i19) == 256) {
                                                                }
                                                                break;
                                                            case 212:
                                                                z11 = true;
                                                                i34 = 1515439;
                                                                while (true) {
                                                                    i34 ^= 1515456;
                                                                    switch (i34) {
                                                                        case 111:
                                                                            i34 = 1516121;
                                                                            continue;
                                                                            continue;
                                                                        case 15769:
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
                                                    z12 = (z11 ^ z113) | (z11 & z113);
                                                    i25 = C0342.f612;
                                                    i26 = C0190.f214;
                                                    i27 = 1516214;
                                                    while (true) {
                                                        i27 ^= 1516231;
                                                        switch (i27) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 51:
                                                                i31 = C0473.f743;
                                                                i32 = 1537294;
                                                                while (true) {
                                                                    i32 ^= 1537311;
                                                                    switch (i32) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (((i31 ^ (-542)) & i19) == 32) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 83:
                                                                            z13 = false;
                                                                            break;
                                                                        case 116:
                                                                            z13 = true;
                                                                            i30 = 1537418;
                                                                            while (true) {
                                                                                i30 ^= 1537435;
                                                                                switch (i30) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i30 = 1537449;
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
                                                                break;
                                                            case 113:
                                                                if ((((i25 ^ (-643)) & i19) ^ (i26 ^ (-21))) > 32) {
                                                                }
                                                                break;
                                                            case 468:
                                                                zM4041 = C0212.m4041(qVar, j13);
                                                                i33 = 1516338;
                                                                while (true) {
                                                                    i33 ^= 1516355;
                                                                    switch (i33) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 51:
                                                                            z13 = true;
                                                                            i30 = 1537418;
                                                                            while (true) {
                                                                                i30 ^= 1537435;
                                                                                switch (i30) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i30 = 1537449;
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 113:
                                                                            if (!zM4041) {
                                                                            }
                                                                            break;
                                                                        case 22444:
                                                                            i31 = C0473.f743;
                                                                            i32 = 1537294;
                                                                            while (true) {
                                                                                i32 ^= 1537311;
                                                                                switch (i32) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (((i31 ^ (-542)) & i19) == 32) {
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 83:
                                                                                        z13 = false;
                                                                                        break;
                                                                                    case 116:
                                                                                        z13 = true;
                                                                                        i30 = 1537418;
                                                                                        while (true) {
                                                                                            i30 ^= 1537435;
                                                                                            switch (i30) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i30 = 1537449;
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
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        objM8078 = C0412.m8078(qVar);
                                                        i28 = 1537542;
                                                        while (true) {
                                                            i28 ^= 1537559;
                                                            switch (i28) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!((z12 ^ z13) | (z12 & z13))) {
                                                                    }
                                                                    break;
                                                                case 3751:
                                                                    break;
                                                                case 3800:
                                                                    w1 w1Var3 = new w1(j11, kVar, k0VarM6014, k0VarM3292, k0VarM3293, k0VarM3291, f12, j13);
                                                                    C0479.m9328(qVar, w1Var3);
                                                                    obj = w1Var3;
                                                                    break;
                                                                case 3833:
                                                                    y0VarM2417 = C0125.m2417();
                                                                    i29 = 1538317;
                                                                    while (true) {
                                                                        i29 ^= 1538334;
                                                                        switch (i29) {
                                                                            case 19:
                                                                                if (objM8078 == y0VarM2417) {
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 85:
                                                                                obj = objM8078;
                                                                                break;
                                                                            case 116:
                                                                                w1 w1Var4 = new w1(j11, kVar, k0VarM6014, k0VarM3292, k0VarM3293, k0VarM3291, f12, j13);
                                                                                C0479.m9328(qVar, w1Var4);
                                                                                obj = w1Var4;
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
                                                        C0171.m3270(qVar, false);
                                                        C0227.m4350(oVarM2949, (c9.c) obj, qVar, 0);
                                                        j10 = j13;
                                                        i17 = iM1284;
                                                        j12 = j11;
                                                        f11 = f12;
                                                        oVar2 = oVar;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 1480:
                                        C0471.m9156(qVar);
                                        int i98 = 1508650;
                                        while (true) {
                                            i98 ^= 1508667;
                                            switch (i98) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i98 = 1508681;
                                                    continue;
                                                case 114:
                                                    i17 = i10;
                                                    j12 = j11;
                                                    f11 = f10;
                                                    oVar2 = oVar;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
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
                    m0.x1 x1VarM7533 = C0385.m7533(qVar);
                    int i99 = 1538441;
                    while (true) {
                        i99 ^= 1538458;
                        switch (i99) {
                            case 19:
                                i99 = x1VarM7533 != null ? 1539185 : 1538503;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 93:
                                break;
                            case 1515:
                                x1VarM7533.f11756d = new x1(oVar2, j10, f11, j12, i17, i11, i12);
                                break;
                            default:
                                break;
                        }
                    }
                    int iM2022 = C0103.m2022();
                    int i100 = 1539216;
                    while (true) {
                        i100 ^= 1539233;
                        switch (i100) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 49:
                                if (iM2022 <= 0) {
                                    i100 = 1539309;
                                }
                                break;
                            case 76:
                                System.out.println(Integer.parseInt(C0058.m1108("SLhck2e6PkN")));
                                return;
                            case 111:
                                return;
                            default:
                                continue;
                        }
                        i100 = 1539278;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:457:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x041d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0461 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x06e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0455 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x047b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x04a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x04b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x04bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x04bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x04b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0503 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x050d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0509 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0503 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x051c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x052d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0510 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0561 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x0574 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x0578 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x0574 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x058d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x05af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x05af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x05ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x05cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x05de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x05de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x05da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:0x05ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x05f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x05e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:0x0612 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:0x062b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:760:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:0x0623 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x063d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:0x0643 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:0x0666 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x0643 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x063f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:0x0634 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:0x0659 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:0x0666 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:0x064c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:0x0672 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:0x0677 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:790:0x066a A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:0x0687 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x0693 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:0x0697 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:0x06ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:0x0693 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:0x068f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:0x067e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:0x06a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:0x06ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:0x06e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:0x06a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:0x069a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:832:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:833:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:834:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:835:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:837:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:839:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:842:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:843:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:845:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:340:0x055d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:348:0x0585. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:383:0x060e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:391:0x0639. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:398:0x0651. Please report as an issue. */
    public static final void b(c9.a aVar, y0.o oVar, long j10, long j11, int i10, m0.m mVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j12;
        int i19;
        long j13;
        int i20;
        int i21;
        int i22;
        boolean z10;
        Object objM8078;
        Object objM2417;
        int i23;
        c9.a aVar2;
        boolean zM2013;
        Object objM8079;
        int i24;
        y0.o oVarM8345;
        int i25;
        int i26;
        int i27;
        boolean z11;
        int i28;
        boolean z12;
        boolean z13;
        int i29;
        int i30;
        int i31;
        boolean z14;
        Object objM80710;
        int i32;
        Object obj;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean zM4041;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        boolean zM4042;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        boolean zM5148;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, 1796992767 ^ C0142.f168);
        int i64 = 1616;
        while (true) {
            i64 ^= 1633;
            switch (i64) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i64 = ((i12 ^ (-2)) & i12) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i13 = (C0043.f63 ^ 848) | i11;
                    int i65 = 1740;
                    while (true) {
                        i65 ^= 1757;
                        switch (i65) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i65 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i66 = C0310.f457;
                    int i67 = 1864;
                    while (true) {
                        i67 ^= 1881;
                        switch (i67) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i67 = ((i66 ^ (-416)) & i11) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i13 = i11;
                                break;
                            case 47417:
                                boolean zM5551 = C0289.m5551(qVar, aVar);
                                int i68 = 48767;
                                while (true) {
                                    i68 ^= 48784;
                                    switch (i68) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i14 = 2;
                                            break;
                                        case 76:
                                            i14 = 4;
                                            int i69 = 48891;
                                            while (true) {
                                                i69 ^= 48908;
                                                switch (i69) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i69 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i68 = zM5551 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i13 = (i14 & i11) | (i14 ^ i11);
                                int i70 = 49666;
                                while (true) {
                                    i70 ^= 49683;
                                    switch (i70) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i70 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 47483:
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
        int i71 = i12 & (C0110.f136 ^ 473);
        int i72 = 49790;
        while (true) {
            i72 ^= 49807;
            switch (i72) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    int i73 = C0300.f447;
                    int i74 = 50689;
                    while (true) {
                        i74 ^= 50706;
                        switch (i74) {
                            case 19:
                                i74 = ((i73 ^ 593) & i11) == 0 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i63 = 49914;
                                while (true) {
                                    i63 ^= 49931;
                                    switch (i63) {
                                        case 497:
                                            i63 = 50596;
                                            continue;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM2014 = C0103.m2013(qVar, oVar);
                                int i75 = 50813;
                                while (true) {
                                    i75 ^= 50830;
                                    switch (i75) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i15 = 16;
                                            break;
                                        case 243:
                                            i75 = zM2014 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            i15 = 32;
                                            int i76 = 51588;
                                            while (true) {
                                                i76 ^= 51605;
                                                switch (i76) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i76 = 51619;
                                                        continue;
                                                    case 54:
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
                                i13 = (i13 & i15) | (i13 ^ i15);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 84:
                    i13 |= C0356.f626 ^ (-66);
                    i63 = 49914;
                    while (true) {
                        i63 ^= 49931;
                        switch (i63) {
                            case 497:
                                i63 = 50596;
                                continue;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                                continue;
                        }
                    }
                    break;
                case 241:
                    i72 = i71 != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
            int i77 = C0360.f630;
            int i78 = 51712;
            while (true) {
                i78 ^= 51729;
                switch (i78) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i78 = ((i77 ^ 185) & i11) == 0 ? 51805 : 51774;
                        break;
                    case 47:
                        break;
                    case 76:
                        int i79 = C0013.f33;
                        int i80 = 51836;
                        while (true) {
                            i80 ^= 51853;
                            switch (i80) {
                                case 241:
                                    i80 = ((i79 ^ 797) & i12) == 0 ? 52580 : 52549;
                                    break;
                                case 1963:
                                    break;
                                case 1992:
                                    i62 = 128;
                                    break;
                                case 2025:
                                    boolean zM4043 = C0212.m4041(qVar, j10);
                                    int i81 = 52611;
                                    while (true) {
                                        i81 ^= 52628;
                                        switch (i81) {
                                            case 23:
                                                i81 = zM4043 ? 52704 : 52673;
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                i62 = 128;
                                                break;
                                            case 116:
                                                i62 = 256;
                                                int i82 = 52735;
                                                while (true) {
                                                    i82 ^= 52752;
                                                    switch (i82) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 1007:
                                                            i82 = 52766;
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
                                    break;
                                default:
                                    break;
                            }
                        }
                        i13 = (i13 & i62) | (i13 ^ i62);
                        int i83 = 53510;
                        while (true) {
                            i83 ^= 53527;
                            switch (i83) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i83 = 53541;
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
            int i84 = C0330.f477;
            int i85 = 53634;
            while (true) {
                i85 ^= 53651;
                switch (i85) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i85 = ((i84 ^ 3911) & i11) == 0 ? 53727 : 53696;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        int i86 = C0113.f139;
                        int i87 = 53758;
                        while (true) {
                            i87 ^= 53775;
                            switch (i87) {
                                case 1009:
                                    i87 = ((i86 ^ (-88)) & i12) == 0 ? 54502 : 54471;
                                    break;
                                case 1703:
                                    break;
                                case 1736:
                                    i61 = 1024;
                                    break;
                                case 1769:
                                    boolean zM4044 = C0212.m4041(qVar, j11);
                                    int i88 = 54533;
                                    while (true) {
                                        i88 ^= 54550;
                                        switch (i88) {
                                            case 19:
                                                i88 = zM4044 ? 54626 : 54595;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 85:
                                                i61 = 1024;
                                                break;
                                            case 116:
                                                i61 = 2048;
                                                int i89 = 54657;
                                                while (true) {
                                                    i89 ^= 54674;
                                                    switch (i89) {
                                                        case 19:
                                                            i89 = 54688;
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
                                    break;
                                default:
                                    break;
                            }
                        }
                        i13 = (i13 & i61) | (i13 ^ i61);
                        int i90 = 55432;
                        while (true) {
                            i90 ^= 55449;
                            switch (i90) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i90 = 55463;
                                    continue;
                                case 62:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 83:
                        break;
                    default:
                        break;
                }
            }
            int i91 = i12 & (C0399.f669 ^ 646);
            int i92 = 55556;
            while (true) {
                i92 ^= 55573;
                switch (i92) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i92 = i91 != 0 ? 55649 : 55618;
                        break;
                    case 54:
                        break;
                    case 87:
                        int i93 = C0178.f202;
                        int i94 = 56455;
                        while (true) {
                            i94 ^= 56472;
                            switch (i94) {
                                case 31:
                                    i94 = ((i93 ^ 24731) & i11) == 0 ? 56548 : 56517;
                                    break;
                                case 62:
                                    break;
                                case 93:
                                    i60 = 55680;
                                    while (true) {
                                        i60 ^= 55697;
                                        switch (i60) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i60 = 56362;
                                                continue;
                                                continue;
                                            case 1467:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                    }
                                    break;
                                case 124:
                                    boolean zM1859 = C0087.m1859(qVar, i10);
                                    int i95 = 56579;
                                    while (true) {
                                        i95 ^= 56596;
                                        switch (i95) {
                                            case 23:
                                                i95 = zM1859 ? 1507472 : 56641;
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                i16 = 8192;
                                                break;
                                            case 1564036:
                                                i16 = 16384;
                                                int i96 = 1507503;
                                                while (true) {
                                                    i96 ^= 1507520;
                                                    switch (i96) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 111:
                                                            i96 = 1507534;
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
                                    i13 = (i13 & i16) | (i13 ^ i16);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 116:
                        i13 |= C0176.f200 ^ (-25377);
                        i60 = 55680;
                        while (true) {
                            i60 ^= 55697;
                            switch (i60) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i60 = 56362;
                                    continue;
                                    continue;
                                case 1467:
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
                int i97 = C0077.f111;
                int i98 = 1507627;
                while (true) {
                    i98 ^= 1507644;
                    switch (i98) {
                        case 23:
                            i98 = ((i97 ^ (-9729)) & i13) == 9362 ? 1507720 : 1507689;
                            break;
                        case 85:
                            C0309.m5960(qVar);
                            i18 = 1509425;
                            while (true) {
                                i18 ^= 1509442;
                                switch (i18) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        i46 = 1511471;
                                        while (true) {
                                            i46 ^= 1511488;
                                            switch (i46) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 111:
                                                    i46 = i71 != 0 ? 1511564 : 1511533;
                                                    break;
                                                case 204:
                                                    oVar = C0227.m4370();
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i47 = C0375.f645;
                                        i48 = 1511595;
                                        while (true) {
                                            i48 ^= 1511612;
                                            switch (i48) {
                                                case 23:
                                                    i48 = ((i47 ^ (-782)) & i12) != 0 ? 1512339 : 1512308;
                                                    break;
                                                case 815:
                                                    C0443.m8633();
                                                    C0262.m4990(qVar, (-914313179) ^ C0193.f217);
                                                    C0411.m8061();
                                                    j10 = C0235.m4507(C0137.f163 ^ 120, qVar);
                                                    C0171.m3270(qVar, false);
                                                    i13 &= C0287.f431 ^ (-741);
                                                    break;
                                                case 968:
                                                    break;
                                                case 1001:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i49 = C0450.f720;
                                        i50 = 1512370;
                                        while (true) {
                                            i50 ^= 1512387;
                                            switch (i50) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    break;
                                                case 113:
                                                    i50 = ((i49 ^ 352) & i12) != 0 ? 1512463 : 1512432;
                                                    break;
                                                case 1996:
                                                    C0443.m8633();
                                                    C0262.m4990(qVar, (-1677541418) ^ C0230.f309);
                                                    C0411.m8061();
                                                    j11 = C0235.m4507(C0399.f669 ^ 698, qVar);
                                                    C0171.m3270(qVar, false);
                                                    i13 &= C0238.f317 ^ 7782;
                                                    i52 = 1512494;
                                                    while (true) {
                                                        i52 ^= 1512511;
                                                        switch (i52) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i52 = 1512525;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            case 114:
                                                                break;
                                                            default:
                                                                continue;
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
                                        i51 = 1513269;
                                        while (true) {
                                            i51 ^= 1513286;
                                            switch (i51) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 53:
                                                    i20 = i13;
                                                    i19 = i10;
                                                    j13 = j11;
                                                    j12 = j10;
                                                    break;
                                                case 115:
                                                    i51 = i91 != 0 ? 1513362 : 1513331;
                                                    break;
                                                case 212:
                                                    C0443.m8633();
                                                    i20 = i13;
                                                    i19 = 0;
                                                    j13 = j11;
                                                    j12 = j10;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 115:
                                        i18 = ((i11 ^ (-2)) & i11) != 0 ? 1509518 : 1509487;
                                        break;
                                    case 204:
                                        zM5148 = C0270.m5148(qVar);
                                        i53 = 1509549;
                                        while (true) {
                                            i53 ^= 1509566;
                                            switch (i53) {
                                                case 19:
                                                    i53 = zM5148 ? 1509642 : 1509611;
                                                    break;
                                                case 85:
                                                    C0471.m9156(qVar);
                                                    i54 = C0473.f743;
                                                    i55 = 1510448;
                                                    while (true) {
                                                        i55 ^= 1510465;
                                                        switch (i55) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 47:
                                                                break;
                                                            case 113:
                                                                i55 = ((i54 ^ (-554)) & i12) != 0 ? 1510541 : 1510510;
                                                                break;
                                                            case 204:
                                                                i13 &= C0054.f74 ^ (-719);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i56 = C0010.f30;
                                                    i57 = 1510572;
                                                    while (true) {
                                                        i57 ^= 1510589;
                                                        switch (i57) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i57 = ((i56 ^ 889) & i12) != 0 ? 1511316 : 1510634;
                                                                break;
                                                            case 87:
                                                                break;
                                                            case 118:
                                                                break;
                                                            case 809:
                                                                i13 &= C0125.f151 ^ (-7978);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i58 = 1511347;
                                                    while (true) {
                                                        i58 ^= 1511364;
                                                        switch (i58) {
                                                            case 22:
                                                                i20 = i13;
                                                                i19 = i10;
                                                                j13 = j11;
                                                                j12 = j10;
                                                                break;
                                                            case 119:
                                                                i58 = 1511378;
                                                                continue;
                                                                continue;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 114:
                                                    break;
                                                case 436:
                                                    i59 = 1509673;
                                                    while (true) {
                                                        i59 ^= 1509690;
                                                        switch (i59) {
                                                            case 19:
                                                                i59 = 1510355;
                                                                continue;
                                                                continue;
                                                            case 745:
                                                                break;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                        i46 = 1511471;
                                                        while (true) {
                                                            i46 ^= 1511488;
                                                            switch (i46) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    break;
                                                                case 111:
                                                                    if (i71 != 0) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    oVar = C0227.m4370();
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i47 = C0375.f645;
                                                        i48 = 1511595;
                                                        while (true) {
                                                            i48 ^= 1511612;
                                                            switch (i48) {
                                                                case 23:
                                                                    if (((i47 ^ (-782)) & i12) != 0) {
                                                                    }
                                                                    break;
                                                                case 815:
                                                                    C0443.m8633();
                                                                    C0262.m4990(qVar, (-914313179) ^ C0193.f217);
                                                                    C0411.m8061();
                                                                    j10 = C0235.m4507(C0137.f163 ^ 120, qVar);
                                                                    C0171.m3270(qVar, false);
                                                                    i13 &= C0287.f431 ^ (-741);
                                                                    break;
                                                                case 968:
                                                                    break;
                                                                case 1001:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i49 = C0450.f720;
                                                        i50 = 1512370;
                                                        while (true) {
                                                            i50 ^= 1512387;
                                                            switch (i50) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 113:
                                                                    if (((i49 ^ 352) & i12) != 0) {
                                                                    }
                                                                    break;
                                                                case 1996:
                                                                    C0443.m8633();
                                                                    C0262.m4990(qVar, (-1677541418) ^ C0230.f309);
                                                                    C0411.m8061();
                                                                    j11 = C0235.m4507(C0399.f669 ^ 698, qVar);
                                                                    C0171.m3270(qVar, false);
                                                                    i13 &= C0238.f317 ^ 7782;
                                                                    i52 = 1512494;
                                                                    while (true) {
                                                                        i52 ^= 1512511;
                                                                        switch (i52) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i52 = 1512525;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 114:
                                                                                break;
                                                                            default:
                                                                                continue;
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
                                                        i51 = 1513269;
                                                        while (true) {
                                                            i51 ^= 1513286;
                                                            switch (i51) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    i20 = i13;
                                                                    i19 = i10;
                                                                    j13 = j11;
                                                                    j12 = j10;
                                                                    break;
                                                                case 115:
                                                                    if (i91 != 0) {
                                                                    }
                                                                    break;
                                                                case 212:
                                                                    C0443.m8633();
                                                                    i20 = i13;
                                                                    i19 = 0;
                                                                    j13 = j11;
                                                                    j12 = j10;
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
                                C0103.m2025(qVar);
                                C0262.m4990(qVar, (-1348540996) ^ C0021.f41);
                                i21 = C0160.f184;
                                i22 = 1513393;
                                while (true) {
                                    i22 ^= 1513410;
                                    switch (i22) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            z10 = false;
                                            break;
                                        case 115:
                                            i22 = ((i21 ^ 741) & i20) == 4 ? 1513486 : 1513455;
                                            break;
                                        case 4044:
                                            z10 = true;
                                            i45 = 1513517;
                                            while (true) {
                                                i45 ^= 1513534;
                                                switch (i45) {
                                                    case 19:
                                                        i45 = 1514199;
                                                        continue;
                                                        continue;
                                                    case 745:
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
                                objM8078 = C0412.m8078(qVar);
                                objM2417 = C0125.m2417();
                                i23 = 1514292;
                                while (true) {
                                    i23 ^= 1514309;
                                    switch (i23) {
                                        case 22:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                            objM8078 = new a2(aVar, 0);
                                            C0479.m9328(qVar, objM8078);
                                            break;
                                        case 113:
                                            i23 = !z10 ? 1514385 : 1514354;
                                            break;
                                        case 212:
                                            i44 = 1514416;
                                            while (true) {
                                                i44 ^= 1514433;
                                                switch (i44) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 47:
                                                        break;
                                                    case 113:
                                                        i44 = objM8078 == objM2417 ? 1515160 : 1514478;
                                                        break;
                                                    case 1369:
                                                        objM8078 = new a2(aVar, 0);
                                                        C0479.m9328(qVar, objM8078);
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
                                aVar2 = (c9.a) objM8078;
                                C0171.m3270(qVar, false);
                                y0.o oVarM8743 = C0449.m8743(oVar, C0205.m3921());
                                C0262.m4990(qVar, 1348540842 ^ C0291.f438);
                                zM2013 = C0103.m2013(qVar, aVar2);
                                objM8079 = C0412.m8078(qVar);
                                i24 = 1515191;
                                while (true) {
                                    i24 ^= 1515208;
                                    switch (i24) {
                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                            break;
                                        case 61:
                                            objM8079 = new s(aVar2, 2);
                                            C0479.m9328(qVar, objM8079);
                                            break;
                                        case 127:
                                            i24 = !zM2013 ? 1515284 : 1515253;
                                            break;
                                        case 476:
                                            i43 = 1515315;
                                            while (true) {
                                                i43 ^= 1515332;
                                                switch (i43) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 119:
                                                        i43 = objM8079 == objM2417 ? 1515408 : 1515377;
                                                        break;
                                                    case 212:
                                                        objM8079 = new s(aVar2, 2);
                                                        C0479.m9328(qVar, objM8079);
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
                                C0171.m3270(qVar, false);
                                oVarM8345 = C0426.m8345(C0039.m758(oVarM8743, true, (c9.c) objM8079), C0193.m3707(), C0240.m4594());
                                C0262.m4990(qVar, 1348541159 ^ C0074.f108);
                                i25 = C0164.f188;
                                i26 = C0081.f115;
                                i27 = 1515439;
                                while (true) {
                                    i27 ^= 1515456;
                                    switch (i27) {
                                        case 111:
                                            i27 = (((i25 ^ 7581) & i20) ^ (i26 ^ 3256)) > 2048 ? 1516183 : 1516152;
                                            break;
                                        case 15703:
                                            zM4042 = C0212.m4041(qVar, j13);
                                            i42 = 1516214;
                                            while (true) {
                                                i42 ^= 1516231;
                                                switch (i42) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        z11 = true;
                                                        i39 = 1537294;
                                                        while (true) {
                                                            i39 ^= 1537311;
                                                            switch (i39) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i39 = 1537325;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 113:
                                                        i42 = !zM4042 ? 1516307 : 1516276;
                                                        break;
                                                    case 468:
                                                        i40 = C0362.f632;
                                                        i41 = 1516338;
                                                        while (true) {
                                                            i41 ^= 1516355;
                                                            switch (i41) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    z11 = false;
                                                                    break;
                                                                case 113:
                                                                    i41 = ((i40 ^ 3105) & i20) == 2048 ? 1537263 : 1516400;
                                                                    break;
                                                                case 22444:
                                                                    z11 = true;
                                                                    i39 = 1537294;
                                                                    while (true) {
                                                                        i39 ^= 1537311;
                                                                        switch (i39) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i39 = 1537325;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
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
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 15769:
                                            break;
                                        case 15800:
                                            i40 = C0362.f632;
                                            i41 = 1516338;
                                            while (true) {
                                                i41 ^= 1516355;
                                                switch (i41) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        z11 = false;
                                                        break;
                                                    case 113:
                                                        if (((i40 ^ 3105) & i20) == 2048) {
                                                        }
                                                        break;
                                                    case 22444:
                                                        z11 = true;
                                                        i39 = 1537294;
                                                        while (true) {
                                                            i39 ^= 1537311;
                                                            switch (i39) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i39 = 1537325;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
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
                                        default:
                                            break;
                                    }
                                    i28 = 1537418;
                                    while (true) {
                                        i28 ^= 1537435;
                                        switch (i28) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i28 = (57344 & ((i20 ^ (-1)) ^ 57344)) == 16384 ? 1537511 : 1537480;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 83:
                                                z12 = false;
                                                break;
                                            case 124:
                                                z12 = true;
                                                i38 = 1537542;
                                                while (true) {
                                                    i38 ^= 1537559;
                                                    switch (i38) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i38 = 1538224;
                                                            continue;
                                                            continue;
                                                        case 3751:
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
                                    boolean z15 = (z11 & z12) | (z12 ^ z11);
                                    boolean zM2015 = C0103.m2013(qVar, aVar2);
                                    z13 = (z15 ^ zM2015) | (z15 & zM2015);
                                    i29 = C0227.f306;
                                    i30 = C0224.f303;
                                    i31 = 1538317;
                                    while (true) {
                                        i31 ^= 1538334;
                                        switch (i31) {
                                            case 19:
                                                i31 = (((i29 ^ 199) & i20) ^ (i30 ^ (-361))) > 256 ? 1538410 : 1538379;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 85:
                                                i35 = C0014.f34;
                                                i36 = 1539216;
                                                while (true) {
                                                    i36 ^= 1539233;
                                                    switch (i36) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 49:
                                                            i36 = ((i35 ^ 578) & i20) == 256 ? 1539309 : 1539278;
                                                            break;
                                                        case 76:
                                                            z14 = true;
                                                            i34 = 1539340;
                                                            while (true) {
                                                                i34 ^= 1539357;
                                                                switch (i34) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i34 = 1539371;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 111:
                                                            z14 = false;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 116:
                                                zM4041 = C0212.m4041(qVar, j12);
                                                i37 = 1538441;
                                                while (true) {
                                                    i37 ^= 1538458;
                                                    switch (i37) {
                                                        case 19:
                                                            i37 = !zM4041 ? 1539185 : 1538503;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 93:
                                                            z14 = true;
                                                            i34 = 1539340;
                                                            while (true) {
                                                                i34 ^= 1539357;
                                                                switch (i34) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i34 = 1539371;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 1515:
                                                            i35 = C0014.f34;
                                                            i36 = 1539216;
                                                            while (true) {
                                                                i36 ^= 1539233;
                                                                switch (i36) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 49:
                                                                        if (((i35 ^ 578) & i20) == 256) {
                                                                        }
                                                                        break;
                                                                    case 76:
                                                                        z14 = true;
                                                                        i34 = 1539340;
                                                                        while (true) {
                                                                            i34 ^= 1539357;
                                                                            switch (i34) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i34 = 1539371;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 111:
                                                                        z14 = false;
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
                                        objM80710 = C0412.m8078(qVar);
                                        i32 = 1539464;
                                        while (true) {
                                            i32 ^= 1539481;
                                            switch (i32) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i32 = !((z13 ^ z14) | (z13 & z14)) ? 1540208 : 1540177;
                                                    break;
                                                case 64939:
                                                    break;
                                                case 64968:
                                                    y1 y1Var = new y1(j13, i19, aVar2, j12);
                                                    C0479.m9328(qVar, y1Var);
                                                    obj = y1Var;
                                                    break;
                                                case 65001:
                                                    i33 = 1540239;
                                                    while (true) {
                                                        i33 ^= 1540256;
                                                        switch (i33) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 47:
                                                                i33 = objM80710 == objM2417 ? 1540332 : 1540301;
                                                                break;
                                                            case 76:
                                                                y1 y1Var2 = new y1(j13, i19, aVar2, j12);
                                                                C0479.m9328(qVar, y1Var2);
                                                                obj = y1Var2;
                                                                break;
                                                            case 109:
                                                                obj = objM80710;
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
                                        C0171.m3270(qVar, false);
                                        C0227.m4350(oVarM8345, (c9.c) obj, qVar, 0);
                                        i17 = i19;
                                        j11 = j13;
                                        j10 = j12;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 118:
                            break;
                        case 180:
                            boolean zM1625 = C0074.m1625(qVar);
                            int i99 = 1507751;
                            while (true) {
                                i99 ^= 1507768;
                                switch (i99) {
                                    case 31:
                                        i99 = !zM1625 ? 1508495 : 1508464;
                                        break;
                                    case 1335:
                                        int i100 = 1508526;
                                        while (true) {
                                            i100 ^= 1508543;
                                            switch (i100) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i100 = 1508557;
                                                    continue;
                                                case 114:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            C0309.m5960(qVar);
                                            i18 = 1509425;
                                            while (true) {
                                                i18 ^= 1509442;
                                                switch (i18) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        i46 = 1511471;
                                                        while (true) {
                                                            i46 ^= 1511488;
                                                            switch (i46) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    break;
                                                                case 111:
                                                                    if (i71 != 0) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    oVar = C0227.m4370();
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i47 = C0375.f645;
                                                        i48 = 1511595;
                                                        while (true) {
                                                            i48 ^= 1511612;
                                                            switch (i48) {
                                                                case 23:
                                                                    if (((i47 ^ (-782)) & i12) != 0) {
                                                                    }
                                                                    break;
                                                                case 815:
                                                                    C0443.m8633();
                                                                    C0262.m4990(qVar, (-914313179) ^ C0193.f217);
                                                                    C0411.m8061();
                                                                    j10 = C0235.m4507(C0137.f163 ^ 120, qVar);
                                                                    C0171.m3270(qVar, false);
                                                                    i13 &= C0287.f431 ^ (-741);
                                                                    break;
                                                                case 968:
                                                                    break;
                                                                case 1001:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i49 = C0450.f720;
                                                        i50 = 1512370;
                                                        while (true) {
                                                            i50 ^= 1512387;
                                                            switch (i50) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 113:
                                                                    if (((i49 ^ 352) & i12) != 0) {
                                                                    }
                                                                    break;
                                                                case 1996:
                                                                    C0443.m8633();
                                                                    C0262.m4990(qVar, (-1677541418) ^ C0230.f309);
                                                                    C0411.m8061();
                                                                    j11 = C0235.m4507(C0399.f669 ^ 698, qVar);
                                                                    C0171.m3270(qVar, false);
                                                                    i13 &= C0238.f317 ^ 7782;
                                                                    i52 = 1512494;
                                                                    while (true) {
                                                                        i52 ^= 1512511;
                                                                        switch (i52) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i52 = 1512525;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 114:
                                                                                break;
                                                                            default:
                                                                                continue;
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
                                                        i51 = 1513269;
                                                        while (true) {
                                                            i51 ^= 1513286;
                                                            switch (i51) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    i20 = i13;
                                                                    i19 = i10;
                                                                    j13 = j11;
                                                                    j12 = j10;
                                                                    break;
                                                                case 115:
                                                                    if (i91 != 0) {
                                                                    }
                                                                    break;
                                                                case 212:
                                                                    C0443.m8633();
                                                                    i20 = i13;
                                                                    i19 = 0;
                                                                    j13 = j11;
                                                                    j12 = j10;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 115:
                                                        if (((i11 ^ (-2)) & i11) != 0) {
                                                        }
                                                        break;
                                                    case 204:
                                                        zM5148 = C0270.m5148(qVar);
                                                        i53 = 1509549;
                                                        while (true) {
                                                            i53 ^= 1509566;
                                                            switch (i53) {
                                                                case 19:
                                                                    if (zM5148) {
                                                                    }
                                                                    break;
                                                                case 85:
                                                                    C0471.m9156(qVar);
                                                                    i54 = C0473.f743;
                                                                    i55 = 1510448;
                                                                    while (true) {
                                                                        i55 ^= 1510465;
                                                                        switch (i55) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 47:
                                                                                break;
                                                                            case 113:
                                                                                if (((i54 ^ (-554)) & i12) != 0) {
                                                                                }
                                                                                break;
                                                                            case 204:
                                                                                i13 &= C0054.f74 ^ (-719);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i56 = C0010.f30;
                                                                    i57 = 1510572;
                                                                    while (true) {
                                                                        i57 ^= 1510589;
                                                                        switch (i57) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (((i56 ^ 889) & i12) != 0) {
                                                                                }
                                                                                break;
                                                                            case 87:
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 809:
                                                                                i13 &= C0125.f151 ^ (-7978);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i58 = 1511347;
                                                                    while (true) {
                                                                        i58 ^= 1511364;
                                                                        switch (i58) {
                                                                            case 22:
                                                                                i20 = i13;
                                                                                i19 = i10;
                                                                                j13 = j11;
                                                                                j12 = j10;
                                                                                break;
                                                                            case 119:
                                                                                i58 = 1511378;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    i59 = 1509673;
                                                                    while (true) {
                                                                        i59 ^= 1509690;
                                                                        switch (i59) {
                                                                            case 19:
                                                                                i59 = 1510355;
                                                                                continue;
                                                                                continue;
                                                                            case 745:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i46 = 1511471;
                                                                        while (true) {
                                                                            i46 ^= 1511488;
                                                                            switch (i46) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 111:
                                                                                    if (i71 != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 204:
                                                                                    oVar = C0227.m4370();
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i47 = C0375.f645;
                                                                        i48 = 1511595;
                                                                        while (true) {
                                                                            i48 ^= 1511612;
                                                                            switch (i48) {
                                                                                case 23:
                                                                                    if (((i47 ^ (-782)) & i12) != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 815:
                                                                                    C0443.m8633();
                                                                                    C0262.m4990(qVar, (-914313179) ^ C0193.f217);
                                                                                    C0411.m8061();
                                                                                    j10 = C0235.m4507(C0137.f163 ^ 120, qVar);
                                                                                    C0171.m3270(qVar, false);
                                                                                    i13 &= C0287.f431 ^ (-741);
                                                                                    break;
                                                                                case 968:
                                                                                    break;
                                                                                case 1001:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i49 = C0450.f720;
                                                                        i50 = 1512370;
                                                                        while (true) {
                                                                            i50 ^= 1512387;
                                                                            switch (i50) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    break;
                                                                                case 113:
                                                                                    if (((i49 ^ 352) & i12) != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 1996:
                                                                                    C0443.m8633();
                                                                                    C0262.m4990(qVar, (-1677541418) ^ C0230.f309);
                                                                                    C0411.m8061();
                                                                                    j11 = C0235.m4507(C0399.f669 ^ 698, qVar);
                                                                                    C0171.m3270(qVar, false);
                                                                                    i13 &= C0238.f317 ^ 7782;
                                                                                    i52 = 1512494;
                                                                                    while (true) {
                                                                                        i52 ^= 1512511;
                                                                                        switch (i52) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i52 = 1512525;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case 114:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
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
                                                                        i51 = 1513269;
                                                                        while (true) {
                                                                            i51 ^= 1513286;
                                                                            switch (i51) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 53:
                                                                                    i20 = i13;
                                                                                    i19 = i10;
                                                                                    j13 = j11;
                                                                                    j12 = j10;
                                                                                    break;
                                                                                case 115:
                                                                                    if (i91 != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 212:
                                                                                    C0443.m8633();
                                                                                    i20 = i13;
                                                                                    i19 = 0;
                                                                                    j13 = j11;
                                                                                    j12 = j10;
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
                                                C0103.m2025(qVar);
                                                C0262.m4990(qVar, (-1348540996) ^ C0021.f41);
                                                i21 = C0160.f184;
                                                i22 = 1513393;
                                                while (true) {
                                                    i22 ^= 1513410;
                                                    switch (i22) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            z10 = false;
                                                            break;
                                                        case 115:
                                                            if (((i21 ^ 741) & i20) == 4) {
                                                            }
                                                            break;
                                                        case 4044:
                                                            z10 = true;
                                                            i45 = 1513517;
                                                            while (true) {
                                                                i45 ^= 1513534;
                                                                switch (i45) {
                                                                    case 19:
                                                                        i45 = 1514199;
                                                                        continue;
                                                                        continue;
                                                                    case 745:
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
                                                objM8078 = C0412.m8078(qVar);
                                                objM2417 = C0125.m2417();
                                                i23 = 1514292;
                                                while (true) {
                                                    i23 ^= 1514309;
                                                    switch (i23) {
                                                        case 22:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                            objM8078 = new a2(aVar, 0);
                                                            C0479.m9328(qVar, objM8078);
                                                            break;
                                                        case 113:
                                                            if (!z10) {
                                                            }
                                                            break;
                                                        case 212:
                                                            i44 = 1514416;
                                                            while (true) {
                                                                i44 ^= 1514433;
                                                                switch (i44) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 47:
                                                                        break;
                                                                    case 113:
                                                                        if (objM8078 == objM2417) {
                                                                        }
                                                                        break;
                                                                    case 1369:
                                                                        objM8078 = new a2(aVar, 0);
                                                                        C0479.m9328(qVar, objM8078);
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
                                                aVar2 = (c9.a) objM8078;
                                                C0171.m3270(qVar, false);
                                                y0.o oVarM8744 = C0449.m8743(oVar, C0205.m3921());
                                                C0262.m4990(qVar, 1348540842 ^ C0291.f438);
                                                zM2013 = C0103.m2013(qVar, aVar2);
                                                objM8079 = C0412.m8078(qVar);
                                                i24 = 1515191;
                                                while (true) {
                                                    i24 ^= 1515208;
                                                    switch (i24) {
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                            break;
                                                        case 61:
                                                            objM8079 = new s(aVar2, 2);
                                                            C0479.m9328(qVar, objM8079);
                                                            break;
                                                        case 127:
                                                            if (!zM2013) {
                                                            }
                                                            break;
                                                        case 476:
                                                            i43 = 1515315;
                                                            while (true) {
                                                                i43 ^= 1515332;
                                                                switch (i43) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 119:
                                                                        if (objM8079 == objM2417) {
                                                                        }
                                                                        break;
                                                                    case 212:
                                                                        objM8079 = new s(aVar2, 2);
                                                                        C0479.m9328(qVar, objM8079);
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
                                                C0171.m3270(qVar, false);
                                                oVarM8345 = C0426.m8345(C0039.m758(oVarM8744, true, (c9.c) objM8079), C0193.m3707(), C0240.m4594());
                                                C0262.m4990(qVar, 1348541159 ^ C0074.f108);
                                                i25 = C0164.f188;
                                                i26 = C0081.f115;
                                                i27 = 1515439;
                                                while (true) {
                                                    i27 ^= 1515456;
                                                    switch (i27) {
                                                        case 111:
                                                            if ((((i25 ^ 7581) & i20) ^ (i26 ^ 3256)) > 2048) {
                                                            }
                                                            break;
                                                        case 15703:
                                                            zM4042 = C0212.m4041(qVar, j13);
                                                            i42 = 1516214;
                                                            while (true) {
                                                                i42 ^= 1516231;
                                                                switch (i42) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        z11 = true;
                                                                        i39 = 1537294;
                                                                        while (true) {
                                                                            i39 ^= 1537311;
                                                                            switch (i39) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i39 = 1537325;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 113:
                                                                        if (!zM4042) {
                                                                        }
                                                                        break;
                                                                    case 468:
                                                                        i40 = C0362.f632;
                                                                        i41 = 1516338;
                                                                        while (true) {
                                                                            i41 ^= 1516355;
                                                                            switch (i41) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    z11 = false;
                                                                                    break;
                                                                                case 113:
                                                                                    if (((i40 ^ 3105) & i20) == 2048) {
                                                                                    }
                                                                                    break;
                                                                                case 22444:
                                                                                    z11 = true;
                                                                                    i39 = 1537294;
                                                                                    while (true) {
                                                                                        i39 ^= 1537311;
                                                                                        switch (i39) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i39 = 1537325;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
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
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 15769:
                                                            break;
                                                        case 15800:
                                                            i40 = C0362.f632;
                                                            i41 = 1516338;
                                                            while (true) {
                                                                i41 ^= 1516355;
                                                                switch (i41) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        z11 = false;
                                                                        break;
                                                                    case 113:
                                                                        if (((i40 ^ 3105) & i20) == 2048) {
                                                                        }
                                                                        break;
                                                                    case 22444:
                                                                        z11 = true;
                                                                        i39 = 1537294;
                                                                        while (true) {
                                                                            i39 ^= 1537311;
                                                                            switch (i39) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i39 = 1537325;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
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
                                                        default:
                                                            break;
                                                    }
                                                    i28 = 1537418;
                                                    while (true) {
                                                        i28 ^= 1537435;
                                                        switch (i28) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if ((57344 & ((i20 ^ (-1)) ^ 57344)) == 16384) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                z12 = false;
                                                                break;
                                                            case 124:
                                                                z12 = true;
                                                                i38 = 1537542;
                                                                while (true) {
                                                                    i38 ^= 1537559;
                                                                    switch (i38) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i38 = 1538224;
                                                                            continue;
                                                                            continue;
                                                                        case 3751:
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
                                                    boolean z16 = (z11 & z12) | (z12 ^ z11);
                                                    boolean zM2016 = C0103.m2013(qVar, aVar2);
                                                    z13 = (z16 ^ zM2016) | (z16 & zM2016);
                                                    i29 = C0227.f306;
                                                    i30 = C0224.f303;
                                                    i31 = 1538317;
                                                    while (true) {
                                                        i31 ^= 1538334;
                                                        switch (i31) {
                                                            case 19:
                                                                if ((((i29 ^ 199) & i20) ^ (i30 ^ (-361))) > 256) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 85:
                                                                i35 = C0014.f34;
                                                                i36 = 1539216;
                                                                while (true) {
                                                                    i36 ^= 1539233;
                                                                    switch (i36) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 49:
                                                                            if (((i35 ^ 578) & i20) == 256) {
                                                                            }
                                                                            break;
                                                                        case 76:
                                                                            z14 = true;
                                                                            i34 = 1539340;
                                                                            while (true) {
                                                                                i34 ^= 1539357;
                                                                                switch (i34) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i34 = 1539371;
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 111:
                                                                            z14 = false;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 116:
                                                                zM4041 = C0212.m4041(qVar, j12);
                                                                i37 = 1538441;
                                                                while (true) {
                                                                    i37 ^= 1538458;
                                                                    switch (i37) {
                                                                        case 19:
                                                                            if (!zM4041) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 93:
                                                                            z14 = true;
                                                                            i34 = 1539340;
                                                                            while (true) {
                                                                                i34 ^= 1539357;
                                                                                switch (i34) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i34 = 1539371;
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1515:
                                                                            i35 = C0014.f34;
                                                                            i36 = 1539216;
                                                                            while (true) {
                                                                                i36 ^= 1539233;
                                                                                switch (i36) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 49:
                                                                                        if (((i35 ^ 578) & i20) == 256) {
                                                                                        }
                                                                                        break;
                                                                                    case 76:
                                                                                        z14 = true;
                                                                                        i34 = 1539340;
                                                                                        while (true) {
                                                                                            i34 ^= 1539357;
                                                                                            switch (i34) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i34 = 1539371;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 111:
                                                                                        z14 = false;
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
                                                        objM80710 = C0412.m8078(qVar);
                                                        i32 = 1539464;
                                                        while (true) {
                                                            i32 ^= 1539481;
                                                            switch (i32) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!((z13 ^ z14) | (z13 & z14))) {
                                                                    }
                                                                    break;
                                                                case 64939:
                                                                    break;
                                                                case 64968:
                                                                    y1 y1Var3 = new y1(j13, i19, aVar2, j12);
                                                                    C0479.m9328(qVar, y1Var3);
                                                                    obj = y1Var3;
                                                                    break;
                                                                case 65001:
                                                                    i33 = 1540239;
                                                                    while (true) {
                                                                        i33 ^= 1540256;
                                                                        switch (i33) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 47:
                                                                                if (objM80710 == objM2417) {
                                                                                }
                                                                                break;
                                                                            case 76:
                                                                                y1 y1Var4 = new y1(j13, i19, aVar2, j12);
                                                                                C0479.m9328(qVar, y1Var4);
                                                                                obj = y1Var4;
                                                                                break;
                                                                            case 109:
                                                                                obj = objM80710;
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
                                                        C0171.m3270(qVar, false);
                                                        C0227.m4350(oVarM8345, (c9.c) obj, qVar, 0);
                                                        i17 = i19;
                                                        j11 = j13;
                                                        j10 = j12;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 1480:
                                        C0471.m9156(qVar);
                                        int i101 = 1508650;
                                        while (true) {
                                            i101 ^= 1508667;
                                            switch (i101) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i101 = 1508681;
                                                    continue;
                                                case 114:
                                                    i17 = i10;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
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
                    m0.x1 x1VarM7533 = C0385.m7533(qVar);
                    int i102 = 1540363;
                    while (true) {
                        i102 ^= 1540380;
                        switch (i102) {
                            case 23:
                                if (x1VarM7533 != null) {
                                    i102 = 1541107;
                                }
                                break;
                            case 54:
                                break;
                            case 85:
                                return;
                            case 751:
                                x1VarM7533.f11756d = new z1(aVar, oVar, j10, j11, i17, i11, i12);
                                return;
                            default:
                                continue;
                        }
                        i102 = 1540425;
                    }
                }
            }
        }
    }

    public static final void c(g1.g gVar, float f10, float f11, long j10, g1.k kVar) {
        int i10 = 0;
        long jM2401 = 0;
        long jM1788 = 0;
        String str = "ۤۨ۟";
        int i11 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float fM3617 = 0.0f;
        float f14 = 0.0f;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56419:
                    str = "ۨۦۨ";
                    f13 = fM3617 / f14;
                    break;
                case 1746687:
                    jM2401 = C0164.m3152(f13, f13);
                    str = "ۨ۠ۨ";
                    break;
                case 1746820:
                    return;
                case 1746851:
                    str = "ۧۡ۟";
                    fM3617 = f14 - f12;
                    break;
                case 1747807:
                    str = "۟ۤۨ";
                    f14 = fM3617 + 16.0f;
                    break;
                case 1749702:
                    str = "ۥۥۢ";
                    i11 = C0374.f644;
                    break;
                case 1750563:
                    str = "ۧۢۦ";
                    fM3617 = C0344.m6741(jM2401);
                    break;
                case 1751777:
                    str = "ۦۨۦ";
                    i11 = C0416.f686;
                    break;
                case 1752642:
                    i10 = i11 ^ (-857);
                    str = "ۧۢ۟";
                    break;
                case 1753700:
                    i10 = i11 ^ 782;
                    str = "ۣۨۨ";
                    break;
                case 1754437:
                    str = "۟۟۟";
                    f14 = fM3617 - 16.0f;
                    break;
                case 1754468:
                    str = "ۣۦ";
                    f14 = i10;
                    break;
                case 1754475:
                    str = "ۣ۠ۤ";
                    f12 = f14 * f13;
                    break;
                case 1755376:
                    jM1788 = C0083.m1788(f14, f14);
                    str = "ۤۨۥ";
                    break;
                case 1755562:
                    jM2401 = C0124.m2401(gVar);
                    str = "ۣ۠۠";
                    break;
                case 1755619:
                    C0379.m7404(gVar, j10, f10, f11, jM2401, jM1788, 1.0f, kVar, null, i10);
                    str = "ۣ۟ۨ";
                    break;
                default:
                    str = "ۣۢۧ";
                    fM3617 = C0189.m3617(kVar);
                    break;
            }
        }
    }

    public static final void d(g1.g gVar, float f10, long j10, float f11, int i10) {
        boolean z10;
        float f12;
        float f13;
        float fM6741 = C0344.m6741(C0124.m2401(gVar));
        float fM8158 = C0416.m8158(C0124.m2401(gVar));
        float f14 = C0393.f663 ^ 579;
        float f15 = fM8158 / f14;
        m2.l lVarM8914 = C0458.m8914(gVar);
        m2.l lVarM2798 = C0146.m2798();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = lVarM8914 == lVarM2798 ? 1709 : 1678;
                    break;
                case 204:
                    z10 = true;
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    z10 = false;
                    break;
                default:
                    break;
            }
        }
        int i13 = 1864;
        while (true) {
            i13 ^= 1881;
            switch (i13) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i13 = z10 ? 48736 : 48705;
                    break;
                case 47384:
                    f12 = ((1.0f - 9.0f) - f10) + 9.0f;
                    break;
                case 47417:
                    f12 = 0.0f;
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i14 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        float f16 = f12 * fM6741;
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    f13 = 1.0f;
                    break;
                case 503:
                    i15 = z10 ? 49635 : 48953;
                    break;
                case 32495:
                    f13 = f10;
                    break;
                default:
                    break;
            }
        }
        float f17 = f13 * fM6741;
        boolean zM1840 = C0086.m1840(i10, 0);
        int i16 = 49666;
        while (true) {
            i16 ^= 49683;
            switch (i16) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zM1840) {
                        i16 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    int i17 = 49790;
                    while (true) {
                        i17 ^= 49807;
                        switch (i17) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                float f18 = f11 / f14;
                                i9.d dVar = new i9.d(f18, ((fM6741 + 3.0f) - f18) - 3.0f);
                                float fM3299 = C0173.m3299((Number) C0414.m8110(C0218.m4139(f16), dVar));
                                float fM32910 = C0173.m3299((Number) C0414.m8110(C0218.m4139(f17), dVar));
                                float fM6714 = C0343.m6714(((9.0f + f10) - 0.0f) - 9.0f);
                                int i18 = 50689;
                                while (true) {
                                    i18 ^= 50706;
                                    switch (i18) {
                                        case 19:
                                            if (fM6714 > 0.0f) {
                                                i18 = 50782;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            return;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0426.m8335(gVar, j10, C0164.m3152(fM3299, f15), C0164.m3152(fM32910, f15), f11, i10, C0212.f235 ^ 970);
                                            int i19 = 50813;
                                            while (true) {
                                                i19 ^= 50830;
                                                switch (i19) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        return;
                                                    case 243:
                                                        i19 = 50844;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i18 = 50751;
                                }
                                break;
                            case 84:
                                int i20 = 49914;
                                while (true) {
                                    i20 ^= 49931;
                                    switch (i20) {
                                        case 497:
                                            i20 = 50596;
                                            break;
                                        case 1711:
                                            break;
                                    }
                                }
                                break;
                            case 241:
                                if (fM8158 > fM6741) {
                                    i17 = 49883;
                                }
                                break;
                            default:
                                continue;
                        }
                        i17 = 49852;
                    }
                    break;
                case 83:
                    break;
                default:
                    continue;
            }
            i16 = 49728;
        }
        C0426.m8335(gVar, j10, C0164.m3152(f16, f15), C0164.m3152(f17, f15), f11, 0, C0353.f623 ^ (-899));
    }

    /* JADX INFO: renamed from: ۡۥۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6415() {
        int iM1332 = C0069.m1332();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1332 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f485short;
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
}
