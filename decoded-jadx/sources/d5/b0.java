package d5;

import a.C0001;
import a.C0002;
import a2.C0004;
import a7.C0008;
import aa.C0012;
import android.content.Context;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.input.key.C0033;
import androidx.core.content.C0041;
import androidx.fragment.app.C0042;
import androidx.profileinstaller.C0045;
import b8.C0055;
import c0.C0057;
import c3.C0063;
import c4.C0064;
import com.auto.accept.data.model.C0071;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.bind.C0207;
import d.C0210;
import d1.C0214;
import d3.C0216;
import d7.C0220;
import d9.C0222;
import d9.C0224;
import d9.C0225;
import d9.C0226;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.internal.definecomponent.C0249;
import dagger.hilt.internal.generatesrootinput.C0250;
import dagger.hilt.migration.C0254;
import e2.C0261;
import f.C0270;
import f6.C0277;
import fa.C0280;
import g0.C0285;
import g4.C0289;
import g7.C0292;
import ga.C0295;
import h8.C0314;
import i.C0316;
import i5.C0318;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k2.C0333;
import k7.C0337;
import k8.C0338;
import l3.C0342;
import l9.C0347;
import la.C0348;
import m0.C0349;
import m0.l2;
import m0.l3;
import m3.C0352;
import m4.C0353;
import m5.C0355;
import m7.C0357;
import p3.C0375;
import p8.C0379;
import p8.C0380;
import q0.C0381;
import q0.C0382;
import q7.C0390;
import r4.C0398;
import r9.C0405;
import s2.C0411;
import t0.C0418;
import t2.C0421;
import u0.C0430;
import u4.C0435;
import u7.C0437;
import v.C0439;
import v5.C0445;
import v8.C0450;
import w2.C0457;
import w6.C0464;
import x5.C0470;
import y9.C0479;
import z2.C0484;
import z3.C0485;
import z3.C0486;
import z7.C0489;
import z8.C0491;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f247short = {497, 417, 445, 444, 422, 497, 406, 436, 423, 433, 290, 269, 264, 264, 257, 256, 330, 311, 272, 267, 276, 1644, 1658, 1645, 1641, 1654, 1660, 1658, 1600, 1662, 1660, 1643, 1654, 1641, 1658, 989, 971, 988, 984, 967, 973, 971, 1009, 989, 986, 961, 990, 990, 971, 970, 1394, 1392, 1393, 1398, 1387, 1392, 1389, 1398, 1393, 1400, 1344, 1389, 1398, 1403, 1402, 1344, 1406, 1391, 1391, 1388, 1920, 1941, 1924, 1963, 1920, 1947, 1963, 1927, 1920, 1941, 1926, 1920, 1193, 1212, 1199, 1184, 1210, 1169, 1214, 1195, 1212, 1187, 1191, 1213, 1213, 1191, 1185, 1184, 1213, 1169, 1192, 1191, 1212, 1213, 1210};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f4408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f4410f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f4411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.a f4412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MainViewModel f4413p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z10, boolean z11, boolean z12, m0.g1 g1Var, ArrayList arrayList, Map map, Context context, c9.a aVar, MainViewModel mainViewModel) {
        super(C0015.f35 ^ 752);
        this.f4405a = z10;
        this.f4406b = z11;
        this.f4407c = z12;
        this.f4408d = g1Var;
        this.f4409e = arrayList;
        this.f4410f = map;
        this.f4411n = context;
        this.f4412o = aVar;
        this.f4413p = mainViewModel;
        int iM8543 = C0437.m8543();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8543 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0106.m2063("C7FSFojv")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۡۥۤ, reason: contains not printable characters */
    public static short[] m4153() {
        int iM9449 = C0485.m9449();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9449 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f247short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:280:0x06fc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:293:0x0742. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        long jM9422;
        i1.f fVarM4022;
        long jM41;
        String str;
        String strM4120;
        long jM42;
        String strM6122;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0435.m8515((Number) obj3);
        C0375.m7360((y.v) obj, C0233.m4496(m4153(), 0, C0103.f129 ^ (-392), 469));
        int i10 = C0249.f329;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-875)) & iM8515) == 16 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = !zM1625 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0470.m9156(qVar);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return C0012.m238();
                                        case 239:
                                            i13 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = 48674;
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
                    break;
                default:
                    break;
            }
        }
        y0.l lVarM4370 = C0226.m4370();
        y0.o oVarM4788 = C0250.m4788(C0123.m2371(), 16);
        y.f fVarM6623 = C0337.m6623();
        y0.f fVarM6849 = C0349.m6849();
        boolean zM6707 = C0342.m6707(this);
        List listM4857 = C0254.m4857(this);
        Map mapM5681 = C0295.m5681(this);
        Context contextM2279 = C0118.m2279(this);
        c9.a aVarM7811 = C0398.m7811(this);
        MainViewModel mainViewModelM4347 = C0225.m4347(this);
        m0.q qVar2 = (m0.q) mVar;
        C0261.m4990(qVar2, 693286721 ^ C0042.f62);
        r1.j0 j0VarM4288 = C0222.m4288(fVarM6623, fVarM6849, qVar2);
        C0261.m4990(qVar2, 1323940787 ^ C0207.f231);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0379.m7428());
        t1.j jVarM4451 = C0231.m4451();
        u0.b bVarM6976 = C0355.m6976(oVarM4788);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    C0235.m4537();
                    throw null;
                case 503:
                    if (z10) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0382.m7502(qVar2);
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = zM7502 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4451);
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i17 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                C0445.m8685(qVar2);
                                break;
                            default:
                                break;
                        }
                    }
                    t1.i iVarM1208 = C0063.m1208();
                    C0089.m1904(qVar2, j0VarM4288, iVarM1208);
                    t1.i iVarM9055 = C0464.m9055();
                    C0089.m1904(qVar2, r1VarM275, iVarM9055);
                    t1.i iVarM5562 = C0289.m5562();
                    boolean zM7503 = C0382.m7502(qVar2);
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                i18 = !zM7503 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                break;
                            case 1769:
                                boolean zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                int i19 = 50689;
                                while (true) {
                                    i19 ^= 50706;
                                    switch (i19) {
                                        case 19:
                                            i19 = !zM4399 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            int i20 = 50813;
                                            while (true) {
                                                i20 ^= 50830;
                                                switch (i20) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 243:
                                                        i20 = 50844;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                                break;
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
                    C0352.m6912(0, bVarM6976, new l2(qVar2), qVar2, (-2058659889) ^ C0270.f350);
                    C0261.m4990(qVar2, (-693285977) ^ C0491.f765);
                    r1.j0 j0VarM4289 = C0222.m4288(C0113.m2180(), fVarM6849, qVar2);
                    C0261.m4990(qVar2, 1323940808 ^ C0071.f98);
                    int iM277 = C0014.m276(qVar2);
                    m0.r1 r1VarM276 = C0014.m275(qVar2);
                    u0.b bVarM6977 = C0355.m6976(lVarM4370);
                    int i21 = 51588;
                    while (true) {
                        i21 ^= 51605;
                        switch (i21) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z10) {
                                    i21 = 51681;
                                }
                                break;
                            case 54:
                                break;
                            case 87:
                                C0235.m4537();
                                throw null;
                            case 116:
                                C0100.m1961(qVar2);
                                boolean zM7504 = C0382.m7502(qVar2);
                                int i22 = 51712;
                                while (true) {
                                    i22 ^= 51729;
                                    switch (i22) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i22 = zM7504 ? 51805 : 51774;
                                            break;
                                        case 47:
                                            C0445.m8685(qVar2);
                                            break;
                                        case 76:
                                            C0017.m346(qVar2, jVarM4451);
                                            int i23 = 51836;
                                            while (true) {
                                                i23 ^= 51853;
                                                switch (i23) {
                                                    case 241:
                                                        i23 = 52518;
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
                                C0089.m1904(qVar2, j0VarM4289, iVarM1208);
                                C0089.m1904(qVar2, r1VarM276, iVarM9055);
                                boolean zM7505 = C0382.m7502(qVar2);
                                int i24 = 52611;
                                while (true) {
                                    i24 ^= 52628;
                                    switch (i24) {
                                        case 23:
                                            i24 = !zM7505 ? 52704 : 52673;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            C0133.m2574(iM277, qVar2, iM277, iVarM5562);
                                            break;
                                        case 116:
                                            boolean zM43910 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM277));
                                            int i25 = 52735;
                                            while (true) {
                                                i25 ^= 52752;
                                                switch (i25) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 1007:
                                                        i25 = !zM43910 ? 53479 : 52797;
                                                        break;
                                                    case 7927:
                                                        C0133.m2574(iM277, qVar2, iM277, iVarM5562);
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
                                C0352.m6912(0, bVarM6977, new l2(qVar2), qVar2, 2058660550 ^ C0292.f440);
                                y0.o oVarM6470 = C0333.m6470(C0154.m2949(lVarM4370, C0232.f312 ^ 528), C0353.m6942());
                                int i26 = 53510;
                                while (true) {
                                    i26 ^= 53527;
                                    switch (i26) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i26 = zM6707 ? 53603 : 53572;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            jM9422 = C0484.m9422();
                                            break;
                                        case 116:
                                            jM9422 = C0216.m4129(C0045.m882(), 0.2f);
                                            int i27 = 53634;
                                            while (true) {
                                                i27 ^= 53651;
                                                switch (i27) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i27 = 53665;
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
                                y0.o oVarM48 = C0002.m48(oVarM6470, jM9422, C0041.m813());
                                y0.g gVarM2824 = C0147.m2824();
                                C0261.m4990(qVar2, 733329150 ^ C0349.f620);
                                r1.j0 j0VarM2476 = C0128.m2476(gVarM2824, false, qVar2);
                                C0261.m4990(qVar2, (-1323939847) ^ C0120.f146);
                                int iM278 = C0014.m276(qVar2);
                                m0.r1 r1VarM277 = C0014.m275(qVar2);
                                u0.b bVarM6978 = C0355.m6976(oVarM48);
                                int i28 = 53758;
                                while (true) {
                                    i28 ^= 53775;
                                    switch (i28) {
                                        case 1009:
                                            if (z10) {
                                                i28 = 54502;
                                            }
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            C0235.m4537();
                                            throw null;
                                        case 1769:
                                            C0100.m1961(qVar2);
                                            boolean zM7506 = C0382.m7502(qVar2);
                                            int i29 = 54533;
                                            while (true) {
                                                i29 ^= 54550;
                                                switch (i29) {
                                                    case 19:
                                                        if (zM7506) {
                                                            i29 = 54626;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 85:
                                                        C0445.m8685(qVar2);
                                                        break;
                                                    case 116:
                                                        C0017.m346(qVar2, jVarM4451);
                                                        int i30 = 54657;
                                                        while (true) {
                                                            i30 ^= 54674;
                                                            switch (i30) {
                                                                case 19:
                                                                    i30 = 54688;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i29 = 54595;
                                            }
                                            C0089.m1904(qVar2, j0VarM2476, iVarM1208);
                                            C0089.m1904(qVar2, r1VarM277, iVarM9055);
                                            boolean zM7507 = C0382.m7502(qVar2);
                                            int i31 = 55432;
                                            while (true) {
                                                i31 ^= 55449;
                                                switch (i31) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i31 = !zM7507 ? 55525 : 55494;
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 95:
                                                        C0133.m2574(iM278, qVar2, iM278, iVarM5562);
                                                        break;
                                                    case 124:
                                                        boolean zM43911 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM278));
                                                        int i32 = 55556;
                                                        while (true) {
                                                            i32 ^= 55573;
                                                            switch (i32) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i32 = !zM43911 ? 55649 : 55618;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    break;
                                                                case 116:
                                                                    C0133.m2574(iM278, qVar2, iM278, iVarM5562);
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
                                            C0352.m6912(0, bVarM6978, new l2(qVar2), qVar2, 2058660365 ^ C0486.f760);
                                            int i33 = 55680;
                                            while (true) {
                                                i33 ^= 55697;
                                                switch (i33) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i33 = zM6707 ? 56424 : 56393;
                                                        break;
                                                    case 1467:
                                                        break;
                                                    case 1496:
                                                        fVarM4022 = C0210.m4022();
                                                        int i34 = 56579;
                                                        while (true) {
                                                            i34 ^= 56596;
                                                            switch (i34) {
                                                                case 23:
                                                                    i34 = fVarM4022 != null ? 1507472 : 56641;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 85:
                                                                    i1.e eVar = new i1.e(C0227.m4381(m4153(), 10, C0380.f651 ^ (-713), 356), 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, C0347.f618 ^ 480);
                                                                    C0167.m3190();
                                                                    e1.n0 n0Var = new e1.n0(C0180.m3437());
                                                                    ArrayList arrayList = new ArrayList(C0143.f169 ^ (-343));
                                                                    C0357.m6998(arrayList, new i1.n(6.0f, 6.0f));
                                                                    C0357.m6998(arrayList, new i1.t(12.0f));
                                                                    C0357.m6998(arrayList, new i1.z(12.0f));
                                                                    C0357.m6998(arrayList, new i1.l(6.0f));
                                                                    C0357.m6998(arrayList, C0289.m5566());
                                                                    C0479.m9341(eVar, arrayList, n0Var);
                                                                    fVarM4022 = C0390.m7638(eVar);
                                                                    o7.d0.f12592u = fVarM4022;
                                                                    break;
                                                                case 1564036:
                                                                    int i35 = 1507503;
                                                                    while (true) {
                                                                        i35 ^= 1507520;
                                                                        switch (i35) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 111:
                                                                                i35 = 1507534;
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
                                                    case 1529:
                                                        fVarM4022 = C0457.m8902();
                                                        int i36 = 56455;
                                                        while (true) {
                                                            i36 ^= 56472;
                                                            switch (i36) {
                                                                case 31:
                                                                    i36 = 56486;
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
                                            int i37 = 1507627;
                                            while (true) {
                                                i37 ^= 1507644;
                                                switch (i37) {
                                                    case 23:
                                                        if (zM6707) {
                                                            i37 = 1507720;
                                                        }
                                                        break;
                                                    case 85:
                                                        jM41 = C0001.m41();
                                                        int i38 = 1508526;
                                                        while (true) {
                                                            i38 ^= 1508543;
                                                            switch (i38) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i38 = 1508557;
                                                                    break;
                                                                case 114:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 118:
                                                        break;
                                                    case 180:
                                                        jM41 = C0045.m882();
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i37 = 1507689;
                                            }
                                            int i39 = 1507751;
                                            while (true) {
                                                i39 ^= 1507768;
                                                switch (i39) {
                                                    case 31:
                                                        i39 = 1508433;
                                                        break;
                                                    case 1513:
                                                        y0.o oVarM2949 = C0154.m2949(lVarM4370, C0450.f721 ^ (-695));
                                                        int i40 = C0134.f160;
                                                        C0142.m2736(fVarM4022, null, oVarM2949, jM41, qVar2, 432, 0);
                                                        C0016.m325(qVar2, false, true, false, false);
                                                        int i41 = C0021.f41 ^ 960;
                                                        C0072.m1564(C0430.m8431(lVarM4370, i41), qVar2);
                                                        C0261.m4990(qVar2, 483455286 ^ C0019.f39);
                                                        r1.j0 j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar2);
                                                        C0261.m4990(qVar2, i40 ^ 1323940487);
                                                        int iM279 = C0014.m276(qVar2);
                                                        m0.r1 r1VarM278 = C0014.m275(qVar2);
                                                        u0.b bVarM6979 = C0355.m6976(lVarM4370);
                                                        int i42 = 1508650;
                                                        while (true) {
                                                            i42 ^= 1508667;
                                                            switch (i42) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (z10) {
                                                                        i42 = 1509394;
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    C0235.m4537();
                                                                    throw null;
                                                                case 114:
                                                                    break;
                                                                case 3369:
                                                                    C0100.m1961(qVar2);
                                                                    boolean zM7508 = C0382.m7502(qVar2);
                                                                    int i43 = 1509425;
                                                                    while (true) {
                                                                        i43 ^= 1509442;
                                                                        switch (i43) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                C0445.m8685(qVar2);
                                                                                break;
                                                                            case 115:
                                                                                if (zM7508) {
                                                                                    i43 = 1509518;
                                                                                }
                                                                                break;
                                                                            case 204:
                                                                                C0017.m346(qVar2, jVarM4451);
                                                                                int i44 = 1509549;
                                                                                while (true) {
                                                                                    i44 ^= 1509566;
                                                                                    switch (i44) {
                                                                                        case 19:
                                                                                            i44 = 1509580;
                                                                                            break;
                                                                                        case 114:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i43 = 1509487;
                                                                    }
                                                                    C0089.m1904(qVar2, j0VarM4231, iVarM1208);
                                                                    C0089.m1904(qVar2, r1VarM278, iVarM9055);
                                                                    boolean zM7509 = C0382.m7502(qVar2);
                                                                    int i45 = 1509673;
                                                                    while (true) {
                                                                        i45 ^= 1509690;
                                                                        switch (i45) {
                                                                            case 19:
                                                                                i45 = !zM7509 ? 1510417 : 1510386;
                                                                                break;
                                                                            case 712:
                                                                                C0133.m2574(iM279, qVar2, iM279, iVarM5562);
                                                                                break;
                                                                            case 745:
                                                                                break;
                                                                            case 1323:
                                                                                boolean zM43912 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM279));
                                                                                int i46 = 1510448;
                                                                                while (true) {
                                                                                    i46 ^= 1510465;
                                                                                    switch (i46) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 47:
                                                                                            break;
                                                                                        case 113:
                                                                                            i46 = !zM43912 ? 1510541 : 1510510;
                                                                                            break;
                                                                                        case 204:
                                                                                            C0133.m2574(iM279, qVar2, iM279, iVarM5562);
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
                                                                    C0352.m6912(0, bVarM6979, new l2(qVar2), qVar2, (-2058660295) ^ C0492.f766);
                                                                    l3 l3VarM7479 = C0381.m7479(this);
                                                                    C0318.m6169();
                                                                    int i47 = 1510572;
                                                                    while (true) {
                                                                        i47 ^= 1510589;
                                                                        switch (i47) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i47 = zM6707 ? 1511316 : 1510634;
                                                                                break;
                                                                            case 87:
                                                                                str = (String) C0418.m8214(l3VarM7479);
                                                                                strM4120 = C0216.m4120(m4153(), 35, C0033.f53 ^ (-237), 942);
                                                                                int i48 = 1511471;
                                                                                while (true) {
                                                                                    i48 ^= 1511488;
                                                                                    switch (i48) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 111:
                                                                                            i48 = 1511502;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 809:
                                                                                str = (String) C0418.m8214(l3VarM7479);
                                                                                strM4120 = C0169.m3243(m4153(), 21, C0489.f763 ^ (-541), 1567);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    String strM6123 = C0316.m6122(strM4120, str);
                                                                    int i49 = 1511347;
                                                                    while (true) {
                                                                        i49 ^= 1511364;
                                                                        switch (i49) {
                                                                            case 22:
                                                                                f2.l lVarM1734 = C0081.m1734();
                                                                                int i50 = 1511595;
                                                                                while (true) {
                                                                                    i50 ^= 1511612;
                                                                                    switch (i50) {
                                                                                        case 23:
                                                                                            i50 = zM6707 ? 1512339 : 1512308;
                                                                                            break;
                                                                                        case 815:
                                                                                            jM42 = C0045.m882();
                                                                                            break;
                                                                                        case 968:
                                                                                            jM42 = C0001.m41();
                                                                                            int i51 = 1512494;
                                                                                            while (true) {
                                                                                                i51 ^= 1512511;
                                                                                                switch (i51) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i51 = 1512525;
                                                                                                        continue;
                                                                                                    case 114:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 1001:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                int i52 = C0055.f75;
                                                                                int i53 = 1512370;
                                                                                while (true) {
                                                                                    i53 ^= 1512387;
                                                                                    switch (i53) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            C0185.m3537(strM6123, null, jM42, C0135.m2601(i52 ^ (-727)), null, lVarM1734, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 199680, 0, 130300 ^ C0338.f609);
                                                                                            int i54 = 1513269;
                                                                                            while (true) {
                                                                                                i54 ^= 1513286;
                                                                                                switch (i54) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case 53:
                                                                                                        strM6122 = C0316.m6122(C0214.m4094(m4153(), 70, C0108.f134 ^ (-74), 2036), (String) C0418.m8214(l3VarM7479));
                                                                                                        int i55 = 1513517;
                                                                                                        while (true) {
                                                                                                            i55 ^= 1513534;
                                                                                                            switch (i55) {
                                                                                                                case 19:
                                                                                                                    i55 = 1514199;
                                                                                                                    continue;
                                                                                                                case 745:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 115:
                                                                                                        i54 = zM6707 ? 1513362 : 1513331;
                                                                                                        break;
                                                                                                    case 212:
                                                                                                        strM6122 = C0316.m6122(C0222.m4290(m4153(), 50, C0439.f710 ^ 976, 1311), (String) C0418.m8214(l3VarM7479));
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            int i56 = 1513393;
                                                                                            while (true) {
                                                                                                i56 ^= 1513410;
                                                                                                switch (i56) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        C0185.m3537(strM6122, null, C0001.m41(), C0135.m2601(i41), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3072, 0, (-130862) ^ C0004.f1062);
                                                                                                        C0016.m325(qVar2, false, true, false, false);
                                                                                                        C0016.m325(qVar2, false, true, false, false);
                                                                                                        boolean zM4397 = C0228.m4397(this);
                                                                                                        int i57 = 1514292;
                                                                                                        while (true) {
                                                                                                            i57 ^= 1514309;
                                                                                                            switch (i57) {
                                                                                                                case 22:
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                                                    C0261.m4990(qVar2, 112907505 ^ C0019.f39);
                                                                                                                    C0185.m3537(C0316.m6122(C0486.m9476(m4153(), 82, C0224.f304 ^ 837, 1230), (String) C0418.m8214(l3VarM7479)), null, C0314.m6087(), C0135.m2601(C0450.f721 ^ (-674)), null, C0204.m3904(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 199680, 0, (-130230) ^ C0285.f430);
                                                                                                                    C0171.m3270(qVar2, false);
                                                                                                                    break;
                                                                                                                case 113:
                                                                                                                    i57 = zM4397 ? 1514385 : 1514354;
                                                                                                                    break;
                                                                                                                case 212:
                                                                                                                    boolean zM7953 = C0405.m7953(this);
                                                                                                                    int i58 = 1514416;
                                                                                                                    while (true) {
                                                                                                                        i58 ^= 1514433;
                                                                                                                        switch (i58) {
                                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                                break;
                                                                                                                            case 47:
                                                                                                                                C0261.m4990(qVar2, 112907505 ^ C0019.f39);
                                                                                                                                C0185.m3537(C0316.m6122(C0486.m9476(m4153(), 82, C0224.f304 ^ 837, 1230), (String) C0418.m8214(l3VarM7479)), null, C0314.m6087(), C0135.m2601(C0450.f721 ^ (-674)), null, C0204.m3904(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 199680, 0, (-130230) ^ C0285.f430);
                                                                                                                                C0171.m3270(qVar2, false);
                                                                                                                                break;
                                                                                                                            case 113:
                                                                                                                                i58 = zM7953 ? 1515160 : 1514478;
                                                                                                                                break;
                                                                                                                            case 1369:
                                                                                                                                C0261.m4990(qVar2, 112909731 ^ C0277.f422);
                                                                                                                                C0064.m1236(zM6707, new b.d(listM4857, mapM5681, contextM2279, aVarM7811, mainViewModelM4347, C0220.f300 ^ (-128)), null, null, false, C0008.m157(C0348.m6826(), C0045.m882(), C0484.m9422(), qVar2, (-65219) ^ C0421.f692), null, qVar2, 0, C0280.f425 ^ (-416));
                                                                                                                                C0171.m3270(qVar2, false);
                                                                                                                                int i59 = 1515191;
                                                                                                                                while (true) {
                                                                                                                                    i59 ^= 1515208;
                                                                                                                                    switch (i59) {
                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                                                            break;
                                                                                                                                        case 127:
                                                                                                                                            i59 = 1515222;
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
                                                                                                        C0016.m325(qVar2, false, true, false, false);
                                                                                                        break;
                                                                                                    case 115:
                                                                                                        i56 = 1513424;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 113:
                                                                                            i53 = 1512401;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 119:
                                                                                i49 = 1511378;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i42 = 1508712;
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i28 = 54471;
                                }
                                break;
                            default:
                                continue;
                        }
                        i21 = 51650;
                    }
                    break;
                default:
                    continue;
            }
            i15 = 48953;
        }
        return C0012.m238();
    }
}
