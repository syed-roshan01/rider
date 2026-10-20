package k0;

import androidx.preference.C0044;
import c1.C0060;
import c3.C0063;
import com.google.android.gms.common.internal.C0084;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0169;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d7.C0219;
import dagger.hilt.internal.C0252;
import h0.C0299;
import h6.C0309;
import k.C0331;
import k4.C0336;
import m0.C0349;
import p0.C0373;
import r6.C0401;
import r7.C0404;
import s3.C0412;
import s8.C0417;
import v5.C0444;
import w5.C0463;
import z.C0480;
import z.C0481;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f9403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f9404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f9405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f9408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9409p;

    public q3(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        this.f9394a = j10;
        this.f9395b = j11;
        this.f9396c = j12;
        this.f9397d = j13;
        this.f9398e = j14;
        this.f9399f = j15;
        this.f9400g = j16;
        this.f9401h = j17;
        this.f9402i = j18;
        this.f9403j = j19;
        this.f9404k = j20;
        this.f9405l = j21;
        this.f9406m = j22;
        this.f9407n = j23;
        this.f9408o = j24;
        this.f9409p = j25;
        int iM8089 = C0412.m8089();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8089 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0219.m4238("g8lhDr6aR1ZkPwIueXVGYOq9YWut3")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final boolean equals(Object obj) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (this == obj) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (obj != null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean z10 = obj instanceof q3;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!z10) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            q3 q3Var = (q3) obj;
                                            boolean zM1210 = C0063.m1210(C0486.m9478(this), C0486.m9478(q3Var));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM1211 = C0063.m1210(C0481.m9379(this), C0481.m9379(q3Var));
                                                        int i14 = 49666;
                                                        while (true) {
                                                            i14 ^= 49683;
                                                            switch (i14) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!zM1211) {
                                                                        i14 = 49759;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    return false;
                                                                case 83:
                                                                    boolean zM1212 = C0063.m1210(C0404.m7945(this), C0404.m7945(q3Var));
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean zM1213 = C0063.m1210(C0299.m5763(this), C0299.m5763(q3Var));
                                                                                int i16 = 49914;
                                                                                while (true) {
                                                                                    i16 ^= 49931;
                                                                                    switch (i16) {
                                                                                        case 497:
                                                                                            if (!zM1213) {
                                                                                                i16 = 50658;
                                                                                            }
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            boolean zM1214 = C0063.m1210(C0463.m9039(this), C0463.m9039(q3Var));
                                                                                            int i17 = 50689;
                                                                                            while (true) {
                                                                                                i17 ^= 50706;
                                                                                                switch (i17) {
                                                                                                    case 19:
                                                                                                        if (!zM1214) {
                                                                                                            i17 = 50782;
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        boolean zM1215 = C0063.m1210(C0417.m8197(this), C0417.m8197(q3Var));
                                                                                                        int i18 = 50813;
                                                                                                        while (true) {
                                                                                                            i18 ^= 50830;
                                                                                                            switch (i18) {
                                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                    boolean zM1216 = C0063.m1210(C0336.m6529(this), C0336.m6529(q3Var));
                                                                                                                    int i19 = 51588;
                                                                                                                    while (true) {
                                                                                                                        i19 ^= 51605;
                                                                                                                        switch (i19) {
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                if (!zM1216) {
                                                                                                                                    i19 = 51681;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                break;
                                                                                                                            case 87:
                                                                                                                                boolean zM1217 = C0063.m1210(C0444.m8668(this), C0444.m8668(q3Var));
                                                                                                                                int i20 = 51712;
                                                                                                                                while (true) {
                                                                                                                                    i20 ^= 51729;
                                                                                                                                    switch (i20) {
                                                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                                                            break;
                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            if (!zM1217) {
                                                                                                                                                i20 = 51805;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 47:
                                                                                                                                            boolean zM1218 = C0063.m1210(C0401.m7875(this), C0401.m7875(q3Var));
                                                                                                                                            int i21 = 51836;
                                                                                                                                            while (true) {
                                                                                                                                                i21 ^= 51853;
                                                                                                                                                switch (i21) {
                                                                                                                                                    case 241:
                                                                                                                                                        if (!zM1218) {
                                                                                                                                                            i21 = 52580;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 1963:
                                                                                                                                                        break;
                                                                                                                                                    case 1992:
                                                                                                                                                        boolean zM1219 = C0063.m1210(C0309.m5988(this), C0309.m5988(q3Var));
                                                                                                                                                        int i22 = 52611;
                                                                                                                                                        while (true) {
                                                                                                                                                            i22 ^= 52628;
                                                                                                                                                            switch (i22) {
                                                                                                                                                                case 23:
                                                                                                                                                                    if (!zM1219) {
                                                                                                                                                                        i22 = 52704;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 54:
                                                                                                                                                                    break;
                                                                                                                                                                case 85:
                                                                                                                                                                    boolean zM12110 = C0063.m1210(C0169.m3242(this), C0169.m3242(q3Var));
                                                                                                                                                                    int i23 = 52735;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i23 ^= 52752;
                                                                                                                                                                        switch (i23) {
                                                                                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                break;
                                                                                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                                                                                boolean zM12111 = C0063.m1210(C0252.m4822(this), C0252.m4822(q3Var));
                                                                                                                                                                                int i24 = 53510;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i24 ^= 53527;
                                                                                                                                                                                    switch (i24) {
                                                                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                            if (!zM12111) {
                                                                                                                                                                                                i24 = 53603;
                                                                                                                                                                                            }
                                                                                                                                                                                            break;
                                                                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 83:
                                                                                                                                                                                            boolean zM12112 = C0063.m1210(C0044.m861(this), C0044.m861(q3Var));
                                                                                                                                                                                            int i25 = 53634;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i25 ^= 53651;
                                                                                                                                                                                                switch (i25) {
                                                                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                                        if (!zM12112) {
                                                                                                                                                                                                            i25 = 53727;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 76:
                                                                                                                                                                                                        return false;
                                                                                                                                                                                                    case 83:
                                                                                                                                                                                                        boolean zM12113 = C0063.m1210(C0331.m6402(this), C0331.m6402(q3Var));
                                                                                                                                                                                                        int i26 = 53758;
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            i26 ^= 53775;
                                                                                                                                                                                                            switch (i26) {
                                                                                                                                                                                                                case 1009:
                                                                                                                                                                                                                    if (!zM12113) {
                                                                                                                                                                                                                        i26 = 54502;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 1703:
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 1736:
                                                                                                                                                                                                                    boolean zM12114 = C0063.m1210(C0149.m2848(this), C0149.m2848(q3Var));
                                                                                                                                                                                                                    int i27 = 54533;
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        i27 ^= 54550;
                                                                                                                                                                                                                        switch (i27) {
                                                                                                                                                                                                                            case 19:
                                                                                                                                                                                                                                if (!zM12114) {
                                                                                                                                                                                                                                    i27 = 54626;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 85:
                                                                                                                                                                                                                                boolean zM12115 = C0063.m1210(C0349.m6832(this), C0349.m6832(q3Var));
                                                                                                                                                                                                                                int i28 = 54657;
                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                    i28 ^= 54674;
                                                                                                                                                                                                                                    switch (i28) {
                                                                                                                                                                                                                                        case 19:
                                                                                                                                                                                                                                            if (!zM12115) {
                                                                                                                                                                                                                                                i28 = 55401;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                                                                                                                                            return true;
                                                                                                                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        case 3579:
                                                                                                                                                                                                                                            return false;
                                                                                                                                                                                                                                        default:
                                                                                                                                                                                                                                            continue;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    i28 = 54719;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 116:
                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                            default:
                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        i27 = 54595;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 1769:
                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                default:
                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            i26 = 54471;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    default:
                                                                                                                                                                                                        continue;
                                                                                                                                                                                                }
                                                                                                                                                                                                i25 = 53696;
                                                                                                                                                                                            }
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 116:
                                                                                                                                                                                            return false;
                                                                                                                                                                                        default:
                                                                                                                                                                                            continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    i24 = 53572;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 1007:
                                                                                                                                                                                if (!zM12110) {
                                                                                                                                                                                    i23 = 53479;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 7927:
                                                                                                                                                                                return false;
                                                                                                                                                                            default:
                                                                                                                                                                                continue;
                                                                                                                                                                        }
                                                                                                                                                                        i23 = 52797;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 116:
                                                                                                                                                                    return false;
                                                                                                                                                                default:
                                                                                                                                                                    continue;
                                                                                                                                                            }
                                                                                                                                                            i22 = 52673;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 2025:
                                                                                                                                                        return false;
                                                                                                                                                    default:
                                                                                                                                                        continue;
                                                                                                                                                }
                                                                                                                                                i21 = 52549;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 76:
                                                                                                                                            return false;
                                                                                                                                        default:
                                                                                                                                            continue;
                                                                                                                                    }
                                                                                                                                    i20 = 51774;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 116:
                                                                                                                                return false;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        i19 = 51650;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 243:
                                                                                                                    if (!zM1215) {
                                                                                                                        i18 = 51557;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 4075:
                                                                                                                    return false;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i18 = 50875;
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        return false;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i17 = 50751;
                                                                                            }
                                                                                            break;
                                                                                        case 1769:
                                                                                            return false;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i16 = 50627;
                                                                                }
                                                                                break;
                                                                            case 84:
                                                                                return false;
                                                                            case 241:
                                                                                if (!zM1212) {
                                                                                    i15 = 49883;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49852;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 49728;
                                                        }
                                                        break;
                                                    case 503:
                                                        if (!zM1210) {
                                                            i13 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        return false;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48953;
                                            }
                                            break;
                                        case 47417:
                                            int i29 = 48767;
                                            while (true) {
                                                i29 ^= 48784;
                                                switch (i29) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i29 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    return false;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final int hashCode() {
        long jM3242 = 0;
        String str = "\u06e0\u06e5\u06e8";
        int i10 = 0;
        int iM9363 = 0;
        int iM9364 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56443:
                    jM3242 = C0336.m6529(this);
                    str = "\u06df\u06e0\u06e5";
                    iM9363 = C0480.m9363(jM3242, iM9364, i10);
                    break;
                case 56476:
                    jM3242 = C0044.m861(this);
                    str = "\u06e5\u06e0\u06e5";
                    iM9363 = C0480.m9363(jM3242, iM9364, i10);
                    break;
                case 56505:
                    jM3242 = C0309.m5988(this);
                    str = "\u06e0\u06e0";
                    iM9364 = C0480.m9363(jM3242, iM9363, i10);
                    break;
                case 1746724:
                    jM3242 = C0444.m8668(this);
                    str = "\u06e4\u06e4\u06e0";
                    iM9364 = C0480.m9363(jM3242, iM9363, i10);
                    break;
                case 1746813:
                    jM3242 = C0149.m2848(this);
                    str = "\u06e2\u06e1\u06e2";
                    iM9363 = C0480.m9363(jM3242, iM9364, i10);
                    break;
                case 1747842:
                    return iM9364 + 7;
                case 1747843:
                    int iM7326 = C0373.m7326();
                    jM3242 = C0486.m9478(this);
                    str = "\u06e8\u06e2\u06e5";
                    iM9364 = iM7326;
                    break;
                case 1748611:
                    i10 = iM9363 ^ 538;
                    str = "\u06e7\u06e0\u06e7";
                    iM9363 = iM9364 * i10;
                    break;
                case 1748864:
                    jM3242 = C0404.m7945(this);
                    str = "\u06e6\u06e8\u06e3";
                    iM9363 = C0480.m9363(jM3242, iM9364, i10);
                    break;
                case 1749635:
                    jM3242 = C0349.m6832(this);
                    str = "\u06e8\u06e6\u06e5";
                    iM9364 = C0060.m1146(jM3242);
                    break;
                case 1749759:
                    jM3242 = C0252.m4822(this);
                    str = "\u06e5\u06e1";
                    iM9364 = C0480.m9363(jM3242, iM9363, i10);
                    break;
                case 1751648:
                    jM3242 = C0401.m7875(this);
                    str = "\u06e6\u06df";
                    iM9363 = C0480.m9363(jM3242, iM9364, i10);
                    break;
                case 1752490:
                    jM3242 = C0331.m6402(this);
                    str = "\u06df\u06e3\u06e1";
                    iM9364 = C0480.m9363(jM3242, iM9363, i10);
                    break;
                case 1753697:
                    jM3242 = C0299.m5763(this);
                    str = "\u06e8\u06e1\u06e3";
                    iM9364 = C0480.m9363(jM3242, iM9363, i10);
                    break;
                case 1754414:
                    jM3242 = C0481.m9379(this);
                    str = "\u06e1\u06e7\u06e6";
                    iM9364 = C0480.m9363(jM3242, iM9363, i10);
                    break;
                case 1755402:
                    jM3242 = C0463.m9039(this);
                    str = "\u06e8\u06e5\u06e3";
                    iM9363 = C0480.m9363(jM3242, iM9364, i10);
                    break;
                case 1755435:
                    iM9364 = C0060.m1146(jM3242);
                    str = "\u06e1\u06df\u06e1";
                    iM9363 = C0084.f118;
                    break;
                case 1755526:
                    jM3242 = C0417.m8197(this);
                    str = "\u06e4\u06df";
                    iM9364 = C0480.m9363(jM3242, iM9363, i10);
                    break;
                case 1755559:
                    i10 = iM9364 - 7;
                    str = "\u06e0\u06e5\u06e7";
                    iM9364 = i10 + iM9363;
                    break;
                default:
                    jM3242 = C0169.m3242(this);
                    str = "\u06e2\u06e5\u06e2";
                    iM9363 = C0480.m9363(jM3242, iM9364, i10);
                    break;
            }
        }
    }
}
