package k0;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import c0.C0057;
import c1.C0058;
import c1.C0061;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.annotations.C0128;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0236;
import e2.C0261;
import e7.C0264;
import f0.C0271;
import g4.C0289;
import g5.C0291;
import i4.C0317;
import l6.C0343;
import m5.C0355;
import n.C0360;
import n1.C0362;
import p8.C0379;
import q0.C0382;
import q7.C0389;
import s0.C0410;
import s2.C0411;
import u4.C0435;
import v5.C0445;
import v7.C0448;
import w2.C0456;
import w6.C0464;
import x5.C0470;
import y.C0474;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d9.j implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f483short = {431, 424, 432, 423, 426, 431, 418, 486, 433, 419, 431, 417, 430, 434, 486, 503, 488, 502, 509, 486, 427, 435, 437, 434, 486, 420, 419, 486, 417, 436, 419, 423, 434, 419, 436, 486, 434, 430, 423, 424, 486, 444, 419, 436, 425};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f8724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c9.e eVar, int i10) {
        super(C0118.f144 ^ (-954));
        this.f8723a = i10;
        this.f8724b = eVar;
        int iM7099 = C0362.m7099();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7099 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0264.m5049("2fD6kiB")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6413() {
        int iM1804 = C0084.m1804();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1804 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f483short;
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

    /* JADX WARN: Code duplicated, block: B:174:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x006c A[SYNTHETIC] */
    public final void a(m0.m mVar, int i10) {
        int iM7073;
        int i11;
        double d10;
        int i12;
        m0.q qVar;
        r1.j0 j0VarM2476;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        boolean z10;
        int i13;
        boolean zM7502;
        int i14;
        t1.i iVarM5562;
        boolean zM7503;
        int i15;
        boolean zM4399;
        int i16;
        int i17;
        y0.g gVarM8889 = C0456.m8889();
        Integer numM1083 = C0057.m1083(0);
        y0.l lVarM4370 = C0226.m4370();
        int iM5235 = C0271.m5235(this);
        c9.e eVarM6726 = C0343.m6726(this);
        switch (iM5235) {
            case 0:
                int i18 = C0317.f465;
                int i19 = 51712;
                while (true) {
                    i19 ^= 51729;
                    switch (i19) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i19 = ((i18 ^ 342) & i10) == 2 ? 51805 : 51774;
                            break;
                        case 47:
                            break;
                        case 76:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar2);
                            int i20 = 51836;
                            while (true) {
                                i20 ^= 51853;
                                switch (i20) {
                                    case 241:
                                        i20 = !zM1625 ? 52580 : 52549;
                                        break;
                                    case 1963:
                                        break;
                                    case 1992:
                                        C0470.m9156(qVar2);
                                        int i21 = 52735;
                                        while (true) {
                                            i21 ^= 52752;
                                            switch (i21) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    return;
                                                case 1007:
                                                    i21 = 52766;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2025:
                                        int i22 = 52611;
                                        while (true) {
                                            i22 ^= 52628;
                                            switch (i22) {
                                                case 23:
                                                    i22 = 52642;
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
                            break;
                        default:
                            break;
                    }
                }
                y0.o oVarM8743 = C0448.m8743(C0113.m2181(lVarM4370, C0058.m1098()), new HorizontalAlignElement(C0090.m1926()));
                m0.q qVar3 = (m0.q) mVar;
                C0261.m4990(qVar3, 733328855);
                r1.j0 j0VarM2477 = C0128.m2476(gVarM8889, false, qVar3);
                C0261.m4990(qVar3, -1323940314);
                int iM277 = C0014.m276(qVar3);
                m0.r1 r1VarM276 = C0014.m275(qVar3);
                C0014.m280(C0379.m7428());
                t1.j jVarM4452 = C0231.m4451();
                u0.b bVarM6977 = C0355.m6976(oVarM8743);
                boolean z11 = C0196.m3764(qVar3) instanceof m0.d;
                int i23 = 53510;
                while (true) {
                    i23 ^= 53527;
                    switch (i23) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (z11) {
                                i23 = 53603;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 83:
                            C0235.m4537();
                            throw null;
                        case 116:
                            C0100.m1961(qVar3);
                            boolean zM7504 = C0382.m7502(qVar3);
                            int i24 = 53634;
                            while (true) {
                                i24 ^= 53651;
                                switch (i24) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i24 = zM7504 ? 53727 : 53696;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        C0017.m346(qVar3, jVarM4452);
                                        int i25 = 53758;
                                        while (true) {
                                            i25 ^= 53775;
                                            switch (i25) {
                                                case 1009:
                                                    i25 = 54440;
                                                    continue;
                                                case 1703:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 83:
                                        C0445.m8685(qVar3);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0089.m1904(qVar3, j0VarM2477, C0063.m1208());
                            C0089.m1904(qVar3, r1VarM276, C0464.m9055());
                            t1.i iVarM5563 = C0289.m5562();
                            boolean zM7505 = C0382.m7502(qVar3);
                            int i26 = 54533;
                            while (true) {
                                i26 ^= 54550;
                                switch (i26) {
                                    case 19:
                                        i26 = !zM7505 ? 54626 : 54595;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 85:
                                        break;
                                    case 116:
                                        boolean zM43910 = C0228.m4399(C0411.m8078(qVar3), C0057.m1083(iM277));
                                        int i27 = 54657;
                                        while (true) {
                                            i27 ^= 54674;
                                            switch (i27) {
                                                case 19:
                                                    i27 = !zM43910 ? 55401 : 54719;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 3579:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                C0236.m4560(qVar3, bVarM6977, qVar3, numM1083, 2058660585);
                                C0464.m9049(eVarM6726, qVar3, numM1083);
                                C0171.m3270(qVar3, false);
                                C0171.m3270(qVar3, true);
                                C0171.m3270(qVar3, false);
                                C0171.m3270(qVar3, false);
                                return;
                            }
                            C0133.m2574(iM277, qVar3, iM277, iVarM5563);
                            C0236.m4560(qVar3, bVarM6977, qVar3, numM1083, 2058660585);
                            C0464.m9049(eVarM6726, qVar3, numM1083);
                            C0171.m3270(qVar3, false);
                            C0171.m3270(qVar3, true);
                            C0171.m3270(qVar3, false);
                            C0171.m3270(qVar3, false);
                            return;
                        default:
                            continue;
                    }
                    i23 = 53572;
                }
                break;
            default:
                int i28 = C0474.f745;
                int i29 = 1616;
                while (true) {
                    i29 ^= 1633;
                    switch (i29) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i29 = ((i28 ^ (-611)) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar4 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar4);
                            int i30 = 1740;
                            while (true) {
                                i30 ^= 1757;
                                switch (i30) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i30 = !zM1626 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0470.m9156(qVar4);
                                        int i31 = 48767;
                                        while (true) {
                                            i31 ^= 48784;
                                            switch (i31) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i31 = 48798;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                            iM7073 = C0360.m7073();
                                            i11 = 51588;
                                            while (true) {
                                                i11 ^= 51605;
                                                switch (i11) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (iM7073 >= 0) {
                                                            i11 = 51681;
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        return;
                                                    case 116:
                                                        System.out.println(C0179.m3419("igdnG6xl0JZe1Rrcbwu04tH5J"));
                                                        return;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i11 = 51650;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i32 = 1864;
                                        while (true) {
                                            i32 ^= 1881;
                                            switch (i32) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i32 = 48674;
                                                    continue;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            d10 = 1.0f;
                                            i12 = 48891;
                                            while (true) {
                                                i12 ^= 48908;
                                                switch (i12) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        throw new IllegalArgumentException(C0201.m3852(C0061.m1168(m6413(), 0, C0291.f439 ^ (-863), 454)));
                                                    case 503:
                                                        i12 = d10 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        y0.o oVarM8744 = C0448.m8743(C0113.m2181(new LayoutWeightElement(C0389.m7622(1.0f, Float.MAX_VALUE), false), C0410.m8064()), new HorizontalAlignElement(C0173.m3300()));
                                                        qVar = (m0.q) mVar;
                                                        C0261.m4990(qVar, 733328855);
                                                        j0VarM2476 = C0128.m2476(gVarM8889, false, qVar);
                                                        C0261.m4990(qVar, -1323940314);
                                                        iM276 = C0014.m276(qVar);
                                                        r1VarM275 = C0014.m275(qVar);
                                                        C0014.m280(C0379.m7428());
                                                        jVarM4451 = C0231.m4451();
                                                        bVarM6976 = C0355.m6976(oVarM8744);
                                                        z10 = C0196.m3764(qVar) instanceof m0.d;
                                                        i13 = 49666;
                                                        while (true) {
                                                            i13 ^= 49683;
                                                            switch (i13) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i13 = z10 ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    C0100.m1961(qVar);
                                                                    zM7502 = C0382.m7502(qVar);
                                                                    i14 = 49790;
                                                                    while (true) {
                                                                        i14 ^= 49807;
                                                                        switch (i14) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                C0445.m8685(qVar);
                                                                                break;
                                                                            case 84:
                                                                                C0017.m346(qVar, jVarM4451);
                                                                                i17 = 49914;
                                                                                while (true) {
                                                                                    i17 ^= 49931;
                                                                                    switch (i17) {
                                                                                        case 497:
                                                                                            i17 = 50596;
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
                                                                                i14 = zM7502 ? 49883 : 49852;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0089.m1904(qVar, j0VarM2476, C0063.m1208());
                                                                    C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                                                    iVarM5562 = C0289.m5562();
                                                                    zM7503 = C0382.m7502(qVar);
                                                                    i15 = 50689;
                                                                    while (true) {
                                                                        i15 ^= 50706;
                                                                        switch (i15) {
                                                                            case 19:
                                                                                i15 = !zM7503 ? 50782 : 50751;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                                                i16 = 50813;
                                                                                while (true) {
                                                                                    i16 ^= 50830;
                                                                                    switch (i16) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 53:
                                                                                            break;
                                                                                        case 243:
                                                                                            i16 = !zM4399 ? 51557 : 50875;
                                                                                            break;
                                                                                        case 4075:
                                                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                                                    C0236.m4560(qVar, bVarM6976, qVar, numM1083, 2058660585);
                                                                    C0464.m9049(eVarM6726, qVar, numM1083);
                                                                    C0171.m3270(qVar, false);
                                                                    C0171.m3270(qVar, true);
                                                                    C0171.m3270(qVar, false);
                                                                    C0171.m3270(qVar, false);
                                                                    break;
                                                                case 83:
                                                                    C0235.m4537();
                                                                    throw null;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            iM7073 = C0360.m7073();
                                            i11 = 51588;
                                            while (true) {
                                                i11 ^= 51605;
                                                switch (i11) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (iM7073 >= 0) {
                                                            i11 = 51681;
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        return;
                                                    case 116:
                                                        System.out.println(C0179.m3419("igdnG6xl0JZe1Rrcbwu04tH5J"));
                                                        return;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i11 = 51650;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            d10 = 1.0f;
                            i12 = 48891;
                            while (true) {
                                i12 ^= 48908;
                                switch (i12) {
                                    case 22:
                                        break;
                                    case 53:
                                        throw new IllegalArgumentException(C0201.m3852(C0061.m1168(m6413(), 0, C0291.f439 ^ (-863), 454)));
                                    case 503:
                                        if (d10 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                        }
                                        break;
                                    case 32495:
                                        y0.o oVarM8745 = C0448.m8743(C0113.m2181(new LayoutWeightElement(C0389.m7622(1.0f, Float.MAX_VALUE), false), C0410.m8064()), new HorizontalAlignElement(C0173.m3300()));
                                        qVar = (m0.q) mVar;
                                        C0261.m4990(qVar, 733328855);
                                        j0VarM2476 = C0128.m2476(gVarM8889, false, qVar);
                                        C0261.m4990(qVar, -1323940314);
                                        iM276 = C0014.m276(qVar);
                                        r1VarM275 = C0014.m275(qVar);
                                        C0014.m280(C0379.m7428());
                                        jVarM4451 = C0231.m4451();
                                        bVarM6976 = C0355.m6976(oVarM8745);
                                        z10 = C0196.m3764(qVar) instanceof m0.d;
                                        i13 = 49666;
                                        while (true) {
                                            i13 ^= 49683;
                                            switch (i13) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (z10) {
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    C0100.m1961(qVar);
                                                    zM7502 = C0382.m7502(qVar);
                                                    i14 = 49790;
                                                    while (true) {
                                                        i14 ^= 49807;
                                                        switch (i14) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 51:
                                                                C0445.m8685(qVar);
                                                                break;
                                                            case 84:
                                                                C0017.m346(qVar, jVarM4451);
                                                                i17 = 49914;
                                                                while (true) {
                                                                    i17 ^= 49931;
                                                                    switch (i17) {
                                                                        case 497:
                                                                            i17 = 50596;
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
                                                                if (zM7502) {
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0089.m1904(qVar, j0VarM2476, C0063.m1208());
                                                    C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                                    iVarM5562 = C0289.m5562();
                                                    zM7503 = C0382.m7502(qVar);
                                                    i15 = 50689;
                                                    while (true) {
                                                        i15 ^= 50706;
                                                        switch (i15) {
                                                            case 19:
                                                                if (!zM7503) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                                i16 = 50813;
                                                                while (true) {
                                                                    i16 ^= 50830;
                                                                    switch (i16) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 53:
                                                                            break;
                                                                        case 243:
                                                                            if (!zM4399) {
                                                                            }
                                                                            break;
                                                                        case 4075:
                                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                                    C0236.m4560(qVar, bVarM6976, qVar, numM1083, 2058660585);
                                                    C0464.m9049(eVarM6726, qVar, numM1083);
                                                    C0171.m3270(qVar, false);
                                                    C0171.m3270(qVar, true);
                                                    C0171.m3270(qVar, false);
                                                    C0171.m3270(qVar, false);
                                                    break;
                                                case 83:
                                                    C0235.m4537();
                                                    throw null;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            iM7073 = C0360.m7073();
                            i11 = 51588;
                            while (true) {
                                i11 ^= 51605;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (iM7073 >= 0) {
                                            i11 = 51681;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        return;
                                    case 116:
                                        System.out.println(C0179.m3419("igdnG6xl0JZe1Rrcbwu04tH5J"));
                                        return;
                                    default:
                                        continue;
                                        continue;
                                        continue;
                                }
                                i11 = 51650;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0271.m5235(this)) {
            case 0:
                C0193.m3706(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0193.m3706(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
