package k0;

import a7.C0008;
import aa.C0012;
import androidx.activity.C0017;
import b1.C0050;
import c4.C0064;
import c7.C0069;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.aggregatedroot.C0246;
import f4.C0274;
import u4.C0435;
import v7.C0449;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.a f8780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f8781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f8783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.m f8784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.e f8785f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8787o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(c9.a aVar, y0.o oVar, boolean z10, b1 b1Var, x.m mVar, c9.e eVar, int i10, int i11) {
        super(C0487.f761 ^ (-288));
        this.f8780a = aVar;
        this.f8781b = oVar;
        this.f8782c = z10;
        this.f8783d = b1Var;
        this.f8784e = mVar;
        this.f8785f = eVar;
        this.f8786n = i10;
        this.f8787o = i11;
        int iM8755 = C0449.m8755();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8755 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0075.m1627("mQi8ku5IWES3ndKvHZRom"));
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
        int iM159 = 0;
        c9.a aVarM347 = null;
        y0.o oVarM1343 = null;
        boolean zM1238 = false;
        b1 b1VarM3531 = null;
        x.m mVarM970 = null;
        c9.e eVarM4729 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM5288 = 0;
        String str = "\u06e0\u06e0\u06e7";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56572:
                    b1VarM3531 = C0185.m3531(this);
                    str = "\u06e2\u06e4\u06e7";
                    break;
                case 1747652:
                    i10 = iM159 & 1;
                    str = "\u06e8\u06e8\u06e3";
                    break;
                case 1747687:
                    mVar = (m0.m) obj;
                    str = "\u06e4\u06e8\u06e4";
                    break;
                case 1747747:
                    aVarM347 = C0017.m347(this);
                    str = "\u06e7\u06e4\u06e7";
                    break;
                case 1747776:
                    return lVarM238;
                case 1748801:
                    eVarM4729 = C0246.m4729(this);
                    str = "\u06e6\u06df\u06e8";
                    break;
                case 1749733:
                    mVarM970 = C0050.m970(this);
                    str = "\u06e1\u06e5\u06e5";
                    break;
                case 1751776:
                    str = "\u06e8\u06e0\u06e0";
                    number = (Number) obj2;
                    break;
                case 1752554:
                    iM5288 = C0274.m5288(this);
                    str = "\u06df\u06e1\u06df";
                    break;
                case 1753423:
                    iM159 = C0194.m3708(this);
                    str = "\u06e0\u06df\u06e3";
                    break;
                case 1753604:
                    iM159 = C0008.m159(i12);
                    str = "\u06e5\u06e2\u06e7";
                    break;
                case 1753608:
                    str = "\u06e0\u06e3\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                case 1754508:
                    i12 = i11 | i10;
                    str = "\u06e6\u06e5\u06e3";
                    break;
                case 1754538:
                    oVarM1343 = C0069.m1343(this);
                    str = "\u06e8\u06e4\u06e1";
                    break;
                case 1755368:
                    iM159 = C0435.m8515(number);
                    str = "\u06e0\u06e2\u06e5";
                    break;
                case 1755493:
                    zM1238 = C0064.m1238(this);
                    str = "\u06e8\u06e4";
                    break;
                case 1755619:
                    i11 = iM159 ^ 1;
                    str = "\u06e7\u06e3\u06e8";
                    break;
                default:
                    C0109.m2115(aVarM347, oVarM1343, zM1238, b1VarM3531, mVarM970, eVarM4729, mVar, iM159, iM5288);
                    str = "\u06e6\u06e5\u06e7";
                    break;
            }
        }
    }
}
