package k6;

import com.google.android.gms.common.util.C0085;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.encoders.C0143;
import com.google.firebase.remoteconfig.internal.Code;
import d.C0211;
import dagger.hilt.codegen.C0242;

/* JADX INFO: loaded from: classes.dex */
public final class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10329f;

    public q6(String str, String str2, long j10) {
        this(str, str2, j10, false, 361 ^ ((long) C0211.f234));
        int iM4629 = C0242.m4629();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4629 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0143.m2742("Exfo8xJ8")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public q6(String str, String str2, long j10, boolean z10, long j11) {
        this.f10324a = str;
        this.f10325b = str2;
        this.f10326c = j10;
        this.f10327d = false;
        this.f10328e = z10;
        this.f10329f = j11;
        int iM1825 = C0085.m1825();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1825 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0116.m2251("oNIIjMbz8S9XZUYkaMxBcsTy7")));
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
