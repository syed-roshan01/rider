package k6;

import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.migration.C0239;
import f.C0270;
import fa.C0281;
import s3.C0412;

/* JADX INFO: loaded from: classes.dex */
public final class v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10449e;

    public v7(String str, String str2, String str3, long j10, Object obj) {
        C0281.m5438(str);
        C0281.m5438(str3);
        C0270.m5173(obj);
        this.f10445a = str;
        this.f10446b = str2;
        this.f10447c = str3;
        this.f10448d = j10;
        this.f10449e = obj;
        int iM8089 = C0412.m8089();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8089 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0239.m4599("QpBaJXDJ2J")));
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
