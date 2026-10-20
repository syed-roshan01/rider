package y3;

import a3.C0006;
import ca.C0070;
import com.google.firebase.remoteconfig.internal.Code;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16920c;

    public l(int i10, byte[] bArr, boolean z10) {
        this.f16918a = i10;
        this.f16919b = bArr;
        this.f16920c = z10;
        int iM1363 = C0070.m1363();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1363 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0006.m122("pmV2wiaHm2vf0bN")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }
}
