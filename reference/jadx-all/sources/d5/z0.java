package d5;

import aa.C0012;
import ca.C0070;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0300;
import h1.C0301;
import i6.C0321;
import j9.C0330;
import m4.C0354;
import p8.C0381;
import q1.C0384;
import r6.C0402;
import rikka.shizuku.C0407;
import w5.C0464;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4873a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(MainViewModel mainViewModel, u8.e eVar) {
        super(C0402.f672 ^ (-527), eVar);
        this.f4873a = mainViewModel;
        int iM1363 = C0070.m1363();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1363 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0464.m9024("HBxZ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        MainViewModel mainViewModelM7971 = null;
        String str = "ۣۤ۟";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751616:
                    mainViewModelM7971 = C0407.m7971(this);
                    str = "ۡۦ۟";
                    break;
                case 1751778:
                    return this;
                default:
                    this = new z0(mainViewModelM7971, eVar);
                    str = "ۤۨۦ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۧۧۦ";
        m9.d0 d0Var = null;
        Object objM2236 = obj;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        u8.e eVarM6933 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56505:
                    str = "ۣ۠ۨ";
                    eVar = (u8.e) obj2;
                    break;
                case 1746881:
                    objM2236 = C0116.m2236(this, lVarM238);
                    str = "ۧۦۥ";
                    break;
                case 1748675:
                    str = "ۨ۠ۡ";
                    this = (z0) eVarM6933;
                    break;
                case 1754598:
                    return lVarM238;
                case 1754630:
                    str = "ۦ۟";
                    d0Var = (m9.d0) objM2236;
                    break;
                case 1755369:
                    str = "۟ۥۧ";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    eVarM6933 = C0354.m6933(this, d0Var, eVar);
                    str = "ۣۡۡ";
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        C0300.m5766();
        C0330.m6365(obj);
        MainViewModel mainViewModelM7971 = C0407.m7971(this);
        String strM5791 = C0301.m5791(C0381.m7458(mainViewModelM7971));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (strM5791 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    C0384.m7508(C0113.m2178(mainViewModelM7971), null, 0, new f5.p(mainViewModelM7971, strM5791, null), C0321.f468 ^ (-807));
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0012.m238();
    }
}
