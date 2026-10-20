package f0;

import a8.C0009;
import androidx.lifecycle.C0043;
import androidx.profileinstaller.C0046;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import f4.C0275;
import o7.i2;
import t8.C0427;
import v6.C0447;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f5988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(a2 a2Var, int i10) {
        super(0);
        this.f5987a = i10;
        this.f5988b = a2Var;
        int iM5222 = C0272.m5222();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5222 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0427.m8366("OnSCu"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final Boolean a() {
        boolean z10 = true;
        int iM8708 = C0447.m8708(this);
        a2 a2VarM5282 = C0275.m5282(this);
        switch (iM8708) {
            case 0:
                float fM887 = C0046.m887(C0427.m8369(a2VarM5282));
                int i10 = 1740;
                while (true) {
                    i10 ^= 1757;
                    switch (i10) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (fM887 > 0.0f) {
                                i10 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            z10 = false;
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            break;
                        default:
                            continue;
                    }
                    i10 = 1802;
                }
                return C0009.m192(z10);
            default:
                float fM888 = C0046.m887(C0427.m8369(a2VarM5282));
                float fM889 = C0046.m887(C0043.m843(a2VarM5282));
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (fM888 < fM889) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            break;
                        case 239:
                            z10 = false;
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                return C0009.m192(z10);
        }
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (C0447.m8708(this)) {
            case 0:
                break;
        }
        return C0102.m1990(this);
    }
}
