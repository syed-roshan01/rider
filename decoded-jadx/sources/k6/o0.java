package k6;

import c4.C0065;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.messaging.C0191;
import com.google.firebase.remoteconfig.internal.Code;
import h3.C0302;
import l6.C0344;
import o1.C0367;
import r2.C0396;
import t2.C0423;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3 f10249c;

    public /* synthetic */ o0(q3 q3Var, long j10, int i10) {
        this.f10247a = i10;
        this.f10249c = q3Var;
        this.f10248b = j10;
        int iM6746 = C0344.m6746();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6746 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0080.m1720("v4yOvdx")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM1251 = C0065.m1251(this);
        long jM7211 = C0367.m7211(this);
        q3 q3VarM5824 = C0302.m5824(this);
        switch (iM1251) {
            case 0:
                C0191.m3646((q) q3VarM5824, jM7211);
                int iM7755 = C0396.m7755();
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM7755 <= 0) {
                                i10 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Double.valueOf(C0139.m2686("xsq")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i10 = 1678;
                }
                break;
            default:
                p6 p6Var = (p6) q3VarM5824;
                C0423.m8305(C0119.m2294((f5) C0163.m3121(p6Var)), jM7211);
                p6Var.f10278e = null;
                break;
        }
    }
}
