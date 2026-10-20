package d5;

import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.annotation.C0019;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.graphics.C0030;
import androidx.preference.C0044;
import b.C0049;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.messaging.C0191;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d2.C0215;
import d9.C0224;
import d9.C0226;
import dagger.hilt.internal.C0252;
import dagger.hilt.internal.aggregatedroot.C0246;
import e2.C0262;
import e2.C0263;
import h0.C0299;
import h1.C0300;
import j9.C0329;
import java.util.ArrayList;
import m4.C0353;
import m7.C0357;
import n8.C0365;
import o8.C0371;
import p3.C0375;
import p8.C0380;
import q1.C0383;
import s7.C0415;
import t0.C0418;
import t2.C0422;
import t8.C0426;
import u3.C0434;
import v.C0439;
import w1.C0455;
import w9.C0465;
import x0.C0466;
import x7.C0471;
import x8.C0473;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f297short = {2425, 2410, 2405, 2415, 2404, 2406, 2370, 2369, 2368, 2375, 2374, 2373, 2372, 2379, 2378, 2377, 2376, 2383, 2382, 2381, 2380, 2387, 2386, 2385, 2384, 2391, 2390, 2389, 2388, 2395, 2394, 2393, 2402, 2401, 2400, 2407, 2406, 2405, 2404, 2411, 2410, 2409, 2408, 2415, 2414, 2413, 2412, 2419, 2418, 2417, 2416, 2423, 2422, 2421, 2420, 2427, 2426, 2425, 2355, 2354, 2353, 2352, 2359, 2358, 2357, 2356, 2363, 2362, 2200, 2180, 2185, 2182, 2236, 2193, 2200, 2189};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.g1 f4878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(MainViewModel mainViewModel, String str, int i10, m0.g1 g1Var, m0.g1 g1Var2, u8.e eVar) {
        super(C0434.f705 ^ 444, eVar);
        this.f4874a = mainViewModel;
        this.f4875b = str;
        this.f4876c = i10;
        this.f4877d = g1Var;
        this.f4878e = g1Var2;
        int iM8221 = C0418.m8221();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8221 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0471.m9181("sooz1tpUL0liOOA8hV9KJxF6D2")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m4210() {
        int iM2751 = C0143.m2751();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2751 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f297short;
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
        int iM313 = 0;
        String str = "\u06e4\u06e0\u06e4";
        MainViewModel mainViewModelM3749 = null;
        m0.g1 g1VarM8291 = null;
        m0.g1 g1VarM1865 = null;
        String strM2140 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747653:
                    str = "\u06e8\u06e1\u06e6";
                    this = new z1(mainViewModelM3749, strM2140, iM313, g1VarM8291, g1VarM1865, eVar);
                    break;
                case 1748734:
                    g1VarM1865 = C0087.m1865(this);
                    str = "\u06e0\u06df\u06e4";
                    break;
                case 1750532:
                    strM2140 = C0111.m2140(this);
                    str = "\u06e7\u06df\u06e3";
                    break;
                case 1751528:
                    mainViewModelM3749 = C0196.m3749(this);
                    str = "\u06e3\u06df\u06e0";
                    break;
                case 1754382:
                    g1VarM8291 = C0422.m8291(this);
                    str = "\u06e1\u06e3\u06e0";
                    break;
                case 1755405:
                    return this;
                default:
                    iM313 = C0016.m313(this);
                    str = "\u06e7\u06df\u06e6";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06df\u06e7\u06e3";
        Object objM8168 = obj;
        u8.e eVarM5022 = null;
        u8.e eVar = null;
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746723:
                    objM8168 = C0415.m8168(this, lVarM238);
                    str = "\u06e4\u06e2\u06e0";
                    break;
                case 1746755:
                    eVarM5022 = C0263.m5022(this, d0Var, eVar);
                    str = "\u06e3\u06e6\u06e5";
                    break;
                case 1746939:
                    str = "\u06e5\u06e7\u06e0";
                    d0Var = (m9.d0) objM8168;
                    break;
                case 1750754:
                    str = "\u06e3\u06e3";
                    this = (z1) eVarM5022;
                    break;
                case 1751586:
                    return lVarM238;
                case 1752702:
                    str = "\u06df\u06e1\u06e5";
                    eVar = (u8.e) obj2;
                    break;
                default:
                    str = "\u06df\u06e0\u06e4";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0026. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        C0299.m5766();
        C0329.m6365(obj);
        i9.g gVar = new i9.g(1, C0262.f342 ^ 177, 1);
        ArrayList arrayList = new ArrayList(C0024.m479(gVar));
        i9.f fVarM4830 = C0252.m4830(gVar);
        while (true) {
            boolean zM4101 = C0215.m4101(fVarM4830);
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = zM4101 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                String strM9067 = C0465.m9067(arrayList, C0439.m8581(), null, null, null, C0078.f112 ^ (-100));
                C0224.m4315(C0422.m8291(this), strM9067);
                int iM313 = C0016.m313(this);
                MainViewModel mainViewModelM3749 = C0196.m3749(this);
                C0014.m280(mainViewModelM3749);
                String strM2211 = C0114.m2211(m4210(), 68, C0129.f155 ^ 760, 2280);
                String strM2140 = C0111.m2140(this);
                C0375.m7360(strM2140, strM2211);
                String strM5791 = C0300.m5791(C0380.m7458(mainViewModelM3749));
                int i12 = 1864;
                while (true) {
                    i12 ^= 1881;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (strM5791 == null) {
                                i12 = 48736;
                            }
                            break;
                        case 47384:
                            CouponData couponData = (CouponData) C0246.m4716(C0191.m3645(mainViewModelM3749));
                            int iM9382 = C0481.m9382(mainViewModelM3749, strM2140);
                            int i13 = 48891;
                            while (true) {
                                i13 ^= 48908;
                                switch (i13) {
                                    case 22:
                                        break;
                                    case 53:
                                        i10 = 0;
                                        break;
                                    case 503:
                                        if (couponData != null) {
                                            i13 = 49635;
                                        }
                                        break;
                                    case 32495:
                                        i10 = ((iM9382 + 15) - iM313) - 15;
                                        int i14 = 49666;
                                        while (true) {
                                            i14 ^= 49683;
                                            switch (i14) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i14 = 49697;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i13 = 48953;
                            }
                            C0383.m7508(C0113.m2178(mainViewModelM3749), null, 0, new f5.l(mainViewModelM3749, strM5791, strM9067, strM2140, iM313, couponData, i10, null), 3);
                            break;
                        case 47417:
                            int i15 = 48767;
                            while (true) {
                                i15 ^= 48784;
                                switch (i15) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 239:
                                        i15 = 48798;
                                        break;
                                }
                            }
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i12 = 48705;
                }
                C0224.m4315(C0087.m1865(this), C0455.m8876());
                m9.x1 x1VarM7508 = C0383.m7508(C0113.m2178(mainViewModelM3749), null, 0, new f5.b0(mainViewModelM3749, strM9067, strM2140, C0016.m313(this), null), 3);
                ArrayList arrayListM377 = C0019.m377(mainViewModelM3749);
                C0357.m6998(arrayListM377, x1VarM7508);
                C0426.m8360(arrayListM377, C0024.m470());
                C0365.m7173(mainViewModelM3749);
                return C0012.m238();
            }
            C0162.m3095(fVarM4830);
            g9.c cVarM9214 = C0473.m9214();
            C0375.m7360(cVarM9214, C0044.m855(m4210(), 0, C0049.f69 ^ 297, 2315));
            C0357.m6998(arrayList, C0371.m7293(C0226.m4352(C0466.m9093(m4210(), 6, C0030.f50 ^ 728, 2307), C0353.m6930(cVarM9214, C0082.f116 ^ 327))));
            int i16 = 1740;
            while (true) {
                i16 ^= 1757;
                switch (i16) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i16 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }
}
