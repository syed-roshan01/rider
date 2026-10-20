package f0;

import aa.C0012;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.graphics.C0031;
import androidx.versionedparcelable.C0048;
import c1.C0058;
import c6.C0067;
import com.google.android.gms.common.internal.C0084;
import com.google.firebase.annotations.C0128;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.remoteconfig.internal.Code;
import d5.C0218;
import d9.C0223;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0260;
import f6.C0277;
import h6.C0309;
import ia.C0322;
import k3.C0334;
import m9.C0359;
import s7.C0414;
import s8.C0416;
import u1.C0431;
import x5.C0470;
import y.C0474;

/* JADX INFO: loaded from: classes.dex */
public final class z extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.v0 f6013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(h0.v0 v0Var, int i10) {
        super(0);
        this.f6012a = i10;
        this.f6013b = v0Var;
        int iM4984 = C0260.m4984();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4984 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0058.m1108("k4BidXwNDSLSUSZFP5L")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final Boolean a() {
        int iM7060 = C0359.m7060(this);
        h0.v0 v0VarM3317 = C0174.m3317(this);
        switch (iM7060) {
            case 0:
                C0031.m611(v0VarM3317);
                break;
            case 1:
                C0154.m2955(v0VarM3317, true);
                break;
            case 2:
                C0474.m9242(v0VarM3317, true);
                break;
            default:
                C0067.m1315(v0VarM3317);
                break;
        }
        return C0334.m6483();
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVarM238 = C0012.m238();
        switch (C0359.m7060(this)) {
            case 0:
                return C0414.m8124(this);
            case 1:
                return C0414.m8124(this);
            case 2:
                return C0414.m8124(this);
            case 3:
                return C0414.m8124(this);
            case 4:
                C0067.m1301(this);
                return lVarM238;
            case 5:
                C0067.m1301(this);
                return lVarM238;
            case 6:
                C0067.m1301(this);
                return lVarM238;
            default:
                C0067.m1301(this);
                return lVarM238;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m5213invoke() {
        int iM7060 = C0359.m7060(this);
        h0.v0 v0VarM3317 = C0174.m3317(this);
        switch (iM7060) {
            case 4:
                C0474.m9242(v0VarM3317, true);
                C0218.m4225(v0VarM3317);
                break;
            case 5:
                C0067.m1315(v0VarM3317);
                C0218.m4225(v0VarM3317);
                break;
            case 6:
                C0031.m611(v0VarM3317);
                C0218.m4225(v0VarM3317);
                break;
            default:
                g2.a0 a0VarM943 = C0048.m943(C0143.m2754(C0322.m6231(v0VarM3317)), C0250.m4797(0, C0416.m8181(C0277.m5369(C0143.m2754(C0322.m6231(v0VarM3317))))));
                C0223.m4297(C0128.m2470(v0VarM3317), a0VarM943);
                v0VarM3317.f7489r = C0020.m412(C0144.m2758(v0VarM3317), null, C0309.m5972(a0VarM943), C0084.f118 ^ 512);
                C0154.m2955(v0VarM3317, true);
                int iM9151 = C0470.m9151();
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM9151 <= 0) {
                                i10 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(C0431.m8448("qmP4eo9FpqKj1pVoW5rBYvMep5"));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i10 = 1678;
                }
                break;
        }
    }
}
