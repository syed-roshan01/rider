package k0;

import a7.C0008;
import aa.C0012;
import androidx.activity.C0017;
import androidx.lifecycle.C0043;
import androidx.startup.C0047;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.abt.C0113;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0215;
import dagger.hilt.android.components.C0229;
import dagger.hilt.codegen.C0242;
import f.C0271;
import f6.C0278;
import g.C0283;
import t1.C0420;
import u4.C0436;
import v6.C0447;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.f f9068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.e f9069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.e f9070f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y.i1 f9071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.e f9072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9073p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(int i10, c9.e eVar, c9.f fVar, c9.e eVar2, c9.e eVar3, y.i1 i1Var, c9.e eVar4, int i11, int i12) {
        super(C0104.f130 ^ 785);
        this.f9065a = i12;
        this.f9066b = i10;
        this.f9067c = eVar;
        this.f9068d = fVar;
        this.f9069e = eVar2;
        this.f9070f = eVar3;
        this.f9071n = i1Var;
        this.f9072o = eVar4;
        this.f9073p = i11;
        int iM4629 = C0242.m4629();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4629 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0447.m8710("1QRwyltjkxU"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        int iM9448 = C0486.m9448(this);
        int iM8243 = C0420.m8243(this);
        switch (iM9448) {
            case 0:
                C0283.m5449(C0073.m1584(this), C0017.m341(this), C0043.m838(this), C0162.m3112(this), C0153.m2933(this), C0278.m5372(this), C0071.m1461(this), mVar, C0008.m159((iM8243 & 1) | (iM8243 ^ 1)));
                break;
            case 1:
                C0047.m918(C0073.m1584(this), C0017.m341(this), C0043.m838(this), C0162.m3112(this), C0153.m2933(this), C0278.m5372(this), C0071.m1461(this), mVar, C0008.m159((iM8243 & 1) | (iM8243 ^ 1)));
                break;
            default:
                C0229.m4404(C0073.m1584(this), C0017.m341(this), C0043.m838(this), C0162.m3112(this), C0153.m2933(this), C0278.m5372(this), C0071.m1461(this), mVar, C0008.m159((iM8243 & 1) | (iM8243 ^ 1)));
                int iM5170 = C0271.m5170();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM5170 >= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Long.decode(C0113.m2184("Zi9hzy4AtpiIq")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0486.m9448(this)) {
            case 0:
                C0215.m4090(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            case 1:
                C0215.m4090(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0215.m4090(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
