package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.ui.platform.C0038;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.sql.C0208;
import d7.C0219;
import h6.C0309;
import i5.C0318;
import m7.C0357;
import n.C0361;
import r9.C0405;
import t0.C0418;
import u4.C0435;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.o f9638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9643f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9644n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y0.o oVar, long j10, float f10, long j11, int i10, int i11, int i12) {
        super(C0309.f457 ^ (-412));
        this.f9638a = oVar;
        this.f9639b = j10;
        this.f9640c = f10;
        this.f9641d = j11;
        this.f9642e = i10;
        this.f9643f = i11;
        this.f9644n = i12;
        int iM3984 = C0208.m3984();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3984 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0219.m4238("NA2OYAnP8hfCdjP5oBOGQk4z")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM6999 = 0;
        y0.o oVarM7081 = null;
        long jM9414 = 0;
        float fM738 = 0.0f;
        long jM7960 = 0;
        int iM9418 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM8220 = 0;
        q8.l lVarM238 = null;
        String str = "\u06e8\u06e4\u06e4";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56574:
                    return lVarM238;
                case 1746873:
                    number = (Number) obj2;
                    str = "\u06e6\u06e8\u06e1";
                    break;
                case 1747650:
                    i10 = iM9418 & 1;
                    str = "\u06e8\u06e5\u06e2";
                    break;
                case 1747840:
                    C0318.m6166(oVarM7081, jM9414, fM738, jM7960, iM6999, mVar, iM9418, iM8220);
                    str = "\u06e5\u06e1\u06e1";
                    break;
                case 1747903:
                    fM738 = C0038.m738(this);
                    str = "\u06e7\u06df\u06e0";
                    break;
                case 1748863:
                    iM9418 = C0008.m159(i12);
                    str = "\u06e5\u06e8\u06e8";
                    break;
                case 1749575:
                    oVarM7081 = C0361.m7081(this);
                    str = "\u06e8\u06e1\u06e6";
                    break;
                case 1749604:
                    iM6999 = C0357.m6999(this);
                    str = "\u06e4\u06e7\u06e8";
                    break;
                case 1751749:
                    iM9418 = C0483.m9418(this);
                    str = "\u06e0\u06df\u06e1";
                    break;
                case 1752517:
                    lVarM238 = C0012.m238();
                    str = "\u06e8\u06e6";
                    break;
                case 1752741:
                    iM8220 = C0418.m8220(this);
                    str = "\u06e0\u06e5\u06e5";
                    break;
                case 1753695:
                    iM6999 = C0435.m8515(number);
                    str = "\u06e2\u06df\u06e4";
                    break;
                case 1754376:
                    jM7960 = C0405.m7960(this);
                    str = "\u06e2\u06e0\u06e2";
                    break;
                case 1755405:
                    jM9414 = C0483.m9414(this);
                    str = "\u06e0\u06e7\u06e6";
                    break;
                case 1755496:
                    mVar = (m0.m) obj;
                    str = "\u06df\u06e5\u06df";
                    break;
                case 1755525:
                    i11 = iM9418 ^ 1;
                    str = "\u06e0\u06e8\u06e2";
                    break;
                default:
                    i12 = i11 | i10;
                    str = "\u06e1\u06e7\u06e5";
                    break;
            }
        }
    }
}
