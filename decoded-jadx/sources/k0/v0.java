package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.ui.layout.C0036;
import b7.C0053;
import b7.C0054;
import c4.C0066;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import m0.C0349;
import r6.C0402;
import rikka.shizuku.C0406;
import t1.C0419;
import u4.C0435;
import v5.C0445;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f9544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(y0.o oVar, float f10, long j10, int i10, int i11, int i12) {
        super(C0036.f56 ^ 40);
        this.f9543a = i12;
        this.f9544b = oVar;
        this.f9545c = f10;
        this.f9546d = j10;
        this.f9547e = i10;
        this.f9548f = i11;
        int iM1029 = C0053.m1029();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1029 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0402.m7895("NYI4BfyfuELIL2D5k")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        int iM8251 = C0419.m8251(this);
        int iM8683 = C0445.m8683(this);
        switch (iM8251) {
            case 0:
                C0054.m1053(C0153.m2940(this), C0349.m6844(this), C0406.m7975(this), mVar, C0008.m159((iM8683 & 1) | (iM8683 ^ 1)), C0119.m2301(this));
                break;
            default:
                C0066.m1267(C0153.m2940(this), C0349.m6844(this), C0406.m7975(this), mVar, C0008.m159((iM8683 & 1) | (iM8683 ^ 1)), C0119.m2301(this));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0419.m8251(this)) {
            case 0:
                C0194.m3720(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0194.m3720(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
