package k6;

import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import h0.C0300;
import h8.C0314;
import o8.C0372;
import t0.C0419;
import y6.C0478;

/* JADX INFO: loaded from: classes.dex */
public abstract class k7 extends f4.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7 f10159b;

    public k7(p7 p7Var) {
        super(C0314.m6073(p7Var));
        this.f10159b = p7Var;
        int iM5752 = C0300.m5752();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5752 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0079.m1708("qyI8imv2wwW6xQnUKdIvq8sE")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final r7 m() {
        r7 r7VarM8211 = C0419.m8211(C0372.m7289(this));
        C0173.m3298(r7VarM8211);
        return r7VarM8211;
    }

    public final k n() {
        k kVarM4068 = C0213.m4068(C0372.m7289(this));
        C0173.m3298(kVarM4068);
        return kVarM4068;
    }

    public final t4 o() {
        t4 t4VarM9311 = C0478.m9311(C0372.m7289(this));
        C0173.m3298(t4VarM9311);
        return t4VarM9311;
    }
}
