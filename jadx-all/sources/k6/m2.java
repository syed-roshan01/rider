package k6;

import b.C0049;
import c0.C0057;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.model.C0161;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m2 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2 f10199a = new m2();

    @Override // k6.w3
    public final Object zza() {
        long jM3075 = 0;
        int i10 = 0;
        Integer numM1083 = null;
        String str = "۠ۧۤ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56386:
                    return numM1083;
                case 1747901:
                    C0049.m954();
                    str = "ۡۤ۟";
                    break;
                case 1748764:
                    jM3075 = C0161.m3075();
                    str = "ۡۨۦ";
                    break;
                case 1748895:
                    i10 = (int) jM3075;
                    str = "ۤۡۥ";
                    break;
                default:
                    numM1083 = C0057.m1083(i10);
                    str = "ۢۤ";
                    break;
            }
        }
    }
}
