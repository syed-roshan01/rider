package k6;

import android.content.ContentValues;
import android.os.C0013;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.node.C0037;
import c3.C0063;
import c7.C0068;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import d4.C0218;
import d9.C0224;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.generatesrootinput.C0251;
import f.C0270;
import f.C0271;
import f0.C0272;
import f4.C0276;
import fa.C0282;
import g.C0284;
import h5.C0308;
import h6.C0310;
import h7.C0312;
import h8.C0314;
import i.C0316;
import j5.C0328;
import j6.C0329;
import k.C0332;
import k8.C0339;
import m1.C0351;
import m5.C0355;
import n.C0362;
import o4.C0370;
import p8.C0380;
import r6.C0403;
import s7.C0415;
import u4.C0436;
import u8.C0439;
import x2.C0468;
import y.C0475;
import z.C0482;
import z3.C0486;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class i5 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f551short = {2457, 2479, 2494, 2494, 2467, 2468, 2477, 2538, 2473, 2469, 2468, 2489, 2479, 2468, 2494, 2534, 2538, 2490, 2475, 2473, 2465, 2475, 2477, 2479, 2534, 2538, 2473, 2469, 2468, 2489, 2479, 2468, 2494, 2837, 2851, 2866, 2866, 2863, 2856, 2849, 2918, 2818, 2827, 2823, 2918, 2853, 2857, 2856, 2869, 2851, 2856, 2866, 2920, 2918, 2870, 2855, 2853, 2861, 2855, 2849, 2851, 2922, 2918, 2853, 2857, 2856, 2869, 2851, 2856, 2866, 1857, 1872, 1872, 1919, 1865, 1860, 2454, 2463, 2451, 2477, 2449, 2461, 2460, 2433, 2455, 2460, 2438, 2477, 2433, 2455, 2438, 2438, 2459, 2460, 2453, 2433};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7 f10109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h5 f10110c;

    public /* synthetic */ i5(h5 h5Var, x7 x7Var, int i10) {
        this.f10108a = i10;
        this.f10110c = h5Var;
        this.f10109b = x7Var;
        int iM8130 = C0415.m8130();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8130 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0164.m3141("2ebVfaSJbVCASJ3oFFpFL")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6562(Object obj, Object obj2, Object obj3) {
        int iM9373 = C0482.m9373();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9373 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((s5) obj).i((s5) obj2, (r5[]) obj3);
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6563() {
        int iM3691 = C0193.m3691();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3691 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f551short;
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

    @Override // java.lang.Runnable
    public final void run() {
        int iM9549;
        int iM6023 = C0312.m6023(this);
        x7 x7VarM7243 = C0370.m7243(this);
        h5 h5VarM6064 = C0314.m6064(this);
        switch (iM6023) {
            case 0:
                C0339.m6647(C0270.m5151(h5VarM6064));
                C0351.m6865(C0270.m5151(h5VarM6064), x7VarM7243);
                int iM598 = C0031.m598();
                int i10 = 51712;
                while (true) {
                    i10 ^= 51729;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM598 <= 0) {
                                i10 = 51805;
                            }
                            break;
                        case 47:
                            break;
                        case 76:
                            System.out.println(Integer.valueOf(C0436.m8504("LY5LwBWHero")));
                            break;
                        default:
                            continue;
                    }
                    i10 = 51774;
                }
                break;
            case 1:
                C0339.m6647(C0270.m5151(h5VarM6064));
                p7 p7VarM5151 = C0270.m5151(h5VarM6064);
                C0063.m1219(C0486.m9461(p7VarM5151));
                C0332.m6405(p7VarM5151);
                C0282.m5438(C0074.m1624(x7VarM7243));
                C0167.m3194(p7VarM5151, x7VarM7243);
                break;
            case 2:
                C0339.m6647(C0270.m5151(h5VarM6064));
                C0157.m2994(C0270.m5151(h5VarM6064), x7VarM7243);
                break;
            default:
                C0339.m6647(C0270.m5151(h5VarM6064));
                p7 p7VarM5152 = C0270.m5151(h5VarM6064);
                C0063.m1219(C0486.m9461(p7VarM5152));
                C0332.m6405(p7VarM5152);
                C0282.m5438(C0074.m1624(x7VarM7243));
                boolean zM2823 = C0147.m2823();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i11 = zM2823 ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zM3575 = C0187.m3575(C0086.m1839(p7VarM5152), null, C0403.m7890());
                            int i12 = 1740;
                            while (true) {
                                i12 ^= 1757;
                                switch (i12) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i12 = zM3575 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        iM9549 = 100;
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        iM9549 = C0491.m9549(x7VarM7243);
                                        int i13 = 1864;
                                        while (true) {
                                            i13 ^= 1881;
                                            switch (i13) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i13 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            iM9549 = 100;
                            break;
                        default:
                            break;
                    }
                }
                s5 s5VarM5225 = C0272.m5225(iM9549, C0234.m4499(x7VarM7243));
                String strM1624 = C0074.m1624(x7VarM7243);
                s5 s5VarM4132 = C0218.m4132(p7VarM5152, strM1624);
                C0112.m2169(C0136.m2634(C0328.m6333(p7VarM5152)), C0163.m3133(m6563(), 0, C0475.f745 ^ (-577), 2506), strM1624, s5VarM5225);
                C0284.m5469(p7VarM5152, strM1624, s5VarM5225);
                boolean zM6562 = m6562(s5VarM5225, s5VarM4132, (r5[]) C0251.m4799(C0308.m5936(C0355.m6952(s5VarM5225)), new r5[0]));
                int i14 = 48767;
                while (true) {
                    i14 ^= 48784;
                    switch (i14) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            break;
                        case 76:
                            C0157.m2994(p7VarM5152, x7VarM7243);
                            break;
                        case 239:
                            i14 = zM6562 ? 48860 : 48829;
                            break;
                        default:
                            break;
                    }
                }
                boolean zM2824 = C0147.m2823();
                int i15 = 48891;
                while (true) {
                    i15 ^= 48908;
                    switch (i15) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            if (zM2824) {
                                i15 = 49635;
                            }
                            break;
                        case 32495:
                            f fVarM1839 = C0086.m1839(p7VarM5152);
                            x3 x3VarM7890 = C0403.m7890();
                            boolean zM3576 = C0187.m3575(fVarM1839, null, x3VarM7890);
                            int i16 = 49666;
                            while (true) {
                                i16 ^= 49683;
                                switch (i16) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (zM3576) {
                                            i16 = 49759;
                                        }
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        o oVarM259 = C0013.m259(C0159.m3041(x7VarM7243));
                                        boolean zM5970 = C0310.m5970(C0316.m6115(), oVarM259);
                                        int i17 = 49790;
                                        while (true) {
                                            i17 ^= 49807;
                                            switch (i17) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    break;
                                                case 84:
                                                    C0112.m2169(C0136.m2634(C0328.m6333(p7VarM5152)), C0037.m732(m6563(), 33, C0123.f149 ^ (-442), 2886), strM1624, oVarM259);
                                                    C0063.m1219(C0486.m9461(p7VarM5152));
                                                    C0332.m6405(p7VarM5152);
                                                    boolean zM2825 = C0147.m2823();
                                                    int i18 = 49914;
                                                    while (true) {
                                                        i18 ^= 49931;
                                                        switch (i18) {
                                                            case 497:
                                                                if (zM2825) {
                                                                    i18 = 50658;
                                                                }
                                                                break;
                                                            case 1711:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                C0128.m2473(C0329.m6337(p7VarM5152), strM1624, oVarM259);
                                                                k kVarM4068 = C0213.m4068(p7VarM5152);
                                                                C0173.m3298(kVarM4068);
                                                                boolean zM2826 = C0147.m2823();
                                                                int i19 = 50689;
                                                                while (true) {
                                                                    i19 ^= 50706;
                                                                    switch (i19) {
                                                                        case 19:
                                                                            if (zM2826) {
                                                                                i19 = 50782;
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 76:
                                                                            boolean zM3577 = C0187.m3575(C0091.m1951(kVarM4068), null, x3VarM7890);
                                                                            int i20 = 50813;
                                                                            while (true) {
                                                                                i20 ^= 50830;
                                                                                switch (i20) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 53:
                                                                                        C0271.m5173(oVarM259);
                                                                                        C0224.m4302(kVarM4068);
                                                                                        C0068.m1329(kVarM4068);
                                                                                        ContentValues contentValues = new ContentValues();
                                                                                        C0468.m9098(contentValues, C0022.m430(m6563(), 70, C0380.f650 ^ 312, 1824), strM1624);
                                                                                        C0468.m9098(contentValues, C0276.m5301(m6563(), 76, C0439.f709 ^ 658, 2546), C0362.m7096(oVarM259));
                                                                                        C0128.m2467(kVarM4068, contentValues);
                                                                                        break;
                                                                                    case 243:
                                                                                        if (!zM3577) {
                                                                                            i20 = 51557;
                                                                                        }
                                                                                        break;
                                                                                    case 4075:
                                                                                        int i21 = 51588;
                                                                                        while (true) {
                                                                                            i21 ^= 51605;
                                                                                            switch (i21) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i21 = 51619;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i20 = 50875;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i19 = 50751;
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i18 = 50627;
                                                    }
                                                    break;
                                                case 241:
                                                    if (!zM5970) {
                                                        i17 = 49883;
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i17 = 49852;
                                        }
                                        break;
                                    case 83:
                                        break;
                                    default:
                                        continue;
                                }
                                i16 = 49728;
                            }
                            break;
                        default:
                            continue;
                    }
                    i15 = 48953;
                }
                break;
        }
    }
}
