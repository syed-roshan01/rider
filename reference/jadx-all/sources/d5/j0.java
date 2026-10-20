package d5;

import a.C0000;
import a8.C0009;
import aa.C0012;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.C0087;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0225;
import dagger.hilt.android.components.C0228;
import f6.C0279;
import g2.C0287;
import h0.C0300;
import i6.C0320;
import k3.C0335;
import p5.C0378;
import q9.C0392;
import r1.C0394;
import r2.C0397;
import r6.C0402;
import t2.C0422;
import v5.C0446;
import z.C0481;
import z0.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f268short = {2405, 2419, 2421, 2377, 2426, 2425, 2421, 2423, 2402, 2431, 2425, 2424, 2377, 2416, 2431, 2426, 2402, 2419, 2404, 2377, 2419, 2424, 2423, 2420, 2426, 2419, 2418, 730, 716, 714, 758, 717, 704, 730, 733, 712, 711, 714, 716, 758, 719, 704, 709, 733, 716, 731, 758, 716, 711, 712, 715, 709, 716, 717};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f4585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i10, m0.g1 g1Var, MainViewModel mainViewModel, boolean z10) {
        super(1);
        this.f4584a = i10;
        this.f4585b = mainViewModel;
        this.f4586c = z10;
        this.f4587d = g1Var;
        int iM6181 = C0320.m6181();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6181 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0446.m8676("zZOEzEa9CQUhU8Fo9OP0sOZkhU")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۢۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4180() {
        int iM9354 = C0481.m9354();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9354 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f268short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void a(boolean z10) {
        int iM2050 = C0105.m2050(this);
        m0.g1 g1VarM7868 = C0402.m7868(this);
        boolean zM3647 = C0191.m3647(this);
        MainViewModel mainViewModelM7711 = C0394.m7711(this);
        switch (iM2050) {
            case 0:
                z4.d dVarM5385 = C0279.m5385(mainViewModelM7711);
                C0228.m4376(C0483.m9390(C0167.m3199(C0422.m8270(C0394.m7699(dVarM5385))), C0287.m5516(m4180(), 27, C0378.f648 ^ 164, 681), z10));
                C0228.m4382(C0087.m1861(dVarM5385), C0009.m192(z10));
                int i10 = 1740;
                while (true) {
                    i10 ^= 1757;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (zM3647) {
                                i10 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            C0225.m4315(g1VarM7868, C0335.m6483());
                            break;
                        default:
                            continue;
                    }
                    i10 = 1802;
                }
                break;
            default:
                z4.d dVarM5386 = C0279.m5385(mainViewModelM7711);
                C0228.m4376(C0483.m9390(C0167.m3199(C0422.m8270(C0394.m7699(dVarM5386))), C0300.m5767(m4180(), 0, C0108.f134 ^ (-95), 2326), z10));
                C0228.m4382(C0392.m7654(dVarM5386), C0009.m192(z10));
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (zM3647) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            C0225.m4315(g1VarM7868, C0335.m6483());
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                break;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVarM238 = C0012.m238();
        switch (C0105.m2050(this)) {
            case 0:
                C0397.m7754(this, C0000.m14((Boolean) obj));
                return lVarM238;
            default:
                C0397.m7754(this, C0000.m14((Boolean) obj));
                return lVarM238;
        }
    }
}
