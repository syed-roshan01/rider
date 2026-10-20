package k6;

import a3.C0006;
import a8.C0009;
import a8.C0010;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import androidx.compose.ui.draw.C0029;
import androidx.startup.C0047;
import c1.C0058;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.emulators.C0140;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.gson.internal.sql.C0208;
import d2.C0216;
import d5.C0219;
import d7.C0221;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.lifecycle.C0238;
import e0.C0257;
import ea.C0268;
import f1.C0274;
import g4.C0290;
import g7.C0293;
import h1.C0301;
import h5.C0308;
import h5.C0309;
import h8.C0314;
import i5.C0319;
import ia.C0323;
import j5.C0328;
import l3.C0343;
import l6.C0344;
import l8.C0347;
import m5.C0355;
import m7.C0357;
import p8.C0380;
import q1.C0384;
import r.C0393;
import r5.C0401;
import s.C0408;
import s0.C0411;
import t1.C0420;
import t7.C0426;
import u0.C0431;
import v5.C0446;
import v6.C0447;
import w0.C0455;
import w2.C0459;
import w5.C0464;
import x2.C0468;
import x7.C0472;
import x7.C0473;
import y.C0476;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class i6 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f552short = {2417, 2416, 2399, 2429, 2410, 2423, 2408, 2423, 2410, 2407, 2397, 2412, 2427, 2431, 2410, 2427, 2426, 1904, 1916, 1918, 1853, 1906, 1917, 1911, 1889, 1916, 1914, 1911, 1853, 1893, 1910, 1917, 1911, 1914, 1917, 1908, 1853, 1889, 1910, 1909, 1910, 1889, 1889, 1906, 1919, 1868, 1894, 1889, 1919, 394, 414, 2477, 2489, 2488, 2467, 3001, 2990, 2989, 2990, 3001, 3001, 2990, 3001, 2262, 2282, 2288, 2285, 2293, 2275, 2272, 2286, 2279, 2210, 2273, 2275, 2295, 2277, 2282, 2294, 2210, 2283, 2284, 2210, 2285, 2284, 2243, 2273, 2294, 2283, 2292, 2283, 2294, 2299, 2241, 2288, 2279, 2275, 2294, 2279, 2278, 782, 771, 1259, 1252, 1256, 1248, 3291, 3276, 3279, 3276, 3291, 3291, 3276, 3291, 3318, 3271, 3272, 3268, 3276, 1358, 1346, 1344, 1283, 1354, 1346, 1346, 1354, 1345, 1352, 1283, 1356, 1373, 1373, 1394, 1344, 1352, 1356, 1374, 1368, 1375, 1352, 1344, 1352, 1347, 1369, 1283, 1374, 1358, 1375, 1352, 1352, 1347, 1394, 1374, 1352, 1375, 1371, 1348, 1358, 1352};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5 f10111a;

    public i6(y5 y5Var) {
        this.f10111a = y5Var;
        int iM4224 = C0219.m4224();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4224 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0121.m2341("9R2byfulIjEDnJlCj9bUESY")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6564() {
        int iM2776 = C0146.m2776();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2776 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f552short;
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

    /* JADX WARN: Code duplicated, block: B:241:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0111 A[SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundleM5269;
        int i10;
        int i11;
        String strM2549;
        boolean zM1883;
        int i12;
        int i13;
        String strM5959;
        boolean z10 = false;
        y5 y5VarM4387 = C0228.m4387(this);
        try {
            try {
                C0135.m2604(C0136.m2634(C0029.m572(y5VarM4387)), C0190.m3630(m6564(), 0, C0188.f212 ^ 120, 2334));
                Intent intentM7449 = C0380.m7449(activity);
                int i14 = 1616;
                while (true) {
                    i14 ^= 1633;
                    switch (i14) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (intentM7449 == null) {
                                i14 = 1709;
                            }
                            break;
                        case 204:
                            C0182.m3481(C0347.m6778(y5VarM4387), activity, bundle);
                            return;
                        case 239:
                            Uri uriM7841 = C0401.m7841(intentM7449);
                            int i15 = 1740;
                            while (true) {
                                i15 ^= 1757;
                                switch (i15) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = uriM7841 != null ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        bundleM5269 = C0274.m5269(intentM7449);
                                        i10 = 49790;
                                        while (true) {
                                            i10 ^= 49807;
                                            switch (i10) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    uriM7841 = null;
                                                    i11 = 50813;
                                                    while (true) {
                                                        i11 ^= 50830;
                                                        switch (i11) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 243:
                                                                i11 = 50844;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            default:
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 84:
                                                    strM2549 = C0132.m2549(bundleM5269, C0431.m8432(m6564(), 17, C0058.f78 ^ (-540), 1811));
                                                    zM1883 = C0088.m1883(strM2549);
                                                    i12 = 49914;
                                                    while (true) {
                                                        i12 ^= 49931;
                                                        switch (i12) {
                                                            case 497:
                                                                i12 = !zM1883 ? 50658 : 50627;
                                                                break;
                                                            case 1711:
                                                                break;
                                                            case 1736:
                                                                uriM7841 = null;
                                                                i11 = 50813;
                                                                while (true) {
                                                                    i11 ^= 50830;
                                                                    switch (i11) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 243:
                                                                            i11 = 50844;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 1769:
                                                                uriM7841 = C0142.m2730(strM2549);
                                                                i13 = 50689;
                                                                while (true) {
                                                                    i13 ^= 50706;
                                                                    switch (i13) {
                                                                        case 19:
                                                                            i13 = 50720;
                                                                            continue;
                                                                            continue;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                    break;
                                                case 241:
                                                    i10 = bundleM5269 != null ? 49883 : 49852;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        boolean zM5941 = C0308.m5941(uriM7841);
                                        int i16 = 1864;
                                        while (true) {
                                            i16 ^= 1881;
                                            switch (i16) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i16 = zM5941 ? 48736 : 48705;
                                                    break;
                                                case 47384:
                                                    bundleM5269 = C0274.m5269(intentM7449);
                                                    i10 = 49790;
                                                    while (true) {
                                                        i10 ^= 49807;
                                                        switch (i10) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 51:
                                                                uriM7841 = null;
                                                                i11 = 50813;
                                                                while (true) {
                                                                    i11 ^= 50830;
                                                                    switch (i11) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 243:
                                                                            i11 = 50844;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 84:
                                                                strM2549 = C0132.m2549(bundleM5269, C0431.m8432(m6564(), 17, C0058.f78 ^ (-540), 1811));
                                                                zM1883 = C0088.m1883(strM2549);
                                                                i12 = 49914;
                                                                while (true) {
                                                                    i12 ^= 49931;
                                                                    switch (i12) {
                                                                        case 497:
                                                                            if (!zM1883) {
                                                                            }
                                                                            break;
                                                                        case 1711:
                                                                            break;
                                                                        case 1736:
                                                                            uriM7841 = null;
                                                                            i11 = 50813;
                                                                            while (true) {
                                                                                i11 ^= 50830;
                                                                                switch (i11) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 243:
                                                                                        i11 = 50844;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1769:
                                                                            uriM7841 = C0142.m2730(strM2549);
                                                                            i13 = 50689;
                                                                            while (true) {
                                                                                i13 ^= 50706;
                                                                                switch (i13) {
                                                                                    case 19:
                                                                                        i13 = 50720;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                                break;
                                                            case 241:
                                                                if (bundleM5269 != null) {
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47417:
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
                                int i17 = 48767;
                                while (true) {
                                    i17 ^= 48784;
                                    switch (i17) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            int i18 = 51588;
                                            while (true) {
                                                i18 ^= 51605;
                                                switch (i18) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i18 = uriM7841 != null ? 51681 : 51650;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        break;
                                                    case 116:
                                                        boolean zM5942 = C0308.m5941(uriM7841);
                                                        int i19 = 51712;
                                                        while (true) {
                                                            i19 ^= 51729;
                                                            switch (i19) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i19 = !zM5942 ? 51805 : 51774;
                                                                    break;
                                                                case 47:
                                                                    C0355.m6951(y5VarM4387);
                                                                    boolean zM6247 = C0323.m6247(intentM7449);
                                                                    int i20 = 52611;
                                                                    while (true) {
                                                                        i20 ^= 52628;
                                                                        switch (i20) {
                                                                            case 23:
                                                                                i20 = zM6247 ? 52704 : 52673;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 85:
                                                                                strM5959 = C0309.m5959(m6564(), 51, C0010.f30 ^ 885, 2508);
                                                                                int i21 = 53510;
                                                                                while (true) {
                                                                                    i21 ^= 53527;
                                                                                    switch (i21) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i21 = 53541;
                                                                                            continue;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 116:
                                                                                strM5959 = C0140.m2696(m6564(), 49, C0290.f434 ^ (-211), 493);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i22 = 52735;
                                                                    while (true) {
                                                                        i22 ^= 52752;
                                                                        switch (i22) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                String strM180 = C0009.m180(uriM7841, C0238.m4582(m6564(), 55, C0009.f29 ^ (-445), 3019));
                                                                                int i23 = 53634;
                                                                                while (true) {
                                                                                    i23 ^= 53651;
                                                                                    switch (i23) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i23 = bundle == null ? 53727 : 53696;
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 76:
                                                                                            z10 = true;
                                                                                            break;
                                                                                        case 83:
                                                                                            int i24 = 54533;
                                                                                            while (true) {
                                                                                                i24 ^= 54550;
                                                                                                switch (i24) {
                                                                                                    case 19:
                                                                                                        i24 = 54564;
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
                                                                                int i25 = 53758;
                                                                                while (true) {
                                                                                    i25 ^= 53775;
                                                                                    switch (i25) {
                                                                                        case 1009:
                                                                                            i25 = 54440;
                                                                                            break;
                                                                                        case 1703:
                                                                                            C0343.m6719(C0208.m3979(y5VarM4387), new androidx.fragment.app.h(this, z10, uriM7841, strM5959, strM180));
                                                                                            C0182.m3481(C0347.m6778(y5VarM4387), activity, bundle);
                                                                                            return;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1007:
                                                                                i22 = 52766;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 76:
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
                                            C0182.m3481(C0347.m6778(y5VarM4387), activity, bundle);
                                            return;
                                        case 239:
                                            i17 = 48798;
                                            break;
                                    }
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i14 = 1678;
                }
            } catch (RuntimeException e4) {
                int i27 = 49666;
                while (true) {
                    i27 ^= 49683;
                    switch (i27) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i27 = 49697;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            C0420.m8245(C0455.m8871(C0029.m572(y5VarM4387)), C0357.m6992(m6564(), 63, C0476.f746 ^ (-64), 2178), e4);
                            C0182.m3481(C0347.m6778(y5VarM4387), activity, bundle);
                            return;
                    }
                }
            }
        } catch (Throwable th) {
            int i28 = 48891;
            while (true) {
                i28 ^= 48908;
                switch (i28) {
                    case 22:
                        C0182.m3481(C0347.m6778(y5VarM4387), activity, bundle);
                        throw th;
                    case 503:
                        i28 = 48922;
                        break;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        p6 p6VarM6778 = C0347.m6778(C0228.m4387(this));
        synchronized (C0393.m7687(p6VarM6778)) {
            try {
                Activity activityM8001 = C0408.m8001(p6VarM6778);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = activity == activityM8001 ? 1709 : 1678;
                            break;
                        case 204:
                            p6VarM6778.f10280g = null;
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = 1771;
                                        continue;
                                    case 54:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i12 = 1864;
                while (true) {
                    i12 ^= 1881;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = 48674;
                            break;
                        case 47483:
                            throw th;
                    }
                }
            }
        }
        boolean zM6728 = C0344.m6728(C0091.m1951(p6VarM6778));
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    C0459.m8936(C0268.m5100(p6VarM6778), activity);
                    break;
                case 76:
                    int i14 = 48891;
                    while (true) {
                        i14 ^= 48908;
                        switch (i14) {
                            case 22:
                                break;
                            case 503:
                                i14 = 48922;
                                break;
                        }
                    }
                    break;
                case 239:
                    if (!zM6728) {
                        i13 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i13 = 48829;
        }
        int iM5773 = C0301.m5773();
        int i15 = 49666;
        while (true) {
            i15 ^= 49683;
            switch (i15) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM5773 >= 0) {
                        i15 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    System.out.println(Integer.parseInt(C0219.m4218("dhy6M5qfqIoY2")));
                    return;
                case 83:
                    return;
                default:
                    continue;
            }
            i15 = 49728;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i10 = 1;
        int i11 = 0;
        p6 p6VarM6778 = C0347.m6778(C0228.m4387(this));
        synchronized (C0393.m7687(p6VarM6778)) {
            p6VarM6778.f10284k = false;
            p6VarM6778.f10281h = true;
        }
        C0014.m280((e6.c) C0166.m3176(p6VarM6778));
        long jM3820 = C0199.m3820();
        boolean zM6728 = C0344.m6728(C0091.m1951(p6VarM6778));
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM6728) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    p6VarM6778.f10276c = null;
                    C0343.m6719(C0208.m3979(p6VarM6778), new o0(p6VarM6778, jM3820, i10));
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    q6 q6VarM1772 = C0083.m1772(p6VarM6778, activity);
                    p6VarM6778.f10277d = C0473.m9197(p6VarM6778);
                    p6VarM6778.f10276c = null;
                    C0343.m6719(C0208.m3979(p6VarM6778), new c6(p6VarM6778, q6VarM1772, jM3820));
                    break;
                default:
                    continue;
            }
            i12 = 1678;
        }
        d7 d7VarM3321 = C0174.m3321(C0228.m4387(this));
        C0014.m280((e6.c) C0166.m3176(d7VarM3321));
        C0343.m6719(C0208.m3979(d7VarM3321), new f7(d7VarM3321, C0199.m3820(), i11));
        int iM8696 = C0447.m8696();
        int i14 = 1864;
        while (true) {
            i14 ^= 1881;
            switch (i14) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM8696 <= 0) {
                        i14 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    System.out.println(Double.parseDouble(C0075.m1627("uHvHnQrVH7Z")));
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i14 = 48705;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i10 = 0;
        d7 d7VarM3321 = C0174.m3321(C0228.m4387(this));
        C0014.m280((e6.c) C0166.m3176(d7VarM3321));
        C0343.m6719(C0208.m3979(d7VarM3321), new f7(d7VarM3321, C0199.m3820(), 1));
        p6 p6VarM6778 = C0347.m6778(C0228.m4387(this));
        synchronized (C0393.m7687(p6VarM6778)) {
            try {
                p6VarM6778.f10284k = true;
                Activity activityM8001 = C0408.m8001(p6VarM6778);
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i11 = activity != activityM8001 ? 1709 : 1678;
                            break;
                        case 204:
                            synchronized (C0393.m7687(p6VarM6778)) {
                                p6VarM6778.f10280g = activity;
                                p6VarM6778.f10281h = false;
                                break;
                            }
                            boolean zM6728 = C0344.m6728(C0091.m1951(p6VarM6778));
                            int i12 = 1740;
                            while (true) {
                                i12 ^= 1757;
                                switch (i12) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (zM6728) {
                                            i12 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        p6VarM6778.f10282i = null;
                                        C0343.m6719(C0208.m3979(p6VarM6778), new r6(p6VarM6778, 1));
                                        int i13 = 1864;
                                        while (true) {
                                            i13 ^= 1881;
                                            switch (i13) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i13 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i12 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i14 = 48767;
                while (true) {
                    i14 ^= 48784;
                    switch (i14) {
                        case Code.UNAVAILABLE /* 14 */:
                            throw th;
                        case 239:
                            i14 = 48798;
                            break;
                    }
                }
            }
        }
        boolean zM6729 = C0344.m6728(C0091.m1951(p6VarM6778));
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    C0319.m6171(p6VarM6778, activity, C0083.m1772(p6VarM6778, activity), false);
                    q qVarM2294 = C0119.m2294((f5) C0163.m3121(p6VarM6778));
                    C0014.m280((e6.c) C0166.m3176(qVarM2294));
                    C0343.m6719(C0208.m3979(qVarM2294), new o0(qVarM2294, C0199.m3820(), i10));
                    return;
                case 503:
                    if (!zM6729) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    p6VarM6778.f10276c = C0257.m4893(p6VarM6778);
                    C0343.m6719(C0208.m3979(p6VarM6778), new r6(p6VarM6778, i10));
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = 49697;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i15 = 48953;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        p6 p6VarM6778 = C0347.m6778(C0228.m4387(this));
        boolean zM6728 = C0344.m6728(C0091.m1951(p6VarM6778));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM6728) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                case 239:
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (bundle == null) {
                                    i12 = 48736;
                                }
                                break;
                            case 47384:
                                q6 q6Var = (q6) C0468.m9096(C0268.m5100(p6VarM6778), activity);
                                int i13 = 48891;
                                while (true) {
                                    i13 ^= 48908;
                                    switch (i13) {
                                        case 22:
                                            break;
                                        case 53:
                                            Bundle bundle2 = new Bundle();
                                            C0491.m9555(bundle2, C0293.m5623(m6564(), 100, C0384.f654 ^ (-56), 871), C0464.m9035(q6Var));
                                            C0236.m4526(bundle2, C0411.m8046(m6564(), 102, C0446.f716 ^ 569, 1157), C0216.m4106(q6Var));
                                            C0236.m4526(bundle2, C0015.m302(m6564(), 106, C0047.f67 ^ 962, 3241), C0426.m8333(q6Var));
                                            C0006.m120(bundle, C0072.m1553(m6564(), 119, C0162.f186 ^ 877, 1325), bundle2);
                                            return;
                                        case 503:
                                            if (q6Var == null) {
                                                i13 = 49635;
                                            }
                                            break;
                                        case 32495:
                                            int i14 = 49666;
                                            while (true) {
                                                i14 ^= 49683;
                                                switch (i14) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i14 = 49697;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        return;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48953;
                                }
                                break;
                            case 47417:
                                int i15 = 48767;
                                while (true) {
                                    i15 ^= 48784;
                                    switch (i15) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return;
                                        case 239:
                                            i15 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                        i12 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int iM6072 = C0314.m6072();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6072 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0221.m4244("pNJE2zwGx")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int iM6319 = C0328.m6319();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6319 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0472.m9181("R8kK3R5gNVrc9023xFOE7xcFHRPM")));
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
