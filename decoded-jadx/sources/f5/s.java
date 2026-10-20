package f5;

import a.C0000;
import a8.C0009;
import aa.C0012;
import androidx.appcompat.widget.C0020;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0222;
import d9.C0225;
import d9.C0226;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.C0253;
import f4.C0275;
import f6.C0277;
import g2.C0287;
import g5.C0291;
import g9.C0294;
import h3.C0301;
import k8.C0338;
import l9.C0347;
import m4.C0353;
import n.C0361;
import o4.C0369;
import o7.i2;
import p7.C0378;
import p8.C0379;
import p8.C0380;
import p9.q0;
import r5.C0400;
import r6.C0401;
import s8.C0416;
import v.C0439;
import v5.C0445;
import v6.C0447;
import w.C0453;
import w1.C0455;
import w2.C0458;
import x7.C0472;
import z.C0481;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p9.g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f414short = {970, 965, 975, 985, 964, 962, 975, 1012, 962, 975, 392, 436, 445, 441, 427, 445, 504, 436, 439, 447, 433, 438, 504, 446, 426, 439, 437, 504, 417, 439, 429, 426, 504, 426, 445, 447, 433, 427, 428, 445, 426, 445, 444, 504, 444, 445, 430, 433, 443, 445, 499, 469, 451, 468, 1646, 1612, 1627, 1606, 1625, 1610};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f6323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6324b;

    public s(MainViewModel mainViewModel, boolean z10) {
        this.f6323a = mainViewModel;
        this.f6324b = z10;
        int iM8692 = C0445.m8692();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8692 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0104.m2042("42KSlEbXqy")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۡۧۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5350() {
        int iM6808 = C0347.m6808();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6808 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f414short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    /* JADX WARN: Code duplicated, block: B:320:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        String strM3539;
        int i10;
        Object objM7093 = C0361.m7093((q8.h) obj);
        boolean z10 = objM7093 instanceof q8.g;
        q8.l lVarM238 = C0012.m238();
        String strM8581 = C0439.m8581();
        MainViewModel mainViewModelM3733 = C0195.m3733(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    UserProfile userProfile = (UserProfile) objM7093;
                    String strM7415 = C0378.m7415(C0152.m2915(C0287.m5540(mainViewModelM3733)), C0481.m9374(m5350(), 0, C0453.f724 ^ 885, 939));
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = strM7415 == null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                strM7415 = strM8581;
                                break;
                            default:
                                break;
                        }
                    }
                    int iM8181 = C0416.m8181(C0369.m7264(userProfile));
                    q0 q0VarM4345 = C0225.m4345(mainViewModelM3733);
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = iM8181 > 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                boolean zM4399 = C0228.m4399(C0369.m7264(userProfile), strM7415);
                                int i14 = 48767;
                                while (true) {
                                    i14 ^= 48784;
                                    switch (i14) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 76:
                                            C0225.m4338(C0380.m7458(mainViewModelM3733));
                                            C0227.m4382(q0VarM4345, C0253.m4838());
                                            C0227.m4382(C0379.m7430(mainViewModelM3733), C0091.m1946(m5350(), 10, C0338.f609 ^ 774, 472));
                                            break;
                                        case 239:
                                            i14 = !zM4399 ? 48860 : 48829;
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
                    Boolean boolM192 = C0009.m192(C0301.m5798(userProfile));
                    q0 q0VarM2079 = C0107.m2079(mainViewModelM3733);
                    C0227.m4382(q0VarM2079, boolM192);
                    C0227.m4382(C0116.m2242(mainViewModelM3733), C0447.m8720(userProfile));
                    C0122.m2359(mainViewModelM3733, C0458.m8921(userProfile));
                    long jM8921 = C0458.m8921(userProfile);
                    int i15 = 48891;
                    while (true) {
                        i15 ^= 48908;
                        switch (i15) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i15 = jM8921 > 0 ? 49635 : 48953;
                                break;
                            case 32495:
                                long jM8922 = C0458.m8921(userProfile);
                                long jM7869 = C0401.m7869();
                                int i16 = 49666;
                                while (true) {
                                    i16 ^= 49683;
                                    switch (i16) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = jM8922 <= jM7869 ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            boolean zM2 = C0000.m2(this);
                                            int i17 = 49790;
                                            while (true) {
                                                i17 ^= 49807;
                                                switch (i17) {
                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        C0226.m4367(mainViewModelM3733);
                                                        break;
                                                    case 84:
                                                        C0227.m4382(q0VarM2079, C0455.m8876());
                                                        int i18 = 49914;
                                                        while (true) {
                                                            i18 ^= 49931;
                                                            switch (i18) {
                                                                case 497:
                                                                    i18 = 50596;
                                                                    continue;
                                                                case 1711:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 241:
                                                        i17 = zM2 ? 49883 : 49852;
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
                    boolean zM4287 = C0222.m4287(userProfile);
                    int i19 = 50689;
                    while (true) {
                        i19 ^= 50706;
                        switch (i19) {
                            case 19:
                                i19 = zM4287 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                boolean zM1971 = C0101.m1971(userProfile);
                                int i20 = 51588;
                                while (true) {
                                    i20 ^= 51605;
                                    switch (i20) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = zM1971 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            C0227.m4382(q0VarM4345, new g(userProfile));
                                            break;
                                        case 116:
                                            C0227.m4382(q0VarM4345, new e(userProfile));
                                            int i21 = 51712;
                                            while (true) {
                                                i21 ^= 51729;
                                                switch (i21) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 15:
                                                    case Code.UNAUTHENTICATED /* 16 */:
                                                    default:
                                                        continue;
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i21 = 51743;
                                                        continue;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0227.m4382(q0VarM4345, new a(userProfile));
                                int i22 = 50813;
                                while (true) {
                                    i22 ^= 50830;
                                    switch (i22) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i22 = 50844;
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    C0227.m4382(C0073.m1601(mainViewModelM3733), C0455.m8876());
                    break;
                case 239:
                    break;
                default:
                    break;
            }
            return lVarM238;
        }
        Throwable thM9416 = C0483.m9416(objM7093);
        int i23 = 51836;
        while (true) {
            i23 ^= 51853;
            switch (i23) {
                case 241:
                    i23 = thM9416 != null ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    break;
                case 2025:
                    boolean zM5293 = C0275.m5293(C0380.m7458(mainViewModelM3733));
                    int i24 = 52611;
                    while (true) {
                        i24 ^= 52628;
                        switch (i24) {
                            case 23:
                                i24 = !zM5293 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                a5.j jVarM7458 = C0380.m7458(mainViewModelM3733);
                                FirebaseUser firebaseUserM5359 = C0277.m5359(C0020.m402(jVarM7458));
                                int i25 = 52735;
                                while (true) {
                                    i25 ^= 52752;
                                    switch (i25) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 1007:
                                            i25 = firebaseUserM5359 != null ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            String strM7836 = C0400.m7836(firebaseUserM5359);
                                            int i26 = 53510;
                                            while (true) {
                                                i26 ^= 53527;
                                                switch (i26) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i26 = strM7836 == null ? 53603 : 53572;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        int i27 = 53758;
                                                        while (true) {
                                                            i27 ^= 53775;
                                                            switch (i27) {
                                                                case 1009:
                                                                    i27 = 54440;
                                                                    break;
                                                                case 1703:
                                                                    strM8581 = strM7836;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 116:
                                                        int i28 = 53634;
                                                        while (true) {
                                                            i28 ^= 53651;
                                                            switch (i28) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i28 = 53665;
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
                                FirebaseUser firebaseUserM53510 = C0277.m5359(C0020.m402(jVarM7458));
                                int i29 = 54533;
                                while (true) {
                                    i29 ^= 54550;
                                    switch (i29) {
                                        case 19:
                                            i29 = firebaseUserM53510 != null ? 54626 : 54595;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 85:
                                            strM3539 = C0185.m3539(m5350(), 50, C0472.f743 ^ (-554), 422);
                                            i10 = 55680;
                                            while (true) {
                                                i10 ^= 55697;
                                                switch (i10) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i10 = 56362;
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
                                        case 116:
                                            strM3539 = C0117.m2263(firebaseUserM53510);
                                            int i30 = 54657;
                                            while (true) {
                                                i30 ^= 54674;
                                                switch (i30) {
                                                    case 19:
                                                        i30 = strM3539 == null ? 55401 : 54719;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 3579:
                                                        int i31 = 55432;
                                                        while (true) {
                                                            i31 ^= 55449;
                                                            switch (i31) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i31 = 55463;
                                                                    continue;
                                                                case 62:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            strM3539 = C0185.m3539(m5350(), 50, C0472.f743 ^ (-554), 422);
                                                            i10 = 55680;
                                                            while (true) {
                                                                i10 ^= 55697;
                                                                switch (i10) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i10 = 56362;
                                                                        continue;
                                                                        continue;
                                                                    case 1467:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
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
                                    int i32 = 55556;
                                    while (true) {
                                        i32 ^= 55573;
                                        switch (i32) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i32 = 55587;
                                                continue;
                                            case 54:
                                                C0227.m4382(C0225.m4345(mainViewModelM3733), new e(new UserProfile(strM3539, strM8581, C0294.m5660(m5350(), 54, C0291.f439 ^ (-886), 1583), true, true, false, C0439.m8581(), null, 0L, false, null, C0353.f624 ^ 1273, null)));
                                                C0227.m4382(C0073.m1601(mainViewModelM3733), C0455.m8876());
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                }
                                break;
                            case 116:
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
            return lVarM238;
        }
        return lVarM238;
    }
}
