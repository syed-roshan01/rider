package a0;

import com.google.firebase.messaging.ServiceStarter;
import v.f2;

/* JADX INFO: loaded from: classes.dex */
public interface h0 {
    default float a() {
        int iD;
        int iD2;
        z.d dVar = (z.d) this;
        f2 f2Var = dVar.f17030c;
        int i10 = dVar.f17028a;
        switch (i10) {
            case 0:
                iD = ((z.g0) f2Var).f17047c.f17181b.d();
                break;
            default:
                iD = ((b0.h0) f2Var).f2399g;
                break;
        }
        switch (i10) {
            case 0:
                iD2 = ((z.g0) f2Var).f17047c.f17180a.d();
                break;
            default:
                iD2 = ((b0.h0) f2Var).f2398f;
                break;
        }
        return (iD2 * ServiceStarter.ERROR_UNKNOWN) + iD;
    }
}
