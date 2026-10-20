package f5;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.profileinstaller.C0046;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.aggregatedroot.C0247;
import e1.C0258;
import h0.C0300;
import h4.C0305;
import j9.C0330;
import k3.C0335;
import k8.C0339;
import n.C0362;
import o5.C0371;
import o7.i2;
import p8.C0380;
import p8.C0381;
import p9.q0;
import q6.C0389;
import r.C0393;
import s.C0408;
import t2.C0422;
import w1.C0456;
import z1.C0484;

/* JADX INFO: loaded from: classes.dex */
public final class w extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f418short = {2770, 2805, 2813, 2808, 2801, 2800, 2740, 2784, 2811, 2740, 2791, 2801, 2810, 2800, 2740, 2790, 2801, 2791, 2801, 2784, 2740, 2801, 2809, 2805, 2813, 2808, 1362, 1360, 1373, 1373, 1297, 1349, 1374, 1297, 1302, 1347, 1364, 1346, 1348, 1372, 1364, 1302, 1297, 1363, 1364, 1367, 1374, 1347, 1364, 1297, 1302, 1368, 1375, 1351, 1374, 1370, 1364, 1302, 1297, 1350, 1368, 1349, 1369, 1297, 1362, 1374, 1347, 1374, 1348, 1349, 1368, 1375, 1364, 2830, 2879, 2861, 2861, 2857, 2865, 2860, 2874, 2942, 2860, 2875, 2861, 2875, 2858, 2942, 2875, 2867, 2879, 2871, 2866, 2942, 2861, 2875, 2864, 2858, 2943};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(MainViewModel mainViewModel, String str, u8.e eVar) {
        super(C0144.f170 ^ (-143), eVar);
        this.f6336b = mainViewModel;
        this.f6337c = str;
        int iM8278 = C0422.m8278();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8278 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0201.m3866("qsJmTgWzs9E6guvRHYnuaZ9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5354() {
        int iM7675 = C0393.m7675();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7675 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f418short;
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
        String str = "ۤۦ۟";
        MainViewModel mainViewModelM286 = null;
        String strM2570 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751709:
                    mainViewModelM286 = C0014.m286(this);
                    str = "ۦۧۡ";
                    break;
                case 1751715:
                    return this;
                case 1753664:
                    str = "ۣ۠ۦ";
                    strM2570 = C0133.m2570(this);
                    break;
                default:
                    this = new w(mainViewModelM286, strM2570, eVar);
                    str = "ۤۦۥ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۨۡۨ";
        Object objM4725 = obj;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        u8.e eVarM6646 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746693:
                    str = "ۥۨۤ";
                    lVarM238 = C0012.m238();
                    break;
                case 1748862:
                    return objM4725;
                case 1749734:
                    str = "ۨۢۨ";
                    eVar = (u8.e) obj2;
                    break;
                case 1752737:
                    objM4725 = C0247.m4725(this, lVarM238);
                    str = "ۡۧۤ";
                    break;
                case 1755407:
                    str = "ۢۤۨ";
                    d0Var = (m9.d0) objM4725;
                    break;
                case 1755438:
                    eVarM6646 = C0339.m6646(this, d0Var, eVar);
                    str = "ۨۥۦ";
                    break;
                default:
                    str = "۟۟ۥ";
                    this = (w) eVarM6646;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM7994;
        v8.a aVarM5766 = C0300.m5766();
        int iM5875 = C0305.m5875(this);
        String strM7456 = C0381.m7456(m5354(), 0, C0371.f641 ^ 768, 2708);
        MainViewModel mainViewModelM286 = C0014.m286(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            try {
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = iM5875 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = iM5875 == 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    throw new IllegalStateException(C0213.m4053(m5354(), 26, C0046.f66 ^ (-787), 1329));
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    C0330.m6365(obj);
                                    objM7994 = C0362.m7093((q8.h) obj);
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = 48674;
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
                        C0330.m6365(obj);
                        C0228.m4382(C0073.m1601(mainViewModelM286), C0335.m6483());
                        a5.j jVarM7458 = C0381.m7458(mainViewModelM286);
                        String strM2570 = C0133.m2570(this);
                        this.f6335a = 1;
                        objM7994 = C0408.m7994(jVarM7458, strM2570, this);
                        int i13 = 49666;
                        while (true) {
                            i13 ^= 49683;
                            switch (i13) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i13 = objM7994 == aVarM5766 ? 49759 : 49728;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    return aVarM5766;
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
            } catch (Exception e4) {
                int i14 = 48891;
                while (true) {
                    i14 ^= 48908;
                    switch (i14) {
                        case 22:
                            q0 q0VarM7430 = C0380.m7430(mainViewModelM286);
                            String strM4049 = C0213.m4049(e4);
                            int i15 = 51588;
                            while (true) {
                                i15 ^= 51605;
                                switch (i15) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = strM4049 == null ? 51681 : 51650;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        break;
                                    case 116:
                                        int i16 = 51712;
                                        while (true) {
                                            i16 ^= 51729;
                                            switch (i16) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    strM4049 = strM7456;
                                                    break;
                                                case 15:
                                                case Code.UNAUTHENTICATED /* 16 */:
                                                default:
                                                    break;
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i16 = 51743;
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0228.m4382(q0VarM7430, strM4049);
                            Boolean boolM8876 = C0456.m8876();
                            q0 q0VarM1601 = C0073.m1601(mainViewModelM286);
                            break;
                        case 503:
                            i14 = 48922;
                            break;
                    }
                }
            } finally {
                int i17 = 48767;
                while (true) {
                    i17 ^= 48784;
                    switch (i17) {
                        case Code.UNAVAILABLE /* 14 */:
                            C0228.m4382(C0073.m1601(mainViewModelM286), C0456.m8876());
                        case 239:
                            i17 = 48798;
                            break;
                    }
                }
            }
        }
        boolean z10 = objM7994 instanceof q8.g;
        int i18 = 49790;
        while (true) {
            i18 ^= 49807;
            switch (i18) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    break;
                case 84:
                    C0228.m4382(C0380.m7430(mainViewModelM286), C0258.m4914(m5354(), 73, C0389.f659 ^ 522, 2910));
                    break;
                case 241:
                    i18 = ((((z10 ? 1 : 0) ^ 65535) & 1) | ((z10 ? 1 : 0) & 65534)) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        Throwable thM9416 = C0484.m9416(objM7994);
        int i19 = 49914;
        while (true) {
            i19 ^= 49931;
            switch (i19) {
                case 497:
                    i19 = thM9416 != null ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    q0 q0VarM7431 = C0380.m7430(mainViewModelM286);
                    String strM40410 = C0213.m4049(thM9416);
                    int i20 = 50689;
                    while (true) {
                        i20 ^= 50706;
                        switch (i20) {
                            case 19:
                                i20 = strM40410 == null ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                strM40410 = strM7456;
                                break;
                            default:
                                break;
                        }
                    }
                    C0228.m4382(q0VarM7431, strM40410);
                    break;
                default:
                    break;
            }
        }
        C0228.m4382(C0073.m1601(mainViewModelM286), C0456.m8876());
        int i21 = 50813;
        while (true) {
            i21 ^= 50830;
            switch (i21) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    return C0012.m238();
                case 243:
                    i21 = 50844;
                    break;
            }
        }
    }
}
