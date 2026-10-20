package k6;

import com.google.firebase.annotations.concurrent.C0124;
import h3.C0302;
import java.util.function.Function;
import u8.C0438;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x5 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x5 f10535a = new x5();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        long jM5837 = 0;
        String str = "\u06e8\u06e1\u06e5";
        i7 i7Var = null;
        Long lM8554 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751524:
                    str = "\u06e7\u06e7\u06e1";
                    lM8554 = C0438.m8554(jM5837);
                    break;
                case 1752647:
                    jM5837 = C0302.m5837(i7Var);
                    str = "\u06e4\u06e0\u06e0";
                    break;
                case 1754625:
                    return lM8554;
                default:
                    i7Var = (i7) obj;
                    str = "\u06e5\u06e5\u06e7";
                    break;
            }
        }
    }
}
