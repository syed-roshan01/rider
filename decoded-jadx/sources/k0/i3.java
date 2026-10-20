package k0;

import a2.C0004;
import a7.C0008;
import aa.C0012;
import android.os.C0013;
import androidx.compose.ui.draw.C0027;
import com.google.firebase.C0205;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.emulators.C0140;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0211;
import dagger.hilt.internal.C0252;
import g.C0283;
import j6.C0328;
import n.C0361;
import r5.C0399;
import u4.C0435;
import v7.C0448;
import w5.C0463;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f9031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f9032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1.l0 f9034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9036f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f9038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9041r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(x2 x2Var, y0.o oVar, boolean z10, e1.l0 l0Var, long j10, long j11, long j12, long j13, long j14, int i10, int i11) {
        super(C0463.f734 ^ 289);
        this.f9031a = x2Var;
        this.f9032b = oVar;
        this.f9033c = z10;
        this.f9034d = l0Var;
        this.f9035e = j10;
        this.f9036f = j11;
        this.f9037n = j12;
        this.f9038o = j13;
        this.f9039p = j14;
        this.f9040q = i10;
        this.f9041r = i11;
        int iM76 = C0004.m76();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM76 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0328.m6339("sv9MyL2ryP1y")));
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
        int iM5464 = 0;
        x2 x2VarM4827 = null;
        y0.o oVarM4043 = null;
        boolean zM7817 = false;
        e1.l0 l0VarM7080 = null;
        long jM3634 = 0;
        long jM8735 = 0;
        long jM536 = 0;
        long jM248 = 0;
        long jM3927 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM4826 = 0;
        String str = "\u06df\u06e7\u06e2";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746783:
                    iM5464 = C0435.m8515(number);
                    str = "\u06e1\u06e8\u06e4";
                    break;
                case 1747805:
                    i12 = i11 | i10;
                    str = "\u06e2\u06e5\u06e5";
                    break;
                case 1747901:
                    jM3927 = C0205.m3927(this);
                    str = "\u06e8\u06e5\u06e4";
                    break;
                case 1748826:
                    i10 = iM5464 & 1;
                    str = "\u06e6\u06e8\u06e5";
                    break;
                case 1748893:
                    x2VarM4827 = C0252.m4827(this);
                    str = "\u06e6\u06e5\u06e8";
                    break;
                case 1749762:
                    iM5464 = C0008.m159(i12);
                    str = "\u06e4\u06df\u06e1";
                    break;
                case 1750719:
                    return lVarM238;
                case 1750810:
                    C0140.m2703(x2VarM4827, oVarM4043, zM7817, l0VarM7080, jM3634, jM8735, jM536, jM248, jM3927, mVar, iM5464, iM4826);
                    str = "\u06e7\u06df\u06e1";
                    break;
                case 1751494:
                    iM4826 = C0252.m4826(this);
                    str = "\u06e3\u06e8\u06df";
                    break;
                case 1751652:
                    jM248 = C0013.m248(this);
                    str = "\u06e0\u06e7\u06e4";
                    break;
                case 1752551:
                    l0VarM7080 = C0361.m7080(this);
                    str = "\u06e5\u06e8\u06e7";
                    break;
                case 1752582:
                    jM8735 = C0448.m8735(this);
                    str = "\u06e7\u06e6\u06e1";
                    break;
                case 1752740:
                    jM3634 = C0190.m3634(this);
                    str = "\u06e5\u06e3\u06e4";
                    break;
                case 1753609:
                    oVarM4043 = C0211.m4043(this);
                    str = "\u06e8\u06e8\u06e3";
                    break;
                case 1753694:
                    str = "\u06df\u06e2\u06e2";
                    number = (Number) obj2;
                    break;
                case 1753699:
                    i11 = iM5464 ^ 1;
                    str = "\u06e0\u06e4\u06e1";
                    break;
                case 1754377:
                    str = "\u06e3\u06e5\u06e1";
                    lVarM238 = C0012.m238();
                    break;
                case 1754594:
                    jM536 = C0027.m536(this);
                    str = "\u06e4\u06e4\u06e4";
                    break;
                case 1755527:
                    iM5464 = C0283.m5464(this);
                    str = "\u06e1\u06e6\u06df";
                    break;
                case 1755619:
                    zM7817 = C0399.m7817(this);
                    str = "\u06e5\u06e2\u06e4";
                    break;
                default:
                    mVar = (m0.m) obj;
                    str = "\u06e6\u06e8\u06e0";
                    break;
            }
        }
    }
}
