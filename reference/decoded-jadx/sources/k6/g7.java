package k6;

import a.C0001;
import androidx.compose.ui.node.C0037;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.sql.C0208;
import g5.C0291;
import l3.C0342;
import n.C0361;
import z.C0480;

/* JADX INFO: loaded from: classes.dex */
public final class g7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.t f10073c;

    public g7(l.t tVar, long j10, long j11) {
        this.f10073c = tVar;
        this.f10071a = j10;
        this.f10072b = j11;
        int iM9354 = C0480.m9354();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9354 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0037.m715("pmV2P"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "\u06e0\u06e7\u06e5";
        h.a aVar = null;
        l.t tVarM7083 = null;
        Object objM30 = null;
        d7 d7Var = null;
        z4 z4VarM3979 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56511:
                    return;
                case 1747778:
                    objM30 = C0001.m30(tVarM7083);
                    str = "\u06e2\u06e2\u06e6";
                    break;
                case 1747806:
                    str = "\u06e3\u06df\u06df";
                    z4VarM3979 = C0208.m3979(d7Var);
                    break;
                case 1747902:
                    str = "\u06e0\u06e3\u06e5";
                    tVarM7083 = C0361.m7083(this);
                    break;
                case 1749670:
                    str = "\u06e0\u06e4\u06e2";
                    d7Var = (d7) objM30;
                    break;
                case 1750531:
                    i10 = C0291.f439;
                    str = "\u06e8\u06e5\u06e2";
                    break;
                case 1751557:
                    str = "\u06e2\u06df\u06e5";
                    aVar = new h.a(this, i11);
                    break;
                case 1755525:
                    str = "\u06e4\u06e1\u06e2";
                    i11 = i10 ^ (-892);
                    break;
                default:
                    C0342.m6719(z4VarM3979, aVar);
                    str = "\u06e6\u06e5";
                    break;
            }
        }
    }
}
