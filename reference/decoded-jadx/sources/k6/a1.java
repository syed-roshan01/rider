package k6;

import b.C0049;
import c0.C0057;
import com.google.firebase.annotations.concurrent.C0124;
import dagger.hilt.android.components.C0229;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f9863a = new a1();

    @Override // k6.w3
    public final Object zza() {
        long jM4407 = 0;
        int i10 = 0;
        Integer numM1083 = null;
        String str = "\u06e5\u06e6\u06e8";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746781:
                    jM4407 = C0229.m4407();
                    str = "\u06e6\u06e1\u06e3";
                    break;
                case 1749790:
                    numM1083 = C0057.m1083(i10);
                    str = "\u06e7\u06e0\u06e5";
                    break;
                case 1752679:
                    C0049.m954();
                    str = "\u06df\u06e2\u06e0";
                    break;
                case 1754412:
                    return numM1083;
                default:
                    i10 = (int) jM4407;
                    str = "\u06e2\u06e6\u06e2";
                    break;
            }
        }
    }
}
