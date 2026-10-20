package k6;

import androidx.compose.ui.draw.C0029;
import c0.C0056;
import com.google.firebase.remoteconfig.internal.Code;
import t1.C0420;
import v0.C0443;
import w0.C0455;
import x4.C0469;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class b5 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4 f9914b;

    public b5(z4 z4Var, String str) {
        this.f9914b = z4Var;
        this.f9913a = str;
        int iM9505 = C0489.m9505();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9505 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0056.m1075("VPzhZW")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (this) {
            C0420.m8245(C0455.m8871(C0029.m572(C0443.m8643(this))), C0469.m9114(this), th);
        }
    }
}
