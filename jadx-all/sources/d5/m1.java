package d5;

import a.C0001;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.compose.foundation.layout.C0021;
import b8.C0055;
import c0.C0057;
import c3.C0063;
import ca.C0070;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.tracing.C0204;
import d9.C0227;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.migration.C0240;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e2.C0262;
import f.C0271;
import g.C0285;
import g4.C0290;
import h.C0298;
import h4.C0306;
import h7.C0312;
import h7.C0313;
import j9.C0330;
import m0.l2;
import m3.C0353;
import m5.C0356;
import okhttp3.internal.publicsuffix.C0373;
import p3.C0376;
import p8.C0380;
import q0.C0383;
import s2.C0412;
import u4.C0436;
import v5.C0446;
import v7.C0449;
import w6.C0465;
import x5.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f279short = {1342, 1390, 1394, 1395, 1385, 1342, 1369, 1403, 1384, 1406};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1.f f4676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(i1.f fVar, String str, long j10, String str2) {
        super(C0163.f187 ^ (-697));
        this.f4676a = fVar;
        this.f4677b = str;
        this.f4678c = j10;
        this.f4679d = str2;
        int iM7309 = C0373.m7309();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7309 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0306.m5899("ADi5HL8qs2jv1rHgYPd")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4191() {
        int iM2608 = C0135.m2608();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2608 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f279short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x0132. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x015b. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0436.m8515((Number) obj3);
        C0376.m7360((y.v) obj, C0313.m6034(m4191(), 0, C0070.f90 ^ 759, 1306));
        int i10 = C0290.f434;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-130)) & iM8515) == 16 ? 1709 : 1678;
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
        y0.l lVarM4370 = C0227.m4370();
        y0.o oVarM8743 = C0449.m8743(C0251.m4788(lVarM4370, C0330.f477 ^ 843), C0123.m2371());
        y0.e eVarM1926 = C0090.m1926();
        i1.f fVarM3776 = C0197.m3776(this);
        String strM5715 = C0298.m5715(this);
        long jM2629 = C0136.m2629(this);
        String strM415 = C0021.m415(this);
        m0.q qVar2 = (m0.q) mVar;
        C0262.m4990(qVar2, (-483455890) ^ C0312.f459);
        r1.j0 j0VarM4231 = C0219.m4231(C0204.m3900(), eVarM1926, qVar2);
        C0262.m4990(qVar2, (-1323940116) ^ C0240.f319);
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
                    C0353.m6912(0, bVarM6976, new l2(qVar2), qVar2, 2058660016 ^ C0252.f331);
                    C0142.m2736(fVarM3776, strM5715, C0154.m2949(lVarM4370, C0120.f146 ^ 459), jM2629, qVar2, 384, 0);
                    C0072.m1564(C0271.m5166(lVarM4370, C0130.f156 ^ (-61)), qVar2);
                    C0185.m3537(strM415, null, jM2629, C0135.m2601(16), null, C0081.m1734(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 199680, 0, (-130325) ^ C0055.f75);
                    C0185.m3537(strM5715, null, C0001.m41(), C0135.m2601(C0158.f182 ^ 425), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3072, 0, 130090 ^ C0285.f429);
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
