package k0;

import a2.C0005;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import c0.C0057;
import c3.C0062;
import c3.C0063;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d5.C0219;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.internal.processedrootsentinel.C0252;
import dagger.hilt.migration.C0255;
import e2.C0262;
import f4.C0277;
import g4.C0290;
import h3.C0303;
import l0.C0341;
import m3.C0353;
import m5.C0356;
import p8.C0380;
import q0.C0383;
import q9.C0392;
import s2.C0412;
import u4.C0436;
import v5.C0446;
import v7.C0449;
import w6.C0465;
import x5.C0471;
import x7.C0472;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.o f9612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x.m f9614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u.i1 f9615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.a f9617f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.f f9618n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(y0.o oVar, boolean z10, x.m mVar, j0.e eVar, boolean z11, c9.a aVar, c9.f fVar) {
        super(C0471.f741 ^ 183);
        this.f9612a = oVar;
        this.f9613b = z10;
        this.f9614c = mVar;
        this.f9615d = eVar;
        this.f9616e = z11;
        this.f9617f = aVar;
        this.f9618n = fVar;
        int iM9059 = C0465.m9059();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9059 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0252.m4810("d5a7x7fL7TOEPSlEoKYvI0TdZG6on"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x011f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x0148. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0436.m8515((Number) obj2);
        int i10 = C0255.f334;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-969)) & iM8515) == 2 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM1625) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                C0471.m9156(qVar);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return C0012.m238();
                                        case 239:
                                            i13 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        y0.o oVarM8743 = C0449.m8743(C0303.m5838(C0062.m1181(this), C0341.m6682(this), C0005.m105(this), C0189.m3610(this), C0085.m1815(this), new y1.g(C0392.f662 ^ 807), C0491.m9547(this)), C0123.m2371());
        y0.e eVarM1926 = C0090.m1926();
        y.f fVarM5323 = C0277.m5323();
        m0.q qVar2 = (m0.q) mVar;
        C0262.m4990(qVar2, 483455480 ^ C0251.f330);
        r1.j0 j0VarM4231 = C0219.m4231(fVarM5323, eVarM1926, qVar2);
        C0262.m4990(qVar2, (-1323940441) ^ C0119.f145);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0380.m7428());
        t1.j jVarM4451 = C0232.m4451();
        u0.b bVarM6976 = C0356.m6976(oVarM8743);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    C0236.m4537();
                    throw null;
                case 503:
                    if (z10) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0383.m7502(qVar2);
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = zM7502 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4451);
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i17 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                C0446.m8685(qVar2);
                                break;
                            default:
                                break;
                        }
                    }
                    C0089.m1904(qVar2, j0VarM4231, C0063.m1208());
                    C0089.m1904(qVar2, r1VarM275, C0465.m9055());
                    t1.i iVarM5562 = C0290.m5562();
                    boolean zM7503 = C0383.m7502(qVar2);
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                i18 = !zM7503 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                break;
                            case 1769:
                                boolean zM4399 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM276));
                                int i19 = 50689;
                                while (true) {
                                    i19 ^= 50706;
                                    switch (i19) {
                                        case 19:
                                            i19 = !zM4399 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    C0353.m6912(0, bVarM6976, new m0.l2(qVar2), qVar2, 2058660501 ^ C0472.f742);
                    C0072.m1563(C0412.m8074(this), C0141.m2721(), qVar2, C0057.m1083(C0491.f764 ^ 816));
                    C0016.m325(qVar2, false, true, false, false);
                    break;
                default:
                    continue;
            }
            i15 = 48953;
        }
        return C0012.m238();
    }
}
