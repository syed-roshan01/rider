package f5;

import a2.C0005;
import aa.C0012;
import android.app.Application;
import android.content.Intent;
import androidx.startup.C0047;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.service.KeepAliveService;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import d1.C0212;
import d9.C0222;
import d9.C0226;
import dagger.hilt.android.components.C0227;
import dagger.hilt.codegen.C0241;
import e7.C0264;
import f6.C0278;
import g2.C0287;
import g7.C0292;
import h0.C0299;
import h5.C0306;
import h5.C0307;
import h8.C0313;
import j4.C0326;
import j9.C0329;
import k3.C0334;
import n.C0361;
import o7.i2;
import p8.C0379;
import q7.C0389;
import r5.C0399;
import r6.C0401;
import rikka.shizuku.C0406;
import v.C0439;
import w2.C0458;
import w9.C0465;
import x5.C0470;
import x7.C0471;
import y.C0474;
import z0.C0482;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class y extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f420short = {3134, 3097, 3089, 3092, 3101, 3100, 3160, 3084, 3095, 3160, 3086, 3101, 3082, 3089, 3102, 3073, 3160, 3097, 3099, 3099, 3095, 3085, 3094, 3084, 3158, 3160, 3116, 3082, 3073, 3160, 3097, 3103, 3097, 3089, 3094, 3158, 1342, 1340, 1329, 1329, 1405, 1321, 1330, 1405, 1402, 1327, 1336, 1326, 1320, 1328, 1336, 1402, 1405, 1343, 1336, 1339, 1330, 1327, 1336, 1405, 1402, 1332, 1331, 1323, 1330, 1334, 1336, 1402, 1405, 1322, 1332, 1321, 1333, 1405, 1342, 1330, 1327, 1330, 1320, 1321, 1332, 1331, 1336, 3082, 3100, 3083, 3087, 3088, 3098, 3100, 3110, 3100, 3095, 3096, 3099, 3093, 3100, 3101, 1166, 1167, 1172, 1216, 1158, 1167, 1173, 1166, 1156};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(MainViewModel mainViewModel, String str, u8.e eVar) {
        super(C0307.f455 ^ 174, eVar);
        this.f6341b = mainViewModel;
        this.f6342c = str;
        int iM9190 = C0471.m9190();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9190 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0306.m5913("DFZGK")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5356() {
        int iM7627 = C0389.m7627();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7627 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f420short;
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
        String str = "\u06e3\u06e7\u06e6";
        MainViewModel mainViewModelM5056 = null;
        String strM98 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750786:
                    mainViewModelM5056 = C0264.m5056(this);
                    str = "\u06e8\u06e5\u06e5";
                    break;
                case 1754477:
                    this = new y(mainViewModelM5056, strM98, eVar);
                    str = "\u06e7\u06e8\u06e2";
                    break;
                case 1754657:
                    return this;
                default:
                    str = "\u06e7\u06e2\u06e8";
                    strM98 = C0005.m98(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e6\u06e5\u06e8";
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        Object objM9238 = obj;
        u8.e eVarM2160 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751593:
                    str = "\u06e8\u06e8\u06e4";
                    lVarM238 = C0012.m238();
                    break;
                case 1751683:
                    str = "\u06e4\u06e2\u06e7";
                    this = (y) eVarM2160;
                    break;
                case 1753540:
                    str = "\u06e8\u06e5\u06e5";
                    eVar = (u8.e) obj2;
                    break;
                case 1753609:
                    str = "\u06e6\u06e3\u06e1";
                    d0Var = (m9.d0) objM9238;
                    break;
                case 1755528:
                    eVarM2160 = C0112.m2160(this, d0Var, eVar);
                    str = "\u06e4\u06e5\u06e4";
                    break;
                case 1755620:
                    objM9238 = C0474.m9238(this, lVarM238);
                    str = "\u06e2\u06e7\u06df";
                    break;
                default:
                    return objM9238;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:271:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM7969;
        int i10;
        v8.a aVarM5766 = C0299.m5766();
        int iM4623 = C0241.m4623(this);
        String strM6307 = C0326.m6307(m5356(), 0, C0470.f741 ^ 145, 3192);
        MainViewModel mainViewModelM5056 = C0264.m5056(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            try {
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = iM4623 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i12 = 1740;
                        while (true) {
                            i12 ^= 1757;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = iM4623 == 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    throw new IllegalStateException(C0130.m2502(m5356(), 36, C0465.f736 ^ 249, 1373));
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    C0329.m6365(obj);
                                    objM7969 = C0361.m7093((q8.h) obj);
                                    int i13 = 1864;
                                    while (true) {
                                        i13 ^= 1881;
                                        switch (i13) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                        a5.z zVarM7827 = C0399.m7827(mainViewModelM5056);
                        String strM98 = C0005.m98(this);
                        this.f6340a = 1;
                        objM7969 = C0406.m7969(zVarM7827, strM98, true, this);
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
                                    i14 = objM7969 == aVarM5766 ? 48860 : 48829;
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
                C0227.m4382(C0379.m7430(mainViewModelM5056), strM6307);
            }
        }
        boolean z10 = objM7969 instanceof q8.g;
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i15 = ((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    UserProfile userProfile = (UserProfile) objM7969;
                    boolean zM4287 = C0222.m4287(userProfile);
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = !zM4287 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM1971 = C0101.m1971(userProfile);
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            long jM8921 = C0458.m8921(userProfile);
                                            int i18 = 50689;
                                            while (true) {
                                                i18 ^= 50706;
                                                switch (i18) {
                                                    case 19:
                                                        i18 = jM8921 > 0 ? 50782 : 50751;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        C0227.m4376(C0482.m9390(C0167.m3199(C0202.m3874(C0278.m5385(mainViewModelM5056))), C0226.m4371(m5356(), 83, C0313.f461 ^ 567, 3193), true));
                                                        try {
                                                            Application applicationM5540 = C0287.m5540(mainViewModelM5056);
                                                            C0292.m5629(applicationM5540, new Intent(applicationM5540, (Class<?>) KeepAliveService.class));
                                                            i10 = 51712;
                                                            while (true) {
                                                                i10 ^= 51729;
                                                                switch (i10) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 15:
                                                                    case Code.UNAUTHENTICATED /* 16 */:
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i10 = 51743;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                        } catch (Exception e10) {
                                                            int i19 = 53758;
                                                            while (true) {
                                                                i19 ^= 53775;
                                                                switch (i19) {
                                                                    case 1009:
                                                                        i19 = 54440;
                                                                        continue;
                                                                    case 1703:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        long jM8922 = C0458.m8921(userProfile);
                                                        long jM7869 = C0401.m7869();
                                                        int i20 = 50813;
                                                        while (true) {
                                                            i20 ^= 50830;
                                                            switch (i20) {
                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    C0227.m4376(C0482.m9390(C0167.m3199(C0202.m3874(C0278.m5385(mainViewModelM5056))), C0226.m4371(m5356(), 83, C0313.f461 ^ 567, 3193), true));
                                                                    Application applicationM5541 = C0287.m5540(mainViewModelM5056);
                                                                    C0292.m5629(applicationM5541, new Intent(applicationM5541, (Class<?>) KeepAliveService.class));
                                                                    i10 = 51712;
                                                                    while (true) {
                                                                        i10 ^= 51729;
                                                                        switch (i10) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 15:
                                                                            case Code.UNAUTHENTICATED /* 16 */:
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i10 = 51743;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 243:
                                                                    i20 = jM8922 <= jM7869 ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    C0226.m4367(mainViewModelM5056);
                                                                    int i21 = 51588;
                                                                    while (true) {
                                                                        i21 ^= 51605;
                                                                        switch (i21) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i21 = 51619;
                                                                                continue;
                                                                            case 54:
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
                                        case 84:
                                            int i22 = 49914;
                                            while (true) {
                                                i22 ^= 49931;
                                                switch (i22) {
                                                    case 497:
                                                        i22 = 50596;
                                                        continue;
                                                    case 1711:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                C0227.m4382(C0162.m3094(mainViewModelM5056), C0334.m6483());
                                                C0226.m4367(mainViewModelM5056);
                                                break;
                                            }
                                            break;
                                        case 241:
                                            i17 = !zM1971 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                C0227.m4382(C0162.m3094(mainViewModelM5056), C0334.m6483());
                                C0226.m4367(mainViewModelM5056);
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
        Throwable thM9416 = C0483.m9416(objM7969);
        int i23 = 51836;
        while (true) {
            i23 ^= 51853;
            switch (i23) {
                case 241:
                    if (thM9416 != null) {
                        i23 = 52580;
                    }
                    break;
                case 1963:
                    break;
                case 1992:
                    break;
                case 2025:
                    String strM4049 = C0212.m4049(thM9416);
                    int i24 = 52611;
                    while (true) {
                        i24 ^= 52628;
                        switch (i24) {
                            case 23:
                                i24 = strM4049 == null ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 116:
                                strM4049 = C0439.m8581();
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM2645 = C0137.m2645(strM4049, C0047.m914(m5356(), 98, C0087.f121 ^ 597, 1248), true);
                    int i25 = 52735;
                    while (true) {
                        i25 ^= 52752;
                        switch (i25) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0227.m4382(C0379.m7430(mainViewModelM5056), strM6307);
                                int i26 = 53634;
                                while (true) {
                                    i26 ^= 53651;
                                    switch (i26) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i26 = 53665;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                    }
                                }
                                break;
                            case 1007:
                                if (zM2645) {
                                    i25 = 53479;
                                }
                                break;
                            case 7927:
                                C0227.m4382(C0162.m3094(mainViewModelM5056), C0334.m6483());
                                C0226.m4367(mainViewModelM5056);
                                int i27 = 53510;
                                while (true) {
                                    i27 ^= 53527;
                                    switch (i27) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i27 = 53541;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i25 = 52797;
                    }
                    break;
                default:
                    continue;
            }
            i23 = 52549;
        }
        return C0012.m238();
    }
}
