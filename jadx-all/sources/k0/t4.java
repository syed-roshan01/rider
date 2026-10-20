package k0;

import a7.C0008;
import aa.C0012;
import androidx.profileinstaller.C0046;
import c1.C0061;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.remoteconfig.internal.Code;
import r7.C0404;
import u4.C0436;
import u8.C0439;
import v9.C0452;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class t4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.c0 f9502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(long j10, a2.c0 c0Var, c9.e eVar, int i10, int i11) {
        super(C0080.f114 ^ (-606));
        this.f9501a = j10;
        this.f9502b = c0Var;
        this.f9503c = eVar;
        this.f9504d = i10;
        this.f9505e = i11;
        int iM1161 = C0061.m1161();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1161 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0452.m8794("NaMw87Hpnu")));
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
        m0.m mVar = null;
        Number number = null;
        int iM2765 = 0;
        long jM9456 = 0;
        a2.c0 c0VarM888 = null;
        c9.e eVarM7913 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM8558 = 0;
        String str = "ۦۨ";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56450:
                    eVarM7913 = C0404.m7913(this);
                    str = "ۣۣۦ";
                    break;
                case 56514:
                    mVar = (m0.m) obj;
                    str = "ۣ۟ۧ";
                    break;
                case 1746819:
                    str = "ۣۤۧ";
                    number = (Number) obj2;
                    break;
                case 1746847:
                    iM2765 = C0008.m159(i12);
                    str = "ۣۧۢ";
                    break;
                case 1749758:
                    i11 = iM2765 ^ 1;
                    str = "ۣۨ۟";
                    break;
                case 1749795:
                    return lVarM238;
                case 1749821:
                    i10 = iM2765 & 1;
                    str = "ۢۥۡ";
                    break;
                case 1750662:
                    iM2765 = C0144.m2765(this);
                    str = "ۢۧۢ";
                    break;
                case 1750694:
                    iM2765 = C0436.m8515(number);
                    str = "ۣۨۧ";
                    break;
                case 1753420:
                    c0VarM888 = C0046.m888(this);
                    str = "ۤۦ";
                    break;
                case 1754472:
                    iM8558 = C0439.m8558(this);
                    str = "ۧۢۥ";
                    break;
                case 1754474:
                    C0168.m3208(jM9456, c0VarM888, eVarM7913, mVar, iM2765, iM8558);
                    str = "ۡۥ۟";
                    break;
                case 1755460:
                    i12 = i11 | i10;
                    str = "۟ۤۤ";
                    break;
                case 1755588:
                    jM9456 = C0486.m9456(this);
                    str = "ۦ۟ۥ";
                    break;
                default:
                    str = "ۢۦۧ";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }
}
