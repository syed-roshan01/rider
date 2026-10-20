package d5;

import a7.C0008;
import aa.C0012;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0229;
import n7.C0363;
import o8.C0371;
import t2.C0423;
import u4.C0435;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(String str, long j10, int i10) {
        super(C0178.f202 ^ 153);
        this.f4474a = str;
        this.f4475b = j10;
        this.f4476c = i10;
        int iM8307 = C0423.m8307();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8307 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0371.m7286("bbfUmMb69p8Or2pDRY87o2T2")));
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
        long jM166 = 0;
        String str = "\u06df\u06e6\u06e0";
        m0.m mVar = null;
        Number number = null;
        String strM1572 = null;
        q8.l lVarM238 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM8515 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56542:
                    i10 = iM8515 & 1;
                    str = "\u06e0\u06e3\u06e2";
                    break;
                case 1746905:
                    str = "\u06e6\u06e0\u06e3";
                    mVar = (m0.m) obj;
                    break;
                case 1747775:
                    str = "\u06e4\u06e6\u06e6";
                    i12 = iM8515 ^ 1;
                    break;
                case 1749733:
                    str = "\u06e5\u06df\u06e7";
                    iM8515 = C0435.m8515(number);
                    break;
                case 1750569:
                    str = "\u06e4\u06e6\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                case 1751713:
                    return lVarM238;
                case 1751716:
                    str = "\u06e5\u06e8\u06e3";
                    i11 = i12 | i10;
                    break;
                case 1752461:
                    str = "\u06e7\u06e5";
                    iM8515 = C0363.m7129(this);
                    break;
                case 1752488:
                    jM166 = C0008.m166(this);
                    str = "\u06e6\u06e1\u06df";
                    break;
                case 1752736:
                    str = "\u06e0\u06e5\u06e0";
                    iM8515 = C0008.m159(i11);
                    break;
                case 1753449:
                    str = "\u06e2\u06e4\u06e7";
                    number = (Number) obj2;
                    break;
                case 1753476:
                    C0229.m4417(strM1572, jM166, mVar, iM8515);
                    str = "\u06e3\u06e0\u06e6";
                    break;
                default:
                    str = "\u06e5\u06e0\u06e3";
                    strM1572 = C0073.m1572(this);
                    break;
            }
        }
    }
}
