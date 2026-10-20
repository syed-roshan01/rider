package k0;

import a8.C0010;
import aa.C0012;
import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0182;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.C0255;
import e2.C0260;
import n7.C0364;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, int i10) {
        super(1);
        this.f9442a = i10;
        this.f9443b = obj;
        int iM199 = C0010.m199();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM199 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0144.m2766("gOmScKANdmaclFr3lR")));
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
        int iM3325 = C0174.m3325(this);
        Object objM1783 = C0083.m1783(this);
        switch (iM3325) {
            case 0:
                C0173.m3299((Number) obj);
                C0364.m7148(objM1783);
                throw null;
            default:
                y1.f fVar = new y1.f(C0173.m3299((Number) C0260.m4986((c9.a) objM1783)), new i9.d(0.0f, 1.0f));
                C0201.m3861();
                y1.u uVarM3472 = C0182.m3472();
                j9.f fVar2 = C0201.m3861()[1];
                C0255.m4872(uVarM3472, (y1.v) obj, fVar);
                return C0012.m238();
        }
    }
}
