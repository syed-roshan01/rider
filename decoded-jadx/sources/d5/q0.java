package d5;

import aa.C0012;
import c1.C0058;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.abt.C0113;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0299;
import h1.C0300;
import j9.C0329;
import p8.C0380;
import q1.C0383;
import q6.C0386;
import q6.C0388;
import t1.C0419;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(MainViewModel mainViewModel, u8.e eVar) {
        super(C0058.f78 ^ (-570), eVar);
        this.f4738a = mainViewModel;
        int iM8247 = C0419.m8247();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8247 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0388.m7607("u8FJL3iDnIvOi2f8rZscNzebibbzp")));
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
        MainViewModel mainViewModelM1771 = null;
        String str = "\u06e1\u06e7\u06e3";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748861:
                    mainViewModelM1771 = C0083.m1771(this);
                    str = "\u06e2\u06e6\u06e3";
                    break;
                case 1749671:
                    return this;
                default:
                    this = new q0(mainViewModelM1771, eVar);
                    str = "\u06e2\u06e2\u06e7";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e0\u06e4\u06e4";
        Object objM3027 = obj;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        u8.e eVarM5793 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746718:
                    str = "\u06e2\u06e2";
                    lVarM238 = C0012.m238();
                    break;
                case 1747743:
                    eVarM5793 = C0300.m5793(this, d0Var, eVar);
                    str = "\u06e8\u06e6\u06e6";
                    break;
                case 1747808:
                    str = "\u06e5\u06df\u06e8";
                    d0Var = (m9.d0) objM3027;
                    break;
                case 1752462:
                    str = "\u06e0\u06e2\u06e1";
                    eVar = (u8.e) obj2;
                    break;
                case 1755493:
                    return lVarM238;
                case 1755560:
                    str = "\u06df\u06e0\u06df";
                    this = (q0) eVarM5793;
                    break;
                default:
                    objM3027 = C0159.m3027(this, lVarM238);
                    str = "\u06e8\u06e4\u06e1";
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        C0299.m5766();
        C0329.m6365(obj);
        MainViewModel mainViewModelM1771 = C0083.m1771(this);
        String strM5791 = C0300.m5791(C0380.m7458(mainViewModelM1771));
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
                    C0383.m7508(C0113.m2178(mainViewModelM1771), null, 0, new f5.p(mainViewModelM1771, strM5791, null), C0386.f657 ^ (-670));
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0012.m238();
    }
}
