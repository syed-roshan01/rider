package k0;

import a2.C0005;
import a7.C0008;
import aa.C0012;
import androidx.annotation.C0019;
import androidx.compose.ui.draw.C0029;
import androidx.startup.C0047;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.abt.C0112;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0214;
import d9.C0227;
import dagger.hilt.android.internal.migration.C0233;
import dagger.hilt.android.migration.C0240;
import f6.C0278;
import ga.C0296;
import n7.C0364;
import u4.C0436;
import v7.C0449;
import x5.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9103a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9108f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f9109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f9110o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(int i10, c9.e eVar, c9.f fVar, c9.e eVar2, c9.e eVar3, j1 j1Var, c9.e eVar4) {
        super(C0278.f422 ^ (-436));
        this.f9104b = i10;
        this.f9105c = eVar;
        this.f9109n = fVar;
        this.f9106d = eVar2;
        this.f9107e = eVar3;
        this.f9110o = j1Var;
        this.f9108f = eVar4;
        int iM568 = C0029.m568();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM568 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0201.m3866("q9h6T9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(u0.b bVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(C0089.f123 ^ 392);
        this.f9105c = bVar;
        this.f9106d = obj;
        this.f9107e = obj2;
        this.f9108f = obj3;
        this.f9109n = obj4;
        this.f9110o = obj5;
        this.f9104b = i10;
        int iM4482 = C0233.m4482();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4482 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0214.m4082("jxcUsSg3g0SlPRRTGgkIMvhxN"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        switch (C0073.m1580(this)) {
            case 0:
                int i11 = C0240.f319;
                int i12 = 1616;
                while (true) {
                    i12 ^= 1633;
                    switch (i12) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i12 = ((i11 ^ 201) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i13 = 1740;
                            while (true) {
                                i13 ^= 1757;
                                switch (i13) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i13 = !zM1625 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar);
                                        int i14 = 48767;
                                        while (true) {
                                            i14 ^= 48784;
                                            switch (i14) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i14 = 48798;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i15 = 1864;
                                        while (true) {
                                            i15 ^= 1881;
                                            switch (i15) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i15 = 48674;
                                                    continue;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            C0047.m918(C0005.m94(this), C0112.m2167(this), (c9.f) C0135.m2615(this), (c9.e) C0135.m2605(this), (c9.e) C0227.m4360(this), (j1) C0141.m2715(this), (c9.e) C0159.m3031(this), mVar, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            C0047.m918(C0005.m94(this), C0112.m2167(this), (c9.f) C0135.m2615(this), (c9.e) C0135.m2605(this), (c9.e) C0227.m4360(this), (j1) C0141.m2715(this), (c9.e) C0159.m3031(this), mVar, 0);
                            break;
                        default:
                            break;
                    }
                }
                int iM375 = C0019.m375();
                int i16 = 48891;
                while (true) {
                    i16 ^= 48908;
                    switch (i16) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            if (iM375 >= 0) {
                                i16 = 49635;
                            }
                            break;
                        case 32495:
                            System.out.println(Long.decode(C0296.m5677("HG4VS031oRg")));
                            break;
                        default:
                            continue;
                    }
                    i16 = 48953;
                }
                break;
            default:
                u0.b bVar = (u0.b) C0112.m2167(this);
                Object objM2605 = C0135.m2605(this);
                Object objM4360 = C0227.m4360(this);
                Object objM3031 = C0159.m3031(this);
                Object objM2615 = C0135.m2615(this);
                Object objM2715 = C0141.m2715(this);
                int iM159 = C0008.m159(C0005.m94(this));
                C0449.m8750(bVar, objM2605, objM4360, objM3031, objM2615, objM2715, mVar, (iM159 ^ 1) | (iM159 & 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0073.m1580(this)) {
            case 0:
                C0364.m7124(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0364.m7124(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
