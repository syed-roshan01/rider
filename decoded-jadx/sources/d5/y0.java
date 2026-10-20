package d5;

import a7.C0008;
import aa.C0012;
import androidx.compose.ui.semantics.C0039;
import com.google.android.gms.common.api.internal.C0082;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.inject.C0172;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import dagger.hilt.internal.C0253;
import h3.C0303;
import k1.C0332;
import n1.C0362;
import o1.C0367;
import t2.C0420;
import u4.C0435;
import v8.C0450;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1.f f4862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.a f4863f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4864n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(String str, String str2, boolean z10, i1.f fVar, c9.a aVar, int i10, int i11) {
        super(C0172.f196 ^ 290);
        this.f4858a = i11;
        this.f4859b = str;
        this.f4860c = str2;
        this.f4861d = z10;
        this.f4862e = fVar;
        this.f4863f = aVar;
        this.f4864n = i10;
        int iM7199 = C0367.m7199();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7199 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0253.m4835("uSx672NET3CROLQLQ1J95")));
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
        int iM7102 = C0362.m7102(this);
        int iM3885 = C0202.m3885(this);
        switch (iM7102) {
            case 0:
                C0450.m8770(C0130.m2506(this), C0039.m761(this), C0159.m3037(this), C0082.m1763(this), C0420.m8268(this), mVar, C0008.m159((iM3885 & 1) | (iM3885 ^ 1)));
                break;
            default:
                C0332.m6457(C0130.m2506(this), C0039.m761(this), C0159.m3037(this), C0082.m1763(this), C0420.m8268(this), mVar, C0008.m159((iM3885 & 1) | (iM3885 ^ 1)));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0362.m7102(this)) {
            case 0:
                C0303.m5858(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0303.m5858(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
