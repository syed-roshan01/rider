package f0;

import androidx.lifecycle.C0043;
import androidx.preference.C0044;
import androidx.profileinstaller.C0046;
import b7.C0054;
import c1.C0061;
import c7.C0069;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import d9.C0227;
import e2.C0262;
import ea.C0269;
import g.C0284;
import h3.C0304;
import l0.C0340;
import n7.C0364;
import o7.i2;
import s2.C0412;
import t9.C0428;
import u4.C0436;
import w2.C0458;
import y.C0476;
import y9.C0479;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f6009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x.m f6011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a2 a2Var, boolean z10, x.m mVar) {
        super(C0061.f81 ^ 823);
        this.f6009a = a2Var;
        this.f6010b = z10;
        this.f6011c = mVar;
        int iM1701 = C0079.m1701();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1701 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0061.m1171("2u")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        Object[] objArr;
        boolean z10;
        boolean z11 = true;
        char c10 = 1;
        C0436.m8515((Number) obj3);
        m0.q qVar = (m0.q) ((m0.m) obj2);
        C0262.m4990(qVar, 805428430 ^ C0487.f760);
        Object objM9256 = C0476.m9256(qVar, C0304.m5851());
        m2.l lVarM5470 = C0284.m5470();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = objM9256 == lVarM5470 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                objArr = true;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    objArr = false;
                    break;
                default:
                    break;
            }
        }
        a2 a2VarM1836 = C0086.m1836(this);
        v.h1 h1Var = (v.h1) C0458.m8909(C0364.m7128(a2VarM1836));
        v.h1 h1VarM6671 = C0340.m6671();
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = h1Var != h1VarM6671 ? 48736 : 48705;
                    break;
                case 47384:
                    z10 = true;
                    break;
                case 47417:
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                int i14 = 49666;
                                while (true) {
                                    i14 ^= 49683;
                                    switch (i14) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            z10 = false;
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 76:
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 503:
                                            i15 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    z10 = true;
                                    break;
                                }
                                break;
                            case 239:
                                i13 = objArr == false ? 48860 : 48829;
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
        C0262.m4990(qVar, (-1235672254) ^ C0069.f89);
        boolean zM2013 = C0103.m2013(qVar, a2VarM1836);
        Object objM8078 = C0412.m8078(qVar);
        Object objM2417 = C0125.m2417();
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    objM8078 = new q.w(a2VarM1836, C0054.f74 ^ 347);
                    C0479.m9328(qVar, objM8078);
                    break;
                case 84:
                    int i17 = 49914;
                    while (true) {
                        i17 ^= 49931;
                        switch (i17) {
                            case 497:
                                i17 = objM8078 == objM2417 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                objM8078 = new q.w(a2VarM1836, C0054.f74 ^ 347);
                                C0479.m9328(qVar, objM8078);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 241:
                    i16 = !zM2013 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        C0171.m3270(qVar, false);
        C0262.m4990(qVar, 180460688 ^ C0124.f150);
        m0.g1 g1VarM862 = C0044.m862((c9.c) objM8078, qVar);
        C0262.m4990(qVar, 492369843 ^ C0224.f303);
        Object objM8079 = C0412.m8078(qVar);
        int i18 = 50689;
        while (true) {
            i18 ^= 50706;
            switch (i18) {
                case 19:
                    i18 = objM8079 == objM2417 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    objM8079 = new v.y(new v.s0(g1VarM862, c10 == true ? 1 : 0));
                    C0479.m9328(qVar, objM8079);
                    break;
                default:
                    break;
            }
        }
        C0171.m3270(qVar, false);
        v.f2 f2Var = (v.f2) objM8079;
        C0171.m3270(qVar, false);
        C0262.m4990(qVar, 511388310 ^ C0428.f698);
        boolean zM2014 = C0103.m2013(qVar, f2Var);
        boolean zM2015 = C0103.m2013(qVar, a2VarM1836);
        Object objM80710 = C0412.m8078(qVar);
        int i19 = 50813;
        while (true) {
            i19 ^= 50830;
            switch (i19) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 53:
                    objM80710 = new x1(f2Var, a2VarM1836);
                    C0479.m9328(qVar, objM80710);
                    break;
                case 243:
                    i19 = !((zM2014 ^ zM2015) | (zM2014 & zM2015)) ? 51557 : 50875;
                    break;
                case 4075:
                    int i20 = 51588;
                    while (true) {
                        i20 ^= 51605;
                        switch (i20) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = objM80710 == objM2417 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                objM80710 = new x1(f2Var, a2VarM1836);
                                C0479.m9328(qVar, objM80710);
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
        C0171.m3270(qVar, false);
        x1 x1Var = (x1) objM80710;
        y0.l lVarM4370 = C0227.m4370();
        v.h1 h1Var2 = (v.h1) C0458.m8909(C0364.m7128(a2VarM1836));
        boolean zM3326 = C0174.m3326(this);
        int i21 = 51712;
        while (true) {
            i21 ^= 51729;
            switch (i21) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (zM3326) {
                        i21 = 51805;
                    }
                    break;
                case 47:
                    break;
                case 76:
                    float fM887 = C0046.m887(C0043.m843(a2VarM1836));
                    int i22 = 51836;
                    while (true) {
                        i22 ^= 51853;
                        switch (i22) {
                            case 241:
                                if (fM887 == 0.0f) {
                                    i22 = 52580;
                                }
                                break;
                            case 1963:
                                break;
                            case 1992:
                                int i23 = 52735;
                                while (true) {
                                    i23 ^= 52752;
                                    switch (i23) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            y0.o oVarM2698 = C0140.m2698(lVarM4370, x1Var, h1Var2, null, z11, z10, null, C0269.m5135(this));
                                            C0171.m3270(qVar, false);
                                            return oVarM2698;
                                        case 1007:
                                            i23 = 52766;
                                            break;
                                    }
                                }
                                break;
                            case 2025:
                                int i24 = 52611;
                                while (true) {
                                    i24 ^= 52628;
                                    switch (i24) {
                                        case 23:
                                            i24 = 52642;
                                            break;
                                        case 54:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i22 = 52549;
                    }
                    break;
                default:
                    continue;
            }
            i21 = 51774;
        }
        z11 = false;
        y0.o oVarM2699 = C0140.m2698(lVarM4370, x1Var, h1Var2, null, z11, z10, null, C0269.m5135(this));
        C0171.m3270(qVar, false);
        return oVarM2699;
    }
}
