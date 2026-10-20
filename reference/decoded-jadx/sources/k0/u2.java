package k0;

import aa.C0012;
import android.support.v4.graphics.drawable.C0016;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.draw.C0028;
import c3.C0062;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.migration.C0239;
import g0.C0285;
import h.C0298;
import h0.C0299;
import h3.C0302;
import i9.C0321;
import j9.C0329;
import m5.C0354;
import m7.C0357;
import n9.C0366;
import o2.C0368;
import q9.C0391;
import r.C0392;
import r7.C0404;
import r9.C0405;
import v8.C0450;
import v9.C0451;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f507short = {2805, 2807, 2810, 2810, 2742, 2786, 2809, 2742, 2737, 2788, 2803, 2789, 2787, 2811, 2803, 2737, 2742, 2804, 2803, 2800, 2809, 2788, 2803, 2742, 2737, 2815, 2808, 2784, 2809, 2813, 2803, 2737, 2742, 2785, 2815, 2786, 2814, 2742, 2805, 2809, 2788, 2809, 2787, 2786, 2815, 2808, 2803};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f9522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1.i f9523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(x2 x2Var, u1.i iVar, u8.e eVar) {
        super(C0404.f675 ^ 804, eVar);
        this.f9522b = x2Var;
        this.f9523c = iVar;
        int iM7952 = C0405.m7952();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7952 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0298.m5736("tiryFXvk15bF3pXHvBM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6437() {
        int iM9505 = C0488.m9505();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9505 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f507short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        String str = "\u06e7\u06e7\u06e0";
        x2 x2VarM3221 = null;
        u1.i iVarM5826 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1752615:
                    this = new u2(x2VarM3221, iVarM5826, eVar);
                    str = "\u06e0\u06e5\u06e1";
                    break;
                case 1752738:
                    str = "\u06e5\u06e4\u06e6";
                    iVarM5826 = C0302.m5826(this);
                    break;
                case 1754624:
                    x2VarM3221 = C0168.m3221(this);
                    str = "\u06e5\u06e8\u06e5";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e5\u06e8\u06e1";
        u8.e eVarM1206 = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        Object objM549 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747713:
                    eVarM1206 = C0062.m1206(this, d0Var, eVar);
                    str = "\u06e5\u06e7\u06e4";
                    break;
                case 1747809:
                    str = "\u06e0\u06e1\u06e2";
                    eVar = (u8.e) obj2;
                    break;
                case 1748769:
                    return objM549;
                case 1748861:
                    objM549 = C0028.m549(this, lVarM238);
                    str = "\u06e1\u06e4\u06e4";
                    break;
                case 1750786:
                    str = "\u06e1\u06e7\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                case 1752706:
                    str = "\u06e3\u06e7\u06e6";
                    this = (u2) eVarM1206;
                    break;
                default:
                    str = "\u06e0\u06e4\u06e5";
                    d0Var = (m9.d0) objM549;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        long j10;
        int i10;
        v8.a aVarM5766 = C0299.m5766();
        int iM7017 = C0357.m7017(this);
        x2 x2VarM3221 = C0168.m3221(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = iM7017 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = iM7017 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0114.m2211(m6437(), 0, C0391.f662 ^ 780, 2710));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
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
                    C0329.m6365(obj);
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return C0012.m238();
                            case 76:
                                y2 y2VarM7674 = C0392.m7674(x2VarM3221);
                                int iM1200 = C0062.m1200(y2VarM7674);
                                String strM2592 = C0135.m2592(y2VarM7674);
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 53:
                                            z10 = false;
                                            break;
                                        case 503:
                                            i15 = strM2592 != null ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            int i16 = 49666;
                                            while (true) {
                                                i16 ^= 49683;
                                                switch (i16) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i16 = 49697;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        z10 = true;
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
                                int iM4593 = C0239.m4593(iM1200);
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            j10 = 4000;
                                            break;
                                        case 84:
                                            int i18 = 49914;
                                            while (true) {
                                                i18 ^= 49931;
                                                switch (i18) {
                                                    case 497:
                                                        i18 = iM4593 != 1 ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        j10 = 10000;
                                                        int i19 = 51588;
                                                        while (true) {
                                                            i19 ^= 51605;
                                                            switch (i19) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i19 = 51619;
                                                                    continue;
                                                                case 54:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 1769:
                                                        int i20 = 50689;
                                                        while (true) {
                                                            i20 ^= 50706;
                                                            switch (i20) {
                                                                case 19:
                                                                    i20 = iM4593 == 2 ? 50782 : 50751;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    throw new androidx.fragment.app.a0();
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    int i21 = 50813;
                                                                    while (true) {
                                                                        i21 ^= 50830;
                                                                        switch (i21) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                j10 = Long.MAX_VALUE;
                                                                                break;
                                                                            case 243:
                                                                                i21 = 50844;
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
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 241:
                                            i17 = iM4593 != 0 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                u1.i iVarM5826 = C0302.m5826(this);
                                int i22 = 51712;
                                while (true) {
                                    i22 ^= 51729;
                                    switch (i22) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i22 = iVarM5826 == null ? 51805 : 51774;
                                            break;
                                        case 47:
                                            u1.k kVar = (u1.k) iVarM5826;
                                            int i23 = 52611;
                                            while (true) {
                                                i23 ^= 52628;
                                                switch (i23) {
                                                    case 23:
                                                        i23 = j10 >= 2147483647L ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        int i24 = 53510;
                                                        while (true) {
                                                            i24 ^= 53527;
                                                            switch (i24) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i24 = z10 ? 53603 : 53572;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 83:
                                                                    i10 = 3;
                                                                    break;
                                                                case 116:
                                                                    i10 = 7;
                                                                    int i25 = 53634;
                                                                    while (true) {
                                                                        i25 ^= 53651;
                                                                        switch (i25) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i25 = 53665;
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
                                                        int iM7181 = C0366.m7181();
                                                        AccessibilityManager accessibilityManagerM6957 = C0354.m6957(kVar);
                                                        int i26 = 53758;
                                                        while (true) {
                                                            i26 ^= 53775;
                                                            switch (i26) {
                                                                case 1009:
                                                                    i26 = iM7181 >= 29 ? 54502 : 54471;
                                                                    break;
                                                                case 1703:
                                                                    break;
                                                                case 1736:
                                                                    int i27 = 55556;
                                                                    while (true) {
                                                                        i27 ^= 55573;
                                                                        switch (i27) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i27 = z10 ? 55649 : 55618;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                break;
                                                                            case 116:
                                                                                boolean zM8802 = C0451.m8802(accessibilityManagerM6957);
                                                                                int i28 = 55680;
                                                                                while (true) {
                                                                                    i28 ^= 55697;
                                                                                    switch (i28) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i28 = zM8802 ? 56424 : 56393;
                                                                                            break;
                                                                                        case 1467:
                                                                                            break;
                                                                                        case 1496:
                                                                                            break;
                                                                                        case 1529:
                                                                                            int i29 = 56455;
                                                                                            while (true) {
                                                                                                i29 ^= 56472;
                                                                                                switch (i29) {
                                                                                                    case 31:
                                                                                                        i29 = 56486;
                                                                                                        continue;
                                                                                                    case 62:
                                                                                                        j10 = Long.MAX_VALUE;
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
                                                                    break;
                                                                case 1769:
                                                                    int iM322 = C0016.m322(C0159.m3033(), accessibilityManagerM6957, (int) j10, i10);
                                                                    int i30 = 54533;
                                                                    while (true) {
                                                                        i30 ^= 54550;
                                                                        switch (i30) {
                                                                            case 19:
                                                                                i30 = iM322 == Integer.MAX_VALUE ? 54626 : 54595;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 85:
                                                                                j10 = iM322;
                                                                                int i31 = 55432;
                                                                                while (true) {
                                                                                    i31 ^= 55449;
                                                                                    switch (i31) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i31 = 55463;
                                                                                            continue;
                                                                                        case 62:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 116:
                                                                                int i32 = 54657;
                                                                                while (true) {
                                                                                    i32 ^= 54674;
                                                                                    switch (i32) {
                                                                                        case 19:
                                                                                            i32 = 54688;
                                                                                            continue;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            j10 = Long.MAX_VALUE;
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
                                                        break;
                                                    case 116:
                                                        int i33 = 52735;
                                                        while (true) {
                                                            i33 ^= 52752;
                                                            switch (i33) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 1007:
                                                                    i33 = 52766;
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
                                        case 76:
                                            int i34 = 51836;
                                            while (true) {
                                                i34 ^= 51853;
                                                switch (i34) {
                                                    case 241:
                                                        i34 = 52518;
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
                                this.f9521a = 1;
                                Object objM5493 = C0285.m5493(j10, this);
                                int i35 = 56579;
                                while (true) {
                                    i35 ^= 56596;
                                    switch (i35) {
                                        case 23:
                                            i35 = objM5493 == aVarM5766 ? 1507472 : 56641;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            break;
                                        case 1564036:
                                            return aVarM5766;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i14 = x2VarM3221 != null ? 48860 : 48829;
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
        m9.k kVarM8773 = C0450.m8773(x2VarM3221);
        boolean zM6220 = C0321.m6220(kVarM8773);
        int i36 = 1507503;
        while (true) {
            i36 ^= 1507520;
            switch (i36) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 111:
                    i36 = zM6220 ? 1507596 : 1507565;
                    break;
                case 460:
                    C0107.m2090(kVarM8773, C0368.m7235());
                    break;
                default:
                    break;
            }
        }
        return C0012.m238();
    }
}
