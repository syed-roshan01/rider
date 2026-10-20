package k6;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import androidx.compose.foundation.layout.C0021;
import androidx.core.app.C0040;
import c0.C0057;
import c3.C0062;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.gson.internal.sql.C0208;
import d2.C0216;
import d8.C0222;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import e0.C0257;
import e2.C0264;
import ea.C0268;
import ea.C0269;
import f.C0271;
import f0.C0273;
import fa.C0280;
import h0.C0300;
import h6.C0310;
import java.util.concurrent.ConcurrentHashMap;
import k1.C0333;
import l2.C0342;
import l3.C0343;
import l6.C0344;
import l9.C0348;
import m4.C0354;
import m5.C0355;
import n8.C0366;
import p5.C0378;
import p8.C0380;
import q1.C0384;
import r.C0393;
import r1.C0394;
import r6.C0402;
import s0.C0410;
import s0.C0411;
import s8.C0417;
import t2.C0424;
import t3.C0425;
import t7.C0426;
import u1.C0432;
import v.C0440;
import v6.C0448;
import w.C0454;
import w1.C0456;
import w2.C0459;
import w4.C0462;
import w5.C0464;
import w6.C0465;
import x2.C0468;
import x7.C0473;
import y6.C0477;
import z1.C0484;
import z3.C0486;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class p6 extends p2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f573short = {1432, 1466, 1453, 1456, 1455, 1456, 1453, 1440, 2979, 3025, 1514, 1510, 1508, 1447, 1518, 1510, 1510, 1518, 1509, 1516, 1447, 1512, 1529, 1529, 1494, 1508, 1516, 1512, 1530, 1532, 1531, 1516, 1508, 1516, 1511, 1533, 1447, 1530, 1514, 1531, 1516, 1516, 1511, 1494, 1530, 1516, 1531, 1535, 1504, 1514, 1516, 644, 651, 647, 655, 2831, 2840, 2843, 2840, 2831, 2831, 2840, 2831, 2850, 2835, 2844, 2832, 2840, 778, 775, 1794, 1837, 1843, 1211, 1172, 1159, 1177, 1206, 1199, 2450, 2464, 2494, 2489, 941, 956, 956, 1554, 1542, 1543, 1564, 2715, 2738, 2743};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile q6 f10276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile q6 f10277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q6 f10278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f10279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Activity f10280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f10281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile q6 f10282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q6 f10283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f10285l;

    public p6(f5 f5Var) {
        super(f5Var);
        this.f10285l = new Object();
        this.f10279f = new ConcurrentHashMap();
        int iM5406 = C0280.m5406();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5406 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0342.m6703("ggNZWz4Dsja38R9vWzM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۧۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6585() {
        int iM6940 = C0354.m6940();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6940 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f573short;
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

    public final void A(q6 q6Var, boolean z10, long j10) {
        boolean z11;
        q qVarM2294 = C0119.m2294((f5) C0163.m3121(this));
        C0014.m280((e6.c) C0166.m3176(this));
        C0424.m8305(qVarM2294, C0199.m3820());
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = q6Var != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2840 = C0148.m2840(q6Var);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM2840 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                z11 = false;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                z11 = true;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    break;
                case 239:
                    z11 = false;
                    break;
                default:
                    break;
            }
        }
        boolean zM8994 = C0462.m8994(C0380.m7442(C0174.m3321(this)), z11, z10, j10);
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case 76:
                    int i14 = 48891;
                    while (true) {
                        i14 ^= 48908;
                        switch (i14) {
                            case 22:
                                break;
                            case 53:
                                return;
                            case 503:
                                if (q6Var != null) {
                                    i14 = 49635;
                                }
                                break;
                            case 32495:
                                q6Var.f10327d = false;
                                return;
                            default:
                                continue;
                        }
                        i14 = 48953;
                    }
                    break;
                case 239:
                    if (zM8994) {
                        i13 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i13 = 48829;
        }
    }

    public final q6 B(Activity activity) {
        C0271.m5173(activity);
        q6 q6Var = (q6) C0468.m9096(C0268.m5100(this), activity);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = q6Var == null ? 1709 : 1678;
                    break;
                case 204:
                    q6Var = new q6(null, C0106.m2060(this, C0014.m280(activity)), C0247.m4728(C0355.m6951(this)));
                    C0125.m2413(C0268.m5100(this), activity, q6Var);
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        q6 q6VarM4893 = C0257.m4893(this);
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (q6VarM4893 != null) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return q6Var;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    return C0257.m4893(this);
                default:
                    continue;
            }
            i11 = 1802;
        }
    }

    @Override // k6.p2
    public final boolean u() {
        return false;
    }

    public final String v(Class cls) {
        String strM8581;
        String strM5119 = C0269.m5119(cls);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (strM5119 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0062.m1180(m6585(), 0, C0075.f109 ^ 265, 1497);
                case 239:
                    String[] strArrM8842 = C0454.m8842(strM5119, C0247.m4720(m6585(), 8, C0186.f210 ^ (-330), 3071));
                    int length = strArrM8842.length;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = length > 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                strM8581 = C0440.m8581();
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                strM8581 = strArrM8842[strArrM8842.length + (C0425.f695 ^ (-520))];
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    int iM8181 = C0417.m8181(strM8581);
                    int iM8054 = C0411.m8054(C0091.m1951(this), null);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return strM8581;
                            case 76:
                                return C0125.m2418(strM8581, 0, C0411.m8054(C0091.m1951(this), null));
                            case 239:
                                if (iM8181 > iM8054) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final q6 w(boolean z10) {
        C0459.m8937(this);
        C0040.m791(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!z10) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0333.m6451(this);
                case 239:
                    q6 q6VarM6451 = C0333.m6451(this);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (q6VarM6451 != null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return C0486.m9446(this);
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return q6VarM6451;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void x(Activity activity, Bundle bundle) {
        boolean zM6728 = C0344.m6728(C0091.m1951(this));
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
                    return;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (bundle == null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                Bundle bundleM4704 = C0246.m4704(bundle, C0432.m8452(m6585(), 10, C0273.f388 ^ 357, 1417));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (bundleM4704 == null) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            C0125.m2413(C0268.m5100(this), activity, new q6(C0132.m2549(bundleM4704, C0448.m8719(m6585(), 51, C0153.f178 ^ (-170), 746)), C0132.m2549(bundleM4704, C0244.m4671(m6585(), 55, C0015.f35 ^ 766, 2941)), C0158.m3008(bundleM4704, C0222.m4271(m6585(), 68, C0448.f718 ^ (-188), 867))));
                                            return;
                                        case 47417:
                                            return;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void y(Activity activity, q6 q6Var, boolean z10) {
        q6 q6VarM8882;
        q6 q6Var2;
        String strM2060;
        q6 q6VarM9197 = C0473.m9197(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = q6VarM9197 == null ? 1709 : 1678;
                    break;
                case 204:
                    q6VarM8882 = C0456.m8882(this);
                    break;
                case 239:
                    q6 q6VarM9198 = C0473.m9197(this);
                    int i11 = 1864;
                    while (true) {
                        i11 ^= 1881;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 48674;
                                continue;
                            case 47483:
                                q6VarM8882 = q6VarM9198;
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
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = 1771;
                    break;
                case 54:
                    String strM8333 = C0426.m8333(q6Var);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                q6Var2 = q6Var;
                                break;
                            case 76:
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            strM2060 = null;
                                            int i15 = 49790;
                                            while (true) {
                                                i15 ^= 49807;
                                                switch (i15) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 241:
                                                        i15 = 49821;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 503:
                                            i14 = activity != null ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            strM2060 = C0106.m2060(this, C0014.m280(activity));
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i16 = 49666;
                                while (true) {
                                    i16 ^= 49683;
                                    switch (i16) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = 49697;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            q6 q6Var3 = new q6(C0216.m4106(q6Var), strM2060, C0464.m9035(q6Var), C0083.m1780(q6Var), C0348.m6805(q6Var));
                                            int i17 = 49914;
                                            while (true) {
                                                i17 ^= 49931;
                                                switch (i17) {
                                                    case 497:
                                                        i17 = 50596;
                                                        break;
                                                    case 1711:
                                                        q6Var2 = q6Var3;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                if (strM8333 == null) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
                    }
                    this.f10277d = C0473.m9197(this);
                    this.f10276c = q6Var2;
                    C0014.m280((e6.c) C0166.m3176(this));
                    C0343.m6719(C0208.m3979(this), new j6(this, q6Var2, q6VarM8882, C0199.m3820(), z10));
                    return;
            }
        }
    }

    public final void z(q6 q6Var, q6 q6Var2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        boolean z12;
        Bundle bundle2;
        String strM2980;
        long jM6805;
        C0040.m791(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = q6Var2 != null ? 1709 : 1678;
                    break;
                case 204:
                    long jM9035 = C0464.m9035(q6Var);
                    long jM9036 = C0464.m9035(q6Var2);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = jM9036 == jM9035 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                z11 = true;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM7685 = C0393.m7685(C0426.m8333(q6Var2), C0426.m8333(q6Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = zM7685 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            z11 = true;
                                            break;
                                        case 47417:
                                            boolean zM7686 = C0393.m7685(C0216.m4106(q6Var2), C0216.m4106(q6Var));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        z11 = false;
                                                        int i14 = 49666;
                                                        while (true) {
                                                            i14 ^= 49683;
                                                            switch (i14) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i14 = 49697;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 76:
                                                        int i15 = 48891;
                                                        while (true) {
                                                            i15 ^= 48908;
                                                            switch (i15) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i15 = 48922;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                            z11 = true;
                                                            break;
                                                        }
                                                        break;
                                                    case 239:
                                                        i13 = !zM7686 ? 48860 : 48829;
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
                    z11 = true;
                    break;
                default:
                    break;
            }
        }
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    z12 = false;
                    break;
                case 84:
                    q6 q6VarM6451 = C0333.m6451(this);
                    int i17 = 49914;
                    while (true) {
                        i17 ^= 49931;
                        switch (i17) {
                            case 497:
                                i17 = q6VarM6451 != null ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                z12 = false;
                                break;
                            case 1769:
                                z12 = true;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 241:
                    i16 = z10 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i18 = 50689;
        while (true) {
            i18 ^= 50706;
            switch (i18) {
                case 19:
                    i18 = z11 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    int i19 = 50813;
                    while (true) {
                        i19 ^= 50830;
                        switch (i19) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                bundle2 = new Bundle();
                                int i20 = 51712;
                                while (true) {
                                    i20 ^= 51729;
                                    switch (i20) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = 51743;
                                            break;
                                    }
                                }
                                break;
                            case 243:
                                if (bundle != null) {
                                    i19 = 51557;
                                }
                                break;
                            case 4075:
                                bundle2 = new Bundle(bundle);
                                break;
                            default:
                                continue;
                        }
                        i19 = 50875;
                    }
                    int i21 = 51588;
                    while (true) {
                        i21 ^= 51605;
                        switch (i21) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i21 = 51619;
                                continue;
                            case 54:
                                C0465.m9060(q6Var, bundle2, true);
                                int i22 = 51836;
                                while (true) {
                                    i22 ^= 51853;
                                    switch (i22) {
                                        case 241:
                                            i22 = q6Var2 != null ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            break;
                                        case 2025:
                                            String strM4106 = C0216.m4106(q6Var2);
                                            int i23 = 52611;
                                            while (true) {
                                                i23 ^= 52628;
                                                switch (i23) {
                                                    case 23:
                                                        i23 = strM4106 != null ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        C0236.m4526(bundle2, C0116.m2234(m6585(), 70, C0115.f141 ^ (-573), 1885), strM4106);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            String strM8333 = C0426.m8333(q6Var2);
                                            int i24 = 52735;
                                            while (true) {
                                                i24 ^= 52752;
                                                switch (i24) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 1007:
                                                        i24 = strM8333 != null ? 53479 : 52797;
                                                        break;
                                                    case 7927:
                                                        C0236.m4526(bundle2, C0021.m421(m6585(), 73, C0484.f757 ^ (-784), 1252), strM8333);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0491.m9555(bundle2, C0129.m2487(m6585(), 76, C0477.f750 ^ 588, 1222), C0464.m9035(q6Var2));
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i25 = 53510;
                                while (true) {
                                    i25 ^= 53527;
                                    switch (i25) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i25 = z12 ? 53603 : 53572;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            break;
                                        case 116:
                                            h7 h7VarM7442 = C0380.m7442(C0174.m3321(this));
                                            long jM2552 = ((29 + j10) - C0132.m2552(h7VarM7442)) - 29;
                                            h7VarM7442.f10091b = j10;
                                            int i26 = 53634;
                                            while (true) {
                                                i26 ^= 53651;
                                                switch (i26) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i26 = jM2552 > 0 ? 53727 : 53696;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0192.m3673(C0355.m6951(this), bundle2, jM2552);
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
                                boolean zM6728 = C0344.m6728(C0091.m1951(this));
                                int i27 = 53758;
                                while (true) {
                                    i27 ^= 53775;
                                    switch (i27) {
                                        case 1009:
                                            i27 = !zM6728 ? 54502 : 54471;
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            C0491.m9555(bundle2, C0378.m7393(m6585(), 79, C0057.f77 ^ 693, 2509), 942 ^ ((long) C0147.f172));
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean zM1780 = C0083.m1780(q6Var);
                                int i28 = 54533;
                                while (true) {
                                    i28 ^= 54550;
                                    switch (i28) {
                                        case 19:
                                            i28 = zM1780 ? 54626 : 54595;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 85:
                                            strM2980 = C0156.m2980(m6585(), 86, C0268.f347 ^ (-335), 1651);
                                            int i29 = 55432;
                                            while (true) {
                                                i29 ^= 55449;
                                                switch (i29) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i29 = 55463;
                                                        continue;
                                                    case 62:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 116:
                                            strM2980 = C0170.m3259(m6585(), 83, C0366.f636 ^ (-185), 972);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i30 = 54657;
                                while (true) {
                                    i30 ^= 54674;
                                    switch (i30) {
                                        case 19:
                                            i30 = 54688;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            C0014.m280((e6.c) C0166.m3176(this));
                                            long jM7869 = C0402.m7869();
                                            boolean zM1781 = C0083.m1780(q6Var);
                                            int i31 = 55556;
                                            while (true) {
                                                i31 ^= 55573;
                                                switch (i31) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i31 = zM1781 ? 55649 : 55618;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        jM6805 = jM7869;
                                                        break;
                                                    case 116:
                                                        jM6805 = C0348.m6805(q6Var);
                                                        int i32 = 55680;
                                                        while (true) {
                                                            i32 ^= 55697;
                                                            switch (i32) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i32 = jM6805 != 0 ? 56424 : 56393;
                                                                    break;
                                                                case 1467:
                                                                    break;
                                                                case 1496:
                                                                    jM6805 = jM7869;
                                                                    break;
                                                                case 1529:
                                                                    int i33 = 56455;
                                                                    while (true) {
                                                                        i33 ^= 56472;
                                                                        switch (i33) {
                                                                            case 31:
                                                                                i33 = 56486;
                                                                                continue;
                                                                            case 62:
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
                                            C0156.m2974(C0128.m2464(this), strM2980, C0300.m5767(m6585(), 90, C0125.f151 ^ 810, 2756), bundle2, jM6805);
                                            break;
                                        default:
                                            continue;
                                    }
                                }
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
        int i34 = 56579;
        while (true) {
            i34 ^= 56596;
            switch (i34) {
                case 23:
                    i34 = z12 ? 1507472 : 56641;
                    break;
                case 54:
                    break;
                case 85:
                    break;
                case 1564036:
                    C0410.m8028(this, C0333.m6451(this), true, j10);
                    break;
                default:
                    break;
            }
        }
        this.f10278e = q6Var;
        boolean zM1782 = C0083.m1780(q6Var);
        int i35 = 1507503;
        while (true) {
            i35 ^= 1507520;
            switch (i35) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 111:
                    i35 = zM1782 ? 1507596 : 1507565;
                    break;
                case 460:
                    this.f10283j = q6Var;
                    break;
                default:
                    break;
            }
        }
        s6 s6VarM7706 = C0394.m7706(this);
        C0040.m791(s6VarM7706);
        C0459.m8937(s6VarM7706);
        C0310.m5979(s6VarM7706, new l.h(C0264.f343 ^ 531, s6VarM7706, q6Var));
        int iM7523 = C0384.m7523();
        int i36 = 1507627;
        while (true) {
            i36 ^= 1507644;
            switch (i36) {
                case 23:
                    if (iM7523 >= 0) {
                        i36 = 1507720;
                    }
                    break;
                case 85:
                    return;
                case 118:
                    break;
                case 180:
                    System.out.println(Integer.decode(C0244.m4679("KBUrMGQW")));
                    return;
                default:
                    continue;
            }
            i36 = 1507689;
        }
    }
}
