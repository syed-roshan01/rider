package k0;

import aa.C0012;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0031;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d4.C0217;
import dagger.hilt.C0255;
import f.C0269;
import f0.C0271;
import f1.C0273;
import h7.C0312;
import i.C0316;
import k3.C0334;
import l3.C0342;
import l8.C0345;
import m5.C0355;
import q6.C0386;
import y9.C0479;

/* JADX INFO: loaded from: classes.dex */
public final class t extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f9463b = new t(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f9464c = new t(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f9465d = new t(C0171.f195 ^ (-78));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f9466e = new t(C0386.f657 ^ (-670));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f9467f = new t(C0271.f387 ^ (-806));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t f9468n = new t(C0168.f192 ^ 949);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t f9469o = new t(C0031.f51 ^ (-160));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9470a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i10) {
        super(1);
        this.f9470a = i10;
        int iM2101 = C0108.m2101();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2101 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0345.m6765("fy3b3X4KJRbgBeQosTv1AAzOo3Yx")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final void a(t.u0 u0Var) {
        Float fM4139 = C0217.m4139(290.0f);
        Float fM41310 = C0217.m4139(0.0f);
        int iM2002 = C0102.m2002(this);
        int i10 = C0217.f241 ^ 328;
        switch (iM2002) {
            case 3:
                u0Var.f14337a = 1332;
                C0479.m9338(u0Var, 0, fM41310).f14311b = C0084.m1801();
                C0479.m9338(u0Var, i10, fM4139);
                break;
            default:
                u0Var.f14337a = 1332;
                C0479.m9338(u0Var, i10, fM41310).f14311b = C0084.m1801();
                C0479.m9338(u0Var, C0312.m6032(u0Var), fM4139);
                int iM6120 = C0316.m6120();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM6120 >= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Integer.parseInt(C0273.m5262("FFLZPcrioPqcABJ")));
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

    public final void b(y1.v vVar) {
        switch (C0102.m2002(this)) {
            case 0:
                return;
            case 1:
                C0148.m2833(vVar, 0);
                return;
            case 2:
            case 5:
                break;
            case 3:
            case 4:
            default:
                C0201.m3861();
                y1.u uVarM578 = C0030.m578();
                j9.f fVar = C0201.m3861()[5];
                C0255.m4872(uVarM578, vVar, C0334.m6483());
                break;
        }
        int iM5152 = C0269.m5152();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5152 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0342.m6712("18VoRitqyNL"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVarM238 = C0012.m238();
        switch (C0102.m2002(this)) {
            case 0:
                C0355.m6975(this, (y1.v) obj);
                return lVarM238;
            case 1:
                C0355.m6975(this, (y1.v) obj);
                return lVarM238;
            case 2:
                C0355.m6975(this, (y1.v) obj);
                return lVarM238;
            case 3:
                C0196.m3753(this, (t.u0) obj);
                return lVarM238;
            case 4:
                C0196.m3753(this, (t.u0) obj);
                return lVarM238;
            case 5:
                C0355.m6975(this, (y1.v) obj);
                return lVarM238;
            default:
                C0355.m6975(this, (y1.v) obj);
                return lVarM238;
        }
    }
}
