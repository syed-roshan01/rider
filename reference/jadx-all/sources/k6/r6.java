package k6;

import androidx.compose.ui.node.C0037;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import d.C0211;
import w5.C0463;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class r6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p6 f10348b;

    public /* synthetic */ r6(p6 p6Var, int i10) {
        this.f10347a = i10;
        this.f10348b = p6Var;
        int iM733 = C0037.m733();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM733 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0211.m4020("BGdA9SFY")));
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
        int iM9011 = C0463.m9011(this);
        p6 p6VarM3830 = C0199.m3830(this);
        switch (iM9011) {
            case 0:
                p6VarM3830.f10278e = C0486.m9446(p6VarM3830);
                break;
            default:
                p6VarM3830.f10283j = null;
                break;
        }
    }
}
