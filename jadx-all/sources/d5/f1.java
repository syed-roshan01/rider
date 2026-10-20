package d5;

import a.C0001;
import a.C0002;
import a8.C0010;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0018;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.layout.C0035;
import androidx.profileinstaller.C0045;
import b.C0049;
import c0.C0057;
import c3.C0063;
import c7.C0068;
import com.auto.accept.data.model.C0071;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0140;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.tracing.C0204;
import d8.C0222;
import d9.C0223;
import d9.C0227;
import dagger.hilt.android.C0241;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.android.migration.C0240;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.aliasof.C0248;
import dagger.hilt.internal.definecomponent.C0250;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e1.C0258;
import e1.C0259;
import e2.C0262;
import e2.C0263;
import e2.C0264;
import e8.C0266;
import f.C0271;
import f0.C0272;
import f4.C0277;
import g2.C0287;
import g4.C0290;
import h0.C0300;
import h7.C0312;
import h8.C0314;
import h8.C0315;
import i5.C0319;
import ja.C0331;
import java.text.SimpleDateFormat;
import java.util.Date;
import k7.C0338;
import k8.C0339;
import m0.C0350;
import m0.l2;
import m0.l3;
import m3.C0353;
import m5.C0356;
import m9.C0360;
import n.C0362;
import p3.C0376;
import p8.C0380;
import q0.C0383;
import r.C0393;
import s0.C0411;
import s2.C0412;
import s3.C0413;
import t0.C0419;
import t2.C0422;
import u0.C0431;
import u4.C0436;
import v5.C0446;
import v9.C0453;
import w2.C0458;
import w2.C0459;
import w6.C0465;
import x4.C0469;
import x5.C0471;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f260short = {492, 444, 416, 417, 443, 492, 395, 425, 442, 428, 1433, 1513, 1493, 1496, 1495, 1433, 1528, 1498, 1485, 1488, 1487, 1500, 2535, 2523, 2518, 2521, 2455, 2546, 2511, 2503, 2526, 2501, 2514, 2515, 2108, 2108, 2168, 2069, 2069, 2069, 2168, 2081, 2081, 2081, 2081, 2164, 2168, 2096, 2096, 2146, 2101, 2101, 2168, 2105, 2543, 2514, 2522, 2499, 2520, 2511, 2521, 2448, 2442, 1796, 1825, 1849, 1843, 1876, 1902, 1903, 1833, 1805, 1802, 875, 861, 859};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.g1 f4485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f4487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4489f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f4490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f4491o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(boolean z10, m0.g1 g1Var, String str, l3 l3Var, long j10, long j11, long j12, long j13) {
        super(C0252.f331 ^ 602);
        this.f4484a = z10;
        this.f4485b = g1Var;
        this.f4486c = str;
        this.f4487d = l3Var;
        this.f4488e = j10;
        this.f4489f = j11;
        this.f4490n = j12;
        this.f4491o = j13;
        int iM874 = C0045.m874();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM874 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0453.m8808("t3")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۥۨۥ, reason: not valid java name and contains not printable characters */
    public static short[] m4170() {
        int iM1458 = C0071.m1458();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1458 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f260short;
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

    /* JADX WARN: Code duplicated, block: B:557:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x03c6 A[SYNTHETIC] */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        i1.f fVarM5229;
        long jM6087;
        String strM8935;
        long jM6088;
        long jM5325;
        long jM5326;
        long jM5327;
        long jM5328;
        int i10;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0436.m8515((Number) obj3);
        C0376.m7360((y.v) obj, C0082.m1753(m4170(), 0, C0140.f166 ^ 73, 456));
        int i11 = C0108.f134;
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = ((i11 ^ (-21)) & iM8515) == 16 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = !zM1625 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0471.m9156(qVar);
                                int i14 = 48767;
                                while (true) {
                                    i14 ^= 48784;
                                    switch (i14) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return C0012.m238();
                                        case 239:
                                            i14 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i15 = 1864;
                                while (true) {
                                    i15 ^= 1881;
                                    switch (i15) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = 48674;
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
        y0.o oVarM4788 = C0251.m4788(lVarM4370, 16);
        m0.q qVar2 = (m0.q) mVar;
        C0262.m4990(qVar2, 483455010 ^ C0258.f337);
        y.e eVarM3900 = C0204.m3900();
        y0.e eVarM3300 = C0173.m3300();
        r1.j0 j0VarM4231 = C0219.m4231(eVarM3900, eVarM3300, qVar2);
        int i16 = (-1323939855) ^ C0177.f201;
        C0262.m4990(qVar2, i16);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0380.m7428());
        t1.j jVarM4451 = C0232.m4451();
        u0.b bVarM6976 = C0356.m6976(oVarM4788);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
        int i17 = 48891;
        while (true) {
            i17 ^= 48908;
            switch (i17) {
                case 22:
                    break;
                case 53:
                    C0236.m4537();
                    throw null;
                case 503:
                    if (z10) {
                        i17 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0383.m7502(qVar2);
                    int i18 = 49666;
                    while (true) {
                        i18 ^= 49683;
                        switch (i18) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i18 = zM7502 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4451);
                                int i19 = 49790;
                                while (true) {
                                    i19 ^= 49807;
                                    switch (i19) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i19 = 49821;
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
                    t1.i iVarM1208 = C0063.m1208();
                    C0089.m1904(qVar2, j0VarM4231, iVarM1208);
                    t1.i iVarM9055 = C0465.m9055();
                    C0089.m1904(qVar2, r1VarM275, iVarM9055);
                    t1.i iVarM5562 = C0290.m5562();
                    boolean zM7503 = C0383.m7502(qVar2);
                    int i20 = 49914;
                    while (true) {
                        i20 ^= 49931;
                        switch (i20) {
                            case 497:
                                i20 = !zM7503 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                break;
                            case 1769:
                                boolean zM4399 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM276));
                                int i21 = 50689;
                                while (true) {
                                    i21 ^= 50706;
                                    switch (i21) {
                                        case 19:
                                            i21 = !zM4399 ? 50782 : 50751;
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
                    C0353.m6912(0, bVarM6976, new l2(qVar2), qVar2, 2058660840 ^ C0075.f109);
                    FillElement fillElementM2371 = C0123.m2371();
                    y0.f fVarM6849 = C0350.m6849();
                    C0262.m4990(qVar2, (-693286052) ^ C0118.f144);
                    r1.j0 j0VarM4288 = C0223.m4288(C0113.m2180(), fVarM6849, qVar2);
                    C0262.m4990(qVar2, i16);
                    int iM277 = C0014.m276(qVar2);
                    m0.r1 r1VarM276 = C0014.m275(qVar2);
                    u0.b bVarM6977 = C0356.m6976(fillElementM2371);
                    int i22 = 50813;
                    while (true) {
                        i22 ^= 50830;
                        switch (i22) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                C0236.m4537();
                                throw null;
                            case 243:
                                if (z10) {
                                    i22 = 51557;
                                }
                                break;
                            case 4075:
                                C0100.m1961(qVar2);
                                boolean zM7504 = C0383.m7502(qVar2);
                                int i23 = 51588;
                                while (true) {
                                    i23 ^= 51605;
                                    switch (i23) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i23 = zM7504 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            C0446.m8685(qVar2);
                                            break;
                                        case 116:
                                            C0017.m346(qVar2, jVarM4451);
                                            int i24 = 51712;
                                            while (true) {
                                                i24 ^= 51729;
                                                switch (i24) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 15:
                                                    case Code.UNAUTHENTICATED /* 16 */:
                                                    default:
                                                        continue;
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i24 = 51743;
                                                        continue;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0089.m1904(qVar2, j0VarM4288, iVarM1208);
                                C0089.m1904(qVar2, r1VarM276, iVarM9055);
                                boolean zM7505 = C0383.m7502(qVar2);
                                int i25 = 51836;
                                while (true) {
                                    i25 ^= 51853;
                                    switch (i25) {
                                        case 241:
                                            i25 = !zM7505 ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            C0133.m2574(iM277, qVar2, iM277, iVarM5562);
                                            break;
                                        case 2025:
                                            boolean zM43910 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM277));
                                            int i26 = 52611;
                                            while (true) {
                                                i26 ^= 52628;
                                                switch (i26) {
                                                    case 23:
                                                        i26 = !zM43910 ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
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
                                C0353.m6912(0, bVarM6977, new l2(qVar2), qVar2, (-2058659984) ^ C0238.f317);
                                m0.g1 g1VarM6051 = C0314.m6051(this);
                                long jM3863 = C0201.m3863((Number) C0419.m8214(g1VarM6051));
                                int i27 = 52735;
                                while (true) {
                                    i27 ^= 52752;
                                    switch (i27) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            fVarM5229 = C0272.m5229();
                                            break;
                                        case 1007:
                                            i27 = jM3863 > 0 ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            fVarM5229 = C0360.m7057();
                                            int i28 = 53510;
                                            while (true) {
                                                i28 ^= 53527;
                                                switch (i28) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i28 = 53541;
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
                                long jM3864 = C0201.m3863((Number) C0419.m8214(g1VarM6051));
                                long j10 = (-4294941466L) ^ ((long) C0413.f683);
                                boolean zM8913 = C0458.m8913(this);
                                int i29 = 53634;
                                while (true) {
                                    i29 ^= 53651;
                                    switch (i29) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (jM3864 > 0) {
                                                i29 = 53727;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            int i30 = 53758;
                                            while (true) {
                                                i30 ^= 53775;
                                                switch (i30) {
                                                    case 1009:
                                                        if (zM8913) {
                                                            i30 = 54502;
                                                        }
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        jM6087 = C0045.m882();
                                                        int i31 = 54657;
                                                        while (true) {
                                                            i31 ^= 54674;
                                                            switch (i31) {
                                                                case 19:
                                                                    i31 = 54688;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1769:
                                                        jM6087 = C0019.m389(j10);
                                                        int i32 = 54533;
                                                        while (true) {
                                                            i32 ^= 54550;
                                                            switch (i32) {
                                                                case 19:
                                                                    i32 = 54564;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i30 = 54471;
                                            }
                                            break;
                                        case 83:
                                            jM6087 = C0315.m6087();
                                            break;
                                        default:
                                            continue;
                                    }
                                    i29 = 53696;
                                }
                                C0142.m2736(fVarM5229, null, C0154.m2949(lVarM4370, C0312.f459 ^ 762), jM6087, qVar2, 432, 0);
                                float f10 = C0241.f320 ^ 449;
                                C0072.m1564(C0431.m8431(lVarM4370, f10), qVar2);
                                y0.o oVarM4269 = C0222.m4269();
                                C0262.m4990(qVar2, (-483455689) ^ C0411.f681);
                                r1.j0 j0VarM4232 = C0219.m4231(eVarM3900, eVarM3300, qVar2);
                                C0262.m4990(qVar2, 1323940634 ^ C0035.f55);
                                int iM278 = C0014.m276(qVar2);
                                m0.r1 r1VarM277 = C0014.m275(qVar2);
                                u0.b bVarM6978 = C0356.m6976(oVarM4269);
                                int i33 = 55432;
                                while (true) {
                                    i33 ^= 55449;
                                    switch (i33) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (z10) {
                                                i33 = 55525;
                                            }
                                            break;
                                        case 62:
                                            break;
                                        case 95:
                                            C0236.m4537();
                                            throw null;
                                        case 124:
                                            C0100.m1961(qVar2);
                                            boolean zM7506 = C0383.m7502(qVar2);
                                            int i34 = 55556;
                                            while (true) {
                                                i34 ^= 55573;
                                                switch (i34) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i34 = zM7506 ? 55649 : 55618;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        C0446.m8685(qVar2);
                                                        int i35 = 56455;
                                                        while (true) {
                                                            i35 ^= 56472;
                                                            switch (i35) {
                                                                case 31:
                                                                    i35 = 56486;
                                                                    continue;
                                                                case 62:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 116:
                                                        C0017.m346(qVar2, jVarM4451);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i36 = 55680;
                                            while (true) {
                                                i36 ^= 55697;
                                                switch (i36) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i36 = 56362;
                                                        break;
                                                    case 1467:
                                                        C0089.m1904(qVar2, j0VarM4232, iVarM1208);
                                                        C0089.m1904(qVar2, r1VarM277, iVarM9055);
                                                        boolean zM7507 = C0383.m7502(qVar2);
                                                        int i37 = 56579;
                                                        while (true) {
                                                            i37 ^= 56596;
                                                            switch (i37) {
                                                                case 23:
                                                                    i37 = !zM7507 ? 1507472 : 56641;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 85:
                                                                    i10 = 1507627;
                                                                    while (true) {
                                                                        i10 ^= 1507644;
                                                                        switch (i10) {
                                                                            case 23:
                                                                                i10 = 1507658;
                                                                                continue;
                                                                                continue;
                                                                            case 118:
                                                                                C0133.m2574(iM278, qVar2, iM278, iVarM5562);
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1564036:
                                                                    boolean zM43911 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM278));
                                                                    int i38 = 1507503;
                                                                    while (true) {
                                                                        i38 ^= 1507520;
                                                                        switch (i38) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                int i39 = 1507751;
                                                                                while (true) {
                                                                                    i39 ^= 1507768;
                                                                                    switch (i39) {
                                                                                        case 31:
                                                                                            i39 = 1508433;
                                                                                            continue;
                                                                                        case 1513:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 111:
                                                                                i38 = !zM43911 ? 1507596 : 1507565;
                                                                                break;
                                                                            case 460:
                                                                                i10 = 1507627;
                                                                                while (true) {
                                                                                    i10 ^= 1507644;
                                                                                    switch (i10) {
                                                                                        case 23:
                                                                                            i10 = 1507658;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 118:
                                                                                            C0133.m2574(iM278, qVar2, iM278, iVarM5562);
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
                                                                default:
                                                                    break;
                                                            }
                                                            C0353.m6912(0, bVarM6978, new l2(qVar2), qVar2, (-2058660179) ^ C0118.f144);
                                                            long jM3865 = C0201.m3863((Number) C0419.m8214(g1VarM6051));
                                                            int i40 = 1508526;
                                                            while (true) {
                                                                i40 ^= 1508543;
                                                                switch (i40) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i40 = jM3865 > 0 ? 1508619 : 1508588;
                                                                        break;
                                                                    case 83:
                                                                        strM8935 = C0459.m8935(m4170(), 22, C0287.f431 ^ 360, 2487);
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 436:
                                                                        strM8935 = C0259.m4942(new StringBuilder(), C0240.m4592(this), C0248.m4739(m4170(), 10, C0263.f342 ^ 177, 1465));
                                                                        int i41 = 1508650;
                                                                        while (true) {
                                                                            i41 ^= 1508667;
                                                                            switch (i41) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i41 = 1508681;
                                                                                    continue;
                                                                                case 114:
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
                                                            f2.l lVarM1734 = C0081.m1734();
                                                            long jM3866 = C0201.m3863((Number) C0419.m8214(g1VarM6051));
                                                            int i42 = 1509425;
                                                            while (true) {
                                                                i42 ^= 1509442;
                                                                switch (i42) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        jM6088 = C0315.m6087();
                                                                        int i43 = 1510572;
                                                                        while (true) {
                                                                            i43 ^= 1510589;
                                                                            switch (i43) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i43 = 1510603;
                                                                                    continue;
                                                                                case 118:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 115:
                                                                        i42 = jM3866 > 0 ? 1509518 : 1509487;
                                                                        break;
                                                                    case 204:
                                                                        int i44 = 1509549;
                                                                        while (true) {
                                                                            i44 ^= 1509566;
                                                                            switch (i44) {
                                                                                case 19:
                                                                                    i44 = zM8913 ? 1509642 : 1509611;
                                                                                    break;
                                                                                case 85:
                                                                                    jM6088 = C0045.m882();
                                                                                    int i45 = 1510448;
                                                                                    while (true) {
                                                                                        i45 ^= 1510465;
                                                                                        switch (i45) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case 113:
                                                                                                i45 = 1510479;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    jM6088 = C0019.m389(j10);
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
                                                            int i46 = 1509673;
                                                            while (true) {
                                                                i46 ^= 1509690;
                                                                switch (i46) {
                                                                    case 19:
                                                                        i46 = 1510355;
                                                                        break;
                                                                    case 745:
                                                                        C0185.m3537(strM8935, null, jM6088, C0135.m2601(C0264.f343 ^ 534), null, lVarM1734, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 199680, 0, 130483 ^ C0300.f447);
                                                                        C0262.m4990(qVar2, (-1468227843) ^ C0338.f608);
                                                                        l3 l3VarM2860 = C0149.m2860(this);
                                                                        long jM3867 = C0201.m3863((Number) C0419.m8214(l3VarM2860));
                                                                        int i47 = 1511347;
                                                                        while (true) {
                                                                            i47 ^= 1511364;
                                                                            switch (i47) {
                                                                                case 22:
                                                                                    break;
                                                                                case 53:
                                                                                    break;
                                                                                case 119:
                                                                                    i47 = jM3867 > 0 ? 1511440 : 1511409;
                                                                                    break;
                                                                                case 8148:
                                                                                    C0185.m3537(C0022.m442(C0002.m45(m4170(), 54, C0076.f110 ^ 718, 2474), C0339.m6642(new SimpleDateFormat(C0259.m4943(m4170(), 34, C0018.f38 ^ (-598), 2136), C0068.m1317()), new Date(C0201.m3863((Number) C0419.m8214(l3VarM2860))))), null, C0001.m41(), C0135.m2601(C0165.f189 ^ 300), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3072, 0, (-130907) ^ C0174.f198);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0016.m325(qVar2, false, false, true, false);
                                                                        C0016.m325(qVar2, false, false, true, false);
                                                                        C0171.m3270(qVar2, false);
                                                                        C0262.m4990(qVar2, (-1578276890) ^ C0105.f131);
                                                                        long jM3868 = C0201.m3863((Number) C0419.m8214(g1VarM6051));
                                                                        int i48 = 1511471;
                                                                        while (true) {
                                                                            i48 ^= 1511488;
                                                                            switch (i48) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 111:
                                                                                    if (jM3868 > 0) {
                                                                                        i48 = 1511564;
                                                                                    }
                                                                                    break;
                                                                                case 204:
                                                                                    C0072.m1564(C0271.m5166(lVarM4370, f10), qVar2);
                                                                                    y.f fVarM197 = C0010.m197();
                                                                                    C0262.m4990(qVar2, (-693285924) ^ C0250.f329);
                                                                                    r1.j0 j0VarM4289 = C0223.m4288(fVarM197, C0393.m7688(), qVar2);
                                                                                    C0262.m4990(qVar2, 1323940039 ^ C0422.f692);
                                                                                    int iM279 = C0014.m276(qVar2);
                                                                                    m0.r1 r1VarM278 = C0014.m275(qVar2);
                                                                                    u0.b bVarM6979 = C0356.m6976(fillElementM2371);
                                                                                    int i49 = 1511595;
                                                                                    while (true) {
                                                                                        i49 ^= 1511612;
                                                                                        switch (i49) {
                                                                                            case 23:
                                                                                                if (z10) {
                                                                                                    i49 = 1512339;
                                                                                                }
                                                                                                break;
                                                                                            case 815:
                                                                                                C0100.m1961(qVar2);
                                                                                                boolean zM7508 = C0383.m7502(qVar2);
                                                                                                int i50 = 1512370;
                                                                                                while (true) {
                                                                                                    i50 ^= 1512387;
                                                                                                    switch (i50) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            C0446.m8685(qVar2);
                                                                                                            int i51 = 1513269;
                                                                                                            while (true) {
                                                                                                                i51 ^= 1513286;
                                                                                                                switch (i51) {
                                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                        break;
                                                                                                                    case 115:
                                                                                                                        i51 = 1513300;
                                                                                                                        continue;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            i50 = zM7508 ? 1512463 : 1512432;
                                                                                                            break;
                                                                                                        case 1996:
                                                                                                            C0017.m346(qVar2, jVarM4451);
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                int i52 = 1512494;
                                                                                                while (true) {
                                                                                                    i52 ^= 1512511;
                                                                                                    switch (i52) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i52 = 1512525;
                                                                                                            break;
                                                                                                        case 114:
                                                                                                            C0089.m1904(qVar2, j0VarM4289, iVarM1208);
                                                                                                            C0089.m1904(qVar2, r1VarM278, iVarM9055);
                                                                                                            boolean zM7509 = C0383.m7502(qVar2);
                                                                                                            int i53 = 1513393;
                                                                                                            while (true) {
                                                                                                                i53 ^= 1513410;
                                                                                                                switch (i53) {
                                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                        break;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                        C0133.m2574(iM279, qVar2, iM279, iVarM5562);
                                                                                                                        break;
                                                                                                                    case 115:
                                                                                                                        i53 = !zM7509 ? 1513486 : 1513455;
                                                                                                                        break;
                                                                                                                    case 4044:
                                                                                                                        boolean zM43912 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM279));
                                                                                                                        int i54 = 1513517;
                                                                                                                        while (true) {
                                                                                                                            i54 ^= 1513534;
                                                                                                                            switch (i54) {
                                                                                                                                case 19:
                                                                                                                                    i54 = !zM43912 ? 1514261 : 1514230;
                                                                                                                                    break;
                                                                                                                                case 712:
                                                                                                                                    break;
                                                                                                                                case 745:
                                                                                                                                    break;
                                                                                                                                case 811:
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
                                                                                                            C0353.m6912(0, bVarM6979, new l2(qVar2), qVar2, (-2058660498) ^ C0376.f646);
                                                                                                            String strM477 = C0024.m477(C0193.m3683(this));
                                                                                                            String strM1814 = C0085.m1814(m4170(), 63, C0319.f466 ^ 171, 1856);
                                                                                                            int i55 = 1514292;
                                                                                                            while (true) {
                                                                                                                i55 ^= 1514309;
                                                                                                                switch (i55) {
                                                                                                                    case 22:
                                                                                                                        break;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                                                        jM5325 = C0277.m5325();
                                                                                                                        break;
                                                                                                                    case 113:
                                                                                                                        i55 = zM8913 ? 1514385 : 1514354;
                                                                                                                        break;
                                                                                                                    case 212:
                                                                                                                        jM5325 = C0019.m389(j10);
                                                                                                                        int i56 = 1514416;
                                                                                                                        while (true) {
                                                                                                                            i56 ^= 1514433;
                                                                                                                            switch (i56) {
                                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                                    break;
                                                                                                                                case 113:
                                                                                                                                    i56 = 1514447;
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
                                                                                                            C0362.m7084(strM477, strM1814, jM5325, qVar2, C0247.f326 ^ (-702));
                                                                                                            String strM6381 = C0331.m6381(C0024.m477(C0469.m9119(this)));
                                                                                                            String strM5070 = C0266.m5070(m4170(), 67, C0486.f759 ^ 52, 1820);
                                                                                                            int i57 = 1515191;
                                                                                                            while (true) {
                                                                                                                i57 ^= 1515208;
                                                                                                                switch (i57) {
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                                        break;
                                                                                                                    case 61:
                                                                                                                        jM5326 = C0277.m5325();
                                                                                                                        break;
                                                                                                                    case 127:
                                                                                                                        i57 = zM8913 ? 1515284 : 1515253;
                                                                                                                        break;
                                                                                                                    case 476:
                                                                                                                        jM5326 = C0019.m389(j10);
                                                                                                                        int i58 = 1515315;
                                                                                                                        while (true) {
                                                                                                                            i58 ^= 1515332;
                                                                                                                            switch (i58) {
                                                                                                                                case 22:
                                                                                                                                    break;
                                                                                                                                case 119:
                                                                                                                                    i58 = 1515346;
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
                                                                                                            C0362.m7084(strM6381, strM5070, jM5326, qVar2, C0049.f69 ^ 287);
                                                                                                            String strM6382 = C0331.m6381(C0024.m477(C0356.m6963(this)));
                                                                                                            String strM2228 = C0115.m2228(m4170(), 70, C0084.f118 ^ 518, 1892);
                                                                                                            int i59 = 1515439;
                                                                                                            while (true) {
                                                                                                                i59 ^= 1515456;
                                                                                                                switch (i59) {
                                                                                                                    case 111:
                                                                                                                        i59 = zM8913 ? 1516183 : 1516152;
                                                                                                                        break;
                                                                                                                    case 15703:
                                                                                                                        jM5327 = C0019.m389(j10);
                                                                                                                        int i60 = 1516214;
                                                                                                                        while (true) {
                                                                                                                            i60 ^= 1516231;
                                                                                                                            switch (i60) {
                                                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                    break;
                                                                                                                                case 113:
                                                                                                                                    i60 = 1516245;
                                                                                                                                    continue;
                                                                                                                                default:
                                                                                                                                    continue;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 15769:
                                                                                                                        break;
                                                                                                                    case 15800:
                                                                                                                        jM5327 = C0277.m5325();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            C0362.m7084(strM6382, strM2228, jM5327, qVar2, C0076.f110 ^ 759);
                                                                                                            String strM6383 = C0331.m6381(C0024.m477(C0131.m2537(this)));
                                                                                                            String strM2710 = C0141.m2710(m4170(), 73, C0108.f134 ^ (-71), 824);
                                                                                                            int i61 = 1516338;
                                                                                                            while (true) {
                                                                                                                i61 ^= 1516355;
                                                                                                                switch (i61) {
                                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                        break;
                                                                                                                    case 51:
                                                                                                                        jM5328 = C0277.m5325();
                                                                                                                        break;
                                                                                                                    case 113:
                                                                                                                        i61 = zM8913 ? 1537263 : 1516400;
                                                                                                                        break;
                                                                                                                    case 22444:
                                                                                                                        jM5328 = C0019.m389(j10);
                                                                                                                        int i62 = 1537294;
                                                                                                                        while (true) {
                                                                                                                            i62 ^= 1537311;
                                                                                                                            switch (i62) {
                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                    i62 = 1537325;
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
                                                                                                            C0362.m7084(strM6383, strM2710, jM5328, qVar2, C0353.f623 ^ (-579));
                                                                                                            C0016.m325(qVar2, false, true, false, false);
                                                                                                            int i63 = 1537418;
                                                                                                            while (true) {
                                                                                                                i63 ^= 1537435;
                                                                                                                switch (i63) {
                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                        i63 = 1537449;
                                                                                                                        break;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 968:
                                                                                                C0236.m4537();
                                                                                                throw null;
                                                                                            case 1001:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        i49 = 1512308;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i48 = 1511533;
                                                                        }
                                                                        C0016.m325(qVar2, false, false, true, false);
                                                                        C0171.m3270(qVar2, false);
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i33 = 55494;
                                }
                                break;
                            default:
                                continue;
                        }
                        i22 = 50875;
                    }
                    break;
                default:
                    continue;
            }
            i17 = 48953;
        }
        return C0012.m238();
    }
}
