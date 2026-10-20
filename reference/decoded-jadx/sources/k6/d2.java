package k6;

import b.C0049;
import c0.C0057;
import com.google.firebase.annotations.concurrent.C0124;
import e8.C0265;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f9959a = new d2();

    @Override // k6.w3
    public final Object zza() {
        long jM5080 = 0;
        int i10 = 0;
        Integer numM1083 = null;
        String str = "\u06e2\u06df\u06e8";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747808:
                    jM5080 = C0265.m5080();
                    str = "\u06e4\u06e8\u06e3";
                    break;
                case 1748742:
                    numM1083 = C0057.m1083(i10);
                    str = "\u06e8\u06e3\u06e0";
                    break;
                case 1751775:
                    i10 = (int) jM5080;
                    str = "\u06e1\u06e3\u06e8";
                    break;
                case 1755461:
                    return numM1083;
                default:
                    C0049.m954();
                    str = "\u06e0\u06e4\u06e4";
                    break;
            }
        }
    }
}
