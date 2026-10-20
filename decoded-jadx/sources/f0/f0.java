package f0;

import a7.C0008;
import aa.C0012;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.foundation.text.modifiers.C0025;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.components.C0243;
import h3.C0303;
import r7.C0403;
import s3.C0412;
import u.C0428;
import u4.C0435;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, boolean z10, int i10, int i11) {
        super(C0303.f451 ^ (-608));
        this.f5695a = i11;
        this.f5698d = obj;
        this.f5696b = z10;
        this.f5697c = i10;
        int iM495 = C0025.m495();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM495 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0403.m7923("SJpIBSjRpRZjXsTfxP8zcDji166EA")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        int iM3540 = C0185.m3540(this);
        boolean zM4473 = C0232.m4473(this);
        int iM483 = C0024.m483(this);
        Object objM8395 = C0428.m8395(this);
        switch (iM3540) {
            case 0:
                C0243.m4666((h0.v0) objM8395, zM4473, mVar, C0008.m159((iM483 ^ 1) | (iM483 & 1)));
                break;
            default:
                C0168.m3207((MainViewModel) objM8395, zM4473, mVar, C0008.m159((iM483 ^ 1) | (iM483 & 1)));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0185.m3540(this)) {
            case 0:
                C0412.m8088(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0412.m8088(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
