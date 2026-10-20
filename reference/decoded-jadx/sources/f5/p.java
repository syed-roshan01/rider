package f5;

import a2.C0004;
import aa.C0011;
import aa.C0012;
import android.support.v4.app.C0014;
import androidx.compose.ui.input.key.C0033;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.C0087;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0170;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.modules.C0233;
import h0.C0299;
import i.C0315;
import j9.C0329;
import m0.C0349;
import o7.i2;
import okhttp3.internal.publicsuffix.C0372;
import p3.C0375;
import r5.C0399;

/* JADX INFO: loaded from: classes.dex */
public final class p extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f411short = {410, 408, 405, 405, 473, 397, 406, 473, 478, 395, 412, 394, 396, 404, 412, 478, 473, 411, 412, 415, 406, 395, 412, 473, 478, 400, 407, 399, 406, 402, 412, 478, 473, 398, 400, 397, 401, 473, 410, 406, 395, 406, 396, 397, 400, 407, 412};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MainViewModel mainViewModel, String str, u8.e eVar) {
        super(C0164.f188 ^ 415, eVar);
        this.f6309b = mainViewModel;
        this.f6310c = str;
        int iM652 = C0033.m652();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM652 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0372.m7308("bLGMhiDabLh")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5347() {
        int iM3713 = C0194.m3713();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3713 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f411short;
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
        String str = "\u06e2\u06e7\u06e5";
        MainViewModel mainViewModelM2510 = null;
        String strM3251 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56542:
                    this = new p(mainViewModelM2510, strM3251, eVar);
                    str = "\u06df\u06e8\u06e6";
                    break;
                case 1746973:
                    return this;
                case 1749824:
                    mainViewModelM2510 = C0130.m2510(this);
                    str = "\u06e5\u06e5\u06df";
                    break;
                default:
                    str = "\u06e7\u06e5";
                    strM3251 = C0170.m3251(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e1\u06e2\u06e8";
        Object objM215 = obj;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVarM6098 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746693:
                    str = "\u06e5\u06e5\u06e1";
                    lVarM238 = C0012.m238();
                    break;
                case 1748711:
                    str = "\u06e3\u06df\u06e7";
                    d0Var = (m9.d0) objM215;
                    break;
                case 1749852:
                    str = "\u06df\u06df\u06e5";
                    this = (p) eVarM6098;
                    break;
                case 1752641:
                    objM215 = C0011.m215(this, lVarM238);
                    str = "\u06e8\u06e6\u06e6";
                    break;
                case 1754598:
                    eVarM6098 = C0315.m6098(this, d0Var, eVar);
                    str = "\u06e2\u06e8\u06e2";
                    break;
                case 1755560:
                    return objM215;
                default:
                    str = "\u06e7\u06e6\u06e5";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM4491;
        v8.a aVarM5766 = C0299.m5766();
        int iM6857 = C0349.m6857(this);
        MainViewModel mainViewModelM2510 = C0130.m2510(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6857 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM6857 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0004.m89(m5347(), 0, C0087.f121 ^ 627, 505));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            break;
                                        case 47483:
                                            objM4491 = obj;
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    C0329.m6365(obj);
                    a5.z zVarM7827 = C0399.m7827(mainViewModelM2510);
                    this.f6308a = 1;
                    C0014.m280(zVarM7827);
                    objM4491 = C0233.m4491(C0179.m3411(), new a5.n(C0170.m3251(this), null), this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 239:
                                if (objM4491 == aVarM5766) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        C0227.m4382(C0375.m7368(mainViewModelM2510), (String) objM4491);
        return C0012.m238();
    }
}
