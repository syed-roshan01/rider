package k0;

import a0.C0003;
import a7.C0008;
import aa.C0012;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import e2.C0260;
import ea.C0268;
import f0.C0271;
import fa.C0280;
import m5.C0355;
import p0.C0374;
import q0.C0381;
import q0.C0382;
import s2.C0411;
import u1.C0432;
import u4.C0435;
import x0.C0466;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.o f8945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f8946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f8947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1.l0 f8949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8950f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f8951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f8952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f8953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9.e f8954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8956s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(y0.o oVar, c9.e eVar, c9.e eVar2, boolean z10, e1.l0 l0Var, long j10, long j11, long j12, long j13, c9.e eVar3, int i10, int i11) {
        super(C0280.f425 ^ (-450));
        this.f8945a = oVar;
        this.f8946b = eVar;
        this.f8947c = eVar2;
        this.f8948d = z10;
        this.f8949e = l0Var;
        this.f8950f = j10;
        this.f8951n = j11;
        this.f8952o = j12;
        this.f8953p = j13;
        this.f8954q = eVar3;
        this.f8955r = i10;
        this.f8956s = i11;
        int iM2976 = C0156.m2976();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2976 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0466.m9083("BnGxXO3YR4DQnGSUTyRLk")));
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
        int iM8515 = 0;
        y0.o oVarM68 = null;
        c9.e eVarM3253 = null;
        c9.e eVarM8464 = null;
        boolean zM7473 = false;
        e1.l0 l0VarM8065 = null;
        long jM4976 = 0;
        long jM3876 = 0;
        long jM6964 = 0;
        long jM7339 = 0;
        c9.e eVarM7493 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM5125 = 0;
        q8.l lVarM238 = null;
        String str = "\u06df\u06e2\u06e3";
        Number number = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56326:
                    jM7339 = C0374.m7339(this);
                    str = "\u06e7\u06e7\u06e3";
                    break;
                case 56412:
                    i12 = i11 | i10;
                    str = "\u06e4\u06e1\u06e0";
                    break;
                case 56475:
                    i10 = iM8515 & 1;
                    str = "\u06e1\u06e8\u06e8";
                    break;
                case 56476:
                    jM6964 = C0355.m6964(this);
                    str = "\u06e0\u06e6";
                    break;
                case 1746784:
                    str = "\u06e1\u06e1\u06df";
                    mVar = (m0.m) obj;
                    break;
                case 1746819:
                    jM3876 = C0202.m3876(this);
                    str = "\u06e5\u06e1";
                    break;
                case 1746848:
                    jM4976 = C0260.m4976(this);
                    str = "\u06df\u06e3\u06e7";
                    break;
                case 1748671:
                    str = "\u06e8\u06e7\u06e3";
                    number = (Number) obj2;
                    break;
                case 1748680:
                    iM5125 = C0268.m5125(this);
                    str = "\u06e2\u06e6\u06e4";
                    break;
                case 1748897:
                    i11 = iM8515 ^ 1;
                    str = "\u06e3\u06df";
                    break;
                case 1749792:
                    C0271.m5228(oVarM68, eVarM3253, eVarM8464, zM7473, l0VarM8065, jM4976, jM3876, jM6964, jM7339, eVarM7493, mVar, iM8515, iM5125);
                    str = "\u06e3\u06e6\u06e7";
                    break;
                case 1750756:
                    str = "\u06e5\u06e1\u06e6";
                    lVarM238 = C0012.m238();
                    break;
                case 1751555:
                    iM8515 = C0008.m159(i12);
                    str = "\u06e1\u06e1\u06e8";
                    break;
                case 1751623:
                    l0VarM8065 = C0411.m8065(this);
                    str = "\u06df\u06e4\u06e5";
                    break;
                case 1751649:
                    eVarM3253 = C0170.m3253(this);
                    str = "\u06e4\u06e6\u06e6";
                    break;
                case 1751716:
                    eVarM8464 = C0432.m8464(this);
                    str = "\u06e6\u06e4\u06e3";
                    break;
                case 1752522:
                    return lVarM238;
                case 1752672:
                    iM8515 = C0171.m3278(this);
                    str = "\u06e5\u06e0";
                    break;
                case 1753573:
                    zM7473 = C0381.m7473(this);
                    str = "\u06e4\u06e3\u06e6";
                    break;
                case 1754627:
                    eVarM7493 = C0382.m7493(this);
                    str = "\u06e5\u06e6\u06e1";
                    break;
                case 1755588:
                    iM8515 = C0435.m8515(number);
                    str = "\u06df\u06e3";
                    break;
                default:
                    oVarM68 = C0003.m68(this);
                    str = "\u06e4\u06e4\u06e1";
                    break;
            }
        }
    }
}
