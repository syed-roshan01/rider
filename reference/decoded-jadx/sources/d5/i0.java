package d5;

import a.C0001;
import a7.C0008;
import aa.C0012;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0077;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.emulators.C0141;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.remoteconfig.internal.Code;
import d2.C0215;
import d8.C0221;
import e2.C0260;
import e9.C0266;
import java.util.Map;
import o1.C0367;
import q0.C0381;
import r7.C0404;
import s.C0408;
import t1.C0419;
import u1.C0432;
import u4.C0435;
import x4.C0468;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4567f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f4569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f4570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f4571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c9.a f4572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4574t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(MainViewModel mainViewModel, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, String str, long j10, Map map, c9.a aVar, int i12, int i13) {
        super(C0077.f111 ^ (-658));
        this.f4562a = mainViewModel;
        this.f4563b = z10;
        this.f4564c = z11;
        this.f4565d = z12;
        this.f4566e = z13;
        this.f4567f = i10;
        this.f4568n = i11;
        this.f4569o = str;
        this.f4570p = j10;
        this.f4571q = map;
        this.f4572r = aVar;
        this.f4573s = i12;
        this.f4574t = i13;
        int iM4984 = C0260.m4984();
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4984 <= 0) {
                        i14 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0141.m2708("JPMy")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i14 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM9128 = 0;
        MainViewModel mainViewModelM39 = null;
        boolean zM4267 = false;
        boolean zM7475 = false;
        boolean zM8460 = false;
        boolean zM8239 = false;
        int iM31 = 0;
        String strM7209 = null;
        long jM8020 = 0;
        Map mapM3393 = null;
        c9.a aVarM5086 = null;
        int iM159 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM7939 = 0;
        int iM1510 = 0;
        q8.l lVarM238 = null;
        String str = "\u06e5\u06e8\u06e2";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56451:
                    aVarM5086 = C0266.m5086(this);
                    str = "\u06e2\u06e7\u06df";
                    break;
                case 1746966:
                    mainViewModelM39 = C0001.m39(this);
                    str = "\u06e0\u06e4\u06e6";
                    break;
                case 1746968:
                    strM7209 = C0367.m7209(this);
                    str = "\u06e4\u06e7\u06df";
                    break;
                case 1747810:
                    zM4267 = C0221.m4267(this);
                    str = "\u06e4\u06e3\u06e4";
                    break;
                case 1747900:
                    number = (Number) obj2;
                    str = "\u06e2\u06e3\u06e1";
                    break;
                case 1748675:
                    iM7939 = C0404.m7939(this);
                    str = "\u06e8\u06e8\u06e6";
                    break;
                case 1748889:
                    lVarM238 = C0012.m238();
                    str = "\u06e8\u06e4\u06e1";
                    break;
                case 1749696:
                    iM9128 = C0435.m8515(number);
                    str = "\u06df\u06e8\u06df";
                    break;
                case 1749818:
                    iM159 = C0114.m2214(this);
                    str = "\u06e6\u06e3\u06e3";
                    break;
                case 1750630:
                    iM31 = C0001.m31(this);
                    str = "\u06df\u06e8\u06e1";
                    break;
                case 1751621:
                    zM7475 = C0381.m7475(this);
                    str = "\u06e5\u06e5";
                    break;
                case 1751709:
                    C0215.m4104(mainViewModelM39, zM4267, zM7475, zM8460, zM8239, iM9128, iM31, strM7209, jM8020, mapM3393, aVarM5086, mVar, iM159, iM1510);
                    str = "\u06e1\u06e8\u06e0";
                    break;
                case 1751740:
                    jM8020 = C0408.m8020(this);
                    str = "\u06e5\u06e7\u06e2";
                    break;
                case 1752460:
                    iM159 = C0008.m159(i12);
                    str = "\u06e1\u06e1\u06e3";
                    break;
                case 1752704:
                    mapM3393 = C0178.m3393(this);
                    str = "\u06e4\u06e7";
                    break;
                case 1752735:
                    mVar = (m0.m) obj;
                    str = "\u06e0\u06e7\u06e3";
                    break;
                case 1753542:
                    i10 = iM159 & 1;
                    str = "\u06e6\u06e7\u06e7";
                    break;
                case 1753632:
                    iM9128 = C0468.m9128(this);
                    str = "\u06e3\u06e2\u06e5";
                    break;
                case 1753670:
                    i11 = iM159 ^ 1;
                    str = "\u06e7\u06e6\u06e2";
                    break;
                case 1754595:
                    i12 = i11 | i10;
                    str = "\u06e5\u06df\u06e6";
                    break;
                case 1755463:
                    zM8239 = C0419.m8239(this);
                    str = "\u06e6\u06e6\u06e0";
                    break;
                case 1755493:
                    return lVarM238;
                case 1755622:
                    iM1510 = C0008.m159(iM7939);
                    str = "\u06e4\u06e6\u06df";
                    break;
                default:
                    zM8460 = C0432.m8460(this);
                    str = "\u06e8\u06e3\u06e2";
                    break;
            }
        }
    }
}
