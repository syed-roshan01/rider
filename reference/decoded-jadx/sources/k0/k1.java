package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.ui.draw.C0028;
import androidx.core.app.C0040;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.messaging.C0191;
import com.google.firebase.remoteconfig.internal.Code;
import h3.C0301;
import i4.C0317;
import o5.C0370;
import p4.C0376;
import q2.C0384;
import u.C0428;
import u4.C0435;
import v.C0439;
import w1.C0455;
import y6.C0477;
import z2.C0484;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f9093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x.l f9096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m4 f9097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1.l0 f9098f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f9099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f9100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9102q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, boolean z10, boolean z11, x.l lVar, m4 m4Var, e1.l0 l0Var, float f10, float f11, int i10, int i11) {
        super(C0384.f655 ^ 597);
        this.f9093a = m1Var;
        this.f9094b = z10;
        this.f9095c = z11;
        this.f9096d = lVar;
        this.f9097e = m4Var;
        this.f9098f = l0Var;
        this.f9099n = f10;
        this.f9100o = f11;
        this.f9101p = i10;
        this.f9102q = i11;
        int iM792 = C0040.m792();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM792 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0376.m7381("jBf9ifIEFnEKibpZFpqFdmWl")));
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
        int iM8515 = 0;
        m1 m1VarM8578 = null;
        boolean zM8881 = false;
        boolean zM7273 = false;
        x.l lVarM2199 = null;
        m4 m4VarM9426 = null;
        e1.l0 l0VarM6152 = null;
        float fM5804 = 0.0f;
        float fM3644 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM558 = 0;
        String str = "\u06e1\u06e4\u06e6";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56567:
                    m1VarM8578 = C0439.m8578(this);
                    str = "\u06e0\u06e0\u06e4";
                    break;
                case 56568:
                    str = "\u06e3\u06e4";
                    number = (Number) obj2;
                    break;
                case 1746873:
                    iM558 = C0028.m558(this);
                    str = "\u06e1\u06e7\u06e4";
                    break;
                case 1747654:
                    fM3644 = C0191.m3644(this);
                    str = "\u06e0\u06e0\u06e1";
                    break;
                case 1747681:
                    iM8515 = C0428.m8398(this);
                    str = "\u06e8\u06e7\u06e0";
                    break;
                case 1747684:
                    zM8881 = C0455.m8881(this);
                    str = "\u06e6\u06e4\u06e3";
                    break;
                case 1748771:
                    mVar = (m0.m) obj;
                    str = "\u06e8\u06e0";
                    break;
                case 1748862:
                    C0477.m9310(m1VarM8578, zM8881, zM7273, lVarM2199, m4VarM9426, l0VarM6152, fM5804, fM3644, mVar, iM8515, iM558);
                    str = "\u06e3\u06df\u06e7";
                    break;
                case 1748893:
                    iM8515 = C0008.m159(i12);
                    str = "\u06df\u06e5\u06df";
                    break;
                case 1750532:
                    i12 = i11 | i10;
                    str = "\u06e1\u06e8\u06e4";
                    break;
                case 1750539:
                    str = "\u06e8\u06e5\u06e7";
                    lVarM238 = C0012.m238();
                    break;
                case 1750593:
                    i11 = iM8515 ^ 1;
                    str = "\u06e3\u06df\u06e0";
                    break;
                case 1750779:
                    m4VarM9426 = C0484.m9426(this);
                    str = "\u06e6\u06df\u06e4";
                    break;
                case 1751711:
                    fM5804 = C0301.m5804(this);
                    str = "\u06e0\u06df\u06e5";
                    break;
                case 1753419:
                    l0VarM6152 = C0317.m6152(this);
                    str = "\u06e4\u06e6\u06e1";
                    break;
                case 1753573:
                    zM7273 = C0370.m7273(this);
                    str = "\u06e8\u06e1\u06e3";
                    break;
                case 1755402:
                    lVarM2199 = C0114.m2199(this);
                    str = "\u06e3\u06e7\u06df";
                    break;
                case 1755530:
                    return lVarM238;
                case 1755585:
                    i10 = iM8515 & 1;
                    str = "\u06e3\u06e1\u06df";
                    break;
                default:
                    iM8515 = C0435.m8515(number);
                    str = "\u06e8\u06df";
                    break;
            }
        }
    }
}
