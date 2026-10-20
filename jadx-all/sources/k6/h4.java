package k6;

import com.google.firebase.remoteconfig.internal.Code;
import m0.C0350;
import v7.C0450;

/* JADX INFO: loaded from: classes.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10080a;

    public h4(String str) {
        this.f10080a = str;
        int iM6838 = C0350.m6838();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6838 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0450.m8753("cHazoOBRW2bRFNeStXrnSy7otWNzr"));
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
