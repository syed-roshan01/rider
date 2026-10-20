package d5;

import a7.C0008;
import aa.C0012;
import android.os.C0013;
import androidx.appcompat.widget.C0020;
import androidx.core.app.C0040;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import dagger.hilt.android.lifecycle.C0237;
import j9.C0329;
import o1.C0367;
import s8.C0417;
import t1.C0419;
import t2.C0422;
import u4.C0435;
import u4.C0436;
import v9.C0452;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f4496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.e f4498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.e f4499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4500f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g2.l0 f4501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0.o f4503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4505r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, c9.c cVar, String str2, c9.e eVar, c9.e eVar2, int i10, g2.l0 l0Var, boolean z10, y0.o oVar, int i11, int i12) {
        super(C0020.f40 ^ (-665));
        this.f4495a = str;
        this.f4496b = cVar;
        this.f4497c = str2;
        this.f4498d = eVar;
        this.f4499e = eVar2;
        this.f4500f = i10;
        this.f4501n = l0Var;
        this.f4502o = z10;
        this.f4503p = oVar;
        this.f4504q = i11;
        this.f4505r = i12;
        int iM253 = C0013.m253();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM253 <= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0452.m8808("YfJNp8zKlBJohSxlq991jX0")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM8295 = 0;
        String strM2362 = null;
        c9.c cVarM2562 = null;
        String strM3808 = null;
        c9.e eVarM4562 = null;
        c9.e eVarM2395 = null;
        g2.l0 l0VarM6354 = null;
        boolean zM8531 = false;
        y0.o oVarM779 = null;
        int iM159 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM8238 = 0;
        String str = "\u06e4\u06e4\u06e3";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56540:
                    str = "\u06e3\u06e6\u06e8";
                    lVarM238 = C0012.m238();
                    break;
                case 1746851:
                    i11 = iM159 ^ 1;
                    str = "\u06e5\u06e0\u06df";
                    break;
                case 1747688:
                    C0367.m7195(strM2362, cVarM2562, strM3808, eVarM4562, eVarM2395, iM8295, l0VarM6354, zM8531, oVarM779, mVar, iM159, iM8238);
                    str = "\u06e7\u06e3";
                    break;
                case 1747749:
                    l0VarM6354 = C0329.m6354(this);
                    str = "\u06e3\u06e6\u06e0";
                    break;
                case 1747811:
                    iM8238 = C0419.m8238(this);
                    str = "\u06e0\u06e0\u06e8";
                    break;
                case 1747867:
                    strM3808 = C0198.m3808(this);
                    str = "\u06e1\u06e4\u06e2";
                    break;
                case 1747903:
                    oVarM779 = C0040.m779(this);
                    str = "\u06e3\u06e8\u06e8";
                    break;
                case 1748706:
                    iM8295 = C0435.m8515(number);
                    str = "\u06e6\u06e0\u06e2";
                    break;
                case 1748767:
                    eVarM4562 = C0237.m4562(this);
                    str = "\u06e5\u06e4\u06e8";
                    break;
                case 1750749:
                    zM8531 = C0436.m8531(this);
                    str = "\u06e0\u06e7\u06e6";
                    break;
                case 1750757:
                    return lVarM238;
                case 1750819:
                    iM159 = C0417.m8196(this);
                    str = "\u06e4\u06e3\u06e8";
                    break;
                case 1751625:
                    i10 = iM159 & 1;
                    str = "\u06df\u06e4\u06e8";
                    break;
                case 1751651:
                    mVar = (m0.m) obj;
                    str = "\u06e4\u06e6\u06e2";
                    break;
                case 1751712:
                    str = "\u06e1\u06e2\u06e3";
                    number = (Number) obj2;
                    break;
                case 1752484:
                    i12 = i11 | i10;
                    str = "\u06e8\u06e4\u06df";
                    break;
                case 1752617:
                    eVarM2395 = C0124.m2395(this);
                    str = "\u06e8\u06e7\u06e3";
                    break;
                case 1753448:
                    strM2362 = C0123.m2362(this);
                    str = "\u06e3\u06e4";
                    break;
                case 1755491:
                    iM159 = C0008.m159(i12);
                    str = "\u06e0\u06e4\u06e7";
                    break;
                case 1755588:
                    iM8295 = C0422.m8295(this);
                    str = "\u06e0\u06e2\u06e7";
                    break;
                default:
                    cVarM2562 = C0133.m2562(this);
                    str = "\u06e0\u06e6\u06e1";
                    break;
            }
        }
    }
}
