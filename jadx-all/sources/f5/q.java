package f5;

import a3.C0006;
import aa.C0012;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0214;
import d2.C0216;
import dagger.hilt.android.components.C0228;
import g.C0283;
import h.C0299;
import h0.C0300;
import h6.C0310;
import h7.C0313;
import j9.C0330;
import java.util.List;
import k.C0332;
import l3.C0343;
import m4.C0354;
import n.C0362;
import o7.i2;
import r5.C0400;
import s0.C0411;
import u0.C0431;

/* JADX INFO: loaded from: classes.dex */
public final class q extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f412short = {867, 865, 876, 876, 800, 884, 879, 800, 807, 882, 869, 883, 885, 877, 869, 807, 800, 866, 869, 870, 879, 882, 869, 800, 807, 873, 878, 886, 879, 875, 869, 807, 800, 887, 873, 884, 872, 800, 867, 879, 882, 879, 885, 884, 873, 878, 869};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(MainViewModel mainViewModel, String str, u8.e eVar) {
        super(C0343.f613 ^ 59, eVar);
        this.f6312b = mainViewModel;
        this.f6313c = str;
        int iM8063 = C0411.m8063();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8063 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0216.m4099("3PI3amRmItZqD")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m5348() {
        int iM5742 = C0299.m5742();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5742 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f412short;
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
        String str = "ۥۧۥ";
        String strM8426 = null;
        MainViewModel mainViewModelM5978 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746912:
                    this = new q(mainViewModelM5978, strM8426, eVar);
                    str = "ۡۥۣ";
                    break;
                case 1752707:
                    str = "ۨۥ۟";
                    mainViewModelM5978 = C0310.m5978(this);
                    break;
                case 1755522:
                    strM8426 = C0431.m8426(this);
                    str = "۟ۦۧ";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۢۤ۟";
        Object objM6033 = obj;
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        u8.e eVarM1911 = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56508:
                    return objM6033;
                case 1749725:
                    str = "ۧۢۧ";
                    d0Var = (m9.d0) objM6033;
                    break;
                case 1753449:
                    objM6033 = C0313.m6033(this, lVarM238);
                    str = "ۦۢ";
                    break;
                case 1754476:
                    str = "ۨۤۡ";
                    eVar = (u8.e) obj2;
                    break;
                case 1754598:
                    str = "ۤۡۦ";
                    this = (q) eVarM1911;
                    break;
                case 1755493:
                    eVarM1911 = C0089.m1911(this, d0Var, eVar);
                    str = "ۧۦۥ";
                    break;
                default:
                    str = "ۦۣ۠";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM111;
        v8.a aVarM5766 = C0300.m5766();
        int iM5444 = C0283.m5444(this);
        MainViewModel mainViewModelM5978 = C0310.m5978(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM5444 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM5444 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0332.m6403(m5348(), 0, C0214.f237 ^ (-34), 768));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0330.m6365(obj);
                                objM111 = C0362.m7093((q8.h) obj);
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
                    a5.z zVarM7827 = C0400.m7827(mainViewModelM5978);
                    this.f6311a = 1;
                    objM111 = C0006.m111(zVarM7827, C0431.m8426(this), this);
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
                                i13 = objM111 == aVarM5766 ? 48860 : 48829;
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
        boolean z10 = objM111 instanceof q8.g;
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i14 = ((((z10 ? 1 : 0) ^ 65535) & 1) | ((z10 ? 1 : 0) & 65534)) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    C0228.m4382(C0354.m6932(mainViewModelM5978), (List) objM111);
                    break;
                default:
                    break;
            }
        }
        return C0012.m238();
    }
}
