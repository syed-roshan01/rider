package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.foundation.layout.C0023;
import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import d8.C0221;
import d9.C0226;
import dagger.hilt.android.migration.C0239;
import fa.C0280;
import m9.C0359;
import u4.C0435;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f8961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(float f10, float f11, c9.e eVar, int i10) {
        super(C0226.f306 ^ 837);
        this.f8959a = f10;
        this.f8960b = f11;
        this.f8961c = eVar;
        this.f8962d = i10;
        int iM4596 = C0239.m4596();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4596 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0280.m5430("s9KY6V1NcRaFpnWq0mm")));
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
        int iM463 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        float fM2240 = 0.0f;
        c9.e eVarM4268 = null;
        float fM1790 = 0.0f;
        q8.l lVarM238 = null;
        String str = "\u06e4\u06e3\u06e6";
        Number number = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746690:
                    i11 = iM463 ^ 1;
                    str = "\u06e2\u06e0\u06e5";
                    break;
                case 1746940:
                    str = "\u06e0\u06e2\u06e2";
                    number = (Number) obj2;
                    break;
                case 1746969:
                    str = "\u06e2\u06e8\u06e2";
                    lVarM238 = C0012.m238();
                    break;
                case 1747744:
                    iM463 = C0435.m8515(number);
                    str = "\u06df\u06e6\u06e0";
                    break;
                case 1748679:
                    fM2240 = C0116.m2240(this);
                    str = "\u06e2\u06e7\u06e8";
                    break;
                case 1748889:
                    iM463 = C0008.m159(i12);
                    str = "\u06e1\u06e1\u06e7";
                    break;
                case 1749607:
                    i12 = i11 | i10;
                    str = "\u06e1\u06e8\u06e0";
                    break;
                case 1749759:
                    fM1790 = C0083.m1790(this);
                    str = "\u06e7\u06e8\u06df";
                    break;
                case 1749827:
                    str = "\u06e2\u06e5\u06e2";
                    eVarM4268 = C0221.m4268(this);
                    break;
                case 1749852:
                    return lVarM238;
                case 1750784:
                    i10 = iM463 & 1;
                    str = "\u06df\u06df\u06e2";
                    break;
                case 1751623:
                    str = "\u06df\u06e7\u06e4";
                    mVar = (m0.m) obj;
                    break;
                case 1754654:
                    C0359.m7053(fM1790, fM2240, eVarM4268, mVar, iM463);
                    str = "\u06df\u06e8\u06e2";
                    break;
                default:
                    iM463 = C0023.m463(this);
                    str = "\u06e3\u06e7\u06e4";
                    break;
            }
        }
    }
}
