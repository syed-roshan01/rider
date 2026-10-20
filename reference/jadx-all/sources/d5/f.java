package d5;

import a7.C0008;
import aa.C0012;
import androidx.profileinstaller.C0045;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.C0241;
import e1.C0260;
import ga.C0296;
import h.C0299;
import q6.C0388;
import u4.C0436;
import w4.C0460;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f4478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.a f4479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(MainViewModel mainViewModel, c9.a aVar, int i10, int i11) {
        super(C0299.f446 ^ (-137));
        this.f4477a = i11;
        this.f4478b = mainViewModel;
        this.f4479c = aVar;
        this.f4480d = i10;
        int iM7585 = C0388.m7585();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7585 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0080.m1720("RYgCYKiajYnKBtVEq6R")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        int iM4962 = C0260.m4962(this);
        MainViewModel mainViewModelM872 = C0045.m872(this);
        c9.a aVarM5687 = C0296.m5687(this);
        int iM4605 = C0241.m4605(this);
        switch (iM4605) {
            case 0:
                m0.m mVar = (m0.m) obj;
                C0436.m8515((Number) obj2);
                switch (iM4605) {
                    case 0:
                        C0460.m8953(mainViewModelM872, aVarM5687, mVar, C0008.m159((iM4962 & 1) | (iM4962 ^ 1)));
                        return lVarM238;
                    default:
                        C0200.m3845(mainViewModelM872, aVarM5687, mVar, C0008.m159((iM4962 & 1) | (iM4962 ^ 1)));
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
                m0.m mVar2 = (m0.m) obj;
                C0436.m8515((Number) obj2);
                switch (iM4605) {
                    case 0:
                        C0460.m8953(mainViewModelM872, aVarM5687, mVar2, C0008.m159((iM4962 & 1) | (iM4962 ^ 1)));
                        return lVarM238;
                    default:
                        C0200.m3845(mainViewModelM872, aVarM5687, mVar2, C0008.m159((iM4962 & 1) | (iM4962 ^ 1)));
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
