package d5;

import a.C0000;
import a.C0001;
import a7.C0008;
import a8.C0009;
import aa.C0012;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.C0013;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.layout.C0035;
import androidx.profileinstaller.C0045;
import b.C0049;
import c0.C0057;
import c1.C0059;
import c3.C0063;
import c4.C0064;
import c4.C0066;
import com.auto.accept.data.model.SupportedApp;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.play.core.integrity.model.C0109;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.firebase.tracing.C0204;
import d3.C0217;
import d8.C0222;
import d9.C0223;
import d9.C0225;
import d9.C0227;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.internal.generatesrootinput.C0251;
import e2.C0261;
import e2.C0262;
import f4.C0275;
import f4.C0277;
import fa.C0280;
import g2.C0287;
import g4.C0290;
import g8.C0294;
import ga.C0296;
import h1.C0301;
import h4.C0305;
import i.C0317;
import i4.C0318;
import i5.C0319;
import i9.C0322;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.C0334;
import l2.C0342;
import l6.C0344;
import l6.C0345;
import l8.C0346;
import la.C0349;
import m0.C0350;
import m0.l2;
import m0.l3;
import m3.C0353;
import m5.C0356;
import n.C0362;
import p0.C0374;
import p3.C0376;
import p5.C0378;
import p7.C0379;
import p8.C0380;
import p8.C0381;
import q0.C0383;
import q6.C0387;
import q7.C0390;
import r2.C0396;
import r6.C0403;
import r9.C0406;
import rikka.shizuku.C0407;
import s.C0409;
import s2.C0412;
import s3.C0413;
import s6.C0414;
import t0.C0419;
import t1.C0420;
import t3.C0425;
import u2.C0434;
import u4.C0436;
import u8.C0439;
import v0.C0443;
import v5.C0446;
import w5.C0464;
import w6.C0465;
import x5.C0471;
import y.C0476;
import y9.C0479;
import z2.C0485;
import z3.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f243short = {3217, 3265, 3293, 3292, 3270, 3217, 3318, 3284, 3271, 3281, 2515, 2503, 2502, 2525, 2541, 2515, 2513, 2513, 2519, 2498, 2502, 2541, 2515, 2513, 2502, 2523, 2500, 2519, 1256, 1276, 1277, 1254, 1238, 1256, 1258, 1258, 1260, 1273, 1277, 1238, 1273, 1256, 1276, 1274, 1260, 1261};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f4388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f4389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f4390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PackageManager f4391f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MainViewModel f4392n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(List list, Map map, m0.g1 g1Var, Map map2, Context context, PackageManager packageManager, MainViewModel mainViewModel) {
        super(C0374.f644 ^ (-858));
        this.f4386a = list;
        this.f4387b = map;
        this.f4388c = g1Var;
        this.f4389d = map2;
        this.f4390e = context;
        this.f4391f = packageManager;
        this.f4392n = mainViewModel;
        int iM35 = C0001.m35();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM35 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0344.m6731("gPLgZjQl46NlT1eWJ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۡۨۧ, reason: not valid java name and contains not printable characters */
    public static short[] m4149() {
        int iM2227 = C0115.m2227();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2227 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f243short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x02b7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:130:0x02c6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:150:0x0365. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:170:0x03c3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:190:0x0475. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:224:0x0583. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x0200. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z10;
        String strM6122;
        long jM4129;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0436.m8515((Number) obj3);
        C0376.m7360((y.v) obj, C0479.m9331(m4149(), 0, C0407.f677 ^ 833, 3253));
        int i10 = C0296.f443;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ 10) & iM8515) == 16 ? 1709 : 1678;
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
                                C0471.m9156(qVar);
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
        y0.l lVarM4370 = C0227.m4370();
        float f10 = C0203.f227 ^ (-23);
        y0.o oVarM4788 = C0251.m4788(lVarM4370, f10);
        Map mapM3355 = C0176.m3355(this);
        Context contextM7414 = C0379.m7414(this);
        PackageManager packageManagerM6151 = C0318.m6151(this);
        m0.q qVar2 = (m0.q) mVar;
        C0262.m4990(qVar2, (-483455289) ^ C0045.f65);
        y.e eVarM3900 = C0204.m3900();
        y0.e eVarM3300 = C0173.m3300();
        r1.j0 j0VarM4231 = C0219.m4231(eVarM3900, eVarM3300, qVar2);
        C0262.m4990(qVar2, (-1323940626) ^ C0345.f615);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0380.m7428());
        t1.j jVarM4451 = C0232.m4451();
        u0.b bVarM6976 = C0356.m6976(oVarM4788);
        boolean z11 = C0196.m3764(qVar2) instanceof m0.d;
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    C0236.m4537();
                    throw null;
                case 503:
                    if (z11) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0383.m7502(qVar2);
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
                                C0446.m8685(qVar2);
                                break;
                            default:
                                break;
                        }
                    }
                    C0089.m1904(qVar2, j0VarM4231, C0063.m1208());
                    C0089.m1904(qVar2, r1VarM275, C0465.m9055());
                    t1.i iVarM5562 = C0290.m5562();
                    boolean zM7503 = C0383.m7502(qVar2);
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
                                boolean zM4399 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM276));
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
                                            C0133.m2574(iM276, qVar2, iM276, iVarM5562);
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
                    C0353.m6912(0, bVarM6976, new l2(qVar2), qVar2, (-2058660337) ^ C0413.f683);
                    C0262.m4990(qVar2, 1629666975 ^ C0319.f466);
                    List listM8472 = C0434.m8472(this);
                    Iterator itM8318 = C0425.m8318(listM8472);
                    int i20 = 0;
                    while (true) {
                        int i21 = i20;
                        boolean zM3327 = C0174.m3327(itM8318);
                        int i22 = 50813;
                        while (true) {
                            i22 ^= 50830;
                            switch (i22) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 53:
                                    C0016.m325(qVar2, false, false, true, false);
                                    C0171.m3270(qVar2, false);
                                    break;
                                case 243:
                                    i22 = zM3327 ? 51557 : 50875;
                                    break;
                                case 4075:
                                    break;
                                default:
                                    break;
                            }
                        }
                        Object objM8115 = C0414.m8115(itM8318);
                        int i23 = C0035.f55;
                        int i24 = 51588;
                        while (true) {
                            i24 ^= 51605;
                            switch (i24) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i24 = i21 >= 0 ? 51681 : 51650;
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    C0162.m3104();
                                    throw null;
                                case 116:
                                    break;
                                default:
                                    break;
                            }
                        }
                        SupportedApp supportedApp = (SupportedApp) objM8115;
                        C0387.m7573(qVar2, C0464.m9017(supportedApp), (-1421415965) ^ C0150.f175, 0, null);
                        Boolean bool = (Boolean) C0488.m9501(C0164.m3139(this), C0464.m9017(supportedApp));
                        int i25 = 51712;
                        while (true) {
                            i25 ^= 51729;
                            switch (i25) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i25 = bool != null ? 51805 : 51774;
                                    break;
                                case 47:
                                    z10 = true;
                                    break;
                                case 76:
                                    boolean zM14 = C0000.m14(bool);
                                    int i26 = 51836;
                                    while (true) {
                                        i26 ^= 51853;
                                        switch (i26) {
                                            case 241:
                                                i26 = 52518;
                                                break;
                                            case 1963:
                                                break;
                                            default:
                                                break;
                                        }
                                        z10 = zM14;
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM9017 = C0464.m9017(supportedApp);
                        C0262.m4990(qVar2, 1421416744 ^ C0287.f431);
                        boolean zM2013 = C0103.m2013(qVar2, strM9017);
                        Object objM8078 = C0412.m8078(qVar2);
                        Object objM2417 = C0125.m2417();
                        int i27 = 52611;
                        while (true) {
                            i27 ^= 52628;
                            switch (i27) {
                                case 23:
                                    i27 = !zM2013 ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    objM8078 = C0173.m3305(C0009.m192(z10), C0111.m2137());
                                    C0479.m9328(qVar2, objM8078);
                                    break;
                                case 116:
                                    int i28 = 52735;
                                    while (true) {
                                        i28 ^= 52752;
                                        switch (i28) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case 1007:
                                                i28 = objM8078 == objM2417 ? 53479 : 52797;
                                                break;
                                            case 7927:
                                                objM8078 = C0173.m3305(C0009.m192(z10), C0111.m2137());
                                                C0479.m9328(qVar2, objM8078);
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
                        m0.g1 g1Var = (m0.g1) objM8078;
                        C0171.m3270(qVar2, false);
                        Boolean boolM192 = C0009.m192(z10);
                        C0262.m4990(qVar2, (-1421417222) ^ C0294.f441);
                        boolean zM2014 = C0103.m2013(qVar2, g1Var);
                        boolean zM4326 = C0225.m4326(qVar2, z10);
                        Object objM8079 = C0412.m8078(qVar2);
                        int i29 = 53510;
                        while (true) {
                            i29 ^= 53527;
                            switch (i29) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i29 = !((zM2014 ^ zM4326) | (zM2014 & zM4326)) ? 53603 : 53572;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 83:
                                    objM8079 = new z(z10, g1Var, null);
                                    C0479.m9328(qVar2, objM8079);
                                    break;
                                case 116:
                                    int i30 = 53634;
                                    while (true) {
                                        i30 ^= 53651;
                                        switch (i30) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i30 = objM8079 == objM2417 ? 53727 : 53696;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                int i31 = 53758;
                                                while (true) {
                                                    i31 ^= 53775;
                                                    switch (i31) {
                                                        case 1009:
                                                            i31 = 54440;
                                                            break;
                                                        case 1703:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    objM8079 = new z(z10, g1Var, null);
                                                    C0479.m9328(qVar2, objM8079);
                                                    break;
                                                }
                                                break;
                                            case 83:
                                                int i32 = 54533;
                                                while (true) {
                                                    i32 ^= 54550;
                                                    switch (i32) {
                                                        case 19:
                                                            i32 = 54564;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            break;
                                                    }
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
                        C0171.m3270(qVar2, false);
                        C0406.m7954(boolM192, (c9.e) objM8079, qVar2);
                        FillElement fillElementM2371 = C0123.m2371();
                        float f11 = C0362.f632 ^ 41;
                        y0.o oVarM5770 = C0301.m5770(fillElementM2371, f11, f11);
                        y0.f fVarM6849 = C0350.m6849();
                        y.h hVarM1683 = C0078.m1683(f10);
                        C0262.m4990(qVar2, (-693285959) ^ C0134.f160);
                        r1.j0 j0VarM4288 = C0223.m4288(hVarM1683, fVarM6849, qVar2);
                        C0262.m4990(qVar2, (-1323940844) ^ C0175.f199);
                        int iM277 = C0014.m276(qVar2);
                        m0.r1 r1VarM276 = C0014.m275(qVar2);
                        C0014.m280(C0380.m7428());
                        t1.j jVarM4452 = C0232.m4451();
                        u0.b bVarM6977 = C0356.m6976(oVarM5770);
                        int i33 = 54657;
                        while (true) {
                            i33 ^= 54674;
                            switch (i33) {
                                case 19:
                                    i33 = z11 ? 55401 : 54719;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    C0236.m4537();
                                    throw null;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 3579:
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0100.m1961(qVar2);
                        boolean zM7504 = C0383.m7502(qVar2);
                        int i34 = 55432;
                        while (true) {
                            i34 ^= 55449;
                            switch (i34) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i34 = zM7504 ? 55525 : 55494;
                                    break;
                                case 62:
                                    break;
                                case 95:
                                    C0446.m8685(qVar2);
                                    break;
                                case 124:
                                    C0017.m346(qVar2, jVarM4452);
                                    int i35 = 55556;
                                    while (true) {
                                        i35 ^= 55573;
                                        switch (i35) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i35 = 55587;
                                                break;
                                            case 54:
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        t1.i iVarM1208 = C0063.m1208();
                        C0089.m1904(qVar2, j0VarM4288, iVarM1208);
                        t1.i iVarM9055 = C0465.m9055();
                        C0089.m1904(qVar2, r1VarM276, iVarM9055);
                        t1.i iVarM5563 = C0290.m5562();
                        boolean zM7505 = C0383.m7502(qVar2);
                        int i36 = 55680;
                        while (true) {
                            i36 ^= 55697;
                            switch (i36) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i36 = !zM7505 ? 56424 : 56393;
                                    break;
                                case 1467:
                                    break;
                                case 1496:
                                    C0133.m2574(iM277, qVar2, iM277, iVarM5563);
                                    break;
                                case 1529:
                                    boolean zM43910 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM277));
                                    int i37 = 56455;
                                    while (true) {
                                        i37 ^= 56472;
                                        switch (i37) {
                                            case 31:
                                                i37 = !zM43910 ? 56548 : 56517;
                                                break;
                                            case 62:
                                                break;
                                            case 93:
                                                break;
                                            case 124:
                                                int i38 = 56579;
                                                while (true) {
                                                    i38 ^= 56596;
                                                    switch (i38) {
                                                        case 23:
                                                            i38 = 56610;
                                                            break;
                                                        case 54:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    C0133.m2574(iM277, qVar2, iM277, iVarM5563);
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
                        C0353.m6912(0, bVarM6977, new l2(qVar2), qVar2, 2058659931 ^ C0346.f616);
                        C0322.m6225(C0280.m5405(C0409.m8005(supportedApp), qVar2), C0464.m9017(supportedApp), C0334.m6470(C0154.m2949(lVarM4370, C0163.f187 ^ (-672)), C0420.m8237(f11)), null, C0275.m5283(), 0.0f, null, qVar2, C0028.f48 ^ 24947, C0014.f34 ^ 938);
                        y0.o oVarM4269 = C0222.m4269();
                        C0262.m4990(qVar2, (-483455700) ^ C0167.f191);
                        r1.j0 j0VarM4232 = C0219.m4231(C0204.m3900(), eVarM3300, qVar2);
                        C0262.m4990(qVar2, (-1323940199) ^ C0378.f648);
                        int iM278 = C0014.m276(qVar2);
                        m0.r1 r1VarM277 = C0014.m275(qVar2);
                        u0.b bVarM6978 = C0356.m6976(oVarM4269);
                        int i39 = 1507503;
                        while (true) {
                            i39 ^= 1507520;
                            switch (i39) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    C0236.m4537();
                                    throw null;
                                case 111:
                                    i39 = z11 ? 1507596 : 1507565;
                                    break;
                                case 460:
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0100.m1961(qVar2);
                        boolean zM7506 = C0383.m7502(qVar2);
                        int i40 = 1507627;
                        while (true) {
                            i40 ^= 1507644;
                            switch (i40) {
                                case 23:
                                    i40 = zM7506 ? 1507720 : 1507689;
                                    break;
                                case 85:
                                    C0446.m8685(qVar2);
                                    break;
                                case 118:
                                    break;
                                case 180:
                                    C0017.m346(qVar2, jVarM4452);
                                    int i41 = 1507751;
                                    while (true) {
                                        i41 ^= 1507768;
                                        switch (i41) {
                                            case 31:
                                                i41 = 1508433;
                                                break;
                                            case 1513:
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0089.m1904(qVar2, j0VarM4232, iVarM1208);
                        C0089.m1904(qVar2, r1VarM277, iVarM9055);
                        boolean zM7507 = C0383.m7502(qVar2);
                        int i42 = 1508526;
                        while (true) {
                            i42 ^= 1508543;
                            switch (i42) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i42 = !zM7507 ? 1508619 : 1508588;
                                    break;
                                case 83:
                                    C0133.m2574(iM278, qVar2, iM278, iVarM5563);
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    boolean zM43911 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM278));
                                    int i43 = 1508650;
                                    while (true) {
                                        i43 ^= 1508667;
                                        switch (i43) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i43 = !zM43911 ? 1509394 : 1508712;
                                                break;
                                            case 83:
                                                break;
                                            case 114:
                                                break;
                                            case 3369:
                                                C0133.m2574(iM278, qVar2, iM278, iVarM5563);
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
                        C0353.m6912(0, bVarM6978, new l2(qVar2), qVar2, 2058660695 ^ C0465.f735);
                        C0185.m3537(C0464.m9017(supportedApp), null, C0100.m1964(), C0135.m2601(C0356.f626 ^ (-128)), null, C0081.m1734(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 199680, 0, 130837 ^ C0390.f660);
                        boolean zM15 = C0000.m14((Boolean) C0419.m8214(g1Var));
                        l3 l3VarM8641 = C0443.m8641(this);
                        int i44 = 1509425;
                        while (true) {
                            i44 ^= 1509442;
                            switch (i44) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    C0319.m6169();
                                    strM6122 = C0317.m6122(C0342.m6689(m4149(), 28, C0476.f746 ^ (-9), 1161), (String) C0419.m8214(l3VarM8641));
                                    int i45 = 1509673;
                                    while (true) {
                                        i45 ^= 1509690;
                                        switch (i45) {
                                            case 19:
                                                i45 = 1510355;
                                                break;
                                            case 745:
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 115:
                                    i44 = zM15 ? 1509518 : 1509487;
                                    break;
                                case 204:
                                    C0319.m6169();
                                    strM6122 = C0317.m6122(C0261.m4969(m4149(), 10, C0174.f198 ^ (-187), 2482), (String) C0419.m8214(l3VarM8641));
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i46 = 1509549;
                        while (true) {
                            i46 ^= 1509566;
                            switch (i46) {
                                case 19:
                                    i46 = 1509580;
                                    break;
                                case 114:
                                    boolean zM16 = C0000.m14((Boolean) C0419.m8214(g1Var));
                                    int i47 = 1510448;
                                    while (true) {
                                        i47 ^= 1510465;
                                        switch (i47) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 47:
                                                jM4129 = C0217.m4129(C0001.m41(), 0.6f);
                                                int i48 = 1511347;
                                                while (true) {
                                                    i48 ^= 1511364;
                                                    switch (i48) {
                                                        case 22:
                                                            break;
                                                        case 119:
                                                            i48 = 1511378;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 113:
                                                i47 = zM16 ? 1510541 : 1510510;
                                                break;
                                            case 204:
                                                jM4129 = C0277.m5325();
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int i49 = 1510572;
                                    while (true) {
                                        i49 ^= 1510589;
                                        switch (i49) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i49 = 1510603;
                                                break;
                                            case 118:
                                                C0185.m3537(strM6122, null, jM4129, C0135.m2601(C0290.f434 ^ (-220)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3072, 0, 130298 ^ C0403.f673);
                                                C0171.m3270(qVar2, false);
                                                C0171.m3270(qVar2, true);
                                                C0171.m3270(qVar2, false);
                                                C0171.m3270(qVar2, false);
                                                C0109.m2115(new t.q0(mapM3355, supportedApp, contextM7414, packageManagerM6151, 3), null, false, null, null, C0059.m1122(qVar2, 1864392613 ^ C0132.f158, new s.i(supportedApp, C0110.f136 ^ 471)), qVar2, C0049.f69 ^ 196911, C0439.f709 ^ 664);
                                                C0064.m1236(C0000.m14((Boolean) C0419.m8214(g1Var)), new b.g(C0113.m2190(this), supportedApp, g1Var, C0305.f452 ^ 6), null, null, false, C0008.m157(C0349.m6826(), C0277.m5325(), (-708) ^ ((long) C0381.f651), qVar2, (-64984) ^ C0079.f113), null, qVar2, 0, C0396.f666 ^ 965);
                                                C0016.m325(qVar2, false, true, false, false);
                                                int iM171 = C0008.m171(listM8472);
                                                int i50 = 1511471;
                                                while (true) {
                                                    i50 ^= 1511488;
                                                    switch (i50) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case 111:
                                                            i50 = i21 < ((iM171 + (-16)) + (-1)) + 16 ? 1511564 : 1511533;
                                                            break;
                                                        case 204:
                                                            C0066.m1267(C0013.m245(lVarM4370, f11, 0.0f, C0139.f165 ^ 640), (float) 0.5d, C0485.m9422(), qVar2, C0032.f52 ^ (-728), 0);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0171.m3270(qVar2, false);
                                                i20 = (i23 ^ (-707)) + i21;
                                                int i51 = 1511595;
                                                while (true) {
                                                    i51 ^= 1511612;
                                                    switch (i51) {
                                                        case 23:
                                                            i51 = 1512277;
                                                            break;
                                                        case 1001:
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
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
