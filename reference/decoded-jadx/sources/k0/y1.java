package k0;

import aa.C0012;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.lifecycle.C0237;
import e2.C0260;
import e2.C0263;
import k4.C0336;
import n7.C0363;
import s7.C0415;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.a f9667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(long j10, int i10, c9.a aVar, long j11) {
        super(1);
        this.f9665a = j10;
        this.f9666b = i10;
        this.f9667c = aVar;
        this.f9668d = j11;
        int iM6515 = C0336.m6515();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6515 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0082.m1759("ygqvRO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        g1.g gVar = null;
        long jM4565 = 0;
        float fM8158 = 0.0f;
        int iM2405 = 0;
        float fM3299 = 0.0f;
        String str = "\u06df\u06e2\u06e2";
        c9.a aVarM7120 = null;
        Object objM4986 = obj;
        Number number = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56444:
                    C0088.m1876(gVar, 1.0f, jM4565, fM8158, iM2405);
                    str = "\u06e1\u06e3\u06df";
                    break;
                case 1746783:
                    gVar = (g1.g) objM4986;
                    str = "\u06e8\u06e4\u06e8";
                    break;
                case 1748733:
                    aVarM7120 = C0363.m7120(this);
                    str = "\u06e5\u06e1\u06e3";
                    break;
                case 1749570:
                    C0088.m1876(gVar, fM3299, jM4565, fM8158, iM2405);
                    str = "\u06e4\u06e2\u06e5";
                    break;
                case 1750781:
                    iM2405 = C0125.m2405(this);
                    str = "\u06e4\u06e0";
                    break;
                case 1751591:
                    lVarM238 = C0012.m238();
                    str = "\u06e7\u06e4\u06e8";
                    break;
                case 1751714:
                    fM3299 = C0173.m3299(number);
                    str = "\u06e5\u06df\u06e7";
                    break;
                case 1752461:
                    jM4565 = C0237.m4565(this);
                    str = "\u06e7\u06e8";
                    break;
                case 1752519:
                    objM4986 = C0260.m4986(aVarM7120);
                    str = "\u06e6\u06e2\u06e5";
                    break;
                case 1752524:
                    jM4565 = C0263.m5042(this);
                    str = "\u06e3\u06e7\u06e1";
                    break;
                case 1753513:
                    number = (Number) objM4986;
                    str = "\u06e4\u06e6\u06e4";
                    break;
                case 1754539:
                    return lVarM238;
                case 1755500:
                    jM4565 = C0124.m2401(gVar);
                    str = "\u06e8\u06e6\u06e3";
                    break;
                case 1755557:
                    fM8158 = C0415.m8158(jM4565);
                    str = "\u06e5\u06e1\u06e8";
                    break;
                default:
                    iM2405 = C0125.m2405(this);
                    str = "\u06e2\u06df\u06df";
                    break;
            }
        }
    }
}
