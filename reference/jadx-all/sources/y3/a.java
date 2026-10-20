package y3;

import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.annotations.C0128;
import com.google.firebase.remoteconfig.internal.Code;
import f0.C0273;
import f4.C0276;
import h8.C0315;
import java.io.Serializable;
import m1.C0352;
import s7.C0415;
import t1.C0420;
import x0.C0467;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16876d;

    public /* synthetic */ a(Object obj, int i10, Serializable serializable, int i11) {
        this.f16873a = i11;
        this.f16876d = obj;
        this.f16874b = i10;
        this.f16875c = serializable;
        int iM6885 = C0352.m6885();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6885 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0467.m9083("LLLVQpbBFl")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM5252 = C0273.m5252(this);
        Object objM8141 = C0415.m8141(this);
        int iM2471 = C0128.m2471(this);
        Object objM8240 = C0420.m8240(this);
        switch (iM5252) {
            case 0:
                C0276.m5307(C0315.m6085((b) objM8240), iM2471, objM8141);
                int iM1920 = C0090.m1920();
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM1920 <= 0) {
                                i10 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Double.valueOf(C0078.m1680("tR1f4lRLW9Tgx3t38a")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i10 = 1678;
                }
                break;
            default:
                C0276.m5307((d) objM8240, iM2471, objM8141);
                break;
        }
    }
}
