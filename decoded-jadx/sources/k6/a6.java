package k6;

import com.google.firebase.annotations.concurrent.C0124;
import java.util.Comparator;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a6 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a6 f9892a = new a6();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        String str = "\u06e7\u06e4\u06e3";
        Long l10 = null;
        Long l11 = null;
        long jM9543 = 0;
        long jM9544 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748679:
                    str = "\u06e2\u06e8\u06e4";
                    i10 = (jM9543 > jM9544 ? 1 : (jM9543 == jM9544 ? 0 : -1));
                    break;
                case 1748768:
                    jM9543 = C0490.m9543(l11);
                    str = "\u06e7\u06df\u06e6";
                    break;
                case 1748829:
                    str = "\u06e1\u06e4\u06e3";
                    l10 = (Long) obj2;
                    break;
                case 1749854:
                    return i10;
                case 1754534:
                    str = "\u06e1\u06e6\u06e2";
                    l11 = (Long) obj;
                    break;
                default:
                    str = "\u06e1\u06e1\u06e7";
                    jM9544 = C0490.m9543(l10);
                    break;
            }
        }
    }
}
