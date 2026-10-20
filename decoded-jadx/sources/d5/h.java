package d5;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.startup.C0047;
import androidx.versionedparcelable.C0048;
import b3.C0051;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.emulators.C0141;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0263;
import e8.C0265;
import ea.C0267;
import g.C0283;
import j9.C0329;
import n1.C0362;
import okhttp3.internal.publicsuffix.C0372;
import p3.C0375;
import p8.C0379;
import q1.C0383;
import r2.C0395;
import r2.C0397;
import s8.C0416;
import t0.C0418;
import w4.C0459;
import w9.C0465;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d9.j implements c9.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f264short = {1782, 1760, 1767, 1767, 1776, 1787, 1761, 1733, 1780, 1766, 1766, 1762, 1786, 1767, 1777, 2390, 2397, 2383, 2408, 2393, 2379, 2379, 2383, 2391, 2378, 2396, 3046, 3049, 3045, 3053, 1465, 1457, 1469, 1461, 1456, 2197, 2180, 2198, 2198, 2194, 2186, 2199, 2177};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f4535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.g1 f4538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(MainViewModel mainViewModel, m0.g1 g1Var, m0.g1 g1Var2, m0.g1 g1Var3, int i10) {
        super(0);
        this.f4534a = i10;
        this.f4535b = mainViewModel;
        this.f4536c = g1Var;
        this.f4537d = g1Var2;
        this.f4538e = g1Var3;
        int iM4549 = C0236.m4549();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4549 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0397.m7775("O9Nr4bMmx0GC9OB7vNHmBHas6w")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۢۥۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4174() {
        int iM2684 = C0139.m2684();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2684 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f264short;
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

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVarM238 = C0012.m238();
        switch (C0265.m5076(this)) {
            case 0:
                C0267.m5105(this);
                return lVarM238;
            default:
                C0267.m5105(this);
                return lVarM238;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4175invoke() {
        int iM5076 = C0265.m5076(this);
        MainViewModel mainViewModelM7310 = C0372.m7310(this);
        m0.g1 g1VarM987 = C0051.m987(this);
        m0.g1 g1VarM7105 = C0362.m7105(this);
        m0.g1 g1VarM4731 = C0247.m4731(this);
        switch (iM5076) {
            case 0:
                C0227.m4382(C0379.m7430(mainViewModelM7310), null);
                String strM3852 = C0201.m3852(C0283.m5474((String) C0418.m8214(g1VarM4731)));
                String strM3853 = C0201.m3852(C0283.m5474((String) C0418.m8214(g1VarM7105)));
                String str = (String) C0418.m8214(g1VarM987);
                C0375.m7360(strM3852, C0395.m7741(m4174(), 26, C0141.f167 ^ 166, 2952));
                C0375.m7360(strM3853, C0329.m6355(m4174(), 30, C0112.f138 ^ 573, 1500));
                C0375.m7360(str, C0250.m4786(m4174(), 35, C0047.f67 ^ 967, 2277));
                C0383.m7508(C0113.m2178(mainViewModelM7310), null, 0, new f5.z(mainViewModelM7310, strM3853, str, strM3852, null), 3);
                int iM2559 = C0133.m2559();
                int i10 = 1864;
                while (true) {
                    i10 ^= 1881;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM2559 <= 0) {
                                i10 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            System.out.println(Long.decode(C0263.m5026("4MMpCrtE5pvmMu05rh")));
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i10 = 48705;
                }
                break;
            default:
                int iM8181 = C0416.m8181((String) C0418.m8214(g1VarM4731));
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM8181 >= 6) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            boolean zM4399 = C0228.m4399((String) C0418.m8214(g1VarM4731), (String) C0418.m8214(g1VarM7105));
                            int i12 = 1740;
                            while (true) {
                                i12 ^= 1757;
                                switch (i12) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (zM4399) {
                                            i12 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        String str2 = (String) C0418.m8214(g1VarM987);
                                        String str3 = (String) C0418.m8214(g1VarM4731);
                                        C0014.m280(mainViewModelM7310);
                                        C0375.m7360(str2, C0131.m2529(m4174(), 0, C0459.f730 ^ 759, 1685));
                                        C0375.m7360(str3, C0048.m921(m4174(), 15, C0465.f736 ^ 221, 2360));
                                        C0383.m7508(C0113.m2178(mainViewModelM7310), null, 0, new f5.i(mainViewModelM7310, str2, str3, null), 3);
                                        break;
                                    default:
                                        continue;
                                }
                                i12 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                break;
        }
    }
}
