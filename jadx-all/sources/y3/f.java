package y3;

import android.content.Context;
import c4.C0064;
import c7.C0069;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import m1.C0351;
import m7.C0359;
import o2.C0369;
import u4.C0436;
import u7.C0438;
import w2.C0458;
import x7.C0472;
import x7.C0473;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16910b;

    public /* synthetic */ f(Context context, int i10) {
        this.f16909a = i10;
        this.f16910b = context;
        int iM8543 = C0438.m8543();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8543 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0472.m9181("5EzloFkZSHG71Be")));
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
        int i10 = 1;
        int iM8508 = C0436.m8508(this);
        Context contextM8903 = C0458.m8903(this);
        switch (iM8508) {
            case 0:
                C0064.m1237(new ThreadPoolExecutor(0, 1, (-39) ^ ((long) C0154.f179), C0473.m9196(), new LinkedBlockingQueue()), new f(contextM8903, i10));
                break;
            default:
                C0069.m1337(contextM8903, new m.a(C0369.f639 ^ (-233)), C0359.m7031(), false);
                int iM4051 = C0213.m4051();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM4051 <= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Long.decode(C0351.m6859("E5S7ApzC0CpqPyW0sjZkMnc9C0Uh")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                break;
        }
    }
}
