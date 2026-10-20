package k6;

import b.C0049;
import c0.C0057;
import com.google.firebase.annotations.concurrent.C0124;
import f6.C0277;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f10523a = new x0();

    @Override // k6.w3
    public final Object zza() {
        long jM5364 = 0;
        int i10 = 0;
        Integer numM1083 = null;
        String str = "\u06e7\u06e4\u06e1";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751653:
                    jM5364 = C0277.m5364();
                    str = "\u06e8\u06e1\u06df";
                    break;
                case 1754532:
                    C0049.m954();
                    str = "\u06e4\u06e4\u06e5";
                    break;
                case 1755398:
                    i10 = (int) jM5364;
                    str = "\u06e7\u06e2\u06e3";
                    break;
                case 1755526:
                    return numM1083;
                default:
                    numM1083 = C0057.m1083(i10);
                    str = "\u06e8\u06e5\u06e3";
                    break;
            }
        }
    }
}
