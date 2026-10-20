package f0;

import a7.C0008;
import aa.C0012;
import androidx.compose.ui.graphics.C0030;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import dagger.hilt.components.C0243;
import f.C0269;
import g4.C0289;
import g7.C0292;
import j4.C0326;
import k7.C0337;
import r.C0392;
import s7.C0415;
import u4.C0435;
import v0.C0441;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f5742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.c0 f5743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.c f5744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5746f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5750q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, y0.o oVar, a2.c0 c0Var, c9.c cVar, int i10, boolean z10, int i11, int i12, int i13, int i14) {
        super(C0441.f712 ^ (-255));
        this.f5741a = str;
        this.f5742b = oVar;
        this.f5743c = c0Var;
        this.f5744d = cVar;
        this.f5745e = i10;
        this.f5746f = z10;
        this.f5747n = i11;
        this.f5748o = i12;
        this.f5749p = i13;
        this.f5750q = i14;
        int iM5634 = C0292.m5634();
        int i15 = 1616;
        while (true) {
            i15 ^= 1633;
            switch (i15) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5634 >= 0) {
                        i15 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0133.m2566("1VtMIl")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i15 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM587 = 0;
        String strM7689 = null;
        y0.o oVarM2636 = null;
        a2.c0 c0VarM3822 = null;
        c9.c cVarM6635 = null;
        boolean zM8164 = false;
        int iM3100 = 0;
        int iM4669 = 0;
        int iM5578 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM6312 = 0;
        q8.l lVarM238 = null;
        String str = "\u06e8\u06e0\u06e8";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56328:
                    c0VarM3822 = C0199.m3822(this);
                    str = "\u06e2\u06e5\u06e4";
                    break;
                case 56570:
                    lVarM238 = C0012.m238();
                    str = "\u06e6\u06e5\u06e4";
                    break;
                case 1747686:
                    iM5578 = C0289.m5578(this);
                    str = "\u06e0\u06e6\u06e5";
                    break;
                case 1747871:
                    i10 = iM5578 & 1;
                    str = "\u06e2\u06df\u06e3";
                    break;
                case 1748674:
                    iM587 = C0435.m8515(number);
                    str = "\u06e1\u06e8\u06e5";
                    break;
                case 1748765:
                    iM3100 = C0162.m3100(this);
                    str = "\u06e8\u06e4\u06e2";
                    break;
                case 1748894:
                    strM7689 = C0392.m7689(this);
                    str = "\u06e2\u06e2\u06e5";
                    break;
                case 1749574:
                    i11 = iM5578 ^ 1;
                    str = "\u06e3\u06e7\u06e7";
                    break;
                case 1749665:
                    iM6312 = C0326.m6312(this);
                    str = "\u06e8\u06e5\u06e7";
                    break;
                case 1749669:
                    oVarM2636 = C0136.m2636(this);
                    str = "\u06e0\u06e8";
                    break;
                case 1749761:
                    cVarM6635 = C0337.m6635(this);
                    str = "\u06e8\u06e3\u06df";
                    break;
                case 1750787:
                    i12 = i11 | i10;
                    str = "\u06e7\u06e7\u06e1";
                    break;
                case 1753605:
                    return lVarM238;
                case 1754625:
                    iM5578 = C0008.m159(i12);
                    str = "\u06e2\u06e2\u06e1";
                    break;
                case 1755376:
                    mVar = (m0.m) obj;
                    str = "\u06e8\u06e3\u06e0";
                    break;
                case 1755460:
                    iM587 = C0030.m587(this);
                    str = "\u06e1\u06e8\u06e0";
                    break;
                case 1755461:
                    number = (Number) obj2;
                    str = "\u06e1\u06e1\u06e2";
                    break;
                case 1755494:
                    iM4669 = C0243.m4669(this);
                    str = "\u06e0\u06e0\u06e6";
                    break;
                case 1755530:
                    C0269.m5147(strM7689, oVarM2636, c0VarM3822, cVarM6635, iM587, zM8164, iM3100, iM4669, mVar, iM5578, iM6312);
                    str = "\u06e8\u06e2";
                    break;
                default:
                    zM8164 = C0415.m8164(this);
                    str = "\u06e1\u06e4\u06e0";
                    break;
            }
        }
    }
}
