package d5;

import aa.C0012;
import androidx.startup.C0047;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0077;
import com.google.firebase.C0205;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import h0.C0300;
import j9.C0330;
import java.util.List;
import m1.C0352;
import p8.C0381;
import u4.C0436;
import v6.C0447;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4709a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(MainViewModel mainViewModel, u8.e eVar) {
        super(C0047.f67 ^ 973, eVar);
        this.f4709a = mainViewModel;
        int iM1607 = C0074.m1607();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1607 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0381.m7461("ZqY3jA6vweGUoPb8y17")));
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
        MainViewModel mainViewModelM8509 = null;
        String str = "ۣۨ۟";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747712:
                    this = new o0(mainViewModelM8509, eVar);
                    str = "ۤۦ۟";
                    break;
                case 1751709:
                    return this;
                default:
                    mainViewModelM8509 = C0436.m8509(this);
                    str = "۠ۡۡ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۣۧ۠";
        m9.d0 d0Var = null;
        Object objM6888 = obj;
        u8.e eVar = null;
        u8.e eVarM2333 = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750751:
                    return lVarM238;
                case 1750817:
                    objM6888 = C0352.m6888(this, lVarM238);
                    str = "ۣۦۢ";
                    break;
                case 1751714:
                    str = "ۣۨۦ";
                    lVarM238 = C0012.m238();
                    break;
                case 1751718:
                    str = "ۤۦۤ";
                    this = (o0) eVarM2333;
                    break;
                case 1752490:
                    eVarM2333 = C0121.m2333(this, d0Var, eVar);
                    str = "ۤۦۨ";
                    break;
                case 1754500:
                    str = "ۧ۟ۢ";
                    d0Var = (m9.d0) objM6888;
                    break;
                default:
                    str = "ۥ۠ۥ";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        String str = "ۥۣۡ";
        MainViewModel mainViewModelM8509 = null;
        q8.l lVarM238 = null;
        z4.g gVarM8699 = null;
        p9.q0 q0VarM3912 = null;
        List listM1659 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56292:
                    mainViewModelM8509 = C0436.m8509(this);
                    str = "۠ۡۡ";
                    break;
                case 1747688:
                    str = "ۣۨۦ";
                    q0VarM3912 = C0205.m3912(mainViewModelM8509);
                    break;
                case 1747712:
                    str = "ۢۧۦ";
                    gVarM8699 = C0447.m8699(mainViewModelM8509);
                    break;
                case 1748832:
                    return lVarM238;
                case 1749641:
                    str = "ۡۦۥ";
                    lVarM238 = C0012.m238();
                    break;
                case 1749825:
                    str = "۠۠ۨ";
                    listM1659 = C0077.m1659(gVarM8699);
                    break;
                case 1752579:
                    C0300.m5766();
                    str = "ۨ۠ۧ";
                    break;
                case 1755375:
                    C0330.m6365(obj);
                    str = "ۣ۟";
                    break;
                default:
                    C0228.m4382(q0VarM3912, listM1659);
                    str = "ۢۡۨ";
                    break;
            }
        }
    }
}
