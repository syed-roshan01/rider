package d5;

import aa.C0012;
import ca.C0070;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0299;
import h1.C0300;
import i6.C0320;
import j9.C0329;
import m4.C0353;
import p8.C0380;
import q1.C0383;
import r6.C0401;
import rikka.shizuku.C0406;
import w5.C0463;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4873a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(MainViewModel mainViewModel, u8.e eVar) {
        super(C0401.f672 ^ (-527), eVar);
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
                    System.out.println(Long.valueOf(C0463.m9024("HBxZ")));
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
        String str = "\u06e4\u06e3\u06df";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751616:
                    mainViewModelM7971 = C0406.m7971(this);
                    str = "\u06e1\u06e6\u06df";
                    break;
                case 1751778:
                    return this;
                default:
                    this = new z0(mainViewModelM7971, eVar);
                    str = "\u06e4\u06e8\u06e6";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e7\u06e7\u06e6";
        m9.d0 d0Var = null;
        Object objM2236 = obj;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        u8.e eVarM6933 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56505:
                    str = "\u06e3\u06e0\u06e8";
                    eVar = (u8.e) obj2;
                    break;
                case 1746881:
                    objM2236 = C0116.m2236(this, lVarM238);
                    str = "\u06e7\u06e6\u06e5";
                    break;
                case 1748675:
                    str = "\u06e8\u06e0\u06e1";
                    this = (z0) eVarM6933;
                    break;
                case 1754598:
                    return lVarM238;
                case 1754630:
                    str = "\u06e6\u06df";
                    d0Var = (m9.d0) objM2236;
                    break;
                case 1755369:
                    str = "\u06df\u06e5\u06e7";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    eVarM6933 = C0353.m6933(this, d0Var, eVar);
                    str = "\u06e1\u06e1\u06e3";
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        C0299.m5766();
        C0329.m6365(obj);
        MainViewModel mainViewModelM7971 = C0406.m7971(this);
        String strM5791 = C0300.m5791(C0380.m7458(mainViewModelM7971));
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
                    C0383.m7508(C0113.m2178(mainViewModelM7971), null, 0, new f5.p(mainViewModelM7971, strM5791, null), C0320.f468 ^ (-807));
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0012.m238();
    }
}
