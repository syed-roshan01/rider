package d5;

import a3.C0006;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.platform.C0038;
import androidx.profileinstaller.C0045;
import c0.C0057;
import c3.C0062;
import c3.C0063;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.abt.C0113;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.inject.C0172;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.gson.internal.sql.C0208;
import d9.C0222;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0261;
import e7.C0264;
import f.C0270;
import g4.C0289;
import h0.C0299;
import h8.C0314;
import l0.C0339;
import l6.C0343;
import m0.C0349;
import m0.l2;
import m3.C0352;
import m5.C0355;
import p0.C0374;
import p3.C0375;
import p8.C0379;
import q0.C0382;
import q7.C0390;
import r1.C0393;
import r5.C0400;
import s2.C0411;
import u0.C0430;
import u4.C0435;
import v5.C0445;
import w6.C0464;
import x5.C0470;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f255short = {1157, 1237, 1225, 1224, 1234, 1157, 1250, 1216, 1235, 1221, 1432, 1449, 1457, 1445, 1453, 1446, 1468, 1512, 1435, 1469, 1451, 1451, 1453, 1467, 1467, 1454, 1469, 1444, 1513, 1512, 1432, 1444, 1449, 1446, 1512, 1449, 1451, 1468, 1441, 1470, 1449, 1468, 1453, 1452, 1512, 8923, 302, 287, 263, 275, 283, 272, 266, 350, 272, 273, 266, 350, 282, 283, 266, 283, 285, 266, 283, 282, 336, 350, 302, 274, 283, 287, 269, 283, 350, 270, 287, 263, 350, 280, 279, 268, 269, 266, 350, 287, 272, 282, 350, 266, 268, 263, 350, 287, 281, 287, 279, 272, 336};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(boolean z10) {
        super(C0299.f447 ^ 610);
        this.f4456a = z10;
        int iM269 = C0014.m269();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM269 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0374.m7354("M1VfE2lxtbxvZ7CiXDQslIB")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m4163() {
        int iM3868 = C0202.m3868();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3868 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f255short;
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

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        i1.f fVarM1591;
        long jM6087;
        String strM6661;
        long jM6088;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0435.m8515((Number) obj3);
        C0375.m7360((y.v) obj, C0486.m9476(m4163(), 0, C0390.f661 ^ (-305), 1185));
        int i10 = C0020.f40;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-716)) & iM8515) == 16 ? 1709 : 1678;
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
        y0.f fVarM6849 = C0349.m6849();
        m0.q qVar2 = (m0.q) mVar;
        C0261.m4990(qVar2, (-693286848) ^ C0091.f125);
        r1.j0 j0VarM4288 = C0222.m4288(C0113.m2180(), fVarM6849, qVar2);
        C0261.m4990(qVar2, 1323940334 ^ C0199.f223);
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
                    C0089.m1904(qVar2, j0VarM4288, C0063.m1208());
                    C0089.m1904(qVar2, r1VarM275, C0464.m9055());
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
                    C0352.m6912(0, bVarM6976, new l2(qVar2), qVar2, (-2058660402) ^ C0038.f58);
                    boolean zM1179 = C0062.m1179(this);
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                fVarM1591 = C0073.m1591();
                                break;
                            case 243:
                                i20 = zM1179 ? 51557 : 50875;
                                break;
                            case 4075:
                                fVarM1591 = C0375.m7356();
                                int i21 = 51588;
                                while (true) {
                                    i21 ^= 51605;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = 51619;
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
                    int i22 = 51712;
                    while (true) {
                        i22 ^= 51729;
                        switch (i22) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i22 = zM1179 ? 51805 : 51774;
                                break;
                            case 47:
                                jM6087 = C0314.m6087();
                                int i23 = 52611;
                                while (true) {
                                    i23 ^= 52628;
                                    switch (i23) {
                                        case 23:
                                            i23 = 52642;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 76:
                                jM6087 = C0045.m882();
                                break;
                            default:
                                break;
                        }
                    }
                    int i24 = 51836;
                    while (true) {
                        i24 ^= 51853;
                        switch (i24) {
                            case 241:
                                i24 = 52518;
                                break;
                            case 1963:
                                C0142.m2736(fVarM1591, null, C0154.m2949(lVarM4370, C0393.f664 ^ 269), jM6087, qVar2, 432, 0);
                                C0072.m1564(C0430.m8431(lVarM4370, C0343.f614 ^ 403), qVar2);
                                int i25 = 52735;
                                while (true) {
                                    i25 ^= 52752;
                                    switch (i25) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            strM6661 = C0339.m6661(m4163(), 46, C0006.f1064 ^ 219, 382);
                                            int i26 = 53634;
                                            while (true) {
                                                i26 ^= 53651;
                                                switch (i26) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i26 = 53665;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 1007:
                                            i25 = zM1179 ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            strM6661 = C0264.m5055(m4163(), 10, C0400.f671 ^ 94, 1480);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i27 = 53510;
                                while (true) {
                                    i27 ^= 53527;
                                    switch (i27) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i27 = 53541;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            int i28 = 53758;
                                            while (true) {
                                                i28 ^= 53775;
                                                switch (i28) {
                                                    case 1009:
                                                        if (zM1179) {
                                                            i28 = 54502;
                                                        }
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        jM6088 = C0314.m6087();
                                                        break;
                                                    case 1769:
                                                        jM6088 = C0045.m882();
                                                        int i29 = 54533;
                                                        while (true) {
                                                            i29 ^= 54550;
                                                            switch (i29) {
                                                                case 19:
                                                                    i29 = 54564;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i28 = 54471;
                                            }
                                            C0185.m3537(strM6661, null, jM6088, C0135.m2601(C0172.f196 ^ 302), null, C0270.m5164(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 199680, 0, 130736 ^ C0208.f232);
                                            C0016.m325(qVar2, false, true, false, false);
                                            break;
                                    }
                                }
                                break;
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
