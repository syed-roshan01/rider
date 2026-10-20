package k6;

import androidx.activity.C0017;
import c4.C0064;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0215;
import dagger.hilt.internal.C0254;
import h3.C0302;
import i6.C0320;
import k3.C0335;
import q0.C0383;
import s7.C0416;
import w4.C0462;

/* JADX INFO: loaded from: classes.dex */
public final class h6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5 f10084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s5 f10088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y5 f10089f;

    public h6(y5 y5Var, s5 s5Var, long j10, long j11, boolean z10, s5 s5Var2) {
        this.f10089f = y5Var;
        this.f10084a = s5Var;
        this.f10085b = j10;
        this.f10086c = j11;
        this.f10087d = z10;
        this.f10088e = s5Var2;
        int iM4844 = C0254.m4844();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4844 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0017.m333("UUUHOFYEFzYdoFPyx17SNtwWyn")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        y5 y5VarM4098 = C0215.m4098(this);
        s5 s5VarM8987 = C0462.m8987(this);
        C0154.m2960(y5VarM4098, s5VarM8987);
        C0320.m6191(y5VarM4098, C0335.m6492(this), false);
        C0149.m2859(C0215.m4098(this), C0462.m8987(this), C0383.m7486(this), true, C0416.m8146(this));
        boolean zM2753 = C0143.m2753();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM2753) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM3575 = C0187.m3575(C0091.m1951(y5VarM4098), null, C0302.m5818());
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM3575) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0086.m1831(y5VarM4098, s5VarM8987, C0064.m1227(this));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
