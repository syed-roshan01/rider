package d5;

import a7.C0008;
import aa.C0012;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import d1.C0213;
import g2.C0288;
import g3.C0289;
import h.C0299;
import h6.C0310;
import j4.C0327;
import n8.C0366;
import r6.C0403;
import s8.C0418;
import t2.C0423;
import u4.C0436;
import x4.C0470;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.a f4755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(String str, String str2, c9.a aVar, int i10, int i11) {
        super(C0423.f693 ^ (-825));
        this.f4752a = i11;
        this.f4753b = str;
        this.f4754c = str2;
        this.f4755d = aVar;
        this.f4756e = i10;
        int iM4046 = C0212.m4046();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4046 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0327.m6309("uTj")));
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
        int iM5528 = C0288.m5528(this);
        c9.a aVarM5558 = C0289.m5558(this);
        String strM9140 = C0470.m9140(this);
        String strM8194 = C0418.m8194(this);
        int iM2734 = C0142.m2734(this);
        switch (iM5528) {
            case 0:
                C0310.m5973(strM8194, strM9140, aVarM5558, mVar, C0008.m159((iM2734 ^ 1) | (iM2734 & 1)));
                break;
            case 1:
                C0213.m4063(strM8194, strM9140, aVarM5558, mVar, C0008.m159((iM2734 ^ 1) | (iM2734 & 1)));
                break;
            case 2:
                C0178.m3389(strM8194, strM9140, aVarM5558, mVar, C0008.m159((iM2734 ^ 1) | (iM2734 & 1)));
                break;
            default:
                C0299.m5746(strM8194, strM9140, aVarM5558, mVar, C0008.m159((iM2734 ^ 1) | (iM2734 & 1)));
                int iM7897 = C0403.m7897();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM7897 <= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Integer.parseInt(C0366.m7165("DniQe477oQ")));
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

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0288.m5528(this)) {
            case 0:
                C0089.m1893(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            case 1:
                C0089.m1893(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            case 2:
                C0089.m1893(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0089.m1893(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
