package k6;

import b.C0049;
import c0.C0057;
import com.google.firebase.annotations.concurrent.C0124;
import z.C0480;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f10588a = new z0();

    @Override // k6.w3
    public final Object zza() {
        long jM9359 = 0;
        int i10 = 0;
        Integer numM1083 = null;
        String str = "\u06e3\u06e1\u06e4";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750598:
                    C0049.m954();
                    str = "\u06e8\u06e3\u06e4";
                    break;
                case 1751492:
                    numM1083 = C0057.m1083(i10);
                    str = "\u06e7\u06e3\u06e5";
                    break;
                case 1751501:
                    i10 = (int) jM9359;
                    str = "\u06e4\u06df\u06df";
                    break;
                case 1754505:
                    return numM1083;
                default:
                    jM9359 = C0480.m9359();
                    str = "\u06e4\u06df\u06e8";
                    break;
            }
        }
    }
}
