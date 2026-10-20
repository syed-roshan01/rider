package k0;

import a.C0000;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0217;
import dagger.hilt.C0255;
import dagger.hilt.android.internal.modules.C0233;
import e2.C0260;
import v8.C0450;
import x7.C0471;
import z3.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Object obj, int i10) {
        super(0);
        this.f8714a = i10;
        this.f8715b = obj;
        int iM4876 = C0255.m4876();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4876 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0000.m9("NqEtn4mnaiHiM")));
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
        int iM9172 = C0471.m9172(this);
        Object objM8778 = C0450.m8778(this);
        switch (iM9172) {
            case 0:
                return C0217.m4139(C0485.m9444(C0173.m3299((Number) C0260.m4986((c9.a) objM8778)), 0.0f, 1.0f));
            default:
                return C0233.m4488((m4) objM8778);
        }
    }
}
