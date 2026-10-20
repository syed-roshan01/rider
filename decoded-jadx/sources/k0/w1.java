package k0;

import a3.C0006;
import aa.C0012;
import android.support.v4.app.C0015;
import androidx.annotation.C0019;
import androidx.compose.ui.semantics.C0039;
import androidx.core.content.C0041;
import androidx.preference.C0044;
import com.google.android.gms.common.util.C0086;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.lifecycle.C0237;
import fa.C0280;
import l3.C0342;
import r2.C0395;
import r2.C0397;
import s8.C0416;
import t0.C0418;
import y.C0475;
import z3.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.k f9601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.l3 f9602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.l3 f9603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.l3 f9604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.l3 f9605f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f9606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f9607o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(long j10, g1.k kVar, t.k0 k0Var, t.k0 k0Var2, t.k0 k0Var3, t.k0 k0Var4, float f10, long j11) {
        super(1);
        this.f9600a = j10;
        this.f9601b = kVar;
        this.f9602c = k0Var;
        this.f9603d = k0Var2;
        this.f9604e = k0Var3;
        this.f9605f = k0Var4;
        this.f9606n = f10;
        this.f9607o = j11;
        int iM2075 = C0107.m2075();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2075 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0397.m7775("j1kyev4EENnLRv8zGGxy")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        float fM9460;
        g1.g gVar = (g1.g) obj;
        C0041.m815(gVar, 0.0f, 360.0f, C0416.m8178(this), C0237.m4573(this));
        float fM3299 = C0173.m3299((Number) C0418.m8214(C0395.m7734(this)));
        float fM32910 = C0173.m3299((Number) C0418.m8214(C0039.m769(this)));
        m0.l3 l3VarM379 = C0019.m379(this);
        float fM6714 = C0342.m6714(((fM32910 + 23.0f) - C0173.m3299((Number) C0418.m8214(l3VarM379))) - 23.0f);
        float fM32911 = C0173.m3299((Number) C0418.m8214(C0015.m301(this)));
        float fM32912 = C0173.m3299((Number) C0418.m8214(l3VarM379));
        long jM3050 = C0160.m3050(this);
        g1.k kVarM4573 = C0237.m4573(this);
        boolean zM1840 = C0086.m1840(C0044.m859(kVarM4573), 0);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM1840) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                fM9460 = 0.0f;
                                break;
                        }
                    }
                    break;
                case 239:
                    fM9460 = ((C0485.m9460(this) / (C0280.m5435() / (C0006.f1064 ^ 236))) * 57.29578f) / 2.0f;
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        C0041.m815(gVar, (fM9460 - 32.0f) + (fM32912 - (0.0f - (0.0f - ((0.0f - fM32911) - ((-90.0f) - (0.0f - ((fM3299 * 216.0f) % 360.0f))))))) + 32.0f, C0475.m9273(fM6714, 0.1f), jM3050, kVarM4573);
        return C0012.m238();
    }
}
