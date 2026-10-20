package d5;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.compose.ui.graphics.C0030;
import c0.C0056;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0223;
import d9.C0225;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.internal.componenttreedeps.C0249;
import dagger.hilt.internal.generatesrootinput.C0251;
import g.C0284;
import g5.C0292;
import j2.C0324;
import k1.C0333;
import m9.C0360;
import p3.C0376;
import p5.C0378;
import p8.C0380;
import q1.C0384;
import q5.C0386;
import q6.C0389;
import t0.C0419;
import v0.C0443;
import w1.C0456;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d9.j implements c9.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f252short = {2892, 2884, 2888, 2880, 2885, 563, 568, 554, 536, 560, 572, 564, 561, 2668, 2682, 2685, 2685, 2666, 2657, 2683, 2655, 2670, 2684, 2684, 2680, 2656, 2685, 2667, 1827, 1842, 1824, 1824, 1828, 1852, 1825, 1847};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f4443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MainViewModel mainViewModel, m0.g1 g1Var, m0.g1 g1Var2, int i10) {
        super(0);
        this.f4442a = i10;
        this.f4443b = mainViewModel;
        this.f4444c = g1Var;
        this.f4445d = g1Var2;
        int iM575 = C0030.m575();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM575 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0292.m5617("u4jlECq9i7V8XtnYwWQn4aXu55ZIR")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۡۦ, reason: not valid java name and contains not printable characters */
    public static short[] m4158() {
        int iM7546 = C0386.m7546();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7546 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f252short;
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

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVarM238 = C0012.m238();
        switch (C0443.m8628(this)) {
            case 0:
                C0360.m7051(this);
                return lVarM238;
            case 1:
                C0360.m7051(this);
                return lVarM238;
            case 2:
                C0360.m7051(this);
                return lVarM238;
            default:
                C0360.m7051(this);
                return lVarM238;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4159invoke() {
        int i10 = C0056.f76 ^ (-847);
        int iM8628 = C0443.m8628(this);
        String strM1913 = C0089.m1913(m4158(), 0, C0251.f330 ^ (-129), 2857);
        MainViewModel mainViewModelM3842 = C0200.m3842(this);
        m0.g1 g1VarM6260 = C0324.m6260(this);
        m0.g1 g1VarM3073 = C0160.m3073(this);
        switch (iM8628) {
            case 0:
                C0228.m4382(C0380.m7430(mainViewModelM3842), null);
                String strM3852 = C0201.m3852(C0284.m5474((String) C0419.m8214(g1VarM3073)));
                String str = (String) C0419.m8214(g1VarM6260);
                C0376.m7360(strM3852, strM1913);
                C0376.m7360(str, C0333.m6448(m4158(), 28, C0249.f328 ^ 53, 1875));
                C0384.m7508(C0113.m2178(mainViewModelM3842), null, 0, new f5.r(mainViewModelM3842, strM3852, str, null), i10);
                break;
            case 1:
                String strM3853 = C0201.m3852(C0284.m5474((String) C0419.m8214(g1VarM3073)));
                C0014.m280(mainViewModelM3842);
                C0376.m7360(strM3853, strM1913);
                C0384.m7508(C0113.m2178(mainViewModelM3842), null, 0, new f5.w(mainViewModelM3842, strM3853, null), i10);
                C0225.m4315(g1VarM6260, C0456.m8876());
                break;
            case 2:
                boolean zM3470 = C0181.m3470((String) C0419.m8214(g1VarM3073));
                int i11 = 48767;
                while (true) {
                    i11 ^= 48784;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            break;
                        case 76:
                            boolean zM3471 = C0181.m3470((String) C0419.m8214(g1VarM6260));
                            int i12 = 48891;
                            while (true) {
                                i12 ^= 48908;
                                switch (i12) {
                                    case 22:
                                        break;
                                    case 53:
                                        break;
                                    case 503:
                                        if (((((zM3471 ? 1 : 0) ^ 65535) & 1) | ((zM3471 ? 1 : 0) & 65534)) != 0) {
                                            i12 = 49635;
                                        }
                                        break;
                                    case 32495:
                                        String strM3854 = C0201.m3852(C0284.m5474((String) C0419.m8214(g1VarM3073)));
                                        String str2 = (String) C0419.m8214(g1VarM6260);
                                        C0014.m280(mainViewModelM3842);
                                        C0376.m7360(strM3854, C0232.m4443(m4158(), 5, C0118.f144 ^ (-948), 605));
                                        C0376.m7360(str2, C0378.m7393(m4158(), 13, C0176.f200 ^ (-816), 2575));
                                        C0384.m7508(C0113.m2178(mainViewModelM3842), null, 0, new f5.c0(mainViewModelM3842, str2, strM3854, null), i10);
                                        break;
                                    default:
                                        continue;
                                }
                                i12 = 48953;
                            }
                            break;
                        case 239:
                            if (((((zM3470 ? 1 : 0) ^ 65535) & 1) | ((zM3470 ? 1 : 0) & 65534)) != 0) {
                                i11 = 48860;
                            }
                            break;
                        default:
                            continue;
                    }
                    i11 = 48829;
                }
                break;
            default:
                String str3 = (String) C0419.m8214(g1VarM3073);
                int i13 = 1616;
                while (true) {
                    i13 ^= 1633;
                    switch (i13) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i13 = str3 != null ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zM3472 = C0181.m3470((String) C0419.m8214(g1VarM6260));
                            int i14 = 1740;
                            while (true) {
                                i14 ^= 1757;
                                switch (i14) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i14 = ((((zM3472 ? 1 : 0) ^ 65535) & 1) | ((zM3472 ? 1 : 0) & 65534)) != 0 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        String strM3855 = C0201.m3852(C0284.m5474((String) C0419.m8214(g1VarM6260)));
                                        String str4 = (String) C0419.m8214(g1VarM3073);
                                        C0189.m3608(str4);
                                        C0389.m7617(mainViewModelM3842, strM3855, str4);
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
                int iM2227 = C0115.m2227();
                int i15 = 1864;
                while (true) {
                    i15 ^= 1881;
                    switch (i15) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM2227 >= 0) {
                                i15 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            System.out.println(Float.parseFloat(C0223.m4278("H6")));
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i15 = 48705;
                }
                break;
        }
    }
}
