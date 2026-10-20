package d5;

import a7.C0008;
import aa.C0012;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.messaging.C0191;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import dagger.hilt.android.components.C0227;
import g.C0284;
import h8.C0314;
import k3.C0334;
import n8.C0365;
import r9.C0405;
import u.C0429;
import v.C0439;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f4579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(MainViewModel mainViewModel, m0.g1 g1Var, int i10) {
        super(0);
        this.f4578a = i10;
        this.f4579b = mainViewModel;
        this.f4580c = g1Var;
        int iM8415 = C0429.m8415();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8415 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0314.m6086("IVIGHQRoryU1EVwRf")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVarM238 = C0012.m238();
        String strM8581 = C0439.m8581();
        MainViewModel mainViewModelM5484 = C0284.m5484(this);
        m0.g1 g1VarM1626 = C0074.m1626(this);
        int iM170 = C0008.m170(this);
        switch (iM170) {
            case 0:
                switch (iM170) {
                    case 0:
                        C0365.m7173(mainViewModelM5484);
                        C0224.m4315(g1VarM1626, C0334.m6483());
                        return lVarM238;
                    default:
                        C0227.m4382(C0191.m3645(mainViewModelM5484), null);
                        C0227.m4382(C0405.m7966(mainViewModelM5484), null);
                        C0224.m4315(g1VarM1626, strM8581);
                        int i10 = 1740;
                        while (true) {
                            i10 ^= 1757;
                            switch (i10) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i10 = 1771;
                                    break;
                                case 54:
                                    return lVarM238;
                            }
                        }
                        break;
                }
                break;
            default:
                switch (iM170) {
                    case 0:
                        C0365.m7173(mainViewModelM5484);
                        C0224.m4315(g1VarM1626, C0334.m6483());
                        return lVarM238;
                    default:
                        C0227.m4382(C0191.m3645(mainViewModelM5484), null);
                        C0227.m4382(C0405.m7966(mainViewModelM5484), null);
                        C0224.m4315(g1VarM1626, strM8581);
                        int i11 = 1616;
                        while (true) {
                            i11 ^= 1633;
                            switch (i11) {
                                case Code.UNAVAILABLE /* 14 */:
                                    return lVarM238;
                                case 49:
                                    i11 = 1647;
                                    break;
                            }
                        }
                        break;
                }
                break;
        }
    }
}
