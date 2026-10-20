package d5;

import aa.C0012;
import androidx.compose.ui.graphics.C0032;
import c1.C0060;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.definecomponent.C0250;
import q1.C0384;
import q6.C0389;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9.d0 f4778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.h0 f4779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(m9.d0 d0Var, b0.h0 h0Var, int i10) {
        super(0);
        this.f4778a = d0Var;
        this.f4779b = h0Var;
        this.f4780c = i10;
        int iM620 = C0032.m620();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM620 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0150.m2883("H6jIov5d21BIgWRKkySKQF")));
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
        String str = "ۢۡۡ";
        s0 s0Var = null;
        b0.h0 h0VarM7606 = null;
        m9.d0 d0VarM1141 = null;
        q8.l lVarM238 = null;
        int i10 = 0;
        int iM4774 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746696:
                    lVarM238 = C0012.m238();
                    str = "ۧۤۧ";
                    break;
                case 1746719:
                    iM4774 = C0250.m4774(this);
                    str = "ۡۨۨ";
                    break;
                case 1748897:
                    s0Var = new s0(h0VarM7606, iM4774, null);
                    str = "ۥۢۧ";
                    break;
                case 1749634:
                    h0VarM7606 = C0389.m7606(this);
                    str = "۟۠۠";
                    break;
                case 1750726:
                    d0VarM1141 = C0060.m1141(this);
                    str = "ۨۨۨ";
                    break;
                case 1754538:
                    return lVarM238;
                case 1754568:
                    i10 = iM4774 ^ (-40);
                    str = "ۣۥۨ";
                    break;
                case 1755624:
                    C0384.m7508(d0VarM1141, null, 0, s0Var, i10);
                    str = "۟۟ۨ";
                    break;
                default:
                    iM4774 = C0190.f214;
                    str = "ۧۥۦ";
                    break;
            }
        }
    }
}
