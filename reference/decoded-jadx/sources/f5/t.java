package f5;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.appcompat.widget.C0020;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.measurement.C0182;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d8.C0221;
import d9.C0225;
import dagger.hilt.android.components.C0227;
import f4.C0274;
import f4.C0275;
import f6.C0277;
import g0.C0285;
import h0.C0299;
import i5.C0318;
import j5.C0327;
import j9.C0329;
import l3.C0342;
import m7.C0357;
import o7.i2;
import p3.C0375;
import p8.C0380;
import r1.C0393;
import r5.C0399;
import r5.C0400;
import s6.C0413;
import v.C0439;
import w1.C0455;
import y.C0474;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class t extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f415short = {1586, 1584, 1597, 1597, 1649, 1573, 1598, 1649, 1654, 1571, 1588, 1570, 1572, 1596, 1588, 1654, 1649, 1587, 1588, 1591, 1598, 1571, 1588, 1649, 1654, 1592, 1599, 1575, 1598, 1594, 1588, 1654, 1649, 1574, 1592, 1573, 1593, 1649, 1586, 1598, 1571, 1598, 1572, 1573, 1592, 1599, 1588, 2270, 2242, 2255, 1858, 1892, 1906, 1893, 2161, 2131, 2116, 2137, 2118, 2133};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MainViewModel mainViewModel, String str, boolean z10, u8.e eVar) {
        super(C0274.f390 ^ SQLitePersistence.MAX_ARGS, eVar);
        this.f6326b = mainViewModel;
        this.f6327c = str;
        this.f6328d = z10;
        int iM9246 = C0474.m9246();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9246 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0182.m3478("S0a9j1CUJNmI8JZ2BCAQb")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۡۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5351() {
        int iM6163 = C0318.m6163();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6163 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f415short;
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
        boolean zM1787 = false;
        String str = "\u06df\u06e7\u06e5";
        String strM8111 = null;
        MainViewModel mainViewModelM4272 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746941:
                    strM8111 = C0413.m8111(this);
                    str = "\u06e2\u06e1\u06e8";
                    break;
                case 1748609:
                    str = "\u06e6\u06df\u06e5";
                    mainViewModelM4272 = C0221.m4272(this);
                    break;
                case 1752677:
                    return this;
                case 1753420:
                    this = new t(mainViewModelM4272, strM8111, zM1787, eVar);
                    str = "\u06e5\u06e6\u06e6";
                    break;
                default:
                    str = "\u06e1\u06df\u06df";
                    zM1787 = C0083.m1787(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e0\u06e8\u06e3";
        u8.e eVarM3532 = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        Object objM7002 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56514:
                    str = "\u06e0\u06e5\u06e4";
                    lVarM238 = C0012.m238();
                    break;
                case 1747839:
                    objM7002 = C0357.m7002(this, lVarM238);
                    str = "\u06e6\u06e1\u06e0";
                    break;
                case 1752579:
                    str = "\u06e6\u06e3\u06e5";
                    eVar = (u8.e) obj2;
                    break;
                case 1753477:
                    return objM7002;
                case 1753544:
                    eVarM3532 = C0185.m3532(this, d0Var, eVar);
                    str = "\u06e8\u06e0\u06e6";
                    break;
                case 1755374:
                    str = "\u06e6\u06e8";
                    this = (t) eVarM3532;
                    break;
                default:
                    str = "\u06e5\u06e3\u06e1";
                    d0Var = (m9.d0) objM7002;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x012b A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00f8. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        String strM8581;
        int i10;
        v8.a aVarM5766 = C0299.m5766();
        int iM3775 = C0197.m3775(this);
        q8.l lVarM238 = C0012.m238();
        MainViewModel mainViewModelM4272 = C0221.m4272(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            try {
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = iM3775 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i12 = 1740;
                        while (true) {
                            i12 ^= 1757;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = iM3775 == 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    throw new IllegalStateException(C0151.m2908(m5351(), 0, C0076.f110 ^ 744, 1617));
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    C0329.m6365(obj);
                                    int i13 = 1864;
                                    while (true) {
                                        i13 ^= 1881;
                                        switch (i13) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i13 = 48674;
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
                        break;
                    case 239:
                        C0329.m6365(obj);
                        a5.z zVarM7827 = C0399.m7827(mainViewModelM4272);
                        String strM8111 = C0413.m8111(this);
                        C0014.m280(zVarM7827);
                        C0375.m7360(strM8111, C0158.m3014(m5351(), 47, C0285.f430 ^ (-869), 2219));
                        p9.c cVarM7000 = C0357.m7000(new a5.s(zVarM7827, strM8111, null));
                        s sVar = new s(mainViewModelM4272, C0083.m1787(this));
                        this.f6325a = 1;
                        Object objM1992 = C0102.m1992(cVarM7000, sVar, this);
                        int i14 = 48767;
                        while (true) {
                            i14 ^= 48784;
                            switch (i14) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 76:
                                    return aVarM5766;
                                case 239:
                                    i14 = objM1992 == aVarM5766 ? 48860 : 48829;
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
                boolean zM5293 = C0275.m5293(C0380.m7458(mainViewModelM4272));
                int i15 = 48891;
                while (true) {
                    i15 ^= 48908;
                    switch (i15) {
                        case 22:
                            break;
                        case 53:
                            FirebaseUser firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModelM4272)));
                            int i16 = 49666;
                            while (true) {
                                i16 ^= 49683;
                                switch (i16) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i16 = firebaseUserM5359 != null ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        strM8581 = C0400.m7836(firebaseUserM5359);
                                        int i17 = 49790;
                                        while (true) {
                                            i17 ^= 49807;
                                            switch (i17) {
                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    break;
                                                case 84:
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
                                                        strM8581 = C0439.m8581();
                                                        i10 = 50813;
                                                        while (true) {
                                                            i10 ^= 50830;
                                                            switch (i10) {
                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 243:
                                                                    i10 = 50844;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 241:
                                                    i17 = strM8581 == null ? 49883 : 49852;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 83:
                                        strM8581 = C0439.m8581();
                                        i10 = 50813;
                                        while (true) {
                                            i10 ^= 50830;
                                            switch (i10) {
                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 243:
                                                    i10 = 50844;
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                int i19 = 50689;
                                while (true) {
                                    i19 ^= 50706;
                                    switch (i19) {
                                        case 19:
                                            i19 = 50720;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            C0227.m4382(C0225.m4345(mainViewModelM4272), new e(new UserProfile(C0342.m6715(m5351(), 50, C0393.f664 ^ 273, 1815), strM8581, C0488.m9522(m5351(), 54, C0327.f475 ^ (-813), 2096), true, true, false, C0439.m8581(), null, 0L, false, null, C0158.f182 ^ 1570, null)));
                                            C0227.m4382(C0073.m1601(mainViewModelM4272), C0455.m8876());
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            }
                            break;
                        case 503:
                            i15 = !zM5293 ? 49635 : 48953;
                            break;
                        case 32495:
                            return lVarM238;
                        default:
                            break;
                    }
                }
            }
        }
        return lVarM238;
    }
}
