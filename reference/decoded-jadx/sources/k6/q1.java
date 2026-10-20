package k6;

import b.C0049;
import c0.C0057;
import com.google.firebase.annotations.concurrent.C0124;
import q6.C0387;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f10316a = new q1();

    @Override // k6.w3
    public final Object zza() {
        long jM7583 = 0;
        int i10 = 0;
        Integer numM1083 = null;
        String str = "\u06e7\u06e1\u06e2";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56322:
                    numM1083 = C0057.m1083(i10);
                    str = "\u06e1\u06e1\u06e7";
                    break;
                case 1747719:
                    i10 = (int) jM7583;
                    str = "\u06e0\u06e2";
                    break;
                case 1748679:
                    return numM1083;
                case 1752676:
                    jM7583 = C0387.m7583();
                    str = "\u06e0\u06e1\u06e8";
                    break;
                default:
                    C0049.m954();
                    str = "\u06e5\u06e6\u06e5";
                    break;
            }
        }
    }
}
