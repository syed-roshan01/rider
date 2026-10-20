package f5;

import aa.C0012;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.layout.C0023;
import b1.C0050;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import d7.C0221;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.components.C0244;
import f4.C0276;
import g0.C0286;
import h0.C0300;
import h7.C0311;
import j9.C0330;
import k3.C0335;
import l0.C0340;
import l9.C0348;
import n.C0362;
import o1.C0368;
import o4.C0370;
import o7.i2;
import p7.C0379;
import p8.C0381;
import p9.q0;
import q6.C0387;
import s.C0408;
import t2.C0421;
import w1.C0456;
import z1.C0484;

/* JADX INFO: loaded from: classes.dex */
public final class i extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f405short = {2494, 2457, 2449, 2452, 2461, 2460, 2520, 2444, 2455, 2520, 2459, 2448, 2457, 2454, 2463, 2461, 2520, 2440, 2457, 2443, 2443, 2447, 2455, 2442, 2460, 1671, 1669, 1672, 1672, 1732, 1680, 1675, 1732, 1731, 1686, 1665, 1687, 1681, 1673, 1665, 1731, 1732, 1670, 1665, 1666, 1675, 1686, 1665, 1732, 1731, 1677, 1674, 1682, 1675, 1679, 1665, 1731, 1732, 1683, 1677, 1680, 1676, 1732, 1671, 1675, 1686, 1675, 1681, 1680, 1677, 1674, 1665, 572, 539, 534, 538, 519, 519, 528, 534, 513, 597, 534, 512, 519, 519, 528, 539, 513, 597, 517, 532, 518, 518, 514, 538, 519, 529, 1370, 1387, 1401, 1401, 1405, 1381, 1400, 1390, 1322, 1385, 1378, 1387, 1380, 1389, 1391, 1390, 1322, 1401, 1407, 1385, 1385, 1391, 1401, 1401, 1388, 1407, 1382, 1382, 1395};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MainViewModel mainViewModel, String str, String str2, u8.e eVar) {
        super(C0276.f391 ^ 985, eVar);
        this.f6274b = mainViewModel;
        this.f6275c = str;
        this.f6276d = str2;
        int iM7254 = C0370.m7254();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7254 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0421.m8254("euyEE4c77p2k2X3")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5341() {
        int iM5504 = C0286.m5504();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5504 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f405short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        String str = "ۣۧ۠";
        MainViewModel mainViewModelM2071 = null;
        String strM4543 = null;
        String strM4670 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746845:
                    str = "ۦۤۢ";
                    strM4670 = C0244.m4670(this);
                    break;
                case 1748796:
                    return this;
                case 1753572:
                    mainViewModelM2071 = C0107.m2071(this);
                    str = "ۡۤ";
                    break;
                case 1754500:
                    str = "۟ۤۢ";
                    strM4543 = C0237.m4543(this);
                    break;
                default:
                    this = new i(mainViewModelM2071, strM4543, strM4670, eVar);
                    str = "ۡۥ۠";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۡۥۨ";
        Object objM7562 = obj;
        u8.e eVarM7999 = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748804:
                    str = "ۡۦۨ";
                    d0Var = (m9.d0) objM7562;
                    break;
                case 1748835:
                    str = "ۤۢۢ";
                    eVar = (u8.e) obj2;
                    break;
                case 1749672:
                    objM7562 = C0387.m7562(this, lVarM238);
                    str = "ۤ۠ۥ";
                    break;
                case 1751529:
                    return objM7562;
                case 1751588:
                    eVarM7999 = C0408.m7999(this, d0Var, eVar);
                    str = "ۥۣۧ";
                    break;
                case 1752705:
                    str = "ۦ۠ۥ";
                    this = (i) eVarM7999;
                    break;
                default:
                    str = "ۢۢۨ";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM7205;
        boolean z10;
        int i10;
        Object objM4250;
        int i11;
        boolean z11;
        int i12;
        Throwable thM9416;
        int i13;
        int i14;
        String strM4049;
        int i15;
        v8.a aVarM5766 = C0300.m5766();
        int iM443 = C0022.m443(this);
        q8.l lVarM238 = C0012.m238();
        String strM6790 = C0348.m6790(m5341(), 0, C0050.f70 ^ 941, 2552);
        MainViewModel mainViewModelM2071 = C0107.m2071(this);
        int i16 = 1616;
        while (true) {
            i16 ^= 1633;
            try {
                switch (i16) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i16 = iM443 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i17 = 1740;
                        while (true) {
                            i17 ^= 1757;
                            switch (i17) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i17 = iM443 != 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    C0330.m6365(obj);
                                    objM7205 = C0362.m7093((q8.h) obj);
                                    int i18 = 49790;
                                    while (true) {
                                        i18 ^= 49807;
                                        switch (i18) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 241:
                                                i18 = 49821;
                                                continue;
                                            default:
                                                continue;
                                        }
                                        z10 = objM7205 instanceof q8.g;
                                        i10 = 50689;
                                        while (true) {
                                            i10 ^= 50706;
                                            switch (i10) {
                                                case 19:
                                                    i10 = z10 ? 50782 : 50751;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    a5.j jVarM7458 = C0381.m7458(mainViewModelM2071);
                                                    String strM4670 = C0244.m4670(this);
                                                    this.f6273a = 2;
                                                    objM4250 = C0221.m4250(jVarM7458, strM4670, this);
                                                    i11 = 50813;
                                                    while (true) {
                                                        i11 ^= 50830;
                                                        switch (i11) {
                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 243:
                                                                i11 = objM4250 == aVarM5766 ? 51557 : 50875;
                                                                break;
                                                            case 4075:
                                                                return aVarM5766;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    q0 q0VarM7412 = C0379.m7412(mainViewModelM2071);
                                                    q0 q0VarM1601 = C0073.m1601(mainViewModelM2071);
                                                    C0228.m4382(q0VarM7412, C0340.m6661(m5341(), 72, C0072.f104 ^ 107, 629));
                                                    Boolean boolM8876 = C0456.m8876();
                                                    C0228.m4382(q0VarM1601, boolM8876);
                                                    C0228.m4382(q0VarM1601, boolM8876);
                                                    return lVarM238;
                                                default:
                                                    break;
                                            }
                                        }
                                        z11 = objM4250 instanceof q8.g;
                                        i12 = 51588;
                                        while (true) {
                                            i12 ^= 51605;
                                            switch (i12) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i12 = ((((z11 ? 1 : 0) ^ 65535) & 1) | ((z11 ? 1 : 0) & 65534)) != 0 ? 51681 : 51650;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    break;
                                                case 116:
                                                    C0228.m4382(C0379.m7412(mainViewModelM2071), C0023.m452(m5341(), 98, C0190.f214 ^ (-58), 1290));
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        thM9416 = C0484.m9416(objM4250);
                                        i13 = 51712;
                                        while (true) {
                                            i13 ^= 51729;
                                            switch (i13) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i13 = thM9416 != null ? 51805 : 51774;
                                                    break;
                                                case 47:
                                                    break;
                                                case 76:
                                                    q0 q0VarM7413 = C0379.m7412(mainViewModelM2071);
                                                    strM4049 = C0213.m4049(thM9416);
                                                    i15 = 51836;
                                                    while (true) {
                                                        i15 ^= 51853;
                                                        switch (i15) {
                                                            case 241:
                                                                i15 = strM4049 == null ? 52580 : 52549;
                                                                break;
                                                            case 1963:
                                                                break;
                                                            case 1992:
                                                                break;
                                                            case 2025:
                                                                strM4049 = strM6790;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0228.m4382(q0VarM7413, strM4049);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0228.m4382(C0073.m1601(mainViewModelM2071), C0456.m8876());
                                        i14 = 52611;
                                        while (true) {
                                            i14 ^= 52628;
                                            switch (i14) {
                                                case 23:
                                                    i14 = 52642;
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 54:
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                            return lVarM238;
                                        }
                                    }
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i19 = 1864;
                                    while (true) {
                                        i19 ^= 1881;
                                        switch (i19) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i19 = iM443 == 2 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                throw new IllegalStateException(C0076.m1657(m5341(), 25, C0311.f458 ^ (-148), 1764));
                                            case 47417:
                                                C0330.m6365(obj);
                                                objM4250 = C0362.m7093((q8.h) obj);
                                                int i20 = 48767;
                                                while (true) {
                                                    i20 ^= 48784;
                                                    switch (i20) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 239:
                                                            i20 = 48798;
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
                                    z11 = objM4250 instanceof q8.g;
                                    i12 = 51588;
                                    while (true) {
                                        i12 ^= 51605;
                                        switch (i12) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (((((z11 ? 1 : 0) ^ 65535) & 1) | ((z11 ? 1 : 0) & 65534)) != 0) {
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                C0228.m4382(C0379.m7412(mainViewModelM2071), C0023.m452(m5341(), 98, C0190.f214 ^ (-58), 1290));
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    thM9416 = C0484.m9416(objM4250);
                                    i13 = 51712;
                                    while (true) {
                                        i13 ^= 51729;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (thM9416 != null) {
                                                }
                                                break;
                                            case 47:
                                                break;
                                            case 76:
                                                q0 q0VarM7414 = C0379.m7412(mainViewModelM2071);
                                                strM4049 = C0213.m4049(thM9416);
                                                i15 = 51836;
                                                while (true) {
                                                    i15 ^= 51853;
                                                    switch (i15) {
                                                        case 241:
                                                            if (strM4049 == null) {
                                                            }
                                                            break;
                                                        case 1963:
                                                            break;
                                                        case 1992:
                                                            break;
                                                        case 2025:
                                                            strM4049 = strM6790;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0228.m4382(q0VarM7414, strM4049);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0228.m4382(C0073.m1601(mainViewModelM2071), C0456.m8876());
                                    i14 = 52611;
                                    while (true) {
                                        i14 ^= 52628;
                                        switch (i14) {
                                            case 23:
                                                i14 = 52642;
                                                continue;
                                                continue;
                                                continue;
                                            case 54:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        return lVarM238;
                                    }
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        C0330.m6365(obj);
                        C0228.m4382(C0073.m1601(mainViewModelM2071), C0335.m6483());
                        C0228.m4382(C0379.m7412(mainViewModelM2071), null);
                        a5.j jVarM7459 = C0381.m7458(mainViewModelM2071);
                        String strM4543 = C0237.m4543(this);
                        this.f6273a = 1;
                        objM7205 = C0368.m7205(jVarM7459, strM4543, this);
                        int i21 = 49914;
                        while (true) {
                            i21 ^= 49931;
                            switch (i21) {
                                case 497:
                                    i21 = objM7205 == aVarM5766 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    return aVarM5766;
                                default:
                                    break;
                            }
                        }
                        z10 = objM7205 instanceof q8.g;
                        i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    if (z10) {
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    a5.j jVarM74510 = C0381.m7458(mainViewModelM2071);
                                    String strM4671 = C0244.m4670(this);
                                    this.f6273a = 2;
                                    objM4250 = C0221.m4250(jVarM74510, strM4671, this);
                                    i11 = 50813;
                                    while (true) {
                                        i11 ^= 50830;
                                        switch (i11) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                break;
                                            case 243:
                                                if (objM4250 == aVarM5766) {
                                                }
                                                break;
                                            case 4075:
                                                return aVarM5766;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    q0 q0VarM7415 = C0379.m7412(mainViewModelM2071);
                                    q0 q0VarM1602 = C0073.m1601(mainViewModelM2071);
                                    C0228.m4382(q0VarM7415, C0340.m6661(m5341(), 72, C0072.f104 ^ 107, 629));
                                    Boolean boolM8877 = C0456.m8876();
                                    C0228.m4382(q0VarM1602, boolM8877);
                                    C0228.m4382(q0VarM1602, boolM8877);
                                    return lVarM238;
                                default:
                                    break;
                            }
                        }
                        z11 = objM4250 instanceof q8.g;
                        i12 = 51588;
                        while (true) {
                            i12 ^= 51605;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (((((z11 ? 1 : 0) ^ 65535) & 1) | ((z11 ? 1 : 0) & 65534)) != 0) {
                                    }
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    break;
                                case 116:
                                    C0228.m4382(C0379.m7412(mainViewModelM2071), C0023.m452(m5341(), 98, C0190.f214 ^ (-58), 1290));
                                    break;
                                default:
                                    break;
                            }
                        }
                        thM9416 = C0484.m9416(objM4250);
                        i13 = 51712;
                        while (true) {
                            i13 ^= 51729;
                            switch (i13) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (thM9416 != null) {
                                    }
                                    break;
                                case 47:
                                    break;
                                case 76:
                                    q0 q0VarM7416 = C0379.m7412(mainViewModelM2071);
                                    strM4049 = C0213.m4049(thM9416);
                                    i15 = 51836;
                                    while (true) {
                                        i15 ^= 51853;
                                        switch (i15) {
                                            case 241:
                                                if (strM4049 == null) {
                                                }
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                break;
                                            case 2025:
                                                strM4049 = strM6790;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0228.m4382(q0VarM7416, strM4049);
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0228.m4382(C0073.m1601(mainViewModelM2071), C0456.m8876());
                        i14 = 52611;
                        while (true) {
                            i14 ^= 52628;
                            switch (i14) {
                                case 23:
                                    i14 = 52642;
                                    continue;
                                    continue;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                                    continue;
                                    continue;
                            }
                            return lVarM238;
                        }
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i22 = 49666;
                while (true) {
                    i22 ^= 49683;
                    switch (i22) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i22 = 49697;
                            continue;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            q0 q0VarM7417 = C0379.m7412(mainViewModelM2071);
                            String strM40410 = C0213.m4049(e4);
                            int i23 = 52735;
                            while (true) {
                                i23 ^= 52752;
                                switch (i23) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        break;
                                    case 1007:
                                        i23 = strM40410 == null ? 53479 : 52797;
                                        break;
                                    case 7927:
                                        int i24 = 53510;
                                        while (true) {
                                            i24 ^= 53527;
                                            switch (i24) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i24 = 53541;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    strM40410 = strM6790;
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
                            C0228.m4382(q0VarM7417, strM40410);
                            Boolean boolM8878 = C0456.m8876();
                            q0 q0VarM1603 = C0073.m1601(mainViewModelM2071);
                            break;
                        default:
                            continue;
                    }
                }
            } finally {
                int i25 = 48891;
                while (true) {
                    i25 ^= 48908;
                    switch (i25) {
                        case 22:
                            C0228.m4382(C0073.m1601(mainViewModelM2071), C0456.m8876());
                        case 503:
                            i25 = 48922;
                            break;
                    }
                }
            }
        }
    }
}
