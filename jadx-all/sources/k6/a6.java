package k6;

import com.google.firebase.annotations.concurrent.C0124;
import java.util.Comparator;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a6 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a6 f9892a = new a6();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        String str = "ۣۧۤ";
        Long l10 = null;
        Long l11 = null;
        long jM9543 = 0;
        long jM9544 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748679:
                    str = "ۢۨۤ";
                    i10 = (jM9543 > jM9544 ? 1 : (jM9543 == jM9544 ? 0 : -1));
                    break;
                case 1748768:
                    jM9543 = C0491.m9543(l11);
                    str = "ۧ۟ۦ";
                    break;
                case 1748829:
                    str = "ۣۡۤ";
                    l10 = (Long) obj2;
                    break;
                case 1749854:
                    return i10;
                case 1754534:
                    str = "ۡۦۢ";
                    l11 = (Long) obj;
                    break;
                default:
                    str = "ۡۡۧ";
                    jM9544 = C0491.m9543(l10);
                    break;
            }
        }
    }
}
