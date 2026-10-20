package f5;

import a7.C0008;
import aa.C0012;
import c7.C0068;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.aggregatedroot.C0246;
import g5.C0291;
import h0.C0299;
import h6.C0309;
import j5.C0327;
import j9.C0329;
import k3.C0334;
import m7.C0357;
import n.C0361;
import o7.i2;
import r9.C0405;
import w1.C0455;
import z1.C0483;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f401short = {595, 593, 604, 604, 528, 580, 607, 528, 535, 578, 597, 579, 581, 605, 597, 535, 528, 594, 597, 598, 607, 578, 597, 528, 535, 601, 606, 582, 607, 603, 597, 535, 528, 583, 601, 580, 600, 528, 595, 607, 578, 607, 581, 580, 601, 606, 597};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(MainViewModel mainViewModel, String str, String str2, String str3, u8.e eVar) {
        super(C0083.f117 ^ (-779), eVar);
        this.f6250b = mainViewModel;
        this.f6251c = str;
        this.f6252d = str2;
        this.f6253e = str3;
        int iM2289 = C0119.m2289();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2289 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0106.m2063("okKrph9C6y9lWjIckm")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5337() {
        int iM169 = C0008.m169();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM169 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f401short;
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
        String str = "\u06e7\u06e3\u06e5";
        String strM7005 = null;
        MainViewModel mainViewModelM6327 = null;
        String strM3334 = null;
        String strM1330 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748711:
                    strM1330 = C0068.m1330(this);
                    str = "\u06e8\u06e3\u06e7";
                    break;
                case 1753636:
                    str = "\u06e6\u06e3\u06e7";
                    this = new e0(mainViewModelM6327, strM7005, strM1330, strM3334, eVar);
                    break;
                case 1754383:
                    strM7005 = C0357.m7005(this);
                    str = "\u06e1\u06e2\u06e8";
                    break;
                case 1754505:
                    mainViewModelM6327 = C0327.m6327(this);
                    str = "\u06e7\u06df\u06e7";
                    break;
                case 1755468:
                    strM3334 = C0175.m3334(this);
                    str = "\u06e6\u06e6\u06e4";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e6\u06e6\u06e4";
        Object objM5986 = obj;
        u8.e eVarM4405 = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747653:
                    objM5986 = C0309.m5986(this, lVarM238);
                    str = "\u06e7\u06e5\u06e0";
                    break;
                case 1750750:
                    str = "\u06e0\u06df\u06e4";
                    lVarM238 = C0012.m238();
                    break;
                case 1751715:
                    eVarM4405 = C0228.m4405(this, d0Var, eVar);
                    str = "\u06e3\u06e0\u06e6";
                    break;
                case 1753511:
                    str = "\u06e4\u06e6\u06e5";
                    eVar = (u8.e) obj2;
                    break;
                case 1753636:
                    str = "\u06e6\u06e2\u06e3";
                    d0Var = (m9.d0) objM5986;
                    break;
                case 1754562:
                    return objM5986;
                default:
                    str = "\u06e3\u06e6\u06e1";
                    this = (e0) eVarM4405;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM5993;
        boolean z10 = false;
        v8.a aVarM5766 = C0299.m5766();
        int iM3423 = C0179.m3423(this);
        MainViewModel mainViewModelM6327 = C0327.m6327(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM3423 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM3423 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0291.m5607(m5337(), 0, C0486.f760 ^ 203, 560));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                objM5993 = C0361.m7093((q8.h) obj);
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
                    C0329.m6365(obj);
                    C0227.m4382(C0123.m2368(mainViewModelM6327), C0334.m6483());
                    C0227.m4382(C0405.m7966(mainViewModelM6327), null);
                    long jM3863 = C0201.m3863((Number) C0246.m4716(C0200.m3835(mainViewModelM6327)));
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            z10 = true;
                                            break;
                                        case 503:
                                            i14 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                i13 = jM3863 == 0 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    a4.q qVarM3089 = C0161.m3089(mainViewModelM6327);
                    String strM7005 = C0357.m7005(this);
                    String strM1330 = C0068.m1330(this);
                    String strM3334 = C0175.m3334(this);
                    this.f6249a = 1;
                    objM5993 = C0309.m5993(qVarM3089, strM7005, strM1330, strM3334, z10, this);
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = objM5993 == aVarM5766 ? 49759 : 49728;
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
        }
        boolean z11 = objM5993 instanceof q8.g;
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    break;
                case 84:
                    C0227.m4382(C0191.m3645(mainViewModelM6327), (CouponData) objM5993);
                    C0227.m4382(C0405.m7966(mainViewModelM6327), null);
                    break;
                case 241:
                    i16 = ((((z11 ? 1 : 0) ^ '\uffff') & 1) | ((z11 ? 1 : 0) & '\ufffe')) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        Throwable thM9416 = C0483.m9416(objM5993);
        int i17 = 49914;
        while (true) {
            i17 ^= 49931;
            switch (i17) {
                case 497:
                    i17 = thM9416 != null ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    C0227.m4382(C0191.m3645(mainViewModelM6327), null);
                    C0227.m4382(C0405.m7966(mainViewModelM6327), C0212.m4049(thM9416));
                    break;
                default:
                    break;
            }
        }
        C0227.m4382(C0123.m2368(mainViewModelM6327), C0455.m8876());
        return C0012.m238();
    }
}
