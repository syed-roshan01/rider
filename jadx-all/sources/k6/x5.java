package k6;

import com.google.firebase.annotations.concurrent.C0124;
import h3.C0303;
import java.util.function.Function;
import u8.C0439;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x5 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x5 f10535a = new x5();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        long jM5837 = 0;
        String str = "ۨۡۥ";
        i7 i7Var = null;
        Long lM8554 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751524:
                    str = "ۧۧۡ";
                    lM8554 = C0439.m8554(jM5837);
                    break;
                case 1752647:
                    jM5837 = C0303.m5837(i7Var);
                    str = "ۤ۠۠";
                    break;
                case 1754625:
                    return lM8554;
                default:
                    i7Var = (i7) obj;
                    str = "ۥۥۧ";
                    break;
            }
        }
    }
}
