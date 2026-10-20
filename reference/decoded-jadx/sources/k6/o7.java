package k6;

import android.support.v4.app.C0014;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import w5.C0463;

/* JADX INFO: loaded from: classes.dex */
public final class o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10260b;

    public o7(p7 p7Var, String str) {
        this.f10259a = str;
        C0014.m280((e6.c) C0463.m9025(p7Var));
        this.f10260b = C0199.m3820();
        int iM4440 = C0230.m4440();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4440 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0138.m2676("l5QYUT77vhxZobk")));
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
