package f5;

import a0.C0003;
import aa.C0012;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import androidx.profileinstaller.C0046;
import c0.C0056;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import e8.C0265;
import f0.C0272;
import fa.C0279;
import h0.C0299;
import j9.C0329;
import m0.C0349;
import m1.C0350;
import m5.C0354;
import o7.i2;
import p5.C0377;
import r5.C0399;
import v.C0439;
import w.C0453;
import x4.C0468;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f408short = {735, 733, 720, 720, 668, 712, 723, 668, 667, 718, 729, 719, 713, 721, 729, 667, 668, 734, 729, 730, 723, 718, 729, 668, 667, 725, 722, 714, 723, 727, 729, 667, 668, 715, 725, 712, 724, 668, 735, 723, 718, 723, 713, 712, 725, 722, 729};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6293f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CouponData f6294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6295o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MainViewModel mainViewModel, String str, String str2, String str3, int i10, CouponData couponData, int i11, u8.e eVar) {
        super(C0056.f76 ^ (-848), eVar);
        this.f6289b = mainViewModel;
        this.f6290c = str;
        this.f6291d = str2;
        this.f6292e = str3;
        this.f6293f = i10;
        this.f6294n = couponData;
        this.f6295o = i11;
        int iM70 = C0003.m70();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM70 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0377.m7397("tEwKSCe")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static short[] m5344() {
        int iM2522 = C0131.m2522();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2522 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f408short;
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
        String str = "\u06e0\u06e7\u06df";
        String strM3564 = null;
        CouponData couponDataM5238 = null;
        MainViewModel mainViewModelM6863 = null;
        String strM6850 = null;
        String strM340 = null;
        int iM6954 = 0;
        int iM895 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746943:
                    iM6954 = C0354.m6954(this);
                    str = "\u06e1\u06df\u06e1";
                    break;
                case 1747773:
                    strM340 = C0017.m340(this);
                    str = "\u06e8\u06e4\u06e4";
                    break;
                case 1748611:
                    this = new l(mainViewModelM6863, strM6850, strM3564, strM340, iM895, couponDataM5238, iM6954, eVar);
                    str = "\u06e2\u06e0\u06e6";
                    break;
                case 1748648:
                    strM6850 = C0349.m6850(this);
                    str = "\u06e5\u06e3\u06e2";
                    break;
                case 1749608:
                    return this;
                case 1752486:
                    couponDataM5238 = C0272.m5238(this);
                    str = "\u06df\u06e7\u06e7";
                    break;
                case 1752580:
                    strM3564 = C0186.m3564(this);
                    str = "\u06e0\u06e3\u06e0";
                    break;
                case 1755496:
                    iM895 = C0046.m895(this);
                    str = "\u06e5\u06e0\u06e1";
                    break;
                default:
                    mainViewModelM6863 = C0350.m6863(this);
                    str = "\u06e1\u06e0\u06e7";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e0\u06e5\u06e8";
        u8.e eVar = null;
        Object objM5072 = obj;
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        u8.e eVarM2750 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56415:
                    eVarM2750 = C0143.m2750(this, d0Var, eVar);
                    str = "\u06e8\u06e8\u06e7";
                    break;
                case 1746848:
                    str = "\u06e3\u06e5\u06e1";
                    lVarM238 = C0012.m238();
                    break;
                case 1747843:
                    str = "\u06e2\u06df\u06e7";
                    d0Var = (m9.d0) objM5072;
                    break;
                case 1750719:
                    objM5072 = C0265.m5072(this, lVarM238);
                    str = "\u06e3\u06e8\u06e6";
                    break;
                case 1750817:
                    return objM5072;
                case 1755623:
                    str = "\u06df\u06e4\u06e5";
                    this = (l) eVarM2750;
                    break;
                default:
                    str = "\u06e3\u06e2";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00e0 A[SYNTHETIC] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        String strM8581;
        int i10;
        v8.a aVarM5766 = C0299.m5766();
        int iM5410 = C0279.m5410(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = iM5410 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = iM5410 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0191.m3642(m5344(), 0, C0184.f208 ^ (-755), 700));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                C0014.m280((q8.h) obj);
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
                    a5.z zVarM7827 = C0399.m7827(C0350.m6863(this));
                    String strM6850 = C0349.m6850(this);
                    String strM3564 = C0186.m3564(this);
                    String strM340 = C0017.m340(this);
                    int iM895 = C0046.m895(this);
                    CouponData couponDataM5238 = C0272.m5238(this);
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                strM8581 = C0439.m8581();
                                i10 = 49914;
                                while (true) {
                                    i10 ^= 49931;
                                    switch (i10) {
                                        case 497:
                                            i10 = 50596;
                                            continue;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case 76:
                                strM8581 = C0453.m8841(couponDataM5238);
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i15 = strM8581 == null ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            int i16 = 49666;
                                            while (true) {
                                                i16 ^= 49683;
                                                switch (i16) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i16 = 49697;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        strM8581 = C0439.m8581();
                                                        i10 = 49914;
                                                        while (true) {
                                                            i10 ^= 49931;
                                                            switch (i10) {
                                                                case 497:
                                                                    i10 = 50596;
                                                                    continue;
                                                                    continue;
                                                                case 1711:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
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
                                i14 = couponDataM5238 != null ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                        int i17 = 49790;
                        while (true) {
                            i17 ^= 49807;
                            switch (i17) {
                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    int iM6954 = C0354.m6954(this);
                                    this.f6288a = 1;
                                    Object objM9126 = C0468.m9126(zVarM7827, strM6850, strM3564, strM340, iM895, strM8581, iM6954, this);
                                    int i18 = 50689;
                                    while (true) {
                                        i18 ^= 50706;
                                        switch (i18) {
                                            case 19:
                                                i18 = objM9126 == aVarM5766 ? 50782 : 50751;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                return aVarM5766;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 241:
                                    i17 = 49821;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return C0012.m238();
    }
}
