package d5;

import aa.C0012;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.C0087;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.remoteconfig.internal.Code;
import p0.C0375;
import t0.C0419;
import u4.C0437;
import x2.C0468;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.g1 f4438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f4439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(m0.g1 g1Var, MainViewModel mainViewModel, String str, int i10) {
        super(0);
        this.f4438a = g1Var;
        this.f4439b = mainViewModel;
        this.f4440c = str;
        this.f4441d = i10;
        int iM9101 = C0468.m9101();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9101 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0138.m2676("RsuPZjHbkzYqkDC0bfX3C3gloE")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.a
    public final Object invoke() {
        String str = (String) C0419.m8214(C0375.m7347(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0437.m8532(C0081.m1740(this), C0162.m3110(this), str, C0087.m1870(this), false);
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0012.m238();
    }
}
