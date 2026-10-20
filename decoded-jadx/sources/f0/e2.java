package f0;

import a.C0001;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.measurement.C0181;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import e2.C0260;
import f6.C0277;
import h5.C0307;
import j2.C0323;
import j6.C0328;
import k3.C0335;
import o2.C0368;
import o7.i2;
import s8.C0416;

/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5687a = 100000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l.t f5688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l.t f5689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f5691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5692f;

    public e2() {
        int iM3452 = C0181.m3452();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3452 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0335.m6509("veLa2KoKsENW04RUJ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x019d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:113:0x01b8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:126:0x01e3. Please report as an issue. */
    public final void a(g2.a0 a0Var) {
        g2.a0 a0Var2;
        String strM5369;
        l.t tVar;
        l.t tVar2;
        this.f5692f = false;
        l.t tVarM6340 = C0328.m6340(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = tVarM6340 != null ? 1709 : 1678;
                    break;
                case 204:
                    a0Var2 = (g2.a0) C0001.m30(tVarM6340);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    a0Var2 = null;
                    break;
                default:
                    break;
            }
        }
        boolean zM4399 = C0228.m4399(a0Var, a0Var2);
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (zM4399) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    String strM53610 = C0277.m5369(C0143.m2754(a0Var));
                    l.t tVarM6341 = C0328.m6340(this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                strM5369 = null;
                                break;
                            case 76:
                                g2.a0 a0Var3 = (g2.a0) C0001.m30(tVarM6341);
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            strM5369 = null;
                                            break;
                                        case 503:
                                            i14 = a0Var3 != null ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            strM5369 = C0277.m5369(C0143.m2754(a0Var3));
                                            int i15 = 49666;
                                            while (true) {
                                                i15 ^= 49683;
                                                switch (i15) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i15 = 49697;
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
                            case 239:
                                i13 = tVarM6341 != null ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM43910 = C0228.m4399(strM53610, strM5369);
                    int i16 = 49790;
                    while (true) {
                        i16 ^= 49807;
                        switch (i16) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                this.f5688b = new l.t(C0089.f123 ^ 393, C0328.m6340(this), a0Var);
                                this.f5689c = null;
                                int iM8181 = 0 - ((0 - C0416.m8181(C0277.m5369(C0143.m2754(a0Var)))) - C0368.m7222(this));
                                this.f5690d = iM8181;
                                int iM5930 = C0307.m5930(this);
                                int i17 = 51588;
                                while (true) {
                                    i17 ^= 51605;
                                    switch (i17) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM8181 > iM5930) {
                                                i17 = 51681;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            return;
                                        case 116:
                                            l.t tVarM6342 = C0328.m6340(this);
                                            int i18 = 51712;
                                            while (true) {
                                                i18 ^= 51729;
                                                switch (i18) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i18 = tVarM6342 != null ? 51805 : 51774;
                                                        break;
                                                    case 47:
                                                        tVar = null;
                                                        break;
                                                    case 76:
                                                        tVar = (l.t) C0260.m4983(tVarM6342);
                                                        int i19 = 51836;
                                                        while (true) {
                                                            i19 ^= 51853;
                                                            switch (i19) {
                                                                case 241:
                                                                    i19 = 52518;
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
                                            int i20 = 52611;
                                            while (true) {
                                                i20 ^= 52628;
                                                switch (i20) {
                                                    case 23:
                                                        if (tVar == null) {
                                                            i20 = 52704;
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        while (true) {
                                                            int i21 = 53510;
                                                            while (true) {
                                                                i21 ^= 53527;
                                                                switch (i21) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i21 = tVarM6342 != null ? 53603 : 53572;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        tVar2 = null;
                                                                        break;
                                                                    case 116:
                                                                        l.t tVar3 = (l.t) C0260.m4983(tVarM6342);
                                                                        int i22 = 53634;
                                                                        while (true) {
                                                                            i22 ^= 53651;
                                                                            switch (i22) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i22 = tVar3 != null ? 53727 : 53696;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 76:
                                                                                    tVar2 = (l.t) C0260.m4983(tVar3);
                                                                                    int i23 = 53758;
                                                                                    while (true) {
                                                                                        i23 ^= 53775;
                                                                                        switch (i23) {
                                                                                            case 1009:
                                                                                                i23 = 54440;
                                                                                                break;
                                                                                            case 1703:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    tVar2 = null;
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
                                                            int i24 = 54533;
                                                            while (true) {
                                                                i24 ^= 54550;
                                                                switch (i24) {
                                                                    case 19:
                                                                        i24 = tVar2 != null ? 54626 : 54595;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 116:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                int i25 = 55432;
                                                                while (true) {
                                                                    i25 ^= 55449;
                                                                    switch (i25) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (tVarM6342 == null) {
                                                                                i25 = 55525;
                                                                            }
                                                                            break;
                                                                        case 62:
                                                                            break;
                                                                        case 95:
                                                                            tVarM6342.f10928b = null;
                                                                            return;
                                                                        case 124:
                                                                            int i26 = 55556;
                                                                            while (true) {
                                                                                i26 ^= 55573;
                                                                                switch (i26) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i26 = 55587;
                                                                                        break;
                                                                                    case 54:
                                                                                        return;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i25 = 55494;
                                                                }
                                                            }
                                                            l.t tVar4 = (l.t) C0260.m4983(tVarM6342);
                                                            int i27 = 54657;
                                                            while (true) {
                                                                i27 ^= 54674;
                                                                switch (i27) {
                                                                    case 19:
                                                                        i27 = 54688;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                }
                                                            }
                                                            tVarM6342 = tVar4;
                                                        }
                                                        break;
                                                    case 116:
                                                        int i28 = 52735;
                                                        while (true) {
                                                            i28 ^= 52752;
                                                            switch (i28) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    return;
                                                                case 1007:
                                                                    i28 = 52766;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i20 = 52673;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i17 = 51650;
                                }
                                break;
                            case 84:
                                l.t tVarM6343 = C0328.m6340(this);
                                int i29 = 49914;
                                while (true) {
                                    i29 ^= 49931;
                                    switch (i29) {
                                        case 497:
                                            i29 = tVarM6343 == null ? 50658 : 50627;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            tVarM6343.f10929c = a0Var;
                                            break;
                                        case 1769:
                                            int i30 = 50689;
                                            while (true) {
                                                i30 ^= 50706;
                                                switch (i30) {
                                                    case 19:
                                                        i30 = 50720;
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
                                int iM6259 = C0323.m6259();
                                int i31 = 50813;
                                while (true) {
                                    i31 ^= 50830;
                                    switch (i31) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            return;
                                        case 243:
                                            if (iM6259 >= 0) {
                                                i31 = 51557;
                                            }
                                            break;
                                        case 4075:
                                            System.out.println(Double.parseDouble(C0136.m2628("3WdOP1q7yoMpGLuhDy6PX3L")));
                                            return;
                                        default:
                                            continue;
                                    }
                                    i31 = 50875;
                                }
                                break;
                            case 241:
                                if (zM43910) {
                                    i16 = 49883;
                                }
                                break;
                            default:
                                continue;
                        }
                        i16 = 49852;
                    }
                    break;
                case 47417:
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
    }
}
