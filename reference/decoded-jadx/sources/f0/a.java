package f0;

import com.google.firebase.remoteconfig.internal.Code;
import p7.C0378;
import t9.C0427;
import v9.C0452;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5587a;

    public a(long j10) {
        this.f5587a = j10;
        int iM8371 = C0427.m8371();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8371 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0378.m7422("6ywru22ZSIJXktRFx0CY5v")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // h0.m
    public final long a() {
        return C0452.m8817(this);
    }
}
