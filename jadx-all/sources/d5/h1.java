package d5;

import a.C0000;
import a7.C0008;
import aa.C0012;
import androidx.compose.foundation.relocation.C0024;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.measurement.C0181;
import com.google.firebase.remoteconfig.internal.Code;
import e1.C0260;
import h3.C0303;
import n.C0362;
import p0.C0374;
import s2.C0412;
import u4.C0436;
import v0.C0441;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserProfile f4543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.a f4544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.a f4545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(MainViewModel mainViewModel, UserProfile userProfile, c9.a aVar, c9.a aVar2, int i10) {
        super(C0181.f205 ^ (-907));
        this.f4542a = mainViewModel;
        this.f4543b = userProfile;
        this.f4544c = aVar;
        this.f4545d = aVar2;
        this.f4546e = i10;
        int iM487 = C0024.m487();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM487 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0362.m7078("Av7G49yI4B77jB")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM159 = 0;
        MainViewModel mainViewModelM8600 = null;
        UserProfile userProfileM15 = null;
        c9.a aVarM5834 = null;
        c9.a aVarM7325 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = "ۣ۟ۢ";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56296:
                    i10 = iM159 & 1;
                    str = "ۥۢ۠";
                    break;
                case 56575:
                    aVarM7325 = C0374.m7325(this);
                    str = "ۦۡۢ";
                    break;
                case 1746969:
                    mainViewModelM8600 = C0441.m8600(this);
                    str = "ۦۡ۟";
                    break;
                case 1747904:
                    iM159 = C0436.m8515(number);
                    str = "۟ۨۢ";
                    break;
                case 1747933:
                    str = "ۦ۟ۡ";
                    lVarM238 = C0012.m238();
                    break;
                case 1748804:
                    aVarM5834 = C0303.m5834(this);
                    str = "ۨۧ";
                    break;
                case 1750534:
                    mVar = (m0.m) obj;
                    str = "ۤۢۧ";
                    break;
                case 1750564:
                    iM159 = C0008.m159(i12);
                    str = "ۧۤۡ";
                    break;
                case 1751593:
                    str = "۠ۧۧ";
                    number = (Number) obj2;
                    break;
                case 1752547:
                    i11 = iM159 ^ 1;
                    str = "ۣ۠ۨ";
                    break;
                case 1753416:
                    return lVarM238;
                case 1753476:
                    userProfileM15 = C0000.m15(this);
                    str = "ۡۥۨ";
                    break;
                case 1753479:
                    iM159 = C0260.m4948(this);
                    str = "۟ۧ";
                    break;
                case 1754532:
                    C0412.m8086(mainViewModelM8600, userProfileM15, aVarM5834, aVarM7325, mVar, iM159);
                    str = "۠ۨۥ";
                    break;
                default:
                    i12 = i11 | i10;
                    str = "ۣ۠ۡ";
                    break;
            }
        }
    }
}
