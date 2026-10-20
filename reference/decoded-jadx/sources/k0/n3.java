package k0;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.semantics.C0039;
import b.C0049;
import c0.C0057;
import c3.C0063;
import c4.C0064;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.C0128;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d1.C0212;
import d1.C0214;
import d4.C0217;
import dagger.hilt.C0255;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import e2.C0261;
import ea.C0267;
import g4.C0289;
import h4.C0305;
import h5.C0306;
import h8.C0313;
import m3.C0352;
import m5.C0355;
import p8.C0379;
import q0.C0382;
import rikka.shizuku.C0406;
import s2.C0411;
import u4.C0435;
import u4.C0436;
import v0.C0442;
import v5.C0445;
import w2.C0456;
import w4.C0460;
import w6.C0464;
import x5.C0470;
import y.C0475;
import y9.C0478;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.o f9269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1.l0 f9270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u.w f9273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9274f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.e f9275n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(y0.o oVar, e1.l0 l0Var, long j10, float f10, u.w wVar, float f11, u0.b bVar) {
        super(C0436.f707 ^ (-283));
        this.f9269a = oVar;
        this.f9270b = l0Var;
        this.f9271c = j10;
        this.f9272d = f10;
        this.f9273e = wVar;
        this.f9274f = f11;
        this.f9275n = bVar;
        int iM5113 = C0267.m5113();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5113 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0217.m4145("CftQ3DGVfPl2oVDfIsARN8Kjmmyjb")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0435.m8515((Number) obj2);
        int i10 = C0442.f713;
        q8.l lVarM238 = C0012.m238();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-102)) & iM8515) == 2 ? 1709 : 1678;
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
                                C0470.m9156(qVar);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return lVarM238;
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
        m0.q qVar2 = (m0.q) mVar;
        y0.o oVarM1235 = C0064.m1235(C0039.m758(C0049.m953(C0212.m4052(this), C0039.m773(this), C0306.m5924(C0460.m8973(this), C0313.m6066(this), mVar), C0255.m4881(this), C0114.m2209((m2.b) C0475.m9256(qVar2, C0478.m9327()), C0032.m619(this))), false, C0091.m1952()), lVarM238, new m3(2, null));
        C0261.m4990(qVar2, 733328632 ^ C0049.f69);
        r1.j0 j0VarM2476 = C0128.m2476(C0456.m8889(), true, qVar2);
        C0261.m4990(qVar2, (-1323940118) ^ C0214.f238);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0379.m7428());
        t1.j jVarM4451 = C0231.m4451();
        u0.b bVarM6976 = C0355.m6976(oVarM1235);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    C0235.m4537();
                    throw null;
                case 503:
                    if (z10) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0382.m7502(qVar2);
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
                                C0445.m8685(qVar2);
                                break;
                            default:
                                break;
                        }
                    }
                    C0089.m1904(qVar2, j0VarM2476, C0063.m1208());
                    C0089.m1904(qVar2, r1VarM275, C0464.m9055());
                    t1.i iVarM5562 = C0289.m5562();
                    boolean zM7503 = C0382.m7502(qVar2);
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                if (!zM7503) {
                                    i18 = 50658;
                                }
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                boolean zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                int i19 = 50689;
                                while (true) {
                                    i19 ^= 50706;
                                    switch (i19) {
                                        case 19:
                                            if (!zM4399) {
                                                i19 = 50782;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0352.m6912(0, bVarM6976, new m0.l2(qVar2), qVar2, 2058660258 ^ C0406.f677);
                                            C0464.m9049(C0305.m5896(this), qVar2, C0057.m1083(0));
                                            C0171.m3270(qVar2, false);
                                            C0171.m3270(qVar2, true);
                                            C0171.m3270(qVar2, false);
                                            C0171.m3270(qVar2, false);
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i19 = 50751;
                                }
                                break;
                            default:
                                continue;
                        }
                        i18 = 50627;
                    }
                    C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                    C0352.m6912(0, bVarM6976, new m0.l2(qVar2), qVar2, 2058660258 ^ C0406.f677);
                    C0464.m9049(C0305.m5896(this), qVar2, C0057.m1083(0));
                    C0171.m3270(qVar2, false);
                    C0171.m3270(qVar2, true);
                    C0171.m3270(qVar2, false);
                    C0171.m3270(qVar2, false);
                    break;
                default:
                    continue;
            }
            i15 = 48953;
        }
        return lVarM238;
    }
}
