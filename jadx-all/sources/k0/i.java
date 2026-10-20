package k0;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0018;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.layout.C0036;
import androidx.compose.ui.semantics.C0039;
import androidx.versionedparcelable.C0048;
import b4.C0052;
import c0.C0057;
import c1.C0058;
import c1.C0059;
import c1.C0060;
import c3.C0062;
import c3.C0063;
import c4.C0066;
import ca.C0070;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.gson.internal.sql.C0208;
import d1.C0212;
import d1.C0214;
import d2.C0216;
import d3.C0217;
import d9.C0227;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.codegen.C0242;
import dagger.hilt.codegen.C0243;
import dagger.hilt.components.C0245;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.aliasof.C0248;
import e2.C0262;
import e2.C0264;
import g3.C0289;
import g4.C0290;
import h5.C0307;
import h6.C0310;
import i6.C0321;
import k7.C0338;
import m3.C0353;
import m5.C0356;
import p4.C0377;
import p8.C0380;
import q0.C0383;
import q2.C0385;
import q5.C0386;
import r.C0393;
import r1.C0394;
import r2.C0397;
import s2.C0412;
import t2.C0421;
import t2.C0423;
import t3.C0425;
import v0.C0442;
import v5.C0446;
import v7.C0450;
import v9.C0452;
import w1.C0456;
import w6.C0465;
import x5.C0471;
import x7.C0473;
import y9.C0479;
import z0.C0483;
import z3.C0488;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8991a = C0421.f691 ^ 45;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8992b = C0423.f693 ^ (-267);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y.u0 f8993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y.u0 f8994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y.u0 f8995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y.u0 f8996f;

    static {
        float f10 = C0174.f198 ^ (-177);
        f8993c = new y.u0(f10, f10, f10, f10);
        float f11 = C0242.f321 ^ (-822);
        f8994d = C0310.m5977(f11);
        f8995e = C0310.m5977(f11);
        f8996f = C0310.m5977(f10);
    }

    /* JADX WARN: Code duplicated, block: B:517:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0409 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0694 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x06c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x06c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x06c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0696 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x068c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x074a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x06d0 A[SYNTHETIC] */
    public static final void a(c9.e eVar, y0.o oVar, c9.e eVar2, c9.e eVar3, c9.e eVar4, e1.l0 l0Var, long j10, float f10, long j11, long j12, long j13, long j14, m0.m mVar, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        y0.o oVar2;
        int i28;
        int i29;
        int i30;
        int i31;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, 1522576303 ^ C0264.f343);
        int i32 = 1616;
        while (true) {
            i32 ^= 1633;
            switch (i32) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i32 = ((i12 ^ (-2)) & i12) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i13 = (C0012.f32 ^ 932) | i10;
                    int i33 = 1740;
                    while (true) {
                        i33 ^= 1757;
                        switch (i33) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i34 = C0377.f647;
                    int i35 = 1864;
                    while (true) {
                        i35 ^= 1881;
                        switch (i35) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i35 = ((i34 ^ 824) & i10) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i13 = i10;
                                break;
                            case 47417:
                                boolean zM5551 = C0289.m5551(qVar, eVar);
                                int i36 = 48767;
                                while (true) {
                                    i36 ^= 48784;
                                    switch (i36) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i14 = 2;
                                            break;
                                        case 76:
                                            i14 = 4;
                                            int i37 = 48891;
                                            while (true) {
                                                i37 ^= 48908;
                                                switch (i37) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i37 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i36 = zM5551 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i13 = (i14 & i10) | (i14 ^ i10);
                                int i38 = 49666;
                                while (true) {
                                    i38 ^= 49683;
                                    switch (i38) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i38 = 49697;
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
        int i39 = i12 & (C0208.f232 ^ 352);
        int i40 = 49790;
        while (true) {
            i40 ^= 49807;
            switch (i40) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    int i41 = C0039.f59;
                    int i42 = 50689;
                    while (true) {
                        i42 ^= 50706;
                        switch (i42) {
                            case 19:
                                i42 = ((i41 ^ 774) & i10) == 0 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i31 = 49914;
                                while (true) {
                                    i31 ^= 49931;
                                    switch (i31) {
                                        case 497:
                                            i31 = 50596;
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
                                boolean zM2013 = C0103.m2013(qVar, oVar);
                                int i43 = 50813;
                                while (true) {
                                    i43 ^= 50830;
                                    switch (i43) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i15 = 16;
                                            break;
                                        case 243:
                                            i43 = zM2013 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            i15 = 32;
                                            int i44 = 51588;
                                            while (true) {
                                                i44 ^= 51605;
                                                switch (i44) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i44 = 51619;
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
                    i13 |= C0245.f324 ^ 564;
                    i31 = 49914;
                    while (true) {
                        i31 ^= 49931;
                        switch (i31) {
                            case 497:
                                i31 = 50596;
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
                    i40 = i39 != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
            int i45 = C0262.f341;
            int i46 = 51712;
            while (true) {
                i46 ^= 51729;
                switch (i46) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i46 = ((i45 ^ (-866)) & i12) != 0 ? 51805 : 51774;
                        break;
                    case 47:
                        int i47 = C0247.f326;
                        int i48 = 52611;
                        while (true) {
                            i48 ^= 52628;
                            switch (i48) {
                                case 23:
                                    i48 = ((i47 ^ (-782)) & i10) == 0 ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    break;
                                case 116:
                                    boolean zM5552 = C0289.m5551(qVar, eVar2);
                                    int i49 = 52735;
                                    while (true) {
                                        i49 ^= 52752;
                                        switch (i49) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                i16 = 128;
                                                break;
                                            case 1007:
                                                i49 = zM5552 ? 53479 : 52797;
                                                break;
                                            case 7927:
                                                i16 = 256;
                                                int i50 = 53510;
                                                while (true) {
                                                    i50 ^= 53527;
                                                    switch (i50) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i50 = 53541;
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
                                    i13 = (i13 & i16) | (i13 ^ i16);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 76:
                        i13 |= C0036.f56 ^ 426;
                        int i51 = 51836;
                        while (true) {
                            i51 ^= 51853;
                            switch (i51) {
                                case 241:
                                    i51 = 52518;
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
            int i52 = C0078.f112;
            int i53 = 53634;
            while (true) {
                i53 ^= 53651;
                switch (i53) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i53 = ((i52 ^ (-86)) & i12) != 0 ? 53727 : 53696;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        i13 |= C0473.f743 ^ (-3630);
                        int i54 = 53758;
                        while (true) {
                            i54 ^= 53775;
                            switch (i54) {
                                case 1009:
                                    i54 = 54440;
                                    continue;
                                case 1703:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 83:
                        int i55 = C0088.f122;
                        int i56 = 54533;
                        while (true) {
                            i56 ^= 54550;
                            switch (i56) {
                                case 19:
                                    i56 = ((i55 ^ 4036) & i10) == 0 ? 54626 : 54595;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 85:
                                    break;
                                case 116:
                                    boolean zM5553 = C0289.m5551(qVar, eVar3);
                                    int i57 = 54657;
                                    while (true) {
                                        i57 ^= 54674;
                                        switch (i57) {
                                            case 19:
                                                i57 = zM5553 ? 55401 : 54719;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                i17 = 1024;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 3579:
                                                i17 = 2048;
                                                int i58 = 55432;
                                                while (true) {
                                                    i58 ^= 55449;
                                                    switch (i58) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i58 = 55463;
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
                                    i13 = (i13 & i17) | (i13 ^ i17);
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
            int i59 = C0243.f322;
            int i60 = 55556;
            while (true) {
                i60 ^= 55573;
                switch (i60) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i60 = ((i59 ^ 412) & i12) != 0 ? 55649 : 55618;
                        break;
                    case 54:
                        break;
                    case 87:
                        int i61 = C0192.f216;
                        int i62 = 56455;
                        while (true) {
                            i62 ^= 56472;
                            switch (i62) {
                                case 31:
                                    i62 = ((i61 ^ (-25378)) & i10) == 0 ? 56548 : 56517;
                                    break;
                                case 62:
                                    break;
                                case 93:
                                    break;
                                case 124:
                                    boolean zM5554 = C0289.m5551(qVar, eVar4);
                                    int i63 = 56579;
                                    while (true) {
                                        i63 ^= 56596;
                                        switch (i63) {
                                            case 23:
                                                i63 = zM5554 ? 1507472 : 56641;
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                i18 = 8192;
                                                break;
                                            case 1564036:
                                                i18 = 16384;
                                                int i64 = 1507503;
                                                while (true) {
                                                    i64 ^= 1507520;
                                                    switch (i64) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 111:
                                                            i64 = 1507534;
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
                                    i13 = (i13 & i18) | (i13 ^ i18);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 116:
                        i13 |= C0231.f310 ^ (-25357);
                        int i65 = 55680;
                        while (true) {
                            i65 ^= 55697;
                            switch (i65) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i65 = 56362;
                                    continue;
                                case 1467:
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
            int i66 = C0200.f224;
            int i67 = 1507627;
            while (true) {
                i67 ^= 1507644;
                switch (i67) {
                    case 23:
                        i67 = ((i66 ^ 278) & i12) != 0 ? 1507720 : 1507689;
                        break;
                    case 85:
                        int i68 = 1508526;
                        while (true) {
                            i68 ^= 1508543;
                            switch (i68) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i68 = (((-196609) ^ i10) & i10) == 0 ? 1508619 : 1508588;
                                    break;
                                case 83:
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    boolean zM2014 = C0103.m2013(qVar, l0Var);
                                    int i69 = 1508650;
                                    while (true) {
                                        i69 ^= 1508667;
                                        switch (i69) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i69 = zM2014 ? 1509394 : 1508712;
                                                break;
                                            case 83:
                                                i19 = 65536;
                                                break;
                                            case 114:
                                                break;
                                            case 3369:
                                                i19 = 131072;
                                                int i70 = 1509425;
                                                while (true) {
                                                    i70 ^= 1509442;
                                                    switch (i70) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 115:
                                                            i70 = 1509456;
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
                                    i13 = (i13 & i19) | (i13 ^ i19);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 118:
                        break;
                    case 180:
                        i13 = (i13 & 196608) | (196608 ^ i13);
                        int i71 = 1507751;
                        while (true) {
                            i71 ^= 1507768;
                            switch (i71) {
                                case 31:
                                    i71 = 1508433;
                                    continue;
                                case 1513:
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
            int i72 = C0062.f82;
            int i73 = 1509549;
            while (true) {
                i73 ^= 1509566;
                switch (i73) {
                    case 19:
                        i73 = ((i72 ^ 258) & i12) != 0 ? 1509642 : 1509611;
                        break;
                    case 85:
                        int i74 = 1510448;
                        while (true) {
                            i74 ^= 1510465;
                            switch (i74) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 47:
                                    break;
                                case 113:
                                    i74 = (((-1572865) ^ i10) & i10) == 0 ? 1510541 : 1510510;
                                    break;
                                case 204:
                                    boolean zM4041 = C0212.m4041(qVar, j10);
                                    int i75 = 1510572;
                                    while (true) {
                                        i75 ^= 1510589;
                                        switch (i75) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i75 = zM4041 ? 1511316 : 1510634;
                                                break;
                                            case 87:
                                                i20 = 524288;
                                                break;
                                            case 118:
                                                break;
                                            case 809:
                                                i20 = 1048576;
                                                int i76 = 1511347;
                                                while (true) {
                                                    i76 ^= 1511364;
                                                    switch (i76) {
                                                        case 22:
                                                            break;
                                                        case 119:
                                                            i76 = 1511378;
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
                                    i13 = (i13 & i20) | (i13 ^ i20);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 114:
                        break;
                    case 436:
                        i13 = (i13 & 1572864) | (1572864 ^ i13);
                        int i77 = 1509673;
                        while (true) {
                            i77 ^= 1509690;
                            switch (i77) {
                                case 19:
                                    i77 = 1510355;
                                    continue;
                                case 745:
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
            int i78 = C0060.f80;
            int i79 = 1511471;
            while (true) {
                i79 ^= 1511488;
                switch (i79) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        int i80 = 1512370;
                        while (true) {
                            i80 ^= 1512387;
                            switch (i80) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 51:
                                    i30 = 1511595;
                                    while (true) {
                                        i30 ^= 1511612;
                                        switch (i30) {
                                            case 23:
                                                i30 = 1512277;
                                                continue;
                                                continue;
                                            case 1001:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                    }
                                    break;
                                case 113:
                                    i80 = (((-12582913) ^ i10) & i10) == 0 ? 1512463 : 1512432;
                                    break;
                                case 1996:
                                    boolean zM5919 = C0307.m5919(qVar, f10);
                                    int i81 = 1512494;
                                    while (true) {
                                        i81 ^= 1512511;
                                        switch (i81) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i81 = zM5919 ? 1513238 : 1512556;
                                                break;
                                            case 83:
                                                i21 = 4194304;
                                                break;
                                            case 114:
                                                break;
                                            case 809:
                                                i21 = 8388608;
                                                int i82 = 1513269;
                                                while (true) {
                                                    i82 ^= 1513286;
                                                    switch (i82) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 115:
                                                            i82 = 1513300;
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
                                    i13 = (i13 & i21) | (i13 ^ i21);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 111:
                        i79 = ((i78 ^ (-1024)) & i12) != 0 ? 1511564 : 1511533;
                        break;
                    case 204:
                        i13 = (i13 & 12582912) | (12582912 ^ i13);
                        i30 = 1511595;
                        while (true) {
                            i30 ^= 1511612;
                            switch (i30) {
                                case 23:
                                    i30 = 1512277;
                                    continue;
                                    continue;
                                case 1001:
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
                int i83 = C0070.f90;
                int i84 = 1513393;
                while (true) {
                    i84 ^= 1513410;
                    switch (i84) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            int i85 = 1514292;
                            while (true) {
                                i85 ^= 1514309;
                                switch (i85) {
                                    case 22:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                        break;
                                    case 113:
                                        i85 = (((-100663297) ^ i10) & i10) == 0 ? 1514385 : 1514354;
                                        break;
                                    case 212:
                                        boolean zM4042 = C0212.m4041(qVar, j11);
                                        int i86 = 1514416;
                                        while (true) {
                                            i86 ^= 1514433;
                                            switch (i86) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 47:
                                                    i22 = 33554432;
                                                    break;
                                                case 113:
                                                    i86 = zM4042 ? 1515160 : 1514478;
                                                    break;
                                                case 1369:
                                                    i22 = 67108864;
                                                    int i87 = 1515191;
                                                    while (true) {
                                                        i87 ^= 1515208;
                                                        switch (i87) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                break;
                                                            case 127:
                                                                i87 = 1515222;
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
                                        i13 = (i13 & i22) | (i13 ^ i22);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 115:
                            i84 = ((i83 ^ 1021) & i12) != 0 ? 1513486 : 1513455;
                            break;
                        case 4044:
                            i13 = (i13 & 100663296) | (100663296 ^ i13);
                            int i88 = 1513517;
                            while (true) {
                                i88 ^= 1513534;
                                switch (i88) {
                                    case 19:
                                        i88 = 1514199;
                                        continue;
                                    case 745:
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
                int i89 = C0029.f49;
                int i90 = 1515315;
                while (true) {
                    i90 ^= 1515332;
                    switch (i90) {
                        case 22:
                            break;
                        case 53:
                            int i91 = 1516214;
                            while (true) {
                                i91 ^= 1516231;
                                switch (i91) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 51:
                                        i23 = i13;
                                        break;
                                    case 113:
                                        i91 = (((-805306369) ^ i10) & i10) == 0 ? 1516307 : 1516276;
                                        break;
                                    case 468:
                                        boolean zM4043 = C0212.m4041(qVar, j12);
                                        int i92 = 1516338;
                                        while (true) {
                                            i92 ^= 1516355;
                                            switch (i92) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    i24 = 268435456;
                                                    break;
                                                case 113:
                                                    i92 = zM4043 ? 1537263 : 1516400;
                                                    break;
                                                case 22444:
                                                    i24 = 536870912;
                                                    int i93 = 1537294;
                                                    while (true) {
                                                        i93 ^= 1537311;
                                                        switch (i93) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i93 = 1537325;
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
                                        i23 = (i13 & i24) | (i13 ^ i24);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 119:
                            i90 = ((i89 ^ (-993)) & i12) != 0 ? 1515408 : 1515377;
                            break;
                        case 212:
                            int i94 = (i13 & 805306368) | (805306368 ^ i13);
                            int i95 = 1515439;
                            while (true) {
                                i95 ^= 1515456;
                                switch (i95) {
                                    case 111:
                                        i95 = 1516121;
                                        continue;
                                    case 15769:
                                        i23 = i94;
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
                int i96 = C0425.f695;
                int i97 = 1537418;
                while (true) {
                    i97 ^= 1537435;
                    switch (i97) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i97 = ((i96 ^ 1543) & i12) != 0 ? 1537511 : 1537480;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 83:
                            int i98 = C0483.f756;
                            int i99 = 1538317;
                            while (true) {
                                i99 ^= 1538334;
                                switch (i99) {
                                    case 19:
                                        i99 = ((i98 ^ 937) & i11) == 0 ? 1538410 : 1538379;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 85:
                                        i25 = i11;
                                        break;
                                    case 116:
                                        boolean zM4044 = C0212.m4041(qVar, j13);
                                        int i100 = 1538441;
                                        while (true) {
                                            i100 ^= 1538458;
                                            switch (i100) {
                                                case 19:
                                                    i100 = zM4044 ? 1539185 : 1538503;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 93:
                                                    i26 = 2;
                                                    break;
                                                case 1515:
                                                    i26 = 4;
                                                    int i101 = 1539216;
                                                    while (true) {
                                                        i101 ^= 1539233;
                                                        switch (i101) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 49:
                                                                i101 = 1539247;
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
                                        i25 = (i26 & i11) | (i11 ^ i26);
                                        int i102 = 1539340;
                                        while (true) {
                                            i102 ^= 1539357;
                                            switch (i102) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i102 = 1539371;
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
                        case 124:
                            i25 = (C0066.f86 ^ (-224)) | i11;
                            int i103 = 1537542;
                            while (true) {
                                i103 ^= 1537559;
                                switch (i103) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i103 = 1538224;
                                        continue;
                                    case 3751:
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
                int i104 = C0143.f169;
                int i105 = 1539464;
                while (true) {
                    i105 ^= 1539481;
                    switch (i105) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i105 = ((i104 ^ (-2423)) & i12) != 0 ? 1540208 : 1540177;
                            break;
                        case 64939:
                            break;
                        case 64968:
                            int i106 = C0129.f155;
                            int i107 = 1540363;
                            while (true) {
                                i107 ^= 1540380;
                                switch (i107) {
                                    case 23:
                                        i107 = ((i106 ^ 704) & i11) == 0 ? 1541107 : 1540425;
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        break;
                                    case 751:
                                        boolean zM4045 = C0212.m4041(qVar, j14);
                                        int i108 = 1541138;
                                        while (true) {
                                            i108 ^= 1541155;
                                            switch (i108) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 49:
                                                    if (zM4045) {
                                                        i108 = 1541231;
                                                    }
                                                    break;
                                                case 76:
                                                    int i109 = 1541262;
                                                    while (true) {
                                                        i109 ^= 1541279;
                                                        switch (i109) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i109 = 1541293;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                i27 = 32;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 115:
                                                    i27 = 16;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i108 = 1541200;
                                        }
                                        i25 = (i25 & i27) | (i25 ^ i27);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 65001:
                            i25 |= C0036.f56 ^ 26;
                            int i110 = 1540239;
                            while (true) {
                                i110 ^= 1540256;
                                switch (i110) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 47:
                                        i110 = 1540270;
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
                int i111 = 1541386;
                while (true) {
                    i111 ^= 1541403;
                    switch (i111) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i111 = (306783379 & ((i23 ^ (-1)) ^ 306783379)) == 306783378 ? 1542130 : 1542099;
                            break;
                        case 687:
                            break;
                        case 712:
                            i28 = 1543308;
                            while (true) {
                                i28 ^= 1543325;
                                switch (i28) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i28 = i39 != 0 ? 1544052 : 1544021;
                                        break;
                                    case 939:
                                        break;
                                    case 968:
                                        break;
                                    case 1001:
                                        oVar = C0227.m4370();
                                        i29 = 1544083;
                                        while (true) {
                                            i29 ^= 1544100;
                                            switch (i29) {
                                                case 22:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                    i29 = 1544114;
                                                    continue;
                                                    continue;
                                                    continue;
                                                default:
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
                            u0.b bVarM1122 = C0059.m1122(qVar, 2126307494 ^ C0321.f468, new d(eVar2, eVar3, eVar4, j12, j13, j14, j11, eVar));
                            int i112 = (i23 >> (C0058.f78 ^ (-569))) & (C0338.f608 ^ 253);
                            int i113 = (i112 & 12582912) | (12582912 ^ i112);
                            int i114 = i23 >> (C0456.f726 ^ 572);
                            int i115 = (C0397.f667 ^ (-181)) & i114;
                            int i116 = (i113 & i115) | (i113 ^ i115);
                            int i117 = i114 & (C0170.f194 ^ (-789));
                            int i118 = (i116 & i117) | (i116 ^ i117);
                            int i119 = i23 >> (C0450.f720 ^ 353);
                            int i120 = i119 & ((-57345) ^ i119);
                            C0148.m2825(oVar, l0Var, j10, 0L, f10, 0.0f, null, bVarM1122, qVar, (i118 ^ i120) | (i118 & i120), 104);
                            oVar2 = oVar;
                            break;
                        case 745:
                            int i121 = C0143.f169;
                            int i122 = 1542161;
                            while (true) {
                                i122 ^= 1542178;
                                switch (i122) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 51:
                                        i122 = ((i121 ^ (-358)) & i25) == 18 ? 1542254 : 1542223;
                                        break;
                                    case 76:
                                        boolean zM1625 = C0074.m1625(qVar);
                                        int i123 = 1542285;
                                        while (true) {
                                            i123 ^= 1542302;
                                            switch (i123) {
                                                case 19:
                                                    i123 = !zM1625 ? 1543029 : 1542347;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 85:
                                                    C0471.m9156(qVar);
                                                    int i124 = 1543184;
                                                    while (true) {
                                                        i124 ^= 1543201;
                                                        switch (i124) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                oVar2 = oVar;
                                                                break;
                                                            case 49:
                                                                i124 = 1543215;
                                                                continue;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 1003:
                                                    int i125 = 1543060;
                                                    while (true) {
                                                        i125 ^= 1543077;
                                                        switch (i125) {
                                                            case 22:
                                                                break;
                                                            case 49:
                                                                i125 = 1543091;
                                                                continue;
                                                            default:
                                                                continue;
                                                        }
                                                        i28 = 1543308;
                                                        while (true) {
                                                            i28 ^= 1543325;
                                                            switch (i28) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (i39 != 0) {
                                                                    }
                                                                    break;
                                                                case 939:
                                                                    break;
                                                                case 968:
                                                                    break;
                                                                case 1001:
                                                                    oVar = C0227.m4370();
                                                                    i29 = 1544083;
                                                                    while (true) {
                                                                        i29 ^= 1544100;
                                                                        switch (i29) {
                                                                            case 22:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                i29 = 1544114;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
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
                                                        u0.b bVarM1123 = C0059.m1122(qVar, 2126307494 ^ C0321.f468, new d(eVar2, eVar3, eVar4, j12, j13, j14, j11, eVar));
                                                        int i1110 = (i23 >> (C0058.f78 ^ (-569))) & (C0338.f608 ^ 253);
                                                        int i1111 = (i1110 & 12582912) | (12582912 ^ i1110);
                                                        int i1112 = i23 >> (C0456.f726 ^ 572);
                                                        int i1113 = (C0397.f667 ^ (-181)) & i1112;
                                                        int i1114 = (i1111 & i1113) | (i1111 ^ i1113);
                                                        int i1115 = i1112 & (C0170.f194 ^ (-789));
                                                        int i1116 = (i1114 & i1115) | (i1114 ^ i1115);
                                                        int i1117 = i23 >> (C0450.f720 ^ 353);
                                                        int i126 = i1117 & ((-57345) ^ i1117);
                                                        C0148.m2825(oVar, l0Var, j10, 0L, f10, 0.0f, null, bVarM1123, qVar, (i1116 ^ i126) | (i1116 & i126), 104);
                                                        oVar2 = oVar;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 109:
                                        i28 = 1543308;
                                        while (true) {
                                            i28 ^= 1543325;
                                            switch (i28) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (i39 != 0) {
                                                    }
                                                    break;
                                                case 939:
                                                    break;
                                                case 968:
                                                    break;
                                                case 1001:
                                                    oVar = C0227.m4370();
                                                    i29 = 1544083;
                                                    while (true) {
                                                        i29 ^= 1544100;
                                                        switch (i29) {
                                                            case 22:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                i29 = 1544114;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            default:
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
                                        u0.b bVarM1124 = C0059.m1122(qVar, 2126307494 ^ C0321.f468, new d(eVar2, eVar3, eVar4, j12, j13, j14, j11, eVar));
                                        int i1118 = (i23 >> (C0058.f78 ^ (-569))) & (C0338.f608 ^ 253);
                                        int i1119 = (i1118 & 12582912) | (12582912 ^ i1118);
                                        int i11110 = i23 >> (C0456.f726 ^ 572);
                                        int i11111 = (C0397.f667 ^ (-181)) & i11110;
                                        int i11112 = (i1119 & i11111) | (i1119 ^ i11111);
                                        int i11113 = i11110 & (C0170.f194 ^ (-789));
                                        int i11114 = (i11112 & i11113) | (i11112 ^ i11113);
                                        int i11115 = i23 >> (C0450.f720 ^ 353);
                                        int i127 = i11115 & ((-57345) ^ i11115);
                                        C0148.m2825(oVar, l0Var, j10, 0L, f10, 0.0f, null, bVarM1124, qVar, (i11114 ^ i127) | (i11114 & i127), 104);
                                        oVar2 = oVar;
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
                    int i128 = 1544207;
                    while (true) {
                        i128 ^= 1544224;
                        switch (i128) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 47:
                                if (x1VarM7533 != null) {
                                    i128 = 1544951;
                                }
                                break;
                            case 109:
                                return;
                            case 727:
                                x1VarM7533.f11756d = new e(eVar, oVar2, eVar2, eVar3, eVar4, l0Var, j10, f10, j11, j12, j13, j14, i10, i11, i12);
                                return;
                            default:
                                continue;
                        }
                        i128 = 1544269;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:300:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x02c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x02f8 A[SYNTHETIC] */
    public static final void b(float f10, float f11, c9.e eVar, m0.m mVar, int i10) {
        int i11;
        int i12;
        m0.x1 x1VarM7533;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        boolean z11;
        Object objM8078;
        int i18;
        Object gVar;
        r1.j0 j0Var;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        int i19;
        boolean z12;
        int i20;
        boolean zM7502;
        int i21;
        t1.i iVarM5562;
        boolean zM7503;
        int i22;
        boolean zM4399;
        int i23;
        int i24;
        y0 y0VarM2417;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, (-586821386) ^ C0248.f327);
        int i31 = C0246.f325;
        int i32 = 1616;
        while (true) {
            i32 ^= 1633;
            switch (i32) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i32 = ((i31 ^ 288) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM5919 = C0307.m5919(qVar, f10);
                    int i33 = 1740;
                    while (true) {
                        i33 ^= 1757;
                        switch (i33) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = zM5919 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i30 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i34 = 1864;
                                while (true) {
                                    i34 ^= 1881;
                                    switch (i34) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i34 = 48674;
                                            continue;
                                        case 47483:
                                            i30 = 4;
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
                    i11 = (i30 & i10) | (i30 ^ i10);
                    int i35 = 48767;
                    while (true) {
                        i35 ^= 48784;
                        switch (i35) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i35 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i36 = C0133.f159;
        int i37 = 48891;
        while (true) {
            i37 ^= 48908;
            switch (i37) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i37 = ((i36 ^ 808) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM59110 = C0307.m5919(qVar, f11);
                    int i38 = 49666;
                    while (true) {
                        i38 ^= 49683;
                        switch (i38) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM59110) {
                                    i38 = 49759;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i39 = 49790;
                                while (true) {
                                    i39 ^= 49807;
                                    switch (i39) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            i29 = 32;
                                            break;
                                        case 241:
                                            i39 = 49821;
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                i29 = 16;
                                break;
                            default:
                                continue;
                        }
                        i38 = 49728;
                    }
                    i11 = (i11 & i29) | (i11 ^ i29);
                    break;
                default:
                    break;
            }
        }
        int i40 = C0214.f237;
        int i41 = 49914;
        while (true) {
            i41 ^= 49931;
            switch (i41) {
                case 497:
                    i41 = ((i40 ^ (-399)) & i10) == 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    i12 = i11;
                    break;
                case 1769:
                    boolean zM5551 = C0289.m5551(qVar, eVar);
                    int i42 = 50689;
                    while (true) {
                        i42 ^= 50706;
                        switch (i42) {
                            case 19:
                                i42 = zM5551 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i28 = 128;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i28 = 256;
                                int i43 = 50813;
                                while (true) {
                                    i43 ^= 50830;
                                    switch (i43) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i43 = 50844;
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
                    i12 = (i11 & i28) | (i11 ^ i28);
                    break;
                default:
                    break;
            }
        }
        int i44 = C0488.f761;
        int i45 = 51588;
        while (true) {
            i45 ^= 51605;
            switch (i45) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i45 = ((i44 ^ (-399)) & i12) == 146 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    C0262.m4990(qVar, 1133133293 ^ C0048.f68);
                    i14 = C0217.f240;
                    i15 = 52735;
                    while (true) {
                        i15 ^= 52752;
                        switch (i15) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                z10 = false;
                                break;
                            case 1007:
                                i15 = ((i14 ^ (-922)) & i12) == 4 ? 53479 : 52797;
                                break;
                            case 7927:
                                i27 = 53510;
                                while (true) {
                                    i27 ^= 53527;
                                    switch (i27) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i27 = 53541;
                                            continue;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            z10 = true;
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
                    i16 = C0216.f239;
                    i17 = 53634;
                    while (true) {
                        i17 ^= 53651;
                        switch (i17) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i17 = ((i16 ^ (-874)) & i12) == 32 ? 53727 : 53696;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i26 = 53758;
                                while (true) {
                                    i26 ^= 53775;
                                    switch (i26) {
                                        case 1009:
                                            i26 = 54440;
                                            continue;
                                            continue;
                                        case 1703:
                                            z11 = true;
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                z11 = false;
                                break;
                            default:
                                break;
                        }
                    }
                    objM8078 = C0412.m8078(qVar);
                    i18 = 54533;
                    while (true) {
                        i18 ^= 54550;
                        switch (i18) {
                            case 19:
                                i18 = !((z10 ^ z11) | (z10 & z11)) ? 54626 : 54595;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 85:
                                gVar = new g(f10, f11);
                                C0479.m9328(qVar, gVar);
                                break;
                            case 116:
                                y0VarM2417 = C0125.m2417();
                                i25 = 54657;
                                while (true) {
                                    i25 ^= 54674;
                                    switch (i25) {
                                        case 19:
                                            i25 = objM8078 == y0VarM2417 ? 55401 : 54719;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            gVar = objM8078;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 3579:
                                            gVar = new g(f10, f11);
                                            C0479.m9328(qVar, gVar);
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
                    j0Var = (r1.j0) gVar;
                    C0171.m3270(qVar, false);
                    int i46 = C0452.f722;
                    int i47 = C0114.f140;
                    C0262.m4990(qVar, (-1323940554) ^ C0185.f209);
                    y0.l lVarM4370 = C0227.m4370();
                    iM276 = C0014.m276(qVar);
                    r1VarM275 = C0014.m275(qVar);
                    C0014.m280(C0380.m7428());
                    jVarM4451 = C0232.m4451();
                    bVarM6976 = C0356.m6976(lVarM4370);
                    i19 = (C0393.f663 ^ 583) | ((((i12 >> (i46 ^ 714)) & (i47 ^ (-298))) << (C0073.f107 ^ (-924))) & (C0018.f38 ^ (-7746)));
                    z12 = C0196.m3764(qVar) instanceof m0.d;
                    i20 = 55432;
                    while (true) {
                        i20 ^= 55449;
                        switch (i20) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = z12 ? 55525 : 55494;
                                break;
                            case 62:
                                break;
                            case 95:
                                C0236.m4537();
                                throw null;
                            case 124:
                                C0100.m1961(qVar);
                                zM7502 = C0383.m7502(qVar);
                                i21 = 55556;
                                while (true) {
                                    i21 ^= 55573;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = zM7502 ? 55649 : 55618;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            C0446.m8685(qVar);
                                            break;
                                        case 116:
                                            C0017.m346(qVar, jVarM4451);
                                            i24 = 55680;
                                            while (true) {
                                                i24 ^= 55697;
                                                switch (i24) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i24 = 56362;
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
                                }
                                C0089.m1904(qVar, j0Var, C0063.m1208());
                                C0089.m1904(qVar, r1VarM275, C0465.m9055());
                                iVarM5562 = C0290.m5562();
                                zM7503 = C0383.m7502(qVar);
                                i22 = 56455;
                                while (true) {
                                    i22 ^= 56472;
                                    switch (i22) {
                                        case 31:
                                            i22 = !zM7503 ? 56548 : 56517;
                                            break;
                                        case 62:
                                            break;
                                        case 93:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        case 124:
                                            zM4399 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM276));
                                            i23 = 56579;
                                            while (true) {
                                                i23 ^= 56596;
                                                switch (i23) {
                                                    case 23:
                                                        i23 = !zM4399 ? 1507472 : 56641;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 1564036:
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
                                C0353.m6912((i19 >> (C0442.f712 ^ (-256))) & (C0386.f656 ^ (-127)), bVarM6976, new m0.l2(qVar), qVar, 2058660378 ^ C0338.f608);
                                C0386.m7552((i19 >> (C0150.f175 ^ (-854))) & (C0052.f72 ^ 943), eVar, qVar, false, true);
                                C0171.m3270(qVar, false);
                                break;
                            default:
                                break;
                        }
                    }
                    x1VarM7533 = C0385.m7533(qVar);
                    i13 = 1507503;
                    while (true) {
                        i13 ^= 1507520;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return;
                            case 111:
                                if (x1VarM7533 != null) {
                                    i13 = 1507596;
                                }
                                break;
                            case 460:
                                x1VarM7533.f11756d = new h(f10, f11, eVar, i10);
                                return;
                            default:
                                continue;
                                continue;
                                continue;
                        }
                        i13 = 1507565;
                    }
                    break;
                case 116:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i48 = 51712;
                    while (true) {
                        i48 ^= 51729;
                        switch (i48) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i48 = !zM1625 ? 51805 : 51774;
                                break;
                            case 47:
                                C0471.m9156(qVar);
                                int i49 = 52611;
                                while (true) {
                                    i49 ^= 52628;
                                    switch (i49) {
                                        case 23:
                                            i49 = 52642;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                    x1VarM7533 = C0385.m7533(qVar);
                                    i13 = 1507503;
                                    while (true) {
                                        i13 ^= 1507520;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                return;
                                            case 111:
                                                if (x1VarM7533 != null) {
                                                    i13 = 1507596;
                                                }
                                                break;
                                            case 460:
                                                x1VarM7533.f11756d = new h(f10, f11, eVar, i10);
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i13 = 1507565;
                                    }
                                }
                                break;
                            case 76:
                                int i50 = 51836;
                                while (true) {
                                    i50 ^= 51853;
                                    switch (i50) {
                                        case 241:
                                            i50 = 52518;
                                            break;
                                        case 1963:
                                            C0262.m4990(qVar, 1133133293 ^ C0048.f68);
                                            i14 = C0217.f240;
                                            i15 = 52735;
                                            while (true) {
                                                i15 ^= 52752;
                                                switch (i15) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        z10 = false;
                                                        break;
                                                    case 1007:
                                                        if (((i14 ^ (-922)) & i12) == 4) {
                                                        }
                                                        break;
                                                    case 7927:
                                                        i27 = 53510;
                                                        while (true) {
                                                            i27 ^= 53527;
                                                            switch (i27) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i27 = 53541;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    z10 = true;
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
                                            i16 = C0216.f239;
                                            i17 = 53634;
                                            while (true) {
                                                i17 ^= 53651;
                                                switch (i17) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (((i16 ^ (-874)) & i12) == 32) {
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        i26 = 53758;
                                                        while (true) {
                                                            i26 ^= 53775;
                                                            switch (i26) {
                                                                case 1009:
                                                                    i26 = 54440;
                                                                    continue;
                                                                    continue;
                                                                case 1703:
                                                                    z11 = true;
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        z11 = false;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            objM8078 = C0412.m8078(qVar);
                                            i18 = 54533;
                                            while (true) {
                                                i18 ^= 54550;
                                                switch (i18) {
                                                    case 19:
                                                        if (!((z10 ^ z11) | (z10 & z11))) {
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 85:
                                                        gVar = new g(f10, f11);
                                                        C0479.m9328(qVar, gVar);
                                                        break;
                                                    case 116:
                                                        y0VarM2417 = C0125.m2417();
                                                        i25 = 54657;
                                                        while (true) {
                                                            i25 ^= 54674;
                                                            switch (i25) {
                                                                case 19:
                                                                    if (objM8078 == y0VarM2417) {
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    gVar = objM8078;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 3579:
                                                                    gVar = new g(f10, f11);
                                                                    C0479.m9328(qVar, gVar);
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
                                            j0Var = (r1.j0) gVar;
                                            C0171.m3270(qVar, false);
                                            int i410 = C0452.f722;
                                            int i411 = C0114.f140;
                                            C0262.m4990(qVar, (-1323940554) ^ C0185.f209);
                                            y0.l lVarM4371 = C0227.m4370();
                                            iM276 = C0014.m276(qVar);
                                            r1VarM275 = C0014.m275(qVar);
                                            C0014.m280(C0380.m7428());
                                            jVarM4451 = C0232.m4451();
                                            bVarM6976 = C0356.m6976(lVarM4371);
                                            i19 = (C0393.f663 ^ 583) | ((((i12 >> (i410 ^ 714)) & (i411 ^ (-298))) << (C0073.f107 ^ (-924))) & (C0018.f38 ^ (-7746)));
                                            z12 = C0196.m3764(qVar) instanceof m0.d;
                                            i20 = 55432;
                                            while (true) {
                                                i20 ^= 55449;
                                                switch (i20) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (z12) {
                                                        }
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 95:
                                                        C0236.m4537();
                                                        throw null;
                                                    case 124:
                                                        C0100.m1961(qVar);
                                                        zM7502 = C0383.m7502(qVar);
                                                        i21 = 55556;
                                                        while (true) {
                                                            i21 ^= 55573;
                                                            switch (i21) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (zM7502) {
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    C0446.m8685(qVar);
                                                                    break;
                                                                case 116:
                                                                    C0017.m346(qVar, jVarM4451);
                                                                    i24 = 55680;
                                                                    while (true) {
                                                                        i24 ^= 55697;
                                                                        switch (i24) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i24 = 56362;
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
                                                        }
                                                        C0089.m1904(qVar, j0Var, C0063.m1208());
                                                        C0089.m1904(qVar, r1VarM275, C0465.m9055());
                                                        iVarM5562 = C0290.m5562();
                                                        zM7503 = C0383.m7502(qVar);
                                                        i22 = 56455;
                                                        while (true) {
                                                            i22 ^= 56472;
                                                            switch (i22) {
                                                                case 31:
                                                                    if (!zM7503) {
                                                                    }
                                                                    break;
                                                                case 62:
                                                                    break;
                                                                case 93:
                                                                    C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                    break;
                                                                case 124:
                                                                    zM4399 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM276));
                                                                    i23 = 56579;
                                                                    while (true) {
                                                                        i23 ^= 56596;
                                                                        switch (i23) {
                                                                            case 23:
                                                                                if (!zM4399) {
                                                                                }
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 1564036:
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
                                                        C0353.m6912((i19 >> (C0442.f712 ^ (-256))) & (C0386.f656 ^ (-127)), bVarM6976, new m0.l2(qVar), qVar, 2058660378 ^ C0338.f608);
                                                        C0386.m7552((i19 >> (C0150.f175 ^ (-854))) & (C0052.f72 ^ 943), eVar, qVar, false, true);
                                                        C0171.m3270(qVar, false);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            x1VarM7533 = C0385.m7533(qVar);
                                            i13 = 1507503;
                                            while (true) {
                                                i13 ^= 1507520;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return;
                                                    case 111:
                                                        if (x1VarM7533 != null) {
                                                            i13 = 1507596;
                                                        }
                                                        break;
                                                    case 460:
                                                        x1VarM7533.f11756d = new h(f10, f11, eVar, i10);
                                                        return;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i13 = 1507565;
                                            }
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
    }
}
