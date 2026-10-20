package f0;

import aa.C0012;
import androidx.compose.ui.graphics.C0032;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0206;
import t0.C0418;
import u.C0428;
import y6.C0476;

/* JADX INFO: loaded from: classes.dex */
public final class p extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.v0 f5842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(h0.v0 v0Var, int i10) {
        super(1);
        this.f5841a = i10;
        this.f5842b = v0Var;
        int iM3931 = C0206.m3931();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3931 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0476.m9295("bFmkcvsv4")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int iM8212 = C0418.m8212(this);
        h0.v0 v0VarM8402 = C0428.m8402(this);
        switch (iM8212) {
            case 0:
                return new b.c(v0VarM8402, C0129.f155 ^ 757);
            default:
                C0012.m235((d1.c) obj);
                C0032.m630(v0VarM8402);
                return C0012.m238();
        }
    }
}
