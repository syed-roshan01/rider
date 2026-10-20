package k6;

import com.google.firebase.remoteconfig.internal.Code;
import m5.C0356;
import s8.C0417;

/* JADX INFO: loaded from: classes.dex */
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9920c;

    public b7(long j10, String str, boolean z10) {
        this.f9918a = str;
        this.f9919b = z10;
        this.f9920c = j10;
        int iM6968 = C0356.m6968();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6968 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0417.m8175("r3p2wlLP095Lb2h18FrUM6")));
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
