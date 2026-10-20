package y3;

import android.content.Context;
import c4.C0064;
import c7.C0069;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import m1.C0350;
import m7.C0358;
import o2.C0368;
import u4.C0435;
import u7.C0437;
import w2.C0457;
import x7.C0471;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16910b;

    public /* synthetic */ f(Context context, int i10) {
        this.f16909a = i10;
        this.f16910b = context;
        int iM8543 = C0437.m8543();
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
                    System.out.println(Long.decode(C0471.m9181("5EzloFkZSHG71Be")));
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
        int iM8508 = C0435.m8508(this);
        Context contextM8903 = C0457.m8903(this);
        switch (iM8508) {
            case 0:
                C0064.m1237(new ThreadPoolExecutor(0, 1, (-39) ^ ((long) C0154.f179), C0472.m9196(), new LinkedBlockingQueue()), new f(contextM8903, i10));
                break;
            default:
                C0069.m1337(contextM8903, new m.a(C0368.f639 ^ (-233)), C0358.m7031(), false);
                int iM4051 = C0212.m4051();
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
                            System.out.println(Long.decode(C0350.m6859("E5S7ApzC0CpqPyW0sjZkMnc9C0Uh")));
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
