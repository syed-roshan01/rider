package k6;

import b.C0049;
import c0.C0057;
import com.google.firebase.abt.C0113;
import com.google.firebase.annotations.concurrent.C0124;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f10077a = new h1();

    @Override // k6.w3
    public final Object zza() {
        long jM2189 = 0;
        int i10 = 0;
        Integer numM1083 = null;
        String str = "\u06e1\u06e7\u06e3";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747842:
                    numM1083 = C0057.m1083(i10);
                    str = "\u06e1\u06e2\u06e7";
                    break;
                case 1748710:
                    return numM1083;
                case 1748861:
                    C0049.m954();
                    str = "\u06e2\u06e4\u06e0";
                    break;
                case 1754477:
                    i10 = (int) jM2189;
                    str = "\u06e0\u06e5\u06e7";
                    break;
                default:
                    jM2189 = C0113.m2189();
                    str = "\u06e7\u06e2\u06e8";
                    break;
            }
        }
    }
}
