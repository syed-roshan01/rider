package k6;

import b.C0049;
import c0.C0057;
import com.google.firebase.annotations.concurrent.C0124;
import h7.C0312;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f10336a = new r0();

    @Override // k6.w3
    public final Object zza() {
        long jM6044 = 0;
        int i10 = 0;
        Integer numM1083 = null;
        String str = "\u06df\u06e5\u06e3";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746820:
                    jM6044 = C0312.m6044();
                    str = "\u06e2\u06df\u06e1";
                    break;
                case 1746877:
                    C0049.m954();
                    str = "\u06df\u06e3\u06e8";
                    break;
                case 1749572:
                    i10 = (int) jM6044;
                    str = "\u06e5\u06e7\u06e5";
                    break;
                case 1752707:
                    numM1083 = C0057.m1083(i10);
                    str = "\u06df\u06e4\u06e1";
                    break;
                default:
                    return numM1083;
            }
        }
    }
}
