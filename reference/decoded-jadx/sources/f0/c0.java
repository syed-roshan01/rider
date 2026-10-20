package f0;

import a.C0000;
import a3.C0006;
import a8.C0009;
import androidx.annotation.C0019;
import c1.C0059;
import c3.C0062;
import c3.C0063;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.sql.C0208;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.internal.componenttreedeps.C0248;
import dagger.hilt.internal.generatesrootinput.C0250;
import f6.C0277;
import h6.C0309;
import ia.C0322;
import k4.C0336;
import la.C0348;
import o7.i2;
import s8.C0416;
import u4.C0435;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.s f5628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.a0 f5630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.v0 f5631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f5632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g2.s sVar, boolean z10, g2.a0 a0Var, h0.v0 v0Var, c2 c2Var) {
        super(C0336.f520 ^ (-840));
        this.f5628a = sVar;
        this.f5629b = z10;
        this.f5630c = a0Var;
        this.f5631d = v0Var;
        this.f5632e = c2Var;
        int iM375 = C0019.m375();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM375 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0322.m6237("w8TShLi2Cm6H5fUsDUSlzJ6kTn"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x00c1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00f3. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int iM8515 = C0435.m8515((Number) obj);
        int iM8516 = C0435.m8515((Number) obj2);
        boolean zM14 = C0000.m14((Boolean) obj3);
        g2.s sVarM5990 = C0309.m5990(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM14 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    iM8515 = C0208.m3988(sVarM5990, iM8515);
                    break;
                default:
                    break;
            }
        }
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = zM14 ? 48736 : 48705;
                    break;
                case 47384:
                    iM8516 = C0208.m3988(sVarM5990, iM8516);
                    break;
                case 47417:
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i13 = 48798;
                                continue;
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
        boolean zM1221 = C0063.m1221(this);
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    g2.a0 a0VarM1885 = C0088.m1885(this);
                    long jM5972 = C0309.m5972(a0VarM1885);
                    C0153.m2937();
                    int i15 = (int) (jM5972 >> 32);
                    int i16 = 49790;
                    while (true) {
                        i16 ^= 49807;
                        switch (i16) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                break;
                            case 84:
                                int i17 = (int) (jM5972 & ((4294967295L ^ (-1)) ^ jM5972));
                                int i18 = 49914;
                                while (true) {
                                    i18 ^= 49931;
                                    switch (i18) {
                                        case 497:
                                            i18 = iM8516 == i17 ? 50658 : 50627;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            int i19 = 50689;
                                            while (true) {
                                                i19 ^= 50706;
                                                switch (i19) {
                                                    case 19:
                                                        i19 = 50720;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        z10 = false;
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
                                i16 = iM8515 == i15 ? 49883 : 49852;
                                break;
                            default:
                                break;
                        }
                    }
                    int iM1191 = C0062.m1191(iM8515, iM8516);
                    o0 o0VarM113 = C0006.m113();
                    h0.v0 v0VarM4591 = C0239.m4591(this);
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                C0206.m3936(v0VarM4591, false);
                                C0348.m6821(v0VarM4591, o0VarM113);
                                z10 = false;
                                break;
                            case 243:
                                i20 = iM1191 >= 0 ? 51557 : 50875;
                                break;
                            case 4075:
                                int iM1119 = C0059.m1119(iM8515, iM8516);
                                a2.e eVarM2754 = C0143.m2754(a0VarM1885);
                                int iM8181 = C0416.m8181(C0277.m5369(eVarM2754));
                                int i21 = 51588;
                                while (true) {
                                    i21 ^= 51605;
                                    switch (i21) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM1119 <= iM8181) {
                                                i21 = 51681;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            C0206.m3936(v0VarM4591, false);
                                            C0348.m6821(v0VarM4591, o0VarM113);
                                            z10 = false;
                                            break;
                                        case 116:
                                            int i22 = 51712;
                                            while (true) {
                                                i22 ^= 51729;
                                                switch (i22) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i22 = !zM14 ? 51805 : 51774;
                                                        break;
                                                    case 47:
                                                        C0206.m3936(v0VarM4591, false);
                                                        C0348.m6821(v0VarM4591, o0VarM113);
                                                        break;
                                                    case 76:
                                                        int i23 = 51836;
                                                        while (true) {
                                                            i23 ^= 51853;
                                                            switch (i23) {
                                                                case 241:
                                                                    i23 = iM8515 == iM8516 ? 52580 : 52549;
                                                                    break;
                                                                case 1963:
                                                                    break;
                                                                case 1992:
                                                                    C0154.m2955(v0VarM4591, true);
                                                                    int i24 = 52735;
                                                                    while (true) {
                                                                        i24 ^= 52752;
                                                                        switch (i24) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 1007:
                                                                                i24 = 52766;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 2025:
                                                                    int i25 = 52611;
                                                                    while (true) {
                                                                        i25 ^= 52628;
                                                                        switch (i25) {
                                                                            case 23:
                                                                                i25 = 52642;
                                                                                continue;
                                                                            case 54:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        C0206.m3936(v0VarM4591, false);
                                                                        C0348.m6821(v0VarM4591, o0VarM113);
                                                                        break;
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
                                            C0130.m2513(C0248.m4757(C0197.m3784(this)), new g2.a0(eVarM2754, C0250.m4797(iM8515, iM8516), (a2.b0) null));
                                            z10 = true;
                                            int i26 = 53510;
                                            while (true) {
                                                i26 ^= 53527;
                                                switch (i26) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i26 = 53541;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i21 = 51650;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 503:
                    if (!zM1221) {
                        i14 = 49635;
                    }
                    break;
                case 32495:
                    int i27 = 49666;
                    while (true) {
                        i27 ^= 49683;
                        switch (i27) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i27 = 49697;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                z10 = false;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i14 = 48953;
        }
        return C0009.m192(z10);
    }
}
