package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.ui.node.C0037;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0214;
import g2.C0287;
import h8.C0313;
import r4.C0398;
import t2.C0423;
import u4.C0435;
import u7.C0437;
import w2.C0457;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4 f9675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f9676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.f f9679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9680f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.h f9681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9682o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(f4 f4Var, f1 f1Var, long j10, long j11, c9.f fVar, boolean z10, c9.h hVar, int i10) {
        super(C0457.f728 ^ 323);
        this.f9675a = f4Var;
        this.f9676b = f1Var;
        this.f9677c = j10;
        this.f9678d = j11;
        this.f9679e = fVar;
        this.f9680f = z10;
        this.f9681n = hVar;
        this.f9682o = i10;
        int iM3170 = C0166.m3170();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3170 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0287.m5524("AVO90TyC")));
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
        int iM8515 = 0;
        f4 f4VarM4093 = null;
        f1 f1VarM9515 = null;
        long jM8304 = 0;
        long jM3573 = 0;
        c9.f fVarM717 = null;
        boolean zM7809 = false;
        c9.h hVarM8550 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = "\u06e0\u06e5\u06e7";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56325:
                    return lVarM238;
                case 1746689:
                    f4VarM4093 = C0214.m4093(this);
                    str = "\u06e0\u06e4\u06e8";
                    break;
                case 1747650:
                    iM8515 = C0180.m3441(this);
                    str = "\u06e5\u06e1\u06e2";
                    break;
                case 1747684:
                    fVarM717 = C0037.m717(this);
                    str = "\u06e1\u06e4\u06e7";
                    break;
                case 1747746:
                    hVarM8550 = C0437.m8550(this);
                    str = "\u06e0\u06df\u06e1";
                    break;
                case 1747778:
                    i12 = i11 | i10;
                    str = "\u06e4\u06e8\u06e4";
                    break;
                case 1747812:
                    f1VarM9515 = C0488.m9515(this);
                    str = "\u06e3\u06df\u06e5";
                    break;
                case 1747842:
                    mVar = (m0.m) obj;
                    str = "\u06e6\u06e2\u06e8";
                    break;
                case 1748671:
                    jM3573 = C0187.m3573(this);
                    str = "\u06e0\u06e0\u06e4";
                    break;
                case 1748772:
                    zM7809 = C0398.m7809(this);
                    str = "\u06e0\u06e2\u06e4";
                    break;
                case 1750537:
                    jM8304 = C0423.m8304(this);
                    str = "\u06e1\u06e1\u06df";
                    break;
                case 1751531:
                    str = "\u06e0\u06e5";
                    lVarM238 = C0012.m238();
                    break;
                case 1751776:
                    iM8515 = C0008.m159(i12);
                    str = "\u06e6\u06e7\u06e4";
                    break;
                case 1752518:
                    i10 = iM8515 & 1;
                    str = "\u06e7\u06e0\u06e0";
                    break;
                case 1753516:
                    str = "\u06e7\u06e8\u06df";
                    number = (Number) obj2;
                    break;
                case 1753667:
                    C0313.m6059(f4VarM4093, f1VarM9515, jM8304, jM3573, fVarM717, zM7809, hVarM8550, mVar, iM8515);
                    str = "\u06e4\u06e0\u06e7";
                    break;
                case 1754407:
                    i11 = iM8515 ^ 1;
                    str = "\u06e0\u06e3\u06e5";
                    break;
                default:
                    iM8515 = C0435.m8515(number);
                    str = "\u06df\u06df\u06e1";
                    break;
            }
        }
    }
}
