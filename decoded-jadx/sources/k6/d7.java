package k6;

import androidx.core.app.C0040;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import d3.C0216;
import dagger.hilt.android.components.C0227;
import y.C0475;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzcp f9980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w4 f9982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h7 f9983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l.t f9984g;

    public d7(f5 f5Var) {
        super(f5Var);
        this.f9981d = true;
        this.f9982e = new w4(this, C0227.f307 ^ (-910));
        this.f9983f = new h7(this);
        this.f9984g = new l.t(this);
        int iM2274 = C0118.m2274();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2274 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0216.m4127("DASTqL4dhPx")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // k6.p2
    public final boolean u() {
        return false;
    }

    public final void v() {
        C0040.m791(this);
        zzcp zzcpVarM9272 = C0475.m9272(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zzcpVarM9272 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    this.f9980c = new zzcp(C0207.m3950());
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
