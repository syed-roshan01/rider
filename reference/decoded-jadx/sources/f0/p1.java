package f0;

import a8.C0009;
import androidx.appcompat.widget.C0020;
import androidx.preference.C0044;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import d2.C0215;
import d9.C0223;
import ja.C0330;
import java.util.ArrayList;
import java.util.List;
import l3.C0342;
import s7.C0415;
import x4.C0468;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f5846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.v0 f5847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.a0 f5848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0.a1 f5851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g2.s f5852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2 f5853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f5854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u0 f5855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c9.c f5856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5857l;

    public p1(c2 c2Var, h0.v0 v0Var, g2.a0 a0Var, boolean z10, boolean z11, h0.a1 a1Var, g2.s sVar, e2 e2Var, k0 k0Var, c9.c cVar, int i10) {
        x0 x0VarM410 = C0020.m410();
        this.f5846a = c2Var;
        this.f5847b = v0Var;
        this.f5848c = a0Var;
        this.f5849d = z10;
        this.f5850e = z11;
        this.f5851f = a1Var;
        this.f5852g = sVar;
        this.f5853h = e2Var;
        this.f5854i = k0Var;
        this.f5855j = x0VarM410;
        this.f5856k = cVar;
        this.f5857l = i10;
        int iM4108 = C0215.m4108();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4108 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0044.m864("n7K0GOSTlP5lA4ROyccxUnMKEu")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final void a(List list) {
        String str = "\u06df\u06e0\u06df";
        c2 c2VarM6378 = null;
        List list2 = null;
        g2.l lVar = null;
        c9.c cVarM176 = null;
        g2.j jVarM1984 = null;
        g2.a0 a0VarM6718 = null;
        ArrayList arrayListM8147 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56506:
                    str = "\u06e6\u06e8\u06e5";
                    a0VarM6718 = C0342.m6718(jVarM1984, arrayListM8147);
                    break;
                case 1746943:
                    return;
                case 1747686:
                    str = "\u06e1\u06e4\u06e6";
                    list2 = list;
                    break;
                case 1748771:
                    str = "\u06e5\u06e4\u06e0";
                    arrayListM8147 = C0415.m8147(list2);
                    break;
                case 1751776:
                    str = "\u06e0\u06e0\u06e6";
                    jVarM1984 = C0101.m1984(c2VarM6378);
                    break;
                case 1752609:
                    str = "\u06e8\u06e8\u06e0";
                    lVar = new g2.l();
                    break;
                case 1753637:
                    C0223.m4297(cVarM176, a0VarM6718);
                    str = "\u06df\u06e7\u06e7";
                    break;
                case 1753699:
                    str = "\u06e6\u06e6\u06e5";
                    cVarM176 = C0009.m176(this);
                    break;
                case 1755616:
                    C0468.m9127(arrayListM8147, 0, lVar);
                    str = "\u06e6\u06e0";
                    break;
                default:
                    str = "\u06e4\u06e8\u06e4";
                    c2VarM6378 = C0330.m6378(this);
                    break;
            }
        }
    }
}
